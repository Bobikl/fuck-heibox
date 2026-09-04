package com.taobao.downloader.download.protocol;

import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.task.SingleTask;

/* JADX INFO: loaded from: classes4.dex */
public class DLConfig {
    public static int DEFAULT_CONNECT_TIMEOUT = 10000;
    public static int DEFAULT_READSTREAM_TIMEOUT = 15000;
    public static int LARGE_BUFFER_SIZE = 32768;
    public static int NORMAL_BUFFER_SIZE = 4096;
    public static boolean REDIRECTABLE = true;
    public int MAX_CONNECT_FAIL_TIMES;
    public int MAX_READSTREAM_FAIL_TIMES;
    private int cdnHeadError;
    private int connectFailTime;
    private int errorType;
    private Item item;
    private int readFailTime;
    private int readRetryTime;

    public DLConfig(Item item) {
        this.MAX_CONNECT_FAIL_TIMES = 3;
        this.MAX_READSTREAM_FAIL_TIMES = 3;
        this.item = item;
    }

    public DLConfig(SingleTask singleTask) {
        this.MAX_CONNECT_FAIL_TIMES = 3;
        this.MAX_READSTREAM_FAIL_TIMES = 3;
        this.item = singleTask.item;
        int i10 = singleTask.param.retryTimes;
        if (i10 > 0) {
            this.MAX_CONNECT_FAIL_TIMES = i10;
            this.MAX_READSTREAM_FAIL_TIMES = i10;
        }
    }

    public int getBufferSize() {
        return this.readFailTime == 0 ? LARGE_BUFFER_SIZE : NORMAL_BUFFER_SIZE;
    }

    public int getConnectFailTime() {
        return this.connectFailTime;
    }

    public int getConnectTimeout() {
        return DEFAULT_CONNECT_TIMEOUT;
    }

    public int getReadFailTime() {
        return this.readFailTime;
    }

    public int getReadRetryTime() {
        return this.readRetryTime;
    }

    public int getReadTimeout() {
        long j10 = this.item.size;
        if (0 == j10) {
            return DEFAULT_READSTREAM_TIMEOUT * 10;
        }
        int i10 = (int) (j10 / 10);
        int i11 = DEFAULT_READSTREAM_TIMEOUT;
        return i10 > i11 ? i10 : i11;
    }

    public long getWaitTime() {
        if (1 == this.errorType) {
            return this.connectFailTime * 10000;
        }
        return 0L;
    }

    public boolean hasRetryChance() {
        return this.readFailTime < this.MAX_READSTREAM_FAIL_TIMES && this.connectFailTime < this.MAX_CONNECT_FAIL_TIMES && this.cdnHeadError < 3;
    }

    public void increaseConnectFail() {
        this.errorType = 1;
        this.connectFailTime++;
    }

    public void increaseHeadError() {
        this.cdnHeadError++;
    }

    public void increaseReadFail(boolean z10) {
        int i10 = this.readFailTime;
        this.errorType = i10;
        this.readRetryTime++;
        if (z10) {
            this.readFailTime = 0;
        } else {
            this.readFailTime = i10 + 1;
        }
    }

    public boolean isLastConnect() {
        return this.MAX_CONNECT_FAIL_TIMES - this.connectFailTime == 1;
    }

    public boolean isLastRead() {
        return this.MAX_READSTREAM_FAIL_TIMES - this.readFailTime == 1;
    }
}
