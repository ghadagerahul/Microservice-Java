package com.mobile.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mobile.entity.Pricing;
import com.mobile.service.PricingService;

@Service
public class PricingerviceImpl implements PricingService {

	List<Pricing> pricingList = List.of(new Pricing(1, "5000", "500", "4500", null),
			new Pricing(2, "15000", "500", "14500", null), new Pricing(3, "7000", "500", "6500", null),
			new Pricing(1, "14500", "500", "14000", null), new Pricing(1, "5000", "500", "4500", null)

	);

	@Override
	public List<Pricing> getPricing(int id) {

		return pricingList.stream().filter(x -> x.getMobCode() == id).collect(Collectors.toList());
	}

}
