package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.j1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.upstream.r;
import com.google.android.exoplayer2.util.q0;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.l1;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: HlsChunkSource.java */
/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f48112s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f48113t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f48114u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f48115v = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.o f48118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v f48119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Uri[] f48120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a2[] f48121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final HlsPlaylistTracker f48122g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n1 f48123h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private final List<a2> f48124i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f48126k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @p0
    private IOException f48128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private Uri f48129n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f48130o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private com.google.android.exoplayer2.trackselection.j f48131p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f48133r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final FullSegmentEncryptionKeyCache f48125j = new FullSegmentEncryptionKeyCache(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte[] f48127l = u0.f51541f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f48132q = com.google.android.exoplayer2.j.f46377b;

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class a extends com.google.android.exoplayer2.source.chunk.l {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private byte[] f48134m;

        public a(com.google.android.exoplayer2.upstream.o oVar, r rVar, a2 a2Var, int i10, @p0 Object obj, byte[] bArr) {
            super(oVar, rVar, 3, a2Var, i10, obj, bArr);
        }

        @Override // com.google.android.exoplayer2.source.chunk.l
        protected void g(byte[] bArr, int i10) {
            this.f48134m = Arrays.copyOf(bArr, i10);
        }

        @p0
        public byte[] j() {
            return this.f48134m;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public com.google.android.exoplayer2.source.chunk.f f48135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f48136b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public Uri f48137c;

        public b() {
            a();
        }

        public void a() {
            this.f48135a = null;
            this.f48136b = false;
            this.f48137c = null;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    @j1
    public static final class c extends com.google.android.exoplayer2.source.chunk.b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List<com.google.android.exoplayer2.source.hls.playlist.g.f> f48138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f48139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final String f48140g;

        public c(String str, long j10, List<com.google.android.exoplayer2.source.hls.playlist.g.f> list) {
            super(0L, list.size() - 1);
            this.f48140g = str;
            this.f48139f = j10;
            this.f48138e = list;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long a() {
            e();
            com.google.android.exoplayer2.source.hls.playlist.g.f fVar = this.f48138e.get((int) f());
            return this.f48139f + fVar.f48349f + fVar.f48347d;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public long c() {
            e();
            return this.f48139f + this.f48138e.get((int) f()).f48349f;
        }

        @Override // com.google.android.exoplayer2.source.chunk.o
        public r d() {
            e();
            com.google.android.exoplayer2.source.hls.playlist.g.f fVar = this.f48138e.get((int) f());
            return new r(q0.f(this.f48140g, fVar.f48345b), fVar.f48353j, fVar.f48354k);
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class d extends com.google.android.exoplayer2.trackselection.c {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f48141j;

        public d(n1 n1Var, int[] iArr) {
            super(n1Var, iArr);
            this.f48141j = t(n1Var.c(iArr[0]));
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        public int a() {
            return this.f48141j;
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        public void k(long j10, long j11, long j12, List<? extends com.google.android.exoplayer2.source.chunk.n> list, com.google.android.exoplayer2.source.chunk.o[] oVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (b(this.f48141j, jElapsedRealtime)) {
                for (int i10 = this.f50036d - 1; i10 >= 0; i10--) {
                    if (!b(i10, jElapsedRealtime)) {
                        this.f48141j = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        @p0
        public Object r() {
            return null;
        }

        @Override // com.google.android.exoplayer2.trackselection.j
        public int u() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: HlsChunkSource.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.hls.playlist.g.f f48142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f48143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f48144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f48145d;

        public e(com.google.android.exoplayer2.source.hls.playlist.g.f fVar, long j10, int i10) {
            this.f48142a = fVar;
            this.f48143b = j10;
            this.f48144c = i10;
            this.f48145d = (fVar instanceof com.google.android.exoplayer2.source.hls.playlist.g.b) && ((com.google.android.exoplayer2.source.hls.playlist.g.b) fVar).f48339n;
        }
    }

    public f(h hVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, a2[] a2VarArr, g gVar, @p0 com.google.android.exoplayer2.upstream.u0 u0Var, v vVar, @p0 List<a2> list) {
        this.f48116a = hVar;
        this.f48122g = hlsPlaylistTracker;
        this.f48120e = uriArr;
        this.f48121f = a2VarArr;
        this.f48119d = vVar;
        this.f48124i = list;
        com.google.android.exoplayer2.upstream.o oVarA = gVar.a(1);
        this.f48117b = oVarA;
        if (u0Var != null) {
            oVarA.e(u0Var);
        }
        this.f48118c = gVar.a(3);
        this.f48123h = new n1(a2VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((a2VarArr[i10].f43586f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f48131p = new d(this.f48123h, Ints.B(arrayList));
    }

    @p0
    private static Uri c(com.google.android.exoplayer2.source.hls.playlist.g gVar, @p0 com.google.android.exoplayer2.source.hls.playlist.g.f fVar) {
        String str;
        if (fVar == null || (str = fVar.f48351h) == null) {
            return null;
        }
        return q0.f(gVar.f48361a, str);
    }

    private Pair<Long, Integer> e(@p0 j jVar, boolean z10, com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10, long j11) {
        int i10 = -1;
        if (jVar != null && !z10) {
            if (!jVar.h()) {
                return new Pair<>(Long.valueOf(jVar.f47700j), Integer.valueOf(jVar.f48153o));
            }
            Long lValueOf = Long.valueOf(jVar.f48153o == -1 ? jVar.g() : jVar.f47700j);
            int i11 = jVar.f48153o;
            return new Pair<>(lValueOf, Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
        }
        long j12 = gVar.f48336u + j10;
        if (jVar != null && !this.f48130o) {
            j11 = jVar.f47653g;
        }
        if (!gVar.f48330o && j11 >= j12) {
            return new Pair<>(Long.valueOf(gVar.f48326k + ((long) gVar.f48333r.size())), -1);
        }
        long j13 = j11 - j10;
        int iH = u0.h(gVar.f48333r, Long.valueOf(j13), true, !this.f48122g.i() || jVar == null);
        long j14 = ((long) iH) + gVar.f48326k;
        if (iH >= 0) {
            com.google.android.exoplayer2.source.hls.playlist.g.e eVar = gVar.f48333r.get(iH);
            List<com.google.android.exoplayer2.source.hls.playlist.g.b> list = j13 < eVar.f48349f + eVar.f48347d ? eVar.f48344n : gVar.f48334s;
            for (int i12 = 0; i12 < list.size(); i12++) {
                com.google.android.exoplayer2.source.hls.playlist.g.b bVar = list.get(i12);
                if (j13 < bVar.f48349f + bVar.f48347d) {
                    if (!bVar.f48338m) {
                        break;
                    }
                    j14 += list == gVar.f48334s ? 1L : 0L;
                    i10 = i12;
                    break;
                }
            }
        }
        return new Pair<>(Long.valueOf(j14), Integer.valueOf(i10));
    }

    @p0
    private static e f(com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f48326k);
        if (i11 == gVar.f48333r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < gVar.f48334s.size()) {
                return new e(gVar.f48334s.get(i10), j10, i10);
            }
            return null;
        }
        com.google.android.exoplayer2.source.hls.playlist.g.e eVar = gVar.f48333r.get(i11);
        if (i10 == -1) {
            return new e(eVar, j10, -1);
        }
        if (i10 < eVar.f48344n.size()) {
            return new e(eVar.f48344n.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < gVar.f48333r.size()) {
            return new e(gVar.f48333r.get(i12), j10 + 1, -1);
        }
        if (gVar.f48334s.isEmpty()) {
            return null;
        }
        return new e(gVar.f48334s.get(0), j10 + 1, 0);
    }

    @j1
    static List<com.google.android.exoplayer2.source.hls.playlist.g.f> h(com.google.android.exoplayer2.source.hls.playlist.g gVar, long j10, int i10) {
        int i11 = (int) (j10 - gVar.f48326k);
        if (i11 < 0 || gVar.f48333r.size() < i11) {
            return ImmutableList.B();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < gVar.f48333r.size()) {
            if (i10 != -1) {
                com.google.android.exoplayer2.source.hls.playlist.g.e eVar = gVar.f48333r.get(i11);
                if (i10 == 0) {
                    arrayList.add(eVar);
                } else if (i10 < eVar.f48344n.size()) {
                    List<com.google.android.exoplayer2.source.hls.playlist.g.b> list = eVar.f48344n;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List<com.google.android.exoplayer2.source.hls.playlist.g.e> list2 = gVar.f48333r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (gVar.f48329n != com.google.android.exoplayer2.j.f46377b) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < gVar.f48334s.size()) {
                List<com.google.android.exoplayer2.source.hls.playlist.g.b> list3 = gVar.f48334s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @p0
    private com.google.android.exoplayer2.source.chunk.f k(@p0 Uri uri, int i10) {
        if (uri == null) {
            return null;
        }
        byte[] bArrD = this.f48125j.d(uri);
        if (bArrD != null) {
            this.f48125j.c(uri, bArrD);
            return null;
        }
        return new a(this.f48118c, new r.b().j(uri).c(1).a(), this.f48121f[i10], this.f48131p.u(), this.f48131p.r(), this.f48127l);
    }

    private long r(long j10) {
        long j11 = this.f48132q;
        return (j11 > com.google.android.exoplayer2.j.f46377b ? 1 : (j11 == com.google.android.exoplayer2.j.f46377b ? 0 : -1)) != 0 ? j11 - j10 : com.google.android.exoplayer2.j.f46377b;
    }

    private void v(com.google.android.exoplayer2.source.hls.playlist.g gVar) {
        this.f48132q = gVar.f48330o ? com.google.android.exoplayer2.j.f46377b : gVar.e() - this.f48122g.b();
    }

    public com.google.android.exoplayer2.source.chunk.o[] a(@p0 j jVar, long j10) {
        int i10;
        int iD = jVar == null ? -1 : this.f48123h.d(jVar.f47650d);
        int length = this.f48131p.length();
        com.google.android.exoplayer2.source.chunk.o[] oVarArr = new com.google.android.exoplayer2.source.chunk.o[length];
        boolean z10 = false;
        int i11 = 0;
        while (i11 < length) {
            int iE = this.f48131p.e(i11);
            Uri uri = this.f48120e[iE];
            if (this.f48122g.h(uri)) {
                com.google.android.exoplayer2.source.hls.playlist.g gVarL = this.f48122g.l(uri, z10);
                com.google.android.exoplayer2.util.a.g(gVarL);
                long jB = gVarL.f48323h - this.f48122g.b();
                i10 = i11;
                Pair<Long, Integer> pairE = e(jVar, iE != iD ? true : z10, gVarL, jB, j10);
                oVarArr[i10] = new c(gVarL.f48361a, jB, h(gVarL, ((Long) pairE.first).longValue(), ((Integer) pairE.second).intValue()));
            } else {
                oVarArr[i11] = com.google.android.exoplayer2.source.chunk.o.f47701a;
                i10 = i11;
            }
            i11 = i10 + 1;
            z10 = false;
        }
        return oVarArr;
    }

    public int b(j jVar) {
        if (jVar.f48153o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.g gVar = (com.google.android.exoplayer2.source.hls.playlist.g) com.google.android.exoplayer2.util.a.g(this.f48122g.l(this.f48120e[this.f48123h.d(jVar.f47650d)], false));
        int i10 = (int) (jVar.f47700j - gVar.f48326k);
        if (i10 < 0) {
            return 1;
        }
        List<com.google.android.exoplayer2.source.hls.playlist.g.b> list = i10 < gVar.f48333r.size() ? gVar.f48333r.get(i10).f48344n : gVar.f48334s;
        if (jVar.f48153o >= list.size()) {
            return 2;
        }
        com.google.android.exoplayer2.source.hls.playlist.g.b bVar = list.get(jVar.f48153o);
        if (bVar.f48339n) {
            return 0;
        }
        return u0.c(Uri.parse(q0.e(gVar.f48361a, bVar.f48345b)), jVar.f47648b.f51194a) ? 1 : 2;
    }

    public void d(long j10, long j11, List<j> list, boolean z10, b bVar) {
        com.google.android.exoplayer2.source.hls.playlist.g gVar;
        long jB;
        Uri uri;
        int i10;
        j jVar = list.isEmpty() ? null : (j) l1.w(list);
        int iD = jVar == null ? -1 : this.f48123h.d(jVar.f47650d);
        long jMax = j11 - j10;
        long jR = r(j10);
        if (jVar != null && !this.f48130o) {
            long jD = jVar.d();
            jMax = Math.max(0L, jMax - jD);
            if (jR != com.google.android.exoplayer2.j.f46377b) {
                jR = Math.max(0L, jR - jD);
            }
        }
        this.f48131p.k(j10, jMax, jR, list, a(jVar, j11));
        int iL = this.f48131p.l();
        boolean z11 = iD != iL;
        Uri uri2 = this.f48120e[iL];
        if (!this.f48122g.h(uri2)) {
            bVar.f48137c = uri2;
            this.f48133r &= uri2.equals(this.f48129n);
            this.f48129n = uri2;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.g gVarL = this.f48122g.l(uri2, true);
        com.google.android.exoplayer2.util.a.g(gVarL);
        this.f48130o = gVarL.f48363c;
        v(gVarL);
        long jB2 = gVarL.f48323h - this.f48122g.b();
        Pair<Long, Integer> pairE = e(jVar, z11, gVarL, jB2, j11);
        long jLongValue = ((Long) pairE.first).longValue();
        int iIntValue = ((Integer) pairE.second).intValue();
        if (jLongValue >= gVarL.f48326k || jVar == null || !z11) {
            gVar = gVarL;
            jB = jB2;
            uri = uri2;
            i10 = iL;
        } else {
            Uri uri3 = this.f48120e[iD];
            com.google.android.exoplayer2.source.hls.playlist.g gVarL2 = this.f48122g.l(uri3, true);
            com.google.android.exoplayer2.util.a.g(gVarL2);
            jB = gVarL2.f48323h - this.f48122g.b();
            Pair<Long, Integer> pairE2 = e(jVar, false, gVarL2, jB, j11);
            jLongValue = ((Long) pairE2.first).longValue();
            iIntValue = ((Integer) pairE2.second).intValue();
            i10 = iD;
            uri = uri3;
            gVar = gVarL2;
        }
        if (jLongValue < gVar.f48326k) {
            this.f48128m = new BehindLiveWindowException();
            return;
        }
        e eVarF = f(gVar, jLongValue, iIntValue);
        if (eVarF == null) {
            if (!gVar.f48330o) {
                bVar.f48137c = uri;
                this.f48133r &= uri.equals(this.f48129n);
                this.f48129n = uri;
                return;
            } else {
                if (z10 || gVar.f48333r.isEmpty()) {
                    bVar.f48136b = true;
                    return;
                }
                eVarF = new e((com.google.android.exoplayer2.source.hls.playlist.g.f) l1.w(gVar.f48333r), (gVar.f48326k + ((long) gVar.f48333r.size())) - 1, -1);
            }
        }
        this.f48133r = false;
        this.f48129n = null;
        Uri uriC = c(gVar, eVarF.f48142a.f48346c);
        com.google.android.exoplayer2.source.chunk.f fVarK = k(uriC, i10);
        bVar.f48135a = fVarK;
        if (fVarK != null) {
            return;
        }
        Uri uriC2 = c(gVar, eVarF.f48142a);
        com.google.android.exoplayer2.source.chunk.f fVarK2 = k(uriC2, i10);
        bVar.f48135a = fVarK2;
        if (fVarK2 != null) {
            return;
        }
        boolean zW = j.w(jVar, uri, gVar, eVarF, jB);
        if (zW && eVarF.f48145d) {
            return;
        }
        bVar.f48135a = j.j(this.f48116a, this.f48117b, this.f48121f[i10], jB, gVar, eVarF, uri, this.f48124i, this.f48131p.u(), this.f48131p.r(), this.f48126k, this.f48119d, jVar, this.f48125j.b(uriC2), this.f48125j.b(uriC), zW);
    }

    public int g(long j10, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        return (this.f48128m != null || this.f48131p.length() < 2) ? list.size() : this.f48131p.j(j10, list);
    }

    public n1 i() {
        return this.f48123h;
    }

    public com.google.android.exoplayer2.trackselection.j j() {
        return this.f48131p;
    }

    public boolean l(com.google.android.exoplayer2.source.chunk.f fVar, long j10) {
        com.google.android.exoplayer2.trackselection.j jVar = this.f48131p;
        return jVar.o(jVar.g(this.f48123h.d(fVar.f47650d)), j10);
    }

    public void m() throws IOException {
        IOException iOException = this.f48128m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f48129n;
        if (uri == null || !this.f48133r) {
            return;
        }
        this.f48122g.e(uri);
    }

    public boolean n(Uri uri) {
        return u0.u(this.f48120e, uri);
    }

    public void o(com.google.android.exoplayer2.source.chunk.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f48127l = aVar.h();
            this.f48125j.c(aVar.f47648b.f51194a, (byte[]) com.google.android.exoplayer2.util.a.g(aVar.j()));
        }
    }

    public boolean p(Uri uri, long j10) {
        int iG;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f48120e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iG = this.f48131p.g(i10)) == -1) {
            return true;
        }
        this.f48133r |= uri.equals(this.f48129n);
        return j10 == com.google.android.exoplayer2.j.f46377b || (this.f48131p.o(iG, j10) && this.f48122g.j(uri, j10));
    }

    public void q() {
        this.f48128m = null;
    }

    public void s(boolean z10) {
        this.f48126k = z10;
    }

    public void t(com.google.android.exoplayer2.trackselection.j jVar) {
        this.f48131p = jVar;
    }

    public boolean u(long j10, com.google.android.exoplayer2.source.chunk.f fVar, List<? extends com.google.android.exoplayer2.source.chunk.n> list) {
        if (this.f48128m != null) {
            return false;
        }
        return this.f48131p.d(j10, fVar, list);
    }
}
