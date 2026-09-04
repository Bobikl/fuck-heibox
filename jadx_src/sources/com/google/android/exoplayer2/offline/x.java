package com.google.android.exoplayer2.offline;

import androidx.annotation.p0;
import java.io.IOException;

/* JADX INFO: compiled from: Downloader.java */
/* JADX INFO: loaded from: classes7.dex */
public interface x {

    /* JADX INFO: compiled from: Downloader.java */
    public interface a {
        void a(long j10, long j11, float f10);
    }

    void a(@p0 a aVar) throws InterruptedException, IOException;

    void cancel();

    void remove();
}
