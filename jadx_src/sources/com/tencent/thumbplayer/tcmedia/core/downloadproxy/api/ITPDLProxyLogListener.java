package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPDLProxyLogListener {
    public static final String COMMON_TAG = "tpdlnative";
    public static final int LOG_DEBUG = 3;
    public static final int LOG_ERROR = 6;
    public static final int LOG_INFO = 4;
    public static final int LOG_WARN = 5;

    int d(String str, int i10, String str2, String str3);

    int e(String str, int i10, String str2, String str3);

    int i(String str, int i10, String str2, String str3);

    int w(String str, int i10, String str2, String str3);
}
