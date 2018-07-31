package com.jai.hello;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class HelloWorld implements BundleActivator{

	public void start(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World!!!");
	}

	public void stop(BundleContext context) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Goodbye World!!!");		
	}

}
