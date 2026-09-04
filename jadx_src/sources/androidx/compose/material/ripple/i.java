package androidx.compose.material.ripple;

import androidx.compose.foundation.y;
import androidx.compose.runtime.m2;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0011\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Landroidx/compose/material/ripple/i;", "Landroidx/compose/foundation/y;", "Landroidx/compose/foundation/interaction/i$b;", "interaction", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/b2;", "e", "g", "Landroidx/compose/foundation/interaction/d;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/interaction/d;Lkotlinx/coroutines/q0;)V", "Landroidx/compose/ui/graphics/drawscope/g;", "Ls1/h;", "radius", "Landroidx/compose/ui/graphics/l0;", "color", "f", "(Landroidx/compose/ui/graphics/drawscope/g;FJ)V", "Landroidx/compose/material/ripple/StateLayer;", "b", "Landroidx/compose/material/ripple/StateLayer;", "stateLayer", "", "bounded", "Landroidx/compose/runtime/m2;", "Landroidx/compose/material/ripple/e;", "rippleAlpha", "<init>", "(ZLandroidx/compose/runtime/m2;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public abstract class i implements y {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final StateLayer stateLayer;

    public i(boolean z10, @dl.d m2<RippleAlpha> rippleAlpha) {
        f0.p(rippleAlpha, "rippleAlpha");
        this.stateLayer = new StateLayer(z10, rippleAlpha);
    }

    public abstract void e(@dl.d androidx.compose.foundation.interaction.i.b bVar, @dl.d q0 q0Var);

    public final void f(@dl.d androidx.compose.ui.graphics.drawscope.g drawStateLayer, float f10, long j10) {
        f0.p(drawStateLayer, "$this$drawStateLayer");
        this.stateLayer.b(drawStateLayer, f10, j10);
    }

    public abstract void g(@dl.d androidx.compose.foundation.interaction.i.b bVar);

    public final void h(@dl.d androidx.compose.foundation.interaction.d interaction, @dl.d q0 scope) {
        f0.p(interaction, "interaction");
        f0.p(scope, "scope");
        this.stateLayer.c(interaction, scope);
    }
}
