package com.tencent.open.log;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.tauth.Tencent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a extends Tracer implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f101102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileWriter f101103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f101104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private char[] f101105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile f f101106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile f f101107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile f f101108g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile f f101109h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile boolean f101110i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HandlerThread f101111j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Handler f101112k;

    public a(int i10, boolean z10, g gVar, b bVar) {
        super(i10, z10, gVar);
        this.f101110i = false;
        a(bVar);
        this.f101106e = new f();
        this.f101107f = new f();
        this.f101108g = this.f101106e;
        this.f101109h = this.f101107f;
        this.f101105d = new char[bVar.c()];
        HandlerThread handlerThread = new HandlerThread(bVar.b(), bVar.d());
        this.f101111j = handlerThread;
        handlerThread.start();
        if (!this.f101111j.isAlive() || this.f101111j.getLooper() == null) {
            return;
        }
        this.f101112k = new Handler(this.f101111j.getLooper(), this);
    }

    public a(b bVar) {
        this(c.f101124b, true, g.f101144a, bVar);
    }

    private void a(File file) {
        File[] fileArrListFiles;
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.exists() || !parentFile.isDirectory() || (fileArrListFiles = parentFile.listFiles()) == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (b(file2)) {
                String name = file2.getName();
                if (b.a(System.currentTimeMillis() - (Tencent.USE_ONE_HOUR ? 3600000L : 259200000L)).compareTo(name.substring(32, 43)) > 0) {
                    SLog.d("FileTracer", "delete name=" + name + ", success=" + file2.delete());
                }
            }
        }
    }

    private void a(String str) {
        this.f101108g.a(str);
        if (this.f101108g.a() >= c().c()) {
            a();
        }
    }

    private boolean b(File file) {
        if (file == null) {
            return false;
        }
        String name = file.getName();
        SLog.d("FileTracer", "name=" + name);
        return !TextUtils.isEmpty(name) && name.length() == 47 && name.startsWith("com.tencent.mobileqq_connectSdk.") && name.endsWith(".log");
    }

    private void f() {
        if (Thread.currentThread() == this.f101111j && !this.f101110i) {
            this.f101110i = true;
            i();
            try {
                try {
                    this.f101109h.a(g(), this.f101105d);
                } catch (IOException e10) {
                    SLog.e("FileTracer", "flushBuffer exception", e10);
                }
                this.f101109h.b();
                this.f101110i = false;
            } catch (Throwable th2) {
                this.f101109h.b();
                throw th2;
            }
        }
    }

    private Writer g() {
        File fileA = c().a();
        if (fileA != null && (!fileA.equals(this.f101104c) || this.f101103b == null)) {
            this.f101104c = fileA;
            h();
            try {
                this.f101103b = new FileWriter(this.f101104c, true);
            } catch (IOException unused) {
                this.f101103b = null;
                SLog.e(SLog.TAG, "-->obtainFileWriter() app specific file permission denied");
            }
            a(fileA);
        }
        return this.f101103b;
    }

    private void h() {
        try {
            FileWriter fileWriter = this.f101103b;
            if (fileWriter != null) {
                fileWriter.flush();
                this.f101103b.close();
            }
        } catch (IOException e10) {
            SLog.e(SLog.TAG, "-->closeAppSpecificFileWriter() exception:", e10);
        }
    }

    private void i() {
        synchronized (this) {
            if (this.f101108g == this.f101106e) {
                this.f101108g = this.f101107f;
                this.f101109h = this.f101106e;
            } else {
                this.f101108g = this.f101106e;
                this.f101109h = this.f101107f;
            }
        }
    }

    public void a() {
        if (this.f101112k.hasMessages(1024)) {
            this.f101112k.removeMessages(1024);
        }
        this.f101112k.sendEmptyMessage(1024);
    }

    public void a(b bVar) {
        this.f101102a = bVar;
    }

    public void b() {
        h();
        this.f101111j.quit();
    }

    public b c() {
        return this.f101102a;
    }

    @Override // com.tencent.open.log.Tracer
    protected void doTrace(int i10, Thread thread, long j10, String str, String str2, Throwable th2) {
        a(e().a(i10, thread, j10, str, str2, th2));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 1024) {
            return true;
        }
        f();
        return true;
    }
}
