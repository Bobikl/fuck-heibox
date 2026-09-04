package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.g1;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: HitPathTracker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\f\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J7\u0010\r\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0006\u0010\u0011\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000fJ\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0016R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/input/pointer/n;", "", "", "Landroidx/compose/ui/input/pointer/x;", "Landroidx/compose/ui/input/pointer/y;", "changes", "Landroidx/compose/ui/layout/q;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/h;", "internalPointerEvent", "", "isInBounds", ak.av, "f", "e", "Lkotlin/b2;", "d", ak.aF, RXScreenCaptureService.KEY_HEIGHT, "b", "Landroidx/compose/runtime/collection/e;", "Landroidx/compose/ui/input/pointer/m;", "Landroidx/compose/runtime/collection/e;", "g", "()Landroidx/compose/runtime/collection/e;", "children", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 7, 1})
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final androidx.compose.runtime.collection.e<Node> children = new androidx.compose.runtime.collection.e<>(new Node[16], 0);

    public boolean a(@dl.d Map<x, PointerInputChange> changes, @dl.d androidx.compose.ui.layout.q parentCoordinates, @dl.d h internalPointerEvent, boolean isInBounds) {
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        androidx.compose.runtime.collection.e<Node> eVar = this.children;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 <= 0) {
            return false;
        }
        Node[] mVarArrG = eVar.G();
        kotlin.jvm.internal.f0.n(mVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        boolean z10 = false;
        do {
            z10 = mVarArrG[i11].a(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
            i11++;
        } while (i11 < i10);
        return z10;
    }

    public void b(@dl.d h internalPointerEvent) {
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        int i10 = this.children.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        while (true) {
            i10--;
            if (-1 >= i10) {
                return;
            }
            if (this.children.G()[i10].k().P()) {
                this.children.g0(i10);
            }
        }
    }

    public final void c() {
        this.children.m();
    }

    public void d() {
        androidx.compose.runtime.collection.e<Node> eVar = this.children;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 > 0) {
            int i11 = 0;
            Node[] mVarArrG = eVar.G();
            kotlin.jvm.internal.f0.n(mVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                mVarArrG[i11].d();
                i11++;
            } while (i11 < i10);
        }
    }

    public boolean e(@dl.d h internalPointerEvent) {
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        androidx.compose.runtime.collection.e<Node> eVar = this.children;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        boolean z10 = false;
        if (i10 > 0) {
            Node[] mVarArrG = eVar.G();
            kotlin.jvm.internal.f0.n(mVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i11 = 0;
            boolean z11 = false;
            do {
                z11 = mVarArrG[i11].e(internalPointerEvent) || z11;
                i11++;
            } while (i11 < i10);
            z10 = z11;
        }
        b(internalPointerEvent);
        return z10;
    }

    public boolean f(@dl.d Map<x, PointerInputChange> changes, @dl.d androidx.compose.ui.layout.q parentCoordinates, @dl.d h internalPointerEvent, boolean isInBounds) {
        kotlin.jvm.internal.f0.p(changes, "changes");
        kotlin.jvm.internal.f0.p(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.f0.p(internalPointerEvent, "internalPointerEvent");
        androidx.compose.runtime.collection.e<Node> eVar = this.children;
        int i10 = eVar.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String();
        if (i10 <= 0) {
            return false;
        }
        Node[] mVarArrG = eVar.G();
        kotlin.jvm.internal.f0.n(mVarArrG, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
        int i11 = 0;
        boolean z10 = false;
        do {
            z10 = mVarArrG[i11].f(changes, parentCoordinates, internalPointerEvent, isInBounds) || z10;
            i11++;
        } while (i11 < i10);
        return z10;
    }

    @dl.d
    public final androidx.compose.runtime.collection.e<Node> g() {
        return this.children;
    }

    public final void h() {
        int i10 = 0;
        while (i10 < this.children.getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) {
            Node mVar = this.children.G()[i10];
            if (g1.c(mVar.getPointerInputFilter())) {
                i10++;
                mVar.h();
            } else {
                this.children.g0(i10);
                mVar.d();
            }
        }
    }
}
