package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameMobileRecFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameMobileRecFragment f84546b;

    @androidx.annotation.i1
    public GameMobileRecFragment_ViewBinding(GameMobileRecFragment gameMobileRecFragment, View view) {
        this.f84546b = gameMobileRecFragment;
        gameMobileRecFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameMobileRecFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33295, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameMobileRecFragment gameMobileRecFragment = this.f84546b;
        if (gameMobileRecFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84546b = null;
        gameMobileRecFragment.mRefreshLayout = null;
        gameMobileRecFragment.mRecyclerView = null;
    }
}
