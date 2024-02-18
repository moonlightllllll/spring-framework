package org.springframework;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
		ClassPathResource resource = new ClassPathResource("myTest.xml");
		DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader definitionReader = new XmlBeanDefinitionReader(beanFactory);
		definitionReader.loadBeanDefinitions(resource);
		MyTestBean myTestBean = (MyTestBean) beanFactory.getBean("myTestBean");
		String testStr = myTestBean.getTestStr();
		System.out.println(testStr);

	}
}