package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: compiled from: SingleThreadValue.java */
/* JADX INFO: loaded from: classes5.dex */
public class k<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f127956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread f127957b = Thread.currentThread();

    k(T t10) {
        this.f127956a = t10;
    }

    public T a() {
        if (b()) {
            return this.f127956a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean b() {
        return this.f127957b == Thread.currentThread();
    }
}
