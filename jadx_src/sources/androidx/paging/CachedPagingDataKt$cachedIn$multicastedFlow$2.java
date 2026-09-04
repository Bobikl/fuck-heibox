package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Landroidx/paging/MulticastedPagingData;", androidx.exifinterface.media.a.f23244d5, "", "prev", "next", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$2", f = "CachedPagingData.kt", i = {0}, l = {93}, m = "invokeSuspend", n = {"next"}, s = {"L$0"})
public final class CachedPagingDataKt$cachedIn$multicastedFlow$2<T> extends SuspendLambda implements yh.q<MulticastedPagingData<T>, MulticastedPagingData<T>, kotlin.coroutines.c<? super MulticastedPagingData<T>>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f25450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25451d;

    CachedPagingDataKt$cachedIn$multicastedFlow$2(kotlin.coroutines.c cVar) {
        super(3, cVar);
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d MulticastedPagingData<T> prev, @dl.d MulticastedPagingData<T> next, @dl.d kotlin.coroutines.c<? super MulticastedPagingData<T>> continuation) {
        kotlin.jvm.internal.f0.p(prev, "prev");
        kotlin.jvm.internal.f0.p(next, "next");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        CachedPagingDataKt$cachedIn$multicastedFlow$2 cachedPagingDataKt$cachedIn$multicastedFlow$2 = new CachedPagingDataKt$cachedIn$multicastedFlow$2(continuation);
        cachedPagingDataKt$cachedIn$multicastedFlow$2.f25449b = prev;
        cachedPagingDataKt$cachedIn$multicastedFlow$2.f25450c = next;
        return cachedPagingDataKt$cachedIn$multicastedFlow$2;
    }

    @Override // yh.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return ((CachedPagingDataKt$cachedIn$multicastedFlow$2) a((MulticastedPagingData) obj, (MulticastedPagingData) obj2, (kotlin.coroutines.c) obj3)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25451d;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MulticastedPagingData multicastedPagingData = (MulticastedPagingData) this.f25449b;
            kotlin.t0.n(obj);
            return multicastedPagingData;
        }
        kotlin.t0.n(obj);
        MulticastedPagingData multicastedPagingData2 = (MulticastedPagingData) this.f25449b;
        MulticastedPagingData multicastedPagingData3 = (MulticastedPagingData) this.f25450c;
        this.f25449b = multicastedPagingData3;
        this.f25451d = 1;
        return multicastedPagingData2.b(this) == objH ? objH : multicastedPagingData3;
    }
}
