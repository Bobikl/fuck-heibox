package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: compiled from: Unconfined.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/n3;", "Lkotlinx/coroutines/CoroutineDispatcher;", "", "parallelism", "c0", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", androidx.exifinterface.media.a.X4, "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/b2;", "O", "", "toString", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class n3 extends CoroutineDispatcher {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final n3 f130283d = new n3();

    private n3() {
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void O(@dl.d CoroutineContext coroutineContext, @dl.d Runnable runnable) {
        q3 q3Var = (q3) coroutineContext.f(q3.INSTANCE);
        if (q3Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        q3Var.dispatcherWasUnconfined = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean V(@dl.d CoroutineContext context) {
        return false;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    @t1
    public CoroutineDispatcher c0(int parallelism) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @dl.d
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
