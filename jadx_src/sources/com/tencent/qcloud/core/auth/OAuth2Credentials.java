package com.tencent.qcloud.core.auth;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class OAuth2Credentials implements QCloudCredentials {
    private String accessToken;
    private String authorizationCode;
    private String openId;
    private String platform;
    private String refreshToken;
    private String scope;
    private Date tokenStartTime;
    private Date validFromDate;

    public static final class Builder {
        private String accessToken;
        private String authorizationCode;
        private long expiresIn;
        private String openId;
        private String platform;
        private String refreshToken;
        private String scope;
        private long tokenStartTime;

        public Builder accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public Builder authorizationCode(String str) {
            this.authorizationCode = str;
            return this;
        }

        public OAuth2Credentials build() {
            return new OAuth2Credentials(this);
        }

        public Builder expiresInSeconds(long j10) {
            this.expiresIn = j10;
            return this;
        }

        public Builder openId(String str) {
            this.openId = str;
            return this;
        }

        public Builder platform(String str) {
            this.platform = str;
            return this;
        }

        public Builder refreshToken(String str) {
            this.refreshToken = str;
            return this;
        }

        public Builder scope(String str) {
            this.scope = str;
            return this;
        }

        public Builder tokenStartTime(long j10) {
            this.tokenStartTime = j10;
            return this;
        }
    }

    private OAuth2Credentials(Builder builder) {
        this.platform = builder.platform;
        this.accessToken = builder.accessToken;
        this.tokenStartTime = new Date(builder.tokenStartTime);
        this.validFromDate = new Date(builder.tokenStartTime + (builder.expiresIn * 1000));
        this.refreshToken = builder.refreshToken;
        this.openId = builder.openId;
        this.scope = builder.scope;
        this.authorizationCode = builder.authorizationCode;
    }

    public String getAccessToken() {
        return this.accessToken;
    }

    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    public long getExpiresInSeconds() {
        return (this.validFromDate.getTime() - this.tokenStartTime.getTime()) / 1000;
    }

    public String getOpenId() {
        return this.openId;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getRefreshToken() {
        return this.refreshToken;
    }

    public String getScope() {
        return this.scope;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentials
    public String getSecretId() {
        return this.openId;
    }

    public Date getTokenStartTime() {
        return this.tokenStartTime;
    }

    public Date getValidFromDate() {
        return this.validFromDate;
    }

    public boolean isExpired() {
        return System.currentTimeMillis() > this.validFromDate.getTime();
    }
}
