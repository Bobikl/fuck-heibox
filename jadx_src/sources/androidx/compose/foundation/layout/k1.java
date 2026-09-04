package androidx.compose.foundation.layout;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: WindowInsets.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0012B\u0014\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\fø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0088\u0001\u0014\u0092\u0001\u00020\fø\u0001\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/k1;", "", "sides", ak.aB, "(II)I", "", "q", "(II)Z", "", "t", "(I)Ljava/lang/String;", "v", "", "r", "(I)I", "other", "o", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "n", "b", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
@xh.f
public final class k1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f6339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f6340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f6341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f6342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f6343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f6344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f6345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f6346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f6347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f6348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f6349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f6350n;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int value;

    /* JADX INFO: renamed from: androidx.compose.foundation.layout.k1$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: WindowInsets.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eR#\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R#\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R#\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R#\u0010\u000b\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0004\u001a\u0004\b\u0014\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0017\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/k1$a;", "", "Landroidx/compose/foundation/layout/k1;", "AllowLeftInLtr", "I", ak.av, "()I", "AllowRightInLtr", ak.aF, "AllowLeftInRtl", "b", "AllowRightInRtl", "d", "Start", "j", "End", "f", "Top", "k", "Bottom", "e", "Left", RXScreenCaptureService.KEY_HEIGHT, "Right", "i", "Horizontal", "g", "Vertical", "l", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final int a() {
            return k1.f6339c;
        }

        public final int b() {
            return k1.f6341e;
        }

        public final int c() {
            return k1.f6340d;
        }

        public final int d() {
            return k1.f6342f;
        }

        public final int e() {
            return k1.f6346j;
        }

        public final int f() {
            return k1.f6344h;
        }

        public final int g() {
            return k1.f6349m;
        }

        public final int h() {
            return k1.f6347k;
        }

        public final int i() {
            return k1.f6348l;
        }

        public final int j() {
            return k1.f6343g;
        }

        public final int k() {
            return k1.f6345i;
        }

        public final int l() {
            return k1.f6350n;
        }
    }

    static {
        int iN = n(8);
        f6339c = iN;
        int iN2 = n(4);
        f6340d = iN2;
        int iN3 = n(2);
        f6341e = iN3;
        int iN4 = n(1);
        f6342f = iN4;
        f6343g = s(iN, iN4);
        f6344h = s(iN2, iN3);
        int iN5 = n(16);
        f6345i = iN5;
        int iN6 = n(32);
        f6346j = iN6;
        int iS = s(iN, iN3);
        f6347k = iS;
        int iS2 = s(iN2, iN4);
        f6348l = iS2;
        f6349m = s(iS, iS2);
        f6350n = s(iN5, iN6);
    }

    private /* synthetic */ k1(int i10) {
        this.value = i10;
    }

    public static final /* synthetic */ k1 m(int i10) {
        return new k1(i10);
    }

    private static int n(int i10) {
        return i10;
    }

    public static boolean o(int i10, Object obj) {
        return (obj instanceof k1) && i10 == ((k1) obj).getValue();
    }

    public static final boolean p(int i10, int i11) {
        return i10 == i11;
    }

    public static final boolean q(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public static int r(int i10) {
        return i10;
    }

    public static final int s(int i10, int i11) {
        return n(i10 | i11);
    }

    @dl.d
    public static String t(int i10) {
        return "WindowInsetsSides(" + v(i10) + ')';
    }

    private static final String v(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f6343g;
        if ((i10 & i11) == i11) {
            w(sb2, "Start");
        }
        int i12 = f6347k;
        if ((i10 & i12) == i12) {
            w(sb2, "Left");
        }
        int i13 = f6345i;
        if ((i10 & i13) == i13) {
            w(sb2, "Top");
        }
        int i14 = f6344h;
        if ((i10 & i14) == i14) {
            w(sb2, "End");
        }
        int i15 = f6348l;
        if ((i10 & i15) == i15) {
            w(sb2, "Right");
        }
        int i16 = f6346j;
        if ((i10 & i16) == i16) {
            w(sb2, "Bottom");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    private static final void w(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    public boolean equals(Object obj) {
        return o(this.value, obj);
    }

    public int hashCode() {
        return r(this.value);
    }

    @dl.d
    public String toString() {
        return t(this.value);
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }
}
