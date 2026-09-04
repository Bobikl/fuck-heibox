package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameDeveloperListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameDeveloperListFragment f84449b;

    @androidx.annotation.i1
    public GameDeveloperListFragment_ViewBinding(GameDeveloperListFragment gameDeveloperListFragment, View view) {
        this.f84449b = gameDeveloperListFragment;
        gameDeveloperListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameDeveloperListFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33050, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameDeveloperListFragment gameDeveloperListFragment = this.f84449b;
        if (gameDeveloperListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84449b = null;
        gameDeveloperListFragment.mRefreshLayout = null;
        gameDeveloperListFragment.mRecyclerView = null;
    }
}
