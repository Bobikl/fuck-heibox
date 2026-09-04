package b1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: Offset.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001:\u0001(B\u0014\b\u0000\u0012\u0006\u0010&\u001a\u00020%ø\u0001\u0002¢\u0006\u0004\b'\u0010\u0010J\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u0019\u0010\u000f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0013J!\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0007\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0007\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0004\u0088\u0001&\u0092\u0001\u00020%ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lb1/f;", "", "", "e", "(J)F", "f", "x", "y", RXScreenCaptureService.KEY_HEIGHT, "(JFF)J", "", "t", "(J)Z", "m", "n", ak.aD, "(J)J", "other", ak.aG, "(JJ)J", "v", "operand", "(JF)J", "j", RXScreenCaptureService.KEY_WIDTH, "", "(J)Ljava/lang/String;", "", ak.aB, "(J)I", "k", "(JLjava/lang/Object;)Z", "p", "getX$annotations", "()V", "r", "getY$annotations", "", "packedValue", "g", ak.av, "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f30364b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f30365c = g.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f30366d = g.a(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f30367e = g.a(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30368a;

    /* JADX INFO: compiled from: Offset.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Lb1/f$a;", "", "Lb1/f;", "Zero", "J", "e", "()J", "getZero-F1C5BW0$annotations", "()V", "Infinite", ak.av, "getInfinite-F1C5BW0$annotations", "Unspecified", ak.aF, "getUnspecified-F1C5BW0$annotations", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
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

        @j2
        public static /* synthetic */ void f() {
        }

        public final long a() {
            return f.f30366d;
        }

        public final long c() {
            return f.f30367e;
        }

        public final long e() {
            return f.f30365c;
        }
    }

    private /* synthetic */ f(long j10) {
        this.f30368a = j10;
    }

    public static final /* synthetic */ f d(long j10) {
        return new f(j10);
    }

    @j2
    public static final float e(long j10) {
        return p(j10);
    }

    @j2
    public static final float f(long j10) {
        return r(j10);
    }

    public static long g(long j10) {
        return j10;
    }

    public static final long h(long j10, float f10, float f11) {
        return g.a(f10, f11);
    }

    public static /* synthetic */ long i(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = p(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = r(j10);
        }
        return h(j10, f10, f11);
    }

    @j2
    public static final long j(long j10, float f10) {
        return g.a(p(j10) / f10, r(j10) / f10);
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof f) && j10 == ((f) obj).getF30368a();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    @j2
    public static final float m(long j10) {
        return (float) Math.sqrt((p(j10) * p(j10)) + (r(j10) * r(j10)));
    }

    @j2
    public static final float n(long j10) {
        return (p(j10) * p(j10)) + (r(j10) * r(j10));
    }

    @j2
    public static /* synthetic */ void o() {
    }

    public static final float p(long j10) {
        if (!(j10 != f30367e)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @j2
    public static /* synthetic */ void q() {
    }

    public static final float r(long j10) {
        if (!(j10 != f30367e)) {
            throw new IllegalStateException("Offset is unspecified".toString());
        }
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int s(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final boolean t(long j10) {
        if ((Float.isNaN(p(j10)) || Float.isNaN(r(j10))) ? false : true) {
            return true;
        }
        throw new IllegalStateException("Offset argument contained a NaN value.".toString());
    }

    @j2
    public static final long u(long j10, long j11) {
        return g.a(p(j10) - p(j11), r(j10) - r(j11));
    }

    @j2
    public static final long v(long j10, long j11) {
        return g.a(p(j10) + p(j11), r(j10) + r(j11));
    }

    @j2
    public static final long w(long j10, float f10) {
        return g.a(p(j10) % f10, r(j10) % f10);
    }

    @j2
    public static final long x(long j10, float f10) {
        return g.a(p(j10) * f10, r(j10) * f10);
    }

    @dl.d
    public static String y(long j10) {
        if (!g.d(j10)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + c.a(p(j10), 1) + ", " + c.a(r(j10), 1) + ')';
    }

    @j2
    public static final long z(long j10) {
        return g.a(-p(j10), -r(j10));
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final /* synthetic */ long getF30368a() {
        return this.f30368a;
    }

    public boolean equals(Object obj) {
        return k(this.f30368a, obj);
    }

    public int hashCode() {
        return s(this.f30368a);
    }

    @dl.d
    public String toString() {
        return y(this.f30368a);
    }
}
