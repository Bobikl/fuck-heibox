package com.max.xiaoheihe.module.bbs;

import android.view.View;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class HashtagRankingListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashtagRankingListFragment f79923b;

    @i1
    public HashtagRankingListFragment_ViewBinding(HashtagRankingListFragment hashtagRankingListFragment, View view) {
        this.f79923b = hashtagRankingListFragment;
        hashtagRankingListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        hashtagRankingListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        hashtagRankingListFragment.v_scroll_container_divier = butterknife.internal.f.e(view, R.id.v_scroll_container_divier, "field 'v_scroll_container_divier'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26563, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashtagRankingListFragment hashtagRankingListFragment = this.f79923b;
        if (hashtagRankingListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79923b = null;
        hashtagRankingListFragment.mRefreshLayout = null;
        hashtagRankingListFragment.mRecyclerView = null;
        hashtagRankingListFragment.v_scroll_container_divier = null;
    }
}
