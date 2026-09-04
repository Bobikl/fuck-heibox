package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@"}, d2 = {"Lkotlinx/coroutines/d2;", "job", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "continuation", "", "onFinish"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0}, l = {140}, m = "onFinish", n = {"this", "job", "$this$withLock$iv"}, s = {"L$0", "L$1", "L$2"})
public final class SingleRunner$Holder$onFinish$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleRunner.Holder f26327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f26329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f26330g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$Holder$onFinish$1(SingleRunner.Holder holder, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26327d = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26325b = obj;
        this.f26326c |= Integer.MIN_VALUE;
        return this.f26327d.a(null, this);
    }
}
