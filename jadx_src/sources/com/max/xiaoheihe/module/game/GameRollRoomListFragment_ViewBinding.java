package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameRollRoomListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameRollRoomListFragment f84760b;

    @androidx.annotation.i1
    public GameRollRoomListFragment_ViewBinding(GameRollRoomListFragment gameRollRoomListFragment, View view) {
        this.f84760b = gameRollRoomListFragment;
        gameRollRoomListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameRollRoomListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        gameRollRoomListFragment.mStickyLayoutHeaderView = (RelativeLayout) butterknife.internal.f.f(view, R.id.sticky_layout_header, "field 'mStickyLayoutHeaderView'", RelativeLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33690, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameRollRoomListFragment gameRollRoomListFragment = this.f84760b;
        if (gameRollRoomListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84760b = null;
        gameRollRoomListFragment.mRefreshLayout = null;
        gameRollRoomListFragment.mRecyclerView = null;
        gameRollRoomListFragment.mStickyLayoutHeaderView = null;
    }
}
