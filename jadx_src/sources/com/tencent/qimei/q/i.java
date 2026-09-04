package com.tencent.qimei.q;

/* JADX INFO: compiled from: Reporter.java */
/* JADX INFO: loaded from: classes4.dex */
public class i implements com.tencent.qimei.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f101342a;

    public i(j jVar) {
        this.f101342a = jVar;
    }

    @Override // com.tencent.qimei.e.c
    public void a(String str) {
    }

    @Override // com.tencent.qimei.e.c
    public void a(String str, int i10, String str2) {
        com.tencent.qimei.n.a.b("上报", "Report failed. error: %s,%d,%s", str, Integer.valueOf(i10), str2);
    }
}
