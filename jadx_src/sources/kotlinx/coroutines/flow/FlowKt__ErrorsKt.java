package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.d2;

/* JADX INFO: compiled from: Errors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0002¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ae\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u000f23\b\u0002\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u007f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012W\u0010\u0013\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0016¢\u0006\u0002\b\u000bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001b\u0010\u001f\u001a\u00020\u0012*\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u001d\u0010\"\u001a\u00020\u0012*\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\"\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/f;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "action", ak.av, "(Lkotlinx/coroutines/flow/e;Lyh/q;)Lkotlinx/coroutines/flow/e;", "", "retries", "Lkotlin/Function2;", "", "predicate", "e", "(Lkotlinx/coroutines/flow/e;JLyh/p;)Lkotlinx/coroutines/flow/e;", "Lkotlin/Function4;", "attempt", "g", "(Lkotlinx/coroutines/flow/e;Lyh/r;)Lkotlinx/coroutines/flow/e;", "collector", "b", "(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", ak.aF, "(Ljava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class FlowKt__ErrorsKt {
    @dl.d
    public static final <T> e<T> a(@dl.d e<? extends T> eVar, @dl.d yh.q<? super f<? super T>, ? super Throwable, ? super kotlin.coroutines.c<? super b2>, ? extends Object> qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(eVar, qVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object b(@dl.d e<? extends T> eVar, @dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super Throwable> cVar) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) cVar;
            int i10 = flowKt__ErrorsKt$catchImpl$1.f129429d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.f129429d = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(cVar);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(cVar);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.f129428c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = flowKt__ErrorsKt$catchImpl$1.f129429d;
        if (i11 == 0) {
            t0.n(obj);
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                f<? super Object> flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2<>(fVar, objectRef2);
                flowKt__ErrorsKt$catchImpl$1.f129427b = objectRef2;
                flowKt__ErrorsKt$catchImpl$1.f129429d = 1;
                if (eVar.a(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == objH) {
                    return objH;
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                objectRef = objectRef2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) flowKt__ErrorsKt$catchImpl$1.f129427b;
            try {
                t0.n(obj);
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        Throwable th4 = (Throwable) objectRef.f124891b;
        if (d(th, th4) || c(th, flowKt__ErrorsKt$catchImpl$1.getCom.umeng.analytics.pro.d.R java.lang.String())) {
            throw th;
        }
        if (th4 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            kotlin.o.a(th4, th);
            throw th4;
        }
        kotlin.o.a(th, th4);
        throw th;
    }

    private static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
        d2 d2Var = (d2) coroutineContext.f(d2.INSTANCE);
        if (d2Var == null || !d2Var.isCancelled()) {
            return false;
        }
        return d(th2, d2Var.Z());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && f0.g(th3, th2);
    }

    @dl.d
    public static final <T> e<T> e(@dl.d e<? extends T> eVar, long j10, @dl.d yh.p<? super Throwable, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> pVar) {
        if (j10 > 0) {
            return g.x1(eVar, new FlowKt__ErrorsKt$retry$3(j10, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j10).toString());
    }

    public static /* synthetic */ e f(e eVar, long j10, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = Long.MAX_VALUE;
        }
        if ((i10 & 2) != 0) {
            pVar = new FlowKt__ErrorsKt$retry$1(null);
        }
        return g.v1(eVar, j10, pVar);
    }

    @dl.d
    public static final <T> e<T> g(@dl.d e<? extends T> eVar, @dl.d yh.r<? super f<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.c<? super Boolean>, ? extends Object> rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eVar, rVar);
    }
}
