package org.springframework;

import org.springframework.beans.factory.FactoryBean;

public class MyTestBeanFactory implements FactoryBean<MyTestBean> {
	@Override
	public MyTestBean getObject() throws Exception {
		MyTestBean bean = new MyTestBean();
		bean.setTestStr("factory");
		return bean;
	}

	@Override
	public Class<?> getObjectType() {
		return MyTestBean.class;
	}
}
