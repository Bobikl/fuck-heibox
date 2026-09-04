package anet.channel.request;

import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.text.y;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class Request {
    public static final String DEFAULT_CHARSET = "UTF-8";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestStatistic f29773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HttpUrl f29774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HttpUrl f29775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpUrl f29776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private URL f29777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f29778f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map<String, String> f29779g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map<String, String> f29780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f29781i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BodyEntry f29782j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29783k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f29784l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f29785m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f29786n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f29787o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f29788p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private HostnameVerifier f29789q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private SSLSocketFactory f29790r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29791s;

    /* JADX INFO: compiled from: Taobao */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private HttpUrl f29792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private HttpUrl f29793b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f29796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f29797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private BodyEntry f29798g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private HostnameVerifier f29801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private SSLSocketFactory f29802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f29803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f29804m;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f29808q;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29794c = "GET";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Map<String, String> f29795d = new HashMap();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29799h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f29800i = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f29805n = 10000;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f29806o = 10000;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private RequestStatistic f29807p = null;

        public Builder addHeader(String str, String str2) {
            this.f29795d.put(str, str2);
            return this;
        }

        public Builder addParam(String str, String str2) {
            if (this.f29796e == null) {
                this.f29796e = new HashMap();
            }
            this.f29796e.put(str, str2);
            this.f29793b = null;
            return this;
        }

        public Request build() {
            if (this.f29798g == null && this.f29796e == null && Method.a(this.f29794c)) {
                ALog.e("awcn.Request", "method " + this.f29794c + " must have a request body", null, new Object[0]);
            }
            if (this.f29798g != null && !Method.b(this.f29794c)) {
                ALog.e("awcn.Request", "method " + this.f29794c + " should not have a request body", null, new Object[0]);
                this.f29798g = null;
            }
            BodyEntry bodyEntry = this.f29798g;
            if (bodyEntry != null && bodyEntry.getContentType() != null) {
                addHeader("Content-Type", this.f29798g.getContentType());
            }
            return new Request(this);
        }

        public Builder setAllowRequestInBg(boolean z10) {
            this.f29808q = z10;
            return this;
        }

        public Builder setBizId(String str) {
            this.f29803l = str;
            return this;
        }

        public Builder setBody(BodyEntry bodyEntry) {
            this.f29798g = bodyEntry;
            return this;
        }

        public Builder setCharset(String str) {
            this.f29797f = str;
            this.f29793b = null;
            return this;
        }

        public Builder setConnectTimeout(int i10) {
            if (i10 > 0) {
                this.f29805n = i10;
            }
            return this;
        }

        public Builder setHeaders(Map<String, String> map) {
            this.f29795d.clear();
            if (map != null) {
                this.f29795d.putAll(map);
            }
            return this;
        }

        public Builder setHostnameVerifier(HostnameVerifier hostnameVerifier) {
            this.f29801j = hostnameVerifier;
            return this;
        }

        public Builder setMethod(String str) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("method is null or empty");
            }
            if ("GET".equalsIgnoreCase(str)) {
                this.f29794c = "GET";
            } else if ("POST".equalsIgnoreCase(str)) {
                this.f29794c = "POST";
            } else if ("OPTIONS".equalsIgnoreCase(str)) {
                this.f29794c = "OPTIONS";
            } else if ("HEAD".equalsIgnoreCase(str)) {
                this.f29794c = "HEAD";
            } else if ("PUT".equalsIgnoreCase(str)) {
                this.f29794c = "PUT";
            } else if ("DELETE".equalsIgnoreCase(str)) {
                this.f29794c = "DELETE";
            } else {
                this.f29794c = "GET";
            }
            return this;
        }

        public Builder setParams(Map<String, String> map) {
            this.f29796e = map;
            this.f29793b = null;
            return this;
        }

        public Builder setReadTimeout(int i10) {
            if (i10 > 0) {
                this.f29806o = i10;
            }
            return this;
        }

        public Builder setRedirectEnable(boolean z10) {
            this.f29799h = z10;
            return this;
        }

        public Builder setRedirectTimes(int i10) {
            this.f29800i = i10;
            return this;
        }

        public Builder setRequestStatistic(RequestStatistic requestStatistic) {
            this.f29807p = requestStatistic;
            return this;
        }

        public Builder setSeq(String str) {
            this.f29804m = str;
            return this;
        }

        public Builder setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            this.f29802k = sSLSocketFactory;
            return this;
        }

        public Builder setUrl(HttpUrl httpUrl) {
            this.f29792a = httpUrl;
            this.f29793b = null;
            return this;
        }

        public Builder setUrl(String str) {
            HttpUrl httpUrl = HttpUrl.parse(str);
            this.f29792a = httpUrl;
            this.f29793b = null;
            if (httpUrl != null) {
                return this;
            }
            throw new IllegalArgumentException("toURL is invalid! toURL = " + str);
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static final class Method {
        public static final String DELETE = "DELETE";
        public static final String GET = "GET";
        public static final String HEAD = "HEAD";
        public static final String OPTION = "OPTIONS";
        public static final String POST = "POST";
        public static final String PUT = "PUT";

        static boolean a(String str) {
            return str.equals("POST") || str.equals("PUT");
        }

        static boolean b(String str) {
            return a(str) || str.equals("DELETE") || str.equals("OPTIONS");
        }
    }

    private Request(Builder builder) {
        this.f29778f = "GET";
        this.f29783k = true;
        this.f29786n = 0;
        this.f29787o = 10000;
        this.f29788p = 10000;
        this.f29778f = builder.f29794c;
        this.f29779g = builder.f29795d;
        this.f29780h = builder.f29796e;
        this.f29782j = builder.f29798g;
        this.f29781i = builder.f29797f;
        this.f29783k = builder.f29799h;
        this.f29786n = builder.f29800i;
        this.f29789q = builder.f29801j;
        this.f29790r = builder.f29802k;
        this.f29784l = builder.f29803l;
        this.f29785m = builder.f29804m;
        this.f29787o = builder.f29805n;
        this.f29788p = builder.f29806o;
        this.f29774b = builder.f29792a;
        HttpUrl httpUrl = builder.f29793b;
        this.f29775c = httpUrl;
        if (httpUrl == null) {
            b();
        }
        this.f29773a = builder.f29807p != null ? builder.f29807p : new RequestStatistic(getHost(), this.f29784l);
        this.f29791s = builder.f29808q;
    }

    private Map<String, String> a() {
        return AwcnConfig.isCookieHeaderRedundantFix() ? new HashMap(this.f29779g) : this.f29779g;
    }

    private void b() {
        String strA = anet.channel.strategy.utils.c.a(this.f29780h, getContentEncoding());
        if (!TextUtils.isEmpty(strA)) {
            if (Method.a(this.f29778f) && this.f29782j == null) {
                try {
                    this.f29782j = new ByteArrayEntry(strA.getBytes(getContentEncoding()));
                    this.f29779g.put("Content-Type", "application/x-www-form-urlencoded; charset=" + getContentEncoding());
                } catch (UnsupportedEncodingException unused) {
                }
            } else {
                String strUrlString = this.f29774b.urlString();
                StringBuilder sb2 = new StringBuilder(strUrlString);
                if (sb2.indexOf("?") == -1) {
                    sb2.append('?');
                } else if (strUrlString.charAt(strUrlString.length() - 1) != '&') {
                    sb2.append(y.f128595d);
                }
                sb2.append(strA);
                HttpUrl httpUrl = HttpUrl.parse(sb2.toString());
                if (httpUrl != null) {
                    this.f29775c = httpUrl;
                }
            }
        }
        if (this.f29775c == null) {
            this.f29775c = this.f29774b;
        }
    }

    public boolean containsBody() {
        return this.f29782j != null;
    }

    public String getBizId() {
        return this.f29784l;
    }

    public byte[] getBodyBytes() {
        if (this.f29782j == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
        try {
            postBody(byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public int getConnectTimeout() {
        return this.f29787o;
    }

    public String getContentEncoding() {
        String str = this.f29781i;
        return str != null ? str : "UTF-8";
    }

    public Map<String, String> getHeaders() {
        return Collections.unmodifiableMap(this.f29779g);
    }

    public String getHost() {
        return this.f29775c.host();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f29789q;
    }

    public HttpUrl getHttpUrl() {
        return this.f29775c;
    }

    public String getMethod() {
        return this.f29778f;
    }

    public int getReadTimeout() {
        return this.f29788p;
    }

    public int getRedirectTimes() {
        return this.f29786n;
    }

    public String getSeq() {
        return this.f29785m;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f29790r;
    }

    public URL getUrl() {
        if (this.f29777e == null) {
            HttpUrl httpUrl = this.f29776d;
            if (httpUrl == null) {
                httpUrl = this.f29775c;
            }
            this.f29777e = httpUrl.toURL();
        }
        return this.f29777e;
    }

    public String getUrlString() {
        return this.f29775c.urlString();
    }

    public boolean isAllowRequestInBg() {
        return this.f29791s;
    }

    public boolean isRedirectEnable() {
        return this.f29783k;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.f29794c = this.f29778f;
        builder.f29795d = a();
        builder.f29796e = this.f29780h;
        builder.f29798g = this.f29782j;
        builder.f29797f = this.f29781i;
        builder.f29799h = this.f29783k;
        builder.f29800i = this.f29786n;
        builder.f29801j = this.f29789q;
        builder.f29802k = this.f29790r;
        builder.f29792a = this.f29774b;
        builder.f29793b = this.f29775c;
        builder.f29803l = this.f29784l;
        builder.f29804m = this.f29785m;
        builder.f29805n = this.f29787o;
        builder.f29806o = this.f29788p;
        builder.f29807p = this.f29773a;
        builder.f29808q = this.f29791s;
        return builder;
    }

    public int postBody(OutputStream outputStream) throws IOException {
        BodyEntry bodyEntry = this.f29782j;
        if (bodyEntry != null) {
            return bodyEntry.writeTo(outputStream);
        }
        return 0;
    }

    public void setDnsOptimize(String str, int i10) {
        if (str != null) {
            if (this.f29776d == null) {
                this.f29776d = new HttpUrl(this.f29775c);
            }
            this.f29776d.replaceIpAndPort(str, i10);
        } else {
            this.f29776d = null;
        }
        this.f29777e = null;
        this.f29773a.setIPAndPort(str, i10);
    }

    public void setUrlScheme(boolean z10) {
        if (this.f29776d == null) {
            this.f29776d = new HttpUrl(this.f29775c);
        }
        this.f29776d.setScheme(z10 ? "https" : "http");
        this.f29777e = null;
    }
}
