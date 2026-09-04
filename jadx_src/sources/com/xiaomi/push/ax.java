package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ax implements ar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ax f106841a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f198a = aw.f106840a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ar f199a;

    private ax(Context context) {
        this.f199a = aw.a(context);
        com.xiaomi.channel.commonutils.logger.b.m62a("create id manager is: " + this.f198a);
    }

    public static ax a(Context context) {
        if (f106841a == null) {
            synchronized (ax.class) {
                if (f106841a == null) {
                    f106841a = new ax(context.getApplicationContext());
                }
            }
        }
        return f106841a;
    }

    private String a(String str) {
        return str == null ? "" : str;
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public String mo150a() {
        return a(this.f199a.mo150a());
    }

    public void a() {
    }

    public void a(Map<String, String> map) {
        if (map == null) {
            return;
        }
        String strB = b();
        if (!TextUtils.isEmpty(strB)) {
            map.put("udid", strB);
        }
        String strMo150a = mo150a();
        if (!TextUtils.isEmpty(strMo150a)) {
            map.put("oaid", strMo150a);
        }
        String strC = c();
        if (!TextUtils.isEmpty(strC)) {
            map.put("vaid", strC);
        }
        String strD = d();
        if (!TextUtils.isEmpty(strD)) {
            map.put("aaid", strD);
        }
        map.put("oaid_type", String.valueOf(this.f198a));
    }

    @Override // com.xiaomi.push.ar
    /* JADX INFO: renamed from: a */
    public boolean mo151a() {
        return this.f199a.mo151a();
    }

    public String b() {
        return null;
    }

    public String c() {
        return null;
    }

    public String d() {
        return null;
    }
}
