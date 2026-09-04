package com.tencent.qcloud.core.auth;

import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.http.HttpConfiguration;

/* JADX INFO: loaded from: classes4.dex */
public class ShortTimeCredentialProvider extends BasicLifecycleCredentialProvider {
    private long duration;
    private String secretId;
    private String secretKey;

    @Deprecated
    public ShortTimeCredentialProvider(String str, String str2, long j10) {
        this.secretId = str;
        this.secretKey = str2;
        this.duration = j10;
    }

    private String secretKey2SignKey(String str, String str2) {
        byte[] bArrHmacSha1 = Utils.hmacSha1(str2, str);
        if (bArrHmacSha1 != null) {
            return new String(Utils.encodeHex(bArrHmacSha1));
        }
        return null;
    }

    @Override // com.tencent.qcloud.core.auth.BasicLifecycleCredentialProvider
    protected QCloudLifecycleCredentials fetchNewCredentials() throws QCloudClientException {
        long deviceTimeWithOffset = HttpConfiguration.getDeviceTimeWithOffset();
        String str = deviceTimeWithOffset + ";" + (this.duration + deviceTimeWithOffset);
        return new BasicQCloudCredentials(this.secretId, this.secretKey, secretKey2SignKey(this.secretKey, str), str);
    }

    public long getDuration() {
        return this.duration;
    }

    public String getSecretId() {
        return this.secretId;
    }

    public String getSecretKey() {
        return this.secretKey;
    }
}
