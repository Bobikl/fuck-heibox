package com.taobao.downloader.util;

import android.util.Log;
import com.taobao.downloader.Configuration;
import com.taobao.downloader.adpater.Logger;
import java.util.StringTokenizer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class LogUtil {
    private static String PREFIX = "DLoader.";

    private static String appendLogMessage(String str, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return str;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "{}");
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = str.indexOf("{}") == 0;
        for (Object obj : objArr) {
            String string = getString(obj);
            if (stringTokenizer.hasMoreTokens()) {
                String strNextToken = stringTokenizer.nextToken();
                if (z10) {
                    sb2.append(string);
                    sb2.append(strNextToken);
                } else {
                    sb2.append(strNextToken);
                    sb2.append(string);
                }
            } else {
                sb2.append("|");
                sb2.append(string);
            }
        }
        return sb2.toString();
    }

    @Deprecated
    public static void debug(String str, String str2, Object... objArr) {
        if (Configuration.logDebugEnabled) {
            Logger logger = Configuration.logger;
            if (logger != null) {
                logger.debug(PREFIX + str, appendLogMessage(str2, objArr));
                return;
            }
            Log.d(PREFIX + str + ":" + Thread.currentThread().getId(), appendLogMessage(str2, objArr));
        }
    }

    @Deprecated
    public static void error(String str, String str2, Throwable th2) {
        Logger logger = Configuration.logger;
        if (logger != null) {
            logger.error(PREFIX + str, str2, th2);
            return;
        }
        Log.e(PREFIX + str, str2, th2);
    }

    @Deprecated
    public static void error(String str, String str2, Object... objArr) {
        Logger logger = Configuration.logger;
        if (logger != null) {
            logger.error(PREFIX + str, appendLogMessage(str2, objArr));
            return;
        }
        Log.e(PREFIX + str, appendLogMessage(str2, objArr));
    }

    private static String getString(Object obj) {
        if (obj instanceof byte[]) {
            return new String((byte[]) obj);
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        try {
            return obj.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Deprecated
    public static void warn(String str, String str2, Object... objArr) {
        Logger logger = Configuration.logger;
        if (logger != null) {
            logger.error(PREFIX + str, appendLogMessage(str2, objArr));
            return;
        }
        Log.w(PREFIX + str, appendLogMessage(str2, objArr));
    }
}
