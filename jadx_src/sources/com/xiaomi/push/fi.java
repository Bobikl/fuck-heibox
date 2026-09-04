package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class fi implements fg {
    fi() {
    }

    private void a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str) || context == null) {
                ez.a(context, com.umeng.analytics.pro.d.M, 1008, "B get a incorrect message");
                return;
            }
            String[] strArrSplit = str.split("/");
            if (strArrSplit.length <= 0 || TextUtils.isEmpty(strArrSplit[strArrSplit.length - 1])) {
                ez.a(context, com.umeng.analytics.pro.d.M, 1008, "B get a incorrect message");
                return;
            }
            String str2 = strArrSplit[strArrSplit.length - 1];
            if (TextUtils.isEmpty(str2)) {
                ez.a(context, com.umeng.analytics.pro.d.M, 1008, "B get a incorrect message");
                return;
            }
            String strDecode = Uri.decode(str2);
            if (TextUtils.isEmpty(strDecode)) {
                ez.a(context, com.umeng.analytics.pro.d.M, 1008, "B get a incorrect message");
                return;
            }
            String strB = ey.b(strDecode);
            if (TextUtils.isEmpty(strB)) {
                ez.a(context, com.umeng.analytics.pro.d.M, 1008, "B get a incorrect message");
            } else {
                ez.a(context, strB, 1007, "play with provider successfully");
            }
        } catch (Exception e10) {
            ez.a(context, com.umeng.analytics.pro.d.M, 1008, "B meet a exception" + e10.getMessage());
        }
    }

    private void b(Context context, fc fcVar) {
        String strB = fcVar.b();
        String strD = fcVar.d();
        int iA = fcVar.a();
        if (context == null || TextUtils.isEmpty(strB) || TextUtils.isEmpty(strD)) {
            if (TextUtils.isEmpty(strD)) {
                ez.a(context, com.umeng.analytics.pro.d.M, 1008, "argument error");
                return;
            } else {
                ez.a(context, strD, 1008, "argument error");
                return;
            }
        }
        if (!com.xiaomi.push.service.m.b(context, strB)) {
            ez.a(context, strD, 1003, "B is not ready");
            return;
        }
        ez.a(context, strD, 1002, "B is ready");
        ez.a(context, strD, 1004, "A is ready");
        String strA = ey.a(strD);
        try {
            if (TextUtils.isEmpty(strA)) {
                ez.a(context, strD, 1008, "info is empty");
                return;
            }
            if (iA == 1 && !fd.m371a(context)) {
                ez.a(context, strD, 1008, "A not in foreground");
                return;
            }
            String type = context.getContentResolver().getType(ey.a(strB, strA));
            if (TextUtils.isEmpty(type) || !"success".equals(type)) {
                ez.a(context, strD, 1008, "A is fail to help B's provider");
            } else {
                ez.a(context, strD, 1005, "A is successful");
                ez.a(context, strD, 1006, "The job is finished");
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            ez.a(context, strD, 1008, "A meet a exception when help B's provider");
        }
    }

    @Override // com.xiaomi.push.fg
    public void a(Context context, Intent intent, String str) {
        a(context, str);
    }

    @Override // com.xiaomi.push.fg
    public void a(Context context, fc fcVar) {
        if (fcVar != null) {
            b(context, fcVar);
        } else {
            ez.a(context, com.umeng.analytics.pro.d.M, 1008, "A receive incorrect message");
        }
    }
}
