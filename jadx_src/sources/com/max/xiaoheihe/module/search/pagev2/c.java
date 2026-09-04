package com.max.xiaoheihe.module.search.pagev2;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.max.hbcommon.bean.WikiObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbsearch.SearchNewFragment;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.bean.SearchHotwordsObj;
import com.max.hbsearch.config.SearchTabType;
import com.max.hbsearch.g;
import com.max.hbsearch.h;
import com.max.hbsearch.k;
import com.max.hbsearch.m;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;

/* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nSearchGeneralTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,366:1\n262#2,2:367\n262#2,2:369\n1864#3,3:371\n1549#3:374\n1620#3,3:375\n1855#3,2:378\n*S KotlinDebug\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment\n*L\n87#1:367,2\n172#1:369,2\n203#1:371,3\n236#1:374\n236#1:375,3\n238#1:378,2\n*E\n"})
@o(parameters = 0)
public final class c extends k implements com.max.xiaoheihe.module.search.d, g, com.max.xiaoheihe.module.search.pagev2.a, SearchNewFragment.c {
    public static final int F = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int B;
    private int C;

    @dl.e
    private String D;

    @dl.e
    private SearchNewFragment.ContainerConfig E;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TabLayout f91718r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ViewPager f91719s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.viewpager.widget.a f91720t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FilterButtonView f91721u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.e
    private String f91722v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.e
    private String f91723w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @dl.e
    private Map<String, String> f91724x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private WikiObj f91725y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f91726z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private h f91717q = new yf.b();

    @dl.d
    private ArrayList<Fragment> A = new ArrayList<>();

    /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
    public static final class a extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43268, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            c.this.C = i10;
            m mVarF4 = c.F4(c.this);
            if (mVarF4 != null) {
                mVarF4.n();
            }
            if (c.this.A.get(i10) instanceof com.max.xiaoheihe.module.search.pagev2.b) {
                Object obj = c.this.A.get(i10);
                f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.pagev2.SearchGeneralFragment");
                if (((com.max.xiaoheihe.module.search.pagev2.b) obj).D6().isEmpty()) {
                    c.this.i2();
                } else {
                    c.this.r0();
                }
            }
        }
    }

    /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
    @t0({"SMAP\nSearchGeneralTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment$hideFilterButton$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,366:1\n262#2,2:367\n*S KotlinDebug\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment$hideFilterButton$1\n*L\n318#1:367,2\n*E\n"})
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f91729b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f91730c;

            a(c cVar, int i10) {
                this.f91729b = cVar;
                this.f91730c = i10;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@dl.d ValueAnimator it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43270, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                Object animatedValue = it.getAnimatedValue();
                f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                FilterButtonView filterButtonView = this.f91729b.f91721u;
                FilterButtonView filterButtonView2 = null;
                if (filterButtonView == null) {
                    f0.S("filter_button");
                    filterButtonView = null;
                }
                filterButtonView.setAlpha(fFloatValue);
                FilterButtonView filterButtonView3 = this.f91729b.f91721u;
                if (filterButtonView3 == null) {
                    f0.S("filter_button");
                } else {
                    filterButtonView2 = filterButtonView3;
                }
                filterButtonView2.setScrollX(-((int) (this.f91730c * (1 - fFloatValue))));
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43269, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FilterButtonView filterButtonView = c.this.f91721u;
            FilterButtonView filterButtonView2 = null;
            if (filterButtonView == null) {
                f0.S("filter_button");
                filterButtonView = null;
            }
            if (filterButtonView.getAlpha() > 0.0f) {
                FilterButtonView filterButtonView3 = c.this.f91721u;
                if (filterButtonView3 == null) {
                    f0.S("filter_button");
                } else {
                    filterButtonView2 = filterButtonView3;
                }
                filterButtonView2.setVisibility(0);
                int iF = ViewUtils.f(c.this.getContext(), 72.0f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new a(c.this, iF));
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.start();
            }
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.search.pagev2.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
    public static final class ViewOnClickListenerC0858c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        ViewOnClickListenerC0858c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) throws Exception {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43271, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            androidx.viewpager.widget.a aVar = c.this.f91720t;
            ViewPager viewPager = null;
            if (aVar == null) {
                f0.S("mPagerAdapter");
                aVar = null;
            }
            ViewPager viewPager2 = c.this.f91719s;
            if (viewPager2 == null) {
                f0.S("mViewPager");
                viewPager2 = null;
            }
            ViewPager viewPager3 = c.this.f91719s;
            if (viewPager3 == null) {
                f0.S("mViewPager");
            } else {
                viewPager = viewPager3;
            }
            Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager2, viewPager.getCurrentItem());
            f0.o(objInstantiateItem, "mPagerAdapter.instantiat…, mViewPager.currentItem)");
            if (objInstantiateItem instanceof com.max.xiaoheihe.module.search.pagev2.b) {
                ((com.max.xiaoheihe.module.search.pagev2.b) objInstantiateItem).T6();
            }
        }
    }

    /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
    public static final class d extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        d(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.fragment.app.n0, androidx.viewpager.widget.a
        public void destroyItem(@dl.d ViewGroup container, int i10, @dl.d Object object) {
            if (PatchProxy.proxy(new Object[]{container, new Integer(i10), object}, this, changeQuickRedirect, false, 43274, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(container, "container");
            f0.p(object, "object");
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43273, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : c.this.A.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43272, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            Object obj = c.this.A.get(i10);
            f0.o(obj, "mFragmentList[position]");
            return (Fragment) obj;
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43275, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : c.this.G1().a().get(i10);
        }
    }

    /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
    @t0({"SMAP\nSearchGeneralTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment$initViewPager$2\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,366:1\n1295#2,2:367\n1295#2,2:369\n*S KotlinDebug\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment$initViewPager$2\n*L\n94#1:367,2\n102#1:369,2\n*E\n"})
    public static final class e implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(@dl.e TabLayout.h hVar) {
            TabLayout.TabView tabView;
            kotlin.sequences.m<View> mVarE;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 43276, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (tabView = hVar.f55494i) == null || (mVarE = ViewGroupKt.e(tabView)) == null) {
                return;
            }
            for (View view : mVarE) {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(@dl.e TabLayout.h hVar) {
            TabLayout.TabView tabView;
            kotlin.sequences.m<View> mVarE;
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 43277, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported || hVar == null || (tabView = hVar.f55494i) == null || (mVarE = ViewGroupKt.e(tabView)) == null) {
                return;
            }
            for (View view : mVarE) {
                if (view instanceof TextView) {
                    ((TextView) view).setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                }
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(@dl.e TabLayout.h hVar) {
        }
    }

    /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
    @t0({"SMAP\nSearchGeneralTypeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment$showFilterButton$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,366:1\n262#2,2:367\n*S KotlinDebug\n*F\n+ 1 SearchGeneralTypeFragment.kt\ncom/max/xiaoheihe/module/search/pagev2/SearchGeneralTypeFragment$showFilterButton$1\n*L\n299#1:367,2\n*E\n"})
    public static final class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: SearchGeneralTypeFragment.kt */
        public static final class a implements ValueAnimator.AnimatorUpdateListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f91734b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f91735c;

            a(c cVar, int i10) {
                this.f91734b = cVar;
                this.f91735c = i10;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(@dl.d ValueAnimator it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 43279, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
                Object animatedValue = it.getAnimatedValue();
                f0.n(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue = ((Float) animatedValue).floatValue();
                FilterButtonView filterButtonView = this.f91734b.f91721u;
                FilterButtonView filterButtonView2 = null;
                if (filterButtonView == null) {
                    f0.S("filter_button");
                    filterButtonView = null;
                }
                filterButtonView.setAlpha(fFloatValue);
                FilterButtonView filterButtonView3 = this.f91734b.f91721u;
                if (filterButtonView3 == null) {
                    f0.S("filter_button");
                } else {
                    filterButtonView2 = filterButtonView3;
                }
                filterButtonView2.setScrollX(-((int) (this.f91735c * (1 - fFloatValue))));
            }
        }

        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43278, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            FilterButtonView filterButtonView = c.this.f91721u;
            FilterButtonView filterButtonView2 = null;
            if (filterButtonView == null) {
                f0.S("filter_button");
                filterButtonView = null;
            }
            if (filterButtonView.getAlpha() < 1.0f) {
                FilterButtonView filterButtonView3 = c.this.f91721u;
                if (filterButtonView3 == null) {
                    f0.S("filter_button");
                } else {
                    filterButtonView2 = filterButtonView3;
                }
                filterButtonView2.setVisibility(0);
                int iF = ViewUtils.f(c.this.getContext(), 72.0f);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new a(c.this, iF));
                valueAnimatorOfFloat.setDuration(500L);
                valueAnimatorOfFloat.start();
            }
        }
    }

    public static final /* synthetic */ m F4(c cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, null, changeQuickRedirect, true, 43267, new Class[]{c.class}, m.class);
        return patchProxyResultProxy.isSupported ? (m) patchProxyResultProxy.result : cVar.b4();
    }

    private final a J4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43245, new Class[0], a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : new a();
    }

    private final SearchTabType K4() {
        SearchTabType searchTabTypeO;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43249, new Class[0], SearchTabType.class);
        if (patchProxyResultProxy.isSupported) {
            return (SearchTabType) patchProxyResultProxy.result;
        }
        SearchNewFragment.ContainerConfig containerConfig = this.E;
        if (containerConfig == null || (searchTabTypeO = containerConfig.o()) == null) {
            return Q4() ? SearchTabType.CHANNEL_CONTENT : SearchTabType.GENERAL;
        }
        return searchTabTypeO;
    }

    private final String L4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43258, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.f91723w;
        if (str != null) {
            return str;
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(com.max.xiaoheihe.module.search.b.f91614a.i()) : null;
        return string == null ? "" : string;
    }

    private final void M4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43250, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        FilterButtonView filterButtonView = this.f91721u;
        if (filterButtonView == null) {
            f0.S("filter_button");
            filterButtonView = null;
        }
        filterButtonView.setVisibility(8);
        filterButtonView.setAlpha(0.0f);
        filterButtonView.setImage(R.drawable.common_filter_filled_24x24);
        filterButtonView.setOnClickListener(new ViewOnClickListenerC0858c());
    }

    private final void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43246, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d dVar = new d(getChildFragmentManager());
        ViewPager viewPager = this.f91719s;
        if (viewPager == null) {
            f0.S("mViewPager");
            viewPager = null;
        }
        viewPager.setAdapter(dVar);
        this.f91720t = dVar;
    }

    private final void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43247, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SearchTabType searchTabTypeK4 = K4();
        S4(xf.a.a(searchTabTypeK4));
        this.C = xf.a.b(searchTabTypeK4, R4());
    }

    private final void P4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43244, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        O4();
        for (String str : G1().a()) {
            com.max.xiaoheihe.module.search.pagev2.b bVarA = com.max.xiaoheihe.module.search.pagev2.b.f91692p3.a();
            bVarA.setArguments(getArguments() != null ? new Bundle(getArguments()) : new Bundle());
            Bundle arguments = bVarA.getArguments();
            if (arguments != null) {
                arguments.putString("type", str);
            }
            this.A.add(bVarA);
        }
        TabLayout tabLayout = this.f91718r;
        ViewPager viewPager = null;
        if (tabLayout == null) {
            f0.S("mTabLayout");
            tabLayout = null;
        }
        tabLayout.setVisibility(G1().a().size() > 1 ? 0 : 8);
        N4();
        ViewPager viewPager2 = this.f91719s;
        if (viewPager2 == null) {
            f0.S("mViewPager");
            viewPager2 = null;
        }
        viewPager2.h();
        ViewPager viewPager3 = this.f91719s;
        if (viewPager3 == null) {
            f0.S("mViewPager");
            viewPager3 = null;
        }
        viewPager3.c(J4());
        TabLayout tabLayout2 = this.f91718r;
        if (tabLayout2 == null) {
            f0.S("mTabLayout");
            tabLayout2 = null;
        }
        ViewPager viewPager4 = this.f91719s;
        if (viewPager4 == null) {
            f0.S("mViewPager");
            viewPager4 = null;
        }
        tabLayout2.setupWithViewPager(viewPager4);
        TabLayout tabLayout3 = this.f91718r;
        if (tabLayout3 == null) {
            f0.S("mTabLayout");
            tabLayout3 = null;
        }
        tabLayout3.h(new e());
        ViewPager viewPager5 = this.f91719s;
        if (viewPager5 == null) {
            f0.S("mViewPager");
        } else {
            viewPager = viewPager5;
        }
        viewPager.setCurrentItem(this.C, false);
    }

    private final boolean Q4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43257, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : f0.g(L4(), ChannelsDetailActivity.f79607q4);
    }

    private final String R4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43248, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (!f0.g(ChannelsDetailActivity.f79607q4, this.f91723w)) {
            return "";
        }
        String string = this.mContext.getString(R.string.content);
        f0.o(string, "{\n            mContext.g…string.content)\n        }");
        return string;
    }

    private final void bindViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43251, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.rootView;
        f0.m(view);
        View viewFindViewById = view.findViewById(R.id.tl);
        f0.o(viewFindViewById, "rootView!!.findViewById(R.id.tl)");
        this.f91718r = (TabLayout) viewFindViewById;
        View viewFindViewById2 = this.rootView.findViewById(R.id.vp);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.vp)");
        this.f91719s = (ViewPager) viewFindViewById2;
        View viewFindViewById3 = this.rootView.findViewById(R.id.filter_button);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.filter_button)");
        this.f91721u = (FilterButtonView) viewFindViewById3;
    }

    private final void getArgumentInfo() {
        Bundle arguments;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43252, new Class[0], Void.TYPE).isSupported || (arguments = getArguments()) == null) {
            return;
        }
        com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
        this.f91726z = arguments.getBoolean(bVar.f(), false);
        this.f91722v = arguments.getString(bVar.j());
        Parcelable parcelable = arguments.getParcelable(SearchNewFragment.f72183g4);
        this.E = parcelable instanceof SearchNewFragment.ContainerConfig ? (SearchNewFragment.ContainerConfig) parcelable : null;
        this.f91723w = arguments.getString(bVar.i());
        Serializable serializable = arguments.getSerializable(bVar.l());
        HashMap map = serializable instanceof HashMap ? (HashMap) serializable : null;
        if (map == null) {
            map = new HashMap();
        }
        this.f91724x = map;
        Serializable serializable2 = arguments.getSerializable(bVar.m());
        this.f91725y = serializable2 instanceof WikiObj ? (WikiObj) serializable2 : null;
    }

    @Override // com.max.hbsearch.g
    @dl.d
    public h G1() {
        return this.f91717q;
    }

    @Override // com.max.hbsearch.k
    public void P3(@dl.e String str, int i10, int i11) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 43255, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported || !isAdded() || isDetached()) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f91720t;
        ViewPager viewPager = null;
        if (aVar == null) {
            f0.S("mPagerAdapter");
            aVar = null;
        }
        ViewPager viewPager2 = this.f91719s;
        if (viewPager2 == null) {
            f0.S("mViewPager");
            viewPager2 = null;
        }
        ViewPager viewPager3 = this.f91719s;
        if (viewPager3 == null) {
            f0.S("mViewPager");
        } else {
            viewPager = viewPager3;
        }
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager2, viewPager.getCurrentItem());
        f0.o(objInstantiateItem, "mPagerAdapter.instantiat…, mViewPager.currentItem)");
        if (objInstantiateItem instanceof k) {
            k kVar = (k) objInstantiateItem;
            if (kVar.isActive()) {
                if (i10 == 0) {
                    kVar.x4();
                }
                kVar.P3(str, i10, i11);
            }
        }
    }

    public void S4(@dl.d h hVar) {
        if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 43242, new Class[]{h.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(hVar, "<set-?>");
        this.f91717q = hVar;
    }

    @Override // com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43260, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        if (Q4()) {
            return com.max.hbsearch.o.f72357a.b();
        }
        SearchHotwordsObj searchHotwordsObj = com.max.hbsearch.o.f72358b;
        if (searchHotwordsObj != null) {
            return searchHotwordsObj.getList();
        }
        return null;
    }

    @Override // com.max.hbsearch.SearchNewFragment.c
    public void e1(@dl.e String str) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43266, new Class[]{String.class}, Void.TYPE).isSupported || !isActive() || str == null) {
            return;
        }
        int iD = xf.a.d(K4(), str);
        ViewPager viewPager = null;
        if (iD >= 0) {
            androidx.viewpager.widget.a aVar = this.f91720t;
            if (aVar == null) {
                f0.S("mPagerAdapter");
                aVar = null;
            }
            if (iD < aVar.getCount()) {
                z10 = true;
            }
        }
        if (z10) {
            ViewPager viewPager2 = this.f91719s;
            if (viewPager2 == null) {
                f0.S("mViewPager");
            } else {
                viewPager = viewPager2;
            }
            viewPager.setCurrentItem(iD, true);
        }
    }

    @Override // com.max.xiaoheihe.module.search.pagev2.a
    public void i2() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43263, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mContext.runOnUiThread(new b());
        }
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43259, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        return Q4() ? 18 : 37;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 43243, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_search_tab_fragment);
        getArgumentInfo();
        bindViews();
        P4();
        M4();
    }

    @Override // com.max.hbcommon.base.d
    public boolean isNotPage() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:24:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    @Override // com.max.hbsearch.k
    @dl.d
    public String j4() {
        SearchHotwordsObj searchHotwordsObj;
        String default_q;
        SearchHotwordsObj searchHotwordsObj2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43261, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (this.D == null) {
            String strN0 = null;
            if (com.max.hbsearch.o.j()) {
                String str = com.max.hbsearch.o.f72359c;
                if (str == null || u.V1(str)) {
                    searchHotwordsObj = com.max.hbsearch.o.f72358b;
                    if (searchHotwordsObj == null) {
                        strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_all_hint);
                    } else {
                        if (searchHotwordsObj != null) {
                            default_q = searchHotwordsObj.getDefault_q();
                        } else {
                            default_q = null;
                        }
                        if (com.max.hbcommon.utils.c.u(default_q)) {
                            strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_all_hint);
                        } else {
                            searchHotwordsObj2 = com.max.hbsearch.o.f72358b;
                            if (searchHotwordsObj2 != null) {
                                strN0 = searchHotwordsObj2.getDefault_q();
                            }
                        }
                    }
                } else {
                    strN0 = com.max.hbsearch.o.f72359c;
                }
            } else {
                searchHotwordsObj = com.max.hbsearch.o.f72358b;
                if (searchHotwordsObj == null) {
                    strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_all_hint);
                } else {
                    if (searchHotwordsObj != null) {
                        default_q = searchHotwordsObj.getDefault_q();
                    } else {
                        default_q = null;
                    }
                    if (com.max.hbcommon.utils.c.u(default_q)) {
                        searchHotwordsObj2 = com.max.hbsearch.o.f72358b;
                        if (searchHotwordsObj2 != null) {
                            strN0 = searchHotwordsObj2.getDefault_q();
                        }
                    } else {
                        strN0 = com.max.xiaoheihe.utils.d.n0(R.string.search_all_hint);
                    }
                }
            }
            this.D = strN0;
        }
        String str2 = this.D;
        f0.m(str2);
        return str2;
    }

    @Override // com.max.xiaoheihe.module.search.pagev2.a
    public boolean l2(@dl.d Fragment fragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{fragment}, this, changeQuickRedirect, false, 43264, new Class[]{Fragment.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(fragment, "fragment");
        return f0.g(this.A.get(this.C), fragment);
    }

    @Override // com.max.hbsearch.k
    public void l4() {
    }

    @Override // com.max.hbsearch.k
    public void m4() {
    }

    @Override // com.max.hbsearch.k
    public void n4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43265, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.n4(str);
        for (Fragment fragment : getChildFragmentManager().J0()) {
            if (fragment instanceof k) {
                ((k) fragment).n4(str);
            }
        }
    }

    @Override // com.max.xiaoheihe.module.search.d
    public void q(int i10) {
        int i11 = 0;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43253, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.B = i10;
        for (Object obj : this.A) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            Fragment fragment = (Fragment) obj;
            if ((fragment instanceof k) && ((k) fragment).i4() == i10) {
                ViewPager viewPager = this.f91719s;
                if (viewPager == null) {
                    f0.S("mViewPager");
                    viewPager = null;
                }
                viewPager.setCurrentItem(i11);
            }
            i11 = i12;
        }
    }

    @Override // com.max.xiaoheihe.module.search.pagev2.a
    public void r0() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 43262, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.mContext.runOnUiThread(new f());
        }
    }

    @Override // com.max.hbsearch.g
    public void x2(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 43254, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 >= 0) {
            TabLayout tabLayout = this.f91718r;
            TabLayout tabLayout2 = null;
            if (tabLayout == null) {
                f0.S("mTabLayout");
                tabLayout = null;
            }
            if (i10 >= tabLayout.getTabCount()) {
                return;
            }
            TabLayout tabLayout3 = this.f91718r;
            if (tabLayout3 == null) {
                f0.S("mTabLayout");
                tabLayout3 = null;
            }
            TabLayout.h hVarD = tabLayout3.D(i10);
            TabLayout tabLayout4 = this.f91718r;
            if (tabLayout4 == null) {
                f0.S("mTabLayout");
            } else {
                tabLayout2 = tabLayout4;
            }
            tabLayout2.R(hVarD);
        }
    }

    @Override // com.max.hbsearch.k
    public void z4(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 43256, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        super.z4(str);
        ArrayList<Fragment> arrayList = this.A;
        ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
        for (Fragment fragment : arrayList) {
            f0.n(fragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.search.pagev2.SearchGeneralFragment");
            arrayList2.add((com.max.xiaoheihe.module.search.pagev2.b) fragment);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((com.max.xiaoheihe.module.search.pagev2.b) it.next()).z4(str);
        }
    }
}
