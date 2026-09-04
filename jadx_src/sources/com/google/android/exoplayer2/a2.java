package com.google.android.exoplayer2;

import android.os.Bundle;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: Format.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a2 implements i {
    private static final int G2 = 25;
    private static final int G3 = 27;
    public static final int H = -1;
    public static final long I = Long.MAX_VALUE;
    private static final int J3 = 28;
    private static final int K = 0;
    private static final int K3 = 29;
    private static final int L = 1;
    private static final int M = 2;
    private static final int N = 3;
    private static final int O = 4;
    private static final int P = 5;
    private static final int Q = 6;
    private static final int R = 7;
    private static final int S = 8;
    private static final int T = 9;
    private static final int U = 10;
    private static final int V = 11;
    private static final int W = 12;
    private static final int X = 13;
    private static final int Y = 14;
    private static final int Z = 15;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f43572a0 = 16;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f43573b0 = 17;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f43574c0 = 18;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f43575p1 = 19;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f43576p2 = 22;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f43577p3 = 26;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f43578x1 = 20;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f43579x2 = 23;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f43580y1 = 21;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f43581y2 = 24;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    private int G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f43582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f43583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f43584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f43586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f43587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f43588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f43589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f43590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final Metadata f43591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f43592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f43593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f43594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<byte[]> f43595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    public final DrmInitData f43596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f43597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f43598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f43599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f43600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f43601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f43602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    public final byte[] f43603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f43604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    public final com.google.android.exoplayer2.video.c f43605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f43606z;
    private static final a2 J = new b().E();
    public static final i.a<a2> L3 = new i.a() { // from class: com.google.android.exoplayer2.z1
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return a2.v(bundle);
        }
    };

    /* JADX INFO: compiled from: Format.java */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private int D;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private String f43607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private String f43608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private String f43609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f43610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f43611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f43612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f43613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private String f43614h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private Metadata f43615i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private String f43616j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private String f43617k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f43618l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private List<byte[]> f43619m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @androidx.annotation.p0
        private DrmInitData f43620n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f43621o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f43622p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f43623q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private float f43624r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f43625s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f43626t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f43627u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f43628v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @androidx.annotation.p0
        private com.google.android.exoplayer2.video.c f43629w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private int f43630x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private int f43631y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private int f43632z;

        public b() {
            this.f43612f = -1;
            this.f43613g = -1;
            this.f43618l = -1;
            this.f43621o = Long.MAX_VALUE;
            this.f43622p = -1;
            this.f43623q = -1;
            this.f43624r = -1.0f;
            this.f43626t = 1.0f;
            this.f43628v = -1;
            this.f43630x = -1;
            this.f43631y = -1;
            this.f43632z = -1;
            this.C = -1;
            this.D = 0;
        }

        private b(a2 a2Var) {
            this.f43607a = a2Var.f43582b;
            this.f43608b = a2Var.f43583c;
            this.f43609c = a2Var.f43584d;
            this.f43610d = a2Var.f43585e;
            this.f43611e = a2Var.f43586f;
            this.f43612f = a2Var.f43587g;
            this.f43613g = a2Var.f43588h;
            this.f43614h = a2Var.f43590j;
            this.f43615i = a2Var.f43591k;
            this.f43616j = a2Var.f43592l;
            this.f43617k = a2Var.f43593m;
            this.f43618l = a2Var.f43594n;
            this.f43619m = a2Var.f43595o;
            this.f43620n = a2Var.f43596p;
            this.f43621o = a2Var.f43597q;
            this.f43622p = a2Var.f43598r;
            this.f43623q = a2Var.f43599s;
            this.f43624r = a2Var.f43600t;
            this.f43625s = a2Var.f43601u;
            this.f43626t = a2Var.f43602v;
            this.f43627u = a2Var.f43603w;
            this.f43628v = a2Var.f43604x;
            this.f43629w = a2Var.f43605y;
            this.f43630x = a2Var.f43606z;
            this.f43631y = a2Var.A;
            this.f43632z = a2Var.B;
            this.A = a2Var.C;
            this.B = a2Var.D;
            this.C = a2Var.E;
            this.D = a2Var.F;
        }

        public a2 E() {
            return new a2(this);
        }

        public b F(int i10) {
            this.C = i10;
            return this;
        }

        public b G(int i10) {
            this.f43612f = i10;
            return this;
        }

        public b H(int i10) {
            this.f43630x = i10;
            return this;
        }

        public b I(@androidx.annotation.p0 String str) {
            this.f43614h = str;
            return this;
        }

        public b J(@androidx.annotation.p0 com.google.android.exoplayer2.video.c cVar) {
            this.f43629w = cVar;
            return this;
        }

        public b K(@androidx.annotation.p0 String str) {
            this.f43616j = str;
            return this;
        }

        public b L(int i10) {
            this.D = i10;
            return this;
        }

        public b M(@androidx.annotation.p0 DrmInitData drmInitData) {
            this.f43620n = drmInitData;
            return this;
        }

        public b N(int i10) {
            this.A = i10;
            return this;
        }

        public b O(int i10) {
            this.B = i10;
            return this;
        }

        public b P(float f10) {
            this.f43624r = f10;
            return this;
        }

        public b Q(int i10) {
            this.f43623q = i10;
            return this;
        }

        public b R(int i10) {
            this.f43607a = Integer.toString(i10);
            return this;
        }

        public b S(@androidx.annotation.p0 String str) {
            this.f43607a = str;
            return this;
        }

        public b T(@androidx.annotation.p0 List<byte[]> list) {
            this.f43619m = list;
            return this;
        }

        public b U(@androidx.annotation.p0 String str) {
            this.f43608b = str;
            return this;
        }

        public b V(@androidx.annotation.p0 String str) {
            this.f43609c = str;
            return this;
        }

        public b W(int i10) {
            this.f43618l = i10;
            return this;
        }

        public b X(@androidx.annotation.p0 Metadata metadata) {
            this.f43615i = metadata;
            return this;
        }

        public b Y(int i10) {
            this.f43632z = i10;
            return this;
        }

        public b Z(int i10) {
            this.f43613g = i10;
            return this;
        }

        public b a0(float f10) {
            this.f43626t = f10;
            return this;
        }

        public b b0(@androidx.annotation.p0 byte[] bArr) {
            this.f43627u = bArr;
            return this;
        }

        public b c0(int i10) {
            this.f43611e = i10;
            return this;
        }

        public b d0(int i10) {
            this.f43625s = i10;
            return this;
        }

        public b e0(@androidx.annotation.p0 String str) {
            this.f43617k = str;
            return this;
        }

        public b f0(int i10) {
            this.f43631y = i10;
            return this;
        }

        public b g0(int i10) {
            this.f43610d = i10;
            return this;
        }

        public b h0(int i10) {
            this.f43628v = i10;
            return this;
        }

        public b i0(long j10) {
            this.f43621o = j10;
            return this;
        }

        public b j0(int i10) {
            this.f43622p = i10;
            return this;
        }
    }

    private a2(b bVar) {
        this.f43582b = bVar.f43607a;
        this.f43583c = bVar.f43608b;
        this.f43584d = com.google.android.exoplayer2.util.u0.W0(bVar.f43609c);
        this.f43585e = bVar.f43610d;
        this.f43586f = bVar.f43611e;
        int i10 = bVar.f43612f;
        this.f43587g = i10;
        int i11 = bVar.f43613g;
        this.f43588h = i11;
        this.f43589i = i11 != -1 ? i11 : i10;
        this.f43590j = bVar.f43614h;
        this.f43591k = bVar.f43615i;
        this.f43592l = bVar.f43616j;
        this.f43593m = bVar.f43617k;
        this.f43594n = bVar.f43618l;
        this.f43595o = bVar.f43619m == null ? Collections.emptyList() : bVar.f43619m;
        DrmInitData drmInitData = bVar.f43620n;
        this.f43596p = drmInitData;
        this.f43597q = bVar.f43621o;
        this.f43598r = bVar.f43622p;
        this.f43599s = bVar.f43623q;
        this.f43600t = bVar.f43624r;
        this.f43601u = bVar.f43625s == -1 ? 0 : bVar.f43625s;
        this.f43602v = bVar.f43626t == -1.0f ? 1.0f : bVar.f43626t;
        this.f43603w = bVar.f43627u;
        this.f43604x = bVar.f43628v;
        this.f43605y = bVar.f43629w;
        this.f43606z = bVar.f43630x;
        this.A = bVar.f43631y;
        this.B = bVar.f43632z;
        this.C = bVar.A == -1 ? 0 : bVar.A;
        this.D = bVar.B != -1 ? bVar.B : 0;
        this.E = bVar.C;
        if (bVar.D != 0 || drmInitData == null) {
            this.F = bVar.D;
        } else {
            this.F = 1;
        }
    }

    public static String A(@androidx.annotation.p0 a2 a2Var) {
        if (a2Var == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("id=");
        sb2.append(a2Var.f43582b);
        sb2.append(", mimeType=");
        sb2.append(a2Var.f43593m);
        if (a2Var.f43589i != -1) {
            sb2.append(", bitrate=");
            sb2.append(a2Var.f43589i);
        }
        if (a2Var.f43590j != null) {
            sb2.append(", codecs=");
            sb2.append(a2Var.f43590j);
        }
        if (a2Var.f43596p != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i10 = 0;
            while (true) {
                DrmInitData drmInitData = a2Var.f43596p;
                if (i10 >= drmInitData.f44653e) {
                    break;
                }
                UUID uuid = drmInitData.f(i10).f44655c;
                if (uuid.equals(j.V1)) {
                    linkedHashSet.add(j.Q1);
                } else if (uuid.equals(j.W1)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(j.Y1)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(j.X1)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(j.U1)) {
                    linkedHashSet.add(hg.b.f119170b);
                } else {
                    String strValueOf = String.valueOf(uuid);
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 10);
                    sb3.append("unknown (");
                    sb3.append(strValueOf);
                    sb3.append(")");
                    linkedHashSet.add(sb3.toString());
                }
                i10++;
            }
            sb2.append(", drm=[");
            sb2.append(com.google.common.base.p.o(',').k(linkedHashSet));
            sb2.append(']');
        }
        if (a2Var.f43598r != -1 && a2Var.f43599s != -1) {
            sb2.append(", res=");
            sb2.append(a2Var.f43598r);
            sb2.append("x");
            sb2.append(a2Var.f43599s);
        }
        if (a2Var.f43600t != -1.0f) {
            sb2.append(", fps=");
            sb2.append(a2Var.f43600t);
        }
        if (a2Var.f43606z != -1) {
            sb2.append(", channels=");
            sb2.append(a2Var.f43606z);
        }
        if (a2Var.A != -1) {
            sb2.append(", sample_rate=");
            sb2.append(a2Var.A);
        }
        if (a2Var.f43584d != null) {
            sb2.append(", language=");
            sb2.append(a2Var.f43584d);
        }
        if (a2Var.f43583c != null) {
            sb2.append(", label=");
            sb2.append(a2Var.f43583c);
        }
        if ((a2Var.f43586f & 16384) != 0) {
            sb2.append(", trick-play-track");
        }
        return sb2.toString();
    }

    @Deprecated
    public static a2 o(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, int i10, int i11, int i12, int i13, int i14, @androidx.annotation.p0 List<byte[]> list, @androidx.annotation.p0 DrmInitData drmInitData, int i15, @androidx.annotation.p0 String str4) {
        return new b().S(str).V(str4).g0(i15).G(i10).Z(i10).I(str3).e0(str2).W(i11).T(list).M(drmInitData).H(i12).f0(i13).Y(i14).E();
    }

    @Deprecated
    public static a2 p(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, int i10, int i11, int i12, int i13, @androidx.annotation.p0 List<byte[]> list, @androidx.annotation.p0 DrmInitData drmInitData, int i14, @androidx.annotation.p0 String str4) {
        return new b().S(str).V(str4).g0(i14).G(i10).Z(i10).I(str3).e0(str2).W(i11).T(list).M(drmInitData).H(i12).f0(i13).E();
    }

    @Deprecated
    public static a2 q(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, @androidx.annotation.p0 String str4, @androidx.annotation.p0 String str5, int i10, int i11, int i12, @androidx.annotation.p0 String str6) {
        return new b().S(str).U(str2).V(str6).g0(i11).c0(i12).G(i10).Z(i10).I(str5).K(str3).e0(str4).E();
    }

    @Deprecated
    public static a2 r(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        return new b().S(str).e0(str2).E();
    }

    @Deprecated
    public static a2 s(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, int i10, int i11, int i12, int i13, float f10, @androidx.annotation.p0 List<byte[]> list, int i14, float f11, @androidx.annotation.p0 DrmInitData drmInitData) {
        return new b().S(str).G(i10).Z(i10).I(str3).e0(str2).W(i11).T(list).M(drmInitData).j0(i12).Q(i13).P(f10).d0(i14).a0(f11).E();
    }

    @Deprecated
    public static a2 t(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2, @androidx.annotation.p0 String str3, int i10, int i11, int i12, int i13, float f10, @androidx.annotation.p0 List<byte[]> list, @androidx.annotation.p0 DrmInitData drmInitData) {
        return new b().S(str).G(i10).Z(i10).I(str3).e0(str2).W(i11).T(list).M(drmInitData).j0(i12).Q(i13).P(f10).E();
    }

    @androidx.annotation.p0
    private static <T> T u(@androidx.annotation.p0 T t10, @androidx.annotation.p0 T t11) {
        return t10 != null ? t10 : t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static a2 v(Bundle bundle) {
        b bVar = new b();
        com.google.android.exoplayer2.util.d.a(bundle);
        int i10 = 0;
        String string = bundle.getString(y(0));
        a2 a2Var = J;
        bVar.S((String) u(string, a2Var.f43582b)).U((String) u(bundle.getString(y(1)), a2Var.f43583c)).V((String) u(bundle.getString(y(2)), a2Var.f43584d)).g0(bundle.getInt(y(3), a2Var.f43585e)).c0(bundle.getInt(y(4), a2Var.f43586f)).G(bundle.getInt(y(5), a2Var.f43587g)).Z(bundle.getInt(y(6), a2Var.f43588h)).I((String) u(bundle.getString(y(7)), a2Var.f43590j)).X((Metadata) u((Metadata) bundle.getParcelable(y(8)), a2Var.f43591k)).K((String) u(bundle.getString(y(9)), a2Var.f43592l)).e0((String) u(bundle.getString(y(10)), a2Var.f43593m)).W(bundle.getInt(y(11), a2Var.f43594n));
        ArrayList arrayList = new ArrayList();
        while (true) {
            byte[] byteArray = bundle.getByteArray(z(i10));
            if (byteArray == null) {
                b bVarM = bVar.T(arrayList).M((DrmInitData) bundle.getParcelable(y(13)));
                String strY = y(14);
                a2 a2Var2 = J;
                bVarM.i0(bundle.getLong(strY, a2Var2.f43597q)).j0(bundle.getInt(y(15), a2Var2.f43598r)).Q(bundle.getInt(y(16), a2Var2.f43599s)).P(bundle.getFloat(y(17), a2Var2.f43600t)).d0(bundle.getInt(y(18), a2Var2.f43601u)).a0(bundle.getFloat(y(19), a2Var2.f43602v)).b0(bundle.getByteArray(y(20))).h0(bundle.getInt(y(21), a2Var2.f43604x)).J((com.google.android.exoplayer2.video.c) com.google.android.exoplayer2.util.d.e(com.google.android.exoplayer2.video.c.f51720k, bundle.getBundle(y(22)))).H(bundle.getInt(y(23), a2Var2.f43606z)).f0(bundle.getInt(y(24), a2Var2.A)).Y(bundle.getInt(y(25), a2Var2.B)).N(bundle.getInt(y(26), a2Var2.C)).O(bundle.getInt(y(27), a2Var2.D)).F(bundle.getInt(y(28), a2Var2.E)).L(bundle.getInt(y(29), a2Var2.F));
                return bVar.E();
            }
            arrayList.add(byteArray);
            i10++;
        }
    }

    private static String y(int i10) {
        return Integer.toString(i10, 36);
    }

    private static String z(int i10) {
        String strY = y(12);
        String string = Integer.toString(i10, 36);
        StringBuilder sb2 = new StringBuilder(String.valueOf(strY).length() + 1 + String.valueOf(string).length());
        sb2.append(strY);
        sb2.append(lg.a.f131412e);
        sb2.append(string);
        return sb2.toString();
    }

    public a2 B(a2 a2Var) {
        String str;
        if (this == a2Var) {
            return this;
        }
        int iL = com.google.android.exoplayer2.util.y.l(this.f43593m);
        String str2 = a2Var.f43582b;
        String str3 = a2Var.f43583c;
        if (str3 == null) {
            str3 = this.f43583c;
        }
        String str4 = this.f43584d;
        if ((iL == 3 || iL == 1) && (str = a2Var.f43584d) != null) {
            str4 = str;
        }
        int i10 = this.f43587g;
        if (i10 == -1) {
            i10 = a2Var.f43587g;
        }
        int i11 = this.f43588h;
        if (i11 == -1) {
            i11 = a2Var.f43588h;
        }
        String str5 = this.f43590j;
        if (str5 == null) {
            String strS = com.google.android.exoplayer2.util.u0.S(a2Var.f43590j, iL);
            if (com.google.android.exoplayer2.util.u0.r1(strS).length == 1) {
                str5 = strS;
            }
        }
        Metadata metadata = this.f43591k;
        Metadata metadataB = metadata == null ? a2Var.f43591k : metadata.b(a2Var.f43591k);
        float f10 = this.f43600t;
        if (f10 == -1.0f && iL == 2) {
            f10 = a2Var.f43600t;
        }
        return c().S(str2).U(str3).V(str4).g0(this.f43585e | a2Var.f43585e).c0(this.f43586f | a2Var.f43586f).G(i10).Z(i11).I(str5).X(metadataB).M(DrmInitData.d(a2Var.f43596p, this.f43596p)).P(f10).E();
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(y(0), this.f43582b);
        bundle.putString(y(1), this.f43583c);
        bundle.putString(y(2), this.f43584d);
        bundle.putInt(y(3), this.f43585e);
        bundle.putInt(y(4), this.f43586f);
        bundle.putInt(y(5), this.f43587g);
        bundle.putInt(y(6), this.f43588h);
        bundle.putString(y(7), this.f43590j);
        bundle.putParcelable(y(8), this.f43591k);
        bundle.putString(y(9), this.f43592l);
        bundle.putString(y(10), this.f43593m);
        bundle.putInt(y(11), this.f43594n);
        for (int i10 = 0; i10 < this.f43595o.size(); i10++) {
            bundle.putByteArray(z(i10), this.f43595o.get(i10));
        }
        bundle.putParcelable(y(13), this.f43596p);
        bundle.putLong(y(14), this.f43597q);
        bundle.putInt(y(15), this.f43598r);
        bundle.putInt(y(16), this.f43599s);
        bundle.putFloat(y(17), this.f43600t);
        bundle.putInt(y(18), this.f43601u);
        bundle.putFloat(y(19), this.f43602v);
        bundle.putByteArray(y(20), this.f43603w);
        bundle.putInt(y(21), this.f43604x);
        bundle.putBundle(y(22), com.google.android.exoplayer2.util.d.j(this.f43605y));
        bundle.putInt(y(23), this.f43606z);
        bundle.putInt(y(24), this.A);
        bundle.putInt(y(25), this.B);
        bundle.putInt(y(26), this.C);
        bundle.putInt(y(27), this.D);
        bundle.putInt(y(28), this.E);
        bundle.putInt(y(29), this.F);
        return bundle;
    }

    public b c() {
        return new b();
    }

    @Deprecated
    public a2 d(int i10) {
        return c().G(i10).Z(i10).E();
    }

    public a2 e(int i10) {
        return c().L(i10).E();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj == null || a2.class != obj.getClass()) {
            return false;
        }
        a2 a2Var = (a2) obj;
        int i11 = this.G;
        if (i11 == 0 || (i10 = a2Var.G) == 0 || i11 == i10) {
            return this.f43585e == a2Var.f43585e && this.f43586f == a2Var.f43586f && this.f43587g == a2Var.f43587g && this.f43588h == a2Var.f43588h && this.f43594n == a2Var.f43594n && this.f43597q == a2Var.f43597q && this.f43598r == a2Var.f43598r && this.f43599s == a2Var.f43599s && this.f43601u == a2Var.f43601u && this.f43604x == a2Var.f43604x && this.f43606z == a2Var.f43606z && this.A == a2Var.A && this.B == a2Var.B && this.C == a2Var.C && this.D == a2Var.D && this.E == a2Var.E && this.F == a2Var.F && Float.compare(this.f43600t, a2Var.f43600t) == 0 && Float.compare(this.f43602v, a2Var.f43602v) == 0 && com.google.android.exoplayer2.util.u0.c(this.f43582b, a2Var.f43582b) && com.google.android.exoplayer2.util.u0.c(this.f43583c, a2Var.f43583c) && com.google.android.exoplayer2.util.u0.c(this.f43590j, a2Var.f43590j) && com.google.android.exoplayer2.util.u0.c(this.f43592l, a2Var.f43592l) && com.google.android.exoplayer2.util.u0.c(this.f43593m, a2Var.f43593m) && com.google.android.exoplayer2.util.u0.c(this.f43584d, a2Var.f43584d) && Arrays.equals(this.f43603w, a2Var.f43603w) && com.google.android.exoplayer2.util.u0.c(this.f43591k, a2Var.f43591k) && com.google.android.exoplayer2.util.u0.c(this.f43605y, a2Var.f43605y) && com.google.android.exoplayer2.util.u0.c(this.f43596p, a2Var.f43596p) && x(a2Var);
        }
        return false;
    }

    @Deprecated
    public a2 f(@androidx.annotation.p0 DrmInitData drmInitData) {
        return c().M(drmInitData).E();
    }

    @Deprecated
    public a2 g(float f10) {
        return c().P(f10).E();
    }

    @Deprecated
    public a2 h(int i10, int i11) {
        return c().N(i10).O(i11).E();
    }

    public int hashCode() {
        if (this.G == 0) {
            String str = this.f43582b;
            int iHashCode = (bb.c.b.f30674h7 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f43583c;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f43584d;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f43585e) * 31) + this.f43586f) * 31) + this.f43587g) * 31) + this.f43588h) * 31;
            String str4 = this.f43590j;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f43591k;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f43592l;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f43593m;
            this.G = ((((((((((((((((((((((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f43594n) * 31) + ((int) this.f43597q)) * 31) + this.f43598r) * 31) + this.f43599s) * 31) + Float.floatToIntBits(this.f43600t)) * 31) + this.f43601u) * 31) + Float.floatToIntBits(this.f43602v)) * 31) + this.f43604x) * 31) + this.f43606z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) + this.F;
        }
        return this.G;
    }

    @Deprecated
    public a2 i(@androidx.annotation.p0 String str) {
        return c().U(str).E();
    }

    @Deprecated
    public a2 j(a2 a2Var) {
        return B(a2Var);
    }

    @Deprecated
    public a2 k(int i10) {
        return c().W(i10).E();
    }

    @Deprecated
    public a2 l(@androidx.annotation.p0 Metadata metadata) {
        return c().X(metadata).E();
    }

    @Deprecated
    public a2 m(long j10) {
        return c().i0(j10).E();
    }

    @Deprecated
    public a2 n(int i10, int i11) {
        return c().j0(i10).Q(i11).E();
    }

    public String toString() {
        String str = this.f43582b;
        String str2 = this.f43583c;
        String str3 = this.f43592l;
        String str4 = this.f43593m;
        String str5 = this.f43590j;
        int i10 = this.f43589i;
        String str6 = this.f43584d;
        int i11 = this.f43598r;
        int i12 = this.f43599s;
        float f10 = this.f43600t;
        int i13 = this.f43606z;
        int i14 = this.A;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append("], [");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(i14);
        sb2.append("])");
        return sb2.toString();
    }

    public int w() {
        int i10;
        int i11 = this.f43598r;
        if (i11 == -1 || (i10 = this.f43599s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public boolean x(a2 a2Var) {
        if (this.f43595o.size() != a2Var.f43595o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f43595o.size(); i10++) {
            if (!Arrays.equals(this.f43595o.get(i10), a2Var.f43595o.get(i10))) {
                return false;
            }
        }
        return true;
    }
}
