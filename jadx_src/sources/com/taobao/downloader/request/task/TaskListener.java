package com.taobao.downloader.request.task;

import com.taobao.downloader.download.IListener;
import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.Param;

/* JADX INFO: loaded from: classes4.dex */
public interface TaskListener extends IListener {
    void onDownloadStateChange(String str, boolean z10);

    void onNetworkLimit(int i10, Param param, DownloadListener.NetworkLimitCallback networkLimitCallback);
}
