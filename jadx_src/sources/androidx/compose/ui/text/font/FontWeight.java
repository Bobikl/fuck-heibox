package androidx.compose.ui.text.font;

import androidx.compose.runtime.j2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.k0, reason: from toString */
/* JADX INFO: compiled from: FontWeight.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\b\u001a\u00020\u0003H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0017\u0010\u000f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/font/k0;", "", "other", "", "t", "", "", "equals", "hashCode", "", "toString", "b", "I", RXScreenCaptureService.KEY_WIDTH, "()I", "weight", "<init>", "(I)V", ak.aF, ak.av, "ui-text_release"}, k = 1, mv = {1, 7, 1})
public final class FontWeight implements Comparable<FontWeight> {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16580e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16581f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16582g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16583h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16584i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16585j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16586k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16587l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16588m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16589n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16590o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16591p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16592q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16593r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16594s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16595t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private static final FontWeight f16596u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private static final List<FontWeight> f16597v;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int weight;

    /* JADX INFO: renamed from: androidx.compose.ui.text.font.k0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: FontWeight.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010 \n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010\bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u0012\u0004\b\u000e\u0010\b\u001a\u0004\b\r\u0010\u0006R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0004\u0012\u0004\b\u0011\u0010\b\u001a\u0004\b\u0010\u0010\u0006R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0004\u0012\u0004\b\u0017\u0010\b\u001a\u0004\b\u0016\u0010\u0006R \u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0004\u0012\u0004\b\u001a\u0010\b\u001a\u0004\b\u0019\u0010\u0006R \u0010\u001b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0004\u0012\u0004\b\u001d\u0010\b\u001a\u0004\b\u001c\u0010\u0006R \u0010\u001e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b \u0010\b\u001a\u0004\b\u001f\u0010\u0006R \u0010!\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u0004\u0012\u0004\b#\u0010\b\u001a\u0004\b\"\u0010\u0006R \u0010$\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u0004\u0012\u0004\b&\u0010\b\u001a\u0004\b%\u0010\u0006R \u0010'\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0004\u0012\u0004\b)\u0010\b\u001a\u0004\b(\u0010\u0006R \u0010*\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u0004\u0012\u0004\b,\u0010\b\u001a\u0004\b+\u0010\u0006R \u0010-\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0004\u0012\u0004\b/\u0010\b\u001a\u0004\b.\u0010\u0006R \u00100\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u0004\u0012\u0004\b2\u0010\b\u001a\u0004\b1\u0010\u0006R \u00103\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u0004\u0012\u0004\b5\u0010\b\u001a\u0004\b4\u0010\u0006R \u00106\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u0004\u0012\u0004\b8\u0010\b\u001a\u0004\b7\u0010\u0006R \u00109\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u0004\u0012\u0004\b;\u0010\b\u001a\u0004\b:\u0010\u0006R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/ui/text/font/k0$a;", "", "Landroidx/compose/ui/text/font/k0;", "W100", "Landroidx/compose/ui/text/font/k0;", "t", "()Landroidx/compose/ui/text/font/k0;", "getW100$annotations", "()V", "W200", "v", "getW200$annotations", "W300", "x", "getW300$annotations", "W400", ak.aD, "getW400$annotations", "W500", "B", "getW500$annotations", "W600", "D", "getW600$annotations", "W700", "F", "getW700$annotations", "W800", "H", "getW800$annotations", "W900", "J", "getW900$annotations", "Thin", "q", "getThin$annotations", "ExtraLight", "g", "getExtraLight$annotations", "Light", "i", "getLight$annotations", "Normal", "m", "getNormal$annotations", "Medium", "k", "getMedium$annotations", "SemiBold", "o", "getSemiBold$annotations", "Bold", ak.aF, "getBold$annotations", "ExtraBold", "e", "getExtraBold$annotations", "Black", ak.av, "getBlack$annotations", "", "values", "Ljava/util/List;", ak.aB, "()Ljava/util/List;", "<init>", "ui-text_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @j2
        public static /* synthetic */ void A() {
        }

        @j2
        public static /* synthetic */ void C() {
        }

        @j2
        public static /* synthetic */ void E() {
        }

        @j2
        public static /* synthetic */ void G() {
        }

        @j2
        public static /* synthetic */ void I() {
        }

        @j2
        public static /* synthetic */ void K() {
        }

        @j2
        public static /* synthetic */ void b() {
        }

        @j2
        public static /* synthetic */ void d() {
        }

        @j2
        public static /* synthetic */ void f() {
        }

        @j2
        public static /* synthetic */ void h() {
        }

        @j2
        public static /* synthetic */ void j() {
        }

        @j2
        public static /* synthetic */ void l() {
        }

        @j2
        public static /* synthetic */ void n() {
        }

        @j2
        public static /* synthetic */ void p() {
        }

        @j2
        public static /* synthetic */ void r() {
        }

        @j2
        public static /* synthetic */ void u() {
        }

        @j2
        public static /* synthetic */ void w() {
        }

        @j2
        public static /* synthetic */ void y() {
        }

        @dl.d
        public final FontWeight B() {
            return FontWeight.f16583h;
        }

        @dl.d
        public final FontWeight D() {
            return FontWeight.f16584i;
        }

        @dl.d
        public final FontWeight F() {
            return FontWeight.f16585j;
        }

        @dl.d
        public final FontWeight H() {
            return FontWeight.f16586k;
        }

        @dl.d
        public final FontWeight J() {
            return FontWeight.f16587l;
        }

        @dl.d
        public final FontWeight a() {
            return FontWeight.f16596u;
        }

        @dl.d
        public final FontWeight c() {
            return FontWeight.f16594s;
        }

        @dl.d
        public final FontWeight e() {
            return FontWeight.f16595t;
        }

        @dl.d
        public final FontWeight g() {
            return FontWeight.f16589n;
        }

        @dl.d
        public final FontWeight i() {
            return FontWeight.f16590o;
        }

        @dl.d
        public final FontWeight k() {
            return FontWeight.f16592q;
        }

        @dl.d
        public final FontWeight m() {
            return FontWeight.f16591p;
        }

        @dl.d
        public final FontWeight o() {
            return FontWeight.f16593r;
        }

        @dl.d
        public final FontWeight q() {
            return FontWeight.f16588m;
        }

        @dl.d
        public final List<FontWeight> s() {
            return FontWeight.f16597v;
        }

        @dl.d
        public final FontWeight t() {
            return FontWeight.f16579d;
        }

        @dl.d
        public final FontWeight v() {
            return FontWeight.f16580e;
        }

        @dl.d
        public final FontWeight x() {
            return FontWeight.f16581f;
        }

        @dl.d
        public final FontWeight z() {
            return FontWeight.f16582g;
        }
    }

    static {
        FontWeight fontWeight = new FontWeight(100);
        f16579d = fontWeight;
        FontWeight fontWeight2 = new FontWeight(200);
        f16580e = fontWeight2;
        FontWeight fontWeight3 = new FontWeight(300);
        f16581f = fontWeight3;
        FontWeight fontWeight4 = new FontWeight(400);
        f16582g = fontWeight4;
        FontWeight fontWeight5 = new FontWeight(500);
        f16583h = fontWeight5;
        FontWeight fontWeight6 = new FontWeight(600);
        f16584i = fontWeight6;
        FontWeight fontWeight7 = new FontWeight(700);
        f16585j = fontWeight7;
        FontWeight fontWeight8 = new FontWeight(800);
        f16586k = fontWeight8;
        FontWeight fontWeight9 = new FontWeight(900);
        f16587l = fontWeight9;
        f16588m = fontWeight;
        f16589n = fontWeight2;
        f16590o = fontWeight3;
        f16591p = fontWeight4;
        f16592q = fontWeight5;
        f16593r = fontWeight6;
        f16594s = fontWeight7;
        f16595t = fontWeight8;
        f16596u = fontWeight9;
        f16597v = CollectionsKt__CollectionsKt.L(fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6, fontWeight7, fontWeight8, fontWeight9);
    }

    public FontWeight(int i10) {
        this.weight = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i10).toString());
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FontWeight) && this.weight == ((FontWeight) other).weight;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public int getWeight() {
        return this.weight;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public int compareTo(@dl.d FontWeight other) {
        kotlin.jvm.internal.f0.p(other, "other");
        return kotlin.jvm.internal.f0.t(this.weight, other.weight);
    }

    @dl.d
    public String toString() {
        return "FontWeight(weight=" + this.weight + ')';
    }

    public final int w() {
        return this.weight;
    }
}
