package io.reactivex.internal.operators.flowable;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.internal.util.ExceptionHelper;

/* JADX INFO: compiled from: FlowableDoOnEach.java */
/* JADX INFO: loaded from: classes12.dex */
public final class w<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super T> f121347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final kh.g<? super Throwable> f121348e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final kh.a f121349f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final kh.a f121350g;

    /* JADX INFO: compiled from: FlowableDoOnEach.java */
    public static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.g<? super T> f121351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.g<? super Throwable> f121352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.a f121353i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final kh.a f121354j;

        a(lh.a<? super T> aVar, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar2, kh.a aVar3) {
            super(aVar);
            this.f121351g = gVar;
            this.f121352h = gVar2;
            this.f121353i = aVar2;
            this.f121354j = aVar3;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            if (this.f123795e) {
                return false;
            }
            try {
                this.f121351g.accept(t10);
                return this.f123792b.m((Object) t10);
            } catch (Throwable th2) {
                c(th2);
                return false;
            }
        }

        @Override // io.reactivex.internal.subscribers.a, org.reactivestreams.d
        public void onComplete() {
            if (this.f123795e) {
                return;
            }
            try {
                this.f121353i.run();
                this.f123795e = true;
                this.f123792b.onComplete();
                try {
                    this.f121354j.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                c(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.a, org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123795e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            boolean z10 = true;
            this.f123795e = true;
            try {
                this.f121352h.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123792b.onError(new CompositeException(th2, th3));
                z10 = false;
            }
            if (z10) {
                this.f123792b.onError(th2);
            }
            try {
                this.f121354j.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123795e) {
                return;
            }
            if (this.f123796f != 0) {
                this.f123792b.onNext(null);
                return;
            }
            try {
                this.f121351g.accept(t10);
                this.f123792b.onNext((Object) t10);
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            try {
                T tPoll = this.f123794d.poll();
                if (tPoll != null) {
                    try {
                        this.f121351g.accept(tPoll);
                        this.f121354j.run();
                    } catch (Throwable th2) {
                        try {
                            io.reactivex.exceptions.a.b(th2);
                            try {
                                this.f121352h.accept(th2);
                                throw ExceptionHelper.d(th2);
                            } catch (Throwable th3) {
                                throw new CompositeException(th2, th3);
                            }
                        } catch (Throwable th4) {
                            this.f121354j.run();
                            throw th4;
                        }
                    }
                } else if (this.f123796f == 1) {
                    this.f121353i.run();
                    this.f121354j.run();
                }
                return tPoll;
            } catch (Throwable th5) {
                io.reactivex.exceptions.a.b(th5);
                try {
                    this.f121352h.accept(th5);
                    throw ExceptionHelper.d(th5);
                } catch (Throwable th6) {
                    throw new CompositeException(th5, th6);
                }
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    /* JADX INFO: compiled from: FlowableDoOnEach.java */
    public static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.g<? super T> f121355g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final kh.g<? super Throwable> f121356h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final kh.a f121357i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final kh.a f121358j;

        b(org.reactivestreams.d<? super T> dVar, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2) {
            super(dVar);
            this.f121355g = gVar;
            this.f121356h = gVar2;
            this.f121357i = aVar;
            this.f121358j = aVar2;
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.d
        public void onComplete() {
            if (this.f123800e) {
                return;
            }
            try {
                this.f121357i.run();
                this.f123800e = true;
                this.f123797b.onComplete();
                try {
                    this.f121358j.run();
                } catch (Throwable th2) {
                    io.reactivex.exceptions.a.b(th2);
                    io.reactivex.plugins.a.Y(th2);
                }
            } catch (Throwable th3) {
                c(th3);
            }
        }

        @Override // io.reactivex.internal.subscribers.b, org.reactivestreams.d
        public void onError(Throwable th2) {
            if (this.f123800e) {
                io.reactivex.plugins.a.Y(th2);
                return;
            }
            boolean z10 = true;
            this.f123800e = true;
            try {
                this.f121356h.accept(th2);
            } catch (Throwable th3) {
                io.reactivex.exceptions.a.b(th3);
                this.f123797b.onError(new CompositeException(th2, th3));
                z10 = false;
            }
            if (z10) {
                this.f123797b.onError(th2);
            }
            try {
                this.f121358j.run();
            } catch (Throwable th4) {
                io.reactivex.exceptions.a.b(th4);
                io.reactivex.plugins.a.Y(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123800e) {
                return;
            }
            if (this.f123801f != 0) {
                this.f123797b.onNext(null);
                return;
            }
            try {
                this.f121355g.accept(t10);
                this.f123797b.onNext((Object) t10);
            } catch (Throwable th2) {
                c(th2);
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            try {
                T tPoll = this.f123799d.poll();
                if (tPoll != null) {
                    try {
                        this.f121355g.accept(tPoll);
                        this.f121358j.run();
                    } catch (Throwable th2) {
                        try {
                            io.reactivex.exceptions.a.b(th2);
                            try {
                                this.f121356h.accept(th2);
                                throw ExceptionHelper.d(th2);
                            } catch (Throwable th3) {
                                throw new CompositeException(th2, th3);
                            }
                        } catch (Throwable th4) {
                            this.f121358j.run();
                            throw th4;
                        }
                    }
                } else if (this.f123801f == 1) {
                    this.f121357i.run();
                    this.f121358j.run();
                }
                return tPoll;
            } catch (Throwable th5) {
                io.reactivex.exceptions.a.b(th5);
                try {
                    this.f121356h.accept(th5);
                    throw ExceptionHelper.d(th5);
                } catch (Throwable th6) {
                    throw new CompositeException(th5, th6);
                }
            }
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public w(io.reactivex.j<T> jVar, kh.g<? super T> gVar, kh.g<? super Throwable> gVar2, kh.a aVar, kh.a aVar2) {
        super(jVar);
        this.f121347d = gVar;
        this.f121348e = gVar2;
        this.f121349f = aVar;
        this.f121350g = aVar2;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new a((lh.a) dVar, this.f121347d, this.f121348e, this.f121349f, this.f121350g));
        } else {
            this.f121039c.j6(new b(dVar, this.f121347d, this.f121348e, this.f121349f, this.f121350g));
        }
    }
}
