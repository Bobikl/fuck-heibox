package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class GamesLibraryBaseFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<KeyDescObj> f85281b = new ArrayList();

    @BindView(R.id.ll_divider)
    LinearLayout mDividerLinearLayout;

    @BindView(R.id.tl)
    SlidingTabLayout mTabLayout;

    @BindView(R.id.vp)
    ViewPager mViewPager;

    public class a extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34847, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GamesLibraryBaseFragment.L3(GamesLibraryBaseFragment.this, i10);
        }
    }

    public class b extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34849, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : GamesLibraryBaseFragment.this.f85281b.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34848, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            GamesLibraryBaseFragment gamesLibraryBaseFragment = GamesLibraryBaseFragment.this;
            return gamesLibraryBaseFragment.N3(gamesLibraryBaseFragment.f85281b, i10);
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34850, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ((KeyDescObj) GamesLibraryBaseFragment.this.f85281b.get(i10)).getDesc();
        }
    }

    GamesLibraryBaseFragment() {
    }

    static /* synthetic */ void L3(GamesLibraryBaseFragment gamesLibraryBaseFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{gamesLibraryBaseFragment, new Integer(i10)}, null, changeQuickRedirect, true, 34846, new Class[]{GamesLibraryBaseFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gamesLibraryBaseFragment.P3(i10);
    }

    private void P3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34845, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int childCount = this.mDividerLinearLayout.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.mDividerLinearLayout.getChildAt(i11);
            boolean z10 = i11 == i10;
            i11++;
            boolean z11 = i11 == i10;
            if (z10 || z11) {
                childAt.setVisibility(4);
            } else {
                childAt.setVisibility(0);
            }
        }
    }

    abstract Fragment N3(List<KeyDescObj> list, int i10);

    abstract void O3(List<KeyDescObj> list);

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34844, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O3(this.f85281b);
        this.mViewPager.setOffscreenPageLimit(2);
        this.mViewPager.c(new a());
        this.mViewPager.setAdapter(new b(getChildFragmentManager()));
        this.mDividerLinearLayout.removeAllViews();
        int size = this.f85281b.size() - 1;
        int iL = (int) ((ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 30.0f)) / (this.f85281b.size() * 1.0f));
        for (int i10 = 0; i10 < size; i10++) {
            View view = new View(this.mContext);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 0.5f), -1);
            int iF = ViewUtils.f(this.mContext, 8.0f);
            layoutParams.bottomMargin = iF;
            layoutParams.topMargin = iF;
            layoutParams.leftMargin = iL;
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(getResources().getColor(R.color.divider_primary_1_color));
            this.mDividerLinearLayout.addView(view);
        }
        this.mTabLayout.setViewPager(this.mViewPager);
        P3(this.mViewPager.getCurrentItem());
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34843, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_game_library_base);
        this.mUnBinder = ButterKnife.f(this, view);
    }
}
