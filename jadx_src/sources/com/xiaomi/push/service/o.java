package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.push.jj;
import com.xiaomi.push.jo;
import com.xiaomi.push.jx;
import com.xiaomi.push.kd;

/* JADX INFO: loaded from: classes4.dex */
public class o {
    public static jo a(jj jjVar) {
        byte[] bArrM570a = jjVar.m570a();
        jo joVar = new jo();
        try {
            jx.a(joVar, bArrM570a);
            return joVar;
        } catch (kd unused) {
            return null;
        }
    }

    static void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("ext_fcm_container_buffer");
        String stringExtra2 = intent.getStringExtra("mipush_app_package");
        if (TextUtils.isEmpty(stringExtra) || TextUtils.isEmpty(stringExtra2)) {
            return;
        }
        try {
            byte[] bArrB = b(Base64.decode(stringExtra, 2), context.getSharedPreferences("mipush_apps_scrt", 0).getString(stringExtra2, null));
            if (bArrB != null) {
                al.m694a(context, z.a(bArrB), bArrB);
            } else {
                com.xiaomi.channel.commonutils.logger.b.m62a("notify fcm notification error ：dencrypt failed");
            }
        } catch (Throwable th2) {
            com.xiaomi.channel.commonutils.logger.b.a("notify fcm notification error ", th2);
        }
    }

    public static void a(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        context.getSharedPreferences("mipush_apps_scrt", 0).edit().putString(str, str2).apply();
    }

    public static byte[] a(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("secret is empty, return null");
            return null;
        }
        try {
            return com.xiaomi.push.h.b(com.xiaomi.push.bm.m189a(str), bArr);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a("encryption error. ", e10);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("secret is empty, return null");
            return null;
        }
        try {
            return com.xiaomi.push.h.a(com.xiaomi.push.bm.m189a(str), bArr);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a("dencryption error. ", e10);
            return null;
        }
    }
}
