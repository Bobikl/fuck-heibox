package com.tencent.thumbplayer.tcmedia.g.a;

/* JADX INFO: loaded from: classes4.dex */
public interface a {
    void onCreate(Boolean bool);

    void onRealRelease();

    void onReuseCodecAPIException(String str, Throwable th2);

    void onStarted(Boolean bool, String str);

    void onTransToKeepPool();

    void onTransToRunningPool();
}
