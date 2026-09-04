package com.igexin.push.extension.distribution.basic.d;

import android.content.SharedPreferences;
import com.igexin.push.extension.distribution.basic.c.e;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f63974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f63975b = e.f63961a.getSharedPreferences("gx_sp", 0);

    private a() {
    }

    public static a a() {
        if (f63974a == null) {
            f63974a = new a();
        }
        return f63974a;
    }

    public static String b() {
        return e.f63961a.getSharedPreferences("getui_sp", 0).getString("us", "");
    }

    public static String c() {
        return e.f63961a.getSharedPreferences("getui_sp", 0).getString("uis", "");
    }
}
