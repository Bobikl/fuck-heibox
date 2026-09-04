package com.igexin.push.core.d;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f63700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f63701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ a f63702c;

    b(a aVar, Context context, e eVar) {
        this.f63702c = aVar;
        this.f63700a = context;
        this.f63701b = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f63702c.a(this.f63700a);
        this.f63701b.a(a.f63697e, a.f63699g = this.f63702c.d());
    }
}
