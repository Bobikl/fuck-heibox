package com.tencent.thumbplayer.tcmedia.utils;

import android.text.TextUtils;
import android.util.Log;
import com.tencent.thumbplayer.tcmedia.api.TPPlayerMgr;
import java.util.MissingFormatArgumentException;

/* JADX INFO: loaded from: classes4.dex */
public class TPLogUtil {
    public static final int DEBUG = 50;
    public static final int ERROR = 10;
    public static final int INFO = 40;
    public static final int VERBOSE = 60;
    public static final int WARNING = 20;
    private static boolean isDebug = true;
    private static int logPrintLevel = 50;
    private static TPPlayerMgr.OnLogListener onLogListener;

    public static void d(String str, String str2) {
        printTag(50, str, str2, new Object[0]);
    }

    public static void e(String str, String str2) {
        printTag(10, str, str2, new Object[0]);
    }

    public static void e(String str, Throwable th2) {
        e(str, th2, "");
    }

    public static void e(String str, Throwable th2, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "";
        } else {
            str3 = str2 + "\n";
        }
        if (th2 != null) {
            str3 = str3 + Log.getStackTraceString(th2);
        }
        printTag(10, str, str3, new Object[0]);
    }

    public static void i(String str, String str2) {
        printTag(40, str, str2, new Object[0]);
    }

    private static void logToLogListener(int i10, String str, String str2) {
        if (i10 == 10) {
            onLogListener.e(str, str2);
            return;
        }
        if (i10 == 20) {
            onLogListener.w(str, str2);
            return;
        }
        if (i10 == 40) {
            onLogListener.i(str, str2);
        } else if (i10 == 50) {
            onLogListener.d(str, str2);
        } else {
            if (i10 != 60) {
                return;
            }
            onLogListener.v(str, str2);
        }
    }

    private static void printTag(int i10, String str, String str2, Object... objArr) {
        if (i10 == 20) {
            i10 = 10;
        }
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    str2 = String.format(str2, objArr);
                }
            } catch (OutOfMemoryError e10) {
                e10.printStackTrace();
                return;
            } catch (MissingFormatArgumentException e11) {
                e11.printStackTrace();
                return;
            } catch (Exception e12) {
                e12.printStackTrace();
                return;
            }
        }
        if (onLogListener != null) {
            if (i10 <= logPrintLevel) {
                logToLogListener(i10, str, str2);
            }
        } else {
            if (!isDebug || i10 > logPrintLevel) {
                return;
            }
            Log.println(toSysLevel(i10), str, str2);
        }
    }

    public static void setDebugEnable(boolean z10) {
        isDebug = z10;
    }

    public static void setLogPrintLevel(int i10) {
        logPrintLevel = i10;
    }

    public static void setOnLogListener(TPPlayerMgr.OnLogListener onLogListener2) {
        onLogListener = onLogListener2;
    }

    private static int toSysLevel(int i10) {
        if (i10 == 10) {
            return 6;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 == 40) {
            return 4;
        }
        if (i10 != 50) {
            return i10 != 60 ? 0 : 2;
        }
        return 3;
    }

    public static void v(String str, String str2) {
        printTag(60, str, str2, new Object[0]);
    }

    public static void w(String str, String str2) {
        printTag(20, str, str2, new Object[0]);
    }
}
