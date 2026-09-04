package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* JADX INFO: loaded from: classes4.dex */
public class bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static bm f107958a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f1053a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Context f1054a;

    private bm(Context context) {
        this.f1054a = context.getApplicationContext();
    }

    public static bm a(Context context) {
        if (f107958a == null) {
            f107958a = new bm(context);
        }
        return f107958a;
    }

    @SuppressLint({"NewApi"})
    public int a() {
        int i10 = this.f1053a;
        if (i10 != 0) {
            return i10;
        }
        try {
            this.f1053a = Settings.Global.getInt(this.f1054a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f1053a;
    }

    @SuppressLint({"NewApi"})
    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public Uri m733a() {
        return Settings.Global.getUriFor("device_provisioned");
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m734a() {
        String str = com.xiaomi.push.aa.f164a;
        return str.contains("xmsf") || str.contains("xiaomi") || str.contains("miui");
    }
}
