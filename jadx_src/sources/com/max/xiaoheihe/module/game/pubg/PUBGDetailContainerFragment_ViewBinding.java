package com.max.xiaoheihe.module.game.pubg;

import android.view.View;
import androidx.annotation.i;
import androidx.annotation.i1;
import androidx.viewpager.widget.ViewPager;
import butterknife.Unbinder;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGDetailContainerFragment_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PUBGDetailContainerFragment f88024b;

    @i1
    public PUBGDetailContainerFragment_ViewBinding(PUBGDetailContainerFragment pUBGDetailContainerFragment, View view) {
        this.f88024b = pUBGDetailContainerFragment;
        pUBGDetailContainerFragment.vpRegion = (ViewPager) butterknife.internal.f.f(view, R.id.vp_region, "field 'vpRegion'", ViewPager.class);
        pUBGDetailContainerFragment.tabLayout = (SegmentFilterView) butterknife.internal.f.f(view, R.id.ll_tab, "field 'tabLayout'", SegmentFilterView.class);
    }

    @Override // butterknife.Unbinder
    @i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38183, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PUBGDetailContainerFragment pUBGDetailContainerFragment = this.f88024b;
        if (pUBGDetailContainerFragment == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f88024b = null;
        pUBGDetailContainerFragment.vpRegion = null;
        pUBGDetailContainerFragment.tabLayout = null;
    }
}
