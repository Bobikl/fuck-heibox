package androidx.compose.material.ripple;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.m2;
import androidx.compose.ui.graphics.k0;
import androidx.compose.ui.graphics.l0;
import b1.m;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Ripple.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J'\u0010\r\u001a\u00020\u0006*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Landroidx/compose/material/ripple/StateLayer;", "", "Landroidx/compose/foundation/interaction/d;", "interaction", "Lkotlinx/coroutines/q0;", "scope", "Lkotlin/b2;", ak.aF, "Landroidx/compose/ui/graphics/drawscope/g;", "Ls1/h;", "radius", "Landroidx/compose/ui/graphics/l0;", "color", "b", "(Landroidx/compose/ui/graphics/drawscope/g;FJ)V", "", ak.av, "Z", "bounded", "Landroidx/compose/runtime/m2;", "Landroidx/compose/material/ripple/e;", "Landroidx/compose/runtime/m2;", "rippleAlpha", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/l;", "Landroidx/compose/animation/core/Animatable;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Landroidx/compose/foundation/interaction/d;", "currentInteraction", "<init>", "(ZLandroidx/compose/runtime/m2;)V", "material-ripple_release"}, k = 1, mv = {1, 7, 1})
public final class StateLayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final m2<RippleAlpha> rippleAlpha;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Animatable<Float, androidx.compose.animation.core.l> animatedAlpha;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<androidx.compose.foundation.interaction.d> interactions;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.foundation.interaction.d currentInteraction;

    public StateLayer(boolean z10, @dl.d m2<RippleAlpha> rippleAlpha) {
        f0.p(rippleAlpha, "rippleAlpha");
        this.bounded = z10;
        this.rippleAlpha = rippleAlpha;
        this.animatedAlpha = androidx.compose.animation.core.b.b(0.0f, 0.0f, 2, null);
        this.interactions = new ArrayList();
    }

    public final void b(@dl.d androidx.compose.ui.graphics.drawscope.g drawStateLayer, float f10, long j10) {
        f0.p(drawStateLayer, "$this$drawStateLayer");
        float fA = Float.isNaN(f10) ? f.a(drawStateLayer, this.bounded, drawStateLayer.c()) : drawStateLayer.E1(f10);
        float fFloatValue = this.animatedAlpha.u().floatValue();
        if (fFloatValue > 0.0f) {
            long jW = l0.w(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.bounded) {
                androidx.compose.ui.graphics.drawscope.f.x(drawStateLayer, jW, fA, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fT = m.t(drawStateLayer.c());
            float fM = m.m(drawStateLayer.c());
            int iB = k0.INSTANCE.b();
            androidx.compose.ui.graphics.drawscope.e drawContext = drawStateLayer.getDrawContext();
            long jC = drawContext.c();
            drawContext.a().f();
            drawContext.getTransform().a(0.0f, 0.0f, fT, fM, iB);
            androidx.compose.ui.graphics.drawscope.f.x(drawStateLayer, jW, fA, 0L, 0.0f, null, null, 0, 124, null);
            drawContext.a().u();
            drawContext.b(jC);
        }
    }

    public final void c(@dl.d androidx.compose.foundation.interaction.d interaction, @dl.d q0 scope) {
        float draggedAlpha;
        f0.p(interaction, "interaction");
        f0.p(scope, "scope");
        boolean z10 = interaction instanceof androidx.compose.foundation.interaction.c.a;
        if (z10) {
            this.interactions.add(interaction);
        } else if (interaction instanceof androidx.compose.foundation.interaction.c.b) {
            this.interactions.remove(((androidx.compose.foundation.interaction.c.b) interaction).getEnter());
        } else if (interaction instanceof androidx.compose.foundation.interaction.b.a) {
            this.interactions.add(interaction);
        } else if (interaction instanceof androidx.compose.foundation.interaction.b.C0047b) {
            this.interactions.remove(((androidx.compose.foundation.interaction.b.C0047b) interaction).getFocus());
        } else if (interaction instanceof androidx.compose.foundation.interaction.a.b) {
            this.interactions.add(interaction);
        } else if (interaction instanceof androidx.compose.foundation.interaction.a.c) {
            this.interactions.remove(((androidx.compose.foundation.interaction.a.c) interaction).getStart());
        } else if (!(interaction instanceof androidx.compose.foundation.interaction.a.C0046a)) {
            return;
        } else {
            this.interactions.remove(((androidx.compose.foundation.interaction.a.C0046a) interaction).getStart());
        }
        androidx.compose.foundation.interaction.d dVar = (androidx.compose.foundation.interaction.d) CollectionsKt___CollectionsKt.q3(this.interactions);
        if (f0.g(this.currentInteraction, dVar)) {
            return;
        }
        if (dVar != null) {
            if (z10) {
                draggedAlpha = this.rippleAlpha.getValue().getHoveredAlpha();
            } else if (interaction instanceof androidx.compose.foundation.interaction.b.a) {
                draggedAlpha = this.rippleAlpha.getValue().getFocusedAlpha();
            } else {
                draggedAlpha = interaction instanceof androidx.compose.foundation.interaction.a.b ? this.rippleAlpha.getValue().getDraggedAlpha() : 0.0f;
            }
            kotlinx.coroutines.k.f(scope, null, null, new StateLayer$handleInteraction$1(this, draggedAlpha, j.c(dVar), null), 3, null);
        } else {
            kotlinx.coroutines.k.f(scope, null, null, new StateLayer$handleInteraction$2(this, j.d(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = dVar;
    }
}
