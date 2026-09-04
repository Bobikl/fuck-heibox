package com.google.android.exoplayer2.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.j;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u;
import com.google.android.exoplayer2.util.u0;
import java.util.List;

/* JADX INFO: compiled from: Tx3gDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends f {
    private static final String A = "Serif";
    private static final int B = 8;
    private static final int C = 2;
    private static final int D = 2;
    private static final int E = 12;
    private static final int F = 1;
    private static final int G = 2;
    private static final int H = 4;
    private static final int I = 16711680;
    private static final int J = 0;
    private static final int K = 0;
    private static final int L = -1;
    private static final String M = "sans-serif";
    private static final float N = 0.85f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f49876v = "Tx3gDecoder";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final char f49877w = 65279;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final char f49878x = 65534;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f49879y = 1937013100;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f49880z = 1952608120;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0 f49881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f49882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f49883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f49884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final String f49885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f49886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final int f49887u;

    public a(List<byte[]> list) {
        super(f49876v);
        this.f49881o = new e0();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f49883q = 0;
            this.f49884r = -1;
            this.f49885s = "sans-serif";
            this.f49882p = false;
            this.f49886t = 0.85f;
            this.f49887u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f49883q = bArr[24];
        this.f49884r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f49885s = A.equals(u0.J(bArr, 43, bArr.length - 43)) ? j.f46441r : "sans-serif";
        int i10 = bArr[25] * com.google.common.base.a.f56671x;
        this.f49887u = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.f49882p = z10;
        if (z10) {
            this.f49886t = u0.r(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.0f, 0.95f);
        } else {
            this.f49886t = 0.85f;
        }
    }

    private void A(e0 e0Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        int length;
        B(e0Var.a() >= 12);
        int iM = e0Var.M();
        int iM2 = e0Var.M();
        e0Var.T(2);
        int iG = e0Var.G();
        e0Var.T(1);
        int iO = e0Var.o();
        if (iM2 > spannableStringBuilder.length()) {
            int length2 = spannableStringBuilder.length();
            StringBuilder sb2 = new StringBuilder(68);
            sb2.append("Truncating styl end (");
            sb2.append(iM2);
            sb2.append(") to cueText.length() (");
            sb2.append(length2);
            sb2.append(").");
            u.m(f49876v, sb2.toString());
            length = spannableStringBuilder.length();
        } else {
            length = iM2;
        }
        if (iM < length) {
            int i10 = length;
            D(spannableStringBuilder, iG, this.f49883q, iM, i10, 0);
            C(spannableStringBuilder, iO, this.f49884r, iM, i10, 0);
            return;
        }
        StringBuilder sb3 = new StringBuilder(60);
        sb3.append("Ignoring styl with start (");
        sb3.append(iM);
        sb3.append(") >= end (");
        sb3.append(length);
        sb3.append(").");
        u.m(f49876v, sb3.toString());
    }

    private static void B(boolean z10) throws SubtitleDecoderException {
        if (!z10) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void C(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void D(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = (i10 & 1) != 0;
            boolean z11 = (i10 & 2) != 0;
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            boolean z12 = (i10 & 4) != 0;
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (z12 || z10 || z11) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
        }
    }

    private static void E(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String F(e0 e0Var) throws SubtitleDecoderException {
        char cG;
        B(e0Var.a() >= 2);
        int iM = e0Var.M();
        if (iM == 0) {
            return "";
        }
        return (e0Var.a() < 2 || !((cG = e0Var.g()) == 65279 || cG == 65534)) ? e0Var.E(iM, com.google.common.base.c.f56721c) : e0Var.E(iM, com.google.common.base.c.f56724f);
    }

    @Override // com.google.android.exoplayer2.text.f
    protected g y(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f49881o.Q(bArr, i10);
        String strF = F(this.f49881o);
        if (strF.isEmpty()) {
            return b.f49888c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strF);
        D(spannableStringBuilder, this.f49883q, 0, 0, spannableStringBuilder.length(), I);
        C(spannableStringBuilder, this.f49884r, -1, 0, spannableStringBuilder.length(), I);
        E(spannableStringBuilder, this.f49885s, 0, spannableStringBuilder.length());
        float fR = this.f49886t;
        while (this.f49881o.a() >= 8) {
            int iE = this.f49881o.e();
            int iO = this.f49881o.o();
            int iO2 = this.f49881o.o();
            if (iO2 == f49879y) {
                B(this.f49881o.a() >= 2);
                int iM = this.f49881o.M();
                for (int i11 = 0; i11 < iM; i11++) {
                    A(this.f49881o, spannableStringBuilder);
                }
            } else if (iO2 == f49880z && this.f49882p) {
                B(this.f49881o.a() >= 2);
                fR = u0.r(this.f49881o.M() / this.f49887u, 0.0f, 0.95f);
            }
            this.f49881o.S(iE + iO);
        }
        return new b(new com.google.android.exoplayer2.text.b.c().A(spannableStringBuilder).t(fR, 0).u(0).a());
    }
}
