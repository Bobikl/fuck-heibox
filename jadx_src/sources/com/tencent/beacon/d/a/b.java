package com.tencent.beacon.d.a;

import android.app.Activity;

/* JADX INFO: compiled from: LifecycleCallbacks.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Activity f98959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f98960b;

    b(c cVar, Activity activity) {
        this.f98960b = cVar;
        this.f98959a = activity;
    }

    @Override // java.lang.Runnable
    public void run() {
        new com.tencent.beacon.d.c(this.f98959a.getApplicationContext()).a();
    }
}
