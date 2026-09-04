package com.max.xiaoheihe.module.bbs;

import android.view.View;
import androidx.annotation.i1;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes10.dex */
public class HashtagDetailContentFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashtagDetailContentFragment f79914b;

    @i1
    public HashtagDetailContentFragment_ViewBinding(HashtagDetailContentFragment hashtagDetailContentFragment, View view) {
        this.f79914b = hashtagDetailContentFragment;
        hashtagDetailContentFragment.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        hashtagDetailContentFragment.mRecyclerView = (RecyclerView) butterknife.internal.f.f(view, R.id.rv, "field 'mRecyclerView'", RecyclerView.class);
        hashtagDetailContentFragment.mBanner = (BannerViewPager) butterknife.internal.f.f(view, R.id.banner, "field 'mBanner'", BannerViewPager.class);
        hashtagDetailContentFragment.vgBanner = butterknife.internal.f.e(view, R.id.vg_banner, "field 'vgBanner'");
        hashtagDetailContentFragment.vWaterfallBgTop = butterknife.internal.f.e(view, R.id.v_waterfall_bg_top, "field 'vWaterfallBgTop'");
        hashtagDetailContentFragment.vWaterfallBg = butterknife.internal.f.e(view, R.id.v_waterfall_bg, "field 'vWaterfallBg'");
        hashtagDetailContentFragment.vSpaceWaterfall = butterknife.internal.f.e(view, R.id.v_space_waterfall, "field 'vSpaceWaterfall'");
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26542, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        HashtagDetailContentFragment hashtagDetailContentFragment = this.f79914b;
        if (hashtagDetailContentFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f79914b = null;
        hashtagDetailContentFragment.mRefreshLayout = null;
        hashtagDetailContentFragment.mRecyclerView = null;
        hashtagDetailContentFragment.mBanner = null;
        hashtagDetailContentFragment.vgBanner = null;
        hashtagDetailContentFragment.vWaterfallBgTop = null;
        hashtagDetailContentFragment.vWaterfallBg = null;
        hashtagDetailContentFragment.vSpaceWaterfall = null;
    }
}
