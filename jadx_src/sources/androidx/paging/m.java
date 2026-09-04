package androidx.paging;

import androidx.annotation.RestrictTo;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: InitialPagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B1\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/paging/m;", "", "K", androidx.exifinterface.media.a.X4, "Landroidx/paging/ContiguousPagedList;", "Lkotlinx/coroutines/q0;", "coroutineScope", "Lkotlinx/coroutines/CoroutineDispatcher;", "notifyDispatcher", "backgroundDispatcher", "Landroidx/paging/PagedList$d;", "config", "initialLastKey", "<init>", "(Lkotlinx/coroutines/q0;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/PagedList$d;Ljava/lang/Object;)V", "paging-common"}, k = 1, mv = {1, 4, 2})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class m<K, V> extends ContiguousPagedList<K, V> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(@dl.d kotlinx.coroutines.q0 coroutineScope, @dl.d CoroutineDispatcher notifyDispatcher, @dl.d CoroutineDispatcher backgroundDispatcher, @dl.d PagedList.d config, @dl.e K k10) {
        super(new LegacyPagingSource(notifyDispatcher, new l()), coroutineScope, notifyDispatcher, backgroundDispatcher, null, config, q0.b.Page.INSTANCE.a(), k10);
        kotlin.jvm.internal.f0.p(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.f0.p(notifyDispatcher, "notifyDispatcher");
        kotlin.jvm.internal.f0.p(backgroundDispatcher, "backgroundDispatcher");
        kotlin.jvm.internal.f0.p(config, "config");
    }
}
