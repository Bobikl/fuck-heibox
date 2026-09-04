package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.e1;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.primitives.Ints;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: HlsMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l implements c0, s.b, HlsPlaylistTracker.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f48165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HlsPlaylistTracker f48166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f48167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final u0 f48168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.u f48169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.s.a f48170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g0 f48171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n0.a f48172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f48173j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.g f48176m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f48177n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f48178o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f48179p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @p0
    private c0.a f48180q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f48181r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private p1 f48182s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f48186w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private e1 f48187x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final IdentityHashMap<d1, Integer> f48174k = new IdentityHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final v f48175l = new v();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private s[] f48183t = new s[0];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private s[] f48184u = new s[0];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int[][] f48185v = new int[0][];

    public l(h hVar, HlsPlaylistTracker hlsPlaylistTracker, g gVar, @p0 u0 u0Var, com.google.android.exoplayer2.drm.u uVar, com.google.android.exoplayer2.drm.s.a aVar, g0 g0Var, n0.a aVar2, com.google.android.exoplayer2.upstream.b bVar, com.google.android.exoplayer2.source.g gVar2, boolean z10, int i10, boolean z11) {
        this.f48165b = hVar;
        this.f48166c = hlsPlaylistTracker;
        this.f48167d = gVar;
        this.f48168e = u0Var;
        this.f48169f = uVar;
        this.f48170g = aVar;
        this.f48171h = g0Var;
        this.f48172i = aVar2;
        this.f48173j = bVar;
        this.f48176m = gVar2;
        this.f48177n = z10;
        this.f48178o = i10;
        this.f48179p = z11;
        this.f48187x = gVar2.a(new e1[0]);
    }

    private static a2 A(a2 a2Var) {
        String strS = com.google.android.exoplayer2.util.u0.S(a2Var.f43590j, 2);
        return new a2.b().S(a2Var.f43582b).U(a2Var.f43583c).K(a2Var.f43592l).e0(y.g(strS)).I(strS).X(a2Var.f43591k).G(a2Var.f43587g).Z(a2Var.f43588h).j0(a2Var.f43598r).Q(a2Var.f43599s).P(a2Var.f43600t).g0(a2Var.f43585e).c0(a2Var.f43586f).E();
    }

    private void s(long j10, List<com.google.android.exoplayer2.source.hls.playlist.f.a> list, List<s> list2, List<int[]> list3, Map<String, DrmInitData> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10).f48309d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z10 = true;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    if (com.google.android.exoplayer2.util.u0.c(str, list.get(i11).f48309d)) {
                        com.google.android.exoplayer2.source.hls.playlist.f.a aVar = list.get(i11);
                        arrayList3.add(Integer.valueOf(i11));
                        arrayList.add(aVar.f48306a);
                        arrayList2.add(aVar.f48307b);
                        z10 &= com.google.android.exoplayer2.util.u0.R(aVar.f48307b.f43590j, 1) == 1;
                    }
                }
                s sVarX = x(1, (Uri[]) arrayList.toArray((Uri[]) com.google.android.exoplayer2.util.u0.l(new Uri[0])), (a2[]) arrayList2.toArray(new a2[0]), null, Collections.emptyList(), map, j10);
                list3.add(Ints.B(arrayList3));
                list2.add(sVarX);
                if (this.f48177n && z10) {
                    sVarX.e0(new n1[]{new n1((a2[]) arrayList2.toArray(new a2[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void t(com.google.android.exoplayer2.source.hls.playlist.f fVar, long j10, List<s> list, List<int[]> list2, Map<String, DrmInitData> map) {
        boolean z10;
        boolean z11;
        int size = fVar.f48297e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < fVar.f48297e.size(); i12++) {
            a2 a2Var = fVar.f48297e.get(i12).f48311b;
            if (a2Var.f43599s > 0 || com.google.android.exoplayer2.util.u0.S(a2Var.f43590j, 2) != null) {
                iArr[i12] = 2;
                i10++;
            } else if (com.google.android.exoplayer2.util.u0.S(a2Var.f43590j, 1) != null) {
                iArr[i12] = 1;
                i11++;
            } else {
                iArr[i12] = -1;
            }
        }
        if (i10 > 0) {
            size = i10;
            z10 = true;
            z11 = false;
        } else if (i11 < size) {
            size -= i11;
            z10 = false;
            z11 = true;
        } else {
            z10 = false;
            z11 = false;
        }
        Uri[] uriArr = new Uri[size];
        a2[] a2VarArr = new a2[size];
        int[] iArr2 = new int[size];
        int i13 = 0;
        for (int i14 = 0; i14 < fVar.f48297e.size(); i14++) {
            if ((!z10 || iArr[i14] == 2) && (!z11 || iArr[i14] != 1)) {
                com.google.android.exoplayer2.source.hls.playlist.f.b bVar = fVar.f48297e.get(i14);
                uriArr[i13] = bVar.f48310a;
                a2VarArr[i13] = bVar.f48311b;
                iArr2[i13] = i14;
                i13++;
            }
        }
        String str = a2VarArr[0].f43590j;
        int iR = com.google.android.exoplayer2.util.u0.R(str, 2);
        int iR2 = com.google.android.exoplayer2.util.u0.R(str, 1);
        boolean z12 = iR2 <= 1 && iR <= 1 && iR2 + iR > 0;
        s sVarX = x((z10 || iR2 <= 0) ? 0 : 1, uriArr, a2VarArr, fVar.f48302j, fVar.f48303k, map, j10);
        list.add(sVarX);
        list2.add(iArr2);
        if (this.f48177n && z12) {
            ArrayList arrayList = new ArrayList();
            if (iR > 0) {
                a2[] a2VarArr2 = new a2[size];
                for (int i15 = 0; i15 < size; i15++) {
                    a2VarArr2[i15] = A(a2VarArr[i15]);
                }
                arrayList.add(new n1(a2VarArr2));
                if (iR2 > 0 && (fVar.f48302j != null || fVar.f48299g.isEmpty())) {
                    arrayList.add(new n1(y(a2VarArr[0], fVar.f48302j, false)));
                }
                List<a2> list3 = fVar.f48303k;
                if (list3 != null) {
                    for (int i16 = 0; i16 < list3.size(); i16++) {
                        arrayList.add(new n1(list3.get(i16)));
                    }
                }
            } else {
                a2[] a2VarArr3 = new a2[size];
                for (int i17 = 0; i17 < size; i17++) {
                    a2VarArr3[i17] = y(a2VarArr[i17], fVar.f48302j, true);
                }
                arrayList.add(new n1(a2VarArr3));
            }
            n1 n1Var = new n1(new a2.b().S("ID3").e0(y.f51591p0).E());
            arrayList.add(n1Var);
            sVarX.e0((n1[]) arrayList.toArray(new n1[0]), 0, arrayList.indexOf(n1Var));
        }
    }

    private void w(long j10) {
        com.google.android.exoplayer2.source.hls.playlist.f fVar = (com.google.android.exoplayer2.source.hls.playlist.f) com.google.android.exoplayer2.util.a.g(this.f48166c.c());
        Map<String, DrmInitData> mapZ = this.f48179p ? z(fVar.f48305m) : Collections.emptyMap();
        boolean z10 = !fVar.f48297e.isEmpty();
        List<com.google.android.exoplayer2.source.hls.playlist.f.a> list = fVar.f48299g;
        List<com.google.android.exoplayer2.source.hls.playlist.f.a> list2 = fVar.f48300h;
        this.f48181r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z10) {
            t(fVar, j10, arrayList, arrayList2, mapZ);
        }
        s(j10, list, arrayList, arrayList2, mapZ);
        this.f48186w = arrayList.size();
        int i10 = 0;
        while (i10 < list2.size()) {
            com.google.android.exoplayer2.source.hls.playlist.f.a aVar = list2.get(i10);
            int i11 = i10;
            s sVarX = x(3, new Uri[]{aVar.f48306a}, new a2[]{aVar.f48307b}, null, Collections.emptyList(), mapZ, j10);
            arrayList2.add(new int[]{i11});
            arrayList.add(sVarX);
            sVarX.e0(new n1[]{new n1(aVar.f48307b)}, 0, new int[0]);
            i10 = i11 + 1;
        }
        this.f48183t = (s[]) arrayList.toArray(new s[0]);
        this.f48185v = (int[][]) arrayList2.toArray(new int[0][]);
        s[] sVarArr = this.f48183t;
        this.f48181r = sVarArr.length;
        sVarArr[0].n0(true);
        for (s sVar : this.f48183t) {
            sVar.C();
        }
        this.f48184u = this.f48183t;
    }

    private s x(int i10, Uri[] uriArr, a2[] a2VarArr, @p0 a2 a2Var, @p0 List<a2> list, Map<String, DrmInitData> map, long j10) {
        return new s(i10, this, new f(this.f48165b, this.f48166c, uriArr, a2VarArr, this.f48167d, this.f48168e, this.f48175l, list), map, this.f48173j, j10, a2Var, this.f48169f, this.f48170g, this.f48171h, this.f48172i, this.f48178o);
    }

    private static a2 y(a2 a2Var, @p0 a2 a2Var2, boolean z10) {
        String str;
        int i10;
        int i11;
        String str2;
        String str3;
        Metadata metadata;
        int i12;
        if (a2Var2 != null) {
            str2 = a2Var2.f43590j;
            metadata = a2Var2.f43591k;
            int i13 = a2Var2.f43606z;
            i10 = a2Var2.f43585e;
            int i14 = a2Var2.f43586f;
            String str4 = a2Var2.f43584d;
            str3 = a2Var2.f43583c;
            i11 = i13;
            i12 = i14;
            str = str4;
        } else {
            String strS = com.google.android.exoplayer2.util.u0.S(a2Var.f43590j, 1);
            Metadata metadata2 = a2Var.f43591k;
            if (z10) {
                int i15 = a2Var.f43606z;
                int i16 = a2Var.f43585e;
                int i17 = a2Var.f43586f;
                str = a2Var.f43584d;
                str2 = strS;
                str3 = a2Var.f43583c;
                i11 = i15;
                i10 = i16;
                metadata = metadata2;
                i12 = i17;
            } else {
                str = null;
                i10 = 0;
                i11 = -1;
                str2 = strS;
                str3 = null;
                metadata = metadata2;
                i12 = 0;
            }
        }
        return new a2.b().S(a2Var.f43582b).U(str3).K(a2Var.f43592l).e0(y.g(str2)).I(str2).X(metadata).G(z10 ? a2Var.f43587g : -1).Z(z10 ? a2Var.f43588h : -1).H(i11).g0(i10).c0(i12).V(str).E();
    }

    private static Map<String, DrmInitData> z(List<DrmInitData> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i10 = 0;
        while (i10 < arrayList.size()) {
            DrmInitData drmInitDataH = list.get(i10);
            String str = drmInitDataH.f44652d;
            i10++;
            int i11 = i10;
            while (i11 < arrayList.size()) {
                DrmInitData drmInitData = (DrmInitData) arrayList.get(i11);
                if (TextUtils.equals(drmInitData.f44652d, str)) {
                    drmInitDataH = drmInitDataH.h(drmInitData);
                    arrayList.remove(i11);
                } else {
                    i11++;
                }
            }
            map.put(str, drmInitDataH);
        }
        return map;
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void n(s sVar) {
        this.f48180q.n(this);
    }

    public void C() {
        this.f48166c.a(this);
        for (s sVar : this.f48183t) {
            sVar.g0();
        }
        this.f48180q = null;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f48187x.a();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void b() {
        for (s sVar : this.f48183t) {
            sVar.c0();
        }
        this.f48180q.n(this);
    }

    @Override // com.google.android.exoplayer2.source.hls.s.b
    public void c() {
        int i10 = this.f48181r - 1;
        this.f48181r = i10;
        if (i10 > 0) {
            return;
        }
        int i11 = 0;
        for (s sVar : this.f48183t) {
            i11 += sVar.o().f48609b;
        }
        n1[] n1VarArr = new n1[i11];
        int i12 = 0;
        for (s sVar2 : this.f48183t) {
            int i13 = sVar2.o().f48609b;
            int i14 = 0;
            while (i14 < i13) {
                n1VarArr[i12] = sVar2.o().c(i14);
                i14++;
                i12++;
            }
        }
        this.f48182s = new p1(n1VarArr);
        this.f48180q.q(this);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        if (this.f48182s != null) {
            return this.f48187x.d(j10);
        }
        for (s sVar : this.f48183t) {
            sVar.C();
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        return this.f48187x.e();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        this.f48187x.f(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return this.f48187x.g();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // com.google.android.exoplayer2.source.c0
    public List<StreamKey> i(List<com.google.android.exoplayer2.trackselection.j> list) {
        int[] iArr;
        p1 p1VarO;
        int iN;
        l lVar = this;
        com.google.android.exoplayer2.source.hls.playlist.f fVar = (com.google.android.exoplayer2.source.hls.playlist.f) com.google.android.exoplayer2.util.a.g(lVar.f48166c.c());
        boolean z10 = !fVar.f48297e.isEmpty();
        int length = lVar.f48183t.length - fVar.f48300h.size();
        int i10 = 0;
        if (z10) {
            s sVar = lVar.f48183t[0];
            iArr = lVar.f48185v[0];
            p1VarO = sVar.o();
            iN = sVar.N();
        } else {
            iArr = new int[0];
            p1VarO = p1.f48606e;
            iN = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z11 = false;
        boolean z12 = false;
        for (com.google.android.exoplayer2.trackselection.j jVar : list) {
            n1 n1VarH = jVar.h();
            int iD = p1VarO.d(n1VarH);
            if (iD == -1) {
                ?? r15 = z10;
                while (true) {
                    s[] sVarArr = lVar.f48183t;
                    if (r15 >= sVarArr.length) {
                        break;
                    }
                    if (sVarArr[r15].o().d(n1VarH) != -1) {
                        int i11 = r15 < length ? 1 : 2;
                        int[] iArr2 = lVar.f48185v[r15];
                        for (int i12 = 0; i12 < jVar.length(); i12++) {
                            arrayList.add(new StreamKey(i11, iArr2[jVar.e(i12)]));
                        }
                        break;
                    }
                    lVar = this;
                    r15++;
                }
            } else if (iD == iN) {
                for (int i13 = i10; i13 < jVar.length(); i13++) {
                    arrayList.add(new StreamKey(i10, iArr[jVar.e(i13)]));
                }
                z12 = true;
            } else {
                z11 = true;
            }
            lVar = this;
            i10 = 0;
        }
        if (z11 && !z12) {
            int i14 = iArr[0];
            int i15 = fVar.f48297e.get(i14).f48311b.f43589i;
            for (int i16 = 1; i16 < iArr.length; i16++) {
                int i17 = fVar.f48297e.get(iArr[i16]).f48311b.f43589i;
                if (i17 < i15) {
                    i14 = iArr[i16];
                    i15 = i17;
                }
            }
            arrayList.add(new StreamKey(0, i14));
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        s[] sVarArr = this.f48184u;
        if (sVarArr.length > 0) {
            boolean zJ0 = sVarArr[0].j0(j10, false);
            int i10 = 1;
            while (true) {
                s[] sVarArr2 = this.f48184u;
                if (i10 >= sVarArr2.length) {
                    break;
                }
                sVarArr2[i10].j0(j10, zJ0);
                i10++;
            }
            if (zJ0) {
                this.f48175l.b();
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        return com.google.android.exoplayer2.j.f46377b;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00df  */
    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        d1[] d1VarArr2 = d1VarArr;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            d1 d1Var = d1VarArr2[i10];
            iArr[i10] = d1Var == null ? -1 : this.f48174k.get(d1Var).intValue();
            iArr2[i10] = -1;
            com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i10];
            if (jVar != null) {
                n1 n1VarH = jVar.h();
                int i11 = 0;
                while (true) {
                    s[] sVarArr = this.f48183t;
                    if (i11 >= sVarArr.length) {
                        break;
                    }
                    if (sVarArr[i11].o().d(n1VarH) != -1) {
                        iArr2[i10] = i11;
                        break;
                    }
                    i11++;
                }
            }
        }
        this.f48174k.clear();
        int length = jVarArr.length;
        d1[] d1VarArr3 = new d1[length];
        d1[] d1VarArr4 = new d1[jVarArr.length];
        com.google.android.exoplayer2.trackselection.j[] jVarArr2 = new com.google.android.exoplayer2.trackselection.j[jVarArr.length];
        s[] sVarArr2 = new s[this.f48183t.length];
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        while (i13 < this.f48183t.length) {
            for (int i14 = 0; i14 < jVarArr.length; i14++) {
                com.google.android.exoplayer2.trackselection.j jVar2 = null;
                d1VarArr4[i14] = iArr[i14] == i13 ? d1VarArr2[i14] : null;
                if (iArr2[i14] == i13) {
                    jVar2 = jVarArr[i14];
                }
                jVarArr2[i14] = jVar2;
            }
            s sVar = this.f48183t[i13];
            int i15 = i12;
            int i16 = length;
            int i17 = i13;
            com.google.android.exoplayer2.trackselection.j[] jVarArr3 = jVarArr2;
            s[] sVarArr3 = sVarArr2;
            boolean zK0 = sVar.k0(jVarArr2, zArr, d1VarArr4, zArr2, j10, z10);
            int i18 = 0;
            boolean z11 = false;
            while (true) {
                if (i18 >= jVarArr.length) {
                    break;
                }
                d1 d1Var2 = d1VarArr4[i18];
                if (iArr2[i18] == i17) {
                    com.google.android.exoplayer2.util.a.g(d1Var2);
                    d1VarArr3[i18] = d1Var2;
                    this.f48174k.put(d1Var2, Integer.valueOf(i17));
                    z11 = true;
                } else if (iArr[i18] == i17) {
                    com.google.android.exoplayer2.util.a.i(d1Var2 == null);
                }
                i18++;
            }
            if (z11) {
                sVarArr3[i15] = sVar;
                i12 = i15 + 1;
                if (i15 == 0) {
                    sVar.n0(true);
                    if (zK0) {
                        this.f48175l.b();
                        z10 = true;
                    } else {
                        s[] sVarArr4 = this.f48184u;
                        if (sVarArr4.length == 0 || sVar != sVarArr4[0]) {
                            this.f48175l.b();
                            z10 = true;
                        }
                    }
                } else {
                    sVar.n0(i17 < this.f48186w);
                }
            } else {
                i12 = i15;
            }
            i13 = i17 + 1;
            d1VarArr2 = d1VarArr;
            sVarArr2 = sVarArr3;
            length = i16;
            jVarArr2 = jVarArr3;
        }
        System.arraycopy(d1VarArr3, 0, d1VarArr2, 0, length);
        s[] sVarArr5 = (s[]) com.google.android.exoplayer2.util.u0.Z0(sVarArr2, i12);
        this.f48184u = sVarArr5;
        this.f48187x = this.f48176m.a(sVarArr5);
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean m(Uri uri, g0.d dVar, boolean z10) {
        boolean zB0 = true;
        for (s sVar : this.f48183t) {
            zB0 &= sVar.b0(uri, dVar, z10);
        }
        this.f48180q.n(this);
        return zB0;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return (p1) com.google.android.exoplayer2.util.a.g(this.f48182s);
    }

    @Override // com.google.android.exoplayer2.source.hls.s.b
    public void p(Uri uri) {
        this.f48166c.f(uri);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f48180q = aVar;
        this.f48166c.g(this);
        w(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        for (s sVar : this.f48183t) {
            sVar.u();
        }
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        for (s sVar : this.f48184u) {
            sVar.v(j10, z10);
        }
    }
}
