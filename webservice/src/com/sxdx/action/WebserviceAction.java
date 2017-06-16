package com.sxdx.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

import com.sxdx.webserviceDao.WebserviceIDao;

@WebServlet(value="",loadOnStartup=0)
public class WebserviceAction extends HttpServlet{
	/* public void init() {
		String address = "http://localhost:9001/theWebservice/WebserviceAction";
		 //使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
		 Endpoint.publish(address , new WebserviceIDao());
		 System.out.println("发布webservice成功!");
	}*/
	public static void main(String[] args){
		 String address = "http://localhost:9001/WebService/WebserviceAction";
		 //使用Endpoint类提供的publish方法发布WebService，发布时要保证使用的端口号没有被其他应用程序占用
		 Endpoint.publish(address , new WebserviceIDao());
		 System.out.println("发布webservice成功!");
	}
}
