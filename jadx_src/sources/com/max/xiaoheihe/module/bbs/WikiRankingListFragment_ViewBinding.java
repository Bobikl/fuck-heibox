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
public class WikiRankingListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WikiRankingListFragment f80233b;

    @i1
    public WikiRankingListFragment_ViewBinding(WikiRankingListFragment wikiRankingListFragment, View view) {
        this.f80233b = wikiRankingListFragment;
        wikiRankingListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        wikiRankingListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        wikiRankingListFragment.v_scroll_container_divier = butterknife.internal.f.e(view, R.id.v_scroll_container_divier, "field 'v_scroll_container_divier'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27146, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        WikiRankingListFragment wikiRankingListFragment = this.f80233b;
        if (wikiRankingListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80233b = null;
        wikiRankingListFragment.mRefreshLayout = null;
        wikiRankingListFragment.mRecyclerView = null;
        wikiRankingListFragment.v_scroll_container_divier = null;
    }
}
