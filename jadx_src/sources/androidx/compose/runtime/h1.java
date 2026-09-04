package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/h1;", "", "lock", "Lkotlin/b2;", ak.aF, "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "e", "Lkotlin/coroutines/c;", "d", ak.av, "Ljava/lang/Object;", "pendingFrameContinuation", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 7, 1})
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private Object pendingFrameContinuation;

    @dl.e
    public final Object c(@dl.d Object obj, @dl.d kotlin.coroutines.c<? super kotlin.b2> cVar) {
        kotlinx.coroutines.q qVar;
        synchronized (obj) {
            if (this.pendingFrameContinuation == RecomposerKt.f12534b) {
                this.pendingFrameContinuation = RecomposerKt.f12535c;
                return kotlin.b2.f124493a;
            }
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            kotlinx.coroutines.q qVar2 = new kotlinx.coroutines.q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
            qVar2.F0();
            synchronized (obj) {
                if (this.pendingFrameContinuation == RecomposerKt.f12534b) {
                    this.pendingFrameContinuation = RecomposerKt.f12535c;
                    qVar = qVar2;
                } else {
                    this.pendingFrameContinuation = qVar2;
                    qVar = null;
                }
            }
            if (qVar != null) {
                Result.a aVar = Result.f124476c;
                qVar.resumeWith(Result.b(b2Var));
            }
            Object objT = qVar2.t();
            if (objT == kotlin.coroutines.intrinsics.b.h()) {
                kotlin.coroutines.jvm.internal.f.c(cVar);
            }
            return objT == kotlin.coroutines.intrinsics.b.h() ? objT : b2Var;
        }
    }

    @dl.e
    public final kotlin.coroutines.c<kotlin.b2> d() {
        Object obj = this.pendingFrameContinuation;
        if (obj instanceof kotlin.coroutines.c) {
            this.pendingFrameContinuation = RecomposerKt.f12535c;
            return (kotlin.coroutines.c) obj;
        }
        if (kotlin.jvm.internal.f0.g(obj, RecomposerKt.f12534b) ? true : kotlin.jvm.internal.f0.g(obj, RecomposerKt.f12535c)) {
            return null;
        }
        if (obj == null) {
            this.pendingFrameContinuation = RecomposerKt.f12534b;
            return null;
        }
        throw new IllegalStateException(("invalid pendingFrameContinuation " + obj).toString());
    }

    public final void e() {
        if (!(this.pendingFrameContinuation == RecomposerKt.f12535c)) {
            throw new IllegalStateException("frame not pending".toString());
        }
        this.pendingFrameContinuation = null;
    }
}
