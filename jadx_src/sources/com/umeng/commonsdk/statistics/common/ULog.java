package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Formatter;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class ULog {
    public static boolean DEBUG = false;
    private static final int LEVEL_DEBUG = 2;
    private static final int LEVEL_ERROR = 5;
    private static final int LEVEL_INFO = 3;
    private static final int LEVEL_VERBOSE = 1;
    private static final int LEVEL_WARN = 4;
    private static int LOG_MAXLENGTH = 2000;
    private static String TAG = "ULog";

    private ULog() {
    }

    public static void d(String str) {
        d(TAG, str, (Throwable) null);
    }

    public static void d(String str, String str2, Throwable th2) {
        if (DEBUG) {
            print(2, str, str2, th2);
        }
    }

    public static void d(String str, Throwable th2) {
        d(TAG, str, th2);
    }

    public static void d(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                d(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void d(Throwable th2) {
        d(TAG, (String) null, th2);
    }

    public static void d(Locale locale, String str, Object... objArr) {
        try {
            d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void e(String str) {
        e(TAG, str, (Throwable) null);
    }

    public static void e(String str, String str2, Throwable th2) {
        if (DEBUG) {
            print(5, str, str2, th2);
        }
    }

    public static void e(String str, Throwable th2) {
        e(TAG, str, th2);
    }

    public static void e(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                e(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void e(Throwable th2) {
        e(TAG, (String) null, th2);
    }

    public static void e(Locale locale, String str, Object... objArr) {
        try {
            e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static String getStackTrace(Throwable th2) {
        PrintWriter printWriter;
        StringWriter stringWriter = null;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter2);
                try {
                    th2.printStackTrace(printWriter);
                    printWriter.flush();
                    stringWriter2.flush();
                    String string = stringWriter2.toString();
                    try {
                        stringWriter2.close();
                    } catch (Throwable unused) {
                    }
                    printWriter.close();
                    return string;
                } catch (Throwable unused2) {
                    stringWriter = stringWriter2;
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    if (printWriter != null) {
                        printWriter.close();
                    }
                    return "";
                }
            } catch (Throwable unused4) {
                printWriter = null;
            }
        } catch (Throwable unused5) {
            printWriter = null;
        }
    }

    public static void i(String str) {
        i(TAG, str, (Throwable) null);
    }

    public static void i(String str, String str2, Throwable th2) {
        if (DEBUG) {
            print(3, str, str2, th2);
        }
    }

    public static void i(String str, Throwable th2) {
        i(TAG, str, th2);
    }

    public static void i(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                i(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void i(Throwable th2) {
        i(TAG, (String) null, th2);
    }

    public static void i(Locale locale, String str, Object... objArr) {
        try {
            i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th2) {
            e(th2);
        }
    }

    private static void print(int i10, String str, String str2, Throwable th2) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i11 = LOG_MAXLENGTH;
            int i12 = 0;
            int i13 = 0;
            while (i12 < 100) {
                if (length <= i11) {
                    if (i10 == 1) {
                        Log.v(str, str2.substring(i13, length));
                        break;
                    }
                    if (i10 == 2) {
                        Log.d(str, str2.substring(i13, length));
                        break;
                    }
                    if (i10 == 3) {
                        Log.i(str, str2.substring(i13, length));
                        break;
                    } else if (i10 == 4) {
                        Log.w(str, str2.substring(i13, length));
                        break;
                    } else {
                        if (i10 != 5) {
                            break;
                        }
                        Log.e(str, str2.substring(i13, length));
                        break;
                    }
                }
                if (i10 == 1) {
                    Log.v(str, str2.substring(i13, i11));
                } else if (i10 == 2) {
                    Log.d(str, str2.substring(i13, i11));
                } else if (i10 == 3) {
                    Log.i(str, str2.substring(i13, i11));
                } else if (i10 == 4) {
                    Log.w(str, str2.substring(i13, i11));
                } else if (i10 == 5) {
                    Log.e(str, str2.substring(i13, i11));
                }
                i12++;
                i13 = i11;
                i11 = LOG_MAXLENGTH + i11;
            }
        }
        if (th2 != null) {
            String stackTrace = getStackTrace(th2);
            if (TextUtils.isEmpty(stackTrace)) {
                return;
            }
            if (i10 == 1) {
                Log.v(str, stackTrace);
                return;
            }
            if (i10 == 2) {
                Log.d(str, stackTrace);
                return;
            }
            if (i10 == 3) {
                Log.i(str, stackTrace);
            } else if (i10 == 4) {
                Log.w(str, stackTrace);
            } else {
                if (i10 != 5) {
                    return;
                }
                Log.e(str, stackTrace);
            }
        }
    }

    public static void v(String str) {
        v(TAG, str, (Throwable) null);
    }

    public static void v(String str, String str2, Throwable th2) {
        if (DEBUG) {
            print(1, str, str2, th2);
        }
    }

    public static void v(String str, Throwable th2) {
        v(TAG, str, th2);
    }

    public static void v(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                v(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void v(Throwable th2) {
        v(TAG, (String) null, th2);
    }

    public static void v(Locale locale, String str, Object... objArr) {
        try {
            v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void w(String str) {
        w(TAG, str, (Throwable) null);
    }

    public static void w(String str, String str2, Throwable th2) {
        if (DEBUG) {
            print(4, str, str2, th2);
        }
    }

    public static void w(String str, Throwable th2) {
        w(TAG, str, th2);
    }

    public static void w(String str, Object... objArr) {
        try {
            if (str.contains("%")) {
                w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
            } else {
                w(str, objArr != null ? (String) objArr[0] : "", (Throwable) null);
            }
        } catch (Throwable th2) {
            e(th2);
        }
    }

    public static void w(Throwable th2) {
        w(TAG, (String) null, th2);
    }

    public static void w(Locale locale, String str, Object... objArr) {
        try {
            w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th2) {
            e(th2);
        }
    }
}
