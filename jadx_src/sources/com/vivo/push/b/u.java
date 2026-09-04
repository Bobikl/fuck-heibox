package com.vivo.push.b;

/* JADX INFO: compiled from: OnUndoMsgReceiveCommand.java */
/* JADX INFO: loaded from: classes4.dex */
public final class u extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f106498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f106499b;

    public u() {
        super(20);
        this.f106498a = -1L;
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    protected final void c(com.vivo.push.a aVar) {
        super.c(aVar);
        aVar.a("undo_msg_v1", this.f106498a);
        aVar.a("undo_msg_type_v1", this.f106499b);
    }

    public final long d() {
        return this.f106498a;
    }

    @Override // com.vivo.push.b.v, com.vivo.push.b.s, com.vivo.push.o
    protected final void d(com.vivo.push.a aVar) {
        super.d(aVar);
        this.f106498a = aVar.b("undo_msg_v1", this.f106498a);
        this.f106499b = aVar.b("undo_msg_type_v1", 0);
    }

    public final String e() {
        long j10 = this.f106498a;
        if (j10 != -1) {
            return String.valueOf(j10);
        }
        return null;
    }

    @Override // com.vivo.push.b.s, com.vivo.push.o
    public final String toString() {
        return "OnUndoMsgCommand";
    }
}
