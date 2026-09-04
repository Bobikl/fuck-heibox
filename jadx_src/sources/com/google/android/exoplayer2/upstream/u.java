package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.os.Handler;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.util.NetworkTypeObserver;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.SignedBytes;
import com.igexin.assist.sdk.AssistPushConsts;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import okio.Utf8;

/* JADX INFO: compiled from: DefaultBandwidthMeter.java */
/* JADX INFO: loaded from: classes7.dex */
public final class u implements e, u0 {
    private static final int A = 3;
    private static final int B = 4;
    private static final int C = 5;

    @androidx.annotation.p0
    private static u D = null;
    private static final int E = 2000;
    private static final int F = 524288;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ImmutableList<Long> f51233p = ImmutableList.H(5400000L, 3300000L, 2000000L, 1300000L, 760000L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final ImmutableList<Long> f51234q = ImmutableList.H(1700000L, 820000L, 450000L, 180000L, 130000L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ImmutableList<Long> f51235r = ImmutableList.H(2300000L, 1300000L, 1000000L, 820000L, 570000L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ImmutableList<Long> f51236s = ImmutableList.H(3400000L, 2000000L, 1400000L, 1000000L, 620000L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final ImmutableList<Long> f51237t = ImmutableList.H(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final ImmutableList<Long> f51238u = ImmutableList.H(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f51239v = 1000000;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f51240w = 2000;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f51241x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f51242y = 1;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f51243z = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImmutableMap<Integer, Long> f51244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e.a.C0405a f51245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q0 f51246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.util.e f51247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f51248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f51249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f51251h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f51252i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f51253j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f51254k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f51255l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f51256m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f51257n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f51258o;

    /* JADX INFO: compiled from: DefaultBandwidthMeter.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        private final Context f51259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<Integer, Long> f51260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f51261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.google.android.exoplayer2.util.e f51262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f51263e;

        public b(Context context) {
            this.f51259a = context == null ? null : context.getApplicationContext();
            this.f51260b = b(com.google.android.exoplayer2.util.u0.U(context));
            this.f51261c = 2000;
            this.f51262d = com.google.android.exoplayer2.util.e.f51387a;
            this.f51263e = true;
        }

        private static Map<Integer, Long> b(String str) {
            int[] iArrL = u.l(str);
            HashMap map = new HashMap(8);
            map.put(0, 1000000L);
            ImmutableList<Long> immutableList = u.f51233p;
            map.put(2, immutableList.get(iArrL[0]));
            map.put(3, u.f51234q.get(iArrL[1]));
            map.put(4, u.f51235r.get(iArrL[2]));
            map.put(5, u.f51236s.get(iArrL[3]));
            map.put(10, u.f51237t.get(iArrL[4]));
            map.put(9, u.f51238u.get(iArrL[5]));
            map.put(7, immutableList.get(iArrL[0]));
            return map;
        }

        public u a() {
            return new u(this.f51259a, this.f51260b, this.f51261c, this.f51262d, this.f51263e);
        }

        public b c(com.google.android.exoplayer2.util.e eVar) {
            this.f51262d = eVar;
            return this;
        }

        public b d(int i10, long j10) {
            this.f51260b.put(Integer.valueOf(i10), Long.valueOf(j10));
            return this;
        }

        public b e(long j10) {
            Iterator<Integer> it = this.f51260b.keySet().iterator();
            while (it.hasNext()) {
                d(it.next().intValue(), j10);
            }
            return this;
        }

        public b f(String str) {
            this.f51260b = b(com.google.common.base.a.j(str));
            return this;
        }

        public b g(boolean z10) {
            this.f51263e = z10;
            return this;
        }

        public b h(int i10) {
            this.f51261c = i10;
            return this;
        }
    }

    @Deprecated
    public u() {
        this(null, ImmutableMap.v(), 2000, com.google.android.exoplayer2.util.e.f51387a, false);
    }

    private u(@androidx.annotation.p0 Context context, Map<Integer, Long> map, int i10, com.google.android.exoplayer2.util.e eVar, boolean z10) {
        this.f51244a = ImmutableMap.g(map);
        this.f51245b = new e.a.C0405a();
        this.f51246c = new q0(i10);
        this.f51247d = eVar;
        this.f51248e = z10;
        if (context == null) {
            this.f51252i = 0;
            this.f51255l = m(0);
            return;
        }
        NetworkTypeObserver networkTypeObserverD = NetworkTypeObserver.d(context);
        int iF = networkTypeObserverD.f();
        this.f51252i = iF;
        this.f51255l = m(iF);
        networkTypeObserverD.i(new NetworkTypeObserver.c() { // from class: com.google.android.exoplayer2.upstream.t
            @Override // com.google.android.exoplayer2.util.NetworkTypeObserver.c
            public final void a(int i11) {
                this.f51232a.q(i11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int[] l(String str) {
        str.hashCode();
        byte b10 = -1;
        switch (str.hashCode()) {
            case bb.c.d.f31150c0 /* 2083 */:
                if (str.equals("AD")) {
                    b10 = 0;
                }
                break;
            case bb.c.d.f31174d0 /* 2084 */:
                if (str.equals("AE")) {
                    b10 = 1;
                }
                break;
            case bb.c.d.f31197e0 /* 2085 */:
                if (str.equals("AF")) {
                    b10 = 2;
                }
                break;
            case bb.c.d.f31220f0 /* 2086 */:
                if (str.equals("AG")) {
                    b10 = 3;
                }
                break;
            case bb.c.d.f31266h0 /* 2088 */:
                if (str.equals("AI")) {
                    b10 = 4;
                }
                break;
            case bb.c.d.f31335k0 /* 2091 */:
                if (str.equals("AL")) {
                    b10 = 5;
                }
                break;
            case bb.c.d.f31358l0 /* 2092 */:
                if (str.equals("AM")) {
                    b10 = 6;
                }
                break;
            case bb.c.d.f31404n0 /* 2094 */:
                if (str.equals("AO")) {
                    b10 = 7;
                }
                break;
            case bb.c.d.f31450p0 /* 2096 */:
                if (str.equals("AQ")) {
                    b10 = 8;
                }
                break;
            case bb.c.d.f31473q0 /* 2097 */:
                if (str.equals("AR")) {
                    b10 = 9;
                }
                break;
            case bb.c.d.f31495r0 /* 2098 */:
                if (str.equals("AS")) {
                    b10 = 10;
                }
                break;
            case bb.c.d.f31517s0 /* 2099 */:
                if (str.equals("AT")) {
                    b10 = 11;
                }
                break;
            case bb.c.d.f31539t0 /* 2100 */:
                if (str.equals("AU")) {
                    b10 = 12;
                }
                break;
            case 2102:
                if (str.equals("AW")) {
                    b10 = 13;
                }
                break;
            case 2103:
                if (str.equals("AX")) {
                    b10 = 14;
                }
                break;
            case 2105:
                if (str.equals("AZ")) {
                    b10 = 15;
                }
                break;
            case 2111:
                if (str.equals("BA")) {
                    b10 = 16;
                }
                break;
            case bb.c.d.F0 /* 2112 */:
                if (str.equals("BB")) {
                    b10 = 17;
                }
                break;
            case bb.c.d.H0 /* 2114 */:
                if (str.equals("BD")) {
                    b10 = com.google.common.base.a.f56668u;
                }
                break;
            case bb.c.d.I0 /* 2115 */:
                if (str.equals("BE")) {
                    b10 = 19;
                }
                break;
            case bb.c.d.J0 /* 2116 */:
                if (str.equals("BF")) {
                    b10 = com.google.common.base.a.f56671x;
                }
                break;
            case bb.c.d.K0 /* 2117 */:
                if (str.equals("BG")) {
                    b10 = com.google.common.base.a.f56672y;
                }
                break;
            case bb.c.d.L0 /* 2118 */:
                if (str.equals("BH")) {
                    b10 = com.google.common.base.a.f56673z;
                }
                break;
            case bb.c.d.M0 /* 2119 */:
                if (str.equals("BI")) {
                    b10 = com.google.common.base.a.A;
                }
                break;
            case bb.c.d.N0 /* 2120 */:
                if (str.equals("BJ")) {
                    b10 = com.google.common.base.a.B;
                }
                break;
            case bb.c.d.P0 /* 2122 */:
                if (str.equals("BL")) {
                    b10 = com.google.common.base.a.C;
                }
                break;
            case bb.c.d.Q0 /* 2123 */:
                if (str.equals("BM")) {
                    b10 = com.google.common.base.a.D;
                }
                break;
            case bb.c.d.R0 /* 2124 */:
                if (str.equals("BN")) {
                    b10 = com.google.common.base.a.E;
                }
                break;
            case bb.c.d.S0 /* 2125 */:
                if (str.equals("BO")) {
                    b10 = com.google.common.base.a.F;
                }
                break;
            case bb.c.d.U0 /* 2127 */:
                if (str.equals("BQ")) {
                    b10 = com.google.common.base.a.G;
                }
                break;
            case bb.c.d.V0 /* 2128 */:
                if (str.equals("BR")) {
                    b10 = com.google.common.base.a.H;
                }
                break;
            case bb.c.d.W0 /* 2129 */:
                if (str.equals("BS")) {
                    b10 = 31;
                }
                break;
            case bb.c.d.X0 /* 2130 */:
                if (str.equals("BT")) {
                    b10 = 32;
                }
                break;
            case bb.c.d.f31105a1 /* 2133 */:
                if (str.equals("BW")) {
                    b10 = 33;
                }
                break;
            case bb.c.d.f31151c1 /* 2135 */:
                if (str.equals("BY")) {
                    b10 = 34;
                }
                break;
            case bb.c.d.f31175d1 /* 2136 */:
                if (str.equals("BZ")) {
                    b10 = 35;
                }
                break;
            case bb.c.d.f31313j1 /* 2142 */:
                if (str.equals("CA")) {
                    b10 = 36;
                }
                break;
            case bb.c.d.f31382m1 /* 2145 */:
                if (str.equals("CD")) {
                    b10 = 37;
                }
                break;
            case bb.c.d.f31428o1 /* 2147 */:
                if (str.equals("CF")) {
                    b10 = 38;
                }
                break;
            case bb.c.d.f31451p1 /* 2148 */:
                if (str.equals("CG")) {
                    b10 = 39;
                }
                break;
            case bb.c.d.f31474q1 /* 2149 */:
                if (str.equals("CH")) {
                    b10 = 40;
                }
                break;
            case bb.c.d.f31496r1 /* 2150 */:
                if (str.equals("CI")) {
                    b10 = 41;
                }
                break;
            case bb.c.d.f31540t1 /* 2152 */:
                if (str.equals("CK")) {
                    b10 = 42;
                }
                break;
            case bb.c.d.f31562u1 /* 2153 */:
                if (str.equals("CL")) {
                    b10 = 43;
                }
                break;
            case bb.c.d.f31584v1 /* 2154 */:
                if (str.equals("CM")) {
                    b10 = 44;
                }
                break;
            case bb.c.d.f31606w1 /* 2155 */:
                if (str.equals(com.huawei.hms.feature.dynamic.f.e.f60734e)) {
                    b10 = 45;
                }
                break;
            case bb.c.d.f31628x1 /* 2156 */:
                if (str.equals("CO")) {
                    b10 = 46;
                }
                break;
            case bb.c.d.A1 /* 2159 */:
                if (str.equals("CR")) {
                    b10 = 47;
                }
                break;
            case bb.c.d.D1 /* 2162 */:
                if (str.equals("CU")) {
                    b10 = org.apache.tools.tar.c.F;
                }
                break;
            case bb.c.d.E1 /* 2163 */:
                if (str.equals("CV")) {
                    b10 = org.apache.tools.tar.c.G;
                }
                break;
            case bb.c.d.F1 /* 2164 */:
                if (str.equals("CW")) {
                    b10 = org.apache.tools.tar.c.H;
                }
                break;
            case bb.c.d.G1 /* 2165 */:
                if (str.equals("CX")) {
                    b10 = org.apache.tools.tar.c.I;
                }
                break;
            case bb.c.d.H1 /* 2166 */:
                if (str.equals("CY")) {
                    b10 = org.apache.tools.tar.c.J;
                }
                break;
            case bb.c.d.I1 /* 2167 */:
                if (str.equals("CZ")) {
                    b10 = org.apache.tools.tar.c.K;
                }
                break;
            case bb.c.d.S1 /* 2177 */:
                if (str.equals("DE")) {
                    b10 = org.apache.tools.tar.c.L;
                }
                break;
            case bb.c.d.X1 /* 2182 */:
                if (str.equals("DJ")) {
                    b10 = org.apache.tools.tar.c.M;
                }
                break;
            case bb.c.d.Y1 /* 2183 */:
                if (str.equals("DK")) {
                    b10 = 56;
                }
                break;
            case bb.c.d.f31106a2 /* 2185 */:
                if (str.equals("DM")) {
                    b10 = 57;
                }
                break;
            case bb.c.d.f31152c2 /* 2187 */:
                if (str.equals("DO")) {
                    b10 = 58;
                }
                break;
            case bb.c.d.f31406n2 /* 2198 */:
                if (str.equals("DZ")) {
                    b10 = 59;
                }
                break;
            case bb.c.d.f31585v2 /* 2206 */:
                if (str.equals("EC")) {
                    b10 = 60;
                }
                break;
            case bb.c.d.f31629x2 /* 2208 */:
                if (str.equals("EE")) {
                    b10 = 61;
                }
                break;
            case bb.c.d.f31673z2 /* 2210 */:
                if (str.equals("EG")) {
                    b10 = 62;
                }
                break;
            case bb.c.d.K2 /* 2221 */:
                if (str.equals("ER")) {
                    b10 = Utf8.REPLACEMENT_BYTE;
                }
                break;
            case bb.c.d.L2 /* 2222 */:
                if (str.equals("ES")) {
                    b10 = SignedBytes.f59068a;
                }
                break;
            case bb.c.d.M2 /* 2223 */:
                if (str.equals("ET")) {
                    b10 = 65;
                }
                break;
            case bb.c.d.f31246g3 /* 2243 */:
                if (str.equals("FI")) {
                    b10 = 66;
                }
                break;
            case bb.c.d.f31269h3 /* 2244 */:
                if (str.equals("FJ")) {
                    b10 = 67;
                }
                break;
            case bb.c.d.f31292i3 /* 2245 */:
                if (str.equals("FK")) {
                    b10 = 68;
                }
                break;
            case bb.c.d.f31338k3 /* 2247 */:
                if (str.equals("FM")) {
                    b10 = 69;
                }
                break;
            case bb.c.d.f31384m3 /* 2249 */:
                if (str.equals("FO")) {
                    b10 = 70;
                }
                break;
            case bb.c.d.f31453p3 /* 2252 */:
                if (str.equals("FR")) {
                    b10 = 71;
                }
                break;
            case bb.c.d.D3 /* 2266 */:
                if (str.equals("GA")) {
                    b10 = 72;
                }
                break;
            case bb.c.d.E3 /* 2267 */:
                if (str.equals("GB")) {
                    b10 = 73;
                }
                break;
            case bb.c.d.G3 /* 2269 */:
                if (str.equals("GD")) {
                    b10 = 74;
                }
                break;
            case bb.c.d.H3 /* 2270 */:
                if (str.equals("GE")) {
                    b10 = org.apache.tools.tar.c.N;
                }
                break;
            case bb.c.d.I3 /* 2271 */:
                if (str.equals("GF")) {
                    b10 = org.apache.tools.tar.c.O;
                }
                break;
            case bb.c.d.J3 /* 2272 */:
                if (str.equals("GG")) {
                    b10 = 77;
                }
                break;
            case bb.c.d.K3 /* 2273 */:
                if (str.equals("GH")) {
                    b10 = 78;
                }
                break;
            case bb.c.d.L3 /* 2274 */:
                if (str.equals("GI")) {
                    b10 = 79;
                }
                break;
            case bb.c.d.O3 /* 2277 */:
                if (str.equals("GL")) {
                    b10 = 80;
                }
                break;
            case bb.c.d.P3 /* 2278 */:
                if (str.equals("GM")) {
                    b10 = 81;
                }
                break;
            case bb.c.d.Q3 /* 2279 */:
                if (str.equals("GN")) {
                    b10 = 82;
                }
                break;
            case bb.c.d.S3 /* 2281 */:
                if (str.equals("GP")) {
                    b10 = org.apache.tools.tar.c.P;
                }
                break;
            case bb.c.d.T3 /* 2282 */:
                if (str.equals("GQ")) {
                    b10 = 84;
                }
                break;
            case bb.c.d.U3 /* 2283 */:
                if (str.equals("GR")) {
                    b10 = 85;
                }
                break;
            case bb.c.d.W3 /* 2285 */:
                if (str.equals("GT")) {
                    b10 = 86;
                }
                break;
            case bb.c.d.X3 /* 2286 */:
                if (str.equals("GU")) {
                    b10 = 87;
                }
                break;
            case bb.c.d.Z3 /* 2288 */:
                if (str.equals("GW")) {
                    b10 = org.apache.tools.tar.c.R;
                }
                break;
            case bb.c.d.f31131b4 /* 2290 */:
                if (str.equals("GY")) {
                    b10 = 89;
                }
                break;
            case bb.c.d.f31521s4 /* 2307 */:
                if (str.equals("HK")) {
                    b10 = 90;
                }
                break;
            case bb.c.d.f31587v4 /* 2310 */:
                if (str.equals("HN")) {
                    b10 = 91;
                }
                break;
            case bb.c.d.f31675z4 /* 2314 */:
                if (str.equals("HR")) {
                    b10 = 92;
                }
                break;
            case bb.c.d.B4 /* 2316 */:
                if (str.equals("HT")) {
                    b10 = 93;
                }
                break;
            case bb.c.d.C4 /* 2317 */:
                if (str.equals("HU")) {
                    b10 = 94;
                }
                break;
            case bb.c.d.Q4 /* 2331 */:
                if (str.equals("ID")) {
                    b10 = 95;
                }
                break;
            case bb.c.d.R4 /* 2332 */:
                if (str.equals("IE")) {
                    b10 = 96;
                }
                break;
            case bb.c.d.Y4 /* 2339 */:
                if (str.equals("IL")) {
                    b10 = 97;
                }
                break;
            case bb.c.d.Z4 /* 2340 */:
                if (str.equals("IM")) {
                    b10 = 98;
                }
                break;
            case bb.c.d.f31109a5 /* 2341 */:
                if (str.equals("IN")) {
                    b10 = 99;
                }
                break;
            case bb.c.d.f31132b5 /* 2342 */:
                if (str.equals("IO")) {
                    b10 = 100;
                }
                break;
            case bb.c.d.f31179d5 /* 2344 */:
                if (str.equals("IQ")) {
                    b10 = 101;
                }
                break;
            case bb.c.d.f31202e5 /* 2345 */:
                if (str.equals("IR")) {
                    b10 = 102;
                }
                break;
            case bb.c.d.f31225f5 /* 2346 */:
                if (str.equals("IS")) {
                    b10 = org.apache.tools.tar.c.S;
                }
                break;
            case bb.c.d.f31248g5 /* 2347 */:
                if (str.equals("IT")) {
                    b10 = 104;
                }
                break;
            case bb.c.d.f31610w5 /* 2363 */:
                if (str.equals("JE")) {
                    b10 = 105;
                }
                break;
            case bb.c.d.E5 /* 2371 */:
                if (str.equals("JM")) {
                    b10 = 106;
                }
                break;
            case bb.c.d.G5 /* 2373 */:
                if (str.equals("JO")) {
                    b10 = 107;
                }
                break;
            case bb.c.d.H5 /* 2374 */:
                if (str.equals("JP")) {
                    b10 = 108;
                }
                break;
            case bb.c.d.f31133b6 /* 2394 */:
                if (str.equals("KE")) {
                    b10 = 109;
                }
                break;
            case bb.c.d.f31180d6 /* 2396 */:
                if (str.equals("KG")) {
                    b10 = 110;
                }
                break;
            case bb.c.d.f31203e6 /* 2397 */:
                if (str.equals("KH")) {
                    b10 = 111;
                }
                break;
            case bb.c.d.f31226f6 /* 2398 */:
                if (str.equals("KI")) {
                    b10 = 112;
                }
                break;
            case bb.c.d.f31318j6 /* 2402 */:
                if (str.equals("KM")) {
                    b10 = 113;
                }
                break;
            case bb.c.d.f31387m6 /* 2405 */:
                if (str.equals("KP")) {
                    b10 = 114;
                }
                break;
            case bb.c.d.f31433o6 /* 2407 */:
                if (str.equals("KR")) {
                    b10 = 115;
                }
                break;
            case bb.c.d.f31545t6 /* 2412 */:
                if (str.equals("KW")) {
                    b10 = 116;
                }
                break;
            case bb.c.d.f31589v6 /* 2414 */:
                if (str.equals("KY")) {
                    b10 = 117;
                }
                break;
            case bb.c.d.f31611w6 /* 2415 */:
                if (str.equals("KZ")) {
                    b10 = 118;
                }
                break;
            case bb.c.d.C6 /* 2421 */:
                if (str.equals("LA")) {
                    b10 = 119;
                }
                break;
            case bb.c.d.D6 /* 2422 */:
                if (str.equals("LB")) {
                    b10 = org.apache.tools.tar.c.Q;
                }
                break;
            case bb.c.d.E6 /* 2423 */:
                if (str.equals("LC")) {
                    b10 = 121;
                }
                break;
            case bb.c.d.K6 /* 2429 */:
                if (str.equals("LI")) {
                    b10 = 122;
                }
                break;
            case bb.c.d.M6 /* 2431 */:
                if (str.equals("LK")) {
                    b10 = 123;
                }
                break;
            case bb.c.d.T6 /* 2438 */:
                if (str.equals("LR")) {
                    b10 = 124;
                }
                break;
            case bb.c.d.U6 /* 2439 */:
                if (str.equals("LS")) {
                    b10 = 125;
                }
                break;
            case bb.c.d.V6 /* 2440 */:
                if (str.equals("LT")) {
                    b10 = 126;
                }
                break;
            case bb.c.d.W6 /* 2441 */:
                if (str.equals("LU")) {
                    b10 = 127;
                }
                break;
            case bb.c.d.X6 /* 2442 */:
                if (str.equals("LV")) {
                    b10 = 128;
                }
                break;
            case bb.c.d.f31111a7 /* 2445 */:
                if (str.equals("LY")) {
                    b10 = 129;
                }
                break;
            case bb.c.d.f31273h7 /* 2452 */:
                if (str.equals("MA")) {
                    b10 = 130;
                }
                break;
            case bb.c.d.f31319j7 /* 2454 */:
                if (str.equals("MC")) {
                    b10 = 131;
                }
                break;
            case bb.c.d.f31342k7 /* 2455 */:
                if (str.equals("MD")) {
                    b10 = 132;
                }
                break;
            case bb.c.d.f31365l7 /* 2456 */:
                if (str.equals("ME")) {
                    b10 = 133;
                }
                break;
            case bb.c.d.f31388m7 /* 2457 */:
                if (str.equals("MF")) {
                    b10 = 134;
                }
                break;
            case bb.c.d.f31411n7 /* 2458 */:
                if (str.equals("MG")) {
                    b10 = 135;
                }
                break;
            case bb.c.d.f31434o7 /* 2459 */:
                if (str.equals("MH")) {
                    b10 = 136;
                }
                break;
            case bb.c.d.f31502r7 /* 2462 */:
                if (str.equals("MK")) {
                    b10 = 137;
                }
                break;
            case bb.c.d.f31524s7 /* 2463 */:
                if (str.equals("ML")) {
                    b10 = 138;
                }
                break;
            case bb.c.d.f31546t7 /* 2464 */:
                if (str.equals("MM")) {
                    b10 = 139;
                }
                break;
            case bb.c.d.f31568u7 /* 2465 */:
                if (str.equals("MN")) {
                    b10 = 140;
                }
                break;
            case bb.c.d.f31590v7 /* 2466 */:
                if (str.equals("MO")) {
                    b10 = 141;
                }
                break;
            case bb.c.d.f31612w7 /* 2467 */:
                if (str.equals("MP")) {
                    b10 = 142;
                }
                break;
            case bb.c.d.f31634x7 /* 2468 */:
                if (str.equals("MQ")) {
                    b10 = 143;
                }
                break;
            case bb.c.d.f31656y7 /* 2469 */:
                if (str.equals("MR")) {
                    b10 = 144;
                }
                break;
            case bb.c.d.f31678z7 /* 2470 */:
                if (str.equals("MS")) {
                    b10 = 145;
                }
                break;
            case bb.c.d.A7 /* 2471 */:
                if (str.equals("MT")) {
                    b10 = 146;
                }
                break;
            case bb.c.d.B7 /* 2472 */:
                if (str.equals("MU")) {
                    b10 = 147;
                }
                break;
            case bb.c.d.C7 /* 2473 */:
                if (str.equals("MV")) {
                    b10 = 148;
                }
                break;
            case bb.c.d.D7 /* 2474 */:
                if (str.equals("MW")) {
                    b10 = 149;
                }
                break;
            case bb.c.d.E7 /* 2475 */:
                if (str.equals("MX")) {
                    b10 = 150;
                }
                break;
            case bb.c.d.F7 /* 2476 */:
                if (str.equals("MY")) {
                    b10 = 151;
                }
                break;
            case bb.c.d.G7 /* 2477 */:
                if (str.equals("MZ")) {
                    b10 = 152;
                }
                break;
            case bb.c.d.M7 /* 2483 */:
                if (str.equals("NA")) {
                    b10 = 153;
                }
                break;
            case bb.c.d.O7 /* 2485 */:
                if (str.equals("NC")) {
                    b10 = 154;
                }
                break;
            case bb.c.d.Q7 /* 2487 */:
                if (str.equals("NE")) {
                    b10 = 155;
                }
                break;
            case bb.c.d.S7 /* 2489 */:
                if (str.equals("NG")) {
                    b10 = 156;
                }
                break;
            case bb.c.d.U7 /* 2491 */:
                if (str.equals("NI")) {
                    b10 = 157;
                }
                break;
            case bb.c.d.X7 /* 2494 */:
                if (str.equals("NL")) {
                    b10 = 158;
                }
                break;
            case bb.c.d.f31112a8 /* 2497 */:
                if (str.equals("NO")) {
                    b10 = 159;
                }
                break;
            case bb.c.d.f31135b8 /* 2498 */:
                if (str.equals("NP")) {
                    b10 = 160;
                }
                break;
            case 2500:
                if (str.equals("NR")) {
                    b10 = 161;
                }
                break;
            case bb.c.d.f31251g8 /* 2503 */:
                if (str.equals("NU")) {
                    b10 = 162;
                }
                break;
            case bb.c.d.f31366l8 /* 2508 */:
                if (str.equals("NZ")) {
                    b10 = 163;
                }
                break;
            case bb.c.d.D8 /* 2526 */:
                if (str.equals("OM")) {
                    b10 = 164;
                }
                break;
            case bb.c.d.W8 /* 2545 */:
                if (str.equals("PA")) {
                    b10 = 165;
                }
                break;
            case bb.c.d.f31113a9 /* 2549 */:
                if (str.equals("PE")) {
                    b10 = 166;
                }
                break;
            case bb.c.d.f31136b9 /* 2550 */:
                if (str.equals("PF")) {
                    b10 = 167;
                }
                break;
            case bb.c.d.f31159c9 /* 2551 */:
                if (str.equals("PG")) {
                    b10 = 168;
                }
                break;
            case bb.c.d.f31183d9 /* 2552 */:
                if (str.equals("PH")) {
                    b10 = 169;
                }
                break;
            case bb.c.d.f31252g9 /* 2555 */:
                if (str.equals("PK")) {
                    b10 = 170;
                }
                break;
            case bb.c.d.f31275h9 /* 2556 */:
                if (str.equals("PL")) {
                    b10 = 171;
                }
                break;
            case bb.c.d.f31298i9 /* 2557 */:
                if (str.equals("PM")) {
                    b10 = 172;
                }
                break;
            case bb.c.d.f31413n9 /* 2562 */:
                if (str.equals("PR")) {
                    b10 = 173;
                }
                break;
            case bb.c.d.f31436o9 /* 2563 */:
                if (str.equals("PS")) {
                    b10 = 174;
                }
                break;
            case bb.c.d.f31459p9 /* 2564 */:
                if (str.equals(AssistPushConsts.MSG_VALUE_PAYLOAD)) {
                    b10 = 175;
                }
                break;
            case bb.c.d.f31526s9 /* 2567 */:
                if (str.equals("PW")) {
                    b10 = 176;
                }
                break;
            case bb.c.d.f31570u9 /* 2569 */:
                if (str.equals("PY")) {
                    b10 = 177;
                }
                break;
            case bb.c.d.B9 /* 2576 */:
                if (str.equals("QA")) {
                    b10 = 178;
                }
                break;
            case bb.c.d.f31345ka /* 2611 */:
                if (str.equals("RE")) {
                    b10 = 179;
                }
                break;
            case bb.c.d.f31571ua /* 2621 */:
                if (str.equals("RO")) {
                    b10 = 180;
                }
                break;
            case bb.c.d.f31659ya /* 2625 */:
                if (str.equals("RS")) {
                    b10 = 181;
                }
                break;
            case bb.c.d.Aa /* 2627 */:
                if (str.equals("RU")) {
                    b10 = 182;
                }
                break;
            case bb.c.d.Ca /* 2629 */:
                if (str.equals("RW")) {
                    b10 = 183;
                }
                break;
            case bb.c.d.La /* 2638 */:
                if (str.equals("SA")) {
                    b10 = 184;
                }
                break;
            case bb.c.d.Ma /* 2639 */:
                if (str.equals("SB")) {
                    b10 = 185;
                }
                break;
            case bb.c.d.Na /* 2640 */:
                if (str.equals("SC")) {
                    b10 = 186;
                }
                break;
            case bb.c.d.Oa /* 2641 */:
                if (str.equals("SD")) {
                    b10 = 187;
                }
                break;
            case bb.c.d.Pa /* 2642 */:
                if (str.equals("SE")) {
                    b10 = 188;
                }
                break;
            case bb.c.d.Ra /* 2644 */:
                if (str.equals("SG")) {
                    b10 = 189;
                }
                break;
            case bb.c.d.Sa /* 2645 */:
                if (str.equals("SH")) {
                    b10 = 190;
                }
                break;
            case bb.c.d.Ta /* 2646 */:
                if (str.equals("SI")) {
                    b10 = 191;
                }
                break;
            case bb.c.d.Ua /* 2647 */:
                if (str.equals("SJ")) {
                    b10 = 192;
                }
                break;
            case bb.c.d.Va /* 2648 */:
                if (str.equals("SK")) {
                    b10 = 193;
                }
                break;
            case bb.c.d.Wa /* 2649 */:
                if (str.equals("SL")) {
                    b10 = 194;
                }
                break;
            case bb.c.d.Xa /* 2650 */:
                if (str.equals("SM")) {
                    b10 = 195;
                }
                break;
            case bb.c.d.Ya /* 2651 */:
                if (str.equals("SN")) {
                    b10 = 196;
                }
                break;
            case bb.c.d.Za /* 2652 */:
                if (str.equals("SO")) {
                    b10 = 197;
                }
                break;
            case bb.c.d.f31161cb /* 2655 */:
                if (str.equals("SR")) {
                    b10 = 198;
                }
                break;
            case bb.c.d.f31185db /* 2656 */:
                if (str.equals("SS")) {
                    b10 = 199;
                }
                break;
            case bb.c.d.f31208eb /* 2657 */:
                if (str.equals("ST")) {
                    b10 = 200;
                }
                break;
            case bb.c.d.f31254gb /* 2659 */:
                if (str.equals("SV")) {
                    b10 = 201;
                }
                break;
            case bb.c.d.f31300ib /* 2661 */:
                if (str.equals("SX")) {
                    b10 = 202;
                }
                break;
            case bb.c.d.f31323jb /* 2662 */:
                if (str.equals("SY")) {
                    b10 = 203;
                }
                break;
            case bb.c.d.f31346kb /* 2663 */:
                if (str.equals("SZ")) {
                    b10 = 204;
                }
                break;
            case bb.c.d.f31528sb /* 2671 */:
                if (str.equals("TC")) {
                    b10 = 205;
                }
                break;
            case bb.c.d.f31550tb /* 2672 */:
                if (str.equals("TD")) {
                    b10 = 206;
                }
                break;
            case bb.c.d.f31616wb /* 2675 */:
                if (str.equals("TG")) {
                    b10 = 207;
                }
                break;
            case bb.c.d.f31638xb /* 2676 */:
                if (str.equals("TH")) {
                    b10 = 208;
                }
                break;
            case bb.c.d.f31682zb /* 2678 */:
                if (str.equals("TJ")) {
                    b10 = 209;
                }
                break;
            case bb.c.d.Bb /* 2680 */:
                if (str.equals("TL")) {
                    b10 = 210;
                }
                break;
            case bb.c.d.Cb /* 2681 */:
                if (str.equals("TM")) {
                    b10 = 211;
                }
                break;
            case bb.c.d.Db /* 2682 */:
                if (str.equals("TN")) {
                    b10 = 212;
                }
                break;
            case bb.c.d.Eb /* 2683 */:
                if (str.equals("TO")) {
                    b10 = 213;
                }
                break;
            case bb.c.d.Hb /* 2686 */:
                if (str.equals("TR")) {
                    b10 = 214;
                }
                break;
            case bb.c.d.Jb /* 2688 */:
                if (str.equals("TT")) {
                    b10 = 215;
                }
                break;
            case bb.c.d.Lb /* 2690 */:
                if (str.equals("TV")) {
                    b10 = 216;
                }
                break;
            case bb.c.d.Mb /* 2691 */:
                if (str.equals("TW")) {
                    b10 = 217;
                }
                break;
            case bb.c.d.Pb /* 2694 */:
                if (str.equals("TZ")) {
                    b10 = 218;
                }
                break;
            case bb.c.d.Vb /* 2700 */:
                if (str.equals("UA")) {
                    b10 = 219;
                }
                break;
            case bb.c.d.f31139bc /* 2706 */:
                if (str.equals("UG")) {
                    b10 = 220;
                }
                break;
            case bb.c.d.f31416nc /* 2718 */:
                if (str.equals("US")) {
                    b10 = 221;
                }
                break;
            case bb.c.d.f31551tc /* 2724 */:
                if (str.equals("UY")) {
                    b10 = 222;
                }
                break;
            case bb.c.d.f31573uc /* 2725 */:
                if (str.equals("UZ")) {
                    b10 = 223;
                }
                break;
            case bb.c.d.Cc /* 2733 */:
                if (str.equals("VC")) {
                    b10 = 224;
                }
                break;
            case bb.c.d.Ec /* 2735 */:
                if (str.equals("VE")) {
                    b10 = 225;
                }
                break;
            case bb.c.d.Gc /* 2737 */:
                if (str.equals("VG")) {
                    b10 = 226;
                }
                break;
            case bb.c.d.Ic /* 2739 */:
                if (str.equals("VI")) {
                    b10 = 227;
                }
                break;
            case bb.c.d.Nc /* 2744 */:
                if (str.equals("VN")) {
                    b10 = 228;
                }
                break;
            case bb.c.d.Uc /* 2751 */:
                if (str.equals("VU")) {
                    b10 = 229;
                }
                break;
            case bb.c.d.f31348kd /* 2767 */:
                if (str.equals("WF")) {
                    b10 = 230;
                }
                break;
            case bb.c.d.f31640xd /* 2780 */:
                if (str.equals("WS")) {
                    b10 = 231;
                }
                break;
            case bb.c.d.Ud /* 2803 */:
                if (str.equals("XK")) {
                    b10 = 232;
                }
                break;
            case bb.c.d.f31553te /* 2828 */:
                if (str.equals("YE")) {
                    b10 = 233;
                }
                break;
            case bb.c.d.Ie /* 2843 */:
                if (str.equals("YT")) {
                    b10 = 234;
                }
                break;
            case bb.c.d.Ue /* 2855 */:
                if (str.equals("ZA")) {
                    b10 = 235;
                }
                break;
            case bb.c.d.f31258gf /* 2867 */:
                if (str.equals("ZM")) {
                    b10 = 236;
                }
                break;
            case bb.c.d.f31488qf /* 2877 */:
                if (str.equals("ZW")) {
                    b10 = 237;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 26:
            case 80:
            case 121:
                return new int[]{1, 2, 0, 0, 2, 2};
            case 1:
                return new int[]{1, 4, 4, 4, 3, 2};
            case 2:
            case 93:
            case 155:
            case 187:
            case bb.c.b.O0 /* 196 */:
            case 206:
            case bb.c.b.f30897r1 /* 225 */:
            case bb.c.b.f31073z1 /* 233 */:
                return new int[]{4, 4, 4, 4, 2, 2};
            case 3:
                return new int[]{2, 3, 1, 2, 2, 2};
            case 4:
            case 25:
            case 51:
            case 57:
            case 74:
            case 145:
            case 224:
                return new int[]{1, 2, 2, 2, 2, 2};
            case 5:
            case 16:
            case 117:
                return new int[]{1, 2, 0, 1, 2, 2};
            case 6:
                return new int[]{2, 3, 2, 4, 2, 2};
            case 7:
            case 44:
                return new int[]{3, 4, 3, 2, 2, 2};
            case 8:
            case 63:
            case 100:
            case 162:
            case bb.c.b.I0 /* 190 */:
            case 199:
            case 216:
                return new int[]{4, 2, 2, 2, 2, 2};
            case 9:
                return new int[]{2, 4, 1, 1, 2, 2};
            case 10:
                return new int[]{2, 2, 2, 3, 2, 2};
            case 11:
            case 40:
            case 103:
            case 188:
            case 193:
                return new int[]{0, 0, 0, 0, 0, 2};
            case 12:
                return new int[]{0, 1, 0, 1, 2, 2};
            case 13:
            case 87:
                return new int[]{1, 2, 4, 4, 2, 2};
            case 14:
            case 79:
            case 122:
            case 142:
            case 172:
            case 192:
            case 195:
                return new int[]{0, 2, 2, 2, 2, 2};
            case 15:
            case 154:
                return new int[]{3, 2, 4, 4, 2, 2};
            case 17:
            case 70:
            case 77:
                return new int[]{0, 2, 0, 0, 2, 2};
            case 18:
            case 151:
                return new int[]{2, 1, 3, 3, 2, 2};
            case 19:
                return new int[]{0, 0, 3, 3, 2, 2};
            case 20:
                return new int[]{4, 3, 4, 3, 2, 2};
            case 21:
            case 53:
            case bb.c.b.J0 /* 191 */:
                return new int[]{0, 0, 0, 0, 1, 2};
            case 22:
                return new int[]{1, 2, 2, 4, 4, 2};
            case 23:
            case 59:
            case 203:
            case 210:
                return new int[]{4, 3, 4, 4, 2, 2};
            case 24:
                return new int[]{4, 4, 3, 4, 2, 2};
            case 27:
                return new int[]{3, 2, 1, 1, 2, 2};
            case 28:
                return new int[]{1, 3, 3, 2, 2, 2};
            case 29:
                return new int[]{1, 2, 2, 0, 2, 2};
            case 30:
            case 198:
                return new int[]{2, 3, 2, 2, 2, 2};
            case 31:
                return new int[]{4, 2, 2, 3, 2, 2};
            case 32:
                return new int[]{3, 1, 3, 2, 2, 2};
            case 33:
            case 89:
                return new int[]{3, 4, 1, 0, 2, 2};
            case 34:
                return new int[]{0, 1, 1, 3, 2, 2};
            case 35:
                return new int[]{2, 4, 2, 2, 2, 2};
            case 36:
                return new int[]{0, 2, 1, 2, 4, 1};
            case 37:
                return new int[]{4, 2, 3, 1, 2, 2};
            case 38:
                return new int[]{4, 2, 3, 2, 2, 2};
            case 39:
            case 150:
                return new int[]{2, 4, 3, 4, 2, 2};
            case 41:
                return new int[]{3, 3, 3, 4, 2, 2};
            case 42:
                return new int[]{2, 2, 2, 1, 2, 2};
            case 43:
            case bb.c.b.f30851p0 /* 171 */:
            case 221:
                return new int[]{1, 1, 2, 2, 3, 2};
            case 45:
                return new int[]{2, 0, 2, 2, 3, 1};
            case 46:
                return new int[]{2, 2, 4, 2, 2, 2};
            case 47:
                return new int[]{2, 2, 4, 4, 2, 2};
            case 48:
            case bb.c.b.f30782m0 /* 168 */:
                return new int[]{4, 4, 3, 2, 2, 2};
            case 49:
                return new int[]{2, 3, 1, 0, 2, 2};
            case 50:
                return new int[]{2, 2, 0, 0, 2, 2};
            case 52:
                return new int[]{1, 0, 0, 0, 1, 2};
            case 54:
                return new int[]{0, 0, 2, 2, 1, 2};
            case 55:
                return new int[]{4, 1, 4, 4, 2, 2};
            case 56:
                return new int[]{0, 0, 1, 0, 0, 2};
            case 58:
            case 106:
                return new int[]{3, 4, 4, 4, 2, 2};
            case 60:
                return new int[]{2, 4, 2, 1, 2, 2};
            case 61:
            case 126:
            case 128:
            case 146:
                return new int[]{0, 0, 0, 0, 2, 2};
            case 62:
                return new int[]{3, 4, 2, 3, 2, 2};
            case 64:
            case 96:
                return new int[]{0, 1, 1, 1, 2, 2};
            case 65:
                return new int[]{4, 4, 3, 1, 2, 2};
            case 66:
                return new int[]{0, 0, 0, 1, 0, 2};
            case 67:
                return new int[]{3, 1, 3, 3, 2, 2};
            case 68:
            case 114:
            case 130:
            case 152:
            case 200:
                return new int[]{3, 2, 2, 2, 2, 2};
            case 69:
                return new int[]{3, 2, 4, 2, 2, 2};
            case 71:
                return new int[]{1, 1, 2, 1, 1, 1};
            case 72:
                return new int[]{2, 3, 1, 1, 2, 2};
            case 73:
                return new int[]{0, 0, 1, 1, 2, 3};
            case 75:
                return new int[]{1, 1, 1, 3, 2, 2};
            case 76:
            case 83:
            case 143:
                return new int[]{2, 1, 2, 3, 2, 2};
            case 78:
                return new int[]{3, 2, 3, 2, 2, 2};
            case 81:
            case bb.c.b.f31007w1 /* 230 */:
                return new int[]{4, 2, 2, 4, 2, 2};
            case 82:
                return new int[]{4, 3, 4, 2, 2, 2};
            case 84:
                return new int[]{4, 2, 3, 4, 2, 2};
            case 85:
            case 92:
            case 132:
            case 137:
            case 181:
                return new int[]{1, 0, 0, 0, 2, 2};
            case 86:
                return new int[]{2, 3, 2, 1, 2, 2};
            case 88:
            case 218:
                return new int[]{3, 4, 3, 3, 2, 2};
            case 90:
                return new int[]{0, 1, 2, 3, 2, 0};
            case 91:
            case bb.c.b.f30828o0 /* 170 */:
            case bb.c.b.P0 /* 197 */:
                return new int[]{3, 2, 3, 3, 2, 2};
            case 94:
                return new int[]{0, 0, 0, 1, 3, 2};
            case 95:
                return new int[]{3, 2, 3, 3, 3, 2};
            case 97:
                return new int[]{1, 1, 2, 3, 4, 2};
            case 98:
                return new int[]{0, 2, 0, 1, 2, 2};
            case 99:
                return new int[]{1, 1, 3, 2, 4, 3};
            case 101:
            case 220:
                return new int[]{3, 3, 3, 3, 2, 2};
            case 102:
                return new int[]{3, 0, 1, 1, 3, 0};
            case 104:
                return new int[]{0, 1, 0, 1, 1, 2};
            case 105:
                return new int[]{3, 2, 1, 2, 2, 2};
            case 107:
            case 133:
                return new int[]{1, 0, 0, 1, 2, 2};
            case 108:
                return new int[]{0, 1, 0, 1, 1, 1};
            case 109:
                return new int[]{3, 3, 2, 2, 2, 2};
            case 110:
                return new int[]{2, 1, 1, 1, 2, 2};
            case 111:
                return new int[]{1, 1, 4, 2, 2, 2};
            case 112:
            case 113:
            case 129:
            case 185:
                return new int[]{4, 2, 4, 3, 2, 2};
            case 115:
                return new int[]{0, 0, 1, 3, 4, 4};
            case 116:
                return new int[]{1, 1, 0, 0, 0, 2};
            case 118:
                return new int[]{1, 1, 2, 2, 2, 2};
            case 119:
            case bb.c.b.f30829o1 /* 222 */:
                return new int[]{2, 2, 1, 2, 2, 2};
            case 120:
                return new int[]{3, 2, 1, 4, 2, 2};
            case 123:
                return new int[]{3, 1, 3, 4, 4, 2};
            case 124:
                return new int[]{3, 4, 4, 3, 2, 2};
            case 125:
                return new int[]{3, 3, 4, 3, 2, 2};
            case 127:
                return new int[]{1, 0, 2, 2, 2, 2};
            case 131:
                return new int[]{0, 2, 2, 0, 2, 2};
            case 134:
                return new int[]{1, 2, 1, 0, 2, 2};
            case 135:
                return new int[]{3, 4, 2, 2, 2, 2};
            case 136:
                return new int[]{3, 2, 2, 4, 2, 2};
            case 138:
                return new int[]{4, 3, 3, 1, 2, 2};
            case 139:
                return new int[]{2, 4, 3, 3, 2, 2};
            case 140:
                return new int[]{2, 0, 1, 2, 2, 2};
            case 141:
                return new int[]{0, 2, 4, 4, 2, 2};
            case 144:
                return new int[]{4, 1, 3, 4, 2, 2};
            case 147:
                return new int[]{3, 1, 1, 2, 2, 2};
            case 148:
                return new int[]{3, 4, 1, 4, 2, 2};
            case 149:
                return new int[]{4, 2, 1, 0, 2, 2};
            case 153:
                return new int[]{4, 3, 2, 2, 2, 2};
            case 156:
                return new int[]{3, 4, 1, 1, 2, 2};
            case bb.c.b.f30528b0 /* 157 */:
                return new int[]{2, 3, 4, 3, 2, 2};
            case 158:
                return new int[]{0, 0, 3, 2, 0, 4};
            case 159:
                return new int[]{0, 0, 2, 0, 0, 2};
            case 160:
                return new int[]{2, 1, 4, 3, 2, 2};
            case 161:
                return new int[]{3, 2, 2, 0, 2, 2};
            case 163:
                return new int[]{1, 0, 1, 2, 4, 2};
            case bb.c.b.f30690i0 /* 164 */:
                return new int[]{2, 3, 1, 3, 4, 2};
            case 165:
                return new int[]{1, 3, 3, 3, 2, 2};
            case 166:
                return new int[]{2, 3, 4, 4, 4, 2};
            case 167:
                return new int[]{2, 3, 3, 1, 2, 2};
            case 169:
                return new int[]{2, 2, 3, 3, 3, 2};
            case bb.c.b.f30896r0 /* 173 */:
                return new int[]{2, 3, 2, 2, 3, 3};
            case bb.c.b.f30918s0 /* 174 */:
                return new int[]{3, 4, 1, 2, 2, 2};
            case bb.c.b.f30940t0 /* 175 */:
                return new int[]{0, 1, 0, 0, 2, 2};
            case 176:
                return new int[]{2, 2, 4, 1, 2, 2};
            case 177:
                return new int[]{2, 2, 3, 2, 2, 2};
            case 178:
                return new int[]{2, 4, 2, 4, 4, 2};
            case bb.c.b.f31028x0 /* 179 */:
                return new int[]{1, 1, 1, 2, 2, 2};
            case 180:
                return new int[]{0, 0, 1, 1, 1, 2};
            case 182:
                return new int[]{0, 0, 0, 1, 2, 2};
            case 183:
                return new int[]{3, 4, 3, 0, 2, 2};
            case 184:
            case 212:
            case bb.c.b.f30919s1 /* 226 */:
                return new int[]{2, 2, 1, 1, 2, 2};
            case bb.c.b.E0 /* 186 */:
                return new int[]{4, 3, 0, 2, 2, 2};
            case 189:
                return new int[]{1, 1, 2, 3, 1, 4};
            case 194:
                return new int[]{4, 3, 4, 1, 2, 2};
            case 201:
                return new int[]{2, 2, 3, 3, 2, 2};
            case 202:
            case 205:
                return new int[]{2, 2, 1, 0, 2, 2};
            case 204:
                return new int[]{4, 3, 2, 4, 2, 2};
            case 207:
                return new int[]{3, 3, 2, 0, 2, 2};
            case 208:
                return new int[]{0, 3, 2, 3, 3, 0};
            case 209:
                return new int[]{4, 2, 4, 4, 2, 2};
            case 211:
                return new int[]{4, 2, 4, 2, 2, 2};
            case 213:
                return new int[]{4, 2, 3, 3, 2, 2};
            case bb.c.b.f30645g1 /* 214 */:
                return new int[]{1, 1, 0, 1, 2, 2};
            case 215:
                return new int[]{1, 4, 1, 1, 2, 2};
            case 217:
                return new int[]{0, 0, 0, 0, 0, 0};
            case 219:
                return new int[]{0, 3, 1, 1, 2, 2};
            case bb.c.b.f30852p1 /* 223 */:
                return new int[]{2, 2, 3, 4, 2, 2};
            case bb.c.b.f30941t1 /* 227 */:
                return new int[]{1, 2, 1, 3, 2, 2};
            case bb.c.b.f30963u1 /* 228 */:
                return new int[]{0, 3, 3, 4, 2, 2};
            case bb.c.b.f30985v1 /* 229 */:
                return new int[]{4, 2, 2, 1, 2, 2};
            case bb.c.b.f31029x1 /* 231 */:
                return new int[]{3, 1, 2, 1, 2, 2};
            case bb.c.b.f31051y1 /* 232 */:
                return new int[]{1, 1, 1, 1, 2, 2};
            case bb.c.b.A1 /* 234 */:
                return new int[]{4, 1, 1, 1, 2, 2};
            case bb.c.b.B1 /* 235 */:
                return new int[]{3, 3, 1, 1, 1, 2};
            case bb.c.b.C1 /* 236 */:
                return new int[]{3, 3, 4, 2, 2, 2};
            case bb.c.b.D1 /* 237 */:
                return new int[]{3, 2, 4, 3, 2, 2};
            default:
                return new int[]{2, 2, 2, 2, 2, 2};
        }
    }

    private long m(int i10) {
        Long l10 = this.f51244a.get(Integer.valueOf(i10));
        if (l10 == null) {
            l10 = this.f51244a.get(0);
        }
        if (l10 == null) {
            l10 = 1000000L;
        }
        return l10.longValue();
    }

    public static synchronized u n(Context context) {
        if (D == null) {
            D = new b(context).a();
        }
        return D;
    }

    private static boolean o(r rVar, boolean z10) {
        return z10 && !rVar.d(8);
    }

    private void p(int i10, long j10, long j11) {
        if (i10 == 0 && j10 == 0 && j11 == this.f51256m) {
            return;
        }
        this.f51256m = j11;
        this.f51245b.c(i10, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q(int i10) {
        int i11 = this.f51252i;
        if (i11 == 0 || this.f51248e) {
            if (this.f51257n) {
                i10 = this.f51258o;
            }
            if (i11 == i10) {
                return;
            }
            this.f51252i = i10;
            if (i10 != 1 && i10 != 0 && i10 != 8) {
                this.f51255l = m(i10);
                long jB = this.f51247d.b();
                p(this.f51249f > 0 ? (int) (jB - this.f51250g) : 0, this.f51251h, this.f51255l);
                this.f51250g = jB;
                this.f51251h = 0L;
                this.f51254k = 0L;
                this.f51253j = 0L;
                this.f51246c.i();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.e
    public /* synthetic */ long a() {
        return c.a(this);
    }

    @Override // com.google.android.exoplayer2.upstream.u0
    public synchronized void b(o oVar, r rVar, boolean z10) {
        if (o(rVar, z10)) {
            com.google.android.exoplayer2.util.a.i(this.f51249f > 0);
            long jB = this.f51247d.b();
            int i10 = (int) (jB - this.f51250g);
            this.f51253j += (long) i10;
            long j10 = this.f51254k;
            long j11 = this.f51251h;
            this.f51254k = j10 + j11;
            if (i10 > 0) {
                this.f51246c.c((int) Math.sqrt(j11), (j11 * 8000.0f) / i10);
                if (this.f51253j >= 2000 || this.f51254k >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                    this.f51255l = (long) this.f51246c.f(0.5f);
                }
                p(i10, this.f51251h, this.f51255l);
                this.f51250g = jB;
                this.f51251h = 0L;
            }
            this.f51249f--;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.e
    public synchronized long c() {
        return this.f51255l;
    }

    @Override // com.google.android.exoplayer2.upstream.u0
    public synchronized void d(o oVar, r rVar, boolean z10, int i10) {
        if (o(rVar, z10)) {
            this.f51251h += (long) i10;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.e
    public void e(Handler handler, e.a aVar) {
        com.google.android.exoplayer2.util.a.g(handler);
        com.google.android.exoplayer2.util.a.g(aVar);
        this.f51245b.b(handler, aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.u0
    public synchronized void f(o oVar, r rVar, boolean z10) {
        if (o(rVar, z10)) {
            if (this.f51249f == 0) {
                this.f51250g = this.f51247d.b();
            }
            this.f51249f++;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.e
    public u0 g() {
        return this;
    }

    @Override // com.google.android.exoplayer2.upstream.e
    public void h(e.a aVar) {
        this.f51245b.e(aVar);
    }

    @Override // com.google.android.exoplayer2.upstream.u0
    public void i(o oVar, r rVar, boolean z10) {
    }

    public synchronized void r(int i10) {
        this.f51258o = i10;
        this.f51257n = true;
        q(i10);
    }
}
