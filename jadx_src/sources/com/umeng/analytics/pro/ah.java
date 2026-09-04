package com.umeng.analytics.pro;

import android.content.Context;
import com.umeng.commonsdk.debug.UMLog;

/* JADX INFO: compiled from: VivoDeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class ah implements z {
    @Override // com.umeng.analytics.pro.z
    public String a(Context context) {
        String strC = null;
        try {
            if (org.repackage.com.vivo.identifier.e.b(context)) {
                strC = org.repackage.com.vivo.identifier.e.c(context);
            } else {
                UMLog.mutlInfo(2, "当前设备不支持获取OAID");
            }
        } catch (Exception unused) {
            UMLog.mutlInfo(2, "未检测到您集成OAID SDK包");
        }
        return strC;
    }
}
