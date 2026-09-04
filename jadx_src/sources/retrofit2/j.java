package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import okhttp3.c0;
import okhttp3.d0;

/* JADX INFO: compiled from: HttpServiceMethod.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class j<ResponseT, ReturnT> extends u<ReturnT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f138970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okhttp3.e.a f138971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f<d0, ResponseT> f138972c;

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class a<ResponseT, ReturnT> extends j<ResponseT, ReturnT> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, ReturnT> f138973d;

        a(r rVar, okhttp3.e.a aVar, f<d0, ResponseT> fVar, retrofit2.c<ResponseT, ReturnT> cVar) {
            super(rVar, aVar, fVar);
            this.f138973d = cVar;
        }

        @Override // retrofit2.j
        protected ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            return this.f138973d.b(bVar);
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class b<ResponseT> extends j<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f138974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f138975e;

        b(r rVar, okhttp3.e.a aVar, f<d0, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar, boolean z10) {
            super(rVar, aVar, fVar);
            this.f138974d = cVar;
            this.f138975e = z10;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> bVarB = this.f138974d.b(bVar);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) objArr[objArr.length - 1];
            try {
                return this.f138975e ? KotlinExtensions.b(bVarB, cVar) : KotlinExtensions.a(bVarB, cVar);
            } catch (Exception e10) {
                return KotlinExtensions.e(e10, cVar);
            }
        }
    }

    /* JADX INFO: compiled from: HttpServiceMethod.java */
    public static final class c<ResponseT> extends j<ResponseT, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final retrofit2.c<ResponseT, retrofit2.b<ResponseT>> f138976d;

        c(r rVar, okhttp3.e.a aVar, f<d0, ResponseT> fVar, retrofit2.c<ResponseT, retrofit2.b<ResponseT>> cVar) {
            super(rVar, aVar, fVar);
            this.f138976d = cVar;
        }

        @Override // retrofit2.j
        protected Object c(retrofit2.b<ResponseT> bVar, Object[] objArr) {
            retrofit2.b<ResponseT> bVarB = this.f138976d.b(bVar);
            kotlin.coroutines.c cVar = (kotlin.coroutines.c) objArr[objArr.length - 1];
            try {
                return KotlinExtensions.c(bVarB, cVar);
            } catch (Exception e10) {
                return KotlinExtensions.e(e10, cVar);
            }
        }
    }

    j(r rVar, okhttp3.e.a aVar, f<d0, ResponseT> fVar) {
        this.f138970a = rVar;
        this.f138971b = aVar;
        this.f138972c = fVar;
    }

    private static <ResponseT, ReturnT> retrofit2.c<ResponseT, ReturnT> d(t tVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (retrofit2.c<ResponseT, ReturnT>) tVar.b(type, annotationArr);
        } catch (RuntimeException e10) {
            throw x.n(method, e10, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> f<d0, ResponseT> e(t tVar, Method method, Type type) {
        try {
            return tVar.n(type, method.getAnnotations());
        } catch (RuntimeException e10) {
            throw x.n(method, e10, "Unable to create converter for %s", type);
        }
    }

    static <ResponseT, ReturnT> j<ResponseT, ReturnT> f(t tVar, Method method, r rVar) {
        Type genericReturnType;
        boolean z10;
        boolean z11 = rVar.f139072k;
        Annotation[] annotations = method.getAnnotations();
        if (z11) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type typeF = x.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (x.h(typeF) == s.class && (typeF instanceof ParameterizedType)) {
                typeF = x.g(0, (ParameterizedType) typeF);
                z10 = true;
            } else {
                z10 = false;
            }
            genericReturnType = new x.b(null, retrofit2.b.class, typeF);
            annotations = w.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z10 = false;
        }
        retrofit2.c cVarD = d(tVar, method, genericReturnType, annotations);
        Type typeA = cVarD.a();
        if (typeA == c0.class) {
            throw x.m(method, "'" + x.h(typeA).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        }
        if (typeA == s.class) {
            throw x.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        if (rVar.f139064c.equals("HEAD") && !Void.class.equals(typeA)) {
            throw x.m(method, "HEAD method must use Void as response type.", new Object[0]);
        }
        f fVarE = e(tVar, method, typeA);
        okhttp3.e.a aVar = tVar.f139103b;
        if (z11) {
            return z10 ? new c(rVar, aVar, fVarE, cVarD) : new b(rVar, aVar, fVarE, cVarD, false);
        }
        return new a(rVar, aVar, fVarE, cVarD);
    }

    @Override // retrofit2.u
    @Nullable
    final ReturnT a(Object[] objArr) {
        return c(new l(this.f138970a, objArr, this.f138971b, this.f138972c), objArr);
    }

    @Nullable
    protected abstract ReturnT c(retrofit2.b<ResponseT> bVar, Object[] objArr);
}
