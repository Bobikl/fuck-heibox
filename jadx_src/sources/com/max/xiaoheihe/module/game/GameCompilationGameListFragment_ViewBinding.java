package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationGameListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameCompilationGameListFragment f84204b;

    @androidx.annotation.i1
    public GameCompilationGameListFragment_ViewBinding(GameCompilationGameListFragment gameCompilationGameListFragment, View view) {
        this.f84204b = gameCompilationGameListFragment;
        gameCompilationGameListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameCompilationGameListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32663, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameCompilationGameListFragment gameCompilationGameListFragment = this.f84204b;
        if (gameCompilationGameListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84204b = null;
        gameCompilationGameListFragment.mRefreshLayout = null;
        gameCompilationGameListFragment.mRecyclerView = null;
    }
}
