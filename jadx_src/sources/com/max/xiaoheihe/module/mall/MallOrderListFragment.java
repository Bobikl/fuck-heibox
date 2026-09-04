package com.max.xiaoheihe.module.mall;

import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.p0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.n0;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.HeyBoxTabLayout;
import com.max.hbcustomview.ViewPagerFixed;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hblogistics.bean.logistics.ExpressDetailObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallOrderObj;
import com.max.xiaoheihe.bean.mall.MallOrdersObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class MallOrderListFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f89620s = "filter";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    BannerViewPager<ExpressDetailObj> f89621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    HeyBoxTabLayout f89622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TextView f89623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    View f89624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    TextView f89625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    View f89626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List<FiltersObj> f89627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<FiltersObj> f89628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private PopupWindow f89629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private LinearLayout f89630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f89631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f89632m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MallOrdersObj f89634o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    n0 f89637r;

    @BindView(R.id.vp)
    ViewPagerFixed vp;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List<MallOrderObj> f89633n = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<String, String> f89635p = new HashMap(16);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f89636q = -1;

    public class a implements Animation.AnimationListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (PatchProxy.proxy(new Object[]{animation}, this, changeQuickRedirect, false, 40269, new Class[]{Animation.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderListFragment.this.f89630k.setVisibility(0);
        }
    }

    public class b implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40268, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderListFragment.this.f89636q = i10;
            MallOrderListFragment mallOrderListFragment = MallOrderListFragment.this;
            Object objInstantiateItem = mallOrderListFragment.f89637r.instantiateItem((ViewGroup) mallOrderListFragment.vp, i10);
            if (objInstantiateItem instanceof MallOrderListRefreshFragment) {
                ((MallOrderListRefreshFragment) objInstantiateItem).w4(MallOrderListFragment.this.f89635p);
            }
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<MallOrdersObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40271, new Class[0], Void.TYPE).isSupported && MallOrderListFragment.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40270, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderListFragment.this.isActive()) {
                super.onError(th2);
                MallOrderListFragment.X3(MallOrderListFragment.this);
            }
        }

        public void onNext(Result<MallOrdersObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40272, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderListFragment.this.isActive()) {
                super.onNext(result);
                MallOrderListFragment.Z3(MallOrderListFragment.this);
                MallOrderListFragment.this.f89634o = result.getResult();
                if (MallOrderListFragment.this.f89634o == null) {
                    return;
                }
                MallOrderListFragment mallOrderListFragment = MallOrderListFragment.this;
                MallOrderListFragment.c4(mallOrderListFragment, mallOrderListFragment.f89621b, mallOrderListFragment.f89634o.getExpress_details());
                MallOrderListFragment mallOrderListFragment2 = MallOrderListFragment.this;
                MallOrderListFragment.d4(mallOrderListFragment2, mallOrderListFragment2.f89623d, mallOrderListFragment2.f89624e, mallOrderListFragment2.f89634o.getFilters());
                MallOrderListFragment.e4(MallOrderListFragment.this);
                MallOrderListFragment.f4(MallOrderListFragment.this);
                MallOrderListFragment.this.f89633n.clear();
                if (MallOrderListFragment.this.f89634o.getOrders() != null) {
                    MallOrderListFragment.this.f89633n.addAll(MallOrderListFragment.this.f89634o.getOrders());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40273, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrdersObj>) obj);
        }
    }

    public class d extends com.max.hbcustomview.bannerview.d<ExpressDetailObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        public void A(com.max.hbcustomview.bannerview.e<ExpressDetailObj> eVar, ExpressDetailObj expressDetailObj, int i10, int i11) {
            Object[] objArr = {eVar, expressDetailObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40274, new Class[]{com.max.hbcustomview.bannerview.e.class, ExpressDetailObj.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hblogistics.g.a(eVar.itemView, expressDetailObj);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<ExpressDetailObj> eVar, ExpressDetailObj expressDetailObj, int i10, int i11) {
            Object[] objArr = {eVar, expressDetailObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40275, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            A(eVar, expressDetailObj, i10, i11);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public int q(int i10) {
            return R.layout.layout_banner_logistics;
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f89642b;

        e(TextView textView) {
            this.f89642b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40276, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderListFragment.N3(MallOrderListFragment.this, this.f89642b);
        }
    }

    public class f extends n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        f(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40278, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : MallOrderListFragment.this.f89634o.getFilter().size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40277, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            MallOrderListRefreshFragment mallOrderListRefreshFragmentV4 = MallOrderListRefreshFragment.v4(MallOrderListFragment.this.f89634o.getFilter().get(i10).getKey());
            if (i10 == 0) {
                mallOrderListRefreshFragmentV4.t4(MallOrderListFragment.this.f89635p, MallOrderListFragment.this.f89633n);
            }
            return mallOrderListRefreshFragmentV4;
        }

        @Override // androidx.viewpager.widget.a
        @p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40279, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : MallOrderListFragment.this.f89634o.getFilter().get(i10).getDesc();
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40280, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderListFragment.this.k4();
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f89647b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FiltersObj f89648c;

        i(KeyDescObj keyDescObj, FiltersObj filtersObj) {
            this.f89647b = keyDescObj;
            this.f89648c = filtersObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40281, new Class[]{View.class}, Void.TYPE).isSupported || this.f89647b.isChecked()) {
                return;
            }
            MallOrderListFragment.O3(MallOrderListFragment.this, this.f89648c, this.f89647b);
            MallOrderListFragment.P3(MallOrderListFragment.this);
            if (MallOrderListFragment.Q3(MallOrderListFragment.this)) {
                MallOrderListFragment.R3(MallOrderListFragment.this, false);
            }
            MallOrderListFragment.this.k4();
            ((com.max.hbcommon.base.d) MallOrderListFragment.this).mContext.sendBroadcast(new Intent(lb.a.A));
        }
    }

    public class j implements PopupWindow.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f89650b;

        j(View view) {
            this.f89650b = view;
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40282, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            View view = this.f89650b;
            if (view != null && (view instanceof TextView)) {
                TextView textView = (TextView) view;
                if (MallOrderListFragment.T3(MallOrderListFragment.this)) {
                    textView.setTextColor(((com.max.hbcommon.base.d) MallOrderListFragment.this).mContext.getResources().getColor(R.color.text_primary_1_color));
                } else {
                    textView.setTextColor(((com.max.hbcommon.base.d) MallOrderListFragment.this).mContext.getResources().getColor(R.color.text_primary_1_color));
                }
                textView.setText(MallOrderListFragment.this.getString(R.string.screening) + " " + lb.b.f131094j);
            }
            MallOrderListFragment.W3(MallOrderListFragment.this);
        }
    }

    static /* synthetic */ void N3(MallOrderListFragment mallOrderListFragment, View view) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment, view}, null, changeQuickRedirect, true, 40261, new Class[]{MallOrderListFragment.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.t4(view);
    }

    static /* synthetic */ void O3(MallOrderListFragment mallOrderListFragment, FiltersObj filtersObj, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment, filtersObj, keyDescObj}, null, changeQuickRedirect, true, 40262, new Class[]{MallOrderListFragment.class, FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.u4(filtersObj, keyDescObj);
    }

    static /* synthetic */ void P3(MallOrderListFragment mallOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40263, new Class[]{MallOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.w4();
    }

    static /* synthetic */ boolean Q3(MallOrderListFragment mallOrderListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40264, new Class[]{MallOrderListFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallOrderListFragment.o4();
    }

    static /* synthetic */ void R3(MallOrderListFragment mallOrderListFragment, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40265, new Class[]{MallOrderListFragment.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.h4(z10);
    }

    static /* synthetic */ boolean T3(MallOrderListFragment mallOrderListFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40266, new Class[]{MallOrderListFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallOrderListFragment.n4();
    }

    static /* synthetic */ void W3(MallOrderListFragment mallOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40267, new Class[]{MallOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.v4();
    }

    static /* synthetic */ void X3(MallOrderListFragment mallOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40255, new Class[]{MallOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.showError();
    }

    static /* synthetic */ void Z3(MallOrderListFragment mallOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40256, new Class[]{MallOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.showContentView();
    }

    static /* synthetic */ void c4(MallOrderListFragment mallOrderListFragment, BannerViewPager bannerViewPager, List list) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment, bannerViewPager, list}, null, changeQuickRedirect, true, 40257, new Class[]{MallOrderListFragment.class, BannerViewPager.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.q4(bannerViewPager, list);
    }

    static /* synthetic */ void d4(MallOrderListFragment mallOrderListFragment, TextView textView, View view, List list) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment, textView, view, list}, null, changeQuickRedirect, true, 40258, new Class[]{MallOrderListFragment.class, TextView.class, View.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.r4(textView, view, list);
    }

    static /* synthetic */ void e4(MallOrderListFragment mallOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40259, new Class[]{MallOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.s4();
    }

    static /* synthetic */ void f4(MallOrderListFragment mallOrderListFragment) {
        if (PatchProxy.proxy(new Object[]{mallOrderListFragment}, null, changeQuickRedirect, true, 40260, new Class[]{MallOrderListFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderListFragment.m4();
    }

    private void h4(boolean z10) {
        int size;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40252, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        List<FiltersObj> list = this.f89627h;
        if (list != null && this.f89628i != null && (size = list.size()) == this.f89628i.size()) {
            for (int i10 = 0; i10 < size; i10++) {
                List<KeyDescObj> filters = this.f89627h.get(i10).getFilters();
                List<KeyDescObj> filters2 = this.f89628i.get(i10).getFilters();
                int size2 = filters.size();
                if (size2 == filters2.size()) {
                    for (int i11 = 0; i11 < size2; i11++) {
                        KeyDescObj keyDescObj = filters.get(i11);
                        KeyDescObj keyDescObj2 = filters2.get(i11);
                        if (z10) {
                            keyDescObj2.setChecked(keyDescObj.isChecked());
                        } else {
                            keyDescObj.setChecked(keyDescObj2.isChecked());
                        }
                    }
                }
            }
        }
        s4();
    }

    private KeyDescObj i4(FiltersObj filtersObj) {
        List<KeyDescObj> filters;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 40248, new Class[]{FiltersObj.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        if (filtersObj == null || (filters = filtersObj.getFilters()) == null) {
            return null;
        }
        for (KeyDescObj keyDescObj : filters) {
            if (keyDescObj.isChecked()) {
                return keyDescObj;
            }
        }
        return null;
    }

    private Map<String, String> j4(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 40244, new Class[]{Integer.TYPE}, Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        return i10 == 0 ? new HashMap() : this.f89635p;
    }

    private void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40240, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().S0(this.f89631l, this.f89635p, this.f89632m, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40245, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f fVar = new f(getChildFragmentManager());
        this.f89637r = fVar;
        this.vp.setAdapter(fVar);
        this.vp.setOffscreenPageLimit(this.f89634o.getFilter().size());
    }

    private boolean n4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40250, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<FiltersObj> list = this.f89627h;
        if (list == null) {
            return false;
        }
        Iterator<FiltersObj> it = list.iterator();
        while (it.hasNext()) {
            KeyDescObj keyDescObjI4 = i4(it.next());
            if (keyDescObjI4 != null && keyDescObjI4.getIndex() != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean o4() {
        int size;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40251, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<FiltersObj> list = this.f89627h;
        if (list != null && this.f89628i != null && (size = list.size()) == this.f89628i.size()) {
            for (int i10 = 0; i10 < size; i10++) {
                List<KeyDescObj> filters = this.f89627h.get(i10).getFilters();
                List<KeyDescObj> filters2 = this.f89628i.get(i10).getFilters();
                int size2 = filters.size();
                if (size2 == filters2.size()) {
                    for (int i11 = 0; i11 < size2; i11++) {
                        if (filters.get(i11).isChecked() != filters2.get(i11).isChecked()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static MallOrderListFragment p4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40237, new Class[0], MallOrderListFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallOrderListFragment) patchProxyResultProxy.result;
        }
        MallOrderListFragment mallOrderListFragment = new MallOrderListFragment();
        mallOrderListFragment.setArguments(new Bundle());
        return mallOrderListFragment;
    }

    private void q4(BannerViewPager<ExpressDetailObj> bannerViewPager, List<ExpressDetailObj> list) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager, list}, this, changeQuickRedirect, false, 40241, new Class[]{BannerViewPager.class, List.class}, Void.TYPE).isSupported || bannerViewPager == null) {
            return;
        }
        if (list == null || list.size() <= 0) {
            bannerViewPager.setVisibility(8);
            return;
        }
        bannerViewPager.setVisibility(0);
        bannerViewPager.J(list);
        bannerViewPager.getLayoutParams().height = ViewUtils.f(this.mContext, 84.0f);
        bannerViewPager.V(ViewUtils.f(this.mContext, 2.0f));
        bannerViewPager.c0(ViewUtils.f(this.mContext, 8.0f));
        bannerViewPager.Z(ViewUtils.f(this.mContext, 6.0f));
        bannerViewPager.j0(getLifecycle()).R(new d()).k();
    }

    private void r4(TextView textView, View view, List<FiltersObj> list) {
        if (PatchProxy.proxy(new Object[]{textView, view, list}, this, changeQuickRedirect, false, 40242, new Class[]{TextView.class, View.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (list == null || list.size() <= 0) {
            textView.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        view.setVisibility(0);
        if (this.f89627h == null) {
            this.f89627h = new ArrayList();
            for (FiltersObj filtersObj : list) {
                List<KeyDescObj> filters = filtersObj.getFilters();
                if (filters != null && filters.size() > 0) {
                    for (int i10 = 0; i10 < filters.size(); i10++) {
                        KeyDescObj keyDescObj = filters.get(i10);
                        keyDescObj.setIndex(i10);
                        if (i10 == 0) {
                            keyDescObj.setChecked(true);
                        } else {
                            keyDescObj.setChecked(false);
                        }
                    }
                }
                this.f89627h.add(filtersObj);
            }
            this.f89628i = new ArrayList();
            for (FiltersObj filtersObj2 : this.f89627h) {
                FiltersObj filtersObj3 = new FiltersObj();
                filtersObj3.setDesc(filtersObj2.getDesc());
                filtersObj3.setKey(filtersObj2.getKey());
                ArrayList arrayList = new ArrayList();
                if (filtersObj2.getFilters() != null) {
                    for (KeyDescObj keyDescObj2 : filtersObj2.getFilters()) {
                        KeyDescObj keyDescObj3 = new KeyDescObj();
                        keyDescObj3.setChecked(keyDescObj2.isChecked());
                        keyDescObj3.setDesc(keyDescObj2.getDesc());
                        keyDescObj3.setIndex(keyDescObj2.getIndex());
                        keyDescObj3.setKey(keyDescObj2.getKey());
                        arrayList.add(keyDescObj3);
                    }
                }
                filtersObj3.setFilters(arrayList);
                this.f89628i.add(filtersObj3);
            }
        }
        v4();
        bb.d.d(textView, 0);
        textView.setText(getString(R.string.screening) + " " + lb.b.f131094j);
        textView.setOnClickListener(new e(textView));
    }

    private void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40243, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f89635p.clear();
        List<FiltersObj> list = this.f89622c != null ? this.f89627h : null;
        if (list != null) {
            for (FiltersObj filtersObj : list) {
                String key = filtersObj.getKey();
                KeyDescObj keyDescObjM = com.max.xiaoheihe.utils.d.M(filtersObj);
                if (keyDescObjM != null) {
                    this.f89635p.put(key, keyDescObjM.getKey());
                }
            }
        }
        if (this.f89636q != -1) {
            Object objInstantiateItem = this.vp.getAdapter().instantiateItem((ViewGroup) this.vp, this.f89636q);
            if (objInstantiateItem instanceof MallOrderListRefreshFragment) {
                ((MallOrderListRefreshFragment) objInstantiateItem).w4(this.f89635p);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, android.widget.LinearLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r14v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r2v10, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v15, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    private void t4(View view) {
        ?? r14;
        ?? r10;
        int i10;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40246, new Class[]{View.class}, Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        if (this.f89629j == null) {
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            linearLayout.setOrientation(1);
            int i11 = -1;
            linearLayout.setLayoutParams(new WindowManager.LayoutParams(-1, -1));
            linearLayout.setBackgroundColor(this.mContext.getResources().getColor(R.color.dialog_scrim_color));
            linearLayout.setOnClickListener(new g());
            ScrollView scrollView = new ScrollView(this.mContext);
            int i12 = -2;
            scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(this.mContext);
            this.f89630k = linearLayout2;
            linearLayout2.setOrientation(1);
            this.f89630k.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f89630k.setBackgroundColor(this.mContext.getResources().getColor(R.color.white));
            this.f89630k.setOnClickListener(new h());
            scrollView.addView(this.f89630k);
            linearLayout.addView(scrollView);
            this.f89630k.addView(this.mInflater.inflate(R.layout.divider, (ViewGroup) this.f89630k, false));
            int iF = ViewUtils.f(this.mContext, 10.0f);
            List<FiltersObj> list = this.f89628i;
            if (list != null) {
                int size = list.size();
                int i13 = 0;
                while (i13 < size) {
                    FiltersObj filtersObj = this.f89628i.get(i13);
                    TextView textView = new TextView(this.mContext);
                    textView.setPadding(iF, iF, iF, z10 ? 1 : 0);
                    textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                    textView.setTextSize(z10 ? 1 : 0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                    textView.setIncludeFontPadding(z10);
                    textView.setText(filtersObj.getDesc());
                    this.f89630k.addView(textView);
                    if (filtersObj.getFilters() != null) {
                        int size2 = filtersObj.getFilters().size();
                        int iL = ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 20.0f);
                        LinearLayout linearLayout3 = new LinearLayout(this.mContext);
                        linearLayout3.setOrientation(z10 ? 1 : 0);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i11, i12);
                        layoutParams.setMargins(iF, iF, iF, iF);
                        linearLayout3.setLayoutParams(layoutParams);
                        this.f89630k.addView(linearLayout3);
                        int i14 = z10 ? 1 : 0;
                        int iMax = i14;
                        while (i14 < size2) {
                            KeyDescObj keyDescObj = filtersObj.getFilters().get(i14);
                            ?? textView2 = new TextView(this.mContext);
                            textView2.setTag(keyDescObj);
                            ?? layoutParams2 = new LinearLayout.LayoutParams(i12, i12);
                            if (i14 == 0) {
                                r10 = z10;
                                r14 = linearLayout3;
                                layoutParams2.setMargins(r10, r10, r10, r10);
                            } else {
                                r10 = z10;
                                r14 = linearLayout3;
                                layoutParams2.setMargins(iF, r10, r10, r10);
                            }
                            textView2.setLayoutParams(layoutParams2);
                            textView2.setMinWidth(ViewUtils.f(this.mContext, 60.0f));
                            textView2.setGravity(17);
                            int i15 = size;
                            int i16 = size2;
                            textView2.setPadding(ViewUtils.f(this.mContext, 6.0f), ViewUtils.f(this.mContext, 6.0f), ViewUtils.f(this.mContext, 6.0f), ViewUtils.f(this.mContext, 6.0f));
                            textView2.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_12));
                            textView2.setIncludeFontPadding(false);
                            String desc = keyDescObj.getDesc();
                            textView2.setText(desc);
                            textView2.setOnClickListener(new i(keyDescObj, filtersObj));
                            int iMax2 = Math.max((int) (((double) (ViewUtils.S(textView2.getPaint(), desc) + ViewUtils.f(this.mContext, 12.0f))) + 0.5d), ViewUtils.f(this.mContext, 60.0f));
                            if (i14 != 0) {
                                iMax2 += iF;
                            }
                            int i17 = iMax + iMax2;
                            if (i17 >= iL) {
                                ?? linearLayout4 = new LinearLayout(this.mContext);
                                linearLayout4.setOrientation(0);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams3.setMargins(iF, 0, iF, iF);
                                linearLayout4.setLayoutParams(layoutParams3);
                                textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                linearLayout4.addView(textView2);
                                this.f89630k.addView(linearLayout4);
                                iMax = Math.max((int) (((double) (ViewUtils.S(textView2.getPaint(), desc) + ViewUtils.f(this.mContext, 12.0f))) + 0.5d), ViewUtils.f(this.mContext, 60.0f));
                                i10 = -2;
                                r14 = linearLayout4;
                            } else {
                                i10 = -2;
                                r14.addView(textView2);
                                iMax = i17;
                            }
                            i14++;
                            i12 = i10;
                            size = i15;
                            size2 = i16;
                            r10 = 0;
                            r14 = r14;
                        }
                        r10 = z10;
                        r14 = linearLayout3;
                    }
                    i13++;
                    i12 = i12;
                    size = size;
                    i11 = -1;
                    z10 = false;
                }
            }
            w4();
            PopupWindow popupWindow = new PopupWindow((View) linearLayout, -1, -1, true);
            this.f89629j = popupWindow;
            popupWindow.setTouchable(true);
            this.f89629j.setBackgroundDrawable(new BitmapDrawable());
            this.f89629j.setAnimationStyle(0);
            this.f89629j.setOnDismissListener(new j(view));
        }
        if (this.f89629j.isShowing() || view == null) {
            return;
        }
        if (o4()) {
            h4(true);
            w4();
        }
        ViewUtils.o0(this.f89629j, view);
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(this.mContext, R.anim.filter_slide_in);
        animationLoadAnimation.setAnimationListener(new a());
        this.f89630k.startAnimation(animationLoadAnimation);
        if (view instanceof TextView) {
            TextView textView3 = (TextView) view;
            textView3.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
            textView3.setText(getString(R.string.screening) + " " + lb.b.f131095k);
        }
    }

    private void u4(FiltersObj filtersObj, KeyDescObj keyDescObj) {
        List<KeyDescObj> filters;
        if (PatchProxy.proxy(new Object[]{filtersObj, keyDescObj}, this, changeQuickRedirect, false, 40249, new Class[]{FiltersObj.class, KeyDescObj.class}, Void.TYPE).isSupported || filtersObj == null || keyDescObj == null || (filters = filtersObj.getFilters()) == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : filters) {
            if (keyDescObj2.getKey() == null || !keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
            }
        }
    }

    private void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40254, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f89625f;
        View view = this.f89626g;
        StringBuilder sb2 = new StringBuilder("");
        List<FiltersObj> list = this.f89627h;
        if (list != null) {
            Iterator<FiltersObj> it = list.iterator();
            while (it.hasNext()) {
                KeyDescObj keyDescObjI4 = i4(it.next());
                if (keyDescObjI4 != null && keyDescObjI4.getIndex() != 0) {
                    if (sb2.length() != 0) {
                        sb2.append("·");
                    }
                    sb2.append(keyDescObjI4.getDesc());
                }
            }
        }
        if (sb2.length() == 0) {
            textView.setVisibility(8);
            view.setVisibility(8);
        } else {
            textView.setText(sb2);
            textView.setVisibility(0);
            view.setVisibility(0);
        }
    }

    private void w4() {
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40253, new Class[0], Void.TYPE).isSupported || (linearLayout = this.f89630k) == null) {
            return;
        }
        int childCount = linearLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.f89630k.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout2 = (LinearLayout) childAt;
                int childCount2 = linearLayout2.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = linearLayout2.getChildAt(i11);
                    if (childAt2 instanceof TextView) {
                        TextView textView = (TextView) childAt2;
                        KeyDescObj keyDescObj = (KeyDescObj) textView.getTag();
                        if (keyDescObj != null) {
                            if (keyDescObj.isChecked()) {
                                textView.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.mContext, 3.0f), this.mContext.getResources().getColor(R.color.text_primary_1_color), this.mContext.getResources().getColor(R.color.text_primary_1_color)));
                                textView.setTextColor(this.mContext.getResources().getColor(R.color.white));
                            } else {
                                textView.setBackgroundDrawable(ViewUtils.H(ViewUtils.f(this.mContext, 3.0f), this.mContext.getResources().getColor(R.color.divider_secondary_2_color), this.mContext.getResources().getColor(R.color.divider_secondary_2_color)));
                                textView.setTextColor(this.mContext.getResources().getColor(R.color.text_primary_1_color));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40238, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.layout_header_vp);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f89631l = getArguments().getString(f89620s);
        }
        View viewFindViewById = findViewById(R.id.list_header);
        this.f89621b = (BannerViewPager) viewFindViewById.findViewById(R.id.banner);
        this.f89622c = (HeyBoxTabLayout) viewFindViewById.findViewById(R.id.tl_sort_type);
        this.f89623d = (TextView) viewFindViewById.findViewById(R.id.tv_filter);
        this.f89624e = viewFindViewById.findViewById(R.id.iv_filter_mask);
        this.f89625f = (TextView) viewFindViewById.findViewById(R.id.tv_filter_desc);
        this.f89626g = viewFindViewById.findViewById(R.id.filter_divider);
        showLoading();
        l4();
        this.vp.setOnPageChangeListener(new b());
        this.f89622c.setupWithViewPager(this.vp);
    }

    public void k4() {
        PopupWindow popupWindow;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40247, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing() || (popupWindow = this.f89629j) == null || !popupWindow.isShowing()) {
            return;
        }
        this.f89630k.setVisibility(4);
        this.f89629j.dismiss();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40239, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }
}
