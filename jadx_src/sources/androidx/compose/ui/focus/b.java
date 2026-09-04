package androidx.compose.ui.focus;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;

/* JADX INFO: compiled from: FocusTraversal.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\fB\u0014\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u000e\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/b;", "", "", "p", "(I)Ljava/lang/String;", "", "o", "(I)I", "other", "", "m", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "l", "b", "ui_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f13573c = l(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f13574d = l(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f13575e = l(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13576f = l(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f13577g = l(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f13578h = l(6);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f13579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f13580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f13581k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f13582l;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.ui.focus.b$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FocusTraversal.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u0014R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R)\u0010\u0011\u001a\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\u0006R)\u0010\u0015\u001a\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0006R)\u0010\u0018\u001a\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0019\u0010\u0006R)\u0010\u001b\u001a\u00020\u00028GX\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/ui/focus/b$a;", "", "Landroidx/compose/ui/focus/b;", "Next", "I", "i", "()I", "Previous", "l", "Left", RXScreenCaptureService.KEY_HEIGHT, "Right", "m", "Up", "n", "Down", ak.av, "Enter", "b", "getEnter-dhqQ-8s$annotations", "()V", "Exit", "d", "getExit-dhqQ-8s$annotations", "In", "f", "getIn-dhqQ-8s$annotations", "Out", "j", "getOut-dhqQ-8s$annotations", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @androidx.compose.ui.g
        public static /* synthetic */ void c() {
        }

        @androidx.compose.ui.g
        public static /* synthetic */ void e() {
        }

        @androidx.compose.ui.g
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Enter instead.", replaceWith = @s0(expression = "Enter", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Enter"}))
        public static /* synthetic */ void g() {
        }

        @androidx.compose.ui.g
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Use FocusDirection.Exit instead.", replaceWith = @s0(expression = "Exit", imports = {"androidx.compose.ui.focus.FocusDirection.Companion.Exit"}))
        public static /* synthetic */ void k() {
        }

        public final int a() {
            return b.f13578h;
        }

        @androidx.compose.ui.g
        public final int b() {
            return b.f13579i;
        }

        @androidx.compose.ui.g
        public final int d() {
            return b.f13580j;
        }

        @androidx.compose.ui.g
        public final int f() {
            return b.f13581k;
        }

        public final int h() {
            return b.f13575e;
        }

        public final int i() {
            return b.f13573c;
        }

        @androidx.compose.ui.g
        public final int j() {
            return b.f13582l;
        }

        public final int l() {
            return b.f13574d;
        }

        public final int m() {
            return b.f13576f;
        }

        public final int n() {
            return b.f13577g;
        }
    }

    static {
        int iL = l(7);
        f13579i = iL;
        int iL2 = l(8);
        f13580j = iL2;
        f13581k = iL;
        f13582l = iL2;
    }

    private /* synthetic */ b(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ b k(int i10) {
        return new b(i10);
    }

    public static int l(int i10) {
        return i10;
    }

    public static boolean m(int i10, Object obj) {
        return (obj instanceof b) && i10 == ((b) obj).getValue();
    }

    public static final boolean n(int i10, int i11) {
        return i10 == i11;
    }

    public static int o(int i10) {
        return i10;
    }

    @dl.d
    public static String p(int i10) {
        if (n(i10, f13573c)) {
            return "Next";
        }
        if (n(i10, f13574d)) {
            return "Previous";
        }
        if (n(i10, f13575e)) {
            return "Left";
        }
        if (n(i10, f13576f)) {
            return "Right";
        }
        if (n(i10, f13577g)) {
            return "Up";
        }
        if (n(i10, f13578h)) {
            return "Down";
        }
        if (n(i10, f13579i)) {
            return "Enter";
        }
        return n(i10, f13580j) ? "Exit" : "Invalid FocusDirection";
    }

    public boolean equals(Object obj) {
        return m(this.value, obj);
    }

    public int hashCode() {
        return o(this.value);
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    @dl.d
    public String toString() {
        return p(this.value);
    }
}
