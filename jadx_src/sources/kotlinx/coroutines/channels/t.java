package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012-\u0010\u0013\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u000f¢\u0006\u0002\b\u0012ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/channels/t;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/j;", "Lkotlinx/coroutines/channels/ReceiveChannel;", ak.aG, "Lkotlin/b2;", "o1", "Lkotlin/coroutines/c;", "e", "Lkotlin/coroutines/c;", "continuation", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/h;", "channel", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/w;", "", "Lkotlin/t;", "block", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/h;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class t<E> extends j<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlin.coroutines.c<b2> continuation;

    public t(@dl.d CoroutineContext coroutineContext, @dl.d h<E> hVar, @dl.d yh.p<? super w<? super E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        super(coroutineContext, hVar, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void o1() throws Throwable {
        bj.a.c(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.j, kotlinx.coroutines.channels.h
    @dl.d
    public ReceiveChannel<E> u() {
        ReceiveChannel<E> receiveChannelU = K1().u();
        start();
        return receiveChannelU;
    }
}
