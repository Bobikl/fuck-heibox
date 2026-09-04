package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class PlayerLeaderboardsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PlayerLeaderboardsFragment f85369b;

    @androidx.annotation.i1
    public PlayerLeaderboardsFragment_ViewBinding(PlayerLeaderboardsFragment playerLeaderboardsFragment, View view) {
        this.f85369b = playerLeaderboardsFragment;
        playerLeaderboardsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        playerLeaderboardsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 35094, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PlayerLeaderboardsFragment playerLeaderboardsFragment = this.f85369b;
        if (playerLeaderboardsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85369b = null;
        playerLeaderboardsFragment.mRefreshLayout = null;
        playerLeaderboardsFragment.mRecyclerView = null;
    }
}
