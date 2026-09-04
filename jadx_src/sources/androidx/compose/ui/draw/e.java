package androidx.compose.ui.draw;

import androidx.compose.ui.platform.x0;
import androidx.compose.ui.platform.y0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: DrawModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000e\u0012\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\f\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R(\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0002\b\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/draw/e;", "Landroidx/compose/ui/draw/j;", "Landroidx/compose/ui/platform/y0;", "Landroidx/compose/ui/graphics/drawscope/d;", "Lkotlin/b2;", RXScreenCaptureService.KEY_WIDTH, "", "other", "", "equals", "", "hashCode", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/g;", "Lkotlin/t;", "onDraw", "Lyh/l;", "f", "()Lyh/l;", "Landroidx/compose/ui/platform/x0;", "inspectorInfo", "<init>", "(Lyh/l;Lyh/l;)V", "ui_release"}, k = 1, mv = {1, 7, 1})
public final class e extends y0 implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final yh.l<androidx.compose.ui.graphics.drawscope.g, b2> f13467e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(@dl.d yh.l<? super androidx.compose.ui.graphics.drawscope.g, b2> onDraw, @dl.d yh.l<? super x0, b2> inspectorInfo) {
        super(inspectorInfo);
        f0.p(onDraw, "onDraw");
        f0.p(inspectorInfo, "inspectorInfo");
        this.f13467e = onDraw;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    public boolean equals(@dl.e Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof e) {
            return f0.g(this.f13467e, ((e) other).f13467e);
        }
        return false;
    }

    @dl.d
    public final yh.l<androidx.compose.ui.graphics.drawscope.g, b2> f() {
        return this.f13467e;
    }

    public int hashCode() {
        return this.f13467e.hashCode();
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
    public /* synthetic */ Object v(Object obj, p pVar) {
        return androidx.compose.ui.o.d(this, obj, pVar);
    }

    @Override // androidx.compose.ui.draw.j
    public void w(@dl.d androidx.compose.ui.graphics.drawscope.d dVar) {
        f0.p(dVar, "<this>");
        this.f13467e.invoke(dVar);
        dVar.T0();
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
