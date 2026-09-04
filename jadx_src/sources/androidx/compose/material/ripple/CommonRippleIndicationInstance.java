package androidx.compose.material.ripple;

import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.snapshots.t;
import androidx.compose.runtime.t1;
import androidx.compose.ui.graphics.l0;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: CommonRipple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B6\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001aø\u0001\u0001¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\f\u0010\n\u001a\u00020\u0006*\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010!\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/CommonRippleIndicationInstance;", "Landroidx/compose/material/ripple/i;", "Landroidx/compose/runtime/t1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Landroidx/compose/ui/graphics/l0;", "color", "Lkotlin/b2;", "j", "(Landroidx/compose/ui/graphics/drawscope/g;J)V", "Landroidx/compose/ui/graphics/drawscope/d;", ak.av, "Landroidx/compose/foundation/interaction/i$b;", "interaction", "Lkotlinx/coroutines/q0;", "scope", "e", "g", "b", "d", ak.aF, "", "Z", "bounded", "Ls1/h;", "F", "radius", "Landroidx/compose/runtime/m2;", "Landroidx/compose/runtime/m2;", "Landroidx/compose/material/ripple/e;", "f", "rippleAlpha", "Landroidx/compose/runtime/snapshots/t;", "Landroidx/compose/material/ripple/RippleAnimation;", "Landroidx/compose/runtime/snapshots/t;", "ripples", "<init>", "(ZFLandroidx/compose/runtime/m2;Landroidx/compose/runtime/m2;Lkotlin/jvm/internal/u;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class CommonRippleIndicationInstance extends i implements t1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float radius;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<l0> color;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t<androidx.compose.foundation.interaction.i.b, RippleAnimation> ripples;

    private CommonRippleIndicationInstance(boolean z10, float f10, m2<l0> m2Var, m2<RippleAlpha> m2Var2) {
        super(z10, m2Var2);
        this.bounded = z10;
        this.radius = f10;
        this.color = m2Var;
        this.rippleAlpha = m2Var2;
        this.ripples = e2.h();
    }

    public /* synthetic */ CommonRippleIndicationInstance(boolean z10, float f10, m2 m2Var, m2 m2Var2, u uVar) {
        this(z10, f10, m2Var, m2Var2);
    }

    private final void j(androidx.compose.ui.graphics.drawscope.g gVar, long j10) {
        Iterator<Map.Entry<androidx.compose.foundation.interaction.i.b, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            RippleAnimation value = it.next().getValue();
            float pressedAlpha = this.rippleAlpha.getValue().getPressedAlpha();
            if (!(pressedAlpha == 0.0f)) {
                value.g(gVar, l0.w(j10, pressedAlpha, 0.0f, 0.0f, 0.0f, 14, null));
            }
        }
    }

    @Override // androidx.compose.foundation.y
    public void a(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        f0.p(dVar, "<this>");
        long jM = this.color.getValue().M();
        dVar.T0();
        f(dVar, this.radius, jM);
        j(dVar, jM);
    }

    @Override // androidx.compose.runtime.t1
    public void b() {
    }

    @Override // androidx.compose.runtime.t1
    public void c() {
        this.ripples.clear();
    }

    @Override // androidx.compose.runtime.t1
    public void d() {
        this.ripples.clear();
    }

    @Override // androidx.compose.material.ripple.i
    public void e(@dl.d androidx.compose.foundation.interaction.i.b interaction, @dl.d q0 scope) {
        f0.p(interaction, "interaction");
        f0.p(scope, "scope");
        Iterator<Map.Entry<androidx.compose.foundation.interaction.i.b, RippleAnimation>> it = this.ripples.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().j();
        }
        RippleAnimation rippleAnimation = new RippleAnimation(this.bounded ? b1.f.d(interaction.getPressPosition()) : null, this.radius, this.bounded, null);
        this.ripples.put(interaction, rippleAnimation);
        kotlinx.coroutines.k.f(scope, null, null, new CommonRippleIndicationInstance$addRipple$2(rippleAnimation, this, interaction, null), 3, null);
    }

    @Override // androidx.compose.material.ripple.i
    public void g(@dl.d androidx.compose.foundation.interaction.i.b interaction) {
        f0.p(interaction, "interaction");
        RippleAnimation rippleAnimation = this.ripples.get(interaction);
        if (rippleAnimation != null) {
            rippleAnimation.j();
        }
    }
}
