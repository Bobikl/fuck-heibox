package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0014R*\u0010\u0011\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, d2 = {"Lkotlinx/coroutines/o3;", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/internal/k0;", "Lkotlin/coroutines/CoroutineContext;", com.umeng.analytics.pro.d.R, "", "oldValue", "Lkotlin/b2;", "M1", "", "L1", "state", "F1", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "e", "Ljava/lang/ThreadLocal;", "threadStateToRecover", "Lkotlin/coroutines/c;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class o3<T> extends kotlinx.coroutines.internal.k0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private ThreadLocal<Pair<CoroutineContext, Object>> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    public o3(@dl.d CoroutineContext coroutineContext, @dl.d kotlin.coroutines.c<? super T> cVar) {
        p3 p3Var = p3.f130299b;
        super(coroutineContext.f(p3Var) == null ? coroutineContext.I(p3Var) : coroutineContext, cVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (cVar.getCom.umeng.analytics.pro.d.R java.lang.String().f(kotlin.coroutines.d.f124698w1) instanceof CoroutineDispatcher) {
            return;
        }
        Object objC = ThreadContextKt.c(coroutineContext, null);
        ThreadContextKt.a(coroutineContext, objC);
        M1(coroutineContext, objC);
    }

    @Override // kotlinx.coroutines.internal.k0, kotlinx.coroutines.a
    protected void F1(@dl.e Object obj) {
        Pair<CoroutineContext, Object> pair = this.threadStateToRecover.get();
        if (pair != null) {
            ThreadContextKt.a(pair.a(), pair.b());
            this.threadStateToRecover.set(null);
        }
        Object objA = i0.a(obj, this.uCont);
        kotlin.coroutines.c<T> cVar = this.uCont;
        CoroutineContext coroutineContext = cVar.getCom.umeng.analytics.pro.d.R java.lang.String();
        Object objC = ThreadContextKt.c(coroutineContext, null);
        o3<?> o3VarG = objC != ThreadContextKt.f130141a ? CoroutineContextKt.g(cVar, coroutineContext, objC) : null;
        try {
            this.uCont.resumeWith(objA);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        } finally {
            if (o3VarG == null || o3VarG.L1()) {
                ThreadContextKt.a(coroutineContext, objC);
            }
        }
    }

    public final boolean L1() {
        if (this.threadStateToRecover.get() == null) {
            return false;
        }
        this.threadStateToRecover.set(null);
        return true;
    }

    public final void M1(@dl.d CoroutineContext coroutineContext, @dl.e Object obj) {
        this.threadStateToRecover.set(kotlin.c1.a(coroutineContext, obj));
    }
}
