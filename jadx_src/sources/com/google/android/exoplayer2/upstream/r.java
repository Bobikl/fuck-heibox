package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.y1;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: DataSpec.java */
/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f51187l = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f51188m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f51189n = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f51190o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f51191p = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f51192q = 2;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f51193r = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f51194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f51195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final byte[] f51197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f51198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public final long f51199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f51200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f51201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f51202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f51203j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final Object f51204k;

    /* JADX INFO: compiled from: DataSpec.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f51205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f51206b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51207c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f51208d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<String, String> f51209e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f51210f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f51211g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f51212h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f51213i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private Object f51214j;

        public b() {
            this.f51207c = 1;
            this.f51209e = Collections.emptyMap();
            this.f51211g = -1L;
        }

        private b(r rVar) {
            this.f51205a = rVar.f51194a;
            this.f51206b = rVar.f51195b;
            this.f51207c = rVar.f51196c;
            this.f51208d = rVar.f51197d;
            this.f51209e = rVar.f51198e;
            this.f51210f = rVar.f51200g;
            this.f51211g = rVar.f51201h;
            this.f51212h = rVar.f51202i;
            this.f51213i = rVar.f51203j;
            this.f51214j = rVar.f51204k;
        }

        public r a() {
            com.google.android.exoplayer2.util.a.l(this.f51205a, "The uri must be set.");
            return new r(this.f51205a, this.f51206b, this.f51207c, this.f51208d, this.f51209e, this.f51210f, this.f51211g, this.f51212h, this.f51213i, this.f51214j);
        }

        public b b(@androidx.annotation.p0 Object obj) {
            this.f51214j = obj;
            return this;
        }

        public b c(int i10) {
            this.f51213i = i10;
            return this;
        }

        public b d(@androidx.annotation.p0 byte[] bArr) {
            this.f51208d = bArr;
            return this;
        }

        public b e(int i10) {
            this.f51207c = i10;
            return this;
        }

        public b f(Map<String, String> map) {
            this.f51209e = map;
            return this;
        }

        public b g(@androidx.annotation.p0 String str) {
            this.f51212h = str;
            return this;
        }

        public b h(long j10) {
            this.f51211g = j10;
            return this;
        }

        public b i(long j10) {
            this.f51210f = j10;
            return this;
        }

        public b j(Uri uri) {
            this.f51205a = uri;
            return this;
        }

        public b k(String str) {
            this.f51205a = Uri.parse(str);
            return this;
        }

        public b l(long j10) {
            this.f51206b = j10;
            return this;
        }
    }

    /* JADX INFO: compiled from: DataSpec.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: DataSpec.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    static {
        y1.a("goog.exo.datasource");
    }

    public r(Uri uri) {
        this(uri, 0L, -1L);
    }

    @Deprecated
    public r(Uri uri, int i10) {
        this(uri, 0L, -1L, null, i10);
    }

    @Deprecated
    public r(Uri uri, int i10, @androidx.annotation.p0 byte[] bArr, long j10, long j11, long j12, @androidx.annotation.p0 String str, int i11) {
        this(uri, i10, bArr, j10, j11, j12, str, i11, Collections.emptyMap());
    }

    @Deprecated
    public r(Uri uri, int i10, @androidx.annotation.p0 byte[] bArr, long j10, long j11, long j12, @androidx.annotation.p0 String str, int i11, Map<String, String> map) {
        this(uri, j10 - j11, i10, bArr, map, j11, j12, str, i11, null);
    }

    private r(Uri uri, long j10, int i10, @androidx.annotation.p0 byte[] bArr, Map<String, String> map, long j11, long j12, @androidx.annotation.p0 String str, int i11, @androidx.annotation.p0 Object obj) {
        byte[] bArr2 = bArr;
        long j13 = j10 + j11;
        boolean z10 = true;
        com.google.android.exoplayer2.util.a.a(j13 >= 0);
        com.google.android.exoplayer2.util.a.a(j11 >= 0);
        if (j12 <= 0 && j12 != -1) {
            z10 = false;
        }
        com.google.android.exoplayer2.util.a.a(z10);
        this.f51194a = uri;
        this.f51195b = j10;
        this.f51196c = i10;
        this.f51197d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f51198e = Collections.unmodifiableMap(new HashMap(map));
        this.f51200g = j11;
        this.f51199f = j13;
        this.f51201h = j12;
        this.f51202i = str;
        this.f51203j = i11;
        this.f51204k = obj;
    }

    public r(Uri uri, long j10, long j11) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j10, j11, null, 0, null);
    }

    @Deprecated
    public r(Uri uri, long j10, long j11, long j12, @androidx.annotation.p0 String str, int i10) {
        this(uri, null, j10, j11, j12, str, i10);
    }

    @Deprecated
    public r(Uri uri, long j10, long j11, @androidx.annotation.p0 String str) {
        this(uri, j10, j10, j11, str, 0);
    }

    @Deprecated
    public r(Uri uri, long j10, long j11, @androidx.annotation.p0 String str, int i10) {
        this(uri, j10, j10, j11, str, i10);
    }

    @Deprecated
    public r(Uri uri, long j10, long j11, @androidx.annotation.p0 String str, int i10, Map<String, String> map) {
        this(uri, 1, null, j10, j10, j11, str, i10, map);
    }

    @Deprecated
    public r(Uri uri, @androidx.annotation.p0 byte[] bArr, long j10, long j11, long j12, @androidx.annotation.p0 String str, int i10) {
        this(uri, bArr != null ? 2 : 1, bArr, j10, j11, j12, str, i10);
    }

    public static String c(int i10) {
        if (i10 == 1) {
            return "GET";
        }
        if (i10 == 2) {
            return "POST";
        }
        if (i10 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public b a() {
        return new b();
    }

    public final String b() {
        return c(this.f51196c);
    }

    public boolean d(int i10) {
        return (this.f51203j & i10) == i10;
    }

    public r e(long j10) {
        long j11 = this.f51201h;
        return f(j10, j11 != -1 ? j11 - j10 : -1L);
    }

    public r f(long j10, long j11) {
        return (j10 == 0 && this.f51201h == j11) ? this : new r(this.f51194a, this.f51195b, this.f51196c, this.f51197d, this.f51198e, this.f51200g + j10, j11, this.f51202i, this.f51203j, this.f51204k);
    }

    public r g(Map<String, String> map) {
        HashMap map2 = new HashMap(this.f51198e);
        map2.putAll(map);
        return new r(this.f51194a, this.f51195b, this.f51196c, this.f51197d, map2, this.f51200g, this.f51201h, this.f51202i, this.f51203j, this.f51204k);
    }

    public r h(Map<String, String> map) {
        return new r(this.f51194a, this.f51195b, this.f51196c, this.f51197d, map, this.f51200g, this.f51201h, this.f51202i, this.f51203j, this.f51204k);
    }

    public r i(Uri uri) {
        return new r(uri, this.f51195b, this.f51196c, this.f51197d, this.f51198e, this.f51200g, this.f51201h, this.f51202i, this.f51203j, this.f51204k);
    }

    public String toString() {
        String strB = b();
        String strValueOf = String.valueOf(this.f51194a);
        long j10 = this.f51200g;
        long j11 = this.f51201h;
        String str = this.f51202i;
        int i10 = this.f51203j;
        StringBuilder sb2 = new StringBuilder(String.valueOf(strB).length() + 70 + strValueOf.length() + String.valueOf(str).length());
        sb2.append("DataSpec[");
        sb2.append(strB);
        sb2.append(" ");
        sb2.append(strValueOf);
        sb2.append(", ");
        sb2.append(j10);
        sb2.append(", ");
        sb2.append(j11);
        sb2.append(", ");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }
}
