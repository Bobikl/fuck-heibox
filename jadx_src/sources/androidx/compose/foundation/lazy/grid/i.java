package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.x1;
import androidx.compose.animation.core.z0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: compiled from: LazyGridItemPlacementAnimator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u001a\"\u0010\u000b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\f\u001a\u00020\u0001H\u0002\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0002\"\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridSpanLayoutProvider;", "", "fromIndex", "toIndex", "averageLineMainAxisSize", "", "Landroidx/compose/foundation/lazy/grid/q;", "visibleItems", "i", "itemIndex", "fallback", RXScreenCaptureService.KEY_HEIGHT, UCropPlusActivity.ARG_INDEX, "j", "f", "e", "g", "Landroidx/compose/animation/core/z0;", "Ls1/n;", ak.av, "Landroidx/compose/animation/core/z0;", "InterruptionSpec", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final z0<s1.n> f6915a = androidx.compose.animation.core.i.o(0.0f, 400.0f, s1.n.b(x1.f(s1.n.f139237b)), 1, null);

    private static final int e(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int i10) {
        if (i10 < lazyGridSpanLayoutProvider.f()) {
            return lazyGridSpanLayoutProvider.c(lazyGridSpanLayoutProvider.d(i10)).getFirstItemIndex();
        }
        int iG = g(lazyGridSpanLayoutProvider);
        return iG + (lazyGridSpanLayoutProvider.getSlotsPerLine() * ((i10 - iG) / lazyGridSpanLayoutProvider.getSlotsPerLine()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int i10) {
        int iA;
        int size;
        if (i10 >= lazyGridSpanLayoutProvider.f()) {
            iA = e(lazyGridSpanLayoutProvider, i10);
            size = lazyGridSpanLayoutProvider.getSlotsPerLine();
        } else {
            LazyGridSpanLayoutProvider.c cVarC = lazyGridSpanLayoutProvider.c(lazyGridSpanLayoutProvider.d(i10));
            iA = cVarC.getFirstItemIndex();
            size = cVarC.b().size();
        }
        return iA + size;
    }

    private static final int g(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider) {
        LazyGridSpanLayoutProvider.c cVarC = lazyGridSpanLayoutProvider.c(lazyGridSpanLayoutProvider.d(lazyGridSpanLayoutProvider.f() - 1));
        int iA = cVarC.getFirstItemIndex() - 1;
        List<d> listB = cVarC.b();
        int size = listB.size();
        int iF = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iF += d.f(listB.get(i10).getPackedValue());
            iA++;
        }
        return iA + (lazyGridSpanLayoutProvider.getSlotsPerLine() - iF) + 1;
    }

    private static final int h(List<q> list, int i10, int i11) {
        if (!list.isEmpty() && i10 >= ((q) CollectionsKt___CollectionsKt.w2(list)).getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() && i10 <= ((q) CollectionsKt___CollectionsKt.k3(list)).getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String()) {
            if (i10 - ((q) CollectionsKt___CollectionsKt.w2(list)).getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() >= ((q) CollectionsKt___CollectionsKt.k3(list)).getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() - i10) {
                for (int iG = CollectionsKt__CollectionsKt.G(list); -1 < iG; iG--) {
                    q qVar = list.get(iG);
                    if (qVar.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() == i10) {
                        return qVar.i();
                    }
                    if (qVar.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() < i10) {
                        break;
                    }
                }
            } else {
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    q qVar2 = list.get(i12);
                    if (qVar2.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() == i10) {
                        return qVar2.i();
                    }
                    if (qVar2.getCom.starlightc.ucropplus.ui.UCropPlusActivity.ARG_INDEX java.lang.String() > i10) {
                        break;
                    }
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int i(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int i10, int i11, int i12, List<q> list) {
        int iH = 0;
        while (i10 <= i11) {
            int iF = f(lazyGridSpanLayoutProvider, i10) - 1;
            if (iF <= i11) {
                iH += h(list, iF, i12);
            }
            i10 = iF + 1;
        }
        return iH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(LazyGridSpanLayoutProvider lazyGridSpanLayoutProvider, int i10) {
        return e(lazyGridSpanLayoutProvider, i10) - 1;
    }
}
