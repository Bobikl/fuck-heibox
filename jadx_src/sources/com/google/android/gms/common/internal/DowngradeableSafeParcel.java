package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f52446c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f52447b = false;

    @v8.a
    protected static boolean b(@androidx.annotation.n0 String str) {
        synchronized (f52446c) {
        }
        return true;
    }

    @v8.a
    @androidx.annotation.p0
    protected static Integer c() {
        synchronized (f52446c) {
        }
        return null;
    }

    @v8.a
    protected abstract boolean d(int i10);

    @v8.a
    public void f(boolean z10) {
        this.f52447b = z10;
    }

    @v8.a
    protected boolean h() {
        return this.f52447b;
    }
}
