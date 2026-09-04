package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004J\u0013\u0010\u0006\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Landroidx/paging/x0;", "", "Key", "Value", "Landroidx/paging/z0;", "Landroidx/paging/RemoteMediator$InitializeAction;", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/u;", "Landroidx/paging/x;", "getState", "()Lkotlinx/coroutines/flow/u;", "state", "paging-common"}, k = 1, mv = {1, 4, 2})
public interface x0<Key, Value> extends z0<Key, Value> {
    @dl.e
    Object a(@dl.d kotlin.coroutines.c<? super RemoteMediator.InitializeAction> cVar);

    @dl.d
    kotlinx.coroutines.flow.u<LoadStates> getState();
}
