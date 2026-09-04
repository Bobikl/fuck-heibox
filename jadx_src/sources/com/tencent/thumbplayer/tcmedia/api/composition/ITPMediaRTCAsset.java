package com.tencent.thumbplayer.tcmedia.api.composition;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPMediaRTCAsset extends ITPMediaAsset {
    public static final int MINI_SDP_EXCHANGE = 1;
    public static final int NORMAL_SDP_EXCHANGE = 0;
    public static final int USER_SDP_EXCHANGE = 2;

    int getRtcSdpExchangeType();

    String getRtcServerUrl();

    String getRtcStreamUrl();
}
