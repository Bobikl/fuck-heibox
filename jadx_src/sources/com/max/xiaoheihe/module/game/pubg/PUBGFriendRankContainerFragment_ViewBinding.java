package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGFriendRankContainerFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGFriendRankContainerFragment f88076b;

    @i1
    public PUBGFriendRankContainerFragment_ViewBinding(PUBGFriendRankContainerFragment pUBGFriendRankContainerFragment, View view) {
        this.f88076b = pUBGFriendRankContainerFragment;
        pUBGFriendRankContainerFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
        pUBGFriendRankContainerFragment.tabCategory = (SlidingTabLayout) butterknife.internal.f.f(view, R.id.tab_title, "field 'tabCategory'", SlidingTabLayout.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38249, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGFriendRankContainerFragment pUBGFriendRankContainerFragment = this.f88076b;
        if (pUBGFriendRankContainerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88076b = null;
        pUBGFriendRankContainerFragment.mViewPager = null;
        pUBGFriendRankContainerFragment.tabCategory = null;
    }
}
