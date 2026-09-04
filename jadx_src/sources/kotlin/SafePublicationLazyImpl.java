package kotlin;

import com.umeng.analytics.pro.ak;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SafePublicationLazyImpl<T> implements z<T>, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    public static final a f124479e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f124480f = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, ak.aF);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private volatile yh.a<? extends T> f124481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private volatile Object f124482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final Object f124483d;

    /* JADX INFO: compiled from: LazyJVM.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    public SafePublicationLazyImpl(@dl.d yh.a<? extends T> initializer) {
        kotlin.jvm.internal.f0.p(initializer, "initializer");
        this.f124481b = initializer;
        v1 v1Var = v1.f128650a;
        this.f124482c = v1Var;
        this.f124483d = v1Var;
    }

    private final Object a() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // kotlin.z
    public T getValue() {
        T t10 = (T) this.f124482c;
        v1 v1Var = v1.f128650a;
        if (t10 != v1Var) {
            return t10;
        }
        yh.a<? extends T> aVar = this.f124481b;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.a.a(f124480f, this, v1Var, tInvoke)) {
                this.f124481b = null;
                return tInvoke;
            }
        }
        return (T) this.f124482c;
    }

    @Override // kotlin.z
    public boolean l() {
        return this.f124482c != v1.f128650a;
    }

    @dl.d
    public String toString() {
        return l() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
