package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.component.TitleBar;
import com.max.hbminiprogram.h;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TradeDealFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class c extends com.max.xiaoheihe.module.littleprogram.fragment.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    public static final a f93330g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f93331h = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private ViewPager f93332c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SlidingTabLayout f93333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private androidx.viewpager.widget.a f93334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private TradeMsgBroadcastReceiver f93335f;

    /* JADX INFO: compiled from: TradeDealFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final c a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45034, new Class[0], c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new c();
        }
    }

    /* JADX INFO: compiled from: TradeDealFragment.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45035, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return i10 == 0 ? ItemInventoryFragment.V.e(true) : ItemWaitDeliverFragment.a.b(ItemWaitDeliverFragment.f92565m, false, 1, null);
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            return i10 == 0 ? "已上架" : "待发货";
        }
    }

    public final void J() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45032, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f93334e;
        f0.m(aVar);
        ViewPager viewPager = this.f93332c;
        f0.m(viewPager);
        ViewPager viewPager2 = this.f93332c;
        f0.m(viewPager2);
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager2.getCurrentItem());
        f0.o(objInstantiateItem, "mPagerAdapter!!.instanti…mViewPager!!.currentItem)");
        if (objInstantiateItem instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) objInstantiateItem).J();
        }
    }

    public final void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45029, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f93334e;
        f0.m(aVar);
        ViewPager viewPager = this.f93332c;
        f0.m(viewPager);
        ViewPager viewPager2 = this.f93332c;
        f0.m(viewPager2);
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager2.getCurrentItem());
        f0.o(objInstantiateItem, "mPagerAdapter!!.instanti…mViewPager!!.currentItem)");
        if (objInstantiateItem instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) objInstantiateItem).L();
        }
    }

    public final void L3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45033, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ViewPager viewPager = this.f93332c;
        if (viewPager != null) {
            viewPager.setCurrentItem(0);
        }
        androidx.viewpager.widget.a aVar = this.f93334e;
        f0.m(aVar);
        ViewPager viewPager2 = this.f93332c;
        f0.m(viewPager2);
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager2, 0);
        f0.o(objInstantiateItem, "mPagerAdapter!!.instantiateItem(mViewPager!!, 0)");
        if (objInstantiateItem instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) objInstantiateItem).I4();
        }
    }

    @dl.d
    public final SlidingTabLayout M3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45024, new Class[0], SlidingTabLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SlidingTabLayout) patchProxyResultProxy.result;
        }
        SlidingTabLayout slidingTabLayout = this.f93333d;
        if (slidingTabLayout != null) {
            return slidingTabLayout;
        }
        f0.S("mSlidingTabLayout");
        return null;
    }

    @dl.e
    public final ViewPager N3() {
        return this.f93332c;
    }

    public final void O3(@dl.d SlidingTabLayout slidingTabLayout) {
        if (PatchProxy.proxy(new Object[]{slidingTabLayout}, this, changeQuickRedirect, false, 45025, new Class[]{SlidingTabLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(slidingTabLayout, "<set-?>");
        this.f93333d = slidingTabLayout;
    }

    public final void P3(@dl.e ViewPager viewPager) {
        this.f93332c = viewPager;
    }

    public final void d0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45030, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f93334e;
        f0.m(aVar);
        ViewPager viewPager = this.f93332c;
        f0.m(viewPager);
        ViewPager viewPager2 = this.f93332c;
        f0.m(viewPager2);
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager2.getCurrentItem());
        f0.o(objInstantiateItem, "mPagerAdapter!!.instanti…mViewPager!!.currentItem)");
        if (objInstantiateItem instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) objInstantiateItem).d0();
        }
    }

    public final void h1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45031, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f93334e;
        f0.m(aVar);
        ViewPager viewPager = this.f93332c;
        f0.m(viewPager);
        ViewPager viewPager2 = this.f93332c;
        f0.m(viewPager2);
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager2.getCurrentItem());
        f0.o(objInstantiateItem, "mPagerAdapter!!.instanti…mViewPager!!.currentItem)");
        if (objInstantiateItem instanceof ItemInventoryFragment) {
            ((ItemInventoryFragment) objInstantiateItem).h1();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45026, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.layout_sample_vp);
        t.c(t.n(this.mContext), (ViewGroup) rootView, null);
        this.f93332c = (ViewPager) rootView.findViewById(R.id.vp);
        if (getContext() instanceof h) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            TitleBar mTitleBar = this.mTitleBar;
            f0.o(mTitleBar, "mTitleBar");
            TradeInfoUtilKt.H(mContext, mTitleBar, "");
        } else {
            this.mTitleBar.a0();
            Activity mContext2 = this.mContext;
            f0.o(mContext2, "mContext");
            TitleBar mTitleBar2 = this.mTitleBar;
            f0.o(mTitleBar2, "mTitleBar");
            TradeInfoUtilKt.I(mContext2, mTitleBar2);
        }
        SlidingTabLayout titleTabLayout = this.mTitleBar.getTitleTabLayout();
        f0.o(titleTabLayout, "mTitleBar.titleTabLayout");
        O3(titleTabLayout);
        this.f93334e = new b(getChildFragmentManager());
        ViewPager viewPager = this.f93332c;
        f0.m(viewPager);
        viewPager.setAdapter(this.f93334e);
        M3().setViewPager(this.f93332c);
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45027, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        TitleBar mTitleBar = this.mTitleBar;
        f0.o(mTitleBar, "mTitleBar");
        TradeMsgBroadcastReceiver tradeMsgBroadcastReceiver = new TradeMsgBroadcastReceiver(mTitleBar, getContext() instanceof h);
        this.f93335f = tradeMsgBroadcastReceiver;
        registerReceiver(tradeMsgBroadcastReceiver, lb.a.N);
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45028, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.f93335f);
    }
}
