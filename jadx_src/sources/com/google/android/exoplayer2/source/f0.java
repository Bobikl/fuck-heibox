package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.i2;
import com.google.android.exoplayer2.z3;
import java.io.IOException;

/* JADX INFO: compiled from: MediaSource.java */
/* JADX INFO: loaded from: classes7.dex */
public interface f0 {

    /* JADX INFO: compiled from: MediaSource.java */
    public static final class a extends d0 {
        public a(d0 d0Var) {
            super(d0Var);
        }

        public a(Object obj) {
            super(obj);
        }

        public a(Object obj, int i10, int i11, long j10) {
            super(obj, i10, i11, j10);
        }

        public a(Object obj, long j10) {
            super(obj, j10);
        }

        public a(Object obj, long j10, int i10) {
            super(obj, j10, i10);
        }

        @Override // com.google.android.exoplayer2.source.d0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            return new a(super.a(obj));
        }

        @Override // com.google.android.exoplayer2.source.d0
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(long j10) {
            return new a(super.b(j10));
        }
    }

    /* JADX INFO: compiled from: MediaSource.java */
    public interface b {
        void e(f0 f0Var, z3 z3Var);
    }

    void a(b bVar);

    void b(n0 n0Var);

    i2 c();

    void d(b bVar, @androidx.annotation.p0 com.google.android.exoplayer2.upstream.u0 u0Var);

    void f() throws IOException;

    @androidx.annotation.p0
    z3 g();

    c0 h(a aVar, com.google.android.exoplayer2.upstream.b bVar, long j10);

    void j(Handler handler, n0 n0Var);

    void k(c0 c0Var);

    void l(b bVar);

    void m(b bVar);

    void o(Handler handler, com.google.android.exoplayer2.drm.s sVar);

    void r(com.google.android.exoplayer2.drm.s sVar);

    boolean t();
}
