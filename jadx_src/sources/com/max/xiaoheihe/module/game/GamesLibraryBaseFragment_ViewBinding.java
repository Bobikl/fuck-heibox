package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class GamesLibraryBaseFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GamesLibraryBaseFragment f85284b;

    @androidx.annotation.i1
    public GamesLibraryBaseFragment_ViewBinding(GamesLibraryBaseFragment gamesLibraryBaseFragment, View view) {
        this.f85284b = gamesLibraryBaseFragment;
        gamesLibraryBaseFragment.mTabLayout = (SlidingTabLayout) butterknife.internal.f.f(view, R.id.tl, "field 'mTabLayout'", SlidingTabLayout.class);
        gamesLibraryBaseFragment.mDividerLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_divider, "field 'mDividerLinearLayout'", LinearLayout.class);
        gamesLibraryBaseFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34851, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GamesLibraryBaseFragment gamesLibraryBaseFragment = this.f85284b;
        if (gamesLibraryBaseFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85284b = null;
        gamesLibraryBaseFragment.mTabLayout = null;
        gamesLibraryBaseFragment.mDividerLinearLayout = null;
        gamesLibraryBaseFragment.mViewPager = null;
    }
}
