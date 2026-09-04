package com.google.android.exoplayer2.text.cea;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import androidx.core.view.o;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.k;
import com.google.android.exoplayer2.text.l;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.util.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Cea608Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends e {
    public static final long A = 16000;
    private static final String B = "Cea608Decoder";
    private static final int C = 4;
    private static final int D = 2;
    private static final int E = 1;
    private static final int F = 0;
    private static final int G = 1;
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int Q = 7;
    private static final int R = 8;
    private static final int S = 4;
    private static final byte T = -4;
    private static final byte U = 32;
    private static final byte V = 33;
    private static final byte W = 36;
    private static final byte X = 37;
    private static final byte Y = 38;
    private static final byte Z = 39;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final byte f49408a0 = 41;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final byte f49409b0 = 42;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final byte f49410c0 = 43;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte f49411d0 = 44;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final byte f49412e0 = 45;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final byte f49413f0 = 46;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte f49414g0 = 47;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f49421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f49422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f49423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f49424m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private List<com.google.android.exoplayer2.text.b> f49427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private List<com.google.android.exoplayer2.text.b> f49428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f49429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f49430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f49431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f49432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f49433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte f49434w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f49436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f49437z;
    private static final int[] N = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] O = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] P = {-1, -16711936, -16776961, -16711681, y1.a.f141526c, o.f21773u, -65281};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int[] f49415h0 = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, bb.c.b.f30897r1, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, bb.c.b.f31073z1, 93, bb.c.b.D1, bb.c.b.J1, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, bb.c.b.f31029x1, 247, 209, bb.c.b.H1, bb.c.k.sx};

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int[] f49416i0 = {bb.c.b.f30918s0, 176, 189, bb.c.b.J0, bb.c.k.f33686lb, 162, 163, bb.c.k.nB, 224, 32, bb.c.b.f31051y1, bb.c.b.f30919s1, bb.c.b.A1, bb.c.b.E1, 244, 251};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int[] f49417j0 = {193, 201, 211, 218, 220, 252, bb.c.k.f33543f6, 161, 42, 39, 8212, 169, bb.c.k.f33640jb, bb.c.k.f33773p6, bb.c.k.f33635j6, bb.c.k.f33658k6, 192, 194, 199, 200, 202, 203, bb.c.b.B1, 206, 207, bb.c.b.F1, 212, 217, bb.c.b.P1, 219, bb.c.b.f30851p0, 187};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int[] f49418k0 = {195, bb.c.b.f30941t1, 205, 204, bb.c.b.C1, 210, bb.c.b.I1, 213, bb.c.b.L1, 123, 125, 92, 94, 95, 124, 126, bb.c.b.O0, bb.c.b.f30963u1, bb.c.b.f30645g1, bb.c.b.M1, bb.c.b.f30852p1, 165, bb.c.b.f30690i0, bb.c.k.qu, bb.c.b.P0, bb.c.b.f30985v1, 216, bb.c.b.O1, bb.c.k.Au, bb.c.k.Eu, bb.c.k.Iu, bb.c.k.Mu};

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final boolean[] f49419l0 = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0 f49420i = new e0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayList<C0391a> f49425n = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private C0391a f49426o = new C0391a(0, 4);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f49435x = 0;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea608Decoder.java */
    public static final class C0391a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f49438i = 32;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f49439j = 15;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C0392a> f49440a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f49441b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f49442c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49443d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49444e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f49445f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49446g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f49447h;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cea608Decoder.java */
        public static class C0392a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f49448a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f49449b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f49450c;

            public C0392a(int i10, boolean z10, int i11) {
                this.f49448a = i10;
                this.f49449b = z10;
                this.f49450c = i11;
            }
        }

        public C0391a(int i10, int i11) {
            j(i10);
            this.f49447h = i11;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49442c);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            int i11 = 0;
            boolean z10 = false;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            while (i10 < this.f49440a.size()) {
                C0392a c0392a = this.f49440a.get(i10);
                boolean z11 = c0392a.f49449b;
                int i16 = c0392a.f49448a;
                if (i16 != 8) {
                    boolean z12 = i16 == 7;
                    if (i16 != 7) {
                        i15 = a.P[i16];
                    }
                    z10 = z12;
                }
                int i17 = c0392a.f49450c;
                i10++;
                if (i17 != (i10 < this.f49440a.size() ? this.f49440a.get(i10).f49450c : length)) {
                    if (i12 != -1 && !z11) {
                        q(spannableStringBuilder, i12, i17);
                        i12 = -1;
                    } else if (i12 == -1 && z11) {
                        i12 = i17;
                    }
                    if (i13 != -1 && !z10) {
                        o(spannableStringBuilder, i13, i17);
                        i13 = -1;
                    } else if (i13 == -1 && z10) {
                        i13 = i17;
                    }
                    if (i15 != i14) {
                        n(spannableStringBuilder, i11, i17, i14);
                        i14 = i15;
                        i11 = i17;
                    }
                }
            }
            if (i12 != -1 && i12 != length) {
                q(spannableStringBuilder, i12, length);
            }
            if (i13 != -1 && i13 != length) {
                o(spannableStringBuilder, i13, length);
            }
            if (i11 != length) {
                n(spannableStringBuilder, i11, length, i14);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12) {
            if (i12 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i10, i11, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i10, int i11) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i10, i11, 33);
        }

        public void e(char c10) {
            if (this.f49442c.length() < 32) {
                this.f49442c.append(c10);
            }
        }

        public void f() {
            int length = this.f49442c.length();
            if (length > 0) {
                this.f49442c.delete(length - 1, length);
                for (int size = this.f49440a.size() - 1; size >= 0; size--) {
                    C0392a c0392a = this.f49440a.get(size);
                    int i10 = c0392a.f49450c;
                    if (i10 != length) {
                        return;
                    }
                    c0392a.f49450c = i10 - 1;
                }
            }
        }

        @p0
        public com.google.android.exoplayer2.text.b g(int i10) {
            float f10;
            int i11 = this.f49444e + this.f49445f;
            int i12 = 32 - i11;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i13 = 0; i13 < this.f49441b.size(); i13++) {
                spannableStringBuilder.append(u0.z1(this.f49441b.get(i13), i12));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(u0.z1(h(), i12));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i12 - spannableStringBuilder.length();
            int i14 = i11 - length;
            if (i10 == Integer.MIN_VALUE) {
                i10 = (this.f49446g != 2 || (Math.abs(i14) >= 3 && length >= 0)) ? (this.f49446g != 2 || i14 <= 0) ? 0 : 2 : 1;
            }
            if (i10 != 1) {
                if (i10 == 2) {
                    i11 = 32 - length;
                }
                f10 = ((i11 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f10 = 0.5f;
            }
            int i15 = this.f49443d;
            if (i15 > 7) {
                i15 = (i15 - 15) - 2;
            } else if (this.f49446g == 1) {
                i15 -= this.f49447h - 1;
            }
            return new com.google.android.exoplayer2.text.b.c().A(spannableStringBuilder).B(Layout.Alignment.ALIGN_NORMAL).t(i15, 1).w(f10).x(i10).a();
        }

        public boolean i() {
            return this.f49440a.isEmpty() && this.f49441b.isEmpty() && this.f49442c.length() == 0;
        }

        public void j(int i10) {
            this.f49446g = i10;
            this.f49440a.clear();
            this.f49441b.clear();
            this.f49442c.setLength(0);
            this.f49443d = 15;
            this.f49444e = 0;
            this.f49445f = 0;
        }

        public void k() {
            this.f49441b.add(h());
            this.f49442c.setLength(0);
            this.f49440a.clear();
            int iMin = Math.min(this.f49447h, this.f49443d);
            while (this.f49441b.size() >= iMin) {
                this.f49441b.remove(0);
            }
        }

        public void l(int i10) {
            this.f49446g = i10;
        }

        public void m(int i10) {
            this.f49447h = i10;
        }

        public void p(int i10, boolean z10) {
            this.f49440a.add(new C0392a(i10, z10, this.f49442c.length()));
        }
    }

    public a(String str, int i10, long j10) {
        this.f49424m = j10 > 0 ? j10 * 1000 : -9223372036854775807L;
        this.f49421j = y.f51605w0.equals(str) ? 2 : 3;
        if (i10 == 1) {
            this.f49423l = 0;
            this.f49422k = 0;
        } else if (i10 == 2) {
            this.f49423l = 1;
            this.f49422k = 0;
        } else if (i10 == 3) {
            this.f49423l = 0;
            this.f49422k = 1;
        } else if (i10 != 4) {
            u.m(B, "Invalid channel. Defaulting to CC1.");
            this.f49423l = 0;
            this.f49422k = 0;
        } else {
            this.f49423l = 1;
            this.f49422k = 1;
        }
        L(0);
        K();
        this.f49436y = true;
        this.f49437z = j.f46377b;
    }

    private static boolean A(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 32;
    }

    private static boolean B(byte b10, byte b11) {
        return (b10 & 246) == 20 && (b11 & 240) == 32;
    }

    private static boolean C(byte b10, byte b11) {
        return (b10 & 240) == 16 && (b11 & 192) == 64;
    }

    private static boolean D(byte b10) {
        return (b10 & 240) == 16;
    }

    private boolean E(boolean z10, byte b10, byte b11) {
        if (!z10 || !D(b10)) {
            this.f49432u = false;
        } else {
            if (this.f49432u && this.f49433v == b10 && this.f49434w == b11) {
                this.f49432u = false;
                return true;
            }
            this.f49432u = true;
            this.f49433v = b10;
            this.f49434w = b11;
        }
        return false;
    }

    private static boolean F(byte b10) {
        return (b10 & 247) == 20;
    }

    private static boolean G(byte b10, byte b11) {
        return (b10 & 247) == 17 && (b11 & 240) == 48;
    }

    private static boolean H(byte b10, byte b11) {
        return (b10 & 247) == 23 && b11 >= 33 && b11 <= 35;
    }

    private static boolean I(byte b10) {
        return 1 <= b10 && b10 <= 15;
    }

    private void J(byte b10, byte b11) {
        if (I(b10)) {
            this.f49436y = false;
            return;
        }
        if (F(b10)) {
            if (b11 != 32 && b11 != 47) {
                switch (b11) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b11) {
                            case 42:
                            case 43:
                                this.f49436y = false;
                                break;
                        }
                }
            }
            this.f49436y = true;
        }
    }

    private void K() {
        this.f49426o.j(this.f49429r);
        this.f49425n.clear();
        this.f49425n.add(this.f49426o);
    }

    private void L(int i10) {
        int i11 = this.f49429r;
        if (i11 == i10) {
            return;
        }
        this.f49429r = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f49425n.size(); i12++) {
                this.f49425n.get(i12).l(i10);
            }
            return;
        }
        K();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f49427p = Collections.emptyList();
        }
    }

    private void M(int i10) {
        this.f49430s = i10;
        this.f49426o.m(i10);
    }

    private boolean N() {
        return (this.f49424m == j.f46377b || this.f49437z == j.f46377b || i() - this.f49437z < this.f49424m) ? false : true;
    }

    private boolean O(byte b10) {
        if (y(b10)) {
            this.f49435x = p(b10);
        }
        return this.f49435x == this.f49423l;
    }

    private static char o(byte b10) {
        return (char) f49415h0[(b10 & 127) - 32];
    }

    private static int p(byte b10) {
        return (b10 >> 3) & 1;
    }

    private List<com.google.android.exoplayer2.text.b> q() {
        int size = this.f49425n.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            com.google.android.exoplayer2.text.b bVarG = this.f49425n.get(i10).g(Integer.MIN_VALUE);
            arrayList.add(bVarG);
            if (bVarG != null) {
                iMin = Math.min(iMin, bVarG.f49381j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.exoplayer2.text.b bVar = (com.google.android.exoplayer2.text.b) arrayList.get(i11);
            if (bVar != null) {
                if (bVar.f49381j != iMin) {
                    bVar = (com.google.android.exoplayer2.text.b) com.google.android.exoplayer2.util.a.g(this.f49425n.get(i11).g(iMin));
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    private static char r(byte b10) {
        return (char) f49417j0[b10 & 31];
    }

    private static char s(byte b10) {
        return (char) f49418k0[b10 & 31];
    }

    private static char t(byte b10, byte b11) {
        return (b10 & 1) == 0 ? r(b11) : s(b11);
    }

    private static char u(byte b10) {
        return (char) f49416i0[b10 & 15];
    }

    private void v(byte b10) {
        this.f49426o.e(' ');
        this.f49426o.p((b10 >> 1) & 7, (b10 & 1) == 1);
    }

    private void w(byte b10) {
        if (b10 == 32) {
            L(2);
            return;
        }
        if (b10 == 41) {
            L(3);
            return;
        }
        switch (b10) {
            case 37:
                L(1);
                M(2);
                break;
            case 38:
                L(1);
                M(3);
                break;
            case 39:
                L(1);
                M(4);
                break;
            default:
                int i10 = this.f49429r;
                if (i10 != 0) {
                    if (b10 != 33) {
                        switch (b10) {
                            case 44:
                                this.f49427p = Collections.emptyList();
                                int i11 = this.f49429r;
                                if (i11 == 1 || i11 == 3) {
                                    K();
                                }
                                break;
                            case 45:
                                if (i10 == 1 && !this.f49426o.i()) {
                                    this.f49426o.k();
                                    break;
                                }
                                break;
                            case 46:
                                K();
                                break;
                            case 47:
                                this.f49427p = q();
                                K();
                                break;
                        }
                    } else {
                        this.f49426o.f();
                        break;
                    }
                }
                break;
        }
    }

    private void x(byte b10, byte b11) {
        int i10 = N[b10 & 7];
        if ((b11 & 32) != 0) {
            i10++;
        }
        if (i10 != this.f49426o.f49443d) {
            if (this.f49429r != 1 && !this.f49426o.i()) {
                C0391a c0391a = new C0391a(this.f49429r, this.f49430s);
                this.f49426o = c0391a;
                this.f49425n.add(c0391a);
            }
            this.f49426o.f49443d = i10;
        }
        boolean z10 = (b11 & 16) == 16;
        boolean z11 = (b11 & 1) == 1;
        int i11 = (b11 >> 1) & 7;
        this.f49426o.p(z10 ? 8 : i11, z11);
        if (z10) {
            this.f49426o.f49444e = O[i11];
        }
    }

    private static boolean y(byte b10) {
        return (b10 & 224) == 0;
    }

    private static boolean z(byte b10, byte b11) {
        return (b10 & 246) == 18 && (b11 & 224) == 32;
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.text.h
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    protected com.google.android.exoplayer2.text.g d() {
        List<com.google.android.exoplayer2.text.b> list = this.f49427p;
        this.f49428q = list;
        return new f((List) com.google.android.exoplayer2.util.a.g(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // com.google.android.exoplayer2.text.cea.e
    protected void e(k kVar) {
        boolean z10;
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(kVar.f44488e);
        this.f49420i.Q(byteBuffer.array(), byteBuffer.limit());
        boolean z11 = false;
        while (true) {
            int iA = this.f49420i.a();
            int i10 = this.f49421j;
            if (iA < i10) {
                break;
            }
            byte bG = i10 == 2 ? T : (byte) this.f49420i.G();
            int iG = this.f49420i.G();
            int iG2 = this.f49420i.G();
            if ((bG & 2) == 0 && (bG & 1) == this.f49422k) {
                byte b10 = (byte) (iG & 127);
                byte b11 = (byte) (iG2 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f49431t;
                    if ((bG & 4) == 4) {
                        boolean[] zArr = f49419l0;
                        if (zArr[iG] && zArr[iG2]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f49431t = z10;
                    if (!E(z10, b10, b11)) {
                        if (this.f49431t) {
                            J(b10, b11);
                            if (this.f49436y && O(b10)) {
                                if (!y(b10)) {
                                    this.f49426o.e(o(b10));
                                    if ((b11 & 224) != 0) {
                                        this.f49426o.e(o(b11));
                                    }
                                } else if (G(b10, b11)) {
                                    this.f49426o.e(u(b11));
                                } else if (z(b10, b11)) {
                                    this.f49426o.f();
                                    this.f49426o.e(t(b10, b11));
                                } else if (A(b10, b11)) {
                                    v(b11);
                                } else if (C(b10, b11)) {
                                    x(b10, b11);
                                } else if (H(b10, b11)) {
                                    this.f49426o.f49445f = b11 - 32;
                                } else if (B(b10, b11)) {
                                    w(b11);
                                }
                                z11 = true;
                            }
                        } else if (z12) {
                            K();
                            z11 = true;
                        }
                    }
                }
            }
        }
        if (z11) {
            int i11 = this.f49429r;
            if (i11 == 1 || i11 == 3) {
                this.f49427p = q();
                this.f49437z = i();
            }
        }
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    @p0
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ k a() throws SubtitleDecoderException {
        return super.a();
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.f
    public void flush() {
        super.flush();
        this.f49427p = null;
        this.f49428q = null;
        L(0);
        M(4);
        K();
        this.f49431t = false;
        this.f49432u = false;
        this.f49433v = (byte) 0;
        this.f49434w = (byte) 0;
        this.f49435x = 0;
        this.f49436y = true;
        this.f49437z = j.f46377b;
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.f
    @p0
    /* JADX INFO: renamed from: g */
    public l dequeueOutputBuffer() throws SubtitleDecoderException {
        l lVarH;
        l lVarDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (lVarDequeueOutputBuffer != null) {
            return lVarDequeueOutputBuffer;
        }
        if (!N() || (lVarH = h()) == null) {
            return null;
        }
        this.f49427p = Collections.emptyList();
        this.f49437z = j.f46377b;
        lVarH.o(i(), d(), Long.MAX_VALUE);
        return lVarH;
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.f
    public String getName() {
        return B;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    protected boolean j() {
        return this.f49427p != this.f49428q;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void c(k kVar) throws SubtitleDecoderException {
        super.c(kVar);
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.f
    public void release() {
    }
}
