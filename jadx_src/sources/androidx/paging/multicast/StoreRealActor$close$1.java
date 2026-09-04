package androidx.paging.multicast;

import dl.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: StoreRealActor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "close"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.multicast.StoreRealActor", f = "StoreRealActor.kt", i = {0}, l = {74, 76}, m = "close", n = {"this"}, s = {"L$0"})
public final class StoreRealActor$close$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ StoreRealActor f26567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26568e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StoreRealActor$close$1(StoreRealActor storeRealActor, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26567d = storeRealActor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26565b = obj;
        this.f26566c |= Integer.MIN_VALUE;
        return this.f26567d.c(this);
    }
}
