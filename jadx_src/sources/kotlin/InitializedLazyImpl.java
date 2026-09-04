package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class InitializedLazyImpl<T> implements z<T>, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f124473b;

    public InitializedLazyImpl(T t10) {
        this.f124473b = t10;
    }

    @Override // kotlin.z
    public T getValue() {
        return this.f124473b;
    }

    @Override // kotlin.z
    public boolean l() {
        return true;
    }

    @dl.d
    public String toString() {
        return String.valueOf(getValue());
    }
}
