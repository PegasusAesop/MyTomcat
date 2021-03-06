package com.pegasus.mytomcat.front;

import java.io.IOException;
import java.io.InputStream;

public class MyRequest {

	private String url;
	private String method;
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public MyRequest(InputStream inputStream) throws IOException{
		
		String httpRequest="";
		byte[] httpRequestBytes=new byte[1024];
		int length=0;
		if((length = inputStream.read(httpRequestBytes)) >0) {
			httpRequest = new String(httpRequestBytes,0,length);
		}
		//HTTP请求协议
		//GET /favicon.ico HTTP/1.1
		//Accept: */*
		//Accept-Encoding: gzip,deflate
		//User-Agent: Mozilla/5.0 (windows NT 6.1;wow64;Trident/7.8;rv:11.0) like Gecko
		//Host: localhost:8080
		//Connection: Keep-Alive
		String httpHead= httpRequest.split("\n")[0];
		System.out.println("httpHead:"+httpHead);
		url= httpHead.split("\\s")[1];
		System.out.println("url:"+url);
		method = httpHead.split("\\s")[0];
		System.out.println("method:"+method);
		System.out.println(this);
	}

}
