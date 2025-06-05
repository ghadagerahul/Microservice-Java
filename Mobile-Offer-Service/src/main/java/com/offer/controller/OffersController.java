package com.offer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offer.entity.Offers;
import com.offer.service.OfferService;

@RestController
@RequestMapping("/offers")
public class OffersController {

	@Autowired
	private OfferService offerService;

	@GetMapping("/get/{id}")
	public Offers getOffers(@PathVariable int id) {

		Offers offers = offerService.getOffers(id);

		return offers;

	}

}
