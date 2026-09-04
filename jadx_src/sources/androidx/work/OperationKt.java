package androidx.work;

import com.google.common.util.concurrent.p0;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: Operation.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Landroidx/work/q;", "Landroidx/work/q$b$c;", ak.av, "(Landroidx/work/q;Lkotlin/coroutines/c;)Ljava/lang/Object;", "work-runtime-ktx_release"}, k = 2, mv = {1, 7, 1})
public final class OperationKt {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final Object a(@dl.d q qVar, @dl.d kotlin.coroutines.c<? super q.b.c> cVar) throws Throwable {
        OperationKt$await$1 operationKt$await$1;
        Object obj;
        if (cVar instanceof OperationKt$await$1) {
            operationKt$await$1 = (OperationKt$await$1) cVar;
            int i10 = operationKt$await$1.f28696d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                operationKt$await$1.f28696d = i10 - Integer.MIN_VALUE;
            } else {
                operationKt$await$1 = new OperationKt$await$1(cVar);
            }
        } else {
            operationKt$await$1 = new OperationKt$await$1(cVar);
        }
        Object objT = operationKt$await$1.f28695c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = operationKt$await$1.f28696d;
        if (i11 == 0) {
            t0.n(objT);
            p0<q.b.c> result = qVar.getResult();
            f0.o(result, "result");
            if (result.isDone()) {
                try {
                    obj = result.get();
                } catch (ExecutionException e10) {
                    Throwable cause = e10.getCause();
                    if (cause == null) {
                        throw e10;
                    }
                    throw cause;
                }
            } else {
                operationKt$await$1.f28694b = result;
                operationKt$await$1.f28696d = 1;
                kotlinx.coroutines.q qVar2 = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(operationKt$await$1), 1);
                qVar2.F0();
                result.V(new ListenableFutureKt.a(qVar2, result), DirectExecutor.INSTANCE);
                qVar2.L(new ListenableFutureKt$await$2$2(result));
                objT = qVar2.t();
                if (objT == kotlin.coroutines.intrinsics.b.h()) {
                    kotlin.coroutines.jvm.internal.f.c(operationKt$await$1);
                }
                if (objT == objH) {
                    return objH;
                }
            }
            f0.o(obj, "result.await()");
            return obj;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(objT);
        obj = objT;
        f0.o(obj, "result.await()");
        return obj;
    }

    private static final Object b(q qVar, kotlin.coroutines.c<? super q.b.c> cVar) throws Throwable {
        Object objT;
        p0<q.b.c> result = qVar.getResult();
        f0.o(result, "result");
        if (result.isDone()) {
            try {
                objT = result.get();
            } catch (ExecutionException e10) {
                Throwable cause = e10.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e10;
            }
        } else {
            c0.e(0);
            kotlinx.coroutines.q qVar2 = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar2.F0();
            result.V(new ListenableFutureKt.a(qVar2, result), DirectExecutor.INSTANCE);
            qVar2.L(new ListenableFutureKt$await$2$2(result));
            b2 b2Var = b2.f124493a;
            objT = qVar2.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            c0.e(1);
        }
        f0.o(objT, "result.await()");
        return objT;
    }
}
