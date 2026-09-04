package retrofit2.adapter.rxjava2;

import javax.annotation.Nullable;
import retrofit2.s;

/* JADX INFO: compiled from: Result.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final s<T> f138926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private final Throwable f138927b;

    private d(@Nullable s<T> sVar, @Nullable Throwable th2) {
        this.f138926a = sVar;
        this.f138927b = th2;
    }

    public static <T> d<T> b(Throwable th2) {
        if (th2 != null) {
            return new d<>(null, th2);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> d<T> e(s<T> sVar) {
        if (sVar != null) {
            return new d<>(sVar, null);
        }
        throw new NullPointerException("response == null");
    }

    @Nullable
    public Throwable a() {
        return this.f138927b;
    }

    public boolean c() {
        return this.f138927b != null;
    }

    @Nullable
    public s<T> d() {
        return this.f138926a;
    }
}
