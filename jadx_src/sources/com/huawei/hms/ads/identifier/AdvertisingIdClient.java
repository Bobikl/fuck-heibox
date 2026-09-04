package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.huawei.hms.ads.identifier.aidl.OpenDeviceIdentifierService;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
@Keep
public class AdvertisingIdClient {
    private static final String SETTINGS_AD_ID = "pps_oaid";
    private static final String SETTINGS_TRACK_LIMIT = "pps_track_limit";
    private static final String TAG = "AdvertisingIdClient";

    @Keep
    public static final class Info {
        private final String advertisingId;
        private final boolean limitAdTrackingEnabled;

        @Keep
        public Info(String str, boolean z10) {
            this.advertisingId = str;
            this.limitAdTrackingEnabled = z10;
        }

        @Keep
        public String getId() {
            return this.advertisingId;
        }

        @Keep
        public boolean isLimitAdTrackingEnabled() {
            return this.limitAdTrackingEnabled;
        }
    }

    @Keep
    public static Info getAdvertisingIdInfo(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (!TextUtils.isEmpty(Settings.Global.getString(context.getContentResolver(), "pps_oaid_c"))) {
                    Info infoA = b.a(context);
                    return infoA != null ? infoA : requestAdvertisingIdInfo(context);
                }
                String string = Settings.Global.getString(context.getContentResolver(), SETTINGS_AD_ID);
                String string2 = Settings.Global.getString(context.getContentResolver(), SETTINGS_TRACK_LIMIT);
                if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                    updateAdvertisingIdInfo(context);
                    return new Info(string, Boolean.valueOf(string2).booleanValue());
                }
            } catch (Throwable th2) {
                Log.w("AdIdClient", "get Id err: " + th2.getClass().getSimpleName());
            }
        }
        return requestAdvertisingIdInfo(context);
    }

    private static Info getIdInfoViaAIDL(Context context) throws IOException {
        try {
            context.getPackageManager().getPackageInfo(c.a(context), 128);
            a aVar = new a();
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(c.a(context));
            try {
                if (!context.bindService(intent, aVar, 1)) {
                    throw new IOException("bind failed");
                }
                try {
                    try {
                        OpenDeviceIdentifierService openDeviceIdentifierServiceAsInterface = OpenDeviceIdentifierService.Stub.asInterface(aVar.a());
                        Info info = new Info(openDeviceIdentifierServiceAsInterface.getOaid(), openDeviceIdentifierServiceAsInterface.isOaidTrackLimited());
                        try {
                            context.unbindService(aVar);
                        } catch (Throwable th2) {
                            Log.w("AdIdClient", "unbind " + th2.getClass().getSimpleName());
                        }
                        return info;
                    } catch (RemoteException unused) {
                        throw new IOException("bind hms service RemoteException");
                    }
                } catch (InterruptedException unused2) {
                    throw new IOException("bind hms service InterruptedException");
                }
            } catch (Throwable th3) {
                try {
                    context.unbindService(aVar);
                } catch (Throwable th4) {
                    Log.w("AdIdClient", "unbind " + th4.getClass().getSimpleName());
                }
                throw th3;
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            throw new IOException("Service not found");
        } catch (Exception unused4) {
            throw new IOException("Service not found: Exception");
        }
    }

    @Keep
    public static boolean isAdvertisingIdAvailable(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            packageManager.getPackageInfo(c.a(context), 128);
            Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            intent.setPackage(c.a(context));
            return !packageManager.queryIntentServices(intent, 0).isEmpty();
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Info requestAdvertisingIdInfo(Context context) {
        if (b.c(context)) {
            Log.i(TAG, "requestAdvertisingIdInfo via provider");
            return b.b(context);
        }
        Log.i(TAG, "requestAdvertisingIdInfo via aidl");
        return getIdInfoViaAIDL(context);
    }

    private static void updateAdvertisingIdInfo(final Context context) {
        e.f60369a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.AdvertisingIdClient.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdvertisingIdClient.requestAdvertisingIdInfo(context);
                } catch (Throwable th2) {
                    Log.w("AdIdClient", "update Id err: " + th2.getClass().getSimpleName());
                }
            }
        });
    }

    @Keep
    public static boolean verifyAdId(Context context, String str, boolean z10) throws AdIdVerifyException {
        try {
            Info infoRequestAdvertisingIdInfo = requestAdvertisingIdInfo(context);
            if (infoRequestAdvertisingIdInfo != null) {
                return TextUtils.equals(str, infoRequestAdvertisingIdInfo.getId()) && z10 == infoRequestAdvertisingIdInfo.isLimitAdTrackingEnabled();
            }
            Log.w("AdIdClient", "info is null");
            return false;
        } catch (Throwable unused) {
            throw new AdIdVerifyException("Something wrong with verification, please try later.");
        }
    }
}
