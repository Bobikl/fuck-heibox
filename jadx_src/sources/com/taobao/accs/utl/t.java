package com.taobao.accs.utl;

import android.content.Context;
import android.content.SharedPreferences;
import com.taobao.accs.common.Constants;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile Long f98518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile Integer f98519b;

    static long a(Context context) {
        if (f98518a == null) {
            try {
                f98518a = Long.valueOf(context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getLong(Constants.SP_KEY_LAST_LAUNCH_TIME, 0L));
            } catch (Throwable th2) {
                ALog.e("OrangeAdapter", "getLastActiveTime", th2, new Object[0]);
            }
            ALog.d("OrangeAdapter", "getLastActiveTime", "result", f98518a);
        }
        return f98518a.longValue();
    }

    static void a(Context context, long j10) {
        try {
            f98518a = Long.valueOf(j10);
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putLong(Constants.SP_KEY_LAST_LAUNCH_TIME, j10);
            editorEdit.apply();
        } catch (Throwable th2) {
            ALog.e("OrangeAdapter", "saveLastActiveTime fail:", th2, "lastLaunchTime", Long.valueOf(j10));
        }
    }

    public static void a(Context context, String str, int i10) {
        try {
            if (context == null) {
                ALog.e("OrangeAdapter", "saveTLogOffToSP context null", new Object[0]);
                return;
            }
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
            editorEdit.putInt(str, i10);
            editorEdit.apply();
            ALog.i("OrangeAdapter", "saveConfigToSP", "key", str, "value", Integer.valueOf(i10));
        } catch (Exception e10) {
            ALog.e("OrangeAdapter", "saveConfigToSP fail:", e10, "key", str, "value", Integer.valueOf(i10));
        }
    }

    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static long d() {
        if (f98519b == null) {
            f98519b = 10000;
            ALog.d("OrangeAdapter", "getConnectTimeout", "result", f98519b);
        }
        return f98519b.intValue();
    }

    public static boolean e() {
        return true;
    }
}
