package s1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dp.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001 B\u0012\u0012\u0006\u0010\u001b\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\u0007J\u001e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0004J\u0019\u0010\u0006\u001a\u00020\u0000H\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0004J!\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\nH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001e\u0010\r\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\bH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u0004J!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\nH\u0087\nø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\fJ\u001e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u0000H\u0097\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\u0088\u0001\u001b\u0092\u0001\u00020\bø\u0001\u0001\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006!"}, d2 = {"Ls1/h;", "", "other", "p", "(FF)F", "o", "t", "(F)F", "", "i", "", "j", "(FI)F", RXScreenCaptureService.KEY_HEIGHT, "q", "r", "f", "(FF)I", "", ak.aB, "(F)Ljava/lang/String;", "n", "(F)I", "", "", "k", "(FLjava/lang/Object;)Z", "value", "F", "m", "()F", "g", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class h implements Comparable<h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f139219c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f139220d = g(0.0f);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f139221e = g(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f139222f = g(Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f139223b;

    /* JADX INFO: compiled from: Dp.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\bR)\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R)\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Ls1/h$a;", "", "Ls1/h;", "Hairline", "F", ak.av, "()F", "getHairline-D9Ej5fM$annotations", "()V", "Infinity", ak.aF, "getInfinity-D9Ej5fM$annotations", "Unspecified", "e", "getUnspecified-D9Ej5fM$annotations", "<init>", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
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

        public final float a() {
            return h.f139220d;
        }

        public final float c() {
            return h.f139221e;
        }

        public final float e() {
            return h.f139222f;
        }
    }

    private /* synthetic */ h(float f10) {
        this.f139223b = f10;
    }

    public static final /* synthetic */ h d(float f10) {
        return new h(f10);
    }

    @j2
    public static int f(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float g(float f10) {
        return f10;
    }

    @j2
    public static final float h(float f10, float f11) {
        return f10 / f11;
    }

    @j2
    public static final float i(float f10, float f11) {
        return g(f10 / f11);
    }

    @j2
    public static final float j(float f10, int i10) {
        return g(f10 / i10);
    }

    public static boolean k(float f10, Object obj) {
        if (obj instanceof h) {
            return f0.g(Float.valueOf(f10), Float.valueOf(((h) obj).w()));
        }
        return false;
    }

    public static final boolean l(float f10, float f11) {
        return f0.g(Float.valueOf(f10), Float.valueOf(f11));
    }

    public static int n(float f10) {
        return Float.floatToIntBits(f10);
    }

    @j2
    public static final float o(float f10, float f11) {
        return g(f10 - f11);
    }

    @j2
    public static final float p(float f10, float f11) {
        return g(f10 + f11);
    }

    @j2
    public static final float q(float f10, float f11) {
        return g(f10 * f11);
    }

    @j2
    public static final float r(float f10, int i10) {
        return g(f10 * i10);
    }

    @j2
    @dl.d
    public static String s(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @j2
    public static final float t(float f10) {
        return g(-f10);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(h hVar) {
        return e(hVar.w());
    }

    @j2
    public int e(float f10) {
        return f(this.f139223b, f10);
    }

    public boolean equals(Object obj) {
        return k(this.f139223b, obj);
    }

    public int hashCode() {
        return n(this.f139223b);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getF139223b() {
        return this.f139223b;
    }

    @j2
    @dl.d
    public String toString() {
        return s(this.f139223b);
    }

    public final /* synthetic */ float w() {
        return this.f139223b;
    }
}
