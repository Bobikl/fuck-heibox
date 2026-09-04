package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.drm.u;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.r3;
import com.google.android.exoplayer2.source.c0;
import com.google.android.exoplayer2.source.d1;
import com.google.android.exoplayer2.source.e1;
import com.google.android.exoplayer2.source.n0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.upstream.g0;
import com.google.android.exoplayer2.upstream.h0;
import com.google.android.exoplayer2.upstream.u0;
import com.google.android.exoplayer2.util.y;
import com.google.common.primitives.Ints;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DashMediaPeriod.java */
/* JADX INFO: loaded from: classes7.dex */
public final class e implements c0, e1.a<com.google.android.exoplayer2.source.chunk.i<d>>, com.google.android.exoplayer2.source.chunk.i.b<d> {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f47786y = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f47787z = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f47788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d.a f47789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private final u0 f47790d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final u f47791e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g0 f47792f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f47793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f47794h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h0 f47795i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f47796j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p1 f47797k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final a[] f47798l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.google.android.exoplayer2.source.g f47799m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n f47800n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final n0.a f47802p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final s.a f47803q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @p0
    private c0.a f47804r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private e1 f47807u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private com.google.android.exoplayer2.source.dash.manifest.c f47808v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f47809w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private List<com.google.android.exoplayer2.source.dash.manifest.f> f47810x;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.google.android.exoplayer2.source.chunk.i<d>[] f47805s = G(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private m[] f47806t = new m[0];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final IdentityHashMap<com.google.android.exoplayer2.source.chunk.i<d>, n.c> f47801o = new IdentityHashMap<>();

    /* JADX INFO: compiled from: DashMediaPeriod.java */
    public static final class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f47811h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f47812i = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f47813j = 2;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f47814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f47815b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47816c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f47817d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f47818e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f47819f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f47820g;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DashMediaPeriod.java */
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface InterfaceC0382a {
        }

        private a(int i10, int i11, int[] iArr, int i12, int i13, int i14, int i15) {
            this.f47815b = i10;
            this.f47814a = iArr;
            this.f47816c = i11;
            this.f47818e = i12;
            this.f47819f = i13;
            this.f47820g = i14;
            this.f47817d = i15;
        }

        public static a a(int[] iArr, int i10) {
            return new a(3, 1, iArr, i10, -1, -1, -1);
        }

        public static a b(int[] iArr, int i10) {
            return new a(5, 1, iArr, i10, -1, -1, -1);
        }

        public static a c(int i10) {
            return new a(5, 2, new int[0], -1, -1, -1, i10);
        }

        public static a d(int i10, int[] iArr, int i11, int i12, int i13) {
            return new a(i10, 0, iArr, i11, i12, i13, -1);
        }
    }

    public e(int i10, com.google.android.exoplayer2.source.dash.manifest.c cVar, b bVar, int i11, d.a aVar, @p0 u0 u0Var, u uVar, s.a aVar2, g0 g0Var, n0.a aVar3, long j10, h0 h0Var, com.google.android.exoplayer2.upstream.b bVar2, com.google.android.exoplayer2.source.g gVar, n.b bVar3) {
        this.f47788b = i10;
        this.f47808v = cVar;
        this.f47793g = bVar;
        this.f47809w = i11;
        this.f47789c = aVar;
        this.f47790d = u0Var;
        this.f47791e = uVar;
        this.f47803q = aVar2;
        this.f47792f = g0Var;
        this.f47802p = aVar3;
        this.f47794h = j10;
        this.f47795i = h0Var;
        this.f47796j = bVar2;
        this.f47799m = gVar;
        this.f47800n = new n(cVar, bVar3, bVar2);
        this.f47807u = gVar.a(this.f47805s);
        com.google.android.exoplayer2.source.dash.manifest.g gVarD = cVar.d(i11);
        List<com.google.android.exoplayer2.source.dash.manifest.f> list = gVarD.f47910d;
        this.f47810x = list;
        Pair<p1, a[]> pairW = w(uVar, gVarD.f47909c, list);
        this.f47797k = (p1) pairW.first;
        this.f47798l = (a[]) pairW.second;
    }

    private static a2[] A(List<com.google.android.exoplayer2.source.dash.manifest.a> list, int[] iArr) {
        for (int i10 : iArr) {
            com.google.android.exoplayer2.source.dash.manifest.a aVar = list.get(i10);
            List<com.google.android.exoplayer2.source.dash.manifest.e> list2 = list.get(i10).f47864d;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                com.google.android.exoplayer2.source.dash.manifest.e eVar = list2.get(i11);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f47899a)) {
                    a2.b bVarE0 = new a2.b().e0(y.f51593q0);
                    int i12 = aVar.f47861a;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append(i12);
                    sb2.append(":cea608");
                    return I(eVar, f47786y, bVarE0.S(sb2.toString()).E());
                }
                if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f47899a)) {
                    a2.b bVarE1 = new a2.b().e0(y.f51595r0);
                    int i13 = aVar.f47861a;
                    StringBuilder sb3 = new StringBuilder(18);
                    sb3.append(i13);
                    sb3.append(":cea708");
                    return I(eVar, f47787z, bVarE1.S(sb3.toString()).E());
                }
            }
        }
        return new a2[0];
    }

    private static int[][] B(List<com.google.android.exoplayer2.source.dash.manifest.a> list) {
        int iMin;
        com.google.android.exoplayer2.source.dash.manifest.e eVarX;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            sparseIntArray.put(list.get(i10).f47861a, i10);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i10));
            arrayList.add(arrayList2);
            sparseArray.put(i10, arrayList2);
        }
        for (int i11 = 0; i11 < size; i11++) {
            com.google.android.exoplayer2.source.dash.manifest.a aVar = list.get(i11);
            com.google.android.exoplayer2.source.dash.manifest.e eVarZ = z(aVar.f47865e);
            if (eVarZ == null) {
                eVarZ = z(aVar.f47866f);
            }
            if (eVarZ == null || (iMin = sparseIntArray.get(Integer.parseInt(eVarZ.f47900b), -1)) == -1) {
                iMin = i11;
            }
            if (iMin == i11 && (eVarX = x(aVar.f47866f)) != null) {
                for (String str : com.google.android.exoplayer2.util.u0.p1(eVarX.f47900b, Constants.ACCEPT_TIME_SEPARATOR_SP)) {
                    int i12 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i12 != -1) {
                        iMin = Math.min(iMin, i12);
                    }
                }
            }
            if (iMin != i11) {
                List list2 = (List) sparseArray.get(i11);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i11, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i13 = 0; i13 < size2; i13++) {
            int[] iArrB = Ints.B((Collection) arrayList.get(i13));
            iArr[i13] = iArrB;
            Arrays.sort(iArrB);
        }
        return iArr;
    }

    private int C(int i10, int[] iArr) {
        int i11 = iArr[i10];
        if (i11 == -1) {
            return -1;
        }
        int i12 = this.f47798l[i11].f47818e;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == i12 && this.f47798l[i14].f47816c == 0) {
                return i13;
            }
        }
        return -1;
    }

    private int[] D(com.google.android.exoplayer2.trackselection.j[] jVarArr) {
        int[] iArr = new int[jVarArr.length];
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i10];
            if (jVar != null) {
                iArr[i10] = this.f47797k.d(jVar.h());
            } else {
                iArr[i10] = -1;
            }
        }
        return iArr;
    }

    private static boolean E(List<com.google.android.exoplayer2.source.dash.manifest.a> list, int[] iArr) {
        for (int i10 : iArr) {
            List<com.google.android.exoplayer2.source.dash.manifest.j> list2 = list.get(i10).f47863c;
            for (int i11 = 0; i11 < list2.size(); i11++) {
                if (!list2.get(i11).f47926f.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int F(int i10, List<com.google.android.exoplayer2.source.dash.manifest.a> list, int[][] iArr, boolean[] zArr, a2[][] a2VarArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (E(list, iArr[i12])) {
                zArr[i12] = true;
                i11++;
            }
            a2[] a2VarArrA = A(list, iArr[i12]);
            a2VarArr[i12] = a2VarArrA;
            if (a2VarArrA.length != 0) {
                i11++;
            }
        }
        return i11;
    }

    private static com.google.android.exoplayer2.source.chunk.i<d>[] G(int i10) {
        return new com.google.android.exoplayer2.source.chunk.i[i10];
    }

    private static a2[] I(com.google.android.exoplayer2.source.dash.manifest.e eVar, Pattern pattern, a2 a2Var) {
        String str = eVar.f47900b;
        if (str == null) {
            return new a2[]{a2Var};
        }
        String[] strArrP1 = com.google.android.exoplayer2.util.u0.p1(str, ";");
        a2[] a2VarArr = new a2[strArrP1.length];
        for (int i10 = 0; i10 < strArrP1.length; i10++) {
            Matcher matcher = pattern.matcher(strArrP1[i10]);
            if (!matcher.matches()) {
                return new a2[]{a2Var};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            a2.b bVarC = a2Var.c();
            String str2 = a2Var.f43582b;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
            sb2.append(str2);
            sb2.append(":");
            sb2.append(i11);
            a2VarArr[i10] = bVarC.S(sb2.toString()).F(i11).V(matcher.group(2)).E();
        }
        return a2VarArr;
    }

    private void K(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr) {
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            if (jVarArr[i10] == null || !zArr[i10]) {
                d1 d1Var = d1VarArr[i10];
                if (d1Var instanceof com.google.android.exoplayer2.source.chunk.i) {
                    ((com.google.android.exoplayer2.source.chunk.i) d1Var).Q(this);
                } else if (d1Var instanceof com.google.android.exoplayer2.source.chunk.i.a) {
                    ((com.google.android.exoplayer2.source.chunk.i.a) d1Var).d();
                }
                d1VarArr[i10] = null;
            }
        }
    }

    private void L(com.google.android.exoplayer2.trackselection.j[] jVarArr, d1[] d1VarArr, int[] iArr) {
        boolean z10;
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            d1 d1Var = d1VarArr[i10];
            if ((d1Var instanceof r) || (d1Var instanceof com.google.android.exoplayer2.source.chunk.i.a)) {
                int iC = C(i10, iArr);
                if (iC == -1) {
                    z10 = d1VarArr[i10] instanceof r;
                } else {
                    d1 d1Var2 = d1VarArr[i10];
                    z10 = (d1Var2 instanceof com.google.android.exoplayer2.source.chunk.i.a) && ((com.google.android.exoplayer2.source.chunk.i.a) d1Var2).f47682b == d1VarArr[iC];
                }
                if (!z10) {
                    d1 d1Var3 = d1VarArr[i10];
                    if (d1Var3 instanceof com.google.android.exoplayer2.source.chunk.i.a) {
                        ((com.google.android.exoplayer2.source.chunk.i.a) d1Var3).d();
                    }
                    d1VarArr[i10] = null;
                }
            }
        }
    }

    private void M(com.google.android.exoplayer2.trackselection.j[] jVarArr, d1[] d1VarArr, boolean[] zArr, long j10, int[] iArr) {
        for (int i10 = 0; i10 < jVarArr.length; i10++) {
            com.google.android.exoplayer2.trackselection.j jVar = jVarArr[i10];
            if (jVar != null) {
                d1 d1Var = d1VarArr[i10];
                if (d1Var == null) {
                    zArr[i10] = true;
                    a aVar = this.f47798l[iArr[i10]];
                    int i11 = aVar.f47816c;
                    if (i11 == 0) {
                        d1VarArr[i10] = t(aVar, jVar, j10);
                    } else if (i11 == 2) {
                        d1VarArr[i10] = new m(this.f47810x.get(aVar.f47817d), jVar.h().c(0), this.f47808v.f47876d);
                    }
                } else if (d1Var instanceof com.google.android.exoplayer2.source.chunk.i) {
                    ((d) ((com.google.android.exoplayer2.source.chunk.i) d1Var).E()).a(jVar);
                }
            }
        }
        for (int i12 = 0; i12 < jVarArr.length; i12++) {
            if (d1VarArr[i12] == null && jVarArr[i12] != null) {
                a aVar2 = this.f47798l[iArr[i12]];
                if (aVar2.f47816c == 1) {
                    int iC = C(i12, iArr);
                    if (iC == -1) {
                        d1VarArr[i12] = new r();
                    } else {
                        d1VarArr[i12] = ((com.google.android.exoplayer2.source.chunk.i) d1VarArr[iC]).T(j10, aVar2.f47815b);
                    }
                }
            }
        }
    }

    private static void m(List<com.google.android.exoplayer2.source.dash.manifest.f> list, n1[] n1VarArr, a[] aVarArr, int i10) {
        int i11 = 0;
        while (i11 < list.size()) {
            n1VarArr[i10] = new n1(new a2.b().S(list.get(i11).a()).e0(y.C0).E());
            aVarArr[i10] = a.c(i11);
            i11++;
            i10++;
        }
    }

    private static int s(u uVar, List<com.google.android.exoplayer2.source.dash.manifest.a> list, int[][] iArr, int i10, boolean[] zArr, a2[][] a2VarArr, n1[] n1VarArr, a[] aVarArr) {
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            int[] iArr2 = iArr[i13];
            ArrayList arrayList = new ArrayList();
            for (int i15 : iArr2) {
                arrayList.addAll(list.get(i15).f47863c);
            }
            int size = arrayList.size();
            a2[] a2VarArr2 = new a2[size];
            for (int i16 = 0; i16 < size; i16++) {
                a2 a2Var = ((com.google.android.exoplayer2.source.dash.manifest.j) arrayList.get(i16)).f47923c;
                a2VarArr2[i16] = a2Var.e(uVar.b(a2Var));
            }
            com.google.android.exoplayer2.source.dash.manifest.a aVar = list.get(iArr2[0]);
            int i17 = i14 + 1;
            if (zArr[i13]) {
                i11 = i17 + 1;
            } else {
                i11 = i17;
                i17 = -1;
            }
            if (a2VarArr[i13].length != 0) {
                i12 = i11 + 1;
            } else {
                i12 = i11;
                i11 = -1;
            }
            n1VarArr[i14] = new n1(a2VarArr2);
            aVarArr[i14] = a.d(aVar.f47862b, iArr2, i14, i17, i11);
            if (i17 != -1) {
                a2.b bVar = new a2.b();
                int i18 = aVar.f47861a;
                StringBuilder sb2 = new StringBuilder(16);
                sb2.append(i18);
                sb2.append(":emsg");
                n1VarArr[i17] = new n1(bVar.S(sb2.toString()).e0(y.C0).E());
                aVarArr[i17] = a.b(iArr2, i14);
            }
            if (i11 != -1) {
                n1VarArr[i11] = new n1(a2VarArr[i13]);
                aVarArr[i11] = a.a(iArr2, i14);
            }
            i13++;
            i14 = i12;
        }
        return i14;
    }

    private com.google.android.exoplayer2.source.chunk.i<d> t(a aVar, com.google.android.exoplayer2.trackselection.j jVar, long j10) {
        int i10;
        n1 n1VarC;
        n1 n1VarC2;
        int i11;
        int i12 = aVar.f47819f;
        boolean z10 = i12 != -1;
        n.c cVarK = null;
        if (z10) {
            n1VarC = this.f47797k.c(i12);
            i10 = 1;
        } else {
            i10 = 0;
            n1VarC = null;
        }
        int i13 = aVar.f47820g;
        boolean z11 = i13 != -1;
        if (z11) {
            n1VarC2 = this.f47797k.c(i13);
            i10 += n1VarC2.f48599b;
        } else {
            n1VarC2 = null;
        }
        a2[] a2VarArr = new a2[i10];
        int[] iArr = new int[i10];
        if (z10) {
            a2VarArr[0] = n1VarC.c(0);
            iArr[0] = 5;
            i11 = 1;
        } else {
            i11 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z11) {
            for (int i14 = 0; i14 < n1VarC2.f48599b; i14++) {
                a2 a2VarC = n1VarC2.c(i14);
                a2VarArr[i11] = a2VarC;
                iArr[i11] = 3;
                arrayList.add(a2VarC);
                i11++;
            }
        }
        if (this.f47808v.f47876d && z10) {
            cVarK = this.f47800n.k();
        }
        n.c cVar = cVarK;
        com.google.android.exoplayer2.source.chunk.i<d> iVar = new com.google.android.exoplayer2.source.chunk.i<>(aVar.f47815b, iArr, a2VarArr, this.f47789c.a(this.f47795i, this.f47808v, this.f47793g, this.f47809w, aVar.f47814a, jVar, aVar.f47815b, this.f47794h, z10, arrayList, cVar, this.f47790d), this, this.f47796j, j10, this.f47791e, this.f47803q, this.f47792f, this.f47802p);
        synchronized (this) {
            this.f47801o.put(iVar, cVar);
        }
        return iVar;
    }

    private static Pair<p1, a[]> w(u uVar, List<com.google.android.exoplayer2.source.dash.manifest.a> list, List<com.google.android.exoplayer2.source.dash.manifest.f> list2) {
        int[][] iArrB = B(list);
        int length = iArrB.length;
        boolean[] zArr = new boolean[length];
        a2[][] a2VarArr = new a2[length][];
        int iF = F(length, list, iArrB, zArr, a2VarArr) + length + list2.size();
        n1[] n1VarArr = new n1[iF];
        a[] aVarArr = new a[iF];
        m(list2, n1VarArr, aVarArr, s(uVar, list, iArrB, length, zArr, a2VarArr, n1VarArr, aVarArr));
        return Pair.create(new p1(n1VarArr), aVarArr);
    }

    @p0
    private static com.google.android.exoplayer2.source.dash.manifest.e x(List<com.google.android.exoplayer2.source.dash.manifest.e> list) {
        return y(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    @p0
    private static com.google.android.exoplayer2.source.dash.manifest.e y(List<com.google.android.exoplayer2.source.dash.manifest.e> list, String str) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            com.google.android.exoplayer2.source.dash.manifest.e eVar = list.get(i10);
            if (str.equals(eVar.f47899a)) {
                return eVar;
            }
        }
        return null;
    }

    @p0
    private static com.google.android.exoplayer2.source.dash.manifest.e z(List<com.google.android.exoplayer2.source.dash.manifest.e> list) {
        return y(list, "http://dashif.org/guidelines/trickmode");
    }

    @Override // com.google.android.exoplayer2.source.e1.a
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void n(com.google.android.exoplayer2.source.chunk.i<d> iVar) {
        this.f47804r.n(this);
    }

    public void J() {
        this.f47800n.o();
        for (com.google.android.exoplayer2.source.chunk.i<d> iVar : this.f47805s) {
            iVar.Q(this);
        }
        this.f47804r = null;
    }

    public void N(com.google.android.exoplayer2.source.dash.manifest.c cVar, int i10) {
        this.f47808v = cVar;
        this.f47809w = i10;
        this.f47800n.q(cVar);
        com.google.android.exoplayer2.source.chunk.i<d>[] iVarArr = this.f47805s;
        if (iVarArr != null) {
            for (com.google.android.exoplayer2.source.chunk.i<d> iVar : iVarArr) {
                ((d) iVar.E()).i(cVar, i10);
            }
            this.f47804r.n(this);
        }
        this.f47810x = cVar.d(i10).f47910d;
        for (m mVar : this.f47806t) {
            for (com.google.android.exoplayer2.source.dash.manifest.f fVar : this.f47810x) {
                if (fVar.a().equals(mVar.a())) {
                    mVar.e(fVar, cVar.f47876d && i10 == cVar.e() - 1);
                    break;
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean a() {
        return this.f47807u.a();
    }

    @Override // com.google.android.exoplayer2.source.chunk.i.b
    public synchronized void b(com.google.android.exoplayer2.source.chunk.i<d> iVar) {
        n.c cVarRemove = this.f47801o.remove(iVar);
        if (cVarRemove != null) {
            cVarRemove.n();
        }
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public boolean d(long j10) {
        return this.f47807u.d(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long e() {
        return this.f47807u.e();
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public void f(long j10) {
        this.f47807u.f(j10);
    }

    @Override // com.google.android.exoplayer2.source.c0, com.google.android.exoplayer2.source.e1
    public long g() {
        return this.f47807u.g();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long h(long j10, r3 r3Var) {
        for (com.google.android.exoplayer2.source.chunk.i<d> iVar : this.f47805s) {
            if (iVar.f47659b == 2) {
                return iVar.h(j10, r3Var);
            }
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public List<StreamKey> i(List<com.google.android.exoplayer2.trackselection.j> list) {
        List<com.google.android.exoplayer2.source.dash.manifest.a> list2 = this.f47808v.d(this.f47809w).f47909c;
        ArrayList arrayList = new ArrayList();
        for (com.google.android.exoplayer2.trackselection.j jVar : list) {
            a aVar = this.f47798l[this.f47797k.d(jVar.h())];
            if (aVar.f47816c == 0) {
                int[] iArr = aVar.f47814a;
                int length = jVar.length();
                int[] iArr2 = new int[length];
                for (int i10 = 0; i10 < jVar.length(); i10++) {
                    iArr2[i10] = jVar.e(i10);
                }
                Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).f47863c.size();
                int i11 = 0;
                int i12 = 0;
                for (int i13 = 0; i13 < length; i13++) {
                    int i14 = iArr2[i13];
                    while (true) {
                        int i15 = i12 + size;
                        if (i14 >= i15) {
                            i11++;
                            size = list2.get(iArr[i11]).f47863c.size();
                            i12 = i15;
                        }
                    }
                    arrayList.add(new StreamKey(this.f47809w, iArr[i11], i14 - i12));
                }
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long j(long j10) {
        for (com.google.android.exoplayer2.source.chunk.i<d> iVar : this.f47805s) {
            iVar.S(j10);
        }
        for (m mVar : this.f47806t) {
            mVar.d(j10);
        }
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long k() {
        return com.google.android.exoplayer2.j.f46377b;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public long l(com.google.android.exoplayer2.trackselection.j[] jVarArr, boolean[] zArr, d1[] d1VarArr, boolean[] zArr2, long j10) {
        int[] iArrD = D(jVarArr);
        K(jVarArr, zArr, d1VarArr);
        L(jVarArr, d1VarArr, iArrD);
        M(jVarArr, d1VarArr, zArr2, j10, iArrD);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (d1 d1Var : d1VarArr) {
            if (d1Var instanceof com.google.android.exoplayer2.source.chunk.i) {
                arrayList.add((com.google.android.exoplayer2.source.chunk.i) d1Var);
            } else if (d1Var instanceof m) {
                arrayList2.add((m) d1Var);
            }
        }
        com.google.android.exoplayer2.source.chunk.i<d>[] iVarArrG = G(arrayList.size());
        this.f47805s = iVarArrG;
        arrayList.toArray(iVarArrG);
        m[] mVarArr = new m[arrayList2.size()];
        this.f47806t = mVarArr;
        arrayList2.toArray(mVarArr);
        this.f47807u = this.f47799m.a(this.f47805s);
        return j10;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public p1 o() {
        return this.f47797k;
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void r(c0.a aVar, long j10) {
        this.f47804r = aVar;
        aVar.q(this);
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void u() throws IOException {
        this.f47795i.b();
    }

    @Override // com.google.android.exoplayer2.source.c0
    public void v(long j10, boolean z10) {
        for (com.google.android.exoplayer2.source.chunk.i<d> iVar : this.f47805s) {
            iVar.v(j10, z10);
        }
    }
}
