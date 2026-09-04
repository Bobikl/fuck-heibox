package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", ak.av, "(Lkotlin/coroutines/CoroutineContext;Lyh/p;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/BuildersKt")
public final /* synthetic */ class j {
    /* JADX WARN: Code duplicated, block: B:16:0x0036  */
    public static final <T> T a(@dl.d CoroutineContext coroutineContext, @dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar) throws InterruptedException {
        l1 l1VarA;
        CoroutineContext coroutineContextE;
        Thread threadCurrentThread = Thread.currentThread();
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) coroutineContext.f(kotlin.coroutines.d.f124698w1);
        if (dVar == null) {
            l1VarA = i3.f130113a.b();
            coroutineContextE = CoroutineContextKt.e(v1.f130503b, coroutineContext.I(l1VarA));
        } else {
            l1 l1Var = dVar instanceof l1 ? (l1) dVar : null;
            if (l1Var == null) {
                l1VarA = i3.f130113a.a();
            } else {
                l1 l1Var2 = l1Var.G0() ? l1Var : null;
                if (l1Var2 == null) {
                    l1VarA = i3.f130113a.a();
                } else {
                    l1VarA = l1Var2;
                }
            }
            coroutineContextE = CoroutineContextKt.e(v1.f130503b, coroutineContext);
        }
        g gVar = new g(coroutineContextE, threadCurrentThread, l1VarA);
        gVar.J1(CoroutineStart.DEFAULT, gVar, pVar);
        return (T) gVar.K1();
    }

    public static /* synthetic */ Object b(CoroutineContext coroutineContext, yh.p pVar, int i10, Object obj) throws InterruptedException {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f124694b;
        }
        return i.f(coroutineContext, pVar);
    }
}
