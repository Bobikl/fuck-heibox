package com.xiaomi.push.service;

/* JADX INFO: loaded from: classes4.dex */
public class am extends com.xiaomi.push.ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f107877a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ aw f1011a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1012a;

    am(String str, aw awVar, int i10) {
        this.f1012a = str;
        this.f1011a = awVar;
        this.f107877a = i10;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return this.f1012a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1011a.a(this.f107877a);
    }
}
