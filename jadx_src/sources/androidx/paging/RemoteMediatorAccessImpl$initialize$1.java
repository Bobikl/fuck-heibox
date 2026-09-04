package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@"}, d2 = {"", "Key", "Value", "Lkotlin/coroutines/c;", "Landroidx/paging/RemoteMediator$InitializeAction;", "continuation", "initialize"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.RemoteMediatorAccessImpl", f = "RemoteMediatorAccessor.kt", i = {0}, l = {bb.c.b.E4}, m = "initialize", n = {"this"}, s = {"L$0"})
public final class RemoteMediatorAccessImpl$initialize$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RemoteMediatorAccessImpl f26216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$initialize$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26216d = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26214b = obj;
        this.f26215c |= Integer.MIN_VALUE;
        return this.f26216d.a(this);
    }
}
