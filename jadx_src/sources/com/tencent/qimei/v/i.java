package com.tencent.qimei.v;

/* JADX INFO: compiled from: StrategyQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class i implements com.tencent.qimei.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f101459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f101460b;

    public i(j jVar, String str) {
        this.f101460b = jVar;
        this.f101459a = str;
    }

    @Override // com.tencent.qimei.e.c
    public void a(String str) {
        this.f101460b.b(str, this.f101459a);
    }

    @Override // com.tencent.qimei.e.c
    public void a(String str, int i10, String str2) {
        this.f101460b.a(str, i10, str2);
    }
}
