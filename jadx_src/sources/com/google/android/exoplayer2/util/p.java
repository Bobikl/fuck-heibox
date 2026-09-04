package com.google.android.exoplayer2.util;

import android.os.Looper;

/* JADX INFO: compiled from: HandlerWrapper.java */
/* JADX INFO: loaded from: classes7.dex */
public interface p {

    /* JADX INFO: compiled from: HandlerWrapper.java */
    public interface a {
        void a();

        p getTarget();
    }

    boolean a(int i10, int i11);

    boolean b(Runnable runnable);

    a c(int i10);

    boolean d(int i10);

    a e(int i10, @androidx.annotation.p0 Object obj);

    void f(@androidx.annotation.p0 Object obj);

    a g(int i10, int i11, int i12);

    boolean h(a aVar);

    a i(int i10, int i11, int i12, @androidx.annotation.p0 Object obj);

    Looper j();

    boolean k(Runnable runnable);

    boolean l(int i10);

    boolean m(int i10, long j10);

    void n(int i10);

    boolean postDelayed(Runnable runnable, long j10);
}
