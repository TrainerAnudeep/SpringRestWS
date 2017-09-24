package com.example.main;

import org.springframework.web.client.RestTemplate;

import com.example.model.Car;

public class ConsumeRest {
	public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Car car = restTemplate.getForObject("http://localhost:8080/SpringRestWS/car/", Car.class);
        System.out.println(car);
    }
}
