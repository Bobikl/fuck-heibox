package org.reactivestreams;

import java.util.Objects;
import java.util.concurrent.Flow;

/* JADX INFO: compiled from: FlowAdapters.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: org.reactivestreams.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class FlowPublisherC1251a<T> implements Flow.Publisher<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.c<? extends T> f138028a;

        public FlowPublisherC1251a(org.reactivestreams.c<? extends T> cVar) {
            this.f138028a = cVar;
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super T> subscriber) {
            this.f138028a.g(subscriber == null ? null : new g(subscriber));
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class b<T, U> implements Flow.Processor<T, U> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.b<? super T, ? extends U> f138029a;

        public b(org.reactivestreams.b<? super T, ? extends U> bVar) {
            this.f138029a = bVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f138029a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th2) {
            this.f138029a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t10) {
            this.f138029a.onNext(t10);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f138029a.onSubscribe(subscription == null ? null : new h(subscription));
        }

        @Override // java.util.concurrent.Flow.Publisher
        public void subscribe(Flow.Subscriber<? super U> subscriber) {
            this.f138029a.g(subscriber == null ? null : new g(subscriber));
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class c<T> implements Flow.Subscriber<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.d<? super T> f138030a;

        public c(org.reactivestreams.d<? super T> dVar) {
            this.f138030a = dVar;
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onComplete() {
            this.f138030a.onComplete();
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onError(Throwable th2) {
            this.f138030a.onError(th2);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onNext(T t10) {
            this.f138030a.onNext(t10);
        }

        @Override // java.util.concurrent.Flow.Subscriber
        public void onSubscribe(Flow.Subscription subscription) {
            this.f138030a.onSubscribe(subscription == null ? null : new h(subscription));
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class d implements Flow.Subscription {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final org.reactivestreams.e f138031a;

        public d(org.reactivestreams.e eVar) {
            this.f138031a = eVar;
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void cancel() {
            this.f138031a.cancel();
        }

        @Override // java.util.concurrent.Flow.Subscription
        public void request(long j10) {
            this.f138031a.request(j10);
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class e<T> implements org.reactivestreams.c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Flow.Publisher<? extends T> f138032b;

        public e(Flow.Publisher<? extends T> publisher) {
            this.f138032b = publisher;
        }

        @Override // org.reactivestreams.c
        public void g(org.reactivestreams.d<? super T> dVar) {
            this.f138032b.subscribe(dVar == null ? null : new c(dVar));
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class f<T, U> implements org.reactivestreams.b<T, U> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Flow.Processor<? super T, ? extends U> f138033b;

        public f(Flow.Processor<? super T, ? extends U> processor) {
            this.f138033b = processor;
        }

        @Override // org.reactivestreams.c
        public void g(org.reactivestreams.d<? super U> dVar) {
            this.f138033b.subscribe(dVar == null ? null : new c(dVar));
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f138033b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f138033b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f138033b.onNext(t10);
        }

        @Override // org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f138033b.onSubscribe(eVar == null ? null : new d(eVar));
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class g<T> implements org.reactivestreams.d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Flow.Subscriber<? super T> f138034b;

        public g(Flow.Subscriber<? super T> subscriber) {
            this.f138034b = subscriber;
        }

        @Override // org.reactivestreams.d
        public void onComplete() {
            this.f138034b.onComplete();
        }

        @Override // org.reactivestreams.d
        public void onError(Throwable th2) {
            this.f138034b.onError(th2);
        }

        @Override // org.reactivestreams.d
        public void onNext(T t10) {
            this.f138034b.onNext(t10);
        }

        @Override // org.reactivestreams.d
        public void onSubscribe(org.reactivestreams.e eVar) {
            this.f138034b.onSubscribe(eVar == null ? null : new d(eVar));
        }
    }

    /* JADX INFO: compiled from: FlowAdapters.java */
    public static final class h implements org.reactivestreams.e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Flow.Subscription f138035b;

        public h(Flow.Subscription subscription) {
            this.f138035b = subscription;
        }

        @Override // org.reactivestreams.e
        public void cancel() {
            this.f138035b.cancel();
        }

        @Override // org.reactivestreams.e
        public void request(long j10) {
            this.f138035b.request(j10);
        }
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> Flow.Processor<T, U> a(org.reactivestreams.b<? super T, ? extends U> bVar) {
        Objects.requireNonNull(bVar, "reactiveStreamsProcessor");
        if (bVar instanceof f) {
            return ((f) bVar).f138033b;
        }
        return bVar instanceof Flow.Processor ? (Flow.Processor) bVar : new b(bVar);
    }

    public static <T> Flow.Publisher<T> b(org.reactivestreams.c<? extends T> cVar) {
        Objects.requireNonNull(cVar, "reactiveStreamsPublisher");
        if (cVar instanceof e) {
            return ((e) cVar).f138032b;
        }
        return cVar instanceof Flow.Publisher ? (Flow.Publisher) cVar : new FlowPublisherC1251a(cVar);
    }

    public static <T> Flow.Subscriber<T> c(org.reactivestreams.d<T> dVar) {
        Objects.requireNonNull(dVar, "reactiveStreamsSubscriber");
        if (dVar instanceof g) {
            return ((g) dVar).f138034b;
        }
        return dVar instanceof Flow.Subscriber ? (Flow.Subscriber) dVar : new c(dVar);
    }

    public static <T, U> org.reactivestreams.b<T, U> d(Flow.Processor<? super T, ? extends U> processor) {
        Objects.requireNonNull(processor, "flowProcessor");
        if (processor instanceof b) {
            return ((b) processor).f138029a;
        }
        return processor instanceof org.reactivestreams.b ? (org.reactivestreams.b) processor : new f(processor);
    }

    public static <T> org.reactivestreams.c<T> e(Flow.Publisher<? extends T> publisher) {
        Objects.requireNonNull(publisher, "flowPublisher");
        if (publisher instanceof FlowPublisherC1251a) {
            return ((FlowPublisherC1251a) publisher).f138028a;
        }
        return publisher instanceof org.reactivestreams.c ? (org.reactivestreams.c) publisher : new e(publisher);
    }

    public static <T> org.reactivestreams.d<T> f(Flow.Subscriber<T> subscriber) {
        Objects.requireNonNull(subscriber, "flowSubscriber");
        if (subscriber instanceof c) {
            return ((c) subscriber).f138030a;
        }
        return subscriber instanceof org.reactivestreams.d ? (org.reactivestreams.d) subscriber : new g(subscriber);
    }
}
