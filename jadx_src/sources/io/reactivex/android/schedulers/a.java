package io.reactivex.android.schedulers;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import io.reactivex.h0;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: AndroidSchedulers.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f119519a = io.reactivex.android.plugins.a.f(new CallableC1092a());

    /* JADX INFO: renamed from: io.reactivex.android.schedulers.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static final class CallableC1092a implements Callable<h0> {
        CallableC1092a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 call() throws Exception {
            return b.f119520a;
        }
    }

    /* JADX INFO: compiled from: AndroidSchedulers.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h0 f119520a = new io.reactivex.android.schedulers.b(new Handler(Looper.getMainLooper()), false);

        private b() {
        }
    }

    private a() {
        throw new AssertionError("No instances.");
    }

    public static h0 a(Looper looper) {
        return b(looper, false);
    }

    @SuppressLint({"NewApi"})
    public static h0 b(Looper looper, boolean z10) {
        if (looper != null) {
            return new io.reactivex.android.schedulers.b(new Handler(looper), z10);
        }
        throw new NullPointerException("looper == null");
    }

    public static h0 c() {
        return io.reactivex.android.plugins.a.g(f119519a);
    }
}
