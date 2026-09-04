package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class UnsafeLazyImpl<T> implements z<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private yh.a<? extends T> f124490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Object f124491c;

    public UnsafeLazyImpl(@dl.d yh.a<? extends T> initializer) {
        kotlin.jvm.internal.f0.p(initializer, "initializer");
        this.f124490b = initializer;
        this.f124491c = v1.f128650a;
    }

    private final Object a() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.z
    public T getValue() {
        if (this.f124491c == v1.f128650a) {
            yh.a<? extends T> aVar = this.f124490b;
            kotlin.jvm.internal.f0.m(aVar);
            this.f124491c = aVar.invoke();
            this.f124490b = null;
        }
        return (T) this.f124491c;
    }

    @Override // kotlin.z
    public boolean l() {
        return this.f124491c != v1.f128650a;
    }

    @dl.d
    public String toString() {
        return l() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
