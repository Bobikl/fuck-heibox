package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.n0;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.internal.p;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f52382a;

    public c(@n0 Activity activity) {
        p.m(activity, "Activity must not be null");
        this.f52382a = activity;
    }

    @v8.a
    public c(@n0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @n0
    public final Activity a() {
        return (Activity) this.f52382a;
    }

    @n0
    public final FragmentActivity b() {
        return (FragmentActivity) this.f52382a;
    }

    public final boolean c() {
        return this.f52382a instanceof Activity;
    }

    public final boolean d() {
        return this.f52382a instanceof FragmentActivity;
    }
}
