package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.internal.FunctionReferenceImpl;
import yh.p;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelManager.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/multicast/ChannelManager$b;", "p1", "Lkotlin/b2;", "i", "(Landroidx/paging/multicast/ChannelManager$b;Lkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class ChannelManager$Actor$newProducer$1<T> extends FunctionReferenceImpl implements p<ChannelManager.b<T>, kotlin.coroutines.c<? super b2>, Object>, j {
    ChannelManager$Actor$newProducer$1(ChannelManager.Actor actor) {
        super(2, actor, ChannelManager.Actor.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // yh.p
    @e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d ChannelManager.b<T> bVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelManager.Actor) this.receiver).g(bVar, cVar);
    }
}
