package com.taobao.downloader.adpater.impl;

import com.taobao.downloader.Configuration;
import com.taobao.downloader.adpater.FileCacheManager;
import com.taobao.downloader.util.FileUtils;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleFileCacheManager implements FileCacheManager {
    @Override // com.taobao.downloader.adpater.FileCacheManager
    public String getTmpCache() {
        return FileUtils.getStorePath(Configuration.sContext, "download-sdk/tmp");
    }
}
