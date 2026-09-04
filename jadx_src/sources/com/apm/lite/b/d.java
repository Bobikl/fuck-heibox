package com.apm.lite.b;

import android.content.Context;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f39873b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f39874a;

    private d(Context context) {
        this.f39874a = new a(context);
    }

    public static d a(Context context) {
        if (f39873b == null) {
            synchronized (d.class) {
                if (f39873b == null) {
                    f39873b = new d(context);
                }
            }
        }
        return f39873b;
    }

    public static JSONArray b() {
        return new JSONArray();
    }

    public static JSONObject c(long j10) {
        return new JSONObject();
    }

    public static void e() {
        if (f39873b == null || f39873b.f39874a == null) {
            return;
        }
        f39873b.f39874a.m();
    }

    public static void f() {
        if (f39873b == null || f39873b.f39874a == null) {
            return;
        }
        f39873b.f39874a.u();
    }

    public static void g() {
        if (f39873b == null || f39873b.f39874a == null) {
            return;
        }
        f39873b.f39874a.t();
    }

    public void d() {
        this.f39874a.d();
    }
}
