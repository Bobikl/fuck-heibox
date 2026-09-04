package com.google.android.exoplayer2.source.rtsp;

import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.l1;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: RtspHeaders.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q {
    public static final String A = "Speed";
    public static final String B = "Supported";
    public static final String C = "Timestamp";
    public static final String D = "Transport";
    public static final String E = "User-Agent";
    public static final String F = "Via";
    public static final String G = "WWW-Authenticate";
    public static final q H = new b().e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f48905b = "Accept";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f48906c = "Allow";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f48907d = "Authorization";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f48908e = "Bandwidth";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f48909f = "Blocksize";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f48910g = "Cache-Control";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f48911h = "Connection";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f48912i = "Content-Base";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f48913j = "Content-Encoding";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f48914k = "Content-Language";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f48915l = "Content-Length";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f48916m = "Content-Location";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f48917n = "Content-Type";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f48918o = "CSeq";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f48919p = "Date";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f48920q = "Expires";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f48921r = "Location";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f48922s = "Proxy-Authenticate";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f48923t = "Proxy-Require";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f48924u = "Public";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f48925v = "Range";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f48926w = "RTP-Info";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f48927x = "RTCP-Interval";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f48928y = "Scale";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f48929z = "Session";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableListMultimap<String, String> f48930a;

    /* JADX INFO: compiled from: RtspHeaders.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableListMultimap.a<String, String> f48931a;

        public b() {
            this.f48931a = new ImmutableListMultimap.a<>();
        }

        private b(ImmutableListMultimap.a<String, String> aVar) {
            this.f48931a = aVar;
        }

        public b(String str, @androidx.annotation.p0 String str2, int i10) {
            this();
            b("User-Agent", str);
            b(q.f48918o, String.valueOf(i10));
            if (str2 != null) {
                b(q.f48929z, str2);
            }
        }

        public b b(String str, String str2) {
            this.f48931a.f(q.d(str.trim()), str2.trim());
            return this;
        }

        public b c(List<String> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                String[] strArrQ1 = u0.q1(list.get(i10), ":\\s?");
                if (strArrQ1.length == 2) {
                    b(strArrQ1[0], strArrQ1[1]);
                }
            }
            return this;
        }

        public b d(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                b(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public q e() {
            return new q(this);
        }
    }

    private q(b bVar) {
        this.f48930a = bVar.f48931a.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str) {
        if (com.google.common.base.a.a(str, "Accept")) {
            return "Accept";
        }
        if (com.google.common.base.a.a(str, "Allow")) {
            return "Allow";
        }
        if (com.google.common.base.a.a(str, "Authorization")) {
            return "Authorization";
        }
        if (com.google.common.base.a.a(str, f48908e)) {
            return f48908e;
        }
        if (com.google.common.base.a.a(str, f48909f)) {
            return f48909f;
        }
        if (com.google.common.base.a.a(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (com.google.common.base.a.a(str, "Connection")) {
            return "Connection";
        }
        if (com.google.common.base.a.a(str, f48912i)) {
            return f48912i;
        }
        if (com.google.common.base.a.a(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (com.google.common.base.a.a(str, "Content-Language")) {
            return "Content-Language";
        }
        if (com.google.common.base.a.a(str, "Content-Length")) {
            return "Content-Length";
        }
        if (com.google.common.base.a.a(str, "Content-Location")) {
            return "Content-Location";
        }
        if (com.google.common.base.a.a(str, "Content-Type")) {
            return "Content-Type";
        }
        if (com.google.common.base.a.a(str, f48918o)) {
            return f48918o;
        }
        if (com.google.common.base.a.a(str, "Date")) {
            return "Date";
        }
        if (com.google.common.base.a.a(str, "Expires")) {
            return "Expires";
        }
        if (com.google.common.base.a.a(str, "Location")) {
            return "Location";
        }
        if (com.google.common.base.a.a(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (com.google.common.base.a.a(str, f48923t)) {
            return f48923t;
        }
        if (com.google.common.base.a.a(str, f48924u)) {
            return f48924u;
        }
        if (com.google.common.base.a.a(str, "Range")) {
            return "Range";
        }
        if (com.google.common.base.a.a(str, f48926w)) {
            return f48926w;
        }
        if (com.google.common.base.a.a(str, f48927x)) {
            return f48927x;
        }
        if (com.google.common.base.a.a(str, f48928y)) {
            return f48928y;
        }
        if (com.google.common.base.a.a(str, f48929z)) {
            return f48929z;
        }
        if (com.google.common.base.a.a(str, A)) {
            return A;
        }
        if (com.google.common.base.a.a(str, B)) {
            return B;
        }
        if (com.google.common.base.a.a(str, C)) {
            return C;
        }
        if (com.google.common.base.a.a(str, D)) {
            return D;
        }
        if (com.google.common.base.a.a(str, "User-Agent")) {
            return "User-Agent";
        }
        if (com.google.common.base.a.a(str, "Via")) {
            return "Via";
        }
        return com.google.common.base.a.a(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public ImmutableListMultimap<String, String> b() {
        return this.f48930a;
    }

    public b c() {
        ImmutableListMultimap.a aVar = new ImmutableListMultimap.a();
        aVar.h(this.f48930a);
        return new b(aVar);
    }

    @androidx.annotation.p0
    public String e(String str) {
        ImmutableList<String> immutableListF = f(str);
        if (immutableListF.isEmpty()) {
            return null;
        }
        return (String) l1.w(immutableListF);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.f48930a.equals(((q) obj).f48930a);
        }
        return false;
    }

    public ImmutableList<String> f(String str) {
        return this.f48930a.get(d(str));
    }

    public int hashCode() {
        return this.f48930a.hashCode();
    }
}
