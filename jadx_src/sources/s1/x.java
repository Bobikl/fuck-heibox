package s1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Velocity.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001:\u0001&B\u0014\b\u0000\u0012\u0006\u0010$\u001a\u00020#ø\u0001\u0002¢\u0006\u0004\b%\u0010\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\u0002¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0012J!\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u0004\u0088\u0001$\u0092\u0001\u00020#ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006'"}, d2 = {"Ls1/x;", "", "", ak.aF, "(J)F", "d", "x", "y", "f", "(JFF)J", ak.aG, "(J)J", "other", "p", "(JJ)J", "q", "operand", ak.aB, "(JF)J", RXScreenCaptureService.KEY_HEIGHT, "r", "", "t", "(J)Ljava/lang/String;", "", "o", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "l", "getX$annotations", "()V", "n", "getY$annotations", "", "packedValue", "e", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f139262b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139263c = y.a(0.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f139264a;

    /* JADX INFO: compiled from: Velocity.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Ls1/x$a;", "", "Ls1/x;", "Zero", "J", ak.av, "()J", "getZero-9UxMQ8M$annotations", "()V", "<init>", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return x.f139263c;
        }
    }

    private /* synthetic */ x(long j10) {
        this.f139264a = j10;
    }

    public static final /* synthetic */ x b(long j10) {
        return new x(j10);
    }

    @j2
    public static final float c(long j10) {
        return l(j10);
    }

    @j2
    public static final float d(long j10) {
        return n(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, float f10, float f11) {
        return y.a(f10, f11);
    }

    public static /* synthetic */ long g(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = l(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = n(j10);
        }
        return f(j10, f10, f11);
    }

    @j2
    public static final long h(long j10, float f10) {
        return y.a(l(j10) / f10, n(j10) / f10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof x) && j10 == ((x) obj).getF139264a();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @j2
    public static /* synthetic */ void k() {
    }

    public static final float l(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @j2
    public static /* synthetic */ void m() {
    }

    public static final float n(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int o(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final long p(long j10, long j11) {
        return y.a(l(j10) - l(j11), n(j10) - n(j11));
    }

    @j2
    public static final long q(long j10, long j11) {
        return y.a(l(j10) + l(j11), n(j10) + n(j11));
    }

    @j2
    public static final long r(long j10, float f10) {
        return y.a(l(j10) % f10, n(j10) % f10);
    }

    @j2
    public static final long s(long j10, float f10) {
        return y.a(l(j10) * f10, n(j10) * f10);
    }

    @dl.d
    public static String t(long j10) {
        return '(' + l(j10) + ", " + n(j10) + ") px/sec";
    }

    @j2
    public static final long u(long j10) {
        return y.a(-l(j10), -n(j10));
    }

    public boolean equals(Object obj) {
        return i(this.f139264a, obj);
    }

    public int hashCode() {
        return o(this.f139264a);
    }

    @dl.d
    public String toString() {
        return t(this.f139264a);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ long getF139264a() {
        return this.f139264a;
    }
}
