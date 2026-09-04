package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.extractor.h0;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: VorbisReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class j extends i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private a f45673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f45674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f45675t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @p0
    private h0.d f45676u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private h0.b f45677v;

    /* JADX INFO: compiled from: VorbisReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h0.d f45678a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h0.b f45679b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f45680c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h0.c[] f45681d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f45682e;

        public a(h0.d dVar, h0.b bVar, byte[] bArr, h0.c[] cVarArr, int i10) {
            this.f45678a = dVar;
            this.f45679b = bVar;
            this.f45680c = bArr;
            this.f45681d = cVarArr;
            this.f45682e = i10;
        }
    }

    j() {
    }

    @j1
    static void n(e0 e0Var, long j10) {
        if (e0Var.b() < e0Var.f() + 4) {
            e0Var.P(Arrays.copyOf(e0Var.d(), e0Var.f() + 4));
        } else {
            e0Var.R(e0Var.f() + 4);
        }
        byte[] bArrD = e0Var.d();
        bArrD[e0Var.f() - 4] = (byte) (j10 & 255);
        bArrD[e0Var.f() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrD[e0Var.f() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrD[e0Var.f() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    private static int o(byte b10, a aVar) {
        return !aVar.f45681d[p(b10, aVar.f45682e, 1)].f45027a ? aVar.f45678a.f45037g : aVar.f45678a.f45038h;
    }

    @j1
    static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(e0 e0Var) {
        try {
            return h0.l(1, e0Var, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected void e(long j10) {
        super.e(j10);
        this.f45675t = j10 != 0;
        h0.d dVar = this.f45676u;
        this.f45674s = dVar != null ? dVar.f45037g : 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected long f(e0 e0Var) {
        if ((e0Var.d()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(e0Var.d()[0], (a) com.google.android.exoplayer2.util.a.k(this.f45673r));
        long j10 = this.f45675t ? (this.f45674s + iO) / 4 : 0;
        n(e0Var, j10);
        this.f45675t = true;
        this.f45674s = iO;
        return j10;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    @mk.e(expression = {"#3.format"}, result = false)
    protected boolean i(e0 e0Var, long j10, i.b bVar) throws IOException {
        if (this.f45673r != null) {
            com.google.android.exoplayer2.util.a.g(bVar.f45671a);
            return false;
        }
        a aVarQ = q(e0Var);
        this.f45673r = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        h0.d dVar = aVarQ.f45678a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f45040j);
        arrayList.add(aVarQ.f45680c);
        bVar.f45671a = new a2.b().e0(y.U).G(dVar.f45035e).Z(dVar.f45034d).H(dVar.f45032b).f0(dVar.f45033c).T(arrayList).E();
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f45673r = null;
            this.f45676u = null;
            this.f45677v = null;
        }
        this.f45674s = 0;
        this.f45675t = false;
    }

    @j1
    @p0
    a q(e0 e0Var) throws IOException {
        h0.d dVar = this.f45676u;
        if (dVar == null) {
            this.f45676u = h0.j(e0Var);
            return null;
        }
        h0.b bVar = this.f45677v;
        if (bVar == null) {
            this.f45677v = h0.h(e0Var);
            return null;
        }
        byte[] bArr = new byte[e0Var.f()];
        System.arraycopy(e0Var.d(), 0, bArr, 0, e0Var.f());
        h0.c[] cVarArrK = h0.k(e0Var, dVar.f45032b);
        return new a(dVar, bVar, bArr, cVarArrK, h0.a(cVarArrK.length - 1));
    }
}
