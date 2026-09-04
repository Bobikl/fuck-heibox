package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import java.util.concurrent.Future;
import kotlin.Metadata;

/* JADX INFO: compiled from: Future.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00052\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/d2;", "Ljava/util/concurrent/Future;", "future", "Lkotlinx/coroutines/h1;", "b", "Lkotlinx/coroutines/p;", "Lkotlin/b2;", ak.av, "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/JobKt")
public final /* synthetic */ class h2 {
    public static final void a(@dl.d p<?> pVar, @dl.d Future<?> future) {
        pVar.L(new l(future));
    }

    @dl.d
    @z1
    public static final h1 b(@dl.d d2 d2Var, @dl.d Future<?> future) {
        return d2Var.K(new m(future));
    }
}
