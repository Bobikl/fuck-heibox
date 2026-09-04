package androidx.compose.material.ripple;

import androidx.compose.foundation.b0;
import androidx.compose.foundation.x;
import androidx.compose.foundation.y;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.j2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.p;
import androidx.compose.ui.graphics.l0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@j2
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u001d\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/ripple/Ripple;", "Landroidx/compose/foundation/x;", "Landroidx/compose/foundation/interaction/e;", "interactionSource", "Landroidx/compose/foundation/y;", ak.av, "(Landroidx/compose/foundation/interaction/e;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/y;", "", "bounded", "Ls1/h;", "radius", "Landroidx/compose/runtime/m2;", "Landroidx/compose/ui/graphics/l0;", "color", "Landroidx/compose/material/ripple/e;", "rippleAlpha", "Landroidx/compose/material/ripple/i;", "b", "(Landroidx/compose/foundation/interaction/e;ZFLandroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Landroidx/compose/runtime/p;I)Landroidx/compose/material/ripple/i;", "", "other", "equals", "", "hashCode", "Z", "F", ak.aF, "Landroidx/compose/runtime/m2;", "<init>", "(ZFLandroidx/compose/runtime/m2;Lkotlin/jvm/internal/u;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public abstract class Ripple implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<l0> color;

    private Ripple(boolean z10, float f10, m2<l0> m2Var) {
        this.bounded = z10;
        this.radius = f10;
        this.color = m2Var;
    }

    public /* synthetic */ Ripple(boolean z10, float f10, m2 m2Var, u uVar) {
        this(z10, f10, m2Var);
    }

    @Override // androidx.compose.foundation.x
    @dl.d
    @androidx.compose.runtime.h
    public final y a(@dl.d androidx.compose.foundation.interaction.e interactionSource, @dl.e p pVar, int i10) {
        f0.p(interactionSource, "interactionSource");
        pVar.T(988743187);
        k kVar = (k) pVar.K(RippleThemeKt.d());
        pVar.T(-1524341038);
        long jM = (this.color.getValue().M() > l0.INSTANCE.u() ? 1 : (this.color.getValue().M() == l0.INSTANCE.u() ? 0 : -1)) != 0 ? this.color.getValue().M() : kVar.a(pVar, 0);
        pVar.c0();
        i iVarB = b(interactionSource, this.bounded, this.radius, e2.t(l0.n(jM), pVar, 0), e2.t(kVar.b(pVar, 0), pVar, 0), pVar, (i10 & 14) | (458752 & (i10 << 12)));
        EffectsKt.g(iVarB, interactionSource, new Ripple$rememberUpdatedInstance$1(interactionSource, iVarB, null), pVar, ((i10 << 3) & 112) | bb.c.b.f30512a7);
        pVar.c0();
        return iVarB;
    }

    @dl.d
    @androidx.compose.runtime.h
    public abstract i b(@dl.d androidx.compose.foundation.interaction.e eVar, boolean z10, float f10, @dl.d m2<l0> m2Var, @dl.d m2<RippleAlpha> m2Var2, @dl.e p pVar, int i10);

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Ripple)) {
            return false;
        }
        Ripple ripple = (Ripple) other;
        return this.bounded == ripple.bounded && s1.h.l(this.radius, ripple.radius) && f0.g(this.color, ripple.color);
    }

    public int hashCode() {
        return (((b0.a(this.bounded) * 31) + s1.h.n(this.radius)) * 31) + this.color.hashCode();
    }
}
