package com.springmvc.controller;

import java.util.Date;

public class Producer {
	public void executeListener() {
		System.out.println(
				"ִ������ ����ǰִ��ʱ�� :: " + (new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(new Date()));
	}
}
