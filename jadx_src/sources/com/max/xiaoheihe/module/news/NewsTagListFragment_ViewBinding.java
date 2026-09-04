package com.max.xiaoheihe.module.news;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes12.dex */
public class NewsTagListFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private NewsTagListFragment f91252b;

    @i1
    public NewsTagListFragment_ViewBinding(NewsTagListFragment newsTagListFragment, View view) {
        this.f91252b = newsTagListFragment;
        newsTagListFragment.tabNewsTag = (HeyBoxTabLayout) butterknife.internal.f.f(view, R.id.tab_news_tag, "field 'tabNewsTag'", HeyBoxTabLayout.class);
        newsTagListFragment.vpNewsTag = (ViewPager) butterknife.internal.f.f(view, R.id.vp_news_tag, "field 'vpNewsTag'", ViewPager.class);
        newsTagListFragment.vg_setting = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_setting, "field 'vg_setting'", ViewGroup.class);
        newsTagListFragment.v_divider = butterknife.internal.f.e(view, R.id.v_divider, "field 'v_divider'");
        newsTagListFragment.iv_setting_point = (ImageView) butterknife.internal.f.f(view, R.id.iv_setting_point, "field 'iv_setting_point'", ImageView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42514, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        NewsTagListFragment newsTagListFragment = this.f91252b;
        if (newsTagListFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f91252b = null;
        newsTagListFragment.tabNewsTag = null;
        newsTagListFragment.vpNewsTag = null;
        newsTagListFragment.vg_setting = null;
        newsTagListFragment.v_divider = null;
        newsTagListFragment.iv_setting_point = null;
    }
}
