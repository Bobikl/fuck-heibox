package com.xiaomi.push;

import android.util.Log;

/* JADX INFO: loaded from: classes4.dex */
public class gr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f107228a = Log.isLoggable("BCompressed", 3);

    static byte[] a(gq gqVar, byte[] bArr) {
        try {
            byte[] bArrA = gu.a.a(bArr);
            if (f107228a) {
                com.xiaomi.channel.commonutils.logger.b.m63a("BCompressed", "decompress " + bArr.length + " to " + bArrA.length + " for " + gqVar);
                if (gqVar.f487a == 1) {
                    com.xiaomi.channel.commonutils.logger.b.m63a("BCompressed", "decompress not support upStream");
                }
            }
            return bArrA;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m63a("BCompressed", "decompress error " + e10);
            return bArr;
        }
    }
}
