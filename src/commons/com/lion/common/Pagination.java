package com.lion.common;
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
	
}
