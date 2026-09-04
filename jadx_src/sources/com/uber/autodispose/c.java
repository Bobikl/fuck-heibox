package com.uber.autodispose;

import io.reactivex.g0;
import io.reactivex.i0;
import io.reactivex.l0;
import io.reactivex.observers.TestObserver;
import io.reactivex.subscribers.TestSubscriber;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: AutoDispose.java */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: AutoDispose.java */
    public class a<T> implements f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ io.reactivex.g f104082a;

        /* JADX INFO: renamed from: com.uber.autodispose.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AutoDispose.java */
        public class C1032a implements r {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.a f104083a;

            C1032a(io.reactivex.a aVar) {
                this.f104083a = aVar;
            }

            @Override // com.uber.autodispose.r
            public io.reactivex.disposables.b a() {
                return new com.uber.autodispose.e(this.f104083a, a.this.f104082a).G0();
            }

            @Override // com.uber.autodispose.r
            public TestObserver<Void> c(boolean z10) {
                TestObserver<Void> testObserver = new TestObserver<>();
                if (z10) {
                    testObserver.cancel();
                }
                d(testObserver);
                return testObserver;
            }

            @Override // com.uber.autodispose.r
            public void d(io.reactivex.d dVar) {
                new com.uber.autodispose.e(this.f104083a, a.this.f104082a).d(dVar);
            }

            @Override // com.uber.autodispose.r
            public <E extends io.reactivex.d> E e(E e10) {
                return (E) new com.uber.autodispose.e(this.f104083a, a.this.f104082a).L0(e10);
            }

            @Override // com.uber.autodispose.r
            public io.reactivex.disposables.b f(kh.a aVar, kh.g<? super Throwable> gVar) {
                return new com.uber.autodispose.e(this.f104083a, a.this.f104082a).I0(aVar, gVar);
            }

            @Override // com.uber.autodispose.r
            public io.reactivex.disposables.b g(kh.a aVar) {
                return new com.uber.autodispose.e(this.f104083a, a.this.f104082a).H0(aVar);
            }

            @Override // com.uber.autodispose.r
            public TestObserver<Void> test() {
                TestObserver<Void> testObserver = new TestObserver<>();
                d(testObserver);
                return testObserver;
            }
        }

        /* JADX INFO: compiled from: AutoDispose.java */
        public class b implements s<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.j f104085a;

            b(io.reactivex.j jVar) {
                this.f104085a = jVar;
            }

            @Override // com.uber.autodispose.s
            public io.reactivex.disposables.b a() {
                return new h(this.f104085a, a.this.f104082a).e6();
            }

            @Override // com.uber.autodispose.s
            public io.reactivex.disposables.b b(kh.g<? super T> gVar) {
                return new h(this.f104085a, a.this.f104082a).f6(gVar);
            }

            @Override // com.uber.autodispose.s
            public io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
                return new h(this.f104085a, a.this.f104082a).g6(gVar, gVar2);
            }

            @Override // com.uber.autodispose.s
            public io.reactivex.disposables.b e(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
                return new h(this.f104085a, a.this.f104082a).h6(gVar, gVar2, aVar);
            }

            @Override // com.uber.autodispose.s
            public io.reactivex.disposables.b f(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super org.reactivestreams.e> gVar3) {
                return new h(this.f104085a, a.this.f104082a).i6(gVar, gVar2, aVar, gVar3);
            }

            @Override // com.uber.autodispose.s
            public void g(org.reactivestreams.d<? super T> dVar) {
                new h(this.f104085a, a.this.f104082a).g(dVar);
            }

            @Override // com.uber.autodispose.s
            public <E extends org.reactivestreams.d<? super T>> E h(E e10) {
                return (E) new h(this.f104085a, a.this.f104082a).n6(e10);
            }

            @Override // com.uber.autodispose.s
            public TestSubscriber<T> i(long j10, boolean z10) {
                TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
                if (z10) {
                    testSubscriber.cancel();
                }
                g(testSubscriber);
                return testSubscriber;
            }

            @Override // com.uber.autodispose.s
            public TestSubscriber<T> test() {
                TestSubscriber<T> testSubscriber = new TestSubscriber<>();
                g(testSubscriber);
                return testSubscriber;
            }

            @Override // com.uber.autodispose.s
            public TestSubscriber<T> test(long j10) {
                TestSubscriber<T> testSubscriber = new TestSubscriber<>(j10);
                g(testSubscriber);
                return testSubscriber;
            }
        }

        /* JADX INFO: renamed from: com.uber.autodispose.c$a$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AutoDispose.java */
        public class C1033c implements u<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.q f104087a;

            C1033c(io.reactivex.q qVar) {
                this.f104087a = qVar;
            }

            @Override // com.uber.autodispose.u
            public io.reactivex.disposables.b a() {
                return new i(this.f104087a, a.this.f104082a).n1();
            }

            @Override // com.uber.autodispose.u
            public io.reactivex.disposables.b b(kh.g<? super T> gVar) {
                return new i(this.f104087a, a.this.f104082a).o1(gVar);
            }

            @Override // com.uber.autodispose.u
            public TestObserver<T> c(boolean z10) {
                TestObserver<T> testObserver = new TestObserver<>();
                if (z10) {
                    testObserver.cancel();
                }
                f(testObserver);
                return testObserver;
            }

            @Override // com.uber.autodispose.u
            public io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
                return new i(this.f104087a, a.this.f104082a).p1(gVar, gVar2);
            }

            @Override // com.uber.autodispose.u
            public io.reactivex.disposables.b e(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
                return new i(this.f104087a, a.this.f104082a).q1(gVar, gVar2, aVar);
            }

            @Override // com.uber.autodispose.u
            public void f(io.reactivex.t<? super T> tVar) {
                new i(this.f104087a, a.this.f104082a).f(tVar);
            }

            @Override // com.uber.autodispose.u
            public <E extends io.reactivex.t<? super T>> E g(E e10) {
                return (E) new i(this.f104087a, a.this.f104082a).t1(e10);
            }

            @Override // com.uber.autodispose.u
            public TestObserver<T> test() {
                TestObserver<T> testObserver = new TestObserver<>();
                f(testObserver);
                return testObserver;
            }
        }

        /* JADX INFO: compiled from: AutoDispose.java */
        public class d implements v<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ io.reactivex.z f104089a;

            d(io.reactivex.z zVar) {
                this.f104089a = zVar;
            }

            @Override // com.uber.autodispose.v
            public io.reactivex.disposables.b a() {
                return new j(this.f104089a, a.this.f104082a).C5();
            }

            @Override // com.uber.autodispose.v
            public io.reactivex.disposables.b b(kh.g<? super T> gVar) {
                return new j(this.f104089a, a.this.f104082a).D5(gVar);
            }

            @Override // com.uber.autodispose.v
            public TestObserver<T> c(boolean z10) {
                TestObserver<T> testObserver = new TestObserver<>();
                if (z10) {
                    testObserver.dispose();
                }
                g(testObserver);
                return testObserver;
            }

            @Override // com.uber.autodispose.v
            public io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
                return new j(this.f104089a, a.this.f104082a).E5(gVar, gVar2);
            }

            @Override // com.uber.autodispose.v
            public io.reactivex.disposables.b e(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar) {
                return new j(this.f104089a, a.this.f104082a).F5(gVar, gVar2, aVar);
            }

            @Override // com.uber.autodispose.v
            public io.reactivex.disposables.b f(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.g<? super io.reactivex.disposables.b> gVar3) {
                return new j(this.f104089a, a.this.f104082a).G5(gVar, gVar2, aVar, gVar3);
            }

            @Override // com.uber.autodispose.v
            public void g(g0<? super T> g0Var) {
                new j(this.f104089a, a.this.f104082a).g(g0Var);
            }

            @Override // com.uber.autodispose.v
            public <E extends g0<? super T>> E h(E e10) {
                return (E) new j(this.f104089a, a.this.f104082a).J5(e10);
            }

            @Override // com.uber.autodispose.v
            public TestObserver<T> test() {
                TestObserver<T> testObserver = new TestObserver<>();
                g(testObserver);
                return testObserver;
            }
        }

        /* JADX INFO: compiled from: AutoDispose.java */
        public class e implements z<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i0 f104091a;

            e(i0 i0Var) {
                this.f104091a = i0Var;
            }

            @Override // com.uber.autodispose.z
            public io.reactivex.disposables.b a() {
                return new m(this.f104091a, a.this.f104082a).Y0();
            }

            @Override // com.uber.autodispose.z
            public io.reactivex.disposables.b b(kh.g<? super T> gVar) {
                return new m(this.f104091a, a.this.f104082a).a1(gVar);
            }

            @Override // com.uber.autodispose.z
            public TestObserver<T> c(boolean z10) {
                TestObserver<T> testObserver = new TestObserver<>();
                if (z10) {
                    testObserver.dispose();
                }
                f(testObserver);
                return testObserver;
            }

            @Override // com.uber.autodispose.z
            public io.reactivex.disposables.b d(kh.g<? super T> gVar, kh.g<? super Throwable> gVar2) {
                return new m(this.f104091a, a.this.f104082a).b1(gVar, gVar2);
            }

            @Override // com.uber.autodispose.z
            public void f(l0<? super T> l0Var) {
                new m(this.f104091a, a.this.f104082a).f(l0Var);
            }

            @Override // com.uber.autodispose.z
            public <E extends l0<? super T>> E g(E e10) {
                return (E) new m(this.f104091a, a.this.f104082a).e1(e10);
            }

            @Override // com.uber.autodispose.z
            public io.reactivex.disposables.b h(kh.b<? super T, ? super Throwable> bVar) {
                return new m(this.f104091a, a.this.f104082a).Z0(bVar);
            }

            @Override // com.uber.autodispose.z
            public TestObserver<T> test() {
                TestObserver<T> testObserver = new TestObserver<>();
                f(testObserver);
                return testObserver;
            }
        }

        a(io.reactivex.g gVar) {
            this.f104082a = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n(io.reactivex.parallel.a aVar, io.reactivex.g gVar, org.reactivestreams.d[] dVarArr) {
            new k(aVar, gVar).Q(dVarArr);
        }

        @Override // io.reactivex.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public r b(io.reactivex.a aVar) {
            return new C1032a(aVar);
        }

        @Override // io.reactivex.k
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public s<T> d(io.reactivex.j<T> jVar) {
            return new b(jVar);
        }

        @Override // io.reactivex.r
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public u<T> c(io.reactivex.q<T> qVar) {
            return new C1033c(qVar);
        }

        @Override // io.reactivex.a0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public v<T> a(io.reactivex.z<T> zVar) {
            return new d(zVar);
        }

        @Override // io.reactivex.parallel.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public w<T> e(final io.reactivex.parallel.a<T> aVar) {
            final io.reactivex.g gVar = this.f104082a;
            return new w() { // from class: com.uber.autodispose.b
                @Override // com.uber.autodispose.w
                public final void a(org.reactivestreams.d[] dVarArr) {
                    c.a.n(aVar, gVar, dVarArr);
                }
            };
        }

        @Override // io.reactivex.j0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public z<T> f(i0<T> i0Var) {
            return new e(i0Var);
        }
    }

    private c() {
        throw new AssertionError("No instances");
    }

    public static <T> f<T> b(final y yVar) {
        n.a(yVar, "provider == null");
        return c(io.reactivex.a.B(new Callable() { // from class: com.uber.autodispose.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return c.d(yVar);
            }
        }));
    }

    public static <T> f<T> c(io.reactivex.g gVar) {
        n.a(gVar, "scope == null");
        return new a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ io.reactivex.g d(y yVar) throws Exception {
        try {
            return yVar.a();
        } catch (OutsideScopeException e10) {
            kh.g<? super OutsideScopeException> gVarB = l.b();
            if (gVarB == null) {
                return io.reactivex.a.Q(e10);
            }
            gVarB.accept(e10);
            return io.reactivex.a.t();
        }
    }
}
