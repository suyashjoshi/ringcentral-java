package com.ringcentral.definitions;


public class AddressBookBulkUploadResource {
    /**
     * Internal identifier of an extension
     * Required
     */
    public String extensionId;
    /**
     * List of contacts to be added to extension address book
     * Required
     */
    public AddressBookBulkContactResource[] contacts;

    public AddressBookBulkUploadResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public AddressBookBulkUploadResource contacts(AddressBookBulkContactResource[] contacts) {
        this.contacts = contacts;
        return this;
    }
}
