package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class aj extends ah.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f106814a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aj(ah ahVar, ah.a aVar) {
        super(aVar);
        this.f106814a = ahVar;
    }

    @Override // com.xiaomi.push.ah.b
    void b() {
        synchronized (this.f106814a.f167a) {
            this.f106814a.f168a.remove(super.f106812a.mo195a());
        }
    }
}
