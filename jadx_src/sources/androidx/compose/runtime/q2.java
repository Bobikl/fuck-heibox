package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0004\b\t\u0010\u0004J\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/q2;", androidx.exifinterface.media.a.f23244d5, "Ljava/lang/ThreadLocal;", "get", "()Ljava/lang/Object;", "value", "Lkotlin/b2;", "set", "(Ljava/lang/Object;)V", "initialValue", "remove", "Lkotlin/Function0;", "<init>", "(Lyh/a;)V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public class q2<T> extends ThreadLocal<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final yh.a<T> f13053a;

    /* JADX WARN: Multi-variable type inference failed */
    public q2(@dl.d yh.a<? extends T> initialValue) {
        kotlin.jvm.internal.f0.p(initialValue, "initialValue");
        this.f13053a = initialValue;
    }

    @Override // java.lang.ThreadLocal
    public T get() {
        return (T) super.get();
    }

    @Override // java.lang.ThreadLocal
    @dl.e
    protected T initialValue() {
        return this.f13053a.invoke();
    }

    @Override // java.lang.ThreadLocal
    public void remove() {
        super.remove();
    }

    @Override // java.lang.ThreadLocal
    public void set(T value) {
        super.set(value);
    }
}
