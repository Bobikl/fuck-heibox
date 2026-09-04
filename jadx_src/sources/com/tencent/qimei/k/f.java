package com.tencent.qimei.k;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: QimeiSp.java */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, f> f101276a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences f101277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f101278c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f101279d;

    public f(String str) {
        this.f101278c = str;
    }

    public static synchronized f b(String str) {
        f fVar;
        Map<String, f> map = f101276a;
        fVar = map.get(str);
        if (fVar == null) {
            fVar = new f(str);
            map.put(str, fVar);
        }
        return fVar;
    }

    public String a(String str) {
        String strD = d(str);
        if (strD.equals("")) {
            return strD;
        }
        try {
            return com.tencent.qimei.b.a.a(strD, com.tencent.qimei.b.a.a(str));
        } catch (Exception e10) {
            e10.printStackTrace();
            return strD;
        }
    }

    public void a(Context context, String str) {
        this.f101279d = context;
        if (context == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        this.f101277b = this.f101279d.getSharedPreferences("QV1" + str + com.tencent.qimei.d.a.a(context).replace(context.getPackageName(), "") + com.tencent.qimei.l.a.a(this.f101278c), 0);
    }

    public void a(String str, long j10) {
        SharedPreferences sharedPreferences = this.f101277b;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putLong(str, j10).apply();
    }

    public void a(String str, String str2) {
        try {
            str2 = com.tencent.qimei.b.a.b(str2, com.tencent.qimei.b.a.a(str));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        b(str, str2);
    }

    public void b(String str, String str2) {
        SharedPreferences sharedPreferences = this.f101277b;
        if (sharedPreferences == null) {
            return;
        }
        sharedPreferences.edit().putString(str, str2).apply();
    }

    public long c(String str) {
        SharedPreferences sharedPreferences = this.f101277b;
        if (sharedPreferences == null) {
            return 0L;
        }
        return sharedPreferences.getLong(str, 0L);
    }

    public String d(String str) {
        String string;
        SharedPreferences sharedPreferences = this.f101277b;
        return (sharedPreferences == null || (string = sharedPreferences.getString(str, "")) == null) ? "" : string;
    }
}
