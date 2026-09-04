package com.apm.lite.j;

import java.io.DataOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class f extends DataOutputStream {
    public f(OutputStream outputStream) {
        super(outputStream);
    }

    public void a() {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
