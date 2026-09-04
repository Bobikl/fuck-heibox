package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: StreamPumper.java */
/* JADX INFO: loaded from: classes5.dex */
public class k6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f134418m = 128;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f134419n = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f134420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final OutputStream f134421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f134422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f134423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f134424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f134425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Exception f134426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f134427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f134428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f134429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private a f134430l;

    /* JADX INFO: compiled from: StreamPumper.java */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f134431a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CountDownLatch f134432b = new CountDownLatch(1);

        a() {
        }

        boolean c(long j10, TimeUnit timeUnit) throws InterruptedException {
            return this.f134432b.await(j10, timeUnit);
        }

        boolean d() {
            return this.f134431a;
        }
    }

    public k6(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, false);
    }

    public k6(InputStream inputStream, OutputStream outputStream, boolean z10) {
        this(inputStream, outputStream, z10, false);
    }

    public k6(InputStream inputStream, OutputStream outputStream, boolean z10, boolean z11) {
        this.f134425g = false;
        this.f134426h = null;
        this.f134427i = 128;
        this.f134428j = false;
        this.f134420b = inputStream;
        this.f134421c = outputStream;
        this.f134424f = z10;
        this.f134429k = z11;
    }

    private void a() throws IOException {
        int i10;
        try {
            int i11 = this.f134427i;
            byte[] bArr = new byte[i11];
            if (this.f134422d) {
                while (true) {
                    int iAvailable = this.f134420b.available();
                    if (iAvailable <= 0 || (i10 = this.f134420b.read(bArr, 0, Math.min(iAvailable, i11))) <= 0) {
                        break;
                        break;
                    }
                    this.f134421c.write(bArr, 0, i10);
                }
            }
            this.f134421c.flush();
        } finally {
            a aVar = this.f134430l;
            if (aVar != null) {
                aVar.f134432b.countDown();
                this.f134430l.f134431a = false;
            }
        }
    }

    private void i(InputStream inputStream) throws InterruptedException, IOException {
        if (this.f134429k) {
            while (!this.f134422d && inputStream.available() == 0) {
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                synchronized (this) {
                    wait(100L);
                }
            }
        }
    }

    public synchronized int b() {
        return this.f134427i;
    }

    public synchronized Exception c() {
        return this.f134426h;
    }

    public boolean d() {
        return this.f134423e;
    }

    void e(boolean z10) {
        this.f134425g = z10;
    }

    public synchronized void f(int i10) {
        if (this.f134428j) {
            throw new IllegalStateException("Cannot set buffer size on a running StreamPumper");
        }
        this.f134427i = i10;
    }

    synchronized a g() {
        this.f134422d = true;
        this.f134430l = new a();
        notifyAll();
        return this.f134430l;
    }

    public synchronized void h() throws InterruptedException {
        while (!d()) {
            wait();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i10;
        synchronized (this) {
            this.f134428j = true;
        }
        this.f134423e = false;
        byte[] bArr = new byte[this.f134427i];
        while (!this.f134422d && !Thread.interrupted()) {
            try {
                try {
                    i(this.f134420b);
                    if (this.f134422d || Thread.interrupted() || (i10 = this.f134420b.read(bArr)) < 0) {
                        break;
                        break;
                        break;
                    } else if (i10 > 0) {
                        this.f134421c.write(bArr, 0, i10);
                        if (this.f134425g) {
                            this.f134421c.flush();
                        }
                    }
                } catch (InterruptedException unused) {
                    if (this.f134424f) {
                        org.apache.tools.ant.util.j0.d(this.f134421c);
                    }
                    this.f134423e = true;
                    this.f134422d = false;
                    synchronized (this) {
                        notifyAll();
                        return;
                    }
                } catch (Exception e10) {
                    synchronized (this) {
                        this.f134426h = e10;
                        if (this.f134424f) {
                            org.apache.tools.ant.util.j0.d(this.f134421c);
                        }
                        this.f134423e = true;
                        this.f134422d = false;
                        synchronized (this) {
                            notifyAll();
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                if (this.f134424f) {
                    org.apache.tools.ant.util.j0.d(this.f134421c);
                }
                this.f134423e = true;
                this.f134422d = false;
                synchronized (this) {
                    notifyAll();
                    throw th2;
                }
            }
        }
        a();
        if (this.f134424f) {
            org.apache.tools.ant.util.j0.d(this.f134421c);
        }
        this.f134423e = true;
        this.f134422d = false;
        synchronized (this) {
            notifyAll();
        }
    }
}
