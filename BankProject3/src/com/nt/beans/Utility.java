package com.nt.beans;

import java.util.Date;

public class Utility {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d.getDate());
	}
	private void m1() {
		System.out.println("in m1() utility");

	}

}
