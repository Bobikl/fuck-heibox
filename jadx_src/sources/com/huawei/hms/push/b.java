package com.huawei.hms.push;

import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;

/* JADX INFO: compiled from: BundleUtil.java */
/* JADX INFO: loaded from: classes7.dex */
public class b {
    public static byte[] a(Bundle bundle, String str) {
        try {
            byte[] byteArray = bundle.getByteArray(str);
            return byteArray == null ? new byte[0] : byteArray;
        } catch (Exception e10) {
            HMSLog.i("BundleUtil", "getByteArray exception" + e10.getMessage());
            return new byte[0];
        }
    }

    public static String b(Bundle bundle, String str) {
        try {
            return bundle.getString(str);
        } catch (Exception e10) {
            HMSLog.i("BundleUtil", "getString exception" + e10.getMessage());
            return null;
        }
    }

    public static String c(Bundle bundle, String str) {
        try {
            String string = bundle.getString(str);
            return string == null ? "" : string;
        } catch (Exception e10) {
            HMSLog.i("BundleUtil", "getString exception" + e10.getMessage());
            return "";
        }
    }
}
