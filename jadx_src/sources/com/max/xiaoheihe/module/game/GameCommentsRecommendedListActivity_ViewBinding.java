package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameCommentsRecommendedListActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameCommentsRecommendedListActivity f84146b;

    @androidx.annotation.i1
    public GameCommentsRecommendedListActivity_ViewBinding(GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity) {
        this(gameCommentsRecommendedListActivity, gameCommentsRecommendedListActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameCommentsRecommendedListActivity_ViewBinding(GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity, View view) {
        this.f84146b = gameCommentsRecommendedListActivity;
        gameCommentsRecommendedListActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameCommentsRecommendedListActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32558, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameCommentsRecommendedListActivity gameCommentsRecommendedListActivity = this.f84146b;
        if (gameCommentsRecommendedListActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84146b = null;
        gameCommentsRecommendedListActivity.mRefreshLayout = null;
        gameCommentsRecommendedListActivity.mRecyclerView = null;
    }
}
