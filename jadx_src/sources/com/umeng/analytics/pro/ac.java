package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;

/* JADX INFO: compiled from: DeviceIdSupplier.java */
/* JADX INFO: loaded from: classes4.dex */
public class ac {
    public static z a(Context context) {
        String str = Build.BRAND;
        aj.a("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("huawei") || str.equalsIgnoreCase("honor") || str.equalsIgnoreCase("华为")) {
            return new ad();
        }
        if (str.equalsIgnoreCase("xiaomi") || str.equalsIgnoreCase("redmi") || str.equalsIgnoreCase("meitu") || str.equalsIgnoreCase("小米")) {
            return new ai();
        }
        if (str.equalsIgnoreCase("vivo")) {
            return new ah();
        }
        if (str.equalsIgnoreCase("oppo") || str.equalsIgnoreCase("oneplus")) {
            return new af();
        }
        if (str.equalsIgnoreCase("lenovo") || str.equalsIgnoreCase("zuk")) {
            return new ae();
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("SAMSUNG")) {
            return new ag();
        }
        if (UMUtils.isAppInstalled(context, "com.coolpad.deviceidsupport")) {
            return new ab();
        }
        return null;
    }
}
