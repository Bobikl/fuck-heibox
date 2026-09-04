package com.taobao.downloader.wrapper;

import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.DownloadRequest;
import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.Param;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.request.task.TaskListener;
import com.taobao.downloader.util.ThreadUtil;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class ListenerWrapper implements TaskListener {
    private String bizId;
    private CallbackWrapper callbackWrapper;
    private DownloadListener downloadListener;
    private long mFinishSize;
    private long mTotalSize;
    private DownloadRequest request;

    public ListenerWrapper(DownloadRequest downloadRequest, DownloadListener downloadListener) {
        this.request = downloadRequest;
        this.downloadListener = downloadListener;
        String str = downloadRequest.downloadParam.bizId;
        this.bizId = str;
        this.callbackWrapper = new CallbackWrapper(str, downloadRequest, downloadListener);
    }

    private long geDLTotalSize() {
        long j10 = this.mTotalSize;
        if (0 != j10) {
            return j10;
        }
        Iterator<Item> it = this.request.downloadList.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            long j12 = it.next().size;
            if (j12 <= 0) {
                return 0L;
            }
            j11 += j12;
        }
        this.mTotalSize = j11;
        return j11;
    }

    @Override // com.taobao.downloader.request.task.TaskListener
    public void onDownloadStateChange(String str, boolean z10) {
        this.downloadListener.onDownloadStateChange(str, z10);
    }

    @Override // com.taobao.downloader.request.task.TaskListener
    public void onNetworkLimit(int i10, Param param, DownloadListener.NetworkLimitCallback networkLimitCallback) {
        this.downloadListener.onNetworkLimit(i10, param, networkLimitCallback);
    }

    @Override // com.taobao.downloader.download.IListener
    public synchronized void onProgress(long j10) {
        geDLTotalSize();
        long j11 = this.mTotalSize;
        if (0 == j11) {
            return;
        }
        DownloadListener downloadListener = this.downloadListener;
        if (downloadListener != null) {
            int i10 = (int) (((this.mFinishSize + j10) * 100) / j11);
            if (i10 > 100) {
                i10 = 100;
            }
            downloadListener.onDownloadProgress(i10);
        }
    }

    @Override // com.taobao.downloader.download.IListener
    public synchronized void onResult(final SingleTask singleTask) {
        this.mFinishSize += singleTask.item.size;
        if (this.downloadListener == null) {
            return;
        }
        ThreadUtil.execute(new Runnable() { // from class: com.taobao.downloader.wrapper.ListenerWrapper.1
            @Override // java.lang.Runnable
            public void run() {
                ListenerWrapper.this.callbackWrapper.execute(singleTask);
            }
        }, true);
    }
}
