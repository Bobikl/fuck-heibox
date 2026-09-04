package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.ey;
import com.xiaomi.push.fd;
import com.xiaomi.push.fh;
import com.xiaomi.push.il;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class bl implements fh {
    @Override // com.xiaomi.push.fh
    public void a(Context context, HashMap<String, String> map) {
        jm jmVar = new jm();
        jmVar.b(fd.a(context).m373a());
        jmVar.d(fd.a(context).b());
        jmVar.c(ix.AwakeAppResponse.f623a);
        jmVar.a(bc.a());
        jmVar.f763a = map;
        byte[] bArrA = jx.a(ai.a(jmVar.c(), jmVar.b(), jmVar, in.Notification));
        if (!(context instanceof XMPushService)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("MoleInfo : context is not correct in pushLayer " + jmVar.m579a());
            return;
        }
        com.xiaomi.channel.commonutils.logger.b.m62a("MoleInfo : send data directly in pushLayer " + jmVar.m579a());
        ((XMPushService) context).a(context.getPackageName(), bArrA, true);
    }

    @Override // com.xiaomi.push.fh
    public void b(Context context, HashMap<String, String> map) {
        il ilVarA = il.a(context);
        if (ilVarA != null) {
            ilVarA.a("category_awake_app", "wake_up_app", 1L, ey.a(map));
        }
    }

    @Override // com.xiaomi.push.fh
    public void c(Context context, HashMap<String, String> map) {
        com.xiaomi.channel.commonutils.logger.b.m62a("MoleInfo：\u3000" + ey.b(map));
    }
}
