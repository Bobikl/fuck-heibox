package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes4.dex */
public class gh implements com.xiaomi.push.service.bf.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107211a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hb f469a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private XMPushService f470a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.bf.b f471a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private boolean f473a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.xiaomi.push.service.bf.c f472a = com.xiaomi.push.service.bf.c.binding;

    gh(XMPushService xMPushService, com.xiaomi.push.service.bf.b bVar) {
        this.f470a = xMPushService;
        this.f471a = bVar;
    }

    private void b() {
        this.f471a.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        b();
        if (this.f473a && this.f107211a != 11) {
            gf gfVarM409a = gm.m407a().m409a();
            int i10 = gj.f107213a[this.f472a.ordinal()];
            if (i10 == 1) {
                int i11 = this.f107211a;
                if (i11 == 17) {
                    gfVarM409a.f455a = ge.BIND_TCP_READ_TIMEOUT.a();
                } else if (i11 == 21) {
                    gfVarM409a.f455a = ge.BIND_TIMEOUT.a();
                } else {
                    try {
                        gk.a aVarC = gk.c(gm.a().a());
                        gfVarM409a.f455a = aVarC.f107214a.a();
                        gfVarM409a.c(aVarC.f474a);
                    } catch (NullPointerException unused) {
                        gfVarM409a = null;
                    }
                }
            } else if (i10 == 3) {
                gfVarM409a.f455a = ge.BIND_SUCCESS.a();
            }
            if (gfVarM409a != null) {
                gfVarM409a.b(this.f469a.mo439a());
                gfVarM409a.d(this.f471a.f1046b);
                gfVarM409a.f458b = 1;
                try {
                    gfVarM409a.a((byte) Integer.parseInt(this.f471a.f107917g));
                } catch (NumberFormatException unused2) {
                }
                gm.m407a().a(gfVarM409a);
            }
        }
    }

    void a() {
        this.f471a.a(this);
        this.f469a = this.f470a.m679a();
    }

    @Override // com.xiaomi.push.service.bf.b.a
    public void a(com.xiaomi.push.service.bf.c cVar, com.xiaomi.push.service.bf.c cVar2, int i10) {
        if (!this.f473a && cVar == com.xiaomi.push.service.bf.c.binding) {
            this.f472a = cVar2;
            this.f107211a = i10;
            this.f473a = true;
        }
        this.f470a.a(new gi(this, 4));
    }
}
