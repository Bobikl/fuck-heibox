package androidx.p001datastore.core;

import androidx.exifinterface.media.a;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.k;
import kotlinx.coroutines.channels.m;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: SimpleActor.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bh\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040\u0013\u0012\u001a\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00040\u0016\u0012\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/datastore/core/SimpleActor;", a.f23244d5, "", "msg", "Lkotlin/b2;", "e", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/q0;", ak.av, "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/channels/k;", ak.aF, "Lkotlinx/coroutines/channels/k;", "messageQueue", "Ljava/util/concurrent/atomic/AtomicInteger;", "d", "Ljava/util/concurrent/atomic/AtomicInteger;", "remainingMessages", "Lkotlin/Function1;", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/c;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/q0;Lyh/l;Lyh/p;Lyh/p;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
public final class SimpleActor<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @d
    private final q0 scope;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final p<T, c<? super b2>, Object> f22065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private final k<T> messageQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @d
    private final AtomicInteger remainingMessages;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(@d q0 scope, @d final l<? super Throwable, b2> onComplete, @d final p<? super T, ? super Throwable, b2> onUndeliveredElement, @d p<? super T, ? super c<? super b2>, ? extends Object> consumeMessage) {
        f0.p(scope, "scope");
        f0.p(onComplete, "onComplete");
        f0.p(onUndeliveredElement, "onUndeliveredElement");
        f0.p(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.f22065b = consumeMessage;
        this.messageQueue = m.d(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInteger(0);
        d2 d2Var = (d2) scope.getCoroutineContext().f(d2.INSTANCE);
        if (d2Var == null) {
            return;
        }
        d2Var.K(new l<Throwable, b2>() { // from class: androidx.datastore.core.SimpleActor.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@e Throwable th2) {
                b2 b2Var;
                onComplete.invoke(th2);
                ((SimpleActor) this).messageQueue.b(th2);
                do {
                    Object objH = n.h(((SimpleActor) this).messageQueue.E());
                    if (objH == null) {
                        b2Var = null;
                    } else {
                        onUndeliveredElement.invoke((T) objH, th2);
                        b2Var = b2.f124493a;
                    }
                } while (b2Var != null);
            }
        });
    }

    public final void e(T msg) {
        Object objV = this.messageQueue.v(msg);
        if (objV instanceof n.Closed) {
            Throwable thF = n.f(objV);
            if (thF != null) {
                throw thF;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!n.m(objV)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            kotlinx.coroutines.k.f(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
