package com.max.xiaoheihe.module.game;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameReviewsFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameReviewsFragment f84686b;

    @androidx.annotation.i1
    public GameReviewsFragment_ViewBinding(GameReviewsFragment gameReviewsFragment, View view) {
        this.f84686b = gameReviewsFragment;
        gameReviewsFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameReviewsFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33570, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameReviewsFragment gameReviewsFragment = this.f84686b;
        if (gameReviewsFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84686b = null;
        gameReviewsFragment.mRefreshLayout = null;
        gameReviewsFragment.mRecyclerView = null;
    }
}
