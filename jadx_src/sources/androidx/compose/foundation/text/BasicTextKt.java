package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b2;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BasicText.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001ae\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a{\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00122\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00140\u0013H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"", "text", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/text/q0;", "style", "Lkotlin/Function1;", "Landroidx/compose/ui/text/i0;", "Lkotlin/b2;", "onTextLayout", "Landroidx/compose/ui/text/style/q;", "overflow", "", "softWrap", "", "maxLines", "b", "(Ljava/lang/String;Landroidx/compose/ui/n;Landroidx/compose/ui/text/q0;Lyh/l;IZILandroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/text/d;", "", "Landroidx/compose/foundation/text/a;", "inlineContent", ak.av, "(Landroidx/compose/ui/text/d;Landroidx/compose/ui/n;Landroidx/compose/ui/text/q0;Lyh/l;IZILjava/util/Map;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/foundation/text/selection/o;", "selectionRegistrar", "Landroidx/compose/runtime/saveable/e;", "", ak.aF, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class BasicTextKt {
    /* JADX WARN: Code duplicated, block: B:100:0x0134  */
    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0140  */
    /* JADX WARN: Code duplicated, block: B:105:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x0147  */
    /* JADX WARN: Code duplicated, block: B:109:0x0150  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:113:0x015a  */
    /* JADX WARN: Code duplicated, block: B:115:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x018d  */
    /* JADX WARN: Code duplicated, block: B:123:0x018f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0193  */
    /* JADX WARN: Code duplicated, block: B:127:0x01df  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:131:0x0227  */
    /* JADX WARN: Code duplicated, block: B:132:0x0269  */
    /* JADX WARN: Code duplicated, block: B:135:0x0286  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:142:0x030e  */
    /* JADX WARN: Code duplicated, block: B:145:0x031a  */
    /* JADX WARN: Code duplicated, block: B:146:0x031e  */
    /* JADX WARN: Code duplicated, block: B:149:0x0372  */
    /* JADX WARN: Code duplicated, block: B:154:0x0387  */
    /* JADX WARN: Code duplicated, block: B:156:0x0397  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x004e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:88:0x0109  */
    /* JADX WARN: Code duplicated, block: B:90:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final androidx.compose.ui.text.d text, @dl.e androidx.compose.ui.n nVar, @dl.e TextStyle textStyle, @dl.e yh.l<? super TextLayoutResult, b2> lVar, int i10, boolean z10, int i11, @dl.e Map<String, a> map, @dl.e androidx.compose.runtime.p pVar, final int i12, final int i13) {
        int i14;
        androidx.compose.ui.n nVar2;
        int i15;
        TextStyle textStyleA;
        int i16;
        int i17;
        yh.l<? super TextLayoutResult, b2> lVar2;
        int i18;
        int i19;
        int iA;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        androidx.compose.ui.n nVar3;
        yh.l<? super TextLayoutResult, b2> lVar3;
        boolean z11;
        int i26;
        androidx.compose.ui.n nVar4;
        int i27;
        yh.l<? super TextLayoutResult, b2> lVar4;
        boolean z12;
        int i28;
        int i29;
        TextStyle textStyle2;
        Map<String, a> mapZ;
        boolean z13;
        final androidx.compose.foundation.text.selection.o oVar;
        s1.e eVar;
        androidx.compose.ui.text.font.v.b bVar;
        List<androidx.compose.ui.text.d.Range<Placeholder>> listA;
        final List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>> listB;
        long jLongValue;
        Object objU;
        long j10;
        boolean z14;
        TextController textController;
        TextState state;
        yh.p<androidx.compose.runtime.p, Integer, b2> pVarB;
        yh.a<ComposeUiNode> aVarA;
        final androidx.compose.ui.n nVar5;
        final yh.l<? super TextLayoutResult, b2> lVar5;
        final TextStyle textStyle3;
        final int i30;
        final boolean z15;
        final int i31;
        final Map<String, a> map2;
        u1 u1VarH;
        f0.p(text, "text");
        androidx.compose.runtime.p pVarF = pVar.F(-648605928);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (pVarF.s(text) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i32 = i13 & 2;
        if (i32 == 0) {
            if ((i12 & 112) == 0) {
                nVar2 = nVar;
                i14 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    textStyleA = textStyle;
                    if (pVarF.s(textStyleA)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & bb.c.g.f32954lc) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((57344 & i12) == 0) {
                            iA = i10;
                            if (pVarF.y(iA)) {
                                i20 = 16384;
                            } else {
                                i20 = 8192;
                            }
                            i14 |= i20;
                        }
                        i21 = i13 & 32;
                        if (i21 != 0) {
                            i14 |= androidx.profileinstaller.o.c.f26824k;
                        } else if ((i12 & 458752) == 0) {
                            if (pVarF.u(z10)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i11)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                        i25 = i13 & 128;
                        if (i25 != 0) {
                            i14 |= 4194304;
                        }
                        if (i25 != 128 && (23967451 & i14) == 4793490 && pVarF.b()) {
                            pVarF.l();
                            z15 = z10;
                            map2 = map;
                            nVar5 = nVar2;
                            textStyle3 = textStyleA;
                            lVar5 = lVar2;
                            i30 = iA;
                            i31 = i11;
                        } else {
                            pVarF.W();
                            if ((i12 & 1) != 0 || pVarF.o()) {
                                if (i32 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i15 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                }
                                if (i17 != 0) {
                                    lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                        public final void a(@dl.d TextLayoutResult it) {
                                            f0.p(it, "it");
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                            a(textLayoutResult);
                                            return b2.f124493a;
                                        }
                                    };
                                } else {
                                    lVar3 = lVar;
                                }
                                if (i19 != 0) {
                                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i23 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i11;
                                }
                                if (i25 != 0) {
                                    nVar4 = nVar3;
                                    lVar4 = lVar3;
                                    z12 = z11;
                                    i28 = i26;
                                    i29 = iA;
                                    textStyle2 = textStyleA;
                                    mapZ = s0.z();
                                    i27 = i14 & (-29360129);
                                } else {
                                    nVar4 = nVar3;
                                    i27 = i14;
                                    lVar4 = lVar3;
                                    z12 = z11;
                                    i28 = i26;
                                }
                                pVarF.O();
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                                }
                                if (i28 > 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z13) {
                                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                                }
                                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                                long selectionBackgroundColor = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB = CoreTextKt.b(text, mapZ);
                                listA = pairB.a();
                                listB = pairB.b();
                                pVarF.T(959243020);
                                if (oVar == null) {
                                    jLongValue = 0;
                                } else {
                                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        @dl.d
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Long invoke() {
                                            return Long.valueOf(oVar.e());
                                        }
                                    }, pVarF, 72, 4)).longValue();
                                }
                                pVarF.c0();
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                j10 = jLongValue;
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    z14 = true;
                                    TextController textController2 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                                    pVarF.N(textController2);
                                    objU = textController2;
                                } else {
                                    z14 = true;
                                }
                                pVarF.c0();
                                textController = (TextController) objU;
                                state = textController.getState();
                                if (!pVarF.D()) {
                                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                                }
                                state.m(lVar4);
                                state.p(selectionBackgroundColor);
                                textController.p(oVar);
                                if (listB.isEmpty()) {
                                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                                } else {
                                    final int i33 = i27;
                                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                        @androidx.compose.runtime.h
                                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i34) {
                                            if ((i34 & 11) == 2 && pVar2.b()) {
                                                pVar2.l();
                                                return;
                                            }
                                            if (ComposerKt.g0()) {
                                                ComposerKt.w0(1892283635, i34, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                            }
                                            CoreTextKt.a(text, listB, pVar2, (i33 & 14) | 64);
                                            if (ComposerKt.g0()) {
                                                ComposerKt.v0();
                                            }
                                        }

                                        @Override // yh.p
                                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                            a(pVar2, num.intValue());
                                            return b2.f124493a;
                                        }
                                    });
                                }
                                androidx.compose.ui.n nVar6 = nVar4;
                                androidx.compose.ui.n nVarS0 = nVar6.s0(textController.j());
                                i0 measurePolicy = textController.getMeasurePolicy();
                                pVarF.T(-1323940314);
                                s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                                d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                aVarA = companion.a();
                                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarS0);
                                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVarF.h();
                                if (pVarF.D()) {
                                    pVarF.L(aVarA);
                                } else {
                                    pVarF.d();
                                }
                                pVarF.Y();
                                androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
                                Updater.j(pVarB2, measurePolicy, companion.d());
                                Updater.j(pVarB2, eVar2, companion.b());
                                Updater.j(pVarB2, layoutDirection, companion.c());
                                Updater.j(pVarB2, d2Var, companion.f());
                                pVarF.x();
                                qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                                pVarF.T(2058660585);
                                pVarB.invoke(pVarF, 0);
                                pVarF.c0();
                                pVarF.f();
                                pVarF.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                nVar5 = nVar6;
                                lVar5 = lVar4;
                                textStyle3 = textStyle2;
                                i30 = i29;
                                z15 = z12;
                                i31 = i28;
                                map2 = mapZ;
                            } else {
                                pVarF.l();
                                if (i25 != 0) {
                                    i14 &= -29360129;
                                }
                                lVar4 = lVar;
                                z12 = z10;
                                i28 = i11;
                                i27 = i14;
                                nVar4 = nVar2;
                            }
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                            pVarF.O();
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                            }
                            if (i28 > 0) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z13) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            long selectionBackgroundColor2 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                            Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB2 = CoreTextKt.b(text, mapZ);
                            listA = pairB2.a();
                            listB = pairB2.b();
                            pVarF.T(959243020);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            j10 = jLongValue;
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                z14 = true;
                                TextController textController3 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                                pVarF.N(textController3);
                                objU = textController3;
                            } else {
                                z14 = true;
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (!pVarF.D()) {
                                textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                            }
                            state.m(lVar4);
                            state.p(selectionBackgroundColor2);
                            textController.p(oVar);
                            if (listB.isEmpty()) {
                                pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                            } else {
                                final int i34 = i27;
                                pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(2);
                                    }

                                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                    @androidx.compose.runtime.h
                                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i35) {
                                        if ((i35 & 11) == 2 && pVar2.b()) {
                                            pVar2.l();
                                            return;
                                        }
                                        if (ComposerKt.g0()) {
                                            ComposerKt.w0(1892283635, i35, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                        }
                                        CoreTextKt.a(text, listB, pVar2, (i34 & 14) | 64);
                                        if (ComposerKt.g0()) {
                                            ComposerKt.v0();
                                        }
                                    }

                                    @Override // yh.p
                                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                        a(pVar2, num.intValue());
                                        return b2.f124493a;
                                    }
                                });
                            }
                            androidx.compose.ui.n nVar7 = nVar4;
                            androidx.compose.ui.n nVarS1 = nVar7.s0(textController.j());
                            i0 measurePolicy2 = textController.getMeasurePolicy();
                            pVarF.T(-1323940314);
                            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var2 = (d2) pVarF.K(CompositionLocalsKt.u());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            aVarA = companion2.a();
                            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF2 = LayoutKt.f(nVarS1);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(aVarA);
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                            Updater.j(pVarB3, measurePolicy2, companion2.d());
                            Updater.j(pVarB3, eVar3, companion2.b());
                            Updater.j(pVarB3, layoutDirection2, companion2.c());
                            Updater.j(pVarB3, d2Var2, companion2.f());
                            pVarF.x();
                            qVarF2.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                            pVarF.T(2058660585);
                            pVarB.invoke(pVarF, 0);
                            pVarF.c0();
                            pVarF.f();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar5 = nVar7;
                            lVar5 = lVar4;
                            textStyle3 = textStyle2;
                            i30 = i29;
                            z15 = z12;
                            i31 = i28;
                            map2 = mapZ;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i35) {
                                BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i14 |= 24576;
                    iA = i10;
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.u(z10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 4194304;
                    }
                    if (i25 != 128) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor3 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB3 = CoreTextKt.b(text, mapZ);
                        listA = pairB3.a();
                        listB = pairB3.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController4 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController4);
                            objU = textController4;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor3);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i35 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i36) {
                                    if ((i36 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i36, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i35 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar8 = nVar4;
                        androidx.compose.ui.n nVarS2 = nVar8.s0(textController.j());
                        i0 measurePolicy3 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var3 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        aVarA = companion3.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF3 = LayoutKt.f(nVarS2);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
                        Updater.j(pVarB4, measurePolicy3, companion3.d());
                        Updater.j(pVarB4, eVar4, companion3.b());
                        Updater.j(pVarB4, layoutDirection3, companion3.c());
                        Updater.j(pVarB4, d2Var3, companion3.f());
                        pVarF.x();
                        qVarF3.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar8;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor4 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB4 = CoreTextKt.b(text, mapZ);
                        listA = pairB4.a();
                        listB = pairB4.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController5 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController5);
                            objU = textController5;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor4);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i36 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i37) {
                                    if ((i37 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i37, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i36 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar9 = nVar4;
                        androidx.compose.ui.n nVarS3 = nVar9.s0(textController.j());
                        i0 measurePolicy4 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var4 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        aVarA = companion4.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF4 = LayoutKt.f(nVarS3);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB5 = Updater.b(pVarF);
                        Updater.j(pVarB5, measurePolicy4, companion4.d());
                        Updater.j(pVarB5, eVar5, companion4.b());
                        Updater.j(pVarB5, layoutDirection4, companion4.c());
                        Updater.j(pVarB5, d2Var4, companion4.f());
                        pVarF.x();
                        qVarF4.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar9;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i37) {
                            BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= bb.c.d.f31193dj;
                lVar2 = lVar;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        iA = i10;
                        if (pVarF.y(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.u(z10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 4194304;
                    }
                    if (i25 != 128) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor5 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB5 = CoreTextKt.b(text, mapZ);
                        listA = pairB5.a();
                        listB = pairB5.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController6 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController6);
                            objU = textController6;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor5);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i37 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i38) {
                                    if ((i38 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i38, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i37 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar10 = nVar4;
                        androidx.compose.ui.n nVarS4 = nVar10.s0(textController.j());
                        i0 measurePolicy5 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var5 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                        aVarA = companion5.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF5 = LayoutKt.f(nVarS4);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB6 = Updater.b(pVarF);
                        Updater.j(pVarB6, measurePolicy5, companion5.d());
                        Updater.j(pVarB6, eVar6, companion5.b());
                        Updater.j(pVarB6, layoutDirection5, companion5.c());
                        Updater.j(pVarB6, d2Var5, companion5.f());
                        pVarF.x();
                        qVarF5.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar10;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor6 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB6 = CoreTextKt.b(text, mapZ);
                        listA = pairB6.a();
                        listB = pairB6.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController7 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController7);
                            objU = textController7;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor6);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i38 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i39) {
                                    if ((i39 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i39, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i38 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar11 = nVar4;
                        androidx.compose.ui.n nVarS5 = nVar11.s0(textController.j());
                        i0 measurePolicy6 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var6 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        aVarA = companion6.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF6 = LayoutKt.f(nVarS5);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB7 = Updater.b(pVarF);
                        Updater.j(pVarB7, measurePolicy6, companion6.d());
                        Updater.j(pVarB7, eVar7, companion6.b());
                        Updater.j(pVarB7, layoutDirection6, companion6.c());
                        Updater.j(pVarB7, d2Var6, companion6.f());
                        pVarF.x();
                        qVarF6.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar11;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i39) {
                            BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 4194304;
                }
                if (i25 != 128) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor7 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB7 = CoreTextKt.b(text, mapZ);
                    listA = pairB7.a();
                    listB = pairB7.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController8 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController8);
                        objU = textController8;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor7);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i39 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i310) {
                                if ((i310 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i310, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i39 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar12 = nVar4;
                    androidx.compose.ui.n nVarS6 = nVar12.s0(textController.j());
                    i0 measurePolicy7 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar8 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var7 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                    aVarA = companion7.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF7 = LayoutKt.f(nVarS6);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB8 = Updater.b(pVarF);
                    Updater.j(pVarB8, measurePolicy7, companion7.d());
                    Updater.j(pVarB8, eVar8, companion7.b());
                    Updater.j(pVarB8, layoutDirection7, companion7.c());
                    Updater.j(pVarB8, d2Var7, companion7.f());
                    pVarF.x();
                    qVarF7.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar12;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor8 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB8 = CoreTextKt.b(text, mapZ);
                    listA = pairB8.a();
                    listB = pairB8.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController9 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController9);
                        objU = textController9;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor8);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i310 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311) {
                                if ((i311 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i311, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i310 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar13 = nVar4;
                    androidx.compose.ui.n nVarS7 = nVar13.s0(textController.j());
                    i0 measurePolicy8 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar9 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection8 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var8 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    aVarA = companion8.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF8 = LayoutKt.f(nVarS7);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB9 = Updater.b(pVarF);
                    Updater.j(pVarB9, measurePolicy8, companion8.d());
                    Updater.j(pVarB9, eVar9, companion8.b());
                    Updater.j(pVarB9, layoutDirection8, companion8.c());
                    Updater.j(pVarB9, d2Var8, companion8.f());
                    pVarF.x();
                    qVarF8.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar13;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311) {
                        BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.b.f30966u4;
            textStyleA = textStyle;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & bb.c.g.f32954lc) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        iA = i10;
                        if (pVarF.y(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.u(z10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 4194304;
                    }
                    if (i25 != 128) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor9 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB9 = CoreTextKt.b(text, mapZ);
                        listA = pairB9.a();
                        listB = pairB9.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController10 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController10);
                            objU = textController10;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor9);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i311 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i312) {
                                    if ((i312 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i312, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i311 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar14 = nVar4;
                        androidx.compose.ui.n nVarS8 = nVar14.s0(textController.j());
                        i0 measurePolicy9 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar10 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection9 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var9 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        aVarA = companion9.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF9 = LayoutKt.f(nVarS8);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB10 = Updater.b(pVarF);
                        Updater.j(pVarB10, measurePolicy9, companion9.d());
                        Updater.j(pVarB10, eVar10, companion9.b());
                        Updater.j(pVarB10, layoutDirection9, companion9.c());
                        Updater.j(pVarB10, d2Var9, companion9.f());
                        pVarF.x();
                        qVarF9.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar14;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor10 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB10 = CoreTextKt.b(text, mapZ);
                        listA = pairB10.a();
                        listB = pairB10.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController11 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController11);
                            objU = textController11;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor10);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i312 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i313) {
                                    if ((i313 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i313, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i312 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar15 = nVar4;
                        androidx.compose.ui.n nVarS9 = nVar15.s0(textController.j());
                        i0 measurePolicy10 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar11 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection10 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var10 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        aVarA = companion10.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF10 = LayoutKt.f(nVarS9);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB11 = Updater.b(pVarF);
                        Updater.j(pVarB11, measurePolicy10, companion10.d());
                        Updater.j(pVarB11, eVar11, companion10.b());
                        Updater.j(pVarB11, layoutDirection10, companion10.c());
                        Updater.j(pVarB11, d2Var10, companion10.f());
                        pVarF.x();
                        qVarF10.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar15;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i313) {
                            BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 4194304;
                }
                if (i25 != 128) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor11 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB11 = CoreTextKt.b(text, mapZ);
                    listA = pairB11.a();
                    listB = pairB11.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController12 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController12);
                        objU = textController12;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor11);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i313 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i314) {
                                if ((i314 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i314, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i313 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar16 = nVar4;
                    androidx.compose.ui.n nVarS10 = nVar16.s0(textController.j());
                    i0 measurePolicy11 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar12 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection11 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var11 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                    aVarA = companion11.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF11 = LayoutKt.f(nVarS10);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB12 = Updater.b(pVarF);
                    Updater.j(pVarB12, measurePolicy11, companion11.d());
                    Updater.j(pVarB12, eVar12, companion11.b());
                    Updater.j(pVarB12, layoutDirection11, companion11.c());
                    Updater.j(pVarB12, d2Var11, companion11.f());
                    pVarF.x();
                    qVarF11.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar16;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor12 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB12 = CoreTextKt.b(text, mapZ);
                    listA = pairB12.a();
                    listB = pairB12.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController13 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController13);
                        objU = textController13;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor12);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i314 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i315) {
                                if ((i315 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i315, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i314 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar17 = nVar4;
                    androidx.compose.ui.n nVarS11 = nVar17.s0(textController.j());
                    i0 measurePolicy12 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar13 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection12 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var12 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                    aVarA = companion12.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF12 = LayoutKt.f(nVarS11);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB13 = Updater.b(pVarF);
                    Updater.j(pVarB13, measurePolicy12, companion12.d());
                    Updater.j(pVarB13, eVar13, companion12.b());
                    Updater.j(pVarB13, layoutDirection12, companion12.c());
                    Updater.j(pVarB13, d2Var12, companion12.f());
                    pVarF.x();
                    qVarF12.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar17;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i315) {
                        BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            lVar2 = lVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    iA = i10;
                    if (pVarF.y(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 4194304;
                }
                if (i25 != 128) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor13 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB13 = CoreTextKt.b(text, mapZ);
                    listA = pairB13.a();
                    listB = pairB13.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController14 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController14);
                        objU = textController14;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor13);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i315 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i316) {
                                if ((i316 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i316, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i315 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar18 = nVar4;
                    androidx.compose.ui.n nVarS12 = nVar18.s0(textController.j());
                    i0 measurePolicy13 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar14 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection13 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var13 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                    aVarA = companion13.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF13 = LayoutKt.f(nVarS12);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB14 = Updater.b(pVarF);
                    Updater.j(pVarB14, measurePolicy13, companion13.d());
                    Updater.j(pVarB14, eVar14, companion13.b());
                    Updater.j(pVarB14, layoutDirection13, companion13.c());
                    Updater.j(pVarB14, d2Var13, companion13.f());
                    pVarF.x();
                    qVarF13.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar18;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor14 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB14 = CoreTextKt.b(text, mapZ);
                    listA = pairB14.a();
                    listB = pairB14.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController15 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController15);
                        objU = textController15;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor14);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i316 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i317) {
                                if ((i317 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i317, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i316 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar19 = nVar4;
                    androidx.compose.ui.n nVarS13 = nVar19.s0(textController.j());
                    i0 measurePolicy14 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar15 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection14 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var14 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    aVarA = companion14.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF14 = LayoutKt.f(nVarS13);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB15 = Updater.b(pVarF);
                    Updater.j(pVarB15, measurePolicy14, companion14.d());
                    Updater.j(pVarB15, eVar15, companion14.b());
                    Updater.j(pVarB15, layoutDirection14, companion14.c());
                    Updater.j(pVarB15, d2Var14, companion14.f());
                    pVarF.x();
                    qVarF14.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar19;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i317) {
                        BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 4194304;
            }
            if (i25 != 128) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor15 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB15 = CoreTextKt.b(text, mapZ);
                listA = pairB15.a();
                listB = pairB15.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController16 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController16);
                    objU = textController16;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor15);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i317 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i318) {
                            if ((i318 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i318, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i317 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar110 = nVar4;
                androidx.compose.ui.n nVarS14 = nVar110.s0(textController.j());
                i0 measurePolicy15 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar16 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection15 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var15 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                aVarA = companion15.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF15 = LayoutKt.f(nVarS14);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB16 = Updater.b(pVarF);
                Updater.j(pVarB16, measurePolicy15, companion15.d());
                Updater.j(pVarB16, eVar16, companion15.b());
                Updater.j(pVarB16, layoutDirection15, companion15.c());
                Updater.j(pVarB16, d2Var15, companion15.f());
                pVarF.x();
                qVarF15.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar110;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor16 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB16 = CoreTextKt.b(text, mapZ);
                listA = pairB16.a();
                listB = pairB16.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController17 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController17);
                    objU = textController17;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor16);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i318 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i319) {
                            if ((i319 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i319, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i318 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar111 = nVar4;
                androidx.compose.ui.n nVarS15 = nVar111.s0(textController.j());
                i0 measurePolicy16 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar17 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection16 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var16 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                aVarA = companion16.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF16 = LayoutKt.f(nVarS15);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB17 = Updater.b(pVarF);
                Updater.j(pVarB17, measurePolicy16, companion16.d());
                Updater.j(pVarB17, eVar17, companion16.b());
                Updater.j(pVarB17, layoutDirection16, companion16.c());
                Updater.j(pVarB17, d2Var16, companion16.f());
                pVarF.x();
                qVarF16.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar111;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i319) {
                    BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= 48;
        nVar2 = nVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                textStyleA = textStyle;
                if (pVarF.s(textStyleA)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & bb.c.g.f32954lc) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        iA = i10;
                        if (pVarF.y(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= androidx.profileinstaller.o.c.f26824k;
                    } else if ((i12 & 458752) == 0) {
                        if (pVarF.u(z10)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 4194304;
                    }
                    if (i25 != 128) {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor17 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB17 = CoreTextKt.b(text, mapZ);
                        listA = pairB17.a();
                        listB = pairB17.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController18 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController18);
                            objU = textController18;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor17);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i319 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3110) {
                                    if ((i3110 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i3110, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i319 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar112 = nVar4;
                        androidx.compose.ui.n nVarS16 = nVar112.s0(textController.j());
                        i0 measurePolicy17 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar18 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection17 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var17 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                        aVarA = companion17.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF17 = LayoutKt.f(nVarS16);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB18 = Updater.b(pVarF);
                        Updater.j(pVarB18, measurePolicy17, companion17.d());
                        Updater.j(pVarB18, eVar18, companion17.b());
                        Updater.j(pVarB18, layoutDirection17, companion17.c());
                        Updater.j(pVarB18, d2Var17, companion17.f());
                        pVarF.x();
                        qVarF17.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar112;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    } else {
                        pVarF.W();
                        if ((i12 & 1) != 0) {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        } else {
                            if (i32 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            }
                            if (i17 != 0) {
                                lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            } else {
                                lVar3 = lVar;
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i11;
                            }
                            if (i25 != 0) {
                                nVar4 = nVar3;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = s0.z();
                                i27 = i14 & (-29360129);
                            } else {
                                nVar4 = nVar3;
                                i27 = i14;
                                lVar4 = lVar3;
                                z12 = z11;
                                i28 = i26;
                                i29 = iA;
                                textStyle2 = textStyleA;
                                mapZ = map;
                            }
                        }
                        pVarF.O();
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                        }
                        if (i28 > 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        long selectionBackgroundColor18 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                        Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB18 = CoreTextKt.b(text, mapZ);
                        listA = pairB18.a();
                        listB = pairB18.b();
                        pVarF.T(959243020);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        j10 = jLongValue;
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            z14 = true;
                            TextController textController19 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                            pVarF.N(textController19);
                            objU = textController19;
                        } else {
                            z14 = true;
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (!pVarF.D()) {
                            textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                        }
                        state.m(lVar4);
                        state.p(selectionBackgroundColor18);
                        textController.p(oVar);
                        if (listB.isEmpty()) {
                            pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                        } else {
                            final int i3110 = i27;
                            pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                                @androidx.compose.runtime.h
                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111) {
                                    if ((i3111 & 11) == 2 && pVar2.b()) {
                                        pVar2.l();
                                        return;
                                    }
                                    if (ComposerKt.g0()) {
                                        ComposerKt.w0(1892283635, i3111, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                    }
                                    CoreTextKt.a(text, listB, pVar2, (i3110 & 14) | 64);
                                    if (ComposerKt.g0()) {
                                        ComposerKt.v0();
                                    }
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        androidx.compose.ui.n nVar113 = nVar4;
                        androidx.compose.ui.n nVarS17 = nVar113.s0(textController.j());
                        i0 measurePolicy18 = textController.getMeasurePolicy();
                        pVarF.T(-1323940314);
                        s1.e eVar19 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection18 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var18 = (d2) pVarF.K(CompositionLocalsKt.u());
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        aVarA = companion18.a();
                        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF18 = LayoutKt.f(nVarS17);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(aVarA);
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB19 = Updater.b(pVarF);
                        Updater.j(pVarB19, measurePolicy18, companion18.d());
                        Updater.j(pVarB19, eVar19, companion18.b());
                        Updater.j(pVarB19, layoutDirection18, companion18.c());
                        Updater.j(pVarB19, d2Var18, companion18.f());
                        pVarF.x();
                        qVarF18.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                        pVarF.T(2058660585);
                        pVarB.invoke(pVarF, 0);
                        pVarF.c0();
                        pVarF.f();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar5 = nVar113;
                        lVar5 = lVar4;
                        textStyle3 = textStyle2;
                        i30 = i29;
                        z15 = z12;
                        i31 = i28;
                        map2 = mapZ;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111) {
                            BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 4194304;
                }
                if (i25 != 128) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor19 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB19 = CoreTextKt.b(text, mapZ);
                    listA = pairB19.a();
                    listB = pairB19.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController110 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController110);
                        objU = textController110;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor19);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i3111 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3112) {
                                if ((i3112 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i3112, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i3111 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar114 = nVar4;
                    androidx.compose.ui.n nVarS18 = nVar114.s0(textController.j());
                    i0 measurePolicy19 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection19 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var19 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                    aVarA = companion19.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF19 = LayoutKt.f(nVarS18);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB110 = Updater.b(pVarF);
                    Updater.j(pVarB110, measurePolicy19, companion19.d());
                    Updater.j(pVarB110, eVar110, companion19.b());
                    Updater.j(pVarB110, layoutDirection19, companion19.c());
                    Updater.j(pVarB110, d2Var19, companion19.f());
                    pVarF.x();
                    qVarF19.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar114;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor110 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB110 = CoreTextKt.b(text, mapZ);
                    listA = pairB110.a();
                    listB = pairB110.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController111 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController111);
                        objU = textController111;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor110);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i3112 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3113) {
                                if ((i3113 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i3113, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i3112 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar115 = nVar4;
                    androidx.compose.ui.n nVarS19 = nVar115.s0(textController.j());
                    i0 measurePolicy110 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var110 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                    aVarA = companion110.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF110 = LayoutKt.f(nVarS19);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111 = Updater.b(pVarF);
                    Updater.j(pVarB111, measurePolicy110, companion110.d());
                    Updater.j(pVarB111, eVar111, companion110.b());
                    Updater.j(pVarB111, layoutDirection110, companion110.c());
                    Updater.j(pVarB111, d2Var110, companion110.f());
                    pVarF.x();
                    qVarF110.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar115;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3113) {
                        BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            lVar2 = lVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    iA = i10;
                    if (pVarF.y(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 4194304;
                }
                if (i25 != 128) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor111 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB111 = CoreTextKt.b(text, mapZ);
                    listA = pairB111.a();
                    listB = pairB111.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController112 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController112);
                        objU = textController112;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor111);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i3113 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3114) {
                                if ((i3114 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i3114, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i3113 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar116 = nVar4;
                    androidx.compose.ui.n nVarS110 = nVar116.s0(textController.j());
                    i0 measurePolicy111 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                    aVarA = companion111.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF111 = LayoutKt.f(nVarS110);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB112 = Updater.b(pVarF);
                    Updater.j(pVarB112, measurePolicy111, companion111.d());
                    Updater.j(pVarB112, eVar112, companion111.b());
                    Updater.j(pVarB112, layoutDirection111, companion111.c());
                    Updater.j(pVarB112, d2Var111, companion111.f());
                    pVarF.x();
                    qVarF111.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar116;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor112 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB112 = CoreTextKt.b(text, mapZ);
                    listA = pairB112.a();
                    listB = pairB112.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController113 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController113);
                        objU = textController113;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor112);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i3114 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3115) {
                                if ((i3115 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i3115, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i3114 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar117 = nVar4;
                    androidx.compose.ui.n nVarS111 = nVar117.s0(textController.j());
                    i0 measurePolicy112 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var112 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    aVarA = companion112.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF112 = LayoutKt.f(nVarS111);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB113 = Updater.b(pVarF);
                    Updater.j(pVarB113, measurePolicy112, companion112.d());
                    Updater.j(pVarB113, eVar113, companion112.b());
                    Updater.j(pVarB113, layoutDirection112, companion112.c());
                    Updater.j(pVarB113, d2Var112, companion112.f());
                    pVarF.x();
                    qVarF112.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar117;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3115) {
                        BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 4194304;
            }
            if (i25 != 128) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor113 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB113 = CoreTextKt.b(text, mapZ);
                listA = pairB113.a();
                listB = pairB113.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController114 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController114);
                    objU = textController114;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor113);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i3115 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3116) {
                            if ((i3116 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i3116, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i3115 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar118 = nVar4;
                androidx.compose.ui.n nVarS112 = nVar118.s0(textController.j());
                i0 measurePolicy113 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var113 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                aVarA = companion113.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF113 = LayoutKt.f(nVarS112);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB114 = Updater.b(pVarF);
                Updater.j(pVarB114, measurePolicy113, companion113.d());
                Updater.j(pVarB114, eVar114, companion113.b());
                Updater.j(pVarB114, layoutDirection113, companion113.c());
                Updater.j(pVarB114, d2Var113, companion113.f());
                pVarF.x();
                qVarF113.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar118;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor114 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB114 = CoreTextKt.b(text, mapZ);
                listA = pairB114.a();
                listB = pairB114.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController115 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController115);
                    objU = textController115;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor114);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i3116 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3117) {
                            if ((i3117 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i3117, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i3116 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar119 = nVar4;
                androidx.compose.ui.n nVarS113 = nVar119.s0(textController.j());
                i0 measurePolicy114 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection114 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var114 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                aVarA = companion114.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF114 = LayoutKt.f(nVarS113);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB115 = Updater.b(pVarF);
                Updater.j(pVarB115, measurePolicy114, companion114.d());
                Updater.j(pVarB115, eVar115, companion114.b());
                Updater.j(pVarB115, layoutDirection114, companion114.c());
                Updater.j(pVarB115, d2Var114, companion114.f());
                pVarF.x();
                qVarF114.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar119;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3117) {
                    BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        textStyleA = textStyle;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & bb.c.g.f32954lc) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    iA = i10;
                    if (pVarF.y(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                } else if ((i12 & 458752) == 0) {
                    if (pVarF.u(z10)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 4194304;
                }
                if (i25 != 128) {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor115 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB115 = CoreTextKt.b(text, mapZ);
                    listA = pairB115.a();
                    listB = pairB115.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController116 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController116);
                        objU = textController116;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor115);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i3117 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3118) {
                                if ((i3118 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i3118, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i3117 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar1110 = nVar4;
                    androidx.compose.ui.n nVarS114 = nVar1110.s0(textController.j());
                    i0 measurePolicy115 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection115 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var115 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                    aVarA = companion115.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF115 = LayoutKt.f(nVarS114);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB116 = Updater.b(pVarF);
                    Updater.j(pVarB116, measurePolicy115, companion115.d());
                    Updater.j(pVarB116, eVar116, companion115.b());
                    Updater.j(pVarB116, layoutDirection115, companion115.c());
                    Updater.j(pVarB116, d2Var115, companion115.f());
                    pVarF.x();
                    qVarF115.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar1110;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                } else {
                    pVarF.W();
                    if ((i12 & 1) != 0) {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    } else {
                        if (i32 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        }
                        if (i17 != 0) {
                            lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        } else {
                            lVar3 = lVar;
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i11;
                        }
                        if (i25 != 0) {
                            nVar4 = nVar3;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = s0.z();
                            i27 = i14 & (-29360129);
                        } else {
                            nVar4 = nVar3;
                            i27 = i14;
                            lVar4 = lVar3;
                            z12 = z11;
                            i28 = i26;
                            i29 = iA;
                            textStyle2 = textStyleA;
                            mapZ = map;
                        }
                    }
                    pVarF.O();
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                    }
                    if (i28 > 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    long selectionBackgroundColor116 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                    Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB116 = CoreTextKt.b(text, mapZ);
                    listA = pairB116.a();
                    listB = pairB116.b();
                    pVarF.T(959243020);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    j10 = jLongValue;
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        z14 = true;
                        TextController textController117 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                        pVarF.N(textController117);
                        objU = textController117;
                    } else {
                        z14 = true;
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (!pVarF.D()) {
                        textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                    }
                    state.m(lVar4);
                    state.p(selectionBackgroundColor116);
                    textController.p(oVar);
                    if (listB.isEmpty()) {
                        pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                    } else {
                        final int i3118 = i27;
                        pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                            @androidx.compose.runtime.h
                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3119) {
                                if ((i3119 & 11) == 2 && pVar2.b()) {
                                    pVar2.l();
                                    return;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1892283635, i3119, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                                }
                                CoreTextKt.a(text, listB, pVar2, (i3118 & 14) | 64);
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    androidx.compose.ui.n nVar1111 = nVar4;
                    androidx.compose.ui.n nVarS115 = nVar1111.s0(textController.j());
                    i0 measurePolicy116 = textController.getMeasurePolicy();
                    pVarF.T(-1323940314);
                    s1.e eVar117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection116 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var116 = (d2) pVarF.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    aVarA = companion116.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF116 = LayoutKt.f(nVarS115);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(aVarA);
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB117 = Updater.b(pVarF);
                    Updater.j(pVarB117, measurePolicy116, companion116.d());
                    Updater.j(pVarB117, eVar117, companion116.b());
                    Updater.j(pVarB117, layoutDirection116, companion116.c());
                    Updater.j(pVarB117, d2Var116, companion116.f());
                    pVarF.x();
                    qVarF116.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                    pVarF.T(2058660585);
                    pVarB.invoke(pVarF, 0);
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar5 = nVar1111;
                    lVar5 = lVar4;
                    textStyle3 = textStyle2;
                    i30 = i29;
                    z15 = z12;
                    i31 = i28;
                    map2 = mapZ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3119) {
                        BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 4194304;
            }
            if (i25 != 128) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor117 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB117 = CoreTextKt.b(text, mapZ);
                listA = pairB117.a();
                listB = pairB117.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController118 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController118);
                    objU = textController118;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor117);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i3119 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31110) {
                            if ((i31110 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i31110, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i3119 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar1112 = nVar4;
                androidx.compose.ui.n nVarS116 = nVar1112.s0(textController.j());
                i0 measurePolicy117 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection117 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var117 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                aVarA = companion117.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF117 = LayoutKt.f(nVarS116);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB118 = Updater.b(pVarF);
                Updater.j(pVarB118, measurePolicy117, companion117.d());
                Updater.j(pVarB118, eVar118, companion117.b());
                Updater.j(pVarB118, layoutDirection117, companion117.c());
                Updater.j(pVarB118, d2Var117, companion117.f());
                pVarF.x();
                qVarF117.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar1112;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor118 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB118 = CoreTextKt.b(text, mapZ);
                listA = pairB118.a();
                listB = pairB118.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController119 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController119);
                    objU = textController119;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor118);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i31110 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31111) {
                            if ((i31111 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i31111, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i31110 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar1113 = nVar4;
                androidx.compose.ui.n nVarS117 = nVar1113.s0(textController.j());
                i0 measurePolicy118 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection118 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var118 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                aVarA = companion118.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF118 = LayoutKt.f(nVarS117);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB119 = Updater.b(pVarF);
                Updater.j(pVarB119, measurePolicy118, companion118.d());
                Updater.j(pVarB119, eVar119, companion118.b());
                Updater.j(pVarB119, layoutDirection118, companion118.c());
                Updater.j(pVarB119, d2Var118, companion118.f());
                pVarF.x();
                qVarF118.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar1113;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31111) {
                    BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        lVar2 = lVar;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((57344 & i12) == 0) {
                iA = i10;
                if (pVarF.y(iA)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((i12 & 458752) == 0) {
                if (pVarF.u(z10)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (pVarF.y(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 4194304;
            }
            if (i25 != 128) {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor119 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB119 = CoreTextKt.b(text, mapZ);
                listA = pairB119.a();
                listB = pairB119.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController1110 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController1110);
                    objU = textController1110;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor119);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i31111 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31112) {
                            if ((i31112 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i31112, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i31111 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar1114 = nVar4;
                androidx.compose.ui.n nVarS118 = nVar1114.s0(textController.j());
                i0 measurePolicy119 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar1110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection119 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var119 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                aVarA = companion119.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF119 = LayoutKt.f(nVarS118);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB1110 = Updater.b(pVarF);
                Updater.j(pVarB1110, measurePolicy119, companion119.d());
                Updater.j(pVarB1110, eVar1110, companion119.b());
                Updater.j(pVarB1110, layoutDirection119, companion119.c());
                Updater.j(pVarB1110, d2Var119, companion119.f());
                pVarF.x();
                qVarF119.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar1114;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            } else {
                pVarF.W();
                if ((i12 & 1) != 0) {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                } else {
                    if (i32 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    }
                    if (i17 != 0) {
                        lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    } else {
                        lVar3 = lVar;
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i11;
                    }
                    if (i25 != 0) {
                        nVar4 = nVar3;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = s0.z();
                        i27 = i14 & (-29360129);
                    } else {
                        nVar4 = nVar3;
                        i27 = i14;
                        lVar4 = lVar3;
                        z12 = z11;
                        i28 = i26;
                        i29 = iA;
                        textStyle2 = textStyleA;
                        mapZ = map;
                    }
                }
                pVarF.O();
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
                }
                if (i28 > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                long selectionBackgroundColor1110 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
                Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB1110 = CoreTextKt.b(text, mapZ);
                listA = pairB1110.a();
                listB = pairB1110.b();
                pVarF.T(959243020);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                j10 = jLongValue;
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    z14 = true;
                    TextController textController1111 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                    pVarF.N(textController1111);
                    objU = textController1111;
                } else {
                    z14 = true;
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (!pVarF.D()) {
                    textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
                }
                state.m(lVar4);
                state.p(selectionBackgroundColor1110);
                textController.p(oVar);
                if (listB.isEmpty()) {
                    pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
                } else {
                    final int i31112 = i27;
                    pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                        @androidx.compose.runtime.h
                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31113) {
                            if ((i31113 & 11) == 2 && pVar2.b()) {
                                pVar2.l();
                                return;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1892283635, i31113, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                            }
                            CoreTextKt.a(text, listB, pVar2, (i31112 & 14) | 64);
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                androidx.compose.ui.n nVar1115 = nVar4;
                androidx.compose.ui.n nVarS119 = nVar1115.s0(textController.j());
                i0 measurePolicy1110 = textController.getMeasurePolicy();
                pVarF.T(-1323940314);
                s1.e eVar1111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection1110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var1110 = (d2) pVarF.K(CompositionLocalsKt.u());
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                aVarA = companion1110.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF1110 = LayoutKt.f(nVarS119);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(aVarA);
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB1111 = Updater.b(pVarF);
                Updater.j(pVarB1111, measurePolicy1110, companion1110.d());
                Updater.j(pVarB1111, eVar1111, companion1110.b());
                Updater.j(pVarB1111, layoutDirection1110, companion1110.c());
                Updater.j(pVarB1111, d2Var1110, companion1110.f());
                pVarF.x();
                qVarF1110.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
                pVarF.T(2058660585);
                pVarB.invoke(pVarF, 0);
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar5 = nVar1115;
                lVar5 = lVar4;
                textStyle3 = textStyle2;
                i30 = i29;
                z15 = z12;
                i31 = i28;
                map2 = mapZ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31113) {
                    BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= 24576;
        iA = i10;
        i21 = i13 & 32;
        if (i21 != 0) {
            i14 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((i12 & 458752) == 0) {
            if (pVarF.u(z10)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (pVarF.y(i11)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i14 |= i24;
        }
        i25 = i13 & 128;
        if (i25 != 0) {
            i14 |= 4194304;
        }
        if (i25 != 128) {
            pVarF.W();
            if ((i12 & 1) != 0) {
                if (i32 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i17 != 0) {
                    lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar3 = lVar;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i11;
                }
                if (i25 != 0) {
                    nVar4 = nVar3;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = s0.z();
                    i27 = i14 & (-29360129);
                } else {
                    nVar4 = nVar3;
                    i27 = i14;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = map;
                }
            } else {
                if (i32 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i17 != 0) {
                    lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar3 = lVar;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i11;
                }
                if (i25 != 0) {
                    nVar4 = nVar3;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = s0.z();
                    i27 = i14 & (-29360129);
                } else {
                    nVar4 = nVar3;
                    i27 = i14;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = map;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
            }
            if (i28 > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
            long selectionBackgroundColor1111 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
            Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB1111 = CoreTextKt.b(text, mapZ);
            listA = pairB1111.a();
            listB = pairB1111.b();
            pVarF.T(959243020);
            if (oVar == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Long invoke() {
                        return Long.valueOf(oVar.e());
                    }
                }, pVarF, 72, 4)).longValue();
            }
            pVarF.c0();
            pVarF.T(-492369756);
            objU = pVarF.U();
            j10 = jLongValue;
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                z14 = true;
                TextController textController1112 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                pVarF.N(textController1112);
                objU = textController1112;
            } else {
                z14 = true;
            }
            pVarF.c0();
            textController = (TextController) objU;
            state = textController.getState();
            if (!pVarF.D()) {
                textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
            }
            state.m(lVar4);
            state.p(selectionBackgroundColor1111);
            textController.p(oVar);
            if (listB.isEmpty()) {
                pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
            } else {
                final int i31113 = i27;
                pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31114) {
                        if ((i31114 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1892283635, i31114, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                        }
                        CoreTextKt.a(text, listB, pVar2, (i31113 & 14) | 64);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            androidx.compose.ui.n nVar1116 = nVar4;
            androidx.compose.ui.n nVarS1110 = nVar1116.s0(textController.j());
            i0 measurePolicy1111 = textController.getMeasurePolicy();
            pVarF.T(-1323940314);
            s1.e eVar1112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var1111 = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
            aVarA = companion1111.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF1111 = LayoutKt.f(nVarS1110);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB1112 = Updater.b(pVarF);
            Updater.j(pVarB1112, measurePolicy1111, companion1111.d());
            Updater.j(pVarB1112, eVar1112, companion1111.b());
            Updater.j(pVarB1112, layoutDirection1111, companion1111.c());
            Updater.j(pVarB1112, d2Var1111, companion1111.f());
            pVarF.x();
            qVarF1111.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarB.invoke(pVarF, 0);
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar1116;
            lVar5 = lVar4;
            textStyle3 = textStyle2;
            i30 = i29;
            z15 = z12;
            i31 = i28;
            map2 = mapZ;
        } else {
            pVarF.W();
            if ((i12 & 1) != 0) {
                if (i32 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i17 != 0) {
                    lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar3 = lVar;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i11;
                }
                if (i25 != 0) {
                    nVar4 = nVar3;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = s0.z();
                    i27 = i14 & (-29360129);
                } else {
                    nVar4 = nVar3;
                    i27 = i14;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = map;
                }
            } else {
                if (i32 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                }
                if (i17 != 0) {
                    lVar3 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$4
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                } else {
                    lVar3 = lVar;
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i11;
                }
                if (i25 != 0) {
                    nVar4 = nVar3;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = s0.z();
                    i27 = i14 & (-29360129);
                } else {
                    nVar4 = nVar3;
                    i27 = i14;
                    lVar4 = lVar3;
                    z12 = z11;
                    i28 = i26;
                    i29 = iA;
                    textStyle2 = textStyleA;
                    mapZ = map;
                }
            }
            pVarF.O();
            if (ComposerKt.g0()) {
                ComposerKt.w0(-648605928, i27, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:159)");
            }
            if (i28 > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
            long selectionBackgroundColor1112 = ((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor();
            Pair<List<androidx.compose.ui.text.d.Range<Placeholder>>, List<androidx.compose.ui.text.d.Range<yh.q<String, androidx.compose.runtime.p, Integer, b2>>>> pairB1112 = CoreTextKt.b(text, mapZ);
            listA = pairB1112.a();
            listB = pairB1112.b();
            pVarF.T(959243020);
            if (oVar == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$2
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Long invoke() {
                        return Long.valueOf(oVar.e());
                    }
                }, pVarF, 72, 4)).longValue();
            }
            pVarF.c0();
            pVarF.T(-492369756);
            objU = pVarF.U();
            j10 = jLongValue;
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                z14 = true;
                TextController textController1113 = new TextController(new TextState(new p(text, textStyle2, i28, z12, i29, eVar, bVar, listA, null), j10));
                pVarF.N(textController1113);
                objU = textController1113;
            } else {
                z14 = true;
            }
            pVarF.c0();
            textController = (TextController) objU;
            state = textController.getState();
            if (!pVarF.D()) {
                textController.o(CoreTextKt.c(state.getTextDelegate(), text, textStyle2, eVar, bVar, z12, i29, i28, listA));
            }
            state.m(lVar4);
            state.p(selectionBackgroundColor1112);
            textController.p(oVar);
            if (listB.isEmpty()) {
                pVarB = ComposableSingletons$BasicTextKt.f7677a.a();
            } else {
                final int i31114 = i27;
                pVarB = androidx.compose.runtime.internal.b.b(pVarF, 1892283635, z14, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
                    @androidx.compose.runtime.h
                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31115) {
                        if ((i31115 & 11) == 2 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1892283635, i31115, -1, "androidx.compose.foundation.text.BasicText.<anonymous> (BasicText.kt:239)");
                        }
                        CoreTextKt.a(text, listB, pVar2, (i31114 & 14) | 64);
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            androidx.compose.ui.n nVar1117 = nVar4;
            androidx.compose.ui.n nVarS1111 = nVar1117.s0(textController.j());
            i0 measurePolicy1112 = textController.getMeasurePolicy();
            pVarF.T(-1323940314);
            s1.e eVar1113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var1112 = (d2) pVarF.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
            aVarA = companion1112.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF1112 = LayoutKt.f(nVarS1111);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(aVarA);
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB1113 = Updater.b(pVarF);
            Updater.j(pVarB1113, measurePolicy1112, companion1112.d());
            Updater.j(pVarB1113, eVar1113, companion1112.b());
            Updater.j(pVarB1113, layoutDirection1112, companion1112.c());
            Updater.j(pVarB1113, d2Var1112, companion1112.f());
            pVarF.x();
            qVarF1112.invoke(v1.a(v1.b(pVarF)), pVarF, 0);
            pVarF.T(2058660585);
            pVarB.invoke(pVarF, 0);
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar5 = nVar1117;
            lVar5 = lVar4;
            textStyle3 = textStyle2;
            i30 = i29;
            z15 = z12;
            i31 = i28;
            map2 = mapZ;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31115) {
                BasicTextKt.a(text, nVar5, textStyle3, lVar5, i30, z15, i31, map2, pVar2, i12 | 1, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:113:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:117:0x020e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0221  */
    /* JADX WARN: Code duplicated, block: B:123:0x027d  */
    /* JADX WARN: Code duplicated, block: B:126:0x0289  */
    /* JADX WARN: Code duplicated, block: B:127:0x0292  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:135:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010a  */
    /* JADX WARN: Code duplicated, block: B:92:0x010f  */
    /* JADX WARN: Code duplicated, block: B:95:0x0119  */
    /* JADX WARN: Code duplicated, block: B:97:0x011c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void b(@dl.d final String text, @dl.e androidx.compose.ui.n nVar, @dl.e TextStyle textStyle, @dl.e yh.l<? super TextLayoutResult, b2> lVar, int i10, boolean z10, int i11, @dl.e androidx.compose.runtime.p pVar, final int i12, final int i13) {
        int i14;
        androidx.compose.ui.n nVar2;
        int i15;
        TextStyle textStyle2;
        int i16;
        int i17;
        yh.l<? super TextLayoutResult, b2> lVar2;
        int i18;
        int i19;
        int iA;
        int i20;
        int i21;
        boolean z11;
        int i22;
        int i23;
        int i24;
        int i25;
        TextStyle textStyleA;
        int i26;
        boolean z12;
        final androidx.compose.foundation.text.selection.o oVar;
        s1.e eVar;
        androidx.compose.ui.text.font.v.b bVar;
        long jLongValue;
        Object objU;
        TextController textController;
        TextState state;
        TextController textController2;
        final yh.a<ComposeUiNode> aVarA;
        final int i27;
        final androidx.compose.ui.n nVar3;
        final yh.l<? super TextLayoutResult, b2> lVar3;
        final int i28;
        final boolean z13;
        final TextStyle textStyle3;
        u1 u1VarH;
        f0.p(text, "text");
        androidx.compose.runtime.p pVarF = pVar.F(1022429478);
        if ((i13 & 1) != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (pVarF.s(text) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i29 = i13 & 2;
        if (i29 == 0) {
            if ((i12 & 112) == 0) {
                nVar2 = nVar;
                i14 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & bb.c.b.f30796me) == 0) {
                    textStyle2 = textStyle;
                    if (pVarF.s(textStyle2)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & bb.c.g.f32954lc) == 0) {
                        lVar2 = lVar;
                        if (pVarF.s(lVar2)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((57344 & i12) == 0) {
                            iA = i10;
                            if (pVarF.y(iA)) {
                                i20 = 16384;
                            } else {
                                i20 = 8192;
                            }
                            i14 |= i20;
                        }
                        i21 = i13 & 32;
                        if (i21 != 0) {
                            if ((458752 & i12) == 0) {
                                z11 = z10;
                                if (pVarF.u(z11)) {
                                    i22 = 131072;
                                } else {
                                    i22 = 65536;
                                }
                                i14 |= i22;
                            }
                            i23 = i13 & 64;
                            if (i23 != 0) {
                                i14 |= 1572864;
                                i24 = i11;
                            } else {
                                i24 = i11;
                                if ((i12 & 3670016) == 0) {
                                    if (pVarF.y(i24)) {
                                        i25 = 1048576;
                                    } else {
                                        i25 = 524288;
                                    }
                                    i14 |= i25;
                                }
                            }
                            if ((i14 & 2995931) == 599186 || !pVarF.b()) {
                                if (i29 != 0) {
                                    nVar2 = androidx.compose.ui.n.INSTANCE;
                                }
                                if (i15 != 0) {
                                    textStyleA = TextStyle.INSTANCE.a();
                                } else {
                                    textStyleA = textStyle2;
                                }
                                if (i17 != 0) {
                                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                        public final void a(@dl.d TextLayoutResult it) {
                                            f0.p(it, "it");
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                            a(textLayoutResult);
                                            return b2.f124493a;
                                        }
                                    };
                                }
                                if (i19 != 0) {
                                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                }
                                if (i23 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i24;
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                                }
                                if (i26 > 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12) {
                                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                                }
                                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                                pVarF.T(959238313);
                                if (oVar == null) {
                                    jLongValue = 0;
                                } else {
                                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                        {
                                            super(0);
                                        }

                                        @Override // yh.a
                                        @dl.d
                                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                        public final Long invoke() {
                                            return Long.valueOf(oVar.e());
                                        }
                                    }, pVarF, 72, 4)).longValue();
                                }
                                pVarF.c0();
                                pVarF.T(-492369756);
                                objU = pVarF.U();
                                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                    pVarF.N(objU);
                                }
                                pVarF.c0();
                                textController = (TextController) objU;
                                state = textController.getState();
                                if (pVarF.D()) {
                                    textController2 = textController;
                                } else {
                                    int i30 = iA;
                                    textController2 = textController;
                                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i30, i26));
                                }
                                state.m(lVar2);
                                textController2.p(oVar);
                                pVarF.T(959239630);
                                if (oVar != null) {
                                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                                }
                                pVarF.c0();
                                androidx.compose.ui.n nVarS0 = nVar2.s0(textController2.j());
                                i0 measurePolicy = textController2.getMeasurePolicy();
                                pVarF.T(544976794);
                                s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                                LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                                d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
                                androidx.compose.ui.n nVarM = ComposedModifierKt.m(pVarF, nVarS0);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                aVarA = companion.a();
                                pVarF.T(1405779621);
                                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                    ComposablesKt.n();
                                }
                                pVarF.h();
                                if (pVarF.D()) {
                                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                        @Override // yh.a
                                        @dl.d
                                        public final ComposeUiNode invoke() {
                                            return aVarA.invoke();
                                        }
                                    });
                                } else {
                                    pVarF.d();
                                }
                                pVarF.Y();
                                androidx.compose.runtime.p pVarB = Updater.b(pVarF);
                                Updater.j(pVarB, measurePolicy, companion.d());
                                Updater.j(pVarB, eVar2, companion.b());
                                Updater.j(pVarB, layoutDirection, companion.c());
                                Updater.j(pVarB, d2Var, companion.f());
                                Updater.j(pVarB, nVarM, companion.e());
                                pVarF.x();
                                pVarF.f();
                                pVarF.c0();
                                pVarF.c0();
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                i27 = iA;
                                nVar3 = nVar2;
                                lVar3 = lVar2;
                                i28 = i26;
                                z13 = z11;
                                textStyle3 = textStyleA;
                            } else {
                                pVarF.l();
                                i28 = i24;
                                nVar3 = nVar2;
                                textStyle3 = textStyle2;
                                lVar3 = lVar2;
                                i27 = iA;
                                z13 = z11;
                            }
                            u1VarH = pVarF.H();
                            if (u1VarH == null) {
                                return;
                            }
                            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31) {
                                    BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        i14 |= androidx.profileinstaller.o.c.f26824k;
                        z11 = z10;
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                            i24 = i11;
                        } else {
                            i24 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (pVarF.y(i24)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i31 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS1 = nVar2.s0(textController2.j());
                            i0 measurePolicy2 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var2 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM2 = ComposedModifierKt.m(pVarF, nVarS1);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            aVarA = companion2.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB2 = Updater.b(pVarF);
                            Updater.j(pVarB2, measurePolicy2, companion2.d());
                            Updater.j(pVarB2, eVar3, companion2.b());
                            Updater.j(pVarB2, layoutDirection2, companion2.c());
                            Updater.j(pVarB2, d2Var2, companion2.f());
                            Updater.j(pVarB2, nVarM2, companion2.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        } else {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i32 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i32, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS2 = nVar2.s0(textController2.j());
                            i0 measurePolicy3 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var3 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM3 = ComposedModifierKt.m(pVarF, nVarS2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            aVarA = companion3.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB3 = Updater.b(pVarF);
                            Updater.j(pVarB3, measurePolicy3, companion3.d());
                            Updater.j(pVarB3, eVar4, companion3.b());
                            Updater.j(pVarB3, layoutDirection3, companion3.c());
                            Updater.j(pVarB3, d2Var3, companion3.f());
                            Updater.j(pVarB3, nVarM3, companion3.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i33) {
                                BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i14 |= 24576;
                    iA = i10;
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        if ((458752 & i12) == 0) {
                            z11 = z10;
                            if (pVarF.u(z11)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                            i24 = i11;
                        } else {
                            i24 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (pVarF.y(i24)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i33 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i33, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS3 = nVar2.s0(textController2.j());
                            i0 measurePolicy4 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var4 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM4 = ComposedModifierKt.m(pVarF, nVarS3);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            aVarA = companion4.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB4 = Updater.b(pVarF);
                            Updater.j(pVarB4, measurePolicy4, companion4.d());
                            Updater.j(pVarB4, eVar5, companion4.b());
                            Updater.j(pVarB4, layoutDirection4, companion4.c());
                            Updater.j(pVarB4, d2Var4, companion4.f());
                            Updater.j(pVarB4, nVarM4, companion4.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        } else {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i34 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i34, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS4 = nVar2.s0(textController2.j());
                            i0 measurePolicy5 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var5 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM5 = ComposedModifierKt.m(pVarF, nVarS4);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            aVarA = companion5.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB5 = Updater.b(pVarF);
                            Updater.j(pVarB5, measurePolicy5, companion5.d());
                            Updater.j(pVarB5, eVar6, companion5.b());
                            Updater.j(pVarB5, layoutDirection5, companion5.c());
                            Updater.j(pVarB5, d2Var5, companion5.f());
                            Updater.j(pVarB5, nVarM5, companion5.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i35) {
                                BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                    z11 = z10;
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i35 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i35, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS5 = nVar2.s0(textController2.j());
                        i0 measurePolicy6 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var6 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM6 = ComposedModifierKt.m(pVarF, nVarS5);
                        ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                        aVarA = companion6.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB6 = Updater.b(pVarF);
                        Updater.j(pVarB6, measurePolicy6, companion6.d());
                        Updater.j(pVarB6, eVar7, companion6.b());
                        Updater.j(pVarB6, layoutDirection6, companion6.c());
                        Updater.j(pVarB6, d2Var6, companion6.f());
                        Updater.j(pVarB6, nVarM6, companion6.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i36 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i36, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS6 = nVar2.s0(textController2.j());
                        i0 measurePolicy7 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar8 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var7 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM7 = ComposedModifierKt.m(pVarF, nVarS6);
                        ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                        aVarA = companion7.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB7 = Updater.b(pVarF);
                        Updater.j(pVarB7, measurePolicy7, companion7.d());
                        Updater.j(pVarB7, eVar8, companion7.b());
                        Updater.j(pVarB7, layoutDirection7, companion7.c());
                        Updater.j(pVarB7, d2Var7, companion7.f());
                        Updater.j(pVarB7, nVarM7, companion7.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i37) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= bb.c.d.f31193dj;
                lVar2 = lVar;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        iA = i10;
                        if (pVarF.y(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        if ((458752 & i12) == 0) {
                            z11 = z10;
                            if (pVarF.u(z11)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                            i24 = i11;
                        } else {
                            i24 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (pVarF.y(i24)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i37 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i37, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS7 = nVar2.s0(textController2.j());
                            i0 measurePolicy8 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar9 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection8 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var8 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM8 = ComposedModifierKt.m(pVarF, nVarS7);
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            aVarA = companion8.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB8 = Updater.b(pVarF);
                            Updater.j(pVarB8, measurePolicy8, companion8.d());
                            Updater.j(pVarB8, eVar9, companion8.b());
                            Updater.j(pVarB8, layoutDirection8, companion8.c());
                            Updater.j(pVarB8, d2Var8, companion8.f());
                            Updater.j(pVarB8, nVarM8, companion8.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        } else {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i38 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i38, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS8 = nVar2.s0(textController2.j());
                            i0 measurePolicy9 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar10 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection9 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var9 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM9 = ComposedModifierKt.m(pVarF, nVarS8);
                            ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                            aVarA = companion9.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB9 = Updater.b(pVarF);
                            Updater.j(pVarB9, measurePolicy9, companion9.d());
                            Updater.j(pVarB9, eVar10, companion9.b());
                            Updater.j(pVarB9, layoutDirection9, companion9.c());
                            Updater.j(pVarB9, d2Var9, companion9.f());
                            Updater.j(pVarB9, nVarM9, companion9.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i39) {
                                BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                    z11 = z10;
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i39 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i39, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS9 = nVar2.s0(textController2.j());
                        i0 measurePolicy10 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar11 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection10 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var10 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM10 = ComposedModifierKt.m(pVarF, nVarS9);
                        ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                        aVarA = companion10.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB10 = Updater.b(pVarF);
                        Updater.j(pVarB10, measurePolicy10, companion10.d());
                        Updater.j(pVarB10, eVar11, companion10.b());
                        Updater.j(pVarB10, layoutDirection10, companion10.c());
                        Updater.j(pVarB10, d2Var10, companion10.f());
                        Updater.j(pVarB10, nVarM10, companion10.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i310 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i310, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS10 = nVar2.s0(textController2.j());
                        i0 measurePolicy11 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar12 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection11 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var11 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM11 = ComposedModifierKt.m(pVarF, nVarS10);
                        ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                        aVarA = companion11.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB11 = Updater.b(pVarF);
                        Updater.j(pVarB11, measurePolicy11, companion11.d());
                        Updater.j(pVarB11, eVar12, companion11.b());
                        Updater.j(pVarB11, layoutDirection11, companion11.c());
                        Updater.j(pVarB11, d2Var11, companion11.f());
                        Updater.j(pVarB11, nVarM11, companion11.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    if ((458752 & i12) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i311 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS11 = nVar2.s0(textController2.j());
                        i0 measurePolicy12 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar13 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection12 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var12 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM12 = ComposedModifierKt.m(pVarF, nVarS11);
                        ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                        aVarA = companion12.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB12 = Updater.b(pVarF);
                        Updater.j(pVarB12, measurePolicy12, companion12.d());
                        Updater.j(pVarB12, eVar13, companion12.b());
                        Updater.j(pVarB12, layoutDirection12, companion12.c());
                        Updater.j(pVarB12, d2Var12, companion12.f());
                        Updater.j(pVarB12, nVarM12, companion12.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i312 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i312, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS12 = nVar2.s0(textController2.j());
                        i0 measurePolicy13 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar14 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection13 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var13 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM13 = ComposedModifierKt.m(pVarF, nVarS12);
                        ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                        aVarA = companion13.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB13 = Updater.b(pVarF);
                        Updater.j(pVarB13, measurePolicy13, companion13.d());
                        Updater.j(pVarB13, eVar14, companion13.b());
                        Updater.j(pVarB13, layoutDirection13, companion13.c());
                        Updater.j(pVarB13, d2Var13, companion13.f());
                        Updater.j(pVarB13, nVarM13, companion13.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i313) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i313 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i313, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS13 = nVar2.s0(textController2.j());
                    i0 measurePolicy14 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar15 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection14 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var14 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM14 = ComposedModifierKt.m(pVarF, nVarS13);
                    ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
                    aVarA = companion14.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB14 = Updater.b(pVarF);
                    Updater.j(pVarB14, measurePolicy14, companion14.d());
                    Updater.j(pVarB14, eVar15, companion14.b());
                    Updater.j(pVarB14, layoutDirection14, companion14.c());
                    Updater.j(pVarB14, d2Var14, companion14.f());
                    Updater.j(pVarB14, nVarM14, companion14.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i314 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i314, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS14 = nVar2.s0(textController2.j());
                    i0 measurePolicy15 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar16 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection15 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var15 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM15 = ComposedModifierKt.m(pVarF, nVarS14);
                    ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
                    aVarA = companion15.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB15 = Updater.b(pVarF);
                    Updater.j(pVarB15, measurePolicy15, companion15.d());
                    Updater.j(pVarB15, eVar16, companion15.b());
                    Updater.j(pVarB15, layoutDirection15, companion15.c());
                    Updater.j(pVarB15, d2Var15, companion15.f());
                    Updater.j(pVarB15, nVarM15, companion15.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i315) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.b.f30966u4;
            textStyle2 = textStyle;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & bb.c.g.f32954lc) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        iA = i10;
                        if (pVarF.y(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        if ((458752 & i12) == 0) {
                            z11 = z10;
                            if (pVarF.u(z11)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                            i24 = i11;
                        } else {
                            i24 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (pVarF.y(i24)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i315 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i315, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS15 = nVar2.s0(textController2.j());
                            i0 measurePolicy16 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar17 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection16 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var16 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM16 = ComposedModifierKt.m(pVarF, nVarS15);
                            ComposeUiNode.Companion companion16 = ComposeUiNode.INSTANCE;
                            aVarA = companion16.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB16 = Updater.b(pVarF);
                            Updater.j(pVarB16, measurePolicy16, companion16.d());
                            Updater.j(pVarB16, eVar17, companion16.b());
                            Updater.j(pVarB16, layoutDirection16, companion16.c());
                            Updater.j(pVarB16, d2Var16, companion16.f());
                            Updater.j(pVarB16, nVarM16, companion16.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        } else {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i316 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i316, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS16 = nVar2.s0(textController2.j());
                            i0 measurePolicy17 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar18 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection17 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var17 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM17 = ComposedModifierKt.m(pVarF, nVarS16);
                            ComposeUiNode.Companion companion17 = ComposeUiNode.INSTANCE;
                            aVarA = companion17.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB17 = Updater.b(pVarF);
                            Updater.j(pVarB17, measurePolicy17, companion17.d());
                            Updater.j(pVarB17, eVar18, companion17.b());
                            Updater.j(pVarB17, layoutDirection17, companion17.c());
                            Updater.j(pVarB17, d2Var17, companion17.f());
                            Updater.j(pVarB17, nVarM17, companion17.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i317) {
                                BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                    z11 = z10;
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i317 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i317, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS17 = nVar2.s0(textController2.j());
                        i0 measurePolicy18 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar19 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection18 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var18 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM18 = ComposedModifierKt.m(pVarF, nVarS17);
                        ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                        aVarA = companion18.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB18 = Updater.b(pVarF);
                        Updater.j(pVarB18, measurePolicy18, companion18.d());
                        Updater.j(pVarB18, eVar19, companion18.b());
                        Updater.j(pVarB18, layoutDirection18, companion18.c());
                        Updater.j(pVarB18, d2Var18, companion18.f());
                        Updater.j(pVarB18, nVarM18, companion18.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i318 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i318, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS18 = nVar2.s0(textController2.j());
                        i0 measurePolicy19 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection19 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var19 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM19 = ComposedModifierKt.m(pVarF, nVarS18);
                        ComposeUiNode.Companion companion19 = ComposeUiNode.INSTANCE;
                        aVarA = companion19.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB19 = Updater.b(pVarF);
                        Updater.j(pVarB19, measurePolicy19, companion19.d());
                        Updater.j(pVarB19, eVar110, companion19.b());
                        Updater.j(pVarB19, layoutDirection19, companion19.c());
                        Updater.j(pVarB19, d2Var19, companion19.f());
                        Updater.j(pVarB19, nVarM19, companion19.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i319) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    if ((458752 & i12) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i319 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i319, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS19 = nVar2.s0(textController2.j());
                        i0 measurePolicy110 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var110 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM110 = ComposedModifierKt.m(pVarF, nVarS19);
                        ComposeUiNode.Companion companion110 = ComposeUiNode.INSTANCE;
                        aVarA = companion110.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB110 = Updater.b(pVarF);
                        Updater.j(pVarB110, measurePolicy110, companion110.d());
                        Updater.j(pVarB110, eVar111, companion110.b());
                        Updater.j(pVarB110, layoutDirection110, companion110.c());
                        Updater.j(pVarB110, d2Var110, companion110.f());
                        Updater.j(pVarB110, nVarM110, companion110.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i3110 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3110, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS110 = nVar2.s0(textController2.j());
                        i0 measurePolicy111 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var111 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM111 = ComposedModifierKt.m(pVarF, nVarS110);
                        ComposeUiNode.Companion companion111 = ComposeUiNode.INSTANCE;
                        aVarA = companion111.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB111 = Updater.b(pVarF);
                        Updater.j(pVarB111, measurePolicy111, companion111.d());
                        Updater.j(pVarB111, eVar112, companion111.b());
                        Updater.j(pVarB111, layoutDirection111, companion111.c());
                        Updater.j(pVarB111, d2Var111, companion111.f());
                        Updater.j(pVarB111, nVarM111, companion111.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3111 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS111 = nVar2.s0(textController2.j());
                    i0 measurePolicy112 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var112 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM112 = ComposedModifierKt.m(pVarF, nVarS111);
                    ComposeUiNode.Companion companion112 = ComposeUiNode.INSTANCE;
                    aVarA = companion112.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB112 = Updater.b(pVarF);
                    Updater.j(pVarB112, measurePolicy112, companion112.d());
                    Updater.j(pVarB112, eVar113, companion112.b());
                    Updater.j(pVarB112, layoutDirection112, companion112.c());
                    Updater.j(pVarB112, d2Var112, companion112.f());
                    Updater.j(pVarB112, nVarM112, companion112.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3112 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3112, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS112 = nVar2.s0(textController2.j());
                    i0 measurePolicy113 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var113 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM113 = ComposedModifierKt.m(pVarF, nVarS112);
                    ComposeUiNode.Companion companion113 = ComposeUiNode.INSTANCE;
                    aVarA = companion113.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB113 = Updater.b(pVarF);
                    Updater.j(pVarB113, measurePolicy113, companion113.d());
                    Updater.j(pVarB113, eVar114, companion113.b());
                    Updater.j(pVarB113, layoutDirection113, companion113.c());
                    Updater.j(pVarB113, d2Var113, companion113.f());
                    Updater.j(pVarB113, nVarM113, companion113.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3113) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            lVar2 = lVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    iA = i10;
                    if (pVarF.y(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    if ((458752 & i12) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i3113 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3113, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS113 = nVar2.s0(textController2.j());
                        i0 measurePolicy114 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection114 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var114 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM114 = ComposedModifierKt.m(pVarF, nVarS113);
                        ComposeUiNode.Companion companion114 = ComposeUiNode.INSTANCE;
                        aVarA = companion114.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB114 = Updater.b(pVarF);
                        Updater.j(pVarB114, measurePolicy114, companion114.d());
                        Updater.j(pVarB114, eVar115, companion114.b());
                        Updater.j(pVarB114, layoutDirection114, companion114.c());
                        Updater.j(pVarB114, d2Var114, companion114.f());
                        Updater.j(pVarB114, nVarM114, companion114.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i3114 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3114, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS114 = nVar2.s0(textController2.j());
                        i0 measurePolicy115 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection115 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var115 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM115 = ComposedModifierKt.m(pVarF, nVarS114);
                        ComposeUiNode.Companion companion115 = ComposeUiNode.INSTANCE;
                        aVarA = companion115.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB115 = Updater.b(pVarF);
                        Updater.j(pVarB115, measurePolicy115, companion115.d());
                        Updater.j(pVarB115, eVar116, companion115.b());
                        Updater.j(pVarB115, layoutDirection115, companion115.c());
                        Updater.j(pVarB115, d2Var115, companion115.f());
                        Updater.j(pVarB115, nVarM115, companion115.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3115) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3115 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3115, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS115 = nVar2.s0(textController2.j());
                    i0 measurePolicy116 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection116 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var116 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM116 = ComposedModifierKt.m(pVarF, nVarS115);
                    ComposeUiNode.Companion companion116 = ComposeUiNode.INSTANCE;
                    aVarA = companion116.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB116 = Updater.b(pVarF);
                    Updater.j(pVarB116, measurePolicy116, companion116.d());
                    Updater.j(pVarB116, eVar117, companion116.b());
                    Updater.j(pVarB116, layoutDirection116, companion116.c());
                    Updater.j(pVarB116, d2Var116, companion116.f());
                    Updater.j(pVarB116, nVarM116, companion116.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3116 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3116, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS116 = nVar2.s0(textController2.j());
                    i0 measurePolicy117 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection117 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var117 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM117 = ComposedModifierKt.m(pVarF, nVarS116);
                    ComposeUiNode.Companion companion117 = ComposeUiNode.INSTANCE;
                    aVarA = companion117.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB117 = Updater.b(pVarF);
                    Updater.j(pVarB117, measurePolicy117, companion117.d());
                    Updater.j(pVarB117, eVar118, companion117.b());
                    Updater.j(pVarB117, layoutDirection117, companion117.c());
                    Updater.j(pVarB117, d2Var117, companion117.f());
                    Updater.j(pVarB117, nVarM117, companion117.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3117) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                if ((458752 & i12) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3117 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3117, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS117 = nVar2.s0(textController2.j());
                    i0 measurePolicy118 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection118 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var118 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM118 = ComposedModifierKt.m(pVarF, nVarS117);
                    ComposeUiNode.Companion companion118 = ComposeUiNode.INSTANCE;
                    aVarA = companion118.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB118 = Updater.b(pVarF);
                    Updater.j(pVarB118, measurePolicy118, companion118.d());
                    Updater.j(pVarB118, eVar119, companion118.b());
                    Updater.j(pVarB118, layoutDirection118, companion118.c());
                    Updater.j(pVarB118, d2Var118, companion118.f());
                    Updater.j(pVarB118, nVarM118, companion118.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3118 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3118, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS118 = nVar2.s0(textController2.j());
                    i0 measurePolicy119 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar1110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection119 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var119 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM119 = ComposedModifierKt.m(pVarF, nVarS118);
                    ComposeUiNode.Companion companion119 = ComposeUiNode.INSTANCE;
                    aVarA = companion119.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB119 = Updater.b(pVarF);
                    Updater.j(pVarB119, measurePolicy119, companion119.d());
                    Updater.j(pVarB119, eVar1110, companion119.b());
                    Updater.j(pVarB119, layoutDirection119, companion119.c());
                    Updater.j(pVarB119, d2Var119, companion119.f());
                    Updater.j(pVarB119, nVarM119, companion119.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3119) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i11;
            } else {
                i24 = i11;
                if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i3119 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3119, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS119 = nVar2.s0(textController2.j());
                i0 measurePolicy1110 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar1111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection1110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var1110 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM1110 = ComposedModifierKt.m(pVarF, nVarS119);
                ComposeUiNode.Companion companion1110 = ComposeUiNode.INSTANCE;
                aVarA = companion1110.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB1110 = Updater.b(pVarF);
                Updater.j(pVarB1110, measurePolicy1110, companion1110.d());
                Updater.j(pVarB1110, eVar1111, companion1110.b());
                Updater.j(pVarB1110, layoutDirection1110, companion1110.c());
                Updater.j(pVarB1110, d2Var1110, companion1110.f());
                Updater.j(pVarB1110, nVarM1110, companion1110.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            } else {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i31110 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31110, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS1110 = nVar2.s0(textController2.j());
                i0 measurePolicy1111 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar1112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection1111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var1111 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM1111 = ComposedModifierKt.m(pVarF, nVarS1110);
                ComposeUiNode.Companion companion1111 = ComposeUiNode.INSTANCE;
                aVarA = companion1111.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB1111 = Updater.b(pVarF);
                Updater.j(pVarB1111, measurePolicy1111, companion1111.d());
                Updater.j(pVarB1111, eVar1112, companion1111.b());
                Updater.j(pVarB1111, layoutDirection1111, companion1111.c());
                Updater.j(pVarB1111, d2Var1111, companion1111.f());
                Updater.j(pVarB1111, nVarM1111, companion1111.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31111) {
                    BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= 48;
        nVar2 = nVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & bb.c.b.f30796me) == 0) {
                textStyle2 = textStyle;
                if (pVarF.s(textStyle2)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & bb.c.g.f32954lc) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        iA = i10;
                        if (pVarF.y(iA)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        if ((458752 & i12) == 0) {
                            z11 = z10;
                            if (pVarF.u(z11)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                            i24 = i11;
                        } else {
                            i24 = i11;
                            if ((i12 & 3670016) == 0) {
                                if (pVarF.y(i24)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                        }
                        if ((i14 & 2995931) == 599186) {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i31111 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31111, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS1111 = nVar2.s0(textController2.j());
                            i0 measurePolicy1112 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar1113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection1112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var1112 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM1112 = ComposedModifierKt.m(pVarF, nVarS1111);
                            ComposeUiNode.Companion companion1112 = ComposeUiNode.INSTANCE;
                            aVarA = companion1112.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB1112 = Updater.b(pVarF);
                            Updater.j(pVarB1112, measurePolicy1112, companion1112.d());
                            Updater.j(pVarB1112, eVar1113, companion1112.b());
                            Updater.j(pVarB1112, layoutDirection1112, companion1112.c());
                            Updater.j(pVarB1112, d2Var1112, companion1112.f());
                            Updater.j(pVarB1112, nVarM1112, companion1112.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        } else {
                            if (i29 != 0) {
                                nVar2 = androidx.compose.ui.n.INSTANCE;
                            }
                            if (i15 != 0) {
                                textStyleA = TextStyle.INSTANCE.a();
                            } else {
                                textStyleA = textStyle2;
                            }
                            if (i17 != 0) {
                                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                    public final void a(@dl.d TextLayoutResult it) {
                                        f0.p(it, "it");
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                        a(textLayoutResult);
                                        return b2.f124493a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                            }
                            if (i21 != 0) {
                                z11 = true;
                            }
                            if (i23 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i24;
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                            }
                            if (i26 > 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (!z12) {
                                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                            }
                            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                            pVarF.T(959238313);
                            if (oVar == null) {
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                    {
                                        super(0);
                                    }

                                    @Override // yh.a
                                    @dl.d
                                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                    public final Long invoke() {
                                        return Long.valueOf(oVar.e());
                                    }
                                }, pVarF, 72, 4)).longValue();
                            }
                            pVarF.c0();
                            pVarF.T(-492369756);
                            objU = pVarF.U();
                            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                                pVarF.N(objU);
                            }
                            pVarF.c0();
                            textController = (TextController) objU;
                            state = textController.getState();
                            if (pVarF.D()) {
                                int i31112 = iA;
                                textController2 = textController;
                                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31112, i26));
                            } else {
                                textController2 = textController;
                            }
                            state.m(lVar2);
                            textController2.p(oVar);
                            pVarF.T(959239630);
                            if (oVar != null) {
                                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                            }
                            pVarF.c0();
                            androidx.compose.ui.n nVarS1112 = nVar2.s0(textController2.j());
                            i0 measurePolicy1113 = textController2.getMeasurePolicy();
                            pVarF.T(544976794);
                            s1.e eVar1114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                            LayoutDirection layoutDirection1113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                            d2 d2Var1113 = (d2) pVarF.K(CompositionLocalsKt.u());
                            androidx.compose.ui.n nVarM1113 = ComposedModifierKt.m(pVarF, nVarS1112);
                            ComposeUiNode.Companion companion1113 = ComposeUiNode.INSTANCE;
                            aVarA = companion1113.a();
                            pVarF.T(1405779621);
                            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                                ComposablesKt.n();
                            }
                            pVarF.h();
                            if (pVarF.D()) {
                                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                    @Override // yh.a
                                    @dl.d
                                    public final ComposeUiNode invoke() {
                                        return aVarA.invoke();
                                    }
                                });
                            } else {
                                pVarF.d();
                            }
                            pVarF.Y();
                            androidx.compose.runtime.p pVarB1113 = Updater.b(pVarF);
                            Updater.j(pVarB1113, measurePolicy1113, companion1113.d());
                            Updater.j(pVarB1113, eVar1114, companion1113.b());
                            Updater.j(pVarB1113, layoutDirection1113, companion1113.c());
                            Updater.j(pVarB1113, d2Var1113, companion1113.f());
                            Updater.j(pVarB1113, nVarM1113, companion1113.e());
                            pVarF.x();
                            pVarF.f();
                            pVarF.c0();
                            pVarF.c0();
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            i27 = iA;
                            nVar3 = nVar2;
                            lVar3 = lVar2;
                            i28 = i26;
                            z13 = z11;
                            textStyle3 = textStyleA;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31113) {
                                BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i14 |= androidx.profileinstaller.o.c.f26824k;
                    z11 = z10;
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i31113 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31113, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS1113 = nVar2.s0(textController2.j());
                        i0 measurePolicy1114 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar1115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection1114 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var1114 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM1114 = ComposedModifierKt.m(pVarF, nVarS1113);
                        ComposeUiNode.Companion companion1114 = ComposeUiNode.INSTANCE;
                        aVarA = companion1114.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB1114 = Updater.b(pVarF);
                        Updater.j(pVarB1114, measurePolicy1114, companion1114.d());
                        Updater.j(pVarB1114, eVar1115, companion1114.b());
                        Updater.j(pVarB1114, layoutDirection1114, companion1114.c());
                        Updater.j(pVarB1114, d2Var1114, companion1114.f());
                        Updater.j(pVarB1114, nVarM1114, companion1114.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i31114 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31114, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS1114 = nVar2.s0(textController2.j());
                        i0 measurePolicy1115 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar1116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection1115 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var1115 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM1115 = ComposedModifierKt.m(pVarF, nVarS1114);
                        ComposeUiNode.Companion companion1115 = ComposeUiNode.INSTANCE;
                        aVarA = companion1115.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB1115 = Updater.b(pVarF);
                        Updater.j(pVarB1115, measurePolicy1115, companion1115.d());
                        Updater.j(pVarB1115, eVar1116, companion1115.b());
                        Updater.j(pVarB1115, layoutDirection1115, companion1115.c());
                        Updater.j(pVarB1115, d2Var1115, companion1115.f());
                        Updater.j(pVarB1115, nVarM1115, companion1115.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31115) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= 24576;
                iA = i10;
                i21 = i13 & 32;
                if (i21 != 0) {
                    if ((458752 & i12) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i31115 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31115, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS1115 = nVar2.s0(textController2.j());
                        i0 measurePolicy1116 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar1117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection1116 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var1116 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM1116 = ComposedModifierKt.m(pVarF, nVarS1115);
                        ComposeUiNode.Companion companion1116 = ComposeUiNode.INSTANCE;
                        aVarA = companion1116.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB1116 = Updater.b(pVarF);
                        Updater.j(pVarB1116, measurePolicy1116, companion1116.d());
                        Updater.j(pVarB1116, eVar1117, companion1116.b());
                        Updater.j(pVarB1116, layoutDirection1116, companion1116.c());
                        Updater.j(pVarB1116, d2Var1116, companion1116.f());
                        Updater.j(pVarB1116, nVarM1116, companion1116.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i31116 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31116, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS1116 = nVar2.s0(textController2.j());
                        i0 measurePolicy1117 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar1118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection1117 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var1117 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM1117 = ComposedModifierKt.m(pVarF, nVarS1116);
                        ComposeUiNode.Companion companion1117 = ComposeUiNode.INSTANCE;
                        aVarA = companion1117.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB1117 = Updater.b(pVarF);
                        Updater.j(pVarB1117, measurePolicy1117, companion1117.d());
                        Updater.j(pVarB1117, eVar1118, companion1117.b());
                        Updater.j(pVarB1117, layoutDirection1117, companion1117.c());
                        Updater.j(pVarB1117, d2Var1117, companion1117.f());
                        Updater.j(pVarB1117, nVarM1117, companion1117.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31117) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i31117 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31117, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS1117 = nVar2.s0(textController2.j());
                    i0 measurePolicy1118 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar1119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection1118 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var1118 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM1118 = ComposedModifierKt.m(pVarF, nVarS1117);
                    ComposeUiNode.Companion companion1118 = ComposeUiNode.INSTANCE;
                    aVarA = companion1118.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB1118 = Updater.b(pVarF);
                    Updater.j(pVarB1118, measurePolicy1118, companion1118.d());
                    Updater.j(pVarB1118, eVar1119, companion1118.b());
                    Updater.j(pVarB1118, layoutDirection1118, companion1118.c());
                    Updater.j(pVarB1118, d2Var1118, companion1118.f());
                    Updater.j(pVarB1118, nVarM1118, companion1118.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i31118 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31118, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS1118 = nVar2.s0(textController2.j());
                    i0 measurePolicy1119 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar11110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection1119 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var1119 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM1119 = ComposedModifierKt.m(pVarF, nVarS1118);
                    ComposeUiNode.Companion companion1119 = ComposeUiNode.INSTANCE;
                    aVarA = companion1119.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB1119 = Updater.b(pVarF);
                    Updater.j(pVarB1119, measurePolicy1119, companion1119.d());
                    Updater.j(pVarB1119, eVar11110, companion1119.b());
                    Updater.j(pVarB1119, layoutDirection1119, companion1119.c());
                    Updater.j(pVarB1119, d2Var1119, companion1119.f());
                    Updater.j(pVarB1119, nVarM1119, companion1119.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31119) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= bb.c.d.f31193dj;
            lVar2 = lVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    iA = i10;
                    if (pVarF.y(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    if ((458752 & i12) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i31119 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31119, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS1119 = nVar2.s0(textController2.j());
                        i0 measurePolicy11110 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar11111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection11110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var11110 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM11110 = ComposedModifierKt.m(pVarF, nVarS1119);
                        ComposeUiNode.Companion companion11110 = ComposeUiNode.INSTANCE;
                        aVarA = companion11110.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB11110 = Updater.b(pVarF);
                        Updater.j(pVarB11110, measurePolicy11110, companion11110.d());
                        Updater.j(pVarB11110, eVar11111, companion11110.b());
                        Updater.j(pVarB11110, layoutDirection11110, companion11110.c());
                        Updater.j(pVarB11110, d2Var11110, companion11110.f());
                        Updater.j(pVarB11110, nVarM11110, companion11110.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i311110 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311110, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS11110 = nVar2.s0(textController2.j());
                        i0 measurePolicy11111 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar11112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection11111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var11111 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM11111 = ComposedModifierKt.m(pVarF, nVarS11110);
                        ComposeUiNode.Companion companion11111 = ComposeUiNode.INSTANCE;
                        aVarA = companion11111.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB11111 = Updater.b(pVarF);
                        Updater.j(pVarB11111, measurePolicy11111, companion11111.d());
                        Updater.j(pVarB11111, eVar11112, companion11111.b());
                        Updater.j(pVarB11111, layoutDirection11111, companion11111.c());
                        Updater.j(pVarB11111, d2Var11111, companion11111.f());
                        Updater.j(pVarB11111, nVarM11111, companion11111.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311111) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i311111 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311111, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS11111 = nVar2.s0(textController2.j());
                    i0 measurePolicy11112 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar11113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection11112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var11112 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM11112 = ComposedModifierKt.m(pVarF, nVarS11111);
                    ComposeUiNode.Companion companion11112 = ComposeUiNode.INSTANCE;
                    aVarA = companion11112.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB11112 = Updater.b(pVarF);
                    Updater.j(pVarB11112, measurePolicy11112, companion11112.d());
                    Updater.j(pVarB11112, eVar11113, companion11112.b());
                    Updater.j(pVarB11112, layoutDirection11112, companion11112.c());
                    Updater.j(pVarB11112, d2Var11112, companion11112.f());
                    Updater.j(pVarB11112, nVarM11112, companion11112.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i311112 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311112, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS11112 = nVar2.s0(textController2.j());
                    i0 measurePolicy11113 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar11114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection11113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var11113 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM11113 = ComposedModifierKt.m(pVarF, nVarS11112);
                    ComposeUiNode.Companion companion11113 = ComposeUiNode.INSTANCE;
                    aVarA = companion11113.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB11113 = Updater.b(pVarF);
                    Updater.j(pVarB11113, measurePolicy11113, companion11113.d());
                    Updater.j(pVarB11113, eVar11114, companion11113.b());
                    Updater.j(pVarB11113, layoutDirection11113, companion11113.c());
                    Updater.j(pVarB11113, d2Var11113, companion11113.f());
                    Updater.j(pVarB11113, nVarM11113, companion11113.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311113) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                if ((458752 & i12) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i311113 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311113, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS11113 = nVar2.s0(textController2.j());
                    i0 measurePolicy11114 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar11115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection11114 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var11114 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM11114 = ComposedModifierKt.m(pVarF, nVarS11113);
                    ComposeUiNode.Companion companion11114 = ComposeUiNode.INSTANCE;
                    aVarA = companion11114.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB11114 = Updater.b(pVarF);
                    Updater.j(pVarB11114, measurePolicy11114, companion11114.d());
                    Updater.j(pVarB11114, eVar11115, companion11114.b());
                    Updater.j(pVarB11114, layoutDirection11114, companion11114.c());
                    Updater.j(pVarB11114, d2Var11114, companion11114.f());
                    Updater.j(pVarB11114, nVarM11114, companion11114.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i311114 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311114, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS11114 = nVar2.s0(textController2.j());
                    i0 measurePolicy11115 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar11116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection11115 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var11115 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM11115 = ComposedModifierKt.m(pVarF, nVarS11114);
                    ComposeUiNode.Companion companion11115 = ComposeUiNode.INSTANCE;
                    aVarA = companion11115.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB11115 = Updater.b(pVarF);
                    Updater.j(pVarB11115, measurePolicy11115, companion11115.d());
                    Updater.j(pVarB11115, eVar11116, companion11115.b());
                    Updater.j(pVarB11115, layoutDirection11115, companion11115.c());
                    Updater.j(pVarB11115, d2Var11115, companion11115.f());
                    Updater.j(pVarB11115, nVarM11115, companion11115.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311115) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i11;
            } else {
                i24 = i11;
                if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i311115 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311115, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS11115 = nVar2.s0(textController2.j());
                i0 measurePolicy11116 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar11117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection11116 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var11116 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM11116 = ComposedModifierKt.m(pVarF, nVarS11115);
                ComposeUiNode.Companion companion11116 = ComposeUiNode.INSTANCE;
                aVarA = companion11116.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB11116 = Updater.b(pVarF);
                Updater.j(pVarB11116, measurePolicy11116, companion11116.d());
                Updater.j(pVarB11116, eVar11117, companion11116.b());
                Updater.j(pVarB11116, layoutDirection11116, companion11116.c());
                Updater.j(pVarB11116, d2Var11116, companion11116.f());
                Updater.j(pVarB11116, nVarM11116, companion11116.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            } else {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i311116 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311116, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS11116 = nVar2.s0(textController2.j());
                i0 measurePolicy11117 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar11118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection11117 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var11117 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM11117 = ComposedModifierKt.m(pVarF, nVarS11116);
                ComposeUiNode.Companion companion11117 = ComposeUiNode.INSTANCE;
                aVarA = companion11117.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB11117 = Updater.b(pVarF);
                Updater.j(pVarB11117, measurePolicy11117, companion11117.d());
                Updater.j(pVarB11117, eVar11118, companion11117.b());
                Updater.j(pVarB11117, layoutDirection11117, companion11117.c());
                Updater.j(pVarB11117, d2Var11117, companion11117.f());
                Updater.j(pVarB11117, nVarM11117, companion11117.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311117) {
                    BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.b.f30966u4;
        textStyle2 = textStyle;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & bb.c.g.f32954lc) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    iA = i10;
                    if (pVarF.y(iA)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    if ((458752 & i12) == 0) {
                        z11 = z10;
                        if (pVarF.u(z11)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                        i24 = i11;
                    } else {
                        i24 = i11;
                        if ((i12 & 3670016) == 0) {
                            if (pVarF.y(i24)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                    }
                    if ((i14 & 2995931) == 599186) {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i311117 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311117, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS11117 = nVar2.s0(textController2.j());
                        i0 measurePolicy11118 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar11119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection11118 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var11118 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM11118 = ComposedModifierKt.m(pVarF, nVarS11117);
                        ComposeUiNode.Companion companion11118 = ComposeUiNode.INSTANCE;
                        aVarA = companion11118.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB11118 = Updater.b(pVarF);
                        Updater.j(pVarB11118, measurePolicy11118, companion11118.d());
                        Updater.j(pVarB11118, eVar11119, companion11118.b());
                        Updater.j(pVarB11118, layoutDirection11118, companion11118.c());
                        Updater.j(pVarB11118, d2Var11118, companion11118.f());
                        Updater.j(pVarB11118, nVarM11118, companion11118.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    } else {
                        if (i29 != 0) {
                            nVar2 = androidx.compose.ui.n.INSTANCE;
                        }
                        if (i15 != 0) {
                            textStyleA = TextStyle.INSTANCE.a();
                        } else {
                            textStyleA = textStyle2;
                        }
                        if (i17 != 0) {
                            lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                                public final void a(@dl.d TextLayoutResult it) {
                                    f0.p(it, "it");
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                    a(textLayoutResult);
                                    return b2.f124493a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                        }
                        if (i21 != 0) {
                            z11 = true;
                        }
                        if (i23 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i24;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                        }
                        if (i26 > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (!z12) {
                            throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                        }
                        oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                        eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                        pVarF.T(959238313);
                        if (oVar == null) {
                            jLongValue = 0;
                        } else {
                            jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                                {
                                    super(0);
                                }

                                @Override // yh.a
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Long invoke() {
                                    return Long.valueOf(oVar.e());
                                }
                            }, pVarF, 72, 4)).longValue();
                        }
                        pVarF.c0();
                        pVarF.T(-492369756);
                        objU = pVarF.U();
                        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                            objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                            pVarF.N(objU);
                        }
                        pVarF.c0();
                        textController = (TextController) objU;
                        state = textController.getState();
                        if (pVarF.D()) {
                            int i311118 = iA;
                            textController2 = textController;
                            textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311118, i26));
                        } else {
                            textController2 = textController;
                        }
                        state.m(lVar2);
                        textController2.p(oVar);
                        pVarF.T(959239630);
                        if (oVar != null) {
                            state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                        }
                        pVarF.c0();
                        androidx.compose.ui.n nVarS11118 = nVar2.s0(textController2.j());
                        i0 measurePolicy11119 = textController2.getMeasurePolicy();
                        pVarF.T(544976794);
                        s1.e eVar111110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                        LayoutDirection layoutDirection11119 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                        d2 d2Var11119 = (d2) pVarF.K(CompositionLocalsKt.u());
                        androidx.compose.ui.n nVarM11119 = ComposedModifierKt.m(pVarF, nVarS11118);
                        ComposeUiNode.Companion companion11119 = ComposeUiNode.INSTANCE;
                        aVarA = companion11119.a();
                        pVarF.T(1405779621);
                        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                            ComposablesKt.n();
                        }
                        pVarF.h();
                        if (pVarF.D()) {
                            pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                                @Override // yh.a
                                @dl.d
                                public final ComposeUiNode invoke() {
                                    return aVarA.invoke();
                                }
                            });
                        } else {
                            pVarF.d();
                        }
                        pVarF.Y();
                        androidx.compose.runtime.p pVarB11119 = Updater.b(pVarF);
                        Updater.j(pVarB11119, measurePolicy11119, companion11119.d());
                        Updater.j(pVarB11119, eVar111110, companion11119.b());
                        Updater.j(pVarB11119, layoutDirection11119, companion11119.c());
                        Updater.j(pVarB11119, d2Var11119, companion11119.f());
                        Updater.j(pVarB11119, nVarM11119, companion11119.e());
                        pVarF.x();
                        pVarF.f();
                        pVarF.c0();
                        pVarF.c0();
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        i27 = iA;
                        nVar3 = nVar2;
                        lVar3 = lVar2;
                        i28 = i26;
                        z13 = z11;
                        textStyle3 = textStyleA;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i311119) {
                            BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i14 |= androidx.profileinstaller.o.c.f26824k;
                z11 = z10;
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i311119 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i311119, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS11119 = nVar2.s0(textController2.j());
                    i0 measurePolicy111110 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar111111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111110 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM111110 = ComposedModifierKt.m(pVarF, nVarS11119);
                    ComposeUiNode.Companion companion111110 = ComposeUiNode.INSTANCE;
                    aVarA = companion111110.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111110 = Updater.b(pVarF);
                    Updater.j(pVarB111110, measurePolicy111110, companion111110.d());
                    Updater.j(pVarB111110, eVar111111, companion111110.b());
                    Updater.j(pVarB111110, layoutDirection111110, companion111110.c());
                    Updater.j(pVarB111110, d2Var111110, companion111110.f());
                    Updater.j(pVarB111110, nVarM111110, companion111110.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3111110 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111110, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS111110 = nVar2.s0(textController2.j());
                    i0 measurePolicy111111 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar111112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111111 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM111111 = ComposedModifierKt.m(pVarF, nVarS111110);
                    ComposeUiNode.Companion companion111111 = ComposeUiNode.INSTANCE;
                    aVarA = companion111111.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111111 = Updater.b(pVarF);
                    Updater.j(pVarB111111, measurePolicy111111, companion111111.d());
                    Updater.j(pVarB111111, eVar111112, companion111111.b());
                    Updater.j(pVarB111111, layoutDirection111111, companion111111.c());
                    Updater.j(pVarB111111, d2Var111111, companion111111.f());
                    Updater.j(pVarB111111, nVarM111111, companion111111.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111111) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= 24576;
            iA = i10;
            i21 = i13 & 32;
            if (i21 != 0) {
                if ((458752 & i12) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3111111 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111111, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS111111 = nVar2.s0(textController2.j());
                    i0 measurePolicy111112 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar111113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111112 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM111112 = ComposedModifierKt.m(pVarF, nVarS111111);
                    ComposeUiNode.Companion companion111112 = ComposeUiNode.INSTANCE;
                    aVarA = companion111112.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111112 = Updater.b(pVarF);
                    Updater.j(pVarB111112, measurePolicy111112, companion111112.d());
                    Updater.j(pVarB111112, eVar111113, companion111112.b());
                    Updater.j(pVarB111112, layoutDirection111112, companion111112.c());
                    Updater.j(pVarB111112, d2Var111112, companion111112.f());
                    Updater.j(pVarB111112, nVarM111112, companion111112.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3111112 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111112, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS111112 = nVar2.s0(textController2.j());
                    i0 measurePolicy111113 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar111114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111113 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM111113 = ComposedModifierKt.m(pVarF, nVarS111112);
                    ComposeUiNode.Companion companion111113 = ComposeUiNode.INSTANCE;
                    aVarA = companion111113.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111113 = Updater.b(pVarF);
                    Updater.j(pVarB111113, measurePolicy111113, companion111113.d());
                    Updater.j(pVarB111113, eVar111114, companion111113.b());
                    Updater.j(pVarB111113, layoutDirection111113, companion111113.c());
                    Updater.j(pVarB111113, d2Var111113, companion111113.f());
                    Updater.j(pVarB111113, nVarM111113, companion111113.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111113) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i11;
            } else {
                i24 = i11;
                if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i3111113 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111113, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS111113 = nVar2.s0(textController2.j());
                i0 measurePolicy111114 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar111115 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection111114 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var111114 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM111114 = ComposedModifierKt.m(pVarF, nVarS111113);
                ComposeUiNode.Companion companion111114 = ComposeUiNode.INSTANCE;
                aVarA = companion111114.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB111114 = Updater.b(pVarF);
                Updater.j(pVarB111114, measurePolicy111114, companion111114.d());
                Updater.j(pVarB111114, eVar111115, companion111114.b());
                Updater.j(pVarB111114, layoutDirection111114, companion111114.c());
                Updater.j(pVarB111114, d2Var111114, companion111114.f());
                Updater.j(pVarB111114, nVarM111114, companion111114.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            } else {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i3111114 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111114, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS111114 = nVar2.s0(textController2.j());
                i0 measurePolicy111115 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar111116 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection111115 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var111115 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM111115 = ComposedModifierKt.m(pVarF, nVarS111114);
                ComposeUiNode.Companion companion111115 = ComposeUiNode.INSTANCE;
                aVarA = companion111115.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB111115 = Updater.b(pVarF);
                Updater.j(pVarB111115, measurePolicy111115, companion111115.d());
                Updater.j(pVarB111115, eVar111116, companion111115.b());
                Updater.j(pVarB111115, layoutDirection111115, companion111115.c());
                Updater.j(pVarB111115, d2Var111115, companion111115.f());
                Updater.j(pVarB111115, nVarM111115, companion111115.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111115) {
                    BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= bb.c.d.f31193dj;
        lVar2 = lVar;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((57344 & i12) == 0) {
                iA = i10;
                if (pVarF.y(iA)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                if ((458752 & i12) == 0) {
                    z11 = z10;
                    if (pVarF.u(z11)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                    i24 = i11;
                } else {
                    i24 = i11;
                    if ((i12 & 3670016) == 0) {
                        if (pVarF.y(i24)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                }
                if ((i14 & 2995931) == 599186) {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3111115 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111115, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS111115 = nVar2.s0(textController2.j());
                    i0 measurePolicy111116 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar111117 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111116 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111116 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM111116 = ComposedModifierKt.m(pVarF, nVarS111115);
                    ComposeUiNode.Companion companion111116 = ComposeUiNode.INSTANCE;
                    aVarA = companion111116.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111116 = Updater.b(pVarF);
                    Updater.j(pVarB111116, measurePolicy111116, companion111116.d());
                    Updater.j(pVarB111116, eVar111117, companion111116.b());
                    Updater.j(pVarB111116, layoutDirection111116, companion111116.c());
                    Updater.j(pVarB111116, d2Var111116, companion111116.f());
                    Updater.j(pVarB111116, nVarM111116, companion111116.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                } else {
                    if (i29 != 0) {
                        nVar2 = androidx.compose.ui.n.INSTANCE;
                    }
                    if (i15 != 0) {
                        textStyleA = TextStyle.INSTANCE.a();
                    } else {
                        textStyleA = textStyle2;
                    }
                    if (i17 != 0) {
                        lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                            public final void a(@dl.d TextLayoutResult it) {
                                f0.p(it, "it");
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                                a(textLayoutResult);
                                return b2.f124493a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                    }
                    if (i21 != 0) {
                        z11 = true;
                    }
                    if (i23 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i24;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                    }
                    if (i26 > 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                    }
                    oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                    eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                    pVarF.T(959238313);
                    if (oVar == null) {
                        jLongValue = 0;
                    } else {
                        jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Long invoke() {
                                return Long.valueOf(oVar.e());
                            }
                        }, pVarF, 72, 4)).longValue();
                    }
                    pVarF.c0();
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                        pVarF.N(objU);
                    }
                    pVarF.c0();
                    textController = (TextController) objU;
                    state = textController.getState();
                    if (pVarF.D()) {
                        int i3111116 = iA;
                        textController2 = textController;
                        textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111116, i26));
                    } else {
                        textController2 = textController;
                    }
                    state.m(lVar2);
                    textController2.p(oVar);
                    pVarF.T(959239630);
                    if (oVar != null) {
                        state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                    }
                    pVarF.c0();
                    androidx.compose.ui.n nVarS111116 = nVar2.s0(textController2.j());
                    i0 measurePolicy111117 = textController2.getMeasurePolicy();
                    pVarF.T(544976794);
                    s1.e eVar111118 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection111117 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    d2 d2Var111117 = (d2) pVarF.K(CompositionLocalsKt.u());
                    androidx.compose.ui.n nVarM111117 = ComposedModifierKt.m(pVarF, nVarS111116);
                    ComposeUiNode.Companion companion111117 = ComposeUiNode.INSTANCE;
                    aVarA = companion111117.a();
                    pVarF.T(1405779621);
                    if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVarF.h();
                    if (pVarF.D()) {
                        pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                            @Override // yh.a
                            @dl.d
                            public final ComposeUiNode invoke() {
                                return aVarA.invoke();
                            }
                        });
                    } else {
                        pVarF.d();
                    }
                    pVarF.Y();
                    androidx.compose.runtime.p pVarB111117 = Updater.b(pVarF);
                    Updater.j(pVarB111117, measurePolicy111117, companion111117.d());
                    Updater.j(pVarB111117, eVar111118, companion111117.b());
                    Updater.j(pVarB111117, layoutDirection111117, companion111117.c());
                    Updater.j(pVarB111117, d2Var111117, companion111117.f());
                    Updater.j(pVarB111117, nVarM111117, companion111117.e());
                    pVarF.x();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    i27 = iA;
                    nVar3 = nVar2;
                    lVar3 = lVar2;
                    i28 = i26;
                    z13 = z11;
                    textStyle3 = textStyleA;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111117) {
                        BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i14 |= androidx.profileinstaller.o.c.f26824k;
            z11 = z10;
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i11;
            } else {
                i24 = i11;
                if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i3111117 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111117, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS111117 = nVar2.s0(textController2.j());
                i0 measurePolicy111118 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar111119 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection111118 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var111118 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM111118 = ComposedModifierKt.m(pVarF, nVarS111117);
                ComposeUiNode.Companion companion111118 = ComposeUiNode.INSTANCE;
                aVarA = companion111118.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB111118 = Updater.b(pVarF);
                Updater.j(pVarB111118, measurePolicy111118, companion111118.d());
                Updater.j(pVarB111118, eVar111119, companion111118.b());
                Updater.j(pVarB111118, layoutDirection111118, companion111118.c());
                Updater.j(pVarB111118, d2Var111118, companion111118.f());
                Updater.j(pVarB111118, nVarM111118, companion111118.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            } else {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i3111118 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111118, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS111118 = nVar2.s0(textController2.j());
                i0 measurePolicy111119 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar1111110 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection111119 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var111119 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM111119 = ComposedModifierKt.m(pVarF, nVarS111118);
                ComposeUiNode.Companion companion111119 = ComposeUiNode.INSTANCE;
                aVarA = companion111119.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB111119 = Updater.b(pVarF);
                Updater.j(pVarB111119, measurePolicy111119, companion111119.d());
                Updater.j(pVarB111119, eVar1111110, companion111119.b());
                Updater.j(pVarB111119, layoutDirection111119, companion111119.c());
                Updater.j(pVarB111119, d2Var111119, companion111119.f());
                Updater.j(pVarB111119, nVarM111119, companion111119.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i3111119) {
                    BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= 24576;
        iA = i10;
        i21 = i13 & 32;
        if (i21 != 0) {
            if ((458752 & i12) == 0) {
                z11 = z10;
                if (pVarF.u(z11)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
                i24 = i11;
            } else {
                i24 = i11;
                if ((i12 & 3670016) == 0) {
                    if (pVarF.y(i24)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
            }
            if ((i14 & 2995931) == 599186) {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i3111119 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i3111119, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS111119 = nVar2.s0(textController2.j());
                i0 measurePolicy1111110 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar1111111 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection1111110 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var1111110 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM1111110 = ComposedModifierKt.m(pVarF, nVarS111119);
                ComposeUiNode.Companion companion1111110 = ComposeUiNode.INSTANCE;
                aVarA = companion1111110.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB1111110 = Updater.b(pVarF);
                Updater.j(pVarB1111110, measurePolicy1111110, companion1111110.d());
                Updater.j(pVarB1111110, eVar1111111, companion1111110.b());
                Updater.j(pVarB1111110, layoutDirection1111110, companion1111110.c());
                Updater.j(pVarB1111110, d2Var1111110, companion1111110.f());
                Updater.j(pVarB1111110, nVarM1111110, companion1111110.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            } else {
                if (i29 != 0) {
                    nVar2 = androidx.compose.ui.n.INSTANCE;
                }
                if (i15 != 0) {
                    textStyleA = TextStyle.INSTANCE.a();
                } else {
                    textStyleA = textStyle2;
                }
                if (i17 != 0) {
                    lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                        public final void a(@dl.d TextLayoutResult it) {
                            f0.p(it, "it");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                            a(textLayoutResult);
                            return b2.f124493a;
                        }
                    };
                }
                if (i19 != 0) {
                    iA = androidx.compose.ui.text.style.q.INSTANCE.a();
                }
                if (i21 != 0) {
                    z11 = true;
                }
                if (i23 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i24;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
                }
                if (i26 > 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    throw new IllegalArgumentException("maxLines should be greater than 0".toString());
                }
                oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
                eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
                pVarF.T(959238313);
                if (oVar == null) {
                    jLongValue = 0;
                } else {
                    jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Long invoke() {
                            return Long.valueOf(oVar.e());
                        }
                    }, pVarF, 72, 4)).longValue();
                }
                pVarF.c0();
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                    pVarF.N(objU);
                }
                pVarF.c0();
                textController = (TextController) objU;
                state = textController.getState();
                if (pVarF.D()) {
                    int i31111110 = iA;
                    textController2 = textController;
                    textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31111110, i26));
                } else {
                    textController2 = textController;
                }
                state.m(lVar2);
                textController2.p(oVar);
                pVarF.T(959239630);
                if (oVar != null) {
                    state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
                }
                pVarF.c0();
                androidx.compose.ui.n nVarS1111110 = nVar2.s0(textController2.j());
                i0 measurePolicy1111111 = textController2.getMeasurePolicy();
                pVarF.T(544976794);
                s1.e eVar1111112 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection1111111 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                d2 d2Var1111111 = (d2) pVarF.K(CompositionLocalsKt.u());
                androidx.compose.ui.n nVarM1111111 = ComposedModifierKt.m(pVarF, nVarS1111110);
                ComposeUiNode.Companion companion1111111 = ComposeUiNode.INSTANCE;
                aVarA = companion1111111.a();
                pVarF.T(1405779621);
                if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                    ComposablesKt.n();
                }
                pVarF.h();
                if (pVarF.D()) {
                    pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                        @Override // yh.a
                        @dl.d
                        public final ComposeUiNode invoke() {
                            return aVarA.invoke();
                        }
                    });
                } else {
                    pVarF.d();
                }
                pVarF.Y();
                androidx.compose.runtime.p pVarB1111111 = Updater.b(pVarF);
                Updater.j(pVarB1111111, measurePolicy1111111, companion1111111.d());
                Updater.j(pVarB1111111, eVar1111112, companion1111111.b());
                Updater.j(pVarB1111111, layoutDirection1111111, companion1111111.c());
                Updater.j(pVarB1111111, d2Var1111111, companion1111111.f());
                Updater.j(pVarB1111111, nVarM1111111, companion1111111.e());
                pVarF.x();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                i27 = iA;
                nVar3 = nVar2;
                lVar3 = lVar2;
                i28 = i26;
                z13 = z11;
                textStyle3 = textStyleA;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31111111) {
                    BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i14 |= androidx.profileinstaller.o.c.f26824k;
        z11 = z10;
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
            i24 = i11;
        } else {
            i24 = i11;
            if ((i12 & 3670016) == 0) {
                if (pVarF.y(i24)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
        }
        if ((i14 & 2995931) == 599186) {
            if (i29 != 0) {
                nVar2 = androidx.compose.ui.n.INSTANCE;
            }
            if (i15 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            } else {
                textStyleA = textStyle2;
            }
            if (i17 != 0) {
                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
            }
            if (i19 != 0) {
                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
            }
            if (i21 != 0) {
                z11 = true;
            }
            if (i23 != 0) {
                i26 = Integer.MAX_VALUE;
            } else {
                i26 = i24;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
            }
            if (i26 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
            pVarF.T(959238313);
            if (oVar == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Long invoke() {
                        return Long.valueOf(oVar.e());
                    }
                }, pVarF, 72, 4)).longValue();
            }
            pVarF.c0();
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                pVarF.N(objU);
            }
            pVarF.c0();
            textController = (TextController) objU;
            state = textController.getState();
            if (pVarF.D()) {
                int i31111111 = iA;
                textController2 = textController;
                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31111111, i26));
            } else {
                textController2 = textController;
            }
            state.m(lVar2);
            textController2.p(oVar);
            pVarF.T(959239630);
            if (oVar != null) {
                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
            }
            pVarF.c0();
            androidx.compose.ui.n nVarS1111111 = nVar2.s0(textController2.j());
            i0 measurePolicy1111112 = textController2.getMeasurePolicy();
            pVarF.T(544976794);
            s1.e eVar1111113 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1111112 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var1111112 = (d2) pVarF.K(CompositionLocalsKt.u());
            androidx.compose.ui.n nVarM1111112 = ComposedModifierKt.m(pVarF, nVarS1111111);
            ComposeUiNode.Companion companion1111112 = ComposeUiNode.INSTANCE;
            aVarA = companion1111112.a();
            pVarF.T(1405779621);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // yh.a
                    @dl.d
                    public final ComposeUiNode invoke() {
                        return aVarA.invoke();
                    }
                });
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB1111112 = Updater.b(pVarF);
            Updater.j(pVarB1111112, measurePolicy1111112, companion1111112.d());
            Updater.j(pVarB1111112, eVar1111113, companion1111112.b());
            Updater.j(pVarB1111112, layoutDirection1111112, companion1111112.c());
            Updater.j(pVarB1111112, d2Var1111112, companion1111112.f());
            Updater.j(pVarB1111112, nVarM1111112, companion1111112.e());
            pVarF.x();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            i27 = iA;
            nVar3 = nVar2;
            lVar3 = lVar2;
            i28 = i26;
            z13 = z11;
            textStyle3 = textStyleA;
        } else {
            if (i29 != 0) {
                nVar2 = androidx.compose.ui.n.INSTANCE;
            }
            if (i15 != 0) {
                textStyleA = TextStyle.INSTANCE.a();
            } else {
                textStyleA = textStyle2;
            }
            if (i17 != 0) {
                lVar2 = new yh.l<TextLayoutResult, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$1
                    public final void a(@dl.d TextLayoutResult it) {
                        f0.p(it, "it");
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(TextLayoutResult textLayoutResult) {
                        a(textLayoutResult);
                        return b2.f124493a;
                    }
                };
            }
            if (i19 != 0) {
                iA = androidx.compose.ui.text.style.q.INSTANCE.a();
            }
            if (i21 != 0) {
                z11 = true;
            }
            if (i23 != 0) {
                i26 = Integer.MAX_VALUE;
            } else {
                i26 = i24;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1022429478, i12, -1, "androidx.compose.foundation.text.BasicText (BasicText.kt:58)");
            }
            if (i26 > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (!z12) {
                throw new IllegalArgumentException("maxLines should be greater than 0".toString());
            }
            oVar = (androidx.compose.foundation.text.selection.o) pVarF.K(SelectionRegistrarKt.a());
            eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            bVar = (androidx.compose.ui.text.font.v.b) pVarF.K(CompositionLocalsKt.k());
            pVarF.T(959238313);
            if (oVar == null) {
                jLongValue = 0;
            } else {
                jLongValue = ((Number) RememberSaveableKt.d(new Object[]{text, oVar}, c(oVar), null, new yh.a<Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$selectableId$1
                    {
                        super(0);
                    }

                    @Override // yh.a
                    @dl.d
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Long invoke() {
                        return Long.valueOf(oVar.e());
                    }
                }, pVarF, 72, 4)).longValue();
            }
            pVarF.c0();
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new TextController(new TextState(new p(new androidx.compose.ui.text.d(text, null, null, 6, null), textStyleA, i26, z11, iA, eVar, bVar, null, 128, null), jLongValue));
                pVarF.N(objU);
            }
            pVarF.c0();
            textController = (TextController) objU;
            state = textController.getState();
            if (pVarF.D()) {
                int i31111112 = iA;
                textController2 = textController;
                textController2.o(CoreTextKt.e(state.getTextDelegate(), text, textStyleA, eVar, bVar, z11, i31111112, i26));
            } else {
                textController2 = textController;
            }
            state.m(lVar2);
            textController2.p(oVar);
            pVarF.T(959239630);
            if (oVar != null) {
                state.p(((SelectionColors) pVarF.K(TextSelectionColorsKt.c())).getSelectionBackgroundColor());
            }
            pVarF.c0();
            androidx.compose.ui.n nVarS1111112 = nVar2.s0(textController2.j());
            i0 measurePolicy1111113 = textController2.getMeasurePolicy();
            pVarF.T(544976794);
            s1.e eVar1111114 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection1111113 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var1111113 = (d2) pVarF.K(CompositionLocalsKt.u());
            androidx.compose.ui.n nVarM1111113 = ComposedModifierKt.m(pVarF, nVarS1111112);
            ComposeUiNode.Companion companion1111113 = ComposeUiNode.INSTANCE;
            aVarA = companion1111113.a();
            pVarF.T(1405779621);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.h();
            if (pVarF.D()) {
                pVarF.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText-BpD7jsM$$inlined$Layout$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.ComposeUiNode, java.lang.Object] */
                    @Override // yh.a
                    @dl.d
                    public final ComposeUiNode invoke() {
                        return aVarA.invoke();
                    }
                });
            } else {
                pVarF.d();
            }
            pVarF.Y();
            androidx.compose.runtime.p pVarB1111113 = Updater.b(pVarF);
            Updater.j(pVarB1111113, measurePolicy1111113, companion1111113.d());
            Updater.j(pVarB1111113, eVar1111114, companion1111113.b());
            Updater.j(pVarB1111113, layoutDirection1111113, companion1111113.c());
            Updater.j(pVarB1111113, d2Var1111113, companion1111113.f());
            Updater.j(pVarB1111113, nVarM1111113, companion1111113.e());
            pVarF.x();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            i27 = iA;
            nVar3 = nVar2;
            lVar3 = lVar2;
            i28 = i26;
            z13 = z11;
            textStyle3 = textStyleA;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.text.BasicTextKt$BasicText$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i31111113) {
                BasicTextKt.b(text, nVar3, textStyle3, lVar3, i27, z13, i28, pVar2, i12 | 1, i13);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    private static final androidx.compose.runtime.saveable.e<Long, Long> c(final androidx.compose.foundation.text.selection.o oVar) {
        return SaverKt.a(new yh.p<androidx.compose.runtime.saveable.f, Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$1
            {
                super(2);
            }

            @dl.e
            public final Long a(@dl.d androidx.compose.runtime.saveable.f Saver, long j10) {
                f0.p(Saver, "$this$Saver");
                if (SelectionRegistrarKt.b(oVar, j10)) {
                    return Long.valueOf(j10);
                }
                return null;
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ Long invoke(androidx.compose.runtime.saveable.f fVar, Long l10) {
                return a(fVar, l10.longValue());
            }
        }, new yh.l<Long, Long>() { // from class: androidx.compose.foundation.text.BasicTextKt$selectionIdSaver$2
            @dl.e
            public final Long a(long j10) {
                return Long.valueOf(j10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Long invoke(Long l10) {
                return a(l10.longValue());
            }
        });
    }
}
