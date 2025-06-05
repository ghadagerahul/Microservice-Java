package com.offer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.offer.entity.Offers;
import com.offer.service.OfferService;

@Service
public class OfferServiceImpl implements OfferService {

	List<Offers> offer = List.of(

			new Offers(1, "5%", "10%", "0%"), new Offers(1, "5%", "10%", "0%"), new Offers(2, "5%", "10%", "0%"),
			new Offers(3, "5%", "10%", "0%"));

	@Override
	public Offers getOffers(int id) {
		return offer.get(id);
	}

}
