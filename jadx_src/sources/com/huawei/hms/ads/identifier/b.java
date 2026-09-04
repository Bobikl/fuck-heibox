package com.huawei.hms.ads.identifier;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f60348a = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_scp/get").build();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f60349b = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid/query").build();

    public static AdvertisingIdClient.Info a(final Context context) {
        if (context == null || !a(context, f60348a)) {
            return null;
        }
        String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid_c");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        final d.a aVarA = d.a.a(context);
        String strA = aVarA.a();
        if (TextUtils.isEmpty(strA)) {
            Log.d("InfoProviderUtil", "scp is empty");
            e.f60369a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.b.1
                @Override // java.lang.Runnable
                public void run() {
                    if (aVarA.c()) {
                        Log.d("InfoProviderUtil", "within key update interval.");
                        return;
                    }
                    aVarA.b();
                    aVarA.a(b.e(context));
                }
            });
            if (aVarA.e()) {
                return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            }
            aVarA.d();
            return null;
        }
        String strA2 = d.a(string, strA);
        if (!TextUtils.isEmpty(strA2)) {
            return new AdvertisingIdClient.Info(strA2, "00000000-0000-0000-0000-000000000000".equalsIgnoreCase(strA2));
        }
        Log.d("InfoProviderUtil", "decrypt oaid failed.");
        e.f60369a.execute(new Runnable() { // from class: com.huawei.hms.ads.identifier.b.2
            @Override // java.lang.Runnable
            public void run() {
                aVarA.a(b.e(context));
            }
        });
        return null;
    }

    private static boolean a(Context context, Uri uri) {
        Integer numB;
        if (context == null || uri == null || (numB = e.b(context)) == null || 30462100 > numB.intValue()) {
            return false;
        }
        return e.a(context, uri);
    }

    public static AdvertisingIdClient.Info b(Context context) {
        if (context == null || !c(context)) {
            return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(f60349b, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("oaid");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("limit_track");
                String string = cursorQuery.getString(columnIndexOrThrow);
                AdvertisingIdClient.Info info = new AdvertisingIdClient.Info(string, "00000000-0000-0000-0000-000000000000".equalsIgnoreCase(string) ? true : Boolean.valueOf(cursorQuery.getString(columnIndexOrThrow2)).booleanValue());
                e.a(cursorQuery);
                return info;
            }
            AdvertisingIdClient.Info info2 = new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            e.a(cursorQuery);
            return info2;
        } catch (Throwable th2) {
            try {
                Log.w("InfoProviderUtil", "query oaid via provider ex: " + th2.getClass().getSimpleName());
                return new AdvertisingIdClient.Info("00000000-0000-0000-0000-000000000000", true);
            } finally {
                e.a((Closeable) null);
            }
        }
    }

    public static boolean c(Context context) {
        return a(context, f60349b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        Cursor cursorQuery = null;
        try {
            cursorQuery = context.getContentResolver().query(f60348a, null, null, null, null);
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("op_wk"));
                e.a(cursorQuery);
                return string;
            }
            e.a(cursorQuery);
            return "";
        } catch (Throwable th2) {
            try {
                Log.w("InfoProviderUtil", "get remote key ex: " + th2.getClass().getSimpleName());
                return "";
            } finally {
                e.a(cursorQuery);
            }
        }
    }
}
