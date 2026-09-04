package s1;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.r0;

/* JADX INFO: compiled from: IntSize.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u001cB\u0014\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0018ø\u0001\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H\u0087\n¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u0004\u0088\u0001\u0019\u0092\u0001\u00020\u0018ø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Ls1/r;", "", "", ak.aF, "(J)I", "d", "other", "o", "(JI)J", "f", "", "p", "(J)Ljava/lang/String;", "n", "", "g", "(JLjava/lang/Object;)Z", "m", "getWidth$annotations", "()V", "width", "j", "getHeight$annotations", "height", "", "packedValue", "e", "(J)J", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f139246b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139247c = e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f139248a;

    /* JADX INFO: compiled from: IntSize.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Ls1/r$a;", "", "Ls1/r;", "Zero", "J", ak.av, "()J", "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final long a() {
            return r.f139247c;
        }
    }

    private /* synthetic */ r(long j10) {
        this.f139248a = j10;
    }

    public static final /* synthetic */ r b(long j10) {
        return new r(j10);
    }

    @j2
    public static final int c(long j10) {
        return m(j10);
    }

    @j2
    public static final int d(long j10) {
        return j(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    @j2
    public static final long f(long j10, int i10) {
        return s.a(m(j10) / i10, j(j10) / i10);
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof r) && j10 == ((r) obj).getF139248a();
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    @j2
    public static /* synthetic */ void i() {
    }

    public static final int j(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }

    @r0
    public static /* synthetic */ void k() {
    }

    @j2
    public static /* synthetic */ void l() {
    }

    public static final int m(long j10) {
        return (int) (j10 >> 32);
    }

    public static int n(long j10) {
        return androidx.collection.k.a(j10);
    }

    @j2
    public static final long o(long j10, int i10) {
        return s.a(m(j10) * i10, j(j10) * i10);
    }

    @j2
    @dl.d
    public static String p(long j10) {
        return m(j10) + " x " + j(j10);
    }

    public boolean equals(Object obj) {
        return g(this.f139248a, obj);
    }

    public int hashCode() {
        return n(this.f139248a);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final /* synthetic */ long getF139248a() {
        return this.f139248a;
    }

    @j2
    @dl.d
    public String toString() {
        return p(this.f139248a);
    }
}
