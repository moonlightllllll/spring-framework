package org.springframework;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MyTestBean {

	private String testStr = "TestStr";

	public String getTestStr() {
		return testStr;
	}

	public void setTestStr(String str) {
		this.testStr = str;
	}
}
