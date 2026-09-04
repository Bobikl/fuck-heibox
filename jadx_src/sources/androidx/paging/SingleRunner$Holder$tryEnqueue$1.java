package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: SingleRunner.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086@"}, d2 = {"", "priority", "Lkotlinx/coroutines/d2;", "job", "Lkotlin/coroutines/c;", "", "continuation", "", "tryEnqueue"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", i = {0, 0, 0, 1, 1, 1}, l = {129, 100}, m = "tryEnqueue", n = {"this", "job", "priority", "this", "job", "priority"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
public final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SingleRunner.Holder f26333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f26335f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f26336g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f26337h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26333d = holder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26331b = obj;
        this.f26332c |= Integer.MIN_VALUE;
        return this.f26333d.b(0, null, this);
    }
}
