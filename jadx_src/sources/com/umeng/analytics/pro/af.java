package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;

/* JADX INFO: compiled from: OppoDeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class af implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104407a = false;

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        try {
            if (!this.f104407a) {
                hl.a.a(context);
                this.f104407a = true;
            }
            if (hl.a.b()) {
                return hl.a.d(context);
            }
            UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
