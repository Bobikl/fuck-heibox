package com.tencent.qimei.r;

/* JADX INFO: compiled from: QimeiQueryTask.java */
/* JADX INFO: loaded from: classes4.dex */
public class f implements j.a.InterfaceC0981a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f101392a;

    public f(j jVar) {
        this.f101392a = jVar;
    }

    @Override // com.tencent.qimei.r.j.a.InterfaceC0981a
    public void a() {
        if (com.tencent.qimei.v.d.a(this.f101392a.f101405i).s().isEmpty()) {
            return;
        }
        this.f101392a.f101404h = true;
        com.tencent.qimei.c.a.a().a(10000L, this.f101392a);
    }
}
