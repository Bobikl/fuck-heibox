package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.w1;
import androidx.compose.ui.layout.u0;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: SystemGestureExclusion.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(29)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0015\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/r;", "Landroidx/compose/ui/layout/u0;", "Landroidx/compose/ui/layout/q;", "layoutCoordinates", "Lb1/i;", "rect", "Landroid/graphics/Rect;", ak.av, ak.aF, "coordinates", "Lkotlin/b2;", androidx.exifinterface.media.a.T4, "g", "newRect", "m", "Landroid/view/View;", "b", "Landroid/view/View;", "f", "()Landroid/view/View;", sd.b.f139384b, "d", "Landroid/graphics/Rect;", "e", "()Landroid/graphics/Rect;", "n", "(Landroid/graphics/Rect;)V", "Lkotlin/Function1;", "exclusion", "Lyh/l;", "()Lyh/l;", "<init>", "(Landroid/view/View;Lyh/l;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class r implements u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final View view;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final yh.l<androidx.compose.ui.layout.q, b1.i> f7452c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Rect rect;

    /* JADX WARN: Multi-variable type inference failed */
    public r(@dl.d View view, @dl.e yh.l<? super androidx.compose.ui.layout.q, b1.i> lVar) {
        kotlin.jvm.internal.f0.p(view, "view");
        this.view = view;
        this.f7452c = lVar;
    }

    private final Rect a(androidx.compose.ui.layout.q layoutCoordinates, b1.i rect) {
        androidx.compose.ui.layout.q qVarC = c(layoutCoordinates);
        long jA0 = qVarC.a0(layoutCoordinates, rect.E());
        long jA1 = qVarC.a0(layoutCoordinates, rect.F());
        long jA2 = qVarC.a0(layoutCoordinates, rect.m());
        long jA3 = qVarC.a0(layoutCoordinates, rect.n());
        return new Rect(di.d.L0(kotlin.comparisons.h.l0(b1.f.p(jA0), b1.f.p(jA1), b1.f.p(jA2), b1.f.p(jA3))), di.d.L0(kotlin.comparisons.h.l0(b1.f.r(jA0), b1.f.r(jA1), b1.f.r(jA2), b1.f.r(jA3))), di.d.L0(kotlin.comparisons.h.Q(b1.f.p(jA0), b1.f.p(jA1), b1.f.p(jA2), b1.f.p(jA3))), di.d.L0(kotlin.comparisons.h.Q(b1.f.r(jA0), b1.f.r(jA1), b1.f.r(jA2), b1.f.r(jA3))));
    }

    private final androidx.compose.ui.layout.q c(androidx.compose.ui.layout.q layoutCoordinates) {
        androidx.compose.ui.layout.q qVarD = layoutCoordinates.D();
        while (true) {
            androidx.compose.ui.layout.q qVar = qVarD;
            androidx.compose.ui.layout.q qVar2 = layoutCoordinates;
            layoutCoordinates = qVar;
            if (layoutCoordinates == null) {
                return qVar2;
            }
            qVarD = layoutCoordinates.D();
        }
    }

    @Override // androidx.compose.ui.layout.u0
    public void W(@dl.d androidx.compose.ui.layout.q coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        yh.l<androidx.compose.ui.layout.q, b1.i> lVar = this.f7452c;
        m(lVar == null ? w1.a(androidx.compose.ui.layout.r.b(coordinates)) : a(coordinates, lVar.invoke(coordinates)));
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ boolean a0(yh.l lVar) {
        return androidx.compose.ui.o.a(this, lVar);
    }

    @dl.e
    public final yh.l<androidx.compose.ui.layout.q, b1.i> d() {
        return this.f7452c;
    }

    @dl.e
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Rect getRect() {
        return this.rect;
    }

    @dl.d
    /* JADX INFO: renamed from: f, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final void g() {
        m(null);
    }

    public final void m(@dl.e Rect rect) {
        boolean z10 = false;
        androidx.compose.runtime.collection.e eVar = new androidx.compose.runtime.collection.e(new Rect[16], 0);
        List systemGestureExclusionRects = this.view.getSystemGestureExclusionRects();
        kotlin.jvm.internal.f0.o(systemGestureExclusionRects, "view.systemGestureExclusionRects");
        eVar.f(eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String(), systemGestureExclusionRects);
        Rect rect2 = this.rect;
        if (rect2 != null) {
            eVar.c0(rect2);
        }
        if (rect != null && !rect.isEmpty()) {
            z10 = true;
        }
        if (z10) {
            eVar.b(rect);
        }
        this.view.setSystemGestureExclusionRects(eVar.l());
        this.rect = rect;
    }

    public final void n(@dl.e Rect rect) {
        this.rect = rect;
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
