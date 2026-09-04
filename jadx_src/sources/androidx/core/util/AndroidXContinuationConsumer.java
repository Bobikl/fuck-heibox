package androidx.core.util;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;

/* JADX INFO: compiled from: AndroidXConsumer.kt */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidXContinuationConsumer<T> extends AtomicBoolean implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.coroutines.c<T> f21222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidXContinuationConsumer(@dl.d kotlin.coroutines.c<? super T> continuation) {
        super(false);
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        this.f21222b = continuation;
    }

    @Override // androidx.core.util.d
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<T> cVar = this.f21222b;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(t10));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @dl.d
    public String toString() {
        return "ContinuationConsumer(resultAccepted = " + get() + ')';
    }
}
