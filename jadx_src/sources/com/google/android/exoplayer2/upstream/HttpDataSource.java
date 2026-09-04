package com.google.android.exoplayer2.upstream;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public interface HttpDataSource extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.google.common.base.x<String> f50864a = new com.google.common.base.x() { // from class: com.google.android.exoplayer2.upstream.b0
        @Override // com.google.common.base.x
        public final boolean apply(Object obj) {
            return c0.a((String) obj);
        }
    };

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        public CleartextNotPermittedException(IOException iOException, r rVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, rVar, 2007, 1);
        }
    }

    public static class HttpDataSourceException extends DataSourceException {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f50865f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f50866g = 2;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f50867h = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final r f50868d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f50869e;

        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        @Deprecated
        public HttpDataSourceException(r rVar, int i10) {
            this(rVar, 2000, i10);
        }

        public HttpDataSourceException(r rVar, int i10, int i11) {
            super(b(i10, i11));
            this.f50868d = rVar;
            this.f50869e = i11;
        }

        @Deprecated
        public HttpDataSourceException(IOException iOException, r rVar, int i10) {
            this(iOException, rVar, 2000, i10);
        }

        public HttpDataSourceException(IOException iOException, r rVar, int i10, int i11) {
            super(iOException, b(i10, i11));
            this.f50868d = rVar;
            this.f50869e = i11;
        }

        @Deprecated
        public HttpDataSourceException(String str, r rVar, int i10) {
            this(str, rVar, 2000, i10);
        }

        public HttpDataSourceException(String str, r rVar, int i10, int i11) {
            super(str, b(i10, i11));
            this.f50868d = rVar;
            this.f50869e = i11;
        }

        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, r rVar, int i10) {
            this(str, iOException, rVar, 2000, i10);
        }

        public HttpDataSourceException(String str, @androidx.annotation.p0 IOException iOException, r rVar, int i10, int i11) {
            super(str, iOException, b(i10, i11));
            this.f50868d = rVar;
            this.f50869e = i11;
        }

        private static int b(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static HttpDataSourceException c(IOException iOException, r rVar, int i10) {
            int i11;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i11 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i11 = 1004;
            } else {
                i11 = (message == null || !com.google.common.base.a.g(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            return i11 == 2007 ? new CleartextNotPermittedException(iOException, rVar) : new HttpDataSourceException(iOException, rVar, i11, i10);
        }
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f50870i;

        /* JADX WARN: Illegal instructions before constructor call */
        public InvalidContentTypeException(String str, r rVar) {
            String strValueOf = String.valueOf(str);
            super(strValueOf.length() != 0 ? "Invalid content type: ".concat(strValueOf) : new String("Invalid content type: "), rVar, 2003, 1);
            this.f50870i = str;
        }
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f50871i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        public final String f50872j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Map<String, List<String>> f50873k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f50874l;

        public InvalidResponseCodeException(int i10, @androidx.annotation.p0 String str, @androidx.annotation.p0 IOException iOException, Map<String, List<String>> map, r rVar, byte[] bArr) {
            StringBuilder sb2 = new StringBuilder(26);
            sb2.append("Response code: ");
            sb2.append(i10);
            super(sb2.toString(), iOException, rVar, 2004, 1);
            this.f50871i = i10;
            this.f50872j = str;
            this.f50873k = map;
            this.f50874l = bArr;
        }

        @Deprecated
        public InvalidResponseCodeException(int i10, @androidx.annotation.p0 String str, Map<String, List<String>> map, r rVar) {
            this(i10, str, null, map, rVar, com.google.android.exoplayer2.util.u0.f51541f);
        }

        @Deprecated
        public InvalidResponseCodeException(int i10, Map<String, List<String>> map, r rVar) {
            this(i10, null, null, map, rVar, com.google.android.exoplayer2.util.u0.f51541f);
        }
    }

    public static abstract class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f50875a = new c();

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b, com.google.android.exoplayer2.upstream.o.a
        public final HttpDataSource a() {
            return c(this.f50875a);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.b
        public final b b(Map<String, String> map) {
            this.f50875a.b(map);
            return this;
        }

        protected abstract HttpDataSource c(c cVar);
    }

    public interface b extends o.a {
        @Override // com.google.android.exoplayer2.upstream.o.a
        HttpDataSource a();

        @Override // com.google.android.exoplayer2.upstream.o.a
        /* bridge */ /* synthetic */ o a();

        b b(Map<String, String> map);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, String> f50876a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private Map<String, String> f50877b;

        public synchronized void a() {
            this.f50877b = null;
            this.f50876a.clear();
        }

        public synchronized void b(Map<String, String> map) {
            this.f50877b = null;
            this.f50876a.clear();
            this.f50876a.putAll(map);
        }

        public synchronized Map<String, String> c() {
            if (this.f50877b == null) {
                this.f50877b = Collections.unmodifiableMap(new HashMap(this.f50876a));
            }
            return this.f50877b;
        }

        public synchronized void d(String str) {
            this.f50877b = null;
            this.f50876a.remove(str);
        }

        public synchronized void e(String str, String str2) {
            this.f50877b = null;
            this.f50876a.put(str, str2);
        }

        public synchronized void f(Map<String, String> map) {
            this.f50877b = null;
            this.f50876a.putAll(map);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.o
    long a(r rVar) throws HttpDataSourceException;

    @Override // com.google.android.exoplayer2.upstream.o
    Map<String, List<String>> b();

    @Override // com.google.android.exoplayer2.upstream.o
    void close() throws HttpDataSourceException;

    int h();

    void k();

    void m(String str, String str2);

    @Override // com.google.android.exoplayer2.upstream.k
    int read(byte[] bArr, int i10, int i11) throws HttpDataSourceException;

    void v(String str);
}
