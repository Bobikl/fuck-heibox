package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0017J\u001c\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/scheduling/o;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", "R", "O", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o extends CoroutineDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final o f130390d = new o();

    private o() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        c.f130358j.t0(runnable, n.f130389j, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @z1
    public void R(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        c.f130358j.t0(runnable, n.f130389j, true);
    }
}
