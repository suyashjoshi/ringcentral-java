package com.ringcentral.definitions;


    // Site data
public class IVRMenuSiteInfo
{
    /**
         * Internal identifier of a site. If the value is not specified in request, then the `main-site` default value is used
         */
        public String id;
  public IVRMenuSiteInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Site name
         */
        public String name;
  public IVRMenuSiteInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}