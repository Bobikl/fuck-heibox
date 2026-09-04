package androidx.compose.foundation;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.n, reason: from toString */
/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0017\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0012¢\u0006\u0002\b\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Landroidx/compose/foundation/n;", "Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "", "other", "", "equals", "", "hashCode", "", "toString", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "e", "Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "overscrollEffect", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/x0;", "Lkotlin/t;", "inspectorInfo", "<init>", "(Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DrawOverscrollModifier extends y0 implements androidx.compose.ui.draw.j {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @dl.d
    private final AndroidEdgeEffectOverscrollEffect overscrollEffect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawOverscrollModifier(@dl.d AndroidEdgeEffectOverscrollEffect overscrollEffect, @dl.d yh.l<? super x0, b2> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.f0.p(overscrollEffect, "overscrollEffect");
        kotlin.jvm.internal.f0.p(inspectorInfo, "inspectorInfo");
        this.overscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof DrawOverscrollModifier) {
            return kotlin.jvm.internal.f0.g(this.overscrollEffect, ((DrawOverscrollModifier) other).overscrollEffect);
        }
        return false;
    }

    public int hashCode() {
        return this.overscrollEffect.hashCode();
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @dl.d
    public String toString() {
        return "DrawOverscrollModifier(overscrollEffect=" + this.overscrollEffect + ')';
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.draw.j
    public void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        dVar.T0();
        this.overscrollEffect.y(dVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
