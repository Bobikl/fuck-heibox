package kotlinx.serialization.internal;

import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: ElementMarker.kt */
/* JADX INFO: loaded from: classes5.dex */
@x
public final class c0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final a f130675e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final long[] f130676f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final yh.p<kotlinx.serialization.descriptors.f, Integer, Boolean> f130678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f130679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final long[] f130680d;

    /* JADX INFO: compiled from: ElementMarker.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@dl.d kotlinx.serialization.descriptors.f descriptor, @dl.d yh.p<? super kotlinx.serialization.descriptors.f, ? super Integer, Boolean> readIfAbsent) {
        kotlin.jvm.internal.f0.p(descriptor, "descriptor");
        kotlin.jvm.internal.f0.p(readIfAbsent, "readIfAbsent");
        this.f130677a = descriptor;
        this.f130678b = readIfAbsent;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f130679c = iF != 64 ? (-1) << iF : 0L;
            this.f130680d = f130676f;
        } else {
            this.f130679c = 0L;
            this.f130680d = e(iF);
        }
    }

    private final void b(int i10) {
        int i11 = (i10 >>> 6) - 1;
        long[] jArr = this.f130680d;
        jArr[i11] = jArr[i11] | (1 << (i10 & 63));
    }

    private final int c() {
        int length = this.f130680d.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = i11 * 64;
            long j10 = this.f130680d[i10];
            while (j10 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
                j10 |= 1 << iNumberOfTrailingZeros;
                int i13 = iNumberOfTrailingZeros + i12;
                if (this.f130678b.invoke(this.f130677a, Integer.valueOf(i13)).booleanValue()) {
                    this.f130680d[i10] = j10;
                    return i13;
                }
            }
            this.f130680d[i10] = j10;
            i10 = i11;
        }
        return -1;
    }

    private final long[] e(int i10) {
        long[] jArr = new long[(i10 - 1) >>> 6];
        if ((i10 & 63) != 0) {
            jArr[ArraysKt___ArraysKt.We(jArr)] = (-1) << i10;
        }
        return jArr;
    }

    public final void a(int i10) {
        if (i10 < 64) {
            this.f130679c |= 1 << i10;
        } else {
            b(i10);
        }
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iF = this.f130677a.f();
        do {
            long j10 = this.f130679c;
            if (j10 == -1) {
                if (iF > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j10);
            this.f130679c |= 1 << iNumberOfTrailingZeros;
        } while (!this.f130678b.invoke(this.f130677a, Integer.valueOf(iNumberOfTrailingZeros)).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
