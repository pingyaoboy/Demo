package com.lhk.InterfCalled;

public class Main {

	public static void main(String[] args) {
		TransObj trans = new List();
		if (trans instanceof SetPage) {
			SetPage page = (SetPage) trans;
			page.setPage("12365");
		}
		System.out.println("========");
		if (trans instanceof List) {
			List list = (List) trans;
			System.out.println(list.getPage());
		}
	}

}
