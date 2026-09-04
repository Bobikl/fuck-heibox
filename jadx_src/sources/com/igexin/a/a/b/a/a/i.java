package com.igexin.a.a.b.a.a;

/* JADX INFO: loaded from: classes7.dex */
public class i implements com.igexin.a.a.b.a.a.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f63162a;

    i(f fVar) {
        this.f63162a = fVar;
    }

    @Override // com.igexin.a.a.b.a.a.a.c
    public void a(m mVar) {
        if (com.igexin.push.util.n.b()) {
            return;
        }
        this.f63162a.b(mVar);
    }

    @Override // com.igexin.a.a.b.a.a.a.a
    public void a(com.igexin.a.a.b.d dVar) {
        this.f63162a.f63157m.sendEmptyMessage(q.INTERRUPT_SUCCESS.ordinal());
    }

    @Override // com.igexin.a.a.b.a.a.a.c
    public void a(Exception exc) {
        com.igexin.a.a.c.b.a("GS-M|w ex = " + exc.toString(), new Object[0]);
        this.f63162a.i();
    }
}
