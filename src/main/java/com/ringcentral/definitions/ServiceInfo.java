package com.ringcentral.definitions;


/**
 * Account service information, including brand, service plan and billing plan
 */
public class ServiceInfo {
    /**
     * Canonical URI of a service info resource
     */
    public String uri;
    /**
     *
     */
    public BillingPlanInfo billingPlan;
    /**
     *
     */
    public BrandInfo brand;
    /**
     *
     */
    public ServicePlanInfo servicePlan;
    /**
     *
     */
    public TargetServicePlanInfo targetServicePlan;
    /**
     *
     */
    public ContractedCountryInfo contractedCountry;

    public ServiceInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ServiceInfo billingPlan(BillingPlanInfo billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    public ServiceInfo brand(BrandInfo brand) {
        this.brand = brand;
        return this;
    }

    public ServiceInfo servicePlan(ServicePlanInfo servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }

    public ServiceInfo targetServicePlan(TargetServicePlanInfo targetServicePlan) {
        this.targetServicePlan = targetServicePlan;
        return this;
    }

    public ServiceInfo contractedCountry(ContractedCountryInfo contractedCountry) {
        this.contractedCountry = contractedCountry;
        return this;
    }
}
