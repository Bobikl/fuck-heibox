package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.logger.FileLogAdapter;
import com.tencent.qcloud.core.logger.QCloudLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public class HttpLogger implements HttpLoggingInterceptor.Logger {
    private boolean debuggable;
    private FileLogAdapter fileLogAdapter;
    private List<String> mRequestBufferLogs;
    private String tag;

    HttpLogger(boolean z10) {
        this(z10, QCloudHttpClient.HTTP_LOG_TAG);
    }

    public HttpLogger(boolean z10, String str) {
        this.debuggable = z10;
        this.tag = str;
        this.mRequestBufferLogs = new ArrayList(10);
    }

    private synchronized void flushRequestBufferLogs() {
        synchronized (this.mRequestBufferLogs) {
            if (this.fileLogAdapter != null && this.mRequestBufferLogs.size() > 0) {
                Iterator<String> it = this.mRequestBufferLogs.iterator();
                while (it.hasNext()) {
                    this.fileLogAdapter.log(4, this.tag, it.next(), null);
                }
                this.mRequestBufferLogs.clear();
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
    public void logException(Exception exc, String str) {
        QCloudLogger.i(this.tag, str, new Object[0]);
        if (this.fileLogAdapter != null && exc != null) {
            flushRequestBufferLogs();
            this.fileLogAdapter.log(4, this.tag, str, exc);
        } else {
            synchronized (this.mRequestBufferLogs) {
                this.mRequestBufferLogs.clear();
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
    public void logRequest(String str) {
        if (this.debuggable) {
            QCloudLogger.i(this.tag, str, new Object[0]);
        }
        FileLogAdapter fileLogAdapter = (FileLogAdapter) QCloudLogger.getAdapter(FileLogAdapter.class);
        this.fileLogAdapter = fileLogAdapter;
        if (fileLogAdapter != null) {
            synchronized (this.mRequestBufferLogs) {
                this.mRequestBufferLogs.add(str);
            }
        }
    }

    @Override // com.tencent.qcloud.core.http.HttpLoggingInterceptor.Logger
    public void logResponse(c0 c0Var, String str) {
        if (this.debuggable) {
            QCloudLogger.i(this.tag, str, new Object[0]);
        }
        if (this.fileLogAdapter != null && c0Var != null && !c0Var.c1()) {
            flushRequestBufferLogs();
            this.fileLogAdapter.log(4, this.tag, str, null);
        } else {
            synchronized (this.mRequestBufferLogs) {
                this.mRequestBufferLogs.clear();
            }
        }
    }

    public void setDebug(boolean z10) {
        this.debuggable = z10;
    }

    public void setTag(String str) {
        this.tag = str;
    }
}
