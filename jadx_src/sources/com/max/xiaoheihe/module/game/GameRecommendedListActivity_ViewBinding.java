package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameRecommendedListActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameRecommendedListActivity f84678b;

    @androidx.annotation.i1
    public GameRecommendedListActivity_ViewBinding(GameRecommendedListActivity gameRecommendedListActivity) {
        this(gameRecommendedListActivity, gameRecommendedListActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameRecommendedListActivity_ViewBinding(GameRecommendedListActivity gameRecommendedListActivity, View view) {
        this.f84678b = gameRecommendedListActivity;
        gameRecommendedListActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameRecommendedListActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33562, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameRecommendedListActivity gameRecommendedListActivity = this.f84678b;
        if (gameRecommendedListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84678b = null;
        gameRecommendedListActivity.mRefreshLayout = null;
        gameRecommendedListActivity.mRecyclerView = null;
    }
}
