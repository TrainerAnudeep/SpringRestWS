package com.example.model;

import java.io.Serializable;

public class Car implements Serializable{

		private static final long serialVersionUID = -6592343261209635942L;
	
		private String vin;
	    private String color;
	    private Integer miles;
	    
	    
		public Car(String vin, String color, Integer miles) {
			super();
			this.vin = vin;
			this.color = color;
			this.miles = miles;
		}
		public Car() {
			// TODO Auto-generated constructor stub
		}
		public String getVin() {
			return vin;
		}
		public void setVin(String vin) {
			this.vin = vin;
		}
		@Override
		public String toString() {
			return "Car [vin=" + vin + ", color=" + color + ", miles=" + miles
					+ "]";
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public Integer getMiles() {
			return miles;
		}
		public void setMiles(Integer miles) {
			this.miles = miles;
		}

	    
}
