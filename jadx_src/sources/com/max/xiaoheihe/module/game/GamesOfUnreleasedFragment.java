package com.max.xiaoheihe.module.game;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class GamesOfUnreleasedFragment extends com.max.hbcommon.base.d implements GameUnreleasedListFragment.g {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f85285f = "all_tab";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f85286g = "current_tab_position";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<KeyDescObj> f85287b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f85288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.viewpager.widget.a f85289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GameListObj f85290e;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34948, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : GamesOfUnreleasedFragment.this.f85287b.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34947, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : GameUnreleasedListFragment.p4();
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34949, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ((KeyDescObj) GamesOfUnreleasedFragment.this.f85287b.get(i10)).getDesc();
        }
    }

    private KeyDescObj M3(FiltersObj filtersObj) {
        List<KeyDescObj> filters;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 34945, new Class[]{FiltersObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (filtersObj == null || (filters = filtersObj.getFilters()) == null) {
            return null;
        }
        ViewPager viewPager = this.mViewPager;
        int currentItem = viewPager != null ? viewPager.getCurrentItem() : 0;
        if (currentItem < 0 || currentItem >= this.f85287b.size()) {
            return null;
        }
        KeyDescObj keyDescObj = this.f85287b.get(currentItem);
        for (KeyDescObj keyDescObj2 : filters) {
            if (keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                return keyDescObj2;
            }
        }
        return null;
    }

    public static GamesOfUnreleasedFragment N3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 34939, new Class[0], GamesOfUnreleasedFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamesOfUnreleasedFragment) patchProxyResultProxy.result;
        }
        GamesOfUnreleasedFragment gamesOfUnreleasedFragment = new GamesOfUnreleasedFragment();
        gamesOfUnreleasedFragment.setArguments(new Bundle());
        return gamesOfUnreleasedFragment;
    }

    private void O3() {
        GameListObj gameListObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34946, new Class[0], Void.TYPE).isSupported || this.f85287b.size() != 1 || (gameListObj = this.f85290e) == null || gameListObj.getFilter() == null || this.f85290e.getFilter().getFilters() == null || this.f85290e.getFilter().getFilters().size() <= 0) {
            return;
        }
        this.f85287b.remove(0);
        this.f85287b.addAll(this.f85290e.getFilter().getFilters());
        this.f85289d.notifyDataSetChanged();
        this.mTitleBar.a0();
        this.mTitleBar.setVisibility(0);
        this.mTitleBarDivider.setVisibility(0);
        SlidingTabLayout titleTabLayout = this.mTitleBar.getTitleTabLayout();
        String[] strArr = new String[this.f85287b.size()];
        for (int i10 = 0; i10 < this.f85287b.size(); i10++) {
            strArr[i10] = this.f85287b.get(i10).getDesc();
        }
        titleTabLayout.setViewPager(this.mViewPager, strArr);
        titleTabLayout.setVisibility(0);
    }

    @Override // com.max.xiaoheihe.module.game.GameUnreleasedListFragment.g
    public void c(GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameListObj}, this, changeQuickRedirect, false, 34943, new Class[]{GameListObj.class}, Void.TYPE).isSupported || gameListObj == null) {
            return;
        }
        this.f85290e = gameListObj;
        O3();
    }

    @Override // com.max.xiaoheihe.module.game.GameUnreleasedListFragment.g
    public Map<String, String> getFilter() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34944, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap(16);
        GameListObj gameListObj = this.f85290e;
        FiltersObj filter = gameListObj != null ? gameListObj.getFilter() : null;
        if (filter != null) {
            String key = filter.getKey();
            KeyDescObj keyDescObjM3 = M3(filter);
            if (keyDescObjM3 != null) {
                map.put(key, keyDescObjM3.getKey());
            }
        }
        return map;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34941, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.mUnBinder = ButterKnife.f(this, view);
        a aVar = new a(getChildFragmentManager());
        this.f85289d = aVar;
        this.mViewPager.setAdapter(aVar);
        int i10 = this.f85288c;
        if (i10 > 0) {
            this.mViewPager.setCurrentItem(i10);
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 34940, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (bundle != null) {
            if (bundle.containsKey(f85285f)) {
                this.f85287b = (ArrayList) bundle.getSerializable(f85285f);
            }
            if (bundle.containsKey(f85286g)) {
                this.f85288c = bundle.getInt(f85286g);
            }
        }
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle == null) {
            KeyDescObj keyDescObj = new KeyDescObj();
            keyDescObj.setDesc("");
            this.f85287b.add(keyDescObj);
            this.f85289d.notifyDataSetChanged();
        }
        O3();
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 34942, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        if (this.f85289d != null) {
            bundle.putSerializable(f85285f, this.f85287b);
            bundle.putInt(f85286g, this.mViewPager.getCurrentItem());
        }
    }
}
