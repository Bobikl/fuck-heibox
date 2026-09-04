package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001aQ\u0010\f\u001a\u00020\u000b*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a]\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\u000e*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aW\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e*\u00020\u00142)\b\b\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\b\tH\u0086Jø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018\"\u0014\u0010\u001c\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlinx/coroutines/CoroutineStart;", com.google.android.exoplayer2.text.ttml.d.f49798o0, "Lkotlin/Function2;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "Lkotlin/t;", "block", "Lkotlinx/coroutines/d2;", "e", "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lyh/p;)Lkotlinx/coroutines/d2;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/w0;", ak.av, "(Lkotlinx/coroutines/q0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lyh/p;)Lkotlinx/coroutines/w0;", "g", "(Lkotlin/coroutines/CoroutineContext;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", ak.aF, "(Lkotlinx/coroutines/CoroutineDispatcher;Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "", "I", "UNDECIDED", "b", kotlinx.coroutines.debug.internal.d.f129171c, "RESUMED", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130246a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130247b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130248c = 2;

    @dl.d
    public static final <T> w0<T> a(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, @dl.d CoroutineStart coroutineStart, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) {
        CoroutineContext coroutineContextE = CoroutineContextKt.e(q0Var, coroutineContext);
        x0 l2Var = coroutineStart.isLazy() ? new l2(coroutineContextE, pVar) : new x0(coroutineContextE, true);
        ((a) l2Var).J1(coroutineStart, l2Var, pVar);
        return (w0<T>) l2Var;
    }

    public static /* synthetic */ w0 b(q0 q0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return i.a(q0Var, coroutineContext, coroutineStart, pVar);
    }

    @dl.e
    public static final <T> Object c(@dl.d CoroutineDispatcher coroutineDispatcher, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return i.h(coroutineDispatcher, pVar, cVar);
    }

    private static final <T> Object d(CoroutineDispatcher coroutineDispatcher, yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, kotlin.coroutines.c<? super T> cVar) throws Throwable {
        kotlin.jvm.internal.c0.e(0);
        Object objH = i.h(coroutineDispatcher, pVar, cVar);
        kotlin.jvm.internal.c0.e(1);
        return objH;
    }

    @dl.d
    public static final d2 e(@dl.d q0 q0Var, @dl.d CoroutineContext coroutineContext, @dl.d CoroutineStart coroutineStart, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super kotlin.b2>, ? extends Object> pVar) {
        CoroutineContext coroutineContextE = CoroutineContextKt.e(q0Var, coroutineContext);
        a m2Var = coroutineStart.isLazy() ? new m2(coroutineContextE, pVar) : new c3(coroutineContextE, true);
        m2Var.J1(coroutineStart, m2Var, pVar);
        return m2Var;
    }

    public static /* synthetic */ d2 f(q0 q0Var, CoroutineContext coroutineContext, CoroutineStart coroutineStart, yh.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        if ((i10 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return i.d(q0Var, coroutineContext, coroutineStart, pVar);
    }

    @dl.e
    public static final <T> Object g(@dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) throws Throwable {
        Object objL1;
        CoroutineContext context = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
        CoroutineContext coroutineContextD = CoroutineContextKt.d(context, coroutineContext);
        g2.z(coroutineContextD);
        if (coroutineContextD == context) {
            kotlinx.coroutines.internal.k0 k0Var = new kotlinx.coroutines.internal.k0(coroutineContextD, cVar);
            objL1 = bj.b.f(k0Var, k0Var, pVar);
        } else {
            kotlin.coroutines.d.b bVar = kotlin.coroutines.d.f124698w1;
            if (kotlin.jvm.internal.f0.g(coroutineContextD.f(bVar), context.f(bVar))) {
                o3 o3Var = new o3(coroutineContextD, cVar);
                Object objC = ThreadContextKt.c(coroutineContextD, null);
                try {
                    Object objF = bj.b.f(o3Var, o3Var, pVar);
                    ThreadContextKt.a(coroutineContextD, objC);
                    objL1 = objF;
                } catch (Throwable th2) {
                    ThreadContextKt.a(coroutineContextD, objC);
                    throw th2;
                }
            } else {
                a1 a1Var = new a1(coroutineContextD, cVar);
                bj.a.f(pVar, a1Var, a1Var, null, 4, null);
                objL1 = a1Var.L1();
            }
        }
        if (objL1 == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objL1;
    }
}
