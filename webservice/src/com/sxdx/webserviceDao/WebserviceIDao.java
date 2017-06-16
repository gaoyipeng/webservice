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
		return name+"˵��hello";
	}

	@Override
	@WebMethod
	public String save(String name, String pwd) {
		// TODO Auto-generated method stub
		return name+"�������ǣ�"+pwd;
	}
	
	public void contextInitialized() {
		 String address = "http://localhost:9001/theWebservice/WebserviceAction";
		 //ʹ��Endpoint���ṩ��publish��������WebService������ʱҪ��֤ʹ�õĶ˿ں�û�б�����Ӧ�ó���ռ��
		 Endpoint.publish(address , new WebserviceIDao());
		 System.out.println("����webservice�ɹ�!");
	}

}
