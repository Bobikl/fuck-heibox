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
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.a;
import yh.l;
import yh.q;

/* JADX INFO: compiled from: Selectable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aU\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/n;", "", "selected", "enabled", "Landroidx/compose/ui/semantics/g;", "role", "Lkotlin/Function0;", "Lkotlin/b2;", "onClick", ak.aF, "(Landroidx/compose/ui/n;ZZLandroidx/compose/ui/semantics/g;Lyh/a;)Landroidx/compose/ui/n;", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "Landroidx/compose/foundation/x;", "indication", ak.av, "(Landroidx/compose/ui/n;ZLandroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/x;ZLandroidx/compose/ui/semantics/g;Lyh/a;)Landroidx/compose/ui/n;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SelectableKt {
    @d
    public static final n a(@d n selectable, final boolean z10, @d final g interactionSource, @e final x xVar, final boolean z11, @e final androidx.compose.ui.semantics.g gVar, @d final a<b2> onClick) {
        f0.p(selectable, "$this$selectable");
        f0.p(interactionSource, "interactionSource");
        f0.p(onClick, "onClick");
        return InspectableValueKt.d(selectable, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("selectable");
                x0Var.getProperties().c("selected", Boolean.valueOf(z10));
                x0Var.getProperties().c("interactionSource", interactionSource);
                x0Var.getProperties().c("indication", xVar);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z11));
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), SemanticsModifierKt.c(ClickableKt.c(n.INSTANCE, interactionSource, xVar, z11, null, gVar, onClick, 8, null), false, new l<r, b2>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$4$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d r semantics) {
                f0.p(semantics, "$this$semantics");
                SemanticsPropertiesKt.q0(semantics, z10);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(r rVar) {
                a(rVar);
                return b2.f124493a;
            }
        }, 1, null));
    }

    public static /* synthetic */ n b(n nVar, boolean z10, g gVar, x xVar, boolean z11, androidx.compose.ui.semantics.g gVar2, a aVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        boolean z12 = z11;
        if ((i10 & 16) != 0) {
            gVar2 = null;
        }
        return a(nVar, z10, gVar, xVar, z12, gVar2, aVar);
    }

    @d
    public static final n c(@d n selectable, final boolean z10, final boolean z11, @e final androidx.compose.ui.semantics.g gVar, @d final a<b2> onClick) {
        f0.p(selectable, "$this$selectable");
        f0.p(onClick, "onClick");
        return ComposedModifierKt.g(selectable, InspectableValueKt.e() ? new l<x0, b2>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable-XHw0xAI$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("selectable");
                x0Var.getProperties().c("selected", Boolean.valueOf(z10));
                x0Var.getProperties().c("enabled", Boolean.valueOf(z11));
                x0Var.getProperties().c("role", gVar);
                x0Var.getProperties().c("onClick", onClick);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new q<n, p, Integer, n>() { // from class: androidx.compose.foundation.selection.SelectableKt$selectable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @d
            @h
            public final n a(@d n composed, @e p pVar, int i10) {
                f0.p(composed, "$this$composed");
                pVar.T(-2124609672);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-2124609672, i10, -1, "androidx.compose.foundation.selection.selectable.<anonymous> (Selectable.kt:67)");
                }
                n.Companion companion = n.INSTANCE;
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == p.INSTANCE.a()) {
                    objU = f.a();
                    pVar.N(objU);
                }
                pVar.c0();
                n nVarA = SelectableKt.a(companion, z10, (g) objU, (x) pVar.K(IndicationKt.a()), z11, gVar, onClick);
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

    public static /* synthetic */ n d(n nVar, boolean z10, boolean z11, androidx.compose.ui.semantics.g gVar, a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        return c(nVar, z10, z11, gVar, aVar);
    }
}
