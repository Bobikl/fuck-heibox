package com.taobao.aranger.logs;

import android.util.Log;
import com.taobao.tlog.adapter.AdapterForTLog;

/* JADX INFO: loaded from: classes4.dex */
public final class IPCLog {
    private static final String PRE_TAG = "ARanger.";
    private static final String TLOG_CLASS = "com.taobao.tlog.adapter.AdapterForTLog";
    private static boolean isTlogValid = false;
    private static volatile boolean isUseTlog = true;

    static {
        try {
            Class.forName(TLOG_CLASS);
            isTlogValid = true;
        } catch (Exception unused) {
            isTlogValid = false;
        }
    }

    private static String buildLogMsg(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder(64);
        if (str != null) {
            sb2.append(str);
        }
        if (objArr != null) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (i11 >= objArr.length) {
                    break;
                }
                sb2.append(" ");
                Object obj = objArr[i10];
                if (obj == null) {
                    obj = "";
                }
                sb2.append(obj);
                sb2.append(":");
                Object obj2 = objArr[i11];
                if (obj2 == null) {
                    obj2 = "";
                }
                sb2.append(obj2);
                i10 += 2;
            }
            if (i10 < objArr.length) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    private static String buildLogTag(String str) {
        return PRE_TAG + str;
    }

    public static void d(String str, String str2, String str3, Object... objArr) {
        if (isTlogValid && isUseTlog) {
            AdapterForTLog.logd(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.d(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    public static void e(String str, String str2, Throwable th2, Object... objArr) {
        if (isTlogValid && isUseTlog) {
            AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr), th2);
        } else {
            Log.e(buildLogTag(str), buildLogMsg(str2, objArr), th2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        if (isTlogValid && isUseTlog) {
            AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.e(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (isTlogValid && isUseTlog) {
            AdapterForTLog.logi(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.i(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    public static void setUseTlog(boolean z10) {
        isUseTlog = z10;
    }

    static void w(String str, String str2, Throwable th2, Object... objArr) {
        if (isTlogValid && isUseTlog) {
            AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr), th2);
        } else {
            Log.w(buildLogTag(str), buildLogMsg(str2, objArr), th2);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        if (isTlogValid && isUseTlog) {
            AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.w(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }
}
