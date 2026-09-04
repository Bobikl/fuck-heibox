package androidx.compose.ui.input.pointer;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PointerEvent.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/m0;", "", "", "k", "(I)Ljava/lang/String;", "", "j", "(I)I", "other", "", RXScreenCaptureService.KEY_HEIGHT, "(ILjava/lang/Object;)Z", ak.av, "I", "value", "g", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14801c = g(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14802d = g(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14803e = g(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f14804f = g(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f14805g = g(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.m0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PointerEvent.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/m0$a;", "", "Landroidx/compose/ui/input/pointer/m0;", "Unknown", "I", "e", "()I", "Touch", "d", "Mouse", "b", "Stylus", ak.aF, "Eraser", ak.av, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return m0.f14805g;
        }

        public final int b() {
            return m0.f14803e;
        }

        public final int c() {
            return m0.f14804f;
        }

        public final int d() {
            return m0.f14802d;
        }

        public final int e() {
            return m0.f14801c;
        }
    }

    private /* synthetic */ m0(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ m0 f(int i10) {
        return new m0(i10);
    }

    private static int g(int i10) {
        return i10;
    }

    public static boolean h(int i10, Object obj) {
        return (obj instanceof m0) && i10 == ((m0) obj).getValue();
    }

    public static final boolean i(int i10, int i11) {
        return i10 == i11;
    }

    public static int j(int i10) {
        return i10;
    }

    @dl.d
    public static String k(int i10) {
        if (i10 == 1) {
            return "Touch";
        }
        if (i10 == 2) {
            return "Mouse";
        }
        if (i10 != 3) {
            return i10 != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public boolean equals(Object obj) {
        return h(this.value, obj);
    }

    public int hashCode() {
        return j(this.value);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return k(this.value);
    }
}
