package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPDownloadListener {
    void didReleaseMemory(String str);

    void onQuicQualityReportUpdate(String str);

    void willReleaseMemory(String str);
}
