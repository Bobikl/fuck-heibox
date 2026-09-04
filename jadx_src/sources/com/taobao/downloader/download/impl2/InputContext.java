package com.taobao.downloader.download.impl2;

import android.text.TextUtils;
import com.taobao.downloader.download.protocol.DLConfig;
import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.util.Md5Util;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class InputContext {
    public File downloadFile;
    public DLConfig mConfig;
    public SingleTask mTask;
    public File tempFile;
    public URL url;

    public InputContext(SingleTask singleTask) {
        this.mTask = singleTask;
        this.mConfig = new DLConfig(singleTask);
    }

    public int getFileErrorCode() {
        long j10 = this.mTask.item.size;
        if (0 == j10 || j10 == this.tempFile.length()) {
            return !Md5Util.isMd5Same(this.mTask.item.md5, this.tempFile.getAbsolutePath()) ? -15 : -14;
        }
        return -18;
    }

    public long getPreviousFileSize() {
        if (!this.tempFile.exists()) {
            return 0L;
        }
        long length = this.tempFile.length();
        long j10 = this.mTask.item.size;
        if (0 == j10 || length < j10) {
            return length;
        }
        this.tempFile.delete();
        return 0L;
    }

    public RandomAccessFile getRandomAccessFile() throws FileNotFoundException {
        return new RandomAccessFile(this.tempFile, "rw");
    }

    public boolean hitFileCache() {
        if (this.downloadFile.exists()) {
            long j10 = this.mTask.item.size;
            if ((0 == j10 || j10 == this.downloadFile.length()) && Md5Util.isMd5Same(this.mTask.item.md5, this.downloadFile.getAbsolutePath())) {
                return true;
            }
        }
        return false;
    }

    public boolean hitTmpCache() {
        Item item = this.mTask.item;
        if ((0 == item.size && TextUtils.isEmpty(item.md5)) || !this.tempFile.exists()) {
            return false;
        }
        long j10 = this.mTask.item.size;
        return (0 == j10 || j10 == this.tempFile.length()) && Md5Util.isMd5Same(this.mTask.item.md5, this.tempFile.getAbsolutePath());
    }

    public boolean isHttpStatusCodeOk(long j10, int i10) {
        if (200 != i10 && 206 != i10) {
            return false;
        }
        if (j10 <= 0) {
            return true;
        }
        if (206 == i10) {
            j10 += this.tempFile.length();
        } else if (200 != i10) {
            j10 = 0;
        }
        if (j10 != 0) {
            long j11 = this.mTask.item.size;
            if (j11 != 0 && j10 != j11) {
                return false;
            }
        }
        Item item = this.mTask.item;
        if (0 != item.size) {
            return true;
        }
        item.size = j10;
        return true;
    }

    public void prepareDownload() throws MalformedURLException {
        if (this.url == null) {
            this.url = new URL(this.mTask.item.url);
            this.downloadFile = new File(this.mTask.storeDir, TextUtils.isEmpty(this.mTask.item.name) ? new File(this.url.getFile()).getName() : this.mTask.item.name);
            SingleTask singleTask = this.mTask;
            File file = new File(singleTask.storeDir, Md5Util.getTextMd5(singleTask.item.url));
            this.tempFile = file;
            if (!file.getParentFile().exists()) {
                this.tempFile.getParentFile().mkdirs();
            }
            if (!this.tempFile.getParentFile().canWrite()) {
                this.tempFile.getParentFile().setWritable(true);
            }
            SingleTask singleTask2 = this.mTask;
            if (singleTask2.param.useCache || !TextUtils.isEmpty(singleTask2.item.md5)) {
                return;
            }
            this.downloadFile.delete();
            this.tempFile.delete();
        }
    }
}
