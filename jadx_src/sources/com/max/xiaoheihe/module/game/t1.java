package com.max.xiaoheihe.module.game;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.analytics.PageEventObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.max.hbcommon.bean.segmentfilter.FilterItem;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcommon.component.segmentfilters.GameFilterSliderTrendWithSwitch;
import com.max.hbcommon.component.segmentfilters.GameFilterSliderWithLegend;
import com.max.hbcommon.component.segmentfilters.SecondaryWindowSegmentFilterView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.FilterGroupObj;
import com.max.xiaoheihe.bean.game.GameDetailTagWrapperObj;
import com.max.xiaoheihe.bean.game.GameListObj;
import com.max.xiaoheihe.module.mall.NotificationType;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.xiaomi.mipush.sdk.Constants;
import df.n9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: GamesLibraryFragment.java */
/* JADX INFO: loaded from: classes11.dex */
public class t1 extends com.max.hbcommon.base.d implements GameSortedListFragment.f, com.max.xiaoheihe.view.callback.a {
    private static final String A = "filter";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f88337y = "all_tab";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f88338z = "current_tab_position";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private of.a f88339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private KeyDescObj f88340c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f88342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.viewpager.widget.a f88343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GameListObj f88344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FiltersObj f88345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f88346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<FilterGroup> f88347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private List<FilterGroup> f88348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.max.hbcommon.component.i f88349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private LinearLayout f88350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private n9 f88351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<FiltersObj> f88352o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<FiltersObj> f88353p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f88355r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private com.max.hbcommon.component.i f88356s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private LinearLayout f88357t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Map<String, String> f88359v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList<KeyDescObj> f88341d = new ArrayList<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f88354q = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private KeyDescObj f88358u = new KeyDescObj();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f88360w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private String f88361x = null;

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class a implements SegmentFilterView.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.SegmentFilterView.a
        public void a(@androidx.annotation.n0 KeyDescObj keyDescObj, int i10) {
            if (PatchProxy.proxy(new Object[]{keyDescObj, new Integer(i10)}, this, changeQuickRedirect, false, 34910, new Class[]{KeyDescObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            t1.this.f88346i = true;
            ((com.max.hbcommon.base.d) t1.this).mContext.sendBroadcast(new Intent(lb.a.D));
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34911, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            t1.this.f88351n.f113752k.o(((com.max.hbcommon.base.d) t1.this).mContext);
            t1 t1Var = t1.this;
            t1.Z3(t1Var, t1Var.f88351n.f113747f);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34912, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            t1.a4(t1.this);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34913, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            t1.this.K4();
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34914, new Class[]{View.class}, Void.TYPE).isSupported || t1.this.f88358u.isChecked()) {
                return;
            }
            t1.this.f88358u.setChecked(true);
            Iterator it = t1.this.f88353p.iterator();
            while (it.hasNext()) {
                List<KeyDescObj> filters = ((FiltersObj) it.next()).getFilters();
                if (filters != null) {
                    Iterator<KeyDescObj> it2 = filters.iterator();
                    while (it2.hasNext()) {
                        it2.next().setChecked(false);
                    }
                }
            }
            t1 t1Var = t1.this;
            t1.e4(t1Var, t1Var.f88357t);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f88368b;

        g(KeyDescObj keyDescObj) {
            this.f88368b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34915, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            KeyDescObj keyDescObj = this.f88368b;
            keyDescObj.setChecked(!keyDescObj.isChecked());
            t1.this.f88358u.setChecked(true ^ t1.f4(t1.this, true));
            t1 t1Var = t1.this;
            t1.e4(t1Var, t1Var.f88357t);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ImageView f88370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f88371c;

        h(ImageView imageView, TextView textView) {
            this.f88370b = imageView;
            this.f88371c = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34916, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            t1 t1Var = t1.this;
            t1Var.f88355r = true ^ t1Var.f88355r;
            if (t1.this.f88355r) {
                this.f88370b.setImageResource(R.drawable.common_select_single_filled_16x16);
                this.f88371c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else {
                this.f88370b.setImageResource(R.drawable.common_select_line_16x16);
                this.f88371c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            }
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34917, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (t1.i4(t1.this, true)) {
                t1.k4(t1.this, true, false);
            }
            t1 t1Var = t1.this;
            t1Var.f88354q = t1Var.f88355r;
            t1.this.K4();
            ((com.max.hbcommon.base.d) t1.this).mContext.sendBroadcast(new Intent(lb.a.D));
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34918, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Iterator it = t1.this.f88353p.iterator();
            while (it.hasNext()) {
                List<KeyDescObj> filters = ((FiltersObj) it.next()).getFilters();
                if (filters != null) {
                    Iterator<KeyDescObj> it2 = filters.iterator();
                    while (it2.hasNext()) {
                        it2.next().setChecked(false);
                    }
                }
            }
            t1.this.f88358u.setChecked(true);
            t1 t1Var = t1.this;
            t1.e4(t1Var, t1Var.f88357t);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34909, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((com.max.hbcommon.base.d) t1.this).mContext, lb.d.f131202l4);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class l implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 34922, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            t1.n4(t1.this);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34923, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            t1.this.J4();
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FilterGroup f88379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f88380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FilterItem f88381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f88382e;

        o(FilterGroup filterGroup, int i10, FilterItem filterItem, List list) {
            this.f88379b = filterGroup;
            this.f88380c = i10;
            this.f88381d = filterItem;
            this.f88382e = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34924, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (FilterGroup.TYPE_SINGLE.equals(this.f88379b.getType()) && !com.max.hbcommon.utils.c.u(this.f88379b.getProtocol()) && this.f88380c == 1) {
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) t1.this).mContext, this.f88379b.getProtocol());
            } else {
                if (this.f88381d.isCustom_checked()) {
                    return;
                }
                SecondaryWindowSegmentFilterView.A(this.f88382e, this.f88381d, FilterGroup.TYPE_MULTI.equals(this.f88379b.getType()));
                SecondaryWindowSegmentFilterView.z(this.f88379b, this.f88381d);
                t1 t1Var = t1.this;
                t1.q4(t1Var, t1Var.f88350m);
            }
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34925, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (t1.i4(t1.this, false)) {
                t1.k4(t1.this, false, false);
            }
            t1.this.J4();
            t1.N3(t1.this);
            ((com.max.hbcommon.base.d) t1.this).mContext.sendBroadcast(new Intent(lb.a.D));
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34926, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Iterator it = t1.this.f88347j.iterator();
            while (it.hasNext()) {
                SecondaryWindowSegmentFilterView.u((FilterGroup) it.next());
            }
            t1.this.J4();
            t1.N3(t1.this);
            ((com.max.hbcommon.base.d) t1.this).mContext.sendBroadcast(new Intent(lb.a.D));
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class r implements DialogInterface.OnDismissListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (PatchProxy.proxy(new Object[]{dialogInterface}, this, changeQuickRedirect, false, 34927, new Class[]{DialogInterface.class}, Void.TYPE).isSupported) {
                return;
            }
            t1.this.f88351n.f113752k.f67842b.getAdapter().notifyDataSetChanged();
            t1.N3(t1.this);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class s extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        s(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34920, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : t1.this.f88341d.size();
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34919, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            KeyDescObj keyDescObj = (KeyDescObj) t1.this.f88341d.get(i10);
            t1 t1Var = t1.this;
            KeyDescObj keyDescObjJ4 = t1.j4(t1Var, t1Var.f88345h);
            GameSortedListFragment gameSortedListFragmentC4 = GameSortedListFragment.c4(keyDescObj, keyDescObjJ4 != null ? keyDescObjJ4.getKey() : null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("getOpenHomeTab(mFilter): ");
            t1 t1Var2 = t1.this;
            sb2.append(t1.v4(t1Var2, t1Var2.f88340c));
            Log.d("GamesLibraryFragment", sb2.toString());
            Log.d("GamesLibraryFragment", "getItem mFilter: " + com.max.hbutils.utils.k.p(t1.this.f88340c));
            t1 t1Var3 = t1.this;
            if (i10 == t1.v4(t1Var3, t1Var3.f88340c) && t1.this.f88360w) {
                t1.this.f88360w = false;
                if (t1.this.f88344g != null && !com.max.hbcommon.utils.c.w(t1.this.f88344g.getGames())) {
                    gameSortedListFragmentC4.g4(t1.this.f88344g);
                }
            }
            return gameSortedListFragmentC4;
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@androidx.annotation.n0 Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34921, new Class[]{Integer.TYPE}, CharSequence.class);
            return patchProxyResultProxy.isSupported ? (CharSequence) patchProxyResultProxy.result : ((KeyDescObj) t1.this.f88341d.get(i10)).getDesc();
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class t implements ViewPager.i {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34928, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            t1.this.f88342e = i10;
            t1.B4(t1.this);
            t1.N3(t1.this);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class u implements com.max.hbcommon.component.segmentfilters.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.f
        public void a(@androidx.annotation.n0 FilterGroup filterGroup, @androidx.annotation.n0 FilterItem filterItem, int i10) {
            if (PatchProxy.proxy(new Object[]{filterGroup, filterItem, new Integer(i10)}, this, changeQuickRedirect, false, 34929, new Class[]{FilterGroup.class, FilterItem.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            t1.N3(t1.this);
            t1.O3(t1.this);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class v implements com.max.hbcommon.component.segmentfilters.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.d
        public void a(@androidx.annotation.n0 FilterGroup filterGroup, int i10) {
            if (PatchProxy.proxy(new Object[]{filterGroup, new Integer(i10)}, this, changeQuickRedirect, false, 34930, new Class[]{FilterGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (filterGroup.isSlider() || FilterGroup.TYPE_MULTI.equals(filterGroup.getType())) {
                t1.N3(t1.this);
                t1.O3(t1.this);
            }
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class w implements com.max.hbcommon.component.segmentfilters.e {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // com.max.hbcommon.component.segmentfilters.e
        public void a(@androidx.annotation.n0 FilterGroup filterGroup, int i10) {
            if (!PatchProxy.proxy(new Object[]{filterGroup, new Integer(i10)}, this, changeQuickRedirect, false, 34931, new Class[]{FilterGroup.class, Integer.TYPE}, Void.TYPE).isSupported && FilterGroup.TYPE_SINGLE.equals(filterGroup.getType())) {
                if (!com.max.hbcommon.utils.c.u(filterGroup.getProtocol())) {
                    com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) t1.this).mContext, filterGroup.getProtocol());
                } else if (t1.this.f88351n.f113752k.getSecondaryFilterItemClickListener() != null) {
                    t1.this.f88351n.f113752k.getSecondaryFilterItemClickListener().a(filterGroup, null, i10);
                }
            }
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class x extends com.max.hbcommon.network.d<Result<GameListObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.base.d f88392b;

        x(com.max.hbcommon.base.d dVar) {
            this.f88392b = dVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34932, new Class[]{Throwable.class}, Void.TYPE).isSupported && t1.this.isActive()) {
                super.onError(th2);
                t1.R3(t1.this);
            }
        }

        public void onNext(Result<GameListObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34933, new Class[]{Result.class}, Void.TYPE).isSupported && t1.this.isActive()) {
                super.onNext(result);
                t1.this.f88344g = result.getResult();
                t1.S3(t1.this);
                t1 t1Var = t1.this;
                t1Var.c(t1Var.f88344g);
                View viewT3 = t1.T3(t1.this, R.id.multi_status_view_container);
                if (viewT3 != null) {
                    com.max.xiaoheihe.module.mall.a.a(this.f88392b, result.getProtocol(), viewT3, ViewUtils.f(viewT3.getContext(), 170.0f), NotificationType.GAME_GET_GAME_LIST_V3);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34934, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GameListObj>) obj);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class y implements HBSecondaryMenuWindowTabLayout.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        y() {
        }

        @Override // com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout.a
        public void a(@androidx.annotation.p0 String str, @androidx.annotation.p0 String str2) {
        }

        @Override // com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout.a
        public void b(int i10, int i11) {
            Object[] objArr = {new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34935, new Class[]{cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            t1.U3(t1.this, i10);
        }
    }

    /* JADX INFO: compiled from: GamesLibraryFragment.java */
    public class z implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34936, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (t1.this.f88351n.f113752k.f67842b.canScrollHorizontally(0)) {
                t1.this.f88351n.f113748g.setVisibility(0);
            } else {
                t1.this.f88351n.f113748g.setVisibility(8);
            }
        }
    }

    static /* synthetic */ void B4(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34894, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.e5();
    }

    private void C4(boolean z10, boolean z11) {
        int size;
        int size2;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34883, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            List<FiltersObj> list = this.f88352o;
            List<FiltersObj> list2 = this.f88353p;
            if (list == null || list2 == null || (size2 = list.size()) != list2.size()) {
                return;
            }
            for (int i10 = 0; i10 < size2; i10++) {
                List<KeyDescObj> filters = list.get(i10).getFilters();
                List<KeyDescObj> filters2 = list2.get(i10).getFilters();
                int size3 = filters.size();
                if (size3 == filters2.size()) {
                    for (int i11 = 0; i11 < size3; i11++) {
                        KeyDescObj keyDescObj = filters.get(i11);
                        KeyDescObj keyDescObj2 = filters2.get(i11);
                        if (z11) {
                            keyDescObj2.setChecked(keyDescObj.isChecked());
                        } else {
                            keyDescObj.setChecked(keyDescObj2.isChecked());
                        }
                    }
                }
            }
            return;
        }
        List<FilterGroup> list3 = this.f88347j;
        List<FilterGroup> list4 = this.f88348k;
        if (list3 == null || list4 == null || (size = list3.size()) != list4.size()) {
            return;
        }
        for (int i12 = 0; i12 < size; i12++) {
            List<FilterItem> filters3 = list3.get(i12).getFilters();
            List<FilterItem> filters4 = list4.get(i12).getFilters();
            int size4 = filters3.size();
            if (size4 == filters4.size()) {
                if (!list3.get(i12).isNormalSlider() || !list4.get(i12).isNormalSlider()) {
                    for (int i13 = 0; i13 < size4; i13++) {
                        FilterItem filterItem = filters3.get(i13);
                        FilterItem filterItem2 = filters4.get(i13);
                        if (z11) {
                            filterItem2.setCustom_checked(filterItem.isCustom_checked());
                        } else {
                            filterItem.setCustom_checked(filterItem2.isCustom_checked());
                        }
                    }
                } else if (z11) {
                    list4.get(i12).setCustom_range(list3.get(i12).getCustom_range());
                } else {
                    list3.get(i12).setCustom_range(list4.get(i12).getCustom_range());
                }
            }
        }
    }

    private boolean E4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34866, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        KeyDescObj keyDescObj = this.f88340c;
        return (keyDescObj == null || com.max.hbcommon.utils.c.u(keyDescObj.getKey())) ? false : true;
    }

    private KeyDescObj F4(FiltersObj filtersObj) {
        List<KeyDescObj> filters;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 34881, new Class[]{FiltersObj.class}, KeyDescObj.class);
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

    private void G4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34860, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88360w = true;
        Log.d("GamesLibraryFragment", "getGameList mFilter: " + com.max.hbutils.utils.k.p(this.f88340c));
        Map<String, String> filter = getFilter();
        KeyDescObj keyDescObj = this.f88340c;
        if (keyDescObj != null) {
            if (!com.max.hbcommon.utils.c.u(keyDescObj.getList_type())) {
                filter.put("sort_type", this.f88340c.getList_type());
            } else if (!com.max.hbcommon.utils.c.u(this.f88340c.getSort())) {
                filter.put("sort_type", this.f88340c.getSort());
            }
        }
        showLoading();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w7(filter, 0, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new x(this)));
    }

    private int H4(KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 34864, new Class[]{KeyDescObj.class}, Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f88344g.getSort_types().size(); i11++) {
            KeyDescObj keyDescObj2 = this.f88344g.getSort_types().get(i11);
            if ("1".equals(keyDescObj2.getMulti())) {
                for (int i12 = 0; i12 < keyDescObj2.getData().size(); i12++) {
                    KeyDescObj keyDescObj3 = keyDescObj2.getData().get(i12);
                    if (keyDescObj != null && ((keyDescObj.getList_type() != null && keyDescObj.getList_type().equals(keyDescObj3.getKey())) || (keyDescObj.getSort() != null && keyDescObj.getSort().equals(keyDescObj3.getKey())))) {
                        i10 = i11;
                        break;
                    }
                }
            } else if (keyDescObj == null) {
                continue;
            } else {
                if (keyDescObj.getList_type() != null && keyDescObj.getList_type().equals(keyDescObj2.getKey())) {
                    return i11;
                }
                if (keyDescObj.getSort() != null && keyDescObj.getSort().equals(keyDescObj2.getKey())) {
                    return i11;
                }
            }
        }
        return i10;
    }

    private boolean I4(boolean z10) {
        List<KeyDescObj> filters;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34884, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<FiltersObj> list = z10 ? this.f88353p : this.f88352o;
        if (com.max.hbcommon.utils.c.w(list)) {
            return false;
        }
        for (FiltersObj filtersObj : list) {
            if (filtersObj != null && (filters = filtersObj.getFilters()) != null) {
                Iterator<KeyDescObj> it = filters.iterator();
                while (it.hasNext()) {
                    if (it.next().isChecked()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34858, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88359v = getFilter();
        this.f88351n.f113752k.setSecondaryFilterItemClickListener(new u());
        this.f88351n.f113752k.setDismissListener(new v());
        this.f88351n.f113752k.setFilterClickListener(new w());
    }

    private boolean M4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34879, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (!com.max.hbcommon.utils.c.w(this.f88347j)) {
            for (FilterGroup filterGroup : this.f88347j) {
                if (filterGroup.getShow_sort_type() == null || filterGroup.getShow_sort_type().contains(this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey())) {
                    if (filterGroup.isNormalSlider()) {
                        if (filterGroup.getCustom_range() != null && (filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getStart()) != 0 || filterGroup.getFilters().indexOf(filterGroup.getCustom_range().getEnd()) != filterGroup.getFilters().size() - 1)) {
                            return true;
                        }
                    } else if (filterGroup.getFilters().indexOf(SecondaryWindowSegmentFilterView.i(filterGroup, this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey())) > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static /* synthetic */ void N3(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34895, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.Z4();
    }

    private boolean N4(boolean z10) {
        int size;
        int size2;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34882, new Class[]{cls}, cls);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (z10) {
            List<FiltersObj> list = this.f88352o;
            List<FiltersObj> list2 = this.f88353p;
            if (list != null && list2 != null && (size2 = list.size()) == list2.size()) {
                for (int i10 = 0; i10 < size2; i10++) {
                    List<KeyDescObj> filters = list.get(i10).getFilters();
                    List<KeyDescObj> filters2 = list2.get(i10).getFilters();
                    int size3 = filters.size();
                    if (size3 == filters2.size()) {
                        for (int i11 = 0; i11 < size3; i11++) {
                            if (filters.get(i11).isChecked() != filters2.get(i11).isChecked()) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        List<FilterGroup> list3 = this.f88347j;
        List<FilterGroup> list4 = this.f88348k;
        if (list3 != null && list4 != null && (size = list3.size()) == list4.size()) {
            for (int i12 = 0; i12 < size; i12++) {
                List<FilterItem> filters3 = list3.get(i12).getFilters();
                List<FilterItem> filters4 = list4.get(i12).getFilters();
                int size4 = filters3.size();
                if (size4 == filters4.size()) {
                    if (list3.get(i12).isNormalSlider() && list4.get(i12).isNormalSlider()) {
                        if (!Objects.equals(list3.get(i12).getCustom_range(), list4.get(i12).getCustom_range())) {
                            return true;
                        }
                    } else {
                        for (int i13 = 0; i13 < size4; i13++) {
                            if (filters3.get(i13).isCustom_checked() != filters4.get(i13).isCustom_checked()) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    static /* synthetic */ void O3(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34896, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.O4();
    }

    private void O4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34859, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Map<String, String> filter = getFilter();
        Map<String, String> map = this.f88359v;
        if (map == null || !map.equals(filter)) {
            this.f88359v = filter;
            this.mContext.sendBroadcast(new Intent(lb.a.D));
        }
    }

    public static t1 P4(KeyDescObj keyDescObj, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{keyDescObj, str}, null, changeQuickRedirect, true, 34852, new Class[]{KeyDescObj.class, String.class}, t1.class);
        if (patchProxyResultProxy.isSupported) {
            return (t1) patchProxyResultProxy.result;
        }
        t1 t1Var = new t1();
        Bundle bundle = new Bundle();
        bundle.putSerializable(A, keyDescObj);
        bundle.putString(GameParticularTagListActivity.O, str);
        t1Var.setArguments(bundle);
        return t1Var;
    }

    private void Q4(int i10) {
        if (!PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34888, new Class[]{Integer.TYPE}, Void.TYPE).isSupported && i10 >= 0 && i10 < this.f88341d.size()) {
            Object objInstantiateItem = this.f88343f.instantiateItem((ViewGroup) this.f88351n.f113760s, i10);
            if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
                ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
            }
        }
    }

    static /* synthetic */ void R3(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34897, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.showError();
    }

    private void R4() {
        GameListObj gameListObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34868, new Class[0], Void.TYPE).isSupported || this.f88343f == null || (gameListObj = this.f88344g) == null || gameListObj.getSort_types() == null || this.f88344g.getSort_types().size() <= 0) {
            return;
        }
        this.f88341d.clear();
        this.f88343f.notifyDataSetChanged();
        n9 n9Var = this.f88351n;
        n9Var.f113753l.setupWithViewPager(n9Var.f113760s);
        this.f88341d.addAll(this.f88344g.getSort_types());
        SecondaryWindowSegmentFilterView.n(this.f88341d);
        this.f88343f.notifyDataSetChanged();
        this.f88351n.f113753l.setVisibility(0);
        S4();
        this.f88351n.f113760s.setCurrentItem(this.f88342e, false);
        this.f88342e = 0;
    }

    static /* synthetic */ void S3(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34898, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.showContentView();
    }

    private void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34869, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f88351n.f113753l.l0(this.f88341d);
    }

    static /* synthetic */ View T3(t1 t1Var, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t1Var, new Integer(i10)}, null, changeQuickRedirect, true, 34899, new Class[]{t1.class, Integer.TYPE}, View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : t1Var.findViewById(i10);
    }

    private void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34891, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        PageEventObj pageEventObj = new PageEventObj();
        pageEventObj.setType("3");
        pageEventObj.setPath(lb.d.f131291y2);
        JsonObject jsonObject = new JsonObject();
        KeyDescObj keyDescObjF4 = F4(this.f88345h);
        String key = keyDescObjF4 != null ? keyDescObjF4.getKey() : null;
        if (this.f88351n.f113760s.getCurrentItem() < this.f88341d.size()) {
            KeyDescObj keyDescObj = this.f88341d.get(this.f88351n.f113760s.getCurrentItem());
            if (com.max.hbcommon.utils.c.u(keyDescObj.getKey()) && "1".equals(keyDescObj.getMulti())) {
                jsonObject.addProperty("sort_type", keyDescObj.getData().get(0).getKey());
            } else {
                jsonObject.addProperty("sort_type", keyDescObj.getKey());
            }
        }
        jsonObject.addProperty("filter_head", key);
        pageEventObj.setAddition(jsonObject);
        pageEventObj.setTime(String.valueOf(System.currentTimeMillis() / 1000));
        com.max.hbcommon.analytics.d.c(pageEventObj, true);
    }

    static /* synthetic */ void U3(t1 t1Var, int i10) {
        if (PatchProxy.proxy(new Object[]{t1Var, new Integer(i10)}, null, changeQuickRedirect, true, 34900, new Class[]{t1.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.Q4(i10);
    }

    private void U4(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 34863, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        for (int i10 = 0; i10 < this.f88344g.getSort_types().size(); i10++) {
            KeyDescObj keyDescObj2 = this.f88344g.getSort_types().get(i10);
            if ("1".equals(keyDescObj2.getMulti())) {
                for (int i11 = 0; i11 < keyDescObj2.getData().size(); i11++) {
                    KeyDescObj keyDescObj3 = keyDescObj2.getData().get(i11);
                    if (keyDescObj == null || keyDescObj.getList_type() == null || !keyDescObj.getList_type().equals(keyDescObj3.getKey())) {
                        keyDescObj3.setChecked(false);
                    } else {
                        keyDescObj3.setChecked(true);
                        this.f88351n.f113760s.setCurrentItem(i10, false);
                        keyDescObj.setSort(keyDescObj.getList_type());
                        keyDescObj.setList_type(null);
                    }
                }
            } else if (keyDescObj == null || keyDescObj.getList_type() == null || !keyDescObj.getList_type().equals(keyDescObj2.getKey())) {
                keyDescObj2.setChecked(false);
            } else {
                keyDescObj2.setChecked(true);
                this.f88351n.f113760s.setCurrentItem(i10, false);
                keyDescObj.setList_type(null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r18v1, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r1v24, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r9v9 */
    private void W4(View view) {
        View view2;
        int i10;
        int i11;
        View view3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        ?? r10;
        int i17 = 1;
        ?? r11 = 0;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34877, new Class[]{View.class}, Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        com.max.hbcommon.component.i iVar = this.f88349l;
        if (iVar == null || !iVar.isShowing()) {
            if (N4(false)) {
                C4(false, true);
            }
            View viewInflate = this.mInflater.inflate(R.layout.dialog_game_library_filter, (ViewGroup) null, false);
            viewInflate.findViewById(R.id.v_blank).setOnClickListener(new m());
            ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.vg_scroll);
            LinearLayout linearLayout = new LinearLayout(this.mContext);
            this.f88350m = linearLayout;
            linearLayout.setOrientation(1);
            int i18 = -1;
            int i19 = -2;
            this.f88350m.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f88350m.setOnClickListener(new n());
            scrollView.addView(this.f88350m);
            int iF = ViewUtils.f(this.mContext, 8.0f);
            int iF2 = ViewUtils.f(this.mContext, 12.0f);
            int iF3 = ViewUtils.f(this.mContext, 12.0f);
            ViewUtils.f(this.mContext, 6.5f);
            int iF4 = ViewUtils.f(this.mContext, 8.0f);
            List<FilterGroup> list = this.f88348k;
            if (list != null) {
                int size = list.size();
                int i20 = 0;
                while (i20 < size) {
                    FilterGroup filterGroup = this.f88348k.get(i20);
                    if (filterGroup.getShow_sort_type() == null || filterGroup.getShow_sort_type().contains(this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey())) {
                        ?? textView = new TextView(this.mContext);
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                        if (i20 == 0) {
                            textView.setPadding(iF2, r11, iF2, r11);
                        } else {
                            textView.setPadding(iF2, iF2, iF2, r11);
                        }
                        textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                        textView.setTextSize(r11, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_13));
                        textView.setIncludeFontPadding(r11);
                        textView.setText(filterGroup.getDesc());
                        this.f88350m.addView(textView);
                        if (filterGroup.getFilters() == null) {
                            i10 = i20;
                            i11 = size;
                            view3 = viewInflate;
                            i12 = i19;
                            i13 = iF3;
                            i14 = iF4;
                            i15 = i18;
                        } else {
                            if (FilterGroup.TYPE_SLIDER.equals(filterGroup.getType())) {
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i18, i19);
                                layoutParams.bottomMargin = iF;
                                layoutParams.topMargin = iF;
                                this.f88350m.addView(SecondaryWindowSegmentFilterView.m(this.mContext, filterGroup), layoutParams);
                            } else if (FilterGroup.TYPE_SLIDER_WITH_TREND.equals(filterGroup.getType())) {
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i18, ViewUtils.f(this.mContext, 46.0f));
                                layoutParams2.bottomMargin = iF;
                                this.f88350m.addView(SecondaryWindowSegmentFilterView.l(this.mContext, filterGroup), layoutParams2);
                            } else if (FilterGroup.TYPE_SLIDER_TREND_WITH_SWITCH.equals(filterGroup.getType())) {
                                GameFilterSliderTrendWithSwitch gameFilterSliderTrendWithSwitch = new GameFilterSliderTrendWithSwitch(this.mContext);
                                gameFilterSliderTrendWithSwitch.setData(filterGroup);
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i18, ViewUtils.f(this.mContext, 46.0f));
                                layoutParams3.bottomMargin = iF;
                                this.f88350m.addView(gameFilterSliderTrendWithSwitch, layoutParams3);
                            } else if (FilterGroup.TYPE_SLIDER_WITH_LEGEND.equals(filterGroup.getType())) {
                                GameFilterSliderWithLegend gameFilterSliderWithLegend = new GameFilterSliderWithLegend(this.mContext);
                                gameFilterSliderWithLegend.setData(filterGroup);
                                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i18, ViewUtils.f(this.mContext, 46.0f));
                                layoutParams4.bottomMargin = iF;
                                this.f88350m.addView(gameFilterSliderWithLegend, layoutParams4);
                            } else {
                                List<FilterItem> listJ = SecondaryWindowSegmentFilterView.j(filterGroup.getFilters(), this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey());
                                List[] listArr = new List[i17];
                                listArr[r11] = listJ;
                                if (!com.max.hbcommon.utils.c.w(listArr)) {
                                    if (!SecondaryWindowSegmentFilterView.q(listJ)) {
                                        SecondaryWindowSegmentFilterView.setDefaultChecked(listJ, filterGroup.getDefault_check(), filterGroup.getType());
                                    }
                                    int size2 = listJ.size();
                                    int iL = ViewUtils.L(this.mContext) - (iF2 * 2);
                                    ?? linearLayout2 = new LinearLayout(this.mContext);
                                    linearLayout2.setOrientation(r11);
                                    LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, i19);
                                    layoutParams5.setMargins(iF2, iF, iF2, iF);
                                    linearLayout2.setLayoutParams(layoutParams5);
                                    this.f88350m.addView(linearLayout2);
                                    int iW = 0;
                                    int i21 = 0;
                                    ?? r12 = linearLayout2;
                                    while (i21 < size2) {
                                        FilterItem filterItem = listJ.get(i21);
                                        int i22 = iL;
                                        int i23 = size2;
                                        FilterGroup filterGroup2 = filterGroup;
                                        View view4 = viewInflate;
                                        View viewInflate2 = this.mInflater.inflate(R.layout.item_flex_filter, (ViewGroup) null, false);
                                        TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_filter_name);
                                        ImageView imageView = (ImageView) viewInflate2.findViewById(R.id.iv_icon);
                                        viewInflate2.setTag(filterItem);
                                        String desc = filterItem.getDesc();
                                        if (com.max.hbcommon.utils.c.u(filterItem.getImg_url())) {
                                            imageView.setVisibility(8);
                                        } else {
                                            imageView.setVisibility(0);
                                            com.max.hbimage.b.K(filterItem.getImg_url(), imageView);
                                        }
                                        textView2.setText(desc);
                                        ?? r18 = r12;
                                        int i24 = iF3;
                                        int i25 = i20;
                                        int i26 = size;
                                        int i27 = iF4;
                                        viewInflate2.setOnClickListener(new o(filterGroup2, i21, filterItem, listJ));
                                        int iW2 = ViewUtils.W(viewInflate2);
                                        if (i21 != 0) {
                                            iW2 += i27;
                                        }
                                        iW += iW2;
                                        if (iW >= i22) {
                                            LinearLayout linearLayout3 = new LinearLayout(this.mContext);
                                            linearLayout3.setOrientation(0);
                                            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
                                            layoutParams6.setMargins(iF2, 0, iF2, iF);
                                            linearLayout3.setLayoutParams(layoutParams6);
                                            linearLayout3.addView(viewInflate2, new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 30.0f)));
                                            this.f88350m.addView(linearLayout3);
                                            iW = (int) (((double) (ViewUtils.W(viewInflate2) + (i24 * 2))) + 0.5d);
                                            r10 = linearLayout3;
                                            i16 = -2;
                                        } else {
                                            i16 = -2;
                                            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 30.0f));
                                            if (i21 == 0) {
                                                layoutParams7.setMargins(0, 0, 0, 0);
                                            } else {
                                                layoutParams7.setMargins(i27, 0, 0, 0);
                                            }
                                            r18.addView(viewInflate2, layoutParams7);
                                            r10 = r18;
                                        }
                                        i21++;
                                        iF4 = i27;
                                        iL = i22;
                                        size2 = i23;
                                        viewInflate = view4;
                                        i20 = i25;
                                        size = i26;
                                        iF3 = i24;
                                        i19 = i16;
                                        filterGroup = filterGroup2;
                                        r12 = r10;
                                    }
                                    i10 = i20;
                                    i11 = size;
                                    view3 = viewInflate;
                                    i12 = i19;
                                    i13 = iF3;
                                    i14 = iF4;
                                    i15 = -1;
                                }
                            }
                            i10 = i20;
                            i11 = size;
                            view3 = viewInflate;
                            i12 = i19;
                            i13 = iF3;
                            i14 = iF4;
                            i15 = i18;
                        }
                    } else {
                        i10 = i20;
                        i11 = size;
                        view3 = viewInflate;
                        i12 = i19;
                        i13 = iF3;
                        i14 = iF4;
                        i15 = i18;
                    }
                    i20 = i10 + 1;
                    iF3 = i13;
                    i18 = i15;
                    iF4 = i14;
                    viewInflate = view3;
                    size = i11;
                    i17 = 1;
                    r11 = 0;
                    i19 = i12;
                }
                view2 = viewInflate;
                BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) view2.findViewById(R.id.vg_bottom_buttons);
                bottomButtonLeftItemView.setRightText(this.mContext.getResources().getString(R.string.complete));
                bottomButtonLeftItemView.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
                bottomButtonLeftItemView.setRightClickListener(new p());
                bottomButtonLeftItemView.setLeftClickListener(new q());
            } else {
                view2 = viewInflate;
            }
            c5(this.f88350m);
            com.max.hbcommon.component.i iVar2 = new com.max.hbcommon.component.i((Context) this.mContext, true, view2);
            this.f88349l = iVar2;
            iVar2.setCancelable(false);
            this.f88349l.setOnDismissListener(new r());
            if (this.f88349l.isShowing()) {
                return;
            }
            if (N4(false)) {
                c5(this.f88350m);
            }
            this.f88349l.show();
            T4();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v16, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r15v11, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r2v9, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r4v20, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r6v17, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v36, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, android.widget.LinearLayout$LayoutParams] */
    private void X4() {
        int i10;
        char c10;
        ?? r14;
        ?? r10;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34875, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        View viewInflate = this.mInflater.inflate(R.layout.dialog_game_filter, (ViewGroup) null, false);
        viewInflate.findViewById(R.id.v_blank).setOnClickListener(new d());
        ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.vg_scroll);
        scrollView.setBackgroundResource(R.drawable.white_top_8dp);
        LinearLayout linearLayout = new LinearLayout(this.mContext);
        this.f88357t = linearLayout;
        linearLayout.setOrientation(1);
        int i11 = -2;
        this.f88357t.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.f88357t.setOnClickListener(new e());
        scrollView.addView(this.f88357t);
        int iF = ViewUtils.f(this.mContext, 8.0f);
        int iF2 = ViewUtils.f(this.mContext, 12.0f);
        int iF3 = ViewUtils.f(this.mContext, 12.0f);
        int iF4 = ViewUtils.f(this.mContext, 6.5f);
        int iF5 = ViewUtils.f(this.mContext, 8.0f);
        List<FiltersObj> list = this.f88353p;
        if (list != null) {
            int size = list.size();
            TextView textView = new TextView(this.mContext);
            textView.setPadding(iF2, iF2, iF2, 0);
            textView.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
            textView.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_13));
            textView.setIncludeFontPadding(false);
            textView.setText(d0.f87251w);
            this.f88357t.addView(textView);
            LinearLayout linearLayout2 = new LinearLayout(this.mContext);
            linearLayout2.setOrientation(0);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iF2, iF, iF2, iF);
            linearLayout2.setLayoutParams(layoutParams);
            this.f88357t.addView(linearLayout2);
            View viewInflate2 = this.mInflater.inflate(R.layout.item_flex_filter, (ViewGroup) null, false);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.tv_filter_name);
            viewInflate2.setTag(this.f88358u);
            char c11 = 0;
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 30.0f));
            layoutParams2.setMargins(0, 0, 0, 0);
            viewInflate2.setPadding(iF3, iF4, iF3, iF4);
            textView2.setText("全部地区");
            viewInflate2.setOnClickListener(new f());
            linearLayout2.addView(viewInflate2, layoutParams2);
            int i12 = 0;
            while (i12 < size) {
                FiltersObj filtersObj = this.f88353p.get(i12);
                TextView textView3 = new TextView(this.mContext);
                textView3.setPadding(iF2, iF2, iF2, z10 ? 1 : 0);
                textView3.setTextColor(this.mContext.getResources().getColor(R.color.text_secondary_1_color));
                textView3.setTextSize(z10 ? 1 : 0, this.mContext.getResources().getDimensionPixelSize(R.dimen.text_size_13));
                textView3.setIncludeFontPadding(z10);
                textView3.setText(filtersObj.getGroup_name());
                this.f88357t.addView(textView3);
                if (filtersObj.getFilters() != null) {
                    int size2 = filtersObj.getFilters().size();
                    int i13 = iF2 * 2;
                    int iL = ViewUtils.L(this.mContext) - i13;
                    LinearLayout linearLayout3 = new LinearLayout(this.mContext);
                    linearLayout3.setOrientation(z10 ? 1 : 0);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i11);
                    layoutParams3.setMargins(iF2, iF, iF2, iF);
                    linearLayout3.setLayoutParams(layoutParams3);
                    this.f88357t.addView(linearLayout3);
                    int i14 = z10 ? 1 : 0;
                    int iW = i14;
                    while (i14 < size2) {
                        KeyDescObj keyDescObj = filtersObj.getFilters().get(i14);
                        FiltersObj filtersObj2 = filtersObj;
                        int i15 = size2;
                        int i16 = size;
                        View viewInflate3 = this.mInflater.inflate(R.layout.item_flex_filter, null, r10);
                        viewInflate3.setTag(keyDescObj);
                        ((TextView) viewInflate3.findViewById(R.id.tv_filter_name)).setText(keyDescObj.getDesc());
                        viewInflate3.setOnClickListener(new g(keyDescObj));
                        int iW2 = ViewUtils.W(viewInflate3);
                        if (i14 != 0) {
                            r10 = z10;
                            r14 = linearLayout3;
                            iW2 += iF5;
                        }
                        r10 = z10;
                        r14 = linearLayout3;
                        iW += iW2;
                        if (iW >= iL) {
                            ?? linearLayout4 = new LinearLayout(this.mContext);
                            linearLayout4.setOrientation(r10);
                            ?? layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                            layoutParams4.setMargins(iF2, r10, iF2, iF);
                            LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 30.0f));
                            this.f88357t.addView(linearLayout4, layoutParams4);
                            linearLayout4.addView(viewInflate3, layoutParams5);
                            iW = ViewUtils.W(viewInflate3) + i13;
                            r14 = linearLayout4;
                        } else {
                            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, ViewUtils.f(this.mContext, 30.0f));
                            if (i14 == 0) {
                                layoutParams6.setMargins(0, 0, 0, 0);
                            } else {
                                layoutParams6.setMargins(iF5, 0, 0, 0);
                            }
                            r14.addView(viewInflate3, layoutParams6);
                        }
                        i14++;
                        size = i16;
                        filtersObj = filtersObj2;
                        size2 = i15;
                        r10 = 0;
                        r14 = r14;
                    }
                    r10 = z10;
                    r14 = linearLayout3;
                    i10 = size;
                    c10 = 0;
                } else {
                    i10 = size;
                    c10 = c11;
                }
                i12++;
                c11 = c10;
                size = i10;
                z10 = false;
                i11 = -2;
            }
            ?? linearLayout5 = new LinearLayout(this.mContext);
            linearLayout5.setOrientation(0);
            LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams7.setMargins(iF2, iF, iF2, ViewUtils.f(this.mContext, 4.0f));
            ImageView imageView = new ImageView(this.mContext);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(ViewUtils.f(this.mContext, 14.0f), ViewUtils.f(this.mContext, 14.0f)));
            this.f88355r = this.f88354q;
            TextView textView4 = new TextView(this.mContext);
            if (this.f88355r) {
                imageView.setImageResource(R.drawable.common_select_single_filled_16x16);
                textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            } else {
                imageView.setImageResource(R.drawable.common_select_line_16x16);
                textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            }
            LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
            layoutParams8.leftMargin = ViewUtils.f(this.mContext, 6.0f);
            textView4.setIncludeFontPadding(false);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            textView4.setLayoutParams(layoutParams8);
            textView4.setText("设为默认地区 (勾选后默认为您展示所选区服价格信息)");
            linearLayout5.setGravity(16);
            linearLayout5.addView(imageView);
            linearLayout5.addView(textView4);
            this.f88357t.addView(linearLayout5, layoutParams7);
            linearLayout5.setOnClickListener(new h(imageView, textView4));
            BottomButtonLeftItemView bottomButtonLeftItemView = new BottomButtonLeftItemView(this.mContext);
            LinearLayout.LayoutParams layoutParams9 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams9.topMargin = iF;
            bottomButtonLeftItemView.setLayoutParams(layoutParams9);
            bottomButtonLeftItemView.setShowLeftButton(true);
            bottomButtonLeftItemView.k(false);
            bottomButtonLeftItemView.setRightText(this.mContext.getResources().getString(R.string.complete));
            bottomButtonLeftItemView.setLeftText(this.mContext.getResources().getString(R.string.reset));
            bottomButtonLeftItemView.setRightButtonStyle(BaseBottomButton.BaseBottomButtonStyle.BlackWhite);
            Activity activity = this.mContext;
            bottomButtonLeftItemView.setLeftBackground(com.max.hbutils.utils.q.M(com.max.hbutils.utils.q.o(this.mContext, R.color.transparent, ViewUtils.h0(activity, ViewUtils.m(activity, ViewUtils.W(bottomButtonLeftItemView), ViewUtils.f(this.mContext, 44.0f)))), this.mContext, R.color.text_primary_1_color, 1.0f));
            bottomButtonLeftItemView.setLeftTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            bottomButtonLeftItemView.setRightClickListener(new i());
            bottomButtonLeftItemView.setLeftClickListener(new j());
            this.f88357t.addView(bottomButtonLeftItemView);
        }
        this.f88358u.setChecked(!I4(true));
        g5(this.f88357t);
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.mContext, true, viewInflate);
        this.f88356s = iVar;
        iVar.setCancelable(true);
        this.f88356s.setOnDismissListener(new l());
        if (this.f88356s.isShowing()) {
            return;
        }
        if (N4(true)) {
            C4(true, true);
            this.f88358u.setChecked(!I4(true));
            g5(this.f88357t);
        }
        this.f88356s.show();
    }

    private void Y4(GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameListObj}, this, changeQuickRedirect, false, 34873, new Class[]{GameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(gameListObj.getFilters()) && gameListObj.getFilter_region() == null) {
            this.f88351n.f113756o.setVisibility(8);
            return;
        }
        b5();
        this.f88351n.f113756o.setVisibility(0);
        if (com.max.hbcommon.utils.c.w(gameListObj.getFilters())) {
            this.f88351n.f113747f.setVisibility(8);
            this.f88351n.f113757p.setVisibility(0);
            this.f88351n.f113746e.setVisibility(8);
            return;
        }
        this.f88351n.f113747f.setVisibility(0);
        if (gameListObj.getFilter_region() != null) {
            this.f88351n.f113757p.setVisibility(0);
            this.f88351n.f113746e.setVisibility(0);
        } else {
            this.f88351n.f113757p.setVisibility(8);
            this.f88351n.f113746e.setVisibility(8);
        }
    }

    static /* synthetic */ void Z3(t1 t1Var, View view) {
        if (PatchProxy.proxy(new Object[]{t1Var, view}, null, changeQuickRedirect, true, 34901, new Class[]{t1.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.W4(view);
    }

    private void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34878, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (M4()) {
            this.f88351n.f113747f.setChecked(true);
        } else {
            this.f88351n.f113747f.setChecked(false);
        }
    }

    static /* synthetic */ void a4(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34902, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.X4();
    }

    private void a5(List<FilterGroup> list, List<FilterGroup> list2) {
        if (PatchProxy.proxy(new Object[]{list, list2}, this, changeQuickRedirect, false, 34872, new Class[]{List.class, List.class}, Void.TYPE).isSupported || list == null || list.size() <= 0) {
            return;
        }
        this.f88347j = new ArrayList();
        for (FilterGroup filterGroup : list) {
            if (!SecondaryWindowSegmentFilterView.q(filterGroup.getFilters())) {
                SecondaryWindowSegmentFilterView.setDefaultChecked(filterGroup);
            }
            this.f88347j.add(filterGroup);
        }
        this.f88348k = new ArrayList();
        if (com.max.hbcommon.utils.c.w(list2)) {
            Iterator<FilterGroup> it = this.f88347j.iterator();
            while (it.hasNext()) {
                this.f88348k.add(it.next().deepCopyByJson());
            }
        } else {
            this.f88348k.addAll(list2);
        }
        this.f88351n.f113747f.setOnClickListener(new b());
    }

    private void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34887, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (I4(false)) {
            this.f88351n.f113754m.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
            this.f88351n.f113750i.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else {
            this.f88351n.f113754m.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.f88351n.f113750i.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        }
    }

    private void c5(ViewGroup viewGroup) {
        FilterItem filterItem;
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 34886, new Class[]{ViewGroup.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int childCount2 = linearLayout.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = linearLayout.getChildAt(i11);
                    if ((childAt2 instanceof ViewGroup) && (filterItem = (FilterItem) childAt2.getTag()) != null) {
                        SecondaryWindowSegmentFilterView.t(filterItem.isCustom_checked(), new com.max.hbcommon.base.adapter.s.e(R.layout.item_flex_filter, childAt2));
                    }
                }
            }
        }
    }

    private void d5(FiltersObj filtersObj) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{filtersObj}, this, changeQuickRedirect, false, 34871, new Class[]{FiltersObj.class}, Void.TYPE).isSupported || filtersObj == null) {
            return;
        }
        if (this.f88345h == null && (keyDescObj = this.f88340c) != null && keyDescObj.getFilter_head() != null && !com.max.hbcommon.utils.c.w(filtersObj.getFilters())) {
            for (KeyDescObj keyDescObj2 : filtersObj.getFilters()) {
                if (this.f88340c.getFilter_head().equals(keyDescObj2.getKey())) {
                    keyDescObj2.setChecked(true);
                } else {
                    keyDescObj2.setChecked(false);
                }
            }
        }
        this.f88345h = filtersObj;
        List<KeyDescObj> filters = filtersObj.getFilters();
        if (filters == null || filters.size() <= 0) {
            this.f88351n.f113744c.setVisibility(8);
            return;
        }
        this.f88351n.f113751j.setData(filters);
        this.f88351n.f113751j.setMOnTabCheckedListener(new a());
        this.f88351n.f113751j.d();
        this.f88351n.f113744c.setVisibility(0);
    }

    static /* synthetic */ void e4(t1 t1Var, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{t1Var, viewGroup}, null, changeQuickRedirect, true, 34903, new Class[]{t1.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.g5(viewGroup);
    }

    private void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34862, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f88347j)) {
            return;
        }
        if (!com.max.hbcommon.utils.c.w(this.f88344g.getOuter_filter_keys())) {
            ArrayList arrayList = new ArrayList();
            String key = this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey();
            for (String str : this.f88344g.getOuter_filter_keys()) {
                for (FilterGroup filterGroup : this.f88347j) {
                    if (SecondaryWindowSegmentFilterView.s(filterGroup.getShow_sort_type(), key) && str != null && str.equals(filterGroup.getKey())) {
                        arrayList.add(filterGroup);
                        if (!com.max.hbcommon.utils.c.w(filterGroup.getFilters())) {
                            for (FilterItem filterItem : filterGroup.getFilters()) {
                                filterItem.setHide(!SecondaryWindowSegmentFilterView.s(filterItem.getShow_sort_type(), key));
                            }
                            break;
                        }
                        break;
                    }
                }
            }
            this.f88351n.f113752k.setList(arrayList);
        }
        this.f88351n.f113752k.f67842b.getAdapter().notifyDataSetChanged();
        this.f88351n.f113752k.f67842b.post(new z());
        Z4();
    }

    static /* synthetic */ boolean f4(t1 t1Var, boolean z10) {
        Object[] objArr = {t1Var, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34904, new Class[]{t1.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : t1Var.I4(z10);
    }

    private void f5(FilterGroupObj filterGroupObj, boolean z10) {
        if (PatchProxy.proxy(new Object[]{filterGroupObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34874, new Class[]{FilterGroupObj.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (filterGroupObj == null || com.max.hbcommon.utils.c.w(filterGroupObj.getGroups())) {
            this.f88352o = null;
            return;
        }
        this.f88352o = new ArrayList();
        for (FiltersObj filtersObj : filterGroupObj.getGroups()) {
            List<KeyDescObj> filters = filtersObj.getFilters();
            if (!z10 && filters != null && filters.size() > 0) {
                for (int i10 = 0; i10 < filters.size(); i10++) {
                    KeyDescObj keyDescObj = filters.get(i10);
                    keyDescObj.setChecked(keyDescObj.isIs_default());
                }
            }
            this.f88352o.add(filtersObj);
        }
        this.f88353p = new ArrayList();
        for (FiltersObj filtersObj2 : this.f88352o) {
            FiltersObj filtersObj3 = new FiltersObj();
            filtersObj3.setGroup_name(filtersObj2.getGroup_name());
            ArrayList arrayList = new ArrayList();
            if (filtersObj2.getFilters() != null) {
                for (KeyDescObj keyDescObj2 : filtersObj2.getFilters()) {
                    KeyDescObj keyDescObj3 = new KeyDescObj();
                    keyDescObj3.setChecked(keyDescObj2.isChecked());
                    keyDescObj3.setDesc(keyDescObj2.getDesc());
                    keyDescObj3.setKey(keyDescObj2.getKey());
                    arrayList.add(keyDescObj3);
                }
            }
            filtersObj3.setFilters(arrayList);
            this.f88353p.add(filtersObj3);
        }
        this.f88351n.f113757p.setOnClickListener(new c());
    }

    private void g5(ViewGroup viewGroup) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 34885, new Class[]{ViewGroup.class}, Void.TYPE).isSupported || viewGroup == null) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof LinearLayout) {
                LinearLayout linearLayout = (LinearLayout) childAt;
                int childCount2 = linearLayout.getChildCount();
                for (int i11 = 0; i11 < childCount2; i11++) {
                    View childAt2 = linearLayout.getChildAt(i11);
                    if ((childAt2 instanceof ViewGroup) && (keyDescObj = (KeyDescObj) childAt2.getTag()) != null) {
                        SecondaryWindowSegmentFilterView.t(keyDescObj.isChecked(), new com.max.hbcommon.base.adapter.s.e(R.layout.item_flex_filter, childAt2));
                    }
                }
            }
        }
    }

    static /* synthetic */ boolean i4(t1 t1Var, boolean z10) {
        Object[] objArr = {t1Var, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34905, new Class[]{t1.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : t1Var.N4(z10);
    }

    static /* synthetic */ KeyDescObj j4(t1 t1Var, FiltersObj filtersObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t1Var, filtersObj}, null, changeQuickRedirect, true, androidx.exifinterface.media.a.f23348q5, new Class[]{t1.class, FiltersObj.class}, KeyDescObj.class);
        return patchProxyResultProxy.isSupported ? (KeyDescObj) patchProxyResultProxy.result : t1Var.F4(filtersObj);
    }

    static /* synthetic */ void k4(t1 t1Var, boolean z10, boolean z11) {
        Object[] objArr = {t1Var, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34906, new Class[]{t1.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.C4(z10, z11);
    }

    static /* synthetic */ void n4(t1 t1Var) {
        if (PatchProxy.proxy(new Object[]{t1Var}, null, changeQuickRedirect, true, 34907, new Class[]{t1.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.b5();
    }

    static /* synthetic */ void q4(t1 t1Var, ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{t1Var, viewGroup}, null, changeQuickRedirect, true, 34908, new Class[]{t1.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        t1Var.c5(viewGroup);
    }

    static /* synthetic */ int v4(t1 t1Var, KeyDescObj keyDescObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{t1Var, keyDescObj}, null, changeQuickRedirect, true, 34893, new Class[]{t1.class, KeyDescObj.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : t1Var.H4(keyDescObj);
    }

    @Override // com.max.xiaoheihe.view.callback.a
    public void D3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34890, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Q4(this.f88351n.f113760s.getCurrentItem());
    }

    public void D4(KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 34870, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (keyDescObj == null || this.f88343f == null) {
            this.f88340c = keyDescObj;
            return;
        }
        KeyDescObj keyDescObjF4 = F4(this.f88345h);
        if (keyDescObjF4 != null && keyDescObj.getFilter_head() != null && keyDescObj.getFilter_head().equals(keyDescObjF4.getKey())) {
            U4(keyDescObj);
            return;
        }
        this.f88346i = true;
        this.f88340c = keyDescObj;
        this.f88345h = null;
        this.f88347j = null;
        this.f88351n.f113752k.getList().clear();
        this.f88352o = null;
        this.f88341d.clear();
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setDesc("");
        this.f88341d.add(keyDescObj2);
        this.f88343f.notifyDataSetChanged();
        S4();
    }

    public void J4() {
        com.max.hbcommon.component.i iVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34880, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing() || (iVar = this.f88349l) == null || !iVar.isShowing()) {
            return;
        }
        this.f88349l.dismiss();
    }

    public void K4() {
        com.max.hbcommon.component.i iVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34876, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing() || (iVar = this.f88356s) == null || !iVar.isShowing()) {
            return;
        }
        this.f88357t.setVisibility(4);
        this.f88356s.dismiss();
    }

    public void V4(boolean z10) {
        this.f88346i = z10;
    }

    @Override // com.max.xiaoheihe.module.game.GameSortedListFragment.f
    public void c(GameListObj gameListObj) {
        if (PatchProxy.proxy(new Object[]{gameListObj}, this, changeQuickRedirect, false, 34861, new Class[]{GameListObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f88351n.f113744c.setVisibility(0);
        this.f88351n.f113758q.setVisibility(E4() ? 8 : 0);
        this.f88351n.f113759r.setVisibility(0);
        this.f88351n.f113753l.setOnSecondWindowItemCheckedListener(new y());
        if (gameListObj != null) {
            this.f88344g = gameListObj;
            boolean zIsRestored = gameListObj.isRestored();
            if (this.f88346i) {
                this.f88346i = false;
                d5(this.f88344g.getFilter_head());
                a5(this.f88344g.getFilters(), zIsRestored ? this.f88339b.g() : new ArrayList<>());
                f5(this.f88344g.getFilter_region(), zIsRestored);
                Y4(this.f88344g);
                R4();
                e5();
                U4(this.f88340c);
                L4();
            }
        }
    }

    @Override // com.max.xiaoheihe.module.game.GameSortedListFragment.f
    public Map<String, String> getFilter() {
        List<KeyDescObj> filters;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34865, new Class[0], Map.class);
        if (patchProxyResultProxy.isSupported) {
            return (Map) patchProxyResultProxy.result;
        }
        HashMap map = new HashMap(16);
        FiltersObj filtersObj = this.f88345h;
        if (filtersObj != null) {
            String key = filtersObj.getKey();
            KeyDescObj keyDescObjF4 = F4(this.f88345h);
            if (keyDescObjF4 != null) {
                map.put(key, keyDescObjF4.getKey());
            }
        }
        KeyDescObj keyDescObj = this.f88340c;
        if (keyDescObj != null && this.f88345h == null && !com.max.hbcommon.utils.c.u(keyDescObj.getFilter_head())) {
            map.put("filter_head", this.f88340c.getFilter_head());
        }
        List<FilterGroup> list = this.f88347j;
        if (list != null) {
            for (FilterGroup filterGroup : list) {
                String key2 = filterGroup.getKey();
                if (filterGroup.getShow_sort_type() == null || filterGroup.getShow_sort_type().contains(this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey())) {
                    if (filterGroup.isNormalSlider()) {
                        if (filterGroup.getCustom_range() != null) {
                            map.put(key2, filterGroup.getCustom_range().getStart().getKey() + Constants.ACCEPT_TIME_SEPARATOR_SP + filterGroup.getCustom_range().getEnd().getKey());
                        }
                    } else if (!FilterGroup.TYPE_MULTI.equals(filterGroup.getType())) {
                        FilterItem filterItemI = SecondaryWindowSegmentFilterView.i(filterGroup, this.f88341d.get(this.f88351n.f113760s.getCurrentItem()).getKey());
                        if (filterItemI != null) {
                            map.put(key2, filterItemI.getKey());
                        }
                    } else if (!com.max.hbcommon.utils.c.w(filterGroup.getFilters())) {
                        StringBuilder sb2 = new StringBuilder();
                        for (FilterItem filterItem : filterGroup.getFilters()) {
                            if (filterItem.isCustom_checked()) {
                                if (sb2.length() > 0) {
                                    sb2.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                }
                                sb2.append(filterItem.getKey());
                            }
                        }
                        if (sb2.length() > 0) {
                            map.put(key2, sb2.toString());
                        }
                    }
                }
            }
        }
        if (this.f88352o != null) {
            GameListObj gameListObj = this.f88344g;
            String key3 = (gameListObj == null || gameListObj.getFilter_region() == null || this.f88344g.getFilter_region().getKey() == null) ? "filter_region" : this.f88344g.getFilter_region().getKey();
            StringBuilder sb3 = new StringBuilder();
            for (FiltersObj filtersObj2 : this.f88352o) {
                if (filtersObj2 != null && (filters = filtersObj2.getFilters()) != null) {
                    for (KeyDescObj keyDescObj2 : filters) {
                        if (keyDescObj2.isChecked()) {
                            if (sb3.length() > 0) {
                                sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                            }
                            sb3.append(keyDescObj2.getKey());
                        }
                    }
                }
            }
            if (sb3.length() > 0) {
                map.put(key3, sb3.toString());
                if (this.f88354q) {
                    map.put("default_filter", "filter_region");
                }
            } else if (this.f88358u.isChecked()) {
                map.put(key3, "all");
                if (this.f88354q) {
                    map.put("default_filter", "filter_region");
                }
            }
        }
        if (!com.max.hbcommon.utils.c.u(this.f88361x)) {
            map.put(GameParticularTagListActivity.O, this.f88361x);
        }
        if (E4()) {
            if (GameDetailTagWrapperObj.TYPE_GENRES.equals(this.f88340c.getType())) {
                map.put("categories_id", this.f88340c.getKey());
            } else {
                map.put(SearchHelper.f91579g, this.f88340c.getKey());
            }
        }
        return map;
    }

    @Override // com.max.xiaoheihe.module.game.GameSortedListFragment.f
    public String getPlatform() {
        KeyDescObj keyDescObjF4;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34867, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        FiltersObj filtersObj = this.f88345h;
        if (filtersObj == null || (keyDescObjF4 = F4(filtersObj)) == null) {
            return null;
        }
        return keyDescObjF4.getKey();
    }

    @Override // com.max.xiaoheihe.module.game.GameSortedListFragment.f
    public View h3() {
        return this.f88351n.f113755n;
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34856, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.x("GamesLibraryFragment, initData, , mPageListsize = " + this.f88341d.size());
        this.f88343f = new s(getChildFragmentManager());
        this.f88351n.f113760s.setOnPageChangeListener(new t());
        this.f88351n.f113760s.setAdapter(this.f88343f);
        this.f88351n.f113753l.setVisibility(8);
        if (this.f88341d.isEmpty()) {
            G4();
            return;
        }
        GameListObj gameListObjC = this.f88339b.c();
        if (gameListObjC != null) {
            c(gameListObjC);
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34855, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        n9 n9VarD = n9.d(this.mInflater, null, false);
        this.f88351n = n9VarD;
        setContentView(n9VarD);
        if (getArguments() != null) {
            if (this.f88340c == null) {
                this.f88340c = (KeyDescObj) getArguments().getSerializable(A);
            }
            this.f88361x = getArguments().getString(GameParticularTagListActivity.O);
        }
        this.f88346i = true;
        this.f88351n.f113744c.setVisibility(8);
        this.f88351n.f113744c.setRadius(ViewUtils.m(this.mContext, ViewUtils.W(this.f88351n.f113744c), ViewUtils.f(this.mContext, 30.0f)));
        this.f88351n.f113758q.setVisibility(8);
        this.f88351n.f113749h.setOnClickListener(new k());
        this.f88351n.f113759r.setVisibility(8);
        this.f88351n.f113747f.setImage(R.drawable.common_filter_filled_24x24);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onCreate(@androidx.annotation.p0 Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 34853, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        this.f88339b = (of.a) new androidx.lifecycle.y0(this).a(of.a.class);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 34854, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        of.a aVar = this.f88339b;
        if (aVar != null) {
            this.f88342e = aVar.e();
            this.f88341d = this.f88339b.f();
            this.f88348k = this.f88339b.g();
            GameListObj gameListObjC = this.f88339b.c();
            this.f88344g = gameListObjC;
            if (gameListObjC != null) {
                this.f88347j = gameListObjC.getFilters();
                this.f88345h = this.f88344g.getFilter_head();
            }
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34889, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRefresh();
        G4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 34857, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        this.f88339b.i(this.f88351n.f113760s.getCurrentItem());
        GameListObj gameListObj = this.f88344g;
        if (gameListObj != null) {
            gameListObj.setRestored(true);
            this.f88344g.setFilters(this.f88347j);
            this.f88344g.setFilter_head(this.f88345h);
            FilterGroupObj filterGroupObj = new FilterGroupObj();
            GameListObj gameListObj2 = this.f88344g;
            if (gameListObj2 != null && gameListObj2.getFilter_region() != null && this.f88344g.getFilter_region().getKey() != null) {
                filterGroupObj.setKey(this.f88344g.getFilter_region().getKey());
            }
            filterGroupObj.setGroups(this.f88352o);
            this.f88344g.setFilter_region(filterGroupObj);
            this.f88339b.h(this.f88344g);
            this.f88339b.m(this.f88348k);
        }
        if (com.max.hbcommon.utils.c.w(this.f88341d)) {
            return;
        }
        this.f88339b.k(this.f88341d);
    }
}
