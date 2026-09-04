package com.google.android.exoplayer2.source.rtsp;

import java.io.IOException;

/* JADX INFO: compiled from: RtpDataChannel.java */
/* JADX INFO: loaded from: classes7.dex */
public interface d extends com.google.android.exoplayer2.upstream.o {

    /* JADX INFO: compiled from: RtpDataChannel.java */
    public interface a {
        @androidx.annotation.p0
        a a();

        d b(int i10) throws IOException;
    }

    String d();

    int getLocalPort();

    @androidx.annotation.p0
    y.b r();
}
