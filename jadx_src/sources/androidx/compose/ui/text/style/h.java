package androidx.compose.ui.text.style;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TextAlign.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/style/h;", "", "", "l", "(I)Ljava/lang/String;", "", "k", "(I)I", "other", "", "i", "(ILjava/lang/Object;)Z", ak.av, "I", "value", RXScreenCaptureService.KEY_HEIGHT, "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16938c = h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16939d = h(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16940e = h(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16941f = h(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f16942g = h(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f16943h = h(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.h$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TextAlign.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002ø\u0001\u0000R \u0010\u0005\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR \u0010\t\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\u000b\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR \u0010\r\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR \u0010\u0011\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/h$a;", "", "", "Landroidx/compose/ui/text/style/h;", "g", "Left", "I", "d", "()I", "Right", "e", "Center", ak.av, "Justify", ak.aF, "Start", "f", "End", "b", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int a() {
            return h.f16940e;
        }

        public final int b() {
            return h.f16943h;
        }

        public final int c() {
            return h.f16941f;
        }

        public final int d() {
            return h.f16938c;
        }

        public final int e() {
            return h.f16939d;
        }

        public final int f() {
            return h.f16942g;
        }

        @dl.d
        public final List<h> g() {
            return CollectionsKt__CollectionsKt.L(h.g(d()), h.g(e()), h.g(a()), h.g(c()), h.g(f()), h.g(b()));
        }
    }

    private /* synthetic */ h(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ h g(int i10) {
        return new h(i10);
    }

    public static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof h) && i10 == ((h) obj).getValue();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return i10;
    }

    @dl.d
    public static String l(int i10) {
        if (j(i10, f16938c)) {
            return "Left";
        }
        if (j(i10, f16939d)) {
            return "Right";
        }
        if (j(i10, f16940e)) {
            return "Center";
        }
        if (j(i10, f16941f)) {
            return "Justify";
        }
        if (j(i10, f16942g)) {
            return "Start";
        }
        return j(i10, f16943h) ? "End" : "Invalid";
    }

    public boolean equals(Object obj) {
        return i(this.value, obj);
    }

    public int hashCode() {
        return k(this.value);
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return l(this.value);
    }
}
