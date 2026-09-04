package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
/* JADX INFO: loaded from: classes5.dex */
@IgnoreJRERequirement
public final class e extends retrofit2.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final retrofit2.c.a f138948a = new e();

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class a<R> implements retrofit2.c<R, CompletableFuture<R>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f138949a;

        /* JADX INFO: renamed from: retrofit2.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class C1263a implements d<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CompletableFuture<R> f138950b;

            public C1263a(CompletableFuture<R> completableFuture) {
                this.f138950b = completableFuture;
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> bVar, Throwable th2) {
                this.f138950b.completeExceptionally(th2);
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> bVar, s<R> sVar) {
                if (sVar.g()) {
                    this.f138950b.complete(sVar.a());
                } else {
                    this.f138950b.completeExceptionally(new HttpException(sVar));
                }
            }
        }

        a(Type type) {
            this.f138949a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f138949a;
        }

        @Override // retrofit2.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<R> b(retrofit2.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.N(new C1263a(bVar2));
            return bVar2;
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class b<T> extends CompletableFuture<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final retrofit2.b<?> f138952b;

        b(retrofit2.b<?> bVar) {
            this.f138952b = bVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            if (z10) {
                this.f138952b.cancel();
            }
            return super.cancel(z10);
        }
    }

    /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    public static final class c<R> implements retrofit2.c<R, CompletableFuture<s<R>>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f138953a;

        /* JADX INFO: compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        public class a implements d<R> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final CompletableFuture<s<R>> f138954b;

            public a(CompletableFuture<s<R>> completableFuture) {
                this.f138954b = completableFuture;
            }

            @Override // retrofit2.d
            public void a(retrofit2.b<R> bVar, Throwable th2) {
                this.f138954b.completeExceptionally(th2);
            }

            @Override // retrofit2.d
            public void b(retrofit2.b<R> bVar, s<R> sVar) {
                this.f138954b.complete(sVar);
            }
        }

        c(Type type) {
            this.f138953a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.f138953a;
        }

        @Override // retrofit2.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public CompletableFuture<s<R>> b(retrofit2.b<R> bVar) {
            b bVar2 = new b(bVar);
            bVar.N(new a(bVar2));
            return bVar2;
        }
    }

    e() {
    }

    @Override // retrofit2.c.a
    @Nullable
    public retrofit2.c<?, ?> a(Type type, Annotation[] annotationArr, t tVar) {
        if (retrofit2.c.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type typeB = retrofit2.c.a.b(0, (ParameterizedType) type);
        if (retrofit2.c.a.c(typeB) != s.class) {
            return new a(typeB);
        }
        if (typeB instanceof ParameterizedType) {
            return new c(retrofit2.c.a.b(0, (ParameterizedType) typeB));
        }
        throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
    }
}
