package b1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;
import kotlin.r0;

/* JADX INFO: compiled from: Size.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001:\u0001)B\u0014\b\u0000\u0012\u0006\u0010&\u001a\u00020%ø\u0001\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010!\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010$\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u0004\u0088\u0001&\u0092\u0001\u00020%ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lb1/m;", "", "", "d", "(J)F", "e", "width", "height", "g", "(JFF)J", "", "v", "(J)Z", "operand", RXScreenCaptureService.KEY_WIDTH, "(JF)J", "i", "", "x", "(J)Ljava/lang/String;", "", ak.aG, "(J)I", "other", "j", "(JLjava/lang/Object;)Z", "t", "getWidth$annotations", "()V", "m", "getHeight$annotations", "q", "getMinDimension$annotations", "minDimension", "o", "getMaxDimension$annotations", "maxDimension", "", "packedValue", "f", "(J)J", ak.av, "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f30386b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f30387c = n.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f30388d = n.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30389a;

    /* JADX INFO: compiled from: Size.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lb1/m$a;", "", "Lb1/m;", "Zero", "J", ak.aF, "()J", "getZero-NH-jbRc$annotations", "()V", "Unspecified", ak.av, "getUnspecified-NH-jbRc$annotations", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @j2
        public static /* synthetic */ void d() {
        }

        public final long a() {
            return m.f30388d;
        }

        public final long c() {
            return m.f30387c;
        }
    }

    private /* synthetic */ m(long j10) {
        this.f30389a = j10;
    }

    public static final /* synthetic */ m c(long j10) {
        return new m(j10);
    }

    @j2
    public static final float d(long j10) {
        return t(j10);
    }

    @j2
    public static final float e(long j10) {
        return m(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static final long g(long j10, float f10, float f11) {
        return n.a(f10, f11);
    }

    public static /* synthetic */ long h(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = t(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m(j10);
        }
        return g(j10, f10, f11);
    }

    @j2
    public static final long i(long j10, float f10) {
        return n.a(t(j10) / f10, m(j10) / f10);
    }

    public static boolean j(long j10, Object obj) {
        return (obj instanceof m) && j10 == ((m) obj).getF30389a();
    }

    public static final boolean k(long j10, long j11) {
        return j10 == j11;
    }

    @j2
    public static /* synthetic */ void l() {
    }

    public static final float m(long j10) {
        if (!(j10 != f30388d)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    @j2
    public static /* synthetic */ void n() {
    }

    public static final float o(long j10) {
        return Math.max(Math.abs(t(j10)), Math.abs(m(j10)));
    }

    @j2
    public static /* synthetic */ void p() {
    }

    public static final float q(long j10) {
        return Math.min(Math.abs(t(j10)), Math.abs(m(j10)));
    }

    @r0
    public static /* synthetic */ void r() {
    }

    @j2
    public static /* synthetic */ void s() {
    }

    public static final float t(long j10) {
        if (!(j10 != f30388d)) {
            throw new IllegalStateException("Size is unspecified".toString());
        }
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static int u(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final boolean v(long j10) {
        return t(j10) <= 0.0f || m(j10) <= 0.0f;
    }

    @j2
    public static final long w(long j10, float f10) {
        return n.a(t(j10) * f10, m(j10) * f10);
    }

    @dl.d
    public static String x(long j10) {
        if (!(j10 != f30386b.a())) {
            return "Size.Unspecified";
        }
        return "Size(" + c.a(t(j10), 1) + ", " + c.a(m(j10), 1) + ')';
    }

    public boolean equals(Object obj) {
        return j(this.f30389a, obj);
    }

    public int hashCode() {
        return u(this.f30389a);
    }

    @dl.d
    public String toString() {
        return x(this.f30389a);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final /* synthetic */ long getF30389a() {
        return this.f30389a;
    }
}
