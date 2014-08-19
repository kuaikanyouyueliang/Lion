package com.lion.webservice;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

public class WsClient {
	private RPCServiceClient serviceClient;
	private Options options;
	private EndpointReference targetEPR;
	private static final int TIMEOUT = 5 * 1000;
	private static final int MAX_HTTP_CONNECTION = 200;
	private static final int MAX_CONNECTION_PER_HOST = 50;

	public WsClient(String endpoint) throws AxisFault {
	    serviceClient = new RPCServiceClient();
	        MultiThreadedHttpConnectionManager httpConnectionManager = new MultiThreadedHttpConnectionManager();
	        HttpConnectionManagerParams params = new HttpConnectionManagerParams();
	        params.setMaxTotalConnections(MAX_HTTP_CONNECTION);
	        params.setDefaultMaxConnectionsPerHost(MAX_CONNECTION_PER_HOST);
	        params.setSoTimeout(TIMEOUT);
	        params.setConnectionTimeout(TIMEOUT);
	        httpConnectionManager.setParams(params);
	        HttpClient httpClient = new HttpClient(httpConnectionManager);
	        options = serviceClient.getOptions();
	        options.setTimeOutInMilliSeconds(600000L);
	        options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, true);
	        options.setProperty(HTTPConstants.CACHED_HTTP_CLIENT, httpClient);
	        targetEPR = new EndpointReference(endpoint);
	        options.setTo(targetEPR);

	}

	public Object[] invokeOp(String targetNamespace, String opName,
	Object[] opArgs, Class<?>[] opReturnType) throws AxisFault,
	ClassNotFoundException {
	// 设定操作的名称
	QName opQName = new QName(targetNamespace, opName);
	options.setAction(opName);

	// 设定返回值
	// 操作需要传入的参数已经在参数中给定，这里直接传入方法中调用
	Object[] objArray = serviceClient.invokeBlocking(opQName, opArgs, opReturnType);
	return objArray;
	} 
}
