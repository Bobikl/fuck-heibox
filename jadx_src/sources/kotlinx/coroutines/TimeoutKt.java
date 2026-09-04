package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000<\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aW\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\r\u0010\n\u001aL\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\n\u001aR\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\f\u001a\u00020\u000b2'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\n\u001aa\u0010\u0013\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u0010\"\b\b\u0001\u0010\u0000*\u00028\u00002\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0016H\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {androidx.exifinterface.media.a.f23244d5, "", "timeMillis", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.aF, "(JLyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/time/e;", l5.a.f130839h0, "d", "e", "f", "U", "Lkotlinx/coroutines/m3;", "coroutine", "b", "(Lkotlinx/coroutines/m3;Lyh/p;)Ljava/lang/Object;", "time", "Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/TimeoutCancellationException;", ak.av, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class TimeoutKt {
    @dl.d
    public static final TimeoutCancellationException a(long j10, @dl.d d2 d2Var) {
        return new TimeoutCancellationException("Timed out waiting for " + j10 + " ms", d2Var);
    }

    private static final <U, T extends U> Object b(m3<U, ? super T> m3Var, yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        g2.y(m3Var, DelayKt.d(m3Var.uCont.getContext()).r(m3Var.time, m3Var, m3Var.getContext()));
        return bj.b.g(m3Var, m3Var, pVar);
    }

    @dl.e
    public static final <T> Object c(long j10, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        if (j10 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately");
        }
        Object objB = b(new m3(j10, cVar), pVar);
        if (objB == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objB;
    }

    @dl.e
    public static final <T> Object d(long j10, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return c(DelayKt.e(j10), pVar, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlinx.coroutines.m3] */
    @dl.e
    public static final <T> Object e(long j10, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref.ObjectRef objectRef;
        if (cVar instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) cVar;
            int i10 = timeoutKt$withTimeoutOrNull$1.f128716f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.f128716f = i10 - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(cVar);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(cVar);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.f128715e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = timeoutKt$withTimeoutOrNull$1.f128716f;
        if (i11 == 0) {
            kotlin.t0.n(obj);
            if (j10 <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.f128713c = pVar;
                timeoutKt$withTimeoutOrNull$1.f128714d = objectRef2;
                timeoutKt$withTimeoutOrNull$1.f128712b = j10;
                timeoutKt$withTimeoutOrNull$1.f128716f = 1;
                ?? r10 = (T) new m3(j10, timeoutKt$withTimeoutOrNull$1);
                objectRef2.f124891b = r10;
                Object objB = b(r10, pVar);
                if (objB == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(timeoutKt$withTimeoutOrNull$1);
                }
                return objB == objH ? objH : objB;
            } catch (TimeoutCancellationException e10) {
                e = e10;
                objectRef = objectRef2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = (Ref.ObjectRef) timeoutKt$withTimeoutOrNull$1.f128714d;
            try {
                kotlin.t0.n(obj);
                return obj;
            } catch (TimeoutCancellationException e11) {
                e = e11;
            }
        }
        if (e.coroutine == objectRef.f124891b) {
            return null;
        }
        throw e;
    }

    @dl.e
    public static final <T> Object f(long j10, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return e(DelayKt.e(j10), pVar, cVar);
    }
}
