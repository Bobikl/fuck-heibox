package bj;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.w0;
import kotlin.t0;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.k0;
import kotlinx.coroutines.k2;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: Undispatched.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007\u001aT\u0010\u000e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a9\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0082\b\u001a[\u0010\u0013\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a?\u0010\u001b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "", "completion", "Lkotlin/b2;", ak.aF, "(Lyh/l;Lkotlin/coroutines/c;)V", "R", "Lkotlin/Function2;", SocialConstants.PARAM_RECEIVER, "d", "(Lyh/p;Ljava/lang/Object;Lkotlin/coroutines/c;)V", ak.av, "b", "block", "e", "Lkotlinx/coroutines/internal/k0;", "Lkotlin/t;", "f", "(Lkotlinx/coroutines/internal/k0;Ljava/lang/Object;Lyh/p;)Ljava/lang/Object;", "g", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", RXScreenCaptureService.KEY_HEIGHT, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class b {
    public static final <T> void a(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> cVar) {
        c cVarA = f.a(cVar);
        try {
            CoroutineContext context = cVar.getContext();
            Object objC = ThreadContextKt.c(context, null);
            try {
                Object objInvoke = ((l) w0.q(lVar, 1)).invoke(cVarA);
                ThreadContextKt.a(context, objC);
                if (objInvoke != kotlin.coroutines.intrinsics.b.h()) {
                    Result.a aVar = Result.f124476c;
                    cVarA.resumeWith(Result.b(objInvoke));
                }
            } catch (Throwable th2) {
                ThreadContextKt.a(context, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            Result.a aVar2 = Result.f124476c;
            cVarA.resumeWith(Result.b(t0.a(th3)));
        }
    }

    public static final <R, T> void b(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @d c<? super T> cVar) {
        c cVarA = f.a(cVar);
        try {
            CoroutineContext context = cVar.getContext();
            Object objC = ThreadContextKt.c(context, null);
            try {
                Object objInvoke = ((p) w0.q(pVar, 2)).invoke(r10, cVarA);
                ThreadContextKt.a(context, objC);
                if (objInvoke != kotlin.coroutines.intrinsics.b.h()) {
                    Result.a aVar = Result.f124476c;
                    cVarA.resumeWith(Result.b(objInvoke));
                }
            } catch (Throwable th2) {
                ThreadContextKt.a(context, objC);
                throw th2;
            }
        } catch (Throwable th3) {
            Result.a aVar2 = Result.f124476c;
            cVarA.resumeWith(Result.b(t0.a(th3)));
        }
    }

    public static final <T> void c(@d l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> cVar) {
        c cVarA = f.a(cVar);
        try {
            Object objInvoke = ((l) w0.q(lVar, 1)).invoke(cVarA);
            if (objInvoke != kotlin.coroutines.intrinsics.b.h()) {
                Result.a aVar = Result.f124476c;
                cVarA.resumeWith(Result.b(objInvoke));
            }
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            cVarA.resumeWith(Result.b(t0.a(th2)));
        }
    }

    public static final <R, T> void d(@d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @d c<? super T> cVar) {
        c cVarA = f.a(cVar);
        try {
            Object objInvoke = ((p) w0.q(pVar, 2)).invoke(r10, cVarA);
            if (objInvoke != kotlin.coroutines.intrinsics.b.h()) {
                Result.a aVar = Result.f124476c;
                cVarA.resumeWith(Result.b(objInvoke));
            }
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            cVarA.resumeWith(Result.b(t0.a(th2)));
        }
    }

    private static final <T> void e(c<? super T> cVar, l<? super c<? super T>, ? extends Object> lVar) {
        c cVarA = f.a(cVar);
        try {
            Object objInvoke = lVar.invoke(cVarA);
            if (objInvoke != kotlin.coroutines.intrinsics.b.h()) {
                Result.a aVar = Result.f124476c;
                cVarA.resumeWith(Result.b(objInvoke));
            }
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            cVarA.resumeWith(Result.b(t0.a(th2)));
        }
    }

    @e
    public static final <T, R> Object f(@d k0<? super T> k0Var, R r10, @d p<? super R, ? super c<? super T>, ? extends Object> pVar) {
        Object d0Var;
        Object objF1;
        try {
            d0Var = ((p) w0.q(pVar, 2)).invoke(r10, k0Var);
        } catch (Throwable th2) {
            d0Var = new d0(th2, false, 2, null);
        }
        if (d0Var != kotlin.coroutines.intrinsics.b.h() && (objF1 = k0Var.f1(d0Var)) != k2.f130251b) {
            if (objF1 instanceof d0) {
                throw ((d0) objF1).cause;
            }
            return k2.o(objF1);
        }
        return kotlin.coroutines.intrinsics.b.h();
    }

    @e
    public static final <T, R> Object g(@d k0<? super T> k0Var, R r10, @d p<? super R, ? super c<? super T>, ? extends Object> pVar) throws Throwable {
        Object d0Var;
        Object objF1;
        try {
            d0Var = ((p) w0.q(pVar, 2)).invoke(r10, k0Var);
        } catch (Throwable th2) {
            d0Var = new d0(th2, false, 2, null);
        }
        if (d0Var != kotlin.coroutines.intrinsics.b.h() && (objF1 = k0Var.f1(d0Var)) != k2.f130251b) {
            if (objF1 instanceof d0) {
                Throwable th3 = ((d0) objF1).cause;
                if (((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).coroutine == k0Var) ? false : true) {
                    throw th3;
                }
                if (d0Var instanceof d0) {
                    throw ((d0) d0Var).cause;
                }
            } else {
                d0Var = k2.o(objF1);
            }
            return d0Var;
        }
        return kotlin.coroutines.intrinsics.b.h();
    }

    private static final <T> Object h(k0<? super T> k0Var, l<? super Throwable, Boolean> lVar, yh.a<? extends Object> aVar) throws Throwable {
        Object d0Var;
        Object objF1;
        try {
            d0Var = aVar.invoke();
        } catch (Throwable th2) {
            d0Var = new d0(th2, false, 2, null);
        }
        if (d0Var != kotlin.coroutines.intrinsics.b.h() && (objF1 = k0Var.f1(d0Var)) != k2.f130251b) {
            if (!(objF1 instanceof d0)) {
                return k2.o(objF1);
            }
            d0 d0Var2 = (d0) objF1;
            if (lVar.invoke(d0Var2.cause).booleanValue()) {
                throw d0Var2.cause;
            }
            if (d0Var instanceof d0) {
                throw ((d0) d0Var).cause;
            }
            return d0Var;
        }
        return kotlin.coroutines.intrinsics.b.h();
    }
}
