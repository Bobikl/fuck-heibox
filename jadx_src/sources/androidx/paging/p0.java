package androidx.paging;

import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: PagingLiveData.kt */
/* JADX INFO: loaded from: classes6.dex */
@xh.h(name = "PagingLiveData")
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a4\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007\u001a4\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u000b\u001a\u00020\n\"A\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002\"\b\b\u0000\u0010\r*\u00020\u0000\"\b\b\u0001\u0010\u000e*\u00020\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Landroidx/lifecycle/LiveData;", "Landroidx/paging/o0;", "Landroidx/lifecycle/Lifecycle;", "lifecycle", ak.av, "Landroidx/lifecycle/w0;", "viewModel", "b", "Lkotlinx/coroutines/q0;", "scope", ak.aF, "Key", "Value", "Landroidx/paging/Pager;", "d", "(Landroidx/paging/Pager;)Landroidx/lifecycle/LiveData;", "liveData", "paging-runtime_release"}, k = 2, mv = {1, 4, 2})
public final class p0 {
    @dl.d
    public static final <T> LiveData<o0<T>> a(@dl.d LiveData<o0<T>> cachedIn, @dl.d Lifecycle lifecycle) {
        kotlin.jvm.internal.f0.p(cachedIn, "$this$cachedIn");
        kotlin.jvm.internal.f0.p(lifecycle, "lifecycle");
        return FlowLiveDataConversions.f(CachedPagingDataKt.a(FlowLiveDataConversions.a(cachedIn), androidx.lifecycle.w.a(lifecycle)), null, 0L, 3, null);
    }

    @dl.d
    public static final <T> LiveData<o0<T>> b(@dl.d LiveData<o0<T>> cachedIn, @dl.d androidx.lifecycle.w0 viewModel) {
        kotlin.jvm.internal.f0.p(cachedIn, "$this$cachedIn");
        kotlin.jvm.internal.f0.p(viewModel, "viewModel");
        return FlowLiveDataConversions.f(CachedPagingDataKt.a(FlowLiveDataConversions.a(cachedIn), androidx.lifecycle.x0.a(viewModel)), null, 0L, 3, null);
    }

    @dl.d
    public static final <T> LiveData<o0<T>> c(@dl.d LiveData<o0<T>> cachedIn, @dl.d kotlinx.coroutines.q0 scope) {
        kotlin.jvm.internal.f0.p(cachedIn, "$this$cachedIn");
        kotlin.jvm.internal.f0.p(scope, "scope");
        return FlowLiveDataConversions.f(CachedPagingDataKt.a(FlowLiveDataConversions.a(cachedIn), scope), null, 0L, 3, null);
    }

    @dl.d
    public static final <Key, Value> LiveData<o0<Value>> d(@dl.d Pager<Key, Value> liveData) {
        kotlin.jvm.internal.f0.p(liveData, "$this$liveData");
        return FlowLiveDataConversions.f(liveData.a(), null, 0L, 3, null);
    }
}
