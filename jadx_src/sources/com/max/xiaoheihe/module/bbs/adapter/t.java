package com.max.xiaoheihe.module.bbs.adapter;

import android.content.Context;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SearchHashtagAdapter.kt */
/* JADX INFO: loaded from: classes10.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class t extends com.max.hbcommon.base.adapter.s<HashtagObj> {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80634d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Context f80635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final a f80636c;

    /* JADX INFO: compiled from: SearchHashtagAdapter.kt */
    public interface a {
        void a(@dl.e HashtagObj hashtagObj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(@dl.d Context mContext, @dl.d List<? extends HashtagObj> dataList, @dl.d a itemClickListener) {
        super(mContext, dataList, R.layout.item_search_hashtag);
        f0.p(mContext, "mContext");
        f0.p(dataList, "dataList");
        f0.p(itemClickListener, "itemClickListener");
        this.f80635b = mContext;
        this.f80636c = itemClickListener;
    }

    public void m(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d HashtagObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 27464, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HashtagObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        new com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.b(new com.max.xiaoheihe.module.bbs.adapter.viewholderbinder.searchhashtag.a(this.f80635b, this, this.f80636c, false, 8, null)).f(viewHolder, data);
    }

    @Override // com.max.hbcommon.base.adapter.s
    public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HashtagObj hashtagObj) {
        if (PatchProxy.proxy(new Object[]{eVar, hashtagObj}, this, changeQuickRedirect, false, 27465, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        m(eVar, hashtagObj);
    }
}
