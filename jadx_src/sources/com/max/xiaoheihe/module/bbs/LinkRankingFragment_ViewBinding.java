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
public class LinkRankingFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LinkRankingFragment f80024b;

    @i1
    public LinkRankingFragment_ViewBinding(LinkRankingFragment linkRankingFragment, View view) {
        this.f80024b = linkRankingFragment;
        linkRankingFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        linkRankingFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26741, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LinkRankingFragment linkRankingFragment = this.f80024b;
        if (linkRankingFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f80024b = null;
        linkRankingFragment.mRefreshLayout = null;
        linkRankingFragment.mRecyclerView = null;
    }
}
