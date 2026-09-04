package androidx.compose.foundation.lazy.staggeredgrid;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGridAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.foundation.t
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u00020\b*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016J<\u0010\u0012\u001a\u00020\b2'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r¢\u0006\u0002\b\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0014\u0010#\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001dR\u0014\u0010%\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006("}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/b;", "Landroidx/compose/foundation/lazy/layout/e;", "", UCropPlusActivity.ARG_INDEX, "g", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/m;", "scrollOffset", "Lkotlin/b2;", "e", "targetScrollOffset", "", ak.aF, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "b", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", ak.av, "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Ls1/e;", "getDensity", "()Ls1/e;", "density", "d", "()I", "firstVisibleItemIndex", "i", "firstVisibleItemScrollOffset", "f", "lastVisibleItemIndex", "itemCount", RXScreenCaptureService.KEY_HEIGHT, "numOfItemsForTeleport", "<init>", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class b implements androidx.compose.foundation.lazy.layout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyStaggeredGridState state;

    public b(@dl.d LazyStaggeredGridState state) {
        f0.p(state, "state");
        this.state = state;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int a() {
        return this.state.u().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    @dl.e
    public Object b(@dl.d yh.p<? super androidx.compose.foundation.gestures.m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this.state, null, pVar, cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public float c(int index, int targetScrollOffset) {
        List<e> listF = this.state.u().f();
        int size = listF.size();
        int iJ = 0;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = listF.get(i10);
            iJ += this.state.getIsVertical() ? s1.r.j(eVar.getSize()) : s1.r.m(eVar.getSize());
        }
        return (((iJ / (listF.size() * this.state.s())) * (index - d())) + targetScrollOffset) - i();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int d() {
        return this.state.p();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public void e(@dl.d androidx.compose.foundation.gestures.m mVar, int i10, int i11) {
        f0.p(mVar, "<this>");
        this.state.M(mVar, i10, i11);
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int f() {
        e eVar = (e) CollectionsKt___CollectionsKt.q3(this.state.u().f());
        if (eVar != null) {
            return eVar.getIndex();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    @dl.e
    public Integer g(int index) {
        e eVarA = LazyStaggeredGridMeasureResultKt.a(this.state.u(), index);
        if (eVarA == null) {
            return null;
        }
        long offset = eVarA.getOffset();
        return Integer.valueOf(this.state.getIsVertical() ? s1.n.o(offset) : s1.n.m(offset));
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    @dl.d
    public s1.e getDensity() {
        return this.state.getF7313q();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    /* JADX INFO: renamed from: h */
    public int getNumOfItemsForTeleport() {
        return this.state.s() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int i() {
        return this.state.q();
    }
}
