package com.ss.bytertc.engine;

/* JADX INFO: loaded from: classes4.dex */
public interface RTCHttpClient {

    public interface RtcHttpCallback {
        void run(int i10, String str);
    }

    void GetAsync(String str, RtcHttpCallback rtcHttpCallback, int i10);

    void PostAsync(String str, String str2, RtcHttpCallback rtcHttpCallback, int i10);
}
