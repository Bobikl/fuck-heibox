package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.http.HttpConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class SessionQCloudCredentials implements QCloudLifecycleCredentials, QCloudRawCredentials {
    private final long expiredTime;
    private final String secretId;
    private final String secretKey;
    private final long startTime;
    private final String token;

    public SessionQCloudCredentials(String str, String str2, String str3, long j10) {
        this(str, str2, str3, HttpConfiguration.getDeviceTimeWithOffset(), j10);
    }

    public SessionQCloudCredentials(String str, String str2, String str3, long j10, long j11) {
        if (str == null) {
            throw new IllegalArgumentException("secretId cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("secretKey cannot be null.");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("token cannot be null.");
        }
        if (j10 >= j11) {
            throw new IllegalArgumentException("beginTime must be less than expiredTime.");
        }
        this.secretId = str;
        this.secretKey = str2;
        this.startTime = j10;
        this.expiredTime = j11;
        this.token = str3;
    }

    public SessionQCloudCredentials(String str, String str2, String str3, String str4) {
        if (str == null) {
            throw new IllegalArgumentException("secretId cannot be null.");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("secretKey cannot be null.");
        }
        if (str3 == null) {
            throw new IllegalArgumentException("token cannot be null.");
        }
        if (str4 == null) {
            throw new IllegalArgumentException("keyTime cannot be null.");
        }
        this.secretId = str;
        this.secretKey = str2;
        this.token = str3;
        long[] keyTimes = Utils.parseKeyTimes(str4);
        this.startTime = keyTimes[0];
        this.expiredTime = keyTimes[1];
    }

    private String getKeyTime(long j10, long j11) {
        return Utils.handleTimeAccuracy(j10) + ";" + Utils.handleTimeAccuracy(j11);
    }

    private String getSignKey(String str, String str2) {
        byte[] bArrHmacSha1 = Utils.hmacSha1(str2, str);
        if (bArrHmacSha1 != null) {
            return new String(Utils.encodeHex(bArrHmacSha1));
        }
        return null;
    }

    public long getExpiredTime() {
        return this.expiredTime;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public String getKeyTime() {
        return Utils.handleTimeAccuracy(this.startTime) + ";" + Utils.handleTimeAccuracy(this.expiredTime);
    }

    @Override // com.tencent.qcloud.core.auth.QCloudCredentials
    public String getSecretId() {
        return this.secretId;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudRawCredentials
    public String getSecretKey() {
        return this.secretKey;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public String getSignKey() {
        return getSignKey(this.secretKey, getKeyTime());
    }

    public long getStartTime() {
        return this.startTime;
    }

    public String getToken() {
        return this.token;
    }

    @Override // com.tencent.qcloud.core.auth.QCloudLifecycleCredentials
    public boolean isValid() {
        long deviceTimeWithOffset = HttpConfiguration.getDeviceTimeWithOffset();
        return deviceTimeWithOffset >= this.startTime && deviceTimeWithOffset <= this.expiredTime - 60;
    }
}
