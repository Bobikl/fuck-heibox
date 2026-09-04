package androidx.collection;

import kotlin.Pair;

/* JADX INFO: compiled from: ScatterMap.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1850:1\n1661#1:1851\n1661#1:1852\n1661#1:1853\n1715#1:1854\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1680#1:1851\n1682#1:1852\n1685#1:1853\n1721#1:1854\n*E\n"})
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f3607a = -9187201950435737472L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f3608b = 128;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f3609c = 254;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3610d = 255;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f3612f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f3613g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f3614h = 6;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f3616j = -862048943;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final long f3617k = 72340172838076673L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final long f3618l = -9187201950435737472L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final long[] f3611e = {-9187201950435737345L, -1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final MutableScatterMap f3615i = new MutableScatterMap(0);

    public static final void A(@dl.d long[] data, int i10, long j10) {
        kotlin.jvm.internal.f0.p(data, "data");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        data[i11] = (j10 << i12) | (data[i11] & (~(255 << i12)));
    }

    @dl.d
    public static final <K, V> ScatterMap<K, V> a() {
        MutableScatterMap mutableScatterMap = f3615i;
        kotlin.jvm.internal.f0.n(mutableScatterMap, "null cannot be cast to non-null type androidx.collection.ScatterMap<K of androidx.collection.ScatterMapKt.emptyScatterMap, V of androidx.collection.ScatterMapKt.emptyScatterMap>");
        return mutableScatterMap;
    }

    public static final int b(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    @kotlin.r0
    public static /* synthetic */ void c() {
    }

    @kotlin.r0
    public static /* synthetic */ void d() {
    }

    @kotlin.r0
    public static /* synthetic */ void e() {
    }

    public static final long f(@dl.d long[] metadata, int i10) {
        kotlin.jvm.internal.f0.p(metadata, "metadata");
        int i11 = i10 >> 3;
        int i12 = (i10 & 7) << 3;
        return (((-i12) >> 63) & (metadata[i11 + 1] << (64 - i12))) | (metadata[i11] >>> i12);
    }

    public static final int g(int i10) {
        return i10 >>> 7;
    }

    public static final int h(int i10) {
        return i10 & 127;
    }

    public static final boolean i(long j10) {
        return j10 != 0;
    }

    public static final int j(@dl.e Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * f3616j;
        return iHashCode ^ (iHashCode << 16);
    }

    public static final boolean k(@dl.d long[] metadata, int i10) {
        kotlin.jvm.internal.f0.p(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 254;
    }

    public static final boolean l(@dl.d long[] metadata, int i10) {
        kotlin.jvm.internal.f0.p(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) == 128;
    }

    @kotlin.r0
    public static final boolean m(long j10) {
        return j10 < 128;
    }

    public static final boolean n(@dl.d long[] metadata, int i10) {
        kotlin.jvm.internal.f0.p(metadata, "metadata");
        return ((metadata[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128;
    }

    public static final int o(int i10) {
        if (i10 == 7) {
            return 6;
        }
        return i10 - (i10 / 8);
    }

    @kotlin.r0
    public static final int p(long j10) {
        return Long.numberOfTrailingZeros(j10) >> 3;
    }

    public static final long q(long j10) {
        return j10 & ((~j10) << 6) & (-9187201950435737472L);
    }

    @kotlin.r0
    public static final long r(long j10) {
        return j10 & ((~j10) << 7) & (-9187201950435737472L);
    }

    @kotlin.r0
    public static final long s(long j10, int i10) {
        long j11 = j10 ^ (((long) i10) * f3617k);
        return (~j11) & (j11 - f3617k) & (-9187201950435737472L);
    }

    @dl.d
    public static final <K, V> MutableScatterMap<K, V> t() {
        return new MutableScatterMap<>(0, 1, null);
    }

    @dl.d
    public static final <K, V> MutableScatterMap<K, V> u(@dl.d Pair<? extends K, ? extends V>... pairs) {
        kotlin.jvm.internal.f0.p(pairs, "pairs");
        MutableScatterMap<K, V> mutableScatterMap = new MutableScatterMap<>(pairs.length);
        mutableScatterMap.j0(pairs);
        return mutableScatterMap;
    }

    public static final long v(long j10) {
        return j10 & (j10 - 1);
    }

    public static final int w(int i10) {
        if (i10 == 0) {
            return 6;
        }
        return (i10 * 2) + 1;
    }

    public static final int x(int i10) {
        if (i10 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i10);
        }
        return 0;
    }

    @kotlin.r0
    public static final long y(@dl.d long[] data, int i10) {
        kotlin.jvm.internal.f0.p(data, "data");
        return (data[i10 >> 3] >> ((i10 & 7) << 3)) & 255;
    }

    public static final int z(int i10) {
        if (i10 == 7) {
            return 8;
        }
        return i10 + ((i10 - 1) / 7);
    }
}
