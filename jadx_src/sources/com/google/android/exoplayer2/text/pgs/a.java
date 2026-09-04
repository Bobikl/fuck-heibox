package com.google.android.exoplayer2.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.p0;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.text.f;
import com.google.android.exoplayer2.text.g;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: PgsDecoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f49666s = 20;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f49667t = 21;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f49668u = 22;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f49669v = 128;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte f49670w = 120;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e0 f49671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e0 f49672p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final C0395a f49673q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private Inflater f49674r;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.text.pgs.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PgsDecoder.java */
    public static final class C0395a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e0 f49675a = new e0();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f49676b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f49677c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f49678d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f49679e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f49680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f49681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f49682h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f49683i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(e0 e0Var, int i10) {
            int iJ;
            if (i10 < 4) {
                return;
            }
            e0Var.T(3);
            int i11 = i10 - 4;
            if ((e0Var.G() & 128) != 0) {
                if (i11 < 7 || (iJ = e0Var.J()) < 4) {
                    return;
                }
                this.f49682h = e0Var.M();
                this.f49683i = e0Var.M();
                this.f49675a.O(iJ - 4);
                i11 -= 7;
            }
            int iE = this.f49675a.e();
            int iF = this.f49675a.f();
            if (iE >= iF || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iF - iE);
            e0Var.k(this.f49675a.d(), iE, iMin);
            this.f49675a.S(iE + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(e0 e0Var, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f49678d = e0Var.M();
            this.f49679e = e0Var.M();
            e0Var.T(11);
            this.f49680f = e0Var.M();
            this.f49681g = e0Var.M();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(e0 e0Var, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            e0Var.T(2);
            Arrays.fill(this.f49676b, 0);
            int i11 = i10 / 5;
            int i12 = 0;
            while (i12 < i11) {
                int iG = e0Var.G();
                int iG2 = e0Var.G();
                int iG3 = e0Var.G();
                int iG4 = e0Var.G();
                int iG5 = e0Var.G();
                double d10 = iG2;
                double d11 = iG3 + n5.a.f132012g;
                int i13 = (int) ((1.402d * d11) + d10);
                int i14 = i12;
                double d12 = iG4 + n5.a.f132012g;
                this.f49676b[iG] = u0.s((int) (d10 + (d12 * 1.772d)), 0, 255) | (u0.s((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (iG5 << 24) | (u0.s(i13, 0, 255) << 16);
                i12 = i14 + 1;
            }
            this.f49677c = true;
        }

        @p0
        public com.google.android.exoplayer2.text.b d() {
            int iG;
            if (this.f49678d == 0 || this.f49679e == 0 || this.f49682h == 0 || this.f49683i == 0 || this.f49675a.f() == 0 || this.f49675a.e() != this.f49675a.f() || !this.f49677c) {
                return null;
            }
            this.f49675a.S(0);
            int i10 = this.f49682h * this.f49683i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iG2 = this.f49675a.G();
                if (iG2 != 0) {
                    iG = i11 + 1;
                    iArr[i11] = this.f49676b[iG2];
                } else {
                    int iG3 = this.f49675a.G();
                    if (iG3 != 0) {
                        iG = ((iG3 & 64) == 0 ? iG3 & 63 : ((iG3 & 63) << 8) | this.f49675a.G()) + i11;
                        Arrays.fill(iArr, i11, iG, (iG3 & 128) == 0 ? 0 : this.f49676b[this.f49675a.G()]);
                    }
                }
                i11 = iG;
            }
            return new com.google.android.exoplayer2.text.b.c().r(Bitmap.createBitmap(iArr, this.f49682h, this.f49683i, Bitmap.Config.ARGB_8888)).w(this.f49680f / this.f49678d).x(0).t(this.f49681g / this.f49679e, 0).u(0).z(this.f49682h / this.f49678d).s(this.f49683i / this.f49679e).a();
        }

        public void h() {
            this.f49678d = 0;
            this.f49679e = 0;
            this.f49680f = 0;
            this.f49681g = 0;
            this.f49682h = 0;
            this.f49683i = 0;
            this.f49675a.O(0);
            this.f49677c = false;
        }
    }

    public a() {
        super("PgsDecoder");
        this.f49671o = new e0();
        this.f49672p = new e0();
        this.f49673q = new C0395a();
    }

    private void A(e0 e0Var) {
        if (e0Var.a() <= 0 || e0Var.h() != 120) {
            return;
        }
        if (this.f49674r == null) {
            this.f49674r = new Inflater();
        }
        if (u0.E0(e0Var, this.f49672p, this.f49674r)) {
            e0Var.Q(this.f49672p.d(), this.f49672p.f());
        }
    }

    @p0
    private static com.google.android.exoplayer2.text.b B(e0 e0Var, C0395a c0395a) {
        int iF = e0Var.f();
        int iG = e0Var.G();
        int iM = e0Var.M();
        int iE = e0Var.e() + iM;
        com.google.android.exoplayer2.text.b bVarD = null;
        if (iE > iF) {
            e0Var.S(iF);
            return null;
        }
        if (iG != 128) {
            switch (iG) {
                case 20:
                    c0395a.g(e0Var, iM);
                    break;
                case 21:
                    c0395a.e(e0Var, iM);
                    break;
                case 22:
                    c0395a.f(e0Var, iM);
                    break;
            }
        } else {
            bVarD = c0395a.d();
            c0395a.h();
        }
        e0Var.S(iE);
        return bVarD;
    }

    @Override // com.google.android.exoplayer2.text.f
    protected g y(byte[] bArr, int i10, boolean z10) throws SubtitleDecoderException {
        this.f49671o.Q(bArr, i10);
        A(this.f49671o);
        this.f49673q.h();
        ArrayList arrayList = new ArrayList();
        while (this.f49671o.a() >= 3) {
            com.google.android.exoplayer2.text.b bVarB = B(this.f49671o, this.f49673q);
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
        }
        return new b(Collections.unmodifiableList(arrayList));
    }
}
