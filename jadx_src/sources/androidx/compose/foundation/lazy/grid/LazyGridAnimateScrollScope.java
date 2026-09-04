package androidx.compose.foundation.lazy.grid;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyGridAnimateScrollScope.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u001e\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0019\u0010\n\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u00020\u000e*\u00020\f2\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J<\u0010\u0018\u001a\u00020\u000e2'\u0010\u0017\u001a#\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0013¢\u0006\u0002\b\u0016H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0014\u0010)\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010#R\u0014\u0010+\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridAnimateScrollScope;", "Landroidx/compose/foundation/lazy/layout/e;", "", "Landroidx/compose/foundation/lazy/grid/h;", "visibleItems", "", "isVertical", "", "j", UCropPlusActivity.ARG_INDEX, "g", "(I)Ljava/lang/Integer;", "Landroidx/compose/foundation/gestures/m;", "scrollOffset", "Lkotlin/b2;", "e", "targetScrollOffset", "", ak.aF, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "b", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", ak.av, "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Ls1/e;", "getDensity", "()Ls1/e;", "density", "d", "()I", "firstVisibleItemIndex", "i", "firstVisibleItemScrollOffset", "f", "lastVisibleItemIndex", "itemCount", RXScreenCaptureService.KEY_HEIGHT, "numOfItemsForTeleport", "<init>", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridAnimateScrollScope implements androidx.compose.foundation.lazy.layout.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final LazyGridState state;

    public LazyGridAnimateScrollScope(@dl.d LazyGridState state) {
        f0.p(state, "state");
        this.state = state;
    }

    private final int j(final List<? extends h> visibleItems, final boolean isVertical) {
        yh.l<Integer, Integer> lVar = new yh.l<Integer, Integer>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridAnimateScrollScope$calculateLineAverageMainAxisSize$lineOf$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @dl.d
            public final Integer a(int i10) {
                return Integer.valueOf(isVertical ? visibleItems.get(i10).getRow() : visibleItems.get(i10).getColumn());
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                return a(num.intValue());
            }
        };
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < visibleItems.size()) {
            int iIntValue = lVar.invoke(Integer.valueOf(i10)).intValue();
            if (iIntValue == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < visibleItems.size() && lVar.invoke(Integer.valueOf(i10)).intValue() == iIntValue) {
                    iMax = Math.max(iMax, isVertical ? s1.r.j(visibleItems.get(i10).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()) : s1.r.m(visibleItems.get(i10).getCom.max.hbuikit.bean.param.UiKitSpanObj.TYPE_SIZE java.lang.String()));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return i11 / i12;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int a() {
        return this.state.q().getTotalItemsCount();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    @dl.e
    public Object b(@dl.d yh.p<? super androidx.compose.foundation.gestures.m, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = androidx.compose.foundation.gestures.o.a(this.state, null, pVar, cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public float c(int index, int targetScrollOffset) {
        List<h> listF = this.state.q().f();
        int iZ = this.state.z();
        return ((j(listF, this.state.A()) * (((index - d()) + ((iZ - 1) * (index < d() ? -1 : 1))) / iZ)) + targetScrollOffset) - i();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int d() {
        return this.state.m();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public void e(@dl.d androidx.compose.foundation.gestures.m mVar, int i10, int i11) {
        f0.p(mVar, "<this>");
        this.state.M(i10, i11);
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int f() {
        h hVar = (h) CollectionsKt___CollectionsKt.q3(this.state.q().f());
        if (hVar != null) {
            return hVar.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String();
        }
        return 0;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    @dl.e
    public Integer g(int index) {
        h hVar;
        List<h> listF = this.state.q().f();
        int size = listF.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                hVar = null;
                break;
            }
            hVar = listF.get(i10);
            if (hVar.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() == index) {
                break;
            }
            i10++;
        }
        h hVar2 = hVar;
        if (hVar2 != null) {
            return Integer.valueOf(this.state.A() ? s1.n.o(hVar2.getAndroidx.constraintlayout.core.motion.utils.w.c.R java.lang.String()) : s1.n.m(hVar2.getAndroidx.constraintlayout.core.motion.utils.w.c.R java.lang.String()));
        }
        return null;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    @dl.d
    public s1.e getDensity() {
        return this.state.l();
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    /* JADX INFO: renamed from: h */
    public int getNumOfItemsForTeleport() {
        return this.state.z() * 100;
    }

    @Override // androidx.compose.foundation.lazy.layout.e
    public int i() {
        return this.state.n();
    }
}
