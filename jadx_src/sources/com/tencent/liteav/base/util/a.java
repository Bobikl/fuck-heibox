package com.tencent.liteav.base.util;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class a<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0959a<T> f99694b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ThreadLocal<T> f99693a = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<T> f99695c = new WeakReference<>(null);

    /* JADX INFO: renamed from: com.tencent.liteav.base.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC0959a<T> {
        T a();
    }

    public a(InterfaceC0959a<T> interfaceC0959a) {
        this.f99694b = interfaceC0959a;
    }

    private T b() {
        T tA = this.f99695c.get();
        if (tA == null) {
            synchronized (this) {
                tA = this.f99695c.get();
                if (tA == null) {
                    tA = this.f99694b.a();
                    this.f99695c = new WeakReference<>(tA);
                }
            }
        }
        return tA;
    }

    public final T a() {
        T t10 = this.f99693a.get();
        if (t10 != null) {
            return t10;
        }
        T tB = b();
        this.f99693a.set(tB);
        return tB;
    }
}
