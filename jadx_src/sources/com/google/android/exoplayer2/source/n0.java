package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.a2;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes7.dex */
public interface n0 {

    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public final f0.a f48591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CopyOnWriteArrayList<C0386a> f48592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f48593d;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.n0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        public static final class C0386a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Handler f48594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public n0 f48595b;

            public C0386a(Handler handler, n0 n0Var) {
                this.f48594a = handler;
                this.f48595b = n0Var;
            }
        }

        public a() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        private a(CopyOnWriteArrayList<C0386a> copyOnWriteArrayList, int i10, @androidx.annotation.p0 f0.a aVar, long j10) {
            this.f48592c = copyOnWriteArrayList;
            this.f48590a = i10;
            this.f48591b = aVar;
            this.f48593d = j10;
        }

        private long h(long j10) {
            long jB1 = com.google.android.exoplayer2.util.u0.B1(j10);
            return jB1 == com.google.android.exoplayer2.j.f46377b ? com.google.android.exoplayer2.j.f46377b : this.f48593d + jB1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(n0 n0Var, y yVar) {
            n0Var.T(this.f48590a, this.f48591b, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(n0 n0Var, u uVar, y yVar) {
            n0Var.A(this.f48590a, this.f48591b, uVar, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(n0 n0Var, u uVar, y yVar) {
            n0Var.q0(this.f48590a, this.f48591b, uVar, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n(n0 n0Var, u uVar, y yVar, IOException iOException, boolean z10) {
            n0Var.O(this.f48590a, this.f48591b, uVar, yVar, iOException, z10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void o(n0 n0Var, u uVar, y yVar) {
            n0Var.U(this.f48590a, this.f48591b, uVar, yVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(n0 n0Var, f0.a aVar, y yVar) {
            n0Var.G(this.f48590a, aVar, yVar);
        }

        public void A(u uVar, int i10, int i11, @androidx.annotation.p0 a2 a2Var, int i12, @androidx.annotation.p0 Object obj, long j10, long j11) {
            B(uVar, new y(i10, i11, a2Var, i12, obj, h(j10), h(j11)));
        }

        public void B(final u uVar, final y yVar) {
            for (C0386a c0386a : this.f48592c) {
                final n0 n0Var = c0386a.f48595b;
                com.google.android.exoplayer2.util.u0.e1(c0386a.f48594a, new Runnable() { // from class: com.google.android.exoplayer2.source.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48028b.o(n0Var, uVar, yVar);
                    }
                });
            }
        }

        public void C(n0 n0Var) {
            for (C0386a c0386a : this.f48592c) {
                if (c0386a.f48595b == n0Var) {
                    this.f48592c.remove(c0386a);
                }
            }
        }

        public void D(int i10, long j10, long j11) {
            E(new y(1, i10, null, 3, null, h(j10), h(j11)));
        }

        public void E(final y yVar) {
            final f0.a aVar = (f0.a) com.google.android.exoplayer2.util.a.g(this.f48591b);
            for (C0386a c0386a : this.f48592c) {
                final n0 n0Var = c0386a.f48595b;
                com.google.android.exoplayer2.util.u0.e1(c0386a.f48594a, new Runnable() { // from class: com.google.android.exoplayer2.source.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48544b.p(n0Var, aVar, yVar);
                    }
                });
            }
        }

        @androidx.annotation.j
        public a F(int i10, @androidx.annotation.p0 f0.a aVar, long j10) {
            return new a(this.f48592c, i10, aVar, j10);
        }

        public void g(Handler handler, n0 n0Var) {
            com.google.android.exoplayer2.util.a.g(handler);
            com.google.android.exoplayer2.util.a.g(n0Var);
            this.f48592c.add(new C0386a(handler, n0Var));
        }

        public void i(int i10, @androidx.annotation.p0 a2 a2Var, int i11, @androidx.annotation.p0 Object obj, long j10) {
            j(new y(1, i10, a2Var, i11, obj, h(j10), com.google.android.exoplayer2.j.f46377b));
        }

        public void j(final y yVar) {
            for (C0386a c0386a : this.f48592c) {
                final n0 n0Var = c0386a.f48595b;
                com.google.android.exoplayer2.util.u0.e1(c0386a.f48594a, new Runnable() { // from class: com.google.android.exoplayer2.source.i0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48457b.k(n0Var, yVar);
                    }
                });
            }
        }

        public void q(u uVar, int i10) {
            r(uVar, i10, -1, null, 0, null, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b);
        }

        public void r(u uVar, int i10, int i11, @androidx.annotation.p0 a2 a2Var, int i12, @androidx.annotation.p0 Object obj, long j10, long j11) {
            s(uVar, new y(i10, i11, a2Var, i12, obj, h(j10), h(j11)));
        }

        public void s(final u uVar, final y yVar) {
            for (C0386a c0386a : this.f48592c) {
                final n0 n0Var = c0386a.f48595b;
                com.google.android.exoplayer2.util.u0.e1(c0386a.f48594a, new Runnable() { // from class: com.google.android.exoplayer2.source.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48535b.l(n0Var, uVar, yVar);
                    }
                });
            }
        }

        public void t(u uVar, int i10) {
            u(uVar, i10, -1, null, 0, null, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b);
        }

        public void u(u uVar, int i10, int i11, @androidx.annotation.p0 a2 a2Var, int i12, @androidx.annotation.p0 Object obj, long j10, long j11) {
            v(uVar, new y(i10, i11, a2Var, i12, obj, h(j10), h(j11)));
        }

        public void v(final u uVar, final y yVar) {
            for (C0386a c0386a : this.f48592c) {
                final n0 n0Var = c0386a.f48595b;
                com.google.android.exoplayer2.util.u0.e1(c0386a.f48594a, new Runnable() { // from class: com.google.android.exoplayer2.source.k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48507b.m(n0Var, uVar, yVar);
                    }
                });
            }
        }

        public void w(u uVar, int i10, int i11, @androidx.annotation.p0 a2 a2Var, int i12, @androidx.annotation.p0 Object obj, long j10, long j11, IOException iOException, boolean z10) {
            y(uVar, new y(i10, i11, a2Var, i12, obj, h(j10), h(j11)), iOException, z10);
        }

        public void x(u uVar, int i10, IOException iOException, boolean z10) {
            w(uVar, i10, -1, null, 0, null, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b, iOException, z10);
        }

        public void y(final u uVar, final y yVar, final IOException iOException, final boolean z10) {
            for (C0386a c0386a : this.f48592c) {
                final n0 n0Var = c0386a.f48595b;
                com.google.android.exoplayer2.util.u0.e1(c0386a.f48594a, new Runnable() { // from class: com.google.android.exoplayer2.source.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f48486b.n(n0Var, uVar, yVar, iOException, z10);
                    }
                });
            }
        }

        public void z(u uVar, int i10) {
            A(uVar, i10, -1, null, 0, null, com.google.android.exoplayer2.j.f46377b, com.google.android.exoplayer2.j.f46377b);
        }
    }

    void A(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar);

    void G(int i10, f0.a aVar, y yVar);

    void O(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar, IOException iOException, boolean z10);

    void T(int i10, @androidx.annotation.p0 f0.a aVar, y yVar);

    void U(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar);

    void q0(int i10, @androidx.annotation.p0 f0.a aVar, u uVar, y yVar);
}
