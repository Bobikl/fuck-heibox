package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.accs.client.AccsConfig;
import com.taobao.accs.common.Constants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class v {
    public static final String SP_AGOO_BIND_FILE_NAME = "AGOO_BIND";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f98521a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f98522b = new byte[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f98523c = -1;

    public static String a(Context context, String str, String str2) {
        String string = null;
        try {
            synchronized (f98522b) {
                string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString(str, null);
            }
            ALog.i("Utils", "getSpValue", "value", string);
            if (TextUtils.isEmpty(string)) {
                ALog.e("Utils", "getSpValue use default!", new Object[0]);
                return str2;
            }
        } catch (Throwable th2) {
            ALog.e("Utils", "getSpValue fail", th2, new Object[0]);
        }
        return string;
    }

    @Deprecated
    public static void a() {
        try {
            AccsConfig.build();
        } catch (Throwable th2) {
            ALog.e("Utils", "initConfig", th2, new Object[0]);
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x001d */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r3, int r4) {
        /*
            r0 = 0
            byte[] r1 = com.taobao.accs.utl.v.f98522b     // Catch: java.lang.Throwable -> L1d
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L1d
            com.taobao.accs.utl.v.f98521a = r4     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "ACCS_SDK"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r2, r0)     // Catch: java.lang.Throwable -> L1a
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "debug_mode"
            r3.putInt(r2, r4)     // Catch: java.lang.Throwable -> L1a
            r3.apply()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            goto L28
        L1a:
            r3 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r3     // Catch: java.lang.Throwable -> L1d
        L1d:
            r3 = move-exception
            java.lang.String r4 = "Utils"
            java.lang.String r1 = "setMode"
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.taobao.accs.utl.ALog.e(r4, r1, r3, r0)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.v.a(android.content.Context, int):void");
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        if (f98523c == -1) {
            f98523c = context.getApplicationInfo().targetSdkVersion;
        }
        return f98523c >= 26 && Build.VERSION.SDK_INT >= 26;
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Context context) {
        int i10;
        int i11 = f98521a;
        if (i11 != -1) {
            return i11;
        }
        try {
            try {
                synchronized (f98522b) {
                    try {
                        i10 = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getInt(Constants.SP_KEY_DEBUG_MODE, 0);
                        return i10;
                    } catch (Throwable th2) {
                        th = th2;
                        context = null;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            th = th3;
                            ALog.e("Utils", "getMode", th, new Object[0]);
                            i10 = context;
                            return i10;
                        }
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            context = null;
        }
    }

    public static void c(Context context) {
        try {
            synchronized (f98522b) {
                try {
                    SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
                    editorEdit.clear();
                    editorEdit.apply();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            ALog.e("Utils", "clearAllSharePreferences", th3, new Object[0]);
        }
    }

    public static void d(Context context) {
        try {
            UtilityImpl.killService(context);
        } catch (Throwable th2) {
            ALog.e("Utils", "killService", th2, new Object[0]);
        }
    }

    public static boolean e(Context context) {
        boolean zIsMainProcess;
        try {
            zIsMainProcess = UtilityImpl.isMainProcess(context);
        } catch (Throwable th2) {
            ALog.e("Utils", "killservice", th2, new Object[0]);
            th2.printStackTrace();
            zIsMainProcess = true;
        }
        ALog.i("Utils", "isMainProcess", "result", Boolean.valueOf(zIsMainProcess));
        return zIsMainProcess;
    }

    public static void f(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences("AGOO_BIND", 0).edit();
            editorEdit.clear();
            editorEdit.apply();
        } catch (Exception e10) {
            ALog.e("Utils", "clearAgooBindCache", e10, new Object[0]);
        }
    }
}
