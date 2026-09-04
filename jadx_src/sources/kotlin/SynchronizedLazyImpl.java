package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SynchronizedLazyImpl<T> implements z<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private yh.a<? extends T> f124484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private volatile Object f124485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Object f124486d;

    public SynchronizedLazyImpl(@dl.d yh.a<? extends T> initializer, @dl.e Object obj) {
        kotlin.jvm.internal.f0.p(initializer, "initializer");
        this.f124484b = initializer;
        this.f124485c = v1.f128650a;
        this.f124486d = obj == null ? this : obj;
    }

    public /* synthetic */ SynchronizedLazyImpl(yh.a aVar, Object obj, int i10, kotlin.jvm.internal.u uVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }

    private final Object a() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.z
    public T getValue() {
        T tInvoke;
        T t10 = (T) this.f124485c;
        v1 v1Var = v1.f128650a;
        if (t10 != v1Var) {
            return t10;
        }
        synchronized (this.f124486d) {
            tInvoke = (T) this.f124485c;
            if (tInvoke == v1Var) {
                yh.a<? extends T> aVar = this.f124484b;
                kotlin.jvm.internal.f0.m(aVar);
                tInvoke = aVar.invoke();
                this.f124485c = tInvoke;
                this.f124484b = null;
            }
        }
        return tInvoke;
    }

    @Override // kotlin.z
    public boolean l() {
        return this.f124485c != v1.f128650a;
    }

    @dl.d
    public String toString() {
        return l() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
