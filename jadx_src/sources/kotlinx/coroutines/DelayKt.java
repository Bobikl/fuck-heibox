package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\u0003*\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\"\u0018\u0010\u0011\u001a\u00020\u000e*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"", ak.av, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "timeMillis", "Lkotlin/b2;", "b", "(JLkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/time/e;", "duration", ak.aF, "e", "(J)J", "Lkotlin/coroutines/CoroutineContext;", "Lkotlinx/coroutines/y0;", "d", "(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/y0;", "delay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class DelayKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object a(@dl.d kotlin.coroutines.c<?> cVar) throws Throwable {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        if (cVar instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) cVar;
            int i10 = delayKt$awaitCancellation$1.f128685c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.f128685c = i10 - Integer.MIN_VALUE;
            } else {
                delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(cVar);
            }
        } else {
            delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(cVar);
        }
        Object obj = delayKt$awaitCancellation$1.f128684b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = delayKt$awaitCancellation$1.f128685c;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            delayKt$awaitCancellation$1.f128685c = 1;
            q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(delayKt$awaitCancellation$1), 1);
            qVar.F0();
            Object objT = qVar.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(delayKt$awaitCancellation$1);
            }
            if (objT == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }

    @dl.e
    public static final Object b(long j10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        if (j10 <= 0) {
            return kotlin.b2.f124493a;
        }
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        if (j10 < Long.MAX_VALUE) {
            d(qVar.getContext()).o(j10, qVar);
        }
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT == kotlin.coroutines.intrinsics.b.h() ? objT : kotlin.b2.f124493a;
    }

    @dl.e
    public static final Object c(long j10, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        Object objB = b(e(j10), cVar);
        return objB == kotlin.coroutines.intrinsics.b.h() ? objB : kotlin.b2.f124493a;
    }

    @dl.d
    public static final y0 d(@dl.d CoroutineContext coroutineContext) {
        CoroutineContext.a aVarF = coroutineContext.f(kotlin.coroutines.d.f124698w1);
        y0 y0Var = aVarF instanceof y0 ? (y0) aVarF : null;
        return y0Var == null ? v0.a() : y0Var;
    }

    public static final long e(long j10) {
        if (kotlin.time.e.h(j10, kotlin.time.e.f128628c.W()) > 0) {
            return fi.u.v(kotlin.time.e.Q(j10), 1L);
        }
        return 0L;
    }
}
