package retrofit2;

import com.umeng.analytics.pro.ak;
import java.lang.reflect.Method;
import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.e1;

/* JADX INFO: compiled from: KotlinExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "KotlinExtensions")
@Metadata(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lretrofit2/t;", "d", "(Lretrofit2/t;)Ljava/lang/Object;", "", "Lretrofit2/b;", ak.av, "(Lretrofit2/b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "b", "Lretrofit2/s;", ak.aF, "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "e", "(Ljava/lang/Exception;Lkotlin/coroutines/c;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {1, 4, 0})
public final class KotlinExtensions {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$a", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/s;", "response", "Lkotlin/b2;", "b", "", "t", ak.av, "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class a<T> implements retrofit2.d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f138897b;

        a(kotlinx.coroutines.p pVar) {
            this.f138897b = pVar;
        }

        @Override // retrofit2.d
        public void a(@dl.d retrofit2.b<T> call, @dl.d Throwable t10) {
            f0.q(call, "call");
            f0.q(t10, "t");
            kotlinx.coroutines.p pVar = this.f138897b;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(t0.a(t10)));
        }

        @Override // retrofit2.d
        public void b(@dl.d retrofit2.b<T> call, @dl.d s<T> response) {
            f0.q(call, "call");
            f0.q(response, "response");
            if (!response.g()) {
                kotlinx.coroutines.p pVar = this.f138897b;
                HttpException httpException = new HttpException(response);
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(t0.a(httpException)));
                return;
            }
            T tA = response.a();
            if (tA != null) {
                kotlinx.coroutines.p pVar2 = this.f138897b;
                Result.a aVar2 = Result.f124476c;
                pVar2.resumeWith(Result.b(tA));
                return;
            }
            Object objP = call.request().p(k.class);
            if (objP == null) {
                f0.L();
            }
            f0.h(objP, "call.request().tag(Invocation::class.java)!!");
            Method method = ((k) objP).b();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Response from ");
            f0.h(method, "method");
            Class<?> declaringClass = method.getDeclaringClass();
            f0.h(declaringClass, "method.declaringClass");
            sb2.append(declaringClass.getName());
            sb2.append(lg.a.f131414g);
            sb2.append(method.getName());
            sb2.append(" was null but response body type was declared as non-null");
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException(sb2.toString());
            kotlinx.coroutines.p pVar3 = this.f138897b;
            Result.a aVar3 = Result.f124476c;
            pVar3.resumeWith(Result.b(t0.a(kotlinNullPointerException)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004H\u0016J \u0010\n\u001a\u00020\u00062\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$b", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/s;", "response", "Lkotlin/b2;", "b", "", "t", ak.av, "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class b<T> implements retrofit2.d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f138901b;

        b(kotlinx.coroutines.p pVar) {
            this.f138901b = pVar;
        }

        @Override // retrofit2.d
        public void a(@dl.d retrofit2.b<T> call, @dl.d Throwable t10) {
            f0.q(call, "call");
            f0.q(t10, "t");
            kotlinx.coroutines.p pVar = this.f138901b;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(t0.a(t10)));
        }

        @Override // retrofit2.d
        public void b(@dl.d retrofit2.b<T> call, @dl.d s<T> response) {
            f0.q(call, "call");
            f0.q(response, "response");
            if (response.g()) {
                kotlinx.coroutines.p pVar = this.f138901b;
                T tA = response.a();
                Result.a aVar = Result.f124476c;
                pVar.resumeWith(Result.b(tA));
                return;
            }
            kotlinx.coroutines.p pVar2 = this.f138901b;
            HttpException httpException = new HttpException(response);
            Result.a aVar2 = Result.f124476c;
            pVar2.resumeWith(Result.b(t0.a(httpException)));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J$\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016J\u001e\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"retrofit2/KotlinExtensions$c", "Lretrofit2/d;", "Lretrofit2/b;", "call", "Lretrofit2/s;", "response", "Lkotlin/b2;", "b", "", "t", ak.av, "retrofit"}, k = 1, mv = {1, 4, 0})
    public static final class c<T> implements retrofit2.d<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p f138902b;

        c(kotlinx.coroutines.p pVar) {
            this.f138902b = pVar;
        }

        @Override // retrofit2.d
        public void a(@dl.d retrofit2.b<T> call, @dl.d Throwable t10) {
            f0.q(call, "call");
            f0.q(t10, "t");
            kotlinx.coroutines.p pVar = this.f138902b;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(t0.a(t10)));
        }

        @Override // retrofit2.d
        public void b(@dl.d retrofit2.b<T> call, @dl.d s<T> response) {
            f0.q(call, "call");
            f0.q(response, "response");
            kotlinx.coroutines.p pVar = this.f138902b;
            Result.a aVar = Result.f124476c;
            pVar.resumeWith(Result.b(response));
        }
    }

    /* JADX INFO: compiled from: KotlinExtensions.kt */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/b2;", "run", "()V", "retrofit2/KotlinExtensions$suspendAndThrow$2$1", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f138903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Exception f138904c;

        d(kotlin.coroutines.c cVar, Exception exc) {
            this.f138903b = cVar;
            this.f138904c = exc;
        }

        @Override // java.lang.Runnable
        public final void run() {
            kotlin.coroutines.c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(this.f138903b);
            Exception exc = this.f138904c;
            Result.a aVar = Result.f124476c;
            cVarD.resumeWith(Result.b(t0.a(exc)));
        }
    }

    @dl.e
    public static final <T> Object a(@dl.d final retrofit2.b<T> bVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.L(new yh.l<Throwable, b2>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                bVar.cancel();
            }
        });
        bVar.N(new a(qVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @xh.h(name = "awaitNullable")
    @dl.e
    public static final <T> Object b(@dl.d final retrofit2.b<T> bVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.L(new yh.l<Throwable, b2>() { // from class: retrofit2.KotlinExtensions$await$$inlined$suspendCancellableCoroutine$lambda$2
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                bVar.cancel();
            }
        });
        bVar.N(new b(qVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @dl.e
    public static final <T> Object c(@dl.d final retrofit2.b<T> bVar, @dl.d kotlin.coroutines.c<? super s<T>> cVar) {
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.L(new yh.l<Throwable, b2>() { // from class: retrofit2.KotlinExtensions$awaitResponse$$inlined$suspendCancellableCoroutine$lambda$1
            {
                super(1);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.e Throwable th2) {
                bVar.cancel();
            }
        });
        bVar.N(new c(qVar));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    public static final /* synthetic */ <T> T d(@dl.d t create) {
        f0.q(create, "$this$create");
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return (T) create.g(Object.class);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object e(@dl.d Exception exc, @dl.d kotlin.coroutines.c<?> cVar) throws Throwable {
        KotlinExtensions$suspendAndThrow$1 kotlinExtensions$suspendAndThrow$1;
        if (cVar instanceof KotlinExtensions$suspendAndThrow$1) {
            kotlinExtensions$suspendAndThrow$1 = (KotlinExtensions$suspendAndThrow$1) cVar;
            int i10 = kotlinExtensions$suspendAndThrow$1.f138906c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                kotlinExtensions$suspendAndThrow$1.f138906c = i10 - Integer.MIN_VALUE;
            } else {
                kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(cVar);
            }
        } else {
            kotlinExtensions$suspendAndThrow$1 = new KotlinExtensions$suspendAndThrow$1(cVar);
        }
        Object obj = kotlinExtensions$suspendAndThrow$1.f138905b;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = kotlinExtensions$suspendAndThrow$1.f138906c;
        if (i11 == 0) {
            t0.n(obj);
            kotlinExtensions$suspendAndThrow$1.f138907d = exc;
            kotlinExtensions$suspendAndThrow$1.f138906c = 1;
            e1.a().O(kotlinExtensions$suspendAndThrow$1.getContext(), new d(kotlinExtensions$suspendAndThrow$1, exc));
            Object objH2 = kotlin.coroutines.intrinsics.b.h();
            if (objH2 == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(kotlinExtensions$suspendAndThrow$1);
            }
            if (objH2 == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
