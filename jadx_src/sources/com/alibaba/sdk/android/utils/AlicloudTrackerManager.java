package com.alibaba.sdk.android.utils;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.alibaba.sdk.android.utils.crashdefend.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AlicloudTrackerManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AlicloudTrackerManager f38035a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f55a = new a();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private com.alibaba.sdk.android.utils.crashdefend.b f56a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, AlicloudTracker> f38036b;

    private AlicloudTrackerManager(Application application) {
        this.f56a = null;
        HashMap map = new HashMap(4);
        map.put("kVersion", "2.0.0");
        map.put("packageName", application.getPackageName());
        this.f55a.a(application, map);
        this.f38036b = new HashMap();
        this.f56a = com.alibaba.sdk.android.utils.crashdefend.b.a(application, this.f55a);
    }

    public static synchronized AlicloudTrackerManager getInstance(Application application) {
        if (application == null) {
            return null;
        }
        if (f38035a == null) {
            f38035a = new AlicloudTrackerManager(application);
        }
        return f38035a;
    }

    public AlicloudTracker getTracker(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e("AlicloudTrackerManager", "sdkId or sdkVersion is null");
            return null;
        }
        String str3 = str + str2;
        if (this.f38036b.containsKey(str3)) {
            return this.f38036b.get(str3);
        }
        AlicloudTracker alicloudTracker = new AlicloudTracker(this.f55a, str, str2);
        this.f38036b.put(str3, alicloudTracker);
        return alicloudTracker;
    }

    public boolean registerCrashDefend(String str, String str2, int i10, int i11, SDKMessageCallback sDKMessageCallback) {
        if (this.f56a == null) {
            return false;
        }
        c cVar = new c();
        cVar.f65a = str;
        cVar.f67b = str2;
        cVar.f38048a = i10;
        cVar.f38049b = i11;
        return this.f56a.m34a(cVar, sDKMessageCallback);
    }

    public void unregisterCrashDefend(String str, String str2) {
        this.f56a.b(str, str2);
    }
}
