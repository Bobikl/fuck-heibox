package com.taobao.downloader.download.impl2;

import com.taobao.downloader.download.IListener;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.util.MonitorUtil;

/* JADX INFO: loaded from: classes4.dex */
public class OutputContext {
    public IListener mListener;
    public int successCode = 10;
    public long mDownloadSize = 0;
    public boolean hasReadData = false;
    public ErrorInfo errorInfo = new ErrorInfo();
    public MonitorUtil.DownloadStat downloadStat = new MonitorUtil.DownloadStat();

    public static class ErrorInfo {
        public boolean connectError;
        public int errorCode;
        public String errorMsg;
        public boolean ioError;
        public int originalErrorCode;
        public boolean readStreamError;
        public boolean success = true;
        public boolean urlError;

        public ErrorInfo addErrorInfo(int i10, int i11, String str) {
            this.success = false;
            this.errorCode = i10;
            this.originalErrorCode = i11;
            this.errorMsg = str;
            return this;
        }
    }

    public OutputContext(IListener iListener) {
        this.mListener = iListener;
    }

    public void callback(InputContext inputContext) {
        if (this.mListener == null) {
            return;
        }
        SingleTask singleTask = inputContext.mTask;
        ErrorInfo errorInfo = this.errorInfo;
        if (errorInfo.success) {
            singleTask.success = true;
            singleTask.storeFilePath = inputContext.downloadFile.getAbsolutePath();
            singleTask.errorCode = this.successCode;
            singleTask.errorMsg = "下载成功";
        } else {
            singleTask.success = false;
            singleTask.errorCode = errorInfo.errorCode;
            singleTask.retryStrategy.increaseError(errorInfo.connectError);
            int i10 = singleTask.errorCode;
            if (i10 == -21) {
                singleTask.errorMsg = "手机剩余空间不足";
            } else if (i10 != -18 && i10 != -15) {
                switch (i10) {
                    case -12:
                        singleTask.errorMsg = "网络错误";
                        break;
                    case -11:
                        singleTask.errorMsg = "文件读写错误";
                        break;
                    case -10:
                        singleTask.errorMsg = "url错误";
                        break;
                    default:
                        singleTask.errorMsg = "下载失败";
                        break;
                }
            } else {
                singleTask.errorMsg = "文件校验失败";
            }
        }
        MonitorUtil.DownloadStat downloadStat = this.downloadStat;
        downloadStat.url = inputContext.url;
        downloadStat.size = singleTask.item.size;
        long j10 = downloadStat.downloadTime;
        if (0 != j10) {
            downloadStat.downloadSpeed = (downloadStat.traffic / 1024.0d) / (j10 / 1000.0d);
        }
        boolean z10 = singleTask.success;
        downloadStat.success = z10;
        if (z10) {
            downloadStat.error_code = String.valueOf(this.successCode);
        } else {
            ErrorInfo errorInfo2 = this.errorInfo;
            downloadStat.error_code = String.valueOf((errorInfo2.errorCode * 1000) - errorInfo2.originalErrorCode);
        }
        MonitorUtil.DownloadStat downloadStat2 = this.downloadStat;
        downloadStat2.error_msg = this.errorInfo.errorMsg;
        downloadStat2.biz = singleTask.param.bizId;
        singleTask.downloadStat = downloadStat2;
        this.mListener.onResult(singleTask);
    }

    public void updateProgress() {
        IListener iListener = this.mListener;
        if (iListener != null) {
            iListener.onProgress(this.mDownloadSize);
        }
    }
}
