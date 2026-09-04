package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.g2;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* JADX INFO: compiled from: NavigationRail.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\u001a}\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022 \b\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u001c\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0081\u0001\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0002\b\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001am\u0010\"\u001a\u00020\u00072\u0011\u0010\u001e\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00070\u0012¢\u0006\u0002\b\b2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012¢\u0006\u0002\b\b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0003¢\u0006\u0004\b\"\u0010#\u001a;\u0010,\u001a\u00020+*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-\u001aS\u0010/\u001a\u00020+*\u00020$2\u0006\u0010.\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100\"\u0014\u00103\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u00102\"\u0014\u00104\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u00102\"\u0014\u00106\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00102\"\u0014\u00107\u001a\u0002018\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u00102\"\u001d\u0010=\u001a\u0002088\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0017\u0010?\u001a\u0002088\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b>\u0010:\"\u0014\u0010C\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010B\"\u001d\u0010F\u001a\u0002088\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010<\"\u001d\u0010I\u001a\u0002088\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<\"\u001d\u0010L\u001a\u0002088\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bK\u0010<\"\u0017\u0010N\u001a\u0002088\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bM\u0010:\"\u0017\u0010P\u001a\u0002088\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010:\"\u0017\u0010Q\u001a\u0002088\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bH\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006R"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/o;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "header", "Landroidx/compose/foundation/layout/h1;", "windowInsets", "content", ak.av, "(Landroidx/compose/ui/n;JJLyh/q;Landroidx/compose/foundation/layout/h1;Lyh/q;Landroidx/compose/runtime/p;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/x0;", "colors", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "b", "(ZLyh/a;Lyh/p;Landroidx/compose/ui/n;ZLyh/p;ZLandroidx/compose/material3/x0;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", NavigationRailKt.f10032a, NavigationRailKt.f10033b, "", "animationProgress", "d", "(Lyh/p;Lyh/p;Lyh/p;Lyh/p;ZFLandroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/e1;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "q", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;J)Landroidx/compose/ui/layout/j0;", "labelPlaceable", "r", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;JZF)Landroidx/compose/ui/layout/j0;", "", "Ljava/lang/String;", "IndicatorRippleLayoutIdTag", "IndicatorLayoutIdTag", ak.aF, "IconLayoutIdTag", "LabelLayoutIdTag", "Ls1/h;", "e", "F", "p", "()F", "NavigationRailVerticalPadding", "f", "NavigationRailHeaderPadding", "", "g", "I", "ItemAnimationDurationMillis", RXScreenCaptureService.KEY_HEIGHT, "o", "NavigationRailItemWidth", "i", "m", "NavigationRailItemHeight", "j", "n", "NavigationRailItemVerticalPadding", "k", "IndicatorHorizontalPadding", "l", "IndicatorVerticalPaddingWithLabel", "IndicatorVerticalPaddingNoLabel", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class NavigationRailKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f10032a = "indicatorRipple";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f10033b = "indicator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f10034c = "icon";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f10035d = "label";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f10036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f10037f = s1.h.g(8);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f10038g = 150;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f10039h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f10040i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f10041j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f10042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final float f10043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float f10044m;

    /* JADX INFO: compiled from: NavigationRail.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements androidx.compose.ui.layout.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f10095a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> f10096b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f10097c;

        /* JADX WARN: Multi-variable type inference failed */
        a(float f10, yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, boolean z10) {
            this.f10095a = f10;
            this.f10096b = pVar;
            this.f10097c = z10;
        }

        @Override // androidx.compose.ui.layout.i0
        @dl.d
        public final androidx.compose.ui.layout.j0 a(@dl.d androidx.compose.ui.layout.l0 Layout, @dl.d List<? extends androidx.compose.ui.layout.g0> measurables, long j10) {
            Object next;
            androidx.compose.ui.layout.e1 e1VarZ1;
            androidx.compose.ui.layout.g0 g0Var;
            kotlin.jvm.internal.f0.p(Layout, "$this$Layout");
            kotlin.jvm.internal.f0.p(measurables, "measurables");
            for (androidx.compose.ui.layout.g0 g0Var2 : measurables) {
                if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var2), "icon")) {
                    androidx.compose.ui.layout.e1 e1VarZ2 = g0Var2.z1(j10);
                    float f10 = 2;
                    int width = e1VarZ2.getWidth() + Layout.e1(s1.h.g(NavigationRailKt.f10042k * f10));
                    int iL0 = di.d.L0(width * this.f10095a);
                    int height = e1VarZ2.getHeight() + Layout.e1(s1.h.g((this.f10096b == null ? NavigationRailKt.f10044m : NavigationRailKt.f10043l) * f10));
                    for (androidx.compose.ui.layout.g0 g0Var3 : measurables) {
                        if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var3), NavigationRailKt.f10032a)) {
                            androidx.compose.ui.layout.e1 e1VarZ3 = g0Var3.z1(s1.b.f139198b.c(width, height));
                            Iterator<T> it = measurables.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next), NavigationRailKt.f10033b));
                            androidx.compose.ui.layout.g0 g0Var4 = (androidx.compose.ui.layout.g0) next;
                            androidx.compose.ui.layout.e1 e1VarZ4 = g0Var4 != null ? g0Var4.z1(s1.b.f139198b.c(iL0, height)) : null;
                            if (this.f10096b != null) {
                                Iterator<T> it2 = measurables.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                    }
                                    g0Var = (androidx.compose.ui.layout.g0) it2.next();
                                } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var), "label"));
                                e1VarZ1 = g0Var.z1(s1.b.e(j10, 0, 0, 0, 0, 11, null));
                            } else {
                                e1VarZ1 = null;
                            }
                            if (this.f10096b == null) {
                                return NavigationRailKt.q(Layout, e1VarZ2, e1VarZ3, e1VarZ4, j10);
                            }
                            kotlin.jvm.internal.f0.m(e1VarZ1);
                            return NavigationRailKt.r(Layout, e1VarZ1, e1VarZ2, e1VarZ3, e1VarZ4, j10, this.f10097c, this.f10095a);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int b(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.c(this, nVar, list, i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int c(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.d(this, nVar, list, i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int d(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.a(this, nVar, list, i10);
        }

        @Override // androidx.compose.ui.layout.i0
        public /* synthetic */ int e(androidx.compose.ui.layout.n nVar, List list, int i10) {
            return androidx.compose.ui.layout.h0.b(this, nVar, list, i10);
        }
    }

    static {
        float f10 = 4;
        f10036e = s1.h.g(f10);
        t0.h0 h0Var = t0.h0.f139820a;
        f10039h = h0Var.p();
        f10040i = h0Var.F();
        f10041j = s1.h.g(f10);
        float f11 = 2;
        f10042k = s1.h.g(s1.h.g(h0Var.i() - h0Var.q()) / f11);
        f10043l = s1.h.g(s1.h.g(h0Var.g() - h0Var.q()) / f11);
        f10044m = s1.h.g(s1.h.g(h0Var.F() - h0Var.q()) / f11);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x0138  */
    /* JADX WARN: Code duplicated, block: B:108:0x0171  */
    /* JADX WARN: Code duplicated, block: B:113:0x017d  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3 A[PHI: r2 r4 r5 r10 r12
  0x00f3: PHI (r2v5 androidx.compose.ui.n) = (r2v2 androidx.compose.ui.n), (r2v9 androidx.compose.ui.n) binds: [B:101:0x0123, B:86:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r4v19 int) = (r4v14 int), (r4v22 int) binds: [B:101:0x0123, B:86:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:101:0x0123, B:86:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r10v11 long) = (r10v2 long), (r10v1 long) binds: [B:101:0x0123, B:86:0x00f2] A[DONT_GENERATE, DONT_INLINE]
  0x00f3: PHI (r12v10 yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2>) = 
  (r12v3 yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2>)
  (r12v2 yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2>)
 binds: [B:101:0x0123, B:86:0x00f2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:94:0x0106  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x011f  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e androidx.compose.foundation.layout.h1 h1Var, @dl.d final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        long jA;
        long jC;
        yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2;
        androidx.compose.foundation.layout.h1 h1Var2;
        int i13;
        androidx.compose.ui.n nVar3;
        final androidx.compose.foundation.layout.h1 h1VarB;
        final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar3;
        final int i14;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(118552648);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i12 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                jA = j10;
                int i16 = pVarF.z(jA) ? 32 : 16;
                i12 |= i16;
            } else {
                jA = j10;
            }
            i12 |= i16;
        } else {
            jA = j10;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            jC = j11;
            i12 |= ((i11 & 4) == 0 && pVarF.z(jC)) ? 256 : 128;
        } else {
            jC = j11;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                qVar2 = qVar;
                i12 |= pVarF.s(qVar2) ? 2048 : 1024;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    h1Var2 = h1Var;
                    int i18 = pVarF.s(h1Var2) ? 16384 : 8192;
                    i12 |= i18;
                } else {
                    h1Var2 = h1Var;
                }
                i12 |= i18;
            } else {
                h1Var2 = h1Var;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                }
                if ((374491 & i12) == 74898 || !pVarF.b()) {
                    pVarF.W();
                    if ((i10 & 1) != 0 || pVarF.o()) {
                        if (i15 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if ((i11 & 2) != 0) {
                            jA = w0.f12148a.a(pVarF, 6);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        }
                        if ((i11 & 4) != 0) {
                            jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                            i12 &= -897;
                        }
                        if (i17 != 0) {
                            qVar2 = null;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            h1VarB = w0.f12148a.b(pVarF, 6);
                            qVar3 = qVar2;
                        }
                        long j12 = jC;
                        i14 = i12;
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                        }
                        androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                                if ((i19 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2092683357, i19, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                                }
                                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                                androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                                androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                                Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                                yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar4 = qVar3;
                                int i20 = i14;
                                yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = content;
                                pVar2.T(-483455358);
                                androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                                pVar2.T(-1323940314);
                                s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA = companion2.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                                if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar2.h();
                                if (pVar2.getInserting()) {
                                    pVar2.L(aVarA);
                                } else {
                                    pVar2.d();
                                }
                                pVar2.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                                Updater.j(pVarB, i0VarB, companion2.d());
                                Updater.j(pVarB, eVar, companion2.b());
                                Updater.j(pVarB, layoutDirection, companion2.c());
                                Updater.j(pVarB, d2Var, companion2.f());
                                pVar2.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                                pVar2.T(2058660585);
                                pVar2.T(-1163856341);
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                                pVar2.T(-1267890579);
                                pVar2.T(716053607);
                                if (qVar4 != null) {
                                    qVar4.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i20 >> 6) & 112) | 6));
                                    androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                                }
                                pVar2.c0();
                                qVar5.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i20 >> 12) & 112) | 6));
                                pVar2.c0();
                                pVar2.c0();
                                pVar2.c0();
                                pVar2.f();
                                pVar2.c0();
                                pVar2.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        int i19 = 12582912 | (i14 & 14);
                        int i20 = i14 << 3;
                        int i21 = i19 | (i20 & bb.c.b.f30796me) | (i20 & bb.c.g.f32954lc);
                        androidx.compose.foundation.layout.h1 h1Var3 = h1VarB;
                        SurfaceKt.a(nVar3, null, jA, j12, 0.0f, 0.0f, null, aVarB, pVarF, i21, 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        h1Var2 = h1Var3;
                        jC = j12;
                    } else {
                        pVarF.l();
                        if ((i11 & 2) != 0) {
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        }
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        nVar3 = nVar2;
                    }
                    qVar3 = qVar2;
                    h1VarB = h1Var2;
                    long j13 = jC;
                    i14 = i12;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                    }
                    androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i110) {
                            if ((i110 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2092683357, i110, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                            }
                            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                            androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                            androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                            Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar4 = qVar3;
                            int i22 = i14;
                            yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = content;
                            pVar2.T(-483455358);
                            androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion2.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                            if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar2.h();
                            if (pVar2.getInserting()) {
                                pVar2.L(aVarA);
                            } else {
                                pVar2.d();
                            }
                            pVar2.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                            Updater.j(pVarB, i0VarB, companion2.d());
                            Updater.j(pVarB, eVar, companion2.b());
                            Updater.j(pVarB, layoutDirection, companion2.c());
                            Updater.j(pVarB, d2Var, companion2.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                            pVar2.T(2058660585);
                            pVar2.T(-1163856341);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                            pVar2.T(-1267890579);
                            pVar2.T(716053607);
                            if (qVar4 != null) {
                                qVar4.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i22 >> 6) & 112) | 6));
                                androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                            }
                            pVar2.c0();
                            qVar5.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i22 >> 12) & 112) | 6));
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.c0();
                            pVar2.f();
                            pVar2.c0();
                            pVar2.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    int i110 = 12582912 | (i14 & 14);
                    int i22 = i14 << 3;
                    int i23 = i110 | (i22 & bb.c.b.f30796me) | (i22 & bb.c.g.f32954lc);
                    androidx.compose.foundation.layout.h1 h1Var4 = h1VarB;
                    SurfaceKt.a(nVar3, null, jA, j13, 0.0f, 0.0f, null, aVarB2, pVarF, i23, 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1Var2 = h1Var4;
                    jC = j13;
                } else {
                    pVarF.l();
                    nVar3 = nVar2;
                    qVar3 = qVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar4 = nVar3;
                final long j14 = jA;
                final long j15 = jC;
                final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVar3;
                final androidx.compose.foundation.layout.h1 h1Var5 = h1Var2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                        NavigationRailKt.a(nVar4, j14, j15, qVar4, h1Var5, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i13;
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                }
                long j16 = jC;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i111) {
                        if ((i111 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-2092683357, i111, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                        }
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = qVar3;
                        int i24 = i14;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar6 = content;
                        pVar2.T(-483455358);
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                        pVar2.T(-1267890579);
                        pVar2.T(716053607);
                        if (qVar5 != null) {
                            qVar5.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i24 >> 6) & 112) | 6));
                            androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                        }
                        pVar2.c0();
                        qVar6.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i24 >> 12) & 112) | 6));
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i111 = 12582912 | (i14 & 14);
                int i24 = i14 << 3;
                int i25 = i111 | (i24 & bb.c.b.f30796me) | (i24 & bb.c.g.f32954lc);
                androidx.compose.foundation.layout.h1 h1Var6 = h1VarB;
                SurfaceKt.a(nVar3, null, jA, j16, 0.0f, 0.0f, null, aVarB3, pVarF, i25, 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1Var6;
                jC = j16;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                }
                long j17 = jC;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i112) {
                        if ((i112 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-2092683357, i112, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                        }
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = qVar3;
                        int i26 = i14;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar6 = content;
                        pVar2.T(-483455358);
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                        pVar2.T(-1267890579);
                        pVar2.T(716053607);
                        if (qVar5 != null) {
                            qVar5.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i26 >> 6) & 112) | 6));
                            androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                        }
                        pVar2.c0();
                        qVar6.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i26 >> 12) & 112) | 6));
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i112 = 12582912 | (i14 & 14);
                int i26 = i14 << 3;
                int i27 = i112 | (i26 & bb.c.b.f30796me) | (i26 & bb.c.g.f32954lc);
                androidx.compose.foundation.layout.h1 h1Var7 = h1VarB;
                SurfaceKt.a(nVar3, null, jA, j17, 0.0f, 0.0f, null, aVarB4, pVarF, i27, 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1Var7;
                jC = j17;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar5 = nVar3;
            final long j18 = jA;
            final long j19 = jC;
            final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVar3;
            final androidx.compose.foundation.layout.h1 h1Var8 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                    NavigationRailKt.a(nVar5, j18, j19, qVar5, h1Var8, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        qVar2 = qVar;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                h1Var2 = h1Var;
                if (pVarF.s(h1Var2)) {
                }
                i12 |= i18;
            } else {
                h1Var2 = h1Var;
            }
            i12 |= i18;
        } else {
            h1Var2 = h1Var;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (pVarF.s(content)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                }
                long j110 = jC;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i113) {
                        if ((i113 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-2092683357, i113, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                        }
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar6 = qVar3;
                        int i28 = i14;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar7 = content;
                        pVar2.T(-483455358);
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                        pVar2.T(-1267890579);
                        pVar2.T(716053607);
                        if (qVar6 != null) {
                            qVar6.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i28 >> 6) & 112) | 6));
                            androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                        }
                        pVar2.c0();
                        qVar7.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i28 >> 12) & 112) | 6));
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i113 = 12582912 | (i14 & 14);
                int i28 = i14 << 3;
                int i29 = i113 | (i28 & bb.c.b.f30796me) | (i28 & bb.c.g.f32954lc);
                androidx.compose.foundation.layout.h1 h1Var9 = h1VarB;
                SurfaceKt.a(nVar3, null, jA, j110, 0.0f, 0.0f, null, aVarB5, pVarF, i29, 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1Var9;
                jC = j110;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = w0.f12148a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        qVar2 = null;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarB = w0.f12148a.b(pVarF, 6);
                        qVar3 = qVar2;
                    } else {
                        qVar3 = qVar2;
                        h1VarB = h1Var2;
                    }
                }
                long j111 = jC;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
                }
                androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i114) {
                        if ((i114 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-2092683357, i114, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                        }
                        androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                        androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar6 = qVar3;
                        int i210 = i14;
                        yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar7 = content;
                        pVar2.T(-483455358);
                        androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar2.h();
                        if (pVar2.getInserting()) {
                            pVar2.L(aVarA);
                        } else {
                            pVar2.d();
                        }
                        pVar2.Y();
                        androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                        Updater.j(pVarB, i0VarB, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                        pVar2.T(2058660585);
                        pVar2.T(-1163856341);
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                        pVar2.T(-1267890579);
                        pVar2.T(716053607);
                        if (qVar6 != null) {
                            qVar6.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i210 >> 6) & 112) | 6));
                            androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                        }
                        pVar2.c0();
                        qVar7.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i210 >> 12) & 112) | 6));
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.c0();
                        pVar2.f();
                        pVar2.c0();
                        pVar2.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                int i114 = 12582912 | (i14 & 14);
                int i210 = i14 << 3;
                int i211 = i114 | (i210 & bb.c.b.f30796me) | (i210 & bb.c.g.f32954lc);
                androidx.compose.foundation.layout.h1 h1Var10 = h1VarB;
                SurfaceKt.a(nVar3, null, jA, j111, 0.0f, 0.0f, null, aVarB6, pVarF, i211, 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1Var2 = h1Var10;
                jC = j111;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar6 = nVar3;
            final long j112 = jA;
            final long j113 = jC;
            final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVar3;
            final androidx.compose.foundation.layout.h1 h1Var11 = h1Var2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                    NavigationRailKt.a(nVar6, j112, j113, qVar6, h1Var11, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i13;
        if ((374491 & i12) == 74898) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = w0.f12148a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    qVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarB = w0.f12148a.b(pVarF, 6);
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    h1VarB = h1Var2;
                }
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = w0.f12148a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    qVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarB = w0.f12148a.b(pVarF, 6);
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    h1VarB = h1Var2;
                }
            }
            long j114 = jC;
            i14 = i12;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
            }
            androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i115) {
                    if ((i115 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2092683357, i115, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                    }
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                    androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                    Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar7 = qVar3;
                    int i212 = i14;
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar8 = content;
                    pVar2.T(-483455358);
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion2.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarB, companion2.d());
                    Updater.j(pVarB, eVar, companion2.b());
                    Updater.j(pVarB, layoutDirection, companion2.c());
                    Updater.j(pVarB, d2Var, companion2.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                    pVar2.T(-1267890579);
                    pVar2.T(716053607);
                    if (qVar7 != null) {
                        qVar7.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i212 >> 6) & 112) | 6));
                        androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                    }
                    pVar2.c0();
                    qVar8.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i212 >> 12) & 112) | 6));
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i115 = 12582912 | (i14 & 14);
            int i212 = i14 << 3;
            int i213 = i115 | (i212 & bb.c.b.f30796me) | (i212 & bb.c.g.f32954lc);
            androidx.compose.foundation.layout.h1 h1Var12 = h1VarB;
            SurfaceKt.a(nVar3, null, jA, j114, 0.0f, 0.0f, null, aVarB7, pVarF, i213, 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            h1Var2 = h1Var12;
            jC = j114;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = w0.f12148a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    qVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarB = w0.f12148a.b(pVarF, 6);
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    h1VarB = h1Var2;
                }
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = w0.f12148a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jC = ColorSchemeKt.c(jA, pVarF, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    qVar2 = null;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarB = w0.f12148a.b(pVarF, 6);
                    qVar3 = qVar2;
                } else {
                    qVar3 = qVar2;
                    h1VarB = h1Var2;
                }
            }
            long j115 = jC;
            i14 = i12;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(118552648, i14, -1, "androidx.compose.material3.NavigationRail (NavigationRail.kt:100)");
            }
            androidx.compose.runtime.internal.a aVarB8 = androidx.compose.runtime.internal.b.b(pVarF, -2092683357, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i116) {
                    if ((i116 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-2092683357, i116, -1, "androidx.compose.material3.NavigationRail.<anonymous> (NavigationRail.kt:112)");
                    }
                    androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                    androidx.compose.ui.n nVarA = SelectableGroupKt.a(PaddingKt.m(SizeKt.J(WindowInsetsPaddingKt.d(SizeKt.j(companion, 0.0f, 1, null), h1VarB), t0.h0.f139820a.p(), 0.0f, 2, null), 0.0f, NavigationRailKt.p(), 1, null));
                    androidx.compose.ui.c.b bVarM = androidx.compose.ui.c.INSTANCE.m();
                    Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationRailKt.p());
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar7 = qVar3;
                    int i214 = i14;
                    yh.q<androidx.compose.foundation.layout.o, androidx.compose.runtime.p, Integer, kotlin.b2> qVar8 = content;
                    pVar2.T(-483455358);
                    androidx.compose.ui.layout.i0 i0VarB = ColumnKt.b(eVarZ, bVarM, pVar2, 54);
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion2.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0VarB, companion2.d());
                    Updater.j(pVarB, eVar, companion2.b());
                    Updater.j(pVarB, layoutDirection, companion2.c());
                    Updater.j(pVarB, d2Var, companion2.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, 0);
                    pVar2.T(2058660585);
                    pVar2.T(-1163856341);
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f5971a;
                    pVar2.T(-1267890579);
                    pVar2.T(716053607);
                    if (qVar7 != null) {
                        qVar7.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i214 >> 6) & 112) | 6));
                        androidx.compose.foundation.layout.b1.a(SizeKt.o(companion, NavigationRailKt.f10037f), pVar2, 6);
                    }
                    pVar2.c0();
                    qVar8.invoke(columnScopeInstance, pVar2, Integer.valueOf(((i214 >> 12) & 112) | 6));
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                    pVar2.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            int i116 = 12582912 | (i14 & 14);
            int i214 = i14 << 3;
            int i215 = i116 | (i214 & bb.c.b.f30796me) | (i214 & bb.c.g.f32954lc);
            androidx.compose.foundation.layout.h1 h1Var13 = h1VarB;
            SurfaceKt.a(nVar3, null, jA, j115, 0.0f, 0.0f, null, aVarB8, pVarF, i215, 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            h1Var2 = h1Var13;
            jC = j115;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar7 = nVar3;
        final long j116 = jA;
        final long j117 = jC;
        final yh.q<? super androidx.compose.foundation.layout.o, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar3;
        final androidx.compose.foundation.layout.h1 h1Var14 = h1Var2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRail$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                NavigationRailKt.a(nVar7, j116, j117, qVar7, h1Var14, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x013d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:119:0x016c  */
    /* JADX WARN: Code duplicated, block: B:120:0x016e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0172  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:126:0x019e  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:135:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:139:0x0203  */
    /* JADX WARN: Code duplicated, block: B:142:0x027d  */
    /* JADX WARN: Code duplicated, block: B:145:0x0289  */
    /* JADX WARN: Code duplicated, block: B:146:0x028d  */
    /* JADX WARN: Code duplicated, block: B:149:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:150:0x02df  */
    /* JADX WARN: Code duplicated, block: B:153:0x033e  */
    /* JADX WARN: Code duplicated, block: B:155:0x0346  */
    /* JADX WARN: Code duplicated, block: B:158:0x0356  */
    /* JADX WARN: Code duplicated, block: B:159:0x0369  */
    /* JADX WARN: Code duplicated, block: B:162:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0085  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0115  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(final boolean z10, @dl.d final yh.a<kotlin.b2> onClick, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> icon, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, boolean z12, @dl.e x0 x0Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar2, final int i10, final int i11) {
        final int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        androidx.compose.foundation.interaction.g gVar2;
        int i20;
        boolean z15;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3;
        final x0 x0VarA;
        androidx.compose.foundation.interaction.g gVar3;
        Object objU;
        androidx.compose.runtime.internal.a aVarB;
        androidx.compose.ui.n nVar3;
        yh.a<ComposeUiNode> aVarA;
        float f10;
        t0.h0 h0Var;
        long jA;
        boolean zS;
        Object objU2;
        final g2 g2VarD;
        final x0 x0Var2;
        final boolean z16;
        final androidx.compose.foundation.interaction.g gVar4;
        final boolean z17;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(icon, "icon");
        androidx.compose.runtime.p pVarF = pVar2.F(-1533971045);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(onClick) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(icon) ? 256 : 128;
        }
        int i21 = i11 & 8;
        if (i21 == 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((i10 & 57344) == 0) {
                    z13 = z11;
                    if (pVarF.u(z13)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        if (pVarF.s(pVar)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        z14 = z12;
                    } else {
                        z14 = z12;
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.u(z14)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 234881024) == 0) {
                            gVar2 = gVar;
                            if (pVarF.s(gVar2)) {
                                i20 = 67108864;
                            } else {
                                i20 = 33554432;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 191739611) == 38347922 || !pVarF.b()) {
                            pVarF.W();
                            if ((i10 & 1) != 0 || pVarF.o()) {
                                if (i21 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                }
                                if (i13 != 0) {
                                    z15 = true;
                                } else {
                                    z15 = z13;
                                }
                                if (i15 != 0) {
                                    pVar3 = null;
                                } else {
                                    pVar3 = pVar;
                                }
                                if (i17 != 0) {
                                    z14 = true;
                                }
                                if ((i11 & 128) != 0) {
                                    x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                    i12 &= -29360129;
                                } else {
                                    x0VarA = x0Var;
                                }
                                if (i19 != 0) {
                                    pVarF.T(-492369756);
                                    objU = pVarF.U();
                                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                        objU = androidx.compose.foundation.interaction.f.a();
                                        pVarF.N(objU);
                                    }
                                    pVarF.c0();
                                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                                } else {
                                    gVar3 = gVar;
                                }
                            } else {
                                pVarF.l();
                                if ((i11 & 128) != 0) {
                                    i12 &= -29360129;
                                }
                                pVar3 = pVar;
                                x0VarA = x0Var;
                                gVar3 = gVar;
                                z15 = z13;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                            }
                            final x0 x0Var3 = x0VarA;
                            final int i22 = i12;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5 = pVar3;
                            final boolean z18 = z14;
                            androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar6, int i23) {
                                    if ((i23 & 11) == 2 && pVar6.b()) {
                                        pVar6.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1023357515, i23, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                    }
                                    x0 x0Var4 = x0Var3;
                                    boolean z19 = z10;
                                    int i24 = i22;
                                    m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var4.b(z19, pVar6, ((i24 >> 18) & 112) | (i24 & 14));
                                    androidx.compose.ui.n nVarA = pVar5 != null && (z18 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                        public final void a(@dl.d r clearAndSetSemantics) {
                                            kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                            a(rVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }) : androidx.compose.ui.n.INSTANCE;
                                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = icon;
                                    int i25 = i22;
                                    pVar6.T(733328855);
                                    androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar6, 0);
                                    pVar6.T(-1323940314);
                                    s1.e eVar = (s1.e) pVar6.K(CompositionLocalsKt.i());
                                    LayoutDirection layoutDirection = (LayoutDirection) pVar6.K(CompositionLocalsKt.p());
                                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar6.K(CompositionLocalsKt.u());
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    yh.a<ComposeUiNode> aVarA2 = companion.a();
                                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                                    if (!(pVar6.G() instanceof androidx.compose.runtime.e)) {
                                        ComposablesKt.n();
                                    }
                                    pVar6.h();
                                    if (pVar6.getInserting()) {
                                        pVar6.L(aVarA2);
                                    } else {
                                        pVar6.d();
                                    }
                                    pVar6.Y();
                                    androidx.compose.runtime.p pVarB = Updater.b(pVar6);
                                    Updater.j(pVarB, i0VarK, companion.d());
                                    Updater.j(pVarB, eVar, companion.b());
                                    Updater.j(pVarB, layoutDirection, companion.c());
                                    Updater.j(pVarB, d2Var, companion.f());
                                    pVar6.x();
                                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar6)), pVar6, 0);
                                    pVar6.T(2058660585);
                                    pVar6.T(-2137368960);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                    pVar6.T(-1892243397);
                                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar7, pVar6, ((i25 >> 3) & 112) | 8);
                                    pVar6.c0();
                                    pVar6.c0();
                                    pVar6.c0();
                                    pVar6.f();
                                    pVar6.c0();
                                    pVar6.c0();
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                    a(pVar6, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                            if (pVar3 != null) {
                                aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                        return m2Var.getValue().M();
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar6, int i23) {
                                        if ((i23 & 11) == 2 && pVar6.b()) {
                                            pVar6.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-105269599, i23, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                        }
                                        final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar6, 6), t0.h0.f139820a.z());
                                        x0 x0Var4 = x0VarA;
                                        boolean z19 = z10;
                                        int i24 = i12;
                                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var4.c(z19, pVar6, ((i24 >> 18) & 112) | (i24 & 14)))))};
                                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = pVar3;
                                        final int i25 = i12;
                                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar6, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i26) {
                                                if ((i26 & 11) == 2 && pVar8.b()) {
                                                    pVar8.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(-288191647, i26, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                                }
                                                TextKt.a(textStyleA, pVar7, pVar8, (i25 >> 12) & 112);
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                                a(pVar8, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }), pVar6, 56);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                        a(pVar6, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                aVarB = null;
                            }
                            androidx.compose.ui.n nVarO = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                            float f11 = f10039h;
                            boolean z19 = z15;
                            androidx.compose.ui.n nVarJ = SizeKt.J(nVarO, f11, 0.0f, 2, null);
                            androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                            pVarF.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVarF, 6);
                            pVarF.T(-1323940314);
                            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            nVar3 = nVar2;
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarJ);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.getInserting()) {
                                pVarF.L(aVarA);
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
                            Updater.j(pVarB, i0VarK, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVarF.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                            pVarF.T(2058660585);
                            pVarF.T(-2137368960);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                            pVarF.T(752355157);
                            if (z10) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            final m2 m2VarF = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            int iE1 = eVar2.e1(f11);
                            h0Var = t0.h0.f139820a;
                            jA = b1.g.a((iE1 - eVar2.e1(h0Var.i())) / 2, 0.0f);
                            kotlin.b2 b2Var = kotlin.b2.f124493a;
                            b1.f fVarD = b1.f.d(jA);
                            pVarF.T(511388516);
                            zS = pVarF.s(fVarD) | pVarF.s(gVar3);
                            objU2 = pVarF.U();
                            if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU2 = new MappedInteractionSource(gVar3, jA, null);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objU2;
                            if (pVar3 != null) {
                                pVarF.T(1104516937);
                                g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                                pVarF.c0();
                            } else {
                                pVarF.T(1104517018);
                                g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                                pVarF.c0();
                            }
                            d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar6, int i23) {
                                    if ((i23 & 11) == 2 && pVar6.b()) {
                                        pVar6.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(211026382, i23, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                    }
                                    BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar6, 0, 7)), pVar6, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                    a(pVar6, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar6, int i23) {
                                    if ((i23 & 11) == 2 && pVar6.b()) {
                                        pVar6.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-1862011490, i23, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                    }
                                    BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar6, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar6, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                    a(pVar6, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), aVarB2, aVarB, z14, c(m2VarF), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                            pVarF.c0();
                            pVarF.c0();
                            pVarF.c0();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            x0Var2 = x0VarA;
                            z16 = z19;
                            gVar4 = gVar3;
                            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar3;
                            z17 = z14;
                            pVar4 = pVar6;
                        } else {
                            pVarF.l();
                            z17 = z14;
                            nVar3 = nVar2;
                            z16 = z13;
                            gVar4 = gVar2;
                            pVar4 = pVar;
                            x0Var2 = x0Var;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar4 = nVar3;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar7, int i23) {
                                NavigationRailKt.b(z10, onClick, icon, nVar4, z16, pVar4, z17, x0Var2, gVar4, pVar7, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                a(pVar7, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i12 |= 100663296;
                    gVar2 = gVar;
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var4 = x0VarA;
                        final int i23 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVar3;
                        final boolean z110 = z14;
                        androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i24) {
                                if ((i24 & 11) == 2 && pVar8.b()) {
                                    pVar8.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i24, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var5 = x0Var4;
                                boolean z111 = z10;
                                int i25 = i23;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var5.b(z111, pVar8, ((i25 >> 18) & 112) | (i25 & 14));
                                androidx.compose.ui.n nVarA = pVar7 != null && (z110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar9 = icon;
                                int i26 = i23;
                                pVar8.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar8, 0);
                                pVar8.T(-1323940314);
                                s1.e eVar3 = (s1.e) pVar8.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection2 = (LayoutDirection) pVar8.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar8.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion2.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA);
                                if (!(pVar8.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar8.h();
                                if (pVar8.getInserting()) {
                                    pVar8.L(aVarA2);
                                } else {
                                    pVar8.d();
                                }
                                pVar8.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVar8);
                                Updater.j(pVarB2, i0VarK2, companion2.d());
                                Updater.j(pVarB2, eVar3, companion2.b());
                                Updater.j(pVarB2, layoutDirection2, companion2.c());
                                Updater.j(pVarB2, d2Var2, companion2.f());
                                pVar8.x();
                                qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar8)), pVar8, 0);
                                pVar8.T(2058660585);
                                pVar8.T(-2137368960);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                                pVar8.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar9, pVar8, ((i26 >> 3) & 112) | 8);
                                pVar8.c0();
                                pVar8.c0();
                                pVar8.c0();
                                pVar8.f();
                                pVar8.c0();
                                pVar8.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                a(pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar8, int i24) {
                                    if ((i24 & 11) == 2 && pVar8.b()) {
                                        pVar8.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i24, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar8, 6), t0.h0.f139820a.z());
                                    x0 x0Var5 = x0VarA;
                                    boolean z111 = z10;
                                    int i25 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var5.c(z111, pVar8, ((i25 >> 18) & 112) | (i25 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar3;
                                    final int i26 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar8, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i27) {
                                            if ((i27 & 11) == 2 && pVar10.b()) {
                                                pVar10.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i27, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar9, pVar10, (i26 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                            a(pVar10, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar8, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                    a(pVar8, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO2 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f12 = f10039h;
                        boolean z111 = z15;
                        androidx.compose.ui.n nVarJ2 = SizeKt.J(nVarO2, f12, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI2 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(cVarI2, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarJ2);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
                        Updater.j(pVarB2, i0VarK2, companion2.d());
                        Updater.j(pVarB2, eVar3, companion2.b());
                        Updater.j(pVarB2, layoutDirection2, companion2.c());
                        Updater.j(pVarB2, d2Var2, companion2.f());
                        pVarF.x();
                        qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF2 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE2 = eVar4.e1(f12);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE2 - eVar4.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                        b1.f fVarD2 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD2) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i24) {
                                if ((i24 & 11) == 2 && pVar8.b()) {
                                    pVar8.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i24, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource2, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar8, 0, 7)), pVar8, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                a(pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i24) {
                                if ((i24 & 11) == 2 && pVar8.b()) {
                                    pVar8.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i24, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar8, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF2), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar8, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                a(pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB3, aVarB, z14, c(m2VarF2), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z111;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar3;
                        z17 = z14;
                        pVar4 = pVar8;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var5 = x0VarA;
                        final int i24 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar3;
                        final boolean z112 = z14;
                        androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar10, int i25) {
                                if ((i25 & 11) == 2 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i25, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var6 = x0Var5;
                                boolean z113 = z10;
                                int i26 = i24;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var6.b(z113, pVar10, ((i26 >> 18) & 112) | (i26 & 14));
                                androidx.compose.ui.n nVarA = pVar9 != null && (z112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11 = icon;
                                int i27 = i24;
                                pVar10.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar10, 0);
                                pVar10.T(-1323940314);
                                s1.e eVar5 = (s1.e) pVar10.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection3 = (LayoutDirection) pVar10.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVar10.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion3.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarA);
                                if (!(pVar10.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar10.h();
                                if (pVar10.getInserting()) {
                                    pVar10.L(aVarA2);
                                } else {
                                    pVar10.d();
                                }
                                pVar10.Y();
                                androidx.compose.runtime.p pVarB3 = Updater.b(pVar10);
                                Updater.j(pVarB3, i0VarK3, companion3.d());
                                Updater.j(pVarB3, eVar5, companion3.b());
                                Updater.j(pVarB3, layoutDirection3, companion3.c());
                                Updater.j(pVarB3, d2Var3, companion3.f());
                                pVar10.x();
                                qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar10)), pVar10, 0);
                                pVar10.T(2058660585);
                                pVar10.T(-2137368960);
                                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                                pVar10.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11, pVar10, ((i27 >> 3) & 112) | 8);
                                pVar10.c0();
                                pVar10.c0();
                                pVar10.c0();
                                pVar10.f();
                                pVar10.c0();
                                pVar10.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                a(pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar10, int i25) {
                                    if ((i25 & 11) == 2 && pVar10.b()) {
                                        pVar10.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i25, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar10, 6), t0.h0.f139820a.z());
                                    x0 x0Var6 = x0VarA;
                                    boolean z113 = z10;
                                    int i26 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var6.c(z113, pVar10, ((i26 >> 18) & 112) | (i26 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar3;
                                    final int i27 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar10, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar12, int i28) {
                                            if ((i28 & 11) == 2 && pVar12.b()) {
                                                pVar12.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i28, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar11, pVar12, (i27 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                            a(pVar12, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar10, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                    a(pVar10, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO3 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f13 = f10039h;
                        boolean z113 = z15;
                        androidx.compose.ui.n nVarJ3 = SizeKt.J(nVarO3, f13, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI3 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(cVarI3, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        aVarA = companion3.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarJ3);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                        Updater.j(pVarB3, i0VarK3, companion3.d());
                        Updater.j(pVarB3, eVar5, companion3.b());
                        Updater.j(pVarB3, layoutDirection3, companion3.c());
                        Updater.j(pVarB3, d2Var3, companion3.f());
                        pVarF.x();
                        qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF3 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE3 = eVar6.e1(f13);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE3 - eVar6.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var3 = kotlin.b2.f124493a;
                        b1.f fVarD3 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD3) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource3 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar10, int i25) {
                                if ((i25 & 11) == 2 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i25, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource3, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar10, 0, 7)), pVar10, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                a(pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar10, int i25) {
                                if ((i25 & 11) == 2 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i25, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar10, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF3), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar10, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                a(pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB4, aVarB, z14, c(m2VarF3), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z113;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar3;
                        z17 = z14;
                        pVar4 = pVar10;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar5 = nVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i25) {
                            NavigationRailKt.b(z10, onClick, icon, nVar5, z16, pVar4, z17, x0Var2, gVar4, pVar11, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= androidx.profileinstaller.o.c.f26824k;
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.u(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        gVar2 = gVar;
                        if (pVarF.s(gVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var6 = x0VarA;
                        final int i25 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar3;
                        final boolean z114 = z14;
                        androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i26) {
                                if ((i26 & 11) == 2 && pVar12.b()) {
                                    pVar12.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i26, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var7 = x0Var6;
                                boolean z115 = z10;
                                int i27 = i25;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var7.b(z115, pVar12, ((i27 >> 18) & 112) | (i27 & 14));
                                androidx.compose.ui.n nVarA = pVar11 != null && (z114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar13 = icon;
                                int i28 = i25;
                                pVar12.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK4 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar12, 0);
                                pVar12.T(-1323940314);
                                s1.e eVar7 = (s1.e) pVar12.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection4 = (LayoutDirection) pVar12.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVar12.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion4.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVarA);
                                if (!(pVar12.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar12.h();
                                if (pVar12.getInserting()) {
                                    pVar12.L(aVarA2);
                                } else {
                                    pVar12.d();
                                }
                                pVar12.Y();
                                androidx.compose.runtime.p pVarB4 = Updater.b(pVar12);
                                Updater.j(pVarB4, i0VarK4, companion4.d());
                                Updater.j(pVarB4, eVar7, companion4.b());
                                Updater.j(pVarB4, layoutDirection4, companion4.c());
                                Updater.j(pVarB4, d2Var4, companion4.f());
                                pVar12.x();
                                qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar12)), pVar12, 0);
                                pVar12.T(2058660585);
                                pVar12.T(-2137368960);
                                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                                pVar12.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar13, pVar12, ((i28 >> 3) & 112) | 8);
                                pVar12.c0();
                                pVar12.c0();
                                pVar12.c0();
                                pVar12.f();
                                pVar12.c0();
                                pVar12.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                a(pVar12, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar12, int i26) {
                                    if ((i26 & 11) == 2 && pVar12.b()) {
                                        pVar12.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i26, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar12, 6), t0.h0.f139820a.z());
                                    x0 x0Var7 = x0VarA;
                                    boolean z115 = z10;
                                    int i27 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var7.c(z115, pVar12, ((i27 >> 18) & 112) | (i27 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar3;
                                    final int i28 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar12, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar14, int i29) {
                                            if ((i29 & 11) == 2 && pVar14.b()) {
                                                pVar14.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i29, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar13, pVar14, (i28 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                            a(pVar14, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar12, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                    a(pVar12, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO4 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f14 = f10039h;
                        boolean z115 = z15;
                        androidx.compose.ui.n nVarJ4 = SizeKt.J(nVarO4, f14, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI4 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK4 = BoxKt.k(cVarI4, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        aVarA = companion4.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVarJ4);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
                        Updater.j(pVarB4, i0VarK4, companion4.d());
                        Updater.j(pVarB4, eVar7, companion4.b());
                        Updater.j(pVarB4, layoutDirection4, companion4.c());
                        Updater.j(pVarB4, d2Var4, companion4.f());
                        pVarF.x();
                        qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF4 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar8 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE4 = eVar8.e1(f14);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE4 - eVar8.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var4 = kotlin.b2.f124493a;
                        b1.f fVarD4 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD4) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource4 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i26) {
                                if ((i26 & 11) == 2 && pVar12.b()) {
                                    pVar12.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i26, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource4, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar12, 0, 7)), pVar12, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                a(pVar12, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i26) {
                                if ((i26 & 11) == 2 && pVar12.b()) {
                                    pVar12.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i26, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar12, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF4), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar12, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                a(pVar12, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB5, aVarB, z14, c(m2VarF4), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z115;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar3;
                        z17 = z14;
                        pVar4 = pVar12;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var7 = x0VarA;
                        final int i26 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar3;
                        final boolean z116 = z14;
                        androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar14, int i27) {
                                if ((i27 & 11) == 2 && pVar14.b()) {
                                    pVar14.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i27, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var8 = x0Var7;
                                boolean z117 = z10;
                                int i28 = i26;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var8.b(z117, pVar14, ((i28 >> 18) & 112) | (i28 & 14));
                                androidx.compose.ui.n nVarA = pVar13 != null && (z116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar15 = icon;
                                int i29 = i26;
                                pVar14.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK5 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar14, 0);
                                pVar14.T(-1323940314);
                                s1.e eVar9 = (s1.e) pVar14.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection5 = (LayoutDirection) pVar14.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var5 = (androidx.compose.ui.platform.d2) pVar14.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion5.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF5 = LayoutKt.f(nVarA);
                                if (!(pVar14.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar14.h();
                                if (pVar14.getInserting()) {
                                    pVar14.L(aVarA2);
                                } else {
                                    pVar14.d();
                                }
                                pVar14.Y();
                                androidx.compose.runtime.p pVarB5 = Updater.b(pVar14);
                                Updater.j(pVarB5, i0VarK5, companion5.d());
                                Updater.j(pVarB5, eVar9, companion5.b());
                                Updater.j(pVarB5, layoutDirection5, companion5.c());
                                Updater.j(pVarB5, d2Var5, companion5.f());
                                pVar14.x();
                                qVarF5.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar14)), pVar14, 0);
                                pVar14.T(2058660585);
                                pVar14.T(-2137368960);
                                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                                pVar14.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar15, pVar14, ((i29 >> 3) & 112) | 8);
                                pVar14.c0();
                                pVar14.c0();
                                pVar14.c0();
                                pVar14.f();
                                pVar14.c0();
                                pVar14.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                a(pVar14, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar14, int i27) {
                                    if ((i27 & 11) == 2 && pVar14.b()) {
                                        pVar14.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i27, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar14, 6), t0.h0.f139820a.z());
                                    x0 x0Var8 = x0VarA;
                                    boolean z117 = z10;
                                    int i28 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var8.c(z117, pVar14, ((i28 >> 18) & 112) | (i28 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar3;
                                    final int i29 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar14, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i210) {
                                            if ((i210 & 11) == 2 && pVar16.b()) {
                                                pVar16.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i210, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar15, pVar16, (i29 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                                            a(pVar16, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar14, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                    a(pVar14, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO5 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f15 = f10039h;
                        boolean z117 = z15;
                        androidx.compose.ui.n nVarJ5 = SizeKt.J(nVarO5, f15, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI5 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK5 = BoxKt.k(cVarI5, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar9 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var5 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        aVarA = companion5.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF5 = LayoutKt.f(nVarJ5);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB5 = Updater.b(pVarF);
                        Updater.j(pVarB5, i0VarK5, companion5.d());
                        Updater.j(pVarB5, eVar9, companion5.b());
                        Updater.j(pVarB5, layoutDirection5, companion5.c());
                        Updater.j(pVarB5, d2Var5, companion5.f());
                        pVarF.x();
                        qVarF5.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF5 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar10 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE5 = eVar10.e1(f15);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE5 - eVar10.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var5 = kotlin.b2.f124493a;
                        b1.f fVarD5 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD5) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource5 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar14, int i27) {
                                if ((i27 & 11) == 2 && pVar14.b()) {
                                    pVar14.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i27, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource5, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar14, 0, 7)), pVar14, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                a(pVar14, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar14, int i27) {
                                if ((i27 & 11) == 2 && pVar14.b()) {
                                    pVar14.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i27, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar14, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF5), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar14, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                a(pVar14, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB6, aVarB, z14, c(m2VarF5), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z117;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar3;
                        z17 = z14;
                        pVar4 = pVar14;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar6 = nVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar15, int i27) {
                            NavigationRailKt.b(z10, onClick, icon, nVar6, z16, pVar4, z17, x0Var2, gVar4, pVar15, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                            a(pVar15, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= 100663296;
                gVar2 = gVar;
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var8 = x0VarA;
                    final int i27 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar3;
                    final boolean z118 = z14;
                    androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i28) {
                            if ((i28 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i28, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var9 = x0Var8;
                            boolean z119 = z10;
                            int i29 = i27;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var9.b(z119, pVar16, ((i29 >> 18) & 112) | (i29 & 14));
                            androidx.compose.ui.n nVarA = pVar15 != null && (z118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar17 = icon;
                            int i210 = i27;
                            pVar16.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK6 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar16, 0);
                            pVar16.T(-1323940314);
                            s1.e eVar11 = (s1.e) pVar16.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection6 = (LayoutDirection) pVar16.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var6 = (androidx.compose.ui.platform.d2) pVar16.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion6.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF6 = LayoutKt.f(nVarA);
                            if (!(pVar16.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar16.h();
                            if (pVar16.getInserting()) {
                                pVar16.L(aVarA2);
                            } else {
                                pVar16.d();
                            }
                            pVar16.Y();
                            androidx.compose.runtime.p pVarB6 = Updater.b(pVar16);
                            Updater.j(pVarB6, i0VarK6, companion6.d());
                            Updater.j(pVarB6, eVar11, companion6.b());
                            Updater.j(pVarB6, layoutDirection6, companion6.c());
                            Updater.j(pVarB6, d2Var6, companion6.f());
                            pVar16.x();
                            qVarF6.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar16)), pVar16, 0);
                            pVar16.T(2058660585);
                            pVar16.T(-2137368960);
                            BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.f5954a;
                            pVar16.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar17, pVar16, ((i210 >> 3) & 112) | 8);
                            pVar16.c0();
                            pVar16.c0();
                            pVar16.c0();
                            pVar16.f();
                            pVar16.c0();
                            pVar16.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                            a(pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar16, int i28) {
                                if ((i28 & 11) == 2 && pVar16.b()) {
                                    pVar16.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i28, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar16, 6), t0.h0.f139820a.z());
                                x0 x0Var9 = x0VarA;
                                boolean z119 = z10;
                                int i29 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var9.c(z119, pVar16, ((i29 >> 18) & 112) | (i29 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar3;
                                final int i210 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar16, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar18, int i211) {
                                        if ((i211 & 11) == 2 && pVar18.b()) {
                                            pVar18.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i211, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar17, pVar18, (i210 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                                        a(pVar18, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar16, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                                a(pVar16, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO6 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f16 = f10039h;
                    boolean z119 = z15;
                    androidx.compose.ui.n nVarJ6 = SizeKt.J(nVarO6, f16, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI6 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK6 = BoxKt.k(cVarI6, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar11 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var6 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    aVarA = companion6.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF6 = LayoutKt.f(nVarJ6);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB6 = Updater.b(pVarF);
                    Updater.j(pVarB6, i0VarK6, companion6.d());
                    Updater.j(pVarB6, eVar11, companion6.b());
                    Updater.j(pVarB6, layoutDirection6, companion6.c());
                    Updater.j(pVarB6, d2Var6, companion6.f());
                    pVarF.x();
                    qVarF6.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF6 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar12 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE6 = eVar12.e1(f16);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE6 - eVar12.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var6 = kotlin.b2.f124493a;
                    b1.f fVarD6 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD6) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource6 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i28) {
                            if ((i28 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i28, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource6, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar16, 0, 7)), pVar16, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                            a(pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i28) {
                            if ((i28 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i28, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar16, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF6), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar16, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                            a(pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB7, aVarB, z14, c(m2VarF6), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z119;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar3;
                    z17 = z14;
                    pVar4 = pVar16;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var9 = x0VarA;
                    final int i28 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar3;
                    final boolean z1110 = z14;
                    androidx.compose.runtime.internal.a aVarB8 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar18, int i29) {
                            if ((i29 & 11) == 2 && pVar18.b()) {
                                pVar18.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i29, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var10 = x0Var9;
                            boolean z1111 = z10;
                            int i210 = i28;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var10.b(z1111, pVar18, ((i210 >> 18) & 112) | (i210 & 14));
                            androidx.compose.ui.n nVarA = pVar17 != null && (z1110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar19 = icon;
                            int i211 = i28;
                            pVar18.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK7 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar18, 0);
                            pVar18.T(-1323940314);
                            s1.e eVar13 = (s1.e) pVar18.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection7 = (LayoutDirection) pVar18.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var7 = (androidx.compose.ui.platform.d2) pVar18.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion7.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF7 = LayoutKt.f(nVarA);
                            if (!(pVar18.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar18.h();
                            if (pVar18.getInserting()) {
                                pVar18.L(aVarA2);
                            } else {
                                pVar18.d();
                            }
                            pVar18.Y();
                            androidx.compose.runtime.p pVarB7 = Updater.b(pVar18);
                            Updater.j(pVarB7, i0VarK7, companion7.d());
                            Updater.j(pVarB7, eVar13, companion7.b());
                            Updater.j(pVarB7, layoutDirection7, companion7.c());
                            Updater.j(pVarB7, d2Var7, companion7.f());
                            pVar18.x();
                            qVarF7.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar18)), pVar18, 0);
                            pVar18.T(2058660585);
                            pVar18.T(-2137368960);
                            BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.f5954a;
                            pVar18.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar19, pVar18, ((i211 >> 3) & 112) | 8);
                            pVar18.c0();
                            pVar18.c0();
                            pVar18.c0();
                            pVar18.f();
                            pVar18.c0();
                            pVar18.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                            a(pVar18, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar18, int i29) {
                                if ((i29 & 11) == 2 && pVar18.b()) {
                                    pVar18.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i29, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar18, 6), t0.h0.f139820a.z());
                                x0 x0Var10 = x0VarA;
                                boolean z1111 = z10;
                                int i210 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var10.c(z1111, pVar18, ((i210 >> 18) & 112) | (i210 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar3;
                                final int i211 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar18, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar110, int i212) {
                                        if ((i212 & 11) == 2 && pVar110.b()) {
                                            pVar110.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i212, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar19, pVar110, (i211 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                        a(pVar110, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar18, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                                a(pVar18, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO7 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f17 = f10039h;
                    boolean z1111 = z15;
                    androidx.compose.ui.n nVarJ7 = SizeKt.J(nVarO7, f17, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI7 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK7 = BoxKt.k(cVarI7, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar13 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var7 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    aVarA = companion7.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF7 = LayoutKt.f(nVarJ7);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB7 = Updater.b(pVarF);
                    Updater.j(pVarB7, i0VarK7, companion7.d());
                    Updater.j(pVarB7, eVar13, companion7.b());
                    Updater.j(pVarB7, layoutDirection7, companion7.c());
                    Updater.j(pVarB7, d2Var7, companion7.f());
                    pVarF.x();
                    qVarF7.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF7 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar14 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE7 = eVar14.e1(f17);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE7 - eVar14.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var7 = kotlin.b2.f124493a;
                    b1.f fVarD7 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD7) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource7 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar18, int i29) {
                            if ((i29 & 11) == 2 && pVar18.b()) {
                                pVar18.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i29, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource7, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar18, 0, 7)), pVar18, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                            a(pVar18, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar18, int i29) {
                            if ((i29 & 11) == 2 && pVar18.b()) {
                                pVar18.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i29, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar18, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF7), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar18, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                            a(pVar18, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB8, aVarB, z14, c(m2VarF7), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z1111;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar3;
                    z17 = z14;
                    pVar4 = pVar18;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar7 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar19, int i29) {
                        NavigationRailKt.b(z10, onClick, icon, nVar7, z16, pVar4, z17, x0Var2, gVar4, pVar19, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                        a(pVar19, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            z13 = z11;
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    if (pVarF.s(pVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.u(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        gVar2 = gVar;
                        if (pVarF.s(gVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var10 = x0VarA;
                        final int i29 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar3;
                        final boolean z1112 = z14;
                        androidx.compose.runtime.internal.a aVarB9 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar110, int i210) {
                                if ((i210 & 11) == 2 && pVar110.b()) {
                                    pVar110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i210, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var11 = x0Var10;
                                boolean z1113 = z10;
                                int i211 = i29;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var11.b(z1113, pVar110, ((i211 >> 18) & 112) | (i211 & 14));
                                androidx.compose.ui.n nVarA = pVar19 != null && (z1112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111 = icon;
                                int i212 = i29;
                                pVar110.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK8 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar110, 0);
                                pVar110.T(-1323940314);
                                s1.e eVar15 = (s1.e) pVar110.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection8 = (LayoutDirection) pVar110.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var8 = (androidx.compose.ui.platform.d2) pVar110.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion8.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF8 = LayoutKt.f(nVarA);
                                if (!(pVar110.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar110.h();
                                if (pVar110.getInserting()) {
                                    pVar110.L(aVarA2);
                                } else {
                                    pVar110.d();
                                }
                                pVar110.Y();
                                androidx.compose.runtime.p pVarB8 = Updater.b(pVar110);
                                Updater.j(pVarB8, i0VarK8, companion8.d());
                                Updater.j(pVarB8, eVar15, companion8.b());
                                Updater.j(pVarB8, layoutDirection8, companion8.c());
                                Updater.j(pVarB8, d2Var8, companion8.f());
                                pVar110.x();
                                qVarF8.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar110)), pVar110, 0);
                                pVar110.T(2058660585);
                                pVar110.T(-2137368960);
                                BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.f5954a;
                                pVar110.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111, pVar110, ((i212 >> 3) & 112) | 8);
                                pVar110.c0();
                                pVar110.c0();
                                pVar110.c0();
                                pVar110.f();
                                pVar110.c0();
                                pVar110.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                a(pVar110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar110, int i210) {
                                    if ((i210 & 11) == 2 && pVar110.b()) {
                                        pVar110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i210, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar110, 6), t0.h0.f139820a.z());
                                    x0 x0Var11 = x0VarA;
                                    boolean z1113 = z10;
                                    int i211 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var11.c(z1113, pVar110, ((i211 >> 18) & 112) | (i211 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar3;
                                    final int i212 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar110, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar112, int i213) {
                                            if ((i213 & 11) == 2 && pVar112.b()) {
                                                pVar112.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i213, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar111, pVar112, (i212 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                            a(pVar112, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar110, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                    a(pVar110, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO8 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f18 = f10039h;
                        boolean z1113 = z15;
                        androidx.compose.ui.n nVarJ8 = SizeKt.J(nVarO8, f18, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI8 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK8 = BoxKt.k(cVarI8, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar15 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection8 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var8 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        aVarA = companion8.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF8 = LayoutKt.f(nVarJ8);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB8 = Updater.b(pVarF);
                        Updater.j(pVarB8, i0VarK8, companion8.d());
                        Updater.j(pVarB8, eVar15, companion8.b());
                        Updater.j(pVarB8, layoutDirection8, companion8.c());
                        Updater.j(pVarB8, d2Var8, companion8.f());
                        pVarF.x();
                        qVarF8.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF8 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar16 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE8 = eVar16.e1(f18);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE8 - eVar16.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var8 = kotlin.b2.f124493a;
                        b1.f fVarD8 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD8) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource8 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar110, int i210) {
                                if ((i210 & 11) == 2 && pVar110.b()) {
                                    pVar110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i210, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource8, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar110, 0, 7)), pVar110, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                a(pVar110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar110, int i210) {
                                if ((i210 & 11) == 2 && pVar110.b()) {
                                    pVar110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i210, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar110, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF8), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar110, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                a(pVar110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB9, aVarB, z14, c(m2VarF8), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z1113;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar3;
                        z17 = z14;
                        pVar4 = pVar110;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var11 = x0VarA;
                        final int i210 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar3;
                        final boolean z1114 = z14;
                        androidx.compose.runtime.internal.a aVarB10 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar112, int i211) {
                                if ((i211 & 11) == 2 && pVar112.b()) {
                                    pVar112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i211, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var12 = x0Var11;
                                boolean z1115 = z10;
                                int i212 = i210;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var12.b(z1115, pVar112, ((i212 >> 18) & 112) | (i212 & 14));
                                androidx.compose.ui.n nVarA = pVar111 != null && (z1114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar113 = icon;
                                int i213 = i210;
                                pVar112.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK9 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar112, 0);
                                pVar112.T(-1323940314);
                                s1.e eVar17 = (s1.e) pVar112.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection9 = (LayoutDirection) pVar112.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var9 = (androidx.compose.ui.platform.d2) pVar112.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion9.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF9 = LayoutKt.f(nVarA);
                                if (!(pVar112.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar112.h();
                                if (pVar112.getInserting()) {
                                    pVar112.L(aVarA2);
                                } else {
                                    pVar112.d();
                                }
                                pVar112.Y();
                                androidx.compose.runtime.p pVarB9 = Updater.b(pVar112);
                                Updater.j(pVarB9, i0VarK9, companion9.d());
                                Updater.j(pVarB9, eVar17, companion9.b());
                                Updater.j(pVarB9, layoutDirection9, companion9.c());
                                Updater.j(pVarB9, d2Var9, companion9.f());
                                pVar112.x();
                                qVarF9.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar112)), pVar112, 0);
                                pVar112.T(2058660585);
                                pVar112.T(-2137368960);
                                BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.f5954a;
                                pVar112.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar113, pVar112, ((i213 >> 3) & 112) | 8);
                                pVar112.c0();
                                pVar112.c0();
                                pVar112.c0();
                                pVar112.f();
                                pVar112.c0();
                                pVar112.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                a(pVar112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar112, int i211) {
                                    if ((i211 & 11) == 2 && pVar112.b()) {
                                        pVar112.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i211, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar112, 6), t0.h0.f139820a.z());
                                    x0 x0Var12 = x0VarA;
                                    boolean z1115 = z10;
                                    int i212 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var12.c(z1115, pVar112, ((i212 >> 18) & 112) | (i212 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar3;
                                    final int i213 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar112, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i214) {
                                            if ((i214 & 11) == 2 && pVar114.b()) {
                                                pVar114.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i214, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar113, pVar114, (i213 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                                            a(pVar114, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar112, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                    a(pVar112, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO9 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f19 = f10039h;
                        boolean z1115 = z15;
                        androidx.compose.ui.n nVarJ9 = SizeKt.J(nVarO9, f19, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI9 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK9 = BoxKt.k(cVarI9, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar17 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection9 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var9 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        aVarA = companion9.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF9 = LayoutKt.f(nVarJ9);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB9 = Updater.b(pVarF);
                        Updater.j(pVarB9, i0VarK9, companion9.d());
                        Updater.j(pVarB9, eVar17, companion9.b());
                        Updater.j(pVarB9, layoutDirection9, companion9.c());
                        Updater.j(pVarB9, d2Var9, companion9.f());
                        pVarF.x();
                        qVarF9.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF9 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar18 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE9 = eVar18.e1(f19);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE9 - eVar18.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var9 = kotlin.b2.f124493a;
                        b1.f fVarD9 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD9) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource9 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar112, int i211) {
                                if ((i211 & 11) == 2 && pVar112.b()) {
                                    pVar112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i211, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource9, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar112, 0, 7)), pVar112, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                a(pVar112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar112, int i211) {
                                if ((i211 & 11) == 2 && pVar112.b()) {
                                    pVar112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i211, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar112, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF9), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar112, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                a(pVar112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB10, aVarB, z14, c(m2VarF9), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z1115;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar3;
                        z17 = z14;
                        pVar4 = pVar112;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar8 = nVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar113, int i211) {
                            NavigationRailKt.b(z10, onClick, icon, nVar8, z16, pVar4, z17, x0Var2, gVar4, pVar113, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar113, Integer num) {
                            a(pVar113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= 100663296;
                gVar2 = gVar;
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var12 = x0VarA;
                    final int i211 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar3;
                    final boolean z1116 = z14;
                    androidx.compose.runtime.internal.a aVarB11 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i212) {
                            if ((i212 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i212, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var13 = x0Var12;
                            boolean z1117 = z10;
                            int i213 = i211;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var13.b(z1117, pVar114, ((i213 >> 18) & 112) | (i213 & 14));
                            androidx.compose.ui.n nVarA = pVar113 != null && (z1116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar115 = icon;
                            int i214 = i211;
                            pVar114.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK10 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar114, 0);
                            pVar114.T(-1323940314);
                            s1.e eVar19 = (s1.e) pVar114.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection10 = (LayoutDirection) pVar114.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var10 = (androidx.compose.ui.platform.d2) pVar114.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion10.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF10 = LayoutKt.f(nVarA);
                            if (!(pVar114.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar114.h();
                            if (pVar114.getInserting()) {
                                pVar114.L(aVarA2);
                            } else {
                                pVar114.d();
                            }
                            pVar114.Y();
                            androidx.compose.runtime.p pVarB10 = Updater.b(pVar114);
                            Updater.j(pVarB10, i0VarK10, companion10.d());
                            Updater.j(pVarB10, eVar19, companion10.b());
                            Updater.j(pVarB10, layoutDirection10, companion10.c());
                            Updater.j(pVarB10, d2Var10, companion10.f());
                            pVar114.x();
                            qVarF10.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar114)), pVar114, 0);
                            pVar114.T(2058660585);
                            pVar114.T(-2137368960);
                            BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.f5954a;
                            pVar114.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar115, pVar114, ((i214 >> 3) & 112) | 8);
                            pVar114.c0();
                            pVar114.c0();
                            pVar114.c0();
                            pVar114.f();
                            pVar114.c0();
                            pVar114.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                            a(pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar114, int i212) {
                                if ((i212 & 11) == 2 && pVar114.b()) {
                                    pVar114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i212, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar114, 6), t0.h0.f139820a.z());
                                x0 x0Var13 = x0VarA;
                                boolean z1117 = z10;
                                int i213 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var13.c(z1117, pVar114, ((i213 >> 18) & 112) | (i213 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar3;
                                final int i214 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar114, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar116, int i215) {
                                        if ((i215 & 11) == 2 && pVar116.b()) {
                                            pVar116.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i215, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar115, pVar116, (i214 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                                        a(pVar116, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar114, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                                a(pVar114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO10 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f110 = f10039h;
                    boolean z1117 = z15;
                    androidx.compose.ui.n nVarJ10 = SizeKt.J(nVarO10, f110, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI10 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK10 = BoxKt.k(cVarI10, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar19 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection10 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var10 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    aVarA = companion10.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF10 = LayoutKt.f(nVarJ10);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB10 = Updater.b(pVarF);
                    Updater.j(pVarB10, i0VarK10, companion10.d());
                    Updater.j(pVarB10, eVar19, companion10.b());
                    Updater.j(pVarB10, layoutDirection10, companion10.c());
                    Updater.j(pVarB10, d2Var10, companion10.f());
                    pVarF.x();
                    qVarF10.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF10 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE10 = eVar110.e1(f110);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE10 - eVar110.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var10 = kotlin.b2.f124493a;
                    b1.f fVarD10 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD10) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource10 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i212) {
                            if ((i212 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i212, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource10, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar114, 0, 7)), pVar114, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                            a(pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i212) {
                            if ((i212 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i212, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar114, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF10), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar114, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar114, Integer num) {
                            a(pVar114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB11, aVarB, z14, c(m2VarF10), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z1117;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar3;
                    z17 = z14;
                    pVar4 = pVar114;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var13 = x0VarA;
                    final int i212 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar3;
                    final boolean z1118 = z14;
                    androidx.compose.runtime.internal.a aVarB12 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar116, int i213) {
                            if ((i213 & 11) == 2 && pVar116.b()) {
                                pVar116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i213, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var14 = x0Var13;
                            boolean z1119 = z10;
                            int i214 = i212;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var14.b(z1119, pVar116, ((i214 >> 18) & 112) | (i214 & 14));
                            androidx.compose.ui.n nVarA = pVar115 != null && (z1118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar117 = icon;
                            int i215 = i212;
                            pVar116.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK11 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar116, 0);
                            pVar116.T(-1323940314);
                            s1.e eVar111 = (s1.e) pVar116.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection11 = (LayoutDirection) pVar116.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var11 = (androidx.compose.ui.platform.d2) pVar116.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion11.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF11 = LayoutKt.f(nVarA);
                            if (!(pVar116.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar116.h();
                            if (pVar116.getInserting()) {
                                pVar116.L(aVarA2);
                            } else {
                                pVar116.d();
                            }
                            pVar116.Y();
                            androidx.compose.runtime.p pVarB11 = Updater.b(pVar116);
                            Updater.j(pVarB11, i0VarK11, companion11.d());
                            Updater.j(pVarB11, eVar111, companion11.b());
                            Updater.j(pVarB11, layoutDirection11, companion11.c());
                            Updater.j(pVarB11, d2Var11, companion11.f());
                            pVar116.x();
                            qVarF11.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar116)), pVar116, 0);
                            pVar116.T(2058660585);
                            pVar116.T(-2137368960);
                            BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.f5954a;
                            pVar116.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar117, pVar116, ((i215 >> 3) & 112) | 8);
                            pVar116.c0();
                            pVar116.c0();
                            pVar116.c0();
                            pVar116.f();
                            pVar116.c0();
                            pVar116.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                            a(pVar116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar116, int i213) {
                                if ((i213 & 11) == 2 && pVar116.b()) {
                                    pVar116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i213, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar116, 6), t0.h0.f139820a.z());
                                x0 x0Var14 = x0VarA;
                                boolean z1119 = z10;
                                int i214 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var14.c(z1119, pVar116, ((i214 >> 18) & 112) | (i214 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar3;
                                final int i215 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar116, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar118, int i216) {
                                        if ((i216 & 11) == 2 && pVar118.b()) {
                                            pVar118.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i216, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar117, pVar118, (i215 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                                        a(pVar118, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar116, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                                a(pVar116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO11 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f111 = f10039h;
                    boolean z1119 = z15;
                    androidx.compose.ui.n nVarJ11 = SizeKt.J(nVarO11, f111, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI11 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK11 = BoxKt.k(cVarI11, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection11 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var11 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    aVarA = companion11.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF11 = LayoutKt.f(nVarJ11);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB11 = Updater.b(pVarF);
                    Updater.j(pVarB11, i0VarK11, companion11.d());
                    Updater.j(pVarB11, eVar111, companion11.b());
                    Updater.j(pVarB11, layoutDirection11, companion11.c());
                    Updater.j(pVarB11, d2Var11, companion11.f());
                    pVarF.x();
                    qVarF11.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF11 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE11 = eVar112.e1(f111);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE11 - eVar112.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var11 = kotlin.b2.f124493a;
                    b1.f fVarD11 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD11) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource11 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar116, int i213) {
                            if ((i213 & 11) == 2 && pVar116.b()) {
                                pVar116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i213, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource11, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar116, 0, 7)), pVar116, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                            a(pVar116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar116, int i213) {
                            if ((i213 & 11) == 2 && pVar116.b()) {
                                pVar116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i213, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar116, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF11), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar116, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar116, Integer num) {
                            a(pVar116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB12, aVarB, z14, c(m2VarF11), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z1119;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar3;
                    z17 = z14;
                    pVar4 = pVar116;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar9 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar117, int i213) {
                        NavigationRailKt.b(z10, onClick, icon, nVar9, z16, pVar4, z17, x0Var2, gVar4, pVar117, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar117, Integer num) {
                        a(pVar117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    gVar2 = gVar;
                    if (pVarF.s(gVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var14 = x0VarA;
                    final int i213 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar3;
                    final boolean z11110 = z14;
                    androidx.compose.runtime.internal.a aVarB13 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar118, int i214) {
                            if ((i214 & 11) == 2 && pVar118.b()) {
                                pVar118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i214, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var15 = x0Var14;
                            boolean z11111 = z10;
                            int i215 = i213;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var15.b(z11111, pVar118, ((i215 >> 18) & 112) | (i215 & 14));
                            androidx.compose.ui.n nVarA = pVar117 != null && (z11110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar119 = icon;
                            int i216 = i213;
                            pVar118.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK12 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar118, 0);
                            pVar118.T(-1323940314);
                            s1.e eVar113 = (s1.e) pVar118.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection12 = (LayoutDirection) pVar118.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var12 = (androidx.compose.ui.platform.d2) pVar118.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion12.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF12 = LayoutKt.f(nVarA);
                            if (!(pVar118.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar118.h();
                            if (pVar118.getInserting()) {
                                pVar118.L(aVarA2);
                            } else {
                                pVar118.d();
                            }
                            pVar118.Y();
                            androidx.compose.runtime.p pVarB12 = Updater.b(pVar118);
                            Updater.j(pVarB12, i0VarK12, companion12.d());
                            Updater.j(pVarB12, eVar113, companion12.b());
                            Updater.j(pVarB12, layoutDirection12, companion12.c());
                            Updater.j(pVarB12, d2Var12, companion12.f());
                            pVar118.x();
                            qVarF12.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar118)), pVar118, 0);
                            pVar118.T(2058660585);
                            pVar118.T(-2137368960);
                            BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.f5954a;
                            pVar118.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar119, pVar118, ((i216 >> 3) & 112) | 8);
                            pVar118.c0();
                            pVar118.c0();
                            pVar118.c0();
                            pVar118.f();
                            pVar118.c0();
                            pVar118.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                            a(pVar118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar118, int i214) {
                                if ((i214 & 11) == 2 && pVar118.b()) {
                                    pVar118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i214, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar118, 6), t0.h0.f139820a.z());
                                x0 x0Var15 = x0VarA;
                                boolean z11111 = z10;
                                int i215 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var15.c(z11111, pVar118, ((i215 >> 18) & 112) | (i215 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar3;
                                final int i216 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar118, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i217) {
                                        if ((i217 & 11) == 2 && pVar1110.b()) {
                                            pVar1110.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i217, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar119, pVar1110, (i216 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                                        a(pVar1110, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar118, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                                a(pVar118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO12 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f112 = f10039h;
                    boolean z11111 = z15;
                    androidx.compose.ui.n nVarJ12 = SizeKt.J(nVarO12, f112, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI12 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK12 = BoxKt.k(cVarI12, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection12 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var12 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    aVarA = companion12.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF12 = LayoutKt.f(nVarJ12);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB12 = Updater.b(pVarF);
                    Updater.j(pVarB12, i0VarK12, companion12.d());
                    Updater.j(pVarB12, eVar113, companion12.b());
                    Updater.j(pVarB12, layoutDirection12, companion12.c());
                    Updater.j(pVarB12, d2Var12, companion12.f());
                    pVarF.x();
                    qVarF12.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF12 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE12 = eVar114.e1(f112);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE12 - eVar114.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var12 = kotlin.b2.f124493a;
                    b1.f fVarD12 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD12) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource12 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar118, int i214) {
                            if ((i214 & 11) == 2 && pVar118.b()) {
                                pVar118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i214, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource12, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar118, 0, 7)), pVar118, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                            a(pVar118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar118, int i214) {
                            if ((i214 & 11) == 2 && pVar118.b()) {
                                pVar118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i214, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar118, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF12), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar118, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar118, Integer num) {
                            a(pVar118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB13, aVarB, z14, c(m2VarF12), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z11111;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar3;
                    z17 = z14;
                    pVar4 = pVar118;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var15 = x0VarA;
                    final int i214 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar3;
                    final boolean z11112 = z14;
                    androidx.compose.runtime.internal.a aVarB14 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i215) {
                            if ((i215 & 11) == 2 && pVar1110.b()) {
                                pVar1110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i215, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var16 = x0Var15;
                            boolean z11113 = z10;
                            int i216 = i214;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var16.b(z11113, pVar1110, ((i216 >> 18) & 112) | (i216 & 14));
                            androidx.compose.ui.n nVarA = pVar119 != null && (z11112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111 = icon;
                            int i217 = i214;
                            pVar1110.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK13 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1110, 0);
                            pVar1110.T(-1323940314);
                            s1.e eVar115 = (s1.e) pVar1110.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection13 = (LayoutDirection) pVar1110.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var13 = (androidx.compose.ui.platform.d2) pVar1110.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion13.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF13 = LayoutKt.f(nVarA);
                            if (!(pVar1110.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar1110.h();
                            if (pVar1110.getInserting()) {
                                pVar1110.L(aVarA2);
                            } else {
                                pVar1110.d();
                            }
                            pVar1110.Y();
                            androidx.compose.runtime.p pVarB13 = Updater.b(pVar1110);
                            Updater.j(pVarB13, i0VarK13, companion13.d());
                            Updater.j(pVarB13, eVar115, companion13.b());
                            Updater.j(pVarB13, layoutDirection13, companion13.c());
                            Updater.j(pVarB13, d2Var13, companion13.f());
                            pVar1110.x();
                            qVarF13.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1110)), pVar1110, 0);
                            pVar1110.T(2058660585);
                            pVar1110.T(-2137368960);
                            BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.f5954a;
                            pVar1110.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1111, pVar1110, ((i217 >> 3) & 112) | 8);
                            pVar1110.c0();
                            pVar1110.c0();
                            pVar1110.c0();
                            pVar1110.f();
                            pVar1110.c0();
                            pVar1110.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                            a(pVar1110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i215) {
                                if ((i215 & 11) == 2 && pVar1110.b()) {
                                    pVar1110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i215, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1110, 6), t0.h0.f139820a.z());
                                x0 x0Var16 = x0VarA;
                                boolean z11113 = z10;
                                int i216 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var16.c(z11113, pVar1110, ((i216 >> 18) & 112) | (i216 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar3;
                                final int i217 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1110, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i218) {
                                        if ((i218 & 11) == 2 && pVar1112.b()) {
                                            pVar1112.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i218, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar1111, pVar1112, (i217 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                                        a(pVar1112, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar1110, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                                a(pVar1110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO13 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f113 = f10039h;
                    boolean z11113 = z15;
                    androidx.compose.ui.n nVarJ13 = SizeKt.J(nVarO13, f113, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI13 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK13 = BoxKt.k(cVarI13, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection13 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var13 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    aVarA = companion13.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF13 = LayoutKt.f(nVarJ13);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB13 = Updater.b(pVarF);
                    Updater.j(pVarB13, i0VarK13, companion13.d());
                    Updater.j(pVarB13, eVar115, companion13.b());
                    Updater.j(pVarB13, layoutDirection13, companion13.c());
                    Updater.j(pVarB13, d2Var13, companion13.f());
                    pVarF.x();
                    qVarF13.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF13 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE13 = eVar116.e1(f113);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE13 - eVar116.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var13 = kotlin.b2.f124493a;
                    b1.f fVarD13 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD13) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource13 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i215) {
                            if ((i215 & 11) == 2 && pVar1110.b()) {
                                pVar1110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i215, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource13, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1110, 0, 7)), pVar1110, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                            a(pVar1110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i215) {
                            if ((i215 & 11) == 2 && pVar1110.b()) {
                                pVar1110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i215, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1110, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF13), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1110, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1110, Integer num) {
                            a(pVar1110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB14, aVarB, z14, c(m2VarF13), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z11113;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar3;
                    z17 = z14;
                    pVar4 = pVar1110;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar10 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar1111, int i215) {
                        NavigationRailKt.b(z10, onClick, icon, nVar10, z16, pVar4, z17, x0Var2, gVar4, pVar1111, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111, Integer num) {
                        a(pVar1111, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 100663296;
            gVar2 = gVar;
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var16 = x0VarA;
                final int i215 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar3;
                final boolean z11114 = z14;
                androidx.compose.runtime.internal.a aVarB15 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i216) {
                        if ((i216 & 11) == 2 && pVar1112.b()) {
                            pVar1112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i216, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var17 = x0Var16;
                        boolean z11115 = z10;
                        int i217 = i215;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var17.b(z11115, pVar1112, ((i217 >> 18) & 112) | (i217 & 14));
                        androidx.compose.ui.n nVarA = pVar1111 != null && (z11114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1113 = icon;
                        int i218 = i215;
                        pVar1112.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK14 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1112, 0);
                        pVar1112.T(-1323940314);
                        s1.e eVar117 = (s1.e) pVar1112.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection14 = (LayoutDirection) pVar1112.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var14 = (androidx.compose.ui.platform.d2) pVar1112.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion14.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF14 = LayoutKt.f(nVarA);
                        if (!(pVar1112.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar1112.h();
                        if (pVar1112.getInserting()) {
                            pVar1112.L(aVarA2);
                        } else {
                            pVar1112.d();
                        }
                        pVar1112.Y();
                        androidx.compose.runtime.p pVarB14 = Updater.b(pVar1112);
                        Updater.j(pVarB14, i0VarK14, companion14.d());
                        Updater.j(pVarB14, eVar117, companion14.b());
                        Updater.j(pVarB14, layoutDirection14, companion14.c());
                        Updater.j(pVarB14, d2Var14, companion14.f());
                        pVar1112.x();
                        qVarF14.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1112)), pVar1112, 0);
                        pVar1112.T(2058660585);
                        pVar1112.T(-2137368960);
                        BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.f5954a;
                        pVar1112.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1113, pVar1112, ((i218 >> 3) & 112) | 8);
                        pVar1112.c0();
                        pVar1112.c0();
                        pVar1112.c0();
                        pVar1112.f();
                        pVar1112.c0();
                        pVar1112.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                        a(pVar1112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i216) {
                            if ((i216 & 11) == 2 && pVar1112.b()) {
                                pVar1112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i216, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1112, 6), t0.h0.f139820a.z());
                            x0 x0Var17 = x0VarA;
                            boolean z11115 = z10;
                            int i217 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var17.c(z11115, pVar1112, ((i217 >> 18) & 112) | (i217 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar3;
                            final int i218 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1112, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i219) {
                                    if ((i219 & 11) == 2 && pVar1114.b()) {
                                        pVar1114.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i219, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar1113, pVar1114, (i218 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                                    a(pVar1114, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1112, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                            a(pVar1112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO14 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f114 = f10039h;
                boolean z11115 = z15;
                androidx.compose.ui.n nVarJ14 = SizeKt.J(nVarO14, f114, 0.0f, 2, null);
                androidx.compose.ui.c cVarI14 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK14 = BoxKt.k(cVarI14, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection14 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var14 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                aVarA = companion14.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF14 = LayoutKt.f(nVarJ14);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB14 = Updater.b(pVarF);
                Updater.j(pVarB14, i0VarK14, companion14.d());
                Updater.j(pVarB14, eVar117, companion14.b());
                Updater.j(pVarB14, layoutDirection14, companion14.c());
                Updater.j(pVarB14, d2Var14, companion14.f());
                pVarF.x();
                qVarF14.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF14 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE14 = eVar118.e1(f114);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE14 - eVar118.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var14 = kotlin.b2.f124493a;
                b1.f fVarD14 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD14) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource14 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i216) {
                        if ((i216 & 11) == 2 && pVar1112.b()) {
                            pVar1112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i216, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource14, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1112, 0, 7)), pVar1112, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                        a(pVar1112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i216) {
                        if ((i216 & 11) == 2 && pVar1112.b()) {
                            pVar1112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i216, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1112, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF14), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1112, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1112, Integer num) {
                        a(pVar1112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB15, aVarB, z14, c(m2VarF14), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z11115;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar3;
                z17 = z14;
                pVar4 = pVar1112;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var17 = x0VarA;
                final int i216 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar3;
                final boolean z11116 = z14;
                androidx.compose.runtime.internal.a aVarB16 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i217) {
                        if ((i217 & 11) == 2 && pVar1114.b()) {
                            pVar1114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i217, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var18 = x0Var17;
                        boolean z11117 = z10;
                        int i218 = i216;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var18.b(z11117, pVar1114, ((i218 >> 18) & 112) | (i218 & 14));
                        androidx.compose.ui.n nVarA = pVar1113 != null && (z11116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1115 = icon;
                        int i219 = i216;
                        pVar1114.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK15 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1114, 0);
                        pVar1114.T(-1323940314);
                        s1.e eVar119 = (s1.e) pVar1114.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection15 = (LayoutDirection) pVar1114.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var15 = (androidx.compose.ui.platform.d2) pVar1114.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion15.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF15 = LayoutKt.f(nVarA);
                        if (!(pVar1114.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar1114.h();
                        if (pVar1114.getInserting()) {
                            pVar1114.L(aVarA2);
                        } else {
                            pVar1114.d();
                        }
                        pVar1114.Y();
                        androidx.compose.runtime.p pVarB15 = Updater.b(pVar1114);
                        Updater.j(pVarB15, i0VarK15, companion15.d());
                        Updater.j(pVarB15, eVar119, companion15.b());
                        Updater.j(pVarB15, layoutDirection15, companion15.c());
                        Updater.j(pVarB15, d2Var15, companion15.f());
                        pVar1114.x();
                        qVarF15.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1114)), pVar1114, 0);
                        pVar1114.T(2058660585);
                        pVar1114.T(-2137368960);
                        BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.f5954a;
                        pVar1114.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1115, pVar1114, ((i219 >> 3) & 112) | 8);
                        pVar1114.c0();
                        pVar1114.c0();
                        pVar1114.c0();
                        pVar1114.f();
                        pVar1114.c0();
                        pVar1114.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                        a(pVar1114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i217) {
                            if ((i217 & 11) == 2 && pVar1114.b()) {
                                pVar1114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i217, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1114, 6), t0.h0.f139820a.z());
                            x0 x0Var18 = x0VarA;
                            boolean z11117 = z10;
                            int i218 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var18.c(z11117, pVar1114, ((i218 >> 18) & 112) | (i218 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar3;
                            final int i219 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1114, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i2110) {
                                    if ((i2110 & 11) == 2 && pVar1116.b()) {
                                        pVar1116.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i2110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar1115, pVar1116, (i219 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                    a(pVar1116, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1114, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                            a(pVar1114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO15 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f115 = f10039h;
                boolean z11117 = z15;
                androidx.compose.ui.n nVarJ15 = SizeKt.J(nVarO15, f115, 0.0f, 2, null);
                androidx.compose.ui.c cVarI15 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK15 = BoxKt.k(cVarI15, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection15 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var15 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                aVarA = companion15.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF15 = LayoutKt.f(nVarJ15);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB15 = Updater.b(pVarF);
                Updater.j(pVarB15, i0VarK15, companion15.d());
                Updater.j(pVarB15, eVar119, companion15.b());
                Updater.j(pVarB15, layoutDirection15, companion15.c());
                Updater.j(pVarB15, d2Var15, companion15.f());
                pVarF.x();
                qVarF15.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF15 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar1110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE15 = eVar1110.e1(f115);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE15 - eVar1110.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var15 = kotlin.b2.f124493a;
                b1.f fVarD15 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD15) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource15 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i217) {
                        if ((i217 & 11) == 2 && pVar1114.b()) {
                            pVar1114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i217, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource15, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1114, 0, 7)), pVar1114, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                        a(pVar1114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i217) {
                        if ((i217 & 11) == 2 && pVar1114.b()) {
                            pVar1114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i217, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1114, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF15), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1114, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1114, Integer num) {
                        a(pVar1114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB16, aVarB, z14, c(m2VarF15), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z11117;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar3;
                z17 = z14;
                pVar4 = pVar1114;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar11 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1115, int i217) {
                    NavigationRailKt.b(z10, onClick, icon, nVar11, z16, pVar4, z17, x0Var2, gVar4, pVar1115, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1115, Integer num) {
                    a(pVar1115, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        nVar2 = nVar;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((i10 & 57344) == 0) {
                z13 = z11;
                if (pVarF.u(z13)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    if (pVarF.s(pVar)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    z14 = z12;
                } else {
                    z14 = z12;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.u(z14)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 234881024) == 0) {
                        gVar2 = gVar;
                        if (pVarF.s(gVar2)) {
                            i20 = 67108864;
                        } else {
                            i20 = 33554432;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 191739611) == 38347922) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var18 = x0VarA;
                        final int i217 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar3;
                        final boolean z11118 = z14;
                        androidx.compose.runtime.internal.a aVarB17 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i218) {
                                if ((i218 & 11) == 2 && pVar1116.b()) {
                                    pVar1116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i218, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var19 = x0Var18;
                                boolean z11119 = z10;
                                int i219 = i217;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var19.b(z11119, pVar1116, ((i219 >> 18) & 112) | (i219 & 14));
                                androidx.compose.ui.n nVarA = pVar1115 != null && (z11118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1117 = icon;
                                int i2110 = i217;
                                pVar1116.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK16 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1116, 0);
                                pVar1116.T(-1323940314);
                                s1.e eVar1111 = (s1.e) pVar1116.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection16 = (LayoutDirection) pVar1116.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var16 = (androidx.compose.ui.platform.d2) pVar1116.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion16.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF16 = LayoutKt.f(nVarA);
                                if (!(pVar1116.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar1116.h();
                                if (pVar1116.getInserting()) {
                                    pVar1116.L(aVarA2);
                                } else {
                                    pVar1116.d();
                                }
                                pVar1116.Y();
                                androidx.compose.runtime.p pVarB16 = Updater.b(pVar1116);
                                Updater.j(pVarB16, i0VarK16, companion16.d());
                                Updater.j(pVarB16, eVar1111, companion16.b());
                                Updater.j(pVarB16, layoutDirection16, companion16.c());
                                Updater.j(pVarB16, d2Var16, companion16.f());
                                pVar1116.x();
                                qVarF16.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1116)), pVar1116, 0);
                                pVar1116.T(2058660585);
                                pVar1116.T(-2137368960);
                                BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.f5954a;
                                pVar1116.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1117, pVar1116, ((i2110 >> 3) & 112) | 8);
                                pVar1116.c0();
                                pVar1116.c0();
                                pVar1116.c0();
                                pVar1116.f();
                                pVar1116.c0();
                                pVar1116.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                a(pVar1116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i218) {
                                    if ((i218 & 11) == 2 && pVar1116.b()) {
                                        pVar1116.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i218, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1116, 6), t0.h0.f139820a.z());
                                    x0 x0Var19 = x0VarA;
                                    boolean z11119 = z10;
                                    int i219 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var19.c(z11119, pVar1116, ((i219 >> 18) & 112) | (i219 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar3;
                                    final int i2110 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1116, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar1118, int i2111) {
                                            if ((i2111 & 11) == 2 && pVar1118.b()) {
                                                pVar1118.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i2111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar1117, pVar1118, (i2110 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1118, Integer num) {
                                            a(pVar1118, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar1116, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                    a(pVar1116, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO16 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f116 = f10039h;
                        boolean z11119 = z15;
                        androidx.compose.ui.n nVarJ16 = SizeKt.J(nVarO16, f116, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI16 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK16 = BoxKt.k(cVarI16, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar1111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection16 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var16 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                        aVarA = companion16.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF16 = LayoutKt.f(nVarJ16);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB16 = Updater.b(pVarF);
                        Updater.j(pVarB16, i0VarK16, companion16.d());
                        Updater.j(pVarB16, eVar1111, companion16.b());
                        Updater.j(pVarB16, layoutDirection16, companion16.c());
                        Updater.j(pVarB16, d2Var16, companion16.f());
                        pVarF.x();
                        qVarF16.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance16 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF16 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar1112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE16 = eVar1112.e1(f116);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE16 - eVar1112.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var16 = kotlin.b2.f124493a;
                        b1.f fVarD16 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD16) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource16 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i218) {
                                if ((i218 & 11) == 2 && pVar1116.b()) {
                                    pVar1116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i218, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource16, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1116, 0, 7)), pVar1116, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                a(pVar1116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i218) {
                                if ((i218 & 11) == 2 && pVar1116.b()) {
                                    pVar1116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i218, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1116, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF16), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1116, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1116, Integer num) {
                                a(pVar1116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB17, aVarB, z14, c(m2VarF16), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z11119;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1116 = pVar3;
                        z17 = z14;
                        pVar4 = pVar1116;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z13;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            } else {
                                pVar3 = pVar;
                            }
                            if (i17 != 0) {
                                z14 = true;
                            }
                            if ((i11 & 128) != 0) {
                                x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -29360129;
                            } else {
                                x0VarA = x0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                gVar3 = (androidx.compose.foundation.interaction.g) objU;
                            } else {
                                gVar3 = gVar;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                        }
                        final x0 x0Var19 = x0VarA;
                        final int i218 = i12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1117 = pVar3;
                        final boolean z111110 = z14;
                        androidx.compose.runtime.internal.a aVarB18 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1118, int i219) {
                                if ((i219 & 11) == 2 && pVar1118.b()) {
                                    pVar1118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1023357515, i219, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                                }
                                x0 x0Var110 = x0Var19;
                                boolean z111111 = z10;
                                int i2110 = i218;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var110.b(z111111, pVar1118, ((i2110 >> 18) & 112) | (i2110 & 14));
                                androidx.compose.ui.n nVarA = pVar1117 != null && (z111110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                    public final void a(@dl.d r clearAndSetSemantics) {
                                        kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                        a(rVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }) : androidx.compose.ui.n.INSTANCE;
                                yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1119 = icon;
                                int i2111 = i218;
                                pVar1118.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK17 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1118, 0);
                                pVar1118.T(-1323940314);
                                s1.e eVar1113 = (s1.e) pVar1118.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection17 = (LayoutDirection) pVar1118.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var17 = (androidx.compose.ui.platform.d2) pVar1118.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion17.a();
                                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF17 = LayoutKt.f(nVarA);
                                if (!(pVar1118.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVar1118.h();
                                if (pVar1118.getInserting()) {
                                    pVar1118.L(aVarA2);
                                } else {
                                    pVar1118.d();
                                }
                                pVar1118.Y();
                                androidx.compose.runtime.p pVarB17 = Updater.b(pVar1118);
                                Updater.j(pVarB17, i0VarK17, companion17.d());
                                Updater.j(pVarB17, eVar1113, companion17.b());
                                Updater.j(pVarB17, layoutDirection17, companion17.c());
                                Updater.j(pVarB17, d2Var17, companion17.f());
                                pVar1118.x();
                                qVarF17.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1118)), pVar1118, 0);
                                pVar1118.T(2058660585);
                                pVar1118.T(-2137368960);
                                BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.f5954a;
                                pVar1118.T(-1892243397);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1119, pVar1118, ((i2111 >> 3) & 112) | 8);
                                pVar1118.c0();
                                pVar1118.c0();
                                pVar1118.c0();
                                pVar1118.f();
                                pVar1118.c0();
                                pVar1118.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1118, Integer num) {
                                a(pVar1118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                        if (pVar3 != null) {
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                    return m2Var.getValue().M();
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1118, int i219) {
                                    if ((i219 & 11) == 2 && pVar1118.b()) {
                                        pVar1118.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-105269599, i219, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1118, 6), t0.h0.f139820a.z());
                                    x0 x0Var110 = x0VarA;
                                    boolean z111111 = z10;
                                    int i2110 = i12;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var110.c(z111111, pVar1118, ((i2110 >> 18) & 112) | (i2110 & 14)))))};
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar3;
                                    final int i2111 = i12;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1118, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i2112) {
                                            if ((i2112 & 11) == 2 && pVar11110.b()) {
                                                pVar11110.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-288191647, i2112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                            }
                                            TextKt.a(textStyleA, pVar1119, pVar11110, (i2111 >> 12) & 112);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                                            a(pVar11110, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }), pVar1118, 56);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1118, Integer num) {
                                    a(pVar1118, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            aVarB = null;
                        }
                        androidx.compose.ui.n nVarO17 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                        float f117 = f10039h;
                        boolean z111111 = z15;
                        androidx.compose.ui.n nVarJ17 = SizeKt.J(nVarO17, f117, 0.0f, 2, null);
                        androidx.compose.ui.c cVarI17 = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK17 = BoxKt.k(cVarI17, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar1113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection17 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        nVar3 = nVar2;
                        androidx.compose.ui.platform.d2 d2Var17 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        aVarA = companion17.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF17 = LayoutKt.f(nVarJ17);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.getInserting()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB17 = Updater.b(pVarF);
                        Updater.j(pVarB17, i0VarK17, companion17.d());
                        Updater.j(pVarB17, eVar1113, companion17.b());
                        Updater.j(pVarB17, layoutDirection17, companion17.c());
                        Updater.j(pVarB17, d2Var17, companion17.f());
                        pVarF.x();
                        qVarF17.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance17 = BoxScopeInstance.f5954a;
                        pVarF.T(752355157);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2<Float> m2VarF17 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar1114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        int iE17 = eVar1114.e1(f117);
                        h0Var = t0.h0.f139820a;
                        jA = b1.g.a((iE17 - eVar1114.e1(h0Var.i())) / 2, 0.0f);
                        kotlin.b2 b2Var17 = kotlin.b2.f124493a;
                        b1.f fVarD17 = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS = pVarF.s(fVarD17) | pVarF.s(gVar3);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource17 = (MappedInteractionSource) objU2;
                        if (pVar3 != null) {
                            pVarF.T(1104516937);
                            g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                            pVarF.c0();
                        } else {
                            pVarF.T(1104517018);
                            g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                            pVarF.c0();
                        }
                        d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1118, int i219) {
                                if ((i219 & 11) == 2 && pVar1118.b()) {
                                    pVar1118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(211026382, i219, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource17, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1118, 0, 7)), pVar1118, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1118, Integer num) {
                                a(pVar1118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1118, int i219) {
                                if ((i219 & 11) == 2 && pVar1118.b()) {
                                    pVar1118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1862011490, i219, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1118, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF17), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1118, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1118, Integer num) {
                                a(pVar1118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB18, aVarB, z14, c(m2VarF17), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        x0Var2 = x0VarA;
                        z16 = z111111;
                        gVar4 = gVar3;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1118 = pVar3;
                        z17 = z14;
                        pVar4 = pVar1118;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar12 = nVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar1119, int i219) {
                            NavigationRailKt.b(z10, onClick, icon, nVar12, z16, pVar4, z17, x0Var2, gVar4, pVar1119, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1119, Integer num) {
                            a(pVar1119, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= 100663296;
                gVar2 = gVar;
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var110 = x0VarA;
                    final int i219 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1119 = pVar3;
                    final boolean z111112 = z14;
                    androidx.compose.runtime.internal.a aVarB19 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i2110) {
                            if ((i2110 & 11) == 2 && pVar11110.b()) {
                                pVar11110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i2110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var111 = x0Var110;
                            boolean z111113 = z10;
                            int i2111 = i219;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var111.b(z111113, pVar11110, ((i2111 >> 18) & 112) | (i2111 & 14));
                            androidx.compose.ui.n nVarA = pVar1119 != null && (z111112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11111 = icon;
                            int i2112 = i219;
                            pVar11110.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK18 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar11110, 0);
                            pVar11110.T(-1323940314);
                            s1.e eVar1115 = (s1.e) pVar11110.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection18 = (LayoutDirection) pVar11110.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var18 = (androidx.compose.ui.platform.d2) pVar11110.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion18.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF18 = LayoutKt.f(nVarA);
                            if (!(pVar11110.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar11110.h();
                            if (pVar11110.getInserting()) {
                                pVar11110.L(aVarA2);
                            } else {
                                pVar11110.d();
                            }
                            pVar11110.Y();
                            androidx.compose.runtime.p pVarB18 = Updater.b(pVar11110);
                            Updater.j(pVarB18, i0VarK18, companion18.d());
                            Updater.j(pVarB18, eVar1115, companion18.b());
                            Updater.j(pVarB18, layoutDirection18, companion18.c());
                            Updater.j(pVarB18, d2Var18, companion18.f());
                            pVar11110.x();
                            qVarF18.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar11110)), pVar11110, 0);
                            pVar11110.T(2058660585);
                            pVar11110.T(-2137368960);
                            BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.f5954a;
                            pVar11110.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11111, pVar11110, ((i2112 >> 3) & 112) | 8);
                            pVar11110.c0();
                            pVar11110.c0();
                            pVar11110.c0();
                            pVar11110.f();
                            pVar11110.c0();
                            pVar11110.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                            a(pVar11110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i2110) {
                                if ((i2110 & 11) == 2 && pVar11110.b()) {
                                    pVar11110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i2110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar11110, 6), t0.h0.f139820a.z());
                                x0 x0Var111 = x0VarA;
                                boolean z111113 = z10;
                                int i2111 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var111.c(z111113, pVar11110, ((i2111 >> 18) & 112) | (i2111 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = pVar3;
                                final int i2112 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11110, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11112, int i2113) {
                                        if ((i2113 & 11) == 2 && pVar11112.b()) {
                                            pVar11112.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i2113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar11111, pVar11112, (i2112 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11112, Integer num) {
                                        a(pVar11112, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar11110, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                                a(pVar11110, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO18 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f118 = f10039h;
                    boolean z111113 = z15;
                    androidx.compose.ui.n nVarJ18 = SizeKt.J(nVarO18, f118, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI18 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK18 = BoxKt.k(cVarI18, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar1115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection18 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var18 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                    aVarA = companion18.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF18 = LayoutKt.f(nVarJ18);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB18 = Updater.b(pVarF);
                    Updater.j(pVarB18, i0VarK18, companion18.d());
                    Updater.j(pVarB18, eVar1115, companion18.b());
                    Updater.j(pVarB18, layoutDirection18, companion18.c());
                    Updater.j(pVarB18, d2Var18, companion18.f());
                    pVarF.x();
                    qVarF18.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance18 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF18 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar1116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE18 = eVar1116.e1(f118);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE18 - eVar1116.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var18 = kotlin.b2.f124493a;
                    b1.f fVarD18 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD18) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource18 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i2110) {
                            if ((i2110 & 11) == 2 && pVar11110.b()) {
                                pVar11110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i2110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource18, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar11110, 0, 7)), pVar11110, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                            a(pVar11110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11110, int i2110) {
                            if ((i2110 & 11) == 2 && pVar11110.b()) {
                                pVar11110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i2110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar11110, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF18), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar11110, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11110, Integer num) {
                            a(pVar11110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB19, aVarB, z14, c(m2VarF18), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z111113;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11110 = pVar3;
                    z17 = z14;
                    pVar4 = pVar11110;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var111 = x0VarA;
                    final int i2110 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11111 = pVar3;
                    final boolean z111114 = z14;
                    androidx.compose.runtime.internal.a aVarB110 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11112, int i2111) {
                            if ((i2111 & 11) == 2 && pVar11112.b()) {
                                pVar11112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i2111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var112 = x0Var111;
                            boolean z111115 = z10;
                            int i2112 = i2110;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var112.b(z111115, pVar11112, ((i2112 >> 18) & 112) | (i2112 & 14));
                            androidx.compose.ui.n nVarA = pVar11111 != null && (z111114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11113 = icon;
                            int i2113 = i2110;
                            pVar11112.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK19 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar11112, 0);
                            pVar11112.T(-1323940314);
                            s1.e eVar1117 = (s1.e) pVar11112.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection19 = (LayoutDirection) pVar11112.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var19 = (androidx.compose.ui.platform.d2) pVar11112.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion19.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF19 = LayoutKt.f(nVarA);
                            if (!(pVar11112.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar11112.h();
                            if (pVar11112.getInserting()) {
                                pVar11112.L(aVarA2);
                            } else {
                                pVar11112.d();
                            }
                            pVar11112.Y();
                            androidx.compose.runtime.p pVarB19 = Updater.b(pVar11112);
                            Updater.j(pVarB19, i0VarK19, companion19.d());
                            Updater.j(pVarB19, eVar1117, companion19.b());
                            Updater.j(pVarB19, layoutDirection19, companion19.c());
                            Updater.j(pVarB19, d2Var19, companion19.f());
                            pVar11112.x();
                            qVarF19.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar11112)), pVar11112, 0);
                            pVar11112.T(2058660585);
                            pVar11112.T(-2137368960);
                            BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.f5954a;
                            pVar11112.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11113, pVar11112, ((i2113 >> 3) & 112) | 8);
                            pVar11112.c0();
                            pVar11112.c0();
                            pVar11112.c0();
                            pVar11112.f();
                            pVar11112.c0();
                            pVar11112.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11112, Integer num) {
                            a(pVar11112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11112, int i2111) {
                                if ((i2111 & 11) == 2 && pVar11112.b()) {
                                    pVar11112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i2111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar11112, 6), t0.h0.f139820a.z());
                                x0 x0Var112 = x0VarA;
                                boolean z111115 = z10;
                                int i2112 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var112.c(z111115, pVar11112, ((i2112 >> 18) & 112) | (i2112 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11113 = pVar3;
                                final int i2113 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11112, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i2114) {
                                        if ((i2114 & 11) == 2 && pVar11114.b()) {
                                            pVar11114.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i2114, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar11113, pVar11114, (i2113 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                                        a(pVar11114, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar11112, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11112, Integer num) {
                                a(pVar11112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO19 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f119 = f10039h;
                    boolean z111115 = z15;
                    androidx.compose.ui.n nVarJ19 = SizeKt.J(nVarO19, f119, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI19 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK19 = BoxKt.k(cVarI19, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar1117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection19 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var19 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    aVarA = companion19.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF19 = LayoutKt.f(nVarJ19);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB19 = Updater.b(pVarF);
                    Updater.j(pVarB19, i0VarK19, companion19.d());
                    Updater.j(pVarB19, eVar1117, companion19.b());
                    Updater.j(pVarB19, layoutDirection19, companion19.c());
                    Updater.j(pVarB19, d2Var19, companion19.f());
                    pVarF.x();
                    qVarF19.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance19 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF19 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar1118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE19 = eVar1118.e1(f119);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE19 - eVar1118.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var19 = kotlin.b2.f124493a;
                    b1.f fVarD19 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD19) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource19 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11112, int i2111) {
                            if ((i2111 & 11) == 2 && pVar11112.b()) {
                                pVar11112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i2111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource19, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar11112, 0, 7)), pVar11112, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11112, Integer num) {
                            a(pVar11112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11112, int i2111) {
                            if ((i2111 & 11) == 2 && pVar11112.b()) {
                                pVar11112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i2111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar11112, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF19), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar11112, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11112, Integer num) {
                            a(pVar11112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB110, aVarB, z14, c(m2VarF19), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z111115;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11112 = pVar3;
                    z17 = z14;
                    pVar4 = pVar11112;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar13 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11113, int i2111) {
                        NavigationRailKt.b(z10, onClick, icon, nVar13, z16, pVar4, z17, x0Var2, gVar4, pVar11113, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11113, Integer num) {
                        a(pVar11113, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    gVar2 = gVar;
                    if (pVarF.s(gVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var112 = x0VarA;
                    final int i2111 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11113 = pVar3;
                    final boolean z111116 = z14;
                    androidx.compose.runtime.internal.a aVarB111 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i2112) {
                            if ((i2112 & 11) == 2 && pVar11114.b()) {
                                pVar11114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i2112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var113 = x0Var112;
                            boolean z111117 = z10;
                            int i2113 = i2111;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var113.b(z111117, pVar11114, ((i2113 >> 18) & 112) | (i2113 & 14));
                            androidx.compose.ui.n nVarA = pVar11113 != null && (z111116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11115 = icon;
                            int i2114 = i2111;
                            pVar11114.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK110 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar11114, 0);
                            pVar11114.T(-1323940314);
                            s1.e eVar1119 = (s1.e) pVar11114.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection110 = (LayoutDirection) pVar11114.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var110 = (androidx.compose.ui.platform.d2) pVar11114.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion110.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF110 = LayoutKt.f(nVarA);
                            if (!(pVar11114.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar11114.h();
                            if (pVar11114.getInserting()) {
                                pVar11114.L(aVarA2);
                            } else {
                                pVar11114.d();
                            }
                            pVar11114.Y();
                            androidx.compose.runtime.p pVarB110 = Updater.b(pVar11114);
                            Updater.j(pVarB110, i0VarK110, companion110.d());
                            Updater.j(pVarB110, eVar1119, companion110.b());
                            Updater.j(pVarB110, layoutDirection110, companion110.c());
                            Updater.j(pVarB110, d2Var110, companion110.f());
                            pVar11114.x();
                            qVarF110.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar11114)), pVar11114, 0);
                            pVar11114.T(2058660585);
                            pVar11114.T(-2137368960);
                            BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.f5954a;
                            pVar11114.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11115, pVar11114, ((i2114 >> 3) & 112) | 8);
                            pVar11114.c0();
                            pVar11114.c0();
                            pVar11114.c0();
                            pVar11114.f();
                            pVar11114.c0();
                            pVar11114.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                            a(pVar11114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i2112) {
                                if ((i2112 & 11) == 2 && pVar11114.b()) {
                                    pVar11114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i2112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar11114, 6), t0.h0.f139820a.z());
                                x0 x0Var113 = x0VarA;
                                boolean z111117 = z10;
                                int i2113 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var113.c(z111117, pVar11114, ((i2113 >> 18) & 112) | (i2113 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = pVar3;
                                final int i2114 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11114, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11116, int i2115) {
                                        if ((i2115 & 11) == 2 && pVar11116.b()) {
                                            pVar11116.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i2115, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar11115, pVar11116, (i2114 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11116, Integer num) {
                                        a(pVar11116, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar11114, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                                a(pVar11114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO110 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f1110 = f10039h;
                    boolean z111117 = z15;
                    androidx.compose.ui.n nVarJ110 = SizeKt.J(nVarO110, f1110, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI110 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK110 = BoxKt.k(cVarI110, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar1119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var110 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    aVarA = companion110.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF110 = LayoutKt.f(nVarJ110);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB110 = Updater.b(pVarF);
                    Updater.j(pVarB110, i0VarK110, companion110.d());
                    Updater.j(pVarB110, eVar1119, companion110.b());
                    Updater.j(pVarB110, layoutDirection110, companion110.c());
                    Updater.j(pVarB110, d2Var110, companion110.f());
                    pVarF.x();
                    qVarF110.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance110 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF110 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar11110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE110 = eVar11110.e1(f1110);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE110 - eVar11110.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var110 = kotlin.b2.f124493a;
                    b1.f fVarD110 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD110) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource110 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i2112) {
                            if ((i2112 & 11) == 2 && pVar11114.b()) {
                                pVar11114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i2112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource110, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar11114, 0, 7)), pVar11114, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                            a(pVar11114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11114, int i2112) {
                            if ((i2112 & 11) == 2 && pVar11114.b()) {
                                pVar11114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i2112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar11114, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF110), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar11114, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11114, Integer num) {
                            a(pVar11114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB111, aVarB, z14, c(m2VarF110), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z111117;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11114 = pVar3;
                    z17 = z14;
                    pVar4 = pVar11114;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var113 = x0VarA;
                    final int i2112 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11115 = pVar3;
                    final boolean z111118 = z14;
                    androidx.compose.runtime.internal.a aVarB112 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11116, int i2113) {
                            if ((i2113 & 11) == 2 && pVar11116.b()) {
                                pVar11116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i2113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var114 = x0Var113;
                            boolean z111119 = z10;
                            int i2114 = i2112;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var114.b(z111119, pVar11116, ((i2114 >> 18) & 112) | (i2114 & 14));
                            androidx.compose.ui.n nVarA = pVar11115 != null && (z111118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11117 = icon;
                            int i2115 = i2112;
                            pVar11116.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK111 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar11116, 0);
                            pVar11116.T(-1323940314);
                            s1.e eVar11111 = (s1.e) pVar11116.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection111 = (LayoutDirection) pVar11116.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var111 = (androidx.compose.ui.platform.d2) pVar11116.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion111.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF111 = LayoutKt.f(nVarA);
                            if (!(pVar11116.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar11116.h();
                            if (pVar11116.getInserting()) {
                                pVar11116.L(aVarA2);
                            } else {
                                pVar11116.d();
                            }
                            pVar11116.Y();
                            androidx.compose.runtime.p pVarB111 = Updater.b(pVar11116);
                            Updater.j(pVarB111, i0VarK111, companion111.d());
                            Updater.j(pVarB111, eVar11111, companion111.b());
                            Updater.j(pVarB111, layoutDirection111, companion111.c());
                            Updater.j(pVarB111, d2Var111, companion111.f());
                            pVar11116.x();
                            qVarF111.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar11116)), pVar11116, 0);
                            pVar11116.T(2058660585);
                            pVar11116.T(-2137368960);
                            BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.f5954a;
                            pVar11116.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11117, pVar11116, ((i2115 >> 3) & 112) | 8);
                            pVar11116.c0();
                            pVar11116.c0();
                            pVar11116.c0();
                            pVar11116.f();
                            pVar11116.c0();
                            pVar11116.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11116, Integer num) {
                            a(pVar11116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar11116, int i2113) {
                                if ((i2113 & 11) == 2 && pVar11116.b()) {
                                    pVar11116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i2113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar11116, 6), t0.h0.f139820a.z());
                                x0 x0Var114 = x0VarA;
                                boolean z111119 = z10;
                                int i2114 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var114.c(z111119, pVar11116, ((i2114 >> 18) & 112) | (i2114 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVar3;
                                final int i2115 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11116, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar11118, int i2116) {
                                        if ((i2116 & 11) == 2 && pVar11118.b()) {
                                            pVar11118.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i2116, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar11117, pVar11118, (i2115 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11118, Integer num) {
                                        a(pVar11118, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar11116, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11116, Integer num) {
                                a(pVar11116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO111 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f1111 = f10039h;
                    boolean z111119 = z15;
                    androidx.compose.ui.n nVarJ111 = SizeKt.J(nVarO111, f1111, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI111 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK111 = BoxKt.k(cVarI111, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar11111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var111 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    aVarA = companion111.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF111 = LayoutKt.f(nVarJ111);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111 = Updater.b(pVarF);
                    Updater.j(pVarB111, i0VarK111, companion111.d());
                    Updater.j(pVarB111, eVar11111, companion111.b());
                    Updater.j(pVarB111, layoutDirection111, companion111.c());
                    Updater.j(pVarB111, d2Var111, companion111.f());
                    pVarF.x();
                    qVarF111.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance111 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF111 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar11112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE111 = eVar11112.e1(f1111);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE111 - eVar11112.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var111 = kotlin.b2.f124493a;
                    b1.f fVarD111 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD111) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource111 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11116, int i2113) {
                            if ((i2113 & 11) == 2 && pVar11116.b()) {
                                pVar11116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i2113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource111, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar11116, 0, 7)), pVar11116, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11116, Integer num) {
                            a(pVar11116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11116, int i2113) {
                            if ((i2113 & 11) == 2 && pVar11116.b()) {
                                pVar11116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i2113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar11116, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF111), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar11116, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11116, Integer num) {
                            a(pVar11116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB112, aVarB, z14, c(m2VarF111), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z111119;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11116 = pVar3;
                    z17 = z14;
                    pVar4 = pVar11116;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar14 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11117, int i2113) {
                        NavigationRailKt.b(z10, onClick, icon, nVar14, z16, pVar4, z17, x0Var2, gVar4, pVar11117, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11117, Integer num) {
                        a(pVar11117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 100663296;
            gVar2 = gVar;
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var114 = x0VarA;
                final int i2113 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11117 = pVar3;
                final boolean z1111110 = z14;
                androidx.compose.runtime.internal.a aVarB113 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11118, int i2114) {
                        if ((i2114 & 11) == 2 && pVar11118.b()) {
                            pVar11118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i2114, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var115 = x0Var114;
                        boolean z1111111 = z10;
                        int i2115 = i2113;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var115.b(z1111111, pVar11118, ((i2115 >> 18) & 112) | (i2115 & 14));
                        androidx.compose.ui.n nVarA = pVar11117 != null && (z1111110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar11119 = icon;
                        int i2116 = i2113;
                        pVar11118.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK112 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar11118, 0);
                        pVar11118.T(-1323940314);
                        s1.e eVar11113 = (s1.e) pVar11118.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection112 = (LayoutDirection) pVar11118.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var112 = (androidx.compose.ui.platform.d2) pVar11118.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion112.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF112 = LayoutKt.f(nVarA);
                        if (!(pVar11118.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar11118.h();
                        if (pVar11118.getInserting()) {
                            pVar11118.L(aVarA2);
                        } else {
                            pVar11118.d();
                        }
                        pVar11118.Y();
                        androidx.compose.runtime.p pVarB112 = Updater.b(pVar11118);
                        Updater.j(pVarB112, i0VarK112, companion112.d());
                        Updater.j(pVarB112, eVar11113, companion112.b());
                        Updater.j(pVarB112, layoutDirection112, companion112.c());
                        Updater.j(pVarB112, d2Var112, companion112.f());
                        pVar11118.x();
                        qVarF112.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar11118)), pVar11118, 0);
                        pVar11118.T(2058660585);
                        pVar11118.T(-2137368960);
                        BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.f5954a;
                        pVar11118.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11119, pVar11118, ((i2116 >> 3) & 112) | 8);
                        pVar11118.c0();
                        pVar11118.c0();
                        pVar11118.c0();
                        pVar11118.f();
                        pVar11118.c0();
                        pVar11118.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11118, Integer num) {
                        a(pVar11118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11118, int i2114) {
                            if ((i2114 & 11) == 2 && pVar11118.b()) {
                                pVar11118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i2114, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar11118, 6), t0.h0.f139820a.z());
                            x0 x0Var115 = x0VarA;
                            boolean z1111111 = z10;
                            int i2115 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var115.c(z1111111, pVar11118, ((i2115 >> 18) & 112) | (i2115 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVar3;
                            final int i2116 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar11118, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i2117) {
                                    if ((i2117 & 11) == 2 && pVar111110.b()) {
                                        pVar111110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i2117, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar11119, pVar111110, (i2116 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                                    a(pVar111110, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar11118, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11118, Integer num) {
                            a(pVar11118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO112 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f1112 = f10039h;
                boolean z1111111 = z15;
                androidx.compose.ui.n nVarJ112 = SizeKt.J(nVarO112, f1112, 0.0f, 2, null);
                androidx.compose.ui.c cVarI112 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK112 = BoxKt.k(cVarI112, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar11113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var112 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                aVarA = companion112.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF112 = LayoutKt.f(nVarJ112);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB112 = Updater.b(pVarF);
                Updater.j(pVarB112, i0VarK112, companion112.d());
                Updater.j(pVarB112, eVar11113, companion112.b());
                Updater.j(pVarB112, layoutDirection112, companion112.c());
                Updater.j(pVarB112, d2Var112, companion112.f());
                pVarF.x();
                qVarF112.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance112 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF112 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar11114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE112 = eVar11114.e1(f1112);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE112 - eVar11114.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var112 = kotlin.b2.f124493a;
                b1.f fVarD112 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD112) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource112 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11118, int i2114) {
                        if ((i2114 & 11) == 2 && pVar11118.b()) {
                            pVar11118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i2114, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource112, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar11118, 0, 7)), pVar11118, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11118, Integer num) {
                        a(pVar11118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11118, int i2114) {
                        if ((i2114 & 11) == 2 && pVar11118.b()) {
                            pVar11118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i2114, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar11118, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF112), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar11118, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11118, Integer num) {
                        a(pVar11118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB113, aVarB, z14, c(m2VarF112), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z1111111;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11118 = pVar3;
                z17 = z14;
                pVar4 = pVar11118;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var115 = x0VarA;
                final int i2114 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11119 = pVar3;
                final boolean z1111112 = z14;
                androidx.compose.runtime.internal.a aVarB114 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i2115) {
                        if ((i2115 & 11) == 2 && pVar111110.b()) {
                            pVar111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i2115, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var116 = x0Var115;
                        boolean z1111113 = z10;
                        int i2116 = i2114;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var116.b(z1111113, pVar111110, ((i2116 >> 18) & 112) | (i2116 & 14));
                        androidx.compose.ui.n nVarA = pVar11119 != null && (z1111112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111111 = icon;
                        int i2117 = i2114;
                        pVar111110.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK113 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar111110, 0);
                        pVar111110.T(-1323940314);
                        s1.e eVar11115 = (s1.e) pVar111110.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection113 = (LayoutDirection) pVar111110.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var113 = (androidx.compose.ui.platform.d2) pVar111110.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion113.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF113 = LayoutKt.f(nVarA);
                        if (!(pVar111110.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar111110.h();
                        if (pVar111110.getInserting()) {
                            pVar111110.L(aVarA2);
                        } else {
                            pVar111110.d();
                        }
                        pVar111110.Y();
                        androidx.compose.runtime.p pVarB113 = Updater.b(pVar111110);
                        Updater.j(pVarB113, i0VarK113, companion113.d());
                        Updater.j(pVarB113, eVar11115, companion113.b());
                        Updater.j(pVarB113, layoutDirection113, companion113.c());
                        Updater.j(pVarB113, d2Var113, companion113.f());
                        pVar111110.x();
                        qVarF113.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar111110)), pVar111110, 0);
                        pVar111110.T(2058660585);
                        pVar111110.T(-2137368960);
                        BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.f5954a;
                        pVar111110.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111111, pVar111110, ((i2117 >> 3) & 112) | 8);
                        pVar111110.c0();
                        pVar111110.c0();
                        pVar111110.c0();
                        pVar111110.f();
                        pVar111110.c0();
                        pVar111110.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                        a(pVar111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i2115) {
                            if ((i2115 & 11) == 2 && pVar111110.b()) {
                                pVar111110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i2115, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar111110, 6), t0.h0.f139820a.z());
                            x0 x0Var116 = x0VarA;
                            boolean z1111113 = z10;
                            int i2116 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var116.c(z1111113, pVar111110, ((i2116 >> 18) & 112) | (i2116 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVar3;
                            final int i2117 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111110, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111112, int i2118) {
                                    if ((i2118 & 11) == 2 && pVar111112.b()) {
                                        pVar111112.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i2118, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar111111, pVar111112, (i2117 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111112, Integer num) {
                                    a(pVar111112, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar111110, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                            a(pVar111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO113 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f1113 = f10039h;
                boolean z1111113 = z15;
                androidx.compose.ui.n nVarJ113 = SizeKt.J(nVarO113, f1113, 0.0f, 2, null);
                androidx.compose.ui.c cVarI113 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK113 = BoxKt.k(cVarI113, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar11115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var113 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                aVarA = companion113.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF113 = LayoutKt.f(nVarJ113);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB113 = Updater.b(pVarF);
                Updater.j(pVarB113, i0VarK113, companion113.d());
                Updater.j(pVarB113, eVar11115, companion113.b());
                Updater.j(pVarB113, layoutDirection113, companion113.c());
                Updater.j(pVarB113, d2Var113, companion113.f());
                pVarF.x();
                qVarF113.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance113 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF113 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar11116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE113 = eVar11116.e1(f1113);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE113 - eVar11116.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var113 = kotlin.b2.f124493a;
                b1.f fVarD113 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD113) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource113 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i2115) {
                        if ((i2115 & 11) == 2 && pVar111110.b()) {
                            pVar111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i2115, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource113, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar111110, 0, 7)), pVar111110, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                        a(pVar111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111110, int i2115) {
                        if ((i2115 & 11) == 2 && pVar111110.b()) {
                            pVar111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i2115, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar111110, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF113), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar111110, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111110, Integer num) {
                        a(pVar111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB114, aVarB, z14, c(m2VarF113), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z1111113;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111110 = pVar3;
                z17 = z14;
                pVar4 = pVar111110;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar15 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar111111, int i2115) {
                    NavigationRailKt.b(z10, onClick, icon, nVar15, z16, pVar4, z17, x0Var2, gVar4, pVar111111, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111111, Integer num) {
                    a(pVar111111, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        z13 = z11;
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                if (pVarF.s(pVar)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                z14 = z12;
            } else {
                z14 = z12;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z14)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 234881024) == 0) {
                    gVar2 = gVar;
                    if (pVarF.s(gVar2)) {
                        i20 = 67108864;
                    } else {
                        i20 = 33554432;
                    }
                    i12 |= i20;
                }
                if ((i12 & 191739611) == 38347922) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var116 = x0VarA;
                    final int i2115 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111111 = pVar3;
                    final boolean z1111114 = z14;
                    androidx.compose.runtime.internal.a aVarB115 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111112, int i2116) {
                            if ((i2116 & 11) == 2 && pVar111112.b()) {
                                pVar111112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i2116, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var117 = x0Var116;
                            boolean z1111115 = z10;
                            int i2117 = i2115;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var117.b(z1111115, pVar111112, ((i2117 >> 18) & 112) | (i2117 & 14));
                            androidx.compose.ui.n nVarA = pVar111111 != null && (z1111114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111113 = icon;
                            int i2118 = i2115;
                            pVar111112.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK114 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar111112, 0);
                            pVar111112.T(-1323940314);
                            s1.e eVar11117 = (s1.e) pVar111112.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection114 = (LayoutDirection) pVar111112.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var114 = (androidx.compose.ui.platform.d2) pVar111112.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion114.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF114 = LayoutKt.f(nVarA);
                            if (!(pVar111112.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar111112.h();
                            if (pVar111112.getInserting()) {
                                pVar111112.L(aVarA2);
                            } else {
                                pVar111112.d();
                            }
                            pVar111112.Y();
                            androidx.compose.runtime.p pVarB114 = Updater.b(pVar111112);
                            Updater.j(pVarB114, i0VarK114, companion114.d());
                            Updater.j(pVarB114, eVar11117, companion114.b());
                            Updater.j(pVarB114, layoutDirection114, companion114.c());
                            Updater.j(pVarB114, d2Var114, companion114.f());
                            pVar111112.x();
                            qVarF114.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar111112)), pVar111112, 0);
                            pVar111112.T(2058660585);
                            pVar111112.T(-2137368960);
                            BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.f5954a;
                            pVar111112.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111113, pVar111112, ((i2118 >> 3) & 112) | 8);
                            pVar111112.c0();
                            pVar111112.c0();
                            pVar111112.c0();
                            pVar111112.f();
                            pVar111112.c0();
                            pVar111112.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111112, Integer num) {
                            a(pVar111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111112, int i2116) {
                                if ((i2116 & 11) == 2 && pVar111112.b()) {
                                    pVar111112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i2116, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar111112, 6), t0.h0.f139820a.z());
                                x0 x0Var117 = x0VarA;
                                boolean z1111115 = z10;
                                int i2117 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var117.c(z1111115, pVar111112, ((i2117 >> 18) & 112) | (i2117 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVar3;
                                final int i2118 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111112, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i2119) {
                                        if ((i2119 & 11) == 2 && pVar111114.b()) {
                                            pVar111114.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i2119, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar111113, pVar111114, (i2118 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                                        a(pVar111114, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar111112, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111112, Integer num) {
                                a(pVar111112, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO114 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f1114 = f10039h;
                    boolean z1111115 = z15;
                    androidx.compose.ui.n nVarJ114 = SizeKt.J(nVarO114, f1114, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI114 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK114 = BoxKt.k(cVarI114, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar11117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection114 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var114 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                    aVarA = companion114.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF114 = LayoutKt.f(nVarJ114);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB114 = Updater.b(pVarF);
                    Updater.j(pVarB114, i0VarK114, companion114.d());
                    Updater.j(pVarB114, eVar11117, companion114.b());
                    Updater.j(pVarB114, layoutDirection114, companion114.c());
                    Updater.j(pVarB114, d2Var114, companion114.f());
                    pVarF.x();
                    qVarF114.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance114 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF114 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar11118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE114 = eVar11118.e1(f1114);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE114 - eVar11118.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var114 = kotlin.b2.f124493a;
                    b1.f fVarD114 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD114) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource114 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111112, int i2116) {
                            if ((i2116 & 11) == 2 && pVar111112.b()) {
                                pVar111112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i2116, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource114, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar111112, 0, 7)), pVar111112, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111112, Integer num) {
                            a(pVar111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111112, int i2116) {
                            if ((i2116 & 11) == 2 && pVar111112.b()) {
                                pVar111112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i2116, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar111112, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF114), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar111112, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111112, Integer num) {
                            a(pVar111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB115, aVarB, z14, c(m2VarF114), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z1111115;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111112 = pVar3;
                    z17 = z14;
                    pVar4 = pVar111112;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z13;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        } else {
                            pVar3 = pVar;
                        }
                        if (i17 != 0) {
                            z14 = true;
                        }
                        if ((i11 & 128) != 0) {
                            x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -29360129;
                        } else {
                            x0VarA = x0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            gVar3 = (androidx.compose.foundation.interaction.g) objU;
                        } else {
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                    }
                    final x0 x0Var117 = x0VarA;
                    final int i2116 = i12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111113 = pVar3;
                    final boolean z1111116 = z14;
                    androidx.compose.runtime.internal.a aVarB116 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i2117) {
                            if ((i2117 & 11) == 2 && pVar111114.b()) {
                                pVar111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1023357515, i2117, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                            }
                            x0 x0Var118 = x0Var117;
                            boolean z1111117 = z10;
                            int i2118 = i2116;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var118.b(z1111117, pVar111114, ((i2118 >> 18) & 112) | (i2118 & 14));
                            androidx.compose.ui.n nVarA = pVar111113 != null && (z1111116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                                public final void a(@dl.d r clearAndSetSemantics) {
                                    kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                    a(rVar);
                                    return kotlin.b2.f124493a;
                                }
                            }) : androidx.compose.ui.n.INSTANCE;
                            yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111115 = icon;
                            int i2119 = i2116;
                            pVar111114.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK115 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar111114, 0);
                            pVar111114.T(-1323940314);
                            s1.e eVar11119 = (s1.e) pVar111114.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection115 = (LayoutDirection) pVar111114.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var115 = (androidx.compose.ui.platform.d2) pVar111114.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion115.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF115 = LayoutKt.f(nVarA);
                            if (!(pVar111114.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVar111114.h();
                            if (pVar111114.getInserting()) {
                                pVar111114.L(aVarA2);
                            } else {
                                pVar111114.d();
                            }
                            pVar111114.Y();
                            androidx.compose.runtime.p pVarB115 = Updater.b(pVar111114);
                            Updater.j(pVarB115, i0VarK115, companion115.d());
                            Updater.j(pVarB115, eVar11119, companion115.b());
                            Updater.j(pVarB115, layoutDirection115, companion115.c());
                            Updater.j(pVarB115, d2Var115, companion115.f());
                            pVar111114.x();
                            qVarF115.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar111114)), pVar111114, 0);
                            pVar111114.T(2058660585);
                            pVar111114.T(-2137368960);
                            BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.f5954a;
                            pVar111114.T(-1892243397);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111115, pVar111114, ((i2119 >> 3) & 112) | 8);
                            pVar111114.c0();
                            pVar111114.c0();
                            pVar111114.c0();
                            pVar111114.f();
                            pVar111114.c0();
                            pVar111114.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                            a(pVar111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                    if (pVar3 != null) {
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                                return m2Var.getValue().M();
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i2117) {
                                if ((i2117 & 11) == 2 && pVar111114.b()) {
                                    pVar111114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-105269599, i2117, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar111114, 6), t0.h0.f139820a.z());
                                x0 x0Var118 = x0VarA;
                                boolean z1111117 = z10;
                                int i2118 = i12;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var118.c(z1111117, pVar111114, ((i2118 >> 18) & 112) | (i2118 & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = pVar3;
                                final int i2119 = i12;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111114, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar111116, int i21110) {
                                        if ((i21110 & 11) == 2 && pVar111116.b()) {
                                            pVar111116.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-288191647, i21110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                        }
                                        TextKt.a(textStyleA, pVar111115, pVar111116, (i2119 >> 12) & 112);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111116, Integer num) {
                                        a(pVar111116, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVar111114, 56);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                                a(pVar111114, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        aVarB = null;
                    }
                    androidx.compose.ui.n nVarO115 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                    float f1115 = f10039h;
                    boolean z1111117 = z15;
                    androidx.compose.ui.n nVarJ115 = SizeKt.J(nVarO115, f1115, 0.0f, 2, null);
                    androidx.compose.ui.c cVarI115 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK115 = BoxKt.k(cVarI115, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar11119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection115 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    nVar3 = nVar2;
                    androidx.compose.ui.platform.d2 d2Var115 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    aVarA = companion115.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF115 = LayoutKt.f(nVarJ115);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.getInserting()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB115 = Updater.b(pVarF);
                    Updater.j(pVarB115, i0VarK115, companion115.d());
                    Updater.j(pVarB115, eVar11119, companion115.b());
                    Updater.j(pVarB115, layoutDirection115, companion115.c());
                    Updater.j(pVarB115, d2Var115, companion115.f());
                    pVarF.x();
                    qVarF115.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance115 = BoxScopeInstance.f5954a;
                    pVarF.T(752355157);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF115 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar111110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    int iE115 = eVar111110.e1(f1115);
                    h0Var = t0.h0.f139820a;
                    jA = b1.g.a((iE115 - eVar111110.e1(h0Var.i())) / 2, 0.0f);
                    kotlin.b2 b2Var115 = kotlin.b2.f124493a;
                    b1.f fVarD115 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS = pVarF.s(fVarD115) | pVarF.s(gVar3);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource115 = (MappedInteractionSource) objU2;
                    if (pVar3 != null) {
                        pVarF.T(1104516937);
                        g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                        pVarF.c0();
                    } else {
                        pVarF.T(1104517018);
                        g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                        pVarF.c0();
                    }
                    d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i2117) {
                            if ((i2117 & 11) == 2 && pVar111114.b()) {
                                pVar111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(211026382, i2117, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource115, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar111114, 0, 7)), pVar111114, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                            a(pVar111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111114, int i2117) {
                            if ((i2117 & 11) == 2 && pVar111114.b()) {
                                pVar111114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1862011490, i2117, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar111114, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF115), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar111114, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111114, Integer num) {
                            a(pVar111114, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB116, aVarB, z14, c(m2VarF115), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    x0Var2 = x0VarA;
                    z16 = z1111117;
                    gVar4 = gVar3;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111114 = pVar3;
                    z17 = z14;
                    pVar4 = pVar111114;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar16 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar111115, int i2117) {
                        NavigationRailKt.b(z10, onClick, icon, nVar16, z16, pVar4, z17, x0Var2, gVar4, pVar111115, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111115, Integer num) {
                        a(pVar111115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= 100663296;
            gVar2 = gVar;
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var118 = x0VarA;
                final int i2117 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111115 = pVar3;
                final boolean z1111118 = z14;
                androidx.compose.runtime.internal.a aVarB117 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111116, int i2118) {
                        if ((i2118 & 11) == 2 && pVar111116.b()) {
                            pVar111116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i2118, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var119 = x0Var118;
                        boolean z1111119 = z10;
                        int i2119 = i2117;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var119.b(z1111119, pVar111116, ((i2119 >> 18) & 112) | (i2119 & 14));
                        androidx.compose.ui.n nVarA = pVar111115 != null && (z1111118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111117 = icon;
                        int i21110 = i2117;
                        pVar111116.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK116 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar111116, 0);
                        pVar111116.T(-1323940314);
                        s1.e eVar111111 = (s1.e) pVar111116.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection116 = (LayoutDirection) pVar111116.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var116 = (androidx.compose.ui.platform.d2) pVar111116.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion116.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF116 = LayoutKt.f(nVarA);
                        if (!(pVar111116.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar111116.h();
                        if (pVar111116.getInserting()) {
                            pVar111116.L(aVarA2);
                        } else {
                            pVar111116.d();
                        }
                        pVar111116.Y();
                        androidx.compose.runtime.p pVarB116 = Updater.b(pVar111116);
                        Updater.j(pVarB116, i0VarK116, companion116.d());
                        Updater.j(pVarB116, eVar111111, companion116.b());
                        Updater.j(pVarB116, layoutDirection116, companion116.c());
                        Updater.j(pVarB116, d2Var116, companion116.f());
                        pVar111116.x();
                        qVarF116.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar111116)), pVar111116, 0);
                        pVar111116.T(2058660585);
                        pVar111116.T(-2137368960);
                        BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.f5954a;
                        pVar111116.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111117, pVar111116, ((i21110 >> 3) & 112) | 8);
                        pVar111116.c0();
                        pVar111116.c0();
                        pVar111116.c0();
                        pVar111116.f();
                        pVar111116.c0();
                        pVar111116.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111116, Integer num) {
                        a(pVar111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111116, int i2118) {
                            if ((i2118 & 11) == 2 && pVar111116.b()) {
                                pVar111116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i2118, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar111116, 6), t0.h0.f139820a.z());
                            x0 x0Var119 = x0VarA;
                            boolean z1111119 = z10;
                            int i2119 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var119.c(z1111119, pVar111116, ((i2119 >> 18) & 112) | (i2119 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111117 = pVar3;
                            final int i21110 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111116, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar111118, int i21111) {
                                    if ((i21111 & 11) == 2 && pVar111118.b()) {
                                        pVar111118.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i21111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar111117, pVar111118, (i21110 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111118, Integer num) {
                                    a(pVar111118, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar111116, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111116, Integer num) {
                            a(pVar111116, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO116 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f1116 = f10039h;
                boolean z1111119 = z15;
                androidx.compose.ui.n nVarJ116 = SizeKt.J(nVarO116, f1116, 0.0f, 2, null);
                androidx.compose.ui.c cVarI116 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK116 = BoxKt.k(cVarI116, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar111111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection116 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var116 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                aVarA = companion116.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF116 = LayoutKt.f(nVarJ116);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB116 = Updater.b(pVarF);
                Updater.j(pVarB116, i0VarK116, companion116.d());
                Updater.j(pVarB116, eVar111111, companion116.b());
                Updater.j(pVarB116, layoutDirection116, companion116.c());
                Updater.j(pVarB116, d2Var116, companion116.f());
                pVarF.x();
                qVarF116.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance116 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF116 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar111112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE116 = eVar111112.e1(f1116);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE116 - eVar111112.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var116 = kotlin.b2.f124493a;
                b1.f fVarD116 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD116) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource116 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111116, int i2118) {
                        if ((i2118 & 11) == 2 && pVar111116.b()) {
                            pVar111116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i2118, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource116, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar111116, 0, 7)), pVar111116, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111116, Integer num) {
                        a(pVar111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111116, int i2118) {
                        if ((i2118 & 11) == 2 && pVar111116.b()) {
                            pVar111116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i2118, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar111116, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF116), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar111116, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111116, Integer num) {
                        a(pVar111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB117, aVarB, z14, c(m2VarF116), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z1111119;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111116 = pVar3;
                z17 = z14;
                pVar4 = pVar111116;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var119 = x0VarA;
                final int i2118 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111117 = pVar3;
                final boolean z11111110 = z14;
                androidx.compose.runtime.internal.a aVarB118 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111118, int i2119) {
                        if ((i2119 & 11) == 2 && pVar111118.b()) {
                            pVar111118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i2119, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var1110 = x0Var119;
                        boolean z11111111 = z10;
                        int i21110 = i2118;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var1110.b(z11111111, pVar111118, ((i21110 >> 18) & 112) | (i21110 & 14));
                        androidx.compose.ui.n nVarA = pVar111117 != null && (z11111110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar111119 = icon;
                        int i21111 = i2118;
                        pVar111118.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK117 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar111118, 0);
                        pVar111118.T(-1323940314);
                        s1.e eVar111113 = (s1.e) pVar111118.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection117 = (LayoutDirection) pVar111118.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var117 = (androidx.compose.ui.platform.d2) pVar111118.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion117.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF117 = LayoutKt.f(nVarA);
                        if (!(pVar111118.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar111118.h();
                        if (pVar111118.getInserting()) {
                            pVar111118.L(aVarA2);
                        } else {
                            pVar111118.d();
                        }
                        pVar111118.Y();
                        androidx.compose.runtime.p pVarB117 = Updater.b(pVar111118);
                        Updater.j(pVarB117, i0VarK117, companion117.d());
                        Updater.j(pVarB117, eVar111113, companion117.b());
                        Updater.j(pVarB117, layoutDirection117, companion117.c());
                        Updater.j(pVarB117, d2Var117, companion117.f());
                        pVar111118.x();
                        qVarF117.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar111118)), pVar111118, 0);
                        pVar111118.T(2058660585);
                        pVar111118.T(-2137368960);
                        BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.f5954a;
                        pVar111118.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111119, pVar111118, ((i21111 >> 3) & 112) | 8);
                        pVar111118.c0();
                        pVar111118.c0();
                        pVar111118.c0();
                        pVar111118.f();
                        pVar111118.c0();
                        pVar111118.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111118, Integer num) {
                        a(pVar111118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111118, int i2119) {
                            if ((i2119 & 11) == 2 && pVar111118.b()) {
                                pVar111118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i2119, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar111118, 6), t0.h0.f139820a.z());
                            x0 x0Var1110 = x0VarA;
                            boolean z11111111 = z10;
                            int i21110 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var1110.c(z11111111, pVar111118, ((i21110 >> 18) & 112) | (i21110 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = pVar3;
                            final int i21111 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar111118, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1111110, int i21112) {
                                    if ((i21112 & 11) == 2 && pVar1111110.b()) {
                                        pVar1111110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i21112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar111119, pVar1111110, (i21111 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111110, Integer num) {
                                    a(pVar1111110, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar111118, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111118, Integer num) {
                            a(pVar111118, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO117 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f1117 = f10039h;
                boolean z11111111 = z15;
                androidx.compose.ui.n nVarJ117 = SizeKt.J(nVarO117, f1117, 0.0f, 2, null);
                androidx.compose.ui.c cVarI117 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK117 = BoxKt.k(cVarI117, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar111113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection117 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var117 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                aVarA = companion117.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF117 = LayoutKt.f(nVarJ117);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB117 = Updater.b(pVarF);
                Updater.j(pVarB117, i0VarK117, companion117.d());
                Updater.j(pVarB117, eVar111113, companion117.b());
                Updater.j(pVarB117, layoutDirection117, companion117.c());
                Updater.j(pVarB117, d2Var117, companion117.f());
                pVarF.x();
                qVarF117.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance117 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF117 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar111114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE117 = eVar111114.e1(f1117);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE117 - eVar111114.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var117 = kotlin.b2.f124493a;
                b1.f fVarD117 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD117) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource117 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111118, int i2119) {
                        if ((i2119 & 11) == 2 && pVar111118.b()) {
                            pVar111118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i2119, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource117, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar111118, 0, 7)), pVar111118, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111118, Integer num) {
                        a(pVar111118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar111118, int i2119) {
                        if ((i2119 & 11) == 2 && pVar111118.b()) {
                            pVar111118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i2119, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar111118, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF117), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar111118, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111118, Integer num) {
                        a(pVar111118, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB118, aVarB, z14, c(m2VarF117), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z11111111;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111118 = pVar3;
                z17 = z14;
                pVar4 = pVar111118;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar17 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar111119, int i2119) {
                    NavigationRailKt.b(z10, onClick, icon, nVar17, z16, pVar4, z17, x0Var2, gVar4, pVar111119, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111119, Integer num) {
                    a(pVar111119, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= androidx.profileinstaller.o.c.f26824k;
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            z14 = z12;
        } else {
            z14 = z12;
            if ((i10 & 3670016) == 0) {
                if (pVarF.u(z14)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !pVarF.s(x0Var)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 234881024) == 0) {
                gVar2 = gVar;
                if (pVarF.s(gVar2)) {
                    i20 = 67108864;
                } else {
                    i20 = 33554432;
                }
                i12 |= i20;
            }
            if ((i12 & 191739611) == 38347922) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var1110 = x0VarA;
                final int i2119 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111119 = pVar3;
                final boolean z11111112 = z14;
                androidx.compose.runtime.internal.a aVarB119 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111110, int i21110) {
                        if ((i21110 & 11) == 2 && pVar1111110.b()) {
                            pVar1111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i21110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var1111 = x0Var1110;
                        boolean z11111113 = z10;
                        int i21111 = i2119;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var1111.b(z11111113, pVar1111110, ((i21111 >> 18) & 112) | (i21111 & 14));
                        androidx.compose.ui.n nVarA = pVar111119 != null && (z11111112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111111 = icon;
                        int i21112 = i2119;
                        pVar1111110.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK118 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1111110, 0);
                        pVar1111110.T(-1323940314);
                        s1.e eVar111115 = (s1.e) pVar1111110.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection118 = (LayoutDirection) pVar1111110.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var118 = (androidx.compose.ui.platform.d2) pVar1111110.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion118.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF118 = LayoutKt.f(nVarA);
                        if (!(pVar1111110.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar1111110.h();
                        if (pVar1111110.getInserting()) {
                            pVar1111110.L(aVarA2);
                        } else {
                            pVar1111110.d();
                        }
                        pVar1111110.Y();
                        androidx.compose.runtime.p pVarB118 = Updater.b(pVar1111110);
                        Updater.j(pVarB118, i0VarK118, companion118.d());
                        Updater.j(pVarB118, eVar111115, companion118.b());
                        Updater.j(pVarB118, layoutDirection118, companion118.c());
                        Updater.j(pVarB118, d2Var118, companion118.f());
                        pVar1111110.x();
                        qVarF118.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1111110)), pVar1111110, 0);
                        pVar1111110.T(2058660585);
                        pVar1111110.T(-2137368960);
                        BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.f5954a;
                        pVar1111110.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1111111, pVar1111110, ((i21112 >> 3) & 112) | 8);
                        pVar1111110.c0();
                        pVar1111110.c0();
                        pVar1111110.c0();
                        pVar1111110.f();
                        pVar1111110.c0();
                        pVar1111110.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111110, Integer num) {
                        a(pVar1111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111110, int i21110) {
                            if ((i21110 & 11) == 2 && pVar1111110.b()) {
                                pVar1111110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i21110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1111110, 6), t0.h0.f139820a.z());
                            x0 x0Var1111 = x0VarA;
                            boolean z11111113 = z10;
                            int i21111 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var1111.c(z11111113, pVar1111110, ((i21111 >> 18) & 112) | (i21111 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar3;
                            final int i21112 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111110, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1111112, int i21113) {
                                    if ((i21113 & 11) == 2 && pVar1111112.b()) {
                                        pVar1111112.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i21113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar1111111, pVar1111112, (i21112 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111112, Integer num) {
                                    a(pVar1111112, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1111110, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111110, Integer num) {
                            a(pVar1111110, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO118 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f1118 = f10039h;
                boolean z11111113 = z15;
                androidx.compose.ui.n nVarJ118 = SizeKt.J(nVarO118, f1118, 0.0f, 2, null);
                androidx.compose.ui.c cVarI118 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK118 = BoxKt.k(cVarI118, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar111115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection118 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var118 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                aVarA = companion118.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF118 = LayoutKt.f(nVarJ118);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB118 = Updater.b(pVarF);
                Updater.j(pVarB118, i0VarK118, companion118.d());
                Updater.j(pVarB118, eVar111115, companion118.b());
                Updater.j(pVarB118, layoutDirection118, companion118.c());
                Updater.j(pVarB118, d2Var118, companion118.f());
                pVarF.x();
                qVarF118.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance118 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF118 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar111116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE118 = eVar111116.e1(f1118);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE118 - eVar111116.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var118 = kotlin.b2.f124493a;
                b1.f fVarD118 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD118) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource118 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111110, int i21110) {
                        if ((i21110 & 11) == 2 && pVar1111110.b()) {
                            pVar1111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i21110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource118, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1111110, 0, 7)), pVar1111110, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111110, Integer num) {
                        a(pVar1111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111110, int i21110) {
                        if ((i21110 & 11) == 2 && pVar1111110.b()) {
                            pVar1111110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i21110, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1111110, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF118), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1111110, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111110, Integer num) {
                        a(pVar1111110, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB119, aVarB, z14, c(m2VarF118), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z11111113;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111110 = pVar3;
                z17 = z14;
                pVar4 = pVar1111110;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z13;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    } else {
                        pVar3 = pVar;
                    }
                    if (i17 != 0) {
                        z14 = true;
                    }
                    if ((i11 & 128) != 0) {
                        x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -29360129;
                    } else {
                        x0VarA = x0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        gVar3 = (androidx.compose.foundation.interaction.g) objU;
                    } else {
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
                }
                final x0 x0Var1111 = x0VarA;
                final int i21110 = i12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111111 = pVar3;
                final boolean z11111114 = z14;
                androidx.compose.runtime.internal.a aVarB1110 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111112, int i21111) {
                        if ((i21111 & 11) == 2 && pVar1111112.b()) {
                            pVar1111112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1023357515, i21111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                        }
                        x0 x0Var1112 = x0Var1111;
                        boolean z11111115 = z10;
                        int i21112 = i21110;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var1112.b(z11111115, pVar1111112, ((i21112 >> 18) & 112) | (i21112 & 14));
                        androidx.compose.ui.n nVarA = pVar1111111 != null && (z11111114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                            public final void a(@dl.d r clearAndSetSemantics) {
                                kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                                a(rVar);
                                return kotlin.b2.f124493a;
                            }
                        }) : androidx.compose.ui.n.INSTANCE;
                        yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111113 = icon;
                        int i21113 = i21110;
                        pVar1111112.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK119 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1111112, 0);
                        pVar1111112.T(-1323940314);
                        s1.e eVar111117 = (s1.e) pVar1111112.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection119 = (LayoutDirection) pVar1111112.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var119 = (androidx.compose.ui.platform.d2) pVar1111112.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion119.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF119 = LayoutKt.f(nVarA);
                        if (!(pVar1111112.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVar1111112.h();
                        if (pVar1111112.getInserting()) {
                            pVar1111112.L(aVarA2);
                        } else {
                            pVar1111112.d();
                        }
                        pVar1111112.Y();
                        androidx.compose.runtime.p pVarB119 = Updater.b(pVar1111112);
                        Updater.j(pVarB119, i0VarK119, companion119.d());
                        Updater.j(pVarB119, eVar111117, companion119.b());
                        Updater.j(pVarB119, layoutDirection119, companion119.c());
                        Updater.j(pVarB119, d2Var119, companion119.f());
                        pVar1111112.x();
                        qVarF119.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1111112)), pVar1111112, 0);
                        pVar1111112.T(2058660585);
                        pVar1111112.T(-2137368960);
                        BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.f5954a;
                        pVar1111112.T(-1892243397);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1111113, pVar1111112, ((i21113 >> 3) & 112) | 8);
                        pVar1111112.c0();
                        pVar1111112.c0();
                        pVar1111112.c0();
                        pVar1111112.f();
                        pVar1111112.c0();
                        pVar1111112.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111112, Integer num) {
                        a(pVar1111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
                if (pVar3 != null) {
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                            return m2Var.getValue().M();
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar1111112, int i21111) {
                            if ((i21111 & 11) == 2 && pVar1111112.b()) {
                                pVar1111112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-105269599, i21111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1111112, 6), t0.h0.f139820a.z());
                            x0 x0Var1112 = x0VarA;
                            boolean z11111115 = z10;
                            int i21112 = i12;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var1112.c(z11111115, pVar1111112, ((i21112 >> 18) & 112) | (i21112 & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVar3;
                            final int i21113 = i12;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111112, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i21114) {
                                    if ((i21114 & 11) == 2 && pVar1111114.b()) {
                                        pVar1111114.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-288191647, i21114, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                    }
                                    TextKt.a(textStyleA, pVar1111113, pVar1111114, (i21113 >> 12) & 112);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                                    a(pVar1111114, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVar1111112, 56);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111112, Integer num) {
                            a(pVar1111112, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    aVarB = null;
                }
                androidx.compose.ui.n nVarO119 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
                float f1119 = f10039h;
                boolean z11111115 = z15;
                androidx.compose.ui.n nVarJ119 = SizeKt.J(nVarO119, f1119, 0.0f, 2, null);
                androidx.compose.ui.c cVarI119 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK119 = BoxKt.k(cVarI119, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar111117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection119 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                nVar3 = nVar2;
                androidx.compose.ui.platform.d2 d2Var119 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                aVarA = companion119.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF119 = LayoutKt.f(nVarJ119);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB119 = Updater.b(pVarF);
                Updater.j(pVarB119, i0VarK119, companion119.d());
                Updater.j(pVarB119, eVar111117, companion119.b());
                Updater.j(pVarB119, layoutDirection119, companion119.c());
                Updater.j(pVarB119, d2Var119, companion119.f());
                pVarF.x();
                qVarF119.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance119 = BoxScopeInstance.f5954a;
                pVarF.T(752355157);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF119 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar111118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                int iE119 = eVar111118.e1(f1119);
                h0Var = t0.h0.f139820a;
                jA = b1.g.a((iE119 - eVar111118.e1(h0Var.i())) / 2, 0.0f);
                kotlin.b2 b2Var119 = kotlin.b2.f124493a;
                b1.f fVarD119 = b1.f.d(jA);
                pVarF.T(511388516);
                zS = pVarF.s(fVarD119) | pVarF.s(gVar3);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                } else {
                    objU2 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource119 = (MappedInteractionSource) objU2;
                if (pVar3 != null) {
                    pVarF.T(1104516937);
                    g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                    pVarF.c0();
                } else {
                    pVarF.T(1104517018);
                    g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                    pVarF.c0();
                }
                d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111112, int i21111) {
                        if ((i21111 & 11) == 2 && pVar1111112.b()) {
                            pVar1111112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(211026382, i21111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource119, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1111112, 0, 7)), pVar1111112, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111112, Integer num) {
                        a(pVar1111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111112, int i21111) {
                        if ((i21111 & 11) == 2 && pVar1111112.b()) {
                            pVar1111112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1862011490, i21111, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1111112, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF119), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1111112, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111112, Integer num) {
                        a(pVar1111112, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB1110, aVarB, z14, c(m2VarF119), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                x0Var2 = x0VarA;
                z16 = z11111115;
                gVar4 = gVar3;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111112 = pVar3;
                z17 = z14;
                pVar4 = pVar1111112;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar18 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111113, int i21111) {
                    NavigationRailKt.b(z10, onClick, icon, nVar18, z16, pVar4, z17, x0Var2, gVar4, pVar1111113, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111113, Integer num) {
                    a(pVar1111113, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 100663296;
        gVar2 = gVar;
        if ((i12 & 191739611) == 38347922) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i15 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -29360129;
                } else {
                    x0VarA = x0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i15 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -29360129;
                } else {
                    x0VarA = x0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
            }
            final x0 x0Var1112 = x0VarA;
            final int i21111 = i12;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111113 = pVar3;
            final boolean z11111116 = z14;
            androidx.compose.runtime.internal.a aVarB1111 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                    return m2Var.getValue().M();
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i21112) {
                    if ((i21112 & 11) == 2 && pVar1111114.b()) {
                        pVar1111114.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1023357515, i21112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                    }
                    x0 x0Var1113 = x0Var1112;
                    boolean z11111117 = z10;
                    int i21113 = i21111;
                    m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var1113.b(z11111117, pVar1111114, ((i21113 >> 18) & 112) | (i21113 & 14));
                    androidx.compose.ui.n nVarA = pVar1111113 != null && (z11111116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                        public final void a(@dl.d r clearAndSetSemantics) {
                            kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    }) : androidx.compose.ui.n.INSTANCE;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111115 = icon;
                    int i21114 = i21111;
                    pVar1111114.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK1110 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1111114, 0);
                    pVar1111114.T(-1323940314);
                    s1.e eVar111119 = (s1.e) pVar1111114.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection1110 = (LayoutDirection) pVar1111114.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var1110 = (androidx.compose.ui.platform.d2) pVar1111114.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA2 = companion1110.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF1110 = LayoutKt.f(nVarA);
                    if (!(pVar1111114.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar1111114.h();
                    if (pVar1111114.getInserting()) {
                        pVar1111114.L(aVarA2);
                    } else {
                        pVar1111114.d();
                    }
                    pVar1111114.Y();
                    androidx.compose.runtime.p pVarB1110 = Updater.b(pVar1111114);
                    Updater.j(pVarB1110, i0VarK1110, companion1110.d());
                    Updater.j(pVarB1110, eVar111119, companion1110.b());
                    Updater.j(pVarB1110, layoutDirection1110, companion1110.c());
                    Updater.j(pVarB1110, d2Var1110, companion1110.f());
                    pVar1111114.x();
                    qVarF1110.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1111114)), pVar1111114, 0);
                    pVar1111114.T(2058660585);
                    pVar1111114.T(-2137368960);
                    BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.f5954a;
                    pVar1111114.T(-1892243397);
                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1111115, pVar1111114, ((i21114 >> 3) & 112) | 8);
                    pVar1111114.c0();
                    pVar1111114.c0();
                    pVar1111114.c0();
                    pVar1111114.f();
                    pVar1111114.c0();
                    pVar1111114.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                    a(pVar1111114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            if (pVar3 != null) {
                aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i21112) {
                        if ((i21112 & 11) == 2 && pVar1111114.b()) {
                            pVar1111114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-105269599, i21112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                        }
                        final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1111114, 6), t0.h0.f139820a.z());
                        x0 x0Var1113 = x0VarA;
                        boolean z11111117 = z10;
                        int i21113 = i12;
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var1113.c(z11111117, pVar1111114, ((i21113 >> 18) & 112) | (i21113 & 14)))))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVar3;
                        final int i21114 = i12;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111114, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111116, int i21115) {
                                if ((i21115 & 11) == 2 && pVar1111116.b()) {
                                    pVar1111116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-288191647, i21115, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                }
                                TextKt.a(textStyleA, pVar1111115, pVar1111116, (i21114 >> 12) & 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111116, Integer num) {
                                a(pVar1111116, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar1111114, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                        a(pVar1111114, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            } else {
                aVarB = null;
            }
            androidx.compose.ui.n nVarO1110 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
            float f11110 = f10039h;
            boolean z11111117 = z15;
            androidx.compose.ui.n nVarJ1110 = SizeKt.J(nVarO1110, f11110, 0.0f, 2, null);
            androidx.compose.ui.c cVarI1110 = androidx.compose.ui.c.INSTANCE.i();
            pVarF.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK1110 = BoxKt.k(cVarI1110, false, pVarF, 6);
            pVarF.T(-1323940314);
            s1.e eVar111119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            nVar3 = nVar2;
            androidx.compose.ui.platform.d2 d2Var1110 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
            aVarA = companion1110.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF1110 = LayoutKt.f(nVarJ1110);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB1110 = Updater.b(pVarF);
            Updater.j(pVarB1110, i0VarK1110, companion1110.d());
            Updater.j(pVarB1110, eVar111119, companion1110.b());
            Updater.j(pVarB1110, layoutDirection1110, companion1110.c());
            Updater.j(pVarB1110, d2Var1110, companion1110.f());
            pVarF.x();
            qVarF1110.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance1110 = BoxScopeInstance.f5954a;
            pVarF.T(752355157);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            final m2<Float> m2VarF1110 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
            s1.e eVar1111110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            int iE1110 = eVar1111110.e1(f11110);
            h0Var = t0.h0.f139820a;
            jA = b1.g.a((iE1110 - eVar1111110.e1(h0Var.i())) / 2, 0.0f);
            kotlin.b2 b2Var1110 = kotlin.b2.f124493a;
            b1.f fVarD1110 = b1.f.d(jA);
            pVarF.T(511388516);
            zS = pVarF.s(fVarD1110) | pVarF.s(gVar3);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU2);
            } else {
                objU2 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            final MappedInteractionSource mappedInteractionSource1110 = (MappedInteractionSource) objU2;
            if (pVar3 != null) {
                pVarF.T(1104516937);
                g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                pVarF.c0();
            } else {
                pVarF.T(1104517018);
                g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                pVarF.c0();
            }
            d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i21112) {
                    if ((i21112 & 11) == 2 && pVar1111114.b()) {
                        pVar1111114.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(211026382, i21112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                    }
                    BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource1110, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1111114, 0, 7)), pVar1111114, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                    a(pVar1111114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1111114, int i21112) {
                    if ((i21112 & 11) == 2 && pVar1111114.b()) {
                        pVar1111114.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1862011490, i21112, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                    }
                    BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1111114, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF1110), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1111114, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111114, Integer num) {
                    a(pVar1111114, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), aVarB1111, aVarB, z14, c(m2VarF1110), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            x0Var2 = x0VarA;
            z16 = z11111117;
            gVar4 = gVar3;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111114 = pVar3;
            z17 = z14;
            pVar4 = pVar1111114;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i15 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -29360129;
                } else {
                    x0VarA = x0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z13;
                }
                if (i15 != 0) {
                    pVar3 = null;
                } else {
                    pVar3 = pVar;
                }
                if (i17 != 0) {
                    z14 = true;
                }
                if ((i11 & 128) != 0) {
                    x0VarA = y0.f12186a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -29360129;
                } else {
                    x0VarA = x0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    gVar3 = (androidx.compose.foundation.interaction.g) objU;
                } else {
                    gVar3 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1533971045, i12, -1, "androidx.compose.material3.NavigationRailItem (NavigationRail.kt:160)");
            }
            final x0 x0Var1113 = x0VarA;
            final int i21112 = i12;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111115 = pVar3;
            final boolean z11111118 = z14;
            androidx.compose.runtime.internal.a aVarB1112 = androidx.compose.runtime.internal.b.b(pVarF, -1023357515, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                    return m2Var.getValue().M();
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1111116, int i21113) {
                    if ((i21113 & 11) == 2 && pVar1111116.b()) {
                        pVar1111116.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1023357515, i21113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous> (NavigationRail.kt:171)");
                    }
                    x0 x0Var1114 = x0Var1113;
                    boolean z11111119 = z10;
                    int i21114 = i21112;
                    m2<androidx.compose.ui.graphics.l0> m2VarB = x0Var1114.b(z11111119, pVar1111116, ((i21114 >> 18) & 112) | (i21114 & 14));
                    androidx.compose.ui.n nVarA = pVar1111115 != null && (z11111118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledIcon$1.1
                        public final void a(@dl.d r clearAndSetSemantics) {
                            kotlin.jvm.internal.f0.p(clearAndSetSemantics, "$this$clearAndSetSemantics");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(r rVar) {
                            a(rVar);
                            return kotlin.b2.f124493a;
                        }
                    }) : androidx.compose.ui.n.INSTANCE;
                    yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar1111117 = icon;
                    int i21115 = i21112;
                    pVar1111116.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK1111 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1111116, 0);
                    pVar1111116.T(-1323940314);
                    s1.e eVar1111111 = (s1.e) pVar1111116.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection1111 = (LayoutDirection) pVar1111116.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var1111 = (androidx.compose.ui.platform.d2) pVar1111116.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA2 = companion1111.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF1111 = LayoutKt.f(nVarA);
                    if (!(pVar1111116.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar1111116.h();
                    if (pVar1111116.getInserting()) {
                        pVar1111116.L(aVarA2);
                    } else {
                        pVar1111116.d();
                    }
                    pVar1111116.Y();
                    androidx.compose.runtime.p pVarB1111 = Updater.b(pVar1111116);
                    Updater.j(pVarB1111, i0VarK1111, companion1111.d());
                    Updater.j(pVarB1111, eVar1111111, companion1111.b());
                    Updater.j(pVarB1111, layoutDirection1111, companion1111.c());
                    Updater.j(pVarB1111, d2Var1111, companion1111.f());
                    pVar1111116.x();
                    qVarF1111.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1111116)), pVar1111116, 0);
                    pVar1111116.T(2058660585);
                    pVar1111116.T(-2137368960);
                    BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.f5954a;
                    pVar1111116.T(-1892243397);
                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1111117, pVar1111116, ((i21115 >> 3) & 112) | 8);
                    pVar1111116.c0();
                    pVar1111116.c0();
                    pVar1111116.c0();
                    pVar1111116.f();
                    pVar1111116.c0();
                    pVar1111116.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111116, Integer num) {
                    a(pVar1111116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
            if (pVar3 != null) {
                aVarB = androidx.compose.runtime.internal.b.b(pVarF, -105269599, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    private static final long b(m2<androidx.compose.ui.graphics.l0> m2Var) {
                        return m2Var.getValue().M();
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111116, int i21113) {
                        if ((i21113 & 11) == 2 && pVar1111116.b()) {
                            pVar1111116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-105269599, i21113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:181)");
                        }
                        final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1111116, 6), t0.h0.f139820a.z());
                        x0 x0Var1114 = x0VarA;
                        boolean z11111119 = z10;
                        int i21114 = i12;
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(x0Var1114.c(z11111119, pVar1111116, ((i21114 >> 18) & 112) | (i21114 & 14)))))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111117 = pVar3;
                        final int i21115 = i12;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1111116, -288191647, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$styledLabel$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1111118, int i21116) {
                                if ((i21116 & 11) == 2 && pVar1111118.b()) {
                                    pVar1111118.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-288191647, i21116, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous>.<anonymous> (NavigationRail.kt:184)");
                                }
                                TextKt.a(textStyleA, pVar1111117, pVar1111118, (i21115 >> 12) & 112);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111118, Integer num) {
                                a(pVar1111118, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVar1111116, 56);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111116, Integer num) {
                        a(pVar1111116, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            } else {
                aVarB = null;
            }
            androidx.compose.ui.n nVarO1111 = SizeKt.o(SelectableKt.a(nVar2, z10, gVar3, null, z15, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), f10040i);
            float f11111 = f10039h;
            boolean z11111119 = z15;
            androidx.compose.ui.n nVarJ1111 = SizeKt.J(nVarO1111, f11111, 0.0f, 2, null);
            androidx.compose.ui.c cVarI1111 = androidx.compose.ui.c.INSTANCE.i();
            pVarF.T(733328855);
            androidx.compose.ui.layout.i0 i0VarK1111 = BoxKt.k(cVarI1111, false, pVarF, 6);
            pVarF.T(-1323940314);
            s1.e eVar1111111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            nVar3 = nVar2;
            androidx.compose.ui.platform.d2 d2Var1111 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            aVarA = companion1111.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF1111 = LayoutKt.f(nVarJ1111);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB1111 = Updater.b(pVarF);
            Updater.j(pVarB1111, i0VarK1111, companion1111.d());
            Updater.j(pVarB1111, eVar1111111, companion1111.b());
            Updater.j(pVarB1111, layoutDirection1111, companion1111.c());
            Updater.j(pVarB1111, d2Var1111, companion1111.f());
            pVarF.x();
            qVarF1111.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance1111 = BoxScopeInstance.f5954a;
            pVarF.T(752355157);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            final m2<Float> m2VarF1111 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(150, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
            s1.e eVar1111112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            int iE1111 = eVar1111112.e1(f11111);
            h0Var = t0.h0.f139820a;
            jA = b1.g.a((iE1111 - eVar1111112.e1(h0Var.i())) / 2, 0.0f);
            kotlin.b2 b2Var1111 = kotlin.b2.f124493a;
            b1.f fVarD1111 = b1.f.d(jA);
            pVarF.T(511388516);
            zS = pVarF.s(fVarD1111) | pVarF.s(gVar3);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU2);
            } else {
                objU2 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU2);
            }
            pVarF.c0();
            final MappedInteractionSource mappedInteractionSource1111 = (MappedInteractionSource) objU2;
            if (pVar3 != null) {
                pVarF.T(1104516937);
                g2VarD = ShapesKt.d(h0Var.h(), pVarF, 6);
                pVarF.c0();
            } else {
                pVarF.T(1104517018);
                g2VarD = ShapesKt.d(h0Var.G(), pVarF, 6);
                pVarF.c0();
            }
            d(androidx.compose.runtime.internal.b.b(pVarF, 211026382, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicatorRipple$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1111116, int i21113) {
                    if ((i21113 & 11) == 2 && pVar1111116.b()) {
                        pVar1111116.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(211026382, i21113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:230)");
                    }
                    BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), g2VarD), mappedInteractionSource1111, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1111116, 0, 7)), pVar1111116, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111116, Integer num) {
                    a(pVar1111116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), androidx.compose.runtime.internal.b.b(pVarF, -1862011490, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$2$indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1111116, int i21113) {
                    if ((i21113 & 11) == 2 && pVar1111116.b()) {
                        pVar1111116.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1862011490, i21113, -1, "androidx.compose.material3.NavigationRailItem.<anonymous>.<anonymous> (NavigationRail.kt:238)");
                    }
                    BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(x0VarA.a(pVar1111116, (i12 >> 21) & 14), NavigationRailKt.c(m2VarF1111), 0.0f, 0.0f, 0.0f, 14, null), g2VarD), pVar1111116, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111116, Integer num) {
                    a(pVar1111116, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), aVarB1112, aVarB, z14, c(m2VarF1111), pVarF, ((i12 >> 6) & 57344) | bb.c.b.f31011w5);
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            x0Var2 = x0VarA;
            z16 = z11111119;
            gVar4 = gVar3;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111116 = pVar3;
            z17 = z14;
            pVar4 = pVar1111116;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar19 = nVar3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItem$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar1111117, int i21113) {
                NavigationRailKt.b(z10, onClick, icon, nVar19, z16, pVar4, z17, x0Var2, gVar4, pVar1111117, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111117, Integer num) {
                a(pVar1111117, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void d(final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, final boolean z10, final float f10, androidx.compose.runtime.p pVar5, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar5.F(-876426901);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(pVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(pVar2) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(pVar3) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(pVar4) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= pVarF.u(z10) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= pVarF.w(f10) ? 131072 : 65536;
        }
        if ((374491 & i11) == 74898 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-876426901, i11, -1, "androidx.compose.material3.NavigationRailItemBaselineLayout (NavigationRail.kt:381)");
            }
            a aVar = new a(f10, pVar4, z10);
            pVarF.T(-1323940314);
            androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(companion);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            Updater.j(pVarB, aVar, companion2.d());
            Updater.j(pVarB, eVar, companion2.b());
            Updater.j(pVarB, layoutDirection, companion2.c());
            Updater.j(pVarB, d2Var, companion2.f());
            pVarF.x();
            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(2083574754);
            pVar.invoke(pVarF, Integer.valueOf(i11 & 14));
            pVarF.T(935754904);
            if (f10 > 0.0f) {
                pVar2.invoke(pVarF, Integer.valueOf((i11 >> 3) & 14));
            }
            pVarF.c0();
            androidx.compose.ui.n nVarB = LayoutIdKt.b(companion, "icon");
            pVarF.T(733328855);
            androidx.compose.ui.c.Companion companion3 = androidx.compose.ui.c.INSTANCE;
            androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(companion3.C(), false, pVarF, 0);
            pVarF.T(-1323940314);
            s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<ComposeUiNode> aVarA2 = companion2.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarB);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.getInserting()) {
                pVarF.L(aVarA2);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
            Updater.j(pVarB2, i0VarK, companion2.d());
            Updater.j(pVarB2, eVar2, companion2.b());
            Updater.j(pVarB2, layoutDirection2, companion2.c());
            Updater.j(pVarB2, d2Var2, companion2.f());
            pVarF.x();
            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
            pVarF.T(-1582262808);
            pVar3.invoke(pVarF, Integer.valueOf((i11 >> 6) & 14));
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (pVar4 != null) {
                androidx.compose.ui.n nVarA = androidx.compose.ui.draw.a.a(LayoutIdKt.b(companion, "label"), z10 ? 1.0f : f10);
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(companion3.C(), false, pVarF, 0);
                pVarF.T(-1323940314);
                s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                yh.a<ComposeUiNode> aVarA3 = companion2.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarA);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.getInserting()) {
                    pVarF.L(aVarA3);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                Updater.j(pVarB3, i0VarK2, companion2.d());
                Updater.j(pVarB3, eVar3, companion2.b());
                Updater.j(pVarB3, layoutDirection3, companion2.c());
                Updater.j(pVarB3, d2Var3, companion2.f());
                pVarF.x();
                qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                pVarF.T(6101178);
                pVar4.invoke(pVarF, Integer.valueOf((i11 >> 9) & 14));
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        androidx.compose.runtime.u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$NavigationRailItemBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i12) {
                NavigationRailKt.d(pVar, pVar2, pVar3, pVar4, z10, f10, pVar6, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                a(pVar6, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    public static final float m() {
        return f10040i;
    }

    public static final float n() {
        return f10041j;
    }

    public static final float o() {
        return f10039h;
    }

    public static final float p() {
        return f10036e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.j0 q(androidx.compose.ui.layout.l0 l0Var, final androidx.compose.ui.layout.e1 e1Var, final androidx.compose.ui.layout.e1 e1Var2, final androidx.compose.ui.layout.e1 e1Var3, long j10) {
        final int iG = s1.c.g(j10, Math.max(e1Var.getWidth(), Math.max(e1Var2.getWidth(), e1Var3 != null ? e1Var3.getWidth() : 0)));
        final int iO = s1.b.o(j10);
        final int width = (iG - e1Var.getWidth()) / 2;
        final int height = (iO - e1Var.getHeight()) / 2;
        final int width2 = (iG - e1Var2.getWidth()) / 2;
        final int height2 = (iO - e1Var2.getHeight()) / 2;
        return androidx.compose.ui.layout.k0.p(l0Var, iG, iO, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1 e1Var4 = e1Var3;
                if (e1Var4 != null) {
                    androidx.compose.ui.layout.e1.a.v(layout, e1Var4, (iG - e1Var4.getWidth()) / 2, (iO - e1Var4.getHeight()) / 2, 0.0f, 4, null);
                }
                androidx.compose.ui.layout.e1.a.v(layout, e1Var, width, height, 0.0f, 4, null);
                androidx.compose.ui.layout.e1.a.v(layout, e1Var2, width2, height2, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return kotlin.b2.f124493a;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.j0 r(final androidx.compose.ui.layout.l0 l0Var, final androidx.compose.ui.layout.e1 e1Var, final androidx.compose.ui.layout.e1 e1Var2, final androidx.compose.ui.layout.e1 e1Var3, final androidx.compose.ui.layout.e1 e1Var4, long j10, final boolean z10, final float f10) {
        int iO = s1.b.o(j10);
        int height = iO - e1Var.getHeight();
        float f11 = f10041j;
        final int iE1 = height - l0Var.e1(f11);
        final int iE2 = l0Var.e1(f11);
        final int iL0 = di.d.L0(((z10 ? iE2 : (iO - e1Var2.getHeight()) / 2) - iE2) * (1 - f10));
        final int iG = s1.c.g(j10, Math.max(e1Var2.getWidth(), Math.max(e1Var.getWidth(), e1Var4 != null ? e1Var4.getWidth() : 0)));
        final int width = (iG - e1Var.getWidth()) / 2;
        final int width2 = (iG - e1Var2.getWidth()) / 2;
        final int width3 = (iG - e1Var3.getWidth()) / 2;
        final int iE3 = iE2 - l0Var.e1(f10043l);
        return androidx.compose.ui.layout.k0.p(l0Var, iG, iO, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.NavigationRailKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x003a  */
            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1 e1Var5 = e1Var4;
                if (e1Var5 != null) {
                    androidx.compose.ui.layout.e1.a.v(layout, e1Var5, (iG - e1Var5.getWidth()) / 2, iL0 + (iE2 - l0Var.e1(NavigationRailKt.f10043l)), 0.0f, 4, null);
                }
                if (z10) {
                    androidx.compose.ui.layout.e1.a.v(layout, e1Var, width, iE1 + iL0, 0.0f, 4, null);
                } else {
                    if (!(f10 == 0.0f)) {
                        androidx.compose.ui.layout.e1.a.v(layout, e1Var, width, iE1 + iL0, 0.0f, 4, null);
                    }
                }
                androidx.compose.ui.layout.e1.a.v(layout, e1Var2, width2, iE2 + iL0, 0.0f, 4, null);
                androidx.compose.ui.layout.e1.a.v(layout, e1Var3, width3, iE3 + iL0, 0.0f, 4, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return kotlin.b2.f124493a;
            }
        }, 4, null);
    }
}
