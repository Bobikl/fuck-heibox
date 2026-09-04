package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class fj implements fg {
    fj() {
    }

    private void a(Service service, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (TextUtils.isEmpty(stringExtra)) {
            ez.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
            return;
        }
        String strB = ey.b(stringExtra);
        if (TextUtils.isEmpty(strB)) {
            ez.a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
        } else {
            ez.a(service.getApplicationContext(), strB, 1007, "play with service successfully");
        }
    }

    private void b(Context context, fc fcVar) {
        String strM370a = fcVar.m370a();
        String strB = fcVar.b();
        String strD = fcVar.d();
        int iA = fcVar.a();
        if (context == null || TextUtils.isEmpty(strM370a) || TextUtils.isEmpty(strB) || TextUtils.isEmpty(strD)) {
            if (TextUtils.isEmpty(strD)) {
                ez.a(context, "service", 1008, "argument error");
                return;
            } else {
                ez.a(context, strD, 1008, "argument error");
                return;
            }
        }
        if (!com.xiaomi.push.service.m.a(context, strM370a, strB)) {
            ez.a(context, strD, 1003, "B is not ready");
            return;
        }
        ez.a(context, strD, 1002, "B is ready");
        ez.a(context, strD, 1004, "A is ready");
        try {
            Intent intent = new Intent();
            intent.setAction(strB);
            intent.setPackage(strM370a);
            intent.putExtra("awake_info", ey.a(strD));
            if (iA == 1 && !fd.m371a(context)) {
                ez.a(context, strD, 1008, "A not in foreground");
            } else if (context.startService(intent) == null) {
                ez.a(context, strD, 1008, "A is fail to help B's service");
            } else {
                ez.a(context, strD, 1005, "A is successful");
                ez.a(context, strD, 1006, "The job is finished");
            }
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            ez.a(context, strD, 1008, "A meet a exception when help B's service");
        }
    }

    @Override // com.xiaomi.push.fg
    public void a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            ez.a(context, "service", 1008, "A receive incorrect message");
        } else {
            a((Service) context, intent);
        }
    }

    @Override // com.xiaomi.push.fg
    public void a(Context context, fc fcVar) {
        if (fcVar != null) {
            b(context, fcVar);
        } else {
            ez.a(context, "service", 1008, "A receive incorrect message");
        }
    }
}
