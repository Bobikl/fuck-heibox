package androidx.compose.ui.text.style;

import com.umeng.analytics.pro.ak;
import com.umeng.message.common.UPushNotificationChannel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: renamed from: androidx.compose.ui.text.style.g, reason: from toString */
/* JADX INFO: compiled from: LineHeightStyle.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0003\n\f\u0011B\u001a\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/style/g;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/ui/text/style/g$a;", ak.av, "F", "b", "()F", "alignment", "Landroidx/compose/ui/text/style/g$c;", "I", ak.aF, "()I", "trim", "<init>", "(FILkotlin/jvm/internal/u;)V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class LineHeightStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f16919d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final LineHeightStyle f16920e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int trim;

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.g$a */
    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\rB\u0014\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u000f\u0092\u0001\u00020\fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/g$a;", "", "", "j", "(F)Ljava/lang/String;", "", "i", "(F)I", "other", "", "g", "(FLjava/lang/Object;)Z", "", ak.av, "F", "topRatio", "f", "(F)F", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final float f16924c = f(0.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final float f16925d = f(0.5f);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final float f16926e = f(-1.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final float f16927f = f(1.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float topRatio;

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.g$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\bR&\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R&\u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R&\u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R&\u0010\u000f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/style/g$a$a;", "", "Landroidx/compose/ui/text/style/g$a;", "Top", "F", "g", "()F", "getTop-PIaL0Z0$annotations", "()V", "Center", ak.aF, "getCenter-PIaL0Z0$annotations", "Proportional", "e", "getProportional-PIaL0Z0$annotations", "Bottom", ak.av, "getBottom-PIaL0Z0$annotations", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public static /* synthetic */ void b() {
            }

            public static /* synthetic */ void d() {
            }

            public static /* synthetic */ void f() {
            }

            public static /* synthetic */ void h() {
            }

            public final float a() {
                return a.f16927f;
            }

            public final float c() {
                return a.f16925d;
            }

            public final float e() {
                return a.f16926e;
            }

            public final float g() {
                return a.f16924c;
            }
        }

        @androidx.compose.ui.text.g
        private /* synthetic */ a(float f10) {
            this.topRatio = f10;
        }

        public static final /* synthetic */ a e(float f10) {
            return new a(f10);
        }

        @androidx.compose.ui.text.g
        public static float f(float f10) {
            boolean z10 = true;
            if (!(0.0f <= f10 && f10 <= 1.0f)) {
                if (!(f10 == -1.0f)) {
                    z10 = false;
                }
            }
            if (z10) {
                return f10;
            }
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }

        public static boolean g(float f10, Object obj) {
            if (obj instanceof a) {
                return f0.g(Float.valueOf(f10), Float.valueOf(((a) obj).getTopRatio()));
            }
            return false;
        }

        public static final boolean h(float f10, float f11) {
            return f0.g(Float.valueOf(f10), Float.valueOf(f11));
        }

        public static int i(float f10) {
            return Float.floatToIntBits(f10);
        }

        @dl.d
        public static String j(float f10) {
            if (f10 == f16924c) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f10 == f16925d) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f10 == f16926e) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f10 == f16927f) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f10 + ')';
        }

        public boolean equals(Object obj) {
            return g(this.topRatio, obj);
        }

        public int hashCode() {
            return i(this.topRatio);
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final /* synthetic */ float getTopRatio() {
            return this.topRatio;
        }

        @dl.d
        public String toString() {
            return j(this.topRatio);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.g$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/style/g$b;", "", "Landroidx/compose/ui/text/style/g;", UPushNotificationChannel.DEFAULT_NOTIFICATION_CHANNEL_NAME, "Landroidx/compose/ui/text/style/g;", ak.av, "()Landroidx/compose/ui/text/style/g;", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @dl.d
        public final LineHeightStyle a() {
            return LineHeightStyle.f16920e;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.text.style.g$c */
    /* JADX INFO: compiled from: LineHeightStyle.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB\u0014\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\tø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/style/g$c;", "", "", "l", "(I)Ljava/lang/String;", "", "j", "(I)Z", "k", "", "i", "(I)I", "other", "g", "(ILjava/lang/Object;)Z", ak.av, "I", "value", "f", "b", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    @xh.f
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final int f16930c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f16931d = 16;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int f16932e = f(1);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f16933f = f(16);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final int f16934g = f(17);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f16935h = f(0);

        /* JADX INFO: renamed from: androidx.compose.ui.text.style.g$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: LineHeightStyle.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/style/g$c$a;", "", "Landroidx/compose/ui/text/style/g$c;", "FirstLineTop", "I", "b", "()I", "LastLineBottom", ak.aF, "Both", ak.av, d4.d.f108133a, "d", "", "FlagTrimBottom", "FlagTrimTop", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 7, 1})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(u uVar) {
                this();
            }

            public final int a() {
                return c.f16934g;
            }

            public final int b() {
                return c.f16932e;
            }

            public final int c() {
                return c.f16933f;
            }

            public final int d() {
                return c.f16935h;
            }
        }

        private /* synthetic */ c(int i10) {
            this.value = i10;
        }

        public static final /* synthetic */ c e(int i10) {
            return new c(i10);
        }

        private static int f(int i10) {
            return i10;
        }

        public static boolean g(int i10, Object obj) {
            return (obj instanceof c) && i10 == ((c) obj).getValue();
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }

        public static int i(int i10) {
            return i10;
        }

        public static final boolean j(int i10) {
            return (i10 & 1) > 0;
        }

        public static final boolean k(int i10) {
            return (i10 & 16) > 0;
        }

        @dl.d
        public static String l(int i10) {
            if (i10 == f16932e) {
                return "LineHeightStyle.Trim.FirstLineTop";
            }
            if (i10 == f16933f) {
                return "LineHeightStyle.Trim.LastLineBottom";
            }
            if (i10 == f16934g) {
                return "LineHeightStyle.Trim.Both";
            }
            return i10 == f16935h ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return g(this.value, obj);
        }

        public int hashCode() {
            return i(this.value);
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

    static {
        u uVar = null;
        INSTANCE = new Companion(uVar);
        f16920e = new LineHeightStyle(a.INSTANCE.e(), c.INSTANCE.a(), uVar);
    }

    private LineHeightStyle(float f10, int i10) {
        this.alignment = f10;
        this.trim = i10;
    }

    public /* synthetic */ LineHeightStyle(float f10, int i10, u uVar) {
        this(f10, i10);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getAlignment() {
        return this.alignment;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getTrim() {
        return this.trim;
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) other;
        return a.h(this.alignment, lineHeightStyle.alignment) && c.h(this.trim, lineHeightStyle.trim);
    }

    public int hashCode() {
        return (a.i(this.alignment) * 31) + c.i(this.trim);
    }

    @dl.d
    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) a.j(this.alignment)) + ", trim=" + ((Object) c.l(this.trim)) + ')';
    }
}
