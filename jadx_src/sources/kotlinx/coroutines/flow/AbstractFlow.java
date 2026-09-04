package kotlinx.coroutines.flow;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.t0;
import kotlinx.coroutines.flow.internal.SafeCollector;
import kotlinx.coroutines.u1;

/* JADX INFO: compiled from: Flow.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/flow/AbstractFlow;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/e;", "Lkotlinx/coroutines/flow/a;", "Lkotlinx/coroutines/flow/f;", "collector", "Lkotlin/b2;", ak.av, "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/c;)Ljava/lang/Object;", "g", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@u1
public abstract class AbstractFlow<T> implements e<T>, a<T> {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.e
    @dl.e
    public final Object a(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
        AbstractFlow$collect$1 abstractFlow$collect$1;
        Throwable th2;
        SafeCollector safeCollector;
        if (cVar instanceof AbstractFlow$collect$1) {
            abstractFlow$collect$1 = (AbstractFlow$collect$1) cVar;
            int i10 = abstractFlow$collect$1.f129194e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                abstractFlow$collect$1.f129194e = i10 - Integer.MIN_VALUE;
            } else {
                abstractFlow$collect$1 = new AbstractFlow$collect$1(this, cVar);
            }
        } else {
            abstractFlow$collect$1 = new AbstractFlow$collect$1(this, cVar);
        }
        Object obj = abstractFlow$collect$1.f129192c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = abstractFlow$collect$1.f129194e;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            safeCollector = (SafeCollector) abstractFlow$collect$1.f129191b;
            try {
                t0.n(obj);
                safeCollector.releaseIntercepted();
                return b2.f124493a;
            } catch (Throwable th3) {
                th2 = th3;
                safeCollector.releaseIntercepted();
                throw th2;
            }
        }
        t0.n(obj);
        SafeCollector safeCollector2 = new SafeCollector(fVar, abstractFlow$collect$1.getContext());
        try {
            abstractFlow$collect$1.f129191b = safeCollector2;
            abstractFlow$collect$1.f129194e = 1;
            if (g(safeCollector2, abstractFlow$collect$1) == objH) {
                return objH;
            }
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            return b2.f124493a;
        } catch (Throwable th4) {
            th2 = th4;
            safeCollector = safeCollector2;
            safeCollector.releaseIntercepted();
            throw th2;
        }
    }

    @dl.e
    public abstract Object g(@dl.d f<? super T> fVar, @dl.d kotlin.coroutines.c<? super b2> cVar);
}
