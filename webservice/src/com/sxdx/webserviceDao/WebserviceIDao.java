package com.sxdx.webserviceDao;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.servlet.ServletContextEvent;
import javax.xml.ws.Endpoint;

import com.sxdx.webservice.WebserviceI;

@WebService
public class WebserviceIDao implements WebserviceI{

	@Override
	@WebMethod
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return name+"说：hello";
	}

	@Override
	@WebMethod
	public String save(String name, String pwd) {
		// TODO Auto-generated method stub
		return name+"的密码是："+pwd;
	}
	
	public void contextInitialized() {
		 String address = "http://localhost:9001/theWebservice/WebserviceAction";
		 //使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
		 Endpoint.publish(address , new WebserviceIDao());
		 System.out.println("发布webservice成功!");
	}

}
