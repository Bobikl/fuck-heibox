package com.google.android.exoplayer2.extractor.mkv;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.i;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.f0;
import com.google.android.exoplayer2.extractor.k;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.m;
import com.google.android.exoplayer2.extractor.p;
import com.google.android.exoplayer2.extractor.q;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.v;
import com.google.android.exoplayer2.util.y;
import com.google.android.exoplayer2.util.z;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes7.dex */
public class e implements k {
    private static final String A0 = "A_AAC";
    private static final int A1 = 21930;
    private static final int A2 = 21968;
    private static final String B0 = "A_MPEG/L2";
    private static final int B1 = 2352003;
    private static final int B2 = 21969;
    private static final String C0 = "A_MPEG/L3";
    private static final int C1 = 21998;
    private static final int C2 = 21970;
    private static final String D0 = "A_AC3";
    private static final int D1 = 16868;
    private static final int D2 = 21971;
    private static final String E0 = "A_EAC3";
    private static final int E1 = 16871;
    private static final int E2 = 21972;
    private static final String F0 = "A_TRUEHD";
    private static final int F1 = 16877;
    private static final int F2 = 21973;
    private static final String G0 = "A_DTS";
    private static final int G1 = 21358;
    private static final int G2 = 21974;
    private static final String H0 = "A_DTS/EXPRESS";
    private static final int H1 = 134;
    private static final int H2 = 21975;
    private static final String I0 = "A_DTS/LOSSLESS";
    private static final int I1 = 25506;
    private static final int I2 = 21976;
    private static final String J0 = "A_FLAC";
    private static final int J1 = 22186;
    private static final int J2 = 21977;
    private static final String K0 = "A_MS/ACM";
    private static final int K1 = 22203;
    private static final int K2 = 21978;
    private static final String L0 = "A_PCM/INT/LIT";
    private static final int L1 = 224;
    private static final int L2 = 4;
    private static final String M0 = "A_PCM/INT/BIG";
    private static final int M1 = 176;
    private static final int M2 = 1685480259;
    private static final String N0 = "A_PCM/FLOAT/IEEE";
    private static final int N1 = 186;
    private static final int N2 = 1685485123;
    private static final String O0 = "S_TEXT/UTF8";
    private static final int O1 = 21680;
    private static final int O2 = 0;
    private static final String P0 = "S_TEXT/ASS";
    private static final int P1 = 21690;
    private static final int P2 = 1;
    private static final String Q0 = "S_VOBSUB";
    private static final int Q1 = 21682;
    private static final int Q2 = 2;
    private static final String R0 = "S_HDMV/PGS";
    private static final int R1 = 225;
    private static final int R2 = 3;
    private static final String S0 = "S_DVBSUB";
    private static final int S1 = 159;
    private static final int S2 = 1482049860;
    private static final int T0 = 8192;
    private static final int T1 = 25188;
    private static final int T2 = 859189832;
    private static final int U0 = 5760;
    private static final int U1 = 181;
    private static final int U2 = 826496599;
    private static final int V0 = 8;
    private static final int V1 = 28032;
    private static final int W0 = 2;
    private static final int W1 = 25152;
    private static final int W2 = 19;
    private static final int X0 = 440786851;
    private static final int X1 = 20529;
    private static final long X2 = 1000;
    private static final int Y0 = 17143;
    private static final int Y1 = 20530;
    private static final String Y2 = "%02d:%02d:%02d,%03d";
    private static final int Z0 = 17026;
    private static final int Z1 = 20532;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int f45107a1 = 17029;

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    private static final int f45108a2 = 16980;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private static final int f45110b1 = 408125543;

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    private static final int f45111b2 = 16981;

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    private static final int f45112b3 = 21;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private static final int f45113c1 = 357149030;

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    private static final int f45114c2 = 20533;

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    private static final long f45115c3 = 10000;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private static final int f45116d1 = 290298740;

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    private static final int f45117d2 = 18401;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final String f45118d3 = "%01d:%02d:%02d:%02d";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private static final int f45120e1 = 19899;

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    private static final int f45121e2 = 18402;

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    private static final int f45122e3 = 18;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final int f45123f0 = 1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private static final int f45124f1 = 21419;

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    private static final int f45125f2 = 18407;

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    private static final int f45126f3 = 65534;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final String f45127g0 = "MatroskaExtractor";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private static final int f45128g1 = 21420;

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    private static final int f45129g2 = 18408;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f45130g3 = 1;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f45131h0 = -1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private static final int f45132h1 = 357149030;

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    private static final int f45133h2 = 475249515;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f45135i0 = 0;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private static final int f45136i1 = 2807729;

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    private static final int f45137i2 = 187;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final Map<String, Integer> f45138i3;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f45139j0 = 1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private static final int f45140j1 = 17545;

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    private static final int f45141j2 = 179;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f45142k0 = 2;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private static final int f45143k1 = 524531317;

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    private static final int f45144k2 = 183;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final String f45145l0 = "matroska";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private static final int f45146l1 = 231;

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    private static final int f45147l2 = 241;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f45148m0 = "webm";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private static final int f45149m1 = 163;

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    private static final int f45150m2 = 2274716;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final String f45151n0 = "V_VP8";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private static final int f45152n1 = 160;

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    private static final int f45153n2 = 30320;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final String f45154o0 = "V_VP9";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private static final int f45155o1 = 161;

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    private static final int f45156o2 = 30321;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final String f45157p0 = "V_AV1";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final int f45158p1 = 155;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f45159p2 = 30322;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final String f45160q0 = "V_MPEG2";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private static final int f45161q1 = 30113;

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    private static final int f45162q2 = 30323;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final String f45163r0 = "V_MPEG4/ISO/SP";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private static final int f45164r1 = 166;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    private static final int f45165r2 = 30324;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final String f45166s0 = "V_MPEG4/ISO/ASP";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private static final int f45167s1 = 238;

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    private static final int f45168s2 = 30325;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final String f45169t0 = "V_MPEG4/ISO/AP";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private static final int f45170t1 = 165;

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    private static final int f45171t2 = 21432;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final String f45172u0 = "V_MPEG4/ISO/AVC";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private static final int f45173u1 = 251;

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    private static final int f45174u2 = 21936;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final String f45175v0 = "V_MPEGH/ISO/HEVC";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private static final int f45176v1 = 374648427;

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    private static final int f45177v2 = 21945;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final String f45178w0 = "V_MS/VFW/FOURCC";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private static final int f45179w1 = 174;

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    private static final int f45180w2 = 21946;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final String f45181x0 = "V_THEORA";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private static final int f45182x1 = 215;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f45183x2 = 21947;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final String f45184y0 = "A_VORBIS";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private static final int f45185y1 = 131;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private static final int f45186y2 = 21948;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final String f45187z0 = "A_OPUS";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    private static final int f45188z1 = 136;

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    private static final int f45189z2 = 21949;
    private long A;
    private boolean B;
    private long C;
    private long D;
    private long E;

    @p0
    private v F;

    @p0
    private v G;
    private boolean H;
    private boolean I;
    private int J;
    private long K;
    private long L;
    private int M;
    private int N;
    private int[] O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private boolean T;
    private int U;
    private int V;
    private int W;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f45190a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private byte f45191b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f45192c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.extractor.mkv.c f45193d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private m f45194d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f45195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseArray<d> f45196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f45197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0 f45198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0 f45199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final e0 f45200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e0 f45201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final e0 f45202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e0 f45203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final e0 f45204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0 f45205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e0 f45206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final e0 f45207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ByteBuffer f45208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f45209s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f45210t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f45211u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f45212v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f45213w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @p0
    private d f45214x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f45215y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f45216z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final q f45119e0 = new q() { // from class: com.google.android.exoplayer2.extractor.mkv.d
        @Override // com.google.android.exoplayer2.extractor.q
        public /* synthetic */ k[] a(Uri uri, Map map) {
            return p.a(this, uri, map);
        }

        @Override // com.google.android.exoplayer2.extractor.q
        public final k[] b() {
            return e.A();
        }
    };
    private static final byte[] V2 = {org.apache.tools.tar.c.G, 10, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 44, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 32, 45, 45, 62, 32, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 44, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 10};
    private static final byte[] Z2 = u0.y0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    private static final byte[] f45109a3 = {68, 105, 97, 108, 111, org.apache.tools.tar.c.S, 117, 101, 58, 32, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 44, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 58, org.apache.tools.tar.c.F, org.apache.tools.tar.c.F, 44};

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final UUID f45134h3 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public final class c implements com.google.android.exoplayer2.extractor.mkv.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public void a(int i10) throws ParserException {
            e.this.o(i10);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public void b(int i10, double d10) throws ParserException {
            e.this.r(i10, d10);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public void c(int i10, long j10) throws ParserException {
            e.this.x(i10, j10);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public void d(int i10, int i11, l lVar) throws IOException {
            e.this.l(i10, i11, lVar);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public void e(int i10, String str) throws ParserException {
            e.this.H(i10, str);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public void f(int i10, long j10, long j11) throws ParserException {
            e.this.G(i10, j10, j11);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public int g(int i10) {
            return e.this.u(i10);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.b
        public boolean h(int i10) {
            return e.this.z(i10);
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class d {
        private static final int Z = 0;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private static final int f45218a0 = 50000;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private static final int f45219b0 = 1000;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private static final int f45220c0 = 200;
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public f0 T;
        public boolean U;
        public boolean V;
        private String W;
        public com.google.android.exoplayer2.extractor.e0 X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f45221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f45222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f45223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f45224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f45225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f45226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f45227g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f45228h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f45229i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public com.google.android.exoplayer2.extractor.e0.a f45230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public byte[] f45231k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public DrmInitData f45232l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f45233m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f45234n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f45235o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f45236p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f45237q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f45238r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f45239s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f45240t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f45241u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public byte[] f45242v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f45243w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f45244x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f45245y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f45246z;

        private d() {
            this.f45233m = -1;
            this.f45234n = -1;
            this.f45235o = -1;
            this.f45236p = -1;
            this.f45237q = 0;
            this.f45238r = -1;
            this.f45239s = 0.0f;
            this.f45240t = 0.0f;
            this.f45241u = 0.0f;
            this.f45242v = null;
            this.f45243w = -1;
            this.f45244x = false;
            this.f45245y = -1;
            this.f45246z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        /* JADX INFO: Access modifiers changed from: private */
        @mk.d({"output"})
        public void e() {
            com.google.android.exoplayer2.util.a.g(this.X);
        }

        @mk.d({"codecPrivate"})
        private byte[] f(String str) throws ParserException {
            byte[] bArr = this.f45231k;
            if (bArr != null) {
                return bArr;
            }
            String strValueOf = String.valueOf(str);
            throw ParserException.a(strValueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(strValueOf) : new String("Missing CodecPrivate for codec "), null);
        }

        @p0
        private byte[] g() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> j(e0 e0Var) throws ParserException {
            try {
                e0Var.T(16);
                long jV = e0Var.v();
                if (jV == 1482049860) {
                    return new Pair<>(y.f51600u, null);
                }
                if (jV == 859189832) {
                    return new Pair<>(y.f51576i, null);
                }
                if (jV != 826496599) {
                    u.m(e.f45127g0, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>(y.f51608y, null);
                }
                byte[] bArrD = e0Var.d();
                for (int iE = e0Var.e() + 20; iE < bArrD.length - 4; iE++) {
                    if (bArrD[iE] == 0 && bArrD[iE + 1] == 0 && bArrD[iE + 2] == 1 && bArrD[iE + 3] == 15) {
                        return new Pair<>(y.f51598t, Collections.singletonList(Arrays.copyOfRange(bArrD, iE, bArrD.length)));
                    }
                }
                throw ParserException.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean k(e0 e0Var) throws ParserException {
            try {
                int iY = e0Var.y();
                if (iY == 1) {
                    return true;
                }
                if (iY != 65534) {
                    return false;
                }
                e0Var.S(24);
                return e0Var.z() == e.f45134h3.getMostSignificantBits() && e0Var.z() == e.f45134h3.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> l(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw ParserException.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:148:0x029e A[PHI: r7 r17
  0x029e: PHI (r7v5 int) = (r7v1 int), (r7v0 int), (r7v3 int), (r7v4 int), (r7v6 int) binds: [B:186:0x03f4, B:156:0x02d6, B:153:0x02ac, B:151:0x02a8, B:145:0x0276] A[DONT_GENERATE, DONT_INLINE]
  0x029e: PHI (r17v22 java.lang.String) = 
  (r17v1 java.lang.String)
  (r17v20 java.lang.String)
  (r17v21 java.lang.String)
  (r17v21 java.lang.String)
  (r17v24 java.lang.String)
 binds: [B:186:0x03f4, B:156:0x02d6, B:153:0x02ac, B:151:0x02a8, B:145:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:200:0x0446  */
        /* JADX WARN: Code duplicated, block: B:205:0x045e  */
        /* JADX WARN: Code duplicated, block: B:206:0x0460  */
        /* JADX WARN: Code duplicated, block: B:209:0x046d  */
        /* JADX WARN: Code duplicated, block: B:210:0x047f  */
        /* JADX WARN: Code duplicated, block: B:212:0x0485  */
        /* JADX WARN: Code duplicated, block: B:214:0x0489  */
        /* JADX WARN: Code duplicated, block: B:216:0x048e  */
        /* JADX WARN: Code duplicated, block: B:219:0x0496  */
        /* JADX WARN: Code duplicated, block: B:221:0x049b  */
        /* JADX WARN: Code duplicated, block: B:224:0x04a2  */
        /* JADX WARN: Code duplicated, block: B:229:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:230:0x04c3  */
        /* JADX WARN: Code duplicated, block: B:233:0x04c8  */
        /* JADX WARN: Code duplicated, block: B:238:0x04e8  */
        /* JADX WARN: Code duplicated, block: B:257:0x0534  */
        /* JADX WARN: Code duplicated, block: B:259:0x055a  */
        /* JADX WARN: Code duplicated, block: B:261:0x0560  */
        /* JADX WARN: Code duplicated, block: B:274:0x0587  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        @mk.d({"this.output"})
        @mk.m({"codecId"})
        public void h(m mVar, int i10) throws ParserException {
            byte b10;
            List<byte[]> listSingletonList;
            int i11;
            String str;
            List<byte[]> list;
            String str2;
            byte[] bArr;
            String str3;
            int i12;
            a2.b bVar;
            int iIntValue;
            float f10;
            int i13;
            com.google.android.exoplayer2.video.c cVar;
            int i14;
            int i15;
            int i16;
            com.google.android.exoplayer2.video.e eVarA;
            String str4 = this.f45222b;
            str4.hashCode();
            int iM0 = 4;
            int i17 = 3;
            int i18 = 0;
            switch (str4) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = 12;
                    break;
                case "A_AAC":
                    b10 = 13;
                    break;
                case "A_AC3":
                    b10 = 14;
                    break;
                case "A_DTS":
                    b10 = 15;
                    break;
                case "V_AV1":
                    b10 = 16;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = com.google.common.base.a.f56668u;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = com.google.common.base.a.f56671x;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = com.google.common.base.a.f56672y;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b10 = com.google.common.base.a.f56673z;
                    break;
                case "A_PCM/INT/BIG":
                    b10 = com.google.common.base.a.A;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = com.google.common.base.a.B;
                    break;
                case "S_TEXT/ASS":
                    b10 = com.google.common.base.a.C;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = com.google.common.base.a.D;
                    break;
                case "S_TEXT/UTF8":
                    b10 = com.google.common.base.a.E;
                    break;
                case "V_MPEG2":
                    b10 = com.google.common.base.a.F;
                    break;
                case "A_EAC3":
                    b10 = com.google.common.base.a.G;
                    break;
                case "A_FLAC":
                    b10 = com.google.common.base.a.H;
                    break;
                case "A_OPUS":
                    b10 = 31;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str5 = y.f51611z0;
            String str6 = y.I;
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    str5 = y.f51611z0;
                    byte[] bArr2 = this.f45231k;
                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str6 = y.f51590p;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null && (eVarA = com.google.android.exoplayer2.video.e.a(new e0(bArr))) != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i19 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i20 = i19 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue && (i14 = this.f45236p) != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null && e.f45138i3.containsKey(this.f45221a)) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0 || Float.compare(this.f45239s, 0.0f) != 0 || Float.compare(this.f45240t, 0.0f) != 0) {
                            i18 = iIntValue;
                        } else if (Float.compare(this.f45241u, 0.0f) != 0) {
                            if (Float.compare(this.f45240t, 90.0f) == 0) {
                                i18 = 90;
                            } else if (Float.compare(this.f45240t, -180.0f) == 0 || Float.compare(this.f45240t, 180.0f) == 0) {
                                i18 = 180;
                            } else if (Float.compare(this.f45240t, -90.0f) == 0) {
                                i18 = 270;
                            } else {
                                i18 = iIntValue;
                            }
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3) && !y.f51573g0.equals(str3) && !y.f51609y0.equals(str3) && !str5.equals(str3) && !y.D0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null && !e.f45138i3.containsKey(this.f45221a)) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i20).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB = mVar.b(this.f45223c, i17);
                    this.X = e0VarB;
                    e0VarB.d(a2VarE);
                    return;
                case 2:
                    str5 = y.f51611z0;
                    if (k(new e0(f(this.f45222b)))) {
                        iM0 = u0.m0(this.P);
                        if (iM0 == 0) {
                            int i21 = this.P;
                            StringBuilder sb2 = new StringBuilder(y.f51569e0.length() + 60);
                            sb2.append("Unsupported PCM bit depth: ");
                            sb2.append(i21);
                            sb2.append(". Setting mimeType to ");
                            sb2.append(y.f51569e0);
                            u.m(e.f45127g0, sb2.toString());
                        } else {
                            listSingletonList = null;
                            str = null;
                        }
                        i11 = -1;
                        bArr = this.N;
                        if (bArr != null) {
                            str = eVarA.f51741c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        int i110 = (this.V ? 1 : 0) | 0;
                        if (this.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i22 = i110 | i12;
                        bVar = new a2.b();
                        if (y.p(str3)) {
                            bVar.H(this.O).f0(this.Q).Y(iM0);
                            i17 = 1;
                        } else if (y.t(str3)) {
                            if (this.f45237q == 0) {
                                i15 = this.f45235o;
                                iIntValue = -1;
                                if (i15 == -1) {
                                    i15 = this.f45233m;
                                }
                                this.f45235o = i15;
                                i16 = this.f45236p;
                                if (i16 == -1) {
                                    i16 = this.f45234n;
                                }
                                this.f45236p = i16;
                            } else {
                                iIntValue = -1;
                            }
                            f10 = -1.0f;
                            i13 = this.f45235o;
                            if (i13 != iIntValue) {
                                f10 = (this.f45234n * i13) / (this.f45233m * i14);
                            }
                            if (this.f45244x) {
                                cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                            } else {
                                cVar = null;
                            }
                            if (this.f45221a != null) {
                                iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                            }
                            if (this.f45238r == 0) {
                                i18 = iIntValue;
                            } else {
                                i18 = iIntValue;
                            }
                            bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                            i17 = 2;
                        } else if (!y.f51597s0.equals(str3)) {
                            throw ParserException.a("Unexpected MIME type.", null);
                        }
                        if (this.f45221a != null) {
                            bVar.U(this.f45221a);
                        }
                        a2 a2VarE2 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i22).T(listSingletonList).I(str).M(this.f45232l).E();
                        com.google.android.exoplayer2.extractor.e0 e0VarB2 = mVar.b(this.f45223c, i17);
                        this.X = e0VarB2;
                        e0VarB2.d(a2VarE2);
                        return;
                    }
                    u.m(e.f45127g0, y.f51569e0.length() != 0 ? "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat(y.f51569e0) : new String("Non-PCM MS/ACM is unsupported. Setting mimeType to "));
                    str6 = y.f51569e0;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i23 = i111 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE3 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i23).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB3 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB3;
                    e0VarB3.d(a2VarE3);
                    return;
                case 3:
                    str5 = y.f51611z0;
                    this.T = new f0();
                    str6 = y.P;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i112 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i24 = i112 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE4 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i24).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB4 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB4;
                    e0VarB4.d(a2VarE4);
                    return;
                case 4:
                    i11 = 8192;
                    listSingletonList = l(f(this.f45222b));
                    str6 = y.U;
                    str = null;
                    iM0 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i25 = i113 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE5 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i25).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB5 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB5;
                    e0VarB5.d(a2VarE5);
                    return;
                case 5:
                    str6 = y.F;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i114 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i26 = i114 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE6 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i26).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB6 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB6;
                    e0VarB6.d(a2VarE6);
                    return;
                case 6:
                    str6 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = 4096;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i27 = i115 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE7 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i27).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB7 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB7;
                    e0VarB7.d(a2VarE7);
                    return;
                case 7:
                    str5 = y.f51611z0;
                    Pair<String, List<byte[]>> pairJ = j(new e0(f(this.f45222b)));
                    str6 = (String) pairJ.first;
                    listSingletonList = (List) pairJ.second;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i116 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i28 = i116 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE8 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i28).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB8 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB8;
                    e0VarB8.d(a2VarE8);
                    return;
                case 8:
                    str5 = y.f51611z0;
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(f(this.f45222b), 0, bArr3, 0, 4);
                    listSingletonList = ImmutableList.D(bArr3);
                    str6 = y.D0;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i29 = i117 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE9 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i29).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB9 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB9;
                    e0VarB9.d(a2VarE9);
                    return;
                case 10:
                    com.google.android.exoplayer2.video.a aVarB = com.google.android.exoplayer2.video.a.b(new e0(f(this.f45222b)));
                    list = aVarB.f51696a;
                    this.Y = aVarB.f51697b;
                    str2 = aVarB.f51701f;
                    str6 = "video/avc";
                    iM0 = -1;
                    i11 = -1;
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i118 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i210 = i118 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE10 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i210).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB10 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB10;
                    e0VarB10.d(a2VarE10);
                    return;
                case 11:
                    str5 = y.f51611z0;
                    listSingletonList = ImmutableList.D(f(this.f45222b));
                    str6 = y.f51609y0;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i211 = i119 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE11 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i211).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB11 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB11;
                    e0VarB11.d(a2VarE11);
                    return;
                case 12:
                    str5 = y.f51611z0;
                    str6 = y.R;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1110 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i212 = i1110 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE12 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i212).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB12 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB12;
                    e0VarB12.d(a2VarE12);
                    return;
                case 13:
                    str5 = y.f51611z0;
                    listSingletonList = Collections.singletonList(f(this.f45222b));
                    com.google.android.exoplayer2.audio.a.c cVarF = com.google.android.exoplayer2.audio.a.f(this.f45231k);
                    this.Q = cVarF.f44062a;
                    this.O = cVarF.f44063b;
                    str = cVarF.f44064c;
                    str6 = y.A;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i213 = i1111 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE13 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i213).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB13 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB13;
                    e0VarB13.d(a2VarE13);
                    return;
                case 14:
                    str5 = y.f51611z0;
                    str6 = y.L;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1112 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i214 = i1112 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE14 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i214).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB14 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB14;
                    e0VarB14.d(a2VarE14);
                    return;
                case 15:
                case 21:
                    str5 = y.f51611z0;
                    str6 = y.Q;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i215 = i1113 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE15 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i215).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB15 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB15;
                    e0VarB15.d(a2VarE15);
                    return;
                case 16:
                    str5 = y.f51611z0;
                    str6 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1114 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i216 = i1114 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE16 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i216).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB16 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB16;
                    e0VarB16.d(a2VarE16);
                    return;
                case 17:
                    str5 = y.f51611z0;
                    str6 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i217 = i1115 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE17 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i217).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB17 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB17;
                    e0VarB17.d(a2VarE17);
                    return;
                case 18:
                    str5 = y.f51611z0;
                    str6 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1116 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i218 = i1116 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE18 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i218).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB18 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB18;
                    e0VarB18.d(a2VarE18);
                    return;
                case 19:
                    str5 = y.f51611z0;
                    str6 = str5;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i219 = i1117 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE19 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i219).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB19 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB19;
                    e0VarB19.d(a2VarE19);
                    return;
                case 20:
                    str5 = y.f51611z0;
                    str6 = y.f51608y;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1118 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2110 = i1118 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE110 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2110).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB110 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB110;
                    e0VarB110.d(a2VarE110);
                    return;
                case 22:
                    str5 = y.f51611z0;
                    int i30 = this.P;
                    if (i30 == 32) {
                        listSingletonList = null;
                        str = null;
                    } else {
                        StringBuilder sb3 = new StringBuilder(y.f51569e0.length() + 75);
                        sb3.append("Unsupported floating point PCM bit depth: ");
                        sb3.append(i30);
                        sb3.append(". Setting mimeType to ");
                        sb3.append(y.f51569e0);
                        u.m(e.f45127g0, sb3.toString());
                        str6 = y.f51569e0;
                        listSingletonList = null;
                        str = null;
                        iM0 = -1;
                    }
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i1119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2111 = i1119 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE111 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2111).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB111 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB111;
                    e0VarB111.d(a2VarE111);
                    return;
                case 23:
                    str5 = y.f51611z0;
                    int i31 = this.P;
                    if (i31 == 8) {
                        iM0 = 3;
                    } else {
                        if (i31 != 16) {
                            StringBuilder sb4 = new StringBuilder(y.f51569e0.length() + 71);
                            sb4.append("Unsupported big endian PCM bit depth: ");
                            sb4.append(i31);
                            sb4.append(". Setting mimeType to ");
                            sb4.append(y.f51569e0);
                            u.m(e.f45127g0, sb4.toString());
                            str6 = y.f51569e0;
                            listSingletonList = null;
                            str = null;
                            iM0 = -1;
                            i11 = -1;
                            bArr = this.N;
                            if (bArr != null) {
                                str = eVarA.f51741c;
                                str6 = "video/dolby-vision";
                            }
                            str3 = str6;
                            int i11110 = (this.V ? 1 : 0) | 0;
                            if (this.U) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            int i2112 = i11110 | i12;
                            bVar = new a2.b();
                            if (y.p(str3)) {
                                bVar.H(this.O).f0(this.Q).Y(iM0);
                                i17 = 1;
                            } else if (y.t(str3)) {
                                if (this.f45237q == 0) {
                                    i15 = this.f45235o;
                                    iIntValue = -1;
                                    if (i15 == -1) {
                                        i15 = this.f45233m;
                                    }
                                    this.f45235o = i15;
                                    i16 = this.f45236p;
                                    if (i16 == -1) {
                                        i16 = this.f45234n;
                                    }
                                    this.f45236p = i16;
                                } else {
                                    iIntValue = -1;
                                }
                                f10 = -1.0f;
                                i13 = this.f45235o;
                                if (i13 != iIntValue) {
                                    f10 = (this.f45234n * i13) / (this.f45233m * i14);
                                }
                                if (this.f45244x) {
                                    cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                                } else {
                                    cVar = null;
                                }
                                if (this.f45221a != null) {
                                    iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                                }
                                if (this.f45238r == 0) {
                                    i18 = iIntValue;
                                } else {
                                    i18 = iIntValue;
                                }
                                bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                                i17 = 2;
                            } else if (!y.f51597s0.equals(str3)) {
                                throw ParserException.a("Unexpected MIME type.", null);
                            }
                            if (this.f45221a != null) {
                                bVar.U(this.f45221a);
                            }
                            a2 a2VarE112 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2112).T(listSingletonList).I(str).M(this.f45232l).E();
                            com.google.android.exoplayer2.extractor.e0 e0VarB112 = mVar.b(this.f45223c, i17);
                            this.X = e0VarB112;
                            e0VarB112.d(a2VarE112);
                            return;
                        }
                        iM0 = 268435456;
                    }
                    listSingletonList = null;
                    str = null;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11111 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2113 = i11111 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE113 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2113).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB113 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB113;
                    e0VarB113.d(a2VarE113);
                    return;
                case 24:
                    str5 = y.f51611z0;
                    iM0 = u0.m0(this.P);
                    if (iM0 == 0) {
                        int i32 = this.P;
                        StringBuilder sb5 = new StringBuilder(y.f51569e0.length() + 74);
                        sb5.append("Unsupported little endian PCM bit depth: ");
                        sb5.append(i32);
                        sb5.append(". Setting mimeType to ");
                        sb5.append(y.f51569e0);
                        u.m(e.f45127g0, sb5.toString());
                        str6 = y.f51569e0;
                        listSingletonList = null;
                        str = null;
                        iM0 = -1;
                    } else {
                        listSingletonList = null;
                        str = null;
                    }
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11112 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2114 = i11112 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE114 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2114).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB114 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB114;
                    e0VarB114.d(a2VarE114);
                    return;
                case 25:
                    str5 = y.f51611z0;
                    listSingletonList = ImmutableList.E(e.Z2, f(this.f45222b));
                    str6 = y.f51573g0;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11113 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2115 = i11113 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE115 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2115).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB115 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB115;
                    e0VarB115.d(a2VarE115);
                    return;
                case 26:
                    com.google.android.exoplayer2.video.g gVarA = com.google.android.exoplayer2.video.g.a(new e0(f(this.f45222b)));
                    list = gVarA.f51759a;
                    this.Y = gVarA.f51760b;
                    str2 = gVarA.f51764f;
                    str6 = "video/hevc";
                    iM0 = -1;
                    i11 = -1;
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11114 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2116 = i11114 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE116 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2116).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB116 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB116;
                    e0VarB116.d(a2VarE116);
                    return;
                case 27:
                    str5 = y.f51611z0;
                    str6 = y.f51597s0;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11115 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2117 = i11115 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE117 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2117).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB117 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB117;
                    e0VarB117.d(a2VarE117);
                    return;
                case 28:
                    str5 = y.f51611z0;
                    str6 = y.f51596s;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11116 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2118 = i11116 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE118 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2118).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB118 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB118;
                    e0VarB118.d(a2VarE118);
                    return;
                case 29:
                    str5 = y.f51611z0;
                    str6 = y.M;
                    listSingletonList = null;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11117 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i2119 = i11117 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE119 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i2119).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB119 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB119;
                    e0VarB119.d(a2VarE119);
                    return;
                case 30:
                    str5 = y.f51611z0;
                    listSingletonList = Collections.singletonList(f(this.f45222b));
                    str6 = y.Z;
                    str = null;
                    iM0 = -1;
                    i11 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11118 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i21110 = i11118 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE1110 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i21110).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB1110 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB1110;
                    e0VarB1110.d(a2VarE1110);
                    return;
                case 31:
                    i11 = 5760;
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(f(this.f45222b));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str6 = y.V;
                    str = null;
                    iM0 = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str = eVarA.f51741c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    int i11119 = (this.V ? 1 : 0) | 0;
                    if (this.U) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    int i21111 = i11119 | i12;
                    bVar = new a2.b();
                    if (y.p(str3)) {
                        bVar.H(this.O).f0(this.Q).Y(iM0);
                        i17 = 1;
                    } else if (y.t(str3)) {
                        if (this.f45237q == 0) {
                            i15 = this.f45235o;
                            iIntValue = -1;
                            if (i15 == -1) {
                                i15 = this.f45233m;
                            }
                            this.f45235o = i15;
                            i16 = this.f45236p;
                            if (i16 == -1) {
                                i16 = this.f45234n;
                            }
                            this.f45236p = i16;
                        } else {
                            iIntValue = -1;
                        }
                        f10 = -1.0f;
                        i13 = this.f45235o;
                        if (i13 != iIntValue) {
                            f10 = (this.f45234n * i13) / (this.f45233m * i14);
                        }
                        if (this.f45244x) {
                            cVar = new com.google.android.exoplayer2.video.c(this.f45245y, this.A, this.f45246z, g());
                        } else {
                            cVar = null;
                        }
                        if (this.f45221a != null) {
                            iIntValue = ((Integer) e.f45138i3.get(this.f45221a)).intValue();
                        }
                        if (this.f45238r == 0) {
                            i18 = iIntValue;
                        } else {
                            i18 = iIntValue;
                        }
                        bVar.j0(this.f45233m).Q(this.f45234n).a0(f10).d0(i18).b0(this.f45242v).h0(this.f45243w).J(cVar);
                        i17 = 2;
                    } else if (!y.f51597s0.equals(str3)) {
                        throw ParserException.a("Unexpected MIME type.", null);
                    }
                    if (this.f45221a != null) {
                        bVar.U(this.f45221a);
                    }
                    a2 a2VarE1111 = bVar.R(i10).e0(str3).W(i11).V(this.W).g0(i21111).T(listSingletonList).I(str).M(this.f45232l).E();
                    com.google.android.exoplayer2.extractor.e0 e0VarB1111 = mVar.b(this.f45223c, i17);
                    this.X = e0VarB1111;
                    e0VarB1111.d(a2VarE1111);
                    return;
                default:
                    throw ParserException.a("Unrecognized codec identifier.", null);
            }
        }

        @mk.m({"output"})
        public void i() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.a(this.X, this.f45230j);
            }
        }

        public void m() {
            f0 f0Var = this.T;
            if (f0Var != null) {
                f0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f45138i3 = Collections.unmodifiableMap(map);
    }

    public e() {
        this(0);
    }

    public e(int i10) {
        this(new com.google.android.exoplayer2.extractor.mkv.a(), i10);
    }

    e(com.google.android.exoplayer2.extractor.mkv.c cVar, int i10) {
        this.f45210t = -1L;
        this.f45211u = j.f46377b;
        this.f45212v = j.f46377b;
        this.f45213w = j.f46377b;
        this.C = -1L;
        this.D = -1L;
        this.E = j.f46377b;
        this.f45193d = cVar;
        cVar.b(new c());
        this.f45197g = (i10 & 1) == 0;
        this.f45195e = new g();
        this.f45196f = new SparseArray<>();
        this.f45200j = new e0(4);
        this.f45201k = new e0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f45202l = new e0(4);
        this.f45198h = new e0(z.f51618b);
        this.f45199i = new e0(4);
        this.f45203m = new e0();
        this.f45204n = new e0();
        this.f45205o = new e0(8);
        this.f45206p = new e0();
        this.f45207q = new e0();
        this.O = new int[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k[] A() {
        return new k[]{new e()};
    }

    private boolean B(com.google.android.exoplayer2.extractor.z zVar, long j10) {
        if (this.B) {
            this.D = j10;
            zVar.f46218a = this.C;
            this.B = false;
            return true;
        }
        if (this.f45215y) {
            long j11 = this.D;
            if (j11 != -1) {
                zVar.f46218a = j11;
                this.D = -1L;
                return true;
            }
        }
        return false;
    }

    private void C(l lVar, int i10) throws IOException {
        if (this.f45200j.f() >= i10) {
            return;
        }
        if (this.f45200j.b() < i10) {
            e0 e0Var = this.f45200j;
            e0Var.c(Math.max(e0Var.b() * 2, i10));
        }
        lVar.readFully(this.f45200j.d(), this.f45200j.f(), i10 - this.f45200j.f());
        this.f45200j.R(i10);
    }

    private void D() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f45190a0 = 0;
        this.f45191b0 = (byte) 0;
        this.f45192c0 = false;
        this.f45203m.O(0);
    }

    private long E(long j10) throws ParserException {
        long j11 = this.f45211u;
        if (j11 != j.f46377b) {
            return u0.j1(j10, j11, 1000L);
        }
        throw ParserException.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void F(String str, long j10, byte[] bArr) {
        byte[] bArrS;
        int i10;
        str.hashCode();
        if (str.equals(P0)) {
            bArrS = s(j10, f45118d3, 10000L);
            i10 = 21;
        } else {
            if (!str.equals(O0)) {
                throw new IllegalArgumentException();
            }
            bArrS = s(j10, Y2, 1000L);
            i10 = 19;
        }
        System.arraycopy(bArrS, 0, bArr, i10, bArrS.length);
    }

    @mk.m({"#2.output"})
    private int I(l lVar, d dVar, int i10) throws IOException {
        int i11;
        if (O0.equals(dVar.f45222b)) {
            J(lVar, V2, i10);
            return q();
        }
        if (P0.equals(dVar.f45222b)) {
            J(lVar, f45109a3, i10);
            return q();
        }
        com.google.android.exoplayer2.extractor.e0 e0Var = dVar.X;
        if (!this.X) {
            if (dVar.f45228h) {
                this.R &= -1073741825;
                if (!this.Y) {
                    lVar.readFully(this.f45200j.d(), 0, 1);
                    this.U++;
                    if ((this.f45200j.d()[0] & 128) == 128) {
                        throw ParserException.a("Extension bit is set in signal byte", null);
                    }
                    this.f45191b0 = this.f45200j.d()[0];
                    this.Y = true;
                }
                byte b10 = this.f45191b0;
                if ((b10 & 1) == 1) {
                    boolean z10 = (b10 & 2) == 2;
                    this.R |= 1073741824;
                    if (!this.f45192c0) {
                        lVar.readFully(this.f45205o.d(), 0, 8);
                        this.U += 8;
                        this.f45192c0 = true;
                        this.f45200j.d()[0] = (byte) ((z10 ? 128 : 0) | 8);
                        this.f45200j.S(0);
                        e0Var.f(this.f45200j, 1, 1);
                        this.V++;
                        this.f45205o.S(0);
                        e0Var.f(this.f45205o, 8, 1);
                        this.V += 8;
                    }
                    if (z10) {
                        if (!this.Z) {
                            lVar.readFully(this.f45200j.d(), 0, 1);
                            this.U++;
                            this.f45200j.S(0);
                            this.f45190a0 = this.f45200j.G();
                            this.Z = true;
                        }
                        int i12 = this.f45190a0 * 4;
                        this.f45200j.O(i12);
                        lVar.readFully(this.f45200j.d(), 0, i12);
                        this.U += i12;
                        short s10 = (short) ((this.f45190a0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f45208r;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f45208r = ByteBuffer.allocate(i13);
                        }
                        this.f45208r.position(0);
                        this.f45208r.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f45190a0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iK = this.f45200j.K();
                            if (i14 % 2 == 0) {
                                this.f45208r.putShort((short) (iK - i15));
                            } else {
                                this.f45208r.putInt(iK - i15);
                            }
                            i14++;
                            i15 = iK;
                        }
                        int i16 = (i10 - this.U) - i15;
                        if (i11 % 2 == 1) {
                            this.f45208r.putInt(i16);
                        } else {
                            this.f45208r.putShort((short) i16);
                            this.f45208r.putInt(0);
                        }
                        this.f45206p.Q(this.f45208r.array(), i13);
                        e0Var.f(this.f45206p, i13, 1);
                        this.V += i13;
                    }
                }
            } else {
                byte[] bArr = dVar.f45229i;
                if (bArr != null) {
                    this.f45203m.Q(bArr, bArr.length);
                }
            }
            if (dVar.f45226f > 0) {
                this.R |= 268435456;
                this.f45207q.O(0);
                this.f45200j.O(4);
                this.f45200j.d()[0] = (byte) ((i10 >> 24) & 255);
                this.f45200j.d()[1] = (byte) ((i10 >> 16) & 255);
                this.f45200j.d()[2] = (byte) ((i10 >> 8) & 255);
                this.f45200j.d()[3] = (byte) (i10 & 255);
                e0Var.f(this.f45200j, 4, 2);
                this.V += 4;
            }
            this.X = true;
        }
        int iF = i10 + this.f45203m.f();
        if (!f45172u0.equals(dVar.f45222b) && !f45175v0.equals(dVar.f45222b)) {
            if (dVar.T != null) {
                com.google.android.exoplayer2.util.a.i(this.f45203m.f() == 0);
                dVar.T.d(lVar);
            }
            while (true) {
                int i17 = this.U;
                if (i17 >= iF) {
                    break;
                }
                int iK2 = K(lVar, e0Var, iF - i17);
                this.U += iK2;
                this.V += iK2;
            }
        } else {
            byte[] bArrD = this.f45199i.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i18 = dVar.Y;
            int i19 = 4 - i18;
            while (this.U < iF) {
                int i20 = this.W;
                if (i20 == 0) {
                    L(lVar, bArrD, i19, i18);
                    this.U += i18;
                    this.f45199i.S(0);
                    this.W = this.f45199i.K();
                    this.f45198h.S(0);
                    e0Var.c(this.f45198h, 4);
                    this.V += 4;
                } else {
                    int iK3 = K(lVar, e0Var, i20);
                    this.U += iK3;
                    this.V += iK3;
                    this.W -= iK3;
                }
            }
        }
        if (f45184y0.equals(dVar.f45222b)) {
            this.f45201k.S(0);
            e0Var.c(this.f45201k, 4);
            this.V += 4;
        }
        return q();
    }

    private void J(l lVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length + i10;
        if (this.f45204n.b() < length) {
            this.f45204n.P(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f45204n.d(), 0, bArr.length);
        }
        lVar.readFully(this.f45204n.d(), bArr.length, i10);
        this.f45204n.S(0);
        this.f45204n.R(length);
    }

    private int K(l lVar, com.google.android.exoplayer2.extractor.e0 e0Var, int i10) throws IOException {
        int iA = this.f45203m.a();
        if (iA <= 0) {
            return e0Var.b(lVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        e0Var.c(this.f45203m, iMin);
        return iMin;
    }

    private void L(l lVar, byte[] bArr, int i10, int i11) throws IOException {
        int iMin = Math.min(i11, this.f45203m.a());
        lVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f45203m.k(bArr, i10, iMin);
        }
    }

    @mk.d({"cueTimesUs", "cueClusterPositions"})
    private void i(int i10) throws ParserException {
        if (this.F == null || this.G == null) {
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Element ");
            sb2.append(i10);
            sb2.append(" must be in a Cues");
            throw ParserException.a(sb2.toString(), null);
        }
    }

    @mk.d({"currentTrack"})
    private void j(int i10) throws ParserException {
        if (this.f45214x != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(43);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw ParserException.a(sb2.toString(), null);
    }

    @mk.d({"extractorOutput"})
    private void k() {
        com.google.android.exoplayer2.util.a.k(this.f45194d0);
    }

    private b0 m(@p0 v vVar, @p0 v vVar2) {
        int i10;
        if (this.f45210t == -1 || this.f45213w == j.f46377b || vVar == null || vVar.c() == 0 || vVar2 == null || vVar2.c() != vVar.c()) {
            return new b0.b(this.f45213w);
        }
        int iC = vVar.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            jArrCopyOf3[i12] = vVar.b(i12);
            jArrCopyOf[i12] = this.f45210t + vVar2.b(i12);
        }
        while (true) {
            i10 = iC - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        iArrCopyOf[i10] = (int) ((this.f45210t + this.f45209s) - jArrCopyOf[i10]);
        long j10 = this.f45213w - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            StringBuilder sb2 = new StringBuilder(72);
            sb2.append("Discarding last cue point with unexpected duration: ");
            sb2.append(j10);
            u.m(f45127g0, sb2.toString());
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        return new com.google.android.exoplayer2.extractor.e(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @mk.m({"#1.output"})
    private void n(d dVar, long j10, int i10, int i11, int i12) {
        f0 f0Var = dVar.T;
        if (f0Var != null) {
            f0Var.c(dVar.X, j10, i10, i11, i12, dVar.f45230j);
        } else {
            if (O0.equals(dVar.f45222b) || P0.equals(dVar.f45222b)) {
                if (this.N > 1) {
                    u.m(f45127g0, "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.L;
                    if (j11 == j.f46377b) {
                        u.m(f45127g0, "Skipping subtitle sample with no duration.");
                    } else {
                        F(dVar.f45222b, j11, this.f45204n.d());
                        for (int iE = this.f45204n.e(); iE < this.f45204n.f(); iE++) {
                            if (this.f45204n.d()[iE] == 0) {
                                this.f45204n.R(iE);
                                break;
                            }
                        }
                        com.google.android.exoplayer2.extractor.e0 e0Var = dVar.X;
                        e0 e0Var2 = this.f45204n;
                        e0Var.c(e0Var2, e0Var2.f());
                        i11 += this.f45204n.f();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.N > 1) {
                    i10 &= -268435457;
                } else {
                    int iF = this.f45207q.f();
                    dVar.X.f(this.f45207q, iF, 2);
                    i11 += iF;
                }
            }
            dVar.X.e(j10, i10, i11, i12, dVar.f45230j);
        }
        this.I = true;
    }

    private static int[] p(@p0 int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int q() {
        int i10 = this.V;
        D();
        return i10;
    }

    private static byte[] s(long j10, String str, long j11) {
        com.google.android.exoplayer2.util.a.a(j10 != j.f46377b);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * 3600)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return u0.y0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    private d t(int i10) throws ParserException {
        j(i10);
        return this.f45214x;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean y(String str) {
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(f45169t0)) {
                    b10 = 0;
                }
                break;
            case -2095575984:
                if (str.equals(f45163r0)) {
                    b10 = 1;
                }
                break;
            case -1985379776:
                if (str.equals(K0)) {
                    b10 = 2;
                }
                break;
            case -1784763192:
                if (str.equals(F0)) {
                    b10 = 3;
                }
                break;
            case -1730367663:
                if (str.equals(f45184y0)) {
                    b10 = 4;
                }
                break;
            case -1482641358:
                if (str.equals(B0)) {
                    b10 = 5;
                }
                break;
            case -1482641357:
                if (str.equals(C0)) {
                    b10 = 6;
                }
                break;
            case -1373388978:
                if (str.equals(f45178w0)) {
                    b10 = 7;
                }
                break;
            case -933872740:
                if (str.equals(S0)) {
                    b10 = 8;
                }
                break;
            case -538363189:
                if (str.equals(f45166s0)) {
                    b10 = 9;
                }
                break;
            case -538363109:
                if (str.equals(f45172u0)) {
                    b10 = 10;
                }
                break;
            case -425012669:
                if (str.equals(Q0)) {
                    b10 = 11;
                }
                break;
            case -356037306:
                if (str.equals(I0)) {
                    b10 = 12;
                }
                break;
            case 62923557:
                if (str.equals(A0)) {
                    b10 = 13;
                }
                break;
            case 62923603:
                if (str.equals(D0)) {
                    b10 = 14;
                }
                break;
            case 62927045:
                if (str.equals(G0)) {
                    b10 = 15;
                }
                break;
            case 82318131:
                if (str.equals(f45157p0)) {
                    b10 = 16;
                }
                break;
            case 82338133:
                if (str.equals(f45151n0)) {
                    b10 = 17;
                }
                break;
            case 82338134:
                if (str.equals(f45154o0)) {
                    b10 = com.google.common.base.a.f56668u;
                }
                break;
            case 99146302:
                if (str.equals(R0)) {
                    b10 = 19;
                }
                break;
            case 444813526:
                if (str.equals(f45181x0)) {
                    b10 = com.google.common.base.a.f56671x;
                }
                break;
            case 542569478:
                if (str.equals(H0)) {
                    b10 = com.google.common.base.a.f56672y;
                }
                break;
            case 635596514:
                if (str.equals(N0)) {
                    b10 = com.google.common.base.a.f56673z;
                }
                break;
            case 725948237:
                if (str.equals(M0)) {
                    b10 = com.google.common.base.a.A;
                }
                break;
            case 725957860:
                if (str.equals(L0)) {
                    b10 = com.google.common.base.a.B;
                }
                break;
            case 738597099:
                if (str.equals(P0)) {
                    b10 = com.google.common.base.a.C;
                }
                break;
            case 855502857:
                if (str.equals(f45175v0)) {
                    b10 = com.google.common.base.a.D;
                }
                break;
            case 1422270023:
                if (str.equals(O0)) {
                    b10 = com.google.common.base.a.E;
                }
                break;
            case 1809237540:
                if (str.equals(f45160q0)) {
                    b10 = com.google.common.base.a.F;
                }
                break;
            case 1950749482:
                if (str.equals(E0)) {
                    b10 = com.google.common.base.a.G;
                }
                break;
            case 1950789798:
                if (str.equals(J0)) {
                    b10 = com.google.common.base.a.H;
                }
                break;
            case 1951062397:
                if (str.equals(f45187z0)) {
                    b10 = 31;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
                return true;
            default:
                return false;
        }
    }

    @i
    protected void G(int i10, long j10, long j11) throws ParserException {
        k();
        if (i10 == 160) {
            this.T = false;
            return;
        }
        if (i10 == 174) {
            this.f45214x = new d();
            return;
        }
        if (i10 == 187) {
            this.H = false;
            return;
        }
        if (i10 == f45120e1) {
            this.f45216z = -1;
            this.A = -1L;
            return;
        }
        if (i10 == f45114c2) {
            t(i10).f45228h = true;
            return;
        }
        if (i10 == A2) {
            t(i10).f45244x = true;
            return;
        }
        if (i10 == f45110b1) {
            long j12 = this.f45210t;
            if (j12 != -1 && j12 != j10) {
                throw ParserException.a("Multiple Segment elements not supported", null);
            }
            this.f45210t = j10;
            this.f45209s = j11;
            return;
        }
        if (i10 == f45133h2) {
            this.F = new v();
            this.G = new v();
        } else if (i10 == f45143k1 && !this.f45215y) {
            if (this.f45197g && this.C != -1) {
                this.B = true;
            } else {
                this.f45194d0.t(new b0.b(this.f45213w));
                this.f45215y = true;
            }
        }
    }

    @i
    protected void H(int i10, String str) throws ParserException {
        if (i10 == 134) {
            t(i10).f45222b = str;
            return;
        }
        if (i10 != Z0) {
            if (i10 == G1) {
                t(i10).f45221a = str;
                return;
            } else {
                if (i10 != f45150m2) {
                    return;
                }
                t(i10).W = str;
                return;
            }
        }
        if (f45148m0.equals(str) || f45145l0.equals(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw ParserException.a(sb2.toString(), null);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    @i
    public void a(long j10, long j11) {
        this.E = j.f46377b;
        this.J = 0;
        this.f45193d.reset();
        this.f45195e.e();
        D();
        for (int i10 = 0; i10 < this.f45196f.size(); i10++) {
            this.f45196f.valueAt(i10).m();
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void b(m mVar) {
        this.f45194d0 = mVar;
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final boolean f(l lVar) throws IOException {
        return new f().b(lVar);
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final int g(l lVar, com.google.android.exoplayer2.extractor.z zVar) throws IOException {
        this.I = false;
        boolean zA = true;
        while (zA && !this.I) {
            zA = this.f45193d.a(lVar);
            if (zA && B(zVar, lVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f45196f.size(); i10++) {
            d dVarValueAt = this.f45196f.valueAt(i10);
            dVarValueAt.e();
            dVarValueAt.i();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0290  */
    @i
    protected void l(int i10, int i11, l lVar) throws IOException {
        d dVar;
        int i12;
        d dVar2;
        long j10;
        long j11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17 = 0;
        int i18 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.J != 2) {
                    return;
                }
                w(this.f45196f.get(this.P), this.S, lVar, i11);
                return;
            }
            if (i10 == 16877) {
                v(t(i10), lVar, i11);
                return;
            }
            if (i10 == f45111b2) {
                j(i10);
                byte[] bArr = new byte[i11];
                this.f45214x.f45229i = bArr;
                lVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == f45121e2) {
                byte[] bArr2 = new byte[i11];
                lVar.readFully(bArr2, 0, i11);
                t(i10).f45230j = new com.google.android.exoplayer2.extractor.e0.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == f45124f1) {
                Arrays.fill(this.f45202l.d(), (byte) 0);
                lVar.readFully(this.f45202l.d(), 4 - i11, i11);
                this.f45202l.S(0);
                this.f45216z = (int) this.f45202l.I();
                return;
            }
            if (i10 == I1) {
                j(i10);
                byte[] bArr3 = new byte[i11];
                this.f45214x.f45231k = bArr3;
                lVar.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != f45159p2) {
                StringBuilder sb2 = new StringBuilder(26);
                sb2.append("Unexpected id: ");
                sb2.append(i10);
                throw ParserException.a(sb2.toString(), null);
            }
            j(i10);
            byte[] bArr4 = new byte[i11];
            this.f45214x.f45242v = bArr4;
            lVar.readFully(bArr4, 0, i11);
            return;
        }
        if (this.J == 0) {
            this.P = (int) this.f45195e.d(lVar, false, true, 8);
            this.Q = this.f45195e.b();
            this.L = j.f46377b;
            this.J = 1;
            this.f45200j.O(0);
        }
        d dVar3 = this.f45196f.get(this.P);
        if (dVar3 == null) {
            lVar.t(i11 - this.Q);
            this.J = 0;
            return;
        }
        dVar3.e();
        if (this.J == 1) {
            C(lVar, 3);
            int i19 = (this.f45200j.d()[2] & 6) >> 1;
            byte b10 = 255;
            if (i19 == 0) {
                this.N = 1;
                int[] iArrP = p(this.O, 1);
                this.O = iArrP;
                iArrP[0] = (i11 - this.Q) - 3;
            } else {
                int i20 = 4;
                C(lVar, 4);
                int i21 = (this.f45200j.d()[3] & 255) + 1;
                this.N = i21;
                int[] iArrP2 = p(this.O, i21);
                this.O = iArrP2;
                if (i19 == 2) {
                    int i22 = (i11 - this.Q) - 4;
                    int i23 = this.N;
                    Arrays.fill(iArrP2, 0, i23, i22 / i23);
                } else {
                    if (i19 == 1) {
                        int i24 = 0;
                        int i25 = 0;
                        while (true) {
                            i13 = this.N;
                            if (i24 >= i13 - 1) {
                                break;
                            }
                            this.O[i24] = 0;
                            do {
                                i20++;
                                C(lVar, i20);
                                i14 = this.f45200j.d()[i20 - 1] & 255;
                                int[] iArr = this.O;
                                i15 = iArr[i24] + i14;
                                iArr[i24] = i15;
                            } while (i14 == 255);
                            i25 += i15;
                            i24++;
                        }
                        this.O[i13 - 1] = ((i11 - this.Q) - i20) - i25;
                    } else {
                        if (i19 != 3) {
                            StringBuilder sb3 = new StringBuilder(36);
                            sb3.append("Unexpected lacing value: ");
                            sb3.append(i19);
                            throw ParserException.a(sb3.toString(), null);
                        }
                        int i26 = 0;
                        int i27 = 0;
                        while (true) {
                            int i28 = this.N;
                            if (i26 >= i28 - 1) {
                                dVar2 = dVar3;
                                this.O[i28 - 1] = ((i11 - this.Q) - i20) - i27;
                                break;
                            }
                            this.O[i26] = i17;
                            i20++;
                            C(lVar, i20);
                            int i29 = i20 - 1;
                            if (this.f45200j.d()[i29] == 0) {
                                throw ParserException.a("No valid varint length mask found", null);
                            }
                            int i30 = i17;
                            while (true) {
                                if (i30 >= 8) {
                                    j10 = 0;
                                    break;
                                }
                                int i31 = i18 << (7 - i30);
                                if ((this.f45200j.d()[i29] & i31) != 0) {
                                    int i32 = i20 + i30;
                                    C(lVar, i32);
                                    long j12 = (~i31) & this.f45200j.d()[i29] & b10;
                                    int i33 = i29 + 1;
                                    while (true) {
                                        j11 = j12;
                                        if (i33 >= i32) {
                                            break;
                                        }
                                        j12 = (j11 << 8) | ((long) (this.f45200j.d()[i33] & b10));
                                        i33++;
                                        i32 = i32;
                                        b10 = 255;
                                    }
                                    int i34 = i32;
                                    if (i26 > 0) {
                                        j11 -= (1 << ((i30 * 7) + 6)) - 1;
                                    }
                                    j10 = j11;
                                    i20 = i34;
                                    break;
                                }
                                i30++;
                                i18 = 1;
                                b10 = 255;
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw ParserException.a("EBML lacing sample size out of range.", null);
                            }
                            int i35 = (int) j10;
                            int[] iArr2 = this.O;
                            if (i26 != 0) {
                                i35 += iArr2[i26 - 1];
                            }
                            iArr2[i26] = i35;
                            i27 += i35;
                            i26++;
                            dVar3 = dVar3;
                            i17 = 0;
                            i18 = 1;
                            b10 = 255;
                        }
                    }
                    this.K = this.E + E((this.f45200j.d()[0] << 8) | (this.f45200j.d()[1] & 255));
                    dVar = dVar2;
                    if (dVar.f45224d != 2 || (i10 == 163 && (this.f45200j.d()[2] & 128) == 128)) {
                        i16 = 1;
                    } else {
                        i16 = 0;
                    }
                    this.R = i16;
                    this.J = 2;
                    this.M = 0;
                    i12 = 163;
                }
            }
            dVar2 = dVar3;
            this.K = this.E + E((this.f45200j.d()[0] << 8) | (this.f45200j.d()[1] & 255));
            dVar = dVar2;
            if (dVar.f45224d != 2) {
                i16 = 1;
            } else {
                i16 = 1;
            }
            this.R = i16;
            this.J = 2;
            this.M = 0;
            i12 = 163;
        } else {
            dVar = dVar3;
            i12 = 163;
        }
        if (i10 == i12) {
            while (true) {
                int i36 = this.M;
                if (i36 >= this.N) {
                    this.J = 0;
                    return;
                }
                n(dVar, ((long) ((this.M * dVar.f45225e) / 1000)) + this.K, this.R, I(lVar, dVar, this.O[i36]), 0);
                this.M++;
            }
        } else {
            while (true) {
                int i37 = this.M;
                if (i37 >= this.N) {
                    return;
                }
                int[] iArr3 = this.O;
                iArr3[i37] = I(lVar, dVar, iArr3[i37]);
                this.M++;
            }
        }
    }

    @i
    protected void o(int i10) throws ParserException {
        k();
        if (i10 == 160) {
            if (this.J != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.N; i12++) {
                i11 += this.O[i12];
            }
            d dVar = this.f45196f.get(this.P);
            dVar.e();
            for (int i13 = 0; i13 < this.N; i13++) {
                long j10 = ((long) ((dVar.f45225e * i13) / 1000)) + this.K;
                int i14 = this.R;
                if (i13 == 0 && !this.T) {
                    i14 |= 1;
                }
                int i15 = this.O[i13];
                i11 -= i15;
                n(dVar, j10, i14, i15, i11);
            }
            this.J = 0;
            return;
        }
        if (i10 == 174) {
            d dVar2 = (d) com.google.android.exoplayer2.util.a.k(this.f45214x);
            String str = dVar2.f45222b;
            if (str == null) {
                throw ParserException.a("CodecId is missing in TrackEntry element", null);
            }
            if (y(str)) {
                dVar2.h(this.f45194d0, dVar2.f45223c);
                this.f45196f.put(dVar2.f45223c, dVar2);
            }
            this.f45214x = null;
            return;
        }
        if (i10 == f45120e1) {
            int i16 = this.f45216z;
            if (i16 != -1) {
                long j11 = this.A;
                if (j11 != -1) {
                    if (i16 == f45133h2) {
                        this.C = j11;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == W1) {
            j(i10);
            d dVar3 = this.f45214x;
            if (dVar3.f45228h) {
                if (dVar3.f45230j == null) {
                    throw ParserException.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                dVar3.f45232l = new DrmInitData(new DrmInitData.SchemeData(j.U1, y.f51574h, this.f45214x.f45230j.f44874b));
                return;
            }
            return;
        }
        if (i10 == V1) {
            j(i10);
            d dVar4 = this.f45214x;
            if (dVar4.f45228h && dVar4.f45229i != null) {
                throw ParserException.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f45211u == j.f46377b) {
                this.f45211u = 1000000L;
            }
            long j12 = this.f45212v;
            if (j12 != j.f46377b) {
                this.f45213w = E(j12);
                return;
            }
            return;
        }
        if (i10 == f45176v1) {
            if (this.f45196f.size() == 0) {
                throw ParserException.a("No valid tracks were found", null);
            }
            this.f45194d0.n();
        } else {
            if (i10 != f45133h2) {
                return;
            }
            if (!this.f45215y) {
                this.f45194d0.t(m(this.F, this.G));
                this.f45215y = true;
            }
            this.F = null;
            this.G = null;
        }
    }

    @i
    protected void r(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            t(i10).Q = (int) d10;
        }
        if (i10 == f45140j1) {
            this.f45212v = (long) d10;
            return;
        }
        switch (i10) {
            case B2 /* 21969 */:
                t(i10).D = (float) d10;
                break;
            case C2 /* 21970 */:
                t(i10).E = (float) d10;
                break;
            case D2 /* 21971 */:
                t(i10).F = (float) d10;
                break;
            case E2 /* 21972 */:
                t(i10).G = (float) d10;
                break;
            case F2 /* 21973 */:
                t(i10).H = (float) d10;
                break;
            case G2 /* 21974 */:
                t(i10).I = (float) d10;
                break;
            case H2 /* 21975 */:
                t(i10).J = (float) d10;
                break;
            case I2 /* 21976 */:
                t(i10).K = (float) d10;
                break;
            case J2 /* 21977 */:
                t(i10).L = (float) d10;
                break;
            case K2 /* 21978 */:
                t(i10).M = (float) d10;
                break;
            default:
                switch (i10) {
                    case f45162q2 /* 30323 */:
                        t(i10).f45239s = (float) d10;
                        break;
                    case f45165r2 /* 30324 */:
                        t(i10).f45240t = (float) d10;
                        break;
                    case f45168s2 /* 30325 */:
                        t(i10).f45241u = (float) d10;
                        break;
                }
                break;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.k
    public final void release() {
    }

    @i
    protected int u(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case E1 /* 16871 */:
            case f45108a2 /* 16980 */:
            case f45107a1 /* 17029 */:
            case Y0 /* 17143 */:
            case f45117d2 /* 18401 */:
            case f45129g2 /* 18408 */:
            case X1 /* 20529 */:
            case Y1 /* 20530 */:
            case f45128g1 /* 21420 */:
            case f45171t2 /* 21432 */:
            case O1 /* 21680 */:
            case Q1 /* 21682 */:
            case P1 /* 21690 */:
            case A1 /* 21930 */:
            case f45177v2 /* 21945 */:
            case f45180w2 /* 21946 */:
            case f45183x2 /* 21947 */:
            case f45186y2 /* 21948 */:
            case f45189z2 /* 21949 */:
            case C1 /* 21998 */:
            case J1 /* 22186 */:
            case K1 /* 22203 */:
            case T1 /* 25188 */:
            case f45156o2 /* 30321 */:
            case B1 /* 2352003 */:
            case f45136i1 /* 2807729 */:
                return 2;
            case 134:
            case Z0 /* 17026 */:
            case G1 /* 21358 */:
            case f45150m2 /* 2274716 */:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case D1 /* 16868 */:
            case f45125f2 /* 18407 */:
            case f45120e1 /* 19899 */:
            case Z1 /* 20532 */:
            case f45114c2 /* 20533 */:
            case f45174u2 /* 21936 */:
            case A2 /* 21968 */:
            case W1 /* 25152 */:
            case V1 /* 28032 */:
            case f45161q1 /* 30113 */:
            case f45153n2 /* 30320 */:
            case f45116d1 /* 290298740 */:
            case 357149030:
            case f45176v1 /* 374648427 */:
            case f45110b1 /* 408125543 */:
            case X0 /* 440786851 */:
            case f45133h2 /* 475249515 */:
            case f45143k1 /* 524531317 */:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case f45111b2 /* 16981 */:
            case f45121e2 /* 18402 */:
            case f45124f1 /* 21419 */:
            case I1 /* 25506 */:
            case f45159p2 /* 30322 */:
                return 4;
            case 181:
            case f45140j1 /* 17545 */:
            case B2 /* 21969 */:
            case C2 /* 21970 */:
            case D2 /* 21971 */:
            case E2 /* 21972 */:
            case F2 /* 21973 */:
            case G2 /* 21974 */:
            case H2 /* 21975 */:
            case I2 /* 21976 */:
            case J2 /* 21977 */:
            case K2 /* 21978 */:
            case f45162q2 /* 30323 */:
            case f45165r2 /* 30324 */:
            case f45168s2 /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    protected void v(d dVar, l lVar, int i10) throws IOException {
        if (dVar.f45227g != 1685485123 && dVar.f45227g != 1685480259) {
            lVar.t(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        dVar.N = bArr;
        lVar.readFully(bArr, 0, i10);
    }

    protected void w(d dVar, int i10, l lVar, int i11) throws IOException {
        if (i10 != 4 || !f45154o0.equals(dVar.f45222b)) {
            lVar.t(i11);
        } else {
            this.f45207q.O(i11);
            lVar.readFully(this.f45207q.d(), 0, i11);
        }
    }

    @i
    protected void x(int i10, long j10) throws ParserException {
        if (i10 == X1) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw ParserException.a(sb2.toString(), null);
        }
        if (i10 == Y1) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(55);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw ParserException.a(sb3.toString(), null);
        }
        switch (i10) {
            case 131:
                t(i10).f45224d = (int) j10;
                return;
            case 136:
                t(i10).V = j10 == 1;
                return;
            case 155:
                this.L = E(j10);
                return;
            case 159:
                t(i10).O = (int) j10;
                return;
            case 176:
                t(i10).f45233m = (int) j10;
                return;
            case 179:
                i(i10);
                this.F.a(E(j10));
                return;
            case 186:
                t(i10).f45234n = (int) j10;
                return;
            case 215:
                t(i10).f45223c = (int) j10;
                return;
            case 231:
                this.E = E(j10);
                return;
            case 238:
                this.S = (int) j10;
                return;
            case 241:
                if (this.H) {
                    return;
                }
                i(i10);
                this.G.a(j10);
                this.H = true;
                return;
            case 251:
                this.T = true;
                return;
            case E1 /* 16871 */:
                t(i10).f45227g = (int) j10;
                return;
            case f45108a2 /* 16980 */:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(50);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw ParserException.a(sb4.toString(), null);
            case f45107a1 /* 17029 */:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(53);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw ParserException.a(sb5.toString(), null);
                }
                return;
            case Y0 /* 17143 */:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(50);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw ParserException.a(sb6.toString(), null);
            case f45117d2 /* 18401 */:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(49);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw ParserException.a(sb7.toString(), null);
            case f45129g2 /* 18408 */:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(56);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw ParserException.a(sb8.toString(), null);
            case f45128g1 /* 21420 */:
                this.A = j10 + this.f45210t;
                return;
            case f45171t2 /* 21432 */:
                int i11 = (int) j10;
                j(i10);
                if (i11 == 0) {
                    this.f45214x.f45243w = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f45214x.f45243w = 2;
                    return;
                } else if (i11 == 3) {
                    this.f45214x.f45243w = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f45214x.f45243w = 3;
                    return;
                }
            case O1 /* 21680 */:
                t(i10).f45235o = (int) j10;
                return;
            case Q1 /* 21682 */:
                t(i10).f45237q = (int) j10;
                return;
            case P1 /* 21690 */:
                t(i10).f45236p = (int) j10;
                return;
            case A1 /* 21930 */:
                t(i10).U = j10 == 1;
                return;
            case C1 /* 21998 */:
                t(i10).f45226f = (int) j10;
                return;
            case J1 /* 22186 */:
                t(i10).R = j10;
                return;
            case K1 /* 22203 */:
                t(i10).S = j10;
                return;
            case T1 /* 25188 */:
                t(i10).P = (int) j10;
                return;
            case f45156o2 /* 30321 */:
                j(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f45214x.f45238r = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f45214x.f45238r = 1;
                    return;
                } else if (i12 == 2) {
                    this.f45214x.f45238r = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f45214x.f45238r = 3;
                    return;
                }
            case B1 /* 2352003 */:
                t(i10).f45225e = (int) j10;
                return;
            case f45136i1 /* 2807729 */:
                this.f45211u = j10;
                return;
            default:
                switch (i10) {
                    case f45177v2 /* 21945 */:
                        j(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f45214x.A = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f45214x.A = 1;
                            return;
                        }
                    case f45180w2 /* 21946 */:
                        j(i10);
                        int iD = com.google.android.exoplayer2.video.c.d((int) j10);
                        if (iD != -1) {
                            this.f45214x.f45246z = iD;
                            return;
                        }
                        return;
                    case f45183x2 /* 21947 */:
                        j(i10);
                        this.f45214x.f45244x = true;
                        int iC = com.google.android.exoplayer2.video.c.c((int) j10);
                        if (iC != -1) {
                            this.f45214x.f45245y = iC;
                            return;
                        }
                        return;
                    case f45186y2 /* 21948 */:
                        t(i10).B = (int) j10;
                        return;
                    case f45189z2 /* 21949 */:
                        t(i10).C = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @i
    protected boolean z(int i10) {
        return i10 == 357149030 || i10 == f45143k1 || i10 == f45133h2 || i10 == f45176v1;
    }
}
