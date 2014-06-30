package com.lion.web;

import java.util.ArrayList;
import java.util.List;

import com.lion.common.Pagination;
import com.lion.entity.PersonInfo;
import com.opensymphony.xwork2.ActionSupport;

public class PaginationAction extends ActionSupport{
	private static final long serialVersionUID = 305397838236106371L;
	/**将这个pagination命名为page的原因是page字母短,jsp页面好写*/
	private Pagination page;
	@Override
	public String execute() throws Exception {
		List<PersonInfo> list=new ArrayList<PersonInfo>();
		for(int i=1;i<=10;i++){
			PersonInfo personInfo=new PersonInfo();
			personInfo.setAge("10"+i);
			personInfo.setName("name"+i);
			list.add(personInfo);
		}
		page.setTotalRows(20);
		page.setList(list);
		return SUCCESS;
	}
	public Pagination getPage() {
		return page;
	}
	public void setPage(Pagination page) {
		this.page = page;
	}
}
