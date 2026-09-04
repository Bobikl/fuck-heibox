package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.u0;
import yh.p;

/* JADX INFO: compiled from: CoroutineContextImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
public final class EmptyCoroutineContext implements CoroutineContext, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final EmptyCoroutineContext f124694b = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object c() {
        return f124694b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext I(@dl.d CoroutineContext context) {
        f0.p(context, "context");
        return context;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.d
    public CoroutineContext d(@dl.d CoroutineContext.b<?> key) {
        f0.p(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.CoroutineContext
    @dl.e
    public <E extends CoroutineContext.a> E f(@dl.d CoroutineContext.b<E> key) {
        f0.p(key, "key");
        return null;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R g(R r10, @dl.d p<? super R, ? super CoroutineContext.a, ? extends R> operation) {
        f0.p(operation, "operation");
        return r10;
    }

    public int hashCode() {
        return 0;
    }

    @dl.d
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
