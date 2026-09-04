package com.tencent.qimei.y;

import android.content.Context;

/* JADX INFO: compiled from: X5Browser.java */
/* JADX INFO: loaded from: classes4.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f101544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f101545b;

    public k(m mVar, Context context) {
        this.f101545b = mVar;
        this.f101544a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f101545b.a(this.f101544a);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
