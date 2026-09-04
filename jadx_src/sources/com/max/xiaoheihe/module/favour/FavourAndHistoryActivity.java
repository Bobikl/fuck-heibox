package com.max.xiaoheihe.module.favour;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.specificsearch.UserCenteredSearchActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nFavourAndHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourAndHistoryActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAndHistoryActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,248:1\n168#2,2:249\n168#2,2:251\n*S KotlinDebug\n*F\n+ 1 FavourAndHistoryActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAndHistoryActivity\n*L\n145#1:249,2\n212#1:251,2\n*E\n"})
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.c.class}, path = {lb.d.F1, lb.d.f131290y1})
@com.max.hbcommon.analytics.m(path = lb.d.J1)
@o(parameters = 0)
public final class FavourAndHistoryActivity extends BaseActivity implements k {
    public static final int Q = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    public ViewPagerFixed L;
    public SlidingTabLayout M;
    public androidx.viewpager.widget.a N;
    private int O;
    private boolean P;

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class a extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 1;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31674, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : new FavourCollectionPageFragment();
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            return "收藏";
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31675, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.analytics.d.d("4", lb.d.B1, null, null);
            UserCenteredSearchActivity.a aVar = UserCenteredSearchActivity.P;
            Activity mContext = ((BaseActivity) FavourAndHistoryActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.z0(aVar.a(mContext));
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class c extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        c(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 1;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31676, new Class[]{Integer.TYPE}, Fragment.class);
            return patchProxyResultProxy.isSupported ? (Fragment) patchProxyResultProxy.result : new m();
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            return "历史浏览";
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class d extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f83653b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FavourAndHistoryActivity f83654c;

            a(m mVar, FavourAndHistoryActivity favourAndHistoryActivity) {
                this.f83653b = mVar;
                this.f83654c = favourAndHistoryActivity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31678, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                m mVar = this.f83653b;
                mVar.Z(true ^ mVar.R0());
                this.f83653b.O3();
                this.f83654c.W1();
            }
        }

        d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31677, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = FavourAndHistoryActivity.this.O1().instantiateItem((ViewGroup) FavourAndHistoryActivity.this.R1(), i10);
            m mVar = objInstantiateItem instanceof m ? (m) objInstantiateItem : null;
            if (mVar != null) {
                if (mVar.R0()) {
                    ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setAction("完成");
                } else {
                    ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setAction("管理");
                }
                ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setActionOnClickListener(new a(mVar, FavourAndHistoryActivity.this));
                return;
            }
            com.max.heybox.hblog.g.f74531b.v("[FavourAndHistoryActivity][initSingleVisitedHistoryPage]\nno visitedHistoryFragment found for " + i10);
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31679, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Object objInstantiateItem = FavourAndHistoryActivity.this.O1().instantiateItem((ViewGroup) FavourAndHistoryActivity.this.R1(), 0);
            m mVar = objInstantiateItem instanceof m ? (m) objInstantiateItem : null;
            if (mVar == null) {
                com.max.heybox.hblog.g.f74531b.v("[FavourAndHistoryActivity][initSingleVisitedHistoryPage] no visitedHistoryFragment found");
                return;
            }
            mVar.Z(true ^ mVar.R0());
            mVar.O3();
            FavourAndHistoryActivity.this.W1();
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31680, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            UserCenteredSearchActivity.a aVar = UserCenteredSearchActivity.P;
            Activity mContext = ((BaseActivity) FavourAndHistoryActivity.this).f66601b;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.z0(aVar.b(mContext));
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    public static final class g extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        g(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31681, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            return i10 == 0 ? new i() : new m();
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            return i10 == 0 ? "收藏" : "历史浏览";
        }
    }

    /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
    @t0({"SMAP\nFavourAndHistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FavourAndHistoryActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAndHistoryActivity$installViews$2\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,248:1\n168#2,2:249\n*S KotlinDebug\n*F\n+ 1 FavourAndHistoryActivity.kt\ncom/max/xiaoheihe/module/favour/FavourAndHistoryActivity$installViews$2\n*L\n107#1:249,2\n*E\n"})
    public static final class h extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f83658b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FavourAndHistoryActivity f83659c;

            a(m mVar, FavourAndHistoryActivity favourAndHistoryActivity) {
                this.f83658b = mVar;
                this.f83659c = favourAndHistoryActivity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31683, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                m mVar = this.f83658b;
                mVar.Z(true ^ mVar.R0());
                this.f83658b.O3();
                this.f83659c.W1();
            }
        }

        /* JADX INFO: compiled from: FavourAndHistoryActivity.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FavourAndHistoryActivity f83660b;

            b(FavourAndHistoryActivity favourAndHistoryActivity) {
                this.f83660b = favourAndHistoryActivity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 31684, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                UserCenteredSearchActivity.a aVar = UserCenteredSearchActivity.P;
                Activity mContext = ((BaseActivity) this.f83660b).f66601b;
                f0.o(mContext, "mContext");
                com.max.xiaoheihe.base.router.b.z0(aVar.b(mContext));
            }
        }

        h() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31682, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (i10 == 0) {
                ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setAction((CharSequence) null);
                ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setActionIcon((Drawable) null);
                return;
            }
            Object objInstantiateItem = FavourAndHistoryActivity.this.O1().instantiateItem((ViewGroup) FavourAndHistoryActivity.this.R1(), 1);
            f0.n(objInstantiateItem, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.VisitedHistoryFragment");
            m mVar = (m) objInstantiateItem;
            if (mVar.R0()) {
                ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setAction("完成");
            } else {
                ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setAction("管理");
            }
            ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setActionOnClickListener(new a(mVar, FavourAndHistoryActivity.this));
            if (ad.a.a(ad.a.D, false)) {
                return;
            }
            ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setActionIcon(R.drawable.common_search_line_24x24);
            ImageView appbarActionButtonView = ((BaseActivity) FavourAndHistoryActivity.this).f66616q.getAppbarActionButtonView();
            if (appbarActionButtonView != null) {
                FavourAndHistoryActivity favourAndHistoryActivity = FavourAndHistoryActivity.this;
                appbarActionButtonView.setColorFilter(((BaseActivity) favourAndHistoryActivity).f66601b.getColor(R.color.brand_color));
                appbarActionButtonView.setPadding(ViewUtils.f(((BaseActivity) favourAndHistoryActivity).f66601b, 34.0f), ViewUtils.f(((BaseActivity) favourAndHistoryActivity).f66601b, 12.0f), ViewUtils.f(((BaseActivity) favourAndHistoryActivity).f66601b, 2.0f), ViewUtils.f(((BaseActivity) favourAndHistoryActivity).f66601b, 12.0f));
            }
            ((BaseActivity) FavourAndHistoryActivity.this).f66616q.setActionIconOnClickListener(new b(FavourAndHistoryActivity.this));
        }
    }

    private final void T1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31670, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("收藏");
        X1(new a(getSupportFragmentManager()));
        R1().setAdapter(O1());
        this.f66616q.setActionIcon(R.drawable.common_search_line_24x24);
        ImageView appbarActionButtonView = this.f66616q.getAppbarActionButtonView();
        if (appbarActionButtonView != null) {
            appbarActionButtonView.setColorFilter(this.f66601b.getColor(R.color.brand_color));
            appbarActionButtonView.setPadding(ViewUtils.f(this.f66601b, 24.0f), ViewUtils.f(this.f66601b, 12.0f), ViewUtils.f(this.f66601b, 12.0f), ViewUtils.f(this.f66601b, 12.0f));
        }
        this.f66616q.setActionIconOnClickListener(new b());
    }

    private final void V1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31671, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f66616q.setTitle("历史浏览");
        X1(new c(getSupportFragmentManager()));
        R1().setAdapter(O1());
        R1().c(new d());
        this.f66616q.setAction("管理");
        this.f66616q.setActionOnClickListener(new e());
        if (!ad.a.a(ad.a.D, false)) {
            this.f66616q.setActionIcon(R.drawable.common_search_line_24x24);
            ImageView appbarActionButtonView = this.f66616q.getAppbarActionButtonView();
            if (appbarActionButtonView != null) {
                appbarActionButtonView.setColorFilter(this.f66601b.getColor(R.color.brand_color));
                appbarActionButtonView.setPadding(ViewUtils.f(this.f66601b, 34.0f), ViewUtils.f(this.f66601b, 12.0f), ViewUtils.f(this.f66601b, 2.0f), ViewUtils.f(this.f66601b, 12.0f));
            }
            this.f66616q.setActionIconOnClickListener(new f());
        }
        R1().setCurrentItem(0);
    }

    @Override // com.max.xiaoheihe.module.favour.k
    public void M() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31673, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        W1();
    }

    @dl.d
    public final androidx.viewpager.widget.a O1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31667, new Class[0], androidx.viewpager.widget.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (androidx.viewpager.widget.a) patchProxyResultProxy.result;
        }
        androidx.viewpager.widget.a aVar = this.N;
        if (aVar != null) {
            return aVar;
        }
        f0.S("mPagerAdapter");
        return null;
    }

    @dl.d
    public final SlidingTabLayout Q1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31665, new Class[0], SlidingTabLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SlidingTabLayout) patchProxyResultProxy.result;
        }
        SlidingTabLayout slidingTabLayout = this.M;
        if (slidingTabLayout != null) {
            return slidingTabLayout;
        }
        f0.S("mSlidingTabLayout");
        return null;
    }

    @dl.d
    public final ViewPagerFixed R1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31663, new Class[0], ViewPagerFixed.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewPagerFixed) patchProxyResultProxy.result;
        }
        ViewPagerFixed viewPagerFixed = this.L;
        if (viewPagerFixed != null) {
            return viewPagerFixed;
        }
        f0.S("mViewPager");
        return null;
    }

    public final void W1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31672, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Object objInstantiateItem = O1().instantiateItem((ViewGroup) R1(), !this.P ? 1 : 0);
        f0.n(objInstantiateItem, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.VisitedHistoryFragment");
        if (((m) objInstantiateItem).R0()) {
            this.f66616q.setAction("完成");
        } else {
            this.f66616q.setAction("管理");
        }
    }

    public final void X1(@dl.d androidx.viewpager.widget.a aVar) {
        if (PatchProxy.proxy(new Object[]{aVar}, this, changeQuickRedirect, false, 31668, new Class[]{androidx.viewpager.widget.a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(aVar, "<set-?>");
        this.N = aVar;
    }

    public final void Y1(@dl.d SlidingTabLayout slidingTabLayout) {
        if (PatchProxy.proxy(new Object[]{slidingTabLayout}, this, changeQuickRedirect, false, 31666, new Class[]{SlidingTabLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(slidingTabLayout, "<set-?>");
        this.M = slidingTabLayout;
    }

    public final void Z1(@dl.d ViewPagerFixed viewPagerFixed) {
        if (PatchProxy.proxy(new Object[]{viewPagerFixed}, this, changeQuickRedirect, false, 31664, new Class[]{ViewPagerFixed.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewPagerFixed, "<set-?>");
        this.L = viewPagerFixed;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 31669, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_sample_vp);
        this.O = getIntent().getIntExtra("prefer_page", 0);
        View viewFindViewById = Z0().findViewById(R.id.vp);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.vp)");
        Z1((ViewPagerFixed) viewFindViewById);
        this.f66616q.a0();
        if (ad.a.b(ad.a.E, false, 2, null)) {
            R1().setCanScroll(false);
            this.P = true;
            if (this.O == 0) {
                T1();
                return;
            } else {
                V1();
                return;
            }
        }
        SlidingTabLayout titleTabLayout = this.f66616q.getTitleTabLayout();
        f0.o(titleTabLayout, "mTitleBar.titleTabLayout");
        Y1(titleTabLayout);
        X1(new g(getSupportFragmentManager()));
        R1().setAdapter(O1());
        Q1().setViewPager(R1());
        R1().c(new h());
        R1().setCurrentItem(this.O);
    }
}
