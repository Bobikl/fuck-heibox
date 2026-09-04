package kotlin.reflect.jvm.internal.impl.storage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Runnable f127950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final yh.l<InterruptedException, b2> f127951d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@dl.d Runnable checkCancelled, @dl.d yh.l<? super InterruptedException, b2> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        f0.p(checkCancelled, "checkCancelled");
        f0.p(interruptedExceptionHandler, "interruptedExceptionHandler");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@dl.d Lock lock, @dl.d Runnable checkCancelled, @dl.d yh.l<? super InterruptedException, b2> interruptedExceptionHandler) {
        super(lock);
        f0.p(lock, "lock");
        f0.p(checkCancelled, "checkCancelled");
        f0.p(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f127950c = checkCancelled;
        this.f127951d = interruptedExceptionHandler;
    }

    @Override // kotlin.reflect.jvm.internal.impl.storage.d, kotlin.reflect.jvm.internal.impl.storage.j
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f127950c.run();
            } catch (InterruptedException e10) {
                this.f127951d.invoke(e10);
                return;
            }
        }
    }
}
