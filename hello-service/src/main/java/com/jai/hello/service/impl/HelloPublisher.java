package com.jai.hello.service.impl;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.jai.hello.service.HelloService;

public class HelloPublisher implements BundleActivator{
	
	private ServiceRegistration service;

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		service = context.registerService(
					HelloService.class.getName(), 
					new HelloServiceImpl(), 
					null);
		System.out.println("HelloService Started");
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		service.unregister();
		System.out.println("HelloService Stopped");
	}

}
