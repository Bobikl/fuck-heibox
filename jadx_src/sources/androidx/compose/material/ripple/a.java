package androidx.compose.material.ripple;

import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/material/ripple/a;", "Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "", "bounded", "Ls1/h;", "radius", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/material/ripple/e;", "rippleAlpha", "Landroidx/compose/material/ripple/i;", "b", "(Landroidx/compose/foundation/interaction/e;ZFLandroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/p;I)Landroidx/compose/material/ripple/i;", "<init>", "(ZFLandroidx/compose/runtime/m2;Lkotlin/jvm/internal/u;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class a extends Ripple {
    private a(boolean z10, float f10, m2<l0> m2Var) {
        super(z10, f10, m2Var, null);
    }

    public /* synthetic */ a(boolean z10, float f10, m2 m2Var, u uVar) {
        this(z10, f10, m2Var);
    }

    @Override // androidx.compose.material.ripple.Ripple
    @dl.d
    @androidx.compose.runtime.h
    public i b(@dl.d androidx.compose.foundation.interaction.e interactionSource, boolean z10, float f10, @dl.d m2<l0> color, @dl.d m2<RippleAlpha> rippleAlpha, @dl.e p pVar, int i10) {
        f0.p(interactionSource, "interactionSource");
        f0.p(color, "color");
        f0.p(rippleAlpha, "rippleAlpha");
        pVar.T(-1768051227);
        pVar.T(-3686552);
        boolean zS = pVar.s(interactionSource) | pVar.s(this);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            objU = new CommonRippleIndicationInstance(z10, f10, color, rippleAlpha, null);
            pVar.N(objU);
        }
        pVar.c0();
        CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) objU;
        pVar.c0();
        return commonRippleIndicationInstance;
    }
}
