package io.reactivex.internal.operators.flowable;

/* JADX INFO: compiled from: FlowableDoAfterNext.java */
/* JADX INFO: loaded from: classes12.dex */
public final class v<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final kh.g<? super T> f121342d;

    /* JADX INFO: compiled from: FlowableDoAfterNext.java */
    public static final class a<T> extends io.reactivex.internal.subscribers.a<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.g<? super T> f121343g;

        a(lh.a<? super T> aVar, kh.g<? super T> gVar) {
            super(aVar);
            this.f121343g = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // lh.a
        public boolean m(T t10) {
            boolean zM = this.f123792b.m((Object) t10);
            try {
                this.f121343g.accept(t10);
            } catch (Throwable th2) {
                c(th2);
            }
            return zM;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f123792b.onNext((Object) t10);
            if (this.f123796f == 0) {
                try {
                    this.f121343g.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f123794d.poll();
            if (tPoll != null) {
                this.f121343g.accept(tPoll);
            }
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    /* JADX INFO: compiled from: FlowableDoAfterNext.java */
    public static final class b<T> extends io.reactivex.internal.subscribers.b<T, T> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final kh.g<? super T> f121344g;

        b(org.reactivestreams.d<? super T> dVar, kh.g<? super T> gVar) {
            super(dVar);
            this.f121344g = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            if (this.f123800e) {
                return;
            }
            this.f123797b.onNext((Object) t10);
            if (this.f123801f == 0) {
                try {
                    this.f121344g.accept(t10);
                } catch (Throwable th2) {
                    c(th2);
                }
            }
        }

        @Override // lh.o
        @jh.f
        public T poll() throws Exception {
            T tPoll = this.f123799d.poll();
            if (tPoll != null) {
                this.f121344g.accept(tPoll);
            }
            return tPoll;
        }

        @Override // lh.k
        public int requestFusion(int i10) {
            return d(i10);
        }
    }

    public v(io.reactivex.j<T> jVar, kh.g<? super T> gVar) {
        super(jVar);
        this.f121342d = gVar;
    }

    @Override // io.reactivex.j
    protected void k6(org.reactivestreams.d<? super T> dVar) {
        if (dVar instanceof lh.a) {
            this.f121039c.j6(new a((lh.a) dVar, this.f121342d));
        } else {
            this.f121039c.j6(new b(dVar, this.f121342d));
        }
    }
}
