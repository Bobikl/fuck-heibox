package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class ai extends ah.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ah f106813a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f170a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f171a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ai(ah ahVar, ah.a aVar, boolean z10, String str) {
        super(aVar);
        this.f106813a = ahVar;
        this.f171a = z10;
        this.f170a = str;
    }

    @Override // com.xiaomi.push.ah.b
    void a() {
        super.a();
    }

    @Override // com.xiaomi.push.ah.b
    void b() {
        if (this.f171a) {
            return;
        }
        this.f106813a.f166a.edit().putLong(this.f170a, System.currentTimeMillis()).commit();
    }
}
