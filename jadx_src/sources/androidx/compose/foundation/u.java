package androidx.compose.foundation;

import androidx.compose.ui.layout.u0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: FocusedBounds.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/u;", "Landroidx/compose/ui/modifier/e;", "Landroidx/compose/ui/layout/u0;", "Lkotlin/b2;", ak.av, "Landroidx/compose/ui/layout/q;", "coordinates", androidx.exifinterface.media.a.T4, "Landroidx/compose/ui/modifier/n;", "scope", "w1", ak.aF, "Landroidx/compose/ui/layout/q;", "layoutCoordinates", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class u implements androidx.compose.ui.modifier.e, u0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private yh.l<? super androidx.compose.ui.layout.q, b2> f8408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private androidx.compose.ui.layout.q layoutCoordinates;

    private final void a() {
        yh.l<? super androidx.compose.ui.layout.q, b2> lVar;
        androidx.compose.ui.layout.q qVar = this.layoutCoordinates;
        if (qVar != null) {
            kotlin.jvm.internal.f0.m(qVar);
            if (!qVar.p() || (lVar = this.f8408b) == null) {
                return;
            }
            lVar.invoke(this.layoutCoordinates);
        }
    }

    @Override // androidx.compose.ui.layout.u0
    public void W(@dl.d androidx.compose.ui.layout.q coordinates) {
        kotlin.jvm.internal.f0.p(coordinates, "coordinates");
        this.layoutCoordinates = coordinates;
        if (coordinates.p()) {
            a();
            return;
        }
        yh.l<? super androidx.compose.ui.layout.q, b2> lVar = this.f8408b;
        if (lVar != null) {
            lVar.invoke(null);
        }
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

    @Override // androidx.compose.ui.modifier.e
    public void w1(@dl.d androidx.compose.ui.modifier.n scope) {
        yh.l<? super androidx.compose.ui.layout.q, b2> lVar;
        kotlin.jvm.internal.f0.p(scope, "scope");
        yh.l<? super androidx.compose.ui.layout.q, b2> lVar2 = (yh.l) scope.a(FocusedBoundsKt.a());
        if (lVar2 == null && (lVar = this.f8408b) != null) {
            lVar.invoke(null);
        }
        this.f8408b = lVar2;
    }

    @Override // androidx.compose.ui.n.c, androidx.compose.ui.n
    public /* synthetic */ Object x(Object obj, yh.p pVar) {
        return androidx.compose.ui.o.c(this, obj, pVar);
    }
}
