package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aD\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0000¨\u0006\t"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "scope", "Landroidx/paging/RemoteMediator;", "delegate", "Landroidx/paging/x0;", ak.av, "paging-common"}, k = 2, mv = {1, 4, 2})
public final class y0 {
    @dl.d
    public static final <Key, Value> x0<Key, Value> a(@dl.d kotlinx.coroutines.q0 scope, @dl.d RemoteMediator<Key, Value> delegate) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        return new RemoteMediatorAccessImpl(scope, delegate);
    }
}
