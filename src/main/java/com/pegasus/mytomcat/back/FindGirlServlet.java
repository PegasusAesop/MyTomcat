package com.pegasus.mytomcat.back;

import com.pegasus.mytomcat.front.MyRequest;
import com.pegasus.mytomcat.front.MyResponse;

public class FindGirlServlet extends MyServlet{

	@Override
	public void doGet(MyRequest myRequest, MyResponse myResponse) {
		// TODO Auto-generated method stub
		try {
			myResponse.write("get girl...");
			
		}catch(Exception x) {
			x.printStackTrace();
		}
		
	}

	@Override
	public void doPost(MyRequest myrequest, MyResponse myResponse) {
		// TODO Auto-generated method stub
		try {
			myResponse.write("post girl....");
			
		}catch(Exception x) {
			x.printStackTrace();
		}
	}

}
