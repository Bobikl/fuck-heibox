package org.apache.tools.ant;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.WeakHashMap;
import java.util.function.Function;

/* JADX INFO: compiled from: DemuxOutputStream.java */
/* JADX INFO: loaded from: classes5.dex */
public class b0 extends OutputStream {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f133083e = 1024;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f133084f = 132;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f133085g = 13;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f133086h = 10;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakHashMap<Thread, b> f133087b = new WeakHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Project f133088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f133089d;

    /* JADX INFO: compiled from: DemuxOutputStream.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private ByteArrayOutputStream f133090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f133091b;

        private b() {
            this.f133091b = false;
        }
    }

    public b0(Project project, boolean z10) {
        this.f133088c = project;
        this.f133089d = z10;
    }

    private b b() {
        return this.f133087b.computeIfAbsent(Thread.currentThread(), new Function() { // from class: org.apache.tools.ant.a0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b0.c((Thread) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ b c(Thread thread) {
        b bVar = new b();
        bVar.f133090a = new ByteArrayOutputStream(132);
        bVar.f133091b = false;
        return bVar;
    }

    private void f() {
        this.f133087b.remove(Thread.currentThread());
    }

    private void g() {
        b bVar = this.f133087b.get(Thread.currentThread());
        org.apache.tools.ant.util.j0.d(bVar.f133090a);
        bVar.f133090a = new ByteArrayOutputStream();
        bVar.f133091b = false;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
        f();
    }

    protected void d(ByteArrayOutputStream byteArrayOutputStream) {
        this.f133088c.G(byteArrayOutputStream.toString(), this.f133089d);
        g();
    }

    protected void e(ByteArrayOutputStream byteArrayOutputStream) {
        this.f133088c.E(byteArrayOutputStream.toString(), this.f133089d);
        g();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        b bVarB = b();
        if (bVarB.f133090a.size() > 0) {
            e(bVarB.f133090a);
        }
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        byte b10 = (byte) i10;
        b bVarB = b();
        if (b10 == 10) {
            bVarB.f133090a.write(i10);
            d(bVarB.f133090a);
        } else {
            if (bVarB.f133091b) {
                d(bVarB.f133090a);
            }
            bVarB.f133090a.write(i10);
        }
        bVarB.f133091b = b10 == 13;
        if (bVarB.f133091b || bVarB.f133090a.size() <= 1024) {
            return;
        }
        d(bVarB.f133090a);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        byte b10;
        b bVarB = b();
        while (i11 > 0) {
            int i12 = i10;
            while (i11 > 0 && (b10 = bArr[i12]) != 10 && b10 != 13) {
                i12++;
                i11--;
            }
            int i13 = i12 - i10;
            if (i13 > 0) {
                bVarB.f133090a.write(bArr, i10, i13);
            }
            i10 = i12;
            while (i11 > 0) {
                byte b11 = bArr[i10];
                if (b11 != 10 && b11 != 13) {
                    break;
                }
                write(b11);
                i10++;
                i11--;
            }
        }
    }
}
