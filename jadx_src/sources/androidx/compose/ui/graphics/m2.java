package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: TileMode.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/m2;", "", "", "j", "(I)Ljava/lang/String;", "", "i", "(I)I", "other", "", "g", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "f", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13919c = f(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f13920d = f(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f13921e = f(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13922f = f(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.m2$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TileMode.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/graphics/m2$a;", "", "Landroidx/compose/ui/graphics/m2;", "Clamp", "I", ak.av, "()I", "Repeated", "d", "Mirror", ak.aF, "Decal", "b", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return m2.f13919c;
        }

        public final int b() {
            return m2.f13922f;
        }

        public final int c() {
            return m2.f13921e;
        }

        public final int d() {
            return m2.f13920d;
        }
    }

    private /* synthetic */ m2(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ m2 e(int i10) {
        return new m2(i10);
    }

    public static int f(int i10) {
        return i10;
    }

    public static boolean g(int i10, Object obj) {
        return (obj instanceof m2) && i10 == ((m2) obj).getValue();
    }

    public static final boolean h(int i10, int i11) {
        return i10 == i11;
    }

    public static int i(int i10) {
        return i10;
    }

    @dl.d
    public static String j(int i10) {
        if (h(i10, f13919c)) {
            return "Clamp";
        }
        if (h(i10, f13920d)) {
            return "Repeated";
        }
        if (h(i10, f13921e)) {
            return "Mirror";
        }
        return h(i10, f13922f) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return g(this.value, obj);
    }

    public int hashCode() {
        return i(this.value);
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return j(this.value);
    }
}
