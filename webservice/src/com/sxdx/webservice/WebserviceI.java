package com.sxdx.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WebserviceI {
     @WebMethod
     public String sayHello(String name);
     
     @WebMethod
     public String save(String name,String pwd);
}
