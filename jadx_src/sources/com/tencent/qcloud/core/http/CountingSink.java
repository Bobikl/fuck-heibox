package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.common.QCloudProgressListener;
import java.io.IOException;
import okio.Buffer;
import okio.ForwardingSink;
import okio.Sink;

/* JADX INFO: loaded from: classes4.dex */
public class CountingSink extends ForwardingSink {
    private long bytesTotal;
    private long bytesWritten;
    private QCloudProgressListener progressListener;
    private long recentReportBytes;

    public CountingSink(Sink sink, long j10, QCloudProgressListener qCloudProgressListener) {
        super(sink);
        this.bytesWritten = 0L;
        this.recentReportBytes = 0L;
        this.bytesTotal = j10;
        this.progressListener = qCloudProgressListener;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0022  */
    private void reportProgress() {
        boolean z10;
        QCloudProgressListener qCloudProgressListener = this.progressListener;
        if (qCloudProgressListener == null) {
            return;
        }
        long j10 = this.bytesWritten;
        long j11 = j10 - this.recentReportBytes;
        if (j11 <= 51200) {
            long j12 = j11 * 10;
            long j13 = this.bytesTotal;
            if (j12 > j13 || j10 == j13) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        if (z10) {
            this.recentReportBytes = j10;
            qCloudProgressListener.onProgress(j10, this.bytesTotal);
        }
    }

    long getTotalTransferred() {
        return this.bytesWritten;
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(Buffer buffer, long j10) throws IOException {
        super.write(buffer, j10);
        writeBytesInternal(j10);
    }

    void writeBytesInternal(long j10) {
        this.bytesWritten += j10;
        reportProgress();
    }
}
