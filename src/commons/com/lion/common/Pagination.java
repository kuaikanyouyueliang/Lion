package com.lion.common;

import java.util.List;

/**
 * 分页实体 
 */
public class Pagination {
	/**页码，第...页*/
	private int pageNo;
	/**每页显示条数*/
	private int pageSize;
	/**总条数*/
	private int totalRows;
	/**总页数*/
	private int pageAll;
	/**当前页数据*/
	private List<?> list;
	
	/**页码，第...页*/
	public int getPageNo() {
		return pageNo;
	}
	/**页码，第...页*/
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	/**每页显示条数*/
	public int getPageSize() {
		return pageSize;
	}
	/**每页显示条数*/
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	/**总条数*/
	public int getTotalRows() {
		return totalRows;
	}
	/**总条数*/
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	/**当前页数据*/
	public List<?> getList() {
		return list;
	}
	/**当前页数据*/
	public void setList(List<?> list) {
		this.list = list;
	}
	/**获取总页数*/
	public int getPageAll() {
		return this.pageAll=this.totalRows%this.pageSize==0?this.totalRows/this.pageSize:this.totalRows/this.pageSize+1;
	}
	/**总页数*/
	public void setPageAll(int pageAll) {
		this.pageAll = pageAll;
	} 
	
}
