package com.taobao.downloader.adpater;

import com.taobao.downloader.request.DownloadRequest;

/* JADX INFO: loaded from: classes4.dex */
public interface CloundConfigAdapter {
    String getConfig(String str);

    DownloadRequest make(String str);
}
