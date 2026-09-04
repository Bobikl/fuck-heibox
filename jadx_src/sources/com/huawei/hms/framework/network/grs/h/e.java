package com.huawei.hms.framework.network.grs.h;

import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f60863a = "e";

    public static boolean a(Long l10) {
        if (l10 == null) {
            Logger.v(f60863a, "Method isTimeExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l10.longValue() - System.currentTimeMillis() >= 0) {
                Logger.i(f60863a, "isSpExpire false.");
                return false;
            }
            Logger.i(f60863a, "isSpExpire true.");
            return true;
        } catch (NumberFormatException unused) {
            Logger.v(f60863a, "isSpExpire spValue NumberFormatException.");
        }
    }

    public static boolean a(Long l10, long j10) {
        if (l10 == null) {
            Logger.v(f60863a, "Method isTimeWillExpire input param expireTime is null.");
            return true;
        }
        try {
            if (l10.longValue() - (System.currentTimeMillis() + j10) >= 0) {
                Logger.v(f60863a, "isSpExpire false.");
                return false;
            }
        } catch (NumberFormatException unused) {
            Logger.v(f60863a, "isSpExpire spValue NumberFormatException.");
        }
        return true;
    }
}
