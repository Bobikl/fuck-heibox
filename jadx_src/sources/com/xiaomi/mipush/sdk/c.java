package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.ey;
import com.xiaomi.push.fd;
import com.xiaomi.push.fh;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jm;
import com.xiaomi.push.service.bc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class c implements fh {
    @Override // com.xiaomi.push.fh
    public void a(Context context, HashMap<String, String> map) {
        jm jmVar = new jm();
        jmVar.b(fd.a(context).m373a());
        jmVar.d(fd.a(context).b());
        jmVar.c(ix.AwakeAppResponse.f623a);
        jmVar.a(bc.a());
        jmVar.f763a = map;
        ao.a(context).a(jmVar, in.Notification, true, (ja) null, true);
        com.xiaomi.channel.commonutils.logger.b.m62a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.fh
    public void b(Context context, HashMap<String, String> map) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1L, ey.a(map));
        com.xiaomi.channel.commonutils.logger.b.m62a("MoleInfo：\u3000send data in app layer");
    }

    @Override // com.xiaomi.push.fh
    public void c(Context context, HashMap<String, String> map) {
        com.xiaomi.channel.commonutils.logger.b.m62a("MoleInfo：\u3000" + ey.b(map));
        String str = map.get("event_type");
        String str2 = map.get("awake_info");
        if (String.valueOf(1007).equals(str)) {
            o.a(context, str2);
        }
    }
}
