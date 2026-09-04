package kotlinx.coroutines.selects;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.c0;
import yh.l;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/a;", "Lkotlin/b2;", "Lkotlin/t;", "builder", ak.av, "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class h {
    @dl.e
    public static final <R> Object a(@dl.d l<? super a<? super R>, b2> lVar, @dl.d kotlin.coroutines.c<? super R> cVar) throws Throwable {
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(cVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th2) {
            unbiasedSelectBuilderImpl.c(th2);
        }
        Object objD = unbiasedSelectBuilderImpl.d();
        if (objD == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objD;
    }

    private static final <R> Object b(l<? super a<? super R>, b2> lVar, kotlin.coroutines.c<? super R> cVar) throws Throwable {
        c0.e(0);
        UnbiasedSelectBuilderImpl unbiasedSelectBuilderImpl = new UnbiasedSelectBuilderImpl(cVar);
        try {
            lVar.invoke(unbiasedSelectBuilderImpl);
        } catch (Throwable th2) {
            unbiasedSelectBuilderImpl.c(th2);
        }
        Object objD = unbiasedSelectBuilderImpl.d();
        if (objD == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        c0.e(1);
        return objD;
    }
}
