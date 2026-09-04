package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.t1;

/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b+\u0010,J!\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0001J.\u0010\u0012\u001a\u00020\u00062#\u0010\u0011\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\n¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00060\u000eH\u0097\u0001J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\"R&\u0010)\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/paging/SimpleProducerScopeImpl;", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/b1;", "Lkotlinx/coroutines/q0;", "Lkotlinx/coroutines/channels/b0;", "Lkotlin/Function0;", "Lkotlin/b2;", "block", "r", "(Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "cause", "", "U", "Lkotlin/Function1;", "Lkotlin/m0;", "name", "handler", "J", "element", "offer", "(Ljava/lang/Object;)Z", "X", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Lkotlinx/coroutines/channels/b0;", ak.aF, "()Lkotlinx/coroutines/channels/b0;", "channel", "Lkotlin/coroutines/CoroutineContext;", "j0", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "O", "()Z", "isClosedForSend", ak.av, "isFull", "Lkotlinx/coroutines/selects/e;", "l", "()Lkotlinx/coroutines/selects/e;", "onSend", "scope", "<init>", "(Lkotlinx/coroutines/q0;Lkotlinx/coroutines/channels/b0;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class SimpleProducerScopeImpl<T> implements b1<T>, kotlinx.coroutines.q0, kotlinx.coroutines.channels.b0<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final kotlinx.coroutines.channels.b0<T> channel;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.q0 f26309c;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleProducerScopeImpl(@dl.d kotlinx.coroutines.q0 scope, @dl.d kotlinx.coroutines.channels.b0<? super T> channel) {
        kotlin.jvm.internal.f0.p(scope, "scope");
        kotlin.jvm.internal.f0.p(channel, "channel");
        this.f26309c = scope;
        this.channel = channel;
    }

    @Override // kotlinx.coroutines.channels.b0
    @t1
    public void J(@dl.d yh.l<? super Throwable, b2> handler) {
        kotlin.jvm.internal.f0.p(handler, "handler");
        this.channel.J(handler);
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean O() {
        return this.channel.O();
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean U(@dl.e Throwable cause) {
        return this.channel.U(cause);
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.e
    public Object X(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return this.channel.X(t10, cVar);
    }

    public boolean a() {
        return this.channel.isFull();
    }

    @Override // androidx.paging.b1
    @dl.d
    public kotlinx.coroutines.channels.b0<T> c() {
        return this.channel;
    }

    @Override // kotlinx.coroutines.q0
    @dl.d
    /* JADX INFO: renamed from: j0 */
    public CoroutineContext getCoroutineContext() {
        return this.f26309c.getCoroutineContext();
    }

    @Override // kotlinx.coroutines.channels.b0
    @dl.d
    public kotlinx.coroutines.selects.e<T, kotlinx.coroutines.channels.b0<T>> l() {
        return this.channel.l();
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean offer(T element) {
        return this.channel.offer(element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.paging.b1
    @dl.e
    public Object r(@dl.d yh.a<b2> aVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        SimpleProducerScopeImpl$awaitClose$1 simpleProducerScopeImpl$awaitClose$1;
        if (cVar instanceof SimpleProducerScopeImpl$awaitClose$1) {
            simpleProducerScopeImpl$awaitClose$1 = (SimpleProducerScopeImpl$awaitClose$1) cVar;
            int i10 = simpleProducerScopeImpl$awaitClose$1.f26311c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                simpleProducerScopeImpl$awaitClose$1.f26311c = i10 - Integer.MIN_VALUE;
            } else {
                simpleProducerScopeImpl$awaitClose$1 = new SimpleProducerScopeImpl$awaitClose$1(this, cVar);
            }
        } else {
            simpleProducerScopeImpl$awaitClose$1 = new SimpleProducerScopeImpl$awaitClose$1(this, cVar);
        }
        Object obj = simpleProducerScopeImpl$awaitClose$1.f26310b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = simpleProducerScopeImpl$awaitClose$1.f26311c;
        try {
            if (i11 == 0) {
                kotlin.t0.n(obj);
                CoroutineContext.a aVarF = getCoroutineContext().f(d2.INSTANCE);
                if (aVarF == null) {
                    throw new IllegalStateException("Internal error, context should have a job.".toString());
                }
                d2 d2Var = (d2) aVarF;
                simpleProducerScopeImpl$awaitClose$1.f26313e = aVar;
                simpleProducerScopeImpl$awaitClose$1.f26314f = d2Var;
                simpleProducerScopeImpl$awaitClose$1.f26311c = 1;
                final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(simpleProducerScopeImpl$awaitClose$1), 1);
                qVar.F0();
                d2Var.K(new yh.l<Throwable, b2>() { // from class: androidx.paging.SimpleProducerScopeImpl$awaitClose$2$1
                    {
                        super(1);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                        invoke2(th2);
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@dl.e Throwable th2) {
                        kotlinx.coroutines.p pVar = qVar;
                        b2 b2Var = b2.f124493a;
                        Result.a aVar2 = Result.f124476c;
                        pVar.resumeWith(Result.b(b2Var));
                    }
                });
                Object objT = qVar.t();
                if (objT == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(simpleProducerScopeImpl$awaitClose$1);
                }
                if (objT == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (yh.a) simpleProducerScopeImpl$awaitClose$1.f26313e;
                kotlin.t0.n(obj);
            }
            aVar.invoke();
            return b2.f124493a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }
}
