package com.vivo.push.b;

/* JADX INFO: compiled from: OnChangePushStatusReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106479b;

    public j() {
        super(12);
        this.f106478a = -1;
        this.f106479b = -1;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f106478a);
        aVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f106479b);
    }

    public final int d() {
        return this.f106478a;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106478a = aVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f106478a);
        this.f106479b = aVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f106479b);
    }

    public final int e() {
        return this.f106479b;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnChangePushStatusCommand";
    }
}
