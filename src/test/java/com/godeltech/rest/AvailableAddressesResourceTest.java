package com.godeltech.rest;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.times;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.http.HttpStatus.OK;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import com.godeltech.domain.AvailableAddress;
import com.godeltech.service.AddressMatchingService;

public class AvailableAddressesResourceTest {

    private static final String POSTCODE = "B12JP";

    @Mock
    private AddressMatchingService serviceMock;
    private AvailableAddressesResource resource;

    @Before
    public void beforeEachTest() {

        initMocks(this);
        resource = new AvailableAddressesResource(serviceMock);
    }

    @Test
    public void shouldReturnAvailableAddresses() {
        final List<AvailableAddress> expectedServiceResponse = asList(new AvailableAddress(), new AvailableAddress());
        given(serviceMock.getAvailableAddresses(POSTCODE)).willReturn(expectedServiceResponse);

        final ResponseEntity<?> response = resource.getAvailableAddresses( POSTCODE);

        assertEquals("HTTP Response status code is incorrect", OK, response.getStatusCode());
        assertEquals("The available addresses are not as expected.", expectedServiceResponse, response.getBody());

        then(serviceMock).should(times(1)).getAvailableAddresses(POSTCODE);
    }
}
