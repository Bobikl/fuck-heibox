package com.google.android.exoplayer2.extractor.ogg;

import androidx.annotation.p0;
import com.google.android.exoplayer2.extractor.b0;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.r;
import com.google.android.exoplayer2.extractor.s;
import com.google.android.exoplayer2.extractor.t;
import com.google.android.exoplayer2.extractor.u;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.u0;
import java.util.Arrays;

/* JADX INFO: compiled from: FlacReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends i {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final byte f45616t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f45617u = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private u f45618r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @p0
    private a f45619s;

    /* JADX INFO: compiled from: FlacReader.java */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f45620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u.a f45621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f45622c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f45623d = -1;

        public a(u uVar, u.a aVar) {
            this.f45620a = uVar;
            this.f45621b = aVar;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.g
        public long a(l lVar) {
            long j10 = this.f45623d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f45623d = -1L;
            return j11;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.g
        public b0 b() {
            com.google.android.exoplayer2.util.a.i(this.f45622c != -1);
            return new t(this.f45620a, this.f45622c);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.g
        public void c(long j10) {
            long[] jArr = this.f45621b.f46205a;
            this.f45623d = jArr[u0.j(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f45622c = j10;
        }
    }

    b() {
    }

    private int n(e0 e0Var) {
        int i10 = (e0Var.d()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            e0Var.T(4);
            e0Var.N();
        }
        int iJ = r.j(e0Var, i10);
        e0Var.S(0);
        return iJ;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(e0 e0Var) {
        return e0Var.a() >= 5 && e0Var.G() == 127 && e0Var.I() == 1179402563;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected long f(e0 e0Var) {
        if (o(e0Var.d())) {
            return n(e0Var);
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    @mk.e(expression = {"#3.format"}, result = false)
    protected boolean i(e0 e0Var, long j10, i.b bVar) {
        byte[] bArrD = e0Var.d();
        u uVar = this.f45618r;
        if (uVar == null) {
            u uVar2 = new u(bArrD, 17);
            this.f45618r = uVar2;
            bVar.f45671a = uVar2.i(Arrays.copyOfRange(bArrD, 9, e0Var.f()), null);
            return true;
        }
        if ((bArrD[0] & 127) == 3) {
            u.a aVarH = s.h(e0Var);
            u uVarC = uVar.c(aVarH);
            this.f45618r = uVarC;
            this.f45619s = new a(uVarC, aVarH);
            return true;
        }
        if (!o(bArrD)) {
            return true;
        }
        a aVar = this.f45619s;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f45672b = this.f45619s;
        }
        com.google.android.exoplayer2.util.a.g(bVar.f45671a);
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ogg.i
    protected void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f45618r = null;
            this.f45619s = null;
        }
    }
}
