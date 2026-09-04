package androidx.lifecycle;

import kotlin.b2;

/* JADX INFO: compiled from: RepeatOnLifecycle.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RepeatOnLifecycleKt {
    @dl.e
    public static final Object a(@dl.d Lifecycle lifecycle, @dl.d Lifecycle.State state, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objG;
        if (state != Lifecycle.State.INITIALIZED) {
            return (lifecycle.b() != Lifecycle.State.DESTROYED && (objG = kotlinx.coroutines.r0.g(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, pVar, null), cVar)) == kotlin.coroutines.intrinsics.b.h()) ? objG : b2.f124493a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
    }

    @dl.e
    public static final Object b(@dl.d y yVar, @dl.d Lifecycle.State state, @dl.d yh.p<? super kotlinx.coroutines.q0, ? super kotlin.coroutines.c<? super b2>, ? extends Object> pVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = a(yVar.getLifecycle(), state, pVar, cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }
}
