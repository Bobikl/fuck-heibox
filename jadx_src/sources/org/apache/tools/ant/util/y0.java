package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: LineOrientedOutputStreamRedirector.java */
/* JADX INFO: loaded from: classes5.dex */
public class y0 extends x0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private OutputStream f137009g;

    public y0(OutputStream outputStream) {
        this.f137009g = outputStream;
    }

    @Override // org.apache.tools.ant.util.x0
    protected void b(String str) throws IOException {
        this.f137009g.write(String.format("%s%n", str).getBytes());
    }

    @Override // org.apache.tools.ant.util.x0
    protected void c(byte[] bArr) throws IOException {
        this.f137009g.write(bArr);
        this.f137009g.write(System.lineSeparator().getBytes());
    }

    @Override // org.apache.tools.ant.util.x0, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        this.f137009g.close();
    }

    @Override // org.apache.tools.ant.util.x0, java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        super.flush();
        this.f137009g.flush();
    }
}
