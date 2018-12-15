package com.pegasus.mytomcat.back;

import java.io.IOException;

import com.pegasus.mytomcat.front.MyRequest;
import com.pegasus.mytomcat.front.MyResponse;

public class HelloWorldServlet extends MyServlet {

	@Override
	public void doGet(MyRequest myRequest, MyResponse myResponse) {
		// TODO Auto-generated method stub
		try {
			myResponse.write("get world...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void doPost(MyRequest myrequest, MyResponse myResponse) {
		// TODO Auto-generated method stub
		try {
			myResponse.write("Post world...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
