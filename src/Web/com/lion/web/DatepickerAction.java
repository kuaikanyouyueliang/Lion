package com.lion.web;

import com.opensymphony.xwork2.ActionSupport;
/**
 * 日期选择
 */
public class DatepickerAction extends ActionSupport{
	private static final long serialVersionUID = -8526093007171052443L;
	private String startDate;
	private String endDate;
	public String execute() throws Exception {
		System.out.println(this.startDate);
		System.out.println(this.endDate);
		return SUCCESS;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
}
