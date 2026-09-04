package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class z3 implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f52083c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f52084d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f52085e = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z3 f52082b = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i.a<z3> f52086f = new i.a() { // from class: com.google.android.exoplayer2.y3
        @Override // com.google.android.exoplayer2.i.a
        public final i a(Bundle bundle) {
            return z3.c(bundle);
        }
    };

    /* JADX INFO: compiled from: Timeline.java */
    public class a extends z3 {
        a() {
        }

        @Override // com.google.android.exoplayer2.z3
        public int g(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.z3
        public b l(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.z3
        public int n() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.z3
        public Object t(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.z3
        public d v(int i10, d dVar, long j10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.z3
        public int w() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class b implements i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f52087i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f52088j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f52089k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f52090l = 3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f52091m = 4;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final i.a<b> f52092n = new i.a() { // from class: com.google.android.exoplayer2.a4
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return z3.b.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f52093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f52094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f52095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f52096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f52097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f52098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private com.google.android.exoplayer2.source.ads.c f52099h = com.google.android.exoplayer2.source.ads.c.f47508m;

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(Bundle bundle) {
            int i10 = bundle.getInt(w(0), 0);
            long j10 = bundle.getLong(w(1), j.f46377b);
            long j11 = bundle.getLong(w(2), 0L);
            boolean z10 = bundle.getBoolean(w(3));
            Bundle bundle2 = bundle.getBundle(w(4));
            com.google.android.exoplayer2.source.ads.c cVar = bundle2 != null ? (com.google.android.exoplayer2.source.ads.c) com.google.android.exoplayer2.source.ads.c.f47514s.a(bundle2) : com.google.android.exoplayer2.source.ads.c.f47508m;
            b bVar = new b();
            bVar.y(null, null, i10, j10, j11, cVar, z10);
            return bVar;
        }

        private static String w(int i10) {
            return Integer.toString(i10, 36);
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(w(0), this.f52095d);
            bundle.putLong(w(1), this.f52096e);
            bundle.putLong(w(2), this.f52097f);
            bundle.putBoolean(w(3), this.f52098g);
            bundle.putBundle(w(4), this.f52099h.a());
            return bundle;
        }

        public int e(int i10) {
            return this.f52099h.e(i10).f47530c;
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return com.google.android.exoplayer2.util.u0.c(this.f52093b, bVar.f52093b) && com.google.android.exoplayer2.util.u0.c(this.f52094c, bVar.f52094c) && this.f52095d == bVar.f52095d && this.f52096e == bVar.f52096e && this.f52097f == bVar.f52097f && this.f52098g == bVar.f52098g && com.google.android.exoplayer2.util.u0.c(this.f52099h, bVar.f52099h);
        }

        public long f(int i10, int i11) {
            com.google.android.exoplayer2.source.ads.c.a aVarE = this.f52099h.e(i10);
            return aVarE.f47530c != -1 ? aVarE.f47533f[i11] : j.f46377b;
        }

        public int g() {
            return this.f52099h.f47516c;
        }

        public int h(long j10) {
            return this.f52099h.f(j10, this.f52096e);
        }

        public int hashCode() {
            Object obj = this.f52093b;
            int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f52094c;
            int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.f52095d) * 31;
            long j10 = this.f52096e;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f52097f;
            return ((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f52098g ? 1 : 0)) * 31) + this.f52099h.hashCode();
        }

        public int i(long j10) {
            return this.f52099h.g(j10, this.f52096e);
        }

        public long j(int i10) {
            return this.f52099h.e(i10).f47529b;
        }

        public long k() {
            return this.f52099h.f47517d;
        }

        @androidx.annotation.p0
        public Object l() {
            return this.f52099h.f47515b;
        }

        public long m(int i10) {
            return this.f52099h.e(i10).f47534g;
        }

        public long n() {
            return com.google.android.exoplayer2.util.u0.B1(this.f52096e);
        }

        public long o() {
            return this.f52096e;
        }

        public int p(int i10) {
            return this.f52099h.e(i10).f();
        }

        public int q(int i10, int i11) {
            return this.f52099h.e(i10).g(i11);
        }

        public long r() {
            return com.google.android.exoplayer2.util.u0.B1(this.f52097f);
        }

        public long s() {
            return this.f52097f;
        }

        public int t() {
            return this.f52099h.f47519f;
        }

        public boolean u(int i10) {
            return !this.f52099h.e(i10).h();
        }

        public boolean v(int i10) {
            return this.f52099h.e(i10).f47535h;
        }

        public b x(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, int i10, long j10, long j11) {
            return y(obj, obj2, i10, j10, j11, com.google.android.exoplayer2.source.ads.c.f47508m, false);
        }

        public b y(@androidx.annotation.p0 Object obj, @androidx.annotation.p0 Object obj2, int i10, long j10, long j11, com.google.android.exoplayer2.source.ads.c cVar, boolean z10) {
            this.f52093b = obj;
            this.f52094c = obj2;
            this.f52095d = i10;
            this.f52096e = j10;
            this.f52097f = j11;
            this.f52099h = cVar;
            this.f52098g = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class c extends z3 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ImmutableList<d> f52100g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ImmutableList<b> f52101h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final int[] f52102i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final int[] f52103j;

        public c(ImmutableList<d> immutableList, ImmutableList<b> immutableList2, int[] iArr) {
            com.google.android.exoplayer2.util.a.a(immutableList.size() == iArr.length);
            this.f52100g = immutableList;
            this.f52101h = immutableList2;
            this.f52102i = iArr;
            this.f52103j = new int[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                this.f52103j[iArr[i10]] = i10;
            }
        }

        @Override // com.google.android.exoplayer2.z3
        public int f(boolean z10) {
            if (x()) {
                return -1;
            }
            if (z10) {
                return this.f52102i[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.z3
        public int g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.z3
        public int h(boolean z10) {
            if (x()) {
                return -1;
            }
            return z10 ? this.f52102i[w() - 1] : w() - 1;
        }

        @Override // com.google.android.exoplayer2.z3
        public int j(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != h(z10)) {
                return z10 ? this.f52102i[this.f52103j[i10] + 1] : i10 + 1;
            }
            if (i11 == 2) {
                return f(z10);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.z3
        public b l(int i10, b bVar, boolean z10) {
            b bVar2 = this.f52101h.get(i10);
            bVar.y(bVar2.f52093b, bVar2.f52094c, bVar2.f52095d, bVar2.f52096e, bVar2.f52097f, bVar2.f52099h, bVar2.f52098g);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.z3
        public int n() {
            return this.f52101h.size();
        }

        @Override // com.google.android.exoplayer2.z3
        public int s(int i10, int i11, boolean z10) {
            if (i11 == 1) {
                return i10;
            }
            if (i10 != f(z10)) {
                return z10 ? this.f52102i[this.f52103j[i10] - 1] : i10 - 1;
            }
            if (i11 == 2) {
                return h(z10);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.z3
        public Object t(int i10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.z3
        public d v(int i10, d dVar, long j10) {
            d dVar2 = this.f52100g.get(i10);
            dVar.n(dVar2.f52112b, dVar2.f52114d, dVar2.f52115e, dVar2.f52116f, dVar2.f52117g, dVar2.f52118h, dVar2.f52119i, dVar2.f52120j, dVar2.f52122l, dVar2.f52124n, dVar2.f52125o, dVar2.f52126p, dVar2.f52127q, dVar2.f52128r);
            dVar.f52123m = dVar2.f52123m;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.z3
        public int w() {
            return this.f52100g.size();
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class d implements i {
        private static final int A = 6;
        private static final int B = 7;
        private static final int C = 8;
        private static final int D = 9;
        private static final int E = 10;
        private static final int F = 11;
        private static final int G = 12;
        private static final int H = 13;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private static final int f52107v = 1;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private static final int f52108w = 2;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private static final int f52109x = 3;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f52110y = 4;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f52111z = 5;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        @Deprecated
        public Object f52113c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        public Object f52115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f52116f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f52117g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f52118h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f52119i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f52120j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Deprecated
        public boolean f52121k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @androidx.annotation.p0
        public i2.g f52122l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f52123m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f52124n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f52125o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f52126p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f52127q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f52128r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final Object f52104s = new Object();

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private static final Object f52105t = new Object();

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static final i2 f52106u = new i2.c().D("com.google.android.exoplayer2.Timeline").K(Uri.EMPTY).a();
        public static final i.a<d> I = new i.a() { // from class: com.google.android.exoplayer2.b4
            @Override // com.google.android.exoplayer2.i.a
            public final i a(Bundle bundle) {
                return z3.d.d(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f52112b = f52104s;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i2 f52114d = f52106u;

        /* JADX INFO: Access modifiers changed from: private */
        public static d d(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(m(1));
            i2 i2Var = bundle2 != null ? (i2) i2.f46267o.a(bundle2) : null;
            long j10 = bundle.getLong(m(2), j.f46377b);
            long j11 = bundle.getLong(m(3), j.f46377b);
            long j12 = bundle.getLong(m(4), j.f46377b);
            boolean z10 = bundle.getBoolean(m(5), false);
            boolean z11 = bundle.getBoolean(m(6), false);
            Bundle bundle3 = bundle.getBundle(m(7));
            i2.g gVar = bundle3 != null ? (i2.g) i2.g.f46334m.a(bundle3) : null;
            boolean z12 = bundle.getBoolean(m(8), false);
            long j13 = bundle.getLong(m(9), 0L);
            long j14 = bundle.getLong(m(10), j.f46377b);
            int i10 = bundle.getInt(m(11), 0);
            int i11 = bundle.getInt(m(12), 0);
            long j15 = bundle.getLong(m(13), 0L);
            d dVar = new d();
            dVar.n(f52105t, i2Var, null, j10, j11, j12, z10, z11, gVar, j13, j14, i10, i11, j15);
            dVar.f52123m = z12;
            return dVar;
        }

        private static String m(int i10) {
            return Integer.toString(i10, 36);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle o(boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putBundle(m(1), (z10 ? i2.f46262j : this.f52114d).a());
            bundle.putLong(m(2), this.f52116f);
            bundle.putLong(m(3), this.f52117g);
            bundle.putLong(m(4), this.f52118h);
            bundle.putBoolean(m(5), this.f52119i);
            bundle.putBoolean(m(6), this.f52120j);
            i2.g gVar = this.f52122l;
            if (gVar != null) {
                bundle.putBundle(m(7), gVar.a());
            }
            bundle.putBoolean(m(8), this.f52123m);
            bundle.putLong(m(9), this.f52124n);
            bundle.putLong(m(10), this.f52125o);
            bundle.putInt(m(11), this.f52126p);
            bundle.putInt(m(12), this.f52127q);
            bundle.putLong(m(13), this.f52128r);
            return bundle;
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            return o(false);
        }

        public long e() {
            return com.google.android.exoplayer2.util.u0.l0(this.f52118h);
        }

        public boolean equals(@androidx.annotation.p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return com.google.android.exoplayer2.util.u0.c(this.f52112b, dVar.f52112b) && com.google.android.exoplayer2.util.u0.c(this.f52114d, dVar.f52114d) && com.google.android.exoplayer2.util.u0.c(this.f52115e, dVar.f52115e) && com.google.android.exoplayer2.util.u0.c(this.f52122l, dVar.f52122l) && this.f52116f == dVar.f52116f && this.f52117g == dVar.f52117g && this.f52118h == dVar.f52118h && this.f52119i == dVar.f52119i && this.f52120j == dVar.f52120j && this.f52123m == dVar.f52123m && this.f52124n == dVar.f52124n && this.f52125o == dVar.f52125o && this.f52126p == dVar.f52126p && this.f52127q == dVar.f52127q && this.f52128r == dVar.f52128r;
        }

        public long f() {
            return com.google.android.exoplayer2.util.u0.B1(this.f52124n);
        }

        public long g() {
            return this.f52124n;
        }

        public long h() {
            return com.google.android.exoplayer2.util.u0.B1(this.f52125o);
        }

        public int hashCode() {
            int iHashCode = (((217 + this.f52112b.hashCode()) * 31) + this.f52114d.hashCode()) * 31;
            Object obj = this.f52115e;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            i2.g gVar = this.f52122l;
            int iHashCode3 = (iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j10 = this.f52116f;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f52117g;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f52118h;
            int i12 = (((((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + (this.f52119i ? 1 : 0)) * 31) + (this.f52120j ? 1 : 0)) * 31) + (this.f52123m ? 1 : 0)) * 31;
            long j13 = this.f52124n;
            int i13 = (i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31;
            long j14 = this.f52125o;
            int i14 = (((((i13 + ((int) (j14 ^ (j14 >>> 32)))) * 31) + this.f52126p) * 31) + this.f52127q) * 31;
            long j15 = this.f52128r;
            return i14 + ((int) (j15 ^ (j15 >>> 32)));
        }

        public long i() {
            return this.f52125o;
        }

        public long j() {
            return com.google.android.exoplayer2.util.u0.B1(this.f52128r);
        }

        public long k() {
            return this.f52128r;
        }

        public boolean l() {
            com.google.android.exoplayer2.util.a.i(this.f52121k == (this.f52122l != null));
            return this.f52122l != null;
        }

        public d n(Object obj, @androidx.annotation.p0 i2 i2Var, @androidx.annotation.p0 Object obj2, long j10, long j11, long j12, boolean z10, boolean z11, @androidx.annotation.p0 i2.g gVar, long j13, long j14, int i10, int i11, long j15) {
            i2.h hVar;
            this.f52112b = obj;
            this.f52114d = i2Var != null ? i2Var : f52106u;
            this.f52113c = (i2Var == null || (hVar = i2Var.f46269c) == null) ? null : hVar.f46353i;
            this.f52115e = obj2;
            this.f52116f = j10;
            this.f52117g = j11;
            this.f52118h = j12;
            this.f52119i = z10;
            this.f52120j = z11;
            this.f52121k = gVar != null;
            this.f52122l = gVar;
            this.f52124n = j13;
            this.f52125o = j14;
            this.f52126p = i10;
            this.f52127q = i11;
            this.f52128r = j15;
            this.f52123m = false;
            return this;
        }
    }

    protected z3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static z3 c(Bundle bundle) {
        ImmutableList immutableListD = d(d.I, com.google.android.exoplayer2.util.c.a(bundle, z(0)));
        ImmutableList immutableListD2 = d(b.f52092n, com.google.android.exoplayer2.util.c.a(bundle, z(1)));
        int[] intArray = bundle.getIntArray(z(2));
        if (intArray == null) {
            intArray = e(immutableListD.size());
        }
        return new c(immutableListD, immutableListD2, intArray);
    }

    private static <T extends i> ImmutableList<T> d(i.a<T> aVar, @androidx.annotation.p0 IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.B();
        }
        ImmutableList.a aVar2 = new ImmutableList.a();
        ImmutableList<Bundle> immutableListA = h.a(iBinder);
        for (int i10 = 0; i10 < immutableListA.size(); i10++) {
            aVar2.a(aVar.a(immutableListA.get(i10)));
        }
        return aVar2.e();
    }

    private static int[] e(int i10) {
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = i11;
        }
        return iArr;
    }

    private static String z(int i10) {
        return Integer.toString(i10, 36);
    }

    public final Bundle A(boolean z10) {
        ArrayList arrayList = new ArrayList();
        int iW = w();
        d dVar = new d();
        for (int i10 = 0; i10 < iW; i10++) {
            arrayList.add(v(i10, dVar, 0L).o(z10));
        }
        ArrayList arrayList2 = new ArrayList();
        int iN = n();
        b bVar = new b();
        for (int i11 = 0; i11 < iN; i11++) {
            arrayList2.add(l(i11, bVar, false).a());
        }
        int[] iArr = new int[iW];
        if (iW > 0) {
            iArr[0] = f(true);
        }
        for (int i12 = 1; i12 < iW; i12++) {
            iArr[i12] = j(iArr[i12 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        com.google.android.exoplayer2.util.c.c(bundle, z(0), new h(arrayList));
        com.google.android.exoplayer2.util.c.c(bundle, z(1), new h(arrayList2));
        bundle.putIntArray(z(2), iArr);
        return bundle;
    }

    @Override // com.google.android.exoplayer2.i
    public final Bundle a() {
        return A(false);
    }

    public boolean equals(@androidx.annotation.p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        if (z3Var.w() != w() || z3Var.n() != n()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i10 = 0; i10 < w(); i10++) {
            if (!u(i10, dVar).equals(z3Var.u(i10, dVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < n(); i11++) {
            if (!l(i11, bVar, true).equals(z3Var.l(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int f(boolean z10) {
        return x() ? -1 : 0;
    }

    public abstract int g(Object obj);

    public int h(boolean z10) {
        if (x()) {
            return -1;
        }
        return w() - 1;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int iW = 217 + w();
        for (int i10 = 0; i10 < w(); i10++) {
            iW = (iW * 31) + u(i10, dVar).hashCode();
        }
        int iN = (iW * 31) + n();
        for (int i11 = 0; i11 < n(); i11++) {
            iN = (iN * 31) + l(i11, bVar, true).hashCode();
        }
        return iN;
    }

    public final int i(int i10, b bVar, d dVar, int i11, boolean z10) {
        int i12 = k(i10, bVar).f52095d;
        if (u(i12, dVar).f52127q != i10) {
            return i10 + 1;
        }
        int iJ = j(i12, i11, z10);
        if (iJ == -1) {
            return -1;
        }
        return u(iJ, dVar).f52126p;
    }

    public int j(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == h(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == h(z10) ? f(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public final b k(int i10, b bVar) {
        return l(i10, bVar, false);
    }

    public abstract b l(int i10, b bVar, boolean z10);

    public b m(Object obj, b bVar) {
        return l(g(obj), bVar, true);
    }

    public abstract int n();

    @Deprecated
    @s9.l(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    public final Pair<Object, Long> o(d dVar, b bVar, int i10, long j10) {
        return q(dVar, bVar, i10, j10);
    }

    @androidx.annotation.p0
    @Deprecated
    @s9.l(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    public final Pair<Object, Long> p(d dVar, b bVar, int i10, long j10, long j11) {
        return r(dVar, bVar, i10, j10, j11);
    }

    public final Pair<Object, Long> q(d dVar, b bVar, int i10, long j10) {
        return (Pair) com.google.android.exoplayer2.util.a.g(p(dVar, bVar, i10, j10, 0L));
    }

    @androidx.annotation.p0
    public final Pair<Object, Long> r(d dVar, b bVar, int i10, long j10, long j11) {
        com.google.android.exoplayer2.util.a.c(i10, 0, w());
        v(i10, dVar, j11);
        if (j10 == j.f46377b) {
            j10 = dVar.g();
            if (j10 == j.f46377b) {
                return null;
            }
        }
        int i11 = dVar.f52126p;
        k(i11, bVar);
        while (i11 < dVar.f52127q && bVar.f52097f != j10) {
            int i12 = i11 + 1;
            if (k(i12, bVar).f52097f > j10) {
                break;
            }
            i11 = i12;
        }
        l(i11, bVar, true);
        long jMin = j10 - bVar.f52097f;
        long j12 = bVar.f52096e;
        if (j12 != j.f46377b) {
            jMin = Math.min(jMin, j12 - 1);
        }
        return Pair.create(com.google.android.exoplayer2.util.a.g(bVar.f52094c), Long.valueOf(Math.max(0L, jMin)));
    }

    public int s(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == f(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == f(z10) ? h(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object t(int i10);

    public final d u(int i10, d dVar) {
        return v(i10, dVar, 0L);
    }

    public abstract d v(int i10, d dVar, long j10);

    public abstract int w();

    public final boolean x() {
        return w() == 0;
    }

    public final boolean y(int i10, b bVar, d dVar, int i11, boolean z10) {
        return i(i10, bVar, dVar, i11, z10) == -1;
    }
}
