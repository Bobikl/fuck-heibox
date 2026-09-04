package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameCompilationDetailFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameCompilationDetailFragment f84188b;

    @androidx.annotation.i1
    public GameCompilationDetailFragment_ViewBinding(GameCompilationDetailFragment gameCompilationDetailFragment, View view) {
        this.f84188b = gameCompilationDetailFragment;
        gameCompilationDetailFragment.mAppBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'mAppBarLayout'", AppBarLayout.class);
        gameCompilationDetailFragment.mCollapsingToolbarLayout = (CollapsingToolbarLayout) butterknife.internal.f.f(view, R.id.ctl, "field 'mCollapsingToolbarLayout'", CollapsingToolbarLayout.class);
        gameCompilationDetailFragment.mToolbar = (TitleBar) butterknife.internal.f.f(view, R.id.toolbar, "field 'mToolbar'", TitleBar.class);
        gameCompilationDetailFragment.mBGImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bg_img, "field 'mBGImageView'", ImageView.class);
        gameCompilationDetailFragment.mSortView = butterknife.internal.f.e(view, R.id.vg_sort, "field 'mSortView'");
        gameCompilationDetailFragment.mSortSlidingTabLayout = (SlidingTabLayout) butterknife.internal.f.f(view, R.id.tl_sort, "field 'mSortSlidingTabLayout'", SlidingTabLayout.class);
        gameCompilationDetailFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32642, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameCompilationDetailFragment gameCompilationDetailFragment = this.f84188b;
        if (gameCompilationDetailFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84188b = null;
        gameCompilationDetailFragment.mAppBarLayout = null;
        gameCompilationDetailFragment.mCollapsingToolbarLayout = null;
        gameCompilationDetailFragment.mToolbar = null;
        gameCompilationDetailFragment.mBGImageView = null;
        gameCompilationDetailFragment.mSortView = null;
        gameCompilationDetailFragment.mSortSlidingTabLayout = null;
        gameCompilationDetailFragment.mViewPager = null;
    }
}
