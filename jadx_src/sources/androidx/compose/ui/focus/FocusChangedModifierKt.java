package androidx.compose.ui.focus;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FocusChangedModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/v;", "Lkotlin/b2;", "onFocusChanged", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class FocusChangedModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super v, b2> onFocusChanged) {
        f0.p(nVar, "<this>");
        f0.p(onFocusChanged, "onFocusChanged");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("onFocusChanged");
                x0Var.getProperties().c("onFocusChanged", onFocusChanged);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-1741761824);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741761824, i10, -1, "androidx.compose.ui.focus.onFocusChanged.<anonymous> (FocusChangedModifier.kt:41)");
                }
                pVar.T(-492369756);
                Object objU = pVar.U();
                androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
                if (objU == companion.a()) {
                    objU = h2.g(null, null, 2, null);
                    pVar.N(objU);
                }
                pVar.c0();
                final a1 a1Var = (a1) objU;
                androidx.compose.ui.n.Companion companion2 = androidx.compose.ui.n.INSTANCE;
                final yh.l<v, b2> lVar = onFocusChanged;
                pVar.T(511388516);
                boolean zS = pVar.s(a1Var) | pVar.s(lVar);
                Object objU2 = pVar.U();
                if (zS || objU2 == companion.a()) {
                    objU2 = new yh.l<v, b2>() { // from class: androidx.compose.ui.focus.FocusChangedModifierKt$onFocusChanged$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void a(@dl.d v it) {
                            f0.p(it, "it");
                            if (f0.g(a1Var.getValue(), it)) {
                                return;
                            }
                            a1Var.setValue(it);
                            lVar.invoke(it);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ b2 invoke(v vVar) {
                            a(vVar);
                            return b2.f124493a;
                        }
                    };
                    pVar.N(objU2);
                }
                pVar.c0();
                androidx.compose.ui.n nVarB = FocusEventModifierKt.b(companion2, (yh.l) objU2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarB;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }
}
