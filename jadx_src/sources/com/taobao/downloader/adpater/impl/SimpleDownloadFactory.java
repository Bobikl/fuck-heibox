package com.taobao.downloader.adpater.impl;

import com.taobao.downloader.adpater.DownloadFactory;
import com.taobao.downloader.download.IDownloader;
import com.taobao.downloader.download.impl.DMDownloader;
import com.taobao.downloader.download.impl2.DefaultDownloader2;
import com.taobao.downloader.request.Param;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleDownloadFactory implements DownloadFactory {
    @Override // com.taobao.downloader.adpater.DownloadFactory
    public IDownloader getDownloader(Param param) {
        return 1 == param.downloadStrategy ? new DMDownloader() : new DefaultDownloader2();
    }
}
