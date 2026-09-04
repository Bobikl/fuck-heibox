package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.lzy.okgo.model.Progress;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Arrangement.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.m0
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b5\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005I/5DAB\t\b\u0002¢\u0006\u0004\bH\u0010*J/\u0010\t\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0014H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u0014H\u0007J/\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\"\u0010\u001fJ/\u0010#\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b#\u0010\u001fJ/\u0010$\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b$\u0010\u001fJ/\u0010%\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010\u001fR \u0010+\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R \u0010.\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010&\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010(R \u00104\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010*\u001a\u0004\b1\u00102R \u00107\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00100\u0012\u0004\b6\u0010*\u001a\u0004\b/\u00102R \u0010<\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010*\u001a\u0004\b8\u0010:R \u0010@\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00109\u0012\u0004\b?\u0010*\u001a\u0004\b>\u0010:R \u0010C\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u00109\u0012\u0004\bB\u0010*\u001a\u0004\bA\u0010:R \u0010G\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bD\u00109\u0012\u0004\bF\u0010*\u001a\u0004\bE\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006J"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement;", "", "", "", "reversed", "Lkotlin/Function2;", "", "Lkotlin/b2;", "action", ak.aF, "Ls1/h;", "space", "Landroidx/compose/foundation/layout/Arrangement$e;", ak.aD, "(F)Landroidx/compose/foundation/layout/Arrangement$e;", "Landroidx/compose/ui/c$b;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$d;", androidx.exifinterface.media.a.W4, "(FLandroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/Arrangement$d;", "Landroidx/compose/ui/c$c;", "Landroidx/compose/foundation/layout/Arrangement$l;", "B", "(FLandroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/Arrangement$l;", ak.av, "b", Progress.H, UiKitSpanObj.TYPE_SIZE, "outPosition", "reverseInput", "v", "(I[I[IZ)V", ak.aG, "([I[IZ)V", "t", "y", "x", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/foundation/layout/Arrangement$d;", "p", "()Landroidx/compose/foundation/layout/Arrangement$d;", "getStart$annotations", "()V", "Start", RXScreenCaptureService.KEY_HEIGHT, "getEnd$annotations", "End", "d", "Landroidx/compose/foundation/layout/Arrangement$l;", "r", "()Landroidx/compose/foundation/layout/Arrangement$l;", "getTop$annotations", "Top", "e", "getBottom$annotations", "Bottom", "f", "Landroidx/compose/foundation/layout/Arrangement$e;", "()Landroidx/compose/foundation/layout/Arrangement$e;", "getCenter$annotations", "Center", "g", "n", "getSpaceEvenly$annotations", "SpaceEvenly", "l", "getSpaceBetween$annotations", "SpaceBetween", "i", "j", "getSpaceAround$annotations", "SpaceAround", "<init>", "Absolute", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class Arrangement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final Arrangement f5896a = new Arrangement();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final d Start = new j();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final d End = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final l Top = new k();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final l Bottom = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final e Center = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final e SpaceEvenly = new h();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final e SpaceBetween = new g();

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private static final e SpaceAround = new f();

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b)\u0010\u0016J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014R \u0010\u001d\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0014R \u0010!\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0012\u0012\u0004\b \u0010\u0016\u001a\u0004\b\u001f\u0010\u0014R \u0010$\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u0012\u0004\b#\u0010\u0016\u001a\u0004\b\"\u0010\u0014R \u0010(\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0012\u0012\u0004\b'\u0010\u0016\u001a\u0004\b&\u0010\u0014\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$Absolute;", "", "Ls1/h;", "space", "Landroidx/compose/foundation/layout/Arrangement$e;", "n", "(F)Landroidx/compose/foundation/layout/Arrangement$e;", "Landroidx/compose/ui/c$b;", "alignment", "Landroidx/compose/foundation/layout/Arrangement$d;", "o", "(FLandroidx/compose/ui/c$b;)Landroidx/compose/foundation/layout/Arrangement$d;", "Landroidx/compose/ui/c$c;", "Landroidx/compose/foundation/layout/Arrangement$l;", "p", "(FLandroidx/compose/ui/c$c;)Landroidx/compose/foundation/layout/Arrangement$l;", ak.av, "b", "Landroidx/compose/foundation/layout/Arrangement$d;", "d", "()Landroidx/compose/foundation/layout/Arrangement$d;", "getLeft$annotations", "()V", "Left", ak.aF, "getCenter$annotations", "Center", "f", "getRight$annotations", "Right", "e", "j", "getSpaceBetween$annotations", "SpaceBetween", "l", "getSpaceEvenly$annotations", "SpaceEvenly", "g", RXScreenCaptureService.KEY_HEIGHT, "getSpaceAround$annotations", "SpaceAround", "<init>", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final class Absolute {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        public static final Absolute f5905a = new Absolute();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d Left = new b();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d Center = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d Right = new c();

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d SpaceBetween = new e();

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d SpaceEvenly = new f();

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final d SpaceAround = new d();

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$a", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class a implements d {
            a() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            /* JADX INFO: renamed from: a */
            public /* synthetic */ float getSpacing() {
                return androidx.compose.foundation.layout.g.a(this);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
                kotlin.jvm.internal.f0.p(eVar, "<this>");
                kotlin.jvm.internal.f0.p(sizes, "sizes");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(outPositions, "outPositions");
                Arrangement.f5896a.t(i10, sizes, outPositions, false);
            }

            @dl.d
            public String toString() {
                return "AbsoluteArrangement#Center";
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$b", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class b implements d {
            b() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            /* JADX INFO: renamed from: a */
            public /* synthetic */ float getSpacing() {
                return androidx.compose.foundation.layout.g.a(this);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
                kotlin.jvm.internal.f0.p(eVar, "<this>");
                kotlin.jvm.internal.f0.p(sizes, "sizes");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(outPositions, "outPositions");
                Arrangement.f5896a.u(sizes, outPositions, false);
            }

            @dl.d
            public String toString() {
                return "AbsoluteArrangement#Left";
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$c", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class c implements d {
            c() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            /* JADX INFO: renamed from: a */
            public /* synthetic */ float getSpacing() {
                return androidx.compose.foundation.layout.g.a(this);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
                kotlin.jvm.internal.f0.p(eVar, "<this>");
                kotlin.jvm.internal.f0.p(sizes, "sizes");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(outPositions, "outPositions");
                Arrangement.f5896a.v(i10, sizes, outPositions, false);
            }

            @dl.d
            public String toString() {
                return "AbsoluteArrangement#Right";
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$d", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class d implements d {
            d() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            /* JADX INFO: renamed from: a */
            public /* synthetic */ float getSpacing() {
                return androidx.compose.foundation.layout.g.a(this);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
                kotlin.jvm.internal.f0.p(eVar, "<this>");
                kotlin.jvm.internal.f0.p(sizes, "sizes");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(outPositions, "outPositions");
                Arrangement.f5896a.w(i10, sizes, outPositions, false);
            }

            @dl.d
            public String toString() {
                return "AbsoluteArrangement#SpaceAround";
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$e", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class e implements d {
            e() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            /* JADX INFO: renamed from: a */
            public /* synthetic */ float getSpacing() {
                return androidx.compose.foundation.layout.g.a(this);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
                kotlin.jvm.internal.f0.p(eVar, "<this>");
                kotlin.jvm.internal.f0.p(sizes, "sizes");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(outPositions, "outPositions");
                Arrangement.f5896a.x(i10, sizes, outPositions, false);
            }

            @dl.d
            public String toString() {
                return "AbsoluteArrangement#SpaceBetween";
            }
        }

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$Absolute$f", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
        public static final class f implements d {
            f() {
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            /* JADX INFO: renamed from: a */
            public /* synthetic */ float getSpacing() {
                return androidx.compose.foundation.layout.g.a(this);
            }

            @Override // androidx.compose.foundation.layout.Arrangement.d
            public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
                kotlin.jvm.internal.f0.p(eVar, "<this>");
                kotlin.jvm.internal.f0.p(sizes, "sizes");
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                kotlin.jvm.internal.f0.p(outPositions, "outPositions");
                Arrangement.f5896a.y(i10, sizes, outPositions, false);
            }

            @dl.d
            public String toString() {
                return "AbsoluteArrangement#SpaceEvenly";
            }
        }

        private Absolute() {
        }

        @j2
        public static /* synthetic */ void c() {
        }

        @j2
        public static /* synthetic */ void e() {
        }

        @j2
        public static /* synthetic */ void g() {
        }

        @j2
        public static /* synthetic */ void i() {
        }

        @j2
        public static /* synthetic */ void k() {
        }

        @j2
        public static /* synthetic */ void m() {
        }

        @j2
        @dl.d
        public final d a(@dl.d final androidx.compose.ui.c.b alignment) {
            kotlin.jvm.internal.f0.p(alignment, "alignment");
            return new i(s1.h.g(0), false, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$aligned$1
                {
                    super(2);
                }

                @dl.d
                public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                    kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                    return Integer.valueOf(alignment.a(0, i10, layoutDirection));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return a(num.intValue(), layoutDirection);
                }
            }, null);
        }

        @dl.d
        public final d b() {
            return Center;
        }

        @dl.d
        public final d d() {
            return Left;
        }

        @dl.d
        public final d f() {
            return Right;
        }

        @dl.d
        public final d h() {
            return SpaceAround;
        }

        @dl.d
        public final d j() {
            return SpaceBetween;
        }

        @dl.d
        public final d l() {
            return SpaceEvenly;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @j2
        @dl.d
        public final e n(float space) {
            return new i(space, false, null, 0 == true ? 1 : 0);
        }

        @j2
        @dl.d
        public final d o(float space, @dl.d final androidx.compose.ui.c.b alignment) {
            kotlin.jvm.internal.f0.p(alignment, "alignment");
            return new i(space, false, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$1
                {
                    super(2);
                }

                @dl.d
                public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                    kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                    return Integer.valueOf(alignment.a(0, i10, layoutDirection));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return a(num.intValue(), layoutDirection);
                }
            }, null);
        }

        @j2
        @dl.d
        public final l p(float space, @dl.d final androidx.compose.ui.c.InterfaceC0079c alignment) {
            kotlin.jvm.internal.f0.p(alignment, "alignment");
            return new i(space, false, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$Absolute$spacedBy$2
                {
                    super(2);
                }

                @dl.d
                public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                    kotlin.jvm.internal.f0.p(layoutDirection, "<anonymous parameter 1>");
                    return Integer.valueOf(alignment.a(0, i10));
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                    return a(num.intValue(), layoutDirection);
                }
            }, null);
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"androidx/compose/foundation/layout/Arrangement$a", "Landroidx/compose/foundation/layout/Arrangement$l;", "Ls1/e;", "", Progress.H, "", "sizes", "outPositions", "Lkotlin/b2;", ak.aF, "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements l {
        a() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public /* synthetic */ float a() {
            return androidx.compose.foundation.layout.i.a(this);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            Arrangement.f5896a.v(i10, sizes, outPositions, false);
        }

        @dl.d
        public String toString() {
            return "Arrangement#Bottom";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/layout/Arrangement$b", "Landroidx/compose/foundation/layout/Arrangement$e;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", ak.aF, "", "toString", "Ls1/h;", ak.av, "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = s1.h.g(0);

        b() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f5896a.t(i10, sizes, outPositions, false);
            } else {
                Arrangement.f5896a.t(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            Arrangement.f5896a.t(i10, sizes, outPositions, false);
        }

        @dl.d
        public String toString() {
            return "Arrangement#Center";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$c", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements d {
        c() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a */
        public /* synthetic */ float getSpacing() {
            return androidx.compose.foundation.layout.g.a(this);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f5896a.v(i10, sizes, outPositions, false);
            } else {
                Arrangement.f5896a.u(sizes, outPositions, true);
            }
        }

        @dl.d
        public String toString() {
            return "Arrangement#End";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @j2
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H&R\u001d\u0010\u000f\u001a\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$d;", "", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "Ls1/h;", ak.av, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public interface d {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a {
            @Deprecated
            public static float a(@dl.d d dVar) {
                return androidx.compose.foundation.layout.g.a(dVar);
            }
        }

        /* JADX INFO: renamed from: a */
        float getSpacing();

        void b(@dl.d s1.e eVar, int i10, @dl.d int[] iArr, @dl.d LayoutDirection layoutDirection, @dl.d int[] iArr2);
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @j2
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u00012\u00020\u0002R\u001d\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$e;", "Landroidx/compose/foundation/layout/Arrangement$d;", "Landroidx/compose/foundation/layout/Arrangement$l;", "Ls1/h;", ak.av, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public interface e extends d, l {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a {
            @Deprecated
            public static float a(@dl.d e eVar) {
                return androidx.compose.foundation.layout.h.a(eVar);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a */
        float getSpacing();
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/layout/Arrangement$f", "Landroidx/compose/foundation/layout/Arrangement$e;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", ak.aF, "", "toString", "Ls1/h;", ak.av, "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class f implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = s1.h.g(0);

        f() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f5896a.w(i10, sizes, outPositions, false);
            } else {
                Arrangement.f5896a.w(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            Arrangement.f5896a.w(i10, sizes, outPositions, false);
        }

        @dl.d
        public String toString() {
            return "Arrangement#SpaceAround";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/layout/Arrangement$g", "Landroidx/compose/foundation/layout/Arrangement$e;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", ak.aF, "", "toString", "Ls1/h;", ak.av, "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class g implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = s1.h.g(0);

        g() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f5896a.x(i10, sizes, outPositions, false);
            } else {
                Arrangement.f5896a.x(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            Arrangement.f5896a.x(i10, sizes, outPositions, false);
        }

        @dl.d
        public String toString() {
            return "Arrangement#SpaceBetween";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R#\u0010\u0013\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"androidx/compose/foundation/layout/Arrangement$h", "Landroidx/compose/foundation/layout/Arrangement$e;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", ak.aF, "", "toString", "Ls1/h;", ak.av, "F", "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class h implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float spacing = s1.h.g(0);

        h() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f5896a.y(i10, sizes, outPositions, false);
            } else {
                Arrangement.f5896a.y(i10, sizes, outPositions, true);
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            Arrangement.f5896a.y(i10, sizes, outPositions, false);
        }

        @dl.d
        public String toString() {
            return "Arrangement#SpaceEvenly";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B6\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014ø\u0001\u0002¢\u0006\u0004\b)\u0010*J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J$\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0019\u0010\u0010\u001a\u00020\u000fHÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0013\u001a\u00020\u0012HÆ\u0003J\u001d\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0003JH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00122\u001c\b\u0002\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\u00122\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003R \u0010\u0016\u001a\u00020\u000f8\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b#\u0010$R#\u0010%\u001a\u00020\u000f8\u0016X\u0096\u0004ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b\u001f\u0010\u0011R+\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0018\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$i;", "Landroidx/compose/foundation/layout/Arrangement$e;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", ak.aF, "", "toString", "Ls1/h;", "d", "()F", "", "e", "Lkotlin/Function2;", "f", "space", "rtlMirror", "alignment", "g", "(FZLyh/p;)Landroidx/compose/foundation/layout/Arrangement$i;", "hashCode", "", "other", "equals", ak.av, "F", "k", "Z", "j", "()Z", "spacing", "Lyh/p;", "i", "()Lyh/p;", "<init>", "(FZLyh/p;Lkotlin/jvm/internal/u;)V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    @androidx.compose.runtime.m0
    public static final /* data */ class i implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float space;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean rtlMirror;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final yh.p<Integer, LayoutDirection, Integer> f5923c;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float spacing;

        /* JADX WARN: Multi-variable type inference failed */
        private i(float f10, boolean z10, yh.p<? super Integer, ? super LayoutDirection, Integer> pVar) {
            this.space = f10;
            this.rtlMirror = z10;
            this.f5923c = pVar;
            this.spacing = f10;
        }

        public /* synthetic */ i(float f10, boolean z10, yh.p pVar, kotlin.jvm.internal.u uVar) {
            this(f10, z10, pVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ i h(i iVar, float f10, boolean z10, yh.p pVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = iVar.space;
            }
            if ((i10 & 2) != 0) {
                z10 = iVar.rtlMirror;
            }
            if ((i10 & 4) != 0) {
                pVar = iVar.f5923c;
            }
            return iVar.g(f10, z10, pVar);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.e, androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public float getSpacing() {
            return this.spacing;
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            int i11;
            int iMin;
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (sizes.length == 0) {
                return;
            }
            int iE1 = eVar.e1(this.space);
            boolean z10 = this.rtlMirror && layoutDirection == LayoutDirection.Rtl;
            Arrangement arrangement = Arrangement.f5896a;
            if (z10) {
                i11 = 0;
                iMin = 0;
                for (int length = sizes.length - 1; -1 < length; length--) {
                    int i12 = sizes[length];
                    int iMin2 = Math.min(i11, i10 - i12);
                    outPositions[length] = iMin2;
                    iMin = Math.min(iE1, (i10 - iMin2) - i12);
                    i11 = outPositions[length] + i12 + iMin;
                }
            } else {
                int length2 = sizes.length;
                int i13 = 0;
                i11 = 0;
                iMin = 0;
                int i14 = 0;
                while (i13 < length2) {
                    int i15 = sizes[i13];
                    int iMin3 = Math.min(i11, i10 - i15);
                    outPositions[i14] = iMin3;
                    int iMin4 = Math.min(iE1, (i10 - iMin3) - i15);
                    int i16 = outPositions[i14] + i15 + iMin4;
                    i13++;
                    i14++;
                    iMin = iMin4;
                    i11 = i16;
                }
            }
            int i17 = i11 - iMin;
            yh.p<Integer, LayoutDirection, Integer> pVar = this.f5923c;
            if (pVar == null || i17 >= i10) {
                return;
            }
            int iIntValue = pVar.invoke(Integer.valueOf(i10 - i17), layoutDirection).intValue();
            int length3 = outPositions.length;
            for (int i18 = 0; i18 < length3; i18++) {
                outPositions[i18] = outPositions[i18] + iIntValue;
            }
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            b(eVar, i10, sizes, LayoutDirection.Ltr, outPositions);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final float getSpace() {
            return this.space;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getRtlMirror() {
            return this.rtlMirror;
        }

        public boolean equals(@dl.e Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof i)) {
                return false;
            }
            i iVar = (i) other;
            return s1.h.l(this.space, iVar.space) && this.rtlMirror == iVar.rtlMirror && kotlin.jvm.internal.f0.g(this.f5923c, iVar.f5923c);
        }

        @dl.e
        public final yh.p<Integer, LayoutDirection, Integer> f() {
            return this.f5923c;
        }

        @dl.d
        public final i g(float space, boolean rtlMirror, @dl.e yh.p<? super Integer, ? super LayoutDirection, Integer> alignment) {
            return new i(space, rtlMirror, alignment, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iN = s1.h.n(this.space) * 31;
            boolean z10 = this.rtlMirror;
            ?? r10 = z10;
            if (z10) {
                r10 = 1;
            }
            int i10 = (iN + r10) * 31;
            yh.p<Integer, LayoutDirection, Integer> pVar = this.f5923c;
            return i10 + (pVar == null ? 0 : pVar.hashCode());
        }

        @dl.e
        public final yh.p<Integer, LayoutDirection, Integer> i() {
            return this.f5923c;
        }

        public final boolean j() {
            return this.rtlMirror;
        }

        public final float k() {
            return this.space;
        }

        @dl.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.rtlMirror ? "" : "Absolute");
            sb2.append("Arrangement#spacedAligned(");
            sb2.append((Object) s1.h.s(this.space));
            sb2.append(", ");
            sb2.append(this.f5923c);
            sb2.append(')');
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u000e"}, d2 = {"androidx/compose/foundation/layout/Arrangement$j", "Landroidx/compose/foundation/layout/Arrangement$d;", "Ls1/e;", "", Progress.H, "", "sizes", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "outPositions", "Lkotlin/b2;", "b", "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class j implements d {
        j() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        /* JADX INFO: renamed from: a */
        public /* synthetic */ float getSpacing() {
            return androidx.compose.foundation.layout.g.a(this);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.d
        public void b(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d LayoutDirection layoutDirection, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            if (layoutDirection == LayoutDirection.Ltr) {
                Arrangement.f5896a.u(sizes, outPositions, false);
            } else {
                Arrangement.f5896a.v(i10, sizes, outPositions, true);
            }
        }

        @dl.d
        public String toString() {
            return "Arrangement#Start";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @Metadata(bv = {}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016¨\u0006\f"}, d2 = {"androidx/compose/foundation/layout/Arrangement$k", "Landroidx/compose/foundation/layout/Arrangement$l;", "Ls1/e;", "", Progress.H, "", "sizes", "outPositions", "Lkotlin/b2;", ak.aF, "", "toString", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public static final class k implements l {
        k() {
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public /* synthetic */ float a() {
            return androidx.compose.foundation.layout.i.a(this);
        }

        @Override // androidx.compose.foundation.layout.Arrangement.l
        public void c(@dl.d s1.e eVar, int i10, @dl.d int[] sizes, @dl.d int[] outPositions) {
            kotlin.jvm.internal.f0.p(eVar, "<this>");
            kotlin.jvm.internal.f0.p(sizes, "sizes");
            kotlin.jvm.internal.f0.p(outPositions, "outPositions");
            Arrangement.f5896a.u(sizes, outPositions, false);
        }

        @dl.d
        public String toString() {
            return "Arrangement#Top";
        }
    }

    /* JADX INFO: compiled from: Arrangement.kt */
    @j2
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H&R\u001d\u0010\r\u001a\u00020\n8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0003\u0082\u0002\u0015\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/Arrangement$l;", "", "Ls1/e;", "", Progress.H, "", "sizes", "outPositions", "Lkotlin/b2;", ak.aF, "Ls1/h;", ak.av, "()F", "spacing", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
    public interface l {

        /* JADX INFO: compiled from: Arrangement.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a {
            @Deprecated
            public static float a(@dl.d l lVar) {
                return androidx.compose.foundation.layout.i.a(lVar);
            }
        }

        float a();

        void c(@dl.d s1.e eVar, int i10, @dl.d int[] iArr, @dl.d int[] iArr2);
    }

    private Arrangement() {
    }

    private final void c(int[] iArr, boolean z10, yh.p<? super Integer, ? super Integer, b2> pVar) {
        if (!z10) {
            int length = iArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                pVar.invoke(Integer.valueOf(i11), Integer.valueOf(iArr[i10]));
                i10++;
                i11++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            } else {
                pVar.invoke(Integer.valueOf(length2), Integer.valueOf(iArr[length2]));
            }
        }
    }

    @j2
    public static /* synthetic */ void e() {
    }

    @j2
    public static /* synthetic */ void g() {
    }

    @j2
    public static /* synthetic */ void i() {
    }

    @j2
    public static /* synthetic */ void k() {
    }

    @j2
    public static /* synthetic */ void m() {
    }

    @j2
    public static /* synthetic */ void o() {
    }

    @j2
    public static /* synthetic */ void q() {
    }

    @j2
    public static /* synthetic */ void s() {
    }

    @j2
    @dl.d
    public final d A(float space, @dl.d final androidx.compose.ui.c.b alignment) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return new i(space, true, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$2
            {
                super(2);
            }

            @dl.d
            public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                return Integer.valueOf(alignment.a(0, i10, layoutDirection));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return a(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @j2
    @dl.d
    public final l B(float space, @dl.d final androidx.compose.ui.c.InterfaceC0079c alignment) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return new i(space, false, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$3
            {
                super(2);
            }

            @dl.d
            public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(alignment.a(0, i10));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return a(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @j2
    @dl.d
    public final d a(@dl.d final androidx.compose.ui.c.b alignment) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return new i(s1.h.g(0), true, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$aligned$1
            {
                super(2);
            }

            @dl.d
            public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                return Integer.valueOf(alignment.a(0, i10, layoutDirection));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return a(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @j2
    @dl.d
    public final l b(@dl.d final androidx.compose.ui.c.InterfaceC0079c alignment) {
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return new i(s1.h.g(0), false, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$aligned$2
            {
                super(2);
            }

            @dl.d
            public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "<anonymous parameter 1>");
                return Integer.valueOf(alignment.a(0, i10));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return a(num.intValue(), layoutDirection);
            }
        }, null);
    }

    @dl.d
    public final l d() {
        return Bottom;
    }

    @dl.d
    public final e f() {
        return Center;
    }

    @dl.d
    public final d h() {
        return End;
    }

    @dl.d
    public final e j() {
        return SpaceAround;
    }

    @dl.d
    public final e l() {
        return SpaceBetween;
    }

    @dl.d
    public final e n() {
        return SpaceEvenly;
    }

    @dl.d
    public final d p() {
        return Start;
    }

    @dl.d
    public final l r() {
        return Top;
    }

    public final void t(int totalSize, @dl.d int[] size, @dl.d int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = (totalSize - i11) / 2;
        if (!reverseInput) {
            int length = size.length;
            int i13 = 0;
            while (i10 < length) {
                int i14 = size[i10];
                outPosition[i13] = di.d.L0(f10);
                f10 += i14;
                i10++;
                i13++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i15 = size[length2];
            outPosition[length2] = di.d.L0(f10);
            f10 += i15;
        }
    }

    public final void u(@dl.d int[] size, @dl.d int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
        int i10 = 0;
        if (!reverseInput) {
            int length = size.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = size[i10];
                outPosition[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = size[length2];
            outPosition[length2] = i10;
            i10 += i14;
        }
    }

    public final void v(int totalSize, @dl.d int[] size, @dl.d int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        int i13 = totalSize - i11;
        if (!reverseInput) {
            int length = size.length;
            int i14 = 0;
            while (i10 < length) {
                int i15 = size[i10];
                outPosition[i14] = i13;
                i13 += i15;
                i10++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = i13;
            i13 += i16;
        }
    }

    public final void w(int totalSize, @dl.d int[] size, @dl.d int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (size.length == 0) ^ true ? (totalSize - i11) / size.length : 0.0f;
        float f10 = length / 2;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = di.d.L0(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = di.d.L0(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void x(int totalSize, @dl.d int[] size, @dl.d int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float f10 = 0.0f;
        float length = size.length > 1 ? (totalSize - i11) / (size.length - 1) : 0.0f;
        if (reverseInput) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = di.d.L0(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = di.d.L0(f10);
            f10 += i15 + length;
            i10++;
            i14++;
        }
    }

    public final void y(int totalSize, @dl.d int[] size, @dl.d int[] outPosition, boolean reverseInput) {
        kotlin.jvm.internal.f0.p(size, "size");
        kotlin.jvm.internal.f0.p(outPosition, "outPosition");
        int i10 = 0;
        int i11 = 0;
        for (int i12 : size) {
            i11 += i12;
        }
        float length = (totalSize - i11) / (size.length + 1);
        if (reverseInput) {
            float f10 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i13 = size[length2];
                outPosition[length2] = di.d.L0(f10);
                f10 += i13 + length;
            }
            return;
        }
        int length3 = size.length;
        float f11 = length;
        int i14 = 0;
        while (i10 < length3) {
            int i15 = size[i10];
            outPosition[i14] = di.d.L0(f11);
            f11 += i15 + length;
            i10++;
            i14++;
        }
    }

    @j2
    @dl.d
    public final e z(float space) {
        return new i(space, true, new yh.p<Integer, LayoutDirection, Integer>() { // from class: androidx.compose.foundation.layout.Arrangement$spacedBy$1
            @dl.d
            public final Integer a(int i10, @dl.d LayoutDirection layoutDirection) {
                kotlin.jvm.internal.f0.p(layoutDirection, "layoutDirection");
                return Integer.valueOf(androidx.compose.ui.c.INSTANCE.u().a(0, i10, layoutDirection));
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Integer invoke(Integer num, LayoutDirection layoutDirection) {
                return a(num.intValue(), layoutDirection);
            }
        }, null);
    }
}
