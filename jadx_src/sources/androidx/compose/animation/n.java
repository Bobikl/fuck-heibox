package androidx.compose.animation;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\t\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005J\u001a\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005¨\u0006\u000e"}, d2 = {"Landroidx/compose/animation/n;", "Landroidx/compose/ui/layout/w;", "Landroidx/compose/ui/layout/n;", "Landroidx/compose/ui/layout/m;", "measurable", "", "height", "b", "width", "j", RXScreenCaptureService.KEY_HEIGHT, "i", "<init>", "()V", "animation_release"}, k = 1, mv = {1, 7, 1})
public abstract class n implements androidx.compose.ui.layout.w {
    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @Override // androidx.compose.ui.layout.w
    public final int b(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        return measurable.l1(i10);
    }

    @Override // androidx.compose.ui.layout.w
    public final int h(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        return measurable.w1(i10);
    }

    @Override // androidx.compose.ui.layout.w
    public final int i(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        return measurable.V(i10);
    }

    @Override // androidx.compose.ui.layout.w
    public final int j(@dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        f0.p(nVar, "<this>");
        f0.p(measurable, "measurable");
        return measurable.L0(i10);
    }

    @Override // androidx.compose.ui.n
    public /* synthetic */ androidx.compose.ui.n s0(androidx.compose.ui.n nVar) {
        return androidx.compose.ui.m.a(this, nVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean t(yh.l lVar) {
        return androidx.compose.ui.o.b(this, lVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object v(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
