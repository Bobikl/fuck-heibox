package io.reactivex.plugins;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import io.reactivex.g0;
import io.reactivex.h0;
import io.reactivex.i0;
import io.reactivex.internal.schedulers.k;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.j;
import io.reactivex.l0;
import io.reactivex.q;
import io.reactivex.t;
import io.reactivex.z;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadFactory;
import jh.f;
import kh.c;
import kh.e;
import kh.g;
import kh.o;
import org.reactivestreams.d;

/* JADX INFO: compiled from: RxJavaPlugins.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @f
    static volatile g<? super Throwable> f123923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @f
    static volatile o<? super Runnable, ? extends Runnable> f123924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @f
    static volatile o<? super Callable<h0>, ? extends h0> f123925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @f
    static volatile o<? super Callable<h0>, ? extends h0> f123926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @f
    static volatile o<? super Callable<h0>, ? extends h0> f123927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @f
    static volatile o<? super Callable<h0>, ? extends h0> f123928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @f
    static volatile o<? super h0, ? extends h0> f123929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @f
    static volatile o<? super h0, ? extends h0> f123930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f
    static volatile o<? super h0, ? extends h0> f123931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @f
    static volatile o<? super h0, ? extends h0> f123932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @f
    static volatile o<? super j, ? extends j> f123933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @f
    static volatile o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> f123934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @f
    static volatile o<? super z, ? extends z> f123935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @f
    static volatile o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> f123936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @f
    static volatile o<? super q, ? extends q> f123937o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @f
    static volatile o<? super i0, ? extends i0> f123938p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @f
    static volatile o<? super io.reactivex.a, ? extends io.reactivex.a> f123939q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @f
    static volatile o<? super io.reactivex.parallel.a, ? extends io.reactivex.parallel.a> f123940r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @f
    static volatile c<? super j, ? super d, ? extends d> f123941s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @f
    static volatile c<? super q, ? super t, ? extends t> f123942t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @f
    static volatile c<? super z, ? super g0, ? extends g0> f123943u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @f
    static volatile c<? super i0, ? super l0, ? extends l0> f123944v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @f
    static volatile c<? super io.reactivex.a, ? super io.reactivex.d, ? extends io.reactivex.d> f123945w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @f
    static volatile e f123946x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static volatile boolean f123947y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static volatile boolean f123948z;

    private a() {
        throw new IllegalStateException("No instances!");
    }

    @f
    public static c<? super z, ? super g0, ? extends g0> A() {
        return f123943u;
    }

    public static void A0(@f c<? super q, t, ? extends t> cVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123942t = cVar;
    }

    @f
    public static o<? super io.reactivex.parallel.a, ? extends io.reactivex.parallel.a> B() {
        return f123940r;
    }

    public static void B0(@f o<? super z, ? extends z> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123935m = oVar;
    }

    @f
    public static o<? super i0, ? extends i0> C() {
        return f123938p;
    }

    public static void C0(@f c<? super z, ? super g0, ? extends g0> cVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123943u = cVar;
    }

    @f
    public static c<? super i0, ? super l0, ? extends l0> D() {
        return f123944v;
    }

    public static void D0(@f o<? super io.reactivex.parallel.a, ? extends io.reactivex.parallel.a> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123940r = oVar;
    }

    @f
    public static o<? super Runnable, ? extends Runnable> E() {
        return f123924b;
    }

    public static void E0(@f o<? super i0, ? extends i0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123938p = oVar;
    }

    @f
    public static o<? super h0, ? extends h0> F() {
        return f123930h;
    }

    public static void F0(@f c<? super i0, ? super l0, ? extends l0> cVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123944v = cVar;
    }

    @jh.e
    public static h0 G(@jh.e Callable<h0> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<h0>, ? extends h0> oVar = f123925c;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void G0(@f o<? super Runnable, ? extends Runnable> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123924b = oVar;
    }

    @jh.e
    public static h0 H(@jh.e Callable<h0> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<h0>, ? extends h0> oVar = f123927e;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    public static void H0(@f o<? super h0, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123930h = oVar;
    }

    @jh.e
    public static h0 I(@jh.e Callable<h0> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<h0>, ? extends h0> oVar = f123928f;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    static void I0(@jh.e Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    @jh.e
    public static h0 J(@jh.e Callable<h0> callable) {
        io.reactivex.internal.functions.a.g(callable, "Scheduler Callable can't be null");
        o<? super Callable<h0>, ? extends h0> oVar = f123926d;
        return oVar == null ? d(callable) : c(oVar, callable);
    }

    static void J0() {
        f123947y = false;
    }

    static boolean K(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static boolean L() {
        return f123948z;
    }

    public static boolean M() {
        return f123947y;
    }

    public static void N() {
        f123947y = true;
    }

    @jh.e
    public static io.reactivex.a O(@jh.e io.reactivex.a aVar) {
        o<? super io.reactivex.a, ? extends io.reactivex.a> oVar = f123939q;
        return oVar != null ? (io.reactivex.a) b(oVar, aVar) : aVar;
    }

    @jh.e
    public static <T> j<T> P(@jh.e j<T> jVar) {
        o<? super j, ? extends j> oVar = f123933k;
        return oVar != null ? (j) b(oVar, jVar) : jVar;
    }

    @jh.e
    public static <T> q<T> Q(@jh.e q<T> qVar) {
        o<? super q, ? extends q> oVar = f123937o;
        return oVar != null ? (q) b(oVar, qVar) : qVar;
    }

    @jh.e
    public static <T> z<T> R(@jh.e z<T> zVar) {
        o<? super z, ? extends z> oVar = f123935m;
        return oVar != null ? (z) b(oVar, zVar) : zVar;
    }

    @jh.e
    public static <T> i0<T> S(@jh.e i0<T> i0Var) {
        o<? super i0, ? extends i0> oVar = f123938p;
        return oVar != null ? (i0) b(oVar, i0Var) : i0Var;
    }

    @jh.e
    public static <T> io.reactivex.flowables.a<T> T(@jh.e io.reactivex.flowables.a<T> aVar) {
        o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> oVar = f123934l;
        return oVar != null ? (io.reactivex.flowables.a) b(oVar, aVar) : aVar;
    }

    @jh.e
    public static <T> io.reactivex.observables.a<T> U(@jh.e io.reactivex.observables.a<T> aVar) {
        o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> oVar = f123936n;
        return oVar != null ? (io.reactivex.observables.a) b(oVar, aVar) : aVar;
    }

    @jh.e
    public static <T> io.reactivex.parallel.a<T> V(@jh.e io.reactivex.parallel.a<T> aVar) {
        o<? super io.reactivex.parallel.a, ? extends io.reactivex.parallel.a> oVar = f123940r;
        return oVar != null ? (io.reactivex.parallel.a) b(oVar, aVar) : aVar;
    }

    public static boolean W() {
        e eVar = f123946x;
        if (eVar == null) {
            return false;
        }
        try {
            return eVar.a();
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.e
    public static h0 X(@jh.e h0 h0Var) {
        o<? super h0, ? extends h0> oVar = f123929g;
        return oVar == null ? h0Var : (h0) b(oVar, h0Var);
    }

    public static void Y(@jh.e Throwable th2) {
        g<? super Throwable> gVar = f123923a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!K(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (gVar != null) {
            try {
                gVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                I0(th3);
            }
        }
        th2.printStackTrace();
        I0(th2);
    }

    @jh.e
    public static h0 Z(@jh.e h0 h0Var) {
        o<? super h0, ? extends h0> oVar = f123931i;
        return oVar == null ? h0Var : (h0) b(oVar, h0Var);
    }

    @jh.e
    static <T, U, R> R a(@jh.e c<T, U, R> cVar, @jh.e T t10, @jh.e U u10) {
        try {
            return cVar.apply(t10, u10);
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.e
    public static h0 a0(@jh.e h0 h0Var) {
        o<? super h0, ? extends h0> oVar = f123932j;
        return oVar == null ? h0Var : (h0) b(oVar, h0Var);
    }

    @jh.e
    static <T, R> R b(@jh.e o<T, R> oVar, @jh.e T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.e
    public static Runnable b0(@jh.e Runnable runnable) {
        io.reactivex.internal.functions.a.g(runnable, "run is null");
        o<? super Runnable, ? extends Runnable> oVar = f123924b;
        return oVar == null ? runnable : (Runnable) b(oVar, runnable);
    }

    @jh.e
    static h0 c(@jh.e o<? super Callable<h0>, ? extends h0> oVar, Callable<h0> callable) {
        return (h0) io.reactivex.internal.functions.a.g(b(oVar, callable), "Scheduler Callable result can't be null");
    }

    @jh.e
    public static h0 c0(@jh.e h0 h0Var) {
        o<? super h0, ? extends h0> oVar = f123930h;
        return oVar == null ? h0Var : (h0) b(oVar, h0Var);
    }

    @jh.e
    static h0 d(@jh.e Callable<h0> callable) {
        try {
            return (h0) io.reactivex.internal.functions.a.g(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw ExceptionHelper.f(th2);
        }
    }

    @jh.e
    public static io.reactivex.d d0(@jh.e io.reactivex.a aVar, @jh.e io.reactivex.d dVar) {
        c<? super io.reactivex.a, ? super io.reactivex.d, ? extends io.reactivex.d> cVar = f123945w;
        return cVar != null ? (io.reactivex.d) a(cVar, aVar, dVar) : dVar;
    }

    @jh.e
    public static h0 e(@jh.e ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.a((ThreadFactory) io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null"));
    }

    @jh.e
    public static <T> t<? super T> e0(@jh.e q<T> qVar, @jh.e t<? super T> tVar) {
        c<? super q, ? super t, ? extends t> cVar = f123942t;
        return cVar != null ? (t) a(cVar, qVar, tVar) : tVar;
    }

    @jh.e
    public static h0 f(@jh.e ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.e((ThreadFactory) io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null"));
    }

    @jh.e
    public static <T> g0<? super T> f0(@jh.e z<T> zVar, @jh.e g0<? super T> g0Var) {
        c<? super z, ? super g0, ? extends g0> cVar = f123943u;
        return cVar != null ? (g0) a(cVar, zVar, g0Var) : g0Var;
    }

    @jh.e
    public static h0 g(@jh.e ThreadFactory threadFactory) {
        return new io.reactivex.internal.schedulers.f((ThreadFactory) io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null"));
    }

    @jh.e
    public static <T> l0<? super T> g0(@jh.e i0<T> i0Var, @jh.e l0<? super T> l0Var) {
        c<? super i0, ? super l0, ? extends l0> cVar = f123944v;
        return cVar != null ? (l0) a(cVar, i0Var, l0Var) : l0Var;
    }

    @jh.e
    public static h0 h(@jh.e ThreadFactory threadFactory) {
        return new k((ThreadFactory) io.reactivex.internal.functions.a.g(threadFactory, "threadFactory is null"));
    }

    @jh.e
    public static <T> d<? super T> h0(@jh.e j<T> jVar, @jh.e d<? super T> dVar) {
        c<? super j, ? super d, ? extends d> cVar = f123941s;
        return cVar != null ? (d) a(cVar, jVar, dVar) : dVar;
    }

    @f
    public static o<? super h0, ? extends h0> i() {
        return f123929g;
    }

    public static void i0() {
        k0(null);
        G0(null);
        j0(null);
        m0(null);
        q0(null);
        n0(null);
        H0(null);
        p0(null);
        r0(null);
        o0(null);
        x0(null);
        y0(null);
        B0(null);
        C0(null);
        E0(null);
        F0(null);
        t0(null);
        u0(null);
        v0(null);
        w0(null);
        z0(null);
        A0(null);
        D0(null);
        l0(false);
        s0(null);
    }

    @f
    public static g<? super Throwable> j() {
        return f123923a;
    }

    public static void j0(@f o<? super h0, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123929g = oVar;
    }

    @f
    public static o<? super Callable<h0>, ? extends h0> k() {
        return f123925c;
    }

    public static void k0(@f g<? super Throwable> gVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123923a = gVar;
    }

    @f
    public static o<? super Callable<h0>, ? extends h0> l() {
        return f123927e;
    }

    public static void l0(boolean z10) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123948z = z10;
    }

    @f
    public static o<? super Callable<h0>, ? extends h0> m() {
        return f123928f;
    }

    public static void m0(@f o<? super Callable<h0>, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123925c = oVar;
    }

    @f
    public static o<? super Callable<h0>, ? extends h0> n() {
        return f123926d;
    }

    public static void n0(@f o<? super Callable<h0>, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123927e = oVar;
    }

    @f
    public static o<? super h0, ? extends h0> o() {
        return f123931i;
    }

    public static void o0(@f o<? super Callable<h0>, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123928f = oVar;
    }

    @f
    public static o<? super h0, ? extends h0> p() {
        return f123932j;
    }

    public static void p0(@f o<? super Callable<h0>, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123926d = oVar;
    }

    @f
    public static e q() {
        return f123946x;
    }

    public static void q0(@f o<? super h0, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123931i = oVar;
    }

    @f
    public static o<? super io.reactivex.a, ? extends io.reactivex.a> r() {
        return f123939q;
    }

    public static void r0(@f o<? super h0, ? extends h0> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123932j = oVar;
    }

    @f
    public static c<? super io.reactivex.a, ? super io.reactivex.d, ? extends io.reactivex.d> s() {
        return f123945w;
    }

    public static void s0(@f e eVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123946x = eVar;
    }

    @f
    public static o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> t() {
        return f123934l;
    }

    public static void t0(@f o<? super io.reactivex.a, ? extends io.reactivex.a> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123939q = oVar;
    }

    @f
    public static o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> u() {
        return f123936n;
    }

    public static void u0(@f c<? super io.reactivex.a, ? super io.reactivex.d, ? extends io.reactivex.d> cVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123945w = cVar;
    }

    @f
    public static o<? super j, ? extends j> v() {
        return f123933k;
    }

    public static void v0(@f o<? super io.reactivex.flowables.a, ? extends io.reactivex.flowables.a> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123934l = oVar;
    }

    @f
    public static c<? super j, ? super d, ? extends d> w() {
        return f123941s;
    }

    public static void w0(@f o<? super io.reactivex.observables.a, ? extends io.reactivex.observables.a> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123936n = oVar;
    }

    @f
    public static o<? super q, ? extends q> x() {
        return f123937o;
    }

    public static void x0(@f o<? super j, ? extends j> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123933k = oVar;
    }

    @f
    public static c<? super q, ? super t, ? extends t> y() {
        return f123942t;
    }

    public static void y0(@f c<? super j, ? super d, ? extends d> cVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123941s = cVar;
    }

    @f
    public static o<? super z, ? extends z> z() {
        return f123935m;
    }

    public static void z0(@f o<? super q, ? extends q> oVar) {
        if (f123947y) {
            throw new IllegalStateException("Plugins can't be changed anymore");
        }
        f123937o = oVar;
    }
}
