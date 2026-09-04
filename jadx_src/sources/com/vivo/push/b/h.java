package com.vivo.push.b;

/* JADX INFO: compiled from: MsgArriveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f106474a;

    public h() {
        super(2013);
    }

    public h(String str) {
        this();
        this.f106474a = str;
    }

    @Override // com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        aVar.a("MsgArriveCommand.MSG_TAG", this.f106474a);
    }

    @Override // com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        this.f106474a = aVar.a("MsgArriveCommand.MSG_TAG");
    }
}
