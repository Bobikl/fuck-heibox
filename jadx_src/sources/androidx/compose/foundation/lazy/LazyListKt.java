package androidx.compose.foundation.lazy;

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
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: LazyList.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0090\u0001\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0099\u0001\u0010)\u001a\u0019\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0%¢\u0006\u0002\b\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a\u0018\u0010-\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010,\u001a\u00020+H\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "", "reverseLayout", "isVertical", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/ui/c$b;", "horizontalAlignment", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/ui/c$c;", "verticalAlignment", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/w;", "Lkotlin/b2;", "Lkotlin/t;", "content", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/m0;ZZLandroidx/compose/foundation/gestures/g;ZLandroidx/compose/ui/c$b;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/layout/Arrangement$d;Lyh/l;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/foundation/lazy/o;", "itemProvider", "b", "(Landroidx/compose/foundation/lazy/o;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/foundation/lazy/i;", "beyondBoundsInfo", "Landroidx/compose/foundation/f0;", "overscrollEffect", "Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;", "placementAnimator", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/m;", "Ls1/b;", "Landroidx/compose/ui/layout/j0;", "f", "(Landroidx/compose/foundation/lazy/o;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/i;Landroidx/compose/foundation/f0;Landroidx/compose/foundation/layout/m0;ZZLandroidx/compose/ui/c$b;Landroidx/compose/ui/c$c;Landroidx/compose/foundation/layout/Arrangement$d;Landroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/lazy/LazyListItemPlacementAnimator;Landroidx/compose/runtime/p;III)Lyh/p;", "Landroidx/compose/foundation/lazy/r;", "result", "e", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyListKt {
    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0142  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:107:0x014f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x015b  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0163  */
    /* JADX WARN: Code duplicated, block: B:117:0x0169  */
    /* JADX WARN: Code duplicated, block: B:118:0x016c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0170  */
    /* JADX WARN: Code duplicated, block: B:122:0x0176  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:144:0x01be  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:150:0x020e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0266  */
    /* JADX WARN: Code duplicated, block: B:158:0x026c  */
    /* JADX WARN: Code duplicated, block: B:161:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:165:0x035e  */
    /* JADX WARN: Code duplicated, block: B:170:0x036e  */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00df  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:82:0x0102  */
    /* JADX WARN: Code duplicated, block: B:86:0x010c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0113  */
    /* JADX WARN: Code duplicated, block: B:89:0x0119  */
    /* JADX WARN: Code duplicated, block: B:91:0x011f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0122  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0131  */
    /* JADX WARN: Code duplicated, block: B:99:0x0139  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.n modifier, @dl.d final LazyListState state, @dl.d final m0 contentPadding, final boolean z10, final boolean z11, @dl.d final androidx.compose.foundation.gestures.g flingBehavior, final boolean z12, @dl.e androidx.compose.ui.c.b bVar, @dl.e Arrangement.l lVar, @dl.e androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, @dl.e Arrangement.d dVar, @dl.d final yh.l<? super w, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11, final int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        androidx.compose.ui.c.b bVar2;
        Arrangement.l lVar2;
        androidx.compose.ui.c.InterfaceC0079c interfaceC0079c2;
        Arrangement.d dVar2;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        Object objU2;
        q0 coroutineScope;
        boolean zS;
        Object objU3;
        androidx.compose.runtime.p pVar2;
        Orientation orientation;
        final androidx.compose.ui.c.b bVar3;
        final Arrangement.l lVar3;
        final androidx.compose.ui.c.InterfaceC0079c interfaceC0079c3;
        u1 u1VarH;
        f0.p(modifier, "modifier");
        f0.p(state, "state");
        f0.p(contentPadding, "contentPadding");
        f0.p(flingBehavior, "flingBehavior");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(955299798);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (pVarF.s(modifier) ? 4 : 2) | i10;
        } else {
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
            i13 |= pVarF.s(contentPadding) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i13 |= pVarF.u(z10) ? 2048 : 1024;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            i13 |= pVarF.u(z11) ? 16384 : 8192;
        }
        if ((i12 & 32) == 0) {
            if ((i10 & 458752) == 0) {
                i14 = pVarF.s(flingBehavior) ? 131072 : 65536;
            }
            if ((i12 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.u(z12)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 128;
                if (i16 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (pVarF.s(bVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 256;
                if (i18 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (pVarF.s(lVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    i13 |= com.google.android.exoplayer2.j.G;
                } else if ((i10 & 1879048192) == 0) {
                    if (pVarF.s(interfaceC0079c)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 1024;
                if (i22 != 0) {
                    i23 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (pVarF.s(dVar)) {
                        i24 = 4;
                    } else {
                        i24 = 2;
                    }
                    i23 = i11 | i24;
                } else {
                    i23 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i23 |= 48;
                } else if ((i11 & 112) == 0) {
                    i23 |= pVarF.s(content) ? 32 : 16;
                }
                i25 = i23;
                if ((i13 & 1533916891) != 306783378 && (i25 & 91) == 18 && pVarF.b()) {
                    pVarF.l();
                    lVar3 = lVar;
                    interfaceC0079c3 = interfaceC0079c;
                    dVar2 = dVar;
                    pVar2 = pVarF;
                    bVar3 = bVar;
                } else {
                    if (i16 != 0) {
                        bVar2 = null;
                    } else {
                        bVar2 = bVar;
                    }
                    if (i18 != 0) {
                        lVar2 = null;
                    } else {
                        lVar2 = lVar;
                    }
                    if (i20 != 0) {
                        interfaceC0079c2 = null;
                    } else {
                        interfaceC0079c2 = interfaceC0079c;
                    }
                    if (i22 != 0) {
                        dVar2 = null;
                    } else {
                        dVar2 = dVar;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                    }
                    androidx.compose.foundation.gestures.n nVar = androidx.compose.foundation.gestures.n.f5788a;
                    androidx.compose.foundation.f0 f0VarB = nVar.b(pVarF, 6);
                    int i26 = i13 >> 3;
                    int i27 = i26 & 14;
                    o oVarA = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i27);
                    int i28 = i13;
                    androidx.compose.foundation.lazy.layout.q qVarA = LazySemanticsKt.a(state, oVarA, z10, z11, pVarF, (i26 & bb.c.g.f32954lc) | i27 | (i26 & bb.c.b.f30796me));
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    if (objU == companion.a()) {
                        objU = new i();
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    i iVar = (i) objU;
                    pVarF.T(773894976);
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        androidx.compose.runtime.x xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                        pVarF.N(xVar);
                        objU2 = xVar;
                    }
                    pVarF.c0();
                    coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
                    pVarF.c0();
                    Boolean boolValueOf = Boolean.valueOf(z11);
                    pVarF.T(511388516);
                    zS = pVarF.s(boolValueOf) | pVarF.s(state);
                    objU3 = pVarF.U();
                    if (zS || objU3 == companion.a()) {
                        objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    LazyListItemPlacementAnimator lazyListItemPlacementAnimator = (LazyListItemPlacementAnimator) objU3;
                    state.E(lazyListItemPlacementAnimator);
                    int i29 = i28 & 112;
                    int i30 = androidx.compose.runtime.collection.e.f12643e;
                    int i31 = i28 << 6;
                    yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF2 = f(oVarA, state, iVar, f0VarB, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator, pVarF, (i30 << 6) | i29 | (i31 & 57344) | (i31 & 458752) | (i31 & 3670016) | (i28 & 29360128) | (i26 & 234881024) | (1879048192 & (i25 << 27)), ((i28 >> 24) & 14) | 64, 0);
                    pVar2 = pVarF;
                    b(oVarA, state, pVar2, i29);
                    if (z11) {
                        orientation = Orientation.Vertical;
                    } else {
                        orientation = Orientation.Horizontal;
                    }
                    Orientation orientation2 = orientation;
                    LazyLayoutKt.a(oVarA, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA, qVarA, orientation2, z12, pVar2, (i28 >> 6) & 57344), orientation2), state, iVar, z10, orientation2, pVar2, (i30 << 6) | i29 | (i28 & bb.c.g.f32954lc)), state, iVar, pVar2, i29 | (i30 << 6)), f0VarB), state, orientation2, f0VarB, z12, nVar.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation2, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF2, pVar2, 0, 0);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    bVar3 = bVar2;
                    lVar3 = lVar2;
                    interfaceC0079c3 = interfaceC0079c2;
                }
                u1VarH = pVar2.H();
                if (u1VarH == null) {
                    return;
                }
                final Arrangement.d dVar3 = dVar2;
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i32) {
                        LazyListKt.a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, bVar3, lVar3, interfaceC0079c3, dVar3, content, pVar3, i10 | 1, i11, i12);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i13 |= 1572864;
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(bVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            i18 = i12 & 256;
            if (i18 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(lVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i13 |= i19;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(interfaceC0079c)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            i22 = i12 & 1024;
            if (i22 != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(dVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i12 & 2048) != 0) {
                i23 |= 48;
            } else if ((i11 & 112) == 0) {
                i23 |= pVarF.s(content) ? 32 : 16;
            }
            i25 = i23;
            if ((i13 & 1533916891) != 306783378) {
                if (i16 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                }
                if (i20 != 0) {
                    interfaceC0079c2 = null;
                } else {
                    interfaceC0079c2 = interfaceC0079c;
                }
                if (i22 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                androidx.compose.foundation.gestures.n nVar2 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB2 = nVar2.b(pVarF, 6);
                int i210 = i13 >> 3;
                int i211 = i210 & 14;
                o oVarA2 = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i211);
                int i212 = i13;
                androidx.compose.foundation.lazy.layout.q qVarA2 = LazySemanticsKt.a(state, oVarA2, z10, z11, pVarF, (i210 & bb.c.g.f32954lc) | i211 | (i210 & bb.c.b.f30796me));
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new i();
                    pVarF.N(objU);
                }
                pVarF.c0();
                i iVar2 = (i) objU;
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.x xVar2 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(xVar2);
                    objU2 = xVar2;
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf2 = Boolean.valueOf(z11);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf2) | pVarF.s(state);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                } else {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                }
                pVarF.c0();
                LazyListItemPlacementAnimator lazyListItemPlacementAnimator2 = (LazyListItemPlacementAnimator) objU3;
                state.E(lazyListItemPlacementAnimator2);
                int i213 = i212 & 112;
                int i32 = androidx.compose.runtime.collection.e.f12643e;
                int i33 = i212 << 6;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF3 = f(oVarA2, state, iVar2, f0VarB2, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator2, pVarF, (i32 << 6) | i213 | (i33 & 57344) | (i33 & 458752) | (i33 & 3670016) | (i212 & 29360128) | (i210 & 234881024) | (1879048192 & (i25 << 27)), ((i212 >> 24) & 14) | 64, 0);
                pVar2 = pVarF;
                b(oVarA2, state, pVar2, i213);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation3 = orientation;
                LazyLayoutKt.a(oVarA2, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA2, qVarA2, orientation3, z12, pVar2, (i212 >> 6) & 57344), orientation3), state, iVar2, z10, orientation3, pVar2, (i32 << 6) | i213 | (i212 & bb.c.g.f32954lc)), state, iVar2, pVar2, i213 | (i32 << 6)), f0VarB2), state, orientation3, f0VarB2, z12, nVar2.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation3, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF3, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                bVar3 = bVar2;
                lVar3 = lVar2;
                interfaceC0079c3 = interfaceC0079c2;
            } else {
                if (i16 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                }
                if (i20 != 0) {
                    interfaceC0079c2 = null;
                } else {
                    interfaceC0079c2 = interfaceC0079c;
                }
                if (i22 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                androidx.compose.foundation.gestures.n nVar3 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB3 = nVar3.b(pVarF, 6);
                int i214 = i13 >> 3;
                int i215 = i214 & 14;
                o oVarA3 = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i215);
                int i216 = i13;
                androidx.compose.foundation.lazy.layout.q qVarA3 = LazySemanticsKt.a(state, oVarA3, z10, z11, pVarF, (i214 & bb.c.g.f32954lc) | i215 | (i214 & bb.c.b.f30796me));
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new i();
                    pVarF.N(objU);
                }
                pVarF.c0();
                i iVar3 = (i) objU;
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.x xVar3 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(xVar3);
                    objU2 = xVar3;
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf3 = Boolean.valueOf(z11);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf3) | pVarF.s(state);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                } else {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                }
                pVarF.c0();
                LazyListItemPlacementAnimator lazyListItemPlacementAnimator3 = (LazyListItemPlacementAnimator) objU3;
                state.E(lazyListItemPlacementAnimator3);
                int i217 = i216 & 112;
                int i34 = androidx.compose.runtime.collection.e.f12643e;
                int i35 = i216 << 6;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF4 = f(oVarA3, state, iVar3, f0VarB3, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator3, pVarF, (i34 << 6) | i217 | (i35 & 57344) | (i35 & 458752) | (i35 & 3670016) | (i216 & 29360128) | (i214 & 234881024) | (1879048192 & (i25 << 27)), ((i216 >> 24) & 14) | 64, 0);
                pVar2 = pVarF;
                b(oVarA3, state, pVar2, i217);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation4 = orientation;
                LazyLayoutKt.a(oVarA3, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA3, qVarA3, orientation4, z12, pVar2, (i216 >> 6) & 57344), orientation4), state, iVar3, z10, orientation4, pVar2, (i34 << 6) | i217 | (i216 & bb.c.g.f32954lc)), state, iVar3, pVar2, i217 | (i34 << 6)), f0VarB3), state, orientation4, f0VarB3, z12, nVar3.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation4, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF4, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                bVar3 = bVar2;
                lVar3 = lVar2;
                interfaceC0079c3 = interfaceC0079c2;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            final Arrangement.d dVar4 = dVar2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i36) {
                    LazyListKt.a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, bVar3, lVar3, interfaceC0079c3, dVar4, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 = androidx.profileinstaller.o.c.f26824k;
        i13 |= i14;
        if ((i12 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (pVarF.u(z12)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i13 |= i15;
            }
            i16 = i12 & 128;
            if (i16 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (pVarF.s(bVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i13 |= i17;
            }
            i18 = i12 & 256;
            if (i18 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (pVarF.s(lVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i13 |= i19;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                i13 |= com.google.android.exoplayer2.j.G;
            } else if ((i10 & 1879048192) == 0) {
                if (pVarF.s(interfaceC0079c)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
            i22 = i12 & 1024;
            if (i22 != 0) {
                i23 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (pVarF.s(dVar)) {
                    i24 = 4;
                } else {
                    i24 = 2;
                }
                i23 = i11 | i24;
            } else {
                i23 = i11;
            }
            if ((i12 & 2048) != 0) {
                i23 |= 48;
            } else if ((i11 & 112) == 0) {
                i23 |= pVarF.s(content) ? 32 : 16;
            }
            i25 = i23;
            if ((i13 & 1533916891) != 306783378) {
                if (i16 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                }
                if (i20 != 0) {
                    interfaceC0079c2 = null;
                } else {
                    interfaceC0079c2 = interfaceC0079c;
                }
                if (i22 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                androidx.compose.foundation.gestures.n nVar4 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB4 = nVar4.b(pVarF, 6);
                int i218 = i13 >> 3;
                int i219 = i218 & 14;
                o oVarA4 = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i219);
                int i2110 = i13;
                androidx.compose.foundation.lazy.layout.q qVarA4 = LazySemanticsKt.a(state, oVarA4, z10, z11, pVarF, (i218 & bb.c.g.f32954lc) | i219 | (i218 & bb.c.b.f30796me));
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new i();
                    pVarF.N(objU);
                }
                pVarF.c0();
                i iVar4 = (i) objU;
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.x xVar4 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(xVar4);
                    objU2 = xVar4;
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf4 = Boolean.valueOf(z11);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf4) | pVarF.s(state);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                } else {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                }
                pVarF.c0();
                LazyListItemPlacementAnimator lazyListItemPlacementAnimator4 = (LazyListItemPlacementAnimator) objU3;
                state.E(lazyListItemPlacementAnimator4);
                int i2111 = i2110 & 112;
                int i36 = androidx.compose.runtime.collection.e.f12643e;
                int i37 = i2110 << 6;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF5 = f(oVarA4, state, iVar4, f0VarB4, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator4, pVarF, (i36 << 6) | i2111 | (i37 & 57344) | (i37 & 458752) | (i37 & 3670016) | (i2110 & 29360128) | (i218 & 234881024) | (1879048192 & (i25 << 27)), ((i2110 >> 24) & 14) | 64, 0);
                pVar2 = pVarF;
                b(oVarA4, state, pVar2, i2111);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation5 = orientation;
                LazyLayoutKt.a(oVarA4, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA4, qVarA4, orientation5, z12, pVar2, (i2110 >> 6) & 57344), orientation5), state, iVar4, z10, orientation5, pVar2, (i36 << 6) | i2111 | (i2110 & bb.c.g.f32954lc)), state, iVar4, pVar2, i2111 | (i36 << 6)), f0VarB4), state, orientation5, f0VarB4, z12, nVar4.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation5, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF5, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                bVar3 = bVar2;
                lVar3 = lVar2;
                interfaceC0079c3 = interfaceC0079c2;
            } else {
                if (i16 != 0) {
                    bVar2 = null;
                } else {
                    bVar2 = bVar;
                }
                if (i18 != 0) {
                    lVar2 = null;
                } else {
                    lVar2 = lVar;
                }
                if (i20 != 0) {
                    interfaceC0079c2 = null;
                } else {
                    interfaceC0079c2 = interfaceC0079c;
                }
                if (i22 != 0) {
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
                }
                androidx.compose.foundation.gestures.n nVar5 = androidx.compose.foundation.gestures.n.f5788a;
                androidx.compose.foundation.f0 f0VarB5 = nVar5.b(pVarF, 6);
                int i2112 = i13 >> 3;
                int i2113 = i2112 & 14;
                o oVarA5 = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i2113);
                int i2114 = i13;
                androidx.compose.foundation.lazy.layout.q qVarA5 = LazySemanticsKt.a(state, oVarA5, z10, z11, pVarF, (i2112 & bb.c.g.f32954lc) | i2113 | (i2112 & bb.c.b.f30796me));
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = new i();
                    pVarF.N(objU);
                }
                pVarF.c0();
                i iVar5 = (i) objU;
                pVarF.T(773894976);
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    androidx.compose.runtime.x xVar5 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                    pVarF.N(xVar5);
                    objU2 = xVar5;
                }
                pVarF.c0();
                coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
                pVarF.c0();
                Boolean boolValueOf5 = Boolean.valueOf(z11);
                pVarF.T(511388516);
                zS = pVarF.s(boolValueOf5) | pVarF.s(state);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                } else {
                    objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                    pVarF.N(objU3);
                }
                pVarF.c0();
                LazyListItemPlacementAnimator lazyListItemPlacementAnimator5 = (LazyListItemPlacementAnimator) objU3;
                state.E(lazyListItemPlacementAnimator5);
                int i2115 = i2114 & 112;
                int i38 = androidx.compose.runtime.collection.e.f12643e;
                int i39 = i2114 << 6;
                yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF6 = f(oVarA5, state, iVar5, f0VarB5, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator5, pVarF, (i38 << 6) | i2115 | (i39 & 57344) | (i39 & 458752) | (i39 & 3670016) | (i2114 & 29360128) | (i2112 & 234881024) | (1879048192 & (i25 << 27)), ((i2114 >> 24) & 14) | 64, 0);
                pVar2 = pVarF;
                b(oVarA5, state, pVar2, i2115);
                if (z11) {
                    orientation = Orientation.Vertical;
                } else {
                    orientation = Orientation.Horizontal;
                }
                Orientation orientation6 = orientation;
                LazyLayoutKt.a(oVarA5, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA5, qVarA5, orientation6, z12, pVar2, (i2114 >> 6) & 57344), orientation6), state, iVar5, z10, orientation6, pVar2, (i38 << 6) | i2115 | (i2114 & bb.c.g.f32954lc)), state, iVar5, pVar2, i2115 | (i38 << 6)), f0VarB5), state, orientation6, f0VarB5, z12, nVar5.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation6, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF6, pVar2, 0, 0);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                bVar3 = bVar2;
                lVar3 = lVar2;
                interfaceC0079c3 = interfaceC0079c2;
            }
            u1VarH = pVar2.H();
            if (u1VarH == null) {
                return;
            }
            final Arrangement.d dVar5 = dVar2;
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i310) {
                    LazyListKt.a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, bVar3, lVar3, interfaceC0079c3, dVar5, content, pVar3, i10 | 1, i11, i12);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i13 |= 1572864;
        i16 = i12 & 128;
        if (i16 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (pVarF.s(bVar)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i13 |= i17;
        }
        i18 = i12 & 256;
        if (i18 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (pVarF.s(lVar)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i13 |= i19;
        }
        i20 = i12 & 512;
        if (i20 != 0) {
            i13 |= com.google.android.exoplayer2.j.G;
        } else if ((i10 & 1879048192) == 0) {
            if (pVarF.s(interfaceC0079c)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i13 |= i21;
        }
        i22 = i12 & 1024;
        if (i22 != 0) {
            i23 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (pVarF.s(dVar)) {
                i24 = 4;
            } else {
                i24 = 2;
            }
            i23 = i11 | i24;
        } else {
            i23 = i11;
        }
        if ((i12 & 2048) != 0) {
            i23 |= 48;
        } else if ((i11 & 112) == 0) {
            i23 |= pVarF.s(content) ? 32 : 16;
        }
        i25 = i23;
        if ((i13 & 1533916891) != 306783378) {
            if (i16 != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            if (i18 != 0) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (i20 != 0) {
                interfaceC0079c2 = null;
            } else {
                interfaceC0079c2 = interfaceC0079c;
            }
            if (i22 != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
            }
            androidx.compose.foundation.gestures.n nVar6 = androidx.compose.foundation.gestures.n.f5788a;
            androidx.compose.foundation.f0 f0VarB6 = nVar6.b(pVarF, 6);
            int i2116 = i13 >> 3;
            int i2117 = i2116 & 14;
            o oVarA6 = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i2117);
            int i2118 = i13;
            androidx.compose.foundation.lazy.layout.q qVarA6 = LazySemanticsKt.a(state, oVarA6, z10, z11, pVarF, (i2116 & bb.c.g.f32954lc) | i2117 | (i2116 & bb.c.b.f30796me));
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new i();
                pVarF.N(objU);
            }
            pVarF.c0();
            i iVar6 = (i) objU;
            pVarF.T(773894976);
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                androidx.compose.runtime.x xVar6 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                pVarF.N(xVar6);
                objU2 = xVar6;
            }
            pVarF.c0();
            coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
            pVarF.c0();
            Boolean boolValueOf6 = Boolean.valueOf(z11);
            pVarF.T(511388516);
            zS = pVarF.s(boolValueOf6) | pVarF.s(state);
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU3);
            } else {
                objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU3);
            }
            pVarF.c0();
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator6 = (LazyListItemPlacementAnimator) objU3;
            state.E(lazyListItemPlacementAnimator6);
            int i2119 = i2118 & 112;
            int i310 = androidx.compose.runtime.collection.e.f12643e;
            int i311 = i2118 << 6;
            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF7 = f(oVarA6, state, iVar6, f0VarB6, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator6, pVarF, (i310 << 6) | i2119 | (i311 & 57344) | (i311 & 458752) | (i311 & 3670016) | (i2118 & 29360128) | (i2116 & 234881024) | (1879048192 & (i25 << 27)), ((i2118 >> 24) & 14) | 64, 0);
            pVar2 = pVarF;
            b(oVarA6, state, pVar2, i2119);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation7 = orientation;
            LazyLayoutKt.a(oVarA6, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA6, qVarA6, orientation7, z12, pVar2, (i2118 >> 6) & 57344), orientation7), state, iVar6, z10, orientation7, pVar2, (i310 << 6) | i2119 | (i2118 & bb.c.g.f32954lc)), state, iVar6, pVar2, i2119 | (i310 << 6)), f0VarB6), state, orientation7, f0VarB6, z12, nVar6.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation7, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF7, pVar2, 0, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            bVar3 = bVar2;
            lVar3 = lVar2;
            interfaceC0079c3 = interfaceC0079c2;
        } else {
            if (i16 != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            if (i18 != 0) {
                lVar2 = null;
            } else {
                lVar2 = lVar;
            }
            if (i20 != 0) {
                interfaceC0079c2 = null;
            } else {
                interfaceC0079c2 = interfaceC0079c;
            }
            if (i22 != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(955299798, i13, i25, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:50)");
            }
            androidx.compose.foundation.gestures.n nVar7 = androidx.compose.foundation.gestures.n.f5788a;
            androidx.compose.foundation.f0 f0VarB7 = nVar7.b(pVarF, 6);
            int i21110 = i13 >> 3;
            int i21111 = i21110 & 14;
            o oVarA7 = LazyListItemProviderKt.a(state, content, pVarF, (i25 & 112) | i21111);
            int i21112 = i13;
            androidx.compose.foundation.lazy.layout.q qVarA7 = LazySemanticsKt.a(state, oVarA7, z10, z11, pVarF, (i21110 & bb.c.g.f32954lc) | i21111 | (i21110 & bb.c.b.f30796me));
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            if (objU == companion.a()) {
                objU = new i();
                pVarF.N(objU);
            }
            pVarF.c0();
            i iVar7 = (i) objU;
            pVarF.T(773894976);
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                androidx.compose.runtime.x xVar7 = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVarF));
                pVarF.N(xVar7);
                objU2 = xVar7;
            }
            pVarF.c0();
            coroutineScope = ((androidx.compose.runtime.x) objU2).getCoroutineScope();
            pVarF.c0();
            Boolean boolValueOf7 = Boolean.valueOf(z11);
            pVarF.T(511388516);
            zS = pVarF.s(boolValueOf7) | pVarF.s(state);
            objU3 = pVarF.U();
            if (zS) {
                objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU3);
            } else {
                objU3 = new LazyListItemPlacementAnimator(coroutineScope, z11);
                pVarF.N(objU3);
            }
            pVarF.c0();
            LazyListItemPlacementAnimator lazyListItemPlacementAnimator7 = (LazyListItemPlacementAnimator) objU3;
            state.E(lazyListItemPlacementAnimator7);
            int i21113 = i21112 & 112;
            int i312 = androidx.compose.runtime.collection.e.f12643e;
            int i313 = i21112 << 6;
            yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVarF8 = f(oVarA7, state, iVar7, f0VarB7, contentPadding, z10, z11, bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator7, pVarF, (i312 << 6) | i21113 | (i313 & 57344) | (i313 & 458752) | (i313 & 3670016) | (i21112 & 29360128) | (i21110 & 234881024) | (1879048192 & (i25 << 27)), ((i21112 >> 24) & 14) | 64, 0);
            pVar2 = pVarF;
            b(oVarA7, state, pVar2, i21113);
            if (z11) {
                orientation = Orientation.Vertical;
            } else {
                orientation = Orientation.Horizontal;
            }
            Orientation orientation8 = orientation;
            LazyLayoutKt.a(oVarA7, ScrollableKt.i(g0.a(t.a(e.b(androidx.compose.foundation.j.a(LazyLayoutSemanticsKt.a(modifier.s0(state.getRemeasurementModifier()).s0(state.getAwaitLayoutModifier()), oVarA7, qVarA7, orientation8, z12, pVar2, (i21112 >> 6) & 57344), orientation8), state, iVar7, z10, orientation8, pVar2, (i312 << 6) | i21113 | (i21112 & bb.c.g.f32954lc)), state, iVar7, pVar2, i21113 | (i312 << 6)), f0VarB7), state, orientation8, f0VarB7, z12, nVar7.c((LayoutDirection) pVar2.K(CompositionLocalsKt.p()), orientation8, z10), flingBehavior, state.getInternalInteractionSource()), state.getPrefetchState(), pVarF8, pVar2, 0, 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            bVar3 = bVar2;
            lVar3 = lVar2;
            interfaceC0079c3 = interfaceC0079c2;
        }
        u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        final Arrangement.d dVar6 = dVar2;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListKt$LazyList$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i314) {
                LazyListKt.a(modifier, state, contentPadding, z10, z11, flingBehavior, z12, bVar3, lVar3, interfaceC0079c3, dVar6, content, pVar3, i10 | 1, i11, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.foundation.t
    @androidx.compose.runtime.h
    public static final void b(final o oVar, final LazyListState lazyListState, androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVarF = pVar.F(3173830);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(oVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(lazyListState) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(3173830, i10, -1, "androidx.compose.foundation.lazy.ScrollPositionUpdater (LazyList.kt:141)");
            }
            if (oVar.a() > 0) {
                lazyListState.J(oVar);
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.LazyListKt$ScrollPositionUpdater$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                LazyListKt.b(oVar, lazyListState, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(androidx.compose.foundation.f0 f0Var, r rVar) {
        boolean canScrollForward = rVar.getCanScrollForward();
        y firstVisibleItem = rVar.getFirstVisibleItem();
        f0Var.setEnabled(canScrollForward || ((firstVisibleItem != null ? firstVisibleItem.getIndex() : 0) != 0 || rVar.getFirstVisibleItemScrollOffset() != 0));
    }

    @androidx.compose.foundation.t
    @androidx.compose.runtime.h
    private static final yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> f(final o oVar, final LazyListState lazyListState, final i iVar, final androidx.compose.foundation.f0 f0Var, final m0 m0Var, final boolean z10, final boolean z11, androidx.compose.ui.c.b bVar, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, Arrangement.d dVar, Arrangement.l lVar, final LazyListItemPlacementAnimator lazyListItemPlacementAnimator, androidx.compose.runtime.p pVar, int i10, int i11, int i12) {
        pVar.T(-1404987696);
        final androidx.compose.ui.c.b bVar2 = (i12 & 128) != 0 ? null : bVar;
        final androidx.compose.ui.c.InterfaceC0079c interfaceC0079c2 = (i12 & 256) != 0 ? null : interfaceC0079c;
        final Arrangement.d dVar2 = (i12 & 512) != 0 ? null : dVar;
        final Arrangement.l lVar2 = (i12 & 1024) != 0 ? null : lVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1404987696, i10, i11, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:152)");
        }
        Object[] objArr = {lazyListState, iVar, f0Var, m0Var, Boolean.valueOf(z10), Boolean.valueOf(z11), bVar2, interfaceC0079c2, dVar2, lVar2, lazyListItemPlacementAnimator};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i13 = 0; i13 < 11; i13++) {
            zS |= pVar.s(objArr[i13]);
        }
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, r>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1

                /* JADX INFO: compiled from: LazyList.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                public static final class a implements b0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ int f6562a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ int f6563b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.foundation.lazy.layout.m f6564c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ boolean f6565d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.c.b f6566e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ androidx.compose.ui.c.InterfaceC0079c f6567f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ boolean f6568g;

                    /* JADX INFO: renamed from: h, reason: collision with root package name */
                    final /* synthetic */ int f6569h;

                    /* JADX INFO: renamed from: i, reason: collision with root package name */
                    final /* synthetic */ int f6570i;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    final /* synthetic */ LazyListItemPlacementAnimator f6571j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    final /* synthetic */ long f6572k;

                    a(int i10, int i11, androidx.compose.foundation.lazy.layout.m mVar, boolean z10, androidx.compose.ui.c.b bVar, androidx.compose.ui.c.InterfaceC0079c interfaceC0079c, boolean z11, int i12, int i13, LazyListItemPlacementAnimator lazyListItemPlacementAnimator, long j10) {
                        this.f6562a = i10;
                        this.f6563b = i11;
                        this.f6564c = mVar;
                        this.f6565d = z10;
                        this.f6566e = bVar;
                        this.f6567f = interfaceC0079c;
                        this.f6568g = z11;
                        this.f6569h = i12;
                        this.f6570i = i13;
                        this.f6571j = lazyListItemPlacementAnimator;
                        this.f6572k = j10;
                    }

                    @Override // androidx.compose.foundation.lazy.b0
                    @dl.d
                    public final y a(int i10, @dl.d Object key, @dl.d List<? extends e1> placeables) {
                        f0.p(key, "key");
                        f0.p(placeables, "placeables");
                        return new y(i10, placeables, this.f6565d, this.f6566e, this.f6567f, this.f6564c.getLayoutDirection(), this.f6568g, this.f6569h, this.f6570i, this.f6571j, i10 == this.f6562a + (-1) ? 0 : this.f6563b, this.f6572k, key, null);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @dl.d
                public final r a(@dl.d final androidx.compose.foundation.lazy.layout.m mVar, final long j10) {
                    int i14;
                    float spacing;
                    long jA;
                    f0.p(mVar, "$this$null");
                    androidx.compose.foundation.i.a(j10, z11 ? Orientation.Vertical : Orientation.Horizontal);
                    int iE1 = z11 ? mVar.e1(m0Var.b(mVar.getLayoutDirection())) : mVar.e1(PaddingKt.i(m0Var, mVar.getLayoutDirection()));
                    int iE2 = z11 ? mVar.e1(m0Var.c(mVar.getLayoutDirection())) : mVar.e1(PaddingKt.h(m0Var, mVar.getLayoutDirection()));
                    int iE3 = mVar.e1(m0Var.getTop());
                    int iE4 = mVar.e1(m0Var.getBottom());
                    final int i15 = iE3 + iE4;
                    final int i16 = iE1 + iE2;
                    boolean z12 = z11;
                    int i17 = z12 ? i15 : i16;
                    if (z12 && !z10) {
                        i14 = iE3;
                    } else if (z12 && z10) {
                        i14 = iE4;
                    } else {
                        i14 = (z12 || z10) ? iE2 : iE1;
                    }
                    int i18 = i17 - i14;
                    long jI = s1.c.i(j10, -i16, -i15);
                    lazyListState.J(oVar);
                    lazyListState.D(mVar);
                    oVar.getItemScope().e(s1.b.p(jI), s1.b.o(jI));
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
                    int iA = oVar.a();
                    int iO = z11 ? s1.b.o(j10) - i15 : s1.b.p(j10) - i16;
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
                    boolean z14 = z11;
                    z zVar = new z(jI, z14, oVar, mVar, new a(iA, iE5, mVar, z14, bVar2, interfaceC0079c2, z10, i14, i18, lazyListItemPlacementAnimator, jA), null);
                    lazyListState.G(zVar.getChildConstraints());
                    androidx.compose.runtime.snapshots.f.Companion companion = androidx.compose.runtime.snapshots.f.INSTANCE;
                    LazyListState lazyListState2 = lazyListState;
                    androidx.compose.runtime.snapshots.f fVarA = companion.a();
                    try {
                        androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
                        try {
                            int iC = b.c(lazyListState2.m());
                            int iN = lazyListState2.n();
                            b2 b2Var = b2.f124493a;
                            fVarA.w(fVarP);
                            fVarA.d();
                            r rVarC = LazyListMeasureKt.c(iA, zVar, iO, i14, i18, iE5, iC, iN, lazyListState.getScrollToBeConsumed(), jI, z11, oVar.i(), lVar2, dVar2, z10, mVar, lazyListItemPlacementAnimator, iVar, new yh.q<Integer, Integer, yh.l<? super e1.a, ? extends b2>, j0>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @dl.d
                                public final j0 a(int i19, int i20, @dl.d yh.l<? super e1.a, b2> placement) {
                                    f0.p(placement, "placement");
                                    return mVar.p1(s1.c.g(j10, i19 + i16), s1.c.f(j10, i20 + i15), s0.z(), placement);
                                }

                                @Override // yh.q
                                public /* bridge */ /* synthetic */ j0 invoke(Integer num, Integer num2, yh.l<? super e1.a, ? extends b2> lVar4) {
                                    return a(num.intValue(), num2.intValue(), lVar4);
                                }
                            });
                            LazyListState lazyListState3 = lazyListState;
                            androidx.compose.foundation.f0 f0Var2 = f0Var;
                            lazyListState3.h(rVarC);
                            LazyListKt.e(f0Var2, rVarC);
                            return rVarC;
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
                public /* bridge */ /* synthetic */ r invoke(androidx.compose.foundation.lazy.layout.m mVar, s1.b bVar3) {
                    return a(mVar, bVar3.getF139216a());
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, j0> pVar2 = (yh.p) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return pVar2;
    }
}
