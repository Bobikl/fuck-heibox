package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;

/* JADX INFO: compiled from: XiaomiDeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class ai implements z {
    ai() {
    }

    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        String strD = null;
        try {
            if (il.b.c()) {
                strD = il.b.d(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strD;
    }
}
