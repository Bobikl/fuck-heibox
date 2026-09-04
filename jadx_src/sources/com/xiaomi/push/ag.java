package com.xiaomi.push;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
public class ag {
    public static boolean a(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return false;
        }
    }

    public static boolean b(Context context) {
        Intent intentRegisterReceiver = null;
        try {
            intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        } catch (Exception unused) {
        }
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
