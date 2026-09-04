package com.max.xiaoheihe.module.game.pubg;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.base.adapter.n;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbminiprogram.NativeLittleProgramFragment;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class PUBGDetailContainerFragment extends NativeLittleProgramFragment {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f88015p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f88016q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f88017r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f88018s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f88019t;

    @BindView(R.id.ll_tab)
    SegmentFilterView tabLayout;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f88020u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList<KeyDescObj> f88021v;

    @BindView(R.id.vp_region)
    ViewPager vpRegion;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList<Fragment> f88022w = new ArrayList<>();

    public class a implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 38182, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            PUBGDetailContainerFragment.this.tabLayout.c(i10);
        }
    }

    public static Bundle J4(ArrayList<KeyDescObj> arrayList, String str, String str2, String str3, String str4, String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, str2, str3, str4, str5}, null, changeQuickRedirect, true, 38175, new Class[]{ArrayList.class, String.class, String.class, String.class, String.class, String.class}, Bundle.class);
        if (patchProxyResultProxy.isSupported) {
            return (Bundle) patchProxyResultProxy.result;
        }
        new PUBGDetailContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("region_filter", arrayList);
        bundle.putString("nickname", str);
        bundle.putString("mode", str2);
        bundle.putString("season", str3);
        bundle.putString("region", str4);
        return bundle;
    }

    private void K4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38178, new Class[0], Void.TYPE).isSupported || getArguments() == null) {
            return;
        }
        this.f88021v = (ArrayList) getArguments().getSerializable("region_filter");
        this.f88018s = getArguments().getString("nickname");
        this.f88017r = getArguments().getString("mode");
        this.f88015p = getArguments().getString("season");
        this.f88016q = getArguments().getString("region");
        this.f88020u = getArguments().getString("fpp");
        String string = getArguments().getString("player_id");
        this.f88019t = string;
        if (TextUtils.isEmpty(string)) {
            this.f88019t = this.f88018s;
        }
    }

    private void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38180, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f88021v)) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f88021v.size(); i10++) {
                this.f88022w.add(PUBGDetailFragment.h4(this.f88018s, this.f88017r, this.f88015p, this.f88020u, this.f88021v.get(i10).getKey(), this.f88019t));
                KeyDescObj keyDescObj = new KeyDescObj();
                String value = this.f88021v.get(i10).getValue();
                keyDescObj.setKey(value);
                keyDescObj.setDesc(value);
                keyDescObj.setChecked(this.f88021v.get(i10).getKey().equals(this.f88016q));
                arrayList.add(keyDescObj);
            }
            this.vpRegion.setAdapter(new n(getChildFragmentManager(), this.f88022w));
            this.vpRegion.c(new a());
            this.tabLayout.setMOnTabCheckedListener(new SegmentFilterView.a() { // from class: com.max.xiaoheihe.module.game.pubg.c
                @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
                public final void a(KeyDescObj keyDescObj2, int i11) {
                    this.f88159a.M4(keyDescObj2, i11);
                }
            });
            this.tabLayout.setData(arrayList);
            this.tabLayout.d();
        }
        showContentView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M4(KeyDescObj keyDescObj, int i10) {
        if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 38181, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.vpRegion.setCurrentItem(i10, true);
    }

    public static PUBGDetailContainerFragment N4(ArrayList<KeyDescObj> arrayList, String str, String str2, String str3, String str4, String str5, String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, str2, str3, str4, str5, str6}, null, changeQuickRedirect, true, 38174, new Class[]{ArrayList.class, String.class, String.class, String.class, String.class, String.class, String.class}, PUBGDetailContainerFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (PUBGDetailContainerFragment) patchProxyResultProxy.result;
        }
        PUBGDetailContainerFragment pUBGDetailContainerFragment = new PUBGDetailContainerFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("region_filter", arrayList);
        bundle.putString("nickname", str);
        bundle.putString("mode", str2);
        bundle.putString("season", str3);
        bundle.putString("region", str4);
        bundle.putString("fpp", str5);
        bundle.putString("player_id", str6);
        pUBGDetailContainerFragment.setArguments(bundle);
        return pUBGDetailContainerFragment;
    }

    @Override // com.max.hbminiprogram.NativeLittleProgramFragment, com.max.hbminiprogram.fragment.BaseLittleProgramFragment
    public void a4(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38176, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.a4(this.rootView, z10);
        setContentView(R.layout.fragment_pubg_detail_container);
        this.mUnBinder = ButterKnife.f(this, this.rootView);
        this.mTitleBar.setTitle(com.max.xiaoheihe.utils.d.n0(R.string.mode_statistics));
        this.mTitleBar.a0();
        this.mTitleBarDivider.setVisibility(0);
        K4();
    }

    @Override // com.max.hbminiprogram.fragment.BaseLittleProgramFragment, com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 38177, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.initData();
        L4();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 38179, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setUserVisibleHint(z10);
    }
}
