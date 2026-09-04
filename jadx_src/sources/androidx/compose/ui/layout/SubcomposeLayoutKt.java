package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.u1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: SubcomposeLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aC\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001d\u0010\u0007\u001a\u0019\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0002\b\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/n;", "modifier", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/q1;", "Ls1/b;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/t;", "measurePolicy", "Lkotlin/b2;", ak.av, "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "state", "b", "(Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/runtime/p;II)V", "", "maxSlotsToRetainForReuse", "Landroidx/compose/ui/layout/r1;", ak.aF, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class SubcomposeLayoutKt {
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.e final androidx.compose.ui.n nVar, @dl.d final yh.p<? super q1, ? super s1.b, ? extends j0> measurePolicy, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        androidx.compose.runtime.p pVarF = pVar.F(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(nVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(measurePolicy) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1298353104, i12, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:70)");
            }
            pVarF.T(-492369756);
            Object objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new SubcomposeLayoutState();
                pVarF.N(objU);
            }
            pVarF.c0();
            SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objU;
            int i14 = i12 << 3;
            b(subcomposeLayoutState, nVar, measurePolicy, pVarF, (i14 & 112) | 8 | (i14 & bb.c.b.f30796me), 0);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                SubcomposeLayoutKt.a(nVar, measurePolicy, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void b(@dl.d final SubcomposeLayoutState state, @dl.e androidx.compose.ui.n nVar, @dl.d final yh.p<? super q1, ? super s1.b, ? extends j0> measurePolicy, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        androidx.compose.runtime.p pVarF = pVar.F(-511989831);
        if ((i11 & 2) != 0) {
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        final androidx.compose.ui.n nVar2 = nVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(-511989831, i10, -1, "androidx.compose.ui.layout.SubcomposeLayout (SubcomposeLayout.kt:103)");
        }
        androidx.compose.runtime.r rVarU = ComposablesKt.u(pVarF, 0);
        androidx.compose.ui.n nVarM = ComposedModifierKt.m(pVarF, nVar2);
        s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
        final yh.a<LayoutNode> aVarA = LayoutNode.INSTANCE.a();
        pVarF.T(1886828752);
        if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVarF.J();
        if (pVarF.D()) {
            pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$$inlined$ComposeNode$1
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.ui.node.LayoutNode, java.lang.Object] */
                @Override // yh.a
                @dl.d
                public final LayoutNode invoke() {
                    return aVarA.invoke();
                }
            });
        } else {
            pVarF.d();
        }
        androidx.compose.runtime.p pVarB = Updater.b(pVarF);
        Updater.j(pVarB, state, state.h());
        Updater.j(pVarB, rVarU, state.f());
        Updater.j(pVarB, measurePolicy, state.g());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        Updater.j(pVarB, nVarM, companion.e());
        pVarF.f();
        pVarF.c0();
        pVarF.T(-607848778);
        if (!pVarF.b()) {
            EffectsKt.k(new yh.a<b2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4
                {
                    super(0);
                }

                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    state.e();
                }
            }, pVarF, 0);
        }
        pVarF.c0();
        final m2 m2VarT = e2.t(state, pVarF, 8);
        b2 b2Var = b2.f124493a;
        pVarF.T(1157296644);
        boolean zS = pVarF.s(m2VarT);
        Object objU = pVarF.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.l<androidx.compose.runtime.f0, androidx.compose.runtime.e0>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$5$1

                /* JADX INFO: compiled from: Effects.kt */
                @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/f0$a", "Landroidx/compose/runtime/e0;", "Lkotlin/b2;", "dispose", "runtime_release"}, k = 1, mv = {1, 7, 1})
                public static final class a implements androidx.compose.runtime.e0 {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ m2 f14957a;

                    public a(m2 m2Var) {
                        this.f14957a = m2Var;
                    }

                    @Override // androidx.compose.runtime.e0
                    public void dispose() {
                        ((SubcomposeLayoutState) this.f14957a.getValue()).d();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final androidx.compose.runtime.e0 invoke(@dl.d androidx.compose.runtime.f0 DisposableEffect) {
                    kotlin.jvm.internal.f0.p(DisposableEffect, "$this$DisposableEffect");
                    return new a(m2VarT);
                }
            };
            pVarF.N(objU);
        }
        pVarF.c0();
        EffectsKt.c(b2Var, (yh.l) objU, pVarF, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                SubcomposeLayoutKt.b(state, nVar2, measurePolicy, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    public static final r1 c(int i10) {
        return new f(i10);
    }
}
