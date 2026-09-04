package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.m2;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayoutItemProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001al\u0010\u0010\u001a\u00020\u000f\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u00042;\u0010\u000e\u001a7\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0007\u001a\u001e\u0010\u0018\u001a\u00020\n*\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/lazy/layout/g;", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/lazy/layout/c;", "intervals", "Lfi/l;", "nearestItemsRange", "Lkotlin/Function2;", "Lkotlin/m0;", "name", ak.aT, "", UCropPlusActivity.ARG_INDEX, "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "itemContent", "Landroidx/compose/foundation/lazy/layout/i;", "b", "(Landroidx/compose/foundation/lazy/layout/c;Lfi/l;Lyh/r;)Landroidx/compose/foundation/lazy/layout/i;", "Landroidx/compose/runtime/m2;", "delegate", ak.av, "", "key", "lastKnownIndex", ak.aF, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class j {
    @androidx.compose.foundation.t
    @dl.d
    public static final i a(@dl.d m2<? extends i> delegate) {
        f0.p(delegate, "delegate");
        return new DefaultDelegatingLazyLayoutItemProvider(delegate);
    }

    @androidx.compose.foundation.t
    @dl.d
    public static final <T extends g> i b(@dl.d c<? extends T> intervals, @dl.d fi.l nearestItemsRange, @dl.d yh.r<? super T, ? super Integer, ? super androidx.compose.runtime.p, ? super Integer, b2> itemContent) {
        f0.p(intervals, "intervals");
        f0.p(nearestItemsRange, "nearestItemsRange");
        f0.p(itemContent, "itemContent");
        return new DefaultLazyLayoutItemsProvider(itemContent, intervals, nearestItemsRange);
    }

    @androidx.compose.foundation.t
    public static final int c(@dl.d i iVar, @dl.e Object obj, int i10) {
        Integer num;
        f0.p(iVar, "<this>");
        if (obj == null) {
            return i10;
        }
        return ((i10 >= iVar.a() || !f0.g(obj, iVar.e(i10))) && (num = iVar.d().get(obj)) != null) ? num.intValue() : i10;
    }
}
