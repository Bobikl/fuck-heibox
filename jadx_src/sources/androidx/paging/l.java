package androidx.paging;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: InitialDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J*\u0010\r\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016J*\u0010\u000e\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fH\u0016¨\u0006\u0011"}, d2 = {"Landroidx/paging/l;", "", "K", androidx.exifinterface.media.a.X4, "Landroidx/paging/PageKeyedDataSource;", "Landroidx/paging/PageKeyedDataSource$c;", "params", "Landroidx/paging/PageKeyedDataSource$b;", "callback", "Lkotlin/b2;", "x", "Landroidx/paging/PageKeyedDataSource$d;", "Landroidx/paging/PageKeyedDataSource$a;", "v", "t", "<init>", "()V", "paging-common"}, k = 1, mv = {1, 4, 2})
public final class l<K, V> extends PageKeyedDataSource<K, V> {
    @Override // androidx.paging.PageKeyedDataSource
    public void t(@dl.d PageKeyedDataSource.d<K> params, @dl.d PageKeyedDataSource.a<K, V> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        callback.a(CollectionsKt__CollectionsKt.E(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void v(@dl.d PageKeyedDataSource.d<K> params, @dl.d PageKeyedDataSource.a<K, V> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        callback.a(CollectionsKt__CollectionsKt.E(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void x(@dl.d PageKeyedDataSource.c<K> params, @dl.d PageKeyedDataSource.b<K, V> callback) {
        kotlin.jvm.internal.f0.p(params, "params");
        kotlin.jvm.internal.f0.p(callback, "callback");
        callback.a(CollectionsKt__CollectionsKt.E(), 0, 0, null, null);
    }
}
