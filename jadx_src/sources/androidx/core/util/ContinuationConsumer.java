package androidx.core.util;

import androidx.annotation.w0;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import kotlin.Result;

/* JADX INFO: compiled from: Consumer.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(24)
public final class ContinuationConsumer<T> extends AtomicBoolean implements Consumer<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.coroutines.c<T> f21223b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationConsumer(@dl.d kotlin.coroutines.c<? super T> continuation) {
        super(false);
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        this.f21223b = continuation;
    }

    @Override // java.util.function.Consumer
    public void accept(T t10) {
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<T> cVar = this.f21223b;
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
