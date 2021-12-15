package com.example.demo;

import javax.xml.ws.Endpoint;

public class SoapMAinServiceMain {
public static void main(String[] args) {
	Endpoint.publish("http://localhost:1990/soap", new SoapCalculator());
}
}
