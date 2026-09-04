package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public class COSPushHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f106731a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static volatile boolean f101a = false;

    public static void convertMessage(Intent intent) {
        i.a(intent);
    }

    public static void doInNetworkChange(Context context) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (getNeedRegister()) {
            long j10 = f106731a;
            if (j10 <= 0 || j10 + 300000 <= jElapsedRealtime) {
                f106731a = jElapsedRealtime;
                registerCOSAssemblePush(context);
            }
        }
    }

    public static boolean getNeedRegister() {
        return f101a;
    }

    public static boolean hasNetwork(Context context) {
        return i.m134a(context);
    }

    public static void onNotificationMessageCome(Context context, String str) {
    }

    public static void onPassThoughMessageCome(Context context, String str) {
    }

    public static void registerCOSAssemblePush(Context context) {
        AbstractPushManager abstractPushManagerA = f.a(context).a(e.ASSEMBLE_PUSH_COS);
        if (abstractPushManagerA != null) {
            com.xiaomi.channel.commonutils.logger.b.m62a("ASSEMBLE_PUSH :  register cos when network change!");
            abstractPushManagerA.register();
        }
    }

    public static synchronized void setNeedRegister(boolean z10) {
        f101a = z10;
    }

    public static void uploadToken(Context context, String str) {
        i.m133a(context, e.ASSEMBLE_PUSH_COS, str);
    }
}
