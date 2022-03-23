package com.godeltech.service;

import java.util.List;

import com.godeltech.domain.AvailableAddress;

public interface AddressMatchingService {
    List<AvailableAddress> getAvailableAddresses(String postcode);
}
