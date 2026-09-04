package androidx.compose.ui.layout;

import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.u1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: TestModifierUpdater.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/layout/s1;", "Lkotlin/b2;", "onAttached", ak.av, "(Lyh/l;Landroidx/compose/runtime/p;I)V", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class TestModifierUpdaterKt {
    @kotlin.k(level = DeprecationLevel.ERROR, message = "It is a test API, do not use it in the real applications")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final yh.l<? super s1, b2> onAttached, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        kotlin.jvm.internal.f0.p(onAttached, "onAttached");
        androidx.compose.runtime.p pVarF = pVar.F(-1673066036);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(onAttached) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && pVarF.b()) {
            pVarF.l();
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1673066036, i10, -1, "androidx.compose.ui.layout.TestModifierUpdaterLayout (TestModifierUpdater.kt:45)");
            }
            TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1 = new i0() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1
                @Override // androidx.compose.ui.layout.i0
                @dl.d
                public final j0 a(@dl.d l0 MeasurePolicy, @dl.d List<? extends g0> list, long j10) {
                    kotlin.jvm.internal.f0.p(MeasurePolicy, "$this$MeasurePolicy");
                    kotlin.jvm.internal.f0.p(list, "<anonymous parameter 0>");
                    return k0.p(MeasurePolicy, s1.b.p(j10), s1.b.o(j10), null, new yh.l<e1.a, b2>() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1$measure$1
                        public final void a(@dl.d e1.a layout) {
                            kotlin.jvm.internal.f0.p(layout, "$this$layout");
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(e1.a aVar) {
                            a(aVar);
                            return b2.f124493a;
                        }
                    }, 4, null);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int b(n nVar, List list, int i12) {
                    return h0.c(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int c(n nVar, List list, int i12) {
                    return h0.d(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int d(n nVar, List list, int i12) {
                    return h0.a(this, nVar, list, i12);
                }

                @Override // androidx.compose.ui.layout.i0
                public /* synthetic */ int e(n nVar, List list, int i12) {
                    return h0.b(this, nVar, list, i12);
                }
            };
            final yh.a<LayoutNode> aVarA = LayoutNode.INSTANCE.a();
            pVarF.T(1886828752);
            if (!(pVarF.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVarF.J();
            if (pVarF.D()) {
                pVarF.L(new yh.a<LayoutNode>() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$$inlined$ComposeNode$1
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
            Updater.j(pVarB, testModifierUpdaterKt$TestModifierUpdaterLayout$measurePolicy$1, ComposeUiNode.INSTANCE.d());
            Updater.g(pVarB, new yh.l<LayoutNode, b2>() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                public final void a(@dl.d LayoutNode init) {
                    kotlin.jvm.internal.f0.p(init, "$this$init");
                    onAttached.invoke(new s1(init));
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(LayoutNode layoutNode) {
                    a(layoutNode);
                    return b2.f124493a;
                }
            });
            pVarF.f();
            pVarF.c0();
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.ui.layout.TestModifierUpdaterKt$TestModifierUpdaterLayout$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                TestModifierUpdaterKt.a(onAttached, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
