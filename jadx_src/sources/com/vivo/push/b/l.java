package com.vivo.push.b;

/* JADX INFO: compiled from: OnDispatcherReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106481b;

    public l() {
        super(2016);
        this.f106480a = -1;
        this.f106481b = -1;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("key_dispatch_environment", this.f106480a);
        aVar.a("key_dispatch_area", this.f106481b);
    }

    public final int d() {
        return this.f106480a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106480a = aVar.b("key_dispatch_environment", 1);
        this.f106481b = aVar.b("key_dispatch_area", 1);
    }

    public final int e() {
        return this.f106481b;
    }
}
