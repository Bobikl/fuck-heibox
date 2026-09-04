package kotlinx.coroutines.channels;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.hblogistics.AddressListActivity;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003BO\u0012\u0006\u0010$\u001a\u00020#\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\u0012-\u0010\u001a\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017¢\u0006\u0002\b(ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001b\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016JX\u0010\u001b\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142\u0006\u0010\u0016\u001a\u00028\u00002(\u0010\u001a\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0017H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Lkotlinx/coroutines/channels/s;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/channels/c;", "Lkotlinx/coroutines/selects/e;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/b2;", "o1", "element", "X", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "offer", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/channels/n;", "v", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "cause", "U", "R", "Lkotlinx/coroutines/selects/f;", AddressListActivity.N, RemoteMessageConst.MessageBody.PARAM, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "block", "N", "(Lkotlinx/coroutines/selects/f;Ljava/lang/Object;Lyh/p;)V", "e", "Lkotlin/coroutines/c;", "continuation", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Lkotlinx/coroutines/channels/k;", "channel", "Lkotlinx/coroutines/channels/e;", "Lkotlin/t;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/k;Lyh/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class s<E> extends c<E> implements kotlinx.coroutines.selects.e<E, b0<? super E>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private kotlin.coroutines.c<? super b2> continuation;

    public s(@dl.d CoroutineContext coroutineContext, @dl.d k<E> kVar, @dl.d yh.p<? super e<E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        super(coroutineContext, kVar, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.c(pVar, this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.selects.e
    public <R> void N(@dl.d kotlinx.coroutines.selects.f<? super R> select, E param, @dl.d yh.p<? super b0<? super E>, ? super kotlin.coroutines.c<? super R>, ? extends Object> block) {
        start();
        super.l().N(select, param, block);
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    /* JADX INFO: renamed from: U */
    public boolean b(@dl.e Throwable cause) {
        boolean zB = super.b(cause);
        start();
        return zB;
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    @dl.e
    public Object X(E e10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        start();
        Object objX = super.X(e10, cVar);
        return objX == kotlin.coroutines.intrinsics.b.h() ? objX : b2.f124493a;
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    @dl.d
    public kotlinx.coroutines.selects.e<E, b0<E>> l() {
        return this;
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void o1() throws Throwable {
        bj.a.c(this.continuation, this);
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    public boolean offer(E element) {
        start();
        return super.offer(element);
    }

    @Override // kotlinx.coroutines.channels.l, kotlinx.coroutines.channels.b0
    @dl.d
    public Object v(E element) {
        start();
        return super.v(element);
    }
}
