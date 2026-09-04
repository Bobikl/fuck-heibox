package com.umeng.powersdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f106003a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f106004a = new b(0);
    }

    private b() {
    }

    /* synthetic */ b(byte b10) {
        this();
    }

    public static b a(Context context) {
        if (f106003a == null && context != null) {
            f106003a = context.getApplicationContext();
        }
        return a.f106004a;
    }

    public final synchronized com.umeng.powersdk.a a() {
        com.umeng.powersdk.a aVar;
        com.umeng.powersdk.a aVar2 = null;
        try {
            Intent intentRegisterReceiver = f106003a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i10 = 0;
            int intExtra = intentRegisterReceiver.getIntExtra("level", 0);
            int intExtra2 = intentRegisterReceiver.getIntExtra("voltage", 0);
            int intExtra3 = intentRegisterReceiver.getIntExtra("temperature", 0);
            int intExtra4 = intentRegisterReceiver.getIntExtra("status", 0);
            int i11 = -1;
            if (intExtra4 != 1) {
                if (intExtra4 == 2) {
                    i11 = 1;
                } else if (intExtra4 == 3 || intExtra4 == 4) {
                    i11 = 0;
                } else if (intExtra4 == 5) {
                    i11 = 2;
                }
            }
            int intExtra5 = intentRegisterReceiver.getIntExtra("plugged", 0);
            if (intExtra5 == 1) {
                i10 = 1;
            } else if (intExtra5 == 2) {
                i10 = 2;
            }
            aVar = new com.umeng.powersdk.a();
            try {
                aVar.f105997a = intExtra;
                aVar.f105998b = intExtra2;
                aVar.f106000d = i11;
                aVar.f105999c = intExtra3;
                aVar.f106001e = i10;
                aVar.f106002f = System.currentTimeMillis();
            } catch (Throwable unused) {
                aVar2 = aVar;
                aVar = aVar2;
            }
        } catch (Throwable unused2) {
        }
        return aVar;
    }
}
