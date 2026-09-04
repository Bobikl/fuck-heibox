package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class eh extends ak.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ak.b f107033a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ ef f328a;

    eh(ef efVar) {
        this.f328a = efVar;
    }

    @Override // com.xiaomi.push.ak.b
    public void b() {
        ef.b bVar = (ef.b) this.f328a.f316a.peek();
        if (bVar == null || !bVar.a()) {
            return;
        }
        if (this.f328a.f316a.remove(bVar)) {
            this.f107033a = bVar;
        }
        ak.b bVar2 = this.f107033a;
        if (bVar2 != null) {
            bVar2.b();
        }
    }

    @Override // com.xiaomi.push.ak.b
    /* JADX INFO: renamed from: c */
    public void mo279c() {
        ak.b bVar = this.f107033a;
        if (bVar != null) {
            bVar.mo279c();
        }
    }
}
