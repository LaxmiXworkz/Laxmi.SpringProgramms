package com.xworkz.ott.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
@Configuration

public class FrontControllerConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer {

	private Class[] configClass = { SpringConfiguration.class };
	private String[] mappings = { "*.do" };

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("configuration from FrontControllerConfiguration class");
		return configClass;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("mapping from FrontControllerConfiguration class");
		return mappings;
	}

}
