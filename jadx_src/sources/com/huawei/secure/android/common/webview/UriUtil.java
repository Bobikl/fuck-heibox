package com.huawei.secure.android.common.webview;

import android.annotation.TargetApi;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.URLUtil;
import com.huawei.secure.android.common.util.LogsUtil;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes7.dex */
public class UriUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63128a = "UriUtil";

    private static String a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return !URLUtil.isNetworkUrl(str) ? str : getHostByURI(str);
        }
        LogsUtil.i(f63128a, "whiteListUrl is null");
        return null;
    }

    @TargetApi(9)
    public static String getHostByURI(String str) {
        if (TextUtils.isEmpty(str)) {
            LogsUtil.i(f63128a, "url is null");
            return str;
        }
        try {
            if (URLUtil.isNetworkUrl(str)) {
                return new URL(str.replaceAll("[\\\\#]", "/")).getHost();
            }
            LogsUtil.e(f63128a, "url don't starts with http or https");
            return "";
        } catch (MalformedURLException e10) {
            LogsUtil.e(f63128a, "getHostByURI error  MalformedURLException : " + e10.getMessage());
            return "";
        }
    }

    public static boolean isUrlHostAndPathInWhitelist(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.e(f63128a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (isUrlHostAndPathMatchWhitelist(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlHostAndPathMatchWhitelist(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if (!str.contains("..") && !str.contains("@")) {
                if (!str2.equals(str)) {
                    if (!str.startsWith(str2 + "?")) {
                        if (!str.startsWith(str2 + "#")) {
                            if (!str2.endsWith("/")) {
                                return false;
                            }
                            if (Uri.parse(str).getPathSegments().size() - Uri.parse(str2).getPathSegments().size() != 1) {
                                return false;
                            }
                            return str.startsWith(str2);
                        }
                    }
                }
                return true;
            }
            Log.e(f63128a, "url contains unsafe char");
        }
        return false;
    }

    public static boolean isUrlHostInWhitelist(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.e(f63128a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (isUrlHostMatchWhitelist(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isUrlHostMatchWhitelist(String str, String str2) {
        String hostByURI = getHostByURI(str);
        if (TextUtils.isEmpty(hostByURI) || TextUtils.isEmpty(str2)) {
            LogsUtil.e(f63128a, "url or whitelist is null");
            return false;
        }
        String strA = a(str2);
        if (TextUtils.isEmpty(strA)) {
            Log.e(f63128a, "whitelist host is null");
            return false;
        }
        if (strA.equals(hostByURI)) {
            return true;
        }
        if (hostByURI.endsWith(strA)) {
            try {
                String strSubstring = hostByURI.substring(0, hostByURI.length() - strA.length());
                if (strSubstring.endsWith(".")) {
                    return strSubstring.matches("^[A-Za-z0-9.-]+$");
                }
                return false;
            } catch (IndexOutOfBoundsException e10) {
                LogsUtil.e(f63128a, "IndexOutOfBoundsException" + e10.getMessage());
            } catch (Exception e11) {
                LogsUtil.e(f63128a, "Exception : " + e11.getMessage());
                return false;
            }
        }
        return false;
    }

    public static boolean isUrlHostSameWhitelist(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return TextUtils.equals(getHostByURI(str), a(str2));
        }
        Log.e(f63128a, "isUrlHostSameWhitelist: url or host is null");
        return false;
    }

    public static boolean isUrlHostSameWhitelist(String str, String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            LogsUtil.e(f63128a, "whitelist is null");
            return false;
        }
        for (String str2 : strArr) {
            if (isUrlHostSameWhitelist(str, str2)) {
                return true;
            }
        }
        return false;
    }
}
