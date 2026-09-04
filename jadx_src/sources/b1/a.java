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

/* JADX INFO: compiled from: CornerRadius.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001:\u0001%B\u0014\b\u0000\u0012\u0006\u0010#\u001a\u00020\"ø\u0001\u0002¢\u0006\u0004\b$\u0010\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004J*\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\n\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0087\u0002ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001f\u001a\u0004\b \u0010\u0004\u0088\u0001#\u0092\u0001\u00020\"ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lb1/a;", "", "", ak.aF, "(J)F", "d", "x", "y", "f", "(JFF)J", ak.aG, "(J)J", "other", "q", "(JJ)J", "r", "operand", ak.aB, "(JF)J", RXScreenCaptureService.KEY_HEIGHT, "", "t", "(J)Ljava/lang/String;", "", "p", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "m", "getX$annotations", "()V", "o", "getY$annotations", "", "packedValue", "e", ak.av, "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final C0256a f30356b = new C0256a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f30357c = b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f30358a;

    /* JADX INFO: renamed from: b1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CornerRadius.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Lb1/a$a;", "", "Lb1/a;", "Zero", "J", ak.av, "()J", "getZero-kKHJgLs$annotations", "()V", "<init>", "ui-geometry_release"}, k = 1, mv = {1, 7, 1})
    public static final class C0256a {
        private C0256a() {
        }

        public /* synthetic */ C0256a(u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void b() {
        }

        public final long a() {
            return a.f30357c;
        }
    }

    private /* synthetic */ a(long j10) {
        this.f30358a = j10;
    }

    public static final /* synthetic */ a b(long j10) {
        return new a(j10);
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
        return b.a(f10, f11);
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
        return b.a(m(j10) / f10, o(j10) / f10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof a) && j10 == ((a) obj).getF30358a();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @r0
    public static /* synthetic */ void k() {
    }

    @j2
    public static /* synthetic */ void l() {
    }

    public static final float m(long j10) {
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    @j2
    public static /* synthetic */ void n() {
    }

    public static final float o(long j10) {
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int p(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final long q(long j10, long j11) {
        return b.a(m(j10) - m(j11), o(j10) - o(j11));
    }

    @j2
    public static final long r(long j10, long j11) {
        return b.a(m(j10) + m(j11), o(j10) + o(j11));
    }

    @j2
    public static final long s(long j10, float f10) {
        return b.a(m(j10) * f10, o(j10) * f10);
    }

    @dl.d
    public static String t(long j10) {
        if (m(j10) == o(j10)) {
            return "CornerRadius.circular(" + c.a(m(j10), 1) + ')';
        }
        return "CornerRadius.elliptical(" + c.a(m(j10), 1) + ", " + c.a(o(j10), 1) + ')';
    }

    @j2
    public static final long u(long j10) {
        return b.a(-m(j10), -o(j10));
    }

    public boolean equals(Object obj) {
        return i(this.f30358a, obj);
    }

    public int hashCode() {
        return p(this.f30358a);
    }

    @dl.d
    public String toString() {
        return t(this.f30358a);
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ long getF30358a() {
        return this.f30358a;
    }
}
