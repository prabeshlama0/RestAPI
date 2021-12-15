package com.example.restservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCalculator2 {
     
	@RequestMapping(value="/add2", method=RequestMethod.GET)
	public int  add(@RequestParam("x") int x,@RequestParam("y") int y) {
		return x+y;
	}
	@RequestMapping(value="/sub2", method=RequestMethod.GET)
	public int  sub(@RequestParam("x") int x,  @RequestParam("y") int y) {
		return x-y;
	}
	@RequestMapping(value="/mul2", method=RequestMethod.GET)
	public int mul(@RequestParam("x") int x, @RequestParam("y")int y) {
		return x*y;
	}
	@RequestMapping(value="/div2", method=RequestMethod.GET)
	public int  div(@RequestParam("x") int x,@RequestParam("y") int y) {
		return x/y;
	}
	
}
