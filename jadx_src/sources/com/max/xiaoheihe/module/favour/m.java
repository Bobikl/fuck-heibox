package com.max.xiaoheihe.module.favour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Scroller;
import androidx.compose.runtime.internal.o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import com.flyco.tablayout.SlidingTabLayout;
import com.max.hbcustomview.NoScrollViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.AllRecommendGameCategoryObj;
import com.max.xiaoheihe.module.game.d0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: VisitedHistoryFragment.kt */
/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.F1)
@o(parameters = 0)
public final class m extends com.max.hbcommon.base.d implements l {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f83964i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.viewpager.widget.a f83965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoScrollViewPager f83966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SlidingTabLayout f83967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f83968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private ArrayList<String> f83969f = new ArrayList<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f83970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.e
    private k f83971h;

    /* JADX INFO: compiled from: VisitedHistoryFragment.kt */
    @o(parameters = 0)
    public static final class a extends Scroller {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        public static final C0742a f83972b = new C0742a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f83973c = 0;
        public static ChangeQuickRedirect changeQuickRedirect = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f83974d = 1000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f83975a;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.favour.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: VisitedHistoryFragment.kt */
        public static final class C0742a {
            private C0742a() {
            }

            public /* synthetic */ C0742a(u uVar) {
                this();
            }
        }

        public a(@dl.e Context context) {
            super(context);
            this.f83975a = 1000;
        }

        @Override // android.widget.Scroller
        public void startScroll(int i10, int i11, int i12, int i13, int i14) {
            Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13), new Integer(i14)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 32065, new Class[]{cls, cls, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            super.startScroll(i10, i11, i12, i13, this.f83975a);
        }
    }

    /* JADX INFO: compiled from: VisitedHistoryFragment.kt */
    public static final class b extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        b(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32067, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : m.this.f83969f.size();
        }

        @Override // androidx.fragment.app.n0
        @dl.d
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32066, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            j.a aVar = j.f83928j;
            Object obj = m.this.f83969f.get(i10);
            f0.o(obj, "mPageList[position]");
            return aVar.b((String) obj);
        }

        @Override // androidx.viewpager.widget.a
        @dl.e
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32068, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            m mVar = m.this;
            Object obj = mVar.f83969f.get(i10);
            f0.o(obj, "mPageList[position]");
            return m.M3(mVar, (String) obj);
        }
    }

    /* JADX INFO: compiled from: VisitedHistoryFragment.kt */
    public static final class c extends ViewPager.l {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 32069, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            m.this.O3();
        }
    }

    public static final /* synthetic */ String M3(m mVar, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mVar, str}, null, changeQuickRedirect, true, 32064, new Class[]{m.class, String.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : mVar.N3(str);
    }

    private final String N3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 32061, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -250776729) {
            if (iHashCode != 3165170) {
                if (iHashCode == 3321850 && str.equals("link")) {
                    return "内容";
                }
            } else if (str.equals("game")) {
                return AllRecommendGameCategoryObj.STYLE_GAME;
            }
        } else if (str.equals("wiki_article")) {
            return "数据库";
        }
        return d0.f87251w;
    }

    public final void O3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 32062, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f83965b;
        NoScrollViewPager noScrollViewPager = null;
        if (aVar == null) {
            f0.S("mPagerAdapter");
            aVar = null;
        }
        NoScrollViewPager noScrollViewPager2 = this.f83966c;
        if (noScrollViewPager2 == null) {
            f0.S("mViewPager");
            noScrollViewPager2 = null;
        }
        NoScrollViewPager noScrollViewPager3 = this.f83966c;
        if (noScrollViewPager3 == null) {
            f0.S("mViewPager");
        } else {
            noScrollViewPager = noScrollViewPager3;
        }
        j jVar = (j) aVar.instantiateItem((ViewGroup) noScrollViewPager2, noScrollViewPager.getCurrentItem());
        if (jVar != null) {
            jVar.j4();
        }
    }

    @Override // com.max.xiaoheihe.module.favour.l
    public boolean R0() {
        return this.f83970g;
    }

    @Override // com.max.xiaoheihe.module.favour.l
    public void Z(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 32063, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f83970g = z10;
        k kVar = this.f83971h;
        if (kVar != null) {
            kVar.M();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.e View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 32060, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.hbwallet_fragment_history);
        View viewFindViewById = findViewById(R.id.vp);
        f0.o(viewFindViewById, "findViewById(R.id.vp)");
        NoScrollViewPager noScrollViewPager = (NoScrollViewPager) viewFindViewById;
        this.f83966c = noScrollViewPager;
        NoScrollViewPager noScrollViewPager2 = null;
        if (noScrollViewPager == null) {
            f0.S("mViewPager");
            noScrollViewPager = null;
        }
        noScrollViewPager.setViewPagerScroll(new a(this.mContext));
        View viewFindViewById2 = findViewById(R.id.tab);
        f0.o(viewFindViewById2, "findViewById(R.id.tab)");
        SlidingTabLayout slidingTabLayout = (SlidingTabLayout) viewFindViewById2;
        this.f83967d = slidingTabLayout;
        if (slidingTabLayout == null) {
            f0.S("mSlidingTabLayout");
            slidingTabLayout = null;
        }
        ViewGroup.LayoutParams layoutParams = slidingTabLayout.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(this.mContext, 8.0f);
        this.f83969f.add("all");
        this.f83969f.add("link");
        this.f83969f.add("game");
        this.f83969f.add("wiki_article");
        this.f83968e = 0;
        this.f83965b = new b(getChildFragmentManager());
        NoScrollViewPager noScrollViewPager3 = this.f83966c;
        if (noScrollViewPager3 == null) {
            f0.S("mViewPager");
            noScrollViewPager3 = null;
        }
        androidx.viewpager.widget.a aVar = this.f83965b;
        if (aVar == null) {
            f0.S("mPagerAdapter");
            aVar = null;
        }
        noScrollViewPager3.setAdapter(aVar);
        NoScrollViewPager noScrollViewPager4 = this.f83966c;
        if (noScrollViewPager4 == null) {
            f0.S("mViewPager");
            noScrollViewPager4 = null;
        }
        noScrollViewPager4.setOffscreenPageLimit(3);
        SlidingTabLayout slidingTabLayout2 = this.f83967d;
        if (slidingTabLayout2 == null) {
            f0.S("mSlidingTabLayout");
            slidingTabLayout2 = null;
        }
        NoScrollViewPager noScrollViewPager5 = this.f83966c;
        if (noScrollViewPager5 == null) {
            f0.S("mViewPager");
            noScrollViewPager5 = null;
        }
        slidingTabLayout2.setViewPager(noScrollViewPager5);
        NoScrollViewPager noScrollViewPager6 = this.f83966c;
        if (noScrollViewPager6 == null) {
            f0.S("mViewPager");
            noScrollViewPager6 = null;
        }
        noScrollViewPager6.setCurrentItem(this.f83968e);
        NoScrollViewPager noScrollViewPager7 = this.f83966c;
        if (noScrollViewPager7 == null) {
            f0.S("mViewPager");
        } else {
            noScrollViewPager2 = noScrollViewPager7;
        }
        noScrollViewPager2.c(new c());
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) {
        k kVar;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 32059, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof k) {
            LayoutInflater.Factory activity = getActivity();
            f0.n(activity, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.OnActionChange");
            kVar = (k) activity;
        } else if (context instanceof k) {
            kVar = (k) context;
        } else if (getParentFragment() instanceof k) {
            androidx.activity.result.b parentFragment = getParentFragment();
            f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.favour.OnActionChange");
            kVar = (k) parentFragment;
        } else {
            kVar = null;
        }
        this.f83971h = kVar;
    }
}
