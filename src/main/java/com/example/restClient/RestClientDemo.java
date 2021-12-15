package com.example.restClient;

import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Input;

public class RestClientDemo {

	public static void main(String[] args) {
		testAdd();
		testSub();
		getAllEmps();

	}
// get http method: getForObject(x,y) two parameter
// URL= include url includes the http part +input
	// output= response
	public static void testAdd() {
		RestTemplate rt = new RestTemplate();
		// http://localhost:8888/add?x=40&y=30
		int res = rt.getForObject("http://localhost:8888/add?x=50&y=30", Integer.class);
		System.out.println("Add rest service result: " + res);
	}
	public static void testSub() {
		RestTemplate rt = new RestTemplate();
		// http://http://localhost:8888/sub/50/30
		int res = rt.getForObject("http://localhost:8888/sub/50/30", Integer.class);
		System.out.println("Sub rest service result: " + res);
	}
	// http post: postForObject(x,y,z) three parameter
	public static void getAllEmps() {
		RestTemplate rt = new RestTemplate();
		Input i = new Input();
		i.setX(10);
		i.setY(20);
		// converts java object to Json formate here by JSON Mapper
		int result = rt.postForObject("http://localhost:8888/mul", i, Integer.class);
		System.out.println("Multiplication is: "+result);
	}
}
