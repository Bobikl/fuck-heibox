package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class il {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile il f107372a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Context f583a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<String, im> f584a = new HashMap();

    private il(Context context) {
        this.f583a = context;
    }

    public static il a(Context context) {
        if (context == null) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]:mContext is null, TinyDataManager.getInstance(Context) failed.");
            return null;
        }
        if (f107372a == null) {
            synchronized (il.class) {
                if (f107372a == null) {
                    f107372a = new il(context);
                }
            }
        }
        return f107372a;
    }

    private boolean a(String str, String str2, String str3, String str4, long j10, String str5) {
        ir irVar = new ir();
        irVar.d(str3);
        irVar.c(str4);
        irVar.a(j10);
        irVar.b(str5);
        irVar.a(true);
        irVar.a("push_sdk_channel");
        irVar.e(str2);
        return a(irVar, str);
    }

    im a() {
        im imVar = this.f584a.get("UPLOADER_PUSH_CHANNEL");
        if (imVar != null) {
            return imVar;
        }
        im imVar2 = this.f584a.get("UPLOADER_HTTP");
        if (imVar2 != null) {
            return imVar2;
        }
        return null;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    Map<String, im> m483a() {
        return this.f584a;
    }

    public void a(im imVar, String str) {
        if (imVar == null) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]: please do not add null mUploader to TinyDataManager.");
        } else if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.d("[TinyDataManager]: can not add a provider from unkown resource.");
        } else {
            m483a().put(str, imVar);
        }
    }

    public boolean a(ir irVar, String str) {
        if (TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("pkgName is null or empty, upload ClientUploadDataItem failed.");
            return false;
        }
        if (com.xiaomi.push.service.ca.a(irVar, false)) {
            return false;
        }
        if (TextUtils.isEmpty(irVar.d())) {
            irVar.f(com.xiaomi.push.service.ca.a());
        }
        irVar.g(str);
        com.xiaomi.push.service.cb.a(this.f583a, irVar);
        return true;
    }

    public boolean a(String str, String str2, long j10, String str3) {
        return a(this.f583a.getPackageName(), this.f583a.getPackageName(), str, str2, j10, str3);
    }
}
