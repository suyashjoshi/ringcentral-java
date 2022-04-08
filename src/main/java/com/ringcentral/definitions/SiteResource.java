package com.ringcentral.definitions;


/**
 * Extension site
 */
public class SiteResource {
    /**
     * Site extension identifier
     */
    public String id;
    /**
     * Site extension name
     */
    public String name;

    public SiteResource id(String id) {
        this.id = id;
        return this;
    }

    public SiteResource name(String name) {
        this.name = name;
        return this;
    }
}
