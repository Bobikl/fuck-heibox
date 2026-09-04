package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.f0;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Crossfade.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aZ\u0010\r\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aP\u0010\u000f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0017\u0010\f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0088\u0001\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042%\b\u0002\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00140\t2&\u0010\f\u001a\"\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {androidx.exifinterface.media.a.f23244d5, "targetState", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/animation/core/f0;", "", "animationSpec", "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/Function1;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/n;Landroidx/compose/animation/core/f0;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", ak.aF, "(Ljava/lang/Object;Landroidx/compose/ui/n;Landroidx/compose/animation/core/f0;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/animation/core/Transition;", "Lkotlin/m0;", "name", "", "contentKey", ak.av, "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/n;Landroidx/compose/animation/core/f0;Lyh/l;Lyh/q;Landroidx/compose/runtime/p;II)V", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class CrossfadeKt {
    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[LOOP:1: B:100:0x01ac->B:101:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:104:0x0235  */
    /* JADX WARN: Code duplicated, block: B:107:0x0241  */
    /* JADX WARN: Code duplicated, block: B:108:0x0245  */
    /* JADX WARN: Code duplicated, block: B:111:0x0290  */
    /* JADX WARN: Code duplicated, block: B:115:0x029b  */
    /* JADX WARN: Code duplicated, block: B:117:0x02af  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:123:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:126:0x02db  */
    /* JADX WARN: Code duplicated, block: B:131:0x0304  */
    /* JADX WARN: Code duplicated, block: B:136:0x0312  */
    /* JADX WARN: Code duplicated, block: B:138:0x0192 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x0193 A[EDGE_INSN: B:139:0x0193->B:96:0x0193 BREAK  A[LOOP:0: B:89:0x0172->B:94:0x018f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0100  */
    /* JADX WARN: Code duplicated, block: B:76:0x0123  */
    /* JADX WARN: Code duplicated, block: B:82:0x0147  */
    /* JADX WARN: Code duplicated, block: B:84:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x018f A[LOOP:0: B:89:0x0172->B:94:0x018f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x019d  */
    @j
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final <T> void a(@dl.d final Transition<T> transition, @dl.e androidx.compose.ui.n nVar, @dl.e f0<Float> f0Var, @dl.e yh.l<? super T, ? extends Object> lVar, @dl.d final yh.q<? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        yh.l<? super T, ? extends Object> lVar2;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.n nVar3;
        f0<Float> f0VarQ;
        Object objU;
        androidx.compose.runtime.p.Companion companion;
        Object obj;
        SnapshotStateList snapshotStateList;
        Object objU2;
        Map map;
        Map map2;
        SnapshotStateList snapshotStateList2;
        int i18;
        yh.a<ComposeUiNode> aVarA;
        int i19;
        int size;
        int i20;
        yh.p pVar2;
        final yh.l<? super T, ? extends Object> lVar3;
        final androidx.compose.ui.n nVar4;
        final f0<Float> f0Var2;
        Iterator<T> it;
        int i21;
        int size2;
        int i22;
        boolean zS;
        Object objU3;
        u1 u1VarH;
        kotlin.jvm.internal.f0.p(transition, "<this>");
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(679005231);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(transition) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 1;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 2;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 4;
            if (i14 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    lVar2 = lVar;
                    if (pVarF.s(lVar2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (pVarF.s(content)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i12;
                if (i13 != 2 && (46811 & i17) == 9362 && pVarF.b()) {
                    pVarF.l();
                    nVar4 = nVar2;
                    lVar3 = lVar2;
                    f0Var2 = f0Var;
                } else {
                    if (i23 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                    } else {
                        f0VarQ = f0Var;
                    }
                    if (i14 != 0) {
                        lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                            @Override // yh.l
                            public final T invoke(T t10) {
                                return t10;
                            }
                        };
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                    }
                    pVarF.T(-492369756);
                    objU = pVarF.U();
                    companion = androidx.compose.runtime.p.INSTANCE;
                    obj = objU;
                    if (objU == companion.a()) {
                        SnapshotStateList snapshotStateListF = e2.f();
                        snapshotStateListF.add(transition.h());
                        b2 b2Var = b2.f124493a;
                        pVarF.N(snapshotStateListF);
                        obj = snapshotStateListF;
                    }
                    pVarF.c0();
                    snapshotStateList = (SnapshotStateList) obj;
                    pVarF.T(-492369756);
                    objU2 = pVarF.U();
                    if (objU2 == companion.a()) {
                        objU2 = new LinkedHashMap();
                        pVarF.N(objU2);
                    }
                    pVarF.c0();
                    map = (Map) objU2;
                    pVarF.T(-1621449213);
                    if (kotlin.jvm.internal.f0.g(transition.h(), transition.o()) && (snapshotStateList.size() != 1 || !kotlin.jvm.internal.f0.g(snapshotStateList.get(0), transition.o()))) {
                        pVarF.T(1157296644);
                        zS = pVarF.s(transition);
                        objU3 = pVarF.U();
                        if (zS || objU3 == companion.a()) {
                            objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // yh.l
                                @dl.d
                                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                                public final Boolean invoke(T t10) {
                                    return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t10, transition.o()));
                                }
                            };
                            pVarF.N(objU3);
                        }
                        pVarF.c0();
                        kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                        map.clear();
                    }
                    pVarF.c0();
                    if (!map.containsKey(transition.o())) {
                        it = snapshotStateList.iterator();
                        i21 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i21 = -1;
                                break;
                            } else if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                        if (i21 == -1) {
                            snapshotStateList.add(transition.o());
                        } else {
                            snapshotStateList.set(i21, transition.o());
                        }
                        map.clear();
                        size2 = snapshotStateList.size();
                        i22 = 0;
                        while (i22 < size2) {
                            T t10 = snapshotStateList.get(i22);
                            Map map3 = map;
                            map3.put(t10, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t10, content)));
                            i22++;
                            map = map3;
                            snapshotStateList = snapshotStateList;
                        }
                    }
                    map2 = map;
                    snapshotStateList2 = snapshotStateList;
                    i18 = (i17 >> 3) & 14;
                    pVarF.T(-1990474327);
                    int i24 = i18 >> 3;
                    i0 i0VarK = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i24 & 112) | (i24 & 14));
                    pVarF.T(1376089335);
                    s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    aVarA = companion2.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVar3);
                    i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
                    pVarF.x();
                    qVarF.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
                    pVarF.T(2058660585);
                    pVarF.T(-1253629305);
                    if (((((i19 >> 9) & 14) & 11) ^ 2) == 0 || !pVarF.b()) {
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f5954a;
                        pVarF.T(1930908853);
                        if (((((i18 >> 6) & 112) | 6) & 81) == 16 || !pVarF.b()) {
                            size = snapshotStateList2.size();
                            i20 = 0;
                            while (i20 < size) {
                                SnapshotStateList snapshotStateList3 = snapshotStateList2;
                                Object obj2 = snapshotStateList3.get(i20);
                                pVarF.X(-450541366, lVar2.invoke(obj2));
                                pVar2 = (yh.p) map2.get(obj2);
                                if (pVar2 != null) {
                                    pVar2.invoke(pVarF, 0);
                                    b2 b2Var2 = b2.f124493a;
                                }
                                pVarF.b0();
                                i20++;
                                snapshotStateList2 = snapshotStateList3;
                            }
                        } else {
                            pVarF.l();
                        }
                        pVarF.c0();
                    } else {
                        pVarF.l();
                    }
                    pVarF.c0();
                    pVarF.c0();
                    pVarF.f();
                    pVarF.c0();
                    pVarF.c0();
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    lVar3 = lVar2;
                    nVar4 = nVar3;
                    f0Var2 = f0VarQ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar3, int i25) {
                        CrossfadeKt.a(transition, nVar4, f0Var2, lVar3, content, pVar3, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                        a(pVar3, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            lVar2 = lVar;
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (pVarF.s(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i12;
            if (i13 != 2) {
                if (i23 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // yh.l
                        public final T invoke(T t11) {
                            return t11;
                        }
                    };
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                obj = objU;
                if (objU == companion.a()) {
                    SnapshotStateList snapshotStateListF2 = e2.f();
                    snapshotStateListF2.add(transition.h());
                    b2 b2Var3 = b2.f124493a;
                    pVarF.N(snapshotStateListF2);
                    obj = snapshotStateListF2;
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) obj;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new LinkedHashMap();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                map = (Map) objU2;
                pVarF.T(-1621449213);
                if (kotlin.jvm.internal.f0.g(transition.h(), transition.o())) {
                    pVarF.T(1157296644);
                    zS = pVarF.s(transition);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t11) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t11, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t11) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t11, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                    map.clear();
                }
                pVarF.c0();
                if (!map.containsKey(transition.o())) {
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(transition.o());
                    } else {
                        snapshotStateList.set(i21, transition.o());
                    }
                    map.clear();
                    size2 = snapshotStateList.size();
                    i22 = 0;
                    while (i22 < size2) {
                        T t11 = snapshotStateList.get(i22);
                        Map map4 = map;
                        map4.put(t11, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t11, content)));
                        i22++;
                        map = map4;
                        snapshotStateList = snapshotStateList;
                    }
                }
                map2 = map;
                snapshotStateList2 = snapshotStateList;
                i18 = (i17 >> 3) & 14;
                pVarF.T(-1990474327);
                int i25 = i18 >> 3;
                i0 i0VarK2 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i25 & 112) | (i25 & 14));
                pVarF.T(1376089335);
                s1.e eVar2 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection2 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                aVarA = companion3.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF2 = LayoutKt.f(nVar3);
                i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
                Updater.j(pVarB2, eVar2, companion3.b());
                Updater.j(pVarB2, layoutDirection2, companion3.c());
                pVarF.x();
                qVarF2.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-1253629305);
                if (((((i19 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList4 = snapshotStateList2;
                            Object obj3 = snapshotStateList4.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj3));
                            pVar2 = (yh.p) map2.get(obj3);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var4 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList4;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList5 = snapshotStateList2;
                            Object obj4 = snapshotStateList5.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj4));
                            pVar2 = (yh.p) map2.get(obj4);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var5 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList5;
                        }
                    }
                    pVarF.c0();
                } else {
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList6 = snapshotStateList2;
                            Object obj5 = snapshotStateList6.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj5));
                            pVar2 = (yh.p) map2.get(obj5);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var6 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList6;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList7 = snapshotStateList2;
                            Object obj6 = snapshotStateList7.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj6));
                            pVar2 = (yh.p) map2.get(obj6);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var7 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList7;
                        }
                    }
                    pVarF.c0();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                lVar3 = lVar2;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            } else {
                if (i23 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // yh.l
                        public final T invoke(T t12) {
                            return t12;
                        }
                    };
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                obj = objU;
                if (objU == companion.a()) {
                    SnapshotStateList snapshotStateListF3 = e2.f();
                    snapshotStateListF3.add(transition.h());
                    b2 b2Var8 = b2.f124493a;
                    pVarF.N(snapshotStateListF3);
                    obj = snapshotStateListF3;
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) obj;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new LinkedHashMap();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                map = (Map) objU2;
                pVarF.T(-1621449213);
                if (kotlin.jvm.internal.f0.g(transition.h(), transition.o())) {
                    pVarF.T(1157296644);
                    zS = pVarF.s(transition);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t12) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t12, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t12) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t12, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                    map.clear();
                }
                pVarF.c0();
                if (!map.containsKey(transition.o())) {
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(transition.o());
                    } else {
                        snapshotStateList.set(i21, transition.o());
                    }
                    map.clear();
                    size2 = snapshotStateList.size();
                    i22 = 0;
                    while (i22 < size2) {
                        T t12 = snapshotStateList.get(i22);
                        Map map5 = map;
                        map5.put(t12, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t12, content)));
                        i22++;
                        map = map5;
                        snapshotStateList = snapshotStateList;
                    }
                }
                map2 = map;
                snapshotStateList2 = snapshotStateList;
                i18 = (i17 >> 3) & 14;
                pVarF.T(-1990474327);
                int i26 = i18 >> 3;
                i0 i0VarK3 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i26 & 112) | (i26 & 14));
                pVarF.T(1376089335);
                s1.e eVar3 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection3 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                aVarA = companion4.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF3 = LayoutKt.f(nVar3);
                i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
                Updater.j(pVarB3, eVar3, companion4.b());
                Updater.j(pVarB3, layoutDirection3, companion4.c());
                pVarF.x();
                qVarF3.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-1253629305);
                if (((((i19 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList8 = snapshotStateList2;
                            Object obj7 = snapshotStateList8.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj7));
                            pVar2 = (yh.p) map2.get(obj7);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var9 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList8;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList9 = snapshotStateList2;
                            Object obj8 = snapshotStateList9.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj8));
                            pVar2 = (yh.p) map2.get(obj8);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var10 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList9;
                        }
                    }
                    pVarF.c0();
                } else {
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList10 = snapshotStateList2;
                            Object obj9 = snapshotStateList10.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj9));
                            pVar2 = (yh.p) map2.get(obj9);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var11 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList10;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList11 = snapshotStateList2;
                            Object obj10 = snapshotStateList11.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj10));
                            pVar2 = (yh.p) map2.get(obj10);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var12 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList11;
                        }
                    }
                    pVarF.c0();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                lVar3 = lVar2;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i27) {
                    CrossfadeKt.a(transition, nVar4, f0Var2, lVar3, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 4;
        if (i14 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                lVar2 = lVar;
                if (pVarF.s(lVar2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 8) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (pVarF.s(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i12;
            if (i13 != 2) {
                if (i23 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // yh.l
                        public final T invoke(T t13) {
                            return t13;
                        }
                    };
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                obj = objU;
                if (objU == companion.a()) {
                    SnapshotStateList snapshotStateListF4 = e2.f();
                    snapshotStateListF4.add(transition.h());
                    b2 b2Var13 = b2.f124493a;
                    pVarF.N(snapshotStateListF4);
                    obj = snapshotStateListF4;
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) obj;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new LinkedHashMap();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                map = (Map) objU2;
                pVarF.T(-1621449213);
                if (kotlin.jvm.internal.f0.g(transition.h(), transition.o())) {
                    pVarF.T(1157296644);
                    zS = pVarF.s(transition);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t13) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t13, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t13) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t13, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                    map.clear();
                }
                pVarF.c0();
                if (!map.containsKey(transition.o())) {
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(transition.o());
                    } else {
                        snapshotStateList.set(i21, transition.o());
                    }
                    map.clear();
                    size2 = snapshotStateList.size();
                    i22 = 0;
                    while (i22 < size2) {
                        T t13 = snapshotStateList.get(i22);
                        Map map6 = map;
                        map6.put(t13, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t13, content)));
                        i22++;
                        map = map6;
                        snapshotStateList = snapshotStateList;
                    }
                }
                map2 = map;
                snapshotStateList2 = snapshotStateList;
                i18 = (i17 >> 3) & 14;
                pVarF.T(-1990474327);
                int i27 = i18 >> 3;
                i0 i0VarK4 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i27 & 112) | (i27 & 14));
                pVarF.T(1376089335);
                s1.e eVar4 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection4 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                aVarA = companion5.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF4 = LayoutKt.f(nVar3);
                i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
                Updater.j(pVarB4, eVar4, companion5.b());
                Updater.j(pVarB4, layoutDirection4, companion5.c());
                pVarF.x();
                qVarF4.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-1253629305);
                if (((((i19 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList12 = snapshotStateList2;
                            Object obj11 = snapshotStateList12.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj11));
                            pVar2 = (yh.p) map2.get(obj11);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var14 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList12;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList13 = snapshotStateList2;
                            Object obj12 = snapshotStateList13.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj12));
                            pVar2 = (yh.p) map2.get(obj12);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var15 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList13;
                        }
                    }
                    pVarF.c0();
                } else {
                    BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList14 = snapshotStateList2;
                            Object obj13 = snapshotStateList14.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj13));
                            pVar2 = (yh.p) map2.get(obj13);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var16 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList14;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList15 = snapshotStateList2;
                            Object obj14 = snapshotStateList15.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj14));
                            pVar2 = (yh.p) map2.get(obj14);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var17 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList15;
                        }
                    }
                    pVarF.c0();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                lVar3 = lVar2;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            } else {
                if (i23 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                        @Override // yh.l
                        public final T invoke(T t14) {
                            return t14;
                        }
                    };
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                companion = androidx.compose.runtime.p.INSTANCE;
                obj = objU;
                if (objU == companion.a()) {
                    SnapshotStateList snapshotStateListF5 = e2.f();
                    snapshotStateListF5.add(transition.h());
                    b2 b2Var18 = b2.f124493a;
                    pVarF.N(snapshotStateListF5);
                    obj = snapshotStateListF5;
                }
                pVarF.c0();
                snapshotStateList = (SnapshotStateList) obj;
                pVarF.T(-492369756);
                objU2 = pVarF.U();
                if (objU2 == companion.a()) {
                    objU2 = new LinkedHashMap();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                map = (Map) objU2;
                pVarF.T(-1621449213);
                if (kotlin.jvm.internal.f0.g(transition.h(), transition.o())) {
                    pVarF.T(1157296644);
                    zS = pVarF.s(transition);
                    objU3 = pVarF.U();
                    if (zS) {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t14) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t14, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    } else {
                        objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Boolean invoke(T t14) {
                                return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t14, transition.o()));
                            }
                        };
                        pVarF.N(objU3);
                    }
                    pVarF.c0();
                    kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                    map.clear();
                }
                pVarF.c0();
                if (!map.containsKey(transition.o())) {
                    it = snapshotStateList.iterator();
                    i21 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i21 = -1;
                            break;
                        } else {
                            if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                                break;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (i21 == -1) {
                        snapshotStateList.add(transition.o());
                    } else {
                        snapshotStateList.set(i21, transition.o());
                    }
                    map.clear();
                    size2 = snapshotStateList.size();
                    i22 = 0;
                    while (i22 < size2) {
                        T t14 = snapshotStateList.get(i22);
                        Map map7 = map;
                        map7.put(t14, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t14, content)));
                        i22++;
                        map = map7;
                        snapshotStateList = snapshotStateList;
                    }
                }
                map2 = map;
                snapshotStateList2 = snapshotStateList;
                i18 = (i17 >> 3) & 14;
                pVarF.T(-1990474327);
                int i28 = i18 >> 3;
                i0 i0VarK5 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i28 & 112) | (i28 & 14));
                pVarF.T(1376089335);
                s1.e eVar5 = (s1.e) pVarF.K(CompositionLocalsKt.i());
                LayoutDirection layoutDirection5 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                aVarA = companion6.a();
                yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF5 = LayoutKt.f(nVar3);
                i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
                Updater.j(pVarB5, eVar5, companion6.b());
                Updater.j(pVarB5, layoutDirection5, companion6.c());
                pVarF.x();
                qVarF5.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
                pVarF.T(2058660585);
                pVarF.T(-1253629305);
                if (((((i19 >> 9) & 14) & 11) ^ 2) == 0) {
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList16 = snapshotStateList2;
                            Object obj15 = snapshotStateList16.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj15));
                            pVar2 = (yh.p) map2.get(obj15);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var19 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList16;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList17 = snapshotStateList2;
                            Object obj16 = snapshotStateList17.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj16));
                            pVar2 = (yh.p) map2.get(obj16);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var110 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList17;
                        }
                    }
                    pVarF.c0();
                } else {
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.f5954a;
                    pVarF.T(1930908853);
                    if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList18 = snapshotStateList2;
                            Object obj17 = snapshotStateList18.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj17));
                            pVar2 = (yh.p) map2.get(obj17);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var111 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList18;
                        }
                    } else {
                        size = snapshotStateList2.size();
                        i20 = 0;
                        while (i20 < size) {
                            SnapshotStateList snapshotStateList19 = snapshotStateList2;
                            Object obj18 = snapshotStateList19.get(i20);
                            pVarF.X(-450541366, lVar2.invoke(obj18));
                            pVar2 = (yh.p) map2.get(obj18);
                            if (pVar2 != null) {
                                pVar2.invoke(pVarF, 0);
                                b2 b2Var112 = b2.f124493a;
                            }
                            pVarF.b0();
                            i20++;
                            snapshotStateList2 = snapshotStateList19;
                        }
                    }
                    pVarF.c0();
                }
                pVarF.c0();
                pVarF.c0();
                pVarF.f();
                pVarF.c0();
                pVarF.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                lVar3 = lVar2;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar3, int i29) {
                    CrossfadeKt.a(transition, nVar4, f0Var2, lVar3, content, pVar3, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                    a(pVar3, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        lVar2 = lVar;
        if ((i11 & 8) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (pVarF.s(content)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        i17 = i12;
        if (i13 != 2) {
            if (i23 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
            } else {
                f0VarQ = f0Var;
            }
            if (i14 != 0) {
                lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                    @Override // yh.l
                    public final T invoke(T t15) {
                        return t15;
                    }
                };
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            obj = objU;
            if (objU == companion.a()) {
                SnapshotStateList snapshotStateListF6 = e2.f();
                snapshotStateListF6.add(transition.h());
                b2 b2Var113 = b2.f124493a;
                pVarF.N(snapshotStateListF6);
                obj = snapshotStateListF6;
            }
            pVarF.c0();
            snapshotStateList = (SnapshotStateList) obj;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = new LinkedHashMap();
                pVarF.N(objU2);
            }
            pVarF.c0();
            map = (Map) objU2;
            pVarF.T(-1621449213);
            if (kotlin.jvm.internal.f0.g(transition.h(), transition.o())) {
                pVarF.T(1157296644);
                zS = pVarF.s(transition);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(T t15) {
                            return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t15, transition.o()));
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(T t15) {
                            return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t15, transition.o()));
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                map.clear();
            }
            pVarF.c0();
            if (!map.containsKey(transition.o())) {
                it = snapshotStateList.iterator();
                i21 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i21 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                            break;
                            break;
                        }
                        i21++;
                    }
                }
                if (i21 == -1) {
                    snapshotStateList.add(transition.o());
                } else {
                    snapshotStateList.set(i21, transition.o());
                }
                map.clear();
                size2 = snapshotStateList.size();
                i22 = 0;
                while (i22 < size2) {
                    T t15 = snapshotStateList.get(i22);
                    Map map8 = map;
                    map8.put(t15, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t15, content)));
                    i22++;
                    map = map8;
                    snapshotStateList = snapshotStateList;
                }
            }
            map2 = map;
            snapshotStateList2 = snapshotStateList;
            i18 = (i17 >> 3) & 14;
            pVarF.T(-1990474327);
            int i29 = i18 >> 3;
            i0 i0VarK6 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i29 & 112) | (i29 & 14));
            pVarF.T(1376089335);
            s1.e eVar6 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection6 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            aVarA = companion7.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF6 = LayoutKt.f(nVar3);
            i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
            Updater.j(pVarB6, eVar6, companion7.b());
            Updater.j(pVarB6, layoutDirection6, companion7.c());
            pVarF.x();
            qVarF6.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-1253629305);
            if (((((i19 >> 9) & 14) & 11) ^ 2) == 0) {
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.f5954a;
                pVarF.T(1930908853);
                if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList110 = snapshotStateList2;
                        Object obj19 = snapshotStateList110.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj19));
                        pVar2 = (yh.p) map2.get(obj19);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var114 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList110;
                    }
                } else {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList111 = snapshotStateList2;
                        Object obj110 = snapshotStateList111.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj110));
                        pVar2 = (yh.p) map2.get(obj110);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var115 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList111;
                    }
                }
                pVarF.c0();
            } else {
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.f5954a;
                pVarF.T(1930908853);
                if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList112 = snapshotStateList2;
                        Object obj111 = snapshotStateList112.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj111));
                        pVar2 = (yh.p) map2.get(obj111);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var116 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList112;
                    }
                } else {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList113 = snapshotStateList2;
                        Object obj112 = snapshotStateList113.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj112));
                        pVar2 = (yh.p) map2.get(obj112);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var117 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList113;
                    }
                }
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            lVar3 = lVar2;
            nVar4 = nVar3;
            f0Var2 = f0VarQ;
        } else {
            if (i23 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
            } else {
                f0VarQ = f0Var;
            }
            if (i14 != 0) {
                lVar2 = new yh.l<T, T>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$3
                    @Override // yh.l
                    public final T invoke(T t16) {
                        return t16;
                    }
                };
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(679005231, i17, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:97)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            companion = androidx.compose.runtime.p.INSTANCE;
            obj = objU;
            if (objU == companion.a()) {
                SnapshotStateList snapshotStateListF7 = e2.f();
                snapshotStateListF7.add(transition.h());
                b2 b2Var118 = b2.f124493a;
                pVarF.N(snapshotStateListF7);
                obj = snapshotStateListF7;
            }
            pVarF.c0();
            snapshotStateList = (SnapshotStateList) obj;
            pVarF.T(-492369756);
            objU2 = pVarF.U();
            if (objU2 == companion.a()) {
                objU2 = new LinkedHashMap();
                pVarF.N(objU2);
            }
            pVarF.c0();
            map = (Map) objU2;
            pVarF.T(-1621449213);
            if (kotlin.jvm.internal.f0.g(transition.h(), transition.o())) {
                pVarF.T(1157296644);
                zS = pVarF.s(transition);
                objU3 = pVarF.U();
                if (zS) {
                    objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(T t16) {
                            return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t16, transition.o()));
                        }
                    };
                    pVarF.N(objU3);
                } else {
                    objU3 = new yh.l<T, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // yh.l
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Boolean invoke(T t16) {
                            return Boolean.valueOf(!kotlin.jvm.internal.f0.g(t16, transition.o()));
                        }
                    };
                    pVarF.N(objU3);
                }
                pVarF.c0();
                kotlin.collections.x.I0(snapshotStateList, (yh.l) objU3);
                map.clear();
            }
            pVarF.c0();
            if (!map.containsKey(transition.o())) {
                it = snapshotStateList.iterator();
                i21 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i21 = -1;
                        break;
                    } else {
                        if (kotlin.jvm.internal.f0.g(lVar2.invoke(it.next()), lVar2.invoke(transition.o()))) {
                            break;
                            break;
                        }
                        i21++;
                    }
                }
                if (i21 == -1) {
                    snapshotStateList.add(transition.o());
                } else {
                    snapshotStateList.set(i21, transition.o());
                }
                map.clear();
                size2 = snapshotStateList.size();
                i22 = 0;
                while (i22 < size2) {
                    T t16 = snapshotStateList.get(i22);
                    Map map9 = map;
                    map9.put(t16, androidx.compose.runtime.internal.b.b(pVarF, -1426421288, true, new CrossfadeKt$Crossfade$5$1(transition, i17, f0VarQ, t16, content)));
                    i22++;
                    map = map9;
                    snapshotStateList = snapshotStateList;
                }
            }
            map2 = map;
            snapshotStateList2 = snapshotStateList;
            i18 = (i17 >> 3) & 14;
            pVarF.T(-1990474327);
            int i210 = i18 >> 3;
            i0 i0VarK7 = BoxKt.k(androidx.compose.ui.c.INSTANCE.C(), false, pVarF, (i210 & 112) | (i210 & 14));
            pVarF.T(1376089335);
            s1.e eVar7 = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection7 = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
            aVarA = companion8.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF7 = LayoutKt.f(nVar3);
            i19 = (((i18 << 3) & 112) << 9) & bb.c.g.f32954lc;
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
            Updater.j(pVarB7, eVar7, companion8.b());
            Updater.j(pVarB7, layoutDirection7, companion8.c());
            pVarF.x();
            qVarF7.invoke(v1.a(v1.b(pVarF)), pVarF, Integer.valueOf((i19 >> 3) & 112));
            pVarF.T(2058660585);
            pVarF.T(-1253629305);
            if (((((i19 >> 9) & 14) & 11) ^ 2) == 0) {
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.f5954a;
                pVarF.T(1930908853);
                if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList114 = snapshotStateList2;
                        Object obj113 = snapshotStateList114.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj113));
                        pVar2 = (yh.p) map2.get(obj113);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var119 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList114;
                    }
                } else {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList115 = snapshotStateList2;
                        Object obj114 = snapshotStateList115.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj114));
                        pVar2 = (yh.p) map2.get(obj114);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var1110 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList115;
                    }
                }
                pVarF.c0();
            } else {
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.f5954a;
                pVarF.T(1930908853);
                if (((((i18 >> 6) & 112) | 6) & 81) == 16) {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList116 = snapshotStateList2;
                        Object obj115 = snapshotStateList116.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj115));
                        pVar2 = (yh.p) map2.get(obj115);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var1111 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList116;
                    }
                } else {
                    size = snapshotStateList2.size();
                    i20 = 0;
                    while (i20 < size) {
                        SnapshotStateList snapshotStateList117 = snapshotStateList2;
                        Object obj116 = snapshotStateList117.get(i20);
                        pVarF.X(-450541366, lVar2.invoke(obj116));
                        pVar2 = (yh.p) map2.get(obj116);
                        if (pVar2 != null) {
                            pVar2.invoke(pVarF, 0);
                            b2 b2Var1112 = b2.f124493a;
                        }
                        pVarF.b0();
                        i20++;
                        snapshotStateList2 = snapshotStateList117;
                    }
                }
                pVarF.c0();
            }
            pVarF.c0();
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            lVar3 = lVar2;
            nVar4 = nVar3;
            f0Var2 = f0VarQ;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i211) {
                CrossfadeKt.a(transition, nVar4, f0Var2, lVar3, content, pVar3, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:75:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.h
    public static final <T> void b(final T t10, @dl.e androidx.compose.ui.n nVar, @dl.e f0<Float> f0Var, @dl.e String str, @dl.d final yh.q<? super T, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        String str2;
        int i15;
        int i16;
        androidx.compose.ui.n nVar3;
        f0<Float> f0VarQ;
        String str3;
        final String str4;
        final androidx.compose.ui.n nVar4;
        final f0<Float> f0Var2;
        u1 u1VarH;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-310686752);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(t10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                i12 |= 128;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (pVarF.s(content)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if (i13 != 4 && (46811 & i12) == 9362 && pVarF.b()) {
                    pVarF.l();
                    f0Var2 = f0Var;
                    nVar4 = nVar2;
                    str4 = str2;
                } else {
                    if (i17 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                    } else {
                        f0VarQ = f0Var;
                    }
                    if (i14 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                    }
                    String str5 = str3;
                    a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    str4 = str5;
                    nVar4 = nVar3;
                    f0Var2 = f0VarQ;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                        CrossfadeKt.b(t10, nVar4, f0Var2, str4, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            str2 = str;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.s(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if (i13 != 4) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str6 = str3;
                a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                str4 = str6;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            } else {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str7 = str3;
                a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                str4 = str7;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    CrossfadeKt.b(t10, nVar4, f0Var2, str4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 128;
        }
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                str2 = str;
                if (pVarF.s(str2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (pVarF.s(content)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if (i13 != 4) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str8 = str3;
                a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                str4 = str8;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            } else {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
                } else {
                    f0VarQ = f0Var;
                }
                if (i14 != 0) {
                    str3 = "Crossfade";
                } else {
                    str3 = str2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
                }
                String str9 = str3;
                a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                str4 = str9;
                nVar4 = nVar3;
                f0Var2 = f0VarQ;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    CrossfadeKt.b(t10, nVar4, f0Var2, str4, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        str2 = str;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (pVarF.s(content)) {
                i16 = 16384;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        if (i13 != 4) {
            if (i17 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
            } else {
                f0VarQ = f0Var;
            }
            if (i14 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            String str10 = str3;
            a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            str4 = str10;
            nVar4 = nVar3;
            f0Var2 = f0VarQ;
        } else {
            if (i17 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                f0VarQ = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
            } else {
                f0VarQ = f0Var;
            }
            if (i14 != 0) {
                str3 = "Crossfade";
            } else {
                str3 = str2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-310686752, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:48)");
            }
            String str11 = str3;
            a(androidx.compose.animation.core.TransitionKt.o(t10, str3, pVarF, (i12 & 8) | (i12 & 14) | ((i12 >> 6) & 112), 0), nVar3, f0VarQ, null, content, pVarF, (i12 & 112) | 512 | (i12 & 57344), 4);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            str4 = str11;
            nVar4 = nVar3;
            f0Var2 = f0VarQ;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                CrossfadeKt.b(t10, nVar4, f0Var2, str4, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @kotlin.k(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    @androidx.compose.runtime.h
    public static final /* synthetic */ void c(final Object obj, androidx.compose.ui.n nVar, f0 f0Var, final yh.q content, androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(523603005);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(obj) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(nVar) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            i12 |= pVarF.s(content) ? 2048 : 1024;
        }
        if (i14 == 4 && (i12 & bb.c.f.br) == 1170 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (i14 != 0) {
                f0Var = androidx.compose.animation.core.i.q(0, 0, null, 7, null);
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(523603005, i12, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            a(androidx.compose.animation.core.TransitionKt.o(obj, null, pVarF, (i12 & 8) | (i12 & 14), 2), nVar, f0Var, null, content, pVarF, (i12 & 112) | 512 | ((i12 << 3) & 57344), 4);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final androidx.compose.ui.n nVar2 = nVar;
        final f0 f0Var2 = f0Var;
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                CrossfadeKt.c(obj, nVar2, f0Var2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
