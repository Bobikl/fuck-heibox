package com.tencent.qimei.c;

import androidx.annotation.n0;

/* JADX INFO: compiled from: AbstractAsyncTask.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile a f101209a;

    public static synchronized a a() {
        if (f101209a == null) {
            f101209a = new c();
        }
        return f101209a;
    }

    public abstract void a(long j10, @n0 Runnable runnable);

    public abstract void a(@n0 Runnable runnable);
}
