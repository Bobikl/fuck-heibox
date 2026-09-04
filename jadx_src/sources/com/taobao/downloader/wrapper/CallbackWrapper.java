package com.taobao.downloader.wrapper;

import com.taobao.downloader.adpater.Monitor;
import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.DownloadRequest;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.util.Dlog;
import com.taobao.downloader.util.MonitorUtil;

/* JADX INFO: loaded from: classes4.dex */
public class CallbackWrapper {
    private static final String TAG = "Callback";
    private String bizId;
    private DownloadListener downloadListener;
    private String errorCode;
    private String errorMsg;
    private boolean hasError;
    private int onResultCount;
    private DownloadRequest request;
    private SingleTask task;

    public CallbackWrapper(String str, DownloadRequest downloadRequest, DownloadListener downloadListener) {
        this.bizId = str;
        this.request = downloadRequest;
        this.downloadListener = downloadListener;
    }

    public void execute(SingleTask singleTask) {
        if (singleTask == null) {
            return;
        }
        try {
            boolean z10 = true;
            if (singleTask.success) {
                Dlog.d(TAG, "onDownloadFinish", "task", singleTask);
                this.downloadListener.onDownloadFinish(singleTask.item.url, singleTask.storeFilePath);
            } else {
                Dlog.d(TAG, "onDownloadError", "task", singleTask);
                this.downloadListener.onDownloadError(singleTask.item.url, singleTask.errorCode, singleTask.errorMsg);
                this.hasError = true;
                this.errorCode = String.valueOf(singleTask.errorCode);
                this.errorMsg = singleTask.item.url;
            }
            int i10 = this.onResultCount + 1;
            this.onResultCount = i10;
            if (i10 == this.request.downloadList.size()) {
                Dlog.d("onFinish", "task", singleTask);
                if (this.hasError) {
                    MonitorUtil.monitorFail(Monitor.POINT_ALL_CALLBACK, singleTask.param.from + this.bizId, this.errorCode, this.errorMsg);
                } else {
                    MonitorUtil.monitorSuccess(Monitor.POINT_ALL_CALLBACK, singleTask.param.from + this.bizId);
                }
                DownloadListener downloadListener = this.downloadListener;
                if (this.hasError) {
                    z10 = false;
                }
                downloadListener.onFinish(z10);
            }
        } catch (Throwable th2) {
            Dlog.e(TAG, "on callback", th2, new Object[0]);
        }
    }
}
