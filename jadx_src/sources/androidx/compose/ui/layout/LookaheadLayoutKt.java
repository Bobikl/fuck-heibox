package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
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

/* JADX INFO: compiled from: LookaheadLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aD\u0010\u000b\u001a\u00020\u00022!\u0010\u0006\u001a\u001d\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0004¢\u0006\u0002\b\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/d0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Landroidx/compose/ui/t;", "Lkotlin/t;", "content", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/layout/i0;", "measurePolicy", ak.av, "(Lyh/q;Landroidx/compose/ui/n;Landroidx/compose/ui/layout/i0;Landroidx/compose/runtime/p;II)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class LookaheadLayoutKt {
    @androidx.compose.ui.g
    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.q<? super d0, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.ui.n nVar, @dl.d final i0 measurePolicy, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.f0.p(content, "content");
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        androidx.compose.runtime.p pVarF = pVar.F(1697006219);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(content) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(nVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            i12 |= pVarF.s(measurePolicy) ? 256 : 128;
        }
        if ((i12 & bb.c.b.f30586db) == 146 && pVarF.b()) {
            pVarF.l();
        } else {
            if (i13 != 0) {
                nVar = androidx.compose.ui.n.INSTANCE;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1697006219, i12, -1, "androidx.compose.ui.layout.LookaheadLayout (LookaheadLayout.kt:67)");
            }
            androidx.compose.ui.n nVarM = ComposedModifierKt.m(pVarF, nVar);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
            pVarF.T(-492369756);
            Object objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new LookaheadLayoutScopeImpl();
                pVarF.N(objU);
            }
            pVarF.c0();
            LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = (LookaheadLayoutScopeImpl) objU;
            yh.a<LayoutNode> aVarA = LayoutNode.INSTANCE.a();
            pVarF.T(-692256719);
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
            androidx.compose.runtime.p pVarB = Updater.b(pVarF);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Updater.j(pVarB, nVarM, companion.e());
            Updater.j(pVarB, measurePolicy, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            Updater.j(pVarB, lookaheadLayoutScopeImpl, new yh.p<LayoutNode, LookaheadLayoutScopeImpl, b2>() { // from class: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$1
                public final void a(@dl.d LayoutNode set, @dl.d LookaheadLayoutScopeImpl scope) {
                    kotlin.jvm.internal.f0.p(set, "$this$set");
                    kotlin.jvm.internal.f0.p(scope, "scope");
                    scope.d(set.Y());
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode, LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl2) {
                    a(layoutNode, lookaheadLayoutScopeImpl2);
                    return b2.f124493a;
                }
            });
            Updater.g(pVarB, new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$1$2
                public final void a(@dl.d LayoutNode init) {
                    kotlin.jvm.internal.f0.p(init, "$this$init");
                    init.x1(true);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                    a(layoutNode);
                    return b2.f124493a;
                }
            });
            pVarF.x();
            pVarF.T(1130448943);
            content.invoke(lookaheadLayoutScopeImpl, pVarF, Integer.valueOf(((i12 << 3) & 112) | 8));
            pVarF.c0();
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        final androidx.compose.ui.n nVar2 = nVar;
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.LookaheadLayoutKt$LookaheadLayout$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i14) {
                LookaheadLayoutKt.a(content, nVar2, measurePolicy, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
