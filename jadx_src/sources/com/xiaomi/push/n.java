package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile n f107819a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f934a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Handler f935a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<String, Map<String, String>> f936a = new HashMap();

    private n(Context context) {
        this.f934a = context;
    }

    public static n a(Context context) {
        if (f107819a == null) {
            synchronized (n.class) {
                if (f107819a == null) {
                    f107819a = new n(context);
                }
            }
        }
        return f107819a;
    }

    private synchronized String a(String str, String str2) {
        if (this.f936a == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        try {
            Map<String, String> map = this.f936a.get(str);
            if (map == null) {
                return "";
            }
            return map.get(str2);
        } catch (Throwable unused) {
            return "";
        }
    }

    private synchronized void b(String str, String str2, String str3) {
        if (this.f936a == null) {
            this.f936a = new HashMap();
        }
        Map<String, String> map = this.f936a.get(str);
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(str2, str3);
        this.f936a.put(str, map);
    }

    public synchronized String a(String str, String str2, String str3) {
        String strA = a(str, str2);
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        return this.f934a.getSharedPreferences(str, 4).getString(str2, str3);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public synchronized void m654a(String str, String str2, String str3) {
        b(str, str2, str3);
        this.f935a.post(new o(this, str, str2, str3));
    }
}
