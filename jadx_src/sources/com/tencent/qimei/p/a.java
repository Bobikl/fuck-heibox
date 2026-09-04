package com.tencent.qimei.p;

/* JADX INFO: compiled from: QimeiSec.java */
/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f101300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f101301b;

    public a(b bVar, String str) {
        this.f101301b = bVar;
        this.f101300a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f101301b.b(this.f101300a);
    }
}
