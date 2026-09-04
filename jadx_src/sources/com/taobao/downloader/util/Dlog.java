package com.taobao.downloader.util;

import android.util.Log;
import com.taobao.downloader.Configuration;
import com.taobao.downloader.adpater.Logger;

/* JADX INFO: loaded from: classes4.dex */
public class Dlog {
    private static String preTag = "DLoader.";

    private static String buildLogMsg(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        if (str != null) {
            sb2.append(" ");
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
                sb2.append(formatKv(objArr[i10], objArr[i11]));
                i10 = i11 + 1;
            }
            if (i10 == objArr.length - 1) {
                sb2.append(" ");
                sb2.append(objArr[i10]);
            }
        }
        return sb2.toString();
    }

    private static String buildLogTag(String str) {
        return preTag + str;
    }

    public static void d(String str, String str2, Object... objArr) {
        if (Configuration.logDebugEnabled) {
            Logger logger = Configuration.logger;
            if (logger != null) {
                logger.debug(buildLogTag(str), buildLogMsg(str2, objArr));
            } else {
                Log.d(buildLogTag(str), buildLogMsg(str2, objArr));
            }
        }
    }

    public static void e(String str, String str2, Throwable th2, Object... objArr) {
        Logger logger = Configuration.logger;
        if (logger != null) {
            logger.error(buildLogTag(str), buildLogMsg(str2, objArr), th2);
        } else {
            Log.e(buildLogTag(str), str2, th2);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        Logger logger = Configuration.logger;
        if (logger != null) {
            logger.error(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.e(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }

    private static String formatKv(Object obj, Object obj2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb2.append(obj);
        sb2.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb2.append(obj2);
        return sb2.toString();
    }

    public static void i(String str, String str2, Object... objArr) {
        if (Configuration.logDebugEnabled) {
            Logger logger = Configuration.logger;
            if (logger != null) {
                logger.info(buildLogTag(str), buildLogMsg(str2, objArr));
            } else {
                Log.i(buildLogTag(str), buildLogMsg(str2, objArr));
            }
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        Logger logger = Configuration.logger;
        if (logger != null) {
            logger.warn(buildLogTag(str), buildLogMsg(str2, objArr));
        } else {
            Log.w(buildLogTag(str), buildLogMsg(str2, objArr));
        }
    }
}
