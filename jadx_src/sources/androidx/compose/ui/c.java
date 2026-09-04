package androidx.compose.ui;

import androidx.compose.runtime.j2;
import androidx.compose.ui.unit.LayoutDirection;
import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Alignment.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bç\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0003\b\n\u000bJ-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/c;", "", "Ls1/r;", UiKitSpanObj.TYPE_SIZE, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Ls1/n;", ak.av, "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "b", ak.aF, "ui_release"}, k = 1, mv = {1, 7, 1})
public interface c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    public static final Companion INSTANCE = Companion.f13408a;

    /* JADX INFO: renamed from: androidx.compose.ui.c$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Alignment.kt */
    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bA\u0010\bR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u0012\u0004\b\f\u0010\b\u001a\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0004\u0012\u0004\b\u0010\u0010\b\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0004\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0013\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0004\u0012\u0004\b\u0018\u0010\b\u001a\u0004\b\u0017\u0010\u0006R \u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0004\u0012\u0004\b\u001c\u0010\b\u001a\u0004\b\u001b\u0010\u0006R \u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0004\u0012\u0004\b\u001f\u0010\b\u001a\u0004\b\u001a\u0010\u0006R \u0010\"\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0004\u0012\u0004\b!\u0010\b\u001a\u0004\b\n\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0004\u0012\u0004\b$\u0010\b\u001a\u0004\b\u0012\u0010\u0006R \u0010+\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010'\u0012\u0004\b*\u0010\b\u001a\u0004\b(\u0010)R \u0010/\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010'\u0012\u0004\b.\u0010\b\u001a\u0004\b-\u0010)R \u00103\u001a\u00020&8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010'\u0012\u0004\b2\u0010\b\u001a\u0004\b1\u0010)R \u0010:\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u00106\u0012\u0004\b9\u0010\b\u001a\u0004\b7\u00108R \u0010<\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u00106\u0012\u0004\b;\u0010\b\u001a\u0004\b0\u00108R \u0010@\u001a\u0002048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00106\u0012\u0004\b?\u0010\b\u001a\u0004\b>\u00108¨\u0006B"}, d2 = {"Landroidx/compose/ui/c$a;", "", "Landroidx/compose/ui/c;", "b", "Landroidx/compose/ui/c;", "C", "()Landroidx/compose/ui/c;", "getTopStart$annotations", "()V", "TopStart", ak.aF, "y", "getTopCenter$annotations", "TopCenter", "d", androidx.exifinterface.media.a.W4, "getTopEnd$annotations", "TopEnd", "e", "o", "getCenterStart$annotations", "CenterStart", "f", "i", "getCenter$annotations", "Center", "g", "k", "getCenterEnd$annotations", "CenterEnd", RXScreenCaptureService.KEY_HEIGHT, "getBottomStart$annotations", "BottomStart", "getBottomCenter$annotations", "BottomCenter", "j", "getBottomEnd$annotations", "BottomEnd", "Landroidx/compose/ui/c$c;", "Landroidx/compose/ui/c$c;", RXScreenCaptureService.KEY_WIDTH, "()Landroidx/compose/ui/c$c;", "getTop$annotations", "Top", "l", "q", "getCenterVertically$annotations", "CenterVertically", "m", ak.av, "getBottom$annotations", "Bottom", "Landroidx/compose/ui/c$b;", "n", "Landroidx/compose/ui/c$b;", ak.aG, "()Landroidx/compose/ui/c$b;", "getStart$annotations", "Start", "getCenterHorizontally$annotations", "CenterHorizontally", "p", ak.aB, "getEnd$annotations", "End", "<init>", "ui_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f13408a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c TopStart = new BiasAlignment(-1.0f, -1.0f);

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c TopCenter = new BiasAlignment(0.0f, -1.0f);

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c TopEnd = new BiasAlignment(1.0f, -1.0f);

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c CenterStart = new BiasAlignment(-1.0f, 0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c Center = new BiasAlignment(0.0f, 0.0f);

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c CenterEnd = new BiasAlignment(1.0f, 0.0f);

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c BottomStart = new BiasAlignment(-1.0f, 1.0f);

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c BottomCenter = new BiasAlignment(0.0f, 1.0f);

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final c BottomEnd = new BiasAlignment(1.0f, 1.0f);

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final InterfaceC0079c Top = new BiasAlignment.Vertical(-1.0f);

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final InterfaceC0079c CenterVertically = new BiasAlignment.Vertical(0.0f);

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final InterfaceC0079c Bottom = new BiasAlignment.Vertical(1.0f);

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final b Start = new BiasAlignment.Horizontal(-1.0f);

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final b CenterHorizontally = new BiasAlignment.Horizontal(0.0f);

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private static final b End = new BiasAlignment.Horizontal(1.0f);

        private Companion() {
        }

        @j2
        public static /* synthetic */ void B() {
        }

        @j2
        public static /* synthetic */ void D() {
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
        public static /* synthetic */ void t() {
        }

        @j2
        public static /* synthetic */ void v() {
        }

        @j2
        public static /* synthetic */ void x() {
        }

        @j2
        public static /* synthetic */ void z() {
        }

        @dl.d
        public final c A() {
            return TopEnd;
        }

        @dl.d
        public final c C() {
            return TopStart;
        }

        @dl.d
        public final InterfaceC0079c a() {
            return Bottom;
        }

        @dl.d
        public final c c() {
            return BottomCenter;
        }

        @dl.d
        public final c e() {
            return BottomEnd;
        }

        @dl.d
        public final c g() {
            return BottomStart;
        }

        @dl.d
        public final c i() {
            return Center;
        }

        @dl.d
        public final c k() {
            return CenterEnd;
        }

        @dl.d
        public final b m() {
            return CenterHorizontally;
        }

        @dl.d
        public final c o() {
            return CenterStart;
        }

        @dl.d
        public final InterfaceC0079c q() {
            return CenterVertically;
        }

        @dl.d
        public final b s() {
            return End;
        }

        @dl.d
        public final b u() {
            return Start;
        }

        @dl.d
        public final InterfaceC0079c w() {
            return Top;
        }

        @dl.d
        public final c y() {
            return TopCenter;
        }
    }

    /* JADX INFO: compiled from: Alignment.kt */
    @j2
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/c$b;", "", "", UiKitSpanObj.TYPE_SIZE, "space", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface b {
        int a(int size, int space, @dl.d LayoutDirection layoutDirection);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Alignment.kt */
    @j2
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/c$c;", "", "", UiKitSpanObj.TYPE_SIZE, "space", ak.av, "ui_release"}, k = 1, mv = {1, 7, 1})
    public interface InterfaceC0079c {
        int a(int size, int space);
    }

    long a(long size, long space, @dl.d LayoutDirection layoutDirection);
}
