package com.igexin.push.core.a;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class t extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63499a = com.igexin.push.config.k.f63422a + "_RegisterResultAction";

    @Override // com.igexin.push.core.a.a
    public boolean a(com.igexin.a.a.d.e eVar) {
        return false;
    }

    @Override // com.igexin.push.core.a.a
    public boolean a(Object obj) {
        if (obj instanceof com.igexin.push.d.c.o) {
            com.igexin.push.d.c.o oVar = (com.igexin.push.d.c.o) obj;
            com.igexin.push.core.d.D = 0L;
            com.igexin.a.a.c.b.a("register resp |" + oVar.f63883a + "|" + com.igexin.push.core.d.f63684r, new Object[0]);
            com.igexin.a.a.c.b.a("register resp cid = " + oVar.f63885c + " device id = " + oVar.f63886d, new Object[0]);
            if (oVar.f63883a != com.igexin.push.core.d.f63684r) {
                com.igexin.push.core.d.f63679m = false;
                StringBuilder sb2 = new StringBuilder();
                String str = f63499a;
                sb2.append(str);
                sb2.append(" change session : from [");
                sb2.append(com.igexin.push.core.d.f63684r);
                sb2.append("] to [");
                sb2.append(oVar.f63883a);
                sb2.append("]");
                com.igexin.a.a.c.b.a(sb2.toString(), new Object[0]);
                com.igexin.a.a.c.b.a(str + " change cid : from [" + com.igexin.push.core.d.f63685s + "] to [" + oVar.f63885c + "]", new Object[0]);
                if (TextUtils.isEmpty(oVar.f63885c) || TextUtils.isEmpty(oVar.f63886d)) {
                    com.igexin.push.core.b.i.a().a(oVar.f63883a);
                } else {
                    com.igexin.push.core.b.i.a().a(oVar.f63885c, oVar.f63886d, oVar.f63883a);
                }
                com.igexin.push.core.d.G = 0L;
            }
            com.igexin.a.a.c.b.a("loginReqAfterRegister|new session:" + com.igexin.push.core.d.f63684r + ", cid :" + com.igexin.push.core.d.f63685s + ", devId :" + com.igexin.push.core.d.f63691y, new Object[0]);
            com.igexin.push.d.c.i iVarD = com.igexin.push.core.m.a().d();
            com.igexin.push.e.a aVarI = com.igexin.push.core.c.a().i();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("S-");
            sb3.append(iVarD.f63857a);
            aVarI.a(sb3.toString(), iVarD, true);
        }
        return true;
    }
}
