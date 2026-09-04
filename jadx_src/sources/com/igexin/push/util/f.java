package com.igexin.push.util;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends com.igexin.push.f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f64044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f64045b;

    f(Context context, long j10) {
        this.f64044a = context;
        this.f64045b = j10;
    }

    @Override // com.igexin.push.f.b
    protected void a() {
        d.b(this.f64044a, String.valueOf(this.f64045b));
    }
}
