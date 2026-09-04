package com.igexin.a.a.b.a.a;

/* JADX INFO: loaded from: classes7.dex */
public class h implements com.igexin.a.a.b.a.a.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f63161a;

    h(f fVar) {
        this.f63161a = fVar;
    }

    @Override // com.igexin.a.a.b.a.a.a.a
    public void a(com.igexin.a.a.b.d dVar) {
        this.f63161a.f63157m.sendEmptyMessage(q.INTERRUPT_SUCCESS.ordinal());
    }

    @Override // com.igexin.a.a.b.a.a.a.b
    public void a(Exception exc) {
        com.igexin.a.a.c.b.a("GS-M|r ex = " + exc.toString(), new Object[0]);
        if (exc.getMessage() != null && exc.getMessage().equals("end of stream")) {
            com.igexin.push.d.b.a().d();
        }
        this.f63161a.i();
    }
}
