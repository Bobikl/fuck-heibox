package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.g0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.layout.e1;
import androidx.compose.ui.layout.j0;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.s0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0001\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a\u009e\u0001\u0010'\u001a\u0019\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020&0\u0004¢\u0006\u0002\b\t2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!2#\u0010\n\u001a\u001f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004¢\u0006\u0002\b\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010$\u001a\u00020#H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0018\u0010+\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010*\u001a\u00020)H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function2;", "Ls1/e;", "Ls1/b;", "", "", "Lkotlin/t;", "slotSizesSums", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/s;", "Lkotlin/b2;", "content", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/grid/LazyGridState;Lyh/p;Landroidx/compose/foundation/layout/m0;ZZLandroidx/compose/foundation/gestures/g;ZLandroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;Lyh/l;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/foundation/lazy/grid/j;", "itemProvider", "b", "(Landroidx/compose/foundation/lazy/grid/j;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/f0;", "overscrollEffect", "Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;", "placementAnimator", "Landroidx/compose/foundation/lazy/layout/m;", "Landroidx/compose/ui/layout/j0;", "f", "(Landroidx/compose/foundation/lazy/grid/j;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/f0;Lyh/p;Landroidx/compose/foundation/layout/m0;ZZLandroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/lazy/grid/LazyGridItemPlacementAnimator;Landroidx/compose/runtime/p;II)Lyh/p;", "Landroidx/compose/foundation/lazy/grid/o;", "result", "e", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyGridKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0138  */
    /* JADX WARN: Code duplicated, block: B:103:0x013e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0155  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:115:0x015b  */
    /* JADX WARN: Code duplicated, block: B:118:0x0167  */
    /* JADX WARN: Code duplicated, block: B:124:0x0180  */
    /* JADX WARN: Code duplicated, block: B:126:0x0188  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:142:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:153:0x0225  */
    /* JADX WARN: Code duplicated, block: B:156:0x025a  */
    /* JADX WARN: Code duplicated, block: B:158:0x0260  */
    /* JADX WARN: Code duplicated, block: B:161:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:162:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:165:0x0332  */
    /* JADX WARN: Code duplicated, block: B:170:0x0342  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00db  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0117  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0125  */
    /* JADX WARN: Code duplicated, block: B:94:0x0128  */
    /* JADX WARN: Code duplicated, block: B:97:0x012f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0133  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.d final LazyGridState state, @dl.d final yh.p<? super s1.e, ? super s1.b, ? extends List<Integer>> slotSizesSums, @dl.e m0 m0Var, boolean z10, final boolean z11, @dl.e androidx.compose.foundation.gestures.g gVar, final boolean z12, @dl.d final Arrangement.l verticalArrangement, @dl.d final Arrangement.d horizontalArrangement, @dl.d final yh.l<? super s, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11, final int i12) {
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.compose.ui.n nVar3;
        m0 m0VarA;
        androidx.compose.foundation.gestures.g gVarA;
        int i22;
        boolean z13;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        q0 coroutineScope;
        boolean zS;
        Object objU2;
        androidx.compose.runtime.p pVar2;
        Orientation orientation;
        final boolean z14;
        final androidx.compose.ui.n nVar4;
        final m0 m0Var2;
        final androidx.compose.foundation.gestures.g gVar2;
        u1 u1VarH;
        int i23;
        f0.p(state, "state");
        f0.p(slotSizesSums, "slotSizesSums");
        f0.p(verticalArrangement, "verticalArrangement");
        f0.p(horizontalArrangement, "horizontalArrangement");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(152645664);
        int i24 = i12 & 1;
        if (i24 != 0) {
            i13 = i10 | 6;
            nVar2 = nVar;
        } else if ((i10 & 14) == 0) {
            nVar2 = nVar;
            i13 = (pVarF.s(nVar2) ? 4 : 2) | i10;
        } else {
            nVar2 = nVar;
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= pVarF.s(state) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i13 |= pVarF.s(slotSizesSums) ? 256 : 128;
        }
        int i25 = i12 & 8;
        if (i25 == 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                i13 |= pVarF.s(m0Var) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.u(z10)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i12 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.u(z11)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                if ((i10 & 3670016) != 0) {
                    if ((i12 & 64) == 0 || !pVarF.s(gVar)) {
                        i23 = 524288;
                    } else {
                        i23 = 1048576;
                    }
                    i13 |= i23;
                }
                if ((i12 & 128) != 0) {
                    if ((i10 & 29360128) == 0) {
                        if (pVarF.u(z12)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i13 |= i17;
                    }
                    if ((i12 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (pVarF.s(verticalArrangement)) {
                                i18 = 67108864;
                            } else {
                                i18 = 33554432;
                            }
                        }
                        if ((i12 & 512) != 0) {
                            if ((1879048192 & i10) == 0) {
                                if (pVarF.s(horizontalArrangement)) {
                                    i19 = 536870912;
                                } else {
                                    i19 = 268435456;
                                }
                            }
                            if ((i12 & 1024) != 0) {
                                i20 = i11 | 6;
                            } else if ((i11 & 14) == 0) {
                                if (pVarF.s(content)) {
                                    i21 = 4;
                                } else {
                                    i21 = 2;
                                }
                                i20 = i11 | i21;
                            } else {
                                i20 = i11;
                            }
                            if ((i13 & 1533916891) != 306783378 && (i20 & 11) == 2 && pVarF.b()) {
                                pVarF.l();
                                z14 = z10;
                                nVar4 = nVar2;
                                pVar2 = pVarF;
                                m0Var2 = m0Var;
                                gVar2 = gVar;
                            } else {
                                pVarF.W();
                                if ((i10 & 1) != 0 || pVarF.o()) {
                                    if (i24 != 0) {
                                        nVar3 = androidx.compose.ui.n.INSTANCE;
                                    } else {
                                        nVar3 = nVar2;
                                    }
                                    if (i25 != 0) {
                                        m0VarA = PaddingKt.a(s1.h.g(0));
                                    } else {
                                        m0VarA = m0Var;
                                    }
                                    boolean z15 = i14 == 0 ? z10 : false;
                                    if ((i12 & 64) != 0) {
                                        i22 = i13 & (-3670017);
                                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                    } else {
                                        gVarA = gVar;
                                        i22 = i13;
                                    }
                                    z13 = z15;
                                } else {
                                    pVarF.l();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    m0VarA = m0Var;
                                    gVarA = gVar;
                                    nVar3 = nVar2;
                                    i22 = i13;
                                    z13 = z10;
                                }
                                pVarF.O();
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                                }
                                androidx.compose.foundation.gestures.n nVar5 = androidx.compose.foundation.gestures.n.f5788a;
                                androidx.compose.foundation.f0 f0VarB = nVar5.b(pVarF, 6);
                                int i26 = (i22 >> 3) & 14;
                                j jVarA = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i26);
                                int i27 = i22 >> 6;
                                androidx.compose.ui.n nVar6 = nVar3;
                                androidx.compose.foundation.lazy.layout.q qVarA = LazySemanticsKt.a(state, jVarA, z13, pVarF, i26 | (i27 & bb.c.b.f30796me));
                                pVarF.T(773894976);
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                companion = androidx.compose.runtime.p.INSTANCE;
                                if (objU == companion.a()) {
                                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                                pVarF.c0();
                                Boolean boolValueOf = Boolean.valueOf(z11);
                                boolean z16 = z13;
                                pVarF.T(511388516);
                                zS = pVarF.s(boolValueOf) | pVarF.s(state);
                                objU2 = pVarF.U();
                                if (zS || objU2 == companion.a()) {
                                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                    pVarF.N(objU2);
                                }
                                pVarF.c0();
                                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator = (LazyGridItemPlacementAnimator) objU2;
                                state.G(lazyGridItemPlacementAnimator);
                                int i28 = i22 & 112;
                                int i29 = i22 << 3;
                                int i30 = i22;
                                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF2 = f(jVarA, state, f0VarB, slotSizesSums, m0VarA, z16, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator, pVarF, 1073741824 | i28 | (i29 & bb.c.g.f32954lc) | (i29 & 57344) | (i29 & 458752) | (i29 & 3670016) | (i27 & 29360128) | (i22 & 234881024), 0);
                                state.L(z11);
                                pVar2 = pVarF;
                                b(jVarA, state, pVar2, i28);
                                if (z11) {
                                    orientation = Orientation.Vertical;
                                } else {
                                    orientation = Orientation.Horizontal;
                                }
                                Orientation orientation2 = orientation;
                                LazyLayoutKt.a(jVarA, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar6.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA, qVarA, orientation2, z12, pVar2, (i30 >> 9) & 57344), orientation2), f0VarB), state, orientation2, f0VarB, z12, nVar5.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation2, z16), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF2, pVar2, 0, 0);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                z14 = z16;
                                nVar4 = nVar6;
                                m0Var2 = m0VarA;
                                gVar2 = gVarA;
                            }
                            u1VarH = pVar2.H();
                            if (u1VarH == null) {
                                return;
                            }
                            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31) {
                                    LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                    a(pVar3, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        i19 = com.google.android.exoplayer2.j.G;
                        i13 |= i19;
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar7 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB2 = nVar7.b(pVarF, 6);
                            int i210 = (i22 >> 3) & 14;
                            j jVarA2 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i210);
                            int i211 = i22 >> 6;
                            androidx.compose.ui.n nVar8 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA2 = LazySemanticsKt.a(state, jVarA2, z13, pVarF, i210 | (i211 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf2 = Boolean.valueOf(z11);
                            boolean z17 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf2) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator2 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator2);
                            int i212 = i22 & 112;
                            int i213 = i22 << 3;
                            int i31 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF3 = f(jVarA2, state, f0VarB2, slotSizesSums, m0VarA, z17, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator2, pVarF, 1073741824 | i212 | (i213 & bb.c.g.f32954lc) | (i213 & 57344) | (i213 & 458752) | (i213 & 3670016) | (i211 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA2, state, pVar2, i212);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation3 = orientation;
                            LazyLayoutKt.a(jVarA2, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar8.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA2, qVarA2, orientation3, z12, pVar2, (i31 >> 9) & 57344), orientation3), f0VarB2), state, orientation3, f0VarB2, z12, nVar7.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation3, z17), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF3, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z17;
                            nVar4 = nVar8;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar9 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB3 = nVar9.b(pVarF, 6);
                            int i214 = (i22 >> 3) & 14;
                            j jVarA3 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i214);
                            int i215 = i22 >> 6;
                            androidx.compose.ui.n nVar10 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA3 = LazySemanticsKt.a(state, jVarA3, z13, pVarF, i214 | (i215 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf3 = Boolean.valueOf(z11);
                            boolean z18 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf3) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator3 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator3);
                            int i216 = i22 & 112;
                            int i217 = i22 << 3;
                            int i32 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF4 = f(jVarA3, state, f0VarB3, slotSizesSums, m0VarA, z18, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator3, pVarF, 1073741824 | i216 | (i217 & bb.c.g.f32954lc) | (i217 & 57344) | (i217 & 458752) | (i217 & 3670016) | (i215 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA3, state, pVar2, i216);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation4 = orientation;
                            LazyLayoutKt.a(jVarA3, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar10.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA3, qVarA3, orientation4, z12, pVar2, (i32 >> 9) & 57344), orientation4), f0VarB3), state, orientation4, f0VarB3, z12, nVar9.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation4, z18), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF4, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z18;
                            nVar4 = nVar10;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        }
                        u1VarH = pVar2.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i33) {
                                LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i18 = 100663296;
                    i13 |= i18;
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (pVarF.s(horizontalArrangement)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar11 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB4 = nVar11.b(pVarF, 6);
                            int i218 = (i22 >> 3) & 14;
                            j jVarA4 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i218);
                            int i219 = i22 >> 6;
                            androidx.compose.ui.n nVar12 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA4 = LazySemanticsKt.a(state, jVarA4, z13, pVarF, i218 | (i219 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf4 = Boolean.valueOf(z11);
                            boolean z19 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf4) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator4 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator4);
                            int i2110 = i22 & 112;
                            int i2111 = i22 << 3;
                            int i33 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF5 = f(jVarA4, state, f0VarB4, slotSizesSums, m0VarA, z19, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator4, pVarF, 1073741824 | i2110 | (i2111 & bb.c.g.f32954lc) | (i2111 & 57344) | (i2111 & 458752) | (i2111 & 3670016) | (i219 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA4, state, pVar2, i2110);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation5 = orientation;
                            LazyLayoutKt.a(jVarA4, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar12.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA4, qVarA4, orientation5, z12, pVar2, (i33 >> 9) & 57344), orientation5), f0VarB4), state, orientation5, f0VarB4, z12, nVar11.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation5, z19), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF5, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z19;
                            nVar4 = nVar12;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar13 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB5 = nVar13.b(pVarF, 6);
                            int i2112 = (i22 >> 3) & 14;
                            j jVarA5 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2112);
                            int i2113 = i22 >> 6;
                            androidx.compose.ui.n nVar14 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA5 = LazySemanticsKt.a(state, jVarA5, z13, pVarF, i2112 | (i2113 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf5 = Boolean.valueOf(z11);
                            boolean z110 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf5) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator5 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator5);
                            int i2114 = i22 & 112;
                            int i2115 = i22 << 3;
                            int i34 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF6 = f(jVarA5, state, f0VarB5, slotSizesSums, m0VarA, z110, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator5, pVarF, 1073741824 | i2114 | (i2115 & bb.c.g.f32954lc) | (i2115 & 57344) | (i2115 & 458752) | (i2115 & 3670016) | (i2113 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA5, state, pVar2, i2114);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation6 = orientation;
                            LazyLayoutKt.a(jVarA5, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar14.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA5, qVarA5, orientation6, z12, pVar2, (i34 >> 9) & 57344), orientation6), f0VarB5), state, orientation6, f0VarB5, z12, nVar13.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation6, z110), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF6, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z110;
                            nVar4 = nVar14;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        }
                        u1VarH = pVar2.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i35) {
                                LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = com.google.android.exoplayer2.j.G;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar15 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB6 = nVar15.b(pVarF, 6);
                        int i2116 = (i22 >> 3) & 14;
                        j jVarA6 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2116);
                        int i2117 = i22 >> 6;
                        androidx.compose.ui.n nVar16 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA6 = LazySemanticsKt.a(state, jVarA6, z13, pVarF, i2116 | (i2117 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf6 = Boolean.valueOf(z11);
                        boolean z111 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf6) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator6 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator6);
                        int i2118 = i22 & 112;
                        int i2119 = i22 << 3;
                        int i35 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF7 = f(jVarA6, state, f0VarB6, slotSizesSums, m0VarA, z111, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator6, pVarF, 1073741824 | i2118 | (i2119 & bb.c.g.f32954lc) | (i2119 & 57344) | (i2119 & 458752) | (i2119 & 3670016) | (i2117 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA6, state, pVar2, i2118);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation7 = orientation;
                        LazyLayoutKt.a(jVarA6, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar16.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA6, qVarA6, orientation7, z12, pVar2, (i35 >> 9) & 57344), orientation7), f0VarB6), state, orientation7, f0VarB6, z12, nVar15.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation7, z111), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF7, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z111;
                        nVar4 = nVar16;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar17 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB7 = nVar17.b(pVarF, 6);
                        int i21110 = (i22 >> 3) & 14;
                        j jVarA7 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21110);
                        int i21111 = i22 >> 6;
                        androidx.compose.ui.n nVar18 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA7 = LazySemanticsKt.a(state, jVarA7, z13, pVarF, i21110 | (i21111 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf7 = Boolean.valueOf(z11);
                        boolean z112 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf7) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator7 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator7);
                        int i21112 = i22 & 112;
                        int i21113 = i22 << 3;
                        int i36 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF8 = f(jVarA7, state, f0VarB7, slotSizesSums, m0VarA, z112, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator7, pVarF, 1073741824 | i21112 | (i21113 & bb.c.g.f32954lc) | (i21113 & 57344) | (i21113 & 458752) | (i21113 & 3670016) | (i21111 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA7, state, pVar2, i21112);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation8 = orientation;
                        LazyLayoutKt.a(jVarA7, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar18.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA7, qVarA7, orientation8, z12, pVar2, (i36 >> 9) & 57344), orientation8), f0VarB7), state, orientation8, f0VarB7, z12, nVar17.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation8, z112), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF8, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z112;
                        nVar4 = nVar18;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i37) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i13 |= 12582912;
                if ((i12 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(verticalArrangement)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (pVarF.s(horizontalArrangement)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar19 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB8 = nVar19.b(pVarF, 6);
                            int i21114 = (i22 >> 3) & 14;
                            j jVarA8 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21114);
                            int i21115 = i22 >> 6;
                            androidx.compose.ui.n nVar110 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA8 = LazySemanticsKt.a(state, jVarA8, z13, pVarF, i21114 | (i21115 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf8 = Boolean.valueOf(z11);
                            boolean z113 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf8) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator8 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator8);
                            int i21116 = i22 & 112;
                            int i21117 = i22 << 3;
                            int i37 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF9 = f(jVarA8, state, f0VarB8, slotSizesSums, m0VarA, z113, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator8, pVarF, 1073741824 | i21116 | (i21117 & bb.c.g.f32954lc) | (i21117 & 57344) | (i21117 & 458752) | (i21117 & 3670016) | (i21115 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA8, state, pVar2, i21116);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation9 = orientation;
                            LazyLayoutKt.a(jVarA8, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA8, qVarA8, orientation9, z12, pVar2, (i37 >> 9) & 57344), orientation9), f0VarB8), state, orientation9, f0VarB8, z12, nVar19.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation9, z113), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF9, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z113;
                            nVar4 = nVar110;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar111 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB9 = nVar111.b(pVarF, 6);
                            int i21118 = (i22 >> 3) & 14;
                            j jVarA9 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21118);
                            int i21119 = i22 >> 6;
                            androidx.compose.ui.n nVar112 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA9 = LazySemanticsKt.a(state, jVarA9, z13, pVarF, i21118 | (i21119 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf9 = Boolean.valueOf(z11);
                            boolean z114 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf9) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator9 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator9);
                            int i211110 = i22 & 112;
                            int i211111 = i22 << 3;
                            int i38 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF10 = f(jVarA9, state, f0VarB9, slotSizesSums, m0VarA, z114, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator9, pVarF, 1073741824 | i211110 | (i211111 & bb.c.g.f32954lc) | (i211111 & 57344) | (i211111 & 458752) | (i211111 & 3670016) | (i21119 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA9, state, pVar2, i211110);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation10 = orientation;
                            LazyLayoutKt.a(jVarA9, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA9, qVarA9, orientation10, z12, pVar2, (i38 >> 9) & 57344), orientation10), f0VarB9), state, orientation10, f0VarB9, z12, nVar111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation10, z114), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF10, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z114;
                            nVar4 = nVar112;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        }
                        u1VarH = pVar2.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i39) {
                                LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = com.google.android.exoplayer2.j.G;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar113 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB10 = nVar113.b(pVarF, 6);
                        int i211112 = (i22 >> 3) & 14;
                        j jVarA10 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211112);
                        int i211113 = i22 >> 6;
                        androidx.compose.ui.n nVar114 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA10 = LazySemanticsKt.a(state, jVarA10, z13, pVarF, i211112 | (i211113 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf10 = Boolean.valueOf(z11);
                        boolean z115 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf10) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator10 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator10);
                        int i211114 = i22 & 112;
                        int i211115 = i22 << 3;
                        int i39 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11 = f(jVarA10, state, f0VarB10, slotSizesSums, m0VarA, z115, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator10, pVarF, 1073741824 | i211114 | (i211115 & bb.c.g.f32954lc) | (i211115 & 57344) | (i211115 & 458752) | (i211115 & 3670016) | (i211113 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA10, state, pVar2, i211114);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11 = orientation;
                        LazyLayoutKt.a(jVarA10, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA10, qVarA10, orientation11, z12, pVar2, (i39 >> 9) & 57344), orientation11), f0VarB10), state, orientation11, f0VarB10, z12, nVar113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11, z115), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z115;
                        nVar4 = nVar114;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar115 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB11 = nVar115.b(pVarF, 6);
                        int i211116 = (i22 >> 3) & 14;
                        j jVarA11 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211116);
                        int i211117 = i22 >> 6;
                        androidx.compose.ui.n nVar116 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA11 = LazySemanticsKt.a(state, jVarA11, z13, pVarF, i211116 | (i211117 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf11 = Boolean.valueOf(z11);
                        boolean z116 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf11) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator11);
                        int i211118 = i22 & 112;
                        int i211119 = i22 << 3;
                        int i310 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF12 = f(jVarA11, state, f0VarB11, slotSizesSums, m0VarA, z116, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11, pVarF, 1073741824 | i211118 | (i211119 & bb.c.g.f32954lc) | (i211119 & 57344) | (i211119 & 458752) | (i211119 & 3670016) | (i211117 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA11, state, pVar2, i211118);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation12 = orientation;
                        LazyLayoutKt.a(jVarA11, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11, qVarA11, orientation12, z12, pVar2, (i310 >> 9) & 57344), orientation12), f0VarB11), state, orientation12, f0VarB11, z12, nVar115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation12, z116), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF12, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z116;
                        nVar4 = nVar116;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i311) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i18 = 100663296;
                i13 |= i18;
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(horizontalArrangement)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar117 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB12 = nVar117.b(pVarF, 6);
                        int i2111110 = (i22 >> 3) & 14;
                        j jVarA12 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111110);
                        int i2111111 = i22 >> 6;
                        androidx.compose.ui.n nVar118 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA12 = LazySemanticsKt.a(state, jVarA12, z13, pVarF, i2111110 | (i2111111 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf12 = Boolean.valueOf(z11);
                        boolean z117 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf12) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator12 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator12);
                        int i2111112 = i22 & 112;
                        int i2111113 = i22 << 3;
                        int i311 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF13 = f(jVarA12, state, f0VarB12, slotSizesSums, m0VarA, z117, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator12, pVarF, 1073741824 | i2111112 | (i2111113 & bb.c.g.f32954lc) | (i2111113 & 57344) | (i2111113 & 458752) | (i2111113 & 3670016) | (i2111111 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA12, state, pVar2, i2111112);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation13 = orientation;
                        LazyLayoutKt.a(jVarA12, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA12, qVarA12, orientation13, z12, pVar2, (i311 >> 9) & 57344), orientation13), f0VarB12), state, orientation13, f0VarB12, z12, nVar117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation13, z117), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF13, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z117;
                        nVar4 = nVar118;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar119 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB13 = nVar119.b(pVarF, 6);
                        int i2111114 = (i22 >> 3) & 14;
                        j jVarA13 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111114);
                        int i2111115 = i22 >> 6;
                        androidx.compose.ui.n nVar1110 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA13 = LazySemanticsKt.a(state, jVarA13, z13, pVarF, i2111114 | (i2111115 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf13 = Boolean.valueOf(z11);
                        boolean z118 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf13) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator13 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator13);
                        int i2111116 = i22 & 112;
                        int i2111117 = i22 << 3;
                        int i312 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF14 = f(jVarA13, state, f0VarB13, slotSizesSums, m0VarA, z118, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator13, pVarF, 1073741824 | i2111116 | (i2111117 & bb.c.g.f32954lc) | (i2111117 & 57344) | (i2111117 & 458752) | (i2111117 & 3670016) | (i2111115 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA13, state, pVar2, i2111116);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation14 = orientation;
                        LazyLayoutKt.a(jVarA13, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA13, qVarA13, orientation14, z12, pVar2, (i312 >> 9) & 57344), orientation14), f0VarB13), state, orientation14, f0VarB13, z12, nVar119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation14, z118), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF14, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z118;
                        nVar4 = nVar1110;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i313) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = com.google.android.exoplayer2.j.G;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar1111 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB14 = nVar1111.b(pVarF, 6);
                    int i2111118 = (i22 >> 3) & 14;
                    j jVarA14 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111118);
                    int i2111119 = i22 >> 6;
                    androidx.compose.ui.n nVar1112 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA14 = LazySemanticsKt.a(state, jVarA14, z13, pVarF, i2111118 | (i2111119 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf14 = Boolean.valueOf(z11);
                    boolean z119 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf14) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator14 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator14);
                    int i21111110 = i22 & 112;
                    int i21111111 = i22 << 3;
                    int i313 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF15 = f(jVarA14, state, f0VarB14, slotSizesSums, m0VarA, z119, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator14, pVarF, 1073741824 | i21111110 | (i21111111 & bb.c.g.f32954lc) | (i21111111 & 57344) | (i21111111 & 458752) | (i21111111 & 3670016) | (i2111119 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA14, state, pVar2, i21111110);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation15 = orientation;
                    LazyLayoutKt.a(jVarA14, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA14, qVarA14, orientation15, z12, pVar2, (i313 >> 9) & 57344), orientation15), f0VarB14), state, orientation15, f0VarB14, z12, nVar1111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation15, z119), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF15, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z119;
                    nVar4 = nVar1112;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar1113 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB15 = nVar1113.b(pVarF, 6);
                    int i21111112 = (i22 >> 3) & 14;
                    j jVarA15 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111112);
                    int i21111113 = i22 >> 6;
                    androidx.compose.ui.n nVar1114 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA15 = LazySemanticsKt.a(state, jVarA15, z13, pVarF, i21111112 | (i21111113 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf15 = Boolean.valueOf(z11);
                    boolean z1110 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf15) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator15 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator15);
                    int i21111114 = i22 & 112;
                    int i21111115 = i22 << 3;
                    int i314 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF16 = f(jVarA15, state, f0VarB15, slotSizesSums, m0VarA, z1110, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator15, pVarF, 1073741824 | i21111114 | (i21111115 & bb.c.g.f32954lc) | (i21111115 & 57344) | (i21111115 & 458752) | (i21111115 & 3670016) | (i21111113 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA15, state, pVar2, i21111114);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation16 = orientation;
                    LazyLayoutKt.a(jVarA15, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA15, qVarA15, orientation16, z12, pVar2, (i314 >> 9) & 57344), orientation16), f0VarB15), state, orientation16, f0VarB15, z12, nVar1113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation16, z1110), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF16, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1110;
                    nVar4 = nVar1114;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i315) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i16 = androidx.profileinstaller.o.c.f26824k;
            i13 |= i16;
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z12)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i12 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(verticalArrangement)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (pVarF.s(horizontalArrangement)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar1115 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB16 = nVar1115.b(pVarF, 6);
                            int i21111116 = (i22 >> 3) & 14;
                            j jVarA16 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111116);
                            int i21111117 = i22 >> 6;
                            androidx.compose.ui.n nVar1116 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA16 = LazySemanticsKt.a(state, jVarA16, z13, pVarF, i21111116 | (i21111117 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf16 = Boolean.valueOf(z11);
                            boolean z1111 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf16) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator16 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator16);
                            int i21111118 = i22 & 112;
                            int i21111119 = i22 << 3;
                            int i315 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF17 = f(jVarA16, state, f0VarB16, slotSizesSums, m0VarA, z1111, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator16, pVarF, 1073741824 | i21111118 | (i21111119 & bb.c.g.f32954lc) | (i21111119 & 57344) | (i21111119 & 458752) | (i21111119 & 3670016) | (i21111117 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA16, state, pVar2, i21111118);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation17 = orientation;
                            LazyLayoutKt.a(jVarA16, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA16, qVarA16, orientation17, z12, pVar2, (i315 >> 9) & 57344), orientation17), f0VarB16), state, orientation17, f0VarB16, z12, nVar1115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation17, z1111), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF17, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z1111;
                            nVar4 = nVar1116;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar1117 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB17 = nVar1117.b(pVarF, 6);
                            int i211111110 = (i22 >> 3) & 14;
                            j jVarA17 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111110);
                            int i211111111 = i22 >> 6;
                            androidx.compose.ui.n nVar1118 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA17 = LazySemanticsKt.a(state, jVarA17, z13, pVarF, i211111110 | (i211111111 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf17 = Boolean.valueOf(z11);
                            boolean z1112 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf17) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator17 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator17);
                            int i211111112 = i22 & 112;
                            int i211111113 = i22 << 3;
                            int i316 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF18 = f(jVarA17, state, f0VarB17, slotSizesSums, m0VarA, z1112, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator17, pVarF, 1073741824 | i211111112 | (i211111113 & bb.c.g.f32954lc) | (i211111113 & 57344) | (i211111113 & 458752) | (i211111113 & 3670016) | (i211111111 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA17, state, pVar2, i211111112);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation18 = orientation;
                            LazyLayoutKt.a(jVarA17, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA17, qVarA17, orientation18, z12, pVar2, (i316 >> 9) & 57344), orientation18), f0VarB17), state, orientation18, f0VarB17, z12, nVar1117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation18, z1112), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF18, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z1112;
                            nVar4 = nVar1118;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        }
                        u1VarH = pVar2.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i317) {
                                LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = com.google.android.exoplayer2.j.G;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar1119 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB18 = nVar1119.b(pVarF, 6);
                        int i211111114 = (i22 >> 3) & 14;
                        j jVarA18 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111114);
                        int i211111115 = i22 >> 6;
                        androidx.compose.ui.n nVar11110 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA18 = LazySemanticsKt.a(state, jVarA18, z13, pVarF, i211111114 | (i211111115 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf18 = Boolean.valueOf(z11);
                        boolean z1113 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf18) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator18 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator18);
                        int i211111116 = i22 & 112;
                        int i211111117 = i22 << 3;
                        int i317 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF19 = f(jVarA18, state, f0VarB18, slotSizesSums, m0VarA, z1113, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator18, pVarF, 1073741824 | i211111116 | (i211111117 & bb.c.g.f32954lc) | (i211111117 & 57344) | (i211111117 & 458752) | (i211111117 & 3670016) | (i211111115 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA18, state, pVar2, i211111116);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation19 = orientation;
                        LazyLayoutKt.a(jVarA18, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA18, qVarA18, orientation19, z12, pVar2, (i317 >> 9) & 57344), orientation19), f0VarB18), state, orientation19, f0VarB18, z12, nVar1119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation19, z1113), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF19, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1113;
                        nVar4 = nVar11110;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11111 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB19 = nVar11111.b(pVarF, 6);
                        int i211111118 = (i22 >> 3) & 14;
                        j jVarA19 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111118);
                        int i211111119 = i22 >> 6;
                        androidx.compose.ui.n nVar11112 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA19 = LazySemanticsKt.a(state, jVarA19, z13, pVarF, i211111118 | (i211111119 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf19 = Boolean.valueOf(z11);
                        boolean z1114 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf19) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator19 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator19);
                        int i2111111110 = i22 & 112;
                        int i2111111111 = i22 << 3;
                        int i318 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF110 = f(jVarA19, state, f0VarB19, slotSizesSums, m0VarA, z1114, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator19, pVarF, 1073741824 | i2111111110 | (i2111111111 & bb.c.g.f32954lc) | (i2111111111 & 57344) | (i2111111111 & 458752) | (i2111111111 & 3670016) | (i211111119 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA19, state, pVar2, i2111111110);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation110 = orientation;
                        LazyLayoutKt.a(jVarA19, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA19, qVarA19, orientation110, z12, pVar2, (i318 >> 9) & 57344), orientation110), f0VarB19), state, orientation110, f0VarB19, z12, nVar11111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation110, z1114), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF110, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1114;
                        nVar4 = nVar11112;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i319) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i18 = 100663296;
                i13 |= i18;
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(horizontalArrangement)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11113 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB110 = nVar11113.b(pVarF, 6);
                        int i2111111112 = (i22 >> 3) & 14;
                        j jVarA110 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111112);
                        int i2111111113 = i22 >> 6;
                        androidx.compose.ui.n nVar11114 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA110 = LazySemanticsKt.a(state, jVarA110, z13, pVarF, i2111111112 | (i2111111113 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf110 = Boolean.valueOf(z11);
                        boolean z1115 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf110) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator110 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator110);
                        int i2111111114 = i22 & 112;
                        int i2111111115 = i22 << 3;
                        int i319 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111 = f(jVarA110, state, f0VarB110, slotSizesSums, m0VarA, z1115, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator110, pVarF, 1073741824 | i2111111114 | (i2111111115 & bb.c.g.f32954lc) | (i2111111115 & 57344) | (i2111111115 & 458752) | (i2111111115 & 3670016) | (i2111111113 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA110, state, pVar2, i2111111114);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111 = orientation;
                        LazyLayoutKt.a(jVarA110, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA110, qVarA110, orientation111, z12, pVar2, (i319 >> 9) & 57344), orientation111), f0VarB110), state, orientation111, f0VarB110, z12, nVar11113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111, z1115), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1115;
                        nVar4 = nVar11114;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11115 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB111 = nVar11115.b(pVarF, 6);
                        int i2111111116 = (i22 >> 3) & 14;
                        j jVarA111 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111116);
                        int i2111111117 = i22 >> 6;
                        androidx.compose.ui.n nVar11116 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA111 = LazySemanticsKt.a(state, jVarA111, z13, pVarF, i2111111116 | (i2111111117 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf111 = Boolean.valueOf(z11);
                        boolean z1116 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf111) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator111);
                        int i2111111118 = i22 & 112;
                        int i2111111119 = i22 << 3;
                        int i3110 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF112 = f(jVarA111, state, f0VarB111, slotSizesSums, m0VarA, z1116, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111, pVarF, 1073741824 | i2111111118 | (i2111111119 & bb.c.g.f32954lc) | (i2111111119 & 57344) | (i2111111119 & 458752) | (i2111111119 & 3670016) | (i2111111117 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA111, state, pVar2, i2111111118);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation112 = orientation;
                        LazyLayoutKt.a(jVarA111, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111, qVarA111, orientation112, z12, pVar2, (i3110 >> 9) & 57344), orientation112), f0VarB111), state, orientation112, f0VarB111, z12, nVar11115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation112, z1116), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF112, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1116;
                        nVar4 = nVar11116;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3111) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = com.google.android.exoplayer2.j.G;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11117 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB112 = nVar11117.b(pVarF, 6);
                    int i21111111110 = (i22 >> 3) & 14;
                    j jVarA112 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111110);
                    int i21111111111 = i22 >> 6;
                    androidx.compose.ui.n nVar11118 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA112 = LazySemanticsKt.a(state, jVarA112, z13, pVarF, i21111111110 | (i21111111111 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf112 = Boolean.valueOf(z11);
                    boolean z1117 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf112) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator112 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator112);
                    int i21111111112 = i22 & 112;
                    int i21111111113 = i22 << 3;
                    int i3111 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF113 = f(jVarA112, state, f0VarB112, slotSizesSums, m0VarA, z1117, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator112, pVarF, 1073741824 | i21111111112 | (i21111111113 & bb.c.g.f32954lc) | (i21111111113 & 57344) | (i21111111113 & 458752) | (i21111111113 & 3670016) | (i21111111111 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA112, state, pVar2, i21111111112);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation113 = orientation;
                    LazyLayoutKt.a(jVarA112, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA112, qVarA112, orientation113, z12, pVar2, (i3111 >> 9) & 57344), orientation113), f0VarB112), state, orientation113, f0VarB112, z12, nVar11117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation113, z1117), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF113, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1117;
                    nVar4 = nVar11118;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11119 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB113 = nVar11119.b(pVarF, 6);
                    int i21111111114 = (i22 >> 3) & 14;
                    j jVarA113 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111114);
                    int i21111111115 = i22 >> 6;
                    androidx.compose.ui.n nVar111110 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA113 = LazySemanticsKt.a(state, jVarA113, z13, pVarF, i21111111114 | (i21111111115 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf113 = Boolean.valueOf(z11);
                    boolean z1118 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf113) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator113 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator113);
                    int i21111111116 = i22 & 112;
                    int i21111111117 = i22 << 3;
                    int i3112 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF114 = f(jVarA113, state, f0VarB113, slotSizesSums, m0VarA, z1118, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator113, pVarF, 1073741824 | i21111111116 | (i21111111117 & bb.c.g.f32954lc) | (i21111111117 & 57344) | (i21111111117 & 458752) | (i21111111117 & 3670016) | (i21111111115 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA113, state, pVar2, i21111111116);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation114 = orientation;
                    LazyLayoutKt.a(jVarA113, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA113, qVarA113, orientation114, z12, pVar2, (i3112 >> 9) & 57344), orientation114), f0VarB113), state, orientation114, f0VarB113, z12, nVar11119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation114, z1118), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF114, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1118;
                    nVar4 = nVar111110;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3113) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(verticalArrangement)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(horizontalArrangement)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar111111 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB114 = nVar111111.b(pVarF, 6);
                        int i21111111118 = (i22 >> 3) & 14;
                        j jVarA114 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111118);
                        int i21111111119 = i22 >> 6;
                        androidx.compose.ui.n nVar111112 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA114 = LazySemanticsKt.a(state, jVarA114, z13, pVarF, i21111111118 | (i21111111119 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf114 = Boolean.valueOf(z11);
                        boolean z1119 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf114) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator114 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator114);
                        int i211111111110 = i22 & 112;
                        int i211111111111 = i22 << 3;
                        int i3113 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF115 = f(jVarA114, state, f0VarB114, slotSizesSums, m0VarA, z1119, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator114, pVarF, 1073741824 | i211111111110 | (i211111111111 & bb.c.g.f32954lc) | (i211111111111 & 57344) | (i211111111111 & 458752) | (i211111111111 & 3670016) | (i21111111119 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA114, state, pVar2, i211111111110);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation115 = orientation;
                        LazyLayoutKt.a(jVarA114, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA114, qVarA114, orientation115, z12, pVar2, (i3113 >> 9) & 57344), orientation115), f0VarB114), state, orientation115, f0VarB114, z12, nVar111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation115, z1119), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF115, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1119;
                        nVar4 = nVar111112;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar111113 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB115 = nVar111113.b(pVarF, 6);
                        int i211111111112 = (i22 >> 3) & 14;
                        j jVarA115 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111112);
                        int i211111111113 = i22 >> 6;
                        androidx.compose.ui.n nVar111114 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA115 = LazySemanticsKt.a(state, jVarA115, z13, pVarF, i211111111112 | (i211111111113 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf115 = Boolean.valueOf(z11);
                        boolean z11110 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf115) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator115 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator115);
                        int i211111111114 = i22 & 112;
                        int i211111111115 = i22 << 3;
                        int i3114 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF116 = f(jVarA115, state, f0VarB115, slotSizesSums, m0VarA, z11110, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator115, pVarF, 1073741824 | i211111111114 | (i211111111115 & bb.c.g.f32954lc) | (i211111111115 & 57344) | (i211111111115 & 458752) | (i211111111115 & 3670016) | (i211111111113 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA115, state, pVar2, i211111111114);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation116 = orientation;
                        LazyLayoutKt.a(jVarA115, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA115, qVarA115, orientation116, z12, pVar2, (i3114 >> 9) & 57344), orientation116), f0VarB115), state, orientation116, f0VarB115, z12, nVar111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation116, z11110), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF116, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z11110;
                        nVar4 = nVar111114;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3115) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = com.google.android.exoplayer2.j.G;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111115 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB116 = nVar111115.b(pVarF, 6);
                    int i211111111116 = (i22 >> 3) & 14;
                    j jVarA116 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111116);
                    int i211111111117 = i22 >> 6;
                    androidx.compose.ui.n nVar111116 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA116 = LazySemanticsKt.a(state, jVarA116, z13, pVarF, i211111111116 | (i211111111117 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf116 = Boolean.valueOf(z11);
                    boolean z11111 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf116) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator116 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator116);
                    int i211111111118 = i22 & 112;
                    int i211111111119 = i22 << 3;
                    int i3115 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF117 = f(jVarA116, state, f0VarB116, slotSizesSums, m0VarA, z11111, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator116, pVarF, 1073741824 | i211111111118 | (i211111111119 & bb.c.g.f32954lc) | (i211111111119 & 57344) | (i211111111119 & 458752) | (i211111111119 & 3670016) | (i211111111117 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA116, state, pVar2, i211111111118);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation117 = orientation;
                    LazyLayoutKt.a(jVarA116, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA116, qVarA116, orientation117, z12, pVar2, (i3115 >> 9) & 57344), orientation117), f0VarB116), state, orientation117, f0VarB116, z12, nVar111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation117, z11111), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF117, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z11111;
                    nVar4 = nVar111116;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111117 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB117 = nVar111117.b(pVarF, 6);
                    int i2111111111110 = (i22 >> 3) & 14;
                    j jVarA117 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111110);
                    int i2111111111111 = i22 >> 6;
                    androidx.compose.ui.n nVar111118 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA117 = LazySemanticsKt.a(state, jVarA117, z13, pVarF, i2111111111110 | (i2111111111111 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf117 = Boolean.valueOf(z11);
                    boolean z11112 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf117) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator117 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator117);
                    int i2111111111112 = i22 & 112;
                    int i2111111111113 = i22 << 3;
                    int i3116 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF118 = f(jVarA117, state, f0VarB117, slotSizesSums, m0VarA, z11112, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator117, pVarF, 1073741824 | i2111111111112 | (i2111111111113 & bb.c.g.f32954lc) | (i2111111111113 & 57344) | (i2111111111113 & 458752) | (i2111111111113 & 3670016) | (i2111111111111 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA117, state, pVar2, i2111111111112);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation118 = orientation;
                    LazyLayoutKt.a(jVarA117, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA117, qVarA117, orientation118, z12, pVar2, (i3116 >> 9) & 57344), orientation118), f0VarB117), state, orientation118, f0VarB117, z12, nVar111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation118, z11112), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF118, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z11112;
                    nVar4 = nVar111118;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3117) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i18 = 100663296;
            i13 |= i18;
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(horizontalArrangement)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111119 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB118 = nVar111119.b(pVarF, 6);
                    int i2111111111114 = (i22 >> 3) & 14;
                    j jVarA118 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111114);
                    int i2111111111115 = i22 >> 6;
                    androidx.compose.ui.n nVar1111110 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA118 = LazySemanticsKt.a(state, jVarA118, z13, pVarF, i2111111111114 | (i2111111111115 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf118 = Boolean.valueOf(z11);
                    boolean z11113 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf118) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator118 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator118);
                    int i2111111111116 = i22 & 112;
                    int i2111111111117 = i22 << 3;
                    int i3117 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF119 = f(jVarA118, state, f0VarB118, slotSizesSums, m0VarA, z11113, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator118, pVarF, 1073741824 | i2111111111116 | (i2111111111117 & bb.c.g.f32954lc) | (i2111111111117 & 57344) | (i2111111111117 & 458752) | (i2111111111117 & 3670016) | (i2111111111115 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA118, state, pVar2, i2111111111116);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation119 = orientation;
                    LazyLayoutKt.a(jVarA118, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA118, qVarA118, orientation119, z12, pVar2, (i3117 >> 9) & 57344), orientation119), f0VarB118), state, orientation119, f0VarB118, z12, nVar111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation119, z11113), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF119, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z11113;
                    nVar4 = nVar1111110;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar1111111 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB119 = nVar1111111.b(pVarF, 6);
                    int i2111111111118 = (i22 >> 3) & 14;
                    j jVarA119 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111118);
                    int i2111111111119 = i22 >> 6;
                    androidx.compose.ui.n nVar1111112 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA119 = LazySemanticsKt.a(state, jVarA119, z13, pVarF, i2111111111118 | (i2111111111119 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf119 = Boolean.valueOf(z11);
                    boolean z11114 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf119) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator119 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator119);
                    int i21111111111110 = i22 & 112;
                    int i21111111111111 = i22 << 3;
                    int i3118 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1110 = f(jVarA119, state, f0VarB119, slotSizesSums, m0VarA, z11114, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator119, pVarF, 1073741824 | i21111111111110 | (i21111111111111 & bb.c.g.f32954lc) | (i21111111111111 & 57344) | (i21111111111111 & 458752) | (i21111111111111 & 3670016) | (i2111111111119 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA119, state, pVar2, i21111111111110);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1110 = orientation;
                    LazyLayoutKt.a(jVarA119, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA119, qVarA119, orientation1110, z12, pVar2, (i3118 >> 9) & 57344), orientation1110), f0VarB119), state, orientation1110, f0VarB119, z12, nVar1111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1110, z11114), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1110, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z11114;
                    nVar4 = nVar1111112;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3119) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = com.google.android.exoplayer2.j.G;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111113 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB1110 = nVar1111113.b(pVarF, 6);
                int i21111111111112 = (i22 >> 3) & 14;
                j jVarA1110 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111112);
                int i21111111111113 = i22 >> 6;
                androidx.compose.ui.n nVar1111114 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA1110 = LazySemanticsKt.a(state, jVarA1110, z13, pVarF, i21111111111112 | (i21111111111113 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf1110 = Boolean.valueOf(z11);
                boolean z11115 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf1110) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1110 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator1110);
                int i21111111111114 = i22 & 112;
                int i21111111111115 = i22 << 3;
                int i3119 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1111 = f(jVarA1110, state, f0VarB1110, slotSizesSums, m0VarA, z11115, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1110, pVarF, 1073741824 | i21111111111114 | (i21111111111115 & bb.c.g.f32954lc) | (i21111111111115 & 57344) | (i21111111111115 & 458752) | (i21111111111115 & 3670016) | (i21111111111113 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA1110, state, pVar2, i21111111111114);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111 = orientation;
                LazyLayoutKt.a(jVarA1110, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1110, qVarA1110, orientation1111, z12, pVar2, (i3119 >> 9) & 57344), orientation1111), f0VarB1110), state, orientation1111, f0VarB1110, z12, nVar1111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1111, z11115), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1111, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11115;
                nVar4 = nVar1111114;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111115 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB1111 = nVar1111115.b(pVarF, 6);
                int i21111111111116 = (i22 >> 3) & 14;
                j jVarA1111 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111116);
                int i21111111111117 = i22 >> 6;
                androidx.compose.ui.n nVar1111116 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA1111 = LazySemanticsKt.a(state, jVarA1111, z13, pVarF, i21111111111116 | (i21111111111117 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf1111 = Boolean.valueOf(z11);
                boolean z11116 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf1111) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1111 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator1111);
                int i21111111111118 = i22 & 112;
                int i21111111111119 = i22 << 3;
                int i31110 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1112 = f(jVarA1111, state, f0VarB1111, slotSizesSums, m0VarA, z11116, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1111, pVarF, 1073741824 | i21111111111118 | (i21111111111119 & bb.c.g.f32954lc) | (i21111111111119 & 57344) | (i21111111111119 & 458752) | (i21111111111119 & 3670016) | (i21111111111117 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA1111, state, pVar2, i21111111111118);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1112 = orientation;
                LazyLayoutKt.a(jVarA1111, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1111, qVarA1111, orientation1112, z12, pVar2, (i31110 >> 9) & 57344), orientation1112), f0VarB1111), state, orientation1112, f0VarB1111, z12, nVar1111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1112, z11116), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1112, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11116;
                nVar4 = nVar1111116;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31111) {
                    LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i13 |= bb.c.d.f31193dj;
        i14 = i12 & 16;
        if (i14 != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (pVarF.u(z10)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i13 |= i15;
        }
        if ((i12 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (pVarF.u(z11)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i23 = 524288;
                } else {
                    i23 = 524288;
                }
                i13 |= i23;
            }
            if ((i12 & 128) != 0) {
                if ((i10 & 29360128) == 0) {
                    if (pVarF.u(z12)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                if ((i12 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (pVarF.s(verticalArrangement)) {
                            i18 = 67108864;
                        } else {
                            i18 = 33554432;
                        }
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i10) == 0) {
                            if (pVarF.s(horizontalArrangement)) {
                                i19 = 536870912;
                            } else {
                                i19 = 268435456;
                            }
                        }
                        if ((i12 & 1024) != 0) {
                            i20 = i11 | 6;
                        } else if ((i11 & 14) == 0) {
                            if (pVarF.s(content)) {
                                i21 = 4;
                            } else {
                                i21 = 2;
                            }
                            i20 = i11 | i21;
                        } else {
                            i20 = i11;
                        }
                        if ((i13 & 1533916891) != 306783378) {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar1111117 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB1112 = nVar1111117.b(pVarF, 6);
                            int i211111111111110 = (i22 >> 3) & 14;
                            j jVarA1112 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111110);
                            int i211111111111111 = i22 >> 6;
                            androidx.compose.ui.n nVar1111118 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA1112 = LazySemanticsKt.a(state, jVarA1112, z13, pVarF, i211111111111110 | (i211111111111111 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf1112 = Boolean.valueOf(z11);
                            boolean z11117 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf1112) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1112 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator1112);
                            int i211111111111112 = i22 & 112;
                            int i211111111111113 = i22 << 3;
                            int i31111 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1113 = f(jVarA1112, state, f0VarB1112, slotSizesSums, m0VarA, z11117, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1112, pVarF, 1073741824 | i211111111111112 | (i211111111111113 & bb.c.g.f32954lc) | (i211111111111113 & 57344) | (i211111111111113 & 458752) | (i211111111111113 & 3670016) | (i211111111111111 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA1112, state, pVar2, i211111111111112);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1113 = orientation;
                            LazyLayoutKt.a(jVarA1112, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1112, qVarA1112, orientation1113, z12, pVar2, (i31111 >> 9) & 57344), orientation1113), f0VarB1112), state, orientation1113, f0VarB1112, z12, nVar1111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1113, z11117), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1113, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z11117;
                            nVar4 = nVar1111118;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        } else {
                            pVarF.W();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            } else {
                                if (i24 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i25 != 0) {
                                    m0VarA = PaddingKt.a(s1.h.g(0));
                                } else {
                                    m0VarA = m0Var;
                                }
                                if (i14 == 0) {
                                }
                                if ((i12 & 64) != 0) {
                                    i22 = i13 & (-3670017);
                                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                                } else {
                                    gVarA = gVar;
                                    i22 = i13;
                                }
                                z13 = z15;
                            }
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                            }
                            androidx.compose.foundation.gestures.n nVar1111119 = androidx.compose.foundation.gestures.n.f5788a;
                            androidx.compose.foundation.f0 f0VarB1113 = nVar1111119.b(pVarF, 6);
                            int i211111111111114 = (i22 >> 3) & 14;
                            j jVarA1113 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111114);
                            int i211111111111115 = i22 >> 6;
                            androidx.compose.ui.n nVar11111110 = nVar3;
                            androidx.compose.foundation.lazy.layout.q qVarA1113 = LazySemanticsKt.a(state, jVarA1113, z13, pVarF, i211111111111114 | (i211111111111115 & bb.c.b.f30796me));
                            pVarF.T(773894976);
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            companion = androidx.compose.runtime.p.INSTANCE;
                            if (objU == companion.a()) {
                                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                            pVarF.c0();
                            Boolean boolValueOf1113 = Boolean.valueOf(z11);
                            boolean z11118 = z13;
                            pVarF.T(511388516);
                            zS = pVarF.s(boolValueOf1113) | pVarF.s(state);
                            objU2 = pVarF.U();
                            if (zS) {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            } else {
                                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                                pVarF.N(objU2);
                            }
                            pVarF.c0();
                            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1113 = (LazyGridItemPlacementAnimator) objU2;
                            state.G(lazyGridItemPlacementAnimator1113);
                            int i211111111111116 = i22 & 112;
                            int i211111111111117 = i22 << 3;
                            int i31112 = i22;
                            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1114 = f(jVarA1113, state, f0VarB1113, slotSizesSums, m0VarA, z11118, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1113, pVarF, 1073741824 | i211111111111116 | (i211111111111117 & bb.c.g.f32954lc) | (i211111111111117 & 57344) | (i211111111111117 & 458752) | (i211111111111117 & 3670016) | (i211111111111115 & 29360128) | (i22 & 234881024), 0);
                            state.L(z11);
                            pVar2 = pVarF;
                            b(jVarA1113, state, pVar2, i211111111111116);
                            if (z11) {
                                orientation = Orientation.Vertical;
                            } else {
                                orientation = Orientation.Horizontal;
                            }
                            Orientation orientation1114 = orientation;
                            LazyLayoutKt.a(jVarA1113, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1113, qVarA1113, orientation1114, z12, pVar2, (i31112 >> 9) & 57344), orientation1114), f0VarB1113), state, orientation1114, f0VarB1113, z12, nVar1111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1114, z11118), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1114, pVar2, 0, 0);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            z14 = z11118;
                            nVar4 = nVar11111110;
                            m0Var2 = m0VarA;
                            gVar2 = gVarA;
                        }
                        u1VarH = pVar2.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31113) {
                                LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                                a(pVar3, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = com.google.android.exoplayer2.j.G;
                    i13 |= i19;
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11111111 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB1114 = nVar11111111.b(pVarF, 6);
                        int i211111111111118 = (i22 >> 3) & 14;
                        j jVarA1114 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111118);
                        int i211111111111119 = i22 >> 6;
                        androidx.compose.ui.n nVar11111112 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA1114 = LazySemanticsKt.a(state, jVarA1114, z13, pVarF, i211111111111118 | (i211111111111119 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf1114 = Boolean.valueOf(z11);
                        boolean z11119 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf1114) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1114 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator1114);
                        int i2111111111111110 = i22 & 112;
                        int i2111111111111111 = i22 << 3;
                        int i31113 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1115 = f(jVarA1114, state, f0VarB1114, slotSizesSums, m0VarA, z11119, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1114, pVarF, 1073741824 | i2111111111111110 | (i2111111111111111 & bb.c.g.f32954lc) | (i2111111111111111 & 57344) | (i2111111111111111 & 458752) | (i2111111111111111 & 3670016) | (i211111111111119 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA1114, state, pVar2, i2111111111111110);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1115 = orientation;
                        LazyLayoutKt.a(jVarA1114, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1114, qVarA1114, orientation1115, z12, pVar2, (i31113 >> 9) & 57344), orientation1115), f0VarB1114), state, orientation1115, f0VarB1114, z12, nVar11111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1115, z11119), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1115, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z11119;
                        nVar4 = nVar11111112;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11111113 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB1115 = nVar11111113.b(pVarF, 6);
                        int i2111111111111112 = (i22 >> 3) & 14;
                        j jVarA1115 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111112);
                        int i2111111111111113 = i22 >> 6;
                        androidx.compose.ui.n nVar11111114 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA1115 = LazySemanticsKt.a(state, jVarA1115, z13, pVarF, i2111111111111112 | (i2111111111111113 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf1115 = Boolean.valueOf(z11);
                        boolean z111110 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf1115) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1115 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator1115);
                        int i2111111111111114 = i22 & 112;
                        int i2111111111111115 = i22 << 3;
                        int i31114 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1116 = f(jVarA1115, state, f0VarB1115, slotSizesSums, m0VarA, z111110, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1115, pVarF, 1073741824 | i2111111111111114 | (i2111111111111115 & bb.c.g.f32954lc) | (i2111111111111115 & 57344) | (i2111111111111115 & 458752) | (i2111111111111115 & 3670016) | (i2111111111111113 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA1115, state, pVar2, i2111111111111114);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1116 = orientation;
                        LazyLayoutKt.a(jVarA1115, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1115, qVarA1115, orientation1116, z12, pVar2, (i31114 >> 9) & 57344), orientation1116), f0VarB1115), state, orientation1116, f0VarB1115, z12, nVar11111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1116, z111110), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1116, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z111110;
                        nVar4 = nVar11111114;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31115) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i18 = 100663296;
                i13 |= i18;
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(horizontalArrangement)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11111115 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB1116 = nVar11111115.b(pVarF, 6);
                        int i2111111111111116 = (i22 >> 3) & 14;
                        j jVarA1116 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111116);
                        int i2111111111111117 = i22 >> 6;
                        androidx.compose.ui.n nVar11111116 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA1116 = LazySemanticsKt.a(state, jVarA1116, z13, pVarF, i2111111111111116 | (i2111111111111117 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf1116 = Boolean.valueOf(z11);
                        boolean z111111 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf1116) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1116 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator1116);
                        int i2111111111111118 = i22 & 112;
                        int i2111111111111119 = i22 << 3;
                        int i31115 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1117 = f(jVarA1116, state, f0VarB1116, slotSizesSums, m0VarA, z111111, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1116, pVarF, 1073741824 | i2111111111111118 | (i2111111111111119 & bb.c.g.f32954lc) | (i2111111111111119 & 57344) | (i2111111111111119 & 458752) | (i2111111111111119 & 3670016) | (i2111111111111117 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA1116, state, pVar2, i2111111111111118);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1117 = orientation;
                        LazyLayoutKt.a(jVarA1116, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1116, qVarA1116, orientation1117, z12, pVar2, (i31115 >> 9) & 57344), orientation1117), f0VarB1116), state, orientation1117, f0VarB1116, z12, nVar11111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1117, z111111), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1117, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z111111;
                        nVar4 = nVar11111116;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11111117 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB1117 = nVar11111117.b(pVarF, 6);
                        int i21111111111111110 = (i22 >> 3) & 14;
                        j jVarA1117 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111110);
                        int i21111111111111111 = i22 >> 6;
                        androidx.compose.ui.n nVar11111118 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA1117 = LazySemanticsKt.a(state, jVarA1117, z13, pVarF, i21111111111111110 | (i21111111111111111 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf1117 = Boolean.valueOf(z11);
                        boolean z111112 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf1117) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1117 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator1117);
                        int i21111111111111112 = i22 & 112;
                        int i21111111111111113 = i22 << 3;
                        int i31116 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1118 = f(jVarA1117, state, f0VarB1117, slotSizesSums, m0VarA, z111112, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1117, pVarF, 1073741824 | i21111111111111112 | (i21111111111111113 & bb.c.g.f32954lc) | (i21111111111111113 & 57344) | (i21111111111111113 & 458752) | (i21111111111111113 & 3670016) | (i21111111111111111 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA1117, state, pVar2, i21111111111111112);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation1118 = orientation;
                        LazyLayoutKt.a(jVarA1117, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1117, qVarA1117, orientation1118, z12, pVar2, (i31116 >> 9) & 57344), orientation1118), f0VarB1117), state, orientation1118, f0VarB1117, z12, nVar11111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1118, z111112), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1118, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z111112;
                        nVar4 = nVar11111118;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31117) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = com.google.android.exoplayer2.j.G;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11111119 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB1118 = nVar11111119.b(pVarF, 6);
                    int i21111111111111114 = (i22 >> 3) & 14;
                    j jVarA1118 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111114);
                    int i21111111111111115 = i22 >> 6;
                    androidx.compose.ui.n nVar111111110 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA1118 = LazySemanticsKt.a(state, jVarA1118, z13, pVarF, i21111111111111114 | (i21111111111111115 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf1118 = Boolean.valueOf(z11);
                    boolean z111113 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf1118) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1118 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator1118);
                    int i21111111111111116 = i22 & 112;
                    int i21111111111111117 = i22 << 3;
                    int i31117 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1119 = f(jVarA1118, state, f0VarB1118, slotSizesSums, m0VarA, z111113, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1118, pVarF, 1073741824 | i21111111111111116 | (i21111111111111117 & bb.c.g.f32954lc) | (i21111111111111117 & 57344) | (i21111111111111117 & 458752) | (i21111111111111117 & 3670016) | (i21111111111111115 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA1118, state, pVar2, i21111111111111116);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation1119 = orientation;
                    LazyLayoutKt.a(jVarA1118, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1118, qVarA1118, orientation1119, z12, pVar2, (i31117 >> 9) & 57344), orientation1119), f0VarB1118), state, orientation1119, f0VarB1118, z12, nVar11111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1119, z111113), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1119, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z111113;
                    nVar4 = nVar111111110;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111111111 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB1119 = nVar111111111.b(pVarF, 6);
                    int i21111111111111118 = (i22 >> 3) & 14;
                    j jVarA1119 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111118);
                    int i21111111111111119 = i22 >> 6;
                    androidx.compose.ui.n nVar111111112 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA1119 = LazySemanticsKt.a(state, jVarA1119, z13, pVarF, i21111111111111118 | (i21111111111111119 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf1119 = Boolean.valueOf(z11);
                    boolean z111114 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf1119) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1119 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator1119);
                    int i211111111111111110 = i22 & 112;
                    int i211111111111111111 = i22 << 3;
                    int i31118 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11110 = f(jVarA1119, state, f0VarB1119, slotSizesSums, m0VarA, z111114, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1119, pVarF, 1073741824 | i211111111111111110 | (i211111111111111111 & bb.c.g.f32954lc) | (i211111111111111111 & 57344) | (i211111111111111111 & 458752) | (i211111111111111111 & 3670016) | (i21111111111111119 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA1119, state, pVar2, i211111111111111110);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11110 = orientation;
                    LazyLayoutKt.a(jVarA1119, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1119, qVarA1119, orientation11110, z12, pVar2, (i31118 >> 9) & 57344), orientation11110), f0VarB1119), state, orientation11110, f0VarB1119, z12, nVar111111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11110, z111114), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11110, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z111114;
                    nVar4 = nVar111111112;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31119) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i13 |= 12582912;
            if ((i12 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(verticalArrangement)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(horizontalArrangement)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar111111113 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB11110 = nVar111111113.b(pVarF, 6);
                        int i211111111111111112 = (i22 >> 3) & 14;
                        j jVarA11110 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111112);
                        int i211111111111111113 = i22 >> 6;
                        androidx.compose.ui.n nVar111111114 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA11110 = LazySemanticsKt.a(state, jVarA11110, z13, pVarF, i211111111111111112 | (i211111111111111113 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf11110 = Boolean.valueOf(z11);
                        boolean z111115 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf11110) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11110 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator11110);
                        int i211111111111111114 = i22 & 112;
                        int i211111111111111115 = i22 << 3;
                        int i31119 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11111 = f(jVarA11110, state, f0VarB11110, slotSizesSums, m0VarA, z111115, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11110, pVarF, 1073741824 | i211111111111111114 | (i211111111111111115 & bb.c.g.f32954lc) | (i211111111111111115 & 57344) | (i211111111111111115 & 458752) | (i211111111111111115 & 3670016) | (i211111111111111113 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA11110, state, pVar2, i211111111111111114);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11111 = orientation;
                        LazyLayoutKt.a(jVarA11110, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11110, qVarA11110, orientation11111, z12, pVar2, (i31119 >> 9) & 57344), orientation11111), f0VarB11110), state, orientation11111, f0VarB11110, z12, nVar111111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11111, z111115), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11111, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z111115;
                        nVar4 = nVar111111114;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar111111115 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB11111 = nVar111111115.b(pVarF, 6);
                        int i211111111111111116 = (i22 >> 3) & 14;
                        j jVarA11111 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111116);
                        int i211111111111111117 = i22 >> 6;
                        androidx.compose.ui.n nVar111111116 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA11111 = LazySemanticsKt.a(state, jVarA11111, z13, pVarF, i211111111111111116 | (i211111111111111117 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf11111 = Boolean.valueOf(z11);
                        boolean z111116 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf11111) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11111 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator11111);
                        int i211111111111111118 = i22 & 112;
                        int i211111111111111119 = i22 << 3;
                        int i311110 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11112 = f(jVarA11111, state, f0VarB11111, slotSizesSums, m0VarA, z111116, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11111, pVarF, 1073741824 | i211111111111111118 | (i211111111111111119 & bb.c.g.f32954lc) | (i211111111111111119 & 57344) | (i211111111111111119 & 458752) | (i211111111111111119 & 3670016) | (i211111111111111117 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA11111, state, pVar2, i211111111111111118);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11112 = orientation;
                        LazyLayoutKt.a(jVarA11111, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11111, qVarA11111, orientation11112, z12, pVar2, (i311110 >> 9) & 57344), orientation11112), f0VarB11111), state, orientation11112, f0VarB11111, z12, nVar111111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11112, z111116), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11112, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z111116;
                        nVar4 = nVar111111116;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i311111) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = com.google.android.exoplayer2.j.G;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111111117 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB11112 = nVar111111117.b(pVarF, 6);
                    int i2111111111111111110 = (i22 >> 3) & 14;
                    j jVarA11112 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111110);
                    int i2111111111111111111 = i22 >> 6;
                    androidx.compose.ui.n nVar111111118 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA11112 = LazySemanticsKt.a(state, jVarA11112, z13, pVarF, i2111111111111111110 | (i2111111111111111111 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf11112 = Boolean.valueOf(z11);
                    boolean z111117 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf11112) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11112 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator11112);
                    int i2111111111111111112 = i22 & 112;
                    int i2111111111111111113 = i22 << 3;
                    int i311111 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11113 = f(jVarA11112, state, f0VarB11112, slotSizesSums, m0VarA, z111117, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11112, pVarF, 1073741824 | i2111111111111111112 | (i2111111111111111113 & bb.c.g.f32954lc) | (i2111111111111111113 & 57344) | (i2111111111111111113 & 458752) | (i2111111111111111113 & 3670016) | (i2111111111111111111 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA11112, state, pVar2, i2111111111111111112);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11113 = orientation;
                    LazyLayoutKt.a(jVarA11112, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11112, qVarA11112, orientation11113, z12, pVar2, (i311111 >> 9) & 57344), orientation11113), f0VarB11112), state, orientation11113, f0VarB11112, z12, nVar111111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11113, z111117), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11113, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z111117;
                    nVar4 = nVar111111118;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111111119 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB11113 = nVar111111119.b(pVarF, 6);
                    int i2111111111111111114 = (i22 >> 3) & 14;
                    j jVarA11113 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111114);
                    int i2111111111111111115 = i22 >> 6;
                    androidx.compose.ui.n nVar1111111110 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA11113 = LazySemanticsKt.a(state, jVarA11113, z13, pVarF, i2111111111111111114 | (i2111111111111111115 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf11113 = Boolean.valueOf(z11);
                    boolean z111118 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf11113) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11113 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator11113);
                    int i2111111111111111116 = i22 & 112;
                    int i2111111111111111117 = i22 << 3;
                    int i311112 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11114 = f(jVarA11113, state, f0VarB11113, slotSizesSums, m0VarA, z111118, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11113, pVarF, 1073741824 | i2111111111111111116 | (i2111111111111111117 & bb.c.g.f32954lc) | (i2111111111111111117 & 57344) | (i2111111111111111117 & 458752) | (i2111111111111111117 & 3670016) | (i2111111111111111115 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA11113, state, pVar2, i2111111111111111116);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11114 = orientation;
                    LazyLayoutKt.a(jVarA11113, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11113, qVarA11113, orientation11114, z12, pVar2, (i311112 >> 9) & 57344), orientation11114), f0VarB11113), state, orientation11114, f0VarB11113, z12, nVar111111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11114, z111118), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11114, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z111118;
                    nVar4 = nVar1111111110;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i311113) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i18 = 100663296;
            i13 |= i18;
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(horizontalArrangement)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar1111111111 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB11114 = nVar1111111111.b(pVarF, 6);
                    int i2111111111111111118 = (i22 >> 3) & 14;
                    j jVarA11114 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111118);
                    int i2111111111111111119 = i22 >> 6;
                    androidx.compose.ui.n nVar1111111112 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA11114 = LazySemanticsKt.a(state, jVarA11114, z13, pVarF, i2111111111111111118 | (i2111111111111111119 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf11114 = Boolean.valueOf(z11);
                    boolean z111119 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf11114) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11114 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator11114);
                    int i21111111111111111110 = i22 & 112;
                    int i21111111111111111111 = i22 << 3;
                    int i311113 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11115 = f(jVarA11114, state, f0VarB11114, slotSizesSums, m0VarA, z111119, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11114, pVarF, 1073741824 | i21111111111111111110 | (i21111111111111111111 & bb.c.g.f32954lc) | (i21111111111111111111 & 57344) | (i21111111111111111111 & 458752) | (i21111111111111111111 & 3670016) | (i2111111111111111119 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA11114, state, pVar2, i21111111111111111110);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11115 = orientation;
                    LazyLayoutKt.a(jVarA11114, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11114, qVarA11114, orientation11115, z12, pVar2, (i311113 >> 9) & 57344), orientation11115), f0VarB11114), state, orientation11115, f0VarB11114, z12, nVar1111111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11115, z111119), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11115, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z111119;
                    nVar4 = nVar1111111112;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar1111111113 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB11115 = nVar1111111113.b(pVarF, 6);
                    int i21111111111111111112 = (i22 >> 3) & 14;
                    j jVarA11115 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111112);
                    int i21111111111111111113 = i22 >> 6;
                    androidx.compose.ui.n nVar1111111114 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA11115 = LazySemanticsKt.a(state, jVarA11115, z13, pVarF, i21111111111111111112 | (i21111111111111111113 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf11115 = Boolean.valueOf(z11);
                    boolean z1111110 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf11115) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11115 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator11115);
                    int i21111111111111111114 = i22 & 112;
                    int i21111111111111111115 = i22 << 3;
                    int i311114 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11116 = f(jVarA11115, state, f0VarB11115, slotSizesSums, m0VarA, z1111110, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11115, pVarF, 1073741824 | i21111111111111111114 | (i21111111111111111115 & bb.c.g.f32954lc) | (i21111111111111111115 & 57344) | (i21111111111111111115 & 458752) | (i21111111111111111115 & 3670016) | (i21111111111111111113 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA11115, state, pVar2, i21111111111111111114);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation11116 = orientation;
                    LazyLayoutKt.a(jVarA11115, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11115, qVarA11115, orientation11116, z12, pVar2, (i311114 >> 9) & 57344), orientation11116), f0VarB11115), state, orientation11116, f0VarB11115, z12, nVar1111111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11116, z1111110), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11116, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1111110;
                    nVar4 = nVar1111111114;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i311115) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = com.google.android.exoplayer2.j.G;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111111115 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB11116 = nVar1111111115.b(pVarF, 6);
                int i21111111111111111116 = (i22 >> 3) & 14;
                j jVarA11116 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111116);
                int i21111111111111111117 = i22 >> 6;
                androidx.compose.ui.n nVar1111111116 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA11116 = LazySemanticsKt.a(state, jVarA11116, z13, pVarF, i21111111111111111116 | (i21111111111111111117 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf11116 = Boolean.valueOf(z11);
                boolean z1111111 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf11116) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11116 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator11116);
                int i21111111111111111118 = i22 & 112;
                int i21111111111111111119 = i22 << 3;
                int i311115 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11117 = f(jVarA11116, state, f0VarB11116, slotSizesSums, m0VarA, z1111111, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11116, pVarF, 1073741824 | i21111111111111111118 | (i21111111111111111119 & bb.c.g.f32954lc) | (i21111111111111111119 & 57344) | (i21111111111111111119 & 458752) | (i21111111111111111119 & 3670016) | (i21111111111111111117 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA11116, state, pVar2, i21111111111111111118);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11117 = orientation;
                LazyLayoutKt.a(jVarA11116, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11116, qVarA11116, orientation11117, z12, pVar2, (i311115 >> 9) & 57344), orientation11117), f0VarB11116), state, orientation11117, f0VarB11116, z12, nVar1111111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11117, z1111111), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11117, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z1111111;
                nVar4 = nVar1111111116;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111111117 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB11117 = nVar1111111117.b(pVarF, 6);
                int i211111111111111111110 = (i22 >> 3) & 14;
                j jVarA11117 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111110);
                int i211111111111111111111 = i22 >> 6;
                androidx.compose.ui.n nVar1111111118 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA11117 = LazySemanticsKt.a(state, jVarA11117, z13, pVarF, i211111111111111111110 | (i211111111111111111111 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf11117 = Boolean.valueOf(z11);
                boolean z1111112 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf11117) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11117 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator11117);
                int i211111111111111111112 = i22 & 112;
                int i211111111111111111113 = i22 << 3;
                int i311116 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11118 = f(jVarA11117, state, f0VarB11117, slotSizesSums, m0VarA, z1111112, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11117, pVarF, 1073741824 | i211111111111111111112 | (i211111111111111111113 & bb.c.g.f32954lc) | (i211111111111111111113 & 57344) | (i211111111111111111113 & 458752) | (i211111111111111111113 & 3670016) | (i211111111111111111111 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA11117, state, pVar2, i211111111111111111112);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation11118 = orientation;
                LazyLayoutKt.a(jVarA11117, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11117, qVarA11117, orientation11118, z12, pVar2, (i311116 >> 9) & 57344), orientation11118), f0VarB11117), state, orientation11118, f0VarB11117, z12, nVar1111111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11118, z1111112), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11118, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z1111112;
                nVar4 = nVar1111111118;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i311117) {
                    LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i16 = androidx.profileinstaller.o.c.f26824k;
        i13 |= i16;
        if ((i10 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i23 = 524288;
            } else {
                i23 = 524288;
            }
            i13 |= i23;
        }
        if ((i12 & 128) != 0) {
            if ((i10 & 29360128) == 0) {
                if (pVarF.u(z12)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            if ((i12 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (pVarF.s(verticalArrangement)) {
                        i18 = 67108864;
                    } else {
                        i18 = 33554432;
                    }
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i10) == 0) {
                        if (pVarF.s(horizontalArrangement)) {
                            i19 = 536870912;
                        } else {
                            i19 = 268435456;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i20 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (pVarF.s(content)) {
                            i21 = 4;
                        } else {
                            i21 = 2;
                        }
                        i20 = i11 | i21;
                    } else {
                        i20 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378) {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar1111111119 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB11118 = nVar1111111119.b(pVarF, 6);
                        int i211111111111111111114 = (i22 >> 3) & 14;
                        j jVarA11118 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111114);
                        int i211111111111111111115 = i22 >> 6;
                        androidx.compose.ui.n nVar11111111110 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA11118 = LazySemanticsKt.a(state, jVarA11118, z13, pVarF, i211111111111111111114 | (i211111111111111111115 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf11118 = Boolean.valueOf(z11);
                        boolean z1111113 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf11118) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11118 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator11118);
                        int i211111111111111111116 = i22 & 112;
                        int i211111111111111111117 = i22 << 3;
                        int i311117 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF11119 = f(jVarA11118, state, f0VarB11118, slotSizesSums, m0VarA, z1111113, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11118, pVarF, 1073741824 | i211111111111111111116 | (i211111111111111111117 & bb.c.g.f32954lc) | (i211111111111111111117 & 57344) | (i211111111111111111117 & 458752) | (i211111111111111111117 & 3670016) | (i211111111111111111115 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA11118, state, pVar2, i211111111111111111116);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation11119 = orientation;
                        LazyLayoutKt.a(jVarA11118, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11118, qVarA11118, orientation11119, z12, pVar2, (i311117 >> 9) & 57344), orientation11119), f0VarB11118), state, orientation11119, f0VarB11118, z12, nVar1111111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation11119, z1111113), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF11119, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1111113;
                        nVar4 = nVar11111111110;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    } else {
                        pVarF.W();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        } else {
                            if (i24 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i25 != 0) {
                                m0VarA = PaddingKt.a(s1.h.g(0));
                            } else {
                                m0VarA = m0Var;
                            }
                            if (i14 == 0) {
                            }
                            if ((i12 & 64) != 0) {
                                i22 = i13 & (-3670017);
                                gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                            } else {
                                gVarA = gVar;
                                i22 = i13;
                            }
                            z13 = z15;
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                        }
                        androidx.compose.foundation.gestures.n nVar11111111111 = androidx.compose.foundation.gestures.n.f5788a;
                        androidx.compose.foundation.f0 f0VarB11119 = nVar11111111111.b(pVarF, 6);
                        int i211111111111111111118 = (i22 >> 3) & 14;
                        j jVarA11119 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111118);
                        int i211111111111111111119 = i22 >> 6;
                        androidx.compose.ui.n nVar11111111112 = nVar3;
                        androidx.compose.foundation.lazy.layout.q qVarA11119 = LazySemanticsKt.a(state, jVarA11119, z13, pVarF, i211111111111111111118 | (i211111111111111111119 & bb.c.b.f30796me));
                        pVarF.T(773894976);
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        companion = androidx.compose.runtime.p.INSTANCE;
                        if (objU == companion.a()) {
                            objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                        pVarF.c0();
                        Boolean boolValueOf11119 = Boolean.valueOf(z11);
                        boolean z1111114 = z13;
                        pVarF.T(511388516);
                        zS = pVarF.s(boolValueOf11119) | pVarF.s(state);
                        objU2 = pVarF.U();
                        if (zS) {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        } else {
                            objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                            pVarF.N(objU2);
                        }
                        pVarF.c0();
                        LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator11119 = (LazyGridItemPlacementAnimator) objU2;
                        state.G(lazyGridItemPlacementAnimator11119);
                        int i2111111111111111111110 = i22 & 112;
                        int i2111111111111111111111 = i22 << 3;
                        int i311118 = i22;
                        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111110 = f(jVarA11119, state, f0VarB11119, slotSizesSums, m0VarA, z1111114, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator11119, pVarF, 1073741824 | i2111111111111111111110 | (i2111111111111111111111 & bb.c.g.f32954lc) | (i2111111111111111111111 & 57344) | (i2111111111111111111111 & 458752) | (i2111111111111111111111 & 3670016) | (i211111111111111111119 & 29360128) | (i22 & 234881024), 0);
                        state.L(z11);
                        pVar2 = pVarF;
                        b(jVarA11119, state, pVar2, i2111111111111111111110);
                        if (z11) {
                            orientation = Orientation.Vertical;
                        } else {
                            orientation = Orientation.Horizontal;
                        }
                        Orientation orientation111110 = orientation;
                        LazyLayoutKt.a(jVarA11119, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA11119, qVarA11119, orientation111110, z12, pVar2, (i311118 >> 9) & 57344), orientation111110), f0VarB11119), state, orientation111110, f0VarB11119, z12, nVar11111111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111110, z1111114), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111110, pVar2, 0, 0);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        z14 = z1111114;
                        nVar4 = nVar11111111112;
                        m0Var2 = m0VarA;
                        gVar2 = gVarA;
                    }
                    u1VarH = pVar2.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar3, int i311119) {
                            LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                            a(pVar3, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = com.google.android.exoplayer2.j.G;
                i13 |= i19;
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11111111113 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB111110 = nVar11111111113.b(pVarF, 6);
                    int i2111111111111111111112 = (i22 >> 3) & 14;
                    j jVarA111110 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111111112);
                    int i2111111111111111111113 = i22 >> 6;
                    androidx.compose.ui.n nVar11111111114 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA111110 = LazySemanticsKt.a(state, jVarA111110, z13, pVarF, i2111111111111111111112 | (i2111111111111111111113 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf111110 = Boolean.valueOf(z11);
                    boolean z1111115 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf111110) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111110 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator111110);
                    int i2111111111111111111114 = i22 & 112;
                    int i2111111111111111111115 = i22 << 3;
                    int i311119 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111111 = f(jVarA111110, state, f0VarB111110, slotSizesSums, m0VarA, z1111115, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111110, pVarF, 1073741824 | i2111111111111111111114 | (i2111111111111111111115 & bb.c.g.f32954lc) | (i2111111111111111111115 & 57344) | (i2111111111111111111115 & 458752) | (i2111111111111111111115 & 3670016) | (i2111111111111111111113 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA111110, state, pVar2, i2111111111111111111114);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111111 = orientation;
                    LazyLayoutKt.a(jVarA111110, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111110, qVarA111110, orientation111111, z12, pVar2, (i311119 >> 9) & 57344), orientation111111), f0VarB111110), state, orientation111111, f0VarB111110, z12, nVar11111111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111111, z1111115), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111111, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1111115;
                    nVar4 = nVar11111111114;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11111111115 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB111111 = nVar11111111115.b(pVarF, 6);
                    int i2111111111111111111116 = (i22 >> 3) & 14;
                    j jVarA111111 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111111116);
                    int i2111111111111111111117 = i22 >> 6;
                    androidx.compose.ui.n nVar11111111116 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA111111 = LazySemanticsKt.a(state, jVarA111111, z13, pVarF, i2111111111111111111116 | (i2111111111111111111117 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf111111 = Boolean.valueOf(z11);
                    boolean z1111116 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf111111) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111111 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator111111);
                    int i2111111111111111111118 = i22 & 112;
                    int i2111111111111111111119 = i22 << 3;
                    int i3111110 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111112 = f(jVarA111111, state, f0VarB111111, slotSizesSums, m0VarA, z1111116, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111111, pVarF, 1073741824 | i2111111111111111111118 | (i2111111111111111111119 & bb.c.g.f32954lc) | (i2111111111111111111119 & 57344) | (i2111111111111111111119 & 458752) | (i2111111111111111111119 & 3670016) | (i2111111111111111111117 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA111111, state, pVar2, i2111111111111111111118);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111112 = orientation;
                    LazyLayoutKt.a(jVarA111111, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111111, qVarA111111, orientation111112, z12, pVar2, (i3111110 >> 9) & 57344), orientation111112), f0VarB111111), state, orientation111112, f0VarB111111, z12, nVar11111111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111112, z1111116), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111112, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1111116;
                    nVar4 = nVar11111111116;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3111111) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i18 = 100663296;
            i13 |= i18;
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(horizontalArrangement)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11111111117 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB111112 = nVar11111111117.b(pVarF, 6);
                    int i21111111111111111111110 = (i22 >> 3) & 14;
                    j jVarA111112 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111111110);
                    int i21111111111111111111111 = i22 >> 6;
                    androidx.compose.ui.n nVar11111111118 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA111112 = LazySemanticsKt.a(state, jVarA111112, z13, pVarF, i21111111111111111111110 | (i21111111111111111111111 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf111112 = Boolean.valueOf(z11);
                    boolean z1111117 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf111112) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111112 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator111112);
                    int i21111111111111111111112 = i22 & 112;
                    int i21111111111111111111113 = i22 << 3;
                    int i3111111 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111113 = f(jVarA111112, state, f0VarB111112, slotSizesSums, m0VarA, z1111117, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111112, pVarF, 1073741824 | i21111111111111111111112 | (i21111111111111111111113 & bb.c.g.f32954lc) | (i21111111111111111111113 & 57344) | (i21111111111111111111113 & 458752) | (i21111111111111111111113 & 3670016) | (i21111111111111111111111 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA111112, state, pVar2, i21111111111111111111112);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111113 = orientation;
                    LazyLayoutKt.a(jVarA111112, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111112, qVarA111112, orientation111113, z12, pVar2, (i3111111 >> 9) & 57344), orientation111113), f0VarB111112), state, orientation111113, f0VarB111112, z12, nVar11111111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111113, z1111117), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111113, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1111117;
                    nVar4 = nVar11111111118;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar11111111119 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB111113 = nVar11111111119.b(pVarF, 6);
                    int i21111111111111111111114 = (i22 >> 3) & 14;
                    j jVarA111113 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111111114);
                    int i21111111111111111111115 = i22 >> 6;
                    androidx.compose.ui.n nVar111111111110 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA111113 = LazySemanticsKt.a(state, jVarA111113, z13, pVarF, i21111111111111111111114 | (i21111111111111111111115 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf111113 = Boolean.valueOf(z11);
                    boolean z1111118 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf111113) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111113 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator111113);
                    int i21111111111111111111116 = i22 & 112;
                    int i21111111111111111111117 = i22 << 3;
                    int i3111112 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111114 = f(jVarA111113, state, f0VarB111113, slotSizesSums, m0VarA, z1111118, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111113, pVarF, 1073741824 | i21111111111111111111116 | (i21111111111111111111117 & bb.c.g.f32954lc) | (i21111111111111111111117 & 57344) | (i21111111111111111111117 & 458752) | (i21111111111111111111117 & 3670016) | (i21111111111111111111115 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA111113, state, pVar2, i21111111111111111111116);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111114 = orientation;
                    LazyLayoutKt.a(jVarA111113, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111113, qVarA111113, orientation111114, z12, pVar2, (i3111112 >> 9) & 57344), orientation111114), f0VarB111113), state, orientation111114, f0VarB111113, z12, nVar11111111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111114, z1111118), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111114, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z1111118;
                    nVar4 = nVar111111111110;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3111113) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = com.google.android.exoplayer2.j.G;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar111111111111 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB111114 = nVar111111111111.b(pVarF, 6);
                int i21111111111111111111118 = (i22 >> 3) & 14;
                j jVarA111114 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111111118);
                int i21111111111111111111119 = i22 >> 6;
                androidx.compose.ui.n nVar111111111112 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA111114 = LazySemanticsKt.a(state, jVarA111114, z13, pVarF, i21111111111111111111118 | (i21111111111111111111119 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf111114 = Boolean.valueOf(z11);
                boolean z1111119 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf111114) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111114 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator111114);
                int i211111111111111111111110 = i22 & 112;
                int i211111111111111111111111 = i22 << 3;
                int i3111113 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111115 = f(jVarA111114, state, f0VarB111114, slotSizesSums, m0VarA, z1111119, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111114, pVarF, 1073741824 | i211111111111111111111110 | (i211111111111111111111111 & bb.c.g.f32954lc) | (i211111111111111111111111 & 57344) | (i211111111111111111111111 & 458752) | (i211111111111111111111111 & 3670016) | (i21111111111111111111119 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA111114, state, pVar2, i211111111111111111111110);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111115 = orientation;
                LazyLayoutKt.a(jVarA111114, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111114, qVarA111114, orientation111115, z12, pVar2, (i3111113 >> 9) & 57344), orientation111115), f0VarB111114), state, orientation111115, f0VarB111114, z12, nVar111111111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111115, z1111119), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111115, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z1111119;
                nVar4 = nVar111111111112;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar111111111113 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB111115 = nVar111111111113.b(pVarF, 6);
                int i211111111111111111111112 = (i22 >> 3) & 14;
                j jVarA111115 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111111112);
                int i211111111111111111111113 = i22 >> 6;
                androidx.compose.ui.n nVar111111111114 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA111115 = LazySemanticsKt.a(state, jVarA111115, z13, pVarF, i211111111111111111111112 | (i211111111111111111111113 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf111115 = Boolean.valueOf(z11);
                boolean z11111110 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf111115) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111115 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator111115);
                int i211111111111111111111114 = i22 & 112;
                int i211111111111111111111115 = i22 << 3;
                int i3111114 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111116 = f(jVarA111115, state, f0VarB111115, slotSizesSums, m0VarA, z11111110, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111115, pVarF, 1073741824 | i211111111111111111111114 | (i211111111111111111111115 & bb.c.g.f32954lc) | (i211111111111111111111115 & 57344) | (i211111111111111111111115 & 458752) | (i211111111111111111111115 & 3670016) | (i211111111111111111111113 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA111115, state, pVar2, i211111111111111111111114);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111116 = orientation;
                LazyLayoutKt.a(jVarA111115, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111115, qVarA111115, orientation111116, z12, pVar2, (i3111114 >> 9) & 57344), orientation111116), f0VarB111115), state, orientation111116, f0VarB111115, z12, nVar111111111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111116, z11111110), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111116, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11111110;
                nVar4 = nVar111111111114;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3111115) {
                    LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i13 |= 12582912;
        if ((i12 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (pVarF.s(verticalArrangement)) {
                    i18 = 67108864;
                } else {
                    i18 = 33554432;
                }
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i10) == 0) {
                    if (pVarF.s(horizontalArrangement)) {
                        i19 = 536870912;
                    } else {
                        i19 = 268435456;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i20 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(content)) {
                        i21 = 4;
                    } else {
                        i21 = 2;
                    }
                    i20 = i11 | i21;
                } else {
                    i20 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111111111115 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB111116 = nVar111111111115.b(pVarF, 6);
                    int i211111111111111111111116 = (i22 >> 3) & 14;
                    j jVarA111116 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111111116);
                    int i211111111111111111111117 = i22 >> 6;
                    androidx.compose.ui.n nVar111111111116 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA111116 = LazySemanticsKt.a(state, jVarA111116, z13, pVarF, i211111111111111111111116 | (i211111111111111111111117 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf111116 = Boolean.valueOf(z11);
                    boolean z11111111 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf111116) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111116 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator111116);
                    int i211111111111111111111118 = i22 & 112;
                    int i211111111111111111111119 = i22 << 3;
                    int i3111115 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111117 = f(jVarA111116, state, f0VarB111116, slotSizesSums, m0VarA, z11111111, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111116, pVarF, 1073741824 | i211111111111111111111118 | (i211111111111111111111119 & bb.c.g.f32954lc) | (i211111111111111111111119 & 57344) | (i211111111111111111111119 & 458752) | (i211111111111111111111119 & 3670016) | (i211111111111111111111117 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA111116, state, pVar2, i211111111111111111111118);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111117 = orientation;
                    LazyLayoutKt.a(jVarA111116, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111116, qVarA111116, orientation111117, z12, pVar2, (i3111115 >> 9) & 57344), orientation111117), f0VarB111116), state, orientation111117, f0VarB111116, z12, nVar111111111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111117, z11111111), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111117, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z11111111;
                    nVar4 = nVar111111111116;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                } else {
                    pVarF.W();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    } else {
                        if (i24 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i25 != 0) {
                            m0VarA = PaddingKt.a(s1.h.g(0));
                        } else {
                            m0VarA = m0Var;
                        }
                        if (i14 == 0) {
                        }
                        if ((i12 & 64) != 0) {
                            i22 = i13 & (-3670017);
                            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                        } else {
                            gVarA = gVar;
                            i22 = i13;
                        }
                        z13 = z15;
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                    }
                    androidx.compose.foundation.gestures.n nVar111111111117 = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB111117 = nVar111111111117.b(pVarF, 6);
                    int i2111111111111111111111110 = (i22 >> 3) & 14;
                    j jVarA111117 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111111111110);
                    int i2111111111111111111111111 = i22 >> 6;
                    androidx.compose.ui.n nVar111111111118 = nVar3;
                    androidx.compose.foundation.lazy.layout.q qVarA111117 = LazySemanticsKt.a(state, jVarA111117, z13, pVarF, i2111111111111111111111110 | (i2111111111111111111111111 & bb.c.b.f30796me));
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf111117 = Boolean.valueOf(z11);
                    boolean z11111112 = z13;
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf111117) | pVarF.s(state);
                    objU2 = pVarF.U();
                    if (zS) {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    } else {
                        objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111117 = (LazyGridItemPlacementAnimator) objU2;
                    state.G(lazyGridItemPlacementAnimator111117);
                    int i2111111111111111111111112 = i22 & 112;
                    int i2111111111111111111111113 = i22 << 3;
                    int i3111116 = i22;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111118 = f(jVarA111117, state, f0VarB111117, slotSizesSums, m0VarA, z11111112, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111117, pVarF, 1073741824 | i2111111111111111111111112 | (i2111111111111111111111113 & bb.c.g.f32954lc) | (i2111111111111111111111113 & 57344) | (i2111111111111111111111113 & 458752) | (i2111111111111111111111113 & 3670016) | (i2111111111111111111111111 & 29360128) | (i22 & 234881024), 0);
                    state.L(z11);
                    pVar2 = pVarF;
                    b(jVarA111117, state, pVar2, i2111111111111111111111112);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation111118 = orientation;
                    LazyLayoutKt.a(jVarA111117, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar111111111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111117, qVarA111117, orientation111118, z12, pVar2, (i3111116 >> 9) & 57344), orientation111118), f0VarB111117), state, orientation111118, f0VarB111117, z12, nVar111111111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111118, z11111112), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111118, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    z14 = z11111112;
                    nVar4 = nVar111111111118;
                    m0Var2 = m0VarA;
                    gVar2 = gVarA;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3111117) {
                        LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = com.google.android.exoplayer2.j.G;
            i13 |= i19;
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar111111111119 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB111118 = nVar111111111119.b(pVarF, 6);
                int i2111111111111111111111114 = (i22 >> 3) & 14;
                j jVarA111118 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111111111114);
                int i2111111111111111111111115 = i22 >> 6;
                androidx.compose.ui.n nVar1111111111110 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA111118 = LazySemanticsKt.a(state, jVarA111118, z13, pVarF, i2111111111111111111111114 | (i2111111111111111111111115 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf111118 = Boolean.valueOf(z11);
                boolean z11111113 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf111118) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111118 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator111118);
                int i2111111111111111111111116 = i22 & 112;
                int i2111111111111111111111117 = i22 << 3;
                int i3111117 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF111119 = f(jVarA111118, state, f0VarB111118, slotSizesSums, m0VarA, z11111113, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111118, pVarF, 1073741824 | i2111111111111111111111116 | (i2111111111111111111111117 & bb.c.g.f32954lc) | (i2111111111111111111111117 & 57344) | (i2111111111111111111111117 & 458752) | (i2111111111111111111111117 & 3670016) | (i2111111111111111111111115 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA111118, state, pVar2, i2111111111111111111111116);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation111119 = orientation;
                LazyLayoutKt.a(jVarA111118, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111118, qVarA111118, orientation111119, z12, pVar2, (i3111117 >> 9) & 57344), orientation111119), f0VarB111118), state, orientation111119, f0VarB111118, z12, nVar111111111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation111119, z11111113), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF111119, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11111113;
                nVar4 = nVar1111111111110;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111111111111 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB111119 = nVar1111111111111.b(pVarF, 6);
                int i2111111111111111111111118 = (i22 >> 3) & 14;
                j jVarA111119 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i2111111111111111111111118);
                int i2111111111111111111111119 = i22 >> 6;
                androidx.compose.ui.n nVar1111111111112 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA111119 = LazySemanticsKt.a(state, jVarA111119, z13, pVarF, i2111111111111111111111118 | (i2111111111111111111111119 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf111119 = Boolean.valueOf(z11);
                boolean z11111114 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf111119) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator111119 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator111119);
                int i21111111111111111111111110 = i22 & 112;
                int i21111111111111111111111111 = i22 << 3;
                int i3111118 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1111110 = f(jVarA111119, state, f0VarB111119, slotSizesSums, m0VarA, z11111114, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator111119, pVarF, 1073741824 | i21111111111111111111111110 | (i21111111111111111111111111 & bb.c.g.f32954lc) | (i21111111111111111111111111 & 57344) | (i21111111111111111111111111 & 458752) | (i21111111111111111111111111 & 3670016) | (i2111111111111111111111119 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA111119, state, pVar2, i21111111111111111111111110);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111110 = orientation;
                LazyLayoutKt.a(jVarA111119, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111111112.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA111119, qVarA111119, orientation1111110, z12, pVar2, (i3111118 >> 9) & 57344), orientation1111110), f0VarB111119), state, orientation1111110, f0VarB111119, z12, nVar1111111111111.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1111110, z11111114), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1111110, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11111114;
                nVar4 = nVar1111111111112;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i3111119) {
                    LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i18 = 100663296;
        i13 |= i18;
        if ((i12 & 512) != 0) {
            if ((1879048192 & i10) == 0) {
                if (pVarF.s(horizontalArrangement)) {
                    i19 = 536870912;
                } else {
                    i19 = 268435456;
                }
            }
            if ((i12 & 1024) != 0) {
                i20 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(content)) {
                    i21 = 4;
                } else {
                    i21 = 2;
                }
                i20 = i11 | i21;
            } else {
                i20 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111111111113 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB1111110 = nVar1111111111113.b(pVarF, 6);
                int i21111111111111111111111112 = (i22 >> 3) & 14;
                j jVarA1111110 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111111111112);
                int i21111111111111111111111113 = i22 >> 6;
                androidx.compose.ui.n nVar1111111111114 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA1111110 = LazySemanticsKt.a(state, jVarA1111110, z13, pVarF, i21111111111111111111111112 | (i21111111111111111111111113 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf1111110 = Boolean.valueOf(z11);
                boolean z11111115 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf1111110) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1111110 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator1111110);
                int i21111111111111111111111114 = i22 & 112;
                int i21111111111111111111111115 = i22 << 3;
                int i3111119 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1111111 = f(jVarA1111110, state, f0VarB1111110, slotSizesSums, m0VarA, z11111115, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1111110, pVarF, 1073741824 | i21111111111111111111111114 | (i21111111111111111111111115 & bb.c.g.f32954lc) | (i21111111111111111111111115 & 57344) | (i21111111111111111111111115 & 458752) | (i21111111111111111111111115 & 3670016) | (i21111111111111111111111113 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA1111110, state, pVar2, i21111111111111111111111114);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111111 = orientation;
                LazyLayoutKt.a(jVarA1111110, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111111114.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1111110, qVarA1111110, orientation1111111, z12, pVar2, (i3111119 >> 9) & 57344), orientation1111111), f0VarB1111110), state, orientation1111111, f0VarB1111110, z12, nVar1111111111113.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1111111, z11111115), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1111111, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11111115;
                nVar4 = nVar1111111111114;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            } else {
                pVarF.W();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                } else {
                    if (i24 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i25 != 0) {
                        m0VarA = PaddingKt.a(s1.h.g(0));
                    } else {
                        m0VarA = m0Var;
                    }
                    if (i14 == 0) {
                    }
                    if ((i12 & 64) != 0) {
                        i22 = i13 & (-3670017);
                        gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                    } else {
                        gVarA = gVar;
                        i22 = i13;
                    }
                    z13 = z15;
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
                }
                androidx.compose.foundation.gestures.n nVar1111111111115 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB1111111 = nVar1111111111115.b(pVarF, 6);
                int i21111111111111111111111116 = (i22 >> 3) & 14;
                j jVarA1111111 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i21111111111111111111111116);
                int i21111111111111111111111117 = i22 >> 6;
                androidx.compose.ui.n nVar1111111111116 = nVar3;
                androidx.compose.foundation.lazy.layout.q qVarA1111111 = LazySemanticsKt.a(state, jVarA1111111, z13, pVarF, i21111111111111111111111116 | (i21111111111111111111111117 & bb.c.b.f30796me));
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(objU);
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf1111111 = Boolean.valueOf(z11);
                boolean z11111116 = z13;
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf1111111) | pVarF.s(state);
                objU2 = pVarF.U();
                if (zS) {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                } else {
                    objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU2);
                }
                pVarF.c0();
                LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1111111 = (LazyGridItemPlacementAnimator) objU2;
                state.G(lazyGridItemPlacementAnimator1111111);
                int i21111111111111111111111118 = i22 & 112;
                int i21111111111111111111111119 = i22 << 3;
                int i31111110 = i22;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1111112 = f(jVarA1111111, state, f0VarB1111111, slotSizesSums, m0VarA, z11111116, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1111111, pVarF, 1073741824 | i21111111111111111111111118 | (i21111111111111111111111119 & bb.c.g.f32954lc) | (i21111111111111111111111119 & 57344) | (i21111111111111111111111119 & 458752) | (i21111111111111111111111119 & 3670016) | (i21111111111111111111111117 & 29360128) | (i22 & 234881024), 0);
                state.L(z11);
                pVar2 = pVarF;
                b(jVarA1111111, state, pVar2, i21111111111111111111111118);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation1111112 = orientation;
                LazyLayoutKt.a(jVarA1111111, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111111116.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1111111, qVarA1111111, orientation1111112, z12, pVar2, (i31111110 >> 9) & 57344), orientation1111112), f0VarB1111111), state, orientation1111112, f0VarB1111111, z12, nVar1111111111115.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1111112, z11111116), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1111112, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                z14 = z11111116;
                nVar4 = nVar1111111111116;
                m0Var2 = m0VarA;
                gVar2 = gVarA;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31111111) {
                    LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = com.google.android.exoplayer2.j.G;
        i13 |= i19;
        if ((i12 & 1024) != 0) {
            i20 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (pVarF.s(content)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i20 = i11 | i21;
        } else {
            i20 = i11;
        }
        if ((i13 & 1533916891) != 306783378) {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i25 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var;
                }
                if (i14 == 0) {
                }
                if ((i12 & 64) != 0) {
                    i22 = i13 & (-3670017);
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                    i22 = i13;
                }
                z13 = z15;
            } else {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i25 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var;
                }
                if (i14 == 0) {
                }
                if ((i12 & 64) != 0) {
                    i22 = i13 & (-3670017);
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                    i22 = i13;
                }
                z13 = z15;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
            }
            androidx.compose.foundation.gestures.n nVar1111111111117 = androidx.compose.foundation.gestures.n.f5788a;
            androidx.compose.foundation.f0 f0VarB1111112 = nVar1111111111117.b(pVarF, 6);
            int i211111111111111111111111110 = (i22 >> 3) & 14;
            j jVarA1111112 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111111111110);
            int i211111111111111111111111111 = i22 >> 6;
            androidx.compose.ui.n nVar1111111111118 = nVar3;
            androidx.compose.foundation.lazy.layout.q qVarA1111112 = LazySemanticsKt.a(state, jVarA1111112, z13, pVarF, i211111111111111111111111110 | (i211111111111111111111111111 & bb.c.b.f30796me));
            pVarF.T(773894976);
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                pVarF.N(objU);
            }
            pVarF.c0();
            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
            pVarF.c0();
            Boolean boolValueOf1111112 = Boolean.valueOf(z11);
            boolean z11111117 = z13;
            pVarF.T(511388516);
            zS = pVarF.s(boolValueOf1111112) | pVarF.s(state);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU2);
            } else {
                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU2);
            }
            pVarF.c0();
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1111112 = (LazyGridItemPlacementAnimator) objU2;
            state.G(lazyGridItemPlacementAnimator1111112);
            int i211111111111111111111111112 = i22 & 112;
            int i211111111111111111111111113 = i22 << 3;
            int i31111111 = i22;
            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1111113 = f(jVarA1111112, state, f0VarB1111112, slotSizesSums, m0VarA, z11111117, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1111112, pVarF, 1073741824 | i211111111111111111111111112 | (i211111111111111111111111113 & bb.c.g.f32954lc) | (i211111111111111111111111113 & 57344) | (i211111111111111111111111113 & 458752) | (i211111111111111111111111113 & 3670016) | (i211111111111111111111111111 & 29360128) | (i22 & 234881024), 0);
            state.L(z11);
            pVar2 = pVarF;
            b(jVarA1111112, state, pVar2, i211111111111111111111111112);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111113 = orientation;
            LazyLayoutKt.a(jVarA1111112, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar1111111111118.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1111112, qVarA1111112, orientation1111113, z12, pVar2, (i31111111 >> 9) & 57344), orientation1111113), f0VarB1111112), state, orientation1111113, f0VarB1111112, z12, nVar1111111111117.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1111113, z11111117), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1111113, pVar2, 0, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z14 = z11111117;
            nVar4 = nVar1111111111118;
            m0Var2 = m0VarA;
            gVar2 = gVarA;
        } else {
            pVarF.W();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i25 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var;
                }
                if (i14 == 0) {
                }
                if ((i12 & 64) != 0) {
                    i22 = i13 & (-3670017);
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                    i22 = i13;
                }
                z13 = z15;
            } else {
                if (i24 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i25 != 0) {
                    m0VarA = PaddingKt.a(s1.h.g(0));
                } else {
                    m0VarA = m0Var;
                }
                if (i14 == 0) {
                }
                if ((i12 & 64) != 0) {
                    i22 = i13 & (-3670017);
                    gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
                } else {
                    gVarA = gVar;
                    i22 = i13;
                }
                z13 = z15;
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(152645664, i22, i20, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:52)");
            }
            androidx.compose.foundation.gestures.n nVar1111111111119 = androidx.compose.foundation.gestures.n.f5788a;
            androidx.compose.foundation.f0 f0VarB1111113 = nVar1111111111119.b(pVarF, 6);
            int i211111111111111111111111114 = (i22 >> 3) & 14;
            j jVarA1111113 = LazyGridItemProviderKt.a(state, content, pVarF, ((i20 << 3) & 112) | i211111111111111111111111114);
            int i211111111111111111111111115 = i22 >> 6;
            androidx.compose.ui.n nVar11111111111110 = nVar3;
            androidx.compose.foundation.lazy.layout.q qVarA1111113 = LazySemanticsKt.a(state, jVarA1111113, z13, pVarF, i211111111111111111111111114 | (i211111111111111111111111115 & bb.c.b.f30796me));
            pVarF.T(773894976);
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                pVarF.N(objU);
            }
            pVarF.c0();
            coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
            pVarF.c0();
            Boolean boolValueOf1111113 = Boolean.valueOf(z11);
            boolean z11111118 = z13;
            pVarF.T(511388516);
            zS = pVarF.s(boolValueOf1111113) | pVarF.s(state);
            objU2 = pVarF.U();
            if (zS) {
                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU2);
            } else {
                objU2 = new LazyGridItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU2);
            }
            pVarF.c0();
            LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator1111113 = (LazyGridItemPlacementAnimator) objU2;
            state.G(lazyGridItemPlacementAnimator1111113);
            int i211111111111111111111111116 = i22 & 112;
            int i211111111111111111111111117 = i22 << 3;
            int i31111112 = i22;
            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF1111114 = f(jVarA1111113, state, f0VarB1111113, slotSizesSums, m0VarA, z11111118, z11, horizontalArrangement, verticalArrangement, lazyGridItemPlacementAnimator1111113, pVarF, 1073741824 | i211111111111111111111111116 | (i211111111111111111111111117 & bb.c.g.f32954lc) | (i211111111111111111111111117 & 57344) | (i211111111111111111111111117 & 458752) | (i211111111111111111111111117 & 3670016) | (i211111111111111111111111115 & 29360128) | (i22 & 234881024), 0);
            state.L(z11);
            pVar2 = pVarF;
            b(jVarA1111113, state, pVar2, i211111111111111111111111116);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation1111114 = orientation;
            LazyLayoutKt.a(jVarA1111113, ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(nVar11111111111110.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), jVarA1111113, qVarA1111113, orientation1111114, z12, pVar2, (i31111112 >> 9) & 57344), orientation1111114), f0VarB1111113), state, orientation1111114, f0VarB1111113, z12, nVar1111111111119.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation1111114, z11111118), gVarA, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF1111114, pVar2, 0, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            z14 = z11111118;
            nVar4 = nVar11111111111110;
            m0Var2 = m0VarA;
            gVar2 = gVarA;
        }
        u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i31111113) {
                LazyGridKt.a(nVar4, state, slotSizesSums, m0Var2, z14, z11, gVar2, z12, verticalArrangement, horizontalArrangement, content, pVar3, i10 | 1, i11, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final void b(final j jVar, final LazyGridState lazyGridState, androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar.F(950944068);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(jVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(lazyGridState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(950944068, i10, -1, "androidx.compose.foundation.lazy.grid.ScrollPositionUpdater (LazyGrid.kt:140)");
            }
            if (jVar.a() > 0) {
                lazyGridState.N(jVar);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$ScrollPositionUpdater$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                LazyGridKt.b(jVar, lazyGridState, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.foundation.f0 f0Var, o oVar) {
        Object obj;
        w[] items;
        boolean canScrollForward = oVar.getCanScrollForward();
        y firstVisibleLine = oVar.getFirstVisibleLine();
        if (firstVisibleLine == null || (items = firstVisibleLine.getItems()) == null || (obj = (w) ArraysKt___ArraysKt.Oc(items)) == null) {
            obj = 0;
        }
        f0Var.setEnabled(canScrollForward || (!f0.g(obj, 0) || oVar.getFirstVisibleLineScrollOffset() != 0));
    }

    @androidx.compose.runtime.h
    private static final yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> f(final j jVar, final LazyGridState lazyGridState, final androidx.compose.foundation.f0 f0Var, final yh.p<? super s1.e, ? super s1.b, ? extends List<Integer>> pVar, final m0 m0Var, final boolean z10, final boolean z11, Arrangement.d dVar, Arrangement.l lVar, final LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, androidx.compose.runtime.p pVar2, int i10, int i11) {
        pVar2.T(1958911962);
        final Arrangement.d dVar2 = (i11 & 128) != 0 ? null : dVar;
        final Arrangement.l lVar2 = (i11 & 256) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(1958911962, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:151)");
        }
        Object[] objArr = {lazyGridState, f0Var, pVar, m0Var, Boolean.valueOf(z10), Boolean.valueOf(z11), dVar2, lVar2, lazyGridItemPlacementAnimator};
        pVar2.T(-568225417);
        boolean zS = false;
        for (int i12 = 0; i12 < 9; i12++) {
            zS |= pVar2.s(objArr[i12]);
        }
        Object objU = pVar2.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, o>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1

                /* JADX INFO: compiled from: LazyGrid.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class a implements b0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.lazy.layout.m f6791a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ boolean f6792b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ boolean f6793c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ int f6794d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ int f6795e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ LazyGridItemPlacementAnimator f6796f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ long f6797g;

                    a(androidx.compose.foundation.lazy.layout.m mVar, boolean z10, boolean z11, int i10, int i11, LazyGridItemPlacementAnimator lazyGridItemPlacementAnimator, long j10) {
                        this.f6791a = mVar;
                        this.f6792b = z10;
                        this.f6793c = z11;
                        this.f6794d = i10;
                        this.f6795e = i11;
                        this.f6796f = lazyGridItemPlacementAnimator;
                        this.f6797g = j10;
                    }

                    @Override // androidx.compose.foundation.lazy.grid.b0
                    @dl.d
                    public final w a(int i10, @dl.d Object key, int i11, int i12, @dl.d List<? extends e1> placeables) {
                        f0.p(key, "key");
                        f0.p(placeables, "placeables");
                        return new w(i10, key, this.f6792b, i11, i12, this.f6793c, this.f6791a.getLayoutDirection(), this.f6794d, this.f6795e, placeables, this.f6796f, this.f6797g, null);
                    }
                }

                /* JADX INFO: compiled from: LazyGrid.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class b implements c0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ boolean f6798a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ List<Integer> f6799b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.lazy.layout.m f6800c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ int f6801d;

                    b(boolean z10, List<Integer> list, androidx.compose.foundation.lazy.layout.m mVar, int i10) {
                        this.f6798a = z10;
                        this.f6799b = list;
                        this.f6800c = mVar;
                        this.f6801d = i10;
                    }

                    @Override // androidx.compose.foundation.lazy.grid.c0
                    @dl.d
                    public final y a(int i10, @dl.d w[] items, @dl.d List<d> spans, int i11) {
                        f0.p(items, "items");
                        f0.p(spans, "spans");
                        return new y(i10, items, spans, this.f6798a, this.f6799b.size(), this.f6800c.getLayoutDirection(), i11, this.f6801d, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @dl.d
                public final o a(@dl.d final androidx.compose.foundation.lazy.layout.m mVar, final long j10) {
                    int i13;
                    float spacing;
                    float fA;
                    long jA;
                    int iN;
                    int iD;
                    f0.p(mVar, "$this$null");
                    androidx.compose.foundation.i.a(j10, z11 ? Orientation.Vertical : Orientation.Horizontal);
                    int iE1 = z11 ? mVar.e1(m0Var.b(mVar.getLayoutDirection())) : mVar.e1(PaddingKt.i(m0Var, mVar.getLayoutDirection()));
                    int iE2 = z11 ? mVar.e1(m0Var.c(mVar.getLayoutDirection())) : mVar.e1(PaddingKt.h(m0Var, mVar.getLayoutDirection()));
                    int iE3 = mVar.e1(m0Var.getTop());
                    int iE4 = mVar.e1(m0Var.getBottom());
                    final int i14 = iE3 + iE4;
                    final int i15 = iE1 + iE2;
                    boolean z12 = z11;
                    int i16 = z12 ? i14 : i15;
                    if (z12 && !z10) {
                        i13 = iE3;
                    } else if (z12 && z10) {
                        i13 = iE4;
                    } else {
                        i13 = (z12 || z10) ? iE2 : iE1;
                    }
                    int i17 = i16 - i13;
                    long jI = s1.c.i(j10, -i15, -i14);
                    lazyGridState.N(jVar);
                    final LazyGridSpanLayoutProvider spanLayoutProvider = jVar.getSpanLayoutProvider();
                    List<Integer> listInvoke = pVar.invoke(mVar, s1.b.b(j10));
                    spanLayoutProvider.h(listInvoke.size());
                    lazyGridState.F(mVar);
                    lazyGridState.K(listInvoke.size());
                    if (z11) {
                        Arrangement.l lVar3 = lVar2;
                        if (lVar3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = lVar3.a();
                    } else {
                        Arrangement.d dVar3 = dVar2;
                        if (dVar3 == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        spacing = dVar3.getSpacing();
                    }
                    int iE5 = mVar.e1(spacing);
                    if (z11) {
                        Arrangement.d dVar4 = dVar2;
                        fA = dVar4 != null ? dVar4.getSpacing() : s1.h.g(0);
                    } else {
                        Arrangement.l lVar4 = lVar2;
                        fA = lVar4 != null ? lVar4.a() : s1.h.g(0);
                    }
                    int iE6 = mVar.e1(fA);
                    int iA = jVar.a();
                    int iO = z11 ? s1.b.o(j10) - i14 : s1.b.p(j10) - i15;
                    if (!z10 || iO > 0) {
                        jA = s1.o.a(iE1, iE3);
                    } else {
                        boolean z13 = z11;
                        if (!z13) {
                            iE1 += iO;
                        }
                        if (z13) {
                            iE3 += iO;
                        }
                        jA = s1.o.a(iE1, iE3);
                    }
                    int i18 = i13;
                    x xVar = new x(jVar, mVar, iE5, new a(mVar, z11, z10, i13, i17, lazyGridItemPlacementAnimator, jA));
                    boolean z14 = z11;
                    final z zVar = new z(z14, listInvoke, iE6, iA, iE5, xVar, spanLayoutProvider, new b(z14, listInvoke, mVar, iE6));
                    lazyGridState.H(new yh.l<a0, ArrayList<Pair<? extends Integer, ? extends s1.b>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @dl.d
                        public final ArrayList<Pair<Integer, s1.b>> a(int i19) {
                            LazyGridSpanLayoutProvider.c cVarC = spanLayoutProvider.c(i19);
                            int iC = e.c(cVarC.getFirstItemIndex());
                            ArrayList<Pair<Integer, s1.b>> arrayList = new ArrayList<>(cVarC.b().size());
                            List<d> listB = cVarC.b();
                            z zVar2 = zVar;
                            int size = listB.size();
                            int i20 = 0;
                            for (int i21 = 0; i21 < size; i21++) {
                                int iF = d.f(listB.get(i21).getPackedValue());
                                arrayList.add(c1.a(Integer.valueOf(iC), s1.b.b(zVar2.a(i20, iF))));
                                iC = e.c(iC + 1);
                                i20 += iF;
                            }
                            return arrayList;
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends s1.b>> invoke(a0 a0Var) {
                            return a(a0Var.n());
                        }
                    });
                    androidx.compose.runtime.snapshots.f.Companion companion = androidx.compose.runtime.snapshots.f.INSTANCE;
                    LazyGridState lazyGridState2 = lazyGridState;
                    androidx.compose.runtime.snapshots.f fVarA = companion.a();
                    try {
                        androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
                        try {
                            if (lazyGridState2.m() < iA || iA <= 0) {
                                int iD2 = spanLayoutProvider.d(lazyGridState2.m());
                                iN = lazyGridState2.n();
                                iD = iD2;
                            } else {
                                iD = spanLayoutProvider.d(iA - 1);
                                iN = 0;
                            }
                            b2 b2Var = b2.f124493a;
                            fVarA.w(fVarP);
                            fVarA.d();
                            o oVarC = LazyGridMeasureKt.c(iA, zVar, xVar, iO, i18, i17, iE5, iD, iN, lazyGridState.getScrollToBeConsumed(), jI, z11, lVar2, dVar2, z10, mVar, lazyGridItemPlacementAnimator, jVar.getSpanLayoutProvider(), new yh.q<Integer, Integer, yh.l<? super e1.a, ? extends b2>, j0>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @dl.d
                                public final j0 a(int i19, int i20, @dl.d yh.l<? super e1.a, b2> placement) {
                                    f0.p(placement, "placement");
                                    return mVar.p1(s1.c.g(j10, i19 + i15), s1.c.f(j10, i20 + i14), s0.z(), placement);
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ j0 invoke(Integer num, Integer num2, yh.l<? super e1.a, ? extends b2> lVar5) {
                                    return a(num.intValue(), num2.intValue(), lVar5);
                                }
                            });
                            LazyGridState lazyGridState3 = lazyGridState;
                            androidx.compose.foundation.f0 f0Var2 = f0Var;
                            lazyGridState3.h(oVarC);
                            LazyGridKt.e(f0Var2, oVarC);
                            return oVarC;
                        } catch (Throwable th2) {
                            fVarA.w(fVarP);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        fVarA.d();
                        throw th3;
                    }
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ o invoke(androidx.compose.foundation.lazy.layout.m mVar, s1.b bVar) {
                    return a(mVar, bVar.getF139216a());
                }
            };
            pVar2.N(objU);
        }
        pVar2.c0();
        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVar3 = (yh.p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar2.c0();
        return pVar3;
    }
}
