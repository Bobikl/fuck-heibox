package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class MatchesFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MatchesFragment f88013b;

    @i1
    public MatchesFragment_ViewBinding(MatchesFragment matchesFragment, View view) {
        this.f88013b = matchesFragment;
        matchesFragment.mRvList = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_matches_list, "field 'mRvList'", RecyclerView.class);
        matchesFragment.mSmartRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl_matches_list_wrapper, "field 'mSmartRefreshLayout'", SmartRefreshLayout.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38164, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MatchesFragment matchesFragment = this.f88013b;
        if (matchesFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88013b = null;
        matchesFragment.mRvList = null;
        matchesFragment.mSmartRefreshLayout = null;
    }
}
