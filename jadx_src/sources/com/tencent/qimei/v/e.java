package com.tencent.qimei.v;

/* JADX INFO: compiled from: StrategyController.java */
/* JADX INFO: loaded from: classes4.dex */
public class e implements com.tencent.qimei.h.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f101450a;

    public e(f fVar) {
        this.f101450a = fVar;
    }

    @Override // com.tencent.qimei.h.b
    public void a() {
        synchronized (this.f101450a) {
            if (!this.f101450a.a() && !this.f101450a.f101454d.b()) {
                this.f101450a.d();
            }
        }
    }

    @Override // com.tencent.qimei.h.b
    public void b() {
    }
}
