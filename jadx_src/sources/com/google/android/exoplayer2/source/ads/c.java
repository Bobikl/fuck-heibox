package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.f0;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: AdPlaybackState.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements com.google.android.exoplayer2.i {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f47503h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f47504i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f47505j = 2;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f47506k = 3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f47507l = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f47510o = 1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f47511p = 2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f47512q = 3;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f47513r = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    public final Object f47515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f47517d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f47518e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f47519f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a[] f47520g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f47508m = new c(null, new a[0], 0, com.google.android.exoplayer2.j.f46377b, 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final a f47509n = new a(0).k(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final com.google.android.exoplayer2.i.a<c> f47514s = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.source.ads.a
        @Override // com.google.android.exoplayer2.i.a
        public final com.google.android.exoplayer2.i a(Bundle bundle) {
            return c.d(bundle);
        }
    };

    /* JADX INFO: compiled from: AdPlaybackState.java */
    public static final class a implements com.google.android.exoplayer2.i {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f47521i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f47522j = 1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f47523k = 2;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f47524l = 3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f47525m = 4;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f47526n = 5;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f47527o = 6;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final com.google.android.exoplayer2.i.a<a> f47528p = new com.google.android.exoplayer2.i.a() { // from class: com.google.android.exoplayer2.source.ads.b
            @Override // com.google.android.exoplayer2.i.a
            public final com.google.android.exoplayer2.i a(Bundle bundle) {
                return c.a.e(bundle);
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f47529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri[] f47531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f47532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long[] f47533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f47534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f47535h;

        public a(long j10) {
            this(j10, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private a(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
            com.google.android.exoplayer2.util.a.a(iArr.length == uriArr.length);
            this.f47529b = j10;
            this.f47530c = i10;
            this.f47532e = iArr;
            this.f47531d = uriArr;
            this.f47533f = jArr;
            this.f47534g = j11;
            this.f47535h = z10;
        }

        @androidx.annotation.j
        private static long[] c(long[] jArr, int i10) {
            int length = jArr.length;
            int iMax = Math.max(i10, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, com.google.android.exoplayer2.j.f46377b);
            return jArrCopyOf;
        }

        @androidx.annotation.j
        private static int[] d(int[] iArr, int i10) {
            int length = iArr.length;
            int iMax = Math.max(i10, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a e(Bundle bundle) {
            long j10 = bundle.getLong(i(0));
            int i10 = bundle.getInt(i(1), -1);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(i(2));
            int[] intArray = bundle.getIntArray(i(3));
            long[] longArray = bundle.getLongArray(i(4));
            long j11 = bundle.getLong(i(5));
            boolean z10 = bundle.getBoolean(i(6));
            if (intArray == null) {
                intArray = new int[0];
            }
            return new a(j10, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j11, z10);
        }

        private static String i(int i10) {
            return Integer.toString(i10, 36);
        }

        @Override // com.google.android.exoplayer2.i
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putLong(i(0), this.f47529b);
            bundle.putInt(i(1), this.f47530c);
            bundle.putParcelableArrayList(i(2), new ArrayList<>(Arrays.asList(this.f47531d)));
            bundle.putIntArray(i(3), this.f47532e);
            bundle.putLongArray(i(4), this.f47533f);
            bundle.putLong(i(5), this.f47534g);
            bundle.putBoolean(i(6), this.f47535h);
            return bundle;
        }

        public boolean equals(@p0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f47529b == aVar.f47529b && this.f47530c == aVar.f47530c && Arrays.equals(this.f47531d, aVar.f47531d) && Arrays.equals(this.f47532e, aVar.f47532e) && Arrays.equals(this.f47533f, aVar.f47533f) && this.f47534g == aVar.f47534g && this.f47535h == aVar.f47535h;
        }

        public int f() {
            return g(-1);
        }

        public int g(@f0(from = -1) int i10) {
            int i11;
            int i12 = i10 + 1;
            while (true) {
                int[] iArr = this.f47532e;
                if (i12 >= iArr.length || this.f47535h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                    break;
                }
                i12++;
            }
            return i12;
        }

        public boolean h() {
            if (this.f47530c == -1) {
                return true;
            }
            for (int i10 = 0; i10 < this.f47530c; i10++) {
                int i11 = this.f47532e[i10];
                if (i11 == 0 || i11 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f47530c * 31;
            long j10 = this.f47529b;
            int iHashCode = (((((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f47531d)) * 31) + Arrays.hashCode(this.f47532e)) * 31) + Arrays.hashCode(this.f47533f)) * 31;
            long j11 = this.f47534g;
            return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f47535h ? 1 : 0);
        }

        public boolean j() {
            return this.f47530c == -1 || f() < this.f47530c;
        }

        @androidx.annotation.j
        public a k(int i10) {
            int[] iArrD = d(this.f47532e, i10);
            long[] jArrC = c(this.f47533f, i10);
            return new a(this.f47529b, i10, iArrD, (Uri[]) Arrays.copyOf(this.f47531d, i10), jArrC, this.f47534g, this.f47535h);
        }

        @androidx.annotation.j
        public a l(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f47531d;
            if (length < uriArr.length) {
                jArr = c(jArr, uriArr.length);
            } else if (this.f47530c != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new a(this.f47529b, this.f47530c, this.f47532e, this.f47531d, jArr, this.f47534g, this.f47535h);
        }

        @androidx.annotation.j
        public a m(int i10, @f0(from = 0) int i11) {
            int i12 = this.f47530c;
            com.google.android.exoplayer2.util.a.a(i12 == -1 || i11 < i12);
            int[] iArrD = d(this.f47532e, i11 + 1);
            int i13 = iArrD[i11];
            com.google.android.exoplayer2.util.a.a(i13 == 0 || i13 == 1 || i13 == i10);
            long[] jArrC = this.f47533f;
            if (jArrC.length != iArrD.length) {
                jArrC = c(jArrC, iArrD.length);
            }
            long[] jArr = jArrC;
            Uri[] uriArr = this.f47531d;
            if (uriArr.length != iArrD.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrD.length);
            }
            iArrD[i11] = i10;
            return new a(this.f47529b, this.f47530c, iArrD, uriArr, jArr, this.f47534g, this.f47535h);
        }

        @androidx.annotation.j
        public a n(Uri uri, @f0(from = 0) int i10) {
            int[] iArrD = d(this.f47532e, i10 + 1);
            long[] jArrC = this.f47533f;
            if (jArrC.length != iArrD.length) {
                jArrC = c(jArrC, iArrD.length);
            }
            long[] jArr = jArrC;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f47531d, iArrD.length);
            uriArr[i10] = uri;
            iArrD[i10] = 1;
            return new a(this.f47529b, this.f47530c, iArrD, uriArr, jArr, this.f47534g, this.f47535h);
        }

        @androidx.annotation.j
        public a o() {
            if (this.f47530c == -1) {
                return new a(this.f47529b, 0, new int[0], new Uri[0], new long[0], this.f47534g, this.f47535h);
            }
            int[] iArr = this.f47532e;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArrCopyOf[i10];
                if (i11 == 1 || i11 == 0) {
                    iArrCopyOf[i10] = 2;
                }
            }
            return new a(this.f47529b, length, iArrCopyOf, this.f47531d, this.f47533f, this.f47534g, this.f47535h);
        }

        @androidx.annotation.j
        public a p(long j10) {
            return new a(this.f47529b, this.f47530c, this.f47532e, this.f47531d, this.f47533f, j10, this.f47535h);
        }

        @androidx.annotation.j
        public a q(boolean z10) {
            return new a(this.f47529b, this.f47530c, this.f47532e, this.f47531d, this.f47533f, this.f47534g, z10);
        }

        @androidx.annotation.j
        public a r(long j10) {
            return new a(j10, this.f47530c, this.f47532e, this.f47531d, this.f47533f, this.f47534g, this.f47535h);
        }
    }

    /* JADX INFO: compiled from: AdPlaybackState.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public c(Object obj, long... jArr) {
        this(obj, c(jArr), 0L, com.google.android.exoplayer2.j.f46377b, 0);
    }

    private c(@p0 Object obj, a[] aVarArr, long j10, long j11, int i10) {
        this.f47515b = obj;
        this.f47517d = j10;
        this.f47518e = j11;
        this.f47516c = aVarArr.length + i10;
        this.f47520g = aVarArr;
        this.f47519f = i10;
    }

    private static a[] c(long[] jArr) {
        int length = jArr.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            aVarArr[i10] = new a(jArr[i10]);
        }
        return aVarArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c d(Bundle bundle) {
        a[] aVarArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(j(1));
        if (parcelableArrayList == null) {
            aVarArr = new a[0];
        } else {
            a[] aVarArr2 = new a[parcelableArrayList.size()];
            for (int i10 = 0; i10 < parcelableArrayList.size(); i10++) {
                aVarArr2[i10] = (a) a.f47528p.a((Bundle) parcelableArrayList.get(i10));
            }
            aVarArr = aVarArr2;
        }
        return new c(null, aVarArr, bundle.getLong(j(2), 0L), bundle.getLong(j(3), com.google.android.exoplayer2.j.f46377b), bundle.getInt(j(4)));
    }

    private boolean i(long j10, long j11, int i10) {
        if (j10 == Long.MIN_VALUE) {
            return false;
        }
        long j12 = e(i10).f47529b;
        if (j12 == Long.MIN_VALUE) {
            return j11 == com.google.android.exoplayer2.j.f46377b || j10 < j11;
        }
        return j10 < j12;
    }

    private static String j(int i10) {
        return Integer.toString(i10, 36);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle a() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (a aVar : this.f47520g) {
            arrayList.add(aVar.a());
        }
        bundle.putParcelableArrayList(j(1), arrayList);
        bundle.putLong(j(2), this.f47517d);
        bundle.putLong(j(3), this.f47518e);
        bundle.putInt(j(4), this.f47519f);
        return bundle;
    }

    public a e(@f0(from = 0) int i10) {
        int i11 = this.f47519f;
        return i10 < i11 ? f47509n : this.f47520g[i10 - i11];
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return u0.c(this.f47515b, cVar.f47515b) && this.f47516c == cVar.f47516c && this.f47517d == cVar.f47517d && this.f47518e == cVar.f47518e && this.f47519f == cVar.f47519f && Arrays.equals(this.f47520g, cVar.f47520g);
    }

    public int f(long j10, long j11) {
        if (j10 == Long.MIN_VALUE) {
            return -1;
        }
        if (j11 != com.google.android.exoplayer2.j.f46377b && j10 >= j11) {
            return -1;
        }
        int i10 = this.f47519f;
        while (i10 < this.f47516c && ((e(i10).f47529b != Long.MIN_VALUE && e(i10).f47529b <= j10) || !e(i10).j())) {
            i10++;
        }
        if (i10 < this.f47516c) {
            return i10;
        }
        return -1;
    }

    public int g(long j10, long j11) {
        int i10 = this.f47516c - 1;
        while (i10 >= 0 && i(j10, j11, i10)) {
            i10--;
        }
        if (i10 < 0 || !e(i10).h()) {
            return -1;
        }
        return i10;
    }

    public boolean h(@f0(from = 0) int i10, @f0(from = 0) int i11) {
        a aVarE;
        int i12;
        return i10 < this.f47516c && (i12 = (aVarE = e(i10)).f47530c) != -1 && i11 < i12 && aVarE.f47532e[i11] == 4;
    }

    public int hashCode() {
        int i10 = this.f47516c * 31;
        Object obj = this.f47515b;
        return ((((((((i10 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f47517d)) * 31) + ((int) this.f47518e)) * 31) + this.f47519f) * 31) + Arrays.hashCode(this.f47520g);
    }

    @androidx.annotation.j
    public c k(@f0(from = 0) int i10, @f0(from = 1) int i11) {
        com.google.android.exoplayer2.util.a.a(i11 > 0);
        int i12 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        if (aVarArr[i12].f47530c == i11) {
            return this;
        }
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i12] = this.f47520g[i12].k(i11);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c l(@f0(from = 0) int i10, long... jArr) {
        int i11 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].l(jArr);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c m(long[][] jArr) {
        com.google.android.exoplayer2.util.a.i(this.f47519f == 0);
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        for (int i10 = 0; i10 < this.f47516c; i10++) {
            aVarArr2[i10] = aVarArr2[i10].l(jArr[i10]);
        }
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c n(@f0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i11] = this.f47520g[i11].r(j10);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c o(@f0(from = 0) int i10, @f0(from = 0) int i11) {
        int i12 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m(4, i11);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c p(long j10) {
        return this.f47517d == j10 ? this : new c(this.f47515b, this.f47520g, j10, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c q(@f0(from = 0) int i10, @f0(from = 0) int i11, Uri uri) {
        int i12 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].n(uri, i11);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c r(long j10) {
        return this.f47518e == j10 ? this : new c(this.f47515b, this.f47520g, this.f47517d, j10, this.f47519f);
    }

    @androidx.annotation.j
    public c s(@f0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        if (aVarArr[i11].f47534g == j10) {
            return this;
        }
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].p(j10);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c t(@f0(from = 0) int i10, boolean z10) {
        int i11 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        if (aVarArr[i11].f47535h == z10) {
            return this;
        }
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].q(z10);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.f47515b);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.f47517d);
        sb2.append(", adGroups=[");
        for (int i10 = 0; i10 < this.f47520g.length; i10++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f47520g[i10].f47529b);
            sb2.append(", ads=[");
            for (int i11 = 0; i11 < this.f47520g[i10].f47532e.length; i11++) {
                sb2.append("ad(state=");
                int i12 = this.f47520g[i10].f47532e[i11];
                if (i12 == 0) {
                    sb2.append('_');
                } else if (i12 == 1) {
                    sb2.append('R');
                } else if (i12 == 2) {
                    sb2.append('S');
                } else if (i12 == 3) {
                    sb2.append('P');
                } else if (i12 != 4) {
                    sb2.append('?');
                } else {
                    sb2.append('!');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f47520g[i10].f47533f[i11]);
                sb2.append(')');
                if (i11 < this.f47520g[i10].f47532e.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i10 < this.f47520g.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    @androidx.annotation.j
    public c u(@f0(from = 0) int i10, long j10) {
        int i11 = i10 - this.f47519f;
        a aVar = new a(j10);
        a[] aVarArr = (a[]) u0.X0(this.f47520g, aVar);
        System.arraycopy(aVarArr, i11, aVarArr, i11 + 1, this.f47520g.length - i11);
        aVarArr[i11] = aVar;
        return new c(this.f47515b, aVarArr, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c v(@f0(from = 0) int i10, @f0(from = 0) int i11) {
        int i12 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m(3, i11);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c w(@f0(from = 0) int i10) {
        int i11 = this.f47519f;
        if (i11 == i10) {
            return this;
        }
        com.google.android.exoplayer2.util.a.a(i10 > i11);
        int i12 = this.f47516c - i10;
        a[] aVarArr = new a[i12];
        System.arraycopy(this.f47520g, i10 - this.f47519f, aVarArr, 0, i12);
        return new c(this.f47515b, aVarArr, this.f47517d, this.f47518e, i10);
    }

    @androidx.annotation.j
    public c x(@f0(from = 0) int i10, @f0(from = 0) int i11) {
        int i12 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i12] = aVarArr2[i12].m(2, i11);
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }

    @androidx.annotation.j
    public c y(@f0(from = 0) int i10) {
        int i11 = i10 - this.f47519f;
        a[] aVarArr = this.f47520g;
        a[] aVarArr2 = (a[]) u0.Z0(aVarArr, aVarArr.length);
        aVarArr2[i11] = aVarArr2[i11].o();
        return new c(this.f47515b, aVarArr2, this.f47517d, this.f47518e, this.f47519f);
    }
}
