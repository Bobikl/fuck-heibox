package com.google.android.exoplayer2.source.smoothstreaming;

import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.drm.u;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.chunk.i;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.e1;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.trackselection.j;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.u0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SsMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements c0, e1.a<i<c>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a f49053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private final u0 f49054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h0 f49055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f49056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s.a f49057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final g0 f49058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n0.a f49059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f49060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p1 f49061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.g f49062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @p0
    private c0.a f49063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.exoplayer2.source.smoothstreaming.manifest.a f49064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i<c>[] f49065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e1 f49066o;

    public d(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, c.a aVar2, @p0 u0 u0Var, com.google.android.exoplayer2.source.g gVar, u uVar, s.a aVar3, g0 g0Var, n0.a aVar4, h0 h0Var, com.google.android.exoplayer2.upstream.b bVar) {
        this.f49064m = aVar;
        this.f49053b = aVar2;
        this.f49054c = u0Var;
        this.f49055d = h0Var;
        this.f49056e = uVar;
        this.f49057f = aVar3;
        this.f49058g = g0Var;
        this.f49059h = aVar4;
        this.f49060i = bVar;
        this.f49062k = gVar;
        this.f49061j = m(aVar, uVar);
        i<c>[] iVarArrS = s(0);
        this.f49065n = iVarArrS;
        this.f49066o = gVar.a(iVarArrS);
    }

    private i<c> b(j jVar, long j10) {
        int iD = this.f49061j.d(jVar.h());
        return new i<>(this.f49064m.f49140f[iD].f49150a, null, null, this.f49053b.a(this.f49055d, this.f49064m, iD, jVar, this.f49054c), this, this.f49060i, j10, this.f49056e, this.f49057f, this.f49058g, this.f49059h);
    }

    private static p1 m(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, u uVar) {
        n1[] n1VarArr = new n1[aVar.f49140f.length];
        int i10 = 0;
        while (true) {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b[] bVarArr = aVar.f49140f;
            if (i10 >= bVarArr.length) {
                return new p1(n1VarArr);
            }
            a2[] a2VarArr = bVarArr[i10].f49159j;
            a2[] a2VarArr2 = new a2[a2VarArr.length];
            for (int i11 = 0; i11 < a2VarArr.length; i11++) {
                a2 a2Var = a2VarArr[i11];
                a2VarArr2[i11] = a2Var.e(uVar.b(a2Var));
            }
            n1VarArr[i10] = new n1(a2VarArr2);
            i10++;
        }
    }

    private static i<c>[] s(int i10) {
        return new i[i10];
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f49066o.a();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        return this.f49066o.d(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        return this.f49066o.e();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        this.f49066o.f(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return this.f49066o.g();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        for (i<c> iVar : this.f49065n) {
            if (iVar.f47659b == 2) {
                return iVar.h(j10, r3Var);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public List<StreamKey> i(List<j> list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            j jVar = list.get(i10);
            int iD = this.f49061j.d(jVar.h());
            for (int i11 = 0; i11 < jVar.length(); i11++) {
                arrayList.add(new StreamKey(iD, jVar.e(i11)));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        for (i<c> iVar : this.f49065n) {
            iVar.S(j10);
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        return com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        j jVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            if (d1Var != null) {
                i iVar = (i) d1Var;
                if (jVarArr[i10] == null || !zArr[i10]) {
                    iVar.P();
                    d1VarArr[i10] = null;
                } else {
                    ((c) iVar.E()).a(jVarArr[i10]);
                    arrayList.add(iVar);
                }
            }
            if (d1VarArr[i10] == null && (jVar = jVarArr[i10]) != null) {
                i<c> iVarB = b(jVar, j10);
                arrayList.add(iVarB);
                d1VarArr[i10] = iVarB;
                zArr2[i10] = true;
            }
        }
        i<c>[] iVarArrS = s(arrayList.size());
        this.f49065n = iVarArrS;
        arrayList.toArray(iVarArrS);
        this.f49066o = this.f49062k.a(this.f49065n);
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return this.f49061j;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f49063l = aVar;
        aVar.q(this);
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void n(i<c> iVar) {
        this.f49063l.n(this);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        this.f49055d.b();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        for (i<c> iVar : this.f49065n) {
            iVar.v(j10, z10);
        }
    }

    public void w() {
        for (i<c> iVar : this.f49065n) {
            iVar.P();
        }
        this.f49063l = null;
    }

    public void x(com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar) {
        this.f49064m = aVar;
        for (i<c> iVar : this.f49065n) {
            ((c) iVar.E()).f(aVar);
        }
        this.f49063l.n(this);
    }
}
