package com.baseflow.permissionhandler;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: ServiceManager.java */
/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: compiled from: ServiceManager.java */
    @FunctionalInterface
    public interface a {
        void a(int i10);
    }

    w() {
    }

    private List<ResolveInfo> b(PackageManager packageManager) {
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:123123"));
        return Build.VERSION.SDK_INT >= 33 ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(intent, 0);
    }

    private boolean c(Context context) {
        return ((BluetoothManager) context.getSystemService("bluetooth")).getAdapter().isEnabled();
    }

    private static boolean d(Context context) {
        return false;
    }

    private boolean e(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return f(context);
        }
        LocationManager locationManager = (LocationManager) context.getSystemService(LocationManager.class);
        if (locationManager == null) {
            return false;
        }
        return locationManager.isLocationEnabled();
    }

    private static boolean f(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    void a(int i10, Context context, a aVar, c cVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            cVar.a("PermissionHandler.ServiceManager", "Android context cannot be null.");
            return;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            aVar.a(e(context) ? 1 : 0);
            return;
        }
        if (i10 == 21) {
            aVar.a(c(context) ? 1 : 0);
            return;
        }
        if (i10 != 8) {
            if (i10 == 16) {
                aVar.a(1);
                return;
            } else {
                aVar.a(2);
                return;
            }
        }
        PackageManager packageManager = context.getPackageManager();
        if (!packageManager.hasSystemFeature("android.hardware.telephony")) {
            aVar.a(2);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(g0.a.f118921e);
        if (telephonyManager == null || telephonyManager.getPhoneType() == 0) {
            aVar.a(2);
            return;
        }
        if (b(packageManager).isEmpty()) {
            aVar.a(2);
        } else if (telephonyManager.getSimState() != 5) {
            aVar.a(0);
        } else {
            aVar.a(1);
        }
    }
}
