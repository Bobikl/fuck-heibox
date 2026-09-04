package com.max.xiaoheihe.module.bbs;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: ChannelsNewsAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public class d extends com.max.xiaoheihe.module.news.adapter.a {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f81161k = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final WeakReference<RecyclerView> f81162j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@dl.d Context context, @dl.d List<? extends FeedsContentBaseObj> dataList, @dl.d com.max.xiaoheihe.module.news.adapter.a.b listener, @dl.d RecyclerView recyclerView) {
        super(context, dataList, listener);
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(dataList, "dataList");
        kotlin.jvm.internal.f0.p(listener, "listener");
        kotlin.jvm.internal.f0.p(recyclerView, "recyclerView");
        this.f81162j = new WeakReference<>(recyclerView);
    }

    @dl.d
    public final WeakReference<RecyclerView> r() {
        return this.f81162j;
    }
}
