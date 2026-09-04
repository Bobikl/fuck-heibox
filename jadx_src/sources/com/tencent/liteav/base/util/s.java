package com.tencent.liteav.base.util;

import android.text.TextUtils;
import android.util.Log;
import com.max.xiaoheihe.loader.dynamic_so.DynamicSoManager;

/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f99733a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f99734b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f99735c = "";

    public static boolean a() {
        boolean z10;
        synchronized (f99733a) {
            if (!f99734b) {
                TextUtils.isEmpty("txsoundtouch");
                Log.w("SoLoader", "load library txsoundtouch " + a("txsoundtouch"));
                TextUtils.isEmpty("txffmpeg");
                Log.w("SoLoader", "load library txffmpeg " + a("txffmpeg"));
                TextUtils.isEmpty("liteavsdk");
                f99734b = a("liteavsdk");
                Log.w("SoLoader", "load library liteavsdk " + f99734b);
            }
            z10 = f99734b;
        }
        return z10;
    }

    public static boolean a(String str) {
        try {
            if (!TextUtils.isEmpty(f99735c) ? a(f99735c, str) : false) {
                return true;
            }
            Log.w("SoLoader", "load library " + str + " from system path ");
            System.loadLibrary(str);
            return true;
        } catch (Error e10) {
            Log.w("SoLoader", "load library : " + e10.toString());
            return false;
        } catch (Exception e11) {
            Log.w("SoLoader", "load library : " + e11.toString());
            return false;
        }
    }

    private static boolean a(String str, String str2) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Log.w("SoLoader", "load library " + str2 + " from path " + str);
            System.load(str + "/lib" + str2 + DynamicSoManager.f77250e);
            return true;
        } catch (Error e10) {
            Log.w("SoLoader", "load library : " + e10.toString());
            return false;
        } catch (Exception e11) {
            Log.w("SoLoader", "load library : " + e11.toString());
            return false;
        }
    }

    public static String b() {
        return f99735c;
    }

    public static void b(String str) {
        Log.w("SoLoader", "setLibraryPath ".concat(String.valueOf(str)));
        f99735c = str;
    }
}
