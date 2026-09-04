package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.j1;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: DefaultHttpDataSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class x extends f implements HttpDataSource {
    private static final long A = 2048;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f51289u = 8000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f51290v = 8000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f51291w = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f51292x = 20;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f51293y = 307;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f51294z = 308;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f51295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f51296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f51297h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    private final String f51298i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    private final HttpDataSource.c f51299j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final HttpDataSource.c f51300k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f51301l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    private com.google.common.base.x<String> f51302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    private r f51303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    private HttpURLConnection f51304o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    private InputStream f51305p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f51306q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f51307r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f51308s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f51309t;

    /* JADX INFO: compiled from: DefaultHttpDataSource.java */
    public static final class b implements HttpDataSource.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private u0 f51311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.common.base.x<String> f51312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private String f51313d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f51316g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f51317h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpDataSource.c f51310a = new HttpDataSource.c();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f51314e = 8000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f51315f = 8000;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b, com.google.android.exoplayer2.upstream.o.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x a() {
            x xVar = new x(this.f51313d, this.f51314e, this.f51315f, this.f51316g, this.f51310a, this.f51312c, this.f51317h);
            u0 u0Var = this.f51311b;
            if (u0Var != null) {
                xVar.e(u0Var);
            }
            return xVar;
        }

        public b d(boolean z10) {
            this.f51316g = z10;
            return this;
        }

        public b e(int i10) {
            this.f51314e = i10;
            return this;
        }

        public b f(@androidx.annotation.p0 com.google.common.base.x<String> xVar) {
            this.f51312c = xVar;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final b b(Map<String, String> map) {
            this.f51310a.b(map);
            return this;
        }

        public b h(boolean z10) {
            this.f51317h = z10;
            return this;
        }

        public b i(int i10) {
            this.f51315f = i10;
            return this;
        }

        public b j(@androidx.annotation.p0 u0 u0Var) {
            this.f51311b = u0Var;
            return this;
        }

        public b k(@androidx.annotation.p0 String str) {
            this.f51313d = str;
            return this;
        }
    }

    @Deprecated
    public x() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public x(@androidx.annotation.p0 String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public x(@androidx.annotation.p0 String str, int i10, int i11) {
        this(str, i10, i11, false, null);
    }

    @Deprecated
    public x(@androidx.annotation.p0 String str, int i10, int i11, boolean z10, @androidx.annotation.p0 HttpDataSource.c cVar) {
        this(str, i10, i11, z10, cVar, null, false);
    }

    private x(@androidx.annotation.p0 String str, int i10, int i11, boolean z10, @androidx.annotation.p0 HttpDataSource.c cVar, @androidx.annotation.p0 com.google.common.base.x<String> xVar, boolean z11) {
        super(true);
        this.f51298i = str;
        this.f51296g = i10;
        this.f51297h = i11;
        this.f51295f = z10;
        this.f51299j = cVar;
        this.f51302m = xVar;
        this.f51300k = new HttpDataSource.c();
        this.f51301l = z11;
    }

    private void A() {
        HttpURLConnection httpURLConnection = this.f51304o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                com.google.android.exoplayer2.util.u.e(f51291w, "Unexpected error while disconnecting", e10);
            }
            this.f51304o = null;
        }
    }

    private URL B(URL url, @androidx.annotation.p0 String str, r rVar) throws HttpDataSource.HttpDataSourceException {
        if (str == null) {
            throw new HttpDataSource.HttpDataSourceException("Null location redirect", rVar, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                String strValueOf = String.valueOf(protocol);
                throw new HttpDataSource.HttpDataSourceException(strValueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(strValueOf) : new String("Unsupported protocol redirect: "), rVar, 2001, 1);
            }
            if (this.f51295f || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(String.valueOf(protocol2).length() + 41 + protocol.length());
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new HttpDataSource.HttpDataSourceException(sb2.toString(), rVar, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new HttpDataSource.HttpDataSourceException(e10, rVar, 2001, 1);
        }
    }

    private static boolean C(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection D(r rVar) throws IOException {
        URL url = new URL(rVar.f51194a.toString());
        int i10 = rVar.f51196c;
        byte[] bArr = rVar.f51197d;
        long j10 = rVar.f51200g;
        long j11 = rVar.f51201h;
        boolean zD = rVar.d(1);
        if (!this.f51295f && !this.f51301l) {
            return E(url, i10, bArr, j10, j11, zD, true, rVar.f51198e);
        }
        URL urlB = url;
        int i11 = i10;
        byte[] bArr2 = bArr;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Too many redirects: ");
                sb2.append(i13);
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException(sb2.toString()), rVar, 2001, 1);
            }
            long j12 = j10;
            long j13 = j10;
            int i14 = i11;
            URL url2 = urlB;
            long j14 = j11;
            HttpURLConnection httpURLConnectionE = E(urlB, i11, bArr2, j12, j11, zD, false, rVar.f51198e);
            int responseCode = httpURLConnectionE.getResponseCode();
            String headerField = httpURLConnectionE.getHeaderField("Location");
            if ((i14 == 1 || i14 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionE.disconnect();
                urlB = B(url2, headerField, rVar);
                i11 = i14;
            } else {
                if (i14 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionE;
                }
                httpURLConnectionE.disconnect();
                if (this.f51301l && responseCode == 302) {
                    i11 = i14;
                } else {
                    bArr2 = null;
                    i11 = 1;
                }
                urlB = B(url2, headerField, rVar);
            }
            i12 = i13;
            j10 = j13;
            j11 = j14;
        }
    }

    private HttpURLConnection E(URL url, int i10, @androidx.annotation.p0 byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map<String, String> map) throws IOException {
        HttpURLConnection httpURLConnectionG = G(url);
        httpURLConnectionG.setConnectTimeout(this.f51296g);
        httpURLConnectionG.setReadTimeout(this.f51297h);
        HashMap map2 = new HashMap();
        HttpDataSource.c cVar = this.f51299j;
        if (cVar != null) {
            map2.putAll(cVar.c());
        }
        map2.putAll(this.f51300k.c());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnectionG.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = e0.a(j10, j11);
        if (strA != null) {
            httpURLConnectionG.setRequestProperty("Range", strA);
        }
        String str = this.f51298i;
        if (str != null) {
            httpURLConnectionG.setRequestProperty("User-Agent", str);
        }
        httpURLConnectionG.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnectionG.setInstanceFollowRedirects(z11);
        httpURLConnectionG.setDoOutput(bArr != null);
        httpURLConnectionG.setRequestMethod(r.c(i10));
        if (bArr != null) {
            httpURLConnectionG.setFixedLengthStreamingMode(bArr.length);
            httpURLConnectionG.connect();
            OutputStream outputStream = httpURLConnectionG.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnectionG.connect();
        }
        return httpURLConnectionG;
    }

    private static void F(@androidx.annotation.p0 HttpURLConnection httpURLConnection, long j10) {
        int i10;
        if (httpURLConnection == null || (i10 = com.google.android.exoplayer2.util.u0.f51536a) < 19 || i10 > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j10 == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j10 <= 2048) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Method declaredMethod = ((Class) com.google.android.exoplayer2.util.a.g(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    private int H(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        long j10 = this.f51308s;
        if (j10 != -1) {
            long j11 = j10 - this.f51309t;
            if (j11 == 0) {
                return -1;
            }
            i11 = (int) Math.min(i11, j11);
        }
        int i12 = ((InputStream) com.google.android.exoplayer2.util.u0.k(this.f51305p)).read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.f51309t += (long) i12;
        w(i12);
        return i12;
    }

    private void J(long j10, r rVar) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int i10 = ((InputStream) com.google.android.exoplayer2.util.u0.k(this.f51305p)).read(bArr, 0, (int) Math.min(j10, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), rVar, 2000, 1);
            }
            if (i10 == -1) {
                throw new HttpDataSource.HttpDataSourceException(rVar, 2008, 1);
            }
            j10 -= (long) i10;
            w(i10);
        }
    }

    @j1
    HttpURLConnection G(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Deprecated
    public void I(@androidx.annotation.p0 com.google.common.base.x<String> xVar) {
        this.f51302m = xVar;
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public long a(r rVar) throws HttpDataSource.HttpDataSourceException {
        byte[] bArrV1;
        this.f51303n = rVar;
        long j10 = 0;
        this.f51309t = 0L;
        this.f51308s = 0L;
        y(rVar);
        try {
            HttpURLConnection httpURLConnectionD = D(rVar);
            this.f51304o = httpURLConnectionD;
            this.f51307r = httpURLConnectionD.getResponseCode();
            String responseMessage = httpURLConnectionD.getResponseMessage();
            int i10 = this.f51307r;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionD.getHeaderFields();
                if (this.f51307r == 416) {
                    if (rVar.f51200g == e0.c(httpURLConnectionD.getHeaderField("Content-Range"))) {
                        this.f51306q = true;
                        z(rVar);
                        long j11 = rVar.f51201h;
                        if (j11 != -1) {
                            return j11;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionD.getErrorStream();
                try {
                    bArrV1 = errorStream != null ? com.google.android.exoplayer2.util.u0.v1(errorStream) : com.google.android.exoplayer2.util.u0.f51541f;
                } catch (IOException unused) {
                    bArrV1 = com.google.android.exoplayer2.util.u0.f51541f;
                }
                byte[] bArr = bArrV1;
                A();
                throw new HttpDataSource.InvalidResponseCodeException(this.f51307r, responseMessage, this.f51307r == 416 ? new DataSourceException(2008) : null, headerFields, rVar, bArr);
            }
            String contentType = httpURLConnectionD.getContentType();
            com.google.common.base.x<String> xVar = this.f51302m;
            if (xVar != null && !xVar.apply(contentType)) {
                A();
                throw new HttpDataSource.InvalidContentTypeException(contentType, rVar);
            }
            if (this.f51307r == 200) {
                long j12 = rVar.f51200g;
                if (j12 != 0) {
                    j10 = j12;
                }
            }
            boolean zC = C(httpURLConnectionD);
            if (zC) {
                this.f51308s = rVar.f51201h;
            } else {
                long j13 = rVar.f51201h;
                if (j13 != -1) {
                    this.f51308s = j13;
                } else {
                    long jB = e0.b(httpURLConnectionD.getHeaderField("Content-Length"), httpURLConnectionD.getHeaderField("Content-Range"));
                    this.f51308s = jB != -1 ? jB - j10 : -1L;
                }
            }
            try {
                this.f51305p = httpURLConnectionD.getInputStream();
                if (zC) {
                    this.f51305p = new GZIPInputStream(this.f51305p);
                }
                this.f51306q = true;
                z(rVar);
                try {
                    J(j10, rVar);
                    return this.f51308s;
                } catch (IOException e10) {
                    A();
                    if (e10 instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e10);
                    }
                    throw new HttpDataSource.HttpDataSourceException(e10, rVar, 2000, 1);
                }
            } catch (IOException e11) {
                A();
                throw new HttpDataSource.HttpDataSourceException(e11, rVar, 2000, 1);
            }
        } catch (IOException e12) {
            A();
            throw HttpDataSource.HttpDataSourceException.c(e12, rVar, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.f, com.google.android.exoplayer2.upstream.o
    public Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.f51304o;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // com.google.android.exoplayer2.upstream.o
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.f51305p;
            if (inputStream != null) {
                long j10 = this.f51308s;
                long j11 = -1;
                if (j10 != -1) {
                    j11 = j10 - this.f51309t;
                }
                F(this.f51304o, j11);
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new HttpDataSource.HttpDataSourceException(e10, (r) com.google.android.exoplayer2.util.u0.k(this.f51303n), 2000, 3);
                }
            }
            this.f51305p = null;
            A();
            if (this.f51306q) {
                this.f51306q = false;
                x();
            }
        } catch (Throwable th2) {
            this.f51305p = null;
            A();
            if (this.f51306q) {
                this.f51306q = false;
                x();
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    @androidx.annotation.p0
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f51304o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int h() {
        int i10;
        if (this.f51304o == null || (i10 = this.f51307r) <= 0) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void k() {
        this.f51300k.a();
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void m(String str, String str2) {
        com.google.android.exoplayer2.util.a.g(str);
        com.google.android.exoplayer2.util.a.g(str2);
        this.f51300k.e(str, str2);
    }

    @Override // com.google.android.exoplayer2.upstream.k
    public int read(byte[] bArr, int i10, int i11) throws HttpDataSource.HttpDataSourceException {
        try {
            return H(bArr, i10, i11);
        } catch (IOException e10) {
            throw HttpDataSource.HttpDataSourceException.c(e10, (r) com.google.android.exoplayer2.util.u0.k(this.f51303n), 2);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void v(String str) {
        com.google.android.exoplayer2.util.a.g(str);
        this.f51300k.d(str);
    }
}
