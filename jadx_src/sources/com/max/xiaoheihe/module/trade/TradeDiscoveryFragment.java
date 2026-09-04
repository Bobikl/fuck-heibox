package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager.widget.ViewPager;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.TabEntity;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbcustomview.indicator.LinePageIndicator;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.t;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeFilterItemObj;
import com.max.xiaoheihe.bean.trade.TradeFilterObj;
import com.max.xiaoheihe.bean.trade.TradeFilterTabObj;
import com.max.xiaoheihe.bean.trade.TradeItemFlagObj;
import com.max.xiaoheihe.bean.trade.TradePageFilterWrapper;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.module.game.d0;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeDiscoveryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeDiscoveryFragment.kt\ncom/max/xiaoheihe/module/trade/TradeDiscoveryFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,603:1\n1#2:604\n*E\n"})
@o(parameters = 0)
public final class TradeDiscoveryFragment extends com.max.xiaoheihe.module.littleprogram.fragment.b {

    @dl.e
    private static Void O;
    public static ChangeQuickRedirect changeQuickRedirect;

    @dl.e
    private String A;
    private u<TradeSteamInventoryObj> D;

    @dl.e
    private TradeSteamInventoryResult E;

    @dl.e
    private ArrayList<TradeFilterTabObj> F;

    @dl.e
    private SegmentFilterSelected G;

    @dl.e
    private TradeMsgBroadcastReceiver I;

    @dl.e
    private String J;

    @dl.e
    private List<KeyDescObj> K;
    private TradeItemFilterManager L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f92769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MarqueeTextView f92770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f92771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f92772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private TextView f92773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f92774h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f92775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f92776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FilterButtonView f92777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f92778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f92779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CommonTabLayout f92780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SmartRefreshLayout f92781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ConsecutiveScrollerLayout f92782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private RecyclerView f92783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private View f92784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f92785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f92786t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private View f92787u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ViewPager f92788v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private LinePageIndicator f92789w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f92790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.e
    private String f92791y;

    @dl.d
    public static final a M = new a(null);
    public static final int N = 8;

    @dl.d
    private static String P = SocialConstants.PARAM_APP_DESC;

    @dl.d
    private static String Q = "asc";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.e
    private String f92792z = (String) O;

    @dl.d
    private final List<TradeSteamInventoryObj> B = new ArrayList();

    @dl.d
    private List<KeyDescObj> C = new ArrayList();

    @dl.d
    private TradePageFilterWrapper H = new TradePageFilterWrapper(null, null, null, 7, null);

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45055, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeDiscoveryFragment.Q;
        }

        @dl.e
        public final Void b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45051, new Class[0], Void.class);
            return patchProxyResultProxy.isSupported ? (Void) patchProxyResultProxy.result : TradeDiscoveryFragment.O;
        }

        @dl.d
        public final String c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45053, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeDiscoveryFragment.P;
        }

        @dl.d
        public final TradeDiscoveryFragment d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45057, new Class[0], TradeDiscoveryFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradeDiscoveryFragment) patchProxyResultProxy.result;
            }
            TradeDiscoveryFragment tradeDiscoveryFragment = new TradeDiscoveryFragment();
            tradeDiscoveryFragment.setArguments(new Bundle());
            return tradeDiscoveryFragment;
        }

        public final void e(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45056, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            TradeDiscoveryFragment.Q = str;
        }

        public final void f(@dl.e Void r10) {
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 45052, new Class[]{Void.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeDiscoveryFragment.O = r10;
        }

        public final void g(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45054, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            TradeDiscoveryFragment.P = str;
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45061, new Class[0], Void.TYPE).isSupported && TradeDiscoveryFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeDiscoveryFragment.this.f92781o;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeDiscoveryFragment.this.f92781o;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45060, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeDiscoveryFragment.this.isActive()) {
                super.onError(e10);
                TradeDiscoveryFragment.k4(TradeDiscoveryFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradeDiscoveryFragment.this.f92781o;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeDiscoveryFragment.this.f92781o;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            List<KeyDescObj> shortcuts;
            ArrayList<KeyDescObj> sort_types;
            ArrayList<TradeFilterTabObj> filter;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45062, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeDiscoveryFragment.this.isActive()) {
                TradeDiscoveryFragment.this.E = result.getResult();
                TradeDiscoveryFragment tradeDiscoveryFragment = TradeDiscoveryFragment.this;
                TradeSteamInventoryResult result2 = result.getResult();
                tradeDiscoveryFragment.f92791y = result2 != null ? result2.getLastval() : null;
                TradeSteamInventoryResult tradeSteamInventoryResult = TradeDiscoveryFragment.this.E;
                if (tradeSteamInventoryResult != null && (filter = tradeSteamInventoryResult.getFilter()) != null) {
                    TradeDiscoveryFragment tradeDiscoveryFragment2 = TradeDiscoveryFragment.this;
                    tradeDiscoveryFragment2.F = filter;
                    ArrayList<TradeFilterTabObj> arrayList = tradeDiscoveryFragment2.F;
                    if (arrayList != null) {
                        for (TradeFilterTabObj tradeFilterTabObj : arrayList) {
                            tradeDiscoveryFragment2.H.getFilterMap().put(tradeFilterTabObj.getKey(), new ArrayList());
                            if (!f0.g(tradeFilterTabObj.getKey(), "price_range")) {
                                for (TradeFilterObj tradeFilterObj : tradeFilterTabObj.getList()) {
                                    ArrayList<TradeFilterItemObj> list = tradeFilterObj.getList();
                                    if (list != null) {
                                        for (TradeFilterItemObj tradeFilterItemObj : list) {
                                            if (StringsKt__StringsKt.W2(tradeFilterItemObj.getValue(), "all_", false, 2, null)) {
                                                tradeFilterItemObj.setDesc_in_hsv(d0.f87251w + tradeFilterObj.getDesc());
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                TradeSteamInventoryResult tradeSteamInventoryResult2 = TradeDiscoveryFragment.this.E;
                if (tradeSteamInventoryResult2 != null && (sort_types = tradeSteamInventoryResult2.getSort_types()) != null) {
                    TradeDiscoveryFragment.this.C = CollectionsKt___CollectionsKt.T5(sort_types);
                }
                TradeSteamInventoryResult tradeSteamInventoryResult3 = TradeDiscoveryFragment.this.E;
                if (tradeSteamInventoryResult3 != null && (shortcuts = tradeSteamInventoryResult3.getShortcuts()) != null) {
                    TradeDiscoveryFragment.this.K = CollectionsKt___CollectionsKt.T5(shortcuts);
                }
                TradeDiscoveryFragment.this.r4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45063, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45064, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.i0(mContext, lb.d.f131244r4);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45065, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
            f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.w0(mContext, 35).A();
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class e implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45066, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeDiscoveryFragment.this.f92790x = 0;
            TradeDiscoveryFragment.this.f92791y = null;
            TradeDiscoveryFragment.L3(TradeDiscoveryFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class f implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45067, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeDiscoveryFragment.this.f92790x += 30;
            TradeDiscoveryFragment.L3(TradeDiscoveryFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class g extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.g, pg.c
        public void i(@dl.d ng.f footer, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {footer, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45068, new Class[]{ng.f.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(footer, "footer");
            ConsecutiveScrollerLayout consecutiveScrollerLayout = TradeDiscoveryFragment.this.f92782p;
            if (consecutiveScrollerLayout == null) {
                f0.S("mConsecutiveScrollerLayout");
                consecutiveScrollerLayout = null;
            }
            consecutiveScrollerLayout.setStickyOffset(i10);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45069, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeItemFilterManager tradeItemFilterManager = TradeDiscoveryFragment.this.L;
            if (tradeItemFilterManager == null) {
                f0.S("mTradeItemFilterManager");
                tradeItemFilterManager = null;
            }
            tradeItemFilterManager.k();
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class i extends u<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeDiscoveryFragment f92802b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92803c;

            a(TradeDiscoveryFragment tradeDiscoveryFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f92802b = tradeDiscoveryFragment;
                this.f92803c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45075, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92802b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92802b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.g(mContext, this.f92803c.getSku_id()));
            }
        }

        /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeDiscoveryFragment f92804b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92805c;

            b(TradeDiscoveryFragment tradeDiscoveryFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f92804b = tradeDiscoveryFragment;
                this.f92805c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45076, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92804b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92804b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.h(mContext, this.f92805c.getSpu_id()));
            }
        }

        i(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45070, new Class[]{Integer.TYPE}, Long.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            String sku_id = ((TradeSteamInventoryObj) TradeDiscoveryFragment.this.B.get(i10)).getSku_id();
            return sku_id != null ? Long.parseLong(sku_id) : i10;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45074, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeSteamInventoryObj);
        }

        public int n(int i10, @dl.e TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45072, new Class[]{cls, TradeSteamInventoryObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            TradeSteamInventoryResult tradeSteamInventoryResult = TradeDiscoveryFragment.this.E;
            return f0.g("spu", tradeSteamInventoryResult != null ? tradeSteamInventoryResult.getStyle() : null) ? R.layout.item_inventory_spu_item : R.layout.item_inventory_item;
        }

        public void o(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            b2 b2Var;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45071, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            if (viewHolder.d() == R.layout.item_inventory_item) {
                Activity mContext = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
                f0.o(mContext, "mContext");
                TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
                Activity mContext2 = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
                f0.o(mContext2, "mContext");
                TradeInfoUtilKt.u(mContext2, viewHolder, data);
                Activity mContext3 = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
                f0.o(mContext3, "mContext");
                TradeInfoUtilKt.z(mContext3, viewHolder, data, false);
                Activity mContext4 = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
                f0.o(mContext4, "mContext");
                TradeInfoUtilKt.v(mContext4, viewHolder, data);
                viewHolder.itemView.setOnClickListener(new a(TradeDiscoveryFragment.this, data));
                return;
            }
            Activity mContext5 = ((com.max.hbcommon.base.d) TradeDiscoveryFragment.this).mContext;
            f0.o(mContext5, "mContext");
            TradeInfoUtilKt.A(mContext5, viewHolder, data, false);
            TextView textView = (TextView) viewHolder.i(R.id.tv_count_desc);
            View viewI = viewHolder.i(R.id.tv_spu_flag);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price);
            bb.d.d(textView2, 5);
            textView2.setText(data.getPrice());
            textView.setText(data.getSell_desc());
            List<TradeItemFlagObj> flags = data.getFlags();
            if (flags != null) {
                TextView textView3 = (TextView) viewI;
                textView3.setVisibility(0);
                textView3.setText(flags.get(0).getDesc());
                textView3.setBackgroundColor(com.max.xiaoheihe.utils.d.e1(flags.get(0).getColor()));
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                ((TextView) viewI).setVisibility(8);
            }
            viewHolder.itemView.setOnClickListener(new b(TradeDiscoveryFragment.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 45073, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TradeSteamInventoryObj) obj);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class j implements TradeItemFilterManager.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        @dl.d
        public TradePageFilterWrapper H3() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45079, new Class[0], TradePageFilterWrapper.class);
            return patchProxyResultProxy.isSupported ? (TradePageFilterWrapper) patchProxyResultProxy.result : TradeDiscoveryFragment.this.H.deepCopyByJson();
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        public void n2(@dl.d TradePageFilterWrapper filterWrapper) {
            if (PatchProxy.proxy(new Object[]{filterWrapper}, this, changeQuickRedirect, false, 45077, new Class[]{TradePageFilterWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(filterWrapper, "filterWrapper");
            TradeDiscoveryFragment.this.H = filterWrapper.deepCopyByJson();
            ConsecutiveScrollerLayout consecutiveScrollerLayout = TradeDiscoveryFragment.this.f92782p;
            SmartRefreshLayout smartRefreshLayout = null;
            if (consecutiveScrollerLayout == null) {
                f0.S("mConsecutiveScrollerLayout");
                consecutiveScrollerLayout = null;
            }
            consecutiveScrollerLayout.scrollTo(0, 0);
            SmartRefreshLayout smartRefreshLayout2 = TradeDiscoveryFragment.this.f92781o;
            if (smartRefreshLayout2 == null) {
                f0.S("mRefreshLayout");
            } else {
                smartRefreshLayout = smartRefreshLayout2;
            }
            smartRefreshLayout.F();
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        @dl.e
        public ArrayList<TradeFilterTabObj> n3() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45078, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : TradeDiscoveryFragment.this.F;
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        @dl.d
        public String z1() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45080, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeItemFilterManager.b.a.a(this);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class k extends androidx.viewpager.widget.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<List<KeyDescObj>> f92807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TradeDiscoveryFragment f92808b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<s<KeyDescObj>> f92809c;

        /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
        public static final class a extends RecyclerView.ItemDecoration {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeDiscoveryFragment f92810b;

            a(TradeDiscoveryFragment tradeDiscoveryFragment) {
                this.f92810b = tradeDiscoveryFragment;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(@dl.d Rect outRect, @dl.d View view, @dl.d RecyclerView parent, @dl.d RecyclerView.State state) {
                if (PatchProxy.proxy(new Object[]{outRect, view, parent, state}, this, changeQuickRedirect, false, 45085, new Class[]{Rect.class, View.class, RecyclerView.class, RecyclerView.State.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(outRect, "outRect");
                f0.p(view, "view");
                f0.p(parent, "parent");
                f0.p(state, "state");
                outRect.set(0, ViewUtils.f(((com.max.hbcommon.base.d) this.f92810b).mContext, 4.0f), ViewUtils.f(((com.max.hbcommon.base.d) this.f92810b).mContext, 4.0f), 0);
                outRect.set(ViewUtils.f(((com.max.hbcommon.base.d) this.f92810b).mContext, 4.0f), 0, ViewUtils.f(((com.max.hbcommon.base.d) this.f92810b).mContext, 4.0f), 0);
            }
        }

        k(List<List<KeyDescObj>> list, TradeDiscoveryFragment tradeDiscoveryFragment, List<s<KeyDescObj>> list2) {
            this.f92807a = list;
            this.f92808b = tradeDiscoveryFragment;
            this.f92809c = list2;
        }

        @Override // androidx.viewpager.widget.a
        public void destroyItem(@dl.d ViewGroup container, int i10, @dl.d Object object) {
            if (PatchProxy.proxy(new Object[]{container, new Integer(i10), object}, this, changeQuickRedirect, false, 45084, new Class[]{ViewGroup.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(container, "container");
            f0.p(object, "object");
            container.removeView((View) object);
        }

        @Override // androidx.viewpager.widget.a
        public int getCount() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45081, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.f92807a.size();
        }

        @Override // androidx.viewpager.widget.a
        @dl.d
        public Object instantiateItem(@dl.d ViewGroup container, int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{container, new Integer(i10)}, this, changeQuickRedirect, false, 45083, new Class[]{ViewGroup.class, Integer.TYPE}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            f0.p(container, "container");
            RecyclerView recyclerView = new RecyclerView(((com.max.hbcommon.base.d) this.f92808b).mContext);
            recyclerView.setLayoutManager(new GridLayoutManager(((com.max.hbcommon.base.d) this.f92808b).mContext, 5));
            recyclerView.setAdapter(this.f92809c.get(i10));
            recyclerView.setPadding(ViewUtils.f(((com.max.hbcommon.base.d) this.f92808b).mContext, 8.0f), 0, ViewUtils.f(((com.max.hbcommon.base.d) this.f92808b).mContext, 8.0f), 0);
            recyclerView.addItemDecoration(new a(this.f92808b));
            container.addView(recyclerView);
            return recyclerView;
        }

        @Override // androidx.viewpager.widget.a
        public boolean isViewFromObject(@dl.d View view, @dl.d Object o10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, o10}, this, changeQuickRedirect, false, 45082, new Class[]{View.class, Object.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            f0.p(view, "view");
            f0.p(o10, "o");
            return view == o10;
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class l extends s<KeyDescObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TradeDiscoveryFragment f92811b;

        /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ KeyDescObj f92812b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeDiscoveryFragment f92813c;

            a(KeyDescObj keyDescObj, TradeDiscoveryFragment tradeDiscoveryFragment) {
                this.f92812b = keyDescObj;
                this.f92813c = tradeDiscoveryFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45088, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (f0.g(SwitchDetailActivity.P, this.f92812b.getType())) {
                    Activity mContext = ((com.max.hbcommon.base.d) this.f92813c).mContext;
                    f0.o(mContext, "mContext");
                    com.max.xiaoheihe.base.router.b.k0(mContext, this.f92812b.getProtocol());
                } else {
                    if (com.max.hbcommon.utils.c.w(this.f92813c.F)) {
                        return;
                    }
                    Activity mContext2 = ((com.max.hbcommon.base.d) this.f92813c).mContext;
                    f0.o(mContext2, "mContext");
                    TradeDiscoverySecondaryFragment.a aVar = TradeDiscoverySecondaryFragment.S;
                    String key = this.f92812b.getKey();
                    f0.o(key, "data.key");
                    String value = this.f92812b.getValue();
                    f0.o(value, "data.value");
                    ArrayList<TradeFilterTabObj> arrayList = this.f92813c.F;
                    f0.m(arrayList);
                    com.max.xiaoheihe.base.router.b.x0(mContext2, aVar.a(key, value, arrayList)).A();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(List<? extends KeyDescObj> list, TradeDiscoveryFragment tradeDiscoveryFragment, Activity activity) {
            super(activity, list, R.layout.item_trade_shortcut);
            this.f92811b = tradeDiscoveryFragment;
        }

        public void m(@dl.d s.e viewHolder, @dl.d KeyDescObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45086, new Class[]{s.e.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ((TextView) viewHolder.i(R.id.tv_name)).setText(data.getDesc());
            com.max.hbimage.b.K(data.getImg(), (ImageView) viewHolder.i(R.id.iv_icon));
            viewHolder.itemView.setOnClickListener(new a(data, this.f92811b));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{eVar, keyDescObj}, this, changeQuickRedirect, false, 45087, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, keyDescObj);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoveryFragment.kt */
    public static final class m implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45089, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeDiscoveryFragment tradeDiscoveryFragment = TradeDiscoveryFragment.this;
            tradeDiscoveryFragment.A = ((KeyDescObj) tradeDiscoveryFragment.C.get(i10)).getValue();
            TradeDiscoveryFragment.this.f92790x = 0;
            TradeDiscoveryFragment.this.f92791y = null;
            TradeDiscoveryFragment.L3(TradeDiscoveryFragment.this);
        }
    }

    public static final /* synthetic */ void L3(TradeDiscoveryFragment tradeDiscoveryFragment) {
        if (PatchProxy.proxy(new Object[]{tradeDiscoveryFragment}, null, changeQuickRedirect, true, 45049, new Class[]{TradeDiscoveryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeDiscoveryFragment.m4();
    }

    public static final /* synthetic */ void k4(TradeDiscoveryFragment tradeDiscoveryFragment) {
        if (PatchProxy.proxy(new Object[]{tradeDiscoveryFragment}, null, changeQuickRedirect, true, 45050, new Class[]{TradeDiscoveryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeDiscoveryFragment.showError();
    }

    private final void l4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45039, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92769c;
        View view2 = null;
        if (view == null) {
            f0.S("mRootView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.srl);
        f0.o(viewFindViewById, "mRootView.findViewById(R.id.srl)");
        this.f92781o = (SmartRefreshLayout) viewFindViewById;
        View view3 = this.f92769c;
        if (view3 == null) {
            f0.S("mRootView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "mRootView.findViewById(R.id.rv)");
        this.f92783q = (RecyclerView) viewFindViewById2;
        View view4 = this.f92769c;
        if (view4 == null) {
            f0.S("mRootView");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.csl);
        f0.o(viewFindViewById3, "mRootView.findViewById(R.id.csl)");
        this.f92782p = (ConsecutiveScrollerLayout) viewFindViewById3;
        View view5 = this.f92769c;
        if (view5 == null) {
            f0.S("mRootView");
            view5 = null;
        }
        View viewFindViewById4 = view5.findViewById(R.id.tv_item_count);
        f0.o(viewFindViewById4, "mRootView.findViewById(R.id.tv_item_count)");
        this.f92773g = (TextView) viewFindViewById4;
        View view6 = this.f92769c;
        if (view6 == null) {
            f0.S("mRootView");
            view6 = null;
        }
        View viewFindViewById5 = view6.findViewById(R.id.tv_message);
        f0.o(viewFindViewById5, "mRootView.findViewById(R.id.tv_message)");
        this.f92770d = (MarqueeTextView) viewFindViewById5;
        View view7 = this.f92769c;
        if (view7 == null) {
            f0.S("mRootView");
            view7 = null;
        }
        View viewFindViewById6 = view7.findViewById(R.id.vg_message);
        f0.o(viewFindViewById6, "mRootView.findViewById(R.id.vg_message)");
        this.f92771e = viewFindViewById6;
        View view8 = this.f92769c;
        if (view8 == null) {
            f0.S("mRootView");
            view8 = null;
        }
        View viewFindViewById7 = view8.findViewById(R.id.tv_value);
        f0.o(viewFindViewById7, "mRootView.findViewById(R.id.tv_value)");
        this.f92779m = (TextView) viewFindViewById7;
        View view9 = this.f92769c;
        if (view9 == null) {
            f0.S("mRootView");
            view9 = null;
        }
        View viewFindViewById8 = view9.findViewById(R.id.tv_count_desc);
        f0.o(viewFindViewById8, "mRootView.findViewById(R.id.tv_count_desc)");
        this.f92774h = (TextView) viewFindViewById8;
        View view10 = this.f92769c;
        if (view10 == null) {
            f0.S("mRootView");
            view10 = null;
        }
        View viewFindViewById9 = view10.findViewById(R.id.tv_title_tips);
        f0.o(viewFindViewById9, "mRootView.findViewById(R.id.tv_title_tips)");
        this.f92775i = (TextView) viewFindViewById9;
        View view11 = this.f92769c;
        if (view11 == null) {
            f0.S("mRootView");
            view11 = null;
        }
        View viewFindViewById10 = view11.findViewById(R.id.tv_title_symbol);
        f0.o(viewFindViewById10, "mRootView.findViewById(R.id.tv_title_symbol)");
        this.f92776j = (TextView) viewFindViewById10;
        View view12 = this.f92769c;
        if (view12 == null) {
            f0.S("mRootView");
            view12 = null;
        }
        View viewFindViewById11 = view12.findViewById(R.id.fbv_sort);
        f0.o(viewFindViewById11, "mRootView.findViewById(R.id.fbv_sort)");
        this.f92777k = (FilterButtonView) viewFindViewById11;
        View view13 = this.f92769c;
        if (view13 == null) {
            f0.S("mRootView");
            view13 = null;
        }
        View viewFindViewById12 = view13.findViewById(R.id.v_divider_1);
        f0.o(viewFindViewById12, "mRootView.findViewById(R.id.v_divider_1)");
        this.f92778l = viewFindViewById12;
        View view14 = this.f92769c;
        if (view14 == null) {
            f0.S("mRootView");
            view14 = null;
        }
        View viewFindViewById13 = view14.findViewById(R.id.iv_filter);
        f0.o(viewFindViewById13, "mRootView.findViewById(R.id.iv_filter)");
        this.f92772f = (ImageView) viewFindViewById13;
        View view15 = this.f92769c;
        if (view15 == null) {
            f0.S("mRootView");
            view15 = null;
        }
        View viewFindViewById14 = view15.findViewById(R.id.tab_title);
        f0.o(viewFindViewById14, "mRootView.findViewById(R.id.tab_title)");
        this.f92780n = (CommonTabLayout) viewFindViewById14;
        View view16 = this.f92769c;
        if (view16 == null) {
            f0.S("mRootView");
            view16 = null;
        }
        this.G = (SegmentFilterSelected) view16.findViewById(R.id.filter_selected);
        View view17 = this.f92769c;
        if (view17 == null) {
            f0.S("mRootView");
            view17 = null;
        }
        View viewFindViewById15 = view17.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById15, "mRootView.findViewById(R.id.vg_invntory_empty)");
        this.f92784r = viewFindViewById15;
        View view18 = this.f92769c;
        if (view18 == null) {
            f0.S("mRootView");
            view18 = null;
        }
        View viewFindViewById16 = view18.findViewById(R.id.banner);
        f0.o(viewFindViewById16, "mRootView.findViewById(R.id.banner)");
        this.f92785s = (BannerViewPager) viewFindViewById16;
        View view19 = this.f92769c;
        if (view19 == null) {
            f0.S("mRootView");
            view19 = null;
        }
        View viewFindViewById17 = view19.findViewById(R.id.vg_banner);
        f0.o(viewFindViewById17, "mRootView.findViewById(R.id.vg_banner)");
        this.f92786t = viewFindViewById17;
        View view20 = this.f92769c;
        if (view20 == null) {
            f0.S("mRootView");
            view20 = null;
        }
        View viewFindViewById18 = view20.findViewById(R.id.vg_shortcuts);
        f0.o(viewFindViewById18, "mRootView.findViewById(R.id.vg_shortcuts)");
        this.f92787u = viewFindViewById18;
        View view21 = this.f92769c;
        if (view21 == null) {
            f0.S("mRootView");
            view21 = null;
        }
        View viewFindViewById19 = view21.findViewById(R.id.vp_shortcut);
        f0.o(viewFindViewById19, "mRootView.findViewById(R.id.vp_shortcut)");
        this.f92788v = (ViewPager) viewFindViewById19;
        View view22 = this.f92769c;
        if (view22 == null) {
            f0.S("mRootView");
        } else {
            view2 = view22;
        }
        View viewFindViewById20 = view2.findViewById(R.id.shortcut_indicatior);
        f0.o(viewFindViewById20, "mRootView.findViewById(R.id.shortcut_indicatior)");
        this.f92789w = (LinePageIndicator) viewFindViewById20;
    }

    private final void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45042, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<TradeFilterTabObj> arrayList = this.F;
        String str = arrayList == null || arrayList.isEmpty() ? "1" : "0";
        HashMap map = new HashMap();
        for (String str2 : this.H.getFilterMap().keySet()) {
            List<TradeFilterItemObj> list = this.H.getFilterMap().get(str2);
            if (list != null && (!list.isEmpty())) {
                map.put(str2, CollectionsKt___CollectionsKt.h3(list, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<TradeFilterItemObj, CharSequence>() { // from class: com.max.xiaoheihe.module.trade.TradeDiscoveryFragment$getData$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @dl.d
                    public final CharSequence a(@dl.d TradeFilterItemObj itemobj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemobj}, this, changeQuickRedirect, false, 45058, new Class[]{TradeFilterItemObj.class}, CharSequence.class);
                        if (patchProxyResultProxy.isSupported) {
                            return (CharSequence) patchProxyResultProxy.result;
                        }
                        f0.p(itemobj, "itemobj");
                        return itemobj.getValue();
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ CharSequence invoke(TradeFilterItemObj tradeFilterItemObj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeFilterItemObj}, this, changeQuickRedirect, false, 45059, new Class[]{Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(tradeFilterItemObj);
                    }
                }, 30, null));
            }
        }
        String minPrice = this.H.getMinPrice();
        if (minPrice != null) {
            if (minPrice.length() > 0) {
                map.put("price_min", minPrice);
            }
        }
        String maxPrice = this.H.getMaxPrice();
        if (maxPrice != null) {
            if (maxPrice.length() > 0) {
                map.put("price_max", maxPrice);
            }
        }
        String str3 = this.J;
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ia(UCropPlusActivity.ARG_INDEX, str, map, this.A, this.f92792z, str3 == null || str3.length() == 0 ? null : this.J, this.f92791y, this.f92790x, 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void n4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45040, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92769c;
        if (view == null) {
            f0.S("mRootView");
            view = null;
        }
        EditText editText = (EditText) view.findViewById(R.id.et_item_search);
        View view2 = this.f92769c;
        if (view2 == null) {
            f0.S("mRootView");
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.vg_search_scan);
        viewFindViewById.setVisibility(0);
        viewFindViewById.setOnClickListener(new c());
        ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
        f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
        editText.setFocusable(false);
        editText.setFocusableInTouchMode(false);
        editText.setOnClickListener(new d());
        editText.setHint("搜索饰品");
        TextView textView = this.f92773g;
        if (textView == null) {
            f0.S("tv_item_count");
            textView = null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.f92774h;
        if (textView2 == null) {
            f0.S("tv_count_desc");
            textView2 = null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f92775i;
        if (textView3 == null) {
            f0.S("tv_title_tips");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f92776j;
        if (textView4 == null) {
            f0.S("tv_title_symbol");
            textView4 = null;
        }
        textView4.setVisibility(8);
        FilterButtonView filterButtonView = this.f92777k;
        if (filterButtonView == null) {
            f0.S("fbv_sort");
            filterButtonView = null;
        }
        filterButtonView.setVisibility(8);
        View view3 = this.f92778l;
        if (view3 == null) {
            f0.S("v_divider_1");
            view3 = null;
        }
        view3.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = this.f92781o;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.setBackgroundResource(R.drawable.gradient_white_divider);
        SmartRefreshLayout smartRefreshLayout2 = this.f92781o;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.S(new e());
        SmartRefreshLayout smartRefreshLayout3 = this.f92781o;
        if (smartRefreshLayout3 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.f0(new f());
        SmartRefreshLayout smartRefreshLayout4 = this.f92781o;
        if (smartRefreshLayout4 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout4 = null;
        }
        smartRefreshLayout4.k0(new g());
        ImageView imageView = this.f92772f;
        if (imageView == null) {
            f0.S("iv_filter");
            imageView = null;
        }
        imageView.setOnClickListener(new h());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 2);
        RecyclerView recyclerView = this.f92783q;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        int iF = ViewUtils.f(this.mContext, 10.0f);
        RecyclerView recyclerView2 = this.f92783q;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setPadding(iF, iF, ViewUtils.f(this.mContext, 7.0f), ViewUtils.f(this.mContext, 4.0f));
        RecyclerView recyclerView3 = this.f92783q;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) recyclerView3.getItemAnimator();
        f0.m(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        RecyclerView recyclerView4 = this.f92783q;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipToPadding(false);
        RecyclerView recyclerView5 = this.f92783q;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setClipChildren(false);
        i iVar = new i(this.mContext, this.B);
        this.D = iVar;
        iVar.setHasStableIds(true);
        RecyclerView recyclerView6 = this.f92783q;
        if (recyclerView6 == null) {
            f0.S("mRecyclerView");
            recyclerView6 = null;
        }
        u<TradeSteamInventoryObj> uVar = this.D;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        recyclerView6.setAdapter(uVar);
        RecyclerView recyclerView7 = this.f92783q;
        if (recyclerView7 == null) {
            f0.S("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.setItemAnimator(null);
    }

    private final void o4() {
        BannerViewPager<AdsBannerObj> bannerViewPager;
        ArrayList<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45045, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f92790x == 0) {
            this.B.clear();
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.E;
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.B.addAll(list);
        }
        List<TradeSteamInventoryObj> list2 = this.B;
        if (list2 == null || list2.isEmpty()) {
            s4();
            return;
        }
        View view = this.f92784r;
        u<TradeSteamInventoryObj> uVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        RecyclerView recyclerView = this.f92783q;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        List[] listArr = new List[1];
        TradeSteamInventoryResult tradeSteamInventoryResult2 = this.E;
        listArr[0] = tradeSteamInventoryResult2 != null ? tradeSteamInventoryResult2.getBanner() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            View view2 = this.f92786t;
            if (view2 == null) {
                f0.S("vg_banner");
                view2 = null;
            }
            view2.setVisibility(8);
        } else {
            BannerViewPager<AdsBannerObj> bannerViewPager2 = this.f92785s;
            if (bannerViewPager2 == null) {
                f0.S("mBanner");
                bannerViewPager = null;
            } else {
                bannerViewPager = bannerViewPager2;
            }
            TradeSteamInventoryResult tradeSteamInventoryResult3 = this.E;
            com.max.hbcommon.utils.b.h(bannerViewPager, tradeSteamInventoryResult3 != null ? tradeSteamInventoryResult3.getBanner() : null, ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f), 4.0f, 12.0f, false);
            View view3 = this.f92786t;
            if (view3 == null) {
                f0.S("vg_banner");
                view3 = null;
            }
            BannerViewPager<AdsBannerObj> bannerViewPager3 = this.f92785s;
            if (bannerViewPager3 == null) {
                f0.S("mBanner");
                bannerViewPager3 = null;
            }
            view3.setVisibility(bannerViewPager3.getVisibility());
        }
        if (com.max.hbcommon.utils.c.w(this.K)) {
            View view4 = this.f92787u;
            if (view4 == null) {
                f0.S("vg_shortcuts");
                view4 = null;
            }
            view4.setVisibility(8);
        } else {
            p4();
            View view5 = this.f92787u;
            if (view5 == null) {
                f0.S("vg_shortcuts");
                view5 = null;
            }
            view5.setVisibility(0);
        }
        u<TradeSteamInventoryObj> uVar2 = this.D;
        if (uVar2 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        uVar.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45046, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<KeyDescObj> list = this.K;
        LinePageIndicator linePageIndicator = null;
        View view = null;
        ViewPager viewPager = null;
        if ((list == null || list.isEmpty()) == true) {
            View view2 = this.f92787u;
            if (view2 == null) {
                f0.S("vg_shortcuts");
            } else {
                view = view2;
            }
            view.setVisibility(8);
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<KeyDescObj> list2 = this.K;
        f0.m(list2);
        int size = list2.size() / 10;
        List<KeyDescObj> list3 = this.K;
        f0.m(list3);
        int i10 = size + (list3.size() % 10 == 0 ? 0 : 1);
        for (int i11 = 0; i11 < i10; i11++) {
            ArrayList arrayList2 = new ArrayList();
            int i12 = i11 * 10;
            List<KeyDescObj> list4 = this.K;
            f0.m(list4);
            int iMin = Math.min(i12 + 10, list4.size());
            List<KeyDescObj> list5 = this.K;
            f0.m(list5);
            arrayList2.addAll(list5.subList(i12, iMin));
            arrayList.add(arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(new l((List) it.next(), this, this.mContext));
        }
        k kVar = new k(arrayList, this, arrayList3);
        ViewPager viewPager2 = this.f92788v;
        if (viewPager2 == null) {
            f0.S("vp_shortcut");
            viewPager2 = null;
        }
        viewPager2.setAdapter(kVar);
        if (arrayList.size() <= 1) {
            LinePageIndicator linePageIndicator2 = this.f92789w;
            if (linePageIndicator2 == null) {
                f0.S("shortcut_indicatior");
            } else {
                linePageIndicator = linePageIndicator2;
            }
            linePageIndicator.setVisibility(8);
            return;
        }
        LinePageIndicator linePageIndicator3 = this.f92789w;
        if (linePageIndicator3 == null) {
            f0.S("shortcut_indicatior");
            linePageIndicator3 = null;
        }
        linePageIndicator3.setVisibility(0);
        LinePageIndicator linePageIndicator4 = this.f92789w;
        if (linePageIndicator4 == null) {
            f0.S("shortcut_indicatior");
            linePageIndicator4 = null;
        }
        ViewPager viewPager3 = this.f92788v;
        if (viewPager3 == null) {
            f0.S("vp_shortcut");
        } else {
            viewPager = viewPager3;
        }
        linePageIndicator4.setViewPager(viewPager);
    }

    private final void q4() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45044, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<CustomTabEntity> arrayList = new ArrayList<>();
        int i11 = 0;
        for (KeyDescObj keyDescObj : this.C) {
            int i12 = i10 + 1;
            arrayList.add(new TabEntity(keyDescObj.getDesc()));
            if (f0.g(keyDescObj.getValue(), this.A)) {
                i11 = i10;
            }
            i10 = i12;
        }
        CommonTabLayout commonTabLayout = this.f92780n;
        CommonTabLayout commonTabLayout2 = null;
        if (commonTabLayout == null) {
            f0.S("tab_title");
            commonTabLayout = null;
        }
        commonTabLayout.setTabData(arrayList);
        CommonTabLayout commonTabLayout3 = this.f92780n;
        if (commonTabLayout3 == null) {
            f0.S("tab_title");
            commonTabLayout3 = null;
        }
        commonTabLayout3.setOnTabSelectListener(new m());
        CommonTabLayout commonTabLayout4 = this.f92780n;
        if (commonTabLayout4 == null) {
            f0.S("tab_title");
        } else {
            commonTabLayout2 = commonTabLayout4;
        }
        commonTabLayout2.setCurrentTab(i11);
    }

    private final void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45048, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f92784r;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        RecyclerView recyclerView = this.f92783q;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        View view3 = this.f92784r;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f92784r;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
            view4 = null;
        }
        View viewFindViewById2 = view4.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View view5 = this.f92784r;
        if (view5 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view5;
        }
        View viewFindViewById3 = view2.findViewById(R.id.tv_btn);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        textView.setText("暂无搜索结果");
        ((TextView) viewFindViewById3).setVisibility(8);
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45036, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_inventory);
        this.f92769c = rootView;
        t.c(t.n(this.mContext), (ViewGroup) rootView, null);
        if (getContext() instanceof com.max.hbminiprogram.h) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            TitleBar mTitleBar = this.mTitleBar;
            f0.o(mTitleBar, "mTitleBar");
            TradeInfoUtilKt.H(mContext, mTitleBar, "饰品交易");
        } else {
            this.mTitleBar.setTitle("饰品交易");
            Activity mContext2 = this.mContext;
            f0.o(mContext2, "mContext");
            TitleBar mTitleBar2 = this.mTitleBar;
            f0.o(mTitleBar2, "mTitleBar");
            TradeInfoUtilKt.I(mContext2, mTitleBar2);
        }
        Activity mContext3 = this.mContext;
        f0.o(mContext3, "mContext");
        this.L = new TradeItemFilterManager(mContext3, new j());
        l4();
        n4();
        showLoading();
        m4();
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.b, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45041, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f92790x = 0;
        this.f92791y = null;
        m4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45037, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        TitleBar mTitleBar = this.mTitleBar;
        f0.o(mTitleBar, "mTitleBar");
        TradeMsgBroadcastReceiver tradeMsgBroadcastReceiver = new TradeMsgBroadcastReceiver(mTitleBar, getContext() instanceof com.max.hbminiprogram.h);
        this.I = tradeMsgBroadcastReceiver;
        registerReceiver(tradeMsgBroadcastReceiver, lb.a.N);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45047, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45038, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        unregisterReceiver(this.I);
    }

    public final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45043, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        TradeSteamInventoryResult tradeSteamInventoryResult = this.E;
        View view = null;
        String message = tradeSteamInventoryResult != null ? tradeSteamInventoryResult.getMessage() : null;
        if (message == null || message.length() == 0) {
            View view2 = this.f92771e;
            if (view2 == null) {
                f0.S("vg_mesage");
            } else {
                view = view2;
            }
            view.setVisibility(8);
        } else {
            View view3 = this.f92771e;
            if (view3 == null) {
                f0.S("vg_mesage");
                view3 = null;
            }
            view3.setVisibility(0);
            MarqueeTextView marqueeTextView = this.f92770d;
            if (marqueeTextView == null) {
                f0.S("tv_message");
                marqueeTextView = null;
            }
            TradeSteamInventoryResult tradeSteamInventoryResult2 = this.E;
            marqueeTextView.setText(tradeSteamInventoryResult2 != null ? tradeSteamInventoryResult2.getMessage() : null);
        }
        q4();
        TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        SegmentFilterSelected segmentFilterSelected = this.G;
        f0.m(segmentFilterSelected);
        aVar.a(mContext, segmentFilterSelected, this.H, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeDiscoveryFragment$showData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45091, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45090, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ConsecutiveScrollerLayout consecutiveScrollerLayout = this.f92815b.f92782p;
                SmartRefreshLayout smartRefreshLayout = null;
                if (consecutiveScrollerLayout == null) {
                    f0.S("mConsecutiveScrollerLayout");
                    consecutiveScrollerLayout = null;
                }
                consecutiveScrollerLayout.scrollTo(0, 0);
                SmartRefreshLayout smartRefreshLayout2 = this.f92815b.f92781o;
                if (smartRefreshLayout2 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout = smartRefreshLayout2;
                }
                smartRefreshLayout.F();
            }
        });
        o4();
    }

    @Override // com.max.hbcommon.base.d
    public boolean shouldKeepViewOnDestroyView() {
        return this.mContext instanceof com.max.hbminiprogram.h;
    }
}
