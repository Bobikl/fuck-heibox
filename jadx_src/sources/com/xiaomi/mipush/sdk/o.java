package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.push.fd;
import com.xiaomi.push.ff;
import com.xiaomi.push.is;
import com.xiaomi.push.ix;
import com.xiaomi.push.jm;
import com.xiaomi.push.jx;
import com.xiaomi.push.jy;
import com.xiaomi.push.service.az;
import com.xiaomi.push.service.bc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class o {
    public static void a(Context context, Intent intent, Uri uri) {
        if (context == null) {
            return;
        }
        ao.a(context).m101a();
        if (fd.a(context.getApplicationContext()).m372a() == null) {
            fd.a(context.getApplicationContext()).a(b.m111a(context.getApplicationContext()).m112a(), context.getPackageName(), az.a(context.getApplicationContext()).a(is.AwakeInfoUploadWaySwitch.a(), 0), new c());
            az.a(context).a(new q(102, "awake online config", context));
        }
        if ((context instanceof Activity) && intent != null) {
            fd.a(context.getApplicationContext()).a(ff.ACTIVITY, context, intent, (String) null);
            return;
        }
        if (!(context instanceof Service) || intent == null) {
            if (uri == null || TextUtils.isEmpty(uri.toString())) {
                return;
            }
            fd.a(context.getApplicationContext()).a(ff.PROVIDER, context, (Intent) null, uri.toString());
            return;
        }
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            fd.a(context.getApplicationContext()).a(ff.SERVICE_COMPONENT, context, intent, (String) null);
        } else {
            fd.a(context.getApplicationContext()).a(ff.SERVICE_ACTION, context, intent, (String) null);
        }
    }

    private static void a(Context context, jm jmVar) {
        boolean zA = az.a(context).a(is.AwakeAppPingSwitch.a(), false);
        int iA = az.a(context).a(is.AwakeAppPingFrequency.a(), 0);
        if (iA >= 0 && iA < 30) {
            com.xiaomi.channel.commonutils.logger.b.c("aw_ping: frquency need > 30s.");
            iA = 30;
        }
        boolean z10 = iA >= 0 ? zA : false;
        if (!com.xiaomi.push.j.m520a()) {
            a(context, jmVar, z10, iA);
        } else if (z10) {
            com.xiaomi.push.ah.a(context.getApplicationContext()).a((com.xiaomi.push.ah.a) new p(jmVar, context), iA);
        }
    }

    public static final <T extends jy<T, ?>> void a(Context context, T t10, boolean z10, int i10) {
        byte[] bArrA = jx.a(t10);
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z10);
        intent.putExtra("extra_help_ping_frequency", i10);
        intent.putExtra("mipush_payload", bArrA);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        ao.a(context).m103a(intent);
    }

    public static void a(Context context, String str) {
        com.xiaomi.channel.commonutils.logger.b.m62a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap map = new HashMap();
        map.put("awake_info", str);
        map.put("event_type", String.valueOf(bb.c.l.V0));
        map.put("description", "ping message");
        jm jmVar = new jm();
        jmVar.b(b.m111a(context).m112a());
        jmVar.d(context.getPackageName());
        jmVar.c(ix.AwakeAppResponse.f623a);
        jmVar.a(bc.a());
        jmVar.f763a = map;
        a(context, jmVar);
    }

    public static void a(Context context, String str, int i10, String str2) {
        jm jmVar = new jm();
        jmVar.b(str);
        jmVar.a(new HashMap());
        jmVar.m580a().put("extra_aw_app_online_cmd", String.valueOf(i10));
        jmVar.m580a().put("extra_help_aw_info", str2);
        jmVar.a(bc.a());
        byte[] bArrA = jx.a(jmVar);
        if (bArrA == null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", bArrA);
        ao.a(context).m103a(intent);
    }
}
