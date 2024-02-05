package org.springframework;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class MyTestBean implements BeanFactoryAware {

	private String testStr = "TestStr";

	public String getTestStr() {
		return testStr;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		Object myTestBean = beanFactory.getBean("myTestBean");
		System.out.println(myTestBean);
	}
}
