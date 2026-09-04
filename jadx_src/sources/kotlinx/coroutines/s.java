package kotlinx.coroutines;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;

/* JADX INFO: compiled from: CancellableContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080Hø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Lkotlinx/coroutines/p;", "Lkotlin/b2;", "block", "d", "(Lyh/l;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f", "Lkotlin/coroutines/c;", "delegate", "Lkotlinx/coroutines/q;", "b", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "node", ak.aF, "Lkotlinx/coroutines/h1;", "handle", ak.av, "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class s {
    @z1
    public static final void a(@dl.d p<?> pVar, @dl.d h1 h1Var) {
        pVar.L(new i1(h1Var));
    }

    @dl.d
    public static final <T> q<T> b(@dl.d kotlin.coroutines.c<? super T> cVar) {
        if (!(cVar instanceof kotlinx.coroutines.internal.l)) {
            return new q<>(cVar, 1);
        }
        q<T> qVarK = ((kotlinx.coroutines.internal.l) cVar).k();
        if (qVarK != null) {
            if (!qVarK.F()) {
                qVarK = null;
            }
            if (qVarK != null) {
                return qVarK;
            }
        }
        return new q<>(cVar, 2);
    }

    public static final void c(@dl.d p<?> pVar, @dl.d LockFreeLinkedListNode lockFreeLinkedListNode) {
        pVar.L(new u2(lockFreeLinkedListNode));
    }

    @dl.e
    public static final <T> Object d(@dl.d yh.l<? super p<? super T>, kotlin.b2> lVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        lVar.invoke(qVar);
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    private static final <T> Object e(yh.l<? super p<? super T>, kotlin.b2> lVar, kotlin.coroutines.c<? super T> cVar) {
        kotlin.jvm.internal.c0.e(0);
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        lVar.invoke(qVar);
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        kotlin.jvm.internal.c0.e(1);
        return objT;
    }

    @dl.e
    public static final <T> Object f(@dl.d yh.l<? super p<? super T>, kotlin.b2> lVar, @dl.d kotlin.coroutines.c<? super T> cVar) {
        q qVarB = b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        lVar.invoke(qVarB);
        Object objT = qVarB.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objT;
    }

    private static final <T> Object g(yh.l<? super p<? super T>, kotlin.b2> lVar, kotlin.coroutines.c<? super T> cVar) {
        kotlin.jvm.internal.c0.e(0);
        q qVarB = b(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        lVar.invoke(qVarB);
        Object objT = qVarB.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        kotlin.jvm.internal.c0.e(1);
        return objT;
    }
}
