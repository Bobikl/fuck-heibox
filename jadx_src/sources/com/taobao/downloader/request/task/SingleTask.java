package com.taobao.downloader.request.task;

import android.text.TextUtils;
import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.Param;
import com.taobao.downloader.util.MonitorUtil;
import java.io.File;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class SingleTask {
    public MonitorUtil.DownloadStat downloadStat;
    public int errorCode;
    public String errorMsg;
    public boolean foreground;
    public Item item;
    public Param param;
    public RetryStrategy retryStrategy = new RetryStrategy();
    public String storeDir;
    public String storeFilePath;
    public boolean success;

    public class RetryStrategy {
        private int connectError;
        private int readStreamError;

        public RetryStrategy() {
        }

        public boolean canRetry() {
            return SingleTask.this.param.retryTimes > this.connectError + this.readStreamError;
        }

        public void increaseError(boolean z10) {
            if (z10) {
                this.connectError++;
            } else {
                this.readStreamError++;
            }
        }
    }

    public SingleTask copyNewTask() {
        SingleTask singleTask = new SingleTask();
        singleTask.item = this.item;
        singleTask.param = this.param;
        singleTask.storeDir = this.storeDir;
        singleTask.foreground = this.foreground;
        return singleTask;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SingleTask)) {
            return false;
        }
        SingleTask singleTask = (SingleTask) obj;
        Item item = this.item;
        if (item == null ? singleTask.item != null : !item.equals(singleTask.item)) {
            return false;
        }
        String str = this.storeDir;
        String str2 = singleTask.storeDir;
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
        } else if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getFileName() {
        if (!TextUtils.isEmpty(this.item.name)) {
            return this.item.name;
        }
        try {
            return new File(new URL(this.item.url).getFile()).getName();
        } catch (Throwable unused) {
            return this.item.url;
        }
    }

    public int hashCode() {
        Item item = this.item;
        int iHashCode = (item != null ? item.hashCode() : 0) * 31;
        String str = this.storeDir;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public void reset(boolean z10) {
        this.errorCode = 0;
        this.errorMsg = "";
        this.success = false;
        if (z10) {
            this.retryStrategy = new RetryStrategy();
        }
    }

    public String toString() {
        return super.toString() + "@Task{success=" + this.success + ", errorCode=" + this.errorCode + ", errorMsg='" + this.errorMsg + "', item=" + this.item + ", storeDir='" + this.storeDir + "'}";
    }
}
