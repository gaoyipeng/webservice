package com.sxdx.action;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.xml.ws.Endpoint;

import com.sxdx.webserviceDao.WebserviceIDao;

@WebServlet(value="",loadOnStartup=0)
public class WebserviceAction extends HttpServlet{
	/* public void init() {
		String address = "http://localhost:9001/theWebservice/WebserviceAction";
		 //ʹ��Endpoint���ṩ��publish��������WebService������ʱҪ��֤ʹ�õĶ˿ں�û�б�����Ӧ�ó���ռ��
		 Endpoint.publish(address , new WebserviceIDao());
		 System.out.println("����webservice�ɹ�!");
	}*/
	public static void main(String[] args){
		 String address = "http://localhost:9001/WebService/WebserviceAction";
		 //ʹ��Endpoint���ṩ��publish��������WebService������ʱҪ��֤ʹ�õĶ˿ں�û�б�����Ӧ�ó���ռ��
		 Endpoint.publish(address , new WebserviceIDao());
		 System.out.println("����webservice�ɹ�!");
	}
}
