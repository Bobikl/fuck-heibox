package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.SolidColor;
import kotlin.Metadata;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"", "enabled", "isError", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/material3/x1;", "colors", "Ls1/h;", "focusedBorderThickness", "unfocusedBorderThickness", "Landroidx/compose/runtime/m2;", "Landroidx/compose/foundation/g;", "b", "(ZZLandroidx/compose/foundation/interaction/e;Landroidx/compose/material3/x1;FFLandroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "material3_release"}, k = 2, mv = {1, 7, 1})
public final class y1 {
    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final m2<BorderStroke> b(boolean z10, boolean z11, androidx.compose.foundation.interaction.e eVar, x1 x1Var, float f10, float f11, androidx.compose.runtime.p pVar, int i10) {
        m2 m2VarT;
        pVar.T(-1633063017);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1633063017, i10, -1, "androidx.compose.material3.animateBorderStrokeAsState (TextFieldDefaults.kt:943)");
        }
        m2<Boolean> m2VarA = FocusInteractionKt.a(eVar, pVar, (i10 >> 6) & 14);
        m2<androidx.compose.ui.graphics.l0> m2VarE = x1Var.e(z10, z11, eVar, pVar, (i10 & 14) | (i10 & 112) | (i10 & bb.c.b.f30796me) | (i10 & bb.c.g.f32954lc));
        float f12 = c(m2VarA) ? f10 : f11;
        if (z10) {
            pVar.T(-1927801001);
            m2VarT = AnimateAsStateKt.d(f12, androidx.compose.animation.core.i.q(150, 0, null, 6, null), null, pVar, 48, 4);
            pVar.c0();
        } else {
            pVar.T(-1927800903);
            m2VarT = androidx.compose.runtime.e2.t(s1.h.d(f11), pVar, (i10 >> 15) & 14);
            pVar.c0();
        }
        m2<BorderStroke> m2VarT2 = androidx.compose.runtime.e2.t(new BorderStroke(((s1.h) m2VarT.getValue()).w(), new SolidColor(m2VarE.getValue().M(), null), null), pVar, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return m2VarT2;
    }

    private static final boolean c(m2<Boolean> m2Var) {
        return m2Var.getValue().booleanValue();
    }
}
