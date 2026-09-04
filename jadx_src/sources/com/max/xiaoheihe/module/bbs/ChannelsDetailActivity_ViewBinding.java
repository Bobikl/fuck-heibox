package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.post.FloatingPostButton;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class ChannelsDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChannelsDetailActivity f79653b;

    @i1
    public ChannelsDetailActivity_ViewBinding(ChannelsDetailActivity channelsDetailActivity) {
        this(channelsDetailActivity, channelsDetailActivity.getWindow().getDecorView());
    }

    @i1
    public ChannelsDetailActivity_ViewBinding(ChannelsDetailActivity channelsDetailActivity, View view) {
        this.f79653b = channelsDetailActivity;
        channelsDetailActivity.mAppBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'mAppBarLayout'", AppBarLayout.class);
        channelsDetailActivity.mHeaderView = butterknife.internal.f.e(view, R.id.vg_header, "field 'mHeaderView'");
        channelsDetailActivity.mStatusBar = butterknife.internal.f.e(view, R.id.status_bar, "field 'mStatusBar'");
        channelsDetailActivity.mToolbar = (TitleBar) butterknife.internal.f.f(view, R.id.toolbar, "field 'mToolbar'", TitleBar.class);
        channelsDetailActivity.mTabLayout = (HeyBoxTabLayout) butterknife.internal.f.f(view, R.id.tl, "field 'mTabLayout'", HeyBoxTabLayout.class);
        channelsDetailActivity.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
        channelsDetailActivity.mFullscreenVideoContainerView = (FrameLayout) butterknife.internal.f.f(view, R.id.vg_fullscreen_video_container, "field 'mFullscreenVideoContainerView'", FrameLayout.class);
        channelsDetailActivity.vg_post = (FloatingPostButton) butterknife.internal.f.f(view, R.id.vg_post, "field 'vg_post'", FloatingPostButton.class);
        channelsDetailActivity.v_top_header_bg = butterknife.internal.f.e(view, R.id.v_top_header_bg, "field 'v_top_header_bg'");
        channelsDetailActivity.vg_title = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_title, "field 'vg_title'", ViewGroup.class);
        channelsDetailActivity.rv_mini_program = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_mini_program, "field 'rv_mini_program'", RecyclerView.class);
        channelsDetailActivity.vg_tab = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_tab, "field 'vg_tab'", ViewGroup.class);
        channelsDetailActivity.vg_tab_container = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_tab_container, "field 'vg_tab_container'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25945, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ChannelsDetailActivity channelsDetailActivity = this.f79653b;
        if (channelsDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79653b = null;
        channelsDetailActivity.mAppBarLayout = null;
        channelsDetailActivity.mHeaderView = null;
        channelsDetailActivity.mStatusBar = null;
        channelsDetailActivity.mToolbar = null;
        channelsDetailActivity.mTabLayout = null;
        channelsDetailActivity.mViewPager = null;
        channelsDetailActivity.mFullscreenVideoContainerView = null;
        channelsDetailActivity.vg_post = null;
        channelsDetailActivity.v_top_header_bg = null;
        channelsDetailActivity.vg_title = null;
        channelsDetailActivity.rv_mini_program = null;
        channelsDetailActivity.vg_tab = null;
        channelsDetailActivity.vg_tab_container = null;
    }
}
