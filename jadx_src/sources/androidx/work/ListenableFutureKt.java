package androidx.work;

import androidx.annotation.RestrictTo;
import com.google.common.util.concurrent.p0;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.c0;
import kotlin.t0;

/* JADX INFO: compiled from: ListenableFuture.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"R", "Lcom/google/common/util/concurrent/p0;", ak.av, "(Lcom/google/common/util/concurrent/p0;Lkotlin/coroutines/c;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class ListenableFutureKt {

    /* JADX INFO: compiled from: ListenableFuture.kt */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"R", "Lkotlin/b2;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.p<R> f28691b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p0<R> f28692c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.p<? super R> pVar, p0<R> p0Var) {
            this.f28691b = pVar;
            this.f28692c = p0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                kotlin.coroutines.c cVar = this.f28691b;
                Result.a aVar = Result.f124476c;
                cVar.resumeWith(Result.b(this.f28692c.get()));
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    cause = th2;
                }
                if (th2 instanceof CancellationException) {
                    this.f28691b.b(cause);
                    return;
                }
                kotlin.coroutines.c cVar2 = this.f28691b;
                Result.a aVar2 = Result.f124476c;
                cVar2.resumeWith(Result.b(t0.a(cause)));
            }
        }
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <R> Object a(@dl.d p0<R> p0Var, @dl.d kotlin.coroutines.c<? super R> cVar) throws Throwable {
        if (p0Var.isDone()) {
            try {
                return p0Var.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause == null) {
                    throw e10;
                }
                throw cause;
            }
        }
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        p0Var.V(new a(qVar, p0Var), DirectExecutor.INSTANCE);
        qVar.L(new ListenableFutureKt$await$2$2(p0Var));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private static final <R> Object b(p0<R> p0Var, kotlin.coroutines.c<? super R> cVar) throws Throwable {
        if (p0Var.isDone()) {
            try {
                return p0Var.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e10;
            }
        }
        c0.e(0);
        kotlinx.coroutines.q qVar = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        p0Var.V(new a(qVar, p0Var), DirectExecutor.INSTANCE);
        qVar.L(new ListenableFutureKt$await$2$2(p0Var));
        b2 b2Var = b2.f124493a;
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        c0.e(1);
        return objT;
    }
}
