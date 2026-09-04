package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableMap;
import com.huawei.hms.framework.common.ContainerUtils;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* JADX INFO: compiled from: MediaDescription.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f48652k = "audio";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f48653l = "video";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f48654m = "RTP/AVP";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f48657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f48659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f48662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ImmutableMap<String, String> f48663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f48664j;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MediaDescription.java */
    public static final class C0387b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f48665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f48666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f48667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f48668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final HashMap<String, String> f48669e = new HashMap<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f48670f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48672h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private String f48673i;

        public C0387b(String str, int i10, String str2, int i11) {
            this.f48665a = str;
            this.f48666b = i10;
            this.f48667c = str2;
            this.f48668d = i11;
        }

        public C0387b i(String str, String str2) {
            this.f48669e.put(str, str2);
            return this;
        }

        public b j() {
            try {
                com.google.android.exoplayer2.util.a.i(this.f48669e.containsKey(k0.f48803r));
                return new b(this, ImmutableMap.g(this.f48669e), d.a((String) u0.k(this.f48669e.get(k0.f48803r))));
            } catch (ParserException e10) {
                throw new IllegalStateException(e10);
            }
        }

        public C0387b k(int i10) {
            this.f48670f = i10;
            return this;
        }

        public C0387b l(String str) {
            this.f48672h = str;
            return this;
        }

        public C0387b m(String str) {
            this.f48673i = str;
            return this;
        }

        public C0387b n(String str) {
            this.f48671g = str;
            return this;
        }
    }

    /* JADX INFO: compiled from: MediaDescription.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: MediaDescription.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f48674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f48675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f48677d;

        private d(int i10, String str, int i11, int i12) {
            this.f48674a = i10;
            this.f48675b = str;
            this.f48676c = i11;
            this.f48677d = i12;
        }

        public static d a(String str) throws ParserException {
            String[] strArrQ1 = u0.q1(str, " ");
            com.google.android.exoplayer2.util.a.a(strArrQ1.length == 2);
            int iG = c0.g(strArrQ1[0]);
            String[] strArrP1 = u0.p1(strArrQ1[1].trim(), "/");
            com.google.android.exoplayer2.util.a.a(strArrP1.length >= 2);
            return new d(iG, strArrP1[0], c0.g(strArrP1[1]), strArrP1.length == 3 ? c0.g(strArrP1[2]) : -1);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f48674a == dVar.f48674a && this.f48675b.equals(dVar.f48675b) && this.f48676c == dVar.f48676c && this.f48677d == dVar.f48677d;
        }

        public int hashCode() {
            return ((((((217 + this.f48674a) * 31) + this.f48675b.hashCode()) * 31) + this.f48676c) * 31) + this.f48677d;
        }
    }

    private b(C0387b c0387b, ImmutableMap<String, String> immutableMap, d dVar) {
        this.f48655a = c0387b.f48665a;
        this.f48656b = c0387b.f48666b;
        this.f48657c = c0387b.f48667c;
        this.f48658d = c0387b.f48668d;
        this.f48660f = c0387b.f48671g;
        this.f48661g = c0387b.f48672h;
        this.f48659e = c0387b.f48670f;
        this.f48662h = c0387b.f48673i;
        this.f48663i = immutableMap;
        this.f48664j = dVar;
    }

    public ImmutableMap<String, String> a() {
        String str = this.f48663i.get(k0.f48800o);
        if (str == null) {
            return ImmutableMap.v();
        }
        String[] strArrQ1 = u0.q1(str, " ");
        com.google.android.exoplayer2.util.a.b(strArrQ1.length == 2, str);
        String[] strArrSplit = strArrQ1[1].split(";\\s?", 0);
        ImmutableMap.b bVar = new ImmutableMap.b();
        for (String str2 : strArrSplit) {
            String[] strArrQ2 = u0.q1(str2, ContainerUtils.KEY_VALUE_DELIMITER);
            bVar.i(strArrQ2[0], strArrQ2[1]);
        }
        return bVar.a();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f48655a.equals(bVar.f48655a) && this.f48656b == bVar.f48656b && this.f48657c.equals(bVar.f48657c) && this.f48658d == bVar.f48658d && this.f48659e == bVar.f48659e && this.f48663i.equals(bVar.f48663i) && this.f48664j.equals(bVar.f48664j) && u0.c(this.f48660f, bVar.f48660f) && u0.c(this.f48661g, bVar.f48661g) && u0.c(this.f48662h, bVar.f48662h);
    }

    public int hashCode() {
        int iHashCode = (((((((((((((217 + this.f48655a.hashCode()) * 31) + this.f48656b) * 31) + this.f48657c.hashCode()) * 31) + this.f48658d) * 31) + this.f48659e) * 31) + this.f48663i.hashCode()) * 31) + this.f48664j.hashCode()) * 31;
        String str = this.f48660f;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f48661g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f48662h;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
