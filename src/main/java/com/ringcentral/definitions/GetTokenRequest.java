package com.ringcentral.definitions;


/**
 * Request body for operation getToken
 */
public class GetTokenRequest {
    /**
     * Phone number linked to an account or extension in E.164 format with or without leading &#039;+&#039; sign
     */
    public String username;
    /**
     * User&#039;s password
     * Format: password
     */
    public String password;
    /**
     * Optional. Extension short number. If company number is specified as a username, and extension is not specified, the server will attempt to authenticate client as main company administrator
     */
    public String extension;
    /**
     * Grant type
     * Default: password
     * Enum: authorization_code, password, refresh_token, client_credentials, urn:ietf:params:oauth:grant-type:jwt-bearer, partner_jwt
     */
    public String grant_type;
    /**
     * Authorization code
     */
    public String code;
    /**
     * This is a callback URI which determines where the response is sent. The value of this parameter must exactly match one of the URIs you have provided for your app upon registration
     */
    public String redirect_uri;
    /**
     * Access token lifetime in seconds
     * Maximum: 3600
     * Minimum: 600
     * Format: int64
     * Default: 3600
     */
    public Long access_token_ttl;
    /**
     * Refresh token lifetime in seconds
     * Maximum: 604800
     * Format: int64
     * Default: 604800
     */
    public Long refresh_token_ttl;
    /**
     * List of API permissions to be used with access token. Can be omitted when requesting all permissions defined during the application registration phase
     */
    public String scope;
    /**
     * Previously issued refresh token. This is the only formData field used for the Refresh Token Flow.
     */
    public String refresh_token;
    /**
     * The unique identifier of a client application. If not specified, the previously specified or auto generated value is used by default
     */
    public String endpoint_id;
    /**
     *
     */
    public String pin;
    /**
     *
     */
    public String client_id;
    /**
     *
     */
    public String account_id;
    /**
     *
     */
    public String partner_account_id;
    /**
     *
     */
    public String client_assertion_type;
    /**
     *
     */
    public String client_assertion;
    /**
     *
     */
    public String assertion;
    /**
     *
     */
    public String brand_id;
    /**
     *
     */
    public String code_verifier;

    public GetTokenRequest username(String username) {
        this.username = username;
        return this;
    }

    public GetTokenRequest password(String password) {
        this.password = password;
        return this;
    }

    public GetTokenRequest extension(String extension) {
        this.extension = extension;
        return this;
    }

    public GetTokenRequest grant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public GetTokenRequest code(String code) {
        this.code = code;
        return this;
    }

    public GetTokenRequest redirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
        return this;
    }

    public GetTokenRequest access_token_ttl(Long access_token_ttl) {
        this.access_token_ttl = access_token_ttl;
        return this;
    }

    public GetTokenRequest refresh_token_ttl(Long refresh_token_ttl) {
        this.refresh_token_ttl = refresh_token_ttl;
        return this;
    }

    public GetTokenRequest scope(String scope) {
        this.scope = scope;
        return this;
    }

    public GetTokenRequest refresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
        return this;
    }

    public GetTokenRequest endpoint_id(String endpoint_id) {
        this.endpoint_id = endpoint_id;
        return this;
    }

    public GetTokenRequest pin(String pin) {
        this.pin = pin;
        return this;
    }

    public GetTokenRequest client_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public GetTokenRequest account_id(String account_id) {
        this.account_id = account_id;
        return this;
    }

    public GetTokenRequest partner_account_id(String partner_account_id) {
        this.partner_account_id = partner_account_id;
        return this;
    }

    public GetTokenRequest client_assertion_type(String client_assertion_type) {
        this.client_assertion_type = client_assertion_type;
        return this;
    }

    public GetTokenRequest client_assertion(String client_assertion) {
        this.client_assertion = client_assertion;
        return this;
    }

    public GetTokenRequest assertion(String assertion) {
        this.assertion = assertion;
        return this;
    }

    public GetTokenRequest brand_id(String brand_id) {
        this.brand_id = brand_id;
        return this;
    }

    public GetTokenRequest code_verifier(String code_verifier) {
        this.code_verifier = code_verifier;
        return this;
    }
}
