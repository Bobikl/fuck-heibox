package com.taobao.downloader.adpater;

import com.taobao.downloader.download.IDownloader;
import com.taobao.downloader.request.Param;

/* JADX INFO: loaded from: classes4.dex */
public interface DownloadFactory {
    IDownloader getDownloader(Param param);
}
