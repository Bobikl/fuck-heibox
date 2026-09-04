package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import okhttp3.a0;
import okio.Timeout;

/* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public final class g extends c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Executor f138956a;

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public class a implements c<Object, retrofit2.b<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Type f138957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Executor f138958b;

        a(Type type, Executor executor) {
            this.f138957a = type;
            this.f138958b = executor;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f138957a;
        }

        @Override // retrofit2.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public retrofit2.b<Object> b(retrofit2.b<Object> bVar) {
            Executor executor = this.f138958b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
    public static final class b<T> implements retrofit2.b<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f138960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final retrofit2.b<T> f138961c;

        /* JADX INFO: compiled from: DefaultCallAdapterFactory.java */
        public class a implements d<T> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d f138962b;

            a(d dVar) {
                this.f138962b = dVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void e(d dVar, Throwable th2) {
                dVar.a(b.this, th2);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void f(d dVar, s sVar) {
                if (b.this.f138961c.isCanceled()) {
                    dVar.a(b.this, new IOException("Canceled"));
                } else {
                    dVar.b(b.this, sVar);
                }
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<T> bVar, final Throwable th2) {
                Executor executor = b.this.f138960b;
                final d dVar = this.f138962b;
                executor.execute(new Runnable() { // from class: retrofit2.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f138967b.e(dVar, th2);
                    }
                });
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<T> bVar, final s<T> sVar) {
                Executor executor = b.this.f138960b;
                final d dVar = this.f138962b;
                executor.execute(new Runnable() { // from class: retrofit2.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f138964b.f(dVar, sVar);
                    }
                });
            }
        }

        b(Executor executor, retrofit2.b<T> bVar) {
            this.f138960b = executor;
            this.f138961c = bVar;
        }

        @Override // retrofit2.b
        public void N(d<T> dVar) {
            Objects.requireNonNull(dVar, "callback == null");
            this.f138961c.N(new a(dVar));
        }

        @Override // retrofit2.b
        public void cancel() {
            this.f138961c.cancel();
        }

        @Override // retrofit2.b
        public retrofit2.b<T> clone() {
            return new b(this.f138960b, this.f138961c.clone());
        }

        @Override // retrofit2.b
        public s<T> execute() throws IOException {
            return this.f138961c.execute();
        }

        @Override // retrofit2.b
        public boolean isCanceled() {
            return this.f138961c.isCanceled();
        }

        @Override // retrofit2.b
        public boolean isExecuted() {
            return this.f138961c.isExecuted();
        }

        @Override // retrofit2.b
        public a0 request() {
            return this.f138961c.request();
        }

        @Override // retrofit2.b
        public Timeout timeout() {
            return this.f138961c.timeout();
        }
    }

    g(@Nullable Executor executor) {
        this.f138956a = executor;
    }

    @Override // retrofit2.c.a
    @Nullable
    public c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        if (c.a.c(type) != retrofit2.b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(x.g(0, (ParameterizedType) type), x.l(annotationArr, v.class) ? null : this.f138956a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
