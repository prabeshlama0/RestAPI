package com.example.demo;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
// PRC Style: no validation/ operation name included in soap message// no overloading method
// Document style: includes schema in wsdl that allows validation// supports method overloading


@SOAPBinding(style=Style.RPC)
public class SoapCalculator {
	
	public int add( int p1, int p2) {
		System.out.println("Adding "+p1+" "+p2);
		return p1+p2;
	}
	public boolean login( String user, String password) {
		 if (user.equals("john") && password.equals("jee"))
			 return true;
		 else
			 return false;
	}
	
}
