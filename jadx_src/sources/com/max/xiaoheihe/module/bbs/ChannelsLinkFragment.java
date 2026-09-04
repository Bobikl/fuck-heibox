package com.max.xiaoheihe.module.bbs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.card.CardParam;
import com.max.hbcommon.component.card.CardViewGenerator;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTopicLinksObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicMenuObj;
import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.max.xiaoheihe.bean.bbs.HeaderNavObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131178i1)
public class ChannelsLinkFragment extends com.max.hbcommon.base.d implements com.max.xiaoheihe.module.bbs.c.h, com.max.xiaoheihe.module.bbs.c.i {
    public static final String A = "scroll_distance";
    public static final float B = 70.0f;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f79654w = "topic_id";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f79655x = "hashtag_name";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f79656y = "extra_params";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final String f79657z = "filters";

    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f79658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f79659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f79660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BBSTopicLinksObj f79661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f79662f;

    @BindView(R.id.fbv_sort)
    FilterButtonView fbv_sort;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f79663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.max.hbcommon.base.adapter.s<HeaderNavObj> f79664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f79665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private KeyDescObj f79666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f79667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f79668l;

    @BindView(R.id.ll_header)
    LinearLayout ll_header;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private i f79670n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f79671o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f79672p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private BBSTopicMenuObj f79674r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private androidx.viewpager.widget.a f79676t;

    @BindView(R.id.tab_bottom_divider)
    View tab_bottom_divider;

    @BindView(R.id.tl)
    TabLayout tl;

    @BindView(R.id.vg_filter)
    View vg_filter;

    @BindView(R.id.vg_tab_bar)
    ViewGroup vg_tab_bar;

    @BindView(R.id.vp)
    ViewPager vp;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<HeaderNavObj> f79669m = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ArrayList<BBSTopicMenuObj> f79673q = new ArrayList<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f79675s = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f79677u = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private HashMap<Integer, List<KeyDescObj>> f79678v = new HashMap<>();

    public class a extends androidx.fragment.app.n0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26000, new Class[0], Integer.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            if (ChannelsLinkFragment.this.f79673q != null) {
                return ChannelsLinkFragment.this.f79673q.size();
            }
            return 0;
        }

        @Override // androidx.fragment.app.n0
        public Fragment getItem(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25999, new Class[]{Integer.TYPE}, Fragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (Fragment) patchProxyResultProxy.result;
            }
            if (!com.max.hbcommon.utils.c.w(ChannelsLinkFragment.this.f79673q) && BBSTopicMenuObj.TYPE_HOT_POINT.equals(((BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10)).getType())) {
                return ChannelsNewsFragment.K4(ChannelsLinkFragment.this.f79658b, ((BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10)).getParams());
            }
            if (com.max.hbcommon.utils.c.w(ChannelsLinkFragment.this.f79673q) || !"webview".equals(((BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10)).getType())) {
                return BBSTopicMenuObj.TYPE_WATERFALL.equals(((BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10)).getType()) ? com.max.xiaoheihe.module.bbs.concept.a.Q3() : com.max.xiaoheihe.module.bbs.c.X3();
            }
            return new com.max.xiaoheihe.module.webview.u(((BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10)).getUrl()).u(true).r(true).m(true).a();
        }

        @Override // androidx.viewpager.widget.a
        public int getItemPosition(@androidx.annotation.n0 Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.a
        @androidx.annotation.p0
        public CharSequence getPageTitle(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26001, new Class[]{Integer.TYPE}, CharSequence.class);
            if (patchProxyResultProxy.isSupported) {
                return (CharSequence) patchProxyResultProxy.result;
            }
            return ChannelsLinkFragment.this.f79673q != null ? ((BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10)).getTitle() : "";
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
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 26002, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            try {
                TabLayout tabLayout = ChannelsLinkFragment.this.tl;
                tabLayout.R(tabLayout.D(i10));
                if (((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext instanceof ChannelsDetailActivity) {
                    ChannelsDetailActivity channelsDetailActivity = (ChannelsDetailActivity) ((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext;
                    if (channelsDetailActivity.isActive()) {
                        BBSTopicMenuObj bBSTopicMenuObj = (BBSTopicMenuObj) ChannelsLinkFragment.this.f79673q.get(i10);
                        if (i10 != 0 && (bBSTopicMenuObj == null || bBSTopicMenuObj.getPost_btn() == null)) {
                            z10 = false;
                        }
                        channelsDetailActivity.T3(z10);
                    }
                }
            } catch (Throwable th2) {
                com.max.heybox.hblog.g.G("ChannelsLinkFragment onPageSelected error: " + th2.getMessage());
            }
        }
    }

    public class c extends com.max.hbcommon.network.d<Result<BBSTopicLinksObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f79681b;

        c(int i10) {
            this.f79681b = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26003, new Class[0], Void.TYPE).isSupported && ChannelsLinkFragment.this.isActive()) {
                super.onComplete();
                ChannelsLinkFragment.i4(ChannelsLinkFragment.this);
                if (ChannelsLinkFragment.this.f79672p) {
                    ChannelsLinkFragment.this.f79672p = false;
                    ChannelsLinkFragment.l4(ChannelsLinkFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 26004, new Class[]{Throwable.class}, Void.TYPE).isSupported && ChannelsLinkFragment.this.isActive()) {
                super.onError(th2);
                ChannelsLinkFragment.m4(ChannelsLinkFragment.this);
                ChannelsLinkFragment.i4(ChannelsLinkFragment.this);
                ChannelsLinkFragment.this.f79672p = false;
            }
        }

        public void onNext(Result<BBSTopicLinksObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 26005, new Class[]{Result.class}, Void.TYPE).isSupported && ChannelsLinkFragment.this.isActive()) {
                super.onNext(result);
                ChannelsLinkFragment.this.f79661e = result.getResult();
                ChannelsLinkFragment.p4(ChannelsLinkFragment.this, this.f79681b);
                if (ChannelsLinkFragment.this.f79670n != null) {
                    ChannelsLinkFragment.this.f79670n.n0(ChannelsLinkFragment.this.f79661e);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 26006, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BBSTopicLinksObj>) obj);
        }
    }

    public class d implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f79683b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f79684c;

        d(boolean z10, List list) {
            this.f79683b = z10;
            this.f79684c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26007, new Class[0], Void.TYPE).isSupported && ChannelsLinkFragment.this.isActive()) {
                androidx.viewpager.widget.a aVar = ChannelsLinkFragment.this.f79676t;
                ViewPager viewPager = ChannelsLinkFragment.this.vp;
                Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
                if (objInstantiateItem instanceof y) {
                    ((y) objInstantiateItem).l0(this.f79683b, this.f79684c);
                }
            }
        }
    }

    public class e extends com.max.hbcommon.base.adapter.s<HeaderNavObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ HeaderNavObj f79687b;

            a(HeaderNavObj headerNavObj) {
                this.f79687b = headerNavObj;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26010, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.base.router.b.k0(((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext, this.f79687b.getProtocol());
            }
        }

        e(Context context, List list, int i10) {
            super(context, list, i10);
        }

        public void m(com.max.hbcommon.base.adapter.s.e eVar, HeaderNavObj headerNavObj) {
            if (PatchProxy.proxy(new Object[]{eVar, headerNavObj}, this, changeQuickRedirect, false, 26008, new Class[]{com.max.hbcommon.base.adapter.s.e.class, HeaderNavObj.class}, Void.TYPE).isSupported) {
                return;
            }
            eVar.b().setOnClickListener(new a(headerNavObj));
            ViewGroup.LayoutParams layoutParams = eVar.b().getLayoutParams();
            if (ChannelsLinkFragment.this.f79669m.size() > 5) {
                layoutParams.width = (ViewUtils.L(((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext) * 2) / 11;
            } else if (ChannelsLinkFragment.this.f79669m.size() > 0) {
                layoutParams.width = (ViewUtils.L(((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext) - ((ViewUtils.L(((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext) - (ViewUtils.f(((com.max.hbcommon.base.d) ChannelsLinkFragment.this).mContext, 70.0f) * ChannelsLinkFragment.this.f79669m.size())) / (ChannelsLinkFragment.this.f79669m.size() + 1))) / ChannelsLinkFragment.this.f79669m.size();
            }
            eVar.b().setLayoutParams(layoutParams);
            ((TextView) eVar.i(R.id.tv_desc)).setText(headerNavObj.getText());
            com.max.hbimage.b.K(headerNavObj.getImg(), (ImageView) eVar.i(R.id.iv_icon));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, HeaderNavObj headerNavObj) {
            if (PatchProxy.proxy(new Object[]{eVar, headerNavObj}, this, changeQuickRedirect, false, 26009, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, headerNavObj);
        }
    }

    public class f implements TabLayout.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(TabLayout.h hVar) {
            int iK;
            if (!PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 26011, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported && (iK = hVar.k()) < ChannelsLinkFragment.this.f79673q.size() && iK >= 0) {
                ChannelsLinkFragment.V3(ChannelsLinkFragment.this, iK);
                ChannelsLinkFragment channelsLinkFragment = ChannelsLinkFragment.this;
                channelsLinkFragment.f79674r = (BBSTopicMenuObj) channelsLinkFragment.f79673q.get(iK);
                ChannelsLinkFragment.this.vp.setCurrentItem(iK);
                ChannelsLinkFragment channelsLinkFragment2 = ChannelsLinkFragment.this;
                ChannelsLinkFragment.Y3(channelsLinkFragment2, ((BBSTopicMenuObj) channelsLinkFragment2.f79673q.get(iK)).getType());
                TextView textView = (TextView) hVar.g().findViewById(R.id.text);
                if (textView != null) {
                    textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                }
                ChannelsLinkFragment channelsLinkFragment3 = ChannelsLinkFragment.this;
                if (ChannelsLinkFragment.Z3(channelsLinkFragment3, ((BBSTopicMenuObj) channelsLinkFragment3.f79673q.get(iK)).getType())) {
                    return;
                }
                ChannelsLinkFragment.a4(ChannelsLinkFragment.this);
                Object objInstantiateItem = ChannelsLinkFragment.this.f79676t.instantiateItem((ViewGroup) ChannelsLinkFragment.this.vp, iK);
                if (!(objInstantiateItem instanceof com.max.xiaoheihe.module.bbs.c) || ((com.max.xiaoheihe.module.bbs.c) objInstantiateItem).S3()) {
                    return;
                }
                ChannelsLinkFragment.b4(ChannelsLinkFragment.this);
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(TabLayout.h hVar) {
            if (PatchProxy.proxy(new Object[]{hVar}, this, changeQuickRedirect, false, 26012, new Class[]{TabLayout.h.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsLinkFragment.c4(ChannelsLinkFragment.this);
            TextView textView = (TextView) hVar.g().findViewById(R.id.text);
            if (textView != null) {
                textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(TabLayout.h hVar) {
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f79690b;

        g(List list) {
            this.f79690b = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 26013, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ChannelsLinkFragment channelsLinkFragment = ChannelsLinkFragment.this;
            ChannelsLinkFragment.d4(channelsLinkFragment, channelsLinkFragment.fbv_sort, this.f79690b);
        }
    }

    public class h implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f79692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FilterButtonView f79693b;

        h(List list, FilterButtonView filterButtonView) {
            this.f79692a = list;
            this.f79693b = filterButtonView;
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 26014, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            for (KeyDescObj keyDescObj2 : this.f79692a) {
                if (keyDescObj2.getKey().equals(keyDescObj.getKey())) {
                    ChannelsLinkFragment.this.f79666j = keyDescObj2;
                    break;
                }
            }
            ChannelsLinkFragment.f4(ChannelsLinkFragment.this, this.f79692a, keyDescObj);
            ChannelsLinkFragment.g4(ChannelsLinkFragment.this, this.f79693b);
            ChannelsLinkFragment.a4(ChannelsLinkFragment.this);
            ChannelsLinkFragment.b4(ChannelsLinkFragment.this);
        }
    }

    public interface i {
        void f(View view, int i10, int i11);

        void n0(BBSTopicLinksObj bBSTopicLinksObj);
    }

    private void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.vg_tab_bar.setVisibility(0);
    }

    public static ChannelsLinkFragment B4(String str, String str2, HashMap<String, String> map, ArrayList<BBSTopicMenuObj> arrayList, String str3, String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, map, arrayList, str3, str4}, null, changeQuickRedirect, true, 25946, new Class[]{String.class, String.class, HashMap.class, ArrayList.class, String.class, String.class}, ChannelsLinkFragment.class);
        if (patchProxyResultProxy.isSupported) {
            return (ChannelsLinkFragment) patchProxyResultProxy.result;
        }
        ChannelsLinkFragment channelsLinkFragment = new ChannelsLinkFragment();
        Bundle bundle = new Bundle();
        bundle.putString("topic_id", str);
        bundle.putString("hashtag_name", str2);
        bundle.putSerializable("extra_params", map);
        bundle.putSerializable(f79657z, arrayList);
        bundle.putString(ChannelsDetailActivity.f79593c4, str3);
        bundle.putString(ChannelsDetailActivity.f79594d4, str4);
        channelsLinkFragment.setArguments(bundle);
        return channelsLinkFragment;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void C3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25959, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f79676t;
        ViewPager viewPager = this.vp;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
        if (objInstantiateItem instanceof y) {
            ((y) objInstantiateItem).C3();
        }
    }

    private boolean C4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25978, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return BBSTopicMenuObj.TYPE_HOT_POINT.equals(str) || "webview".equals(str);
    }

    private void D4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25962, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f79662f == 0) {
            this.f79671o = 0;
        }
        if (this.f79661e == null) {
            return;
        }
        if (this.f79678v.get(Integer.valueOf(i10)) == null) {
            this.f79678v.put(Integer.valueOf(i10), this.f79661e.getSort_filter());
        }
        J4(i10);
        if (!this.f79675s) {
            this.ll_header.removeAllViews();
            if (!com.max.hbcommon.utils.c.w(this.f79661e.getBanner())) {
                View viewInflate = this.mInflater.inflate(R.layout.item_banner, (ViewGroup) this.ll_header, false);
                BannerViewPager<AdsBannerObj> bannerViewPager = (BannerViewPager) viewInflate.findViewById(R.id.banner);
                this.f79665i = bannerViewPager;
                com.max.hbcommon.utils.b.f(bannerViewPager, this.f79661e.getBanner());
                CardView cardView = new CardView(this.mContext);
                int iF = ViewUtils.f(this.mContext, 12.0f);
                int iL = ((ViewUtils.L(this.mContext) - (iF * 2)) * 67) / bb.c.b.N3;
                viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, iL));
                cardView.addView(viewInflate);
                cardView.setCardElevation(0.0f);
                cardView.setCardBackgroundColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, iL);
                marginLayoutParams.setMargins(iF, 0, iF, 0);
                cardView.setLayoutParams(marginLayoutParams);
                this.ll_header.addView(cardView);
                cardView.setRadius(ViewUtils.p(this.mContext, this.f79665i, ViewUtils.ViewType.IMAGE));
            }
            if (this.f79661e.getHashtags() != null) {
                View viewInflate2 = this.mInflater.inflate(R.layout.item_bbs_hashtag_recommed_header, (ViewGroup) this.ll_header, false);
                G4((LinearLayout) viewInflate2.findViewById(R.id.ll_container));
                this.ll_header.addView(viewInflate2);
            }
            if (!com.max.hbcommon.utils.c.w(this.f79661e.getHeader_navs())) {
                this.f79669m.clear();
                this.f79669m.addAll(this.f79661e.getHeader_navs());
                View viewInflate3 = this.mInflater.inflate(R.layout.item_bbs_img_tab_header, (ViewGroup) this.ll_header, false);
                RecyclerView recyclerView = (RecyclerView) viewInflate3.findViewById(R.id.rv_img_tab);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
                linearLayoutManager.setOrientation(0);
                recyclerView.setLayoutManager(linearLayoutManager);
                e eVar = new e(this.mContext, this.f79669m, R.layout.item_img_tab);
                this.f79664h = eVar;
                recyclerView.setAdapter(eVar);
                int iL2 = ((this.f79669m.size() <= 0 || this.f79669m.size() > 5) ? 0 : (ViewUtils.L(this.mContext) - (ViewUtils.f(this.mContext, 70.0f) * this.f79669m.size())) / (this.f79669m.size() + 1)) / 2;
                recyclerView.setPadding(iL2, 0, iL2, 0);
                this.ll_header.addView(viewInflate3);
            }
            View view = new View(this.mContext);
            view.setLayoutParams(new ViewGroup.LayoutParams(ViewUtils.f(this.mContext, 0.5f), ViewUtils.f(this.mContext, 0.5f)));
            this.ll_header.addView(view);
            this.f79675s = true;
        }
        this.f79663g = this.f79661e.getLastval();
        F4(this.f79662f == 0, this.f79661e.getLinks());
    }

    private void E4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25972, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f79673q)) {
            return;
        }
        BBSTopicMenuObj bBSTopicMenuObj = this.f79673q.get(0);
        this.f79674r = bBSTopicMenuObj;
        s4(bBSTopicMenuObj.getType());
        this.tl.L();
        if (!com.max.hbcommon.utils.c.w(this.f79673q)) {
            for (int i10 = 0; i10 < this.f79673q.size(); i10++) {
                TabLayout.h hVarI = this.tl.I();
                hVarI.u(R.layout.layout_plain_tab);
                TextView textView = (TextView) hVarI.g().findViewById(R.id.text);
                if (textView != null) {
                    if (this.f79674r == this.f79673q.get(i10)) {
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
                    } else {
                        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
                    }
                    textView.setText(this.f79673q.get(i10).getTitle());
                }
                this.tl.i(hVarI);
            }
        }
        this.tl.h(new f());
        this.f79676t.notifyDataSetChanged();
    }

    private void F4(boolean z10, List<FeedsContentBaseObj> list) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), list}, this, changeQuickRedirect, false, 25961, new Class[]{Boolean.TYPE, List.class}, Void.TYPE).isSupported) {
            return;
        }
        this.vp.post(new d(z10, list));
    }

    private void G4(ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 25957, new Class[]{ViewGroup.class}, Void.TYPE).isSupported || viewGroup == null || this.f79661e.getHashtags() == null) {
            return;
        }
        viewGroup.removeAllViews();
        ArrayList arrayList = new ArrayList();
        Iterator<HashtagObj> it = this.f79661e.getHashtags().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toConceptPostTagObj());
        }
        CardViewGenerator.e().c(viewGroup, new CardParam.a(this.mContext).j(arrayList).p(1).k(CardParam.DISPLAY_MODE.INF).c());
    }

    private void H4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25973, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79662f = 0;
        this.f79663g = null;
        q4();
    }

    private void I4(FilterButtonView filterButtonView) {
        KeyDescObj keyDescObj;
        if (PatchProxy.proxy(new Object[]{filterButtonView}, this, changeQuickRedirect, false, 25979, new Class[]{FilterButtonView.class}, Void.TYPE).isSupported || (keyDescObj = this.f79666j) == null) {
            return;
        }
        filterButtonView.setText(keyDescObj.getText());
    }

    private void J4(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25974, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        String type = null;
        if (!com.max.hbcommon.utils.c.w(this.f79673q) && i10 >= 0 && i10 < this.f79673q.size()) {
            type = this.f79673q.get(i10).getType();
        }
        List<KeyDescObj> list = this.f79678v.get(Integer.valueOf(i10));
        this.f79666j = u4(list);
        if (C4(type) || com.max.hbcommon.utils.c.w(list)) {
            this.vg_filter.setVisibility(8);
            return;
        }
        this.vg_filter.setVisibility(0);
        I4(this.fbv_sort);
        this.fbv_sort.setOnClickListener(new g(list));
    }

    private void K4() {
        this.f79666j = null;
    }

    private void M4(List<KeyDescObj> list, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{list, keyDescObj}, this, changeQuickRedirect, false, 25976, new Class[]{List.class, KeyDescObj.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(list) || keyDescObj == null || keyDescObj.getKey() == null) {
            return;
        }
        for (KeyDescObj keyDescObj2 : list) {
            if (keyDescObj.getKey().equals(keyDescObj2.getKey())) {
                keyDescObj2.setChecked(true);
            } else {
                keyDescObj2.setChecked(false);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void N4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25958, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f79676t;
        ViewPager viewPager = this.vp;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
        if (objInstantiateItem instanceof y) {
            ((y) objInstantiateItem).K0();
        }
    }

    private void O4(FilterButtonView filterButtonView, List<KeyDescObj> list) {
        if (PatchProxy.proxy(new Object[]{filterButtonView, list}, this, changeQuickRedirect, false, 25980, new Class[]{FilterButtonView.class, List.class}, Void.TYPE).isSupported || this.mContext.isFinishing() || list == null || list.size() <= 0) {
            return;
        }
        ArrayList<KeyDescObj> arrayList = new ArrayList(list);
        for (KeyDescObj keyDescObj : arrayList) {
            KeyDescObj keyDescObj2 = this.f79666j;
            keyDescObj.setChecked((keyDescObj2 == null || keyDescObj2.getKey() == null || !this.f79666j.getKey().equals(keyDescObj.getKey())) ? false : true);
            keyDescObj.setDesc(keyDescObj.getText());
        }
        if (this.f79666j == null) {
            ((KeyDescObj) arrayList.get(0)).setChecked(true);
        }
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new h(list, filterButtonView));
        heyBoxPopupMenu.show();
    }

    static /* synthetic */ void V3(ChannelsLinkFragment channelsLinkFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment, new Integer(i10)}, null, changeQuickRedirect, true, 25990, new Class[]{ChannelsLinkFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.J4(i10);
    }

    static /* synthetic */ void Y3(ChannelsLinkFragment channelsLinkFragment, String str) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment, str}, null, changeQuickRedirect, true, 25991, new Class[]{ChannelsLinkFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.s4(str);
    }

    static /* synthetic */ boolean Z3(ChannelsLinkFragment channelsLinkFragment, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{channelsLinkFragment, str}, null, changeQuickRedirect, true, 25992, new Class[]{ChannelsLinkFragment.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : channelsLinkFragment.C4(str);
    }

    static /* synthetic */ void a4(ChannelsLinkFragment channelsLinkFragment) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment}, null, changeQuickRedirect, true, 25993, new Class[]{ChannelsLinkFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.H4();
    }

    static /* synthetic */ void b4(ChannelsLinkFragment channelsLinkFragment) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment}, null, changeQuickRedirect, true, 25994, new Class[]{ChannelsLinkFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.v4();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void c1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25960, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f79676t;
        ViewPager viewPager = this.vp;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
        if (objInstantiateItem instanceof y) {
            ((y) objInstantiateItem).c1();
        }
    }

    static /* synthetic */ void c4(ChannelsLinkFragment channelsLinkFragment) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment}, null, changeQuickRedirect, true, 25995, new Class[]{ChannelsLinkFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.K4();
    }

    static /* synthetic */ void d4(ChannelsLinkFragment channelsLinkFragment, FilterButtonView filterButtonView, List list) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment, filterButtonView, list}, null, changeQuickRedirect, true, 25996, new Class[]{ChannelsLinkFragment.class, FilterButtonView.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.O4(filterButtonView, list);
    }

    static /* synthetic */ void f4(ChannelsLinkFragment channelsLinkFragment, List list, KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment, list, keyDescObj}, null, changeQuickRedirect, true, 25997, new Class[]{ChannelsLinkFragment.class, List.class, KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.M4(list, keyDescObj);
    }

    static /* synthetic */ void g4(ChannelsLinkFragment channelsLinkFragment, FilterButtonView filterButtonView) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment, filterButtonView}, null, changeQuickRedirect, true, 25998, new Class[]{ChannelsLinkFragment.class, FilterButtonView.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.I4(filterButtonView);
    }

    static /* synthetic */ void i4(ChannelsLinkFragment channelsLinkFragment) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment}, null, changeQuickRedirect, true, 25986, new Class[]{ChannelsLinkFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.C3();
    }

    static /* synthetic */ void l4(ChannelsLinkFragment channelsLinkFragment) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment}, null, changeQuickRedirect, true, 25987, new Class[]{ChannelsLinkFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.c1();
    }

    static /* synthetic */ void m4(ChannelsLinkFragment channelsLinkFragment) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment}, null, changeQuickRedirect, true, 25988, new Class[]{ChannelsLinkFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.N4();
    }

    static /* synthetic */ void p4(ChannelsLinkFragment channelsLinkFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{channelsLinkFragment, new Integer(i10)}, null, changeQuickRedirect, true, 25989, new Class[]{ChannelsLinkFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        channelsLinkFragment.D4(i10);
    }

    private void q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25965, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CoordinatorLayout.Behavior behaviorF = ((CoordinatorLayout.f) this.appBarLayout.getLayoutParams()).f();
        if (behaviorF instanceof AppBarLayout.Behavior) {
            AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) behaviorF;
            behavior.K();
            if (behavior.K() != 0) {
                behavior.Q(0);
                this.appBarLayout.setExpanded(true, true);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25964, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        androidx.viewpager.widget.a aVar = this.f79676t;
        ViewPager viewPager = this.vp;
        Object objInstantiateItem = aVar.instantiateItem((ViewGroup) viewPager, viewPager.getCurrentItem());
        if (objInstantiateItem instanceof com.max.xiaoheihe.view.callback.a) {
            ((com.max.xiaoheihe.view.callback.a) objInstantiateItem).D3();
        }
    }

    private void s4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25977, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (BBSTopicMenuObj.TYPE_WATERFALL.equals(str)) {
            this.tab_bottom_divider.setVisibility(8);
        } else {
            this.tab_bottom_divider.setVisibility(0);
        }
    }

    private void t4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 25969, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int scaledTouchSlop = z10 ? (-ViewConfiguration.get(this.mContext).getScaledTouchSlop()) - 1 : ViewConfiguration.get(this.mContext).getScaledTouchSlop() + 1;
        i iVar = this.f79670n;
        if (iVar != null) {
            iVar.f(this.vp, scaledTouchSlop, 0);
        }
    }

    private KeyDescObj u4(List<KeyDescObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 25975, new Class[]{List.class}, KeyDescObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (KeyDescObj) patchProxyResultProxy.result;
        }
        KeyDescObj keyDescObj = null;
        if (com.max.hbcommon.utils.c.w(list)) {
            return null;
        }
        for (KeyDescObj keyDescObj2 : list) {
            if (keyDescObj2.isChecked()) {
                keyDescObj = keyDescObj2;
                break;
            }
        }
        if (keyDescObj != null) {
            return keyDescObj;
        }
        KeyDescObj keyDescObj3 = list.get(0);
        keyDescObj3.setChecked(true);
        return keyDescObj3;
    }

    private void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25955, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        w4(null);
    }

    @SuppressLint({"AutoDispose"})
    private void w4(Map<String, String> map) {
        io.reactivex.z<Result<BBSTopicLinksObj>> zVarT3;
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25956, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        if (this.f79674r == null) {
            showEmpty();
            return;
        }
        HashMap map2 = new HashMap(16);
        Map<String, String> map3 = this.f79660d;
        if (map3 != null) {
            map2.putAll(map3);
        }
        KeyDescObj keyDescObj = this.f79666j;
        if (keyDescObj != null) {
            map2.put("sort_filter", keyDescObj.getKey());
        }
        if (this.f79674r.getParams() != null) {
            map2.putAll(this.f79674r.getParams());
        }
        if (BBSTopicMenuObj.TYPE_WATERFALL.equals(this.f79674r.getType())) {
            zVarT3 = com.max.xiaoheihe.network.i.a().r1(this.f79658b, this.f79659c, map2, this.f79662f, 30, this.f79663g);
        } else {
            if (map != null && map.size() > 0) {
                map2.putAll(map);
            }
            zVarT3 = com.max.xiaoheihe.network.i.a().t3(this.f79658b, map2, this.f79662f, 30, this.f79663g);
        }
        addDisposable((io.reactivex.disposables.b) zVarT3.I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c(this.vp.getCurrentItem())));
    }

    @Override // com.max.xiaoheihe.module.bbs.c.i
    public boolean B2() {
        return false;
    }

    @Override // com.max.xiaoheihe.module.bbs.c.i
    public View J0() {
        return this.vg_filter;
    }

    public void L4(HashMap<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25983, new Class[]{HashMap.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f79673q) || map == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f79673q.size(); i10++) {
            if (this.f79673q.get(i10).getParams() != null && this.f79673q.get(i10).getParams().equals(map)) {
                TabLayout tabLayout = this.tl;
                tabLayout.R(tabLayout.D(i10));
                return;
            }
        }
    }

    public void P4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25963, new Class[0], Void.TYPE).isSupported && isActive()) {
            this.f79672p = true;
            q4();
            r4();
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.c.h
    public void a3(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25970, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79671o = 0;
        this.f79662f = 0;
        this.f79663g = null;
        this.f79672p = true;
        w4(map);
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    public boolean d2() {
        return true;
    }

    public void e1(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 25984, new Class[]{String.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f79673q) || str == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f79673q.size(); i10++) {
            if (str.equals(this.f79673q.get(i10).getTitle())) {
                TabLayout tabLayout = this.tl;
                tabLayout.R(tabLayout.D(i10));
                return;
            }
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.c.h
    public void f3(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 25968, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f79671o + i10;
        this.f79671o = i11;
        i iVar = this.f79670n;
        if (iVar != null) {
            iVar.f(this.vp, i10, i11);
        }
    }

    @Override // com.max.xiaoheihe.module.bbs.c.h
    public void g3(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 25971, new Class[]{Map.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f79662f += 30;
        w4(map);
    }

    @Override // com.max.hbcommon.base.d, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25985, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("topic_id", this.f79658b);
        Map<String, String> map = this.f79660d;
        if (map != null) {
            for (String str : map.keySet()) {
                jsonObject.addProperty(str, this.f79660d.get(str));
            }
        }
        return jsonObject.toString();
    }

    @Override // com.max.hbcommon.base.d
    public void initData() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25953, new Class[0], Void.TYPE).isSupported && this.f79677u) {
            showLoading();
            v4();
        }
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(View view) {
        int i10;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 25952, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.fragment_channels_link);
        this.mUnBinder = ButterKnife.f(this, view);
        if (getArguments() != null) {
            this.f79658b = getArguments().getString("topic_id");
            this.f79659c = getArguments().getString("hashtag_name");
            this.f79660d = (HashMap) getArguments().getSerializable("extra_params");
            this.f79673q = (ArrayList) getArguments().getSerializable(f79657z);
            this.f79667k = getArguments().getString(ChannelsDetailActivity.f79593c4);
            this.f79668l = getArguments().getString(ChannelsDetailActivity.f79594d4);
        }
        this.f79675s = false;
        this.f79676t = new a(getChildFragmentManager());
        ViewPager viewPager = this.vp;
        ArrayList<BBSTopicMenuObj> arrayList = this.f79673q;
        viewPager.setOffscreenPageLimit(arrayList != null ? arrayList.size() : 0);
        this.vp.setAdapter(this.f79676t);
        this.vp.c(new b());
        A4();
        E4();
        if (com.max.hbcommon.utils.c.w(this.f79673q) || com.max.hbcommon.utils.c.u(this.f79667k)) {
            i10 = 0;
        } else {
            int iQ = com.max.hbutils.utils.n.q(this.f79668l);
            i10 = 0;
            int i11 = 0;
            while (true) {
                if (i10 >= this.f79673q.size()) {
                    i10 = 0;
                    break;
                }
                if (this.f79667k.equals(this.f79673q.get(i10).getType())) {
                    if (iQ == i11) {
                        break;
                    } else {
                        i11++;
                    }
                }
                i10++;
            }
            TabLayout tabLayout = this.tl;
            tabLayout.R(tabLayout.D(i10));
        }
        if (this.mIsFirst) {
            showLoading();
        }
        if (i10 > 0) {
            this.f79677u = false;
            showContentView();
            v4();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 25947, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onAttach(context);
        if (getParentFragment() instanceof i) {
            this.f79670n = (i) getParentFragment();
            return;
        }
        if (context instanceof i) {
            this.f79670n = (i) context;
            return;
        }
        throw new RuntimeException(getParentFragment() + " or " + context + " must implement ListListener");
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, changeQuickRedirect, false, 25951, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        this.f79671o = bundle != null ? bundle.getInt(A, 0) : 0;
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25949, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f79670n = null;
        FilterButtonView filterButtonView = this.fbv_sort;
        if (filterButtonView != null) {
            filterButtonView.setOnClickListener(null);
            this.fbv_sort = null;
        }
        this.tl = null;
        ViewPager viewPager = this.vp;
        if (viewPager != null) {
            viewPager.setAdapter(null);
            this.vp.c(null);
            this.vp = null;
        }
        this.f79664h = null;
        this.f79676t = null;
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25966, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25948, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onDetach();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25967, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        v4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 25950, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        bundle.putInt(A, this.f79671o);
        super.onSaveInstanceState(bundle);
    }

    public int x4() {
        return this.f79671o;
    }

    public BBSTopicMenuObj y4() {
        ViewPager viewPager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25981, new Class[0], BBSTopicMenuObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSTopicMenuObj) patchProxyResultProxy.result;
        }
        if (!isActive() || (viewPager = this.vp) == null) {
            return null;
        }
        int currentItem = viewPager.getCurrentItem();
        if (com.max.hbcommon.utils.c.w(this.f79673q) || currentItem < 0 || currentItem >= this.f79673q.size()) {
            return null;
        }
        return this.f79673q.get(currentItem);
    }

    public int z4() {
        ViewPager viewPager;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25982, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (!isActive() || (viewPager = this.vp) == null) {
            return -1;
        }
        return viewPager.getCurrentItem();
    }
}
