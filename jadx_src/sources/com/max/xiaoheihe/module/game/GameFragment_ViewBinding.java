package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import com.max.hbcustomview.EZTabLayout;
import com.max.hbcustomview.viewpager.SwipeableViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GameFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameFragment f84467b;

    @androidx.annotation.i1
    public GameFragment_ViewBinding(GameFragment gameFragment, View view) {
        this.f84467b = gameFragment;
        gameFragment.mTabLayout = (EZTabLayout) butterknife.internal.f.f(view, R.id.tl_home, "field 'mTabLayout'", EZTabLayout.class);
        gameFragment.mHomeSearchImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_home_search, "field 'mHomeSearchImageView'", ImageView.class);
        gameFragment.mHomeMsgImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_home_msg, "field 'mHomeMsgImageView'", ImageView.class);
        gameFragment.mPointHomeMsgImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_point_home_msg, "field 'mPointHomeMsgImageView'", ImageView.class);
        gameFragment.mHomeMobileImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_home_mobile, "field 'mHomeMobileImageView'", ImageView.class);
        gameFragment.mPointHomeMobileImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_point_home_mobile, "field 'mPointHomeMobileImageView'", ImageView.class);
        gameFragment.mViewPager = (SwipeableViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", SwipeableViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33141, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameFragment gameFragment = this.f84467b;
        if (gameFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f84467b = null;
        gameFragment.mTabLayout = null;
        gameFragment.mHomeSearchImageView = null;
        gameFragment.mHomeMsgImageView = null;
        gameFragment.mPointHomeMsgImageView = null;
        gameFragment.mHomeMobileImageView = null;
        gameFragment.mPointHomeMobileImageView = null;
        gameFragment.mViewPager = null;
    }
}
