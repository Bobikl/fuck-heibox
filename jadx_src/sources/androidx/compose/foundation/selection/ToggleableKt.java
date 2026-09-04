package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.f;
import androidx.compose.foundation.interaction.g;
import androidx.compose.foundation.x;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.h;
import androidx.compose.runtime.p;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.n;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.r;
import androidx.compose.ui.state.ToggleableState;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import k1.a;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: Toggleable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aI\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001a[\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aU\u0010\u0017\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/n;", "", "value", "enabled", "Landroidx/compose/ui/semantics/g;", "role", "Lkotlin/Function1;", "Lkotlin/b2;", "onValueChange", ak.aF, "(Landroidx/compose/ui/n;ZZLandroidx/compose/ui/semantics/g;Lyh/l;)Landroidx/compose/ui/n;", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/foundation/x;", "indication", ak.av, "(Landroidx/compose/ui/n;ZLandroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/x;ZLandroidx/compose/ui/semantics/g;Lyh/l;)Landroidx/compose/ui/n;", "Landroidx/compose/ui/state/ToggleableState;", "state", "Lkotlin/Function0;", "onClick", "g", "(Landroidx/compose/ui/n;Landroidx/compose/ui/state/ToggleableState;ZLandroidx/compose/ui/semantics/g;Lyh/a;)Landroidx/compose/ui/n;", "e", "(Landroidx/compose/ui/n;Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/x;ZLandroidx/compose/ui/semantics/g;Lyh/a;)Landroidx/compose/ui/n;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ToggleableKt {
    @d
    public static final n a(@d n toggleable, final boolean z10, @d final g interactionSource, @e final x xVar, final boolean z11, @e final androidx.compose.ui.semantics.g gVar, @d final l<? super Boolean, b2> onValueChange) {
        f0.p(toggleable, "$this$toggleable");
        f0.p(interactionSource, "interactionSource");
        f0.p(onValueChange, "onValueChange");
        return InspectableValueKt.d(toggleable, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("toggleable");
                x0Var.getProperties().c("value", Boolean.valueOf(z10));
                x0Var.getProperties().c("interactionSource", interactionSource);
                x0Var.getProperties().c("indication", xVar);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z11));
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onValueChange", onValueChange);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), e(n.INSTANCE, a.a(z10), interactionSource, xVar, z11, gVar, new yh.a<b2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                onValueChange.invoke(Boolean.valueOf(!z10));
            }
        }));
    }

    public static /* synthetic */ n b(n nVar, boolean z10, g gVar, x xVar, boolean z11, androidx.compose.ui.semantics.g gVar2, l lVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            gVar2 = null;
        }
        return a(nVar, z10, gVar, xVar, z12, gVar2, lVar);
    }

    @d
    public static final n c(@d n toggleable, final boolean z10, final boolean z11, @e final androidx.compose.ui.semantics.g gVar, @d final l<? super Boolean, b2> onValueChange) {
        f0.p(toggleable, "$this$toggleable");
        f0.p(onValueChange, "onValueChange");
        return ComposedModifierKt.g(toggleable, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("toggleable");
                x0Var.getProperties().c("value", Boolean.valueOf(z10));
                x0Var.getProperties().c("enabled", Boolean.valueOf(z11));
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onValueChange", onValueChange);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<n, p, Integer, n>() { // from class: androidx.compose.foundation.selection.ToggleableKt$toggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @d
            @h
            public final n a(@d n composed, @e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(290332169);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(290332169, i10, -1, "androidx.compose.foundation.selection.toggleable.<anonymous> (Toggleable.kt:65)");
                }
                n.Companion companion = n.INSTANCE;
                boolean z12 = z10;
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == p.INSTANCE.a()) {
                    objU = f.a();
                    pVar.N(objU);
                }
                pVar.c0();
                n nVarA = ToggleableKt.a(companion, z12, (g) objU, (x) pVar.K(IndicationKt.a()), z11, gVar, onValueChange);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarA;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ n invoke(n nVar, p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ n d(n nVar, boolean z10, boolean z11, androidx.compose.ui.semantics.g gVar, l lVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return c(nVar, z10, z11, gVar, lVar);
    }

    @d
    public static final n e(@d n triStateToggleable, @d final ToggleableState state, @d final g interactionSource, @e final x xVar, final boolean z10, @e final androidx.compose.ui.semantics.g gVar, @d final yh.a<b2> onClick) {
        f0.p(triStateToggleable, "$this$triStateToggleable");
        f0.p(state, "state");
        f0.p(interactionSource, "interactionSource");
        f0.p(onClick, "onClick");
        return InspectableValueKt.d(triStateToggleable, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("triStateToggleable");
                x0Var.getProperties().c("state", state);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("interactionSource", interactionSource);
                x0Var.getProperties().c("indication", xVar);
                x0Var.getProperties().c("onClick", onClick);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), SemanticsModifierKt.c(ClickableKt.c(n.INSTANCE, interactionSource, xVar, z10, null, gVar, onClick, 8, null), false, new l<r, b2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$4$1
            {
                super(1);
            }

            public final void a(@d r semantics) {
                f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.z0(semantics, state);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        }, 1, null));
    }

    public static /* synthetic */ n f(n nVar, ToggleableState toggleableState, g gVar, x xVar, boolean z10, androidx.compose.ui.semantics.g gVar2, yh.a aVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            gVar2 = null;
        }
        return e(nVar, toggleableState, gVar, xVar, z11, gVar2, aVar);
    }

    @d
    public static final n g(@d n triStateToggleable, @d final ToggleableState state, final boolean z10, @e final androidx.compose.ui.semantics.g gVar, @d final yh.a<b2> onClick) {
        f0.p(triStateToggleable, "$this$triStateToggleable");
        f0.p(state, "state");
        f0.p(onClick, "onClick");
        return ComposedModifierKt.g(triStateToggleable, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("triStateToggleable");
                x0Var.getProperties().c("state", state);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<n, p, Integer, n>() { // from class: androidx.compose.foundation.selection.ToggleableKt$triStateToggleable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @d
            @h
            public final n a(@d n composed, @e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-1808118329);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1808118329, i10, -1, "androidx.compose.foundation.selection.triStateToggleable.<anonymous> (Toggleable.kt:162)");
                }
                n.Companion companion = n.INSTANCE;
                ToggleableState toggleableState = state;
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == p.INSTANCE.a()) {
                    objU = f.a();
                    pVar.N(objU);
                }
                pVar.c0();
                n nVarE = ToggleableKt.e(companion, toggleableState, (g) objU, (x) pVar.K(IndicationKt.a()), z10, gVar, onClick);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarE;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ n invoke(n nVar, p pVar, Integer num) {
                return a(nVar, pVar, num.intValue());
            }
        });
    }

    public static /* synthetic */ n h(n nVar, ToggleableState toggleableState, boolean z10, androidx.compose.ui.semantics.g gVar, yh.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return g(nVar, toggleableState, z10, gVar, aVar);
    }
}
