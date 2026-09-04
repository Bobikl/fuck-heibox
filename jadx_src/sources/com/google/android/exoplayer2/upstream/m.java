package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: compiled from: DataSink.java */
/* JADX INFO: loaded from: classes7.dex */
public interface m {

    /* JADX INFO: compiled from: DataSink.java */
    public interface a {
        m a();
    }

    void a(r rVar) throws IOException;

    void close() throws IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
