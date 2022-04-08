package com.ringcentral.definitions;


/**
 * Consists of `from` field and `optOuts` and `optIns` lists. Both `optOuts` and `optIns` can be empty but not simultaneously - at least one of the lists must be entered."
 */
public class OptOutBulkAssignRequest {
    /**
     * The phone number of a sender which the recipients should be opted out from or opted in to
     * Required
     * Example: 15551234455
     */
    public String from;
    /**
     * The list of phone numbers to be opted out
     * Example: [&quot;15551237755&quot;, &quot;15551237756&quot;]
     */
    public String[] optOuts;
    /**
     * The list of phone numbers to be opted in
     * Example: [&quot;15551237799&quot;, &quot;15551237798&quot;]
     */
    public String[] optIns;

    public OptOutBulkAssignRequest from(String from) {
        this.from = from;
        return this;
    }

    public OptOutBulkAssignRequest optOuts(String[] optOuts) {
        this.optOuts = optOuts;
        return this;
    }

    public OptOutBulkAssignRequest optIns(String[] optIns) {
        this.optIns = optIns;
        return this;
    }
}
