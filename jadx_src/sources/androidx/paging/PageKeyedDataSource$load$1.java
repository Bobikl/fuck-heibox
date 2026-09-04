package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: PageKeyedDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0080@"}, d2 = {"", "Key", "Value", "Landroidx/paging/DataSource$d;", "params", "Lkotlin/coroutines/c;", "Landroidx/paging/DataSource$a;", "continuation", "load"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageKeyedDataSource", f = "PageKeyedDataSource.kt", i = {}, l = {bb.c.b.I0, bb.c.b.O0, bb.c.b.P0}, m = "load$paging_common", n = {}, s = {})
public final class PageKeyedDataSource$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    /* synthetic */ Object f25938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageKeyedDataSource f25940d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageKeyedDataSource$load$1(PageKeyedDataSource pageKeyedDataSource, kotlin.coroutines.c cVar) {
        super(cVar);
        this.f25940d = pageKeyedDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        this.f25938b = obj;
        this.f25939c |= Integer.MIN_VALUE;
        return this.f25940d.j(null, this);
    }
}
