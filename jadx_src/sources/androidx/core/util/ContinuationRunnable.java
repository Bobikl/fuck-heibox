package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.b2;

/* JADX INFO: compiled from: Runnable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class ContinuationRunnable extends AtomicBoolean implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.coroutines.c<b2> f21224b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationRunnable(@dl.d kotlin.coroutines.c<? super b2> continuation) {
        super(false);
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        this.f21224b = continuation;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<b2> cVar = this.f21224b;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(b2.f124493a));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @dl.d
    public String toString() {
        return "ContinuationRunnable(ran = " + get() + ')';
    }
}
