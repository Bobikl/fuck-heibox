package p5;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.google.common.net.c;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.apache.tools.ant.util.h1;
import z5.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f138158a = "msp";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f138159b = "application/octet-stream;binary/octet-stream";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CookieManager f138160c = new CookieManager();

    /* JADX INFO: renamed from: p5.a$a, reason: collision with other inner class name */
    public static final class C1252a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f138161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f138162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, String> f138163c;

        public C1252a(String str, Map<String, String> map, byte[] bArr) {
            this.f138161a = str;
            this.f138162b = bArr;
            this.f138163c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f138161a, this.f138163c);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f138164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f138165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f138166c;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f138164a = map;
            this.f138165b = str;
            this.f138166c = bArr;
        }
    }

    public static String a(Context context) {
        try {
            NetworkInfo networkInfoA = b6.b.a(null, context);
            if (networkInfoA != null && networkInfoA.isAvailable()) {
                return networkInfoA.getType() == 1 ? "wifi" : networkInfoA.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a2 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x01a7 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x019d A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    public static b b(Context context, C1252a c1252a) {
        Throwable th2;
        HttpURLConnection httpURLConnection;
        Throwable th3;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        if (context == null) {
            return null;
        }
        try {
            e.i(j5.a.f124275z, "conn config: " + c1252a);
            URL url = new URL(c1252a.f138161a);
            Proxy proxyD = d(context);
            e.i(j5.a.f124275z, "conn proxy: " + proxyD);
            httpURLConnection = proxyD != null ? (HttpURLConnection) url.openConnection(proxyD) : (HttpURLConnection) url.openConnection();
            try {
                System.setProperty("http.keepAlive", "false");
                if (httpURLConnection instanceof HttpsURLConnection) {
                }
                CookieManager cookieManager = f138160c;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection.setRequestProperty("Cookie", TextUtils.join(";", cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection.setConnectTimeout(20000);
                httpURLConnection.setReadTimeout(30000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("User-Agent", f138158a);
                byte[] bArr = c1252a.f138162b;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection.setRequestMethod("GET");
                } else {
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setRequestProperty("Content-Type", f138159b);
                    httpURLConnection.setRequestProperty(c.f58829i, "UTF-8");
                    httpURLConnection.setRequestProperty("Connection", c.f58866u0);
                    httpURLConnection.setRequestProperty(c.f58866u0, "timeout=180, max=100");
                }
                Map<String, String> map = c1252a.f138163c;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                httpURLConnection.setDoInput(true);
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    httpURLConnection.setDoOutput(true);
                }
                if ("POST".equals(httpURLConnection.getRequestMethod())) {
                    bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
                    try {
                        bufferedOutputStream.write(c1252a.f138162b);
                        bufferedOutputStream.flush();
                    } catch (Throwable th4) {
                        th3 = th4;
                        bufferedInputStream = null;
                        try {
                            e.d(th3);
                            return null;
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable unused) {
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (bufferedOutputStream != null) {
                                try {
                                    bufferedOutputStream.close();
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    }
                } else {
                    bufferedOutputStream = null;
                }
                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
                try {
                    byte[] bArrC = c(bufferedInputStream);
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, headerFields.get(null));
                    List<String> list = headerFields.get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            List<HttpCookie> list2 = HttpCookie.parse(it.next());
                            if (list2 != null && !list2.isEmpty()) {
                                f138160c.getCookieStore().add(url.toURI(), list2.get(0));
                            }
                        }
                    }
                    b bVar = new b(headerFields, strJoin, bArrC);
                    try {
                        httpURLConnection.disconnect();
                    } catch (Throwable unused4) {
                    }
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused5) {
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    return bVar;
                } catch (Throwable th5) {
                    th3 = th5;
                    e.d(th3);
                    return null;
                }
            } catch (Throwable th6) {
                th2 = th6;
                th3 = th2;
                bufferedInputStream = null;
                bufferedOutputStream = null;
                e.d(th3);
                return null;
            }
        } catch (Throwable th7) {
            th2 = th7;
            httpURLConnection = null;
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr, 0, 1024);
            if (i10 == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static Proxy d(Context context) {
        String strA = a(context);
        if (strA != null && !strA.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty(h1.f136788e);
            String property2 = System.getProperty(h1.f136789f);
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
        } catch (Throwable unused) {
            return null;
        }
    }
}
