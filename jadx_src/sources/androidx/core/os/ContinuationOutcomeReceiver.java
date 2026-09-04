package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.w0;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.t0;

/* JADX INFO: compiled from: OutcomeReceiver.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(31)
public final class ContinuationOutcomeReceiver<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.coroutines.c<R> f20946b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ContinuationOutcomeReceiver(@dl.d kotlin.coroutines.c<? super R> continuation) {
        super(false);
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        this.f20946b = continuation;
    }

    public void onError(@dl.d E error) {
        kotlin.jvm.internal.f0.p(error, "error");
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<R> cVar = this.f20946b;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(t0.a(error)));
        }
    }

    public void onResult(@dl.d R result) {
        kotlin.jvm.internal.f0.p(result, "result");
        if (compareAndSet(false, true)) {
            kotlin.coroutines.c<R> cVar = this.f20946b;
            Result.a aVar = Result.f124476c;
            cVar.resumeWith(Result.b(result));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @dl.d
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
