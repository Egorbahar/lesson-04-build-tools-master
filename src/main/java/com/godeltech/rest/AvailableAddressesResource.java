package com.godeltech.rest;

import com.godeltech.domain.AvailableAddress;
import com.godeltech.service.AddressMatchingService;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequiredArgsConstructor
public class AvailableAddressesResource {
    private final AddressMatchingService service;

    @RequestMapping(value = "/v1/available-addresses", method = GET)
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "Success", response = AvailableAddress.class, responseContainer = "List")})
    public ResponseEntity<?> getAvailableAddresses(@RequestParam(name = "postcode") final String postcode) {
        final List<AvailableAddress> serviceResponse = service.getAvailableAddresses(postcode);
        return new ResponseEntity<>(serviceResponse, OK);
    }

}
