package la;

import android.text.TextUtils;
import com.lzy.okgo.cache.CacheEntity;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.request.base.Request;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Locale;
import java.util.StringTokenizer;
import okhttp3.s;

/* JADX INFO: compiled from: HeaderParser.java */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static <T> void a(Request request, CacheEntity<T> cacheEntity, CacheMode cacheMode) {
        HttpHeaders httpHeadersF;
        if (PatchProxy.proxy(new Object[]{request, cacheEntity, cacheMode}, null, changeQuickRedirect, true, bb.c.b.Ta, new Class[]{Request.class, CacheEntity.class, CacheMode.class}, Void.TYPE).isSupported || cacheEntity == null || cacheMode != CacheMode.DEFAULT || (httpHeadersF = cacheEntity.f()) == null) {
            return;
        }
        String strB = httpHeadersF.b("ETag");
        if (strB != null) {
            request.X("If-None-Match", strB);
        }
        long jH = HttpHeaders.h(httpHeadersF.b("Last-Modified"));
        if (jH > 0) {
            request.X("If-Modified-Since", HttpHeaders.a(jH));
        }
    }

    public static <T> CacheEntity<T> b(s sVar, T t10, CacheMode cacheMode, String str) {
        long jCurrentTimeMillis;
        long j10;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{sVar, t10, cacheMode, str}, null, changeQuickRedirect, true, 720, new Class[]{s.class, Object.class, CacheMode.class, String.class}, CacheEntity.class);
        if (patchProxyResultProxy.isSupported) {
            return (CacheEntity) patchProxyResultProxy.result;
        }
        if (cacheMode == CacheMode.DEFAULT) {
            long jE = HttpHeaders.e(sVar.e("Date"));
            jCurrentTimeMillis = HttpHeaders.g(sVar.e("Expires"));
            String strD = HttpHeaders.d(sVar.e("Cache-Control"), sVar.e("Pragma"));
            if (TextUtils.isEmpty(strD) && jCurrentTimeMillis <= 0) {
                return null;
            }
            if (TextUtils.isEmpty(strD)) {
                j10 = 0;
            } else {
                StringTokenizer stringTokenizer = new StringTokenizer(strD, Constants.ACCEPT_TIME_SEPARATOR_SP);
                j10 = 0;
                while (stringTokenizer.hasMoreTokens()) {
                    String lowerCase = stringTokenizer.nextToken().trim().toLowerCase(Locale.getDefault());
                    if (lowerCase.equals("no-cache") || lowerCase.equals("no-store")) {
                        return null;
                    }
                    if (lowerCase.startsWith("max-age=")) {
                        try {
                            j10 = Long.parseLong(lowerCase.substring(8));
                            if (j10 <= 0) {
                                return null;
                            }
                        } catch (Exception e10) {
                            d.i(e10);
                        }
                    }
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jE <= 0) {
                jE = jCurrentTimeMillis2;
            }
            if (j10 > 0) {
                jCurrentTimeMillis = jE + (j10 * 1000);
            } else if (jCurrentTimeMillis < 0) {
                jCurrentTimeMillis = 0;
            }
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        for (String str2 : sVar.j()) {
            httpHeaders.n(str2, sVar.e(str2));
        }
        CacheEntity<T> cacheEntity = new CacheEntity<>();
        cacheEntity.k(str);
        cacheEntity.i(t10);
        cacheEntity.l(jCurrentTimeMillis);
        cacheEntity.m(httpHeaders);
        return cacheEntity;
    }
}
