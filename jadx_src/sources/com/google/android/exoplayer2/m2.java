package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.exoplayer2.metadata.Metadata;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: MediaMetadata.java */
/* JADX INFO: loaded from: classes7.dex */
public final class m2 implements i {
    public static final int G2 = 20;
    private static final int G3 = 0;
    public static final int H = -1;
    public static final int I = 0;
    public static final int J = 1;
    private static final int J3 = 1;
    public static final int K = 2;
    private static final int K3 = 2;
    public static final int L = 3;
    private static final int L3 = 3;
    public static final int M = 4;
    private static final int M3 = 4;
    public static final int N = 5;
    private static final int N3 = 5;
    public static final int O = 6;
    private static final int O3 = 6;
    public static final int P = 0;
    private static final int P3 = 7;
    public static final int Q = 1;
    private static final int Q3 = 8;
    public static final int R = 2;
    private static final int R3 = 9;
    public static final int S = 3;
    private static final int S3 = 10;
    public static final int T = 4;
    private static final int T3 = 11;
    public static final int U = 5;
    private static final int U3 = 12;
    public static final int V = 6;
    private static final int V3 = 13;
    public static final int W = 7;
    private static final int W3 = 14;
    public static final int X = 8;
    private static final int X3 = 15;
    public static final int Y = 9;
    private static final int Y3 = 16;
    public static final int Z = 10;
    private static final int Z3 = 17;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final int f46569a0 = 11;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f46570a4 = 18;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f46571b0 = 12;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f46572b4 = 19;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final int f46573c0 = 13;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f46574c4 = 20;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final int f46575d4 = 21;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final int f46576e4 = 22;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final int f46577f4 = 23;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f46578g4 = 24;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f46579h4 = 25;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final int f46580i4 = 26;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    private static final int f46581j4 = 27;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final int f46582k4 = 28;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    private static final int f46583l4 = 29;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    private static final int f46584m4 = 1000;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f46586p1 = 14;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f46587p2 = 17;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final int f46589x1 = 15;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f46590x2 = 18;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final int f46591y1 = 16;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final int f46592y2 = 19;

    @androidx.annotation.p0
    public final CharSequence A;

    @androidx.annotation.p0
    public final CharSequence B;

    @androidx.annotation.p0
    public final Integer C;

    @androidx.annotation.p0
    public final Integer D;

    @androidx.annotation.p0
    public final CharSequence E;

    @androidx.annotation.p0
    public final CharSequence F;

    @androidx.annotation.p0
    public final Bundle G;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.p0
    public final Uri f46600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.p0
    public final k3 f46601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.p0
    public final k3 f46602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.p0
    public final byte[] f46603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    public final Uri f46605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.p0
    public final Boolean f46609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.p0
    @Deprecated
    public final Integer f46610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46611t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46612u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46613v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46614w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46615x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.p0
    public final Integer f46616y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.p0
    public final CharSequence f46617z;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final m2 f46588p3 = new b().F();

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final i.a<m2> f46585n4 = new i.a() { // from class: com.google.android.exoplayer2.l2
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return m2.d(bundle);
        }
    };

    /* JADX INFO: compiled from: MediaMetadata.java */
    public static final class b {

        @androidx.annotation.p0
        private Integer A;

        @androidx.annotation.p0
        private Integer B;

        @androidx.annotation.p0
        private CharSequence C;

        @androidx.annotation.p0
        private CharSequence D;

        @androidx.annotation.p0
        private Bundle E;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46618a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46619b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46620c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46621d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46624g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f46625h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @androidx.annotation.p0
        private k3 f46626i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @androidx.annotation.p0
        private k3 f46627j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @androidx.annotation.p0
        private byte[] f46628k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46629l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @androidx.annotation.p0
        private Uri f46630m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46631n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46632o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46633p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @androidx.annotation.p0
        private Boolean f46634q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46635r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46636s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46637t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46638u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46639v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @androidx.annotation.p0
        private Integer f46640w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46641x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46642y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        @androidx.annotation.p0
        private CharSequence f46643z;

        public b() {
        }

        private b(m2 m2Var) {
            this.f46618a = m2Var.f46593b;
            this.f46619b = m2Var.f46594c;
            this.f46620c = m2Var.f46595d;
            this.f46621d = m2Var.f46596e;
            this.f46622e = m2Var.f46597f;
            this.f46623f = m2Var.f46598g;
            this.f46624g = m2Var.f46599h;
            this.f46625h = m2Var.f46600i;
            this.f46626i = m2Var.f46601j;
            this.f46627j = m2Var.f46602k;
            this.f46628k = m2Var.f46603l;
            this.f46629l = m2Var.f46604m;
            this.f46630m = m2Var.f46605n;
            this.f46631n = m2Var.f46606o;
            this.f46632o = m2Var.f46607p;
            this.f46633p = m2Var.f46608q;
            this.f46634q = m2Var.f46609r;
            this.f46635r = m2Var.f46611t;
            this.f46636s = m2Var.f46612u;
            this.f46637t = m2Var.f46613v;
            this.f46638u = m2Var.f46614w;
            this.f46639v = m2Var.f46615x;
            this.f46640w = m2Var.f46616y;
            this.f46641x = m2Var.f46617z;
            this.f46642y = m2Var.A;
            this.f46643z = m2Var.B;
            this.A = m2Var.C;
            this.B = m2Var.D;
            this.C = m2Var.E;
            this.D = m2Var.F;
            this.E = m2Var.G;
        }

        public m2 F() {
            return new m2(this);
        }

        public b G(byte[] bArr, int i10) {
            if (this.f46628k == null || com.google.android.exoplayer2.util.u0.c(Integer.valueOf(i10), 3) || !com.google.android.exoplayer2.util.u0.c(this.f46629l, 3)) {
                this.f46628k = (byte[]) bArr.clone();
                this.f46629l = Integer.valueOf(i10);
            }
            return this;
        }

        public b H(@androidx.annotation.p0 m2 m2Var) {
            if (m2Var == null) {
                return this;
            }
            CharSequence charSequence = m2Var.f46593b;
            if (charSequence != null) {
                j0(charSequence);
            }
            CharSequence charSequence2 = m2Var.f46594c;
            if (charSequence2 != null) {
                M(charSequence2);
            }
            CharSequence charSequence3 = m2Var.f46595d;
            if (charSequence3 != null) {
                L(charSequence3);
            }
            CharSequence charSequence4 = m2Var.f46596e;
            if (charSequence4 != null) {
                K(charSequence4);
            }
            CharSequence charSequence5 = m2Var.f46597f;
            if (charSequence5 != null) {
                V(charSequence5);
            }
            CharSequence charSequence6 = m2Var.f46598g;
            if (charSequence6 != null) {
                i0(charSequence6);
            }
            CharSequence charSequence7 = m2Var.f46599h;
            if (charSequence7 != null) {
                T(charSequence7);
            }
            Uri uri = m2Var.f46600i;
            if (uri != null) {
                a0(uri);
            }
            k3 k3Var = m2Var.f46601j;
            if (k3Var != null) {
                n0(k3Var);
            }
            k3 k3Var2 = m2Var.f46602k;
            if (k3Var2 != null) {
                b0(k3Var2);
            }
            byte[] bArr = m2Var.f46603l;
            if (bArr != null) {
                O(bArr, m2Var.f46604m);
            }
            Uri uri2 = m2Var.f46605n;
            if (uri2 != null) {
                P(uri2);
            }
            Integer num = m2Var.f46606o;
            if (num != null) {
                m0(num);
            }
            Integer num2 = m2Var.f46607p;
            if (num2 != null) {
                l0(num2);
            }
            Integer num3 = m2Var.f46608q;
            if (num3 != null) {
                X(num3);
            }
            Boolean bool = m2Var.f46609r;
            if (bool != null) {
                Z(bool);
            }
            Integer num4 = m2Var.f46610s;
            if (num4 != null) {
                e0(num4);
            }
            Integer num5 = m2Var.f46611t;
            if (num5 != null) {
                e0(num5);
            }
            Integer num6 = m2Var.f46612u;
            if (num6 != null) {
                d0(num6);
            }
            Integer num7 = m2Var.f46613v;
            if (num7 != null) {
                c0(num7);
            }
            Integer num8 = m2Var.f46614w;
            if (num8 != null) {
                h0(num8);
            }
            Integer num9 = m2Var.f46615x;
            if (num9 != null) {
                g0(num9);
            }
            Integer num10 = m2Var.f46616y;
            if (num10 != null) {
                f0(num10);
            }
            CharSequence charSequence8 = m2Var.f46617z;
            if (charSequence8 != null) {
                o0(charSequence8);
            }
            CharSequence charSequence9 = m2Var.A;
            if (charSequence9 != null) {
                R(charSequence9);
            }
            CharSequence charSequence10 = m2Var.B;
            if (charSequence10 != null) {
                S(charSequence10);
            }
            Integer num11 = m2Var.C;
            if (num11 != null) {
                U(num11);
            }
            Integer num12 = m2Var.D;
            if (num12 != null) {
                k0(num12);
            }
            CharSequence charSequence11 = m2Var.E;
            if (charSequence11 != null) {
                Y(charSequence11);
            }
            CharSequence charSequence12 = m2Var.F;
            if (charSequence12 != null) {
                Q(charSequence12);
            }
            Bundle bundle = m2Var.G;
            if (bundle != null) {
                W(bundle);
            }
            return this;
        }

        public b I(Metadata metadata) {
            for (int i10 = 0; i10 < metadata.d(); i10++) {
                metadata.c(i10).m(this);
            }
            return this;
        }

        public b J(List<Metadata> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                Metadata metadata = list.get(i10);
                for (int i11 = 0; i11 < metadata.d(); i11++) {
                    metadata.c(i11).m(this);
                }
            }
            return this;
        }

        public b K(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46621d = charSequence;
            return this;
        }

        public b L(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46620c = charSequence;
            return this;
        }

        public b M(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46619b = charSequence;
            return this;
        }

        @Deprecated
        public b N(@androidx.annotation.p0 byte[] bArr) {
            return O(bArr, null);
        }

        public b O(@androidx.annotation.p0 byte[] bArr, @androidx.annotation.p0 Integer num) {
            this.f46628k = bArr == null ? null : (byte[]) bArr.clone();
            this.f46629l = num;
            return this;
        }

        public b P(@androidx.annotation.p0 Uri uri) {
            this.f46630m = uri;
            return this;
        }

        public b Q(@androidx.annotation.p0 CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b R(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46642y = charSequence;
            return this;
        }

        public b S(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46643z = charSequence;
            return this;
        }

        public b T(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46624g = charSequence;
            return this;
        }

        public b U(@androidx.annotation.p0 Integer num) {
            this.A = num;
            return this;
        }

        public b V(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46622e = charSequence;
            return this;
        }

        public b W(@androidx.annotation.p0 Bundle bundle) {
            this.E = bundle;
            return this;
        }

        public b X(@androidx.annotation.p0 Integer num) {
            this.f46633p = num;
            return this;
        }

        public b Y(@androidx.annotation.p0 CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b Z(@androidx.annotation.p0 Boolean bool) {
            this.f46634q = bool;
            return this;
        }

        public b a0(@androidx.annotation.p0 Uri uri) {
            this.f46625h = uri;
            return this;
        }

        public b b0(@androidx.annotation.p0 k3 k3Var) {
            this.f46627j = k3Var;
            return this;
        }

        public b c0(@androidx.annotation.f0(from = 1, to = 31) @androidx.annotation.p0 Integer num) {
            this.f46637t = num;
            return this;
        }

        public b d0(@androidx.annotation.f0(from = 1, to = 12) @androidx.annotation.p0 Integer num) {
            this.f46636s = num;
            return this;
        }

        public b e0(@androidx.annotation.p0 Integer num) {
            this.f46635r = num;
            return this;
        }

        public b f0(@androidx.annotation.f0(from = 1, to = 31) @androidx.annotation.p0 Integer num) {
            this.f46640w = num;
            return this;
        }

        public b g0(@androidx.annotation.f0(from = 1, to = 12) @androidx.annotation.p0 Integer num) {
            this.f46639v = num;
            return this;
        }

        public b h0(@androidx.annotation.p0 Integer num) {
            this.f46638u = num;
            return this;
        }

        public b i0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46623f = charSequence;
            return this;
        }

        public b j0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46618a = charSequence;
            return this;
        }

        public b k0(@androidx.annotation.p0 Integer num) {
            this.B = num;
            return this;
        }

        public b l0(@androidx.annotation.p0 Integer num) {
            this.f46632o = num;
            return this;
        }

        public b m0(@androidx.annotation.p0 Integer num) {
            this.f46631n = num;
            return this;
        }

        public b n0(@androidx.annotation.p0 k3 k3Var) {
            this.f46626i = k3Var;
            return this;
        }

        public b o0(@androidx.annotation.p0 CharSequence charSequence) {
            this.f46641x = charSequence;
            return this;
        }

        @Deprecated
        public b p0(@androidx.annotation.p0 Integer num) {
            return e0(num);
        }
    }

    /* JADX INFO: compiled from: MediaMetadata.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* JADX INFO: compiled from: MediaMetadata.java */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private m2(b bVar) {
        this.f46593b = bVar.f46618a;
        this.f46594c = bVar.f46619b;
        this.f46595d = bVar.f46620c;
        this.f46596e = bVar.f46621d;
        this.f46597f = bVar.f46622e;
        this.f46598g = bVar.f46623f;
        this.f46599h = bVar.f46624g;
        this.f46600i = bVar.f46625h;
        this.f46601j = bVar.f46626i;
        this.f46602k = bVar.f46627j;
        this.f46603l = bVar.f46628k;
        this.f46604m = bVar.f46629l;
        this.f46605n = bVar.f46630m;
        this.f46606o = bVar.f46631n;
        this.f46607p = bVar.f46632o;
        this.f46608q = bVar.f46633p;
        this.f46609r = bVar.f46634q;
        this.f46610s = bVar.f46635r;
        this.f46611t = bVar.f46635r;
        this.f46612u = bVar.f46636s;
        this.f46613v = bVar.f46637t;
        this.f46614w = bVar.f46638u;
        this.f46615x = bVar.f46639v;
        this.f46616y = bVar.f46640w;
        this.f46617z = bVar.f46641x;
        this.A = bVar.f46642y;
        this.B = bVar.f46643z;
        this.C = bVar.A;
        this.D = bVar.B;
        this.E = bVar.C;
        this.F = bVar.D;
        this.G = bVar.E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m2 d(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.j0(bundle.getCharSequence(e(0))).M(bundle.getCharSequence(e(1))).L(bundle.getCharSequence(e(2))).K(bundle.getCharSequence(e(3))).V(bundle.getCharSequence(e(4))).i0(bundle.getCharSequence(e(5))).T(bundle.getCharSequence(e(6))).a0((Uri) bundle.getParcelable(e(7))).O(bundle.getByteArray(e(10)), bundle.containsKey(e(29)) ? Integer.valueOf(bundle.getInt(e(29))) : null).P((Uri) bundle.getParcelable(e(11))).o0(bundle.getCharSequence(e(22))).R(bundle.getCharSequence(e(23))).S(bundle.getCharSequence(e(24))).Y(bundle.getCharSequence(e(27))).Q(bundle.getCharSequence(e(28))).W(bundle.getBundle(e(1000)));
        if (bundle.containsKey(e(8)) && (bundle3 = bundle.getBundle(e(8))) != null) {
            bVar.n0((k3) k3.f46521i.a(bundle3));
        }
        if (bundle.containsKey(e(9)) && (bundle2 = bundle.getBundle(e(9))) != null) {
            bVar.b0((k3) k3.f46521i.a(bundle2));
        }
        if (bundle.containsKey(e(12))) {
            bVar.m0(Integer.valueOf(bundle.getInt(e(12))));
        }
        if (bundle.containsKey(e(13))) {
            bVar.l0(Integer.valueOf(bundle.getInt(e(13))));
        }
        if (bundle.containsKey(e(14))) {
            bVar.X(Integer.valueOf(bundle.getInt(e(14))));
        }
        if (bundle.containsKey(e(15))) {
            bVar.Z(Boolean.valueOf(bundle.getBoolean(e(15))));
        }
        if (bundle.containsKey(e(16))) {
            bVar.e0(Integer.valueOf(bundle.getInt(e(16))));
        }
        if (bundle.containsKey(e(17))) {
            bVar.d0(Integer.valueOf(bundle.getInt(e(17))));
        }
        if (bundle.containsKey(e(18))) {
            bVar.c0(Integer.valueOf(bundle.getInt(e(18))));
        }
        if (bundle.containsKey(e(19))) {
            bVar.h0(Integer.valueOf(bundle.getInt(e(19))));
        }
        if (bundle.containsKey(e(20))) {
            bVar.g0(Integer.valueOf(bundle.getInt(e(20))));
        }
        if (bundle.containsKey(e(21))) {
            bVar.f0(Integer.valueOf(bundle.getInt(e(21))));
        }
        if (bundle.containsKey(e(25))) {
            bVar.U(Integer.valueOf(bundle.getInt(e(25))));
        }
        if (bundle.containsKey(e(26))) {
            bVar.k0(Integer.valueOf(bundle.getInt(e(26))));
        }
        return bVar.F();
    }

    private static String e(int i10) {
        return Integer.toString(i10, 36);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(e(0), this.f46593b);
        bundle.putCharSequence(e(1), this.f46594c);
        bundle.putCharSequence(e(2), this.f46595d);
        bundle.putCharSequence(e(3), this.f46596e);
        bundle.putCharSequence(e(4), this.f46597f);
        bundle.putCharSequence(e(5), this.f46598g);
        bundle.putCharSequence(e(6), this.f46599h);
        bundle.putParcelable(e(7), this.f46600i);
        bundle.putByteArray(e(10), this.f46603l);
        bundle.putParcelable(e(11), this.f46605n);
        bundle.putCharSequence(e(22), this.f46617z);
        bundle.putCharSequence(e(23), this.A);
        bundle.putCharSequence(e(24), this.B);
        bundle.putCharSequence(e(27), this.E);
        bundle.putCharSequence(e(28), this.F);
        if (this.f46601j != null) {
            bundle.putBundle(e(8), this.f46601j.a());
        }
        if (this.f46602k != null) {
            bundle.putBundle(e(9), this.f46602k.a());
        }
        if (this.f46606o != null) {
            bundle.putInt(e(12), this.f46606o.intValue());
        }
        if (this.f46607p != null) {
            bundle.putInt(e(13), this.f46607p.intValue());
        }
        if (this.f46608q != null) {
            bundle.putInt(e(14), this.f46608q.intValue());
        }
        if (this.f46609r != null) {
            bundle.putBoolean(e(15), this.f46609r.booleanValue());
        }
        if (this.f46611t != null) {
            bundle.putInt(e(16), this.f46611t.intValue());
        }
        if (this.f46612u != null) {
            bundle.putInt(e(17), this.f46612u.intValue());
        }
        if (this.f46613v != null) {
            bundle.putInt(e(18), this.f46613v.intValue());
        }
        if (this.f46614w != null) {
            bundle.putInt(e(19), this.f46614w.intValue());
        }
        if (this.f46615x != null) {
            bundle.putInt(e(20), this.f46615x.intValue());
        }
        if (this.f46616y != null) {
            bundle.putInt(e(21), this.f46616y.intValue());
        }
        if (this.C != null) {
            bundle.putInt(e(25), this.C.intValue());
        }
        if (this.D != null) {
            bundle.putInt(e(26), this.D.intValue());
        }
        if (this.f46604m != null) {
            bundle.putInt(e(29), this.f46604m.intValue());
        }
        if (this.G != null) {
            bundle.putBundle(e(1000), this.G);
        }
        return bundle;
    }

    public b c() {
        return new b();
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m2.class != obj.getClass()) {
            return false;
        }
        m2 m2Var = (m2) obj;
        return com.google.android.exoplayer2.util.u0.c(this.f46593b, m2Var.f46593b) && com.google.android.exoplayer2.util.u0.c(this.f46594c, m2Var.f46594c) && com.google.android.exoplayer2.util.u0.c(this.f46595d, m2Var.f46595d) && com.google.android.exoplayer2.util.u0.c(this.f46596e, m2Var.f46596e) && com.google.android.exoplayer2.util.u0.c(this.f46597f, m2Var.f46597f) && com.google.android.exoplayer2.util.u0.c(this.f46598g, m2Var.f46598g) && com.google.android.exoplayer2.util.u0.c(this.f46599h, m2Var.f46599h) && com.google.android.exoplayer2.util.u0.c(this.f46600i, m2Var.f46600i) && com.google.android.exoplayer2.util.u0.c(this.f46601j, m2Var.f46601j) && com.google.android.exoplayer2.util.u0.c(this.f46602k, m2Var.f46602k) && Arrays.equals(this.f46603l, m2Var.f46603l) && com.google.android.exoplayer2.util.u0.c(this.f46604m, m2Var.f46604m) && com.google.android.exoplayer2.util.u0.c(this.f46605n, m2Var.f46605n) && com.google.android.exoplayer2.util.u0.c(this.f46606o, m2Var.f46606o) && com.google.android.exoplayer2.util.u0.c(this.f46607p, m2Var.f46607p) && com.google.android.exoplayer2.util.u0.c(this.f46608q, m2Var.f46608q) && com.google.android.exoplayer2.util.u0.c(this.f46609r, m2Var.f46609r) && com.google.android.exoplayer2.util.u0.c(this.f46611t, m2Var.f46611t) && com.google.android.exoplayer2.util.u0.c(this.f46612u, m2Var.f46612u) && com.google.android.exoplayer2.util.u0.c(this.f46613v, m2Var.f46613v) && com.google.android.exoplayer2.util.u0.c(this.f46614w, m2Var.f46614w) && com.google.android.exoplayer2.util.u0.c(this.f46615x, m2Var.f46615x) && com.google.android.exoplayer2.util.u0.c(this.f46616y, m2Var.f46616y) && com.google.android.exoplayer2.util.u0.c(this.f46617z, m2Var.f46617z) && com.google.android.exoplayer2.util.u0.c(this.A, m2Var.A) && com.google.android.exoplayer2.util.u0.c(this.B, m2Var.B) && com.google.android.exoplayer2.util.u0.c(this.C, m2Var.C) && com.google.android.exoplayer2.util.u0.c(this.D, m2Var.D) && com.google.android.exoplayer2.util.u0.c(this.E, m2Var.E) && com.google.android.exoplayer2.util.u0.c(this.F, m2Var.F);
    }

    public int hashCode() {
        return com.google.common.base.s.b(this.f46593b, this.f46594c, this.f46595d, this.f46596e, this.f46597f, this.f46598g, this.f46599h, this.f46600i, this.f46601j, this.f46602k, Integer.valueOf(Arrays.hashCode(this.f46603l)), this.f46604m, this.f46605n, this.f46606o, this.f46607p, this.f46608q, this.f46609r, this.f46611t, this.f46612u, this.f46613v, this.f46614w, this.f46615x, this.f46616y, this.f46617z, this.A, this.B, this.C, this.D, this.E, this.F);
    }
}
