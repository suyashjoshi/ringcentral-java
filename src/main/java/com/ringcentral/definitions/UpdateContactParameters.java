package com.ringcentral.definitions;


/**
 * Query parameters for operation updateContact
 */
public class UpdateContactParameters {
    /**
     * A country code value complying with the [ISO 3166-1 alpha-2](https://ru.wikipedia.org/wiki/ISO_3166-1_alpha-2) format. The default value is home country of the current extension
     */
    public String dialingPlan;

    public UpdateContactParameters dialingPlan(String dialingPlan) {
        this.dialingPlan = dialingPlan;
        return this;
    }
}
