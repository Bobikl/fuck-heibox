package androidx.paging;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [Value, Key] */
/* JADX INFO: compiled from: Pager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Landroidx/paging/q0;", "i", "(Lkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class Pager$flow$1<Key, Value> extends FunctionReferenceImpl implements yh.l<kotlin.coroutines.c<? super q0<Key, Value>>, Object>, kotlin.coroutines.jvm.internal.j {
    Pager$flow$1(yh.a aVar) {
        super(1, aVar, SuspendingPagingSourceFactory.class, TopicHashtagWrapper.TYPE_CREATE, "create(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // yh.l
    @dl.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.coroutines.c<? super q0<Key, Value>> cVar) {
        return ((SuspendingPagingSourceFactory) ((yh.a) this.receiver)).b(cVar);
    }
}
