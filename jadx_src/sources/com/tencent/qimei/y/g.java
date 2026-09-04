package com.tencent.qimei.y;

import android.content.Context;

/* JADX INFO: compiled from: SysBrowser.java */
/* JADX INFO: loaded from: classes4.dex */
public class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f101538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f101539b;

    public g(i iVar, Context context) {
        this.f101539b = iVar;
        this.f101538a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101539b.a(this.f101538a);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
