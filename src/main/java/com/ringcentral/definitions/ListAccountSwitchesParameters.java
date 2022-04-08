package com.ringcentral.definitions;


/**
 * Query parameters for operation listAccountSwitches
 */
public class ListAccountSwitchesParameters {
    /**
     * Internal identifier of a site. To filter Main Site (Company) main-site must be specified. Supported only If multi-site feature is enabled for the account
     */
    public String siteId;
    /**
     * Filters entries by the specified substring (search by chassis ID, switch name or address) The characters range is 0-64 (if empty the filter is ignored)
     */
    public String searchString;
    /**
     * Comma-separated list of fields to order results prefixed by &#039;+&#039; sign (ascending order) or &#039;-&#039; sign (descending order). The default sorting is by `name`
     */
    public String orderBy;
    /**
     * Indicates the page size (number of items). The values supported: `Max` or numeric value. If not specified, 100 records are returned per one page
     */
    public Long perPage;
    /**
     * Indicates the page number to retrieve. Only positive number values are supported
     * Default: 1
     */
    public Long page;

    public ListAccountSwitchesParameters siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }

    public ListAccountSwitchesParameters searchString(String searchString) {
        this.searchString = searchString;
        return this;
    }

    public ListAccountSwitchesParameters orderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public ListAccountSwitchesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListAccountSwitchesParameters page(Long page) {
        this.page = page;
        return this;
    }
}
