package com.taobao.downloader.adpater;

/* JADX INFO: loaded from: classes4.dex */
public interface ThreadExecutor {
    void execute(Runnable runnable, boolean z10);

    void postDelayed(Runnable runnable, long j10);
}
