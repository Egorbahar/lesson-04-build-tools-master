package com.godeltech.service;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.godeltech.domain.AvailableAddress;

public class AddressMatchingServiceTest {
    private static final String POSTCODE = "CV3 6LL";
    private AddressMatchingService service;

    @Before
    public void beforeEachTest() {
        service = new AddressMatchingServiceImpl();
    }

    @Test
    public void shouldGetAvailableAddresses() {

        final AvailableAddress primaryAvailableAddress = new AvailableAddress();
        primaryAvailableAddress.setOrganisationName("GTE");
        primaryAvailableAddress.setBuildingName("Silver Tower");
        primaryAvailableAddress.setBuildingNumber("20");
        primaryAvailableAddress.setStreet("1st Zagorodnyj lane");
        primaryAvailableAddress.setPostTown("Minsk");
        primaryAvailableAddress.setPostcode(POSTCODE);

        final AvailableAddress secondaryAvailableAddress = new AvailableAddress();
        secondaryAvailableAddress.setOrganisationName("GTE");
        secondaryAvailableAddress.setBuildingName("Rubin Plaza");
        secondaryAvailableAddress.setBuildingNumber("5");
        secondaryAvailableAddress.setStreet("Dzerzhinskogo avenue");
        secondaryAvailableAddress.setPostTown("Minsk");
        secondaryAvailableAddress.setPostcode("Invalid Postcode");

        final List<AvailableAddress> expectedAddressesList = asList(primaryAvailableAddress, secondaryAvailableAddress);

        final List<AvailableAddress> result = service.getAvailableAddresses(POSTCODE);

        assertEquals("incorrect response value", expectedAddressesList, result);
    }


}
