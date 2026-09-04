package com.ss.bytertc.engine.handler;

/* JADX INFO: loaded from: classes4.dex */
public interface IRTCASREngineEventHandler {

    public enum RTCASRErrorCode {
        NETWORK_INTERRUPTED(-1),
        ALREADY_STARTED(-2),
        TOKEN_EMPTY(-3),
        SIGNATURE_KEY_EMPTY(-4),
        USERID_NULL(-5),
        APPID_NULL(-6),
        CLUSTER_NULL(-7),
        OPERATION_DENIED(-8);

        private int value;

        RTCASRErrorCode(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    void onError(int i10, String str);

    void onMessage(String str);

    void onSuccess();
}
