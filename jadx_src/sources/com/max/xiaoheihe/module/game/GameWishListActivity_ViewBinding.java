package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameWishListActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameWishListActivity f85280b;

    @androidx.annotation.i1
    public GameWishListActivity_ViewBinding(GameWishListActivity gameWishListActivity) {
        this(gameWishListActivity, gameWishListActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameWishListActivity_ViewBinding(GameWishListActivity gameWishListActivity, View view) {
        this.f85280b = gameWishListActivity;
        gameWishListActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameWishListActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34842, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameWishListActivity gameWishListActivity = this.f85280b;
        if (gameWishListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85280b = null;
        gameWishListActivity.mRefreshLayout = null;
        gameWishListActivity.mRecyclerView = null;
    }
}
