package kotlinx.coroutines.android;

import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.u;
import kotlin.k;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.n2;
import kotlinx.coroutines.y0;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0001\b¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/android/d;", "Lkotlinx/coroutines/n2;", "Lkotlinx/coroutines/y0;", "t0", "()Lkotlinx/coroutines/android/d;", "immediate", "<init>", "()V", "Lkotlinx/coroutines/android/HandlerContext;", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
public abstract class d extends n2 implements y0 {
    private d() {
    }

    public /* synthetic */ d(u uVar) {
        this();
    }

    @Override // kotlinx.coroutines.y0
    @k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @dl.e
    public Object N(long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return y0.a.a(this, j10, cVar);
    }

    @dl.d
    public h1 r(long j10, @dl.d Runnable runnable, @dl.d CoroutineContext coroutineContext) {
        return y0.a.b(this, j10, runnable, coroutineContext);
    }

    @dl.d
    public abstract d t0();
}
