package androidx.paging;

import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PagingSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "Key", "Landroidx/paging/PagedList$d;", "key", "Landroidx/paging/q0$a;", ak.av, "(Landroidx/paging/PagedList$d;Ljava/lang/Object;)Landroidx/paging/q0$a;", "paging-common"}, k = 2, mv = {1, 4, 2})
public final class s0 {
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Key> q0.a<Key> a(@dl.d PagedList.d toRefreshLoadParams, @dl.e Key key) {
        kotlin.jvm.internal.f0.p(toRefreshLoadParams, "$this$toRefreshLoadParams");
        return new q0.a.d(key, toRefreshLoadParams.initialLoadSizeHint, toRefreshLoadParams.enablePlaceholders);
    }
}
