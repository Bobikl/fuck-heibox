package s1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.r0;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001:\u0001'B\u0014\b\u0000\u0012\u0006\u0010$\u001a\u00020#ø\u0001\u0001¢\u0006\u0004\b%\u0010&J'\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u0002H\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\u0002H\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\fJ!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0011H\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0010J!\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0011H\u0087\u0002ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u0016H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0003\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\fR#\u0010\u0004\u001a\u00020\u00028FX\u0087\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\f\u0088\u0001$\u0092\u0001\u00020#ø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006("}, d2 = {"Ls1/l;", "", "Ls1/h;", "width", "height", "g", "(JFF)J", "other", ak.aB, "(JJ)J", "t", "d", "(J)F", "e", "", "v", "(JI)J", "", ak.aG, "(JF)J", "j", "i", "", RXScreenCaptureService.KEY_WIDTH, "(J)Ljava/lang/String;", "r", "(J)I", "", "k", "(JLjava/lang/Object;)Z", "p", "getWidth-D9Ej5fM$annotations", "()V", "m", "getHeight-D9Ej5fM$annotations", "", "packedValue", "f", "(J)J", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f139233b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139235d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f139236a;

    /* JADX INFO: compiled from: Dp.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Ls1/l$a;", "", "Ls1/l;", "Zero", "J", "b", "()J", "Unspecified", ak.av, "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final long a() {
            return l.f139235d;
        }

        public final long b() {
            return l.f139234c;
        }
    }

    static {
        float f10 = 0;
        f139234c = i.b(h.g(f10), h.g(f10));
        h.a aVar = h.f139219c;
        f139235d = i.b(aVar.e(), aVar.e());
    }

    private /* synthetic */ l(long j10) {
        this.f139236a = j10;
    }

    public static final /* synthetic */ l c(long j10) {
        return new l(j10);
    }

    @j2
    public static final float d(long j10) {
        return p(j10);
    }

    @j2
    public static final float e(long j10) {
        return m(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static final long g(long j10, float f10, float f11) {
        return i.b(f10, f11);
    }

    public static /* synthetic */ long h(long j10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = p(j10);
        }
        if ((i10 & 2) != 0) {
            f11 = m(j10);
        }
        return g(j10, f10, f11);
    }

    @j2
    public static final long i(long j10, float f10) {
        return i.b(h.g(p(j10) / f10), h.g(m(j10) / f10));
    }

    @j2
    public static final long j(long j10, int i10) {
        float f10 = i10;
        return i.b(h.g(p(j10) / f10), h.g(m(j10) / f10));
    }

    public static boolean k(long j10, Object obj) {
        return (obj instanceof l) && j10 == ((l) obj).getF139236a();
    }

    public static final boolean l(long j10, long j11) {
        return j10 == j11;
    }

    public static final float m(long j10) {
        if (!(j10 != f139235d)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return h.g(Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask)));
    }

    @j2
    public static /* synthetic */ void n() {
    }

    @r0
    public static /* synthetic */ void o() {
    }

    public static final float p(long j10) {
        if (!(j10 != f139235d)) {
            throw new IllegalStateException("DpSize is unspecified".toString());
        }
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return h.g(Float.intBitsToFloat((int) (j10 >> 32)));
    }

    @j2
    public static /* synthetic */ void q() {
    }

    public static int r(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final long s(long j10, long j11) {
        return i.b(h.g(p(j10) - p(j11)), h.g(m(j10) - m(j11)));
    }

    @j2
    public static final long t(long j10, long j11) {
        return i.b(h.g(p(j10) + p(j11)), h.g(m(j10) + m(j11)));
    }

    @j2
    public static final long u(long j10, float f10) {
        return i.b(h.g(p(j10) * f10), h.g(m(j10) * f10));
    }

    @j2
    public static final long v(long j10, int i10) {
        float f10 = i10;
        return i.b(h.g(p(j10) * f10), h.g(m(j10) * f10));
    }

    @j2
    @dl.d
    public static String w(long j10) {
        if (!(j10 != f139233b.a())) {
            return "DpSize.Unspecified";
        }
        return ((Object) h.s(p(j10))) + " x " + ((Object) h.s(m(j10)));
    }

    public boolean equals(Object obj) {
        return k(this.f139236a, obj);
    }

    public int hashCode() {
        return r(this.f139236a);
    }

    @j2
    @dl.d
    public String toString() {
        return w(this.f139236a);
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final /* synthetic */ long getF139236a() {
        return this.f139236a;
    }
}
