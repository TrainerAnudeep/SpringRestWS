package com.example.main;

import org.springframework.web.client.RestTemplate;

import com.example.model.Page;

public class ConsumeRest {
	public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());
    }
}
