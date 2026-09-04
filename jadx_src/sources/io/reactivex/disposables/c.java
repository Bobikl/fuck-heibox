package io.reactivex.disposables;

import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Future;
import jh.e;

/* JADX INFO: compiled from: Disposables.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {
    private c() {
        throw new IllegalStateException("No instances!");
    }

    @e
    public static b a() {
        return EmptyDisposable.INSTANCE;
    }

    @e
    public static b b() {
        return f(Functions.f119557b);
    }

    @e
    public static b c(@e kh.a aVar) {
        io.reactivex.internal.functions.a.g(aVar, "run is null");
        return new ActionDisposable(aVar);
    }

    @e
    public static b d(@e Future<?> future) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return e(future, true);
    }

    @e
    public static b e(@e Future<?> future, boolean z10) {
        io.reactivex.internal.functions.a.g(future, "future is null");
        return new FutureDisposable(future, z10);
    }

    @e
    public static b f(@e Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    @e
    public static b g(@e org.reactivestreams.e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "subscription is null");
        return new SubscriptionDisposable(eVar);
    }
}
