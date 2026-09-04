package androidx.compose.foundation;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Indication.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/z;", "Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "Landroidx/compose/foundation/y;", "b", "Landroidx/compose/foundation/y;", ak.av, "()Landroidx/compose/foundation/y;", "indicationInstance", "<init>", "(Landroidx/compose/foundation/y;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class z implements androidx.compose.ui.draw.j {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final y indicationInstance;

    public z(@dl.d y indicationInstance) {
        kotlin.jvm.internal.f0.p(indicationInstance, "indicationInstance");
        this.indicationInstance = indicationInstance;
    }

    @dl.d
    /* JADX INFO: renamed from: a, reason: from getter */
    public final y getIndicationInstance() {
        return this.indicationInstance;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
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

    @Override // androidx.compose.ui.draw.j
    public void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        kotlin.jvm.internal.f0.p(dVar, "<this>");
        this.indicationInstance.a(dVar);
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
