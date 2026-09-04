package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&J\u001c\u0010\n\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006H&¨\u0006\u000b"}, d2 = {"Landroidx/paging/z0;", "", "Key", "Value", "Landroidx/paging/LoadType;", "loadType", "Landroidx/paging/t0;", "pagingState", "Lkotlin/b2;", ak.aF, "b", "paging-common"}, k = 1, mv = {1, 4, 2})
public interface z0<Key, Value> {
    void b(@dl.d PagingState<Key, Value> pagingState);

    void c(@dl.d LoadType loadType, @dl.d PagingState<Key, Value> pagingState);
}
