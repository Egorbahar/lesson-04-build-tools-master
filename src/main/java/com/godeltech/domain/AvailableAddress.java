package com.godeltech.domain;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    public String getOrganisationName() {
        return organisationName;
    }

    public void setOrganisationName(final String organisationName) {
        this.organisationName = organisationName;
    }

    public String getSubBuilding() {
        return subBuilding;
    }

    public void setSubBuilding(final String subBuilding) {
        this.subBuilding = subBuilding;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(final String buildingName) {
        this.buildingName = buildingName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(final String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getDependantThoroughfare() {
        return dependantThoroughfare;
    }

    public void setDependantThoroughfare(final String dependantThoroughfare) {
        this.dependantThoroughfare = dependantThoroughfare;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(final String locality) {
        this.locality = locality;
    }

    public String getPostTown() {
        return postTown;
    }

    public void setPostTown(final String postTown) {
        this.postTown = postTown;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(final String county) {
        this.county = county;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(final String postcode) {
        this.postcode = postcode;
    }

    public String getAlk() {
        return alk;
    }

    public void setAlk(final String alk) {
        this.alk = alk;
    }

    public boolean isContinueProvisioning() {

        return continueProvisioning;
    }

    public void setContinueProvisioning(final boolean continueProvisioning) {

        this.continueProvisioning = continueProvisioning;
    }

    public String getCssExchangeDistrictCode() {
        return cssExchangeDistrictCode;
    }

    public void setCssExchangeDistrictCode(final String cssExchangeDistrictCode) {
        this.cssExchangeDistrictCode = cssExchangeDistrictCode;
    }

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
