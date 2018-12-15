package com.pegasus.mytomcat.utils;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {

	public static List<ServletMapping>  servletMappingList=new ArrayList<>();
	
	static {
		servletMappingList.add(new ServletMapping("findGirl","/girl","com.pegasus.mytomcat.back.FindGirlServlet"));
		servletMappingList.add(new ServletMapping("helloWorld","/world","com.pegasus.mytomcat.back.HelloWorldServlet"));
		
	}
}
