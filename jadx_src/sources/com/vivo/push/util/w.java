package com.vivo.push.util;

import android.content.Context;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: compiled from: SharePreferenceManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class w extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static w f106695b;

    public static synchronized w b() {
        if (f106695b == null) {
            f106695b = new w();
        }
        return f106695b;
    }

    private static byte[] c(String str) {
        int length;
        byte[] bArr = null;
        try {
            String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            if (strArrSplit.length > 0) {
                bArr = new byte[strArrSplit.length];
                length = strArrSplit.length;
            } else {
                length = 0;
            }
            for (int i10 = 0; i10 < length; i10++) {
                bArr[i10] = Byte.parseByte(strArrSplit[i10].trim());
            }
        } catch (Exception e10) {
            p.a("SharePreferenceManager", "getCodeBytes error:" + e10.getMessage());
        }
        return bArr;
    }

    public final synchronized void a(Context context) {
        if (this.f106657a == null) {
            this.f106657a = context;
            a(context, "com.vivo.push_preferences");
        }
    }

    public final byte[] c() {
        byte[] bArrC = c(b("com.vivo.push.secure_cache_iv", ""));
        return (bArrC == null || bArrC.length <= 0) ? new byte[]{34, 32, 33, 37, 33, 34, 32, 33, 33, 33, 34, 41, 35, 32, 32, 32} : bArrC;
    }

    public final byte[] d() {
        byte[] bArrC = c(b("com.vivo.push.secure_cache_key", ""));
        return (bArrC == null || bArrC.length <= 0) ? new byte[]{33, 34, 35, 36, 37, 38, 39, 40, 41, 32, 38, 37, 36, 35, 34, 33} : bArrC;
    }
}
