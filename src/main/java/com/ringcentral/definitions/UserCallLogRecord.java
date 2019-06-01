package com.ringcentral.definitions;


public class UserCallLogRecord {
    /**
     * Internal identifier of a cal log record
     */
    public String id;
    /**
     * Canonical URI of a call log record
     */
    public String uri;
    /**
     * Internal identifier of a call session
     */
    public String sessionId;
    /**
     *
     */
    public CallLogCallerInfo from;
    /**
     *
     */
    public CallLogCallerInfo to;
    /**
     * Call type
     * Enum: Voice, Fax
     */
    public String type;
    /**
     * Call direction
     * Enum: Inbound, Outbound
     */
    public String direction;
    /**
     * The call start datetime in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
     */
    public String startTime;
    /**
     * Indicates whether the record is deleted. Returned for deleted records, for ISync requests
     */
    public Boolean deleted;
    /**
     * Call duration in seconds
     */
    public Long duration;
    /**
     *
     */
    public CallLogRecordingInfo recording;
    /**
     * Action description of the call operation
     * Enum: Unknown, Phone Call, Phone Login, Incoming Fax, Accept Call, FindMe, FollowMe, Outgoing Fax, Call Return, Calling Card, Ring Directly, RingOut Web, VoIP Call, RingOut PC, RingMe, Transfer, 411 Info, Emergency, E911 Update, Support, RingOut Mobile
     */
    public String action;
    /**
     * Status description of the call operation
     * Enum: Unknown, ResultInProgress, Missed, Call accepted, Voicemail, Rejected, Reply, Received, Receive Error, Fax on Demand, Partial Receive, Blocked, Call connected, No Answer, International Disabled, Busy, Send Error, Sent, No fax machine, ResultEmpty, Account, Suspended, Call Failed, Call Failure, Internal Error, IP Phone offline, Restricted Number, Wrong Number, Stopped, Hang up, Poor Line Quality, Partially Sent, International Restriction, Abandoned, Declined, Fax Receipt Error, Fax Send Error
     */
    public String result;
    /**
     * Reason of a call result:
     * * `Accepted` - The call was connected to and accepted by this number
     * * `Connected` - The call was answered, but there was no response on how to handle the call (for example, a voice mail system answered the call and did not push "1" to accept)
     * * `Line Busy` - The phone number you dialed was busy
     * * `Not Answered` - The phone number you dialed was not answered
     * * `No Answer` - You did not answer the call
     * * `Hang Up` - The caller hung up before the call was answered
     * * `Stopped` - This attempt was stopped because the call was answered by another phone
     * * `Internal Error` - An internal error occurred when making the call. Please try again
     * * `No Credit` - There was not enough Calling Credit on your account to make this call
     * * `Restricted Number` - The number you dialed is restricted by RingCentral
     * * `Wrong Number` - The number you dialed has either been disconnected or is not a valid phone number. Please check the number and try again
     * * `International Disabled` - International calling is not enabled on your account. Contact customer service to activate International Calling
     * * `International Restricted` - The country and/or area you attempted to call has been prohibited by your administrator
     * * `Bad Number` - An error occurred when making the call. Please check the number before trying again
     * * `Info 411 Restricted` - Calling to 411 Information Services is restricted
     * * `Customer 611 Restricted` - 611 customer service is not supported. Please contact customer service at <(888) 555-1212>
     * * `No Digital Line` - This DigitalLine was either not plugged in or did not have an internet connection
     * * `Failed Try Again` - Call failed. Please try again
     * * `Max Call Limit` - The number of simultaneous calls to your account has reached its limit
     * * `Too Many Calls` - The number of simultaneous calls for per DigitalLine associated with Other Phone has reached its limit. Please contact customer service
     * * `Calls Not Accepted` - Your account was not accepting calls at this time
     * * `Number Not Allowed` - The number that was dialed to access your account is not allowed
     * * `Number Blocked` - This number is in your Blocked Numbers list
     * * `Number Disabled` - The phone number and/or area you attempted to call has been prohibited by your administrator
     * * `Resource Error` - An error occurred when making the call. Please try again
     * * `Call Loop` - A call loop occurred due to an incorrect call forwarding configuration. Please check that you are not forwarding calls back to your own account
     * * `Fax Not Received` - An incoming fax could not be received because a proper connection with the sender's fax machine could not be established
     * * `Fax Partially Sent` - The fax was only partially sent. Possible explanations include phone line quality to poor to maintain the connection or the call was dropped
     * * `Fax Not Sent` - An attempt to send the fax was made, but could not connect with the receiving fax machine
     * * `Fax Poor Line` - An attempt to send the fax was made, but the phone line quality was too poor to send the fax
     * * `Fax Prepare Error` - An internal error occurred when preparing the fax. Please try again
     * * `Fax Save Error` - An internal error occurred when saving the fax. Please try again
     * * `Fax Send Error` - An error occurred when sending the fax. Please try again
     * Enum: Accepted, Connected, line Busy, Not Answered, No Answer, Hang Up, Stopped, Internal Error, No Credit, Restricted Number, Wrong Number, International Restricted, Bad Number, Info 411 Restricted, Customer 611 Restricted, No Digital Line, Failed Try Again, Max Call Limit, Too Many Calls, Calls Not Accepted, Number Not Allowed, Number Blocked, Number Disabled, Resource Error, Call Loop, Fax Not Received, Fax Partially Sent, Fax Not Sent, Fax Poor Line, Fax Prepare Error, Fax Save Error, Fax Send Error
     */
    public String reason;

    public UserCallLogRecord id(String id) {
        this.id = id;
        return this;
    }

    public UserCallLogRecord uri(String uri) {
        this.uri = uri;
        return this;
    }

    public UserCallLogRecord sessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    public UserCallLogRecord from(CallLogCallerInfo from) {
        this.from = from;
        return this;
    }

    public UserCallLogRecord to(CallLogCallerInfo to) {
        this.to = to;
        return this;
    }

    public UserCallLogRecord type(String type) {
        this.type = type;
        return this;
    }

    public UserCallLogRecord direction(String direction) {
        this.direction = direction;
        return this;
    }

    public UserCallLogRecord startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public UserCallLogRecord deleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public UserCallLogRecord duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public UserCallLogRecord recording(CallLogRecordingInfo recording) {
        this.recording = recording;
        return this;
    }

    public UserCallLogRecord action(String action) {
        this.action = action;
        return this;
    }

    public UserCallLogRecord result(String result) {
        this.result = result;
        return this;
    }

    public UserCallLogRecord reason(String reason) {
        this.reason = reason;
        return this;
    }

}
