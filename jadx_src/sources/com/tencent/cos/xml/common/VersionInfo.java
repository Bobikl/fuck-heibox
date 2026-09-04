package com.tencent.cos.xml.common;

/* JADX INFO: loaded from: classes4.dex */
public class VersionInfo {
    public static final String platform = "cos-android-sdk-5.7.9";
    public static final String platformQuic = "cos-android-quic-sdk-5.7.9";
    public static final int version = 50709;

    public static String getQuicUserAgent() {
        return platformQuic;
    }

    public static String getUserAgent() {
        return platform;
    }
}
