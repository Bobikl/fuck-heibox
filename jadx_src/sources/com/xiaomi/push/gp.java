package com.xiaomi.push;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class gp {
    public static void a(com.xiaomi.push.service.bf.b bVar, String str, hb hbVar) {
        String strA;
        ex.c cVar = new ex.c();
        if (!TextUtils.isEmpty(bVar.f107913c)) {
            cVar.a(bVar.f107913c);
        }
        if (!TextUtils.isEmpty(bVar.f107915e)) {
            cVar.d(bVar.f107915e);
        }
        if (!TextUtils.isEmpty(bVar.f107916f)) {
            cVar.e(bVar.f107916f);
        }
        cVar.b(bVar.f1045a ? "1" : "0");
        if (TextUtils.isEmpty(bVar.f107914d)) {
            cVar.c("XIAOMI-SASL");
        } else {
            cVar.c(bVar.f107914d);
        }
        gq gqVar = new gq();
        gqVar.c(bVar.f1046b);
        gqVar.a(Integer.parseInt(bVar.f107917g));
        gqVar.b(bVar.f1043a);
        gqVar.a("BIND", (String) null);
        gqVar.a(gqVar.e());
        com.xiaomi.channel.commonutils.logger.b.m62a("[Slim]: bind id=" + gqVar.e());
        HashMap map = new HashMap();
        map.put("challenge", str);
        map.put("token", bVar.f107913c);
        map.put("chid", bVar.f107917g);
        map.put("from", bVar.f1046b);
        map.put("id", gqVar.e());
        map.put("to", "xiaomi.com");
        if (bVar.f1045a) {
            map.put("kick", "1");
        } else {
            map.put("kick", "0");
        }
        if (TextUtils.isEmpty(bVar.f107915e)) {
            map.put("client_attrs", "");
        } else {
            map.put("client_attrs", bVar.f107915e);
        }
        if (TextUtils.isEmpty(bVar.f107916f)) {
            map.put("cloud_attrs", "");
        } else {
            map.put("cloud_attrs", bVar.f107916f);
        }
        if (bVar.f107914d.equals("XIAOMI-PASS") || bVar.f107914d.equals("XMPUSH-PASS")) {
            strA = bn.a(bVar.f107914d, null, map, bVar.f107918h);
        } else {
            bVar.f107914d.equals("XIAOMI-SASL");
            strA = null;
        }
        cVar.f(strA);
        gqVar.a(cVar.m274a(), (String) null);
        hbVar.b(gqVar);
    }

    public static void a(String str, String str2, hb hbVar) {
        gq gqVar = new gq();
        gqVar.c(str2);
        gqVar.a(Integer.parseInt(str));
        gqVar.a("UBND", (String) null);
        hbVar.b(gqVar);
    }
}
