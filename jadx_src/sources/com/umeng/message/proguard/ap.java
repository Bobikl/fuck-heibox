package com.umeng.message.proguard;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class ap {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile ap f105743b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f105744a = x.a().getSharedPreferences("umeng_push", 0);

    private ap() {
    }

    public static ap a() {
        if (f105743b == null) {
            synchronized (ap.class) {
                if (f105743b == null) {
                    f105743b = new ap();
                }
            }
        }
        return f105743b;
    }

    public final void a(String str) {
        if (this.f105744a.contains(str)) {
            this.f105744a.edit().remove(str).apply();
        }
    }

    public final void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f105744a.edit().putString(str, str2).apply();
    }
}
