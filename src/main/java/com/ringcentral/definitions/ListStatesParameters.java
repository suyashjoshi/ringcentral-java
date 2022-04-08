package com.ringcentral.definitions;


/**
 * Query parameters for operation listStates
 */
public class ListStatesParameters {
    /**
     * If set to &#039;True&#039; then states for all countries are returned and `countryId` is ignored, even if specified. If the value is empty then the parameter is ignored
     */
    public Boolean allCountries;
    /**
     * Internal identifier of a country
     * Format: int64
     */
    public Long countryId;
    /**
     * Indicates the page number to retrieve. Only positive number values are accepted
     * Default: 1
     */
    public Long page;
    /**
     * Indicates the page size (number of items)
     * Default: 100
     */
    public Long perPage;
    /**
     * If &#039;True&#039;, the list of states with phone numbers available for buying is returned
     */
    public Boolean withPhoneNumbers;

    public ListStatesParameters allCountries(Boolean allCountries) {
        this.allCountries = allCountries;
        return this;
    }

    public ListStatesParameters countryId(Long countryId) {
        this.countryId = countryId;
        return this;
    }

    public ListStatesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListStatesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListStatesParameters withPhoneNumbers(Boolean withPhoneNumbers) {
        this.withPhoneNumbers = withPhoneNumbers;
        return this;
    }
}
