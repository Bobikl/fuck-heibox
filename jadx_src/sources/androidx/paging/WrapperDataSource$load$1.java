package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: WrapperDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000\"\b\b\u0002\u0010\u0003*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00070\u0006H\u0090@"}, d2 = {"", "Key", "ValueFrom", "ValueTo", "Landroidx/paging/DataSource$d;", "params", "Lkotlin/coroutines/c;", "Landroidx/paging/DataSource$a;", "continuation", "load"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.WrapperDataSource", f = "WrapperDataSource.kt", i = {0}, l = {68}, m = "load$paging_common$suspendImpl", n = {"this"}, s = {"L$0"})
public final class WrapperDataSource$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f26358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ WrapperDataSource f26360d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f26361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WrapperDataSource$load$1(WrapperDataSource wrapperDataSource, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f26360d = wrapperDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f26358b = obj;
        this.f26359c |= Integer.MIN_VALUE;
        return WrapperDataSource.p(this.f26360d, null, this);
    }
}
