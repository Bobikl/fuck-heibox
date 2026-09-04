package androidx.compose.ui.graphics.colorspace;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m0;
import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ColorModel.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\rB\u0014\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0010\u0010\u0007\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b;", "", "", "l", "(J)Ljava/lang/String;", "", "k", "(J)I", "other", "", "g", "(JLjava/lang/Object;)Z", "", ak.av, "J", "packedValue", "j", "getComponentCount$annotations", "()V", "componentCount", "f", "(J)J", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
@m0
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f13753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f13754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f13755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f13756f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long packedValue;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.colorspace.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ColorModel.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/b$a;", "", "Landroidx/compose/ui/graphics/colorspace/b;", "Rgb", "J", ak.aF, "()J", "Xyz", "d", "Lab", "b", "Cmyk", ak.av, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final long a() {
            return b.f13756f;
        }

        public final long b() {
            return b.f13755e;
        }

        public final long c() {
            return b.f13753c;
        }

        public final long d() {
            return b.f13754d;
        }
    }

    static {
        long j10 = 3;
        long j11 = j10 << 32;
        f13753c = f((((long) 0) & KeyboardMap.kValueMask) | j11);
        f13754d = f((((long) 1) & KeyboardMap.kValueMask) | j11);
        f13755e = f(j11 | (((long) 2) & KeyboardMap.kValueMask));
        f13756f = f((j10 & KeyboardMap.kValueMask) | (((long) 4) << 32));
    }

    private /* synthetic */ b(long j10) {
        this.packedValue = j10;
    }

    public static final /* synthetic */ b e(long j10) {
        return new b(j10);
    }

    public static long f(long j10) {
        return j10;
    }

    public static boolean g(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).getPackedValue();
    }

    public static final boolean h(long j10, long j11) {
        return j10 == j11;
    }

    @j2
    public static /* synthetic */ void i() {
    }

    public static final int j(long j10) {
        return (int) (j10 >> 32);
    }

    public static int k(long j10) {
        return androidx.collection.k.a(j10);
    }

    @dl.d
    public static String l(long j10) {
        if (h(j10, f13753c)) {
            return "Rgb";
        }
        if (h(j10, f13754d)) {
            return "Xyz";
        }
        if (h(j10, f13755e)) {
            return "Lab";
        }
        return h(j10, f13756f) ? "Cmyk" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.packedValue, obj);
    }

    public int hashCode() {
        return k(this.packedValue);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    @dl.d
    public String toString() {
        return l(this.packedValue);
    }
}
