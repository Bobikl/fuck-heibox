package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LookaheadLayout.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 JD\u0010\u000b\u001a\u00020\u0002*\u00020\u000226\u0010\n\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0003H\u0016Jg\u0010\u0017\u001a\u00020\u0002*\u00020\u00022V\u0010\u0016\u001aR\u0012\u0004\u0012\u00020\r\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\f¢\u0006\u0002\b\u0015H\u0016ø\u0001\u0000R$\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/ui/layout/LookaheadLayoutScopeImpl;", "Landroidx/compose/ui/layout/d0;", "Landroidx/compose/ui/n;", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/a0;", "Lkotlin/m0;", "name", "lookaheadScopeCoordinates", "layoutCoordinates", "Lkotlin/b2;", "onPlaced", "b", "Lkotlin/Function4;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "measurable", "Ls1/b;", "constraints", "Ls1/r;", "lookaheadSize", "Landroidx/compose/ui/layout/j0;", "Lkotlin/t;", "measure", ak.av, "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", ak.aF, "()Landroidx/compose/ui/node/NodeCoordinator;", "d", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "root", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class LookaheadLayoutScopeImpl implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private NodeCoordinator root;

    @Override // androidx.compose.ui.layout.d0
    @dl.d
    public androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.r<? super l0, ? super g0, ? super s1.b, ? super s1.r, ? extends j0> measure) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measure, "measure");
        return nVar.s0(new y(measure, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$intermediateLayout$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("intermediateLayout");
                x0Var.getProperties().c("measure", measure);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @Override // androidx.compose.ui.layout.d0
    @dl.d
    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.p<? super a0, ? super a0, b2> onPlaced) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(onPlaced, "onPlaced");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("onPlaced");
                x0Var.getProperties().c("onPlaced", onPlaced);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-814093691);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-814093691, i10, -1, "androidx.compose.ui.layout.LookaheadLayoutScopeImpl.onPlaced.<anonymous> (LookaheadLayout.kt:176)");
                }
                yh.p<a0, a0, b2> pVar2 = onPlaced;
                final LookaheadLayoutScopeImpl lookaheadLayoutScopeImpl = this;
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new e0(pVar2, new yh.a<a0>() { // from class: androidx.compose.ui.layout.LookaheadLayoutScopeImpl$onPlaced$2$1$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final a0 invoke() {
                            NodeCoordinator root = lookaheadLayoutScopeImpl.getRoot();
                            if (root != null) {
                                androidx.compose.ui.node.i0 lookaheadDelegate = root.getLookaheadDelegate();
                                kotlin.jvm.internal.f0.m(lookaheadDelegate);
                                b0 lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates();
                                if (lookaheadLayoutCoordinates != null) {
                                    return lookaheadLayoutCoordinates;
                                }
                            }
                            throw new IllegalStateException("Lookahead root has not been set up yet".toString());
                        }
                    });
                    pVar.N(objU);
                }
                pVar.c0();
                androidx.compose.ui.n nVarS0 = composed.s0((androidx.compose.ui.n) objU);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.e
    /* JADX INFO: renamed from: c, reason: from getter */
    public final NodeCoordinator getRoot() {
        return this.root;
    }

    public final void d(@dl.e NodeCoordinator nodeCoordinator) {
        this.root = nodeCoordinator;
    }
}
