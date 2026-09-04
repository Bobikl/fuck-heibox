package com.vivo.push.b;

/* JADX INFO: compiled from: OnReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public class s extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106495b;

    public s(int i10) {
        super(i10);
        this.f106494a = null;
        this.f106495b = 0;
    }

    @Override // com.vivo.push.o
    protected void c(com.vivo.push.a aVar) {
        aVar.a("req_id", this.f106494a);
        aVar.a("status_msg_code", this.f106495b);
    }

    @Override // com.vivo.push.o
    protected void d(com.vivo.push.a aVar) {
        this.f106494a = aVar.a("req_id");
        this.f106495b = aVar.b("status_msg_code", this.f106495b);
    }

    public final String g() {
        return this.f106494a;
    }

    public final int h() {
        return this.f106495b;
    }

    @Override // com.vivo.push.o
    public String toString() {
        return "OnReceiveCommand";
    }
}
