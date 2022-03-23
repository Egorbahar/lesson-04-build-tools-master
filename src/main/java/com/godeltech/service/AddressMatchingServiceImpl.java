package com.godeltech.service;

import static java.util.Arrays.asList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.godeltech.domain.AvailableAddress;

@Component
public class AddressMatchingServiceImpl implements AddressMatchingService {

    @Autowired
    public AddressMatchingServiceImpl() {
    }

    @Override
    public List<AvailableAddress> getAvailableAddresses(final String postcode) {

        final AvailableAddress primaryAvailableAddress = new AvailableAddress();

        primaryAvailableAddress.setOrganisationName("GTE");
        primaryAvailableAddress.setBuildingName("Silver Tower");
        primaryAvailableAddress.setBuildingNumber("20");
        primaryAvailableAddress.setStreet("1st Zagorodnyj lane");
        primaryAvailableAddress.setPostTown("Minsk");
        primaryAvailableAddress.setPostcode(postcode);

        final AvailableAddress secondaryAvailableAddress = new AvailableAddress();

        secondaryAvailableAddress.setOrganisationName("GTE");
        secondaryAvailableAddress.setBuildingName("Rubin Plaza");
        secondaryAvailableAddress.setBuildingNumber("5");
        secondaryAvailableAddress.setStreet("Dzerzhinskogo avenue");
        secondaryAvailableAddress.setPostTown("Minsk");
        secondaryAvailableAddress.setPostcode(postcode);

        return asList(primaryAvailableAddress, secondaryAvailableAddress);
    }
}
