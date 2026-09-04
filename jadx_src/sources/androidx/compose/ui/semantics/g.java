package androidx.compose.ui.semantics;

import androidx.compose.runtime.m0;
import com.max.xiaoheihe.bean.game.GameObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: SemanticsProperties.kt */
/* JADX INFO: loaded from: classes.dex */
@m0
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/semantics/g;", "", "", "l", "(I)Ljava/lang/String;", "", "k", "(I)I", "other", "", "i", "(ILjava/lang/Object;)Z", ak.av, "I", "value", RXScreenCaptureService.KEY_HEIGHT, "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f16118c = h(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f16119d = h(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f16120e = h(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f16121f = h(3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f16122g = h(4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f16123h = h(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.semantics.g$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SemanticsProperties.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/semantics/g$a;", "", "Landroidx/compose/ui/semantics/g;", "Button", "I", ak.av, "()I", "Checkbox", "b", GameObj.PLATFORM_SWITCH_NAME, "e", "RadioButton", "d", "Tab", "f", "Image", ak.aF, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final int a() {
            return g.f16118c;
        }

        public final int b() {
            return g.f16119d;
        }

        public final int c() {
            return g.f16123h;
        }

        public final int d() {
            return g.f16121f;
        }

        public final int e() {
            return g.f16120e;
        }

        public final int f() {
            return g.f16122g;
        }
    }

    private /* synthetic */ g(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ g g(int i10) {
        return new g(i10);
    }

    private static int h(int i10) {
        return i10;
    }

    public static boolean i(int i10, Object obj) {
        return (obj instanceof g) && i10 == ((g) obj).getValue();
    }

    public static final boolean j(int i10, int i11) {
        return i10 == i11;
    }

    public static int k(int i10) {
        return i10;
    }

    @dl.d
    public static String l(int i10) {
        if (j(i10, f16118c)) {
            return "Button";
        }
        if (j(i10, f16119d)) {
            return "Checkbox";
        }
        if (j(i10, f16120e)) {
            return GameObj.PLATFORM_SWITCH_NAME;
        }
        if (j(i10, f16121f)) {
            return "RadioButton";
        }
        if (j(i10, f16122g)) {
            return "Tab";
        }
        return j(i10, f16123h) ? "Image" : "Unknown";
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
