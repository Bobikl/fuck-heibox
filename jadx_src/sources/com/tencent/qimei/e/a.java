package com.tencent.qimei.e;

/* JADX INFO: compiled from: HttpClientUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f101243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f101244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f101245c;

    public a(String str, String str2, c cVar) {
        this.f101243a = str;
        this.f101244b = str2;
        this.f101245c = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        b.c(this.f101243a, this.f101244b, this.f101245c);
    }
}
