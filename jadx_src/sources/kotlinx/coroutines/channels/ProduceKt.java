package kotlinx.coroutines.channels;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.t0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.t1;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Produce.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001ag\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a \u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aª\u0001\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132-\b\u0002\u0010\u001b\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0015j\u0004\u0018\u0001`\u001a2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lkotlinx/coroutines/channels/w;", "Lkotlin/Function0;", "Lkotlin/b2;", "block", ak.av, "(Lkotlinx/coroutines/channels/w;Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", androidx.exifinterface.media.a.S4, "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "e", "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;ILyh/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineStart;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", ak.aF, "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lyh/l;Lyh/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "d", "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;Lkotlinx/coroutines/CoroutineStart;Lyh/l;Lyh/p;)Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class ProduceKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object a(@dl.d w<?> wVar, @dl.d yh.a<b2> aVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (cVar instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) cVar;
            int i10 = produceKt$awaitClose$1.f128997e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.f128997e = i10 - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(cVar);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(cVar);
        }
        Object obj = produceKt$awaitClose$1.f128996d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = produceKt$awaitClose$1.f128997e;
        try {
            if (i11 == 0) {
                t0.n(obj);
                if (!(produceKt$awaitClose$1.getContext().f(d2.INSTANCE) == wVar)) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context".toString());
                }
                produceKt$awaitClose$1.f128994b = wVar;
                produceKt$awaitClose$1.f128995c = aVar;
                produceKt$awaitClose$1.f128997e = 1;
                final kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(produceKt$awaitClose$1), 1);
                qVar.F0();
                wVar.J(new yh.l<Throwable, b2>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$4$1
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
                    public final void invoke2(@dl.e Throwable th2) {
                        kotlinx.coroutines.p<b2> pVar = qVar;
                        Result.a aVar2 = Result.f124476c;
                        pVar.resumeWith(Result.b(b2.f124493a));
                    }
                });
                Object objT = qVar.t();
                if (objT == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(produceKt$awaitClose$1);
                }
                if (objT == objH) {
                    return objH;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (yh.a) produceKt$awaitClose$1.f128995c;
                t0.n(obj);
            }
            aVar.invoke();
            return b2.f124493a;
        } catch (Throwable th2) {
            aVar.invoke();
            throw th2;
        }
    }

    public static /* synthetic */ Object b(w wVar, yh.a aVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = new yh.a<b2>() { // from class: kotlinx.coroutines.channels.ProduceKt$awaitClose$2
                @Override // yh.a
                public /* bridge */ /* synthetic */ b2 invoke() {
                    invoke2();
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return a(wVar, aVar, cVar);
    }

    @dl.d
    @z1
    public static final <E> ReceiveChannel<E> c(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, int i10, @dl.d CoroutineStart coroutineStart, @dl.e yh.l<? super Throwable, b2> lVar, @kotlin.b @dl.d yh.p<? super w<? super E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return d(q0Var, coroutineContext, i10, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    @dl.d
    public static final <E> ReceiveChannel<E> d(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, int i10, @dl.d BufferOverflow bufferOverflow, @dl.d CoroutineStart coroutineStart, @dl.e yh.l<? super Throwable, b2> lVar, @kotlin.b @dl.d yh.p<? super w<? super E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        v vVar = new v(CoroutineContextKt.e(q0Var, coroutineContext), m.d(i10, bufferOverflow, null, 4, null));
        if (lVar != null) {
            vVar.K(lVar);
        }
        vVar.J1(coroutineStart, vVar, pVar);
        return vVar;
    }

    @dl.d
    @t1
    public static final <E> ReceiveChannel<E> e(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, int i10, @kotlin.b @dl.d yh.p<? super w<? super E>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return d(q0Var, coroutineContext, i10, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    public static /* synthetic */ ReceiveChannel f(q0 q0Var, CoroutineContext coroutineContext, int i10, CoroutineStart coroutineStart, yh.l lVar, yh.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 8) != 0) {
            lVar = null;
        }
        return c(q0Var, coroutineContext2, i12, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ ReceiveChannel g(q0 q0Var, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, yh.l lVar, yh.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        int i12 = i10;
        if ((i11 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        BufferOverflow bufferOverflow2 = bufferOverflow;
        if ((i11 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        if ((i11 & 16) != 0) {
            lVar = null;
        }
        return d(q0Var, coroutineContext2, i12, bufferOverflow2, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ ReceiveChannel h(q0 q0Var, CoroutineContext coroutineContext, int i10, yh.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return e(q0Var, coroutineContext, i10, pVar);
    }
}
