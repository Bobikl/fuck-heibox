package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: SuspendingPagingSourceFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004B)\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroidx/paging/SuspendingPagingSourceFactory;", "", "Key", "Value", "Lkotlin/Function0;", "Landroidx/paging/q0;", "b", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", ak.aF, "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "delegate", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lyh/a;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SuspendingPagingSourceFactory<Key, Value> implements yh.a<q0<Key, Value>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yh.a<q0<Key, Value>> f26348c;

    /* JADX WARN: Multi-variable type inference failed */
    public SuspendingPagingSourceFactory(@dl.d CoroutineDispatcher dispatcher, @dl.d yh.a<? extends q0<Key, Value>> delegate) {
        kotlin.jvm.internal.f0.p(dispatcher, "dispatcher");
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.dispatcher = dispatcher;
        this.f26348c = delegate;
    }

    @dl.e
    public final Object b(@dl.d kotlin.coroutines.c<? super q0<Key, Value>> cVar) {
        return kotlinx.coroutines.i.h(this.dispatcher, new SuspendingPagingSourceFactory$create$2(this, null), cVar);
    }

    @Override // yh.a
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public q0<Key, Value> invoke() {
        return this.f26348c.invoke();
    }
}
