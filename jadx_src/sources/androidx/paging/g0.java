package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¨\u0006\u0006"}, d2 = {"Landroidx/paging/k;", "previous", "Landroidx/paging/LoadType;", "loadType", "", ak.av, "paging-common"}, k = 2, mv = {1, 4, 2})
public final class g0 {
    public static final boolean a(@dl.d GenerationalViewportHint shouldPrioritizeOver, @dl.d GenerationalViewportHint previous, @dl.d LoadType loadType) {
        kotlin.jvm.internal.f0.p(shouldPrioritizeOver, "$this$shouldPrioritizeOver");
        kotlin.jvm.internal.f0.p(previous, "previous");
        kotlin.jvm.internal.f0.p(loadType, "loadType");
        if (shouldPrioritizeOver.e() <= previous.e() && (!(previous.f() instanceof f1.b) || !(shouldPrioritizeOver.f() instanceof f1.a))) {
            if ((shouldPrioritizeOver.f() instanceof f1.b) && (previous.f() instanceof f1.a)) {
                return false;
            }
            if (shouldPrioritizeOver.f().getOriginalPageOffsetFirst() == previous.f().getOriginalPageOffsetFirst() && shouldPrioritizeOver.f().getOriginalPageOffsetLast() == previous.f().getOriginalPageOffsetLast()) {
                if (loadType == LoadType.PREPEND && previous.f().getPresentedItemsBefore() < shouldPrioritizeOver.f().getPresentedItemsBefore()) {
                    return false;
                }
                if (loadType == LoadType.APPEND && previous.f().getPresentedItemsAfter() < shouldPrioritizeOver.f().getPresentedItemsAfter()) {
                    return false;
                }
            }
        }
        return true;
    }
}
