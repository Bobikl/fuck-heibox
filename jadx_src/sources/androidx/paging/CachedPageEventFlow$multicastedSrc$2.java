package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPageEventFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlin/collections/h0;", "Landroidx/paging/PageEvent;", "p1", "Lkotlin/b2;", "i", "(Lkotlin/collections/h0;Lkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class CachedPageEventFlow$multicastedSrc$2<T> extends FunctionReferenceImpl implements yh.p<kotlin.collections.h0<? extends PageEvent<T>>, kotlin.coroutines.c<? super b2>, Object>, kotlin.coroutines.jvm.internal.j {
    CachedPageEventFlow$multicastedSrc$2(FlattenedPageController flattenedPageController) {
        super(2, flattenedPageController, FlattenedPageController.class, "record", "record(Lkotlin/collections/IndexedValue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d kotlin.collections.h0<? extends PageEvent<T>> h0Var, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        return ((FlattenedPageController) this.receiver).b(h0Var, cVar);
    }
}
