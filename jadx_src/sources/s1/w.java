package s1;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextUnit.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0010B\u0012\u0012\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000b\u0088\u0001\r\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Ls1/w;", "", "", "i", "(J)Ljava/lang/String;", "", RXScreenCaptureService.KEY_HEIGHT, "(J)I", "other", "", "f", "(JLjava/lang/Object;)Z", "", "type", "e", "(J)J", ak.av, "ui-unit_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final a f139257b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f139258c = e(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f139259d = e(4294967296L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f139260e = e(8589934592L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f139261a;

    /* JADX INFO: compiled from: TextUnit.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Ls1/w$a;", "", "Ls1/w;", "Unspecified", "J", ak.aF, "()J", "Sp", "b", "Em", ak.av, "<init>", "()V", "ui-unit_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final long a() {
            return w.f139260e;
        }

        public final long b() {
            return w.f139259d;
        }

        public final long c() {
            return w.f139258c;
        }
    }

    private /* synthetic */ w(long j10) {
        this.f139261a = j10;
    }

    public static final /* synthetic */ w d(long j10) {
        return new w(j10);
    }

    public static long e(long j10) {
        return j10;
    }

    public static boolean f(long j10, Object obj) {
        return (obj instanceof w) && j10 == ((w) obj).getF139261a();
    }

    public static final boolean g(long j10, long j11) {
        return j10 == j11;
    }

    public static int h(long j10) {
        return androidx.collection.k.a(j10);
    }

    @dl.d
    public static String i(long j10) {
        if (g(j10, f139258c)) {
            return "Unspecified";
        }
        if (g(j10, f139259d)) {
            return "Sp";
        }
        return g(j10, f139260e) ? "Em" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.f139261a, obj);
    }

    public int hashCode() {
        return h(this.f139261a);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ long getF139261a() {
        return this.f139261a;
    }

    @dl.d
    public String toString() {
        return i(this.f139261a);
    }
}
