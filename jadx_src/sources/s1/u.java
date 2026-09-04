package s1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.r0;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087@\u0018\u00002\u00020\u0001:\u0001-B\u0014\b\u0000\u0012\u0006\u0010+\u001a\u00020\u001bø\u0001\u0002¢\u0006\u0004\b,\u0010\u0003J\u0019\u0010\u0002\u001a\u00020\u0000H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u0007J!\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\bH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000f\u0010\nJ!\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u000bH\u0086\nø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0000H\u0086\nø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u001b8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\u0003R\u001a\u0010\"\u001a\u00020 8Fø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b!\u0010\u0003R\u0011\u0010%\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010'\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010*\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b(\u0010)\u0088\u0001+\u0092\u0001\u00020\u001bø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Ls1/u;", "", "v", "(J)J", "", "other", "g", "(JF)J", "", "f", "(JD)J", "", RXScreenCaptureService.KEY_HEIGHT, "(JI)J", ak.aB, "r", "t", "d", "(JJ)I", "", ak.aG, "(J)Ljava/lang/String;", "o", "(J)I", "", "i", "(JLjava/lang/Object;)Z", "", "l", "getRawType$annotations", "()V", "rawType", "Ls1/w;", "m", "type", "q", "(J)Z", "isSp", "p", "isEm", "n", "(J)F", "value", "packedValue", "e", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f139249b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final w[] f139250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139251d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f139252a;

    /* JADX INFO: compiled from: TextUnit.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u000eR#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R)\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Ls1/u$a;", "", "", "Ls1/w;", "TextUnitTypes", "[Ls1/w;", ak.av, "()[Ls1/w;", "Ls1/u;", "Unspecified", "J", "b", "()J", "getUnspecified-XSAIIZE$annotations", "()V", "<init>", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void c() {
        }

        @dl.d
        public final w[] a() {
            return u.f139250c;
        }

        public final long b() {
            return u.f139251d;
        }
    }

    static {
        w.a aVar = w.f139257b;
        f139250c = new w[]{w.d(aVar.c()), w.d(aVar.b()), w.d(aVar.a())};
        f139251d = v.v(0L, Float.NaN);
    }

    private /* synthetic */ u(long j10) {
        this.f139252a = j10;
    }

    public static final /* synthetic */ u c(long j10) {
        return new u(j10);
    }

    public static final int d(long j10, long j11) {
        v.c(j10, j11);
        return Float.compare(n(j10), n(j11));
    }

    public static long e(long j10) {
        return j10;
    }

    public static final long f(long j10, double d10) {
        v.b(j10);
        return v.v(l(j10), (float) (((double) n(j10)) / d10));
    }

    public static final long g(long j10, float f10) {
        v.b(j10);
        return v.v(l(j10), n(j10) / f10);
    }

    public static final long h(long j10, int i10) {
        v.b(j10);
        return v.v(l(j10), n(j10) / i10);
    }

    public static boolean i(long j10, Object obj) {
        return (obj instanceof u) && j10 == ((u) obj).getF139252a();
    }

    public static final boolean j(long j10, long j11) {
        return j10 == j11;
    }

    @r0
    public static /* synthetic */ void k() {
    }

    public static final long l(long j10) {
        return j10 & 1095216660480L;
    }

    public static final long m(long j10) {
        return f139250c[(int) (l(j10) >>> 32)].getF139261a();
    }

    public static final float n(long j10) {
        kotlin.jvm.internal.y yVar = kotlin.jvm.internal.y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static int o(long j10) {
        return androidx.collection.k.a(j10);
    }

    public static final boolean p(long j10) {
        return l(j10) == 8589934592L;
    }

    public static final boolean q(long j10) {
        return l(j10) == 4294967296L;
    }

    public static final long r(long j10, double d10) {
        v.b(j10);
        return v.v(l(j10), (float) (((double) n(j10)) * d10));
    }

    public static final long s(long j10, float f10) {
        v.b(j10);
        return v.v(l(j10), n(j10) * f10);
    }

    public static final long t(long j10, int i10) {
        v.b(j10);
        return v.v(l(j10), n(j10) * i10);
    }

    @dl.d
    public static String u(long j10) {
        long jM = m(j10);
        w.a aVar = w.f139257b;
        if (w.g(jM, aVar.c())) {
            return "Unspecified";
        }
        if (w.g(jM, aVar.b())) {
            return n(j10) + ".sp";
        }
        if (!w.g(jM, aVar.a())) {
            return "Invalid";
        }
        return n(j10) + ".em";
    }

    public static final long v(long j10) {
        v.b(j10);
        return v.v(l(j10), -n(j10));
    }

    public boolean equals(Object obj) {
        return i(this.f139252a, obj);
    }

    public int hashCode() {
        return o(this.f139252a);
    }

    @dl.d
    public String toString() {
        return u(this.f139252a);
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final /* synthetic */ long getF139252a() {
        return this.f139252a;
    }
}
