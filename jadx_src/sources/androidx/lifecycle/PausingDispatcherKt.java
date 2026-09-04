package androidx.lifecycle;

import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: PausingDispatcher.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class PausingDispatcherKt {
    @kotlin.k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object a(@dl.d Lifecycle lifecycle, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return g(lifecycle, Lifecycle.State.CREATED, pVar, cVar);
    }

    @kotlin.k(message = "whenCreated has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withCreated for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object b(@dl.d y yVar, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return a(yVar.getLifecycle(), pVar, cVar);
    }

    @kotlin.k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object c(@dl.d Lifecycle lifecycle, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return g(lifecycle, Lifecycle.State.RESUMED, pVar, cVar);
    }

    @kotlin.k(message = "whenResumed has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withResumed for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object d(@dl.d y yVar, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return c(yVar.getLifecycle(), pVar, cVar);
    }

    @kotlin.k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object e(@dl.d Lifecycle lifecycle, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return g(lifecycle, Lifecycle.State.STARTED, pVar, cVar);
    }

    @kotlin.k(message = "whenStarted has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStarted for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object f(@dl.d y yVar, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return e(yVar.getLifecycle(), pVar, cVar);
    }

    @kotlin.k(message = "whenStateAtLeast has been deprecated because it runs the block on a pausing dispatcher that suspends, rather than cancels work when the lifecycle state goes below the given state. Use withStateAtLeast for non-suspending work that needs to run only once when the Lifecycle changes.")
    @dl.e
    public static final <T> Object g(@dl.d Lifecycle lifecycle, @dl.d Lifecycle.State state, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super T>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        return kotlinx.coroutines.i.h(e1.e().t0(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, pVar, null), cVar);
    }
}
