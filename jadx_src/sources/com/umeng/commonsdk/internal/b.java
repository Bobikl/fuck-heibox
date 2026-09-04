package com.umeng.commonsdk.internal;

import android.content.Context;

/* JADX INFO: compiled from: UMInternalData.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static b f105217b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f105218a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f105219c;

    private b(Context context) {
        this.f105218a = context;
        this.f105219c = new c(context);
    }

    public static synchronized b a(Context context) {
        if (f105217b == null) {
            f105217b = new b(context.getApplicationContext());
        }
        return f105217b;
    }

    public c a() {
        return this.f105219c;
    }
}
