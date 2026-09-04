package com.vivo.push.b;

/* JADX INFO: compiled from: PushModeCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends com.vivo.push.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106502a;

    public w() {
        super(2011);
        this.f106502a = 0;
    }

    @Override // com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        aVar.a("com.bbk.push.ikey.MODE_TYPE", this.f106502a);
    }

    @Override // com.vivo.push.o
    public final boolean c() {
        return true;
    }

    public final int d() {
        return this.f106502a;
    }

    @Override // com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        this.f106502a = aVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }

    @Override // com.vivo.push.o
    public final String toString() {
        return "PushModeCommand";
    }
}
