package com.godeltech.domain;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonPropertyOrder(
        { "organisationName", "subBuilding", "buildingName", "buildingNumber", "dependantThoroughfare", "street",
                "locality", "postTown", "county", "postcode", "addressQualifier", "alk", "continueProvisioning",
                "provisioningRejectionReason", "cssExchangeDistrictCode" })
public class AvailableAddress {

    @JsonProperty("organisationName")
    private String organisationName;

    @JsonProperty("subBuilding")
    private String subBuilding;

    @JsonProperty("buildingName")
    private String buildingName;

    @JsonProperty("buildingNumber")
    private String buildingNumber;

    @JsonProperty("street")
    private String street;

    @JsonProperty("dependantThoroughfare")
    private String dependantThoroughfare;

    @JsonProperty("locality")
    private String locality;

    @JsonProperty("postTown")
    private String postTown;

    @JsonProperty("county")
    private String county;

    @JsonProperty("postcode")
    private String postcode;

    @JsonProperty("alk")
    private String alk;

    @JsonProperty("continueProvisioning")
    private boolean continueProvisioning;

    @JsonProperty("cssExchangeDistrictCode")
    private String cssExchangeDistrictCode;

    @Override
    public int hashCode() {
        return reflectionHashCode(this);
    }

    @Override
    public boolean equals(final Object obj) {
        return reflectionEquals(this, obj);
    }

    @Override
    public String toString() {
        return reflectionToString(this);
    }

}
