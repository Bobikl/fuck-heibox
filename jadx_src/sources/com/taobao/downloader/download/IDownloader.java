package com.taobao.downloader.download;

import com.taobao.downloader.request.task.SingleTask;

/* JADX INFO: loaded from: classes4.dex */
public interface IDownloader {
    void cancel();

    void download(SingleTask singleTask, IListener iListener);

    void pause();
}
