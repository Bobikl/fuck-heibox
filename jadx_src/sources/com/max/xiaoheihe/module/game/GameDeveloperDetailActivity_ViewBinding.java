package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameDeveloperDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameDeveloperDetailActivity f84439b;

    @androidx.annotation.i1
    public GameDeveloperDetailActivity_ViewBinding(GameDeveloperDetailActivity gameDeveloperDetailActivity) {
        this(gameDeveloperDetailActivity, gameDeveloperDetailActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameDeveloperDetailActivity_ViewBinding(GameDeveloperDetailActivity gameDeveloperDetailActivity, View view) {
        this.f84439b = gameDeveloperDetailActivity;
        gameDeveloperDetailActivity.mAppBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'mAppBarLayout'", AppBarLayout.class);
        gameDeveloperDetailActivity.mCollapsingToolbarLayout = (CollapsingToolbarLayout) butterknife.internal.f.f(view, R.id.ctl, "field 'mCollapsingToolbarLayout'", CollapsingToolbarLayout.class);
        gameDeveloperDetailActivity.mToolbar = (TitleBar) butterknife.internal.f.f(view, R.id.toolbar, "field 'mToolbar'", TitleBar.class);
        gameDeveloperDetailActivity.mHeaderContainerView = butterknife.internal.f.e(view, R.id.vg_header_container, "field 'mHeaderContainerView'");
        gameDeveloperDetailActivity.mBGImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_img, "field 'mBGImageView'", ImageView.class);
        gameDeveloperDetailActivity.mImgImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_img, "field 'mImgImageView'", ImageView.class);
        gameDeveloperDetailActivity.mNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_name, "field 'mNameTextView'", TextView.class);
        gameDeveloperDetailActivity.mDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_desc, "field 'mDescTextView'", TextView.class);
        gameDeveloperDetailActivity.mFollowStateTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_follow_state, "field 'mFollowStateTextView'", TextView.class);
        gameDeveloperDetailActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameDeveloperDetailActivity.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33030, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameDeveloperDetailActivity gameDeveloperDetailActivity = this.f84439b;
        if (gameDeveloperDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84439b = null;
        gameDeveloperDetailActivity.mAppBarLayout = null;
        gameDeveloperDetailActivity.mCollapsingToolbarLayout = null;
        gameDeveloperDetailActivity.mToolbar = null;
        gameDeveloperDetailActivity.mHeaderContainerView = null;
        gameDeveloperDetailActivity.mBGImageView = null;
        gameDeveloperDetailActivity.mImgImageView = null;
        gameDeveloperDetailActivity.mNameTextView = null;
        gameDeveloperDetailActivity.mDescTextView = null;
        gameDeveloperDetailActivity.mFollowStateTextView = null;
        gameDeveloperDetailActivity.mRefreshLayout = null;
        gameDeveloperDetailActivity.mRecyclerView = null;
    }
}
