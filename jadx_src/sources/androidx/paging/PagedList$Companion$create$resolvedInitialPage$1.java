package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [T, K] */
/* JADX INFO: compiled from: PagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Landroidx/paging/q0$b$b;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", f = "PagedList.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
public final class PagedList$Companion$create$resolvedInitialPage$1<K, T> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super q0.b.Page<K, T>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ q0 f25959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.ObjectRef f25960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagedList$Companion$create$resolvedInitialPage$1(q0 q0Var, Ref.ObjectRef objectRef, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25959c = q0Var;
        this.f25960d = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PagedList$Companion$create$resolvedInitialPage$1(this.f25959c, this.f25960d, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, Object obj) {
        return ((PagedList$Companion$create$resolvedInitialPage$1) create(q0Var, (kotlin.coroutines.c) obj)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25958b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            q0 q0Var = this.f25959c;
            q0.a.d dVar = (q0.a.d) this.f25960d.f124891b;
            this.f25958b = 1;
            obj = q0Var.h(dVar, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        q0.b bVar = (q0.b) obj;
        if (bVar instanceof q0.b.Page) {
            return (q0.b.Page) bVar;
        }
        if (bVar instanceof q0.b.Error) {
            throw ((q0.b.Error) bVar).d();
        }
        throw new NoWhenBranchMatchedException();
    }
}
