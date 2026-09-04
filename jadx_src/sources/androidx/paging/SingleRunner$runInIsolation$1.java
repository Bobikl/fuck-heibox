package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0086@"}, d2 = {"", "priority", "Lkotlin/Function1;", "Lkotlin/coroutines/c;", "Lkotlin/b2;", "", "block", "continuation", "runInIsolation"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", i = {0}, l = {49}, m = "runInIsolation", n = {"this"}, s = {"L$0"})
public final class SingleRunner$runInIsolation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleRunner f26340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26341e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$runInIsolation$1(SingleRunner singleRunner, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26340d = singleRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26338b = obj;
        this.f26339c |= Integer.MIN_VALUE;
        return this.f26340d.b(0, null, this);
    }
}
