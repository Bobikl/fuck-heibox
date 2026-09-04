package com.sankuai.waimai.router.utils;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.n0;
import anet.channel.util.HttpConstant;
import com.tencent.qcloud.core.util.IOUtils;
import java.util.Map;

/* JADX INFO: compiled from: RouterUtils.java */
/* JADX INFO: loaded from: classes8.dex */
public class f {
    public static Uri a(Uri uri, Map<String, String> map) {
        if (uri != null && map != null && !map.isEmpty()) {
            Uri.Builder builderBuildUpon = uri.buildUpon();
            try {
                for (String str : map.keySet()) {
                    if (!TextUtils.isEmpty(str) && uri.getQueryParameter(str) == null) {
                        builderBuildUpon.appendQueryParameter(str, map.get(str));
                    }
                }
                return builderBuildUpon.build();
            } catch (Exception e10) {
                com.sankuai.waimai.router.core.c.e(e10);
            }
        }
        return uri;
    }

    public static String b(String str) {
        if (str == null || str.startsWith("/")) {
            return str;
        }
        return IOUtils.DIR_SEPARATOR_UNIX + str;
    }

    public static boolean c(Object[] objArr) {
        return objArr == null || objArr.length == 0;
    }

    public static String d(Uri uri) {
        if (uri == null) {
            return null;
        }
        return e(uri.getScheme(), uri.getHost());
    }

    @n0
    public static String e(String str, String str2) {
        return g(f(str)) + HttpConstant.SCHEME_SPLIT + g(f(str2));
    }

    public static String f(String str) {
        return TextUtils.isEmpty(str) ? str : str.toLowerCase();
    }

    public static String g(String str) {
        return str == null ? "" : str;
    }
}
