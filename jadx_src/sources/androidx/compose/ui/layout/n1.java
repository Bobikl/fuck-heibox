package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: ScaleFactor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\b\u0087@\u0018\u0000 $2\u00020\u0001:\u0001\u0019B\u0014\b\u0000\u0012\u0006\u0010\u001d\u001a\u00020\u0018ø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u0004\u0088\u0001\u001d\u0092\u0001\u00020\u0018ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/layout/n1;", "", "", ak.aF, "(J)F", "d", "scaleX", "scaleY", "f", "(JFF)J", "operand", "q", "(JF)J", RXScreenCaptureService.KEY_HEIGHT, "", "r", "(J)Ljava/lang/String;", "", "p", "(J)I", "other", "", "i", "(JLjava/lang/Object;)Z", "", ak.av, "J", "getPackedValue$annotations", "()V", "packedValue", "m", "getScaleX$annotations", "o", "getScaleY$annotations", "e", "(J)J", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@androidx.compose.runtime.m0
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f15030c = o1.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: androidx.compose.ui.layout.n1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ScaleFactor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/n1$a;", "", "Landroidx/compose/ui/layout/n1;", "Unspecified", "J", ak.av, "()J", "getUnspecified-_hLwfpc$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return n1.f15030c;
        }
    }

    private /* synthetic */ n1(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ n1 b(long j10) {
        return new n1(j10);
    }

    @j2
    public static final float c(long j10) {
        return m(j10);
    }

    @j2
    public static final float d(long j10) {
        return o(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return o1.a(f10, f11);
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = o(j10);
        }
        return f(j10, f10, f11);
    }

    @j2
    public static final long h(long j10, float f10) {
        return o1.a(m(j10) / f10, o(j10) / f10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof n1) && j10 == ((n1) obj).getPackedValue();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @kotlin.r0
    public static /* synthetic */ void k() {
    }

    @j2
    public static /* synthetic */ void l() {
    }

    public static final float m(long j10) {
        if (!(j10 != f15030c)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @j2
    public static /* synthetic */ void n() {
    }

    public static final float o(long j10) {
        if (!(j10 != f15030c)) {
            throw new IllegalStateException("ScaleFactor is unspecified".toString());
        }
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int p(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final long q(long j10, float f10) {
        return o1.a(m(j10) * f10, o(j10) * f10);
    }

    @dl.d
    public static String r(long j10) {
        return "ScaleFactor(" + o1.i(m(j10)) + ", " + o1.i(o(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return i(this.packedValue, obj);
    }

    public int hashCode() {
        return p(this.packedValue);
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @dl.d
    public String toString() {
        return r(this.packedValue);
    }
}
