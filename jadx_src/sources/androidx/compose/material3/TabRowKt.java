package androidx.compose.material3;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: TabRow.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u0093\u0001\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042.\b\u0002\u0010\u000f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u009d\u0001\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00152.\b\u0002\u0010\u000f\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\b¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\u0007¢\u0006\u0002\b\u000e2\u0013\b\u0002\u0010\u0011\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000e2\u0011\u0010\u0012\u001a\r\u0012\u0004\u0012\u00020\r0\u0010¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019\"\u0017\u0010\u001b\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "selectedTabIndex", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/graphics/l0;", "containerColor", "contentColor", "Lkotlin/Function1;", "", "Landroidx/compose/material3/w1;", "Lkotlin/m0;", "name", "tabPositions", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "indicator", "Lkotlin/Function0;", SearchHelper.E, "tabs", "b", "(ILandroidx/compose/ui/n;JJLyh/q;Lyh/p;Lyh/p;Landroidx/compose/runtime/p;II)V", "Ls1/h;", "edgePadding", ak.av, "(ILandroidx/compose/ui/n;JJFLyh/q;Lyh/p;Lyh/p;Landroidx/compose/runtime/p;II)V", "F", "ScrollableTabRowMinimumTabWidth", "ScrollableTabRowPadding", "Landroidx/compose/animation/core/h;", "", ak.aF, "Landroidx/compose/animation/core/h;", "ScrollableTabRowScrollSpec", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class TabRowKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f11255a = s1.h.g(90);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f11256b = s1.h.g(52);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.animation.core.h<Float> f11257c = androidx.compose.animation.core.i.q(250, 0, androidx.compose.animation.core.d0.b(), 2, null);

    /* JADX WARN: Code duplicated, block: B:106:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:108:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:114:0x0151  */
    /* JADX WARN: Code duplicated, block: B:115:0x015a  */
    /* JADX WARN: Code duplicated, block: B:117:0x015d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:121:0x0171  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:124:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x018c  */
    /* JADX WARN: Code duplicated, block: B:130:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x0100  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.h
    public static final void a(final int i10, @dl.e androidx.compose.ui.n nVar, long j10, long j11, float f10, @dl.e yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> tabs, @dl.e androidx.compose.runtime.p pVar2, final int i11, final int i12) {
        int i13;
        long jB;
        long j12;
        int i14;
        float f11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.ui.n nVar2;
        long jC;
        float f12;
        yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVarB;
        int i21;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarB;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3;
        yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2;
        androidx.compose.ui.n nVar3;
        androidx.compose.runtime.u1 u1VarH;
        kotlin.jvm.internal.f0.p(tabs, "tabs");
        androidx.compose.runtime.p pVarF = pVar2.F(-497821003);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (pVarF.y(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i22 = i12 & 2;
        if (i22 == 0) {
            if ((i11 & 112) == 0) {
                i13 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i11 & bb.c.b.f30796me) == 0) {
                if ((i12 & 4) == 0) {
                    jB = j10;
                    int i23 = pVarF.z(jB) ? 256 : 128;
                    i13 |= i23;
                } else {
                    jB = j10;
                }
                i13 |= i23;
            } else {
                jB = j10;
            }
            if ((i11 & bb.c.g.f32954lc) == 0) {
                if ((i12 & 8) == 0) {
                    j12 = j11;
                    int i24 = pVarF.z(j12) ? 2048 : 1024;
                    i13 |= i24;
                } else {
                    j12 = j11;
                }
                i13 |= i24;
            } else {
                j12 = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    f11 = f10;
                    if (pVarF.w(f11)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i11 & 458752) == 0) {
                    if (pVarF.s(qVar)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (pVarF.s(pVar)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i12 & 128) != 0) {
                    i13 |= 12582912;
                } else if ((29360128 & i11) == 0) {
                    if (pVarF.s(tabs)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i13 |= i20;
                }
                if ((23967451 & i13) == 4793490 || !pVarF.b()) {
                    pVarF.W();
                    if ((i11 & 1) != 0 || pVarF.o()) {
                        if (i22 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            f12 = f11256b;
                        } else {
                            f12 = f11;
                        }
                        if (i16 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar4, int i25) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-913748678, i25, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar4, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar4, Integer num) {
                                    a(list, pVar4, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar;
                        }
                        if (i18 != 0) {
                            i21 = i13;
                            pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                        } else {
                            i21 = i13;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                        }
                        final float f13 = f12;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = pVarB;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar3 = qVarB;
                        final int i25 = i21;
                        SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i26) {
                                if ((i26 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(286469328, i26, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                                }
                                ScrollState scrollStateC = ScrollKt.c(0, pVar5, 0, 1);
                                pVar5.T(773894976);
                                pVar5.T(-492369756);
                                Object objU = pVar5.U();
                                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                                if (objU == companion.a()) {
                                    Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar5));
                                    pVar5.N(xVar);
                                    objU = xVar;
                                }
                                pVar5.c0();
                                kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                                pVar5.c0();
                                pVar5.T(511388516);
                                boolean zS = pVar5.s(scrollStateC) | pVar5.s(coroutineScope);
                                Object objU2 = pVar5.U();
                                if (zS || objU2 == companion.a()) {
                                    objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                                    pVar5.N(objU2);
                                }
                                pVar5.c0();
                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                                androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                                final float f14 = f13;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = tabs;
                                final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = pVar4;
                                final int i27 = i10;
                                final yh.q<List<TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2> qVar4 = qVar3;
                                final int i28 = i25;
                                SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j13) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                                        final int iE2 = SubcomposeLayout.e1(f14);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar6);
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                                        }
                                        long jE = s1.b.e(j13, iE1, 0, iMax, 0, 10, null);
                                        final ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                                        }
                                        Iterator it3 = arrayList.iterator();
                                        int width = iE2 * 2;
                                        while (it3.hasNext()) {
                                            width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                                        }
                                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar8 = pVar7;
                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                        final int i29 = i27;
                                        final yh.q<List<TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = qVar4;
                                        final int i30 = i28;
                                        final int i31 = width;
                                        final int i32 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                final ArrayList arrayList2 = new ArrayList();
                                                int i33 = iE2;
                                                List<androidx.compose.ui.layout.e1> list = arrayList;
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                int width2 = i33;
                                                for (androidx.compose.ui.layout.e1 e1Var : list) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                                    arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                                    width2 += e1Var.getWidth();
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar8);
                                                long j14 = j13;
                                                int i34 = i31;
                                                int i35 = i32;
                                                Iterator<T> it4 = listY2.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j14, i34, i34, 0, 0, 8, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    i35 = i35;
                                                    j14 = j14;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<List<TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2> qVar6 = qVar5;
                                                final int i36 = i30;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar9, int i37) {
                                                        if ((i37 & 11) == 2 && pVar9.b()) {
                                                            pVar9.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                        }
                                                        qVar6.invoke(arrayList2, pVar9, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                                                        a(pVar9, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i37 = i31;
                                                int i38 = i32;
                                                Iterator<T> it5 = listY3.iterator();
                                                while (it5.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                                }
                                                scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i29);
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                }, pVar5, 0, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarB;
                        f11 = f12;
                        qVar2 = qVarB;
                        nVar3 = nVar2;
                        j12 = jC;
                    } else {
                        pVarF.l();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        nVar2 = nVar;
                        i21 = i13;
                        jC = j12;
                        f12 = f11;
                        qVarB = qVar;
                    }
                    pVarB = pVar;
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                    }
                    final float f14 = f12;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5 = pVarB;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVarB;
                    final int i26 = i21;
                    SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar6, int i27) {
                            if ((i27 & 11) == 2 && pVar6.b()) {
                                pVar6.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(286469328, i27, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                            }
                            ScrollState scrollStateC = ScrollKt.c(0, pVar6, 0, 1);
                            pVar6.T(773894976);
                            pVar6.T(-492369756);
                            Object objU = pVar6.U();
                            androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar6));
                                pVar6.N(xVar);
                                objU = xVar;
                            }
                            pVar6.c0();
                            kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVar6.c0();
                            pVar6.T(511388516);
                            boolean zS = pVar6.s(scrollStateC) | pVar6.s(coroutineScope);
                            Object objU2 = pVar6.U();
                            if (zS || objU2 == companion.a()) {
                                objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                                pVar6.N(objU2);
                            }
                            pVar6.c0();
                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                            androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                            final float f15 = f14;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar5;
                            final int i28 = i10;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVar4;
                            final int i29 = i26;
                            SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j13) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                                    final int iE2 = SubcomposeLayout.e1(f15);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar7);
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                                    }
                                    long jE = s1.b.e(j13, iE1, 0, iMax, 0, 10, null);
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                                    }
                                    Iterator it3 = arrayList.iterator();
                                    int width = iE2 * 2;
                                    while (it3.hasNext()) {
                                        width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar8;
                                    final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                    final int i210 = i28;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVar5;
                                    final int i30 = i29;
                                    final int i31 = width;
                                    final int i32 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            final List<TabPosition> arrayList2 = new ArrayList();
                                            int i33 = iE2;
                                            List<androidx.compose.ui.layout.e1> list = arrayList;
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            int width2 = i33;
                                            for (androidx.compose.ui.layout.e1 e1Var : list) {
                                                androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                                arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                                width2 += e1Var.getWidth();
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar9);
                                            long j14 = j13;
                                            int i34 = i31;
                                            int i35 = i32;
                                            Iterator<T> it4 = listY2.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j14, i34, i34, 0, 0, 8, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                i35 = i35;
                                                j14 = j14;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar6;
                                            final int i36 = i30;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar10, int i37) {
                                                    if ((i37 & 11) == 2 && pVar10.b()) {
                                                        pVar10.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                    }
                                                    qVar7.invoke(arrayList2, pVar10, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                                    a(pVar10, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i37 = i31;
                                            int i38 = i32;
                                            Iterator<T> it5 = listY3.iterator();
                                            while (it5.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                            }
                                            scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i210);
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            }, pVar6, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                            a(pVar6, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarB;
                    f11 = f12;
                    qVar2 = qVarB;
                    nVar3 = nVar2;
                    j12 = jC;
                } else {
                    pVarF.l();
                    nVar3 = nVar;
                    qVar2 = qVar;
                    pVar3 = pVar;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar4 = nVar3;
                final long j13 = jB;
                final long j14 = j12;
                final float f15 = f11;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVar2;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar7, int i27) {
                        TabRowKt.a(i10, nVar4, j13, j14, f15, qVar5, pVar6, tabs, pVar7, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                        a(pVar7, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= 24576;
            f11 = f10;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(qVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(pVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (pVarF.s(tabs)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            if ((23967451 & i13) == 4793490) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar7, int i27) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i27, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar7, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar7, Integer num) {
                                a(list, pVar7, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar7, int i27) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i27, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar7, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar7, Integer num) {
                                a(list, pVar7, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                }
                final float f16 = f12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVarB;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVarB;
                final int i27 = i21;
                SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar8, int i28) {
                        if ((i28 & 11) == 2 && pVar8.b()) {
                            pVar8.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(286469328, i28, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                        }
                        ScrollState scrollStateC = ScrollKt.c(0, pVar8, 0, 1);
                        pVar8.T(773894976);
                        pVar8.T(-492369756);
                        Object objU = pVar8.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar8));
                            pVar8.N(xVar);
                            objU = xVar;
                        }
                        pVar8.c0();
                        kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVar8.c0();
                        pVar8.T(511388516);
                        boolean zS = pVar8.s(scrollStateC) | pVar8.s(coroutineScope);
                        Object objU2 = pVar8.U();
                        if (zS || objU2 == companion.a()) {
                            objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                            pVar8.N(objU2);
                        }
                        pVar8.c0();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                        androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                        final float f17 = f16;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar7;
                        final int i29 = i10;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar6;
                        final int i210 = i27;
                        SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j15) {
                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                                final int iE2 = SubcomposeLayout.e1(f17);
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar9);
                                Iterator<T> it = listY1.iterator();
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                                }
                                long jE = s1.b.e(j15, iE1, 0, iMax, 0, 10, null);
                                final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it2 = listY1.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                                }
                                Iterator it3 = arrayList.iterator();
                                int width = iE2 * 2;
                                while (it3.hasNext()) {
                                    width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                                }
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar10;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i211 = i29;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar7;
                                final int i30 = i210;
                                final int i31 = width;
                                final int i32 = iMax;
                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i33 = iE2;
                                        List<androidx.compose.ui.layout.e1> list = arrayList;
                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                        int width2 = i33;
                                        for (androidx.compose.ui.layout.e1 e1Var : list) {
                                            androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                            width2 += e1Var.getWidth();
                                        }
                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar11);
                                        long j16 = j15;
                                        int i34 = i31;
                                        int i35 = i32;
                                        Iterator<T> it4 = listY2.iterator();
                                        while (it4.hasNext()) {
                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j16, i34, i34, 0, 0, 8, null));
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                            i34 = i34;
                                            i35 = i35;
                                            j16 = j16;
                                        }
                                        androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVar8;
                                        final int i36 = i30;
                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i37) {
                                                if ((i37 & 11) == 2 && pVar12.b()) {
                                                    pVar12.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                }
                                                qVar9.invoke(arrayList2, pVar12, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                                a(pVar12, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }));
                                        int i37 = i31;
                                        int i38 = i32;
                                        Iterator<T> it5 = listY3.iterator();
                                        while (it5.hasNext()) {
                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i211);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                        a(aVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }, 4, null);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        }, pVar8, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                        a(pVar8, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarB;
                f11 = f12;
                qVar2 = qVarB;
                nVar3 = nVar2;
                j12 = jC;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar8, int i28) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i28, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar8, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar8, Integer num) {
                                a(list, pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar8, int i28) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i28, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar8, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar8, Integer num) {
                                a(list, pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                }
                final float f17 = f12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVarB;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVarB;
                final int i28 = i21;
                SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar9, int i29) {
                        if ((i29 & 11) == 2 && pVar9.b()) {
                            pVar9.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(286469328, i29, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                        }
                        ScrollState scrollStateC = ScrollKt.c(0, pVar9, 0, 1);
                        pVar9.T(773894976);
                        pVar9.T(-492369756);
                        Object objU = pVar9.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar9));
                            pVar9.N(xVar);
                            objU = xVar;
                        }
                        pVar9.c0();
                        kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVar9.c0();
                        pVar9.T(511388516);
                        boolean zS = pVar9.s(scrollStateC) | pVar9.s(coroutineScope);
                        Object objU2 = pVar9.U();
                        if (zS || objU2 == companion.a()) {
                            objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                            pVar9.N(objU2);
                        }
                        pVar9.c0();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                        androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                        final float f18 = f17;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar8;
                        final int i210 = i10;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar7;
                        final int i211 = i28;
                        SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j15) {
                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                                final int iE2 = SubcomposeLayout.e1(f18);
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar10);
                                Iterator<T> it = listY1.iterator();
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                                }
                                long jE = s1.b.e(j15, iE1, 0, iMax, 0, 10, null);
                                final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it2 = listY1.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                                }
                                Iterator it3 = arrayList.iterator();
                                int width = iE2 * 2;
                                while (it3.hasNext()) {
                                    width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                                }
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar11;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i212 = i210;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVar8;
                                final int i30 = i211;
                                final int i31 = width;
                                final int i32 = iMax;
                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i33 = iE2;
                                        List<androidx.compose.ui.layout.e1> list = arrayList;
                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                        int width2 = i33;
                                        for (androidx.compose.ui.layout.e1 e1Var : list) {
                                            androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                            width2 += e1Var.getWidth();
                                        }
                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar12);
                                        long j16 = j15;
                                        int i34 = i31;
                                        int i35 = i32;
                                        Iterator<T> it4 = listY2.iterator();
                                        while (it4.hasNext()) {
                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j16, i34, i34, 0, 0, 8, null));
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                            i34 = i34;
                                            i35 = i35;
                                            j16 = j16;
                                        }
                                        androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVar9;
                                        final int i36 = i30;
                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar13, int i37) {
                                                if ((i37 & 11) == 2 && pVar13.b()) {
                                                    pVar13.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                }
                                                qVar10.invoke(arrayList2, pVar13, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                                                a(pVar13, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }));
                                        int i37 = i31;
                                        int i38 = i32;
                                        Iterator<T> it5 = listY3.iterator();
                                        while (it5.hasNext()) {
                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i212);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                        a(aVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }, 4, null);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        }, pVar9, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                        a(pVar9, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarB;
                f11 = f12;
                qVar2 = qVarB;
                nVar3 = nVar2;
                j12 = jC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar5 = nVar3;
            final long j15 = jB;
            final long j16 = j12;
            final float f18 = f11;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar10, int i29) {
                    TabRowKt.a(i10, nVar5, j15, j16, f18, qVar8, pVar9, tabs, pVar10, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                    a(pVar10, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= 48;
        if ((i11 & bb.c.b.f30796me) == 0) {
            if ((i12 & 4) == 0) {
                jB = j10;
                if (pVarF.z(jB)) {
                }
                i13 |= i23;
            } else {
                jB = j10;
            }
            i13 |= i23;
        } else {
            jB = j10;
        }
        if ((i11 & bb.c.g.f32954lc) == 0) {
            if ((i12 & 8) == 0) {
                j12 = j11;
                if (pVarF.z(j12)) {
                }
                i13 |= i24;
            } else {
                j12 = j11;
            }
            i13 |= i24;
        } else {
            j12 = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                f11 = f10;
                if (pVarF.w(f11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i11 & 458752) == 0) {
                if (pVarF.s(qVar)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (pVarF.s(pVar)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i12 & 128) != 0) {
                i13 |= 12582912;
            } else if ((29360128 & i11) == 0) {
                if (pVarF.s(tabs)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i13 |= i20;
            }
            if ((23967451 & i13) == 4793490) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar10, int i29) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i29, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar10, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar10, Integer num) {
                                a(list, pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar10, int i29) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i29, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar10, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar10, Integer num) {
                                a(list, pVar10, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                }
                final float f19 = f12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVarB;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVarB;
                final int i29 = i21;
                SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i210) {
                        if ((i210 & 11) == 2 && pVar11.b()) {
                            pVar11.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(286469328, i210, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                        }
                        ScrollState scrollStateC = ScrollKt.c(0, pVar11, 0, 1);
                        pVar11.T(773894976);
                        pVar11.T(-492369756);
                        Object objU = pVar11.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar11));
                            pVar11.N(xVar);
                            objU = xVar;
                        }
                        pVar11.c0();
                        kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVar11.c0();
                        pVar11.T(511388516);
                        boolean zS = pVar11.s(scrollStateC) | pVar11.s(coroutineScope);
                        Object objU2 = pVar11.U();
                        if (zS || objU2 == companion.a()) {
                            objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                            pVar11.N(objU2);
                        }
                        pVar11.c0();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                        androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                        final float f110 = f19;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar10;
                        final int i211 = i10;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVar9;
                        final int i212 = i29;
                        SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j17) {
                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                                final int iE2 = SubcomposeLayout.e1(f110);
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar12);
                                Iterator<T> it = listY1.iterator();
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                                }
                                long jE = s1.b.e(j17, iE1, 0, iMax, 0, 10, null);
                                final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it2 = listY1.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                                }
                                Iterator it3 = arrayList.iterator();
                                int width = iE2 * 2;
                                while (it3.hasNext()) {
                                    width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                                }
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar13;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i213 = i211;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar10;
                                final int i30 = i212;
                                final int i31 = width;
                                final int i32 = iMax;
                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i33 = iE2;
                                        List<androidx.compose.ui.layout.e1> list = arrayList;
                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                        int width2 = i33;
                                        for (androidx.compose.ui.layout.e1 e1Var : list) {
                                            androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                            width2 += e1Var.getWidth();
                                        }
                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar14);
                                        long j18 = j17;
                                        int i34 = i31;
                                        int i35 = i32;
                                        Iterator<T> it4 = listY2.iterator();
                                        while (it4.hasNext()) {
                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j18, i34, i34, 0, 0, 8, null));
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                            i34 = i34;
                                            i35 = i35;
                                            j18 = j18;
                                        }
                                        androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVar11;
                                        final int i36 = i30;
                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar15, int i37) {
                                                if ((i37 & 11) == 2 && pVar15.b()) {
                                                    pVar15.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                }
                                                qVar12.invoke(arrayList2, pVar15, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                                                a(pVar15, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }));
                                        int i37 = i31;
                                        int i38 = i32;
                                        Iterator<T> it5 = listY3.iterator();
                                        while (it5.hasNext()) {
                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i213);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                        a(aVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }, 4, null);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        }, pVar11, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarB;
                f11 = f12;
                qVar2 = qVarB;
                nVar3 = nVar2;
                j12 = jC;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar11, int i210) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i210, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar11, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar11, Integer num) {
                                a(list, pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                } else {
                    if (i22 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        f12 = f11256b;
                    } else {
                        f12 = f11;
                    }
                    if (i16 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar11, int i210) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-913748678, i210, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar11, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar11, Integer num) {
                                a(list, pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar;
                    }
                    if (i18 != 0) {
                        i21 = i13;
                        pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                    } else {
                        i21 = i13;
                        pVarB = pVar;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
                }
                final float f110 = f12;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVarB;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVarB;
                final int i210 = i21;
                SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar12, int i211) {
                        if ((i211 & 11) == 2 && pVar12.b()) {
                            pVar12.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(286469328, i211, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                        }
                        ScrollState scrollStateC = ScrollKt.c(0, pVar12, 0, 1);
                        pVar12.T(773894976);
                        pVar12.T(-492369756);
                        Object objU = pVar12.U();
                        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar12));
                            pVar12.N(xVar);
                            objU = xVar;
                        }
                        pVar12.c0();
                        kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVar12.c0();
                        pVar12.T(511388516);
                        boolean zS = pVar12.s(scrollStateC) | pVar12.s(coroutineScope);
                        Object objU2 = pVar12.U();
                        if (zS || objU2 == companion.a()) {
                            objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                            pVar12.N(objU2);
                        }
                        pVar12.c0();
                        final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                        androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                        final float f111 = f110;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar11;
                        final int i212 = i10;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar10;
                        final int i213 = i210;
                        SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j17) {
                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                                final int iE2 = SubcomposeLayout.e1(f111);
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar13);
                                Iterator<T> it = listY1.iterator();
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                                }
                                long jE = s1.b.e(j17, iE1, 0, iMax, 0, 10, null);
                                final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it2 = listY1.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                                }
                                Iterator it3 = arrayList.iterator();
                                int width = iE2 * 2;
                                while (it3.hasNext()) {
                                    width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                                }
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar14;
                                final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                final int i214 = i212;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVar11;
                                final int i30 = i213;
                                final int i31 = width;
                                final int i32 = iMax;
                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                        final List<TabPosition> arrayList2 = new ArrayList();
                                        int i33 = iE2;
                                        List<androidx.compose.ui.layout.e1> list = arrayList;
                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                        int width2 = i33;
                                        for (androidx.compose.ui.layout.e1 e1Var : list) {
                                            androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                            arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                            width2 += e1Var.getWidth();
                                        }
                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar15);
                                        long j18 = j17;
                                        int i34 = i31;
                                        int i35 = i32;
                                        Iterator<T> it4 = listY2.iterator();
                                        while (it4.hasNext()) {
                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j18, i34, i34, 0, 0, 8, null));
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                            i34 = i34;
                                            i35 = i35;
                                            j18 = j18;
                                        }
                                        androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVar12;
                                        final int i36 = i30;
                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar16, int i37) {
                                                if ((i37 & 11) == 2 && pVar16.b()) {
                                                    pVar16.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                                }
                                                qVar13.invoke(arrayList2, pVar16, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                                                a(pVar16, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }));
                                        int i37 = i31;
                                        int i38 = i32;
                                        Iterator<T> it5 = listY3.iterator();
                                        while (it5.hasNext()) {
                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                        }
                                        scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i214);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                        a(aVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }, 4, null);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        }, pVar12, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                        a(pVar12, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarB;
                f11 = f12;
                qVar2 = qVarB;
                nVar3 = nVar2;
                j12 = jC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar6 = nVar3;
            final long j17 = jB;
            final long j18 = j12;
            final float f111 = f11;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar2;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar13, int i211) {
                    TabRowKt.a(i10, nVar6, j17, j18, f111, qVar11, pVar12, tabs, pVar13, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                    a(pVar13, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= 24576;
        f11 = f10;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i11 & 458752) == 0) {
            if (pVarF.s(qVar)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i13 |= i17;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (pVarF.s(pVar)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        if ((i12 & 128) != 0) {
            i13 |= 12582912;
        } else if ((29360128 & i11) == 0) {
            if (pVarF.s(tabs)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        if ((23967451 & i13) == 4793490) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    f12 = f11256b;
                } else {
                    f12 = f11;
                }
                if (i16 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar13, int i211) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-913748678, i211, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar13, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar13, Integer num) {
                            a(list, pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar;
                }
                if (i18 != 0) {
                    i21 = i13;
                    pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                } else {
                    i21 = i13;
                    pVarB = pVar;
                }
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    f12 = f11256b;
                } else {
                    f12 = f11;
                }
                if (i16 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar13, int i211) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-913748678, i211, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar13, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar13, Integer num) {
                            a(list, pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar;
                }
                if (i18 != 0) {
                    i21 = i13;
                    pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                } else {
                    i21 = i13;
                    pVarB = pVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
            }
            final float f112 = f12;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVarB;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVarB;
            final int i211 = i21;
            SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar14, int i212) {
                    if ((i212 & 11) == 2 && pVar14.b()) {
                        pVar14.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(286469328, i212, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                    }
                    ScrollState scrollStateC = ScrollKt.c(0, pVar14, 0, 1);
                    pVar14.T(773894976);
                    pVar14.T(-492369756);
                    Object objU = pVar14.U();
                    androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar14));
                        pVar14.N(xVar);
                        objU = xVar;
                    }
                    pVar14.c0();
                    kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVar14.c0();
                    pVar14.T(511388516);
                    boolean zS = pVar14.s(scrollStateC) | pVar14.s(coroutineScope);
                    Object objU2 = pVar14.U();
                    if (zS || objU2 == companion.a()) {
                        objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                        pVar14.N(objU2);
                    }
                    pVar14.c0();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                    androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                    final float f113 = f112;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = tabs;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar13;
                    final int i213 = i10;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVar12;
                    final int i214 = i211;
                    SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @dl.d
                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j19) {
                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                            int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                            final int iE2 = SubcomposeLayout.e1(f113);
                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar15);
                            Iterator<T> it = listY1.iterator();
                            int iMax = 0;
                            while (it.hasNext()) {
                                iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                            }
                            long jE = s1.b.e(j19, iE1, 0, iMax, 0, 10, null);
                            final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                            Iterator<T> it2 = listY1.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                            }
                            Iterator it3 = arrayList.iterator();
                            int width = iE2 * 2;
                            while (it3.hasNext()) {
                                width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                            }
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar16;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i215 = i213;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar13;
                            final int i30 = i214;
                            final int i31 = width;
                            final int i32 = iMax;
                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int i33 = iE2;
                                    List<androidx.compose.ui.layout.e1> list = arrayList;
                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                    int width2 = i33;
                                    for (androidx.compose.ui.layout.e1 e1Var : list) {
                                        androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                        arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                        width2 += e1Var.getWidth();
                                    }
                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar17);
                                    long j110 = j19;
                                    int i34 = i31;
                                    int i35 = i32;
                                    Iterator<T> it4 = listY2.iterator();
                                    while (it4.hasNext()) {
                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j110, i34, i34, 0, 0, 8, null));
                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                        i34 = i34;
                                        i35 = i35;
                                        j110 = j110;
                                    }
                                    androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVar14;
                                    final int i36 = i30;
                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar18, int i37) {
                                            if ((i37 & 11) == 2 && pVar18.b()) {
                                                pVar18.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                            }
                                            qVar15.invoke(arrayList2, pVar18, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                                            a(pVar18, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }));
                                    int i37 = i31;
                                    int i38 = i32;
                                    Iterator<T> it5 = listY3.iterator();
                                    while (it5.hasNext()) {
                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i215);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                    a(aVar);
                                    return kotlin.b2.f124493a;
                                }
                            }, 4, null);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                            return a(q1Var, bVar.getF139216a());
                        }
                    }, pVar14, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                    a(pVar14, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar3 = pVarB;
            f11 = f12;
            qVar2 = qVarB;
            nVar3 = nVar2;
            j12 = jC;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    f12 = f11256b;
                } else {
                    f12 = f11;
                }
                if (i16 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar14, int i212) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-913748678, i212, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar14, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar14, Integer num) {
                            a(list, pVar14, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar;
                }
                if (i18 != 0) {
                    i21 = i13;
                    pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                } else {
                    i21 = i13;
                    pVarB = pVar;
                }
            } else {
                if (i22 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    f12 = f11256b;
                } else {
                    f12 = f11;
                }
                if (i16 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -913748678, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar14, int i212) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-913748678, i212, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:227)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar14, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar14, Integer num) {
                            a(list, pVar14, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar;
                }
                if (i18 != 0) {
                    i21 = i13;
                    pVarB = ComposableSingletons$TabRowKt.f9330a.b();
                } else {
                    i21 = i13;
                    pVarB = pVar;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-497821003, i21, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:221)");
            }
            final float f113 = f12;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVarB;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVarB;
            final int i212 = i21;
            SurfaceKt.a(nVar2, null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 286469328, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar15, int i213) {
                    if ((i213 & 11) == 2 && pVar15.b()) {
                        pVar15.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(286469328, i213, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:241)");
                    }
                    ScrollState scrollStateC = ScrollKt.c(0, pVar15, 0, 1);
                    pVar15.T(773894976);
                    pVar15.T(-492369756);
                    Object objU = pVar15.U();
                    androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        Object xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar15));
                        pVar15.N(xVar);
                        objU = xVar;
                    }
                    pVar15.c0();
                    kotlinx.coroutines.q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVar15.c0();
                    pVar15.T(511388516);
                    boolean zS = pVar15.s(scrollStateC) | pVar15.s(coroutineScope);
                    Object objU2 = pVar15.U();
                    if (zS || objU2 == companion.a()) {
                        objU2 = new ScrollableTabData(scrollStateC, coroutineScope);
                        pVar15.N(objU2);
                    }
                    pVar15.c0();
                    final ScrollableTabData scrollableTabData = (ScrollableTabData) objU2;
                    androidx.compose.ui.n nVarB = androidx.compose.ui.draw.d.b(SelectableGroupKt.a(ScrollKt.b(SizeKt.N(SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null), androidx.compose.ui.c.INSTANCE.o(), false, 2, null), scrollStateC, false, null, false, 14, null)));
                    final float f114 = f113;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = tabs;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar14;
                    final int i214 = i10;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar13;
                    final int i215 = i212;
                    SubcomposeLayoutKt.a(nVarB, new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @dl.d
                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j19) {
                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                            int iE1 = SubcomposeLayout.e1(TabRowKt.f11255a);
                            final int iE2 = SubcomposeLayout.e1(f114);
                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar16);
                            Iterator<T> it = listY1.iterator();
                            int iMax = 0;
                            while (it.hasNext()) {
                                iMax = Math.max(iMax, ((androidx.compose.ui.layout.g0) it.next()).V(Integer.MAX_VALUE));
                            }
                            long jE = s1.b.e(j19, iE1, 0, iMax, 0, 10, null);
                            final List<? extends androidx.compose.ui.layout.e1> arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                            Iterator<T> it2 = listY1.iterator();
                            while (it2.hasNext()) {
                                arrayList.add(((androidx.compose.ui.layout.g0) it2.next()).z1(jE));
                            }
                            Iterator it3 = arrayList.iterator();
                            int width = iE2 * 2;
                            while (it3.hasNext()) {
                                width += ((androidx.compose.ui.layout.e1) it3.next()).getWidth();
                            }
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar17;
                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                            final int i216 = i214;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVar14;
                            final int i30 = i215;
                            final int i31 = width;
                            final int i32 = iMax;
                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, width, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(1);
                                }

                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                    final List<TabPosition> arrayList2 = new ArrayList();
                                    int i33 = iE2;
                                    List<androidx.compose.ui.layout.e1> list = arrayList;
                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                    int width2 = i33;
                                    for (androidx.compose.ui.layout.e1 e1Var : list) {
                                        androidx.compose.ui.layout.e1.a.v(layout, e1Var, width2, 0, 0.0f, 4, null);
                                        arrayList2.add(new TabPosition(q1Var.E(width2), q1Var.E(e1Var.getWidth()), null));
                                        width2 += e1Var.getWidth();
                                    }
                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar18);
                                    long j110 = j19;
                                    int i34 = i31;
                                    int i35 = i32;
                                    Iterator<T> it4 = listY2.iterator();
                                    while (it4.hasNext()) {
                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.e(j110, i34, i34, 0, 0, 8, null));
                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i35 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                        i34 = i34;
                                        i35 = i35;
                                        j110 = j110;
                                    }
                                    androidx.compose.ui.layout.q1 q1Var2 = SubcomposeLayout;
                                    TabSlots tabSlots = TabSlots.Indicator;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVar15;
                                    final int i36 = i30;
                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var2.y1(tabSlots, androidx.compose.runtime.internal.b.c(963343607, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRow.2.1.1.3
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar19, int i37) {
                                            if ((i37 & 11) == 2 && pVar19.b()) {
                                                pVar19.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(963343607, i37, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:301)");
                                            }
                                            qVar16.invoke(arrayList2, pVar19, Integer.valueOf(((i36 >> 12) & 112) | 8));
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                                            a(pVar19, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    }));
                                    int i37 = i31;
                                    int i38 = i32;
                                    Iterator<T> it5 = listY3.iterator();
                                    while (it5.hasNext()) {
                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it5.next()).z1(s1.b.f139198b.c(i37, i38)), 0, 0, 0.0f, 4, null);
                                    }
                                    scrollableTabData2.c(SubcomposeLayout, iE2, arrayList2, i216);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                    a(aVar);
                                    return kotlin.b2.f124493a;
                                }
                            }, 4, null);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                            return a(q1Var, bVar.getF139216a());
                        }
                    }, pVar15, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                    a(pVar15, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, ((i21 >> 3) & 14) | 12582912 | (i21 & bb.c.b.f30796me) | (i21 & bb.c.g.f32954lc), 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar3 = pVarB;
            f11 = f12;
            qVar2 = qVarB;
            nVar3 = nVar2;
            j12 = jC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar7 = nVar3;
        final long j19 = jB;
        final long j110 = j12;
        final float f114 = f11;
        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar2;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar16, int i213) {
                TabRowKt.a(i10, nVar7, j19, j110, f114, qVar14, pVar15, tabs, pVar16, i11 | 1, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                a(pVar16, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011c  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x0131  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:110:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0159  */
    /* JADX WARN: Code duplicated, block: B:116:0x0193  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d A[PHI: r0 r3 r4 r6 r8
  0x010d: PHI (r0v8 androidx.compose.ui.n) = (r0v5 androidx.compose.ui.n), (r0v12 androidx.compose.ui.n) binds: [B:109:0x0143, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r3v25 int) = (r3v19 int), (r3v28 int) binds: [B:109:0x0143, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r4v9 long) = (r4v4 long), (r4v10 long) binds: [B:109:0x0143, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r6v10 long) = (r6v7 long), (r6v6 long) binds: [B:109:0x0143, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]
  0x010d: PHI (r8v7 yh.q<? super java.util.List<androidx.compose.material3.w1>, ? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2>) = 
  (r8v3 yh.q<? super java.util.List<androidx.compose.material3.w1>, ? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2>)
  (r8v8 yh.q<? super java.util.List<androidx.compose.material3.w1>, ? super androidx.compose.runtime.p, ? super java.lang.Integer, kotlin.b2>)
 binds: [B:109:0x0143, B:94:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x0110 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    @androidx.compose.runtime.h
    public static final void b(final int i10, @dl.e androidx.compose.ui.n nVar, long j10, long j11, @dl.e yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar, @dl.e yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> tabs, @dl.e androidx.compose.runtime.p pVar2, final int i11, final int i12) {
        int i13;
        long jB;
        long j12;
        int i14;
        yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar2;
        int i15;
        int i16;
        yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar3;
        int i17;
        int i18;
        androidx.compose.ui.n nVar2;
        long jC;
        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVarB;
        final int i19;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVarA;
        androidx.compose.ui.n nVar3;
        androidx.compose.runtime.u1 u1VarH;
        int i20;
        kotlin.jvm.internal.f0.p(tabs, "tabs");
        androidx.compose.runtime.p pVarF = pVar2.F(-1199178586);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (pVarF.y(i10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 112) == 0) {
                i13 |= pVarF.s(nVar) ? 32 : 16;
            }
            if ((i11 & bb.c.b.f30796me) == 0) {
                if ((i12 & 4) == 0) {
                    jB = j10;
                    int i22 = pVarF.z(jB) ? 256 : 128;
                    i13 |= i22;
                } else {
                    jB = j10;
                }
                i13 |= i22;
            } else {
                jB = j10;
            }
            if ((i11 & bb.c.g.f32954lc) == 0) {
                j12 = j11;
                if ((i12 & 8) == 0 || !pVarF.z(j12)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i13 |= i20;
            } else {
                j12 = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((57344 & i11) == 0) {
                    qVar2 = qVar;
                    if (pVarF.s(qVar2)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        pVar3 = pVar;
                        if (pVarF.s(pVar3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 64) != 0) {
                        if ((i11 & 3670016) == 0) {
                            if (pVarF.s(tabs)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                        }
                        if ((i13 & 2995931) == 599186 || !pVarF.b()) {
                            pVarF.W();
                            if ((i11 & 1) != 0 || pVarF.o()) {
                                if (i21 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar2 = nVar;
                                }
                                if ((i12 & 4) != 0) {
                                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                    i13 &= -897;
                                }
                                if ((i12 & 8) != 0) {
                                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                    i13 &= -7169;
                                } else {
                                    jC = j12;
                                }
                                if (i14 != 0) {
                                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar4, int i23) {
                                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                            }
                                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar4, bb.c.d.f31193dj, 6);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.q
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar4, Integer num) {
                                            a(list, pVar4, num.intValue());
                                            return kotlin.b2.f124493a;
                                        }
                                    });
                                } else {
                                    qVarB = qVar2;
                                }
                                if (i16 != 0) {
                                    i19 = i13;
                                    pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                                }
                                pVarF.O();
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                                }
                                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar4, int i23) {
                                        if ((i23 & 11) == 2 && pVar4.b()) {
                                            pVar4.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                        }
                                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar5 = tabs;
                                        final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar6 = pVarA;
                                        final yh.q<List<TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2> qVar3 = qVarB;
                                        final int i24 = i19;
                                        pVar4.T(1618982084);
                                        boolean zS = pVar4.s(pVar5) | pVar4.s(pVar6) | pVar4.s(qVar3);
                                        Object objU = pVar4.U();
                                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @dl.d
                                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j13) {
                                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                                    int iP = s1.b.p(j13);
                                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar5);
                                                    int size = listY1.size();
                                                    final int i25 = iP / size;
                                                    Iterator<T> it = listY1.iterator();
                                                    int iMax = 0;
                                                    while (it.hasNext()) {
                                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                                    }
                                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                                    Iterator<T> it2 = listY1.iterator();
                                                    while (it2.hasNext()) {
                                                        int i26 = iP;
                                                        ArrayList arrayList2 = arrayList;
                                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j13, i25, i25, iMax, 0, 8, null)));
                                                        arrayList = arrayList2;
                                                        iP = i26;
                                                    }
                                                    final int i27 = iP;
                                                    final ArrayList arrayList3 = arrayList;
                                                    final ArrayList arrayList4 = new ArrayList(size);
                                                    for (int i28 = 0; i28 < size; i28++) {
                                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                                    }
                                                    final yh.p<androidx.compose.runtime.p, Integer, kotlin.b2> pVar7 = pVar6;
                                                    final yh.q<List<TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2> qVar4 = qVar3;
                                                    final int i29 = i24;
                                                    final int i30 = iMax;
                                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(1);
                                                        }

                                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                            int i31 = i25;
                                                            int i32 = 0;
                                                            for (Object obj : list) {
                                                                int i33 = i32 + 1;
                                                                if (i32 < 0) {
                                                                    CollectionsKt__CollectionsKt.W();
                                                                }
                                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                                i32 = i33;
                                                            }
                                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar7);
                                                            long j14 = j13;
                                                            int i34 = i30;
                                                            Iterator<T> it3 = listY2.iterator();
                                                            while (it3.hasNext()) {
                                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j14, 0, 0, 0, 0, 11, null));
                                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                                i34 = i34;
                                                                j14 = j14;
                                                            }
                                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                            TabSlots tabSlots = TabSlots.Indicator;
                                                            final yh.q<List<TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2> qVar5 = qVar4;
                                                            final List<TabPosition> list2 = arrayList4;
                                                            final int i35 = i29;
                                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(2);
                                                                }

                                                                @androidx.compose.runtime.h
                                                                public final void a(@dl.e androidx.compose.runtime.p pVar8, int i36) {
                                                                    if ((i36 & 11) == 2 && pVar8.b()) {
                                                                        pVar8.l();
                                                                        return;
                                                                    }
                                                                    if (ComposerKt.g0()) {
                                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                                    }
                                                                    qVar5.invoke(list2, pVar8, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                                    if (ComposerKt.g0()) {
                                                                        ComposerKt.v0();
                                                                    }
                                                                }

                                                                @Override // yh.p
                                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                                                    a(pVar8, num.intValue());
                                                                    return kotlin.b2.f124493a;
                                                                }
                                                            }));
                                                            int i36 = i27;
                                                            int i37 = i30;
                                                            Iterator<T> it4 = listY3.iterator();
                                                            while (it4.hasNext()) {
                                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                            }
                                                        }

                                                        @Override // yh.l
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                            a(aVar);
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }, 4, null);
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                                    return a(q1Var, bVar.getF139216a());
                                                }
                                            };
                                            pVar4.N(objU);
                                        }
                                        pVar4.c0();
                                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar4, 6, 0);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                                        a(pVar4, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                pVar3 = pVarA;
                                j12 = jC;
                                nVar3 = nVar2;
                            } else {
                                pVarF.l();
                                if ((i12 & 4) != 0) {
                                    i13 &= -897;
                                }
                                if ((i12 & 8) != 0) {
                                    i13 &= -7169;
                                }
                                nVar2 = nVar;
                                jC = j12;
                                qVarB = qVar2;
                            }
                            i19 = i13;
                            pVarA = pVar3;
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                            }
                            SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar4, int i23) {
                                    if ((i23 & 11) == 2 && pVar4.b()) {
                                        pVar4.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                    }
                                    androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5 = tabs;
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVarA;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar3 = qVarB;
                                    final int i24 = i19;
                                    pVar4.T(1618982084);
                                    boolean zS = pVar4.s(pVar5) | pVar4.s(pVar6) | pVar4.s(qVar3);
                                    Object objU = pVar4.U();
                                    if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                        objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @dl.d
                                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j13) {
                                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                                int iP = s1.b.p(j13);
                                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar5);
                                                int size = listY1.size();
                                                final int i25 = iP / size;
                                                Iterator<T> it = listY1.iterator();
                                                int iMax = 0;
                                                while (it.hasNext()) {
                                                    iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                                }
                                                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                                Iterator<T> it2 = listY1.iterator();
                                                while (it2.hasNext()) {
                                                    int i26 = iP;
                                                    ArrayList arrayList2 = arrayList;
                                                    arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j13, i25, i25, iMax, 0, 8, null)));
                                                    arrayList = arrayList2;
                                                    iP = i26;
                                                }
                                                final int i27 = iP;
                                                final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                                final List<TabPosition> arrayList4 = new ArrayList(size);
                                                for (int i28 = 0; i28 < size; i28++) {
                                                    arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                                }
                                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVar6;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVar3;
                                                final int i29 = i24;
                                                final int i30 = iMax;
                                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(1);
                                                    }

                                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                        List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                        int i31 = i25;
                                                        int i32 = 0;
                                                        for (Object obj : list) {
                                                            int i33 = i32 + 1;
                                                            if (i32 < 0) {
                                                                CollectionsKt__CollectionsKt.W();
                                                            }
                                                            androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                            i32 = i33;
                                                        }
                                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar7);
                                                        long j14 = j13;
                                                        int i34 = i30;
                                                        Iterator<T> it3 = listY2.iterator();
                                                        while (it3.hasNext()) {
                                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j14, 0, 0, 0, 0, 11, null));
                                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                            i34 = i34;
                                                            j14 = j14;
                                                        }
                                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                        TabSlots tabSlots = TabSlots.Indicator;
                                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVar4;
                                                        final List<TabPosition> list2 = arrayList4;
                                                        final int i35 = i29;
                                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(2);
                                                            }

                                                            @androidx.compose.runtime.h
                                                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i36) {
                                                                if ((i36 & 11) == 2 && pVar8.b()) {
                                                                    pVar8.l();
                                                                    return;
                                                                }
                                                                if (ComposerKt.g0()) {
                                                                    ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                                }
                                                                qVar5.invoke(list2, pVar8, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                                if (ComposerKt.g0()) {
                                                                    ComposerKt.v0();
                                                                }
                                                            }

                                                            @Override // yh.p
                                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                                                a(pVar8, num.intValue());
                                                                return kotlin.b2.f124493a;
                                                            }
                                                        }));
                                                        int i36 = i27;
                                                        int i37 = i30;
                                                        Iterator<T> it4 = listY3.iterator();
                                                        while (it4.hasNext()) {
                                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                        }
                                                    }

                                                    @Override // yh.l
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                        a(aVar);
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }, 4, null);
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                                return a(q1Var, bVar.getF139216a());
                                            }
                                        };
                                        pVar4.N(objU);
                                    }
                                    pVar4.c0();
                                    SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar4, 6, 0);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar4, Integer num) {
                                    a(pVar4, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            pVar3 = pVarA;
                            j12 = jC;
                            nVar3 = nVar2;
                        } else {
                            pVarF.l();
                            nVar3 = nVar;
                            qVarB = qVar2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        final androidx.compose.ui.n nVar4 = nVar3;
                        final long j13 = jB;
                        final long j14 = j12;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar3 = qVarB;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar4 = pVar3;
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i23) {
                                TabRowKt.b(i10, nVar4, j13, j14, qVar3, pVar4, tabs, pVar5, i11 | 1, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    }
                    i18 = 1572864;
                    i13 |= i18;
                    if ((i13 & 2995931) == 599186) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar5, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar5, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar5, Integer num) {
                                        a(list, pVar5, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar5, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar5, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar5, Integer num) {
                                        a(list, pVar5, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i23) {
                                if ((i23 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVarB;
                                final int i24 = i19;
                                pVar5.T(1618982084);
                                boolean zS = pVar5.s(pVar6) | pVar5.s(pVar7) | pVar5.s(qVar4);
                                Object objU = pVar5.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j15) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j15);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar6);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j15, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar7;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVar4;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar8);
                                                    long j16 = j15;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j16, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j16 = j16;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVar5;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i36) {
                                                            if ((i36 & 11) == 2 && pVar9.b()) {
                                                                pVar9.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar6.invoke(list2, pVar9, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                                                            a(pVar9, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar5.N(objU);
                                }
                                pVar5.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar5, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar5, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar5, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar5, Integer num) {
                                        a(list, pVar5, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar5, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar5, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar5, Integer num) {
                                        a(list, pVar5, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar5, int i23) {
                                if ((i23 & 11) == 2 && pVar5.b()) {
                                    pVar5.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVarB;
                                final int i24 = i19;
                                pVar5.T(1618982084);
                                boolean zS = pVar5.s(pVar6) | pVar5.s(pVar7) | pVar5.s(qVar4);
                                Object objU = pVar5.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j15) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j15);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar6);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j15, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar7;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVar4;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar8);
                                                    long j16 = j15;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j16, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j16 = j16;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVar5;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i36) {
                                                            if ((i36 & 11) == 2 && pVar9.b()) {
                                                                pVar9.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar6.invoke(list2, pVar9, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                                                            a(pVar9, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar5.N(objU);
                                }
                                pVar5.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar5, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar5, Integer num) {
                                a(pVar5, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar5 = nVar3;
                    final long j15 = jB;
                    final long j16 = j12;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar4 = qVarB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar5 = pVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar6, int i23) {
                            TabRowKt.b(i10, nVar5, j15, j16, qVar4, pVar5, tabs, pVar6, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                            a(pVar6, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i13 |= androidx.profileinstaller.o.c.f26824k;
                pVar3 = pVar;
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                    }
                    if ((i13 & 2995931) == 599186) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar6, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar6, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar6, Integer num) {
                                        a(list, pVar6, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar6, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar6, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar6, Integer num) {
                                        a(list, pVar6, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVarB;
                                final int i24 = i19;
                                pVar6.T(1618982084);
                                boolean zS = pVar6.s(pVar7) | pVar6.s(pVar8) | pVar6.s(qVar5);
                                Object objU = pVar6.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j17) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j17);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar7);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j17, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar8;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVar5;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar9);
                                                    long j18 = j17;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j18, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j18 = j18;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar6;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i36) {
                                                            if ((i36 & 11) == 2 && pVar10.b()) {
                                                                pVar10.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar7.invoke(list2, pVar10, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                                            a(pVar10, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar6.N(objU);
                                }
                                pVar6.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar6, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                a(pVar6, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar6, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar6, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar6, Integer num) {
                                        a(list, pVar6, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar6, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar6, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar6, Integer num) {
                                        a(list, pVar6, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
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
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVarB;
                                final int i24 = i19;
                                pVar6.T(1618982084);
                                boolean zS = pVar6.s(pVar7) | pVar6.s(pVar8) | pVar6.s(qVar5);
                                Object objU = pVar6.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j17) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j17);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar7);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j17, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar8;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVar5;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar9);
                                                    long j18 = j17;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j18, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j18 = j18;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar6;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i36) {
                                                            if ((i36 & 11) == 2 && pVar10.b()) {
                                                                pVar10.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar7.invoke(list2, pVar10, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                                                            a(pVar10, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar6.N(objU);
                                }
                                pVar6.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar6, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar6, Integer num) {
                                a(pVar6, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar6 = nVar3;
                    final long j17 = jB;
                    final long j18 = j12;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar5 = qVarB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar6 = pVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar7, int i23) {
                            TabRowKt.b(i10, nVar6, j17, j18, qVar5, pVar6, tabs, pVar7, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                            a(pVar7, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i13 & 2995931) == 599186) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar7, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar7, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar7, Integer num) {
                                    a(list, pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar7, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar7, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar7, Integer num) {
                                    a(list, pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar7, int i23) {
                            if ((i23 & 11) == 2 && pVar7.b()) {
                                pVar7.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVarB;
                            final int i24 = i19;
                            pVar7.T(1618982084);
                            boolean zS = pVar7.s(pVar8) | pVar7.s(pVar9) | pVar7.s(qVar6);
                            Object objU = pVar7.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j19) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j19);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar8);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j19, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar9;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar6;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar10);
                                                long j110 = j19;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j110, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j110 = j110;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar7;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i36) {
                                                        if ((i36 & 11) == 2 && pVar11.b()) {
                                                            pVar11.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar8.invoke(list2, pVar11, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                                                        a(pVar11, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar7.N(objU);
                            }
                            pVar7.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar7, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                            a(pVar7, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar7, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar7, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar7, Integer num) {
                                    a(list, pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar7, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar7, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar7, Integer num) {
                                    a(list, pVar7, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar7, int i23) {
                            if ((i23 & 11) == 2 && pVar7.b()) {
                                pVar7.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVarB;
                            final int i24 = i19;
                            pVar7.T(1618982084);
                            boolean zS = pVar7.s(pVar8) | pVar7.s(pVar9) | pVar7.s(qVar6);
                            Object objU = pVar7.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j19) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j19);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar8);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j19, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar9;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVar6;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar10);
                                                long j110 = j19;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j110, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j110 = j110;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar7;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i36) {
                                                        if ((i36 & 11) == 2 && pVar11.b()) {
                                                            pVar11.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar8.invoke(list2, pVar11, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                                                        a(pVar11, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar7.N(objU);
                            }
                            pVar7.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar7, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar7, Integer num) {
                            a(pVar7, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar7 = nVar3;
                final long j19 = jB;
                final long j110 = j12;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar6 = qVarB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar7 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar8, int i23) {
                        TabRowKt.b(i10, nVar7, j19, j110, qVar6, pVar7, tabs, pVar8, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                        a(pVar8, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= 24576;
            qVar2 = qVar;
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    pVar3 = pVar;
                    if (pVarF.s(pVar3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                    }
                    if ((i13 & 2995931) == 599186) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar8, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar8, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar8, Integer num) {
                                        a(list, pVar8, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar8, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar8, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar8, Integer num) {
                                        a(list, pVar8, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i23) {
                                if ((i23 & 11) == 2 && pVar8.b()) {
                                    pVar8.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVarB;
                                final int i24 = i19;
                                pVar8.T(1618982084);
                                boolean zS = pVar8.s(pVar9) | pVar8.s(pVar10) | pVar8.s(qVar7);
                                Object objU = pVar8.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j111) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j111);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar9);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j111, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar10;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar7;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar11);
                                                    long j112 = j111;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j112, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j112 = j112;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVar8;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar12, int i36) {
                                                            if ((i36 & 11) == 2 && pVar12.b()) {
                                                                pVar12.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar9.invoke(list2, pVar12, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                                            a(pVar12, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar8.N(objU);
                                }
                                pVar8.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar8, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                a(pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar8, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar8, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar8, Integer num) {
                                        a(list, pVar8, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar8, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar8, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar8, Integer num) {
                                        a(list, pVar8, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar8, int i23) {
                                if ((i23 & 11) == 2 && pVar8.b()) {
                                    pVar8.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVarB;
                                final int i24 = i19;
                                pVar8.T(1618982084);
                                boolean zS = pVar8.s(pVar9) | pVar8.s(pVar10) | pVar8.s(qVar7);
                                Object objU = pVar8.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j111) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j111);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar9);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j111, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar10;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVar7;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar11);
                                                    long j112 = j111;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j112, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j112 = j112;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVar8;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar12, int i36) {
                                                            if ((i36 & 11) == 2 && pVar12.b()) {
                                                                pVar12.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar9.invoke(list2, pVar12, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                                            a(pVar12, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar8.N(objU);
                                }
                                pVar8.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar8, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar8, Integer num) {
                                a(pVar8, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar8 = nVar3;
                    final long j111 = jB;
                    final long j112 = j12;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar7 = qVarB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar8 = pVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i23) {
                            TabRowKt.b(i10, nVar8, j111, j112, qVar7, pVar8, tabs, pVar9, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                            a(pVar9, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i13 & 2995931) == 599186) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar9, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar9, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar9, Integer num) {
                                    a(list, pVar9, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar9, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar9, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar9, Integer num) {
                                    a(list, pVar9, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i23) {
                            if ((i23 & 11) == 2 && pVar9.b()) {
                                pVar9.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVarB;
                            final int i24 = i19;
                            pVar9.T(1618982084);
                            boolean zS = pVar9.s(pVar10) | pVar9.s(pVar11) | pVar9.s(qVar8);
                            Object objU = pVar9.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j113) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j113);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar10);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j113, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar11;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVar8;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar12);
                                                long j114 = j113;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j114, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j114 = j114;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVar9;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar13, int i36) {
                                                        if ((i36 & 11) == 2 && pVar13.b()) {
                                                            pVar13.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar10.invoke(list2, pVar13, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                                                        a(pVar13, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar9.N(objU);
                            }
                            pVar9.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar9, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                            a(pVar9, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar9, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar9, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar9, Integer num) {
                                    a(list, pVar9, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar9, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar9, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar9, Integer num) {
                                    a(list, pVar9, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar9, int i23) {
                            if ((i23 & 11) == 2 && pVar9.b()) {
                                pVar9.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVarB;
                            final int i24 = i19;
                            pVar9.T(1618982084);
                            boolean zS = pVar9.s(pVar10) | pVar9.s(pVar11) | pVar9.s(qVar8);
                            Object objU = pVar9.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j113) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j113);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar10);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j113, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar11;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVar8;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar12);
                                                long j114 = j113;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j114, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j114 = j114;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVar9;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar13, int i36) {
                                                        if ((i36 & 11) == 2 && pVar13.b()) {
                                                            pVar13.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar10.invoke(list2, pVar13, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                                                        a(pVar13, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar9.N(objU);
                            }
                            pVar9.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar9, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar9, Integer num) {
                            a(pVar9, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar9 = nVar3;
                final long j113 = jB;
                final long j114 = j12;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar8 = qVarB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar9 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar10, int i23) {
                        TabRowKt.b(i10, nVar9, j113, j114, qVar8, pVar9, tabs, pVar10, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                        a(pVar10, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= androidx.profileinstaller.o.c.f26824k;
            pVar3 = pVar;
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                }
                if ((i13 & 2995931) == 599186) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar10, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar10, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar10, Integer num) {
                                    a(list, pVar10, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar10, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar10, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar10, Integer num) {
                                    a(list, pVar10, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i23) {
                            if ((i23 & 11) == 2 && pVar10.b()) {
                                pVar10.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVarB;
                            final int i24 = i19;
                            pVar10.T(1618982084);
                            boolean zS = pVar10.s(pVar11) | pVar10.s(pVar12) | pVar10.s(qVar9);
                            Object objU = pVar10.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j115) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j115);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar11);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j115, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar12;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVar9;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar13);
                                                long j116 = j115;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j116, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j116 = j116;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar10;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar14, int i36) {
                                                        if ((i36 & 11) == 2 && pVar14.b()) {
                                                            pVar14.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar11.invoke(list2, pVar14, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                                        a(pVar14, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar10.N(objU);
                            }
                            pVar10.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar10, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                            a(pVar10, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar10, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar10, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar10, Integer num) {
                                    a(list, pVar10, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar10, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar10, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar10, Integer num) {
                                    a(list, pVar10, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar10, int i23) {
                            if ((i23 & 11) == 2 && pVar10.b()) {
                                pVar10.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVarB;
                            final int i24 = i19;
                            pVar10.T(1618982084);
                            boolean zS = pVar10.s(pVar11) | pVar10.s(pVar12) | pVar10.s(qVar9);
                            Object objU = pVar10.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j115) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j115);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar11);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j115, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar12;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVar9;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar13);
                                                long j116 = j115;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j116, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j116 = j116;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar10;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar14, int i36) {
                                                        if ((i36 & 11) == 2 && pVar14.b()) {
                                                            pVar14.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar11.invoke(list2, pVar14, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                                                        a(pVar14, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar10.N(objU);
                            }
                            pVar10.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar10, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar10, Integer num) {
                            a(pVar10, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar10 = nVar3;
                final long j115 = jB;
                final long j116 = j12;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar9 = qVarB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar10 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i23) {
                        TabRowKt.b(i10, nVar10, j115, j116, qVar9, pVar10, tabs, pVar11, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i13 & 2995931) == 599186) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar11, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar11, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar11, Integer num) {
                                a(list, pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar11, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar11, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar11, Integer num) {
                                a(list, pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i23) {
                        if ((i23 & 11) == 2 && pVar11.b()) {
                            pVar11.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVarB;
                        final int i24 = i19;
                        pVar11.T(1618982084);
                        boolean zS = pVar11.s(pVar12) | pVar11.s(pVar13) | pVar11.s(qVar10);
                        Object objU = pVar11.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j117) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j117);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar12);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j117, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar13;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar10;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar14);
                                            long j118 = j117;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j118, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j118 = j118;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVar11;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar15, int i36) {
                                                    if ((i36 & 11) == 2 && pVar15.b()) {
                                                        pVar15.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar12.invoke(list2, pVar15, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                                                    a(pVar15, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar11.N(objU);
                        }
                        pVar11.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar11, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar11, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar11, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar11, Integer num) {
                                a(list, pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar11, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar11, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar11, Integer num) {
                                a(list, pVar11, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar11, int i23) {
                        if ((i23 & 11) == 2 && pVar11.b()) {
                            pVar11.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVarB;
                        final int i24 = i19;
                        pVar11.T(1618982084);
                        boolean zS = pVar11.s(pVar12) | pVar11.s(pVar13) | pVar11.s(qVar10);
                        Object objU = pVar11.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j117) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j117);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar12);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j117, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar13;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVar10;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar14);
                                            long j118 = j117;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j118, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j118 = j118;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVar11;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar15, int i36) {
                                                    if ((i36 & 11) == 2 && pVar15.b()) {
                                                        pVar15.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar12.invoke(list2, pVar15, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                                                    a(pVar15, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar11.N(objU);
                        }
                        pVar11.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar11, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar11, Integer num) {
                        a(pVar11, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar11 = nVar3;
            final long j117 = jB;
            final long j118 = j12;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar10 = qVarB;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar11 = pVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar12, int i23) {
                    TabRowKt.b(i10, nVar11, j117, j118, qVar10, pVar11, tabs, pVar12, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                    a(pVar12, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= 48;
        if ((i11 & bb.c.b.f30796me) == 0) {
            if ((i12 & 4) == 0) {
                jB = j10;
                if (pVarF.z(jB)) {
                }
                i13 |= i22;
            } else {
                jB = j10;
            }
            i13 |= i22;
        } else {
            jB = j10;
        }
        if ((i11 & bb.c.g.f32954lc) == 0) {
            j12 = j11;
            if ((i12 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i13 |= i20;
        } else {
            j12 = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((57344 & i11) == 0) {
                qVar2 = qVar;
                if (pVarF.s(qVar2)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    pVar3 = pVar;
                    if (pVarF.s(pVar3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
                if ((i12 & 64) != 0) {
                    if ((i11 & 3670016) == 0) {
                        if (pVarF.s(tabs)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                    }
                    if ((i13 & 2995931) == 599186) {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar12, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar12, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar12, Integer num) {
                                        a(list, pVar12, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar12, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar12, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar12, Integer num) {
                                        a(list, pVar12, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i23) {
                                if ((i23 & 11) == 2 && pVar12.b()) {
                                    pVar12.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVarB;
                                final int i24 = i19;
                                pVar12.T(1618982084);
                                boolean zS = pVar12.s(pVar13) | pVar12.s(pVar14) | pVar12.s(qVar11);
                                Object objU = pVar12.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j119) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j119);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar13);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j119, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar14;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVar11;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar15);
                                                    long j1110 = j119;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1110, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j1110 = j1110;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVar12;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i36) {
                                                            if ((i36 & 11) == 2 && pVar16.b()) {
                                                                pVar16.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar13.invoke(list2, pVar16, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                                                            a(pVar16, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar12.N(objU);
                                }
                                pVar12.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar12, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                a(pVar12, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    } else {
                        pVarF.W();
                        if ((i11 & 1) != 0) {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar12, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar12, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar12, Integer num) {
                                        a(list, pVar12, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        } else {
                            if (i21 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar2 = nVar;
                            }
                            if ((i12 & 4) != 0) {
                                jB = TabRowDefaults.f11245a.b(pVarF, 6);
                                i13 &= -897;
                            }
                            if ((i12 & 8) != 0) {
                                jC = TabRowDefaults.f11245a.c(pVarF, 6);
                                i13 &= -7169;
                            } else {
                                jC = j12;
                            }
                            if (i14 != 0) {
                                qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar12, int i23) {
                                        kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                        }
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                        tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar12, bb.c.d.f31193dj, 6);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.q
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar12, Integer num) {
                                        a(list, pVar12, num.intValue());
                                        return kotlin.b2.f124493a;
                                    }
                                });
                            } else {
                                qVarB = qVar2;
                            }
                            if (i16 != 0) {
                                i19 = i13;
                                pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                            } else {
                                i19 = i13;
                                pVarA = pVar3;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                        }
                        SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar12, int i23) {
                                if ((i23 & 11) == 2 && pVar12.b()) {
                                    pVar12.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                                }
                                androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = tabs;
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVarA;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVarB;
                                final int i24 = i19;
                                pVar12.T(1618982084);
                                boolean zS = pVar12.s(pVar13) | pVar12.s(pVar14) | pVar12.s(qVar11);
                                Object objU = pVar12.U();
                                if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @dl.d
                                        public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j119) {
                                            kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                            int iP = s1.b.p(j119);
                                            List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar13);
                                            int size = listY1.size();
                                            final int i25 = iP / size;
                                            Iterator<T> it = listY1.iterator();
                                            int iMax = 0;
                                            while (it.hasNext()) {
                                                iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                            }
                                            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                            Iterator<T> it2 = listY1.iterator();
                                            while (it2.hasNext()) {
                                                int i26 = iP;
                                                ArrayList arrayList2 = arrayList;
                                                arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j119, i25, i25, iMax, 0, 8, null)));
                                                arrayList = arrayList2;
                                                iP = i26;
                                            }
                                            final int i27 = iP;
                                            final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                            final List<TabPosition> arrayList4 = new ArrayList(size);
                                            for (int i28 = 0; i28 < size; i28++) {
                                                arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                            }
                                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar14;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVar11;
                                            final int i29 = i24;
                                            final int i30 = iMax;
                                            return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(1);
                                                }

                                                public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                    kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                    List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                    int i31 = i25;
                                                    int i32 = 0;
                                                    for (Object obj : list) {
                                                        int i33 = i32 + 1;
                                                        if (i32 < 0) {
                                                            CollectionsKt__CollectionsKt.W();
                                                        }
                                                        androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                        i32 = i33;
                                                    }
                                                    List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar15);
                                                    long j1110 = j119;
                                                    int i34 = i30;
                                                    Iterator<T> it3 = listY2.iterator();
                                                    while (it3.hasNext()) {
                                                        androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1110, 0, 0, 0, 0, 11, null));
                                                        androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                        i34 = i34;
                                                        j1110 = j1110;
                                                    }
                                                    androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVar12;
                                                    final List<TabPosition> list2 = arrayList4;
                                                    final int i35 = i29;
                                                    List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @androidx.compose.runtime.h
                                                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i36) {
                                                            if ((i36 & 11) == 2 && pVar16.b()) {
                                                                pVar16.l();
                                                                return;
                                                            }
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                            }
                                                            qVar13.invoke(list2, pVar16, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                            if (ComposerKt.g0()) {
                                                                ComposerKt.v0();
                                                            }
                                                        }

                                                        @Override // yh.p
                                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                                                            a(pVar16, num.intValue());
                                                            return kotlin.b2.f124493a;
                                                        }
                                                    }));
                                                    int i36 = i27;
                                                    int i37 = i30;
                                                    Iterator<T> it4 = listY3.iterator();
                                                    while (it4.hasNext()) {
                                                        androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                    }
                                                }

                                                @Override // yh.l
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                    a(aVar);
                                                    return kotlin.b2.f124493a;
                                                }
                                            }, 4, null);
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                            return a(q1Var, bVar.getF139216a());
                                        }
                                    };
                                    pVar12.N(objU);
                                }
                                pVar12.c0();
                                SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar12, 6, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar12, Integer num) {
                                a(pVar12, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        pVar3 = pVarA;
                        j12 = jC;
                        nVar3 = nVar2;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    final androidx.compose.ui.n nVar12 = nVar3;
                    final long j119 = jB;
                    final long j1110 = j12;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar11 = qVarB;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar12 = pVar3;
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar13, int i23) {
                            TabRowKt.b(i10, nVar12, j119, j1110, qVar11, pVar12, tabs, pVar13, i11 | 1, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                            a(pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                }
                i18 = 1572864;
                i13 |= i18;
                if ((i13 & 2995931) == 599186) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar13, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar13, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar13, Integer num) {
                                    a(list, pVar13, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar13, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar13, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar13, Integer num) {
                                    a(list, pVar13, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar13, int i23) {
                            if ((i23 & 11) == 2 && pVar13.b()) {
                                pVar13.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVarB;
                            final int i24 = i19;
                            pVar13.T(1618982084);
                            boolean zS = pVar13.s(pVar14) | pVar13.s(pVar15) | pVar13.s(qVar12);
                            Object objU = pVar13.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1111) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j1111);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar14);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1111, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar15;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVar12;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar16);
                                                long j1112 = j1111;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1112, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j1112 = j1112;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar13;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i36) {
                                                        if ((i36 & 11) == 2 && pVar17.b()) {
                                                            pVar17.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar14.invoke(list2, pVar17, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                                                        a(pVar17, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar13.N(objU);
                            }
                            pVar13.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar13, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                            a(pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar13, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar13, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar13, Integer num) {
                                    a(list, pVar13, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar13, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar13, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar13, Integer num) {
                                    a(list, pVar13, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar13, int i23) {
                            if ((i23 & 11) == 2 && pVar13.b()) {
                                pVar13.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVarB;
                            final int i24 = i19;
                            pVar13.T(1618982084);
                            boolean zS = pVar13.s(pVar14) | pVar13.s(pVar15) | pVar13.s(qVar12);
                            Object objU = pVar13.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1111) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j1111);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar14);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1111, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar15;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVar12;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar16);
                                                long j1112 = j1111;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1112, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j1112 = j1112;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar13;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i36) {
                                                        if ((i36 & 11) == 2 && pVar17.b()) {
                                                            pVar17.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar14.invoke(list2, pVar17, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                                                        a(pVar17, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar13.N(objU);
                            }
                            pVar13.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar13, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar13, Integer num) {
                            a(pVar13, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar13 = nVar3;
                final long j1111 = jB;
                final long j1112 = j12;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar12 = qVarB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar13 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar14, int i23) {
                        TabRowKt.b(i10, nVar13, j1111, j1112, qVar12, pVar13, tabs, pVar14, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                        a(pVar14, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i13 |= androidx.profileinstaller.o.c.f26824k;
            pVar3 = pVar;
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                }
                if ((i13 & 2995931) == 599186) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar14, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar14, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar14, Integer num) {
                                    a(list, pVar14, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar14, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar14, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar14, Integer num) {
                                    a(list, pVar14, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar14, int i23) {
                            if ((i23 & 11) == 2 && pVar14.b()) {
                                pVar14.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVarB;
                            final int i24 = i19;
                            pVar14.T(1618982084);
                            boolean zS = pVar14.s(pVar15) | pVar14.s(pVar16) | pVar14.s(qVar13);
                            Object objU = pVar14.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1113) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j1113);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar15);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1113, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar16;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar13;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar17);
                                                long j1114 = j1113;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1114, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j1114 = j1114;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVar14;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar18, int i36) {
                                                        if ((i36 & 11) == 2 && pVar18.b()) {
                                                            pVar18.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar15.invoke(list2, pVar18, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                                                        a(pVar18, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar14.N(objU);
                            }
                            pVar14.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar14, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                            a(pVar14, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar14, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar14, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar14, Integer num) {
                                    a(list, pVar14, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar14, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar14, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar14, Integer num) {
                                    a(list, pVar14, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar14, int i23) {
                            if ((i23 & 11) == 2 && pVar14.b()) {
                                pVar14.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVarB;
                            final int i24 = i19;
                            pVar14.T(1618982084);
                            boolean zS = pVar14.s(pVar15) | pVar14.s(pVar16) | pVar14.s(qVar13);
                            Object objU = pVar14.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1113) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j1113);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar15);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1113, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar16;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVar13;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar17);
                                                long j1114 = j1113;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1114, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j1114 = j1114;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVar14;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar18, int i36) {
                                                        if ((i36 & 11) == 2 && pVar18.b()) {
                                                            pVar18.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar15.invoke(list2, pVar18, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                                                        a(pVar18, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar14.N(objU);
                            }
                            pVar14.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar14, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar14, Integer num) {
                            a(pVar14, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar14 = nVar3;
                final long j1113 = jB;
                final long j1114 = j12;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar13 = qVarB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar14 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar15, int i23) {
                        TabRowKt.b(i10, nVar14, j1113, j1114, qVar13, pVar14, tabs, pVar15, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                        a(pVar15, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i13 & 2995931) == 599186) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar15, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar15, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar15, Integer num) {
                                a(list, pVar15, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar15, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar15, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar15, Integer num) {
                                a(list, pVar15, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar15, int i23) {
                        if ((i23 & 11) == 2 && pVar15.b()) {
                            pVar15.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVarB;
                        final int i24 = i19;
                        pVar15.T(1618982084);
                        boolean zS = pVar15.s(pVar16) | pVar15.s(pVar17) | pVar15.s(qVar14);
                        Object objU = pVar15.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1115) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j1115);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar16);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1115, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar17;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVar14;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar18);
                                            long j1116 = j1115;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1116, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j1116 = j1116;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVar15;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar19, int i36) {
                                                    if ((i36 & 11) == 2 && pVar19.b()) {
                                                        pVar19.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar16.invoke(list2, pVar19, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                                                    a(pVar19, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar15.N(objU);
                        }
                        pVar15.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar15, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                        a(pVar15, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar15, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar15, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar15, Integer num) {
                                a(list, pVar15, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar15, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar15, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar15, Integer num) {
                                a(list, pVar15, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar15, int i23) {
                        if ((i23 & 11) == 2 && pVar15.b()) {
                            pVar15.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVarB;
                        final int i24 = i19;
                        pVar15.T(1618982084);
                        boolean zS = pVar15.s(pVar16) | pVar15.s(pVar17) | pVar15.s(qVar14);
                        Object objU = pVar15.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1115) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j1115);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar16);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1115, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar17;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVar14;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar18);
                                            long j1116 = j1115;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1116, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j1116 = j1116;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVar15;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar19, int i36) {
                                                    if ((i36 & 11) == 2 && pVar19.b()) {
                                                        pVar19.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar16.invoke(list2, pVar19, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                                                    a(pVar19, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar15.N(objU);
                        }
                        pVar15.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar15, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar15, Integer num) {
                        a(pVar15, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar15 = nVar3;
            final long j1115 = jB;
            final long j1116 = j12;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar14 = qVarB;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar15 = pVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar16, int i23) {
                    TabRowKt.b(i10, nVar15, j1115, j1116, qVar14, pVar15, tabs, pVar16, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                    a(pVar16, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= 24576;
        qVar2 = qVar;
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                pVar3 = pVar;
                if (pVarF.s(pVar3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
            if ((i12 & 64) != 0) {
                if ((i11 & 3670016) == 0) {
                    if (pVarF.s(tabs)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                }
                if ((i13 & 2995931) == 599186) {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar16, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar16, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar16, Integer num) {
                                    a(list, pVar16, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar16, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar16, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar16, Integer num) {
                                    a(list, pVar16, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i23) {
                            if ((i23 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVarB;
                            final int i24 = i19;
                            pVar16.T(1618982084);
                            boolean zS = pVar16.s(pVar17) | pVar16.s(pVar18) | pVar16.s(qVar15);
                            Object objU = pVar16.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1117) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j1117);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar17);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1117, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar18;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVar15;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar19);
                                                long j1118 = j1117;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1118, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j1118 = j1118;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVar16;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar110, int i36) {
                                                        if ((i36 & 11) == 2 && pVar110.b()) {
                                                            pVar110.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar17.invoke(list2, pVar110, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                                        a(pVar110, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar16.N(objU);
                            }
                            pVar16.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar16, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                            a(pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                } else {
                    pVarF.W();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar16, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar16, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar16, Integer num) {
                                    a(list, pVar16, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    } else {
                        if (i21 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar2 = nVar;
                        }
                        if ((i12 & 4) != 0) {
                            jB = TabRowDefaults.f11245a.b(pVarF, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jC = TabRowDefaults.f11245a.c(pVarF, 6);
                            i13 &= -7169;
                        } else {
                            jC = j12;
                        }
                        if (i14 != 0) {
                            qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar16, int i23) {
                                    kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                    tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar16, bb.c.d.f31193dj, 6);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar16, Integer num) {
                                    a(list, pVar16, num.intValue());
                                    return kotlin.b2.f124493a;
                                }
                            });
                        } else {
                            qVarB = qVar2;
                        }
                        if (i16 != 0) {
                            i19 = i13;
                            pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                        } else {
                            i19 = i13;
                            pVarA = pVar3;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                    }
                    SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar16, int i23) {
                            if ((i23 & 11) == 2 && pVar16.b()) {
                                pVar16.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                            }
                            androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = tabs;
                            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVarA;
                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVarB;
                            final int i24 = i19;
                            pVar16.T(1618982084);
                            boolean zS = pVar16.s(pVar17) | pVar16.s(pVar18) | pVar16.s(qVar15);
                            Object objU = pVar16.U();
                            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @dl.d
                                    public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1117) {
                                        kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                        int iP = s1.b.p(j1117);
                                        List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar17);
                                        int size = listY1.size();
                                        final int i25 = iP / size;
                                        Iterator<T> it = listY1.iterator();
                                        int iMax = 0;
                                        while (it.hasNext()) {
                                            iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                        }
                                        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                        Iterator<T> it2 = listY1.iterator();
                                        while (it2.hasNext()) {
                                            int i26 = iP;
                                            ArrayList arrayList2 = arrayList;
                                            arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1117, i25, i25, iMax, 0, 8, null)));
                                            arrayList = arrayList2;
                                            iP = i26;
                                        }
                                        final int i27 = iP;
                                        final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                        final List<TabPosition> arrayList4 = new ArrayList(size);
                                        for (int i28 = 0; i28 < size; i28++) {
                                            arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                        }
                                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar18;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVar15;
                                        final int i29 = i24;
                                        final int i30 = iMax;
                                        return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(1);
                                            }

                                            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                                List<androidx.compose.ui.layout.e1> list = arrayList3;
                                                int i31 = i25;
                                                int i32 = 0;
                                                for (Object obj : list) {
                                                    int i33 = i32 + 1;
                                                    if (i32 < 0) {
                                                        CollectionsKt__CollectionsKt.W();
                                                    }
                                                    androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                    i32 = i33;
                                                }
                                                List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar19);
                                                long j1118 = j1117;
                                                int i34 = i30;
                                                Iterator<T> it3 = listY2.iterator();
                                                while (it3.hasNext()) {
                                                    androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j1118, 0, 0, 0, 0, 11, null));
                                                    androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                    i34 = i34;
                                                    j1118 = j1118;
                                                }
                                                androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                                TabSlots tabSlots = TabSlots.Indicator;
                                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVar16;
                                                final List<TabPosition> list2 = arrayList4;
                                                final int i35 = i29;
                                                List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @androidx.compose.runtime.h
                                                    public final void a(@dl.e androidx.compose.runtime.p pVar110, int i36) {
                                                        if ((i36 & 11) == 2 && pVar110.b()) {
                                                            pVar110.l();
                                                            return;
                                                        }
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                        }
                                                        qVar17.invoke(list2, pVar110, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                        if (ComposerKt.g0()) {
                                                            ComposerKt.v0();
                                                        }
                                                    }

                                                    @Override // yh.p
                                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                                                        a(pVar110, num.intValue());
                                                        return kotlin.b2.f124493a;
                                                    }
                                                }));
                                                int i36 = i27;
                                                int i37 = i30;
                                                Iterator<T> it4 = listY3.iterator();
                                                while (it4.hasNext()) {
                                                    androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                                }
                                            }

                                            @Override // yh.l
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                                a(aVar);
                                                return kotlin.b2.f124493a;
                                            }
                                        }, 4, null);
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                        return a(q1Var, bVar.getF139216a());
                                    }
                                };
                                pVar16.N(objU);
                            }
                            pVar16.c0();
                            SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar16, 6, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar16, Integer num) {
                            a(pVar16, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    pVar3 = pVarA;
                    j12 = jC;
                    nVar3 = nVar2;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                final androidx.compose.ui.n nVar16 = nVar3;
                final long j1117 = jB;
                final long j1118 = j12;
                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar15 = qVarB;
                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar16 = pVar3;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i23) {
                        TabRowKt.b(i10, nVar16, j1117, j1118, qVar15, pVar16, tabs, pVar17, i11 | 1, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                        a(pVar17, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                });
            }
            i18 = 1572864;
            i13 |= i18;
            if ((i13 & 2995931) == 599186) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar17, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar17, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar17, Integer num) {
                                a(list, pVar17, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar17, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar17, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar17, Integer num) {
                                a(list, pVar17, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i23) {
                        if ((i23 & 11) == 2 && pVar17.b()) {
                            pVar17.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVarB;
                        final int i24 = i19;
                        pVar17.T(1618982084);
                        boolean zS = pVar17.s(pVar18) | pVar17.s(pVar19) | pVar17.s(qVar16);
                        Object objU = pVar17.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1119) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j1119);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar18);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1119, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar19;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVar16;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar110);
                                            long j11110 = j1119;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j11110, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j11110 = j11110;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVar17;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar111, int i36) {
                                                    if ((i36 & 11) == 2 && pVar111.b()) {
                                                        pVar111.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar18.invoke(list2, pVar111, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111, Integer num) {
                                                    a(pVar111, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar17.N(objU);
                        }
                        pVar17.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar17, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                        a(pVar17, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar17, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar17, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar17, Integer num) {
                                a(list, pVar17, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar17, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar17, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar17, Integer num) {
                                a(list, pVar17, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar17, int i23) {
                        if ((i23 & 11) == 2 && pVar17.b()) {
                            pVar17.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVarB;
                        final int i24 = i19;
                        pVar17.T(1618982084);
                        boolean zS = pVar17.s(pVar18) | pVar17.s(pVar19) | pVar17.s(qVar16);
                        Object objU = pVar17.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j1119) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j1119);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar18);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j1119, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVar19;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVar16;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar110);
                                            long j11110 = j1119;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j11110, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j11110 = j11110;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVar17;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar111, int i36) {
                                                    if ((i36 & 11) == 2 && pVar111.b()) {
                                                        pVar111.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar18.invoke(list2, pVar111, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar111, Integer num) {
                                                    a(pVar111, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar17.N(objU);
                        }
                        pVar17.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar17, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar17, Integer num) {
                        a(pVar17, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar17 = nVar3;
            final long j1119 = jB;
            final long j11110 = j12;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar16 = qVarB;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar17 = pVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar18, int i23) {
                    TabRowKt.b(i10, nVar17, j1119, j11110, qVar16, pVar17, tabs, pVar18, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                    a(pVar18, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i13 |= androidx.profileinstaller.o.c.f26824k;
        pVar3 = pVar;
        if ((i12 & 64) != 0) {
            if ((i11 & 3670016) == 0) {
                if (pVarF.s(tabs)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
            }
            if ((i13 & 2995931) == 599186) {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar18, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar18, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar18, Integer num) {
                                a(list, pVar18, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar18, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar18, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar18, Integer num) {
                                a(list, pVar18, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar18, int i23) {
                        if ((i23 & 11) == 2 && pVar18.b()) {
                            pVar18.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVarB;
                        final int i24 = i19;
                        pVar18.T(1618982084);
                        boolean zS = pVar18.s(pVar19) | pVar18.s(pVar110) | pVar18.s(qVar17);
                        Object objU = pVar18.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j11111) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j11111);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar19);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j11111, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar110;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVar17;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar111);
                                            long j11112 = j11111;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j11112, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j11112 = j11112;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar19 = qVar18;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar112, int i36) {
                                                    if ((i36 & 11) == 2 && pVar112.b()) {
                                                        pVar112.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar19.invoke(list2, pVar112, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                                    a(pVar112, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar18.N(objU);
                        }
                        pVar18.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar18, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                        a(pVar18, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            } else {
                pVarF.W();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar18, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar18, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar18, Integer num) {
                                a(list, pVar18, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                } else {
                    if (i21 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar2 = nVar;
                    }
                    if ((i12 & 4) != 0) {
                        jB = TabRowDefaults.f11245a.b(pVarF, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jC = TabRowDefaults.f11245a.c(pVarF, 6);
                        i13 &= -7169;
                    } else {
                        jC = j12;
                    }
                    if (i14 != 0) {
                        qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar18, int i23) {
                                kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                                }
                                TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                                tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar18, bb.c.d.f31193dj, 6);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.q
                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar18, Integer num) {
                                a(list, pVar18, num.intValue());
                                return kotlin.b2.f124493a;
                            }
                        });
                    } else {
                        qVarB = qVar2;
                    }
                    if (i16 != 0) {
                        i19 = i13;
                        pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                    } else {
                        i19 = i13;
                        pVarA = pVar3;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
                }
                SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar18, int i23) {
                        if ((i23 & 11) == 2 && pVar18.b()) {
                            pVar18.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                        }
                        androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = tabs;
                        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = pVarA;
                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVarB;
                        final int i24 = i19;
                        pVar18.T(1618982084);
                        boolean zS = pVar18.s(pVar19) | pVar18.s(pVar110) | pVar18.s(qVar17);
                        Object objU = pVar18.U();
                        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j11111) {
                                    kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                    int iP = s1.b.p(j11111);
                                    List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar19);
                                    int size = listY1.size();
                                    final int i25 = iP / size;
                                    Iterator<T> it = listY1.iterator();
                                    int iMax = 0;
                                    while (it.hasNext()) {
                                        iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                    }
                                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                    Iterator<T> it2 = listY1.iterator();
                                    while (it2.hasNext()) {
                                        int i26 = iP;
                                        ArrayList arrayList2 = arrayList;
                                        arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j11111, i25, i25, iMax, 0, 8, null)));
                                        arrayList = arrayList2;
                                        iP = i26;
                                    }
                                    final int i27 = iP;
                                    final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                    final List<TabPosition> arrayList4 = new ArrayList(size);
                                    for (int i28 = 0; i28 < size; i28++) {
                                        arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                    }
                                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVar110;
                                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVar17;
                                    final int i29 = i24;
                                    final int i30 = iMax;
                                    return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                            List<androidx.compose.ui.layout.e1> list = arrayList3;
                                            int i31 = i25;
                                            int i32 = 0;
                                            for (Object obj : list) {
                                                int i33 = i32 + 1;
                                                if (i32 < 0) {
                                                    CollectionsKt__CollectionsKt.W();
                                                }
                                                androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                                i32 = i33;
                                            }
                                            List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar111);
                                            long j11112 = j11111;
                                            int i34 = i30;
                                            Iterator<T> it3 = listY2.iterator();
                                            while (it3.hasNext()) {
                                                androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j11112, 0, 0, 0, 0, 11, null));
                                                androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                                i34 = i34;
                                                j11112 = j11112;
                                            }
                                            androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                            TabSlots tabSlots = TabSlots.Indicator;
                                            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar19 = qVar18;
                                            final List<TabPosition> list2 = arrayList4;
                                            final int i35 = i29;
                                            List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @androidx.compose.runtime.h
                                                public final void a(@dl.e androidx.compose.runtime.p pVar112, int i36) {
                                                    if ((i36 & 11) == 2 && pVar112.b()) {
                                                        pVar112.l();
                                                        return;
                                                    }
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                    }
                                                    qVar19.invoke(list2, pVar112, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                    if (ComposerKt.g0()) {
                                                        ComposerKt.v0();
                                                    }
                                                }

                                                @Override // yh.p
                                                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar112, Integer num) {
                                                    a(pVar112, num.intValue());
                                                    return kotlin.b2.f124493a;
                                                }
                                            }));
                                            int i36 = i27;
                                            int i37 = i30;
                                            Iterator<T> it4 = listY3.iterator();
                                            while (it4.hasNext()) {
                                                androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                            }
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                            a(aVar);
                                            return kotlin.b2.f124493a;
                                        }
                                    }, 4, null);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                    return a(q1Var, bVar.getF139216a());
                                }
                            };
                            pVar18.N(objU);
                        }
                        pVar18.c0();
                        SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar18, 6, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar18, Integer num) {
                        a(pVar18, num.intValue());
                        return kotlin.b2.f124493a;
                    }
                }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar3 = pVarA;
                j12 = jC;
                nVar3 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            final androidx.compose.ui.n nVar18 = nVar3;
            final long j11111 = jB;
            final long j11112 = j12;
            final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar17 = qVarB;
            final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar18 = pVar3;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar19, int i23) {
                    TabRowKt.b(i10, nVar18, j11111, j11112, qVar17, pVar18, tabs, pVar19, i11 | 1, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                    a(pVar19, num.intValue());
                    return kotlin.b2.f124493a;
                }
            });
        }
        i18 = 1572864;
        i13 |= i18;
        if ((i13 & 2995931) == 599186) {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar19, int i23) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar19, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar19, Integer num) {
                            a(list, pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar2;
                }
                if (i16 != 0) {
                    i19 = i13;
                    pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                } else {
                    i19 = i13;
                    pVarA = pVar3;
                }
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar19, int i23) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar19, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar19, Integer num) {
                            a(list, pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar2;
                }
                if (i16 != 0) {
                    i19 = i13;
                    pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                } else {
                    i19 = i13;
                    pVarA = pVar3;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
            }
            SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar19, int i23) {
                    if ((i23 & 11) == 2 && pVar19.b()) {
                        pVar19.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                    }
                    androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = tabs;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVarA;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVarB;
                    final int i24 = i19;
                    pVar19.T(1618982084);
                    boolean zS = pVar19.s(pVar110) | pVar19.s(pVar111) | pVar19.s(qVar18);
                    Object objU = pVar19.U();
                    if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j11113) {
                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iP = s1.b.p(j11113);
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar110);
                                int size = listY1.size();
                                final int i25 = iP / size;
                                Iterator<T> it = listY1.iterator();
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                }
                                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it2 = listY1.iterator();
                                while (it2.hasNext()) {
                                    int i26 = iP;
                                    ArrayList arrayList2 = arrayList;
                                    arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j11113, i25, i25, iMax, 0, 8, null)));
                                    arrayList = arrayList2;
                                    iP = i26;
                                }
                                final int i27 = iP;
                                final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                final List<TabPosition> arrayList4 = new ArrayList(size);
                                for (int i28 = 0; i28 < size; i28++) {
                                    arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                }
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar111;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar19 = qVar18;
                                final int i29 = i24;
                                final int i30 = iMax;
                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                        List<androidx.compose.ui.layout.e1> list = arrayList3;
                                        int i31 = i25;
                                        int i32 = 0;
                                        for (Object obj : list) {
                                            int i33 = i32 + 1;
                                            if (i32 < 0) {
                                                CollectionsKt__CollectionsKt.W();
                                            }
                                            androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                            i32 = i33;
                                        }
                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar112);
                                        long j11114 = j11113;
                                        int i34 = i30;
                                        Iterator<T> it3 = listY2.iterator();
                                        while (it3.hasNext()) {
                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j11114, 0, 0, 0, 0, 11, null));
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                            i34 = i34;
                                            j11114 = j11114;
                                        }
                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar110 = qVar19;
                                        final List<TabPosition> list2 = arrayList4;
                                        final int i35 = i29;
                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar113, int i36) {
                                                if ((i36 & 11) == 2 && pVar113.b()) {
                                                    pVar113.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                }
                                                qVar110.invoke(list2, pVar113, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar113, Integer num) {
                                                a(pVar113, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }));
                                        int i36 = i27;
                                        int i37 = i30;
                                        Iterator<T> it4 = listY3.iterator();
                                        while (it4.hasNext()) {
                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                        }
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                        a(aVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }, 4, null);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        };
                        pVar19.N(objU);
                    }
                    pVar19.c0();
                    SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar19, 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                    a(pVar19, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar3 = pVarA;
            j12 = jC;
            nVar3 = nVar2;
        } else {
            pVarF.W();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar19, int i23) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar19, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar19, Integer num) {
                            a(list, pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar2;
                }
                if (i16 != 0) {
                    i19 = i13;
                    pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                } else {
                    i19 = i13;
                    pVarA = pVar3;
                }
            } else {
                if (i21 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar2 = nVar;
                }
                if ((i12 & 4) != 0) {
                    jB = TabRowDefaults.f11245a.b(pVarF, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jC = TabRowDefaults.f11245a.c(pVarF, 6);
                    i13 &= -7169;
                } else {
                    jC = j12;
                }
                if (i14 != 0) {
                    qVarB = androidx.compose.runtime.internal.b.b(pVarF, -2052073983, true, new yh.q<List<? extends TabPosition>, androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.d List<TabPosition> tabPositions, @dl.e androidx.compose.runtime.p pVar19, int i23) {
                            kotlin.jvm.internal.f0.p(tabPositions, "tabPositions");
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-2052073983, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:130)");
                            }
                            TabRowDefaults tabRowDefaults = TabRowDefaults.f11245a;
                            tabRowDefaults.a(tabRowDefaults.d(androidx.compose.ui.n.INSTANCE, tabPositions.get(i10)), 0.0f, 0L, pVar19, bb.c.d.f31193dj, 6);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.q
                        public /* bridge */ /* synthetic */ kotlin.b2 invoke(List<? extends TabPosition> list, androidx.compose.runtime.p pVar19, Integer num) {
                            a(list, pVar19, num.intValue());
                            return kotlin.b2.f124493a;
                        }
                    });
                } else {
                    qVarB = qVar2;
                }
                if (i16 != 0) {
                    i19 = i13;
                    pVarA = ComposableSingletons$TabRowKt.f9330a.a();
                } else {
                    i19 = i13;
                    pVarA = pVar3;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1199178586, i19, -1, "androidx.compose.material3.TabRow (TabRow.kt:125)");
            }
            SurfaceKt.a(SelectableGroupKt.a(nVar2), null, jB, jC, 0.0f, 0.0f, null, androidx.compose.runtime.internal.b.b(pVarF, 1273256619, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                @androidx.compose.runtime.h
                public final void a(@dl.e androidx.compose.runtime.p pVar19, int i23) {
                    if ((i23 & 11) == 2 && pVar19.b()) {
                        pVar19.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1273256619, i23, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:144)");
                    }
                    androidx.compose.ui.n nVarN = SizeKt.n(androidx.compose.ui.n.INSTANCE, 0.0f, 1, null);
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar110 = tabs;
                    final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar111 = pVarA;
                    final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVarB;
                    final int i24 = i19;
                    pVar19.T(1618982084);
                    boolean zS = pVar19.s(pVar110) | pVar19.s(pVar111) | pVar19.s(qVar18);
                    Object objU = pVar19.U();
                    if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new yh.p<androidx.compose.ui.layout.q1, s1.b, androidx.compose.ui.layout.j0>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @dl.d
                            public final androidx.compose.ui.layout.j0 a(@dl.d final androidx.compose.ui.layout.q1 SubcomposeLayout, final long j11113) {
                                kotlin.jvm.internal.f0.p(SubcomposeLayout, "$this$SubcomposeLayout");
                                int iP = s1.b.p(j11113);
                                List<androidx.compose.ui.layout.g0> listY1 = SubcomposeLayout.y1(TabSlots.Tabs, pVar110);
                                int size = listY1.size();
                                final int i25 = iP / size;
                                Iterator<T> it = listY1.iterator();
                                int iMax = 0;
                                while (it.hasNext()) {
                                    iMax = Math.max(((androidx.compose.ui.layout.g0) it.next()).V(i25), iMax);
                                }
                                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listY1, 10));
                                Iterator<T> it2 = listY1.iterator();
                                while (it2.hasNext()) {
                                    int i26 = iP;
                                    ArrayList arrayList2 = arrayList;
                                    arrayList2.add(((androidx.compose.ui.layout.g0) it2.next()).z1(s1.b.e(j11113, i25, i25, iMax, 0, 8, null)));
                                    arrayList = arrayList2;
                                    iP = i26;
                                }
                                final int i27 = iP;
                                final List<? extends androidx.compose.ui.layout.e1> arrayList3 = arrayList;
                                final List<TabPosition> arrayList4 = new ArrayList(size);
                                for (int i28 = 0; i28 < size; i28++) {
                                    arrayList4.add(new TabPosition(s1.h.g(SubcomposeLayout.E(i25) * i28), SubcomposeLayout.E(i25), null));
                                }
                                final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar112 = pVar111;
                                final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar19 = qVar18;
                                final int i29 = i24;
                                final int i30 = iMax;
                                return androidx.compose.ui.layout.k0.p(SubcomposeLayout, i27, iMax, null, new yh.l<androidx.compose.ui.layout.e1.a, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                                        kotlin.jvm.internal.f0.p(layout, "$this$layout");
                                        List<androidx.compose.ui.layout.e1> list = arrayList3;
                                        int i31 = i25;
                                        int i32 = 0;
                                        for (Object obj : list) {
                                            int i33 = i32 + 1;
                                            if (i32 < 0) {
                                                CollectionsKt__CollectionsKt.W();
                                            }
                                            androidx.compose.ui.layout.e1.a.v(layout, (androidx.compose.ui.layout.e1) obj, i32 * i31, 0, 0.0f, 4, null);
                                            i32 = i33;
                                        }
                                        List<androidx.compose.ui.layout.g0> listY2 = SubcomposeLayout.y1(TabSlots.Divider, pVar112);
                                        long j11114 = j11113;
                                        int i34 = i30;
                                        Iterator<T> it3 = listY2.iterator();
                                        while (it3.hasNext()) {
                                            androidx.compose.ui.layout.e1 e1VarZ1 = ((androidx.compose.ui.layout.g0) it3.next()).z1(s1.b.e(j11114, 0, 0, 0, 0, 11, null));
                                            androidx.compose.ui.layout.e1.a.v(layout, e1VarZ1, 0, i34 - e1VarZ1.getHeight(), 0.0f, 4, null);
                                            i34 = i34;
                                            j11114 = j11114;
                                        }
                                        androidx.compose.ui.layout.q1 q1Var = SubcomposeLayout;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar110 = qVar19;
                                        final List<TabPosition> list2 = arrayList4;
                                        final int i35 = i29;
                                        List<androidx.compose.ui.layout.g0> listY3 = q1Var.y1(tabSlots, androidx.compose.runtime.internal.b.c(-976887453, true, new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt.TabRow.2.1.1.1.3
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @androidx.compose.runtime.h
                                            public final void a(@dl.e androidx.compose.runtime.p pVar113, int i36) {
                                                if ((i36 & 11) == 2 && pVar113.b()) {
                                                    pVar113.l();
                                                    return;
                                                }
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.w0(-976887453, i36, -1, "androidx.compose.material3.TabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:178)");
                                                }
                                                qVar110.invoke(list2, pVar113, Integer.valueOf(((i35 >> 9) & 112) | 8));
                                                if (ComposerKt.g0()) {
                                                    ComposerKt.v0();
                                                }
                                            }

                                            @Override // yh.p
                                            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar113, Integer num) {
                                                a(pVar113, num.intValue());
                                                return kotlin.b2.f124493a;
                                            }
                                        }));
                                        int i36 = i27;
                                        int i37 = i30;
                                        Iterator<T> it4 = listY3.iterator();
                                        while (it4.hasNext()) {
                                            androidx.compose.ui.layout.e1.a.v(layout, ((androidx.compose.ui.layout.g0) it4.next()).z1(s1.b.f139198b.c(i36, i37)), 0, 0, 0.0f, 4, null);
                                        }
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                                        a(aVar);
                                        return kotlin.b2.f124493a;
                                    }
                                }, 4, null);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.j0 invoke(androidx.compose.ui.layout.q1 q1Var, s1.b bVar) {
                                return a(q1Var, bVar.getF139216a());
                            }
                        };
                        pVar19.N(objU);
                    }
                    pVar19.c0();
                    SubcomposeLayoutKt.a(nVarN, (yh.p) objU, pVar19, 6, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar19, Integer num) {
                    a(pVar19, num.intValue());
                    return kotlin.b2.f124493a;
                }
            }), pVarF, 12582912 | (i19 & bb.c.b.f30796me) | (i19 & bb.c.g.f32954lc), 114);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            pVar3 = pVarA;
            j12 = jC;
            nVar3 = nVar2;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final androidx.compose.ui.n nVar19 = nVar3;
        final long j11113 = jB;
        final long j11114 = j12;
        final yh.q<? super List<TabPosition>, ? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> qVar18 = qVarB;
        final yh.p<? super androidx.compose.runtime.p, ? super Integer, kotlin.b2> pVar19 = pVar3;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, kotlin.b2>() { // from class: androidx.compose.material3.TabRowKt$TabRow$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar110, int i23) {
                TabRowKt.b(i10, nVar19, j11113, j11114, qVar18, pVar19, tabs, pVar110, i11 | 1, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ kotlin.b2 invoke(androidx.compose.runtime.p pVar110, Integer num) {
                a(pVar110, num.intValue());
                return kotlin.b2.f124493a;
            }
        });
    }
}
