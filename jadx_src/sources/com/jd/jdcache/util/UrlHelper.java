package com.jd.jdcache.util;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.tencent.qcloud.core.util.IOUtils;
import com.xiaomi.mipush.sdk.Constants;
import dl.d;
import dl.e;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: UrlHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nUrlHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlHelper.kt\ncom/jd/jdcache/util/UrlHelper\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,102:1\n384#2,4:103\n215#3,2:107\n*S KotlinDebug\n*F\n+ 1 UrlHelper.kt\ncom/jd/jdcache/util/UrlHelper\n*L\n53#1:103,4\n86#1:107,2\n*E\n"})
@Keep
public final class UrlHelper {

    @d
    public static final UrlHelper INSTANCE = new UrlHelper();

    @d
    public static final String METHOD_DELETE = "DELETE";

    @d
    public static final String METHOD_GET = "GET";

    @d
    public static final String METHOD_HEAD = "HEAD";

    @d
    public static final String METHOD_OPTIONS = "OPTIONS";

    @d
    public static final String METHOD_PATCH = "PATCH";

    @d
    public static final String METHOD_POST = "POST";

    @d
    public static final String METHOD_PUT = "PUT";

    @d
    public static final String METHOD_TRACE = "TRACE";

    private UrlHelper() {
    }

    @e
    public final Map<String, String> convertHeader(@e Map<String, ? extends List<String>> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry<String, ? extends List<String>> entry : map.entrySet()) {
            List<String> value = entry.getValue();
            StringBuilder sb2 = new StringBuilder();
            for (String str : value) {
                if (str != null) {
                    if (sb2.length() > 0) {
                        sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    sb2.append(str);
                }
            }
            String key = entry.getKey();
            String string = sb2.toString();
            f0.o(string, "toString(...)");
            map2.put(key, string);
        }
        return map2;
    }

    @e
    public final String getFileNameFromUrl(@d String str) {
        int iG3;
        f0.p(str, "<this>");
        if (u.K1(str, "/", false, 2, null) || (iG3 = StringsKt__StringsKt.G3(str, "/", 0, false, 6, null)) == -1) {
            return null;
        }
        String strSubstring = str.substring(iG3 + 1);
        f0.o(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }

    public final boolean matchHostPath(@e Uri uri, @e Uri uri2) {
        if (u.L1(safeUrlPart(uri != null ? uri.getHost() : null), safeUrlPart(uri2 != null ? uri2.getHost() : null), true)) {
            if (u.L1(safeUrlPart(uri != null ? uri.getPath() : null), safeUrlPart(uri2 != null ? uri2.getPath() : null), false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003a  */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    @e
    public final String safeUrlPart(@e String str) {
        String string;
        String strSubstring;
        if (str == null || (string = StringsKt__StringsKt.R5(str).toString()) == null) {
            return str;
        }
        for (int iJ3 = StringsKt__StringsKt.j3(string); -1 < iJ3; iJ3--) {
            char cCharAt = string.charAt(iJ3);
            if (!(cCharAt == '/' || cCharAt == ' ')) {
                strSubstring = string.substring(0, iJ3 + 1);
                f0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (strSubstring == null) {
                    return str;
                }
                return strSubstring;
            }
        }
        strSubstring = "";
        if (strSubstring == null) {
            return str;
        }
        return strSubstring;
    }

    @d
    public final String urlToKey(@d Uri uri) {
        f0.p(uri, "<this>");
        String scheme = uri.getScheme();
        String strSafeUrlPart = safeUrlPart(uri.getHost());
        if ((!u.L1("https", scheme, true) && !u.L1("http", scheme, true)) || TextUtils.isEmpty(strSafeUrlPart)) {
            String string = uri.toString();
            f0.m(string);
            return string;
        }
        String strSafeUrlPart2 = safeUrlPart(uri.getPath());
        if (strSafeUrlPart2 != null) {
            if (!u.v2(strSafeUrlPart2, "/", false, 2, null)) {
                strSafeUrlPart2 = IOUtils.DIR_SEPARATOR_UNIX + strSafeUrlPart2;
            }
            if (strSafeUrlPart2 != null) {
                return strSafeUrlPart2;
            }
        }
        return "";
    }

    @d
    public final String urlToKey(@d String str) {
        f0.p(str, "<this>");
        try {
            Uri uri = Uri.parse(str);
            f0.o(uri, "parse(...)");
            return urlToKey(uri);
        } catch (Exception unused) {
            return str;
        }
    }
}
