package com.tencent.qimei.r;

/* JADX INFO: compiled from: QimeiSDKInfo.java */
/* JADX INFO: loaded from: classes4.dex */
public class l implements com.tencent.qimei.d.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f101412a;

    public l(n nVar) {
        this.f101412a = nVar;
    }

    @Override // com.tencent.qimei.d.e
    public void a(int i10) {
        com.tencent.qimei.n.a.b("SDK_INIT", "OAID 初始化完成(appKey: %s)，结果:%s", this.f101412a.f101417d, Integer.valueOf(i10));
        this.f101412a.getToken();
        this.f101412a.g();
        this.f101412a.h();
    }
}
