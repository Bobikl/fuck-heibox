package io.reactivex.android.plugins;

import io.reactivex.h0;
import java.util.concurrent.Callable;
import kh.o;

/* JADX INFO: compiled from: RxAndroidPlugins.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile o<Callable<h0>, h0> f119517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile o<h0, h0> f119518b;

    private a() {
        throw new AssertionError("No instances.");
    }

    static <T, R> R a(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw io.reactivex.exceptions.a.a(th2);
        }
    }

    static h0 b(o<Callable<h0>, h0> oVar, Callable<h0> callable) {
        h0 h0Var = (h0) a(oVar, callable);
        if (h0Var != null) {
            return h0Var;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static h0 c(Callable<h0> callable) {
        try {
            h0 h0VarCall = callable.call();
            if (h0VarCall != null) {
                return h0VarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw io.reactivex.exceptions.a.a(th2);
        }
    }

    public static o<Callable<h0>, h0> d() {
        return f119517a;
    }

    public static o<h0, h0> e() {
        return f119518b;
    }

    public static h0 f(Callable<h0> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<Callable<h0>, h0> oVar = f119517a;
        return oVar == null ? c(callable) : b(oVar, callable);
    }

    public static h0 g(h0 h0Var) {
        if (h0Var == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<h0, h0> oVar = f119518b;
        return oVar == null ? h0Var : (h0) a(oVar, h0Var);
    }

    public static void h() {
        i(null);
        j(null);
    }

    public static void i(o<Callable<h0>, h0> oVar) {
        f119517a = oVar;
    }

    public static void j(o<h0, h0> oVar) {
        f119518b = oVar;
    }
}
