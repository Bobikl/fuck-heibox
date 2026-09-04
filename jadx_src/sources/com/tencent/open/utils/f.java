package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.tencent.open.log.SLog;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f101169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f101170b;

    /* JADX INFO: compiled from: ProGuard */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static f f101171a = new f();
    }

    private f() {
        this.f101169a = "";
        this.f101170b = "";
    }

    public static f a() {
        return a.f101171a;
    }

    public void a(Context context) {
        if (context == null) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("device_info_file", 4);
        String str = this.f101170b;
        if (str == null || str.trim().isEmpty()) {
            this.f101170b = sharedPreferences.getString("build_model", "");
            SLog.i("openSDK_LOG.DeviceInfoUtils", "init, model = " + this.f101170b);
        }
        String str2 = this.f101169a;
        if (str2 == null || str2.trim().isEmpty()) {
            this.f101169a = sharedPreferences.getString("build_device", "");
            SLog.i("openSDK_LOG.DeviceInfoUtils", "init, device = " + this.f101169a);
        }
    }

    public void a(Context context, String str) {
        SLog.i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, model = " + str);
        if (str == null || str.trim().isEmpty()) {
            this.f101170b = "";
            if (context != null) {
                context.getSharedPreferences("device_info_file", 4).edit().remove("build_model").commit();
                return;
            }
            return;
        }
        String str2 = this.f101170b;
        if (str2 != null && str2.equals(str)) {
            SLog.i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, needn't update sp.");
            return;
        }
        this.f101170b = str;
        if (context != null) {
            context.getSharedPreferences("device_info_file", 4).edit().putString("build_model", this.f101170b).commit();
            SLog.i("openSDK_LOG.DeviceInfoUtils", "setBuildModel, update sp.");
        }
    }

    public String b() {
        return this.f101170b;
    }

    public String b(Context context) {
        return this.f101169a;
    }

    public String c(Context context) {
        return this.f101170b;
    }
}
