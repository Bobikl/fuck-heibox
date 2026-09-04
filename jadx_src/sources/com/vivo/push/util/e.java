package com.vivo.push.util;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: compiled from: ClientReportUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public static boolean a(long j10, HashMap<String, String> map) {
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(j10);
        xVar.a(map);
        xVar.d();
        com.vivo.push.e.a().a(xVar);
        return true;
    }

    public static boolean a(Context context, long j10, long j11) {
        p.d("ClientReportUtil", "report message: " + j10 + ", reportType: " + j11);
        com.vivo.push.b.x xVar = new com.vivo.push.b.x(j11);
        HashMap<String, String> map = new HashMap<>();
        map.put(x9.b.f141138c, String.valueOf(j10));
        String strB = z.b(context, context.getPackageName());
        if (!TextUtils.isEmpty(strB)) {
            map.put("remoteAppId", strB);
        }
        xVar.a(map);
        com.vivo.push.e.a().a(xVar);
        return true;
    }
}
