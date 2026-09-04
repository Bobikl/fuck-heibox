package com.bumptech.glide.load.engine.bitmap_recycle;

/* JADX INFO: compiled from: ArrayPool.java */
/* JADX INFO: loaded from: classes6.dex */
public interface b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f40971a = 65536;

    void a(int i10);

    void b();

    <T> T c(int i10, Class<T> cls);

    <T> T d(int i10, Class<T> cls);

    @Deprecated
    <T> void e(T t10, Class<T> cls);

    <T> void put(T t10);
}
