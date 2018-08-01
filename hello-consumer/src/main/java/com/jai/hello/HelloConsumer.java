package com.jai.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.jai.hello.service.HelloService;

public class HelloConsumer implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("HelloConsumer Started...");
		
		HelloService helloService = getHelloService(context);
		System.out.println(helloService.getHelloMessage());
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		HelloService helloService = getHelloService(context);
		System.out.println(helloService.getGoodbyeMessage());
		
		System.out.println("HelloConsumer Stopped...");
	}

	private HelloService getHelloService(BundleContext ctx) {
		
		ServiceReference ref = ctx.getServiceReference(HelloService.class.getName());
		HelloService helloService = (HelloService) ctx.getService(ref);
		return helloService;
		
	}
	
}
