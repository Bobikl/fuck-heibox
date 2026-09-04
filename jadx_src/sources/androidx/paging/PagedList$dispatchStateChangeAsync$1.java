package androidx.paging;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PagedList$dispatchStateChangeAsync$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ PagedList f25987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LoadType f25988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ v f25989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PagedList$dispatchStateChangeAsync$1(PagedList pagedList, LoadType loadType, v vVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25987c = pagedList;
        this.f25988d = loadType;
        this.f25989e = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PagedList$dispatchStateChangeAsync$1(this.f25987c, this.f25988d, this.f25989e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((PagedList$dispatchStateChangeAsync$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlin.coroutines.intrinsics.b.h();
        if (this.f25986b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        kotlin.collections.x.I0(this.f25987c.loadStateListeners, new yh.l<WeakReference<yh.p<? super LoadType, ? super v, ? extends b2>>, Boolean>() { // from class: androidx.paging.PagedList$dispatchStateChangeAsync$1.1
            public final boolean a(@dl.d WeakReference<yh.p<LoadType, v, b2>> it) {
                kotlin.jvm.internal.f0.p(it, "it");
                return it.get() == null;
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ Boolean invoke(WeakReference<yh.p<? super LoadType, ? super v, ? extends b2>> weakReference) {
                return Boolean.valueOf(a(weakReference));
            }
        });
        Iterator it = this.f25987c.loadStateListeners.iterator();
        while (it.hasNext()) {
            yh.p pVar = (yh.p) ((WeakReference) it.next()).get();
            if (pVar != null) {
            }
        }
        return b2.f124493a;
    }
}
