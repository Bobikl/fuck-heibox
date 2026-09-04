package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import e6.a;
import q4.d;

/* JADX INFO: loaded from: classes6.dex */
public class UmidSdkWrapper {
    public static final String UMIDTOKEN_FILE_NAME = "xxxwww_v2";
    public static final String UMIDTOKEN_KEY_NAME = "umidtk";
    public static volatile String cachedUmidToken = "";
    public static volatile boolean initUmidFinished = false;

    public static String compatUmidBug(Context context, String str) {
        if (!a.c(str) && !a.d(str, "000000000000000000000000")) {
            return str;
        }
        String utdid = UtdidWrapper.getUtdid(context);
        if (utdid != null && utdid.contains("?")) {
            utdid = "";
        }
        return a.c(utdid) ? "" : utdid;
    }

    public static synchronized String getSecurityToken(Context context) {
        return cachedUmidToken;
    }

    public static String startUmidTaskSync(Context context, int i10) {
        return "";
    }

    public static synchronized void updateLocalUmidToken(Context context, String str) {
        if (a.f(str)) {
            d.a(context, UMIDTOKEN_FILE_NAME, UMIDTOKEN_KEY_NAME, str);
            cachedUmidToken = str;
        }
    }
}
