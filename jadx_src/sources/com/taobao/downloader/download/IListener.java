package com.taobao.downloader.download;

import com.taobao.downloader.request.task.SingleTask;

/* JADX INFO: loaded from: classes4.dex */
public interface IListener {
    void onProgress(long j10);

    void onResult(SingleTask singleTask);
}
