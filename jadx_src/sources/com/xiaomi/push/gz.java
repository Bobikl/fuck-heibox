package com.xiaomi.push;

import com.xiaomi.mipush.sdk.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class gz implements hn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f107239a = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private hb f513a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private SimpleDateFormat f516a = new SimpleDateFormat("hh:mm:ss aaa");

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f512a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f107240b = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private he f514a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final String f515a = "[Slim] ";

    public class a implements hg, ho {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        String f517a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private boolean f518a;

        a(boolean z10) {
            this.f518a = z10;
            this.f517a = z10 ? " RCV " : " Sent ";
        }

        @Override // com.xiaomi.push.hg
        public void a(gq gqVar) {
            if (gz.f107239a) {
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + gz.this.f516a.format(new Date()) + this.f517a + gqVar.toString());
            } else {
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + gz.this.f516a.format(new Date()) + this.f517a + " Blob [" + gqVar.m415a() + Constants.ACCEPT_TIME_SEPARATOR_SP + gqVar.a() + Constants.ACCEPT_TIME_SEPARATOR_SP + com.xiaomi.push.service.bc.a(gqVar.e()) + "]");
            }
            if (gqVar == null || gqVar.a() != 99999) {
                return;
            }
            String strM415a = gqVar.m415a();
            gq gqVar2 = null;
            if (!this.f518a) {
                if ("BIND".equals(strM415a)) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("build binded result for loopback.");
                    ex.d dVar = new ex.d();
                    dVar.a(true);
                    dVar.c("login success.");
                    dVar.b("success");
                    dVar.a("success");
                    gq gqVar3 = new gq();
                    gqVar3.a(dVar.m274a(), (String) null);
                    gqVar3.a((short) 2);
                    gqVar3.a(99999);
                    gqVar3.a("BIND", (String) null);
                    gqVar3.a(gqVar.e());
                    gqVar3.b((String) null);
                    gqVar3.c(gqVar.g());
                    gqVar2 = gqVar3;
                } else if (!"UBND".equals(strM415a) && "SECMSG".equals(strM415a)) {
                    gq gqVar4 = new gq();
                    gqVar4.a(99999);
                    gqVar4.a("SECMSG", (String) null);
                    gqVar4.c(gqVar.g());
                    gqVar4.a(gqVar.e());
                    gqVar4.a(gqVar.m417a());
                    gqVar4.b(gqVar.f());
                    gqVar4.a(gqVar.m420a(com.xiaomi.push.service.bf.a().a(String.valueOf(99999), gqVar.g()).f107918h), (String) null);
                    gqVar2 = gqVar4;
                }
            }
            if (gqVar2 != null) {
                for (Map.Entry<hg, hb.a> entry : gz.this.f513a.m440a().entrySet()) {
                    if (gz.this.f512a != entry.getKey()) {
                        entry.getValue().a(gqVar2);
                    }
                }
            }
        }

        @Override // com.xiaomi.push.hg
        public void a(hs hsVar) {
            if (gz.f107239a) {
                com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + gz.this.f516a.format(new Date()) + this.f517a + " PKT " + hsVar.mo456a());
                return;
            }
            com.xiaomi.channel.commonutils.logger.b.c("[Slim] " + gz.this.f516a.format(new Date()) + this.f517a + " PKT [" + hsVar.k() + Constants.ACCEPT_TIME_SEPARATOR_SP + hsVar.j() + "]");
        }

        @Override // com.xiaomi.push.ho
        /* JADX INFO: renamed from: a */
        public boolean mo252a(hs hsVar) {
            return true;
        }
    }

    public gz(hb hbVar) {
        this.f513a = hbVar;
        a();
    }

    private void a() {
        this.f512a = new a(true);
        this.f107240b = new a(false);
        hb hbVar = this.f513a;
        a aVar = this.f512a;
        hbVar.a(aVar, aVar);
        hb hbVar2 = this.f513a;
        a aVar2 = this.f107240b;
        hbVar2.b(aVar2, aVar2);
        this.f514a = new ha(this);
    }
}
