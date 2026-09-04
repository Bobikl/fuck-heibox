package com.lzy.okgo.model;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import la.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class HttpHeaders implements Serializable {
    public static final String A = "Last-Modified";
    public static final String B = "Location";
    public static final String C = "User-Agent";
    public static final String D = "Cookie";
    public static final String E = "Cookie2";
    public static final String F = "Set-Cookie";
    public static final String G = "Set-Cookie2";
    private static String H = null;
    private static String I = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64735c = "EEE, dd MMM y HH:mm:ss 'GMT'";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final TimeZone f64736d = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64737e = "ResponseCode";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64738f = "ResponseMessage";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64739g = "Accept";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64740h = "Accept-Encoding";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64741i = "gzip, deflate";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64742j = "Accept-Language";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64743k = "Content-Type";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f64744l = "Content-Length";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f64745m = "Content-Encoding";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f64746n = "Content-Disposition";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f64747o = "Content-Range";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f64748p = "Range";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f64749q = "Cache-Control";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f64750r = "Connection";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f64751s = "keep-alive";
    private static final long serialVersionUID = 8458647755751403873L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f64752t = "close";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f64753u = "Date";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f64754v = "Expires";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f64755w = "ETag";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f64756x = "Pragma";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f64757y = "If-Modified-Since";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f64758z = "If-None-Match";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public LinkedHashMap<String, String> f64759b;

    public HttpHeaders() {
        k();
    }

    public HttpHeaders(String str, String str2) {
        k();
        n(str, str2);
    }

    public static String a(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.b.f31036x8, new Class[]{Long.TYPE}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        Date date = new Date(j10);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f64735c, Locale.US);
        simpleDateFormat.setTimeZone(f64736d);
        return simpleDateFormat.format(date);
    }

    public static String c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.f30970u8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(H)) {
            return H;
        }
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb2 = new StringBuilder(language);
        if (!TextUtils.isEmpty(country)) {
            sb2.append('-');
            sb2.append(country);
            sb2.append(',');
            sb2.append(language);
            sb2.append(";q=0.8");
        }
        String string = sb2.toString();
        H = string;
        return string;
    }

    public static String d(String str, String str2) {
        if (str != null) {
            return str;
        }
        if (str2 != null) {
            return str2;
        }
        return null;
    }

    public static long e(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30882q8, new Class[]{String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            return l(str);
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String f(long j10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Long(j10)}, null, changeQuickRedirect, true, bb.c.b.f30904r8, new Class[]{Long.TYPE}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : a(j10);
    }

    public static long g(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30926s8, new Class[]{String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            return l(str);
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public static long h(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f30948t8, new Class[]{String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        try {
            return l(str);
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static String j() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.b.f30992v8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!TextUtils.isEmpty(I)) {
            return I;
        }
        String string = null;
        try {
            string = com.lzy.okgo.b.p().m().getString(((Integer) Class.forName("com.android.internal.R$string").getDeclaredField("web_user_agent").get(null)).intValue());
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(string)) {
            string = "okhttp-okgo/jeasonlzy";
        }
        Locale locale = Locale.getDefault();
        StringBuffer stringBuffer = new StringBuffer();
        String str = Build.VERSION.RELEASE;
        if (str.length() > 0) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append("1.0");
        }
        stringBuffer.append("; ");
        String language = locale.getLanguage();
        if (language != null) {
            stringBuffer.append(language.toLowerCase(locale));
            String country = locale.getCountry();
            if (!TextUtils.isEmpty(country)) {
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                stringBuffer.append(country.toLowerCase(locale));
            }
        } else {
            stringBuffer.append(SocializeProtocolConstants.PROTOCOL_KEY_EN);
        }
        if ("REL".equals(Build.VERSION.CODENAME)) {
            String str2 = Build.MODEL;
            if (str2.length() > 0) {
                stringBuffer.append("; ");
                stringBuffer.append(str2);
            }
        }
        String str3 = Build.ID;
        if (str3.length() > 0) {
            stringBuffer.append(" Build/");
            stringBuffer.append(str3);
        }
        String str4 = String.format(string, stringBuffer, "Mobile ");
        I = str4;
        return str4;
    }

    private void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30698i8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64759b = new LinkedHashMap<>();
    }

    public static long l(String str) throws ParseException {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, bb.c.b.f31014w8, new Class[]{String.class}, Long.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Long) patchProxyResultProxy.result).longValue();
        }
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f64735c, Locale.US);
        simpleDateFormat.setTimeZone(f64736d);
        return simpleDateFormat.parse(str).getTime();
    }

    public static void p(String str) {
        H = str;
    }

    public static void q(String str) {
        I = str;
    }

    public String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30767l8, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f64759b.get(str);
    }

    public void clear() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30813n8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f64759b.clear();
    }

    public Set<String> i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30836o8, new Class[0], Set.class);
        return patchProxyResultProxy.isSupported ? (Set) patchProxyResultProxy.result : this.f64759b.keySet();
    }

    public void m(HttpHeaders httpHeaders) {
        LinkedHashMap<String, String> linkedHashMap;
        if (PatchProxy.proxy(new Object[]{httpHeaders}, this, changeQuickRedirect, false, bb.c.b.f30744k8, new Class[]{HttpHeaders.class}, Void.TYPE).isSupported || httpHeaders == null || (linkedHashMap = httpHeaders.f64759b) == null || linkedHashMap.isEmpty()) {
            return;
        }
        this.f64759b.putAll(httpHeaders.f64759b);
    }

    public void n(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, bb.c.b.f30721j8, new Class[]{String.class, String.class}, Void.TYPE).isSupported || str == null || str2 == null) {
            return;
        }
        this.f64759b.put(str, str2);
    }

    public String o(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.b.f30790m8, new Class[]{String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f64759b.remove(str);
    }

    public final String r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f30859p8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : this.f64759b.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e10) {
            d.i(e10);
        }
        return jSONObject.toString();
    }

    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.b.f31058y8, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "HttpHeaders{headersMap=" + this.f64759b + '}';
    }
}
