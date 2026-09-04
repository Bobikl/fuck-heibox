package com.taobao.accs.antibrush;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.client.GlobalConfig;
import com.taobao.accs.utl.ALog;
import java.util.StringTokenizer;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static final String KEY_SEC = "sec";
    public static final String TAG = "CookieMgr";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static CookieManager f98161a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile boolean f98162b = false;

    public static synchronized String a(String str) {
        try {
            String strB = null;
            if (!a()) {
                ALog.e(TAG, "cookieMgr not setup", new Object[0]);
                return null;
            }
            try {
                strB = b(f98161a.getCookie(str));
            } catch (Throwable th2) {
                ALog.e(TAG, "get cookie failed. url=" + str, th2, new Object[0]);
            }
            return strB;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static synchronized void a(Context context) {
        try {
            if (!GlobalConfig.enableCookie) {
                ALog.i(TAG, "disable cookie", new Object[0]);
            } else {
                if (f98162b) {
                    return;
                }
                CookieManager cookieManager = CookieManager.getInstance();
                f98161a = cookieManager;
                cookieManager.setAcceptCookie(true);
                f98162b = true;
            }
        } catch (Throwable th2) {
            ALog.e(TAG, "setup", th2, new Object[0]);
        }
    }

    private static boolean a() {
        Context context;
        if (!f98162b && (context = GlobalClientInfo.f98171a) != null) {
            a(context);
        }
        return f98162b;
    }

    public static String b(String str) {
        String strC = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
        do {
            try {
                String strNextToken = stringTokenizer.nextToken();
                int iIndexOf = strNextToken.indexOf(61);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Invalid cookie name-value pair");
                }
                String strTrim = strNextToken.substring(0, iIndexOf).trim();
                String strTrim2 = strNextToken.substring(iIndexOf + 1).trim();
                if (KEY_SEC.equals(strTrim)) {
                    strC = c(strTrim2);
                }
            } catch (Throwable th2) {
                ALog.e(TAG, "parse", th2, new Object[0]);
            }
            return strC;
        } while (stringTokenizer.hasMoreTokens());
        return strC;
    }

    private static String c(String str) {
        if (str == null || str.length() <= 2 || str.charAt(0) != '\"' || str.charAt(str.length() - 1) != '\"') {
            return (str == null || str.length() <= 2 || str.charAt(0) != '\'' || str.charAt(str.length() - 1) != '\'') ? str : str.substring(1, str.length() - 1);
        }
        return str.substring(1, str.length() - 1);
    }
}
