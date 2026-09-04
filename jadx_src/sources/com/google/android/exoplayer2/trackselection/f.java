package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.p0;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.n3;
import com.google.android.exoplayer2.p3;
import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.n1;
import com.google.android.exoplayer2.source.p1;
import com.google.android.exoplayer2.util.u0;
import com.google.android.exoplayer2.z3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Ordering;
import com.google.common.primitives.Ints;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: DefaultTrackSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public class f extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f50042f = 0.98f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f50043g = new int[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Ordering<Integer> f50044h = Ordering.i(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.E((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Ordering<Integer> f50045i = Ordering.i(new Comparator() { // from class: com.google.android.exoplayer2.trackselection.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.F((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j.b f50046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference<d> f50047e;

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final String f50049c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d f50050d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f50051e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f50052f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f50053g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f50054h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f50055i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int f50056j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final boolean f50057k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f50058l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f50059m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f50060n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f50061o;

        public b(a2 a2Var, d dVar, int i10) {
            int i11;
            int iX;
            int iX2;
            this.f50050d = dVar;
            this.f50049c = f.I(a2Var.f43584d);
            this.f50051e = f.B(i10, false);
            int i12 = 0;
            while (true) {
                i11 = Integer.MAX_VALUE;
                if (i12 >= dVar.f50152n.size()) {
                    iX = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                } else {
                    iX = f.x(a2Var, dVar.f50152n.get(i12), false);
                    if (iX > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.f50053g = i12;
            this.f50052f = iX;
            this.f50054h = Integer.bitCount(a2Var.f43586f & dVar.f50153o);
            boolean z10 = true;
            this.f50057k = (a2Var.f43585e & 1) != 0;
            int i13 = a2Var.f43606z;
            this.f50058l = i13;
            this.f50059m = a2Var.A;
            int i14 = a2Var.f43589i;
            this.f50060n = i14;
            if ((i14 != -1 && i14 > dVar.f50155q) || (i13 != -1 && i13 > dVar.f50154p)) {
                z10 = false;
            }
            this.f50048b = z10;
            String[] strArrS0 = u0.s0();
            int i15 = 0;
            while (true) {
                if (i15 >= strArrS0.length) {
                    iX2 = 0;
                    i15 = Integer.MAX_VALUE;
                    break;
                } else {
                    iX2 = f.x(a2Var, strArrS0[i15], false);
                    if (iX2 > 0) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f50055i = i15;
            this.f50056j = iX2;
            for (int i16 = 0; i16 < dVar.f50156r.size(); i16++) {
                String str = a2Var.f43593m;
                if (str != null && str.equals(dVar.f50156r.get(i16))) {
                    i11 = i16;
                    break;
                }
            }
            this.f50061o = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            Ordering orderingE = (this.f50048b && this.f50051e) ? f.f50044h : f.f50044h.E();
            com.google.common.collect.r rVarJ = com.google.common.collect.r.n().k(this.f50051e, bVar.f50051e).j(Integer.valueOf(this.f50053g), Integer.valueOf(bVar.f50053g), Ordering.z().E()).f(this.f50052f, bVar.f50052f).f(this.f50054h, bVar.f50054h).k(this.f50048b, bVar.f50048b).j(Integer.valueOf(this.f50061o), Integer.valueOf(bVar.f50061o), Ordering.z().E()).j(Integer.valueOf(this.f50060n), Integer.valueOf(bVar.f50060n), this.f50050d.f50160v ? f.f50044h.E() : f.f50045i).k(this.f50057k, bVar.f50057k).j(Integer.valueOf(this.f50055i), Integer.valueOf(bVar.f50055i), Ordering.z().E()).f(this.f50056j, bVar.f50056j).j(Integer.valueOf(this.f50058l), Integer.valueOf(bVar.f50058l), orderingE).j(Integer.valueOf(this.f50059m), Integer.valueOf(bVar.f50059m), orderingE);
            Integer numValueOf = Integer.valueOf(this.f50060n);
            Integer numValueOf2 = Integer.valueOf(bVar.f50060n);
            if (!u0.c(this.f50049c, bVar.f50049c)) {
                orderingE = f.f50045i;
            }
            return rVarJ.j(numValueOf, numValueOf2, orderingE).m();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f50062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f50063c;

        public c(a2 a2Var, int i10) {
            this.f50062b = (a2Var.f43585e & 1) != 0;
            this.f50063c = f.B(i10, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return com.google.common.collect.r.n().k(this.f50063c, cVar.f50063c).k(this.f50062b, cVar.f50062b).m();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class d extends u implements com.google.android.exoplayer2.i {
        public static final d L3;

        @Deprecated
        public static final d M3;
        private static final int N3 = 1000;
        private static final int O3 = 1001;
        private static final int P3 = 1002;
        private static final int Q3 = 1003;
        private static final int R3 = 1004;
        private static final int S3 = 1005;
        private static final int T3 = 1006;
        private static final int U3 = 1007;
        private static final int V3 = 1008;
        private static final int W3 = 1009;
        private static final int X3 = 1010;
        private static final int Y3 = 1011;
        private static final int Z3 = 1012;

        /* JADX INFO: renamed from: a4, reason: collision with root package name */
        private static final int f50064a4 = 1013;

        /* JADX INFO: renamed from: b4, reason: collision with root package name */
        private static final int f50065b4 = 1014;

        /* JADX INFO: renamed from: c4, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<d> f50066c4;
        public final boolean G2;
        public final boolean G3;
        private final SparseArray<Map<p1, C0399f>> J3;
        private final SparseBooleanArray K3;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public final int f50067b0;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public final boolean f50068c0;

        /* JADX INFO: renamed from: p1, reason: collision with root package name */
        public final boolean f50069p1;

        /* JADX INFO: renamed from: p2, reason: collision with root package name */
        public final boolean f50070p2;

        /* JADX INFO: renamed from: p3, reason: collision with root package name */
        public final boolean f50071p3;

        /* JADX INFO: renamed from: x1, reason: collision with root package name */
        public final boolean f50072x1;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        public final boolean f50073x2;

        /* JADX INFO: renamed from: y1, reason: collision with root package name */
        public final boolean f50074y1;

        /* JADX INFO: renamed from: y2, reason: collision with root package name */
        public final boolean f50075y2;

        static {
            d dVarY = new e().y();
            L3 = dVarY;
            M3 = dVarY;
            f50066c4 = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.trackselection.g
                @Override // com.google.android.exoplayer2.i.a
                public final com.google.android.exoplayer2.i a(Bundle bundle) {
                    return f.d.u(bundle);
                }
            };
        }

        private d(e eVar) {
            super(eVar);
            this.f50068c0 = eVar.f50076y;
            this.f50069p1 = eVar.f50077z;
            this.f50072x1 = eVar.A;
            this.f50074y1 = eVar.B;
            this.f50070p2 = eVar.C;
            this.f50073x2 = eVar.D;
            this.f50075y2 = eVar.E;
            this.f50067b0 = eVar.F;
            this.G2 = eVar.G;
            this.f50071p3 = eVar.H;
            this.G3 = eVar.I;
            this.J3 = eVar.J;
            this.K3 = eVar.K;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String f(int i10) {
            return Integer.toString(i10, 36);
        }

        private static boolean l(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean m(SparseArray<Map<p1, C0399f>> sparseArray, SparseArray<Map<p1, C0399f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (iIndexOfKey < 0 || !n(sparseArray.valueAt(i10), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean n(Map<p1, C0399f> map, Map<p1, C0399f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<p1, C0399f> entry : map.entrySet()) {
                p1 key = entry.getKey();
                if (!map2.containsKey(key) || !u0.c(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static d p(Context context) {
            return new e(context).y();
        }

        private static int[] q(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
                iArr[i10] = sparseBooleanArray.keyAt(i10);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d u(Bundle bundle) {
            return new e(bundle).y();
        }

        private static void v(Bundle bundle, SparseArray<Map<p1, C0399f>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                int iKeyAt = sparseArray.keyAt(i10);
                for (Map.Entry<p1, C0399f> entry : sparseArray.valueAt(i10).entrySet()) {
                    C0399f value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(f(1011), Ints.B(arrayList));
                bundle.putParcelableArrayList(f(1012), com.google.android.exoplayer2.util.d.g(arrayList2));
                bundle.putSparseParcelableArray(f(1013), com.google.android.exoplayer2.util.d.i(sparseArray2));
            }
        }

        @Override // com.google.android.exoplayer2.trackselection.u, com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundleA = super.a();
            bundleA.putBoolean(f(1000), this.f50068c0);
            bundleA.putBoolean(f(1001), this.f50069p1);
            bundleA.putBoolean(f(1002), this.f50072x1);
            bundleA.putBoolean(f(1003), this.f50074y1);
            bundleA.putBoolean(f(1004), this.f50070p2);
            bundleA.putBoolean(f(1005), this.f50073x2);
            bundleA.putBoolean(f(1006), this.f50075y2);
            bundleA.putInt(f(1007), this.f50067b0);
            bundleA.putBoolean(f(1008), this.G2);
            bundleA.putBoolean(f(1009), this.f50071p3);
            bundleA.putBoolean(f(1010), this.G3);
            v(bundleA, this.J3);
            bundleA.putIntArray(f(1014), q(this.K3));
            return bundleA;
        }

        @Override // com.google.android.exoplayer2.trackselection.u
        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.f50068c0 == dVar.f50068c0 && this.f50069p1 == dVar.f50069p1 && this.f50072x1 == dVar.f50072x1 && this.f50074y1 == dVar.f50074y1 && this.f50070p2 == dVar.f50070p2 && this.f50073x2 == dVar.f50073x2 && this.f50075y2 == dVar.f50075y2 && this.f50067b0 == dVar.f50067b0 && this.G2 == dVar.G2 && this.f50071p3 == dVar.f50071p3 && this.G3 == dVar.G3 && l(this.K3, dVar.K3) && m(this.J3, dVar.J3);
        }

        @Override // com.google.android.exoplayer2.trackselection.u
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f50068c0 ? 1 : 0)) * 31) + (this.f50069p1 ? 1 : 0)) * 31) + (this.f50072x1 ? 1 : 0)) * 31) + (this.f50074y1 ? 1 : 0)) * 31) + (this.f50070p2 ? 1 : 0)) * 31) + (this.f50073x2 ? 1 : 0)) * 31) + (this.f50075y2 ? 1 : 0)) * 31) + this.f50067b0) * 31) + (this.G2 ? 1 : 0)) * 31) + (this.f50071p3 ? 1 : 0)) * 31) + (this.G3 ? 1 : 0);
        }

        @Override // com.google.android.exoplayer2.trackselection.u
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public e d() {
            return new e(this);
        }

        public final boolean r(int i10) {
            return this.K3.get(i10);
        }

        @p0
        public final C0399f s(int i10, p1 p1Var) {
            Map<p1, C0399f> map = this.J3.get(i10);
            if (map != null) {
                return map.get(p1Var);
            }
            return null;
        }

        public final boolean t(int i10, p1 p1Var) {
            Map<p1, C0399f> map = this.J3.get(i10);
            return map != null && map.containsKey(p1Var);
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class e extends u.a {
        private boolean A;
        private boolean B;
        private boolean C;
        private boolean D;
        private boolean E;
        private int F;
        private boolean G;
        private boolean H;
        private boolean I;
        private final SparseArray<Map<p1, C0399f>> J;
        private final SparseBooleanArray K;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private boolean f50076y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private boolean f50077z;

        @Deprecated
        public e() {
            this.J = new SparseArray<>();
            this.K = new SparseBooleanArray();
            A0();
        }

        public e(Context context) {
            super(context);
            this.J = new SparseArray<>();
            this.K = new SparseBooleanArray();
            A0();
        }

        private e(Bundle bundle) {
            super(bundle);
            d dVar = d.L3;
            N0(bundle.getBoolean(d.f(1000), dVar.f50068c0));
            H0(bundle.getBoolean(d.f(1001), dVar.f50069p1));
            I0(bundle.getBoolean(d.f(1002), dVar.f50072x1));
            L0(bundle.getBoolean(d.f(1003), dVar.f50074y1));
            E0(bundle.getBoolean(d.f(1004), dVar.f50070p2));
            F0(bundle.getBoolean(d.f(1005), dVar.f50073x2));
            D0(bundle.getBoolean(d.f(1006), dVar.f50075y2));
            J0(bundle.getInt(d.f(1007), dVar.f50067b0));
            M0(bundle.getBoolean(d.f(1008), dVar.G2));
            p1(bundle.getBoolean(d.f(1009), dVar.f50071p3));
            G0(bundle.getBoolean(d.f(1010), dVar.G3));
            this.J = new SparseArray<>();
            n1(bundle);
            this.K = B0(bundle.getIntArray(d.f(1014)));
        }

        private e(d dVar) {
            super(dVar);
            this.F = dVar.f50067b0;
            this.f50076y = dVar.f50068c0;
            this.f50077z = dVar.f50069p1;
            this.A = dVar.f50072x1;
            this.B = dVar.f50074y1;
            this.C = dVar.f50070p2;
            this.D = dVar.f50073x2;
            this.E = dVar.f50075y2;
            this.G = dVar.G2;
            this.H = dVar.f50071p3;
            this.I = dVar.G3;
            this.J = z0(dVar.J3);
            this.K = dVar.K3.clone();
        }

        private void A0() {
            this.f50076y = true;
            this.f50077z = false;
            this.A = true;
            this.B = true;
            this.C = false;
            this.D = false;
            this.E = false;
            this.F = 0;
            this.G = true;
            this.H = false;
            this.I = true;
        }

        private SparseBooleanArray B0(@p0 int[] iArr) {
            if (iArr == null) {
                return new SparseBooleanArray();
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
            for (int i10 : iArr) {
                sparseBooleanArray.append(i10, true);
            }
            return sparseBooleanArray;
        }

        private void n1(Bundle bundle) {
            int[] intArray = bundle.getIntArray(d.f(1011));
            List listC = com.google.android.exoplayer2.util.d.c(p1.f48608g, bundle.getParcelableArrayList(d.f(1012)), ImmutableList.B());
            SparseArray sparseArrayD = com.google.android.exoplayer2.util.d.d(C0399f.f50081i, bundle.getSparseParcelableArray(d.f(1013)), new SparseArray());
            if (intArray == null || intArray.length != listC.size()) {
                return;
            }
            for (int i10 = 0; i10 < intArray.length; i10++) {
                m1(intArray[i10], (p1) listC.get(i10), (C0399f) sparseArrayD.get(i10));
            }
        }

        private static SparseArray<Map<p1, C0399f>> z0(SparseArray<Map<p1, C0399f>> sparseArray) {
            SparseArray<Map<p1, C0399f>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: C0, reason: merged with bridge method [inline-methods] */
        public e D(u uVar) {
            super.D(uVar);
            return this;
        }

        public e D0(boolean z10) {
            this.E = z10;
            return this;
        }

        public e E0(boolean z10) {
            this.C = z10;
            return this;
        }

        public e F0(boolean z10) {
            this.D = z10;
            return this;
        }

        public e G0(boolean z10) {
            this.I = z10;
            return this;
        }

        public e H0(boolean z10) {
            this.f50077z = z10;
            return this;
        }

        public e I0(boolean z10) {
            this.A = z10;
            return this;
        }

        public e J0(int i10) {
            this.F = i10;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: K0, reason: merged with bridge method [inline-methods] */
        public e E(Set<Integer> set) {
            super.E(set);
            return this;
        }

        public e L0(boolean z10) {
            this.B = z10;
            return this;
        }

        public e M0(boolean z10) {
            this.G = z10;
            return this;
        }

        public e N0(boolean z10) {
            this.f50076y = z10;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: O0, reason: merged with bridge method [inline-methods] */
        public e F(boolean z10) {
            super.F(z10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
        public e G(boolean z10) {
            super.G(z10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
        public e H(int i10) {
            super.H(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
        public e I(int i10) {
            super.I(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
        public e J(int i10) {
            super.J(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
        public e K(int i10) {
            super.K(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: U0, reason: merged with bridge method [inline-methods] */
        public e L(int i10, int i11) {
            super.L(i10, i11);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
        public e M() {
            super.M();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
        public e N(int i10) {
            super.N(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
        public e O(int i10) {
            super.O(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
        public e P(int i10, int i11) {
            super.P(i10, i11);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
        public e Q(@p0 String str) {
            super.Q(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
        public e R(String... strArr) {
            super.R(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
        public e S(@p0 String str) {
            super.S(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
        public e T(String... strArr) {
            super.T(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: d1, reason: merged with bridge method [inline-methods] */
        public e U(int i10) {
            super.U(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: e1, reason: merged with bridge method [inline-methods] */
        public e V(@p0 String str) {
            super.V(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
        public e W(Context context) {
            super.W(context);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
        public e Y(String... strArr) {
            super.Y(strArr);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
        public e Z(int i10) {
            super.Z(i10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: i1, reason: merged with bridge method [inline-methods] */
        public e a0(@p0 String str) {
            super.a0(str);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
        public e b0(String... strArr) {
            super.b0(strArr);
            return this;
        }

        public final e k1(int i10, boolean z10) {
            if (this.K.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.K.put(i10, true);
            } else {
                this.K.delete(i10);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: l1, reason: merged with bridge method [inline-methods] */
        public e c0(boolean z10) {
            super.c0(z10);
            return this;
        }

        @Deprecated
        public final e m1(int i10, p1 p1Var, @p0 C0399f c0399f) {
            Map<p1, C0399f> map = this.J.get(i10);
            if (map == null) {
                map = new HashMap<>();
                this.J.put(i10, map);
            }
            if (map.containsKey(p1Var) && u0.c(map.get(p1Var), c0399f)) {
                return this;
            }
            map.put(p1Var, c0399f);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: o1, reason: merged with bridge method [inline-methods] */
        public e d0(r rVar) {
            super.d0(rVar);
            return this;
        }

        public e p1(boolean z10) {
            this.H = z10;
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: q1, reason: merged with bridge method [inline-methods] */
        public e e0(int i10, int i11, boolean z10) {
            super.e0(i10, i11, z10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: r1, reason: merged with bridge method [inline-methods] */
        public e f0(Context context, boolean z10) {
            super.f0(context, z10);
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: t0, reason: merged with bridge method [inline-methods] */
        public d y() {
            return new d(this);
        }

        @Deprecated
        public final e u0(int i10, p1 p1Var) {
            Map<p1, C0399f> map = this.J.get(i10);
            if (map != null && map.containsKey(p1Var)) {
                map.remove(p1Var);
                if (map.isEmpty()) {
                    this.J.remove(i10);
                }
            }
            return this;
        }

        @Deprecated
        public final e v0() {
            if (this.J.size() == 0) {
                return this;
            }
            this.J.clear();
            return this;
        }

        @Deprecated
        public final e w0(int i10) {
            Map<p1, C0399f> map = this.J.get(i10);
            if (map != null && !map.isEmpty()) {
                this.J.remove(i10);
            }
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
        public e z() {
            super.z();
            return this;
        }

        @Override // com.google.android.exoplayer2.trackselection.u.a
        /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
        public e A() {
            super.A();
            return this;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.trackselection.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class C0399f implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f50078f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f50079g = 1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f50080h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<C0399f> f50081i = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.trackselection.h
            @Override // com.google.android.exoplayer2.i.a
            public final com.google.android.exoplayer2.i a(Bundle bundle) {
                return f.C0399f.e(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f50083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f50084d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f50085e;

        public C0399f(int i10, int... iArr) {
            this(i10, iArr, 0);
        }

        public C0399f(int i10, int[] iArr, int i11) {
            this.f50082b = i10;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f50083c = iArrCopyOf;
            this.f50084d = iArr.length;
            this.f50085e = i11;
            Arrays.sort(iArrCopyOf);
        }

        private static String d(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ C0399f e(Bundle bundle) {
            boolean z10 = false;
            int i10 = bundle.getInt(d(0), -1);
            int[] intArray = bundle.getIntArray(d(1));
            int i11 = bundle.getInt(d(2), -1);
            if (i10 >= 0 && i11 >= 0) {
                z10 = true;
            }
            com.google.android.exoplayer2.util.a.a(z10);
            com.google.android.exoplayer2.util.a.g(intArray);
            return new C0399f(i10, intArray, i11);
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(d(0), this.f50082b);
            bundle.putIntArray(d(1), this.f50083c);
            bundle.putInt(d(2), this.f50085e);
            return bundle;
        }

        public boolean c(int i10) {
            for (int i11 : this.f50083c) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0399f.class != obj.getClass()) {
                return false;
            }
            C0399f c0399f = (C0399f) obj;
            return this.f50082b == c0399f.f50082b && Arrays.equals(this.f50083c, c0399f.f50083c) && this.f50085e == c0399f.f50085e;
        }

        public int hashCode() {
            return (((this.f50082b * 31) + Arrays.hashCode(this.f50083c)) * 31) + this.f50085e;
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class g implements Comparable<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f50087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f50088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f50089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f50090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f50091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f50092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int f50093i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f50094j;

        public g(a2 a2Var, d dVar, int i10, @p0 String str) {
            int iX;
            boolean z10 = false;
            this.f50087c = f.B(i10, false);
            int i11 = a2Var.f43585e & (~dVar.f50067b0);
            this.f50088d = (i11 & 1) != 0;
            this.f50089e = (i11 & 2) != 0;
            int i12 = Integer.MAX_VALUE;
            ImmutableList<String> immutableListD = dVar.f50157s.isEmpty() ? ImmutableList.D("") : dVar.f50157s;
            int i13 = 0;
            while (true) {
                if (i13 >= immutableListD.size()) {
                    iX = 0;
                    break;
                }
                iX = f.x(a2Var, immutableListD.get(i13), dVar.f50159u);
                if (iX > 0) {
                    i12 = i13;
                    break;
                }
                i13++;
            }
            this.f50090f = i12;
            this.f50091g = iX;
            int iBitCount = Integer.bitCount(a2Var.f43586f & dVar.f50158t);
            this.f50092h = iBitCount;
            this.f50094j = (a2Var.f43586f & bb.c.b.Wh) != 0;
            int iX2 = f.x(a2Var, str, f.I(str) == null);
            this.f50093i = iX2;
            if (iX > 0 || ((dVar.f50157s.isEmpty() && iBitCount > 0) || this.f50088d || (this.f50089e && iX2 > 0))) {
                z10 = true;
            }
            this.f50086b = z10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            com.google.common.collect.r rVarF = com.google.common.collect.r.n().k(this.f50087c, gVar.f50087c).j(Integer.valueOf(this.f50090f), Integer.valueOf(gVar.f50090f), Ordering.z().E()).f(this.f50091g, gVar.f50091g).f(this.f50092h, gVar.f50092h).k(this.f50088d, gVar.f50088d).j(Boolean.valueOf(this.f50089e), Boolean.valueOf(gVar.f50089e), this.f50091g == 0 ? Ordering.z() : Ordering.z().E()).f(this.f50093i, gVar.f50093i);
            if (this.f50092h == 0) {
                rVarF = rVarF.l(this.f50094j, gVar.f50094j);
            }
            return rVarF.m();
        }
    }

    /* JADX INFO: compiled from: DefaultTrackSelector.java */
    public static final class h implements Comparable<h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50095b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f50096c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f50097d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f50098e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f50099f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f50100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f50101h;

        /* JADX WARN: Code duplicated, block: B:21:0x0033  */
        /* JADX WARN: Code duplicated, block: B:41:0x005e  */
        public h(a2 a2Var, d dVar, int i10, boolean z10) {
            boolean z11;
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            this.f50096c = dVar;
            boolean z12 = true;
            if (!z10 || (((i14 = a2Var.f43598r) != -1 && i14 > dVar.f50140b) || ((i15 = a2Var.f43599s) != -1 && i15 > dVar.f50141c))) {
                z11 = false;
            } else {
                float f10 = a2Var.f43600t;
                if ((f10 == -1.0f || f10 <= dVar.f50142d) && ((i16 = a2Var.f43589i) == -1 || i16 <= dVar.f50143e)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            this.f50095b = z11;
            if (!z10 || (((i11 = a2Var.f43598r) != -1 && i11 < dVar.f50144f) || ((i12 = a2Var.f43599s) != -1 && i12 < dVar.f50145g))) {
                z12 = false;
            } else {
                float f11 = a2Var.f43600t;
                if ((f11 != -1.0f && f11 < dVar.f50146h) || ((i13 = a2Var.f43589i) != -1 && i13 < dVar.f50147i)) {
                    z12 = false;
                }
            }
            this.f50097d = z12;
            this.f50098e = f.B(i10, false);
            this.f50099f = a2Var.f43589i;
            this.f50100g = a2Var.w();
            int i17 = Integer.MAX_VALUE;
            for (int i18 = 0; i18 < dVar.f50151m.size(); i18++) {
                String str = a2Var.f43593m;
                if (str != null && str.equals(dVar.f50151m.get(i18))) {
                    i17 = i18;
                    break;
                }
            }
            this.f50101h = i17;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            Ordering orderingE = (this.f50095b && this.f50098e) ? f.f50044h : f.f50044h.E();
            return com.google.common.collect.r.n().k(this.f50098e, hVar.f50098e).k(this.f50095b, hVar.f50095b).k(this.f50097d, hVar.f50097d).j(Integer.valueOf(this.f50101h), Integer.valueOf(hVar.f50101h), Ordering.z().E()).j(Integer.valueOf(this.f50099f), Integer.valueOf(hVar.f50099f), this.f50096c.f50160v ? f.f50044h.E() : f.f50045i).j(Integer.valueOf(this.f50100g), Integer.valueOf(hVar.f50100g), orderingE).j(Integer.valueOf(this.f50099f), Integer.valueOf(hVar.f50099f), orderingE).m();
        }
    }

    @Deprecated
    public f() {
        this(d.L3, new com.google.android.exoplayer2.trackselection.a.b());
    }

    public f(Context context) {
        this(context, new com.google.android.exoplayer2.trackselection.a.b());
    }

    public f(Context context, j.b bVar) {
        this(d.p(context), bVar);
    }

    public f(d dVar, j.b bVar) {
        this.f50046d = bVar;
        this.f50047e = new AtomicReference<>(dVar);
    }

    @Deprecated
    public f(j.b bVar) {
        this(d.L3, bVar);
    }

    private static List<Integer> A(n1 n1Var, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(n1Var.f48599b);
        for (int i13 = 0; i13 < n1Var.f48599b; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (i10 != Integer.MAX_VALUE && i11 != Integer.MAX_VALUE) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < n1Var.f48599b; i15++) {
                a2 a2VarC = n1Var.c(i15);
                int i16 = a2VarC.f43598r;
                if (i16 > 0 && (i12 = a2VarC.f43599s) > 0) {
                    Point pointY = y(z10, i10, i11, i16, i12);
                    int i17 = a2VarC.f43598r;
                    int i18 = a2VarC.f43599s;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (pointY.x * f50042f)) && i18 >= ((int) (pointY.y * f50042f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iW = n1Var.c(((Integer) arrayList.get(size)).intValue()).w();
                    if (iW == -1 || iW > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean B(int i10, boolean z10) {
        int iD = n3.d(i10);
        return iD == 4 || (z10 && iD == 3);
    }

    private static boolean C(a2 a2Var, int i10, a2 a2Var2, int i11, boolean z10, boolean z11, boolean z12) {
        int i12;
        int i13;
        String str;
        int i14;
        if (!B(i10, false) || (i12 = a2Var.f43589i) == -1 || i12 > i11) {
            return false;
        }
        if (!z12 && ((i14 = a2Var.f43606z) == -1 || i14 != a2Var2.f43606z)) {
            return false;
        }
        if (z10 || ((str = a2Var.f43593m) != null && TextUtils.equals(str, a2Var2.f43593m))) {
            return z11 || ((i13 = a2Var.A) != -1 && i13 == a2Var2.A);
        }
        return false;
    }

    private static boolean D(a2 a2Var, @p0 String str, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        int i20;
        if ((a2Var.f43586f & 16384) != 0 || !B(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !u0.c(a2Var.f43593m, str)) {
            return false;
        }
        int i21 = a2Var.f43598r;
        if (i21 != -1 && (i16 > i21 || i21 > i12)) {
            return false;
        }
        int i22 = a2Var.f43599s;
        if (i22 != -1 && (i17 > i22 || i22 > i13)) {
            return false;
        }
        float f10 = a2Var.f43600t;
        return (f10 == -1.0f || (((float) i18) <= f10 && f10 <= ((float) i14))) && (i20 = a2Var.f43589i) != -1 && i19 <= i20 && i20 <= i15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int E(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int F(Integer num, Integer num2) {
        return 0;
    }

    private static void H(l.a aVar, int[][][] iArr, p3[] p3VarArr, j[] jVarArr) {
        boolean z10;
        boolean z11 = false;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        while (true) {
            if (i10 >= aVar.c()) {
                z10 = true;
                break;
            }
            int iF = aVar.f(i10);
            j jVar = jVarArr[i10];
            if ((iF == 1 || iF == 2) && jVar != null && J(iArr[i10], aVar.g(i10), jVar)) {
                if (iF == 1) {
                    if (i12 != -1) {
                        z10 = false;
                        break;
                    }
                    i12 = i10;
                } else {
                    if (i11 != -1) {
                        z10 = false;
                        break;
                    }
                    i11 = i10;
                }
            }
            i10++;
        }
        if (i12 != -1 && i11 != -1) {
            z11 = true;
        }
        if (z10 && z11) {
            p3 p3Var = new p3(true);
            p3VarArr[i12] = p3Var;
            p3VarArr[i11] = p3Var;
        }
    }

    @p0
    protected static String I(@p0 String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, com.google.android.exoplayer2.j.f46383c1)) {
            return null;
        }
        return str;
    }

    private static boolean J(int[][] iArr, p1 p1Var, j jVar) {
        if (jVar == null) {
            return false;
        }
        int iD = p1Var.d(jVar.h());
        for (int i10 = 0; i10 < jVar.length(); i10++) {
            if (n3.e(iArr[iD][jVar.e(i10)]) != 32) {
                return false;
            }
        }
        return true;
    }

    @p0
    private static j.a K(p1 p1Var, int[][] iArr, int i10, d dVar) {
        d dVar2 = dVar;
        int i11 = dVar2.f50072x1 ? 24 : 16;
        boolean z10 = dVar2.f50069p1 && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < p1Var.f48609b) {
            n1 n1VarC = p1Var.c(i12);
            int i13 = i12;
            int[] iArrW = w(n1VarC, iArr[i12], z10, i11, dVar2.f50140b, dVar2.f50141c, dVar2.f50142d, dVar2.f50143e, dVar2.f50144f, dVar2.f50145g, dVar2.f50146h, dVar2.f50147i, dVar2.f50148j, dVar2.f50149k, dVar2.f50150l);
            if (iArrW.length > 0) {
                return new j.a(n1VarC, iArrW);
            }
            i12 = i13 + 1;
            dVar2 = dVar;
        }
        return null;
    }

    @p0
    private static j.a N(p1 p1Var, int[][] iArr, d dVar) {
        int i10 = -1;
        n1 n1Var = null;
        h hVar = null;
        for (int i11 = 0; i11 < p1Var.f48609b; i11++) {
            n1 n1VarC = p1Var.c(i11);
            List<Integer> listA = A(n1VarC, dVar.f50148j, dVar.f50149k, dVar.f50150l);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < n1VarC.f48599b; i12++) {
                a2 a2VarC = n1VarC.c(i12);
                if ((a2VarC.f43586f & 16384) == 0 && B(iArr2[i12], dVar.G2)) {
                    h hVar2 = new h(a2VarC, dVar, iArr2[i12], listA.contains(Integer.valueOf(i12)));
                    if ((hVar2.f50095b || dVar.f50068c0) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        n1Var = n1VarC;
                        i10 = i12;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (n1Var == null) {
            return null;
        }
        return new j.a(n1Var, i10);
    }

    private void S(d dVar) {
        com.google.android.exoplayer2.util.a.g(dVar);
        if (this.f50047e.getAndSet(dVar).equals(dVar)) {
            return;
        }
        d();
    }

    private static void t(n1 n1Var, int[] iArr, int i10, @p0 String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!D(n1Var.c(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                list.remove(size);
            }
        }
    }

    private static int[] u(n1 n1Var, int[] iArr, int i10, int i11, boolean z10, boolean z11, boolean z12) {
        a2 a2VarC = n1Var.c(i10);
        int[] iArr2 = new int[n1Var.f48599b];
        int i12 = 0;
        for (int i13 = 0; i13 < n1Var.f48599b; i13++) {
            if (i13 == i10 || C(n1Var.c(i13), iArr[i13], a2VarC, i11, z10, z11, z12)) {
                iArr2[i12] = i13;
                i12++;
            }
        }
        return Arrays.copyOf(iArr2, i12);
    }

    private static int v(n1 n1Var, int[] iArr, int i10, @p0 String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, List<Integer> list) {
        int i19 = 0;
        for (int i20 = 0; i20 < list.size(); i20++) {
            int iIntValue = list.get(i20).intValue();
            if (D(n1Var.c(iIntValue), str, iArr[iIntValue], i10, i11, i12, i13, i14, i15, i16, i17, i18)) {
                i19++;
            }
        }
        return i19;
    }

    private static int[] w(n1 n1Var, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, boolean z11) {
        String str;
        int i21;
        int i22;
        HashSet hashSet;
        if (n1Var.f48599b < 2) {
            return f50043g;
        }
        List<Integer> listA = A(n1Var, i19, i20, z11);
        if (listA.size() < 2) {
            return f50043g;
        }
        if (z10) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i23 = 0;
            int i24 = 0;
            while (i24 < listA.size()) {
                String str3 = n1Var.c(listA.get(i24).intValue()).f43593m;
                if (hashSet2.add(str3)) {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                    int iV = v(n1Var, iArr, i10, str3, i11, i12, i13, i14, i15, i16, i17, i18, listA);
                    if (iV > i21) {
                        i23 = iV;
                        str2 = str3;
                    }
                    i24 = i22 + 1;
                    hashSet2 = hashSet;
                } else {
                    i21 = i23;
                    i22 = i24;
                    hashSet = hashSet2;
                }
                i23 = i21;
                i24 = i22 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        t(n1Var, iArr, i10, str, i11, i12, i13, i14, i15, i16, i17, i18, listA);
        return listA.size() < 2 ? f50043g : Ints.B(listA);
    }

    protected static int x(a2 a2Var, @p0 String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(a2Var.f43584d)) {
            return 4;
        }
        String strI = I(str);
        String strI2 = I(a2Var.f43584d);
        if (strI2 == null || strI == null) {
            return (z10 && strI2 == null) ? 1 : 0;
        }
        if (strI2.startsWith(strI) || strI.startsWith(strI2)) {
            return 3;
        }
        return u0.q1(strI2, Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0].equals(u0.q1(strI, Constants.ACCEPT_TIME_SEPARATOR_SERVER)[0]) ? 2 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0010  */
    private static Point y(boolean z10, int i10, int i11, int i12, int i13) {
        if (z10) {
            if ((i12 > i13) == (i10 > i11)) {
                i11 = i10;
                i10 = i11;
            }
        } else {
            i11 = i10;
            i10 = i11;
        }
        int i14 = i12 * i10;
        int i15 = i13 * i11;
        return i14 >= i15 ? new Point(i11, u0.m(i15, i12)) : new Point(u0.m(i14, i13), i10);
    }

    protected j.a G(l.a aVar, d dVar, int i10, j.a aVar2) {
        int iF = aVar.f(i10);
        if (dVar.r(i10) || dVar.f50163y.contains(Integer.valueOf(iF))) {
            return null;
        }
        p1 p1VarG = aVar.g(i10);
        if (dVar.t(i10, p1VarG)) {
            C0399f c0399fS = dVar.s(i10, p1VarG);
            if (c0399fS == null) {
                return null;
            }
            return new j.a(p1VarG.c(c0399fS.f50082b), c0399fS.f50083c, c0399fS.f50085e);
        }
        for (int i11 = 0; i11 < p1VarG.f48609b; i11++) {
            n1 n1VarC = p1VarG.c(i11);
            r.c cVarE = dVar.f50162x.e(n1VarC);
            if (cVarE != null) {
                return new j.a(n1VarC, Ints.B(cVarE.f50137c));
            }
        }
        return aVar2;
    }

    protected j.a[] L(l.a aVar, int[][][] iArr, int[] iArr2, d dVar) throws ExoPlaybackException {
        boolean z10;
        String str;
        int i10;
        b bVar;
        String str2;
        int i11;
        int iC = aVar.c();
        j.a[] aVarArr = new j.a[iC];
        int i12 = 0;
        boolean z11 = false;
        int i13 = 0;
        boolean z12 = false;
        while (true) {
            z10 = true;
            if (i13 >= iC) {
                break;
            }
            if (2 == aVar.f(i13)) {
                if (!z11) {
                    j.a aVarQ = Q(aVar.g(i13), iArr[i13], iArr2[i13], dVar, true);
                    aVarArr[i13] = aVarQ;
                    z11 = aVarQ != null;
                }
                z12 |= aVar.g(i13).f48609b > 0;
            }
            i13++;
        }
        int i14 = 0;
        int i15 = -1;
        b bVar2 = null;
        String str3 = null;
        while (i14 < iC) {
            if (z10 == aVar.f(i14)) {
                boolean z13 = (dVar.G3 || !z12) ? z10 : false;
                i10 = i15;
                bVar = bVar2;
                str2 = str3;
                i11 = i14;
                Pair<j.a, b> pairM = M(aVar.g(i14), iArr[i14], iArr2[i14], dVar, z13);
                if (pairM != null && (bVar == null || ((b) pairM.second).compareTo(bVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    j.a aVar2 = (j.a) pairM.first;
                    aVarArr[i11] = aVar2;
                    str3 = aVar2.f50102a.c(aVar2.f50103b[0]).f43584d;
                    bVar2 = (b) pairM.second;
                    i15 = i11;
                }
                i14 = i11 + 1;
                z10 = true;
            } else {
                i10 = i15;
                bVar = bVar2;
                str2 = str3;
                i11 = i14;
            }
            i15 = i10;
            bVar2 = bVar;
            str3 = str2;
            i14 = i11 + 1;
            z10 = true;
        }
        String str4 = str3;
        int i16 = -1;
        g gVar = null;
        while (i12 < iC) {
            int iF = aVar.f(i12);
            if (iF == 1) {
                str = str4;
            } else if (iF == 2) {
                str = str4;
            } else if (iF != 3) {
                aVarArr[i12] = O(iF, aVar.g(i12), iArr[i12], dVar);
                str = str4;
            } else {
                str = str4;
                Pair<j.a, g> pairP = P(aVar.g(i12), iArr[i12], dVar, str);
                if (pairP != null && (gVar == null || ((g) pairP.second).compareTo(gVar) > 0)) {
                    if (i16 != -1) {
                        aVarArr[i16] = null;
                    }
                    aVarArr[i12] = (j.a) pairP.first;
                    gVar = (g) pairP.second;
                    i16 = i12;
                }
            }
            i12++;
            str4 = str;
        }
        return aVarArr;
    }

    @p0
    protected Pair<j.a, b> M(p1 p1Var, int[][] iArr, int i10, d dVar, boolean z10) throws ExoPlaybackException {
        j.a aVar = null;
        b bVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < p1Var.f48609b; i13++) {
            n1 n1VarC = p1Var.c(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < n1VarC.f48599b; i14++) {
                if (B(iArr2[i14], dVar.G2)) {
                    b bVar2 = new b(n1VarC.c(i14), dVar, iArr2[i14]);
                    if ((bVar2.f50048b || dVar.f50074y1) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        n1 n1VarC2 = p1Var.c(i11);
        if (!dVar.f50161w && !dVar.f50160v && z10) {
            int[] iArrU = u(n1VarC2, iArr[i11], i12, dVar.f50155q, dVar.f50070p2, dVar.f50073x2, dVar.f50075y2);
            if (iArrU.length > 1) {
                aVar = new j.a(n1VarC2, iArrU);
            }
        }
        if (aVar == null) {
            aVar = new j.a(n1VarC2, i12);
        }
        return Pair.create(aVar, (b) com.google.android.exoplayer2.util.a.g(bVar));
    }

    @p0
    protected j.a O(int i10, p1 p1Var, int[][] iArr, d dVar) throws ExoPlaybackException {
        n1 n1Var = null;
        c cVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < p1Var.f48609b; i12++) {
            n1 n1VarC = p1Var.c(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < n1VarC.f48599b; i13++) {
                if (B(iArr2[i13], dVar.G2)) {
                    c cVar2 = new c(n1VarC.c(i13), iArr2[i13]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        n1Var = n1VarC;
                        i11 = i13;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (n1Var == null) {
            return null;
        }
        return new j.a(n1Var, i11);
    }

    @p0
    protected Pair<j.a, g> P(p1 p1Var, int[][] iArr, d dVar, @p0 String str) throws ExoPlaybackException {
        int i10 = -1;
        n1 n1Var = null;
        g gVar = null;
        for (int i11 = 0; i11 < p1Var.f48609b; i11++) {
            n1 n1VarC = p1Var.c(i11);
            int[] iArr2 = iArr[i11];
            for (int i12 = 0; i12 < n1VarC.f48599b; i12++) {
                if (B(iArr2[i12], dVar.G2)) {
                    g gVar2 = new g(n1VarC.c(i12), dVar, iArr2[i12], str);
                    if (gVar2.f50086b && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        n1Var = n1VarC;
                        i10 = i12;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (n1Var == null) {
            return null;
        }
        return Pair.create(new j.a(n1Var, i10), (g) com.google.android.exoplayer2.util.a.g(gVar));
    }

    @p0
    protected j.a Q(p1 p1Var, int[][] iArr, int i10, d dVar, boolean z10) throws ExoPlaybackException {
        j.a aVarK = (dVar.f50161w || dVar.f50160v || !z10) ? null : K(p1Var, iArr, i10, dVar);
        return aVarK == null ? N(p1Var, iArr, dVar) : aVarK;
    }

    public void R(e eVar) {
        S(eVar.y());
    }

    @Override // com.google.android.exoplayer2.trackselection.w
    public boolean e() {
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.w
    public void h(u uVar) {
        if (uVar instanceof d) {
            S((d) uVar);
        }
        S(new e(this.f50047e.get()).D(uVar).y());
    }

    @Override // com.google.android.exoplayer2.trackselection.l
    protected final Pair<p3[], j[]> n(l.a aVar, int[][][] iArr, int[] iArr2, f0.a aVar2, z3 z3Var) throws ExoPlaybackException {
        d dVar = this.f50047e.get();
        int iC = aVar.c();
        j.a[] aVarArrL = L(aVar, iArr, iArr2, dVar);
        for (int i10 = 0; i10 < iC; i10++) {
            aVarArrL[i10] = G(aVar, dVar, i10, aVarArrL[i10]);
        }
        j[] jVarArrA = this.f50046d.a(aVarArrL, a(), aVar2, z3Var);
        p3[] p3VarArr = new p3[iC];
        for (int i11 = 0; i11 < iC; i11++) {
            boolean z10 = true;
            if ((dVar.r(i11) || dVar.f50163y.contains(Integer.valueOf(aVar.f(i11)))) || (aVar.f(i11) != -2 && jVarArrA[i11] == null)) {
                z10 = false;
            }
            p3VarArr[i11] = z10 ? p3.f47322b : null;
        }
        if (dVar.f50071p3) {
            H(aVar, iArr, p3VarArr, jVarArrA);
        }
        return Pair.create(p3VarArr, jVarArrA);
    }

    public e s() {
        return b().d();
    }

    @Override // com.google.android.exoplayer2.trackselection.w
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f50047e.get();
    }
}
