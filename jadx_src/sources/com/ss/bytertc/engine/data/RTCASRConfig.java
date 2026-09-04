package com.ss.bytertc.engine.data;

/* JADX INFO: loaded from: classes4.dex */
public class RTCASRConfig {
    public String accessToken;
    public String appId;
    public ASRAuthorizationType authorizationType;
    public String cluster;
    public String secretKey;
    public String userId;

    public enum ASRAuthorizationType {
        ASR_AUTHORIZATION_TYPE_TOKEN(0),
        ASR_AUTHORIZATION_TYPE_SIGNATURE(1);

        private int value;

        ASRAuthorizationType(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public RTCASRConfig(String str, String str2, String str3, ASRAuthorizationType aSRAuthorizationType, String str4, String str5) {
        this.userId = str;
        this.accessToken = str2;
        this.secretKey = str3;
        this.authorizationType = aSRAuthorizationType;
        this.cluster = str4;
        this.appId = str5;
    }
}
