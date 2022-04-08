package com.ringcentral.definitions;


/**
 * Shipping information, according to which devices (in case of  HardPhone ) or e911 stickers (in case of  SoftPhone  and  OtherPhone ) will be delivered to the customer
 */
public class ShippingInfo {
    /**
     * Shipping status of the order item. It is set to &#039;Initial&#039; when the order is submitted. Then it is changed to &#039;Accepted&#039; when a distributor starts processing the order. Finally the status is changed to &#039;Shipped&#039; which means that distributor shipped the device.
     * Enum: Initial, Accepted, Shipped, Won't ship
     */
    public String status;
    /**
     * Shipping carrier name. Appears only if the device status is &#039;Shipped&#039;
     */
    public String carrier;
    /**
     * Carrier-specific tracking number. Appears only if the device status is &#039;Shipped&#039;
     */
    public String trackingNumber;
    /**
     *
     */
    public MethodInfo method;
    /**
     *
     */
    public ShippingAddressInfo address;

    public ShippingInfo status(String status) {
        this.status = status;
        return this;
    }

    public ShippingInfo carrier(String carrier) {
        this.carrier = carrier;
        return this;
    }

    public ShippingInfo trackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
    }

    public ShippingInfo method(MethodInfo method) {
        this.method = method;
        return this;
    }

    public ShippingInfo address(ShippingAddressInfo address) {
        this.address = address;
        return this;
    }
}
