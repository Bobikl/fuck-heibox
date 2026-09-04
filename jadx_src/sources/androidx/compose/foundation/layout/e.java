package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/layout/e;", "", "", "time", "Landroidx/compose/foundation/layout/e$a;", "b", "(F)J", "velocity", "friction", "", ak.av, "", "I", "NbSamples", "", ak.aF, "[F", "SplinePositions", "d", "SplineTimes", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final int NbSamples = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final e f6311a = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] SplinePositions = new float[101];

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final float[] SplineTimes = new float[101];

    /* JADX INFO: compiled from: WindowInsetsConnection.android.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/layout/e$a;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(J)Ljava/lang/String;", "", "g", "(J)I", "other", "", ak.aF, "(JLjava/lang/Object;)Z", "", ak.av, "J", "packedValue", "", "e", "(J)F", "distanceCoefficient", "f", "velocityCoefficient", "b", "(J)J", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long packedValue;

        private /* synthetic */ a(long j10) {
            this.packedValue = j10;
        }

        public static final /* synthetic */ a a(long j10) {
            return new a(j10);
        }

        public static long b(long j10) {
            return j10;
        }

        public static boolean c(long j10, Object obj) {
            return (obj instanceof a) && j10 == ((a) obj).getPackedValue();
        }

        public static final boolean d(long j10, long j11) {
            return j10 == j11;
        }

        public static final float e(long j10) {
            kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        public static final float f(long j10) {
            kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
            return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
        }

        public static int g(long j10) {
            return androidx.collection.k.a(j10);
        }

        public static String h(long j10) {
            return "FlingResult(packedValue=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return c(this.packedValue, obj);
        }

        public int hashCode() {
            return g(this.packedValue);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        public String toString() {
            return h(this.packedValue);
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18 = 0.0f;
        float f19 = 0.0f;
        for (int i10 = 0; i10 < 100; i10++) {
            float f20 = i10 / 100;
            float f21 = 1.0f;
            while (true) {
                f10 = ((f21 - f18) / 2.0f) + f18;
                f11 = 1.0f - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f22 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                if (Math.abs(f22 - f20) < 1.0E-5d) {
                    break;
                } else if (f22 > f20) {
                    f21 = f10;
                } else {
                    f18 = f10;
                }
            }
            float f23 = 0.5f;
            SplinePositions[i10] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f24 = 1.0f;
            while (true) {
                f14 = ((f24 - f19) / 2.0f) + f19;
                f15 = 1.0f - f14;
                f16 = f14 * 3.0f * f15;
                f17 = f14 * f14 * f14;
                float f25 = (((f15 * f23) + f14) * f16) + f17;
                if (Math.abs(f25 - f20) >= 1.0E-5d) {
                    if (f25 > f20) {
                        f24 = f14;
                    } else {
                        f19 = f14;
                    }
                    f23 = 0.5f;
                }
            }
            SplineTimes[i10] = (f16 * ((f15 * 0.175f) + (f14 * 0.35000002f))) + f17;
        }
        SplineTimes[100] = 1.0f;
        SplinePositions[100] = 1.0f;
    }

    private e() {
    }

    public final double a(float velocity, float friction) {
        return Math.log(((double) (Math.abs(velocity) * 0.35f)) / ((double) friction));
    }

    public final long b(float time) {
        float f10;
        float f11;
        float f12 = 100;
        int i10 = (int) (f12 * time);
        if (i10 < 100) {
            float f13 = i10 / f12;
            int i11 = i10 + 1;
            float f14 = i11 / f12;
            float[] fArr = SplinePositions;
            float f15 = fArr[i10];
            f11 = (fArr[i11] - f15) / (f14 - f13);
            f10 = f15 + ((time - f13) * f11);
        } else {
            f10 = 1.0f;
            f11 = 0.0f;
        }
        return a.b((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }
}
