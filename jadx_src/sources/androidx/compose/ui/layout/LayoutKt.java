package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Layout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\t\u001a\u00020\u00012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0087\b¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\u0010\u001a\u00020\u00012\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000fH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a=\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u001c\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00030\rH\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a6\u0010\u0018\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00172\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a9\u0010\u001a\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b\u009920\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/Function0;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Landroidx/compose/ui/t;", "content", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/ui/layout/i0;", "measurePolicy", ak.aF, "(Lyh/p;Landroidx/compose/ui/n;Landroidx/compose/ui/layout/i0;Landroidx/compose/runtime/p;II)V", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/ui/layout/i0;Landroidx/compose/runtime/p;II)V", "", "contents", "Landroidx/compose/ui/layout/q0;", "b", "(Ljava/util/List;Landroidx/compose/ui/n;Landroidx/compose/ui/layout/q0;Landroidx/compose/runtime/p;II)V", "e", "(Ljava/util/List;)Lyh/p;", "Lkotlin/Function1;", "Landroidx/compose/runtime/v1;", "Landroidx/compose/ui/node/ComposeUiNode;", "Lkotlin/t;", "f", "(Landroidx/compose/ui/n;)Lyh/q;", "d", "(Landroidx/compose/ui/n;Lyh/p;Landroidx/compose/ui/layout/i0;Landroidx/compose/runtime/p;II)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class LayoutKt {
    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void a(@dl.e androidx.compose.ui.n nVar, @dl.d i0 measurePolicy, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        pVar.T(544976794);
        if ((i11 & 1) != 0) {
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
        androidx.compose.ui.n nVarM = ComposedModifierKt.m(pVar, nVar);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        final yh.a<ComposeUiNode> aVarA = companion.a();
        pVar.T(1405779621);
        if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(new yh.a<ComposeUiNode>() { // from class: androidx.compose.ui.layout.LayoutKt$Layout$$inlined$ReusableComposeNode$1
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
            pVar.d();
        }
        pVar.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar);
        Updater.j(pVarB, measurePolicy, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        Updater.j(pVarB, nVarM, companion.e());
        pVar.x();
        pVar.f();
        pVar.c0();
        pVar.c0();
    }

    @androidx.compose.ui.g
    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void b(@dl.d List<? extends yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>> contents, @dl.e androidx.compose.ui.n nVar, @dl.d q0 measurePolicy, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(contents, "contents");
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        pVar.T(1399185516);
        if ((i11 & 2) != 0) {
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        yh.p<androidx.compose.runtime.p, Integer, b2> pVarE = e(contents);
        pVar.T(1157296644);
        boolean zS = pVar.s(measurePolicy);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = r0.a(measurePolicy);
            pVar.N(objU);
        }
        pVar.c0();
        i0 i0Var = (i0) objU;
        int i12 = i10 & 112;
        pVar.T(-1323940314);
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion.a();
        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = f(nVar);
        int i13 = ((i12 << 9) & bb.c.g.f32954lc) | 6;
        if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(aVarA);
        } else {
            pVar.d();
        }
        pVar.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar);
        Updater.j(pVarB, i0Var, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar.x();
        qVarF.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i13 >> 3) & 112));
        pVar.T(2058660585);
        pVarE.invoke(pVar, Integer.valueOf((i13 >> 9) & 14));
        pVar.c0();
        pVar.f();
        pVar.c0();
        pVar.c0();
    }

    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void c(@dl.d yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.ui.n nVar, @dl.d i0 measurePolicy, @dl.e androidx.compose.runtime.p pVar, int i10, int i11) {
        kotlin.jvm.internal.f0.p(content, "content");
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        pVar.T(-1323940314);
        if ((i11 & 2) != 0) {
            nVar = androidx.compose.ui.n.INSTANCE;
        }
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        yh.a<ComposeUiNode> aVarA = companion.a();
        yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = f(nVar);
        int i12 = ((i10 << 9) & bb.c.g.f32954lc) | 6;
        if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
            ComposablesKt.n();
        }
        pVar.h();
        if (pVar.D()) {
            pVar.L(aVarA);
        } else {
            pVar.d();
        }
        pVar.Y();
        androidx.compose.runtime.p pVarB = Updater.b(pVar);
        Updater.j(pVarB, measurePolicy, companion.d());
        Updater.j(pVarB, eVar, companion.b());
        Updater.j(pVarB, layoutDirection, companion.c());
        Updater.j(pVarB, d2Var, companion.f());
        pVar.x();
        qVarF.invoke(v1.a(v1.b(pVar)), pVar, Integer.valueOf((i12 >> 3) & 112));
        pVar.T(2058660585);
        content.invoke(pVar, Integer.valueOf((i12 >> 9) & 14));
        pVar.c0();
        pVar.f();
        pVar.c0();
    }

    @kotlin.k(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    @androidx.compose.ui.t
    @androidx.compose.runtime.h
    public static final void d(@dl.e androidx.compose.ui.n nVar, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.d final i0 measurePolicy, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        kotlin.jvm.internal.f0.p(content, "content");
        kotlin.jvm.internal.f0.p(measurePolicy, "measurePolicy");
        androidx.compose.runtime.p pVarF = pVar.F(1949933075);
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
            i12 |= pVarF.s(content) ? 32 : 16;
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
                ComposerKt.w0(1949933075, i12, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:205)");
            }
            androidx.compose.ui.n nVarM = ComposedModifierKt.m(pVarF, nVar);
            s1.e eVar = (s1.e) pVarF.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVarF.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVarF.K(CompositionLocalsKt.u());
            yh.a<LayoutNode> aVarA = LayoutNode.INSTANCE.a();
            int i14 = ((i12 << 3) & bb.c.b.f30796me) | 6;
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
            Updater.g(pVarB, new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                public final void a(@dl.d LayoutNode init) {
                    kotlin.jvm.internal.f0.p(init, "$this$init");
                    init.t1(true);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                    a(layoutNode);
                    return b2.f124493a;
                }
            });
            pVarF.x();
            content.invoke(pVarF, Integer.valueOf((i14 >> 6) & 14));
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
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i15) {
                LayoutKt.d(nVar2, content, measurePolicy, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    @kotlin.r0
    public static final yh.p<androidx.compose.runtime.p, Integer, b2> e(@dl.d final List<? extends yh.p<? super androidx.compose.runtime.p, ? super Integer, b2>> contents) {
        kotlin.jvm.internal.f0.p(contents, "contents");
        return androidx.compose.runtime.internal.b.c(-1953651383, true, new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
            @androidx.compose.runtime.h
            public final void a(@dl.e androidx.compose.runtime.p pVar, int i10) {
                if ((i10 & 11) == 2 && pVar.b()) {
                    pVar.l();
                    return;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1953651383, i10, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:178)");
                }
                List<yh.p<androidx.compose.runtime.p, Integer, b2>> list = contents;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    yh.p<androidx.compose.runtime.p, Integer, b2> pVar2 = list.get(i11);
                    yh.a<ComposeUiNode> aVarG = ComposeUiNode.INSTANCE.g();
                    pVar.T(-692256719);
                    if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar.h();
                    if (pVar.D()) {
                        pVar.L(aVarG);
                    } else {
                        pVar.d();
                    }
                    pVar.Y();
                    Updater.b(pVar);
                    pVar.x();
                    pVar2.invoke(pVar, 0);
                    pVar.f();
                    pVar.c0();
                }
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar, Integer num) {
                a(pVar, num.intValue());
                return b2.f124493a;
            }
        });
    }

    @dl.d
    @kotlin.r0
    public static final yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> f(@dl.d final androidx.compose.ui.n modifier) {
        kotlin.jvm.internal.f0.p(modifier, "modifier");
        return androidx.compose.runtime.internal.b.c(-1586257396, true, new yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @androidx.compose.runtime.h
            public final void a(@dl.d androidx.compose.runtime.p pVar, @dl.e androidx.compose.runtime.p pVar2, int i10) {
                kotlin.jvm.internal.f0.p(pVar, "$this$null");
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1586257396, i10, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:191)");
                }
                androidx.compose.ui.n nVarM = ComposedModifierKt.m(pVar2, modifier);
                pVar.T(509942095);
                Updater.j(Updater.b(pVar), nVarM, ComposeUiNode.INSTANCE.e());
                pVar.c0();
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ b2 invoke(v1<ComposeUiNode> v1Var, androidx.compose.runtime.p pVar, Integer num) {
                a(v1Var.getComposer(), pVar, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
