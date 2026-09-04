package com.google.android.exoplayer2.text.cea;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.p0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.k;
import com.google.android.exoplayer2.text.l;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.text.y;
import mk.m;
import okio.Utf8;

/* JADX INFO: compiled from: Cea708Decoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c extends e {
    private static final int A = 159;
    private static final int A0 = 49;
    private static final int B = 255;
    private static final int B0 = 50;
    private static final int C = 31;
    private static final int C0 = 51;
    private static final int D = 127;
    private static final int D0 = 52;
    private static final int E = 159;
    private static final int E0 = 53;
    private static final int F = 255;
    private static final int F0 = 57;
    private static final int G = 0;
    private static final int G0 = 58;
    private static final int H = 3;
    private static final int H0 = 60;
    private static final int I = 8;
    private static final int I0 = 61;
    private static final int J = 12;
    private static final int J0 = 63;
    private static final int K = 13;
    private static final int K0 = 118;
    private static final int L = 14;
    private static final int L0 = 119;
    private static final int M = 16;
    private static final int M0 = 120;
    private static final int N = 17;
    private static final int N0 = 121;
    private static final int O = 23;
    private static final int O0 = 122;
    private static final int P = 24;
    private static final int P0 = 123;
    private static final int Q = 31;
    private static final int Q0 = 124;
    private static final int R = 128;
    private static final int R0 = 125;
    private static final int S = 129;
    private static final int S0 = 126;
    private static final int T = 130;
    private static final int T0 = 127;
    private static final int U = 131;
    private static final int V = 132;
    private static final int W = 133;
    private static final int X = 134;
    private static final int Y = 135;
    private static final int Z = 136;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f49451a0 = 137;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final int f49452b0 = 138;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final int f49453c0 = 139;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final int f49454d0 = 140;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final int f49455e0 = 141;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final int f49456f0 = 142;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final int f49457g0 = 143;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final int f49458h0 = 144;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final int f49459i0 = 145;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final int f49460j0 = 146;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final int f49461k0 = 151;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final int f49462l0 = 152;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final int f49463m0 = 153;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final int f49464n0 = 154;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final int f49465o0 = 155;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f49466p0 = 156;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final int f49467q0 = 157;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final int f49468r0 = 158;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final int f49469s0 = 159;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f49470t = "Cea708Decoder";

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final int f49471t0 = 127;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f49472u = 8;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final int f49473u0 = 32;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f49474v = 2;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final int f49475v0 = 33;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f49476w = 3;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final int f49477w0 = 37;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f49478x = 4;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final int f49479x0 = 42;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f49480y = 31;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final int f49481y0 = 44;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f49482z = 127;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final int f49483z0 = 48;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final e0 f49484i = new e0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d0 f49485j = new d0();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f49486k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f49487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f49488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b[] f49489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private b f49490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @p0
    private List<com.google.android.exoplayer2.text.b> f49491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private List<com.google.android.exoplayer2.text.b> f49492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private C0393c f49493r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f49494s;

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f49495c = new Comparator() { // from class: com.google.android.exoplayer2.text.cea.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c.a.c((c.a) obj, (c.a) obj2);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.text.b f49496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49497b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
            com.google.android.exoplayer2.text.b.c cVarZ = new com.google.android.exoplayer2.text.b.c().A(charSequence).B(alignment).t(f10, i10).u(i11).w(f11).x(i12).z(f12);
            if (z10) {
                cVarZ.E(i13);
            }
            this.f49496a = cVarZ.a();
            this.f49497b = i14;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int c(a aVar, a aVar2) {
            return Integer.compare(aVar2.f49497b, aVar.f49497b);
        }
    }

    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class b {
        private static final int A = 15;
        private static final int B = 0;
        private static final int C = 1;
        private static final int D = 2;
        private static final int E = 3;
        private static final int F = 0;
        private static final int G = 1;
        private static final int H = 2;
        private static final int I = 3;
        private static final int J = 0;
        private static final int K = 3;
        public static final int L = h(2, 2, 2, 0);
        public static final int M;
        public static final int N;
        private static final int O = 1;
        private static final int P = 0;
        private static final int Q = 1;
        private static final int R = 2;
        private static final int S = 3;
        private static final int T = 4;
        private static final int U = 1;
        private static final int[] V;
        private static final int[] W;
        private static final int[] X;
        private static final boolean[] Y;
        private static final int[] Z;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        private static final int[] f49498a0;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        private static final int[] f49499b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        private static final int[] f49500c0;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f49501w = 99;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f49502x = 74;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f49503y = 209;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f49504z = 4;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f49505a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f49506b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f49507c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f49508d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49509e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f49510f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49511g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f49512h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49513i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f49514j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f49515k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f49516l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f49517m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f49518n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f49519o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f49520p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f49521q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f49522r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f49523s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f49524t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f49525u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f49526v;

        static {
            int iH = h(0, 0, 0, 0);
            M = iH;
            int iH2 = h(0, 0, 0, 3);
            N = iH2;
            V = new int[]{0, 0, 0, 0, 0, 2, 0};
            W = new int[]{0, 0, 0, 0, 0, 0, 2};
            X = new int[]{3, 3, 3, 3, 3, 3, 1};
            Y = new boolean[]{false, false, false, true, true, true, false};
            Z = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            f49498a0 = new int[]{0, 1, 2, 3, 4, 3, 4};
            f49499b0 = new int[]{0, 0, 0, 0, 0, 3, 3};
            f49500c0 = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i10, int i11, int i12) {
            return h(i10, i11, i12, 0);
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0021  */
        public static int h(int i10, int i11, int i12, int i13) {
            int i14;
            com.google.android.exoplayer2.util.a.c(i10, 0, 4);
            com.google.android.exoplayer2.util.a.c(i11, 0, 4);
            com.google.android.exoplayer2.util.a.c(i12, 0, 4);
            com.google.android.exoplayer2.util.a.c(i13, 0, 4);
            if (i13 == 0 || i13 == 1) {
                i14 = 255;
            } else if (i13 == 2) {
                i14 = 127;
            } else if (i13 != 3) {
                i14 = 255;
            } else {
                i14 = 0;
            }
            return Color.argb(i14, i10 > 1 ? 255 : 0, i11 > 1 ? 255 : 0, i12 > 1 ? 255 : 0);
        }

        public void a(char c10) {
            if (c10 != '\n') {
                this.f49506b.append(c10);
                return;
            }
            this.f49505a.add(d());
            this.f49506b.clear();
            if (this.f49520p != -1) {
                this.f49520p = 0;
            }
            if (this.f49521q != -1) {
                this.f49521q = 0;
            }
            if (this.f49522r != -1) {
                this.f49522r = 0;
            }
            if (this.f49524t != -1) {
                this.f49524t = 0;
            }
            while (true) {
                if ((!this.f49515k || this.f49505a.size() < this.f49514j) && this.f49505a.size() < 15) {
                    return;
                } else {
                    this.f49505a.remove(0);
                }
            }
        }

        public void b() {
            int length = this.f49506b.length();
            if (length > 0) {
                this.f49506b.delete(length - 1, length);
            }
        }

        @p0
        public a c() {
            Layout.Alignment alignment;
            float f10;
            float f11;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i10 = 0; i10 < this.f49505a.size(); i10++) {
                spannableStringBuilder.append((CharSequence) this.f49505a.get(i10));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i11 = this.f49516l;
            if (i11 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    int i12 = this.f49516l;
                    StringBuilder sb2 = new StringBuilder(43);
                    sb2.append("Unexpected justification value: ");
                    sb2.append(i12);
                    throw new IllegalArgumentException(sb2.toString());
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            Layout.Alignment alignment2 = alignment;
            if (this.f49510f) {
                f10 = this.f49512h / 99.0f;
                f11 = this.f49511g / 99.0f;
            } else {
                f10 = this.f49512h / 209.0f;
                f11 = this.f49511g / 74.0f;
            }
            float f12 = (f10 * 0.9f) + 0.05f;
            float f13 = (f11 * 0.9f) + 0.05f;
            int i13 = this.f49513i;
            return new a(spannableStringBuilder, alignment2, f13, 0, i13 / 3 == 0 ? 0 : i13 / 3 == 1 ? 1 : 2, f12, i13 % 3 == 0 ? 0 : i13 % 3 == 1 ? 1 : 2, -3.4028235E38f, this.f49519o != M, this.f49519o, this.f49509e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f49506b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f49520p != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f49520p, length, 33);
                }
                if (this.f49521q != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f49521q, length, 33);
                }
                if (this.f49522r != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f49523s), this.f49522r, length, 33);
                }
                if (this.f49524t != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f49525u), this.f49524t, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f49505a.clear();
            this.f49506b.clear();
            this.f49520p = -1;
            this.f49521q = -1;
            this.f49522r = -1;
            this.f49524t = -1;
            this.f49526v = 0;
        }

        public void f(boolean z10, boolean z11, boolean z12, int i10, boolean z13, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f49507c = true;
            this.f49508d = z10;
            this.f49515k = z11;
            this.f49509e = i10;
            this.f49510f = z13;
            this.f49511g = i11;
            this.f49512h = i12;
            this.f49513i = i15;
            int i18 = i13 + 1;
            if (this.f49514j != i18) {
                this.f49514j = i18;
                while (true) {
                    if ((!z11 || this.f49505a.size() < this.f49514j) && this.f49505a.size() < 15) {
                        break;
                    } else {
                        this.f49505a.remove(0);
                    }
                }
            }
            if (i16 != 0 && this.f49517m != i16) {
                this.f49517m = i16;
                int i19 = i16 - 1;
                q(Z[i19], N, Y[i19], 0, W[i19], X[i19], V[i19]);
            }
            if (i17 == 0 || this.f49518n == i17) {
                return;
            }
            this.f49518n = i17;
            int i20 = i17 - 1;
            m(0, 1, 1, false, false, f49499b0[i20], f49498a0[i20]);
            n(L, f49500c0[i20], M);
        }

        public boolean i() {
            return this.f49507c;
        }

        public boolean j() {
            return !i() || (this.f49505a.isEmpty() && this.f49506b.length() == 0);
        }

        public boolean k() {
            return this.f49508d;
        }

        public void l() {
            e();
            this.f49507c = false;
            this.f49508d = false;
            this.f49509e = 4;
            this.f49510f = false;
            this.f49511g = 0;
            this.f49512h = 0;
            this.f49513i = 0;
            this.f49514j = 15;
            this.f49515k = true;
            this.f49516l = 0;
            this.f49517m = 0;
            this.f49518n = 0;
            int i10 = M;
            this.f49519o = i10;
            this.f49523s = L;
            this.f49525u = i10;
        }

        public void m(int i10, int i11, int i12, boolean z10, boolean z11, int i13, int i14) {
            if (this.f49520p != -1) {
                if (!z10) {
                    this.f49506b.setSpan(new StyleSpan(2), this.f49520p, this.f49506b.length(), 33);
                    this.f49520p = -1;
                }
            } else if (z10) {
                this.f49520p = this.f49506b.length();
            }
            if (this.f49521q == -1) {
                if (z11) {
                    this.f49521q = this.f49506b.length();
                }
            } else {
                if (z11) {
                    return;
                }
                this.f49506b.setSpan(new UnderlineSpan(), this.f49521q, this.f49506b.length(), 33);
                this.f49521q = -1;
            }
        }

        public void n(int i10, int i11, int i12) {
            if (this.f49522r != -1 && this.f49523s != i10) {
                this.f49506b.setSpan(new ForegroundColorSpan(this.f49523s), this.f49522r, this.f49506b.length(), 33);
            }
            if (i10 != L) {
                this.f49522r = this.f49506b.length();
                this.f49523s = i10;
            }
            if (this.f49524t != -1 && this.f49525u != i11) {
                this.f49506b.setSpan(new BackgroundColorSpan(this.f49525u), this.f49524t, this.f49506b.length(), 33);
            }
            if (i11 != M) {
                this.f49524t = this.f49506b.length();
                this.f49525u = i11;
            }
        }

        public void o(int i10, int i11) {
            if (this.f49526v != i10) {
                a('\n');
            }
            this.f49526v = i10;
        }

        public void p(boolean z10) {
            this.f49508d = z10;
        }

        public void q(int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
            this.f49519o = i10;
            this.f49516l = i15;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.cea.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cea708Decoder.java */
    public static final class C0393c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f49527a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f49528b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f49529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f49530d = 0;

        public C0393c(int i10, int i11) {
            this.f49527a = i10;
            this.f49528b = i11;
            this.f49529c = new byte[(i11 * 2) - 1];
        }
    }

    public c(int i10, @p0 List<byte[]> list) {
        this.f49488m = i10 == -1 ? 1 : i10;
        this.f49487l = list != null && com.google.android.exoplayer2.util.f.h(list);
        this.f49489n = new b[8];
        for (int i11 = 0; i11 < 8; i11++) {
            this.f49489n[i11] = new b();
        }
        this.f49490o = this.f49489n[0];
    }

    private void A() {
        this.f49485j.s(4);
        int iH = this.f49485j.h(4);
        this.f49485j.s(2);
        this.f49490o.o(iH, this.f49485j.h(6));
    }

    private void B() {
        int iH = b.h(this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2));
        int iH2 = this.f49485j.h(2);
        int iG = b.g(this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2));
        if (this.f49485j.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f49485j.g();
        int iH3 = this.f49485j.h(2);
        int iH4 = this.f49485j.h(2);
        int iH5 = this.f49485j.h(2);
        this.f49485j.s(8);
        this.f49490o.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    @m({"currentDtvCcPacket"})
    private void C() {
        C0393c c0393c = this.f49493r;
        int i10 = c0393c.f49530d;
        int i11 = c0393c.f49528b;
        if (i10 != (i11 * 2) - 1) {
            int i12 = c0393c.f49527a;
            StringBuilder sb2 = new StringBuilder(115);
            sb2.append("DtvCcPacket ended prematurely; size is ");
            sb2.append((i11 * 2) - 1);
            sb2.append(", but current index is ");
            sb2.append(i10);
            sb2.append(" (sequence number ");
            sb2.append(i12);
            sb2.append(");");
            u.b(f49470t, sb2.toString());
        }
        d0 d0Var = this.f49485j;
        C0393c c0393c2 = this.f49493r;
        d0Var.p(c0393c2.f49529c, c0393c2.f49530d);
        int iH = this.f49485j.h(3);
        int iH2 = this.f49485j.h(5);
        if (iH == 7) {
            this.f49485j.s(2);
            iH = this.f49485j.h(6);
            if (iH < 7) {
                StringBuilder sb3 = new StringBuilder(44);
                sb3.append("Invalid extended service number: ");
                sb3.append(iH);
                u.m(f49470t, sb3.toString());
            }
        }
        if (iH2 == 0) {
            if (iH != 0) {
                StringBuilder sb4 = new StringBuilder(59);
                sb4.append("serviceNumber is non-zero (");
                sb4.append(iH);
                sb4.append(") when blockSize is 0");
                u.m(f49470t, sb4.toString());
                return;
            }
            return;
        }
        if (iH != this.f49488m) {
            return;
        }
        boolean z10 = false;
        while (this.f49485j.b() > 0) {
            int iH3 = this.f49485j.h(8);
            if (iH3 == 16) {
                int iH4 = this.f49485j.h(8);
                if (iH4 <= 31) {
                    r(iH4);
                } else {
                    if (iH4 <= 127) {
                        w(iH4);
                    } else if (iH4 <= 159) {
                        s(iH4);
                    } else if (iH4 <= 255) {
                        x(iH4);
                    } else {
                        StringBuilder sb5 = new StringBuilder(37);
                        sb5.append("Invalid extended command: ");
                        sb5.append(iH4);
                        u.m(f49470t, sb5.toString());
                    }
                    z10 = true;
                }
            } else if (iH3 <= 31) {
                p(iH3);
            } else {
                if (iH3 <= 127) {
                    u(iH3);
                } else if (iH3 <= 159) {
                    q(iH3);
                } else if (iH3 <= 255) {
                    v(iH3);
                } else {
                    StringBuilder sb6 = new StringBuilder(33);
                    sb6.append("Invalid base command: ");
                    sb6.append(iH3);
                    u.m(f49470t, sb6.toString());
                }
                z10 = true;
            }
        }
        if (z10) {
            this.f49491p = o();
        }
    }

    private void D() {
        for (int i10 = 0; i10 < 8; i10++) {
            this.f49489n[i10].l();
        }
    }

    private void n() {
        if (this.f49493r == null) {
            return;
        }
        C();
        this.f49493r = null;
    }

    private List<com.google.android.exoplayer2.text.b> o() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 8; i10++) {
            if (!this.f49489n[i10].j() && this.f49489n[i10].k() && (aVarC = this.f49489n[i10].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f49495c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            arrayList2.add(((a) arrayList.get(i11)).f49496a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void p(int i10) {
        if (i10 != 0) {
            if (i10 == 3) {
                this.f49491p = o();
            }
            if (i10 == 8) {
                this.f49490o.b();
                return;
            }
            switch (i10) {
                case 12:
                    D();
                    break;
                case 13:
                    this.f49490o.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i10 >= 17 && i10 <= 23) {
                        StringBuilder sb2 = new StringBuilder(55);
                        sb2.append("Currently unsupported COMMAND_EXT1 Command: ");
                        sb2.append(i10);
                        u.m(f49470t, sb2.toString());
                        this.f49485j.s(8);
                    } else if (i10 >= 24 && i10 <= 31) {
                        StringBuilder sb3 = new StringBuilder(54);
                        sb3.append("Currently unsupported COMMAND_P16 Command: ");
                        sb3.append(i10);
                        u.m(f49470t, sb3.toString());
                        this.f49485j.s(16);
                    } else {
                        StringBuilder sb4 = new StringBuilder(31);
                        sb4.append("Invalid C0 command: ");
                        sb4.append(i10);
                        u.m(f49470t, sb4.toString());
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void q(int i10) {
        int i11 = 1;
        switch (i10) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i12 = i10 + n5.a.f132012g;
                if (this.f49494s != i12) {
                    this.f49494s = i12;
                    this.f49490o = this.f49489n[i12];
                }
                break;
            case 136:
                while (i11 <= 8) {
                    if (this.f49485j.g()) {
                        this.f49489n[8 - i11].e();
                    }
                    i11++;
                }
                break;
            case 137:
                for (int i13 = 1; i13 <= 8; i13++) {
                    if (this.f49485j.g()) {
                        this.f49489n[8 - i13].p(true);
                    }
                }
                break;
            case 138:
                while (i11 <= 8) {
                    if (this.f49485j.g()) {
                        this.f49489n[8 - i11].p(false);
                    }
                    i11++;
                }
                break;
            case 139:
                for (int i14 = 1; i14 <= 8; i14++) {
                    if (this.f49485j.g()) {
                        b bVar = this.f49489n[8 - i14];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case 140:
                while (i11 <= 8) {
                    if (this.f49485j.g()) {
                        this.f49489n[8 - i11].l();
                    }
                    i11++;
                }
                break;
            case 141:
                this.f49485j.s(8);
                break;
            case 142:
                break;
            case 143:
                D();
                break;
            case 144:
                if (this.f49490o.i()) {
                    y();
                } else {
                    this.f49485j.s(16);
                }
                break;
            case 145:
                if (this.f49490o.i()) {
                    z();
                } else {
                    this.f49485j.s(24);
                }
                break;
            case 146:
                if (this.f49490o.i()) {
                    A();
                } else {
                    this.f49485j.s(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid C1 command: ");
                sb2.append(i10);
                u.m(f49470t, sb2.toString());
                break;
            case 151:
                if (this.f49490o.i()) {
                    B();
                } else {
                    this.f49485j.s(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
            case 158:
            case 159:
                int i15 = i10 - 152;
                t(i15);
                if (this.f49494s != i15) {
                    this.f49494s = i15;
                    this.f49490o = this.f49489n[i15];
                }
                break;
        }
    }

    private void r(int i10) {
        if (i10 <= 7) {
            return;
        }
        if (i10 <= 15) {
            this.f49485j.s(8);
        } else if (i10 <= 23) {
            this.f49485j.s(16);
        } else if (i10 <= 31) {
            this.f49485j.s(24);
        }
    }

    private void s(int i10) {
        if (i10 <= 135) {
            this.f49485j.s(32);
            return;
        }
        if (i10 <= 143) {
            this.f49485j.s(40);
        } else if (i10 <= 159) {
            this.f49485j.s(2);
            this.f49485j.s(this.f49485j.h(6) * 8);
        }
    }

    private void t(int i10) {
        b bVar = this.f49489n[i10];
        this.f49485j.s(2);
        boolean zG = this.f49485j.g();
        boolean zG2 = this.f49485j.g();
        boolean zG3 = this.f49485j.g();
        int iH = this.f49485j.h(3);
        boolean zG4 = this.f49485j.g();
        int iH2 = this.f49485j.h(7);
        int iH3 = this.f49485j.h(8);
        int iH4 = this.f49485j.h(4);
        int iH5 = this.f49485j.h(4);
        this.f49485j.s(2);
        int iH6 = this.f49485j.h(6);
        this.f49485j.s(2);
        bVar.f(zG, zG2, zG3, iH, zG4, iH2, iH3, iH5, iH6, iH4, this.f49485j.h(3), this.f49485j.h(3));
    }

    private void u(int i10) {
        if (i10 == 127) {
            this.f49490o.a((char) 9835);
        } else {
            this.f49490o.a((char) (i10 & 255));
        }
    }

    private void v(int i10) {
        this.f49490o.a((char) (i10 & 255));
    }

    private void w(int i10) {
        if (i10 == 32) {
            this.f49490o.a(' ');
        }
        if (i10 == 33) {
            this.f49490o.a(y.f128598g);
            return;
        }
        if (i10 == 37) {
            this.f49490o.a(y.F);
            return;
        }
        if (i10 == 42) {
            this.f49490o.a((char) 352);
            return;
        }
        if (i10 == 44) {
            this.f49490o.a((char) 338);
            return;
        }
        if (i10 == 63) {
            this.f49490o.a((char) 376);
            return;
        }
        if (i10 == 57) {
            this.f49490o.a(y.J);
            return;
        }
        if (i10 == 58) {
            this.f49490o.a((char) 353);
            return;
        }
        if (i10 == 60) {
            this.f49490o.a((char) 339);
            return;
        }
        if (i10 == 61) {
            this.f49490o.a((char) 8480);
            return;
        }
        switch (i10) {
            case 48:
                this.f49490o.a((char) 9608);
                break;
            case 49:
                this.f49490o.a(y.f128614w);
                break;
            case 50:
                this.f49490o.a(y.f128615x);
                break;
            case 51:
                this.f49490o.a(y.f128617z);
                break;
            case 52:
                this.f49490o.a(y.A);
                break;
            case 53:
                this.f49490o.a(y.E);
                break;
            default:
                switch (i10) {
                    case 118:
                        this.f49490o.a((char) 8539);
                        break;
                    case 119:
                        this.f49490o.a((char) 8540);
                        break;
                    case 120:
                        this.f49490o.a((char) 8541);
                        break;
                    case 121:
                        this.f49490o.a((char) 8542);
                        break;
                    case 122:
                        this.f49490o.a((char) 9474);
                        break;
                    case 123:
                        this.f49490o.a((char) 9488);
                        break;
                    case 124:
                        this.f49490o.a((char) 9492);
                        break;
                    case 125:
                        this.f49490o.a((char) 9472);
                        break;
                    case 126:
                        this.f49490o.a((char) 9496);
                        break;
                    case 127:
                        this.f49490o.a((char) 9484);
                        break;
                    default:
                        StringBuilder sb2 = new StringBuilder(33);
                        sb2.append("Invalid G2 character: ");
                        sb2.append(i10);
                        u.m(f49470t, sb2.toString());
                        break;
                }
                break;
        }
    }

    private void x(int i10) {
        if (i10 == 160) {
            this.f49490o.a((char) 13252);
            return;
        }
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("Invalid G3 character: ");
        sb2.append(i10);
        u.m(f49470t, sb2.toString());
        this.f49490o.a('_');
    }

    private void y() {
        this.f49490o.m(this.f49485j.h(4), this.f49485j.h(2), this.f49485j.h(2), this.f49485j.g(), this.f49485j.g(), this.f49485j.h(3), this.f49485j.h(3));
    }

    private void z() {
        int iH = b.h(this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2));
        int iH2 = b.h(this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2));
        this.f49485j.s(2);
        this.f49490o.n(iH, iH2, b.g(this.f49485j.h(2), this.f49485j.h(2), this.f49485j.h(2)));
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.text.h
    public /* bridge */ /* synthetic */ void b(long j10) {
        super.b(j10);
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    protected com.google.android.exoplayer2.text.g d() {
        List<com.google.android.exoplayer2.text.b> list = this.f49491p;
        this.f49492q = list;
        return new f((List) com.google.android.exoplayer2.util.a.g(list));
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    protected void e(k kVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.g(kVar.f44488e);
        this.f49484i.Q(byteBuffer.array(), byteBuffer.limit());
        while (this.f49484i.a() >= 3) {
            int iG = this.f49484i.G() & 7;
            int i10 = iG & 3;
            boolean z10 = (iG & 4) == 4;
            byte bG = (byte) this.f49484i.G();
            byte bG2 = (byte) this.f49484i.G();
            if (i10 == 2 || i10 == 3) {
                if (z10) {
                    if (i10 == 3) {
                        n();
                        int i11 = (bG & 192) >> 6;
                        int i12 = this.f49486k;
                        if (i12 != -1 && i11 != (i12 + 1) % 4) {
                            D();
                            int i13 = this.f49486k;
                            StringBuilder sb2 = new StringBuilder(71);
                            sb2.append("Sequence number discontinuity. previous=");
                            sb2.append(i13);
                            sb2.append(" current=");
                            sb2.append(i11);
                            u.m(f49470t, sb2.toString());
                        }
                        this.f49486k = i11;
                        int i14 = bG & Utf8.REPLACEMENT_BYTE;
                        if (i14 == 0) {
                            i14 = 64;
                        }
                        C0393c c0393c = new C0393c(i11, i14);
                        this.f49493r = c0393c;
                        byte[] bArr = c0393c.f49529c;
                        int i15 = c0393c.f49530d;
                        c0393c.f49530d = i15 + 1;
                        bArr[i15] = bG2;
                    } else {
                        com.google.android.exoplayer2.util.a.a(i10 == 2);
                        C0393c c0393c2 = this.f49493r;
                        if (c0393c2 == null) {
                            u.d(f49470t, "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c0393c2.f49529c;
                            int i16 = c0393c2.f49530d;
                            int i17 = i16 + 1;
                            bArr2[i16] = bG;
                            c0393c2.f49530d = i17 + 1;
                            bArr2[i17] = bG2;
                        }
                    }
                    C0393c c0393c3 = this.f49493r;
                    if (c0393c3.f49530d == (c0393c3.f49528b * 2) - 1) {
                        n();
                    }
                }
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
        this.f49491p = null;
        this.f49492q = null;
        this.f49494s = 0;
        this.f49490o = this.f49489n[0];
        D();
        this.f49493r = null;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    @p0
    /* JADX INFO: renamed from: g */
    public /* bridge */ /* synthetic */ l dequeueOutputBuffer() throws SubtitleDecoderException {
        return super.dequeueOutputBuffer();
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.f
    public String getName() {
        return f49470t;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    protected boolean j() {
        return this.f49491p != this.f49492q;
    }

    @Override // com.google.android.exoplayer2.text.cea.e
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ void c(k kVar) throws SubtitleDecoderException {
        super.c(kVar);
    }

    @Override // com.google.android.exoplayer2.text.cea.e, com.google.android.exoplayer2.decoder.f
    public /* bridge */ /* synthetic */ void release() {
        super.release();
    }
}
