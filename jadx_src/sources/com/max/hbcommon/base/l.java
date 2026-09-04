package com.max.hbcommon.base;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: compiled from: Event.kt */
/* JADX INFO: loaded from: classes9.dex */
public class l<T> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f66919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f66920b;

    public l(T t10) {
        this.f66919a = t10;
    }

    public static /* synthetic */ void c() {
    }

    @dl.e
    public final T a() {
        if (this.f66920b) {
            return null;
        }
        this.f66920b = true;
        return this.f66919a;
    }

    public final boolean b() {
        return this.f66920b;
    }

    public final T d() {
        return this.f66919a;
    }
}
