package com.max.xiaoheihe.module.news;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.flyco.tablayout.SlidingTabLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class ChannelListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChannelListFragment f91131b;

    @i1
    public ChannelListFragment_ViewBinding(ChannelListFragment channelListFragment, View view) {
        this.f91131b = channelListFragment;
        channelListFragment.cl_root = (CoordinatorLayout) butterknife.internal.f.f(view, R.id.cl_root, "field 'cl_root'", CoordinatorLayout.class);
        channelListFragment.mSubscribedRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_subscribed, "field 'mSubscribedRecyclerView'", RecyclerView.class);
        channelListFragment.tv_subscribed_empty_tips = (TextView) butterknife.internal.f.f(view, R.id.tv_subscribed_empty_tips, "field 'tv_subscribed_empty_tips'", TextView.class);
        channelListFragment.tv_edit = (TextView) butterknife.internal.f.f(view, R.id.tv_edit, "field 'tv_edit'", TextView.class);
        channelListFragment.mTabLayout = (SlidingTabLayout) butterknife.internal.f.f(view, R.id.tab, "field 'mTabLayout'", SlidingTabLayout.class);
        channelListFragment.mViewPager = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'mViewPager'", ViewPager.class);
        channelListFragment.vg_header = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_header, "field 'vg_header'", ViewGroup.class);
        channelListFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        channelListFragment.mAppBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.abl, "field 'mAppBarLayout'", AppBarLayout.class);
        channelListFragment.v_scroll_container_divier = butterknife.internal.f.e(view, R.id.v_scroll_container_divier, "field 'v_scroll_container_divier'");
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42308, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ChannelListFragment channelListFragment = this.f91131b;
        if (channelListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f91131b = null;
        channelListFragment.cl_root = null;
        channelListFragment.mSubscribedRecyclerView = null;
        channelListFragment.tv_subscribed_empty_tips = null;
        channelListFragment.tv_edit = null;
        channelListFragment.mTabLayout = null;
        channelListFragment.mViewPager = null;
        channelListFragment.vg_header = null;
        channelListFragment.mRefreshLayout = null;
        channelListFragment.mAppBarLayout = null;
        channelListFragment.v_scroll_container_divier = null;
    }
}
