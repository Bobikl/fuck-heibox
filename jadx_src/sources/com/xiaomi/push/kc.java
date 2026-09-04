package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final kj f107781a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ks f915a;

    public kc() {
        this(new kf.a());
    }

    public kc(kl klVar) {
        ks ksVar = new ks();
        this.f915a = ksVar;
        this.f107781a = klVar.a(ksVar);
    }

    public void a(jy jyVar, byte[] bArr) {
        try {
            this.f915a.a(bArr);
            jyVar.a(this.f107781a);
        } finally {
            this.f107781a.k();
        }
    }
}
