package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.g;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.k;
import xh.f;

/* JADX INFO: compiled from: NestedScrollModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/c;", "", "", "i", "(I)Ljava/lang/String;", "", RXScreenCaptureService.KEY_HEIGHT, "(I)I", "other", "", "f", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "e", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@f
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f14656c = e(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f14657d = e(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f14658e = e(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.input.nestedscroll.c$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: NestedScrollModifier.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\fR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R)\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/c$a;", "", "Landroidx/compose/ui/input/nestedscroll/c;", "Drag", "I", ak.av, "()I", "Fling", "b", "Relocate", ak.aF, "getRelocate-WNlRxjI$annotations", "()V", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @g
        @k(message = "Do not use. Will be removed in the future.")
        public static /* synthetic */ void d() {
        }

        public final int a() {
            return c.f14656c;
        }

        public final int b() {
            return c.f14657d;
        }

        public final int c() {
            return c.f14658e;
        }
    }

    private /* synthetic */ c(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ c d(int i10) {
        return new c(i10);
    }

    public static int e(int i10) {
        return i10;
    }

    public static boolean f(int i10, Object obj) {
        return (obj instanceof c) && i10 == ((c) obj).getValue();
    }

    public static final boolean g(int i10, int i11) {
        return i10 == i11;
    }

    public static int h(int i10) {
        return i10;
    }

    @d
    public static String i(int i10) {
        if (g(i10, f14656c)) {
            return "Drag";
        }
        if (g(i10, f14657d)) {
            return "Fling";
        }
        return g(i10, f14658e) ? "Relocate" : "Invalid";
    }

    public boolean equals(Object obj) {
        return f(this.value, obj);
    }

    public int hashCode() {
        return h(this.value);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @d
    public String toString() {
        return i(this.value);
    }
}
