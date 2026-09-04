package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@androidx.annotation.j1
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001:\u0001\bJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/paging/ActiveFlowTracker;", "", "Landroidx/paging/ActiveFlowTracker$FlowType;", "flowType", "Lkotlin/b2;", "b", "(Landroidx/paging/ActiveFlowTracker$FlowType;Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.av, "FlowType", "paging-common"}, k = 1, mv = {1, 4, 2})
public interface ActiveFlowTracker {

    /* JADX INFO: compiled from: CachedPagingData.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/paging/ActiveFlowTracker$FlowType;", "", "(Ljava/lang/String;I)V", "PAGED_DATA_FLOW", "PAGE_EVENT_FLOW", "paging-common"}, k = 1, mv = {1, 4, 2})
    public enum FlowType {
        PAGED_DATA_FLOW,
        PAGE_EVENT_FLOW
    }

    @dl.e
    Object a(@dl.d FlowType flowType, @dl.d kotlin.coroutines.c<? super b2> cVar);

    @dl.e
    Object b(@dl.d FlowType flowType, @dl.d kotlin.coroutines.c<? super b2> cVar);
}
