package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mobile.entity.Offers;
import com.mobile.entity.Pricing;
import com.mobile.service.PricingService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/price")
public class PriceController {

	@Autowired
	private PricingService pricingService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/get/{id}")
	public List<Pricing> getPricing(@PathVariable int id) {

		List<Pricing> pricing = pricingService.getPricing(id);

		pricing.stream().forEach(x -> {

			if (x.getOffers() == null) {

				String url = "http://OFFER-SERVICE/offers/get/" + id;

				String forObject = restTemplate.getForObject(url, String.class);

				System.out.println("forObject: " + forObject);


				x.setOffers(forObject.toString());
			}

		});

		return pricing;
	}

}
