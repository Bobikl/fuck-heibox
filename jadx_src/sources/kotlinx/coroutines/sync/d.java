package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0002H&R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/sync/d;", "", "Lkotlin/b2;", ak.aF, "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "", ak.av, "release", "", "b", "()I", "availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface d {
    boolean a();

    int b();

    @dl.e
    Object c(@dl.d kotlin.coroutines.c<? super b2> cVar);

    void release();
}
