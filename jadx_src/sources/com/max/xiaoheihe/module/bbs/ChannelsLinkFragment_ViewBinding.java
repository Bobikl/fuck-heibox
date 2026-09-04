package com.max.xiaoheihe.module.bbs;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.component.FilterButtonView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes10.dex */
public class ChannelsLinkFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ChannelsLinkFragment f79695b;

    @i1
    public ChannelsLinkFragment_ViewBinding(ChannelsLinkFragment channelsLinkFragment, View view) {
        this.f79695b = channelsLinkFragment;
        channelsLinkFragment.ll_header = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_header, "field 'll_header'", LinearLayout.class);
        channelsLinkFragment.tl = (TabLayout) butterknife.internal.f.f(view, R.id.tl, "field 'tl'", TabLayout.class);
        channelsLinkFragment.fbv_sort = (FilterButtonView) butterknife.internal.f.f(view, R.id.fbv_sort, "field 'fbv_sort'", FilterButtonView.class);
        channelsLinkFragment.vg_filter = butterknife.internal.f.e(view, R.id.vg_filter, "field 'vg_filter'");
        channelsLinkFragment.appBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.appBarLayout, "field 'appBarLayout'", AppBarLayout.class);
        channelsLinkFragment.vp = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'vp'", ViewPager.class);
        channelsLinkFragment.tab_bottom_divider = butterknife.internal.f.e(view, R.id.tab_bottom_divider, "field 'tab_bottom_divider'");
        channelsLinkFragment.vg_tab_bar = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_tab_bar, "field 'vg_tab_bar'", ViewGroup.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26015, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ChannelsLinkFragment channelsLinkFragment = this.f79695b;
        if (channelsLinkFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79695b = null;
        channelsLinkFragment.ll_header = null;
        channelsLinkFragment.tl = null;
        channelsLinkFragment.fbv_sort = null;
        channelsLinkFragment.vg_filter = null;
        channelsLinkFragment.appBarLayout = null;
        channelsLinkFragment.vp = null;
        channelsLinkFragment.tab_bottom_divider = null;
        channelsLinkFragment.vg_tab_bar = null;
    }
}
