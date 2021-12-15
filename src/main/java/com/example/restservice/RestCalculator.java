package com.example.restservice;


import org.apache.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.entity.Input;



@RestController

public class RestCalculator {
	
	
	Logger log = Logger.getLogger("RestCalculator");
	//http://localhost:8080/add?x=30&y=1
	//using the parameter
	// long but clear //html data access
    @RequestMapping(value="/add", method=RequestMethod.GET)
	public int add(@RequestParam("x") int x,@RequestParam("y") int y) {
		int sum= x+y;
		log.error("Entered add method");
		System.out.println("The sum is: "+sum);
		log.error("Entered add method");
		return sum;
	}
    // http://localhost:8080/sub/30/1
    // using the parameter
  	// long but clear //html data access
      @RequestMapping(value="/sub/{x}/{y}", method=RequestMethod.GET)
  	public int sub(@PathVariable("x") int x,@PathVariable("y") int y) {
  		int sub= x-y;
  		System.out.println("The sub is: "+sub);
  		return sub;
  	}
    // consuming complex media data type
      @RequestMapping(value="/mul", method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE )
    	public int mul(@RequestBody Input input) {
    	  int mul= input.x*input.y;
    		
    		System.out.println("The mul is: "+mul);
    		return mul;
    	}
     // producing complex json 
      @RequestMapping(value="/getAllEmp", method=RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE )
  	public Employee getAllEmp() {
  	 Employee e = new Employee();
  	 e.setName("Prakash");
  	 e.setEid("1");
  	 e.setEmail("Prakesh@gmail.com");
  	 e.setAddress("Irving Tx");
  	return e;
  	}
     
}
