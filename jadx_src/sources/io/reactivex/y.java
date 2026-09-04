package io.reactivex;

import io.reactivex.internal.util.NotificationLite;

/* JADX INFO: compiled from: Notification.java */
/* JADX INFO: loaded from: classes4.dex */
public final class y<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final y<Object> f124183b = new y<>(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f124184a;

    private y(Object obj) {
        this.f124184a = obj;
    }

    @jh.e
    public static <T> y<T> a() {
        return (y<T>) f124183b;
    }

    @jh.e
    public static <T> y<T> b(@jh.e Throwable th2) {
        io.reactivex.internal.functions.a.g(th2, "error is null");
        return new y<>(NotificationLite.error(th2));
    }

    @jh.e
    public static <T> y<T> c(@jh.e T t10) {
        io.reactivex.internal.functions.a.g(t10, "value is null");
        return new y<>(t10);
    }

    @jh.f
    public Throwable d() {
        Object obj = this.f124184a;
        if (NotificationLite.isError(obj)) {
            return NotificationLite.getError(obj);
        }
        return null;
    }

    @jh.f
    public T e() {
        Object obj = this.f124184a;
        if (obj == null || NotificationLite.isError(obj)) {
            return null;
        }
        return (T) this.f124184a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof y) {
            return io.reactivex.internal.functions.a.c(this.f124184a, ((y) obj).f124184a);
        }
        return false;
    }

    public boolean f() {
        return this.f124184a == null;
    }

    public boolean g() {
        return NotificationLite.isError(this.f124184a);
    }

    public boolean h() {
        Object obj = this.f124184a;
        return (obj == null || NotificationLite.isError(obj)) ? false : true;
    }

    public int hashCode() {
        Object obj = this.f124184a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public String toString() {
        Object obj = this.f124184a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            return "OnErrorNotification[" + NotificationLite.getError(obj) + "]";
        }
        return "OnNextNotification[" + this.f124184a + "]";
    }
}
