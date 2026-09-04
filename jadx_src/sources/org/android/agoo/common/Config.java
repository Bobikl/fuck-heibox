package org.android.agoo.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.utl.ALog;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class Config {
    public static final String AGOO_CLEAR_TIME = "agoo_clear_time";
    public static final String AGOO_UNREPORT_TIMES = "agoo_UnReport_times";
    public static final String KEY_DEVICE_TOKEN = "deviceId";
    public static final String PREFERENCES = "Agoo_AppStore";
    public static final String PROPERTY_APP_KEY = "agoo_app_key";
    public static final String PROPERTY_APP_VERSION = "app_version";
    public static final String PROPERTY_DEVICE_TOKEN = "app_device_token";
    public static final String PROPERTY_PUSH_USER_TOKEN = "app_push_user_token";
    public static final String PROPERTY_SECRET_KEY = "agoo_secret";
    public static final String PROPERTY_TT_ID = "app_tt_id";
    public static final String TAG = "Config";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f132807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f132808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f132809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f132810d;

    public static String a(Context context) {
        String string = f132808b;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_APP_KEY, f132808b);
        } catch (Throwable th2) {
            ALog.e(TAG, "getAgooAppKey", th2, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.e(TAG, "getAgooAppKey null!!", new Object[0]);
        }
        ALog.d(TAG, "getAgooAppKey", "appkey", string);
        return string;
    }

    public static void a(Context context, int i10) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES, 4);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(AGOO_UNREPORT_TIMES, sharedPreferences.getInt(AGOO_UNREPORT_TIMES, 0) + i10);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, long j10) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putLong(AGOO_CLEAR_TIME, j10);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                ALog.e(TAG, "setAgooMessageSecret secret null", new Object[0]);
                return;
            }
            if (!TextUtils.isEmpty(f132809c)) {
                if (TextUtils.equals(str, f132809c)) {
                    return;
                }
                ALog.e(TAG, "setAgooMessageSecret error!", "new", str, "old", f132809c);
            } else {
                f132809c = str;
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
                editorEdit.putString(PROPERTY_SECRET_KEY, f132809c);
                editorEdit.apply();
                ALog.d(TAG, "setAgooMessageSecret", "secret", str);
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "setAgooMessageSecret", th2, new Object[0]);
        }
    }

    public static String b(Context context) {
        String string = f132809c;
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_SECRET_KEY, f132809c);
        } catch (Throwable th2) {
            ALog.e(TAG, "getAgooMessageSecret", th2, new Object[0]);
        }
        if (TextUtils.isEmpty(string)) {
            ALog.e(TAG, "getAgooMessageSecret null!!", new Object[0]);
        }
        ALog.d(TAG, "getAgooMessageSecret", "secret", string);
        return string;
    }

    public static void b(Context context, String str) {
        ALog.i(TAG, "setDeviceToken", "token", str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f132810d = str;
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putString("deviceId", str);
            editorEdit.apply();
        } catch (Throwable th2) {
            ALog.e(TAG, "setDeviceToken", th2, new Object[0]);
        }
    }

    public static boolean b(Context context, long j10) {
        try {
            long j11 = context.getSharedPreferences(PREFERENCES, 4).getLong(AGOO_CLEAR_TIME, 0L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("now=");
            sb2.append(j10);
            sb2.append(",now - lastTime=");
            long j12 = j10 - j11;
            sb2.append(j12);
            sb2.append(",istrue=");
            sb2.append(j12 > 86400000);
            ALog.d("isClearTime", sb2.toString(), new Object[0]);
            return j10 != 0 && j12 > 86400000;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String c(Context context) {
        return TextUtils.isEmpty(f132807a) ? ACCSManager.getDefaultConfig(context) : f132807a;
    }

    public static void c(Context context, String str) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            if (!TextUtils.isEmpty(str)) {
                editorEdit.putString(PROPERTY_PUSH_USER_TOKEN, str);
            }
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static boolean d(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0) > 0;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void e(Context context) {
        try {
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
            editorEdit.putInt(AGOO_UNREPORT_TIMES, 0);
            editorEdit.apply();
        } catch (Throwable unused) {
        }
    }

    public static int f(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getInt(AGOO_UNREPORT_TIMES, 0);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static String g(Context context) {
        String string = f132810d;
        try {
            string = context.getSharedPreferences(PREFERENCES, 4).getString("deviceId", f132810d);
        } catch (Throwable th2) {
            ALog.e(TAG, "getDeviceToken", th2, new Object[0]);
        }
        ALog.i(TAG, "getDeviceToken", "token", string);
        return string;
    }

    public static String h(Context context) {
        try {
            return context.getSharedPreferences(PREFERENCES, 4).getString(PROPERTY_PUSH_USER_TOKEN, "");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void setAgooAppKey(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                ALog.e(TAG, "setAgooAppKey appkey null", new Object[0]);
                return;
            }
            if (!TextUtils.isEmpty(f132808b)) {
                if (TextUtils.equals(str, f132808b)) {
                    return;
                }
                ALog.e(TAG, "setAgooAppKey error!", "new", str, "old", f132808b);
            } else {
                f132808b = str;
                SharedPreferences.Editor editorEdit = context.getSharedPreferences(PREFERENCES, 4).edit();
                editorEdit.putString(PROPERTY_APP_KEY, str);
                editorEdit.apply();
                ALog.d(TAG, "setAgooAppKey", "appkey", str);
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "setAgooAppKey", th2, new Object[0]);
        }
    }
}
