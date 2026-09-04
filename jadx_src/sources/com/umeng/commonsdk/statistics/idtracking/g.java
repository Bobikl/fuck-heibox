package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.DeviceConfig;

/* JADX INFO: compiled from: MacTracker.java */
/* JADX INFO: loaded from: classes4.dex */
public class g extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f105365a = "mac";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f105366b;

    public g(Context context) {
        super("mac");
        this.f105366b = context;
    }

    @Override // com.umeng.commonsdk.statistics.idtracking.a
    public String f() {
        try {
            return DeviceConfig.getMac(this.f105366b);
        } catch (Exception e10) {
            if (AnalyticsConstants.UM_DEBUG) {
                e10.printStackTrace();
            }
            UMCrashManager.reportCrash(this.f105366b, e10);
            return null;
        }
    }
}
