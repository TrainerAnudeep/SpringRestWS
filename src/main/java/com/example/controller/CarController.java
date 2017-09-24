package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Car;

@Controller
@RequestMapping(value="/car")
public class CarController {

	private static final Logger LOG = Logger.getLogger(CarController.class);

	@RequestMapping(value="/updateMiles", method=RequestMethod.POST)
	public @ResponseBody Car update(@RequestBody Car car){
		car.setMiles(car.getMiles()+100);
		return car;
	}

	@RequestMapping(value="/")
	public @ResponseBody Car get(){
		return new Car("1234", "Blue", 100);
	}
}
