package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
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

/* JADX INFO: compiled from: NavigationBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0010\u001ae\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f¢\u0006\u0002\b\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0085\u0001\u0010\u001d\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00132\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00112\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0002\b\f2\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001am\u0010#\u001a\u00020\u000b2\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0011\u0010\u0015\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0013¢\u0006\u0002\b\f2\u0013\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0013¢\u0006\u0002\b\f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0003¢\u0006\u0004\b#\u0010$\u001a;\u0010-\u001a\u00020,*\u00020%2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001aS\u00100\u001a\u00020,*\u00020%2\u0006\u0010/\u001a\u00020&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\"\u0014\u00104\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u00103\"\u0014\u00105\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u00103\"\u0014\u00107\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00103\"\u0014\u00109\u001a\u0002028\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00103\"\u0017\u0010<\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010?\u001a\u00020=8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010>\"\u001d\u0010C\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010;\u001a\u0004\bA\u0010B\"\u001d\u0010F\u001a\u00020\u00058\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010;\u001a\u0004\bE\u0010B\"\u0017\u0010H\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bG\u0010;\"\u0017\u0010J\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bI\u0010;\"\u0017\u0010L\u001a\u00020\u00058\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\bK\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006M"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "Ls1/h;", "tonalElevation", "Landroidx/compose/foundation/layout/h1;", "windowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/x0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", ak.av, "(Landroidx/compose/ui/n;JJFLandroidx/compose/foundation/layout/h1;Lyh/q;Landroidx/compose/runtime/p;II)V", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/material3/s0;", "colors", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "b", "(Landroidx/compose/foundation/layout/x0;ZLyh/a;Lyh/p;Landroidx/compose/ui/n;ZLyh/p;ZLandroidx/compose/material3/s0;Landroidx/compose/foundation/interaction/g;Landroidx/compose/runtime/p;II)V", NavigationBarKt.f9820a, NavigationBarKt.f9821b, "", "animationProgress", "f", "(Lyh/p;Lyh/p;Lyh/p;Lyh/p;ZFLandroidx/compose/runtime/p;I)V", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/e1;", "iconPlaceable", "indicatorRipplePlaceable", "indicatorPlaceable", "Ls1/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "q", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;J)Landroidx/compose/ui/layout/j0;", "labelPlaceable", "r", "(Landroidx/compose/ui/layout/l0;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;Landroidx/compose/ui/layout/e1;JZF)Landroidx/compose/ui/layout/j0;", "", "Ljava/lang/String;", "IndicatorRippleLayoutIdTag", "IndicatorLayoutIdTag", ak.aF, "IconLayoutIdTag", "d", "LabelLayoutIdTag", "e", "F", "NavigationBarHeight", "", "I", "ItemAnimationDurationMillis", "g", "o", "()F", "NavigationBarItemHorizontalPadding", RXScreenCaptureService.KEY_HEIGHT, "p", "NavigationBarItemVerticalPadding", "i", "IndicatorHorizontalPadding", "j", "IndicatorVerticalPadding", "k", "IndicatorVerticalOffset", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class NavigationBarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final String f9820a = "indicatorRipple";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final String f9821b = "indicator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f9822c = "icon";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final String f9823d = "label";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f9824e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f9825f = 100;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f9826g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f9827h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f9828i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f9829j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f9830k;

    /* JADX INFO: compiled from: NavigationBar.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a implements androidx.compose.ui.layout.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f9879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> f9880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f9881c;

        /* JADX WARN: Multi-variable type inference failed */
        a(float f10, yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, boolean z10) {
            this.f9879a = f10;
            this.f9880b = pVar;
            this.f9881c = z10;
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
                    int width = e1VarZ2.getWidth() + Layout.e1(s1.h.g(NavigationBarKt.f9828i * f10));
                    int iL0 = di.d.L0(width * this.f9879a);
                    int height = e1VarZ2.getHeight() + Layout.e1(s1.h.g(NavigationBarKt.f9829j * f10));
                    for (androidx.compose.ui.layout.g0 g0Var3 : measurables) {
                        if (kotlin.jvm.internal.f0.g(LayoutIdKt.a(g0Var3), NavigationBarKt.f9820a)) {
                            androidx.compose.ui.layout.e1 e1VarZ3 = g0Var3.z1(s1.b.f139198b.c(width, height));
                            Iterator<T> it = measurables.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!kotlin.jvm.internal.f0.g(LayoutIdKt.a((androidx.compose.ui.layout.g0) next), NavigationBarKt.f9821b));
                            androidx.compose.ui.layout.g0 g0Var4 = (androidx.compose.ui.layout.g0) next;
                            androidx.compose.ui.layout.e1 e1VarZ4 = g0Var4 != null ? g0Var4.z1(s1.b.f139198b.c(iL0, height)) : null;
                            if (this.f9880b != null) {
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
                            if (this.f9880b == null) {
                                return NavigationBarKt.q(Layout, e1VarZ2, e1VarZ3, e1VarZ4, j10);
                            }
                            kotlin.jvm.internal.f0.m(e1VarZ1);
                            return NavigationBarKt.r(Layout, e1VarZ1, e1VarZ2, e1VarZ3, e1VarZ4, j10, this.f9881c, this.f9879a);
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
        t0.f0 f0Var = t0.f0.f139726a;
        f9824e = f0Var.o();
        f9826g = s1.h.g(8);
        f9827h = s1.h.g(16);
        float f10 = 2;
        f9828i = s1.h.g(s1.h.g(f0Var.i() - f0Var.r()) / f10);
        f9829j = s1.h.g(s1.h.g(f0Var.g() - f0Var.r()) / f10);
        f9830k = s1.h.g(12);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:104:0x013e  */
    /* JADX WARN: Code duplicated, block: B:107:0x017c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0188  */
    /* JADX WARN: Code duplicated, block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, long j10, long j11, float f10, @dl.e androidx.compose.foundation.layout.h1 h1Var, @dl.d final yh.q<? super androidx.compose.foundation.layout.x0, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        androidx.compose.ui.n nVar2;
        int i12;
        long jA;
        long jB;
        float fB;
        final androidx.compose.foundation.layout.h1 h1VarC;
        int i13;
        androidx.compose.ui.n nVar3;
        float f11;
        final int i14;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1596802123);
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
            jB = j11;
            i12 |= ((i11 & 4) == 0 && pVarF.z(jB)) ? 256 : 128;
        } else {
            jB = j11;
        }
        int i17 = i11 & 8;
        if (i17 == 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                fB = f10;
                i12 |= pVarF.w(fB) ? 2048 : 1024;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    h1VarC = h1Var;
                    int i18 = pVarF.s(h1VarC) ? 16384 : 8192;
                    i12 |= i18;
                } else {
                    h1VarC = h1Var;
                }
                i12 |= i18;
            } else {
                h1VarC = h1Var;
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
                            jA = r0.f12097a.a(pVarF, 6);
                            i12 &= com.ss.android.ttvecamera.o.f97695q;
                        }
                        if ((i11 & 4) != 0) {
                            jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                            i12 &= -897;
                        }
                        if (i17 != 0) {
                            fB = r0.f12097a.b();
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            h1VarC = r0.f12097a.c(pVarF, 6);
                        }
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
                    f11 = fB;
                    long j12 = jB;
                    i14 = i12;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                    }
                    androidx.compose.runtime.internal.a aVarB = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                                ComposerKt.w0(105663120, i19, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                            }
                            androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                            Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                            yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                            int i20 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                            pVar2.T(693286680);
                            int i21 = i20 >> 3;
                            androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i21 & 112) | (i21 & 14));
                            pVar2.T(-1323940314);
                            s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA = companion.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                            int i22 = ((((i20 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                            Updater.j(pVarB, i0VarD, companion.d());
                            Updater.j(pVarB, eVar, companion.b());
                            Updater.j(pVarB, layoutDirection, companion.c());
                            Updater.j(pVarB, d2Var, companion.f());
                            pVar2.x();
                            qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i22 >> 3) & 112));
                            pVar2.T(2058660585);
                            pVar2.T(-678309503);
                            if (((i22 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                            } else {
                                qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i20 >> 6) & 112) | 6));
                            }
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
                    int i21 = i19 | (i20 & bb.c.b.f30796me) | (i20 & bb.c.g.f32954lc) | (i20 & 57344);
                    androidx.compose.foundation.layout.h1 h1Var2 = h1VarC;
                    SurfaceKt.a(nVar3, null, jA, j12, f11, 0.0f, null, aVarB, pVarF, i21, 98);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    h1VarC = h1Var2;
                    jB = j12;
                } else {
                    pVarF.l();
                    nVar3 = nVar2;
                    f11 = fB;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar4 = nVar3;
                final long j13 = jA;
                final long j14 = jB;
                final float f12 = f11;
                final androidx.compose.foundation.layout.h1 h1Var3 = h1VarC;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                        NavigationBarKt.a(nVar4, j13, j14, f12, h1Var3, content, pVar2, i10 | 1, i11);
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
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                }
                f11 = fB;
                long j15 = jB;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                            ComposerKt.w0(105663120, i110, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                        }
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                        yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i22 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                        pVar2.T(693286680);
                        int i23 = i22 >> 3;
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i23 & 112) | (i23 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        int i24 = ((((i22 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i24 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        if (((i24 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i22 >> 6) & 112) | 6));
                        }
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
                int i23 = i110 | (i22 & bb.c.b.f30796me) | (i22 & bb.c.g.f32954lc) | (i22 & 57344);
                androidx.compose.foundation.layout.h1 h1Var4 = h1VarC;
                SurfaceKt.a(nVar3, null, jA, j15, f11, 0.0f, null, aVarB2, pVarF, i23, 98);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1VarC = h1Var4;
                jB = j15;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                }
                f11 = fB;
                long j16 = jB;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                            ComposerKt.w0(105663120, i111, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                        }
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                        yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i24 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                        pVar2.T(693286680);
                        int i25 = i24 >> 3;
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i25 & 112) | (i25 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        int i26 = ((((i24 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i26 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        if (((i26 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i24 >> 6) & 112) | 6));
                        }
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
                int i25 = i111 | (i24 & bb.c.b.f30796me) | (i24 & bb.c.g.f32954lc) | (i24 & 57344);
                androidx.compose.foundation.layout.h1 h1Var5 = h1VarC;
                SurfaceKt.a(nVar3, null, jA, j16, f11, 0.0f, null, aVarB3, pVarF, i25, 98);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1VarC = h1Var5;
                jB = j16;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar5 = nVar3;
            final long j17 = jA;
            final long j18 = jB;
            final float f13 = f11;
            final androidx.compose.foundation.layout.h1 h1Var6 = h1VarC;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                    NavigationBarKt.a(nVar5, j17, j18, f13, h1Var6, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        fB = f10;
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                h1VarC = h1Var;
                if (pVarF.s(h1VarC)) {
                }
                i12 |= i18;
            } else {
                h1VarC = h1Var;
            }
            i12 |= i18;
        } else {
            h1VarC = h1Var;
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
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                }
                f11 = fB;
                long j19 = jB;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                            ComposerKt.w0(105663120, i112, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                        }
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                        yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i26 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                        pVar2.T(693286680);
                        int i27 = i26 >> 3;
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i27 & 112) | (i27 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        int i28 = ((((i26 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i28 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        if (((i28 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i26 >> 6) & 112) | 6));
                        }
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
                int i27 = i112 | (i26 & bb.c.b.f30796me) | (i26 & bb.c.g.f32954lc) | (i26 & 57344);
                androidx.compose.foundation.layout.h1 h1Var7 = h1VarC;
                SurfaceKt.a(nVar3, null, jA, j19, f11, 0.0f, null, aVarB4, pVarF, i27, 98);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1VarC = h1Var7;
                jB = j19;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                } else {
                    if (i15 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if ((i11 & 2) != 0) {
                        jA = r0.f12097a.a(pVarF, 6);
                        i12 &= com.ss.android.ttvecamera.o.f97695q;
                    }
                    if ((i11 & 4) != 0) {
                        jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                        i12 &= -897;
                    }
                    if (i17 != 0) {
                        fB = r0.f12097a.b();
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        h1VarC = r0.f12097a.c(pVarF, 6);
                    }
                }
                f11 = fB;
                long j110 = jB;
                i14 = i12;
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
                }
                androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                            ComposerKt.w0(105663120, i113, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                        }
                        androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                        Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                        yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                        int i28 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                        pVar2.T(693286680);
                        int i29 = i28 >> 3;
                        androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i29 & 112) | (i29 & 14));
                        pVar2.T(-1323940314);
                        s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA = companion.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                        int i210 = ((((i28 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                        Updater.j(pVarB, i0VarD, companion.d());
                        Updater.j(pVarB, eVar, companion.b());
                        Updater.j(pVarB, layoutDirection, companion.c());
                        Updater.j(pVarB, d2Var, companion.f());
                        pVar2.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i210 >> 3) & 112));
                        pVar2.T(2058660585);
                        pVar2.T(-678309503);
                        if (((i210 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                        } else {
                            qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i28 >> 6) & 112) | 6));
                        }
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
                int i29 = i113 | (i28 & bb.c.b.f30796me) | (i28 & bb.c.g.f32954lc) | (i28 & 57344);
                androidx.compose.foundation.layout.h1 h1Var8 = h1VarC;
                SurfaceKt.a(nVar3, null, jA, j110, f11, 0.0f, null, aVarB5, pVarF, i29, 98);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                h1VarC = h1Var8;
                jB = j110;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar6 = nVar3;
            final long j111 = jA;
            final long j112 = jB;
            final float f14 = f11;
            final androidx.compose.foundation.layout.h1 h1Var9 = h1VarC;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                    NavigationBarKt.a(nVar6, j111, j112, f14, h1Var9, content, pVar2, i10 | 1, i11);
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
                    jA = r0.f12097a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fB = r0.f12097a.b();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarC = r0.f12097a.c(pVarF, 6);
                }
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = r0.f12097a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fB = r0.f12097a.b();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarC = r0.f12097a.c(pVarF, 6);
                }
            }
            f11 = fB;
            long j113 = jB;
            i14 = i12;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
            }
            androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                        ComposerKt.w0(105663120, i114, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                    }
                    androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                    Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                    yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i210 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                    pVar2.T(693286680);
                    int i211 = i210 >> 3;
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i211 & 112) | (i211 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                    int i212 = ((((i210 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                    Updater.j(pVarB, i0VarD, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i212 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-678309503);
                    if (((i212 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i210 >> 6) & 112) | 6));
                    }
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
            int i211 = i114 | (i210 & bb.c.b.f30796me) | (i210 & bb.c.g.f32954lc) | (i210 & 57344);
            androidx.compose.foundation.layout.h1 h1Var10 = h1VarC;
            SurfaceKt.a(nVar3, null, jA, j113, f11, 0.0f, null, aVarB6, pVarF, i211, 98);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            h1VarC = h1Var10;
            jB = j113;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = r0.f12097a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fB = r0.f12097a.b();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarC = r0.f12097a.c(pVarF, 6);
                }
            } else {
                if (i15 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if ((i11 & 2) != 0) {
                    jA = r0.f12097a.a(pVarF, 6);
                    i12 &= com.ss.android.ttvecamera.o.f97695q;
                }
                if ((i11 & 4) != 0) {
                    jB = ColorSchemeKt.b(o0.f12059a.a(pVarF, 6), jA);
                    i12 &= -897;
                }
                if (i17 != 0) {
                    fB = r0.f12097a.b();
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    h1VarC = r0.f12097a.c(pVarF, 6);
                }
            }
            f11 = fB;
            long j114 = jB;
            i14 = i12;
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(1596802123, i14, -1, "androidx.compose.material3.NavigationBar (NavigationBar.kt:98)");
            }
            androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, 105663120, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$1
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
                        ComposerKt.w0(105663120, i115, -1, "androidx.compose.material3.NavigationBar.<anonymous> (NavigationBar.kt:111)");
                    }
                    androidx.compose.ui.n nVarA = SelectableGroupKt.a(SizeKt.o(WindowInsetsPaddingKt.d(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), h1VarC), NavigationBarKt.f9824e));
                    Arrangement.e eVarZ = Arrangement.f5896a.z(NavigationBarKt.o());
                    yh.q<androidx.compose.foundation.layout.x0, androidx.compose.runtime.p, Integer, kotlin.b2> qVar = content;
                    int i212 = ((i14 >> 6) & bb.c.g.f32954lc) | 48;
                    pVar2.T(693286680);
                    int i213 = i212 >> 3;
                    androidx.compose.ui.layout.i0 i0VarD = RowKt.d(eVarZ, androidx.compose.ui.c.INSTANCE.w(), pVar2, (i213 & 112) | (i213 & 14));
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA);
                    int i214 = ((((i212 << 3) & 112) << 9) & bb.c.g.f32954lc) | 6;
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
                    Updater.j(pVarB, i0VarD, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar2)), pVar2, Integer.valueOf((i214 >> 3) & 112));
                    pVar2.T(2058660585);
                    pVar2.T(-678309503);
                    if (((i214 >> 9) & 14 & 11) == 2 && pVar2.b()) {
                        pVar2.l();
                    } else {
                        qVar.invoke(RowScopeInstance.f6091a, pVar2, Integer.valueOf(((i212 >> 6) & 112) | 6));
                    }
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
            int i213 = i115 | (i212 & bb.c.b.f30796me) | (i212 & bb.c.g.f32954lc) | (i212 & 57344);
            androidx.compose.foundation.layout.h1 h1Var11 = h1VarC;
            SurfaceKt.a(nVar3, null, jA, j114, f11, 0.0f, null, aVarB7, pVarF, i213, 98);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            h1VarC = h1Var11;
            jB = j114;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar7 = nVar3;
        final long j115 = jA;
        final long j116 = jB;
        final float f15 = f11;
        final androidx.compose.foundation.layout.h1 h1Var12 = h1VarC;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBar$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                NavigationBarKt.a(nVar7, j115, j116, f15, h1Var12, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0135  */
    /* JADX WARN: Code duplicated, block: B:104:0x0138  */
    /* JADX WARN: Code duplicated, block: B:109:0x014b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0184  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:126:0x018b  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:130:0x0192  */
    /* JADX WARN: Code duplicated, block: B:133:0x0197  */
    /* JADX WARN: Code duplicated, block: B:134:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:146:0x0219  */
    /* JADX WARN: Code duplicated, block: B:147:0x0226  */
    /* JADX WARN: Code duplicated, block: B:150:0x023c  */
    /* JADX WARN: Code duplicated, block: B:153:0x0296  */
    /* JADX WARN: Code duplicated, block: B:155:0x029c  */
    /* JADX WARN: Code duplicated, block: B:158:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x0305  */
    /* JADX WARN: Code duplicated, block: B:162:0x0309  */
    /* JADX WARN: Code duplicated, block: B:165:0x0358  */
    /* JADX WARN: Code duplicated, block: B:166:0x035b  */
    /* JADX WARN: Code duplicated, block: B:169:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:174:0x041d  */
    /* JADX WARN: Code duplicated, block: B:179:0x042f  */
    /* JADX WARN: Code duplicated, block: B:181:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:87:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:92:0x0113 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0120  */
    /* JADX WARN: Code duplicated, block: B:99:0x0125  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final androidx.compose.foundation.layout.x0 x0Var, final boolean z10, @dl.d final yh.a<kotlin.b2> onClick, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> icon, @dl.e androidx.compose.ui.n nVar, boolean z11, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, boolean z12, @dl.e s0 s0Var, @dl.e androidx.compose.foundation.interaction.g gVar, @dl.e androidx.compose.runtime.p pVar2, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        int i15;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3;
        int i16;
        int i17;
        boolean z13;
        int i18;
        int i19;
        androidx.compose.foundation.interaction.g gVar2;
        int i20;
        boolean z14;
        final s0 s0VarA;
        final int i21;
        androidx.compose.foundation.interaction.g gVar3;
        Object objU;
        androidx.compose.runtime.internal.a aVarB;
        Object objU2;
        androidx.compose.runtime.p.Companion companion;
        final androidx.compose.runtime.a1 a1Var;
        boolean zS;
        Object objU3;
        androidx.compose.ui.n nVar3;
        yh.a<ComposeUiNode> aVarA;
        float f10;
        long jA;
        boolean zS2;
        Object objU4;
        final androidx.compose.foundation.interaction.g gVar4;
        final s0 s0Var2;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4;
        final boolean z15;
        final boolean z16;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(x0Var, "<this>");
        kotlin.jvm.internal.f0.p(onClick, "onClick");
        kotlin.jvm.internal.f0.p(icon, "icon");
        androidx.compose.runtime.p pVarF = pVar2.F(-663510974);
        if ((Integer.MIN_VALUE & i11) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(x0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.u(z10) ? 32 : 16;
        }
        if ((i11 & 2) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(onClick) ? 256 : 128;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(icon) ? 2048 : 1024;
        }
        int i22 = i11 & 8;
        if (i22 == 0) {
            if ((i10 & 57344) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 16384 : 8192;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    if (pVarF.u(z11)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= 1572864;
                    pVar3 = pVar;
                } else {
                    pVar3 = pVar;
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(pVar3)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 12582912;
                    z13 = z12;
                } else {
                    z13 = z12;
                    if ((i10 & 29360128) == 0) {
                        if (pVarF.u(z13)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i10 & 234881024) != 0) {
                    i12 |= ((i11 & 256) == 0 || !pVarF.s(s0Var)) ? 33554432 : 67108864;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 1879048192) == 0) {
                        gVar2 = gVar;
                        if (pVarF.s(gVar2)) {
                            i20 = 536870912;
                        } else {
                            i20 = 268435456;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 1533916891) == 306783378 || !pVarF.b()) {
                        pVarF.W();
                        if ((i10 & 1) != 0 || pVarF.o()) {
                            if (i22 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                pVar3 = null;
                            }
                            if (i17 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 128) != 0) {
                                s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                                i12 &= -234881025;
                            } else {
                                s0VarA = s0Var;
                            }
                            if (i19 != 0) {
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = androidx.compose.foundation.interaction.f.a();
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                androidx.compose.foundation.interaction.g gVar5 = (androidx.compose.foundation.interaction.g) objU;
                                i21 = i12;
                                gVar3 = gVar5;
                            } else {
                                i21 = i12;
                                gVar3 = gVar;
                            }
                        } else {
                            pVarF.l();
                            if ((i11 & 128) != 0) {
                                i12 &= -234881025;
                            }
                            z14 = z11;
                            s0VarA = s0Var;
                            i21 = i12;
                            gVar3 = gVar2;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                        }
                        final s0 s0Var3 = s0VarA;
                        final int i23 = i21;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5 = pVar3;
                        final boolean z17 = z13;
                        androidx.compose.runtime.internal.a aVarB2 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i24) {
                                if ((i24 & 11) == 2 && pVar6.b()) {
                                    pVar6.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1419576100, i24, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                                }
                                s0 s0Var4 = s0Var3;
                                boolean z18 = z10;
                                int i25 = i23;
                                m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var4.b(z18, pVar6, ((i25 >> 21) & 112) | ((i25 >> 3) & 14));
                                androidx.compose.ui.n nVarA = pVar5 != null && (z17 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                                int i26 = i23;
                                pVar6.T(733328855);
                                androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar6, 0);
                                pVar6.T(-1323940314);
                                s1.e eVar = (s1.e) pVar6.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVar6.K(CompositionLocalsKt.p());
                                androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVar6.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                yh.a<ComposeUiNode> aVarA2 = companion2.a();
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
                                Updater.j(pVarB, i0VarK, companion2.d());
                                Updater.j(pVarB, eVar, companion2.b());
                                Updater.j(pVarB, layoutDirection, companion2.c());
                                Updater.j(pVarB, d2Var, companion2.f());
                                pVar6.x();
                                qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar6)), pVar6, 0);
                                pVar6.T(2058660585);
                                pVar6.T(-2137368960);
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                                pVar6.T(2060475106);
                                CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar7, pVar6, ((i26 >> 6) & 112) | 8);
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
                            aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                                public final void a(@dl.e androidx.compose.runtime.p pVar6, int i24) {
                                    if ((i24 & 11) == 2 && pVar6.b()) {
                                        pVar6.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1644987592, i24, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                    }
                                    final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar6, 6), t0.f0.f139726a.A());
                                    s0 s0Var4 = s0VarA;
                                    boolean z18 = z10;
                                    int i25 = i21;
                                    androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var4.c(z18, pVar6, ((i25 >> 21) & 112) | ((i25 >> 3) & 14)))))};
                                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = pVar3;
                                    final int i26 = i21;
                                    CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar6, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar8, int i27) {
                                            if ((i27 & 11) == 2 && pVar8.b()) {
                                                pVar8.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(2061683080, i27, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                            }
                                            TextKt.a(textStyleA, pVar7, pVar8, (i26 >> 15) & 112);
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
                        pVarF.T(-492369756);
                        objU2 = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar3;
                        if (objU2 == companion.a()) {
                            androidx.compose.runtime.a1 a1VarG = h2.g(0, null, 2, null);
                            pVarF.N(a1VarG);
                            objU2 = a1VarG;
                        }
                        pVarF.c0();
                        a1Var = (androidx.compose.runtime.a1) objU2;
                        androidx.compose.ui.n nVarA = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                        pVarF.T(1157296644);
                        zS = pVarF.s(a1Var);
                        boolean z18 = z14;
                        objU3 = pVarF.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                public final void a(long j10) {
                                    NavigationBarKt.d(a1Var, s1.r.m(j10));
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                    a(rVar.getF139248a());
                                    return kotlin.b2.f124493a;
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarA2 = OnRemeasuredModifierKt.a(nVarA, (yh.l) objU3);
                        androidx.compose.ui.c cVarI = androidx.compose.ui.c.INSTANCE.i();
                        pVarF.T(733328855);
                        nVar3 = nVar2;
                        androidx.compose.ui.layout.i0 i0VarK = BoxKt.k(cVarI, false, pVarF, 6);
                        pVarF.T(-1323940314);
                        s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        aVarA = companion2.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF = LayoutKt.f(nVarA2);
                        boolean z19 = z13;
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
                        Updater.j(pVarB, i0VarK, companion2.d());
                        Updater.j(pVarB, eVar, companion2.b());
                        Updater.j(pVarB, layoutDirection, companion2.c());
                        Updater.j(pVarB, d2Var, companion2.f());
                        pVarF.x();
                        qVarF.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarF.T(-2137368960);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                        pVarF.T(1796243068);
                        if (z10) {
                            f10 = 1.0f;
                        } else {
                            f10 = 0.0f;
                        }
                        final m2 m2VarF = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                        s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        jA = b1.g.a((c(a1Var) - eVar2.e1(t0.f0.f139726a.i())) / 2, eVar2.E1(f9830k));
                        kotlin.b2 b2Var = kotlin.b2.f124493a;
                        b1.f fVarD = b1.f.d(jA);
                        pVarF.T(511388516);
                        zS2 = pVarF.s(fVarD) | pVarF.s(gVar3);
                        objU4 = pVarF.U();
                        if (zS2 || objU4 == companion.a()) {
                            objU4 = new MappedInteractionSource(gVar3, jA, null);
                            pVarF.N(objU4);
                        }
                        pVarF.c0();
                        final MappedInteractionSource mappedInteractionSource = (MappedInteractionSource) objU4;
                        f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar7, int i24) {
                                if ((i24 & 11) == 2 && pVar7.b()) {
                                    pVar7.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(691730997, i24, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                                }
                                BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar7, 6)), mappedInteractionSource, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar7, 0, 7)), pVar7, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                a(pVar7, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar7, int i24) {
                                if ((i24 & 11) == 2 && pVar7.b()) {
                                    pVar7.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-474426875, i24, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                                }
                                BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar7, 6)), pVar7, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                                a(pVar7, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), aVarB2, aVarB, z19, e(m2VarF), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        gVar4 = gVar3;
                        s0Var2 = s0VarA;
                        pVar4 = pVar6;
                        z15 = z18;
                        z16 = z19;
                    } else {
                        pVarF.l();
                        z15 = z11;
                        z16 = z13;
                        pVar4 = pVar3;
                        nVar3 = nVar2;
                        gVar4 = gVar2;
                        s0Var2 = s0Var;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar4 = nVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar7, int i24) {
                            NavigationBarKt.b(x0Var, z10, onClick, icon, nVar4, z15, pVar4, z16, s0Var2, gVar4, pVar7, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                            a(pVar7, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i12 |= com.google.android.exoplayer2.j.G;
                gVar2 = gVar;
                if ((i12 & 1533916891) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar6 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar6;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar7 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar7;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    final s0 s0Var4 = s0VarA;
                    final int i24 = i21;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVar3;
                    final boolean z110 = z13;
                    androidx.compose.runtime.internal.a aVarB3 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar8, int i25) {
                            if ((i25 & 11) == 2 && pVar8.b()) {
                                pVar8.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1419576100, i25, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                            }
                            s0 s0Var5 = s0Var4;
                            boolean z111 = z10;
                            int i26 = i24;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var5.b(z111, pVar8, ((i26 >> 21) & 112) | ((i26 >> 3) & 14));
                            androidx.compose.ui.n nVarA3 = pVar7 != null && (z110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                            int i27 = i24;
                            pVar8.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar8, 0);
                            pVar8.T(-1323940314);
                            s1.e eVar3 = (s1.e) pVar8.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVar8.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVar8.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion3.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA3);
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
                            Updater.j(pVarB2, i0VarK2, companion3.d());
                            Updater.j(pVarB2, eVar3, companion3.b());
                            Updater.j(pVarB2, layoutDirection2, companion3.c());
                            Updater.j(pVarB2, d2Var2, companion3.f());
                            pVar8.x();
                            qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar8)), pVar8, 0);
                            pVar8.T(2058660585);
                            pVar8.T(-2137368960);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                            pVar8.T(2060475106);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar9, pVar8, ((i27 >> 6) & 112) | 8);
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
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i25) {
                                if ((i25 & 11) == 2 && pVar8.b()) {
                                    pVar8.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1644987592, i25, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar8, 6), t0.f0.f139726a.A());
                                s0 s0Var5 = s0VarA;
                                boolean z111 = z10;
                                int i26 = i21;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var5.c(z111, pVar8, ((i26 >> 21) & 112) | ((i26 >> 3) & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar3;
                                final int i27 = i21;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar8, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar10, int i28) {
                                        if ((i28 & 11) == 2 && pVar10.b()) {
                                            pVar10.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(2061683080, i28, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                        }
                                        TextKt.a(textStyleA, pVar9, pVar10, (i27 >> 15) & 112);
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
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar3;
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.a1 a1VarG2 = h2.g(0, null, 2, null);
                        pVarF.N(a1VarG2);
                        objU2 = a1VarG2;
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    androidx.compose.ui.n nVarA3 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    boolean z111 = z14;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarA4 = OnRemeasuredModifierKt.a(nVarA3, (yh.l) objU3);
                    androidx.compose.ui.c cVarI2 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    nVar3 = nVar2;
                    androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(cVarI2, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var2 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    aVarA = companion3.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF2 = LayoutKt.f(nVarA4);
                    boolean z112 = z13;
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
                    Updater.j(pVarB2, i0VarK2, companion3.d());
                    Updater.j(pVarB2, eVar3, companion3.b());
                    Updater.j(pVarB2, layoutDirection2, companion3.c());
                    Updater.j(pVarB2, d2Var2, companion3.f());
                    pVarF.x();
                    qVarF2.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                    pVarF.T(1796243068);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF2 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    jA = b1.g.a((c(a1Var) - eVar4.e1(t0.f0.f139726a.i())) / 2, eVar4.E1(f9830k));
                    kotlin.b2 b2Var2 = kotlin.b2.f124493a;
                    b1.f fVarD2 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(fVarD2) | pVarF.s(gVar3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource2 = (MappedInteractionSource) objU4;
                    f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i25) {
                            if ((i25 & 11) == 2 && pVar9.b()) {
                                pVar9.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(691730997, i25, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar9, 6)), mappedInteractionSource2, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar9, 0, 7)), pVar9, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                            a(pVar9, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i25) {
                            if ((i25 & 11) == 2 && pVar9.b()) {
                                pVar9.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-474426875, i25, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF2), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar9, 6)), pVar9, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                            a(pVar9, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB3, aVarB, z112, e(m2VarF2), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    gVar4 = gVar3;
                    s0Var2 = s0VarA;
                    pVar4 = pVar8;
                    z15 = z111;
                    z16 = z112;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar8 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar8;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar9 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar9;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    final s0 s0Var5 = s0VarA;
                    final int i25 = i21;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar3;
                    final boolean z113 = z13;
                    androidx.compose.runtime.internal.a aVarB4 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i26) {
                            if ((i26 & 11) == 2 && pVar10.b()) {
                                pVar10.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1419576100, i26, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                            }
                            s0 s0Var6 = s0Var5;
                            boolean z114 = z10;
                            int i27 = i25;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var6.b(z114, pVar10, ((i27 >> 21) & 112) | ((i27 >> 3) & 14));
                            androidx.compose.ui.n nVarA5 = pVar9 != null && (z113 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                            int i28 = i25;
                            pVar10.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar10, 0);
                            pVar10.T(-1323940314);
                            s1.e eVar5 = (s1.e) pVar10.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection3 = (LayoutDirection) pVar10.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVar10.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion4.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarA5);
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
                            Updater.j(pVarB3, i0VarK3, companion4.d());
                            Updater.j(pVarB3, eVar5, companion4.b());
                            Updater.j(pVarB3, layoutDirection3, companion4.c());
                            Updater.j(pVarB3, d2Var3, companion4.f());
                            pVar10.x();
                            qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar10)), pVar10, 0);
                            pVar10.T(2058660585);
                            pVar10.T(-2137368960);
                            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                            pVar10.T(2060475106);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar11, pVar10, ((i28 >> 6) & 112) | 8);
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
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar10, int i26) {
                                if ((i26 & 11) == 2 && pVar10.b()) {
                                    pVar10.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1644987592, i26, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar10, 6), t0.f0.f139726a.A());
                                s0 s0Var6 = s0VarA;
                                boolean z114 = z10;
                                int i27 = i21;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var6.c(z114, pVar10, ((i27 >> 21) & 112) | ((i27 >> 3) & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar3;
                                final int i28 = i21;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar10, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar12, int i29) {
                                        if ((i29 & 11) == 2 && pVar12.b()) {
                                            pVar12.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(2061683080, i29, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                        }
                                        TextKt.a(textStyleA, pVar11, pVar12, (i28 >> 15) & 112);
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
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar3;
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.a1 a1VarG3 = h2.g(0, null, 2, null);
                        pVarF.N(a1VarG3);
                        objU2 = a1VarG3;
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    androidx.compose.ui.n nVarA5 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    boolean z114 = z14;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarA6 = OnRemeasuredModifierKt.a(nVarA5, (yh.l) objU3);
                    androidx.compose.ui.c cVarI3 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    nVar3 = nVar2;
                    androidx.compose.ui.layout.i0 i0VarK3 = BoxKt.k(cVarI3, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    aVarA = companion4.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarA6);
                    boolean z115 = z13;
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
                    Updater.j(pVarB3, i0VarK3, companion4.d());
                    Updater.j(pVarB3, eVar5, companion4.b());
                    Updater.j(pVarB3, layoutDirection3, companion4.c());
                    Updater.j(pVarB3, d2Var3, companion4.f());
                    pVarF.x();
                    qVarF3.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                    pVarF.T(1796243068);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF3 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    jA = b1.g.a((c(a1Var) - eVar6.e1(t0.f0.f139726a.i())) / 2, eVar6.E1(f9830k));
                    kotlin.b2 b2Var3 = kotlin.b2.f124493a;
                    b1.f fVarD3 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(fVarD3) | pVarF.s(gVar3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource3 = (MappedInteractionSource) objU4;
                    f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i26) {
                            if ((i26 & 11) == 2 && pVar11.b()) {
                                pVar11.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(691730997, i26, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar11, 6)), mappedInteractionSource3, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar11, 0, 7)), pVar11, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar11, int i26) {
                            if ((i26 & 11) == 2 && pVar11.b()) {
                                pVar11.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-474426875, i26, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF3), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar11, 6)), pVar11, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                            a(pVar11, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB4, aVarB, z115, e(m2VarF3), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    gVar4 = gVar3;
                    s0Var2 = s0VarA;
                    pVar4 = pVar10;
                    z15 = z114;
                    z16 = z115;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar5 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i26) {
                        NavigationBarKt.b(x0Var, z10, onClick, icon, nVar5, z15, pVar4, z16, s0Var2, gVar4, pVar11, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= androidx.profileinstaller.o.c.f26824k;
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= 1572864;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(pVar3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                z13 = z12;
            } else {
                z13 = z12;
                if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z13)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 256) == 0 || !pVarF.s(s0Var)) ? 33554432 : 67108864;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 1879048192) == 0) {
                    gVar2 = gVar;
                    if (pVarF.s(gVar2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar10 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar10;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar11 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar11;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    final s0 s0Var6 = s0VarA;
                    final int i26 = i21;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar3;
                    final boolean z116 = z13;
                    androidx.compose.runtime.internal.a aVarB5 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar12, int i27) {
                            if ((i27 & 11) == 2 && pVar12.b()) {
                                pVar12.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1419576100, i27, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                            }
                            s0 s0Var7 = s0Var6;
                            boolean z117 = z10;
                            int i28 = i26;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var7.b(z117, pVar12, ((i28 >> 21) & 112) | ((i28 >> 3) & 14));
                            androidx.compose.ui.n nVarA7 = pVar11 != null && (z116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                            int i29 = i26;
                            pVar12.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK4 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar12, 0);
                            pVar12.T(-1323940314);
                            s1.e eVar7 = (s1.e) pVar12.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection4 = (LayoutDirection) pVar12.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVar12.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion5.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVarA7);
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
                            Updater.j(pVarB4, i0VarK4, companion5.d());
                            Updater.j(pVarB4, eVar7, companion5.b());
                            Updater.j(pVarB4, layoutDirection4, companion5.c());
                            Updater.j(pVarB4, d2Var4, companion5.f());
                            pVar12.x();
                            qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar12)), pVar12, 0);
                            pVar12.T(2058660585);
                            pVar12.T(-2137368960);
                            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                            pVar12.T(2060475106);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar13, pVar12, ((i29 >> 6) & 112) | 8);
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
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i27) {
                                if ((i27 & 11) == 2 && pVar12.b()) {
                                    pVar12.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1644987592, i27, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar12, 6), t0.f0.f139726a.A());
                                s0 s0Var7 = s0VarA;
                                boolean z117 = z10;
                                int i28 = i21;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var7.c(z117, pVar12, ((i28 >> 21) & 112) | ((i28 >> 3) & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar3;
                                final int i29 = i21;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar12, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar14, int i210) {
                                        if ((i210 & 11) == 2 && pVar14.b()) {
                                            pVar14.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(2061683080, i210, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                        }
                                        TextKt.a(textStyleA, pVar13, pVar14, (i29 >> 15) & 112);
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
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar3;
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.a1 a1VarG4 = h2.g(0, null, 2, null);
                        pVarF.N(a1VarG4);
                        objU2 = a1VarG4;
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    androidx.compose.ui.n nVarA7 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    boolean z117 = z14;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarA8 = OnRemeasuredModifierKt.a(nVarA7, (yh.l) objU3);
                    androidx.compose.ui.c cVarI4 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    nVar3 = nVar2;
                    androidx.compose.ui.layout.i0 i0VarK4 = BoxKt.k(cVarI4, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var4 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    aVarA = companion5.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF4 = LayoutKt.f(nVarA8);
                    boolean z118 = z13;
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
                    Updater.j(pVarB4, i0VarK4, companion5.d());
                    Updater.j(pVarB4, eVar7, companion5.b());
                    Updater.j(pVarB4, layoutDirection4, companion5.c());
                    Updater.j(pVarB4, d2Var4, companion5.f());
                    pVarF.x();
                    qVarF4.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                    pVarF.T(1796243068);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF4 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar8 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    jA = b1.g.a((c(a1Var) - eVar8.e1(t0.f0.f139726a.i())) / 2, eVar8.E1(f9830k));
                    kotlin.b2 b2Var4 = kotlin.b2.f124493a;
                    b1.f fVarD4 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(fVarD4) | pVarF.s(gVar3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource4 = (MappedInteractionSource) objU4;
                    f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar13, int i27) {
                            if ((i27 & 11) == 2 && pVar13.b()) {
                                pVar13.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(691730997, i27, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar13, 6)), mappedInteractionSource4, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar13, 0, 7)), pVar13, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                            a(pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar13, int i27) {
                            if ((i27 & 11) == 2 && pVar13.b()) {
                                pVar13.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-474426875, i27, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF4), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar13, 6)), pVar13, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                            a(pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB5, aVarB, z118, e(m2VarF4), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    gVar4 = gVar3;
                    s0Var2 = s0VarA;
                    pVar4 = pVar12;
                    z15 = z117;
                    z16 = z118;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar12 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar12;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar13 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar13;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    final s0 s0Var7 = s0VarA;
                    final int i27 = i21;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar3;
                    final boolean z119 = z13;
                    androidx.compose.runtime.internal.a aVarB6 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar14, int i28) {
                            if ((i28 & 11) == 2 && pVar14.b()) {
                                pVar14.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1419576100, i28, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                            }
                            s0 s0Var8 = s0Var7;
                            boolean z1110 = z10;
                            int i29 = i27;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var8.b(z1110, pVar14, ((i29 >> 21) & 112) | ((i29 >> 3) & 14));
                            androidx.compose.ui.n nVarA9 = pVar13 != null && (z119 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                            int i210 = i27;
                            pVar14.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK5 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar14, 0);
                            pVar14.T(-1323940314);
                            s1.e eVar9 = (s1.e) pVar14.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection5 = (LayoutDirection) pVar14.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var5 = (androidx.compose.ui.platform.d2) pVar14.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion6.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF5 = LayoutKt.f(nVarA9);
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
                            Updater.j(pVarB5, i0VarK5, companion6.d());
                            Updater.j(pVarB5, eVar9, companion6.b());
                            Updater.j(pVarB5, layoutDirection5, companion6.c());
                            Updater.j(pVarB5, d2Var5, companion6.f());
                            pVar14.x();
                            qVarF5.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar14)), pVar14, 0);
                            pVar14.T(2058660585);
                            pVar14.T(-2137368960);
                            BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                            pVar14.T(2060475106);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar15, pVar14, ((i210 >> 6) & 112) | 8);
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
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar14, int i28) {
                                if ((i28 & 11) == 2 && pVar14.b()) {
                                    pVar14.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1644987592, i28, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar14, 6), t0.f0.f139726a.A());
                                s0 s0Var8 = s0VarA;
                                boolean z1110 = z10;
                                int i29 = i21;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var8.c(z1110, pVar14, ((i29 >> 21) & 112) | ((i29 >> 3) & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar3;
                                final int i210 = i21;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar14, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar16, int i211) {
                                        if ((i211 & 11) == 2 && pVar16.b()) {
                                            pVar16.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(2061683080, i211, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                        }
                                        TextKt.a(textStyleA, pVar15, pVar16, (i210 >> 15) & 112);
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
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar3;
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.a1 a1VarG5 = h2.g(0, null, 2, null);
                        pVarF.N(a1VarG5);
                        objU2 = a1VarG5;
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    androidx.compose.ui.n nVarA9 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    boolean z1110 = z14;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarA10 = OnRemeasuredModifierKt.a(nVarA9, (yh.l) objU3);
                    androidx.compose.ui.c cVarI5 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    nVar3 = nVar2;
                    androidx.compose.ui.layout.i0 i0VarK5 = BoxKt.k(cVarI5, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar9 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var5 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                    aVarA = companion6.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF5 = LayoutKt.f(nVarA10);
                    boolean z1111 = z13;
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
                    Updater.j(pVarB5, i0VarK5, companion6.d());
                    Updater.j(pVarB5, eVar9, companion6.b());
                    Updater.j(pVarB5, layoutDirection5, companion6.c());
                    Updater.j(pVarB5, d2Var5, companion6.f());
                    pVarF.x();
                    qVarF5.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                    pVarF.T(1796243068);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF5 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar10 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    jA = b1.g.a((c(a1Var) - eVar10.e1(t0.f0.f139726a.i())) / 2, eVar10.E1(f9830k));
                    kotlin.b2 b2Var5 = kotlin.b2.f124493a;
                    b1.f fVarD5 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(fVarD5) | pVarF.s(gVar3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource5 = (MappedInteractionSource) objU4;
                    f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar15, int i28) {
                            if ((i28 & 11) == 2 && pVar15.b()) {
                                pVar15.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(691730997, i28, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar15, 6)), mappedInteractionSource5, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar15, 0, 7)), pVar15, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                            a(pVar15, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar15, int i28) {
                            if ((i28 & 11) == 2 && pVar15.b()) {
                                pVar15.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-474426875, i28, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF5), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar15, 6)), pVar15, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                            a(pVar15, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB6, aVarB, z1111, e(m2VarF5), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    gVar4 = gVar3;
                    s0Var2 = s0VarA;
                    pVar4 = pVar14;
                    z15 = z1110;
                    z16 = z1111;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar6 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar15, int i28) {
                        NavigationBarKt.b(x0Var, z10, onClick, icon, nVar6, z15, pVar4, z16, s0Var2, gVar4, pVar15, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                        a(pVar15, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= com.google.android.exoplayer2.j.G;
            gVar2 = gVar;
            if ((i12 & 1533916891) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar14 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar14;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar15 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar15;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                final s0 s0Var8 = s0VarA;
                final int i28 = i21;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar3;
                final boolean z1112 = z13;
                androidx.compose.runtime.internal.a aVarB7 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar16, int i29) {
                        if ((i29 & 11) == 2 && pVar16.b()) {
                            pVar16.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1419576100, i29, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                        }
                        s0 s0Var9 = s0Var8;
                        boolean z1113 = z10;
                        int i210 = i28;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var9.b(z1113, pVar16, ((i210 >> 21) & 112) | ((i210 >> 3) & 14));
                        androidx.compose.ui.n nVarA11 = pVar15 != null && (z1112 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                        int i211 = i28;
                        pVar16.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK6 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar16, 0);
                        pVar16.T(-1323940314);
                        s1.e eVar11 = (s1.e) pVar16.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection6 = (LayoutDirection) pVar16.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var6 = (androidx.compose.ui.platform.d2) pVar16.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion7.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF6 = LayoutKt.f(nVarA11);
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
                        Updater.j(pVarB6, i0VarK6, companion7.d());
                        Updater.j(pVarB6, eVar11, companion7.b());
                        Updater.j(pVarB6, layoutDirection6, companion7.c());
                        Updater.j(pVarB6, d2Var6, companion7.f());
                        pVar16.x();
                        qVarF6.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar16)), pVar16, 0);
                        pVar16.T(2058660585);
                        pVar16.T(-2137368960);
                        BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.f5954a;
                        pVar16.T(2060475106);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar17, pVar16, ((i211 >> 6) & 112) | 8);
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
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i29) {
                            if ((i29 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1644987592, i29, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar16, 6), t0.f0.f139726a.A());
                            s0 s0Var9 = s0VarA;
                            boolean z1113 = z10;
                            int i210 = i21;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var9.c(z1113, pVar16, ((i210 >> 21) & 112) | ((i210 >> 3) & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar3;
                            final int i211 = i21;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar16, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar18, int i212) {
                                    if ((i212 & 11) == 2 && pVar18.b()) {
                                        pVar18.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(2061683080, i212, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                    }
                                    TextKt.a(textStyleA, pVar17, pVar18, (i211 >> 15) & 112);
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
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar3;
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.a1 a1VarG6 = h2.g(0, null, 2, null);
                    pVarF.N(a1VarG6);
                    objU2 = a1VarG6;
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                androidx.compose.ui.n nVarA11 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                boolean z1113 = z14;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA12 = OnRemeasuredModifierKt.a(nVarA11, (yh.l) objU3);
                androidx.compose.ui.c cVarI6 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                nVar3 = nVar2;
                androidx.compose.ui.layout.i0 i0VarK6 = BoxKt.k(cVarI6, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar11 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var6 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                aVarA = companion7.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF6 = LayoutKt.f(nVarA12);
                boolean z1114 = z13;
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
                Updater.j(pVarB6, i0VarK6, companion7.d());
                Updater.j(pVarB6, eVar11, companion7.b());
                Updater.j(pVarB6, layoutDirection6, companion7.c());
                Updater.j(pVarB6, d2Var6, companion7.f());
                pVarF.x();
                qVarF6.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.f5954a;
                pVarF.T(1796243068);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF6 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar12 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                jA = b1.g.a((c(a1Var) - eVar12.e1(t0.f0.f139726a.i())) / 2, eVar12.E1(f9830k));
                kotlin.b2 b2Var6 = kotlin.b2.f124493a;
                b1.f fVarD6 = b1.f.d(jA);
                pVarF.T(511388516);
                zS2 = pVarF.s(fVarD6) | pVarF.s(gVar3);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource6 = (MappedInteractionSource) objU4;
                f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i29) {
                        if ((i29 & 11) == 2 && pVar17.b()) {
                            pVar17.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(691730997, i29, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar17, 6)), mappedInteractionSource6, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar17, 0, 7)), pVar17, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                        a(pVar17, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i29) {
                        if ((i29 & 11) == 2 && pVar17.b()) {
                            pVar17.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-474426875, i29, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF6), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar17, 6)), pVar17, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                        a(pVar17, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB7, aVarB, z1114, e(m2VarF6), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar4 = gVar3;
                s0Var2 = s0VarA;
                pVar4 = pVar16;
                z15 = z1113;
                z16 = z1114;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar16 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar16;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar17 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar17;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                final s0 s0Var9 = s0VarA;
                final int i29 = i21;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar3;
                final boolean z1115 = z13;
                androidx.compose.runtime.internal.a aVarB8 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar18, int i210) {
                        if ((i210 & 11) == 2 && pVar18.b()) {
                            pVar18.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1419576100, i210, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                        }
                        s0 s0Var10 = s0Var9;
                        boolean z1116 = z10;
                        int i211 = i29;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var10.b(z1116, pVar18, ((i211 >> 21) & 112) | ((i211 >> 3) & 14));
                        androidx.compose.ui.n nVarA13 = pVar17 != null && (z1115 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                        int i212 = i29;
                        pVar18.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK7 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar18, 0);
                        pVar18.T(-1323940314);
                        s1.e eVar13 = (s1.e) pVar18.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection7 = (LayoutDirection) pVar18.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var7 = (androidx.compose.ui.platform.d2) pVar18.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion8.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF7 = LayoutKt.f(nVarA13);
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
                        Updater.j(pVarB7, i0VarK7, companion8.d());
                        Updater.j(pVarB7, eVar13, companion8.b());
                        Updater.j(pVarB7, layoutDirection7, companion8.c());
                        Updater.j(pVarB7, d2Var7, companion8.f());
                        pVar18.x();
                        qVarF7.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar18)), pVar18, 0);
                        pVar18.T(2058660585);
                        pVar18.T(-2137368960);
                        BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.f5954a;
                        pVar18.T(2060475106);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar19, pVar18, ((i212 >> 6) & 112) | 8);
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
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar18, int i210) {
                            if ((i210 & 11) == 2 && pVar18.b()) {
                                pVar18.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1644987592, i210, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar18, 6), t0.f0.f139726a.A());
                            s0 s0Var10 = s0VarA;
                            boolean z1116 = z10;
                            int i211 = i21;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var10.c(z1116, pVar18, ((i211 >> 21) & 112) | ((i211 >> 3) & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar3;
                            final int i212 = i21;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar18, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar110, int i213) {
                                    if ((i213 & 11) == 2 && pVar110.b()) {
                                        pVar110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(2061683080, i213, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                    }
                                    TextKt.a(textStyleA, pVar19, pVar110, (i212 >> 15) & 112);
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
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar3;
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.a1 a1VarG7 = h2.g(0, null, 2, null);
                    pVarF.N(a1VarG7);
                    objU2 = a1VarG7;
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                androidx.compose.ui.n nVarA13 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                boolean z1116 = z14;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA14 = OnRemeasuredModifierKt.a(nVarA13, (yh.l) objU3);
                androidx.compose.ui.c cVarI7 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                nVar3 = nVar2;
                androidx.compose.ui.layout.i0 i0VarK7 = BoxKt.k(cVarI7, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar13 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var7 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                aVarA = companion8.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF7 = LayoutKt.f(nVarA14);
                boolean z1117 = z13;
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
                Updater.j(pVarB7, i0VarK7, companion8.d());
                Updater.j(pVarB7, eVar13, companion8.b());
                Updater.j(pVarB7, layoutDirection7, companion8.c());
                Updater.j(pVarB7, d2Var7, companion8.f());
                pVarF.x();
                qVarF7.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.f5954a;
                pVarF.T(1796243068);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF7 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar14 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                jA = b1.g.a((c(a1Var) - eVar14.e1(t0.f0.f139726a.i())) / 2, eVar14.E1(f9830k));
                kotlin.b2 b2Var7 = kotlin.b2.f124493a;
                b1.f fVarD7 = b1.f.d(jA);
                pVarF.T(511388516);
                zS2 = pVarF.s(fVarD7) | pVarF.s(gVar3);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource7 = (MappedInteractionSource) objU4;
                f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar19, int i210) {
                        if ((i210 & 11) == 2 && pVar19.b()) {
                            pVar19.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(691730997, i210, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar19, 6)), mappedInteractionSource7, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar19, 0, 7)), pVar19, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                        a(pVar19, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar19, int i210) {
                        if ((i210 & 11) == 2 && pVar19.b()) {
                            pVar19.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-474426875, i210, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF7), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar19, 6)), pVar19, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                        a(pVar19, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB8, aVarB, z1117, e(m2VarF7), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar4 = gVar3;
                s0Var2 = s0VarA;
                pVar4 = pVar18;
                z15 = z1116;
                z16 = z1117;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar7 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar19, int i210) {
                    NavigationBarKt.b(x0Var, z10, onClick, icon, nVar7, z15, pVar4, z16, s0Var2, gVar4, pVar19, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                    a(pVar19, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        nVar2 = nVar;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                if (pVarF.u(z11)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= 1572864;
                pVar3 = pVar;
            } else {
                pVar3 = pVar;
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(pVar3)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 12582912;
                z13 = z12;
            } else {
                z13 = z12;
                if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z13)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i10 & 234881024) != 0) {
                i12 |= ((i11 & 256) == 0 || !pVarF.s(s0Var)) ? 33554432 : 67108864;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 1879048192) == 0) {
                    gVar2 = gVar;
                    if (pVarF.s(gVar2)) {
                        i20 = 536870912;
                    } else {
                        i20 = 268435456;
                    }
                    i12 |= i20;
                }
                if ((i12 & 1533916891) == 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar18 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar18;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar19 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar19;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    final s0 s0Var10 = s0VarA;
                    final int i210 = i21;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar3;
                    final boolean z1118 = z13;
                    androidx.compose.runtime.internal.a aVarB9 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar110, int i211) {
                            if ((i211 & 11) == 2 && pVar110.b()) {
                                pVar110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1419576100, i211, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                            }
                            s0 s0Var11 = s0Var10;
                            boolean z1119 = z10;
                            int i212 = i210;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var11.b(z1119, pVar110, ((i212 >> 21) & 112) | ((i212 >> 3) & 14));
                            androidx.compose.ui.n nVarA15 = pVar19 != null && (z1118 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                            int i213 = i210;
                            pVar110.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK8 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar110, 0);
                            pVar110.T(-1323940314);
                            s1.e eVar15 = (s1.e) pVar110.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection8 = (LayoutDirection) pVar110.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var8 = (androidx.compose.ui.platform.d2) pVar110.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion9.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF8 = LayoutKt.f(nVarA15);
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
                            Updater.j(pVarB8, i0VarK8, companion9.d());
                            Updater.j(pVarB8, eVar15, companion9.b());
                            Updater.j(pVarB8, layoutDirection8, companion9.c());
                            Updater.j(pVarB8, d2Var8, companion9.f());
                            pVar110.x();
                            qVarF8.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar110)), pVar110, 0);
                            pVar110.T(2058660585);
                            pVar110.T(-2137368960);
                            BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.f5954a;
                            pVar110.T(2060475106);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar111, pVar110, ((i213 >> 6) & 112) | 8);
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
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar110, int i211) {
                                if ((i211 & 11) == 2 && pVar110.b()) {
                                    pVar110.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1644987592, i211, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar110, 6), t0.f0.f139726a.A());
                                s0 s0Var11 = s0VarA;
                                boolean z1119 = z10;
                                int i212 = i21;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var11.c(z1119, pVar110, ((i212 >> 21) & 112) | ((i212 >> 3) & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar3;
                                final int i213 = i21;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar110, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar112, int i214) {
                                        if ((i214 & 11) == 2 && pVar112.b()) {
                                            pVar112.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(2061683080, i214, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                        }
                                        TextKt.a(textStyleA, pVar111, pVar112, (i213 >> 15) & 112);
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
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar3;
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.a1 a1VarG8 = h2.g(0, null, 2, null);
                        pVarF.N(a1VarG8);
                        objU2 = a1VarG8;
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    androidx.compose.ui.n nVarA15 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    boolean z1119 = z14;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarA16 = OnRemeasuredModifierKt.a(nVarA15, (yh.l) objU3);
                    androidx.compose.ui.c cVarI8 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    nVar3 = nVar2;
                    androidx.compose.ui.layout.i0 i0VarK8 = BoxKt.k(cVarI8, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar15 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection8 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var8 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    aVarA = companion9.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF8 = LayoutKt.f(nVarA16);
                    boolean z11110 = z13;
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
                    Updater.j(pVarB8, i0VarK8, companion9.d());
                    Updater.j(pVarB8, eVar15, companion9.b());
                    Updater.j(pVarB8, layoutDirection8, companion9.c());
                    Updater.j(pVarB8, d2Var8, companion9.f());
                    pVarF.x();
                    qVarF8.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.f5954a;
                    pVarF.T(1796243068);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF8 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar16 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    jA = b1.g.a((c(a1Var) - eVar16.e1(t0.f0.f139726a.i())) / 2, eVar16.E1(f9830k));
                    kotlin.b2 b2Var8 = kotlin.b2.f124493a;
                    b1.f fVarD8 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(fVarD8) | pVarF.s(gVar3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource8 = (MappedInteractionSource) objU4;
                    f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111, int i211) {
                            if ((i211 & 11) == 2 && pVar111.b()) {
                                pVar111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(691730997, i211, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar111, 6)), mappedInteractionSource8, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar111, 0, 7)), pVar111, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111, Integer num) {
                            a(pVar111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar111, int i211) {
                            if ((i211 & 11) == 2 && pVar111.b()) {
                                pVar111.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-474426875, i211, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF8), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar111, 6)), pVar111, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111, Integer num) {
                            a(pVar111, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB9, aVarB, z11110, e(m2VarF8), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    gVar4 = gVar3;
                    s0Var2 = s0VarA;
                    pVar4 = pVar110;
                    z15 = z1119;
                    z16 = z11110;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar110 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar110;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    } else {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            pVar3 = null;
                        }
                        if (i17 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 128) != 0) {
                            s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                            i12 &= -234881025;
                        } else {
                            s0VarA = s0Var;
                        }
                        if (i19 != 0) {
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = androidx.compose.foundation.interaction.f.a();
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            androidx.compose.foundation.interaction.g gVar111 = (androidx.compose.foundation.interaction.g) objU;
                            i21 = i12;
                            gVar3 = gVar111;
                        } else {
                            i21 = i12;
                            gVar3 = gVar;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                    }
                    final s0 s0Var11 = s0VarA;
                    final int i211 = i21;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar3;
                    final boolean z11111 = z13;
                    androidx.compose.runtime.internal.a aVarB10 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar112, int i212) {
                            if ((i212 & 11) == 2 && pVar112.b()) {
                                pVar112.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1419576100, i212, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                            }
                            s0 s0Var12 = s0Var11;
                            boolean z11112 = z10;
                            int i213 = i211;
                            m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var12.b(z11112, pVar112, ((i213 >> 21) & 112) | ((i213 >> 3) & 14));
                            androidx.compose.ui.n nVarA17 = pVar111 != null && (z11111 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                            int i214 = i211;
                            pVar112.T(733328855);
                            androidx.compose.ui.layout.i0 i0VarK9 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar112, 0);
                            pVar112.T(-1323940314);
                            s1.e eVar17 = (s1.e) pVar112.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection9 = (LayoutDirection) pVar112.K(CompositionLocalsKt.p());
                            androidx.compose.ui.platform.d2 d2Var9 = (androidx.compose.ui.platform.d2) pVar112.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                            yh.a<ComposeUiNode> aVarA2 = companion10.a();
                            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF9 = LayoutKt.f(nVarA17);
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
                            Updater.j(pVarB9, i0VarK9, companion10.d());
                            Updater.j(pVarB9, eVar17, companion10.b());
                            Updater.j(pVarB9, layoutDirection9, companion10.c());
                            Updater.j(pVarB9, d2Var9, companion10.f());
                            pVar112.x();
                            qVarF9.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar112)), pVar112, 0);
                            pVar112.T(2058660585);
                            pVar112.T(-2137368960);
                            BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.f5954a;
                            pVar112.T(2060475106);
                            CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar113, pVar112, ((i214 >> 6) & 112) | 8);
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
                        aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                            public final void a(@dl.e androidx.compose.runtime.p pVar112, int i212) {
                                if ((i212 & 11) == 2 && pVar112.b()) {
                                    pVar112.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1644987592, i212, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                                }
                                final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar112, 6), t0.f0.f139726a.A());
                                s0 s0Var12 = s0VarA;
                                boolean z11112 = z10;
                                int i213 = i21;
                                androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var12.c(z11112, pVar112, ((i213 >> 21) & 112) | ((i213 >> 3) & 14)))))};
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar3;
                                final int i214 = i21;
                                CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar112, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar114, int i215) {
                                        if ((i215 & 11) == 2 && pVar114.b()) {
                                            pVar114.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(2061683080, i215, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                        }
                                        TextKt.a(textStyleA, pVar113, pVar114, (i214 >> 15) & 112);
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
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar3;
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.a1 a1VarG9 = h2.g(0, null, 2, null);
                        pVarF.N(a1VarG9);
                        objU2 = a1VarG9;
                    }
                    pVarF.c0();
                    a1Var = (androidx.compose.runtime.a1) objU2;
                    androidx.compose.ui.n nVarA17 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                    pVarF.T(1157296644);
                    zS = pVarF.s(a1Var);
                    boolean z11112 = z14;
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void a(long j10) {
                                NavigationBarKt.d(a1Var, s1.r.m(j10));
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                                a(rVar.getF139248a());
                                return kotlin.b2.f124493a;
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarA18 = OnRemeasuredModifierKt.a(nVarA17, (yh.l) objU3);
                    androidx.compose.ui.c cVarI9 = androidx.compose.ui.c.INSTANCE.i();
                    pVarF.T(733328855);
                    nVar3 = nVar2;
                    androidx.compose.ui.layout.i0 i0VarK9 = BoxKt.k(cVarI9, false, pVarF, 6);
                    pVarF.T(-1323940314);
                    s1.e eVar17 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection9 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var9 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                    aVarA = companion10.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF9 = LayoutKt.f(nVarA18);
                    boolean z11113 = z13;
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
                    Updater.j(pVarB9, i0VarK9, companion10.d());
                    Updater.j(pVarB9, eVar17, companion10.b());
                    Updater.j(pVarB9, layoutDirection9, companion10.c());
                    Updater.j(pVarB9, d2Var9, companion10.f());
                    pVarF.x();
                    qVarF9.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarF.T(-2137368960);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.f5954a;
                    pVarF.T(1796243068);
                    if (z10) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    final m2<Float> m2VarF9 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                    s1.e eVar18 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    jA = b1.g.a((c(a1Var) - eVar18.e1(t0.f0.f139726a.i())) / 2, eVar18.E1(f9830k));
                    kotlin.b2 b2Var9 = kotlin.b2.f124493a;
                    b1.f fVarD9 = b1.f.d(jA);
                    pVarF.T(511388516);
                    zS2 = pVarF.s(fVarD9) | pVarF.s(gVar3);
                    objU4 = pVarF.U();
                    if (zS2) {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    } else {
                        objU4 = new MappedInteractionSource(gVar3, jA, null);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    final MappedInteractionSource mappedInteractionSource9 = (MappedInteractionSource) objU4;
                    f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar113, int i212) {
                            if ((i212 & 11) == 2 && pVar113.b()) {
                                pVar113.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(691730997, i212, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                            }
                            BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar113, 6)), mappedInteractionSource9, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar113, 0, 7)), pVar113, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar113, Integer num) {
                            a(pVar113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar113, int i212) {
                            if ((i212 & 11) == 2 && pVar113.b()) {
                                pVar113.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-474426875, i212, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                            }
                            BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF9), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar113, 6)), pVar113, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar113, Integer num) {
                            a(pVar113, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), aVarB10, aVarB, z11113, e(m2VarF9), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    gVar4 = gVar3;
                    s0Var2 = s0VarA;
                    pVar4 = pVar112;
                    z15 = z11112;
                    z16 = z11113;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar8 = nVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar113, int i212) {
                        NavigationBarKt.b(x0Var, z10, onClick, icon, nVar8, z15, pVar4, z16, s0Var2, gVar4, pVar113, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar113, Integer num) {
                        a(pVar113, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i12 |= com.google.android.exoplayer2.j.G;
            gVar2 = gVar;
            if ((i12 & 1533916891) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar112 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar112;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar113 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar113;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                final s0 s0Var12 = s0VarA;
                final int i212 = i21;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar113 = pVar3;
                final boolean z11114 = z13;
                androidx.compose.runtime.internal.a aVarB11 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar114, int i213) {
                        if ((i213 & 11) == 2 && pVar114.b()) {
                            pVar114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1419576100, i213, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                        }
                        s0 s0Var13 = s0Var12;
                        boolean z11115 = z10;
                        int i214 = i212;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var13.b(z11115, pVar114, ((i214 >> 21) & 112) | ((i214 >> 3) & 14));
                        androidx.compose.ui.n nVarA19 = pVar113 != null && (z11114 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                        int i215 = i212;
                        pVar114.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK10 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar114, 0);
                        pVar114.T(-1323940314);
                        s1.e eVar19 = (s1.e) pVar114.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection10 = (LayoutDirection) pVar114.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var10 = (androidx.compose.ui.platform.d2) pVar114.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion11.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF10 = LayoutKt.f(nVarA19);
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
                        Updater.j(pVarB10, i0VarK10, companion11.d());
                        Updater.j(pVarB10, eVar19, companion11.b());
                        Updater.j(pVarB10, layoutDirection10, companion11.c());
                        Updater.j(pVarB10, d2Var10, companion11.f());
                        pVar114.x();
                        qVarF10.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar114)), pVar114, 0);
                        pVar114.T(2058660585);
                        pVar114.T(-2137368960);
                        BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.f5954a;
                        pVar114.T(2060475106);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar115, pVar114, ((i215 >> 6) & 112) | 8);
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
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar114, int i213) {
                            if ((i213 & 11) == 2 && pVar114.b()) {
                                pVar114.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1644987592, i213, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar114, 6), t0.f0.f139726a.A());
                            s0 s0Var13 = s0VarA;
                            boolean z11115 = z10;
                            int i214 = i21;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var13.c(z11115, pVar114, ((i214 >> 21) & 112) | ((i214 >> 3) & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar3;
                            final int i215 = i21;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar114, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar116, int i216) {
                                    if ((i216 & 11) == 2 && pVar116.b()) {
                                        pVar116.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(2061683080, i216, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                    }
                                    TextKt.a(textStyleA, pVar115, pVar116, (i215 >> 15) & 112);
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
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar114 = pVar3;
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.a1 a1VarG10 = h2.g(0, null, 2, null);
                    pVarF.N(a1VarG10);
                    objU2 = a1VarG10;
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                androidx.compose.ui.n nVarA19 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                boolean z11115 = z14;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA110 = OnRemeasuredModifierKt.a(nVarA19, (yh.l) objU3);
                androidx.compose.ui.c cVarI10 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                nVar3 = nVar2;
                androidx.compose.ui.layout.i0 i0VarK10 = BoxKt.k(cVarI10, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar19 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection10 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var10 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                aVarA = companion11.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF10 = LayoutKt.f(nVarA110);
                boolean z11116 = z13;
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
                Updater.j(pVarB10, i0VarK10, companion11.d());
                Updater.j(pVarB10, eVar19, companion11.b());
                Updater.j(pVarB10, layoutDirection10, companion11.c());
                Updater.j(pVarB10, d2Var10, companion11.f());
                pVarF.x();
                qVarF10.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.f5954a;
                pVarF.T(1796243068);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF10 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                jA = b1.g.a((c(a1Var) - eVar110.e1(t0.f0.f139726a.i())) / 2, eVar110.E1(f9830k));
                kotlin.b2 b2Var10 = kotlin.b2.f124493a;
                b1.f fVarD10 = b1.f.d(jA);
                pVarF.T(511388516);
                zS2 = pVarF.s(fVarD10) | pVarF.s(gVar3);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource10 = (MappedInteractionSource) objU4;
                f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar115, int i213) {
                        if ((i213 & 11) == 2 && pVar115.b()) {
                            pVar115.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(691730997, i213, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar115, 6)), mappedInteractionSource10, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar115, 0, 7)), pVar115, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar115, Integer num) {
                        a(pVar115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar115, int i213) {
                        if ((i213 & 11) == 2 && pVar115.b()) {
                            pVar115.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-474426875, i213, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF10), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar115, 6)), pVar115, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar115, Integer num) {
                        a(pVar115, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB11, aVarB, z11116, e(m2VarF10), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar4 = gVar3;
                s0Var2 = s0VarA;
                pVar4 = pVar114;
                z15 = z11115;
                z16 = z11116;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar114 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar114;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar115 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar115;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                final s0 s0Var13 = s0VarA;
                final int i213 = i21;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar115 = pVar3;
                final boolean z11117 = z13;
                androidx.compose.runtime.internal.a aVarB12 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar116, int i214) {
                        if ((i214 & 11) == 2 && pVar116.b()) {
                            pVar116.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1419576100, i214, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                        }
                        s0 s0Var14 = s0Var13;
                        boolean z11118 = z10;
                        int i215 = i213;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var14.b(z11118, pVar116, ((i215 >> 21) & 112) | ((i215 >> 3) & 14));
                        androidx.compose.ui.n nVarA111 = pVar115 != null && (z11117 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                        int i216 = i213;
                        pVar116.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK11 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar116, 0);
                        pVar116.T(-1323940314);
                        s1.e eVar111 = (s1.e) pVar116.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection11 = (LayoutDirection) pVar116.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var11 = (androidx.compose.ui.platform.d2) pVar116.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion12.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF11 = LayoutKt.f(nVarA111);
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
                        Updater.j(pVarB11, i0VarK11, companion12.d());
                        Updater.j(pVarB11, eVar111, companion12.b());
                        Updater.j(pVarB11, layoutDirection11, companion12.c());
                        Updater.j(pVarB11, d2Var11, companion12.f());
                        pVar116.x();
                        qVarF11.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar116)), pVar116, 0);
                        pVar116.T(2058660585);
                        pVar116.T(-2137368960);
                        BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.f5954a;
                        pVar116.T(2060475106);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar117, pVar116, ((i216 >> 6) & 112) | 8);
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
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar116, int i214) {
                            if ((i214 & 11) == 2 && pVar116.b()) {
                                pVar116.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1644987592, i214, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar116, 6), t0.f0.f139726a.A());
                            s0 s0Var14 = s0VarA;
                            boolean z11118 = z10;
                            int i215 = i21;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var14.c(z11118, pVar116, ((i215 >> 21) & 112) | ((i215 >> 3) & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar3;
                            final int i216 = i21;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar116, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar118, int i217) {
                                    if ((i217 & 11) == 2 && pVar118.b()) {
                                        pVar118.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(2061683080, i217, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                    }
                                    TextKt.a(textStyleA, pVar117, pVar118, (i216 >> 15) & 112);
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
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar116 = pVar3;
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.a1 a1VarG11 = h2.g(0, null, 2, null);
                    pVarF.N(a1VarG11);
                    objU2 = a1VarG11;
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                androidx.compose.ui.n nVarA111 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                boolean z11118 = z14;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA112 = OnRemeasuredModifierKt.a(nVarA111, (yh.l) objU3);
                androidx.compose.ui.c cVarI11 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                nVar3 = nVar2;
                androidx.compose.ui.layout.i0 i0VarK11 = BoxKt.k(cVarI11, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection11 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var11 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                aVarA = companion12.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF11 = LayoutKt.f(nVarA112);
                boolean z11119 = z13;
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
                Updater.j(pVarB11, i0VarK11, companion12.d());
                Updater.j(pVarB11, eVar111, companion12.b());
                Updater.j(pVarB11, layoutDirection11, companion12.c());
                Updater.j(pVarB11, d2Var11, companion12.f());
                pVarF.x();
                qVarF11.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.f5954a;
                pVarF.T(1796243068);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF11 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                jA = b1.g.a((c(a1Var) - eVar112.e1(t0.f0.f139726a.i())) / 2, eVar112.E1(f9830k));
                kotlin.b2 b2Var11 = kotlin.b2.f124493a;
                b1.f fVarD11 = b1.f.d(jA);
                pVarF.T(511388516);
                zS2 = pVarF.s(fVarD11) | pVarF.s(gVar3);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource11 = (MappedInteractionSource) objU4;
                f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar117, int i214) {
                        if ((i214 & 11) == 2 && pVar117.b()) {
                            pVar117.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(691730997, i214, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar117, 6)), mappedInteractionSource11, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar117, 0, 7)), pVar117, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar117, Integer num) {
                        a(pVar117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar117, int i214) {
                        if ((i214 & 11) == 2 && pVar117.b()) {
                            pVar117.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-474426875, i214, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF11), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar117, 6)), pVar117, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar117, Integer num) {
                        a(pVar117, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB12, aVarB, z11119, e(m2VarF11), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar4 = gVar3;
                s0Var2 = s0VarA;
                pVar4 = pVar116;
                z15 = z11118;
                z16 = z11119;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar9 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar117, int i214) {
                    NavigationBarKt.b(x0Var, z10, onClick, icon, nVar9, z15, pVar4, z16, s0Var2, gVar4, pVar117, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar117, Integer num) {
                    a(pVar117, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= androidx.profileinstaller.o.c.f26824k;
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= 1572864;
            pVar3 = pVar;
        } else {
            pVar3 = pVar;
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(pVar3)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 12582912;
            z13 = z12;
        } else {
            z13 = z12;
            if ((i10 & 29360128) == 0) {
                if (pVarF.u(z13)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
        }
        if ((i10 & 234881024) != 0) {
            i12 |= ((i11 & 256) == 0 || !pVarF.s(s0Var)) ? 33554432 : 67108864;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 1879048192) == 0) {
                gVar2 = gVar;
                if (pVarF.s(gVar2)) {
                    i20 = 536870912;
                } else {
                    i20 = 268435456;
                }
                i12 |= i20;
            }
            if ((i12 & 1533916891) == 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar116 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar116;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar117 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar117;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                final s0 s0Var14 = s0VarA;
                final int i214 = i21;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar117 = pVar3;
                final boolean z111110 = z13;
                androidx.compose.runtime.internal.a aVarB13 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar118, int i215) {
                        if ((i215 & 11) == 2 && pVar118.b()) {
                            pVar118.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1419576100, i215, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                        }
                        s0 s0Var15 = s0Var14;
                        boolean z111111 = z10;
                        int i216 = i214;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var15.b(z111111, pVar118, ((i216 >> 21) & 112) | ((i216 >> 3) & 14));
                        androidx.compose.ui.n nVarA113 = pVar117 != null && (z111110 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                        int i217 = i214;
                        pVar118.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK12 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar118, 0);
                        pVar118.T(-1323940314);
                        s1.e eVar113 = (s1.e) pVar118.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection12 = (LayoutDirection) pVar118.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var12 = (androidx.compose.ui.platform.d2) pVar118.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion13.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF12 = LayoutKt.f(nVarA113);
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
                        Updater.j(pVarB12, i0VarK12, companion13.d());
                        Updater.j(pVarB12, eVar113, companion13.b());
                        Updater.j(pVarB12, layoutDirection12, companion13.c());
                        Updater.j(pVarB12, d2Var12, companion13.f());
                        pVar118.x();
                        qVarF12.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar118)), pVar118, 0);
                        pVar118.T(2058660585);
                        pVar118.T(-2137368960);
                        BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.f5954a;
                        pVar118.T(2060475106);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar119, pVar118, ((i217 >> 6) & 112) | 8);
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
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar118, int i215) {
                            if ((i215 & 11) == 2 && pVar118.b()) {
                                pVar118.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1644987592, i215, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar118, 6), t0.f0.f139726a.A());
                            s0 s0Var15 = s0VarA;
                            boolean z111111 = z10;
                            int i216 = i21;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var15.c(z111111, pVar118, ((i216 >> 21) & 112) | ((i216 >> 3) & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar3;
                            final int i217 = i21;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar118, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i218) {
                                    if ((i218 & 11) == 2 && pVar1110.b()) {
                                        pVar1110.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(2061683080, i218, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                    }
                                    TextKt.a(textStyleA, pVar119, pVar1110, (i217 >> 15) & 112);
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
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar118 = pVar3;
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.a1 a1VarG12 = h2.g(0, null, 2, null);
                    pVarF.N(a1VarG12);
                    objU2 = a1VarG12;
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                androidx.compose.ui.n nVarA113 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                boolean z111111 = z14;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA114 = OnRemeasuredModifierKt.a(nVarA113, (yh.l) objU3);
                androidx.compose.ui.c cVarI12 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                nVar3 = nVar2;
                androidx.compose.ui.layout.i0 i0VarK12 = BoxKt.k(cVarI12, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection12 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var12 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                aVarA = companion13.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF12 = LayoutKt.f(nVarA114);
                boolean z111112 = z13;
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
                Updater.j(pVarB12, i0VarK12, companion13.d());
                Updater.j(pVarB12, eVar113, companion13.b());
                Updater.j(pVarB12, layoutDirection12, companion13.c());
                Updater.j(pVarB12, d2Var12, companion13.f());
                pVarF.x();
                qVarF12.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.f5954a;
                pVarF.T(1796243068);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF12 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                jA = b1.g.a((c(a1Var) - eVar114.e1(t0.f0.f139726a.i())) / 2, eVar114.E1(f9830k));
                kotlin.b2 b2Var12 = kotlin.b2.f124493a;
                b1.f fVarD12 = b1.f.d(jA);
                pVarF.T(511388516);
                zS2 = pVarF.s(fVarD12) | pVarF.s(gVar3);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource12 = (MappedInteractionSource) objU4;
                f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar119, int i215) {
                        if ((i215 & 11) == 2 && pVar119.b()) {
                            pVar119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(691730997, i215, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar119, 6)), mappedInteractionSource12, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar119, 0, 7)), pVar119, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                        a(pVar119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar119, int i215) {
                        if ((i215 & 11) == 2 && pVar119.b()) {
                            pVar119.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-474426875, i215, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF12), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar119, 6)), pVar119, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar119, Integer num) {
                        a(pVar119, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB13, aVarB, z111112, e(m2VarF12), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar4 = gVar3;
                s0Var2 = s0VarA;
                pVar4 = pVar118;
                z15 = z111111;
                z16 = z111112;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar118 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar118;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        pVar3 = null;
                    }
                    if (i17 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 128) != 0) {
                        s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                        i12 &= -234881025;
                    } else {
                        s0VarA = s0Var;
                    }
                    if (i19 != 0) {
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = androidx.compose.foundation.interaction.f.a();
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        androidx.compose.foundation.interaction.g gVar119 = (androidx.compose.foundation.interaction.g) objU;
                        i21 = i12;
                        gVar3 = gVar119;
                    } else {
                        i21 = i12;
                        gVar3 = gVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
                }
                final s0 s0Var15 = s0VarA;
                final int i215 = i21;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar119 = pVar3;
                final boolean z111113 = z13;
                androidx.compose.runtime.internal.a aVarB14 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i216) {
                        if ((i216 & 11) == 2 && pVar1110.b()) {
                            pVar1110.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1419576100, i216, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                        }
                        s0 s0Var16 = s0Var15;
                        boolean z111114 = z10;
                        int i217 = i215;
                        m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var16.b(z111114, pVar1110, ((i217 >> 21) & 112) | ((i217 >> 3) & 14));
                        androidx.compose.ui.n nVarA115 = pVar119 != null && (z111113 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                        int i218 = i215;
                        pVar1110.T(733328855);
                        androidx.compose.ui.layout.i0 i0VarK13 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1110, 0);
                        pVar1110.T(-1323940314);
                        s1.e eVar115 = (s1.e) pVar1110.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection13 = (LayoutDirection) pVar1110.K(CompositionLocalsKt.p());
                        androidx.compose.ui.platform.d2 d2Var13 = (androidx.compose.ui.platform.d2) pVar1110.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                        yh.a<ComposeUiNode> aVarA2 = companion14.a();
                        yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF13 = LayoutKt.f(nVarA115);
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
                        Updater.j(pVarB13, i0VarK13, companion14.d());
                        Updater.j(pVarB13, eVar115, companion14.b());
                        Updater.j(pVarB13, layoutDirection13, companion14.c());
                        Updater.j(pVarB13, d2Var13, companion14.f());
                        pVar1110.x();
                        qVarF13.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1110)), pVar1110, 0);
                        pVar1110.T(2058660585);
                        pVar1110.T(-2137368960);
                        BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.f5954a;
                        pVar1110.T(2060475106);
                        CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1111, pVar1110, ((i218 >> 6) & 112) | 8);
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
                    aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                        public final void a(@dl.e androidx.compose.runtime.p pVar1110, int i216) {
                            if ((i216 & 11) == 2 && pVar1110.b()) {
                                pVar1110.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1644987592, i216, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                            }
                            final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1110, 6), t0.f0.f139726a.A());
                            s0 s0Var16 = s0VarA;
                            boolean z111114 = z10;
                            int i217 = i21;
                            androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var16.c(z111114, pVar1110, ((i217 >> 21) & 112) | ((i217 >> 3) & 14)))))};
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar3;
                            final int i218 = i21;
                            CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1110, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i219) {
                                    if ((i219 & 11) == 2 && pVar1112.b()) {
                                        pVar1112.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(2061683080, i219, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                    }
                                    TextKt.a(textStyleA, pVar1111, pVar1112, (i218 >> 15) & 112);
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
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1110 = pVar3;
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.a1 a1VarG13 = h2.g(0, null, 2, null);
                    pVarF.N(a1VarG13);
                    objU2 = a1VarG13;
                }
                pVarF.c0();
                a1Var = (androidx.compose.runtime.a1) objU2;
                androidx.compose.ui.n nVarA115 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
                pVarF.T(1157296644);
                zS = pVarF.s(a1Var);
                boolean z111114 = z14;
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        public final void a(long j10) {
                            NavigationBarKt.d(a1Var, s1.r.m(j10));
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                            a(rVar.getF139248a());
                            return kotlin.b2.f124493a;
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                androidx.compose.ui.n nVarA116 = OnRemeasuredModifierKt.a(nVarA115, (yh.l) objU3);
                androidx.compose.ui.c cVarI13 = androidx.compose.ui.c.INSTANCE.i();
                pVarF.T(733328855);
                nVar3 = nVar2;
                androidx.compose.ui.layout.i0 i0VarK13 = BoxKt.k(cVarI13, false, pVarF, 6);
                pVarF.T(-1323940314);
                s1.e eVar115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection13 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var13 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                aVarA = companion14.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF13 = LayoutKt.f(nVarA116);
                boolean z111115 = z13;
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
                Updater.j(pVarB13, i0VarK13, companion14.d());
                Updater.j(pVarB13, eVar115, companion14.b());
                Updater.j(pVarB13, layoutDirection13, companion14.c());
                Updater.j(pVarB13, d2Var13, companion14.f());
                pVarF.x();
                qVarF13.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarF.T(-2137368960);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.f5954a;
                pVarF.T(1796243068);
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                final m2<Float> m2VarF13 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
                s1.e eVar116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                jA = b1.g.a((c(a1Var) - eVar116.e1(t0.f0.f139726a.i())) / 2, eVar116.E1(f9830k));
                kotlin.b2 b2Var13 = kotlin.b2.f124493a;
                b1.f fVarD13 = b1.f.d(jA);
                pVarF.T(511388516);
                zS2 = pVarF.s(fVarD13) | pVarF.s(gVar3);
                objU4 = pVarF.U();
                if (zS2) {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                } else {
                    objU4 = new MappedInteractionSource(gVar3, jA, null);
                    pVarF.N(objU4);
                }
                pVarF.c0();
                final MappedInteractionSource mappedInteractionSource13 = (MappedInteractionSource) objU4;
                f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111, int i216) {
                        if ((i216 & 11) == 2 && pVar1111.b()) {
                            pVar1111.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(691730997, i216, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                        }
                        BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar1111, 6)), mappedInteractionSource13, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1111, 0, 7)), pVar1111, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111, Integer num) {
                        a(pVar1111, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar1111, int i216) {
                        if ((i216 & 11) == 2 && pVar1111.b()) {
                            pVar1111.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-474426875, i216, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                        }
                        BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF13), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar1111, 6)), pVar1111, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111, Integer num) {
                        a(pVar1111, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), aVarB14, aVarB, z111115, e(m2VarF13), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
                pVarF.c0();
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                gVar4 = gVar3;
                s0Var2 = s0VarA;
                pVar4 = pVar1110;
                z15 = z111114;
                z16 = z111115;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar10 = nVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar1111, int i216) {
                    NavigationBarKt.b(x0Var, z10, onClick, icon, nVar10, z15, pVar4, z16, s0Var2, gVar4, pVar1111, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1111, Integer num) {
                    a(pVar1111, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i12 |= com.google.android.exoplayer2.j.G;
        gVar2 = gVar;
        if ((i12 & 1533916891) == 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    pVar3 = null;
                }
                if (i17 != 0) {
                    z13 = true;
                }
                if ((i11 & 128) != 0) {
                    s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -234881025;
                } else {
                    s0VarA = s0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    androidx.compose.foundation.interaction.g gVar1110 = (androidx.compose.foundation.interaction.g) objU;
                    i21 = i12;
                    gVar3 = gVar1110;
                } else {
                    i21 = i12;
                    gVar3 = gVar;
                }
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    pVar3 = null;
                }
                if (i17 != 0) {
                    z13 = true;
                }
                if ((i11 & 128) != 0) {
                    s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -234881025;
                } else {
                    s0VarA = s0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    androidx.compose.foundation.interaction.g gVar1111 = (androidx.compose.foundation.interaction.g) objU;
                    i21 = i12;
                    gVar3 = gVar1111;
                } else {
                    i21 = i12;
                    gVar3 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
            }
            final s0 s0Var16 = s0VarA;
            final int i216 = i21;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1111 = pVar3;
            final boolean z111116 = z13;
            androidx.compose.runtime.internal.a aVarB15 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i217) {
                    if ((i217 & 11) == 2 && pVar1112.b()) {
                        pVar1112.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1419576100, i217, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                    }
                    s0 s0Var17 = s0Var16;
                    boolean z111117 = z10;
                    int i218 = i216;
                    m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var17.b(z111117, pVar1112, ((i218 >> 21) & 112) | ((i218 >> 3) & 14));
                    androidx.compose.ui.n nVarA117 = pVar1111 != null && (z111116 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                    int i219 = i216;
                    pVar1112.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK14 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1112, 0);
                    pVar1112.T(-1323940314);
                    s1.e eVar117 = (s1.e) pVar1112.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection14 = (LayoutDirection) pVar1112.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var14 = (androidx.compose.ui.platform.d2) pVar1112.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA2 = companion15.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF14 = LayoutKt.f(nVarA117);
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
                    Updater.j(pVarB14, i0VarK14, companion15.d());
                    Updater.j(pVarB14, eVar117, companion15.b());
                    Updater.j(pVarB14, layoutDirection14, companion15.c());
                    Updater.j(pVarB14, d2Var14, companion15.f());
                    pVar1112.x();
                    qVarF14.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1112)), pVar1112, 0);
                    pVar1112.T(2058660585);
                    pVar1112.T(-2137368960);
                    BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.f5954a;
                    pVar1112.T(2060475106);
                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1113, pVar1112, ((i219 >> 6) & 112) | 8);
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
                aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar1112, int i217) {
                        if ((i217 & 11) == 2 && pVar1112.b()) {
                            pVar1112.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1644987592, i217, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                        }
                        final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1112, 6), t0.f0.f139726a.A());
                        s0 s0Var17 = s0VarA;
                        boolean z111117 = z10;
                        int i218 = i21;
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var17.c(z111117, pVar1112, ((i218 >> 21) & 112) | ((i218 >> 3) & 14)))))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar3;
                        final int i219 = i21;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1112, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i2110) {
                                if ((i2110 & 11) == 2 && pVar1114.b()) {
                                    pVar1114.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(2061683080, i2110, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                }
                                TextKt.a(textStyleA, pVar1113, pVar1114, (i219 >> 15) & 112);
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
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1112 = pVar3;
            if (objU2 == companion.a()) {
                androidx.compose.runtime.a1 a1VarG14 = h2.g(0, null, 2, null);
                pVarF.N(a1VarG14);
                objU2 = a1VarG14;
            }
            pVarF.c0();
            a1Var = (androidx.compose.runtime.a1) objU2;
            androidx.compose.ui.n nVarA117 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
            pVarF.T(1157296644);
            zS = pVarF.s(a1Var);
            boolean z111117 = z14;
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(long j10) {
                        NavigationBarKt.d(a1Var, s1.r.m(j10));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                        a(rVar.getF139248a());
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(long j10) {
                        NavigationBarKt.d(a1Var, s1.r.m(j10));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                        a(rVar.getF139248a());
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarA118 = OnRemeasuredModifierKt.a(nVarA117, (yh.l) objU3);
            androidx.compose.ui.c cVarI14 = androidx.compose.ui.c.INSTANCE.i();
            pVarF.T(733328855);
            nVar3 = nVar2;
            androidx.compose.ui.layout.i0 i0VarK14 = BoxKt.k(cVarI14, false, pVarF, 6);
            pVarF.T(-1323940314);
            s1.e eVar117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection14 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var14 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            aVarA = companion15.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF14 = LayoutKt.f(nVarA118);
            boolean z111118 = z13;
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
            Updater.j(pVarB14, i0VarK14, companion15.d());
            Updater.j(pVarB14, eVar117, companion15.b());
            Updater.j(pVarB14, layoutDirection14, companion15.c());
            Updater.j(pVarB14, d2Var14, companion15.f());
            pVarF.x();
            qVarF14.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.f5954a;
            pVarF.T(1796243068);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            final m2<Float> m2VarF14 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
            s1.e eVar118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            jA = b1.g.a((c(a1Var) - eVar118.e1(t0.f0.f139726a.i())) / 2, eVar118.E1(f9830k));
            kotlin.b2 b2Var14 = kotlin.b2.f124493a;
            b1.f fVarD14 = b1.f.d(jA);
            pVarF.T(511388516);
            zS2 = pVarF.s(fVarD14) | pVarF.s(gVar3);
            objU4 = pVarF.U();
            if (zS2) {
                objU4 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU4);
            } else {
                objU4 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU4);
            }
            pVarF.c0();
            final MappedInteractionSource mappedInteractionSource14 = (MappedInteractionSource) objU4;
            f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1113, int i217) {
                    if ((i217 & 11) == 2 && pVar1113.b()) {
                        pVar1113.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(691730997, i217, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                    }
                    BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar1113, 6)), mappedInteractionSource14, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1113, 0, 7)), pVar1113, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1113, Integer num) {
                    a(pVar1113, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1113, int i217) {
                    if ((i217 & 11) == 2 && pVar1113.b()) {
                        pVar1113.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-474426875, i217, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                    }
                    BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF14), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar1113, 6)), pVar1113, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1113, Integer num) {
                    a(pVar1113, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), aVarB15, aVarB, z111118, e(m2VarF14), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            gVar4 = gVar3;
            s0Var2 = s0VarA;
            pVar4 = pVar1112;
            z15 = z111117;
            z16 = z111118;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    pVar3 = null;
                }
                if (i17 != 0) {
                    z13 = true;
                }
                if ((i11 & 128) != 0) {
                    s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -234881025;
                } else {
                    s0VarA = s0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    androidx.compose.foundation.interaction.g gVar1112 = (androidx.compose.foundation.interaction.g) objU;
                    i21 = i12;
                    gVar3 = gVar1112;
                } else {
                    i21 = i12;
                    gVar3 = gVar;
                }
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    pVar3 = null;
                }
                if (i17 != 0) {
                    z13 = true;
                }
                if ((i11 & 128) != 0) {
                    s0VarA = t0.f12119a.a(0L, 0L, 0L, 0L, 0L, pVarF, androidx.profileinstaller.o.c.f26824k, 31);
                    i12 &= -234881025;
                } else {
                    s0VarA = s0Var;
                }
                if (i19 != 0) {
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = androidx.compose.foundation.interaction.f.a();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    androidx.compose.foundation.interaction.g gVar1113 = (androidx.compose.foundation.interaction.g) objU;
                    i21 = i12;
                    gVar3 = gVar1113;
                } else {
                    i21 = i12;
                    gVar3 = gVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-663510974, i21, -1, "androidx.compose.material3.NavigationBarItem (NavigationBar.kt:159)");
            }
            final s0 s0Var17 = s0VarA;
            final int i217 = i21;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1113 = pVar3;
            final boolean z111119 = z13;
            androidx.compose.runtime.internal.a aVarB16 = androidx.compose.runtime.internal.b.b(pVarF, -1419576100, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1
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
                public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i218) {
                    if ((i218 & 11) == 2 && pVar1114.b()) {
                        pVar1114.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1419576100, i218, -1, "androidx.compose.material3.NavigationBarItem.<anonymous> (NavigationBar.kt:170)");
                    }
                    s0 s0Var18 = s0Var17;
                    boolean z1111110 = z10;
                    int i219 = i217;
                    m2<androidx.compose.ui.graphics.l0> m2VarB = s0Var18.b(z1111110, pVar1114, ((i219 >> 21) & 112) | ((i219 >> 3) & 14));
                    androidx.compose.ui.n nVarA119 = pVar1113 != null && (z111119 || z10) ? SemanticsModifierKt.a(androidx.compose.ui.n.INSTANCE, new yh.l<r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledIcon$1.1
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
                    int i2110 = i217;
                    pVar1114.T(733328855);
                    androidx.compose.ui.layout.i0 i0VarK15 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVar1114, 0);
                    pVar1114.T(-1323940314);
                    s1.e eVar119 = (s1.e) pVar1114.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection15 = (LayoutDirection) pVar1114.K(CompositionLocalsKt.p());
                    androidx.compose.ui.platform.d2 d2Var15 = (androidx.compose.ui.platform.d2) pVar1114.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA2 = companion16.a();
                    yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF15 = LayoutKt.f(nVarA119);
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
                    Updater.j(pVarB15, i0VarK15, companion16.d());
                    Updater.j(pVarB15, eVar119, companion16.b());
                    Updater.j(pVarB15, layoutDirection15, companion16.c());
                    Updater.j(pVarB15, d2Var15, companion16.f());
                    pVar1114.x();
                    qVarF15.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVar1114)), pVar1114, 0);
                    pVar1114.T(2058660585);
                    pVar1114.T(-2137368960);
                    BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.f5954a;
                    pVar1114.T(2060475106);
                    CompositionLocalKt.b(new androidx.compose.runtime.k1[]{ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(m2VarB)))}, pVar1115, pVar1114, ((i2110 >> 6) & 112) | 8);
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
                aVarB = androidx.compose.runtime.internal.b.b(pVarF, 1644987592, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1
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
                    public final void a(@dl.e androidx.compose.runtime.p pVar1114, int i218) {
                        if ((i218 & 11) == 2 && pVar1114.b()) {
                            pVar1114.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1644987592, i218, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:180)");
                        }
                        final TextStyle textStyleA = TypographyKt.a(o0.f12059a.c(pVar1114, 6), t0.f0.f139726a.A());
                        s0 s0Var18 = s0VarA;
                        boolean z1111110 = z10;
                        int i219 = i21;
                        androidx.compose.runtime.k1[] k1VarArr = {ContentColorKt.a().f(androidx.compose.ui.graphics.l0.n(b(s0Var18.c(z1111110, pVar1114, ((i219 >> 21) & 112) | ((i219 >> 3) & 14)))))};
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1115 = pVar3;
                        final int i2110 = i21;
                        CompositionLocalKt.b(k1VarArr, androidx.compose.runtime.internal.b.b(pVar1114, 2061683080, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$styledLabel$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar1116, int i2111) {
                                if ((i2111 & 11) == 2 && pVar1116.b()) {
                                    pVar1116.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(2061683080, i2111, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous>.<anonymous> (NavigationBar.kt:183)");
                                }
                                TextKt.a(textStyleA, pVar1115, pVar1116, (i2110 >> 15) & 112);
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
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar1114 = pVar3;
            if (objU2 == companion.a()) {
                androidx.compose.runtime.a1 a1VarG15 = h2.g(0, null, 2, null);
                pVarF.N(a1VarG15);
                objU2 = a1VarG15;
            }
            pVarF.c0();
            a1Var = (androidx.compose.runtime.a1) objU2;
            androidx.compose.ui.n nVarA119 = androidx.compose.foundation.layout.w0.a(x0Var, SelectableKt.a(nVar2, z10, gVar3, null, z14, androidx.compose.ui.semantics.g.g(androidx.compose.ui.semantics.g.INSTANCE.f()), onClick), 1.0f, false, 2, null);
            pVarF.T(1157296644);
            zS = pVarF.s(a1Var);
            boolean z1111110 = z14;
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(long j10) {
                        NavigationBarKt.d(a1Var, s1.r.m(j10));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                        a(rVar.getF139248a());
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            } else {
                objU3 = new yh.l<s1.r, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(long j10) {
                        NavigationBarKt.d(a1Var, s1.r.m(j10));
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(s1.r rVar) {
                        a(rVar.getF139248a());
                        return kotlin.b2.f124493a;
                    }
                };
                pVarF.N(objU3);
            }
            pVarF.c0();
            androidx.compose.ui.n nVarA1110 = OnRemeasuredModifierKt.a(nVarA119, (yh.l) objU3);
            androidx.compose.ui.c cVarI15 = androidx.compose.ui.c.INSTANCE.i();
            pVarF.T(733328855);
            nVar3 = nVar2;
            androidx.compose.ui.layout.i0 i0VarK15 = BoxKt.k(cVarI15, false, pVarF, 6);
            pVarF.T(-1323940314);
            s1.e eVar119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection15 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            androidx.compose.ui.platform.d2 d2Var15 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
            aVarA = companion16.a();
            yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF15 = LayoutKt.f(nVarA1110);
            boolean z1111111 = z13;
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
            Updater.j(pVarB15, i0VarK15, companion16.d());
            Updater.j(pVarB15, eVar119, companion16.b());
            Updater.j(pVarB15, layoutDirection15, companion16.c());
            Updater.j(pVarB15, d2Var15, companion16.f());
            pVarF.x();
            qVarF15.invoke(androidx.compose.runtime.v1.a(androidx.compose.runtime.v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarF.T(-2137368960);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.f5954a;
            pVarF.T(1796243068);
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            final m2<Float> m2VarF15 = AnimateAsStateKt.f(f10, androidx.compose.animation.core.i.q(100, 0, null, 6, null), 0.0f, null, pVarF, 48, 12);
            s1.e eVar1110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            jA = b1.g.a((c(a1Var) - eVar1110.e1(t0.f0.f139726a.i())) / 2, eVar1110.E1(f9830k));
            kotlin.b2 b2Var15 = kotlin.b2.f124493a;
            b1.f fVarD15 = b1.f.d(jA);
            pVarF.T(511388516);
            zS2 = pVarF.s(fVarD15) | pVarF.s(gVar3);
            objU4 = pVarF.U();
            if (zS2) {
                objU4 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU4);
            } else {
                objU4 = new MappedInteractionSource(gVar3, jA, null);
                pVarF.N(objU4);
            }
            pVarF.c0();
            final MappedInteractionSource mappedInteractionSource15 = (MappedInteractionSource) objU4;
            f(androidx.compose.runtime.internal.b.b(pVarF, 691730997, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicatorRipple$1
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1115, int i218) {
                    if ((i218 & 11) == 2 && pVar1115.b()) {
                        pVar1115.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(691730997, i218, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:229)");
                    }
                    BoxKt.a(IndicationKt.b(androidx.compose.ui.draw.d.a(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicatorRipple"), ShapesKt.d(t0.f0.f139726a.h(), pVar1115, 6)), mappedInteractionSource15, androidx.compose.material.ripple.j.e(false, 0.0f, 0L, pVar1115, 0, 7)), pVar1115, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1115, Integer num) {
                    a(pVar1115, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), androidx.compose.runtime.internal.b.b(pVarF, -474426875, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$3$indicator$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar1115, int i218) {
                    if ((i218 & 11) == 2 && pVar1115.b()) {
                        pVar1115.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-474426875, i218, -1, "androidx.compose.material3.NavigationBarItem.<anonymous>.<anonymous> (NavigationBar.kt:237)");
                    }
                    BoxKt.a(BackgroundKt.c(LayoutIdKt.b(androidx.compose.ui.n.INSTANCE, "indicator"), androidx.compose.ui.graphics.l0.w(s0VarA.getSelectedIndicatorColor(), NavigationBarKt.e(m2VarF15), 0.0f, 0.0f, 0.0f, 14, null), ShapesKt.d(t0.f0.f139726a.h(), pVar1115, 6)), pVar1115, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1115, Integer num) {
                    a(pVar1115, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), aVarB16, aVarB, z1111111, e(m2VarF15), pVarF, ((i21 >> 9) & 57344) | bb.c.b.f31011w5);
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            gVar4 = gVar3;
            s0Var2 = s0VarA;
            pVar4 = pVar1114;
            z15 = z1111110;
            z16 = z1111111;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar11 = nVar3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItem$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar1115, int i218) {
                NavigationBarKt.b(x0Var, z10, onClick, icon, nVar11, z15, pVar4, z16, s0Var2, gVar4, pVar1115, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar1115, Integer num) {
                a(pVar1115, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    private static final int c(androidx.compose.runtime.a1<Integer> a1Var) {
        return a1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(androidx.compose.runtime.a1<Integer> a1Var, int i10) {
        a1Var.setValue(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(m2<Float> m2Var) {
        return m2Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final void f(final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar2, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3, final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4, final boolean z10, final float f10, androidx.compose.runtime.p pVar5, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar5.F(591111291);
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
                ComposerKt.w0(591111291, i11, -1, "androidx.compose.material3.NavigationBarItemBaselineLayout (NavigationBar.kt:381)");
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
            pVarF.T(1170727090);
            pVar.invoke(pVarF, Integer.valueOf(i11 & 14));
            pVarF.T(-311736667);
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
            pVarF.T(-1237554120);
            pVar3.invoke(pVarF, Integer.valueOf((i11 >> 6) & 14));
            pVarF.c0();
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (pVar4 != null) {
                androidx.compose.ui.n nVarM = PaddingKt.m(androidx.compose.ui.draw.a.a(LayoutIdKt.b(companion, "label"), z10 ? 1.0f : f10), s1.h.g(f9826g / 2), 0.0f, 2, null);
                pVarF.T(733328855);
                androidx.compose.ui.layout.i0 i0VarK2 = BoxKt.k(companion3.C(), false, pVarF, 0);
                pVarF.T(-1323940314);
                s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                androidx.compose.ui.platform.d2 d2Var3 = (androidx.compose.ui.platform.d2) pVarF.K(CompositionLocalsKt.u());
                yh.a<ComposeUiNode> aVarA3 = companion2.a();
                yh.q<androidx.compose.runtime.v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, kotlin.b2> qVarF3 = LayoutKt.f(nVarM);
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
                pVarF.T(359627658);
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
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$NavigationBarItemBaselineLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar6, int i12) {
                NavigationBarKt.f(pVar, pVar2, pVar3, pVar4, z10, f10, pVar6, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                a(pVar6, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    public static final float o() {
        return f9826g;
    }

    public static final float p() {
        return f9827h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.j0 q(androidx.compose.ui.layout.l0 l0Var, final androidx.compose.ui.layout.e1 e1Var, final androidx.compose.ui.layout.e1 e1Var2, final androidx.compose.ui.layout.e1 e1Var3, long j10) {
        final int iP = s1.b.p(j10);
        final int iO = s1.b.o(j10);
        final int width = (iP - e1Var.getWidth()) / 2;
        final int height = (iO - e1Var.getHeight()) / 2;
        final int width2 = (iP - e1Var2.getWidth()) / 2;
        final int height2 = (iO - e1Var2.getHeight()) / 2;
        return androidx.compose.ui.layout.k0.p(l0Var, iP, iO, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$placeIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1 e1Var4 = e1Var3;
                if (e1Var4 != null) {
                    androidx.compose.ui.layout.e1.a.v(layout, e1Var4, (iP - e1Var4.getWidth()) / 2, (iO - e1Var4.getHeight()) / 2, 0.0f, 4, null);
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
        float f11 = f9827h;
        final int iE1 = height - l0Var.e1(f11);
        final int iE2 = l0Var.e1(f11);
        final int iL0 = di.d.L0(((z10 ? iE2 : (iO - e1Var2.getHeight()) / 2) - iE2) * (1 - f10));
        final int iP = s1.b.p(j10);
        final int width = (iP - e1Var.getWidth()) / 2;
        final int width2 = (iP - e1Var2.getWidth()) / 2;
        final int width3 = (iP - e1Var3.getWidth()) / 2;
        final int iE3 = iE2 - l0Var.e1(f9829j);
        return androidx.compose.ui.layout.k0.p(l0Var, iP, iO, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.NavigationBarKt$placeLabelAndIcon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Code duplicated, block: B:12:0x003a  */
            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1 e1Var5 = e1Var4;
                if (e1Var5 != null) {
                    androidx.compose.ui.layout.e1.a.v(layout, e1Var5, (iP - e1Var5.getWidth()) / 2, iL0 + (iE2 - l0Var.e1(NavigationBarKt.f9829j)), 0.0f, 4, null);
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
