package com.tencent.qimei.v;

import android.content.Context;

/* JADX INFO: compiled from: Strategy.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f101446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f101447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f101448c;

    public c(String str, Context context, k kVar) {
        this.f101446a = str;
        this.f101447b = context;
        this.f101448c = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f.a(this.f101446a).a(this.f101447b, this.f101448c);
    }
}
