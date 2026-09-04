package org.apache.tools.ant.util;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: OutputStreamFunneler.java */
/* JADX INFO: loaded from: classes5.dex */
public class d1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f136759e = 1000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f136760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f136761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f136762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f136763d;

    /* JADX INFO: compiled from: OutputStreamFunneler.java */
    public final class b extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f136764b;

        private b() {
            this.f136764b = false;
            synchronized (d1.this) {
                d1.a(d1.this);
            }
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            d1.this.h(this);
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            synchronized (d1.this) {
                d1.this.f();
                d1.this.f136760a.flush();
            }
        }

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            synchronized (d1.this) {
                d1.this.f();
                d1.this.f136760a.write(i10);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            synchronized (d1.this) {
                d1.this.f();
                d1.this.f136760a.write(bArr);
            }
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            synchronized (d1.this) {
                d1.this.f();
                d1.this.f136760a.write(bArr, i10, i11);
            }
        }
    }

    public d1(OutputStream outputStream) {
        this(outputStream, 1000L);
    }

    public d1(OutputStream outputStream, long j10) {
        this.f136761b = 0;
        if (outputStream == null) {
            throw new IllegalArgumentException("OutputStreamFunneler.<init>:  out == null");
        }
        this.f136760a = outputStream;
        this.f136762c = false;
        i(j10);
    }

    static /* synthetic */ int a(d1 d1Var) {
        int i10 = d1Var.f136761b + 1;
        d1Var.f136761b = i10;
        return i10;
    }

    private synchronized void e() throws IOException {
        try {
            f();
            this.f136760a.close();
            this.f136762c = true;
        } catch (Throwable th2) {
            this.f136762c = true;
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void f() throws IOException {
        if (this.f136762c) {
            throw new IOException("The funneled OutputStream has been closed.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void h(b bVar) throws IOException {
        if (!bVar.f136764b) {
            try {
                if (this.f136763d > 0) {
                    long jCurrentTimeMillis = System.currentTimeMillis() + this.f136763d;
                    for (long jCurrentTimeMillis2 = System.currentTimeMillis(); jCurrentTimeMillis2 < jCurrentTimeMillis; jCurrentTimeMillis2 = System.currentTimeMillis()) {
                        try {
                            wait(jCurrentTimeMillis - jCurrentTimeMillis2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
                int i10 = this.f136761b - 1;
                this.f136761b = i10;
                if (i10 == 0) {
                    e();
                }
                bVar.f136764b = true;
            } catch (Throwable th2) {
                bVar.f136764b = true;
                throw th2;
            }
        }
    }

    public synchronized OutputStream g() throws IOException {
        b bVar;
        f();
        try {
            bVar = new b();
            notifyAll();
        } catch (Throwable th2) {
            notifyAll();
            throw th2;
        }
        return bVar;
    }

    public synchronized void i(long j10) {
        this.f136763d = j10;
    }
}
