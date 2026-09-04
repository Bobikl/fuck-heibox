package com.max.xiaoheihe.module.news;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes12.dex */
public class CommunityRecommendFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CommunityRecommendFragment f91139b;

    @i1
    public CommunityRecommendFragment_ViewBinding(CommunityRecommendFragment communityRecommendFragment, View view) {
        this.f91139b = communityRecommendFragment;
        communityRecommendFragment.mBanner = (BannerViewPager) butterknife.internal.f.f(view, R.id.banner, "field 'mBanner'", BannerViewPager.class);
        communityRecommendFragment.rv_topic = (RecyclerView) butterknife.internal.f.f(view, R.id.rv_topic, "field 'rv_topic'", RecyclerView.class);
        communityRecommendFragment.vp = (ViewPager) butterknife.internal.f.f(view, R.id.vp, "field 'vp'", ViewPager.class);
        communityRecommendFragment.vg_update_tips = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_update_tips, "field 'vg_update_tips'", ViewGroup.class);
        communityRecommendFragment.mWritePostImageView = butterknife.internal.f.e(view, R.id.fb_write_post, "field 'mWritePostImageView'");
        communityRecommendFragment.vg_recommend_header = (LinearLayout) butterknife.internal.f.f(view, R.id.vg_recommend_header, "field 'vg_recommend_header'", LinearLayout.class);
        communityRecommendFragment.appBarLayout = (AppBarLayout) butterknife.internal.f.f(view, R.id.appBarLayout, "field 'appBarLayout'", AppBarLayout.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 42329, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CommunityRecommendFragment communityRecommendFragment = this.f91139b;
        if (communityRecommendFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f91139b = null;
        communityRecommendFragment.mBanner = null;
        communityRecommendFragment.rv_topic = null;
        communityRecommendFragment.vp = null;
        communityRecommendFragment.vg_update_tips = null;
        communityRecommendFragment.mWritePostImageView = null;
        communityRecommendFragment.vg_recommend_header = null;
        communityRecommendFragment.appBarLayout = null;
    }
}
