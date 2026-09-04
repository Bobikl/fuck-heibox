package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameListActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameListActivity f84490b;

    @androidx.annotation.i1
    public GameListActivity_ViewBinding(GameListActivity gameListActivity) {
        this(gameListActivity, gameListActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameListActivity_ViewBinding(GameListActivity gameListActivity, View view) {
        this.f84490b = gameListActivity;
        gameListActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameListActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33215, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameListActivity gameListActivity = this.f84490b;
        if (gameListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84490b = null;
        gameListActivity.mRefreshLayout = null;
        gameListActivity.mRecyclerView = null;
    }
}
