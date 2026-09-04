package org.apache.tools.ant.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: KeepAliveInputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class t0 extends FilterInputStream {
    public t0(InputStream inputStream) {
        super(inputStream);
    }

    public static InputStream a() {
        return new t0(System.in);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }
}
