package com.umeng.ut.b.a.a;

import android.text.TextUtils;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class c {
    private static String e() {
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int iNanoTime = (int) System.nanoTime();
        int iNextInt = new Random().nextInt();
        int iNextInt2 = new Random().nextInt();
        byte[] bytes = b.getBytes(iCurrentTimeMillis);
        byte[] bytes2 = b.getBytes(iNanoTime);
        byte[] bytes3 = b.getBytes(iNextInt);
        byte[] bytes4 = b.getBytes(iNextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return a.a(bArr, 2);
    }

    public static String f() {
        String strG = g();
        return d.isEmpty(strG) ? e() : strG;
    }

    private static String g() {
        String str = e.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = e.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? h() : str;
    }

    private static String h() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }
}
