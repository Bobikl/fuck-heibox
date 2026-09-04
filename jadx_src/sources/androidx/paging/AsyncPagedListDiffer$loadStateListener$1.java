package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: AsyncPagedListDiffer.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0015\u0010\u0006\u001a\u00110\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u00052\u0015\u0010\t\u001a\u00110\u0007¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Landroidx/paging/LoadType;", "Lkotlin/m0;", "name", "type", "p1", "Landroidx/paging/v;", "state", "p2", "Lkotlin/b2;", "i", "(Landroidx/paging/LoadType;Landroidx/paging/v;)V"}, k = 3, mv = {1, 4, 2})
public final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements yh.p<LoadType, v, b2> {
    AsyncPagedListDiffer$loadStateListener$1(PagedList.e eVar) {
        super(2, eVar, PagedList.e.class, "onStateChanged", "onStateChanged(Landroidx/paging/LoadType;Landroidx/paging/LoadState;)V", 0);
    }

    public final void i(@dl.d LoadType p10, @dl.d v p11) {
        kotlin.jvm.internal.f0.p(p10, "p1");
        kotlin.jvm.internal.f0.p(p11, "p2");
        ((PagedList.e) this.receiver).e(p10, p11);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ b2 invoke(LoadType loadType, v vVar) {
        i(loadType, vVar);
        return b2.f124493a;
    }
}
