package com.vivo.push.b;

/* JADX INFO: compiled from: OnVerifyReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public abstract class v extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f106501b;

    public v(int i10) {
        super(i10);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f106500a);
        aVar.a("notify_id", this.f106501b);
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    protected void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106500a = aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.f106501b = aVar.b("notify_id", -1L);
    }

    public final long f() {
        return this.f106501b;
    }

    public final String i() {
        return this.f106500a;
    }
}
