package com.jd.jdcache;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Keep;
import com.jd.jdcache.entity.JDCacheDataSource;
import com.jd.jdcache.util.JDCacheLog;
import dl.d;
import dl.e;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: JDCacheParamsProvider.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nJDCacheParamsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDCacheParamsProvider.kt\ncom/jd/jdcache/JDCacheParamsProvider\n+ 2 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,68:1\n9#2,4:69\n*S KotlinDebug\n*F\n+ 1 JDCacheParamsProvider.kt\ncom/jd/jdcache/JDCacheParamsProvider\n*L\n39#1:69,4\n*E\n"})
@Keep
public abstract class JDCacheParamsProvider {
    @e
    public String getCacheDir() {
        Context contextA = c.f64138a.a();
        f0.m(contextA);
        return new File(contextA.getFilesDir().getPath(), "jdcache").getAbsolutePath();
    }

    @d
    public String getCookie(@e String str) {
        String cookie = CookieManager.getInstance().getCookie(str);
        return cookie == null ? "" : cookie;
    }

    @e
    public abstract String getUserAgent(@e String str);

    public boolean saveCookie(@e String str, @d List<String> cookies) {
        f0.p(cookies, "cookies");
        CookieManager cookieManager = CookieManager.getInstance();
        if (!cookieManager.acceptCookie()) {
            return false;
        }
        for (String str2 : cookies) {
            if (!TextUtils.isEmpty(str2)) {
                cookieManager.setCookie(str, str2);
                JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
                if (jDCacheLog.getCanLog()) {
                    jDCacheLog.d("JDCacheParamsProvider", "set cookie: " + str2);
                }
            }
        }
        CookieManager.getInstance().flush();
        return true;
    }

    public boolean showLog() {
        return false;
    }

    @e
    public JDCacheDataSource sourceWithUrl(@d String url, @e JDCacheLoader jDCacheLoader) {
        f0.p(url, "url");
        return null;
    }
}
