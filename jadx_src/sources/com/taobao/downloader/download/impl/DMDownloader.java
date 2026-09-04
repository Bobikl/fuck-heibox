package com.taobao.downloader.download.impl;

import android.app.DownloadManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.taobao.downloader.Configuration;
import com.taobao.downloader.download.IDownloader;
import com.taobao.downloader.download.IListener;
import com.taobao.downloader.request.Param;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.util.Dlog;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class DMDownloader implements IDownloader {
    private static final String TAG = "DMDownloader";
    private ContentObserver downloadChangeObserver;
    private long mDownloadId;
    private IListener mListener;
    private SingleTask mTask;
    private static DownloadManager downloadManager = (DownloadManager) Configuration.sContext.getSystemService(ChannelsDetailActivity.f79595e4);
    public static final Uri CONTENT_URI = Uri.parse("content://downloads/my_downloads");

    private void destroy() {
        if (this.downloadChangeObserver != null) {
            Configuration.sContext.getContentResolver().unregisterContentObserver(this.downloadChangeObserver);
        }
    }

    private boolean hasPermission() {
        return Configuration.sContext.checkCallingOrSelfPermission("android.permission.DOWNLOAD_WITHOUT_NOTIFICATION") == 0;
    }

    private boolean isAvailableSapce(long j10) {
        return Environment.getExternalStorageDirectory().getFreeSpace() >= j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queryDownloadStatus() {
        if (this.mDownloadId <= 0) {
            return;
        }
        DownloadManager.Query query = new DownloadManager.Query();
        query.setFilterById(this.mDownloadId);
        Cursor cursorQuery = downloadManager.query(query);
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return;
        }
        int i10 = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
        int columnIndex = cursorQuery.getColumnIndex("reason");
        int columnIndex2 = cursorQuery.getColumnIndex("title");
        int columnIndex3 = cursorQuery.getColumnIndex("total_size");
        int columnIndex4 = cursorQuery.getColumnIndex("bytes_so_far");
        String string = cursorQuery.getString(columnIndex2);
        int i11 = cursorQuery.getInt(columnIndex3);
        int i12 = cursorQuery.getInt(columnIndex4);
        cursorQuery.getInt(columnIndex);
        this.mListener.onProgress(i12);
        Dlog.d(TAG, "queryDownloadStatus", "tag", string + "\nDownloaded " + i12 + " / " + i11);
        if (i10 == 1) {
            Dlog.d(TAG, "queryDownloadStatus", "STATUS_PENDING");
        } else if (i10 != 2) {
            if (i10 != 4) {
                if (i10 != 8) {
                    if (i10 != 16) {
                        return;
                    }
                    Dlog.d(TAG, "queryDownloadStatus", "STATUS_FAILED");
                    return;
                }
                String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("local_filename"));
                if (!TextUtils.isEmpty(string2)) {
                    this.mTask.storeFilePath = string2;
                }
                SingleTask singleTask = this.mTask;
                singleTask.success = true;
                this.mListener.onResult(singleTask);
                destroy();
                return;
            }
            Dlog.d(TAG, "queryDownloadStatus", "STATUS_PAUSED");
            Dlog.d(TAG, "queryDownloadStatus", "STATUS_PENDING");
        }
        Dlog.d(TAG, "queryDownloadStatus", "STATUS_RUNNING");
    }

    @Override // com.taobao.downloader.download.IDownloader
    public void cancel() {
        downloadManager.remove(this.mDownloadId);
        destroy();
    }

    @Override // com.taobao.downloader.download.IDownloader
    public void download(SingleTask singleTask, IListener iListener) {
        this.mListener = iListener;
        this.mTask = singleTask;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(singleTask.item.url));
        int i10 = singleTask.param.network;
        int i11 = (i10 & 2) == 2 ? 1 : 0;
        if ((i10 & 1) == 1 || (i10 & 4) == 4) {
            i11 |= 2;
        }
        request.setAllowedNetworkTypes(i11);
        if ((singleTask.param.network & 4) != 4) {
            request.setAllowedOverMetered(false);
        }
        if (!TextUtils.isEmpty(singleTask.param.title)) {
            request.setTitle(singleTask.param.title);
            request.setDescription(singleTask.param.description);
        }
        String fileName = singleTask.getFileName();
        request.setDestinationUri(Uri.fromFile(new File(singleTask.storeDir + "/" + fileName)));
        this.mTask.storeFilePath = singleTask.storeDir + "/" + fileName;
        if (singleTask.param.notificationUI) {
            request.setNotificationVisibility(this.mTask.param.notificationVisibility);
        } else {
            request.setVisibleInDownloadsUi(false);
            if (hasPermission()) {
                request.setNotificationVisibility(2);
            }
        }
        if (isAvailableSapce(singleTask.item.size)) {
            this.mDownloadId = downloadManager.enqueue(request);
            this.downloadChangeObserver = new ContentObserver(null) { // from class: com.taobao.downloader.download.impl.DMDownloader.1
                @Override // android.database.ContentObserver
                public void onChange(boolean z10) {
                    DMDownloader.this.queryDownloadStatus();
                }
            };
            Configuration.sContext.getContentResolver().registerContentObserver(CONTENT_URI, true, this.downloadChangeObserver);
            return;
        }
        singleTask.success = false;
        singleTask.errorCode = -21;
        singleTask.errorMsg = "手机剩余空间不足";
        Param param = singleTask.param;
        param.retryTimes = 0;
        param.callbackCondition = 0;
        this.mListener.onResult(singleTask);
    }

    @Override // com.taobao.downloader.download.IDownloader
    public void pause() {
        destroy();
    }
}
