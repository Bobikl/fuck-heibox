package com.xiaomi.push.service;

import android.content.Context;
import android.os.Messenger;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.ErrorCode;
import com.xiaomi.push.dt;
import com.xiaomi.push.gq;
import com.xiaomi.push.hb;
import com.xiaomi.push.hm;
import com.xiaomi.push.hs;
import com.xiaomi.push.in;
import com.xiaomi.push.ix;
import com.xiaomi.push.ja;
import com.xiaomi.push.jc;
import com.xiaomi.push.jj;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import com.xiaomi.push.jy;
import com.xiaomi.push.kd;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class ai {
    static gq a(XMPushService xMPushService, byte[] bArr) {
        jj jjVar = new jj();
        try {
            jx.a(jjVar, bArr);
            return a(v.m773a((Context) xMPushService), xMPushService, jjVar);
        } catch (kd e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return null;
        }
    }

    static gq a(u uVar, Context context, jj jjVar) {
        try {
            gq gqVar = new gq();
            gqVar.a(5);
            gqVar.c(uVar.f1114a);
            gqVar.b(a(jjVar));
            gqVar.a("SECMSG", "message");
            String str = uVar.f1114a;
            jjVar.f746a.f673a = str.substring(0, str.indexOf("@"));
            jjVar.f746a.f677c = str.substring(str.indexOf("/") + 1);
            gqVar.a(jx.a(jjVar), uVar.f108039c);
            gqVar.a((short) 1);
            com.xiaomi.channel.commonutils.logger.b.m62a("try send mi push message. packagename:" + jjVar.f751b + " action:" + jjVar.f744a);
            return gqVar;
        } catch (NullPointerException e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return null;
        }
    }

    static jj a(String str, String str2) {
        jm jmVar = new jm();
        jmVar.b(str2);
        jmVar.c("package uninstalled");
        jmVar.a(hs.i());
        jmVar.a(false);
        return a(str, str2, jmVar, in.Notification);
    }

    static <T extends jy<T, ?>> jj a(String str, String str2, T t10, in inVar) {
        return a(str, str2, t10, inVar, true);
    }

    private static <T extends jy<T, ?>> jj a(String str, String str2, T t10, in inVar, boolean z10) {
        byte[] bArrA = jx.a(t10);
        jj jjVar = new jj();
        jc jcVar = new jc();
        jcVar.f672a = 5L;
        jcVar.f673a = "fakeid";
        jjVar.a(jcVar);
        jjVar.a(ByteBuffer.wrap(bArrA));
        jjVar.a(inVar);
        jjVar.b(z10);
        jjVar.b(str);
        jjVar.a(false);
        jjVar.a(str2);
        return jjVar;
    }

    private static String a(jj jjVar) {
        Map<String, String> map;
        ja jaVar = jjVar.f745a;
        if (jaVar != null && (map = jaVar.f663b) != null) {
            String str = map.get("ext_traffic_source_pkg");
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return jjVar.f751b;
    }

    static String a(String str) {
        return str + ".permission.MIPUSH_RECEIVE";
    }

    static void a(XMPushService xMPushService) {
        u uVarM773a = v.m773a(xMPushService.getApplicationContext());
        if (uVarM773a != null) {
            bf.b bVarA = v.m773a(xMPushService.getApplicationContext()).a(xMPushService);
            com.xiaomi.channel.commonutils.logger.b.m62a("prepare account. " + bVarA.f1043a);
            a(xMPushService, bVarA);
            bf.a().a(bVarA);
            a(xMPushService, uVarM773a, 172800);
        }
    }

    static void a(XMPushService xMPushService, jj jjVar) {
        dt.a(jjVar.b(), xMPushService.getApplicationContext(), jjVar, -1);
        hb hbVarM679a = xMPushService.m679a();
        if (hbVarM679a == null) {
            throw new hm("try send msg while connection is null.");
        }
        if (!hbVarM679a.mo432a()) {
            throw new hm("Don't support XMPP connection.");
        }
        gq gqVarA = a(v.m773a((Context) xMPushService), xMPushService, jjVar);
        if (gqVarA != null) {
            hbVarM679a.b(gqVarA);
        }
    }

    static void a(XMPushService xMPushService, bf.b bVar) {
        bVar.a((Messenger) null);
        bVar.a(new ak(xMPushService));
    }

    private static void a(XMPushService xMPushService, u uVar, int i10) {
        by.a(xMPushService).a(new aj("MSAID", i10, xMPushService, uVar));
    }

    static void a(XMPushService xMPushService, String str, byte[] bArr) {
        dt.a(str, xMPushService.getApplicationContext(), bArr);
        hb hbVarM679a = xMPushService.m679a();
        if (hbVarM679a == null) {
            throw new hm("try send msg while connection is null.");
        }
        if (!hbVarM679a.mo432a()) {
            throw new hm("Don't support XMPP connection.");
        }
        gq gqVarA = a(xMPushService, bArr);
        if (gqVarA != null) {
            hbVarM679a.b(gqVarA);
        } else {
            y.a(xMPushService, str, bArr, ErrorCode.ERROR_INVALID_PAYLOAD, "not a valid message");
        }
    }

    static jj b(String str, String str2) {
        jm jmVar = new jm();
        jmVar.b(str2);
        jmVar.c(ix.AppDataCleared.f623a);
        jmVar.a(bc.a());
        jmVar.a(false);
        return a(str, str2, jmVar, in.Notification);
    }

    static <T extends jy<T, ?>> jj b(String str, String str2, T t10, in inVar) {
        return a(str, str2, t10, inVar, false);
    }
}
