package com.lhk.InterfCalled;

public class List extends TransObj implements SetPage {

	private String page;
	@Override
	public void setPage(String page) {
		this.page = page;
	}
	
	public String getPage(){
		return page;
	}

}
