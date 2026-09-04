package com.tencent.thumbplayer.tcmedia.core.downloadproxy.api;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPOfflineDownloadListener {
    void onDownloadCdnUrlExpired(Map<String, String> map);

    void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4);

    void onDownloadCdnUrlUpdate(String str);

    void onDownloadError(int i10, int i11, String str);

    void onDownloadFinish();

    void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str);

    void onDownloadProtocolUpdate(String str, String str2);

    void onDownloadStatusUpdate(int i10);
}
