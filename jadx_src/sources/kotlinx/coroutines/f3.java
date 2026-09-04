package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: Supervisor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/d2;", "parent", "Lkotlinx/coroutines/b0;", ak.av, "b", "(Lkotlinx/coroutines/d2;)Lkotlinx/coroutines/d2;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/q0;", "Lkotlin/coroutines/c;", "", "Lkotlin/t;", "block", "e", "(Lyh/p;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class f3 {
    @dl.d
    public static final b0 a(@dl.e d2 d2Var) {
        return new e3(d2Var);
    }

    public static /* synthetic */ b0 c(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return a(d2Var);
    }

    public static /* synthetic */ d2 d(d2 d2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d2Var = null;
        }
        return a(d2Var);
    }

    @dl.e
    public static final <R> Object e(@dl.d yh.p<? super q0, ? super kotlin.coroutines.c<? super R>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super R> cVar) {
        d3 d3Var = new d3(cVar.getContext(), cVar);
        Object objF = bj.b.f(d3Var, d3Var, pVar);
        if (objF == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objF;
    }
}
