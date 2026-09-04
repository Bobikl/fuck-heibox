package com.taobao.downloader.request;

/* JADX INFO: loaded from: classes4.dex */
public interface DownloadListener {

    public interface NetworkLimitCallback {
        void hasChangeParams(boolean z10);
    }

    void onDownloadError(String str, int i10, String str2);

    void onDownloadFinish(String str, String str2);

    void onDownloadProgress(int i10);

    void onDownloadStateChange(String str, boolean z10);

    void onFinish(boolean z10);

    void onNetworkLimit(int i10, Param param, NetworkLimitCallback networkLimitCallback);
}
