package io.reactivex.schedulers;

import io.reactivex.h0;
import io.reactivex.internal.schedulers.ExecutorScheduler;
import io.reactivex.internal.schedulers.j;
import io.reactivex.internal.schedulers.k;
import io.reactivex.internal.schedulers.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: Schedulers.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @jh.e
    static final h0 f124046a = io.reactivex.plugins.a.J(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @jh.e
    static final h0 f124047b = io.reactivex.plugins.a.G(new CallableC1113b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @jh.e
    static final h0 f124048c = io.reactivex.plugins.a.H(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @jh.e
    static final h0 f124049d = l.m();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @jh.e
    static final h0 f124050e = io.reactivex.plugins.a.I(new f());

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h0 f124051a = new io.reactivex.internal.schedulers.a();

        a() {
        }
    }

    /* JADX INFO: renamed from: io.reactivex.schedulers.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Schedulers.java */
    public static final class CallableC1113b implements Callable<h0> {
        CallableC1113b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 call() throws Exception {
            return a.f124051a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class c implements Callable<h0> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 call() throws Exception {
            return d.f124052a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h0 f124052a = new io.reactivex.internal.schedulers.e();

        d() {
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h0 f124053a = new io.reactivex.internal.schedulers.f();

        e() {
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class f implements Callable<h0> {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 call() throws Exception {
            return e.f124053a;
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h0 f124054a = new k();

        g() {
        }
    }

    /* JADX INFO: compiled from: Schedulers.java */
    public static final class h implements Callable<h0> {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h0 call() throws Exception {
            return g.f124054a;
        }
    }

    private b() {
        throw new IllegalStateException("No instances!");
    }

    @jh.e
    public static h0 a() {
        return io.reactivex.plugins.a.X(f124047b);
    }

    @jh.e
    public static h0 b(@jh.e Executor executor) {
        return new ExecutorScheduler(executor, false);
    }

    @jh.e
    @jh.d
    public static h0 c(@jh.e Executor executor, boolean z10) {
        return new ExecutorScheduler(executor, z10);
    }

    @jh.e
    public static h0 d() {
        return io.reactivex.plugins.a.Z(f124048c);
    }

    @jh.e
    public static h0 e() {
        return io.reactivex.plugins.a.a0(f124050e);
    }

    public static void f() {
        a().j();
        d().j();
        e().j();
        g().j();
        i().j();
        j.b();
    }

    @jh.e
    public static h0 g() {
        return io.reactivex.plugins.a.c0(f124046a);
    }

    public static void h() {
        a().k();
        d().k();
        e().k();
        g().k();
        i().k();
        j.c();
    }

    @jh.e
    public static h0 i() {
        return f124049d;
    }
}
