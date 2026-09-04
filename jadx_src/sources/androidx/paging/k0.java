package androidx.paging;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PagedListConfig.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a6\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0000¨\u0006\t"}, d2 = {"", "pageSize", "prefetchDistance", "", "enablePlaceholders", "initialLoadSizeHint", "maxSize", "Landroidx/paging/PagedList$d;", ak.av, "paging-common"}, k = 2, mv = {1, 4, 2})
public final class k0 {
    public static final /* synthetic */ PagedList.d a(int i10, int i11, boolean z10, int i12, int i13) {
        return new PagedList.d.a().e(i10).f(i11).b(z10).c(i12).d(i13).a();
    }

    public static /* synthetic */ PagedList.d b(int i10, int i11, boolean z10, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = i10;
        }
        if ((i14 & 4) != 0) {
            z10 = true;
        }
        if ((i14 & 8) != 0) {
            i12 = i10 * 3;
        }
        if ((i14 & 16) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, z10, i12, i13);
    }
}
