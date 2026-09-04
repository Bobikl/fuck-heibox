package androidx.compose.ui.graphics;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PathFillType.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/n1;", "", "", RXScreenCaptureService.KEY_HEIGHT, "(I)Ljava/lang/String;", "", "g", "(I)I", "other", "", "e", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "d", "b", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class n1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13925c = d(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f13926d = d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.n1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PathFillType.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/graphics/n1$a;", "", "Landroidx/compose/ui/graphics/n1;", "NonZero", "I", "b", "()I", "EvenOdd", ak.av, "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return n1.f13926d;
        }

        public final int b() {
            return n1.f13925c;
        }
    }

    private /* synthetic */ n1(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ n1 c(int i10) {
        return new n1(i10);
    }

    public static int d(int i10) {
        return i10;
    }

    public static boolean e(int i10, Object obj) {
        return (obj instanceof n1) && i10 == ((n1) obj).getValue();
    }

    public static final boolean f(int i10, int i11) {
        return i10 == i11;
    }

    public static int g(int i10) {
        return i10;
    }

    @dl.d
    public static String h(int i10) {
        if (f(i10, f13925c)) {
            return "NonZero";
        }
        return f(i10, f13926d) ? "EvenOdd" : "Unknown";
    }

    public boolean equals(Object obj) {
        return e(this.value, obj);
    }

    public int hashCode() {
        return g(this.value);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return h(this.value);
    }
}
