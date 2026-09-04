package org.jsoup.helper;

import anet.channel.util.HttpConstant;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import kotlin.text.y;
import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.parser.f;

/* JADX INFO: compiled from: HttpConnection.java */
/* JADX INFO: loaded from: classes5.dex */
public class b implements Connection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Connection.c f137838a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Connection.d f137839b = new e();

    /* JADX INFO: renamed from: org.jsoup.helper.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: HttpConnection.java */
    public static abstract class AbstractC1243b<T extends Connection.a> implements Connection.a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        URL f137840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Connection.Method f137841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Map<String, String> f137842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Map<String, String> f137843d;

        private AbstractC1243b() {
            this.f137842c = new LinkedHashMap();
            this.f137843d = new LinkedHashMap();
        }

        private String G(String str) {
            Map.Entry<String, String> entryH;
            org.jsoup.helper.d.k(str, "Header name must not be null");
            String str2 = this.f137842c.get(str);
            if (str2 == null) {
                str2 = this.f137842c.get(str.toLowerCase());
            }
            return (str2 != null || (entryH = H(str)) == null) ? str2 : entryH.getValue();
        }

        private Map.Entry<String, String> H(String str) {
            String lowerCase = str.toLowerCase();
            for (Map.Entry<String, String> entry : this.f137842c.entrySet()) {
                if (entry.getKey().toLowerCase().equals(lowerCase)) {
                    return entry;
                }
            }
            return null;
        }

        @Override // org.jsoup.Connection.a
        public T C(String str) {
            org.jsoup.helper.d.h("Cookie name must not be empty");
            this.f137843d.remove(str);
            return this;
        }

        @Override // org.jsoup.Connection.a
        public Map<String, String> D() {
            return this.f137842c;
        }

        @Override // org.jsoup.Connection.a
        public T a(String str, String str2) {
            org.jsoup.helper.d.i(str, "Header name must not be empty");
            org.jsoup.helper.d.k(str2, "Header value must not be null");
            y(str);
            this.f137842c.put(str, str2);
            return this;
        }

        @Override // org.jsoup.Connection.a
        public T c(String str, String str2) {
            org.jsoup.helper.d.i(str, "Cookie name must not be empty");
            org.jsoup.helper.d.k(str2, "Cookie value must not be null");
            this.f137843d.put(str, str2);
            return this;
        }

        @Override // org.jsoup.Connection.a
        public T g(URL url) {
            org.jsoup.helper.d.k(url, "URL must not be null");
            this.f137840a = url;
            return this;
        }

        @Override // org.jsoup.Connection.a
        public T k(Connection.Method method) {
            org.jsoup.helper.d.k(method, "Method must not be null");
            this.f137841b = method;
            return this;
        }

        @Override // org.jsoup.Connection.a
        public Connection.Method method() {
            return this.f137841b;
        }

        @Override // org.jsoup.Connection.a
        public URL n() {
            return this.f137840a;
        }

        @Override // org.jsoup.Connection.a
        public String o(String str) {
            org.jsoup.helper.d.k(str, "Cookie name must not be null");
            return this.f137843d.get(str);
        }

        @Override // org.jsoup.Connection.a
        public String q(String str) {
            org.jsoup.helper.d.k(str, "Header name must not be null");
            return G(str);
        }

        @Override // org.jsoup.Connection.a
        public Map<String, String> v() {
            return this.f137843d;
        }

        @Override // org.jsoup.Connection.a
        public boolean x(String str) {
            org.jsoup.helper.d.h("Cookie name must not be empty");
            return this.f137843d.containsKey(str);
        }

        @Override // org.jsoup.Connection.a
        public T y(String str) {
            org.jsoup.helper.d.i(str, "Header name must not be empty");
            Map.Entry<String, String> entryH = H(str);
            if (entryH != null) {
                this.f137842c.remove(entryH.getKey());
            }
            return this;
        }

        @Override // org.jsoup.Connection.a
        public boolean z(String str) {
            org.jsoup.helper.d.i(str, "Header name must not be empty");
            return G(str) != null;
        }
    }

    /* JADX INFO: compiled from: HttpConnection.java */
    public static class c implements Connection.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f137844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f137845b;

        private c(String str, String str2) {
            this.f137844a = str;
            this.f137845b = str2;
        }

        public static c c(String str, String str2) {
            org.jsoup.helper.d.i(str, "Data key must not be empty");
            org.jsoup.helper.d.k(str2, "Data value must not be null");
            return new c(str, str2);
        }

        @Override // org.jsoup.Connection.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public c b(String str) {
            org.jsoup.helper.d.i(str, "Data key must not be empty");
            this.f137844a = str;
            return this;
        }

        @Override // org.jsoup.Connection.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c a(String str) {
            org.jsoup.helper.d.k(str, "Data value must not be null");
            this.f137845b = str;
            return this;
        }

        @Override // org.jsoup.Connection.b
        public String key() {
            return this.f137844a;
        }

        public String toString() {
            return this.f137844a + ContainerUtils.KEY_VALUE_DELIMITER + this.f137845b;
        }

        @Override // org.jsoup.Connection.b
        public String value() {
            return this.f137845b;
        }
    }

    /* JADX INFO: compiled from: HttpConnection.java */
    public static class d extends AbstractC1243b<Connection.c> implements Connection.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f137846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f137847f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f137848g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Collection<Connection.b> f137849h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f137850i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f137851j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private org.jsoup.parser.d f137852k;

        private d() {
            super();
            this.f137850i = false;
            this.f137851j = false;
            this.f137846e = 3000;
            this.f137847f = 1048576;
            this.f137848g = true;
            this.f137849h = new ArrayList();
            this.f137841b = Connection.Method.GET;
            this.f137842c.put("Accept-Encoding", "gzip");
            this.f137852k = org.jsoup.parser.d.c();
        }

        @Override // org.jsoup.Connection.c
        public boolean B() {
            return this.f137851j;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ Map D() {
            return super.D();
        }

        @Override // org.jsoup.Connection.c
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public d u(Connection.b bVar) {
            org.jsoup.helper.d.k(bVar, "Key val must not be null");
            this.f137849h.add(bVar);
            return this;
        }

        @Override // org.jsoup.Connection.c
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public d f(org.jsoup.parser.d dVar) {
            this.f137852k = dVar;
            return this;
        }

        @Override // org.jsoup.Connection.c
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public d d(int i10) {
            org.jsoup.helper.d.e(i10 >= 0, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f137846e = i10;
            return this;
        }

        @Override // org.jsoup.Connection.c
        public Connection.c b(boolean z10) {
            this.f137848g = z10;
            return this;
        }

        @Override // org.jsoup.Connection.c
        public Collection<Connection.b> e() {
            return this.f137849h;
        }

        @Override // org.jsoup.Connection.c
        public Connection.c h(int i10) {
            org.jsoup.helper.d.e(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
            this.f137847f = i10;
            return this;
        }

        @Override // org.jsoup.Connection.c
        public Connection.c i(boolean z10) {
            this.f137850i = z10;
            return this;
        }

        @Override // org.jsoup.Connection.c
        public Connection.c l(boolean z10) {
            this.f137851j = z10;
            return this;
        }

        @Override // org.jsoup.Connection.c
        public org.jsoup.parser.d m() {
            return this.f137852k;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ URL n() {
            return super.n();
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ String o(String str) {
            return super.o(str);
        }

        @Override // org.jsoup.Connection.c
        public boolean p() {
            return this.f137848g;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ String q(String str) {
            return super.q(str);
        }

        @Override // org.jsoup.Connection.c
        public int s() {
            return this.f137847f;
        }

        @Override // org.jsoup.Connection.c
        public boolean t() {
            return this.f137850i;
        }

        @Override // org.jsoup.Connection.c
        public int timeout() {
            return this.f137846e;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ Map v() {
            return super.v();
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ boolean x(String str) {
            return super.x(str);
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ boolean z(String str) {
            return super.z(str);
        }
    }

    /* JADX INFO: compiled from: HttpConnection.java */
    public static class e extends AbstractC1243b<Connection.d> implements Connection.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f137853m = 20;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f137854e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f137855f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ByteBuffer f137856g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f137857h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f137858i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f137859j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f137860k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Connection.c f137861l;

        e() {
            super();
            this.f137859j = false;
            this.f137860k = 0;
        }

        private e(e eVar) throws IOException {
            super();
            this.f137859j = false;
            this.f137860k = 0;
            if (eVar != null) {
                int i10 = eVar.f137860k + 1;
                this.f137860k = i10;
                if (i10 >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", eVar.n()));
                }
            }
        }

        private static HttpURLConnection I(Connection.c cVar) throws IOException {
            HttpURLConnection httpURLConnection = (HttpURLConnection) cVar.n().openConnection();
            httpURLConnection.setRequestMethod(cVar.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(cVar.timeout());
            httpURLConnection.setReadTimeout(cVar.timeout());
            if (cVar.method() == Connection.Method.POST) {
                httpURLConnection.setDoOutput(true);
            }
            if (cVar.v().size() > 0) {
                httpURLConnection.addRequestProperty("Cookie", L(cVar));
            }
            for (Map.Entry<String, String> entry : cVar.D().entrySet()) {
                httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            }
            return httpURLConnection;
        }

        static e J(Connection.c cVar) throws IOException {
            return K(cVar, null);
        }

        static e K(Connection.c cVar, e eVar) throws IOException {
            InputStream errorStream;
            org.jsoup.helper.d.k(cVar, "Request must not be null");
            String protocol = cVar.n().getProtocol();
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new MalformedURLException("Only http & https protocols supported");
            }
            Connection.Method method = cVar.method();
            Connection.Method method2 = Connection.Method.GET;
            if (method == method2 && cVar.e().size() > 0) {
                N(cVar);
            }
            HttpURLConnection httpURLConnectionI = I(cVar);
            try {
                httpURLConnectionI.connect();
                if (cVar.method() == Connection.Method.POST) {
                    P(cVar.e(), httpURLConnectionI.getOutputStream());
                }
                int responseCode = httpURLConnectionI.getResponseCode();
                boolean z10 = false;
                if (responseCode != 200) {
                    if (responseCode == 302 || responseCode == 301 || responseCode == 303) {
                        z10 = true;
                    } else if (!cVar.t()) {
                        throw new HttpStatusException("HTTP error fetching URL", responseCode, cVar.n().toString());
                    }
                }
                e eVar2 = new e(eVar);
                eVar2.O(httpURLConnectionI, eVar);
                if (z10 && cVar.p()) {
                    cVar.k(method2);
                    cVar.e().clear();
                    cVar.g(new URL(cVar.n(), eVar2.q("Location")));
                    for (Map.Entry<String, String> entry : eVar2.f137843d.entrySet()) {
                        cVar.c(entry.getKey(), entry.getValue());
                    }
                    e eVarK = K(cVar, eVar2);
                    httpURLConnectionI.disconnect();
                    return eVarK;
                }
                eVar2.f137861l = cVar;
                String strJ = eVar2.j();
                if (strJ != null && !cVar.B() && !strJ.startsWith("text/") && !strJ.startsWith("application/xml") && !strJ.startsWith("application/xhtml+xml")) {
                    throw new UnsupportedMimeTypeException("Unhandled content type. Must be text/*, application/xml, or application/xhtml+xml", strJ, cVar.n().toString());
                }
                BufferedInputStream bufferedInputStream = null;
                try {
                    errorStream = httpURLConnectionI.getErrorStream() != null ? httpURLConnectionI.getErrorStream() : httpURLConnectionI.getInputStream();
                    try {
                        bufferedInputStream = (eVar2.z("Content-Encoding") && eVar2.q("Content-Encoding").equalsIgnoreCase("gzip")) ? new BufferedInputStream(new GZIPInputStream(errorStream)) : new BufferedInputStream(errorStream);
                        eVar2.f137856g = org.jsoup.helper.a.g(bufferedInputStream, cVar.s());
                        eVar2.f137857h = org.jsoup.helper.a.a(eVar2.f137858i);
                        bufferedInputStream.close();
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        httpURLConnectionI.disconnect();
                        eVar2.f137859j = true;
                        return eVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (errorStream != null) {
                            errorStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    errorStream = null;
                }
            } catch (Throwable th4) {
                httpURLConnectionI.disconnect();
                throw th4;
            }
        }

        private static String L(Connection.c cVar) {
            StringBuilder sb2 = new StringBuilder();
            boolean z10 = true;
            for (Map.Entry<String, String> entry : cVar.v().entrySet()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append("; ");
                }
                sb2.append(entry.getKey());
                sb2.append(n5.a.f132013h);
                sb2.append(entry.getValue());
            }
            return sb2.toString();
        }

        private static void N(Connection.c cVar) throws IOException {
            boolean z10;
            URL urlN = cVar.n();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(urlN.getProtocol());
            sb2.append(HttpConstant.SCHEME_SPLIT);
            sb2.append(urlN.getAuthority());
            sb2.append(urlN.getPath());
            sb2.append("?");
            if (urlN.getQuery() != null) {
                sb2.append(urlN.getQuery());
                z10 = false;
            } else {
                z10 = true;
            }
            for (Connection.b bVar : cVar.e()) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(y.f128595d);
                }
                sb2.append(URLEncoder.encode(bVar.key(), "UTF-8"));
                sb2.append(n5.a.f132013h);
                sb2.append(URLEncoder.encode(bVar.value(), "UTF-8"));
            }
            cVar.g(new URL(sb2.toString()));
            cVar.e().clear();
        }

        private void O(HttpURLConnection httpURLConnection, Connection.d dVar) throws IOException {
            this.f137841b = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.f137840a = httpURLConnection.getURL();
            this.f137854e = httpURLConnection.getResponseCode();
            this.f137855f = httpURLConnection.getResponseMessage();
            this.f137858i = httpURLConnection.getContentType();
            M(httpURLConnection.getHeaderFields());
            if (dVar != null) {
                for (Map.Entry<String, String> entry : dVar.v().entrySet()) {
                    if (!x(entry.getKey())) {
                        c(entry.getKey(), entry.getValue());
                    }
                }
            }
        }

        private static void P(Collection<Connection.b> collection, OutputStream outputStream) throws IOException {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, "UTF-8");
            boolean z10 = true;
            for (Connection.b bVar : collection) {
                if (z10) {
                    z10 = false;
                } else {
                    outputStreamWriter.append(y.f128595d);
                }
                outputStreamWriter.write(URLEncoder.encode(bVar.key(), "UTF-8"));
                outputStreamWriter.write(61);
                outputStreamWriter.write(URLEncoder.encode(bVar.value(), "UTF-8"));
            }
            outputStreamWriter.close();
        }

        @Override // org.jsoup.Connection.d
        public String A() {
            return this.f137857h;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ Map D() {
            return super.D();
        }

        @Override // org.jsoup.Connection.d
        public String E() {
            return this.f137855f;
        }

        @Override // org.jsoup.Connection.d
        public byte[] F() {
            org.jsoup.helper.d.e(this.f137859j, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            return this.f137856g.array();
        }

        void M(Map<String, List<String>> map) {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    List<String> value = entry.getValue();
                    if (key.equalsIgnoreCase("Set-Cookie")) {
                        for (String str : value) {
                            if (str != null) {
                                f fVar = new f(str);
                                String strTrim = fVar.e(ContainerUtils.KEY_VALUE_DELIMITER).trim();
                                String strTrim2 = fVar.m(";").trim();
                                if (strTrim2 == null) {
                                    strTrim2 = "";
                                }
                                if (strTrim != null && strTrim.length() > 0) {
                                    c(strTrim, strTrim2);
                                }
                            }
                        }
                    } else if (!value.isEmpty()) {
                        a(key, value.get(0));
                    }
                }
            }
        }

        @Override // org.jsoup.Connection.d
        public String body() {
            org.jsoup.helper.d.e(this.f137859j, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            String str = this.f137857h;
            String string = str == null ? Charset.forName("UTF-8").decode(this.f137856g).toString() : Charset.forName(str).decode(this.f137856g).toString();
            this.f137856g.rewind();
            return string;
        }

        @Override // org.jsoup.Connection.d
        public String j() {
            return this.f137858i;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ URL n() {
            return super.n();
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ String o(String str) {
            return super.o(str);
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ String q(String str) {
            return super.q(str);
        }

        @Override // org.jsoup.Connection.d
        public int r() {
            return this.f137854e;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ Map v() {
            return super.v();
        }

        @Override // org.jsoup.Connection.d
        public Document w() throws IOException {
            org.jsoup.helper.d.e(this.f137859j, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            Document documentE = org.jsoup.helper.a.e(this.f137856g, this.f137857h, this.f137840a.toExternalForm(), this.f137861l.m());
            this.f137856g.rewind();
            this.f137857h = documentE.Z1().a().name();
            return documentE;
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ boolean x(String str) {
            return super.x(str);
        }

        @Override // org.jsoup.helper.b.AbstractC1243b, org.jsoup.Connection.a
        public /* bridge */ /* synthetic */ boolean z(String str) {
            return super.z(str);
        }
    }

    private b() {
    }

    public static Connection v(String str) {
        b bVar = new b();
        bVar.j(str);
        return bVar;
    }

    public static Connection w(URL url) {
        b bVar = new b();
        bVar.g(url);
        return bVar;
    }

    @Override // org.jsoup.Connection
    public Connection a(String str, String str2) {
        this.f137838a.a(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection b(boolean z10) {
        this.f137838a.b(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection c(String str, String str2) {
        this.f137838a.c(str, str2);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection d(int i10) {
        this.f137838a.d(i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection e(String str, String str2) {
        this.f137838a.u(c.c(str, str2));
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.d execute() throws IOException {
        e eVarJ = e.J(this.f137838a);
        this.f137839b = eVarJ;
        return eVarJ;
    }

    @Override // org.jsoup.Connection
    public Connection f(org.jsoup.parser.d dVar) {
        this.f137838a.f(dVar);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection g(URL url) {
        this.f137838a.g(url);
        return this;
    }

    @Override // org.jsoup.Connection
    public Document get() throws IOException {
        this.f137838a.k(Connection.Method.GET);
        execute();
        return this.f137839b.w();
    }

    @Override // org.jsoup.Connection
    public Connection h(int i10) {
        this.f137838a.h(i10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection i(boolean z10) {
        this.f137838a.i(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection j(String str) {
        org.jsoup.helper.d.i(str, "Must supply a valid URL");
        try {
            this.f137838a.g(new URL(str));
            return this;
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException("Malformed URL: " + str, e10);
        }
    }

    @Override // org.jsoup.Connection
    public Connection k(Connection.Method method) {
        this.f137838a.k(method);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection l(boolean z10) {
        this.f137838a.l(z10);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection.d m() {
        return this.f137839b;
    }

    @Override // org.jsoup.Connection
    public Connection n(String str) {
        org.jsoup.helper.d.k(str, "Referrer must not be null");
        this.f137838a.a("Referer", str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection o(Map<String, String> map) {
        org.jsoup.helper.d.k(map, "Cookie map must not be null");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f137838a.c(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection p(String... strArr) {
        org.jsoup.helper.d.k(strArr, "Data key value pairs must not be null");
        org.jsoup.helper.d.e(strArr.length % 2 == 0, "Must supply an even number of key value pairs");
        for (int i10 = 0; i10 < strArr.length; i10 += 2) {
            String str = strArr[i10];
            String str2 = strArr[i10 + 1];
            org.jsoup.helper.d.i(str, "Data key must not be empty");
            org.jsoup.helper.d.k(str2, "Data value must not be null");
            this.f137838a.u(c.c(str, str2));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection q(Map<String, String> map) {
        org.jsoup.helper.d.k(map, "Data map must not be null");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f137838a.u(c.c(entry.getKey(), entry.getValue()));
        }
        return this;
    }

    @Override // org.jsoup.Connection
    public Document r() throws IOException {
        this.f137838a.k(Connection.Method.POST);
        execute();
        return this.f137839b.w();
    }

    @Override // org.jsoup.Connection
    public Connection.c request() {
        return this.f137838a;
    }

    @Override // org.jsoup.Connection
    public Connection s(String str) {
        org.jsoup.helper.d.k(str, "User agent must not be null");
        this.f137838a.a("User-Agent", str);
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection t(Connection.c cVar) {
        this.f137838a = cVar;
        return this;
    }

    @Override // org.jsoup.Connection
    public Connection u(Connection.d dVar) {
        this.f137839b = dVar;
        return this;
    }
}
