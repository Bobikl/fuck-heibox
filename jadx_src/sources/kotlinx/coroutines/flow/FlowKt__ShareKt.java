package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.f0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.a0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.flow.internal.ChannelFlow;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.y;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/q0;", "scope", "Lkotlinx/coroutines/flow/r;", "started", "", "replay", "Lkotlinx/coroutines/flow/n;", "g", "Lkotlinx/coroutines/flow/q;", ak.aF, "(Lkotlinx/coroutines/flow/e;I)Lkotlinx/coroutines/flow/q;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "upstream", "Lkotlinx/coroutines/flow/i;", "shared", "initialValue", "Lkotlinx/coroutines/d2;", "d", "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/r;Ljava/lang/Object;)Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/flow/u;", "j", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/q0;Lkotlinx/coroutines/flow/r;Ljava/lang/Object;)Lkotlinx/coroutines/flow/u;", "i", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/q0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/y;", "result", "Lkotlin/b2;", "e", "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/y;)V", ak.av, "Lkotlinx/coroutines/flow/j;", "b", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "action", "f", "(Lkotlinx/coroutines/flow/n;Lyh/p;)Lkotlinx/coroutines/flow/n;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ShareKt {
    @dl.d
    public static final <T> n<T> a(@dl.d i<T> iVar) {
        return new k(iVar, null);
    }

    @dl.d
    public static final <T> u<T> b(@dl.d j<T> jVar) {
        return new l(jVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    private static final <T> q<T> c(e<? extends T> eVar, int i10) {
        ChannelFlow channelFlow;
        e<T> eVarK;
        int iU = fi.u.u(i10, kotlinx.coroutines.channels.k.INSTANCE.a()) - i10;
        if (!(eVar instanceof ChannelFlow) || (eVarK = (channelFlow = (ChannelFlow) eVar).k()) == null) {
            return new q<>(eVar, iU, BufferOverflow.SUSPEND, EmptyCoroutineContext.f124694b);
        }
        int i11 = channelFlow.capacity;
        if (i11 != -3 && i11 != -2 && i11 != 0) {
            iU = i11;
        } else if (channelFlow.onBufferOverflow == BufferOverflow.SUSPEND) {
            if (i11 == 0) {
                iU = 0;
            }
        } else if (i10 == 0) {
            iU = 1;
        } else {
            iU = 0;
        }
        return new q<>(eVarK, iU, channelFlow.onBufferOverflow, channelFlow.com.umeng.analytics.pro.d.R java.lang.String);
    }

    private static final <T> d2 d(q0 q0Var, CoroutineContext coroutineContext, e<? extends T> eVar, i<T> iVar, r rVar, T t10) {
        return kotlinx.coroutines.i.d(q0Var, coroutineContext, f0.g(rVar, r.INSTANCE.c()) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED, new FlowKt__ShareKt$launchSharing$1(rVar, eVar, iVar, t10, null));
    }

    private static final <T> void e(q0 q0Var, CoroutineContext coroutineContext, e<? extends T> eVar, y<u<T>> yVar) {
        kotlinx.coroutines.k.f(q0Var, coroutineContext, null, new FlowKt__ShareKt$launchSharingDeferred$1(eVar, yVar, null), 2, null);
    }

    @dl.d
    public static final <T> n<T> f(@dl.d n<? extends T> nVar, @dl.d yh.p<? super f<? super T>, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar) {
        return new SubscribedSharedFlow(nVar, pVar);
    }

    @dl.d
    public static final <T> n<T> g(@dl.d e<? extends T> eVar, @dl.d q0 q0Var, @dl.d r rVar, int i10) {
        q qVarC = c(eVar, i10);
        i iVarA = o.a(i10, qVarC.extraBufferCapacity, qVarC.onBufferOverflow);
        return new k(iVarA, d(q0Var, qVarC.com.umeng.analytics.pro.d.R java.lang.String, qVarC.upstream, iVarA, rVar, o.f130093a));
    }

    public static /* synthetic */ n h(e eVar, q0 q0Var, r rVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return g.F1(eVar, q0Var, rVar, i10);
    }

    @dl.e
    public static final <T> Object i(@dl.d e<? extends T> eVar, @dl.d q0 q0Var, @dl.d kotlin.coroutines.c<? super u<? extends T>> cVar) {
        q qVarC = c(eVar, 1);
        y yVarC = a0.c(null, 1, null);
        e(q0Var, qVarC.com.umeng.analytics.pro.d.R java.lang.String, qVarC.upstream, yVarC);
        return yVarC.p(cVar);
    }

    @dl.d
    public static final <T> u<T> j(@dl.d e<? extends T> eVar, @dl.d q0 q0Var, @dl.d r rVar, T t10) {
        q qVarC = c(eVar, 1);
        j jVarA = v.a(t10);
        return new l(jVarA, d(q0Var, qVarC.com.umeng.analytics.pro.d.R java.lang.String, qVarC.upstream, jVarA, rVar, t10));
    }
}
