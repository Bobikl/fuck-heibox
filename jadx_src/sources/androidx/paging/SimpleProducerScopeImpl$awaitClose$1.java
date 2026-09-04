package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0007\u001a\u0004\u0018\u00010\u0006\"\u0004\b\u0000\u0010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0096@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function0;", "Lkotlin/b2;", "block", "Lkotlin/coroutines/c;", "continuation", "", "awaitClose"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", i = {0}, l = {97}, m = "awaitClose", n = {"block"}, s = {"L$0"})
public final class SimpleProducerScopeImpl$awaitClose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SimpleProducerScopeImpl f26312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f26314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleProducerScopeImpl$awaitClose$1(SimpleProducerScopeImpl simpleProducerScopeImpl, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26312d = simpleProducerScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26310b = obj;
        this.f26311c |= Integer.MIN_VALUE;
        return this.f26312d.r(null, this);
    }
}
