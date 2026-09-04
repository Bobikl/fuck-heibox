package com.taobao.downloader.adpater;

/* JADX INFO: loaded from: classes4.dex */
public interface Logger {
    void debug(String str, String str2);

    void error(String str, String str2);

    void error(String str, String str2, Throwable th2);

    void info(String str, String str2);

    void warn(String str, String str2);
}
