package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.l0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Ripple.android.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004JI\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material/ripple/c;", "Landroidx/compose/material/ripple/Ripple;", "Landroid/view/ViewGroup;", ak.aF, "(Landroidx/compose/runtime/p;I)Landroid/view/ViewGroup;", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "", "bounded", "Ls1/h;", "radius", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/material/ripple/e;", "rippleAlpha", "Landroidx/compose/material/ripple/i;", "b", "(Landroidx/compose/foundation/interaction/e;ZFLandroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/p;I)Landroidx/compose/material/ripple/i;", "<init>", "(ZFLandroidx/compose/runtime/m2;Lkotlin/jvm/internal/u;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class c extends Ripple {
    private c(boolean z10, float f10, m2<l0> m2Var) {
        super(z10, f10, m2Var, null);
    }

    public /* synthetic */ c(boolean z10, float f10, m2 m2Var, u uVar) {
        this(z10, f10, m2Var);
    }

    @androidx.compose.runtime.h
    private final ViewGroup c(p pVar, int i10) {
        pVar.T(-1737891121);
        Object objK = pVar.K(AndroidCompositionLocals_androidKt.k());
        while (!(objK instanceof ViewGroup)) {
            ViewParent parent = ((View) objK).getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + objK + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            f0.o(parent, "parent");
            objK = parent;
        }
        ViewGroup viewGroup = (ViewGroup) objK;
        pVar.c0();
        return viewGroup;
    }

    @Override // androidx.compose.material.ripple.Ripple
    @dl.d
    @androidx.compose.runtime.h
    public i b(@dl.d androidx.compose.foundation.interaction.e interactionSource, boolean z10, float f10, @dl.d m2<l0> color, @dl.d m2<RippleAlpha> rippleAlpha, @dl.e p pVar, int i10) {
        f0.p(interactionSource, "interactionSource");
        f0.p(color, "color");
        f0.p(rippleAlpha, "rippleAlpha");
        pVar.T(331259447);
        ViewGroup viewGroupC = c(pVar, (i10 >> 15) & 14);
        pVar.T(1643267286);
        if (viewGroupC.isInEditMode()) {
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
            pVar.c0();
            return commonRippleIndicationInstance;
        }
        pVar.c0();
        View rippleContainer = null;
        int childCount = viewGroupC.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroupC.getChildAt(i11);
            if (childAt instanceof RippleContainer) {
                rippleContainer = childAt;
                break;
            }
        }
        if (rippleContainer == null) {
            Context context = viewGroupC.getContext();
            f0.o(context, "view.context");
            rippleContainer = new RippleContainer(context);
            viewGroupC.addView(rippleContainer);
        }
        pVar.T(-3686095);
        boolean zS2 = pVar.s(interactionSource) | pVar.s(this) | pVar.s(rippleContainer);
        Object objU2 = pVar.U();
        if (zS2 || objU2 == p.INSTANCE.a()) {
            objU2 = new AndroidRippleIndicationInstance(z10, f10, color, rippleAlpha, (RippleContainer) rippleContainer, null);
            pVar.N(objU2);
        }
        pVar.c0();
        AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) objU2;
        pVar.c0();
        return androidRippleIndicationInstance;
    }
}
