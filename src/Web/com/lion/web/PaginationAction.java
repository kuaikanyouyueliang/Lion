package com.lion.web;

import com.lion.common.Pagination;
import com.opensymphony.xwork2.ActionSupport;

public class PaginationAction extends ActionSupport{
	private static final long serialVersionUID = 305397838236106371L;
	private Pagination pagination;
	private String test;
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	
	
}
