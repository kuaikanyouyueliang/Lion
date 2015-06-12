package com.lion.webservice;

import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;

public class RPCClient {
	public static void main(String[] args) throws AxisFault, ClassNotFoundException {
		System.out.println("1111");
		//client();
		WsClient wsClient=new WsClient("http://218.94.93.90:7001/htesb/service/ws/ibcrm/enterpriseCustomerService");
		wsClient.invokeOp("http://ibcrm.htsc.com/", "queryCust", new Object[]{"1","1"}, new Class[]{Object.class});
	}
	private static void client(){
		try {
			RPCServiceClient serviceClient=new RPCServiceClient();
			Options options=serviceClient.getOptions();
			EndpointReference targetEPR=new EndpointReference("http://218.94.93.90:7001/htesb/service/ws/ibcrm/enterpriseCustomerService");
			options.setTo(targetEPR);
			Object[] requestParams=new Object[]{"1","1"};
			Class[] responseParams=new Class[]{Object.class};
			QName requestMethod=new QName("http://218.94.93.90:7001/htesb/service/ws/ibcrm/enterpriseCustomerService","queryCust");
			//QName requestMethod=new QName("http://ibcrm.htsc.com","queryCust");
			serviceClient.invokeBlocking(requestMethod, requestParams,responseParams);
		} catch (AxisFault e) {
			e.printStackTrace();
		}
		
	}
}
