package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.flyco.tablayout.CommonTabLayout;
import com.flyco.tablayout.listener.CustomTabEntity;
import com.flyco.tablayout.listener.OnTabSelectListener;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.TabEntity;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.hbsearch.bean.SearchHotwordObj;
import com.max.hbsearch.k;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeFilterItemObj;
import com.max.xiaoheihe.bean.trade.TradeFilterObj;
import com.max.xiaoheihe.bean.trade.TradeFilterTabObj;
import com.max.xiaoheihe.bean.trade.TradeItemFlagObj;
import com.max.xiaoheihe.bean.trade.TradePageFilterWrapper;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import yh.l;

/* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeDiscoverySecondaryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeDiscoverySecondaryFragment.kt\ncom/max/xiaoheihe/module/trade/TradeDiscoverySecondaryFragment\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,544:1\n1549#2:545\n1620#2,3:546\n1#3:549\n*S KotlinDebug\n*F\n+ 1 TradeDiscoverySecondaryFragment.kt\ncom/max/xiaoheihe/module/trade/TradeDiscoverySecondaryFragment\n*L\n127#1:545\n127#1:546,3\n*E\n"})
@o(parameters = 0)
public final class TradeDiscoverySecondaryFragment extends k implements TradeItemFilterManager.b {

    @dl.e
    private static Void U;
    public static ChangeQuickRedirect changeQuickRedirect;
    private RecyclerView A;
    private RecyclerView B;
    private View C;

    @dl.e
    private String D;

    @dl.e
    private String F;
    private u<TradeSteamInventoryObj> I;

    @dl.e
    private TradeSteamInventoryResult J;

    @dl.e
    private ArrayList<TradeFilterTabObj> K;

    @dl.e
    private SegmentFilterSelected L;
    private String N;
    private String O;

    @dl.e
    private List<TradeFilterItemObj> P;
    private s<TradeFilterItemObj> Q;
    private TradeItemFilterManager R;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f92816q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ImageView f92817r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f92818s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f92819t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f92820u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f92821v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private TextView f92822w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CommonTabLayout f92823x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private SmartRefreshLayout f92824y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private ConsecutiveScrollerLayout f92825z;

    @dl.d
    public static final a S = new a(null);
    public static final int T = 8;

    @dl.d
    private static String V = SocialConstants.PARAM_APP_DESC;

    @dl.d
    private static String W = "asc";

    @dl.e
    private String E = (String) U;

    @dl.d
    private final List<TradeSteamInventoryObj> G = new ArrayList();

    @dl.d
    private List<KeyDescObj> H = new ArrayList();

    @dl.d
    private TradePageFilterWrapper M = new TradePageFilterWrapper(null, null, null, 7, null);

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Bundle a(@dl.d String key, @dl.d String value, @dl.d ArrayList<TradeFilterTabObj> filterList) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{key, value, filterList}, this, changeQuickRedirect, false, 45119, new Class[]{String.class, String.class, ArrayList.class}, Bundle.class);
            if (patchProxyResultProxy.isSupported) {
                return (Bundle) patchProxyResultProxy.result;
            }
            f0.p(key, "key");
            f0.p(value, "value");
            f0.p(filterList, "filterList");
            Bundle bundle = new Bundle();
            com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
            bundle.putString(bVar.g(), key);
            bundle.putString(bVar.h(), value);
            bundle.putSerializable(bVar.a(), filterList);
            bundle.putInt(bVar.e(), 36);
            return bundle;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45117, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeDiscoverySecondaryFragment.W;
        }

        @dl.e
        public final Void c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45113, new Class[0], Void.class);
            return patchProxyResultProxy.isSupported ? (Void) patchProxyResultProxy.result : TradeDiscoverySecondaryFragment.U;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45115, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeDiscoverySecondaryFragment.V;
        }

        public final void e(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45118, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            TradeDiscoverySecondaryFragment.W = str;
        }

        public final void f(@dl.e Void r10) {
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 45114, new Class[]{Void.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeDiscoverySecondaryFragment.U = r10;
        }

        public final void g(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45116, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            TradeDiscoverySecondaryFragment.V = str;
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45123, new Class[0], Void.TYPE).isSupported && TradeDiscoverySecondaryFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeDiscoverySecondaryFragment.this.f92824y;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeDiscoverySecondaryFragment.this.f92824y;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45122, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeDiscoverySecondaryFragment.this.isActive()) {
                super.onError(e10);
                TradeDiscoverySecondaryFragment.d5(TradeDiscoverySecondaryFragment.this);
                SmartRefreshLayout smartRefreshLayout = TradeDiscoverySecondaryFragment.this.f92824y;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeDiscoverySecondaryFragment.this.f92824y;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            ArrayList<KeyDescObj> sort_types;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45124, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeDiscoverySecondaryFragment.this.isActive()) {
                TradeDiscoverySecondaryFragment.this.J = result.getResult();
                TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment = TradeDiscoverySecondaryFragment.this;
                TradeSteamInventoryResult result2 = result.getResult();
                tradeDiscoverySecondaryFragment.D = result2 != null ? result2.getLastval() : null;
                TradeSteamInventoryResult tradeSteamInventoryResult = TradeDiscoverySecondaryFragment.this.J;
                if (tradeSteamInventoryResult != null && (sort_types = tradeSteamInventoryResult.getSort_types()) != null) {
                    TradeDiscoverySecondaryFragment.this.H = CollectionsKt___CollectionsKt.T5(sort_types);
                }
                TradeDiscoverySecondaryFragment.this.m5();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45125, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class c implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45126, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeDiscoverySecondaryFragment.W4(TradeDiscoverySecondaryFragment.this, 0);
            TradeDiscoverySecondaryFragment.this.D = null;
            TradeDiscoverySecondaryFragment.E4(TradeDiscoverySecondaryFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class d implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45127, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment = TradeDiscoverySecondaryFragment.this;
            TradeDiscoverySecondaryFragment.W4(tradeDiscoverySecondaryFragment, TradeDiscoverySecondaryFragment.K4(tradeDiscoverySecondaryFragment) + 30);
            TradeDiscoverySecondaryFragment.E4(TradeDiscoverySecondaryFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class e extends pg.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.g, pg.c
        public void i(@dl.d ng.f footer, boolean z10, float f10, int i10, int i11, int i12) {
            Object[] objArr = {footer, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Integer(i10), new Integer(i11), new Integer(i12)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45128, new Class[]{ng.f.class, Boolean.TYPE, Float.TYPE, cls, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(footer, "footer");
            ConsecutiveScrollerLayout consecutiveScrollerLayout = TradeDiscoverySecondaryFragment.this.f92825z;
            if (consecutiveScrollerLayout == null) {
                f0.S("mConsecutiveScrollerLayout");
                consecutiveScrollerLayout = null;
            }
            consecutiveScrollerLayout.setStickyOffset(i10);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45129, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeItemFilterManager tradeItemFilterManager = TradeDiscoverySecondaryFragment.this.R;
            if (tradeItemFilterManager == null) {
                f0.S("mTradeItemFilterManager");
                tradeItemFilterManager = null;
            }
            tradeItemFilterManager.k();
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class g extends u<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeDiscoverySecondaryFragment f92832b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92833c;

            a(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f92832b = tradeDiscoverySecondaryFragment;
                this.f92833c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45135, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92832b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92832b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.g(mContext, this.f92833c.getSku_id()));
            }
        }

        /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeDiscoverySecondaryFragment f92834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92835c;

            b(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f92834b = tradeDiscoverySecondaryFragment;
                this.f92835c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45136, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92834b).mContext;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92834b).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(TradeInfoUtilKt.h(mContext, this.f92835c.getSpu_id()));
            }
        }

        g(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45130, new Class[]{Integer.TYPE}, Long.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            String sku_id = ((TradeSteamInventoryObj) TradeDiscoverySecondaryFragment.this.G.get(i10)).getSku_id();
            return sku_id != null ? Long.parseLong(sku_id) : i10;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45134, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeSteamInventoryObj);
        }

        public int n(int i10, @dl.e TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45132, new Class[]{cls, TradeSteamInventoryObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            TradeSteamInventoryResult tradeSteamInventoryResult = TradeDiscoverySecondaryFragment.this.J;
            return f0.g("spu", tradeSteamInventoryResult != null ? tradeSteamInventoryResult.getStyle() : null) ? R.layout.item_inventory_spu_item : R.layout.item_inventory_item;
        }

        public void o(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            b2 b2Var;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45131, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            if (viewHolder.d() == R.layout.item_inventory_item) {
                Activity mContext = ((com.max.hbcommon.base.d) TradeDiscoverySecondaryFragment.this).mContext;
                f0.o(mContext, "mContext");
                TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
                Activity mContext2 = ((com.max.hbcommon.base.d) TradeDiscoverySecondaryFragment.this).mContext;
                f0.o(mContext2, "mContext");
                TradeInfoUtilKt.u(mContext2, viewHolder, data);
                Activity mContext3 = ((com.max.hbcommon.base.d) TradeDiscoverySecondaryFragment.this).mContext;
                f0.o(mContext3, "mContext");
                TradeInfoUtilKt.z(mContext3, viewHolder, data, false);
                Activity mContext4 = ((com.max.hbcommon.base.d) TradeDiscoverySecondaryFragment.this).mContext;
                f0.o(mContext4, "mContext");
                TradeInfoUtilKt.v(mContext4, viewHolder, data);
                viewHolder.itemView.setOnClickListener(new a(TradeDiscoverySecondaryFragment.this, data));
                return;
            }
            Activity mContext5 = ((com.max.hbcommon.base.d) TradeDiscoverySecondaryFragment.this).mContext;
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
            viewHolder.itemView.setOnClickListener(new b(TradeDiscoverySecondaryFragment.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 45133, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TradeSteamInventoryObj) obj);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class h implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f92838c;

        h(Ref.IntRef intRef) {
            this.f92838c = intRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45142, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            RecyclerView recyclerView = TradeDiscoverySecondaryFragment.this.B;
            if (recyclerView == null) {
                f0.S("rv_shortcut");
                recyclerView = null;
            }
            recyclerView.smoothScrollToPosition(this.f92838c.f124889b);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class i implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45143, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment = TradeDiscoverySecondaryFragment.this;
            tradeDiscoverySecondaryFragment.F = ((KeyDescObj) tradeDiscoverySecondaryFragment.H.get(i10)).getValue();
            TradeDiscoverySecondaryFragment.W4(TradeDiscoverySecondaryFragment.this, 0);
            TradeDiscoverySecondaryFragment.this.D = null;
            TradeDiscoverySecondaryFragment.E4(TradeDiscoverySecondaryFragment.this);
        }
    }

    /* JADX INFO: compiled from: TradeDiscoverySecondaryFragment.kt */
    public static final class j implements OnTabSelectListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabReselect(int i10) {
        }

        @Override // com.flyco.tablayout.listener.OnTabSelectListener
        public void onTabSelect(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45144, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment = TradeDiscoverySecondaryFragment.this;
            tradeDiscoverySecondaryFragment.F = ((KeyDescObj) tradeDiscoverySecondaryFragment.H.get(i10)).getValue();
            TradeDiscoverySecondaryFragment.W4(TradeDiscoverySecondaryFragment.this, 0);
            TradeDiscoverySecondaryFragment.this.D = null;
            TradeDiscoverySecondaryFragment.E4(TradeDiscoverySecondaryFragment.this);
        }
    }

    public static final /* synthetic */ void D4(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment) {
        if (PatchProxy.proxy(new Object[]{tradeDiscoverySecondaryFragment}, null, changeQuickRedirect, true, 45108, new Class[]{TradeDiscoverySecondaryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeDiscoverySecondaryFragment.e5();
    }

    public static final /* synthetic */ void E4(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment) {
        if (PatchProxy.proxy(new Object[]{tradeDiscoverySecondaryFragment}, null, changeQuickRedirect, true, 45110, new Class[]{TradeDiscoverySecondaryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeDiscoverySecondaryFragment.g5();
    }

    public static final /* synthetic */ int K4(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeDiscoverySecondaryFragment}, null, changeQuickRedirect, true, 45111, new Class[]{TradeDiscoverySecondaryFragment.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : tradeDiscoverySecondaryFragment.c4();
    }

    public static final /* synthetic */ void W4(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeDiscoverySecondaryFragment, new Integer(i10)}, null, changeQuickRedirect, true, 45109, new Class[]{TradeDiscoverySecondaryFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeDiscoverySecondaryFragment.r4(i10);
    }

    public static final /* synthetic */ void d5(TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment) {
        if (PatchProxy.proxy(new Object[]{tradeDiscoverySecondaryFragment}, null, changeQuickRedirect, true, 45112, new Class[]{TradeDiscoverySecondaryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeDiscoverySecondaryFragment.showError();
    }

    private final void e5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45095, new Class[0], Void.TYPE).isSupported && isActive()) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = this.f92825z;
            SmartRefreshLayout smartRefreshLayout = null;
            if (consecutiveScrollerLayout == null) {
                f0.S("mConsecutiveScrollerLayout");
                consecutiveScrollerLayout = null;
            }
            consecutiveScrollerLayout.scrollTo(0, 0);
            SmartRefreshLayout smartRefreshLayout2 = this.f92824y;
            if (smartRefreshLayout2 == null) {
                f0.S("mRefreshLayout");
            } else {
                smartRefreshLayout = smartRefreshLayout2;
            }
            smartRefreshLayout.F();
        }
    }

    private final void f5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45096, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92816q;
        View view2 = null;
        if (view == null) {
            f0.S("mRootView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.srl);
        f0.o(viewFindViewById, "mRootView.findViewById(R.id.srl)");
        this.f92824y = (SmartRefreshLayout) viewFindViewById;
        View view3 = this.f92816q;
        if (view3 == null) {
            f0.S("mRootView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.csl);
        f0.o(viewFindViewById2, "mRootView.findViewById(R.id.csl)");
        this.f92825z = (ConsecutiveScrollerLayout) viewFindViewById2;
        View view4 = this.f92816q;
        if (view4 == null) {
            f0.S("mRootView");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.rv);
        f0.o(viewFindViewById3, "mRootView.findViewById(R.id.rv)");
        this.A = (RecyclerView) viewFindViewById3;
        View view5 = this.f92816q;
        if (view5 == null) {
            f0.S("mRootView");
            view5 = null;
        }
        View viewFindViewById4 = view5.findViewById(R.id.tv_item_count);
        f0.o(viewFindViewById4, "mRootView.findViewById(R.id.tv_item_count)");
        this.f92818s = (TextView) viewFindViewById4;
        View view6 = this.f92816q;
        if (view6 == null) {
            f0.S("mRootView");
            view6 = null;
        }
        View viewFindViewById5 = view6.findViewById(R.id.tv_value);
        f0.o(viewFindViewById5, "mRootView.findViewById(R.id.tv_value)");
        this.f92822w = (TextView) viewFindViewById5;
        View view7 = this.f92816q;
        if (view7 == null) {
            f0.S("mRootView");
            view7 = null;
        }
        View viewFindViewById6 = view7.findViewById(R.id.tv_count_desc);
        f0.o(viewFindViewById6, "mRootView.findViewById(R.id.tv_count_desc)");
        this.f92819t = (TextView) viewFindViewById6;
        View view8 = this.f92816q;
        if (view8 == null) {
            f0.S("mRootView");
            view8 = null;
        }
        View viewFindViewById7 = view8.findViewById(R.id.tv_title_tips);
        f0.o(viewFindViewById7, "mRootView.findViewById(R.id.tv_title_tips)");
        this.f92820u = (TextView) viewFindViewById7;
        View view9 = this.f92816q;
        if (view9 == null) {
            f0.S("mRootView");
            view9 = null;
        }
        View viewFindViewById8 = view9.findViewById(R.id.tv_title_symbol);
        f0.o(viewFindViewById8, "mRootView.findViewById(R.id.tv_title_symbol)");
        this.f92821v = (TextView) viewFindViewById8;
        View view10 = this.f92816q;
        if (view10 == null) {
            f0.S("mRootView");
            view10 = null;
        }
        View viewFindViewById9 = view10.findViewById(R.id.iv_filter);
        f0.o(viewFindViewById9, "mRootView.findViewById(R.id.iv_filter)");
        this.f92817r = (ImageView) viewFindViewById9;
        View view11 = this.f92816q;
        if (view11 == null) {
            f0.S("mRootView");
            view11 = null;
        }
        View viewFindViewById10 = view11.findViewById(R.id.tab_title);
        f0.o(viewFindViewById10, "mRootView.findViewById(R.id.tab_title)");
        this.f92823x = (CommonTabLayout) viewFindViewById10;
        View view12 = this.f92816q;
        if (view12 == null) {
            f0.S("mRootView");
            view12 = null;
        }
        this.L = (SegmentFilterSelected) view12.findViewById(R.id.filter_selected);
        View view13 = this.f92816q;
        if (view13 == null) {
            f0.S("mRootView");
            view13 = null;
        }
        View viewFindViewById11 = view13.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById11, "mRootView.findViewById(R.id.vg_invntory_empty)");
        this.C = viewFindViewById11;
        View view14 = this.f92816q;
        if (view14 == null) {
            f0.S("mRootView");
        } else {
            view2 = view14;
        }
        View viewFindViewById12 = view2.findViewById(R.id.rv_shortcut);
        f0.o(viewFindViewById12, "mRootView.findViewById(R.id.rv_shortcut)");
        this.B = (RecyclerView) viewFindViewById12;
    }

    private final void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45099, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        List<KeyDescObj> list = this.H;
        String str = list == null || list.isEmpty() ? "1" : "0";
        HashMap map = new HashMap();
        for (String str2 : this.M.getFilterMap().keySet()) {
            List<TradeFilterItemObj> list2 = this.M.getFilterMap().get(str2);
            if (list2 != null && (!list2.isEmpty())) {
                map.put(str2, CollectionsKt___CollectionsKt.h3(list2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new l<TradeFilterItemObj, CharSequence>() { // from class: com.max.xiaoheihe.module.trade.TradeDiscoverySecondaryFragment$getData$1$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @dl.d
                    public final CharSequence a(@dl.d TradeFilterItemObj itemobj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemobj}, this, changeQuickRedirect, false, 45120, new Class[]{TradeFilterItemObj.class}, CharSequence.class);
                        if (patchProxyResultProxy.isSupported) {
                            return (CharSequence) patchProxyResultProxy.result;
                        }
                        f0.p(itemobj, "itemobj");
                        return itemobj.getValue();
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ CharSequence invoke(TradeFilterItemObj tradeFilterItemObj) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeFilterItemObj}, this, changeQuickRedirect, false, 45121, new Class[]{Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(tradeFilterItemObj);
                    }
                }, 30, null));
            }
        }
        String minPrice = this.M.getMinPrice();
        if (minPrice != null) {
            if (minPrice.length() > 0) {
                map.put("price_min", minPrice);
            }
        }
        String maxPrice = this.M.getMaxPrice();
        if (maxPrice != null) {
            if (maxPrice.length() > 0) {
                map.put("price_max", maxPrice);
            }
        }
        String strD4 = d4();
        String strD5 = strD4 == null || strD4.length() == 0 ? null : d4();
        if (!(strD5 == null || strD5.length() == 0)) {
            l5();
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ia("secondary", str, map, this.F, this.E, strD5, this.D, c4(), 30).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void h5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45097, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f92818s;
        if (textView == null) {
            f0.S("tv_item_count");
            textView = null;
        }
        textView.setVisibility(8);
        TextView textView2 = this.f92819t;
        if (textView2 == null) {
            f0.S("tv_count_desc");
            textView2 = null;
        }
        textView2.setVisibility(8);
        TextView textView3 = this.f92820u;
        if (textView3 == null) {
            f0.S("tv_title_tips");
            textView3 = null;
        }
        textView3.setVisibility(8);
        TextView textView4 = this.f92821v;
        if (textView4 == null) {
            f0.S("tv_title_symbol");
            textView4 = null;
        }
        textView4.setVisibility(8);
        SmartRefreshLayout smartRefreshLayout = this.f92824y;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.setBackgroundResource(R.drawable.gradient_white_divider);
        SmartRefreshLayout smartRefreshLayout2 = this.f92824y;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.S(new c());
        SmartRefreshLayout smartRefreshLayout3 = this.f92824y;
        if (smartRefreshLayout3 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.f0(new d());
        SmartRefreshLayout smartRefreshLayout4 = this.f92824y;
        if (smartRefreshLayout4 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout4 = null;
        }
        smartRefreshLayout4.k0(new e());
        ImageView imageView = this.f92817r;
        if (imageView == null) {
            f0.S("iv_filter");
            imageView = null;
        }
        imageView.setOnClickListener(new f());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.mContext, 2);
        RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        int iF = ViewUtils.f(this.mContext, 10.0f);
        RecyclerView recyclerView2 = this.A;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setPadding(iF, iF, ViewUtils.f(this.mContext, 7.0f), ViewUtils.f(this.mContext, 4.0f));
        RecyclerView recyclerView3 = this.A;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) recyclerView3.getItemAnimator();
        f0.m(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        RecyclerView recyclerView4 = this.A;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipToPadding(false);
        RecyclerView recyclerView5 = this.A;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setClipChildren(false);
        g gVar = new g(this.mContext, this.G);
        this.I = gVar;
        gVar.setHasStableIds(true);
        RecyclerView recyclerView6 = this.A;
        if (recyclerView6 == null) {
            f0.S("mRecyclerView");
            recyclerView6 = null;
        }
        u<TradeSteamInventoryObj> uVar = this.I;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        recyclerView6.setAdapter(uVar);
        RecyclerView recyclerView7 = this.A;
        if (recyclerView7 == null) {
            f0.S("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.setItemAnimator(null);
    }

    private final void i5() {
        int i10;
        boolean z10;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45094, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<TradeFilterTabObj> arrayList = this.K;
        RecyclerView recyclerView = null;
        if (arrayList != null) {
            i10 = 0;
            for (TradeFilterTabObj tradeFilterTabObj : arrayList) {
                this.M.getFilterMap().put(tradeFilterTabObj.getKey(), new ArrayList());
                String key = tradeFilterTabObj.getKey();
                String str = this.N;
                if (str == null) {
                    f0.S("shortcut_key");
                    str = null;
                }
                if (f0.g(key, str)) {
                    Iterator<TradeFilterObj> it = tradeFilterTabObj.getList().iterator();
                    f0.o(it, "tab.list.iterator()");
                    while (it.hasNext()) {
                        TradeFilterObj next = it.next();
                        ArrayList<TradeFilterItemObj> list = next.getList();
                        f0.m(list);
                        Iterator<TradeFilterItemObj> it2 = list.iterator();
                        int i11 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i11 = i10;
                                z10 = false;
                                break;
                            }
                            int i12 = i11 + 1;
                            TradeFilterItemObj next2 = it2.next();
                            String str2 = this.O;
                            if (str2 == null) {
                                f0.S("shortcut_value");
                                str2 = null;
                            }
                            if (f0.g(str2, next2.getValue())) {
                                this.P = next.getList();
                                List<TradeFilterItemObj> list2 = this.M.getFilterMap().get(tradeFilterTabObj.getKey());
                                if (list2 != null) {
                                    list2.add(next2);
                                }
                                z10 = true;
                                break;
                            }
                            i11 = i12;
                        }
                        if (!z10) {
                            it.remove();
                        }
                        i10 = i11;
                    }
                }
            }
        } else {
            i10 = 0;
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.mContext);
        linearLayoutManager.setOrientation(0);
        RecyclerView recyclerView2 = this.B;
        if (recyclerView2 == null) {
            f0.S("rv_shortcut");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView3 = this.B;
        if (recyclerView3 == null) {
            f0.S("rv_shortcut");
            recyclerView3 = null;
        }
        recyclerView3.setPadding(ViewUtils.f(this.mContext, 9.0f), 0, ViewUtils.f(this.mContext, 9.0f), 0);
        RecyclerView recyclerView4 = this.B;
        if (recyclerView4 == null) {
            f0.S("rv_shortcut");
            recyclerView4 = null;
        }
        recyclerView4.setClipToPadding(false);
        RecyclerView recyclerView5 = this.B;
        if (recyclerView5 == null) {
            f0.S("rv_shortcut");
            recyclerView5 = null;
        }
        recyclerView5.setClipChildren(false);
        final Activity activity = this.mContext;
        final List<TradeFilterItemObj> list3 = this.P;
        this.Q = new s<TradeFilterItemObj>(activity, list3) { // from class: com.max.xiaoheihe.module.trade.TradeDiscoverySecondaryFragment$initfilter$2
            public static ChangeQuickRedirect changeQuickRedirect;

            public void m(@dl.d s.e viewHolder, @dl.d final TradeFilterItemObj data) {
                if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45137, new Class[]{s.e.class, TradeFilterItemObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(data, "data");
                ((TextView) viewHolder.i(R.id.tv_name)).setText(data.getDesc());
                ImageView imageView = (ImageView) viewHolder.i(R.id.iv_icon);
                View viewI = viewHolder.i(R.id.v_frame);
                com.max.hbimage.b.K(data.getImg(), imageView);
                Map<String, List<TradeFilterItemObj>> filterMap = this.f92840b.M.getFilterMap();
                String str3 = this.f92840b.N;
                if (str3 == null) {
                    f0.S("shortcut_key");
                    str3 = null;
                }
                List<TradeFilterItemObj> list4 = filterMap.get(str3);
                if (list4 != null && list4.contains(data)) {
                    viewI.setVisibility(0);
                } else {
                    viewI.setVisibility(8);
                }
                View view = viewHolder.itemView;
                final TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment = this.f92840b;
                view.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradeDiscoverySecondaryFragment$initfilter$2$onBindViewHolder$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        if (PatchProxy.proxy(new Object[]{view2}, this, changeQuickRedirect, false, 45139, new Class[]{View.class}, Void.TYPE).isSupported) {
                            return;
                        }
                        Map<String, List<TradeFilterItemObj>> filterMap2 = tradeDiscoverySecondaryFragment.M.getFilterMap();
                        String str4 = tradeDiscoverySecondaryFragment.N;
                        String str5 = null;
                        if (str4 == null) {
                            f0.S("shortcut_key");
                            str4 = null;
                        }
                        List<TradeFilterItemObj> list5 = filterMap2.get(str4);
                        if (list5 != null && list5.contains(data)) {
                            Map<String, List<TradeFilterItemObj>> filterMap3 = tradeDiscoverySecondaryFragment.M.getFilterMap();
                            String str6 = tradeDiscoverySecondaryFragment.N;
                            if (str6 == null) {
                                f0.S("shortcut_key");
                                str6 = null;
                            }
                            List<TradeFilterItemObj> list6 = filterMap3.get(str6);
                            if (list6 != null && list6.size() == 1) {
                                return;
                            }
                            Map<String, List<TradeFilterItemObj>> filterMap4 = tradeDiscoverySecondaryFragment.M.getFilterMap();
                            String str7 = tradeDiscoverySecondaryFragment.N;
                            if (str7 == null) {
                                f0.S("shortcut_key");
                            } else {
                                str5 = str7;
                            }
                            List<TradeFilterItemObj> list7 = filterMap4.get(str5);
                            if (list7 != null) {
                                list7.remove(data);
                            }
                        } else {
                            List<TradeFilterItemObj> list8 = tradeDiscoverySecondaryFragment.P;
                            if (list8 != null) {
                                TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment2 = tradeDiscoverySecondaryFragment;
                                for (TradeFilterItemObj tradeFilterItemObj : list8) {
                                    Map<String, List<TradeFilterItemObj>> filterMap5 = tradeDiscoverySecondaryFragment2.M.getFilterMap();
                                    String str8 = tradeDiscoverySecondaryFragment2.N;
                                    if (str8 == null) {
                                        f0.S("shortcut_key");
                                        str8 = null;
                                    }
                                    List<TradeFilterItemObj> list9 = filterMap5.get(str8);
                                    if (list9 != null && list9.contains(tradeFilterItemObj)) {
                                        Map<String, List<TradeFilterItemObj>> filterMap6 = tradeDiscoverySecondaryFragment2.M.getFilterMap();
                                        String str9 = tradeDiscoverySecondaryFragment2.N;
                                        if (str9 == null) {
                                            f0.S("shortcut_key");
                                            str9 = null;
                                        }
                                        List<TradeFilterItemObj> list10 = filterMap6.get(str9);
                                        if (list10 != null) {
                                            list10.remove(tradeFilterItemObj);
                                        }
                                    }
                                }
                            }
                            Map<String, List<TradeFilterItemObj>> filterMap7 = tradeDiscoverySecondaryFragment.M.getFilterMap();
                            String str10 = tradeDiscoverySecondaryFragment.N;
                            if (str10 == null) {
                                f0.S("shortcut_key");
                            } else {
                                str5 = str10;
                            }
                            List<TradeFilterItemObj> list11 = filterMap7.get(str5);
                            if (list11 != null) {
                                list11.add(data);
                            }
                        }
                        notifyDataSetChanged();
                        TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
                        Activity mContext = ((com.max.hbcommon.base.d) tradeDiscoverySecondaryFragment).mContext;
                        f0.o(mContext, "mContext");
                        SegmentFilterSelected segmentFilterSelected = tradeDiscoverySecondaryFragment.L;
                        f0.m(segmentFilterSelected);
                        TradePageFilterWrapper tradePageFilterWrapper = tradeDiscoverySecondaryFragment.M;
                        final TradeDiscoverySecondaryFragment tradeDiscoverySecondaryFragment3 = tradeDiscoverySecondaryFragment;
                        aVar.a(mContext, segmentFilterSelected, tradePageFilterWrapper, tradeDiscoverySecondaryFragment3, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeDiscoverySecondaryFragment$initfilter$2$onBindViewHolder$1.2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            {
                                super(0);
                            }

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45141, new Class[0], Object.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return patchProxyResultProxy.result;
                                }
                                invoke2();
                                return b2.f124493a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45140, new Class[0], Void.TYPE).isSupported) {
                                    return;
                                }
                                TradeDiscoverySecondaryFragment.D4(tradeDiscoverySecondaryFragment3);
                            }
                        });
                        TradeDiscoverySecondaryFragment.D4(tradeDiscoverySecondaryFragment);
                    }
                });
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeFilterItemObj tradeFilterItemObj) {
                if (PatchProxy.proxy(new Object[]{eVar, tradeFilterItemObj}, this, changeQuickRedirect, false, 45138, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                m(eVar, tradeFilterItemObj);
            }
        };
        RecyclerView recyclerView6 = this.B;
        if (recyclerView6 == null) {
            f0.S("rv_shortcut");
            recyclerView6 = null;
        }
        s<TradeFilterItemObj> sVar = this.Q;
        if (sVar == null) {
            f0.S("mShortcutAdapter");
            sVar = null;
        }
        recyclerView6.setAdapter(sVar);
        RecyclerView recyclerView7 = this.B;
        if (recyclerView7 == null) {
            f0.S("rv_shortcut");
        } else {
            recyclerView = recyclerView7;
        }
        recyclerView.smoothScrollToPosition(i10);
    }

    private final void j5() {
        ArrayList<TradeSteamInventoryObj> list;
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45103, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (c4() == 0) {
            this.G.clear();
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.J;
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.G.addAll(list);
        }
        List<TradeSteamInventoryObj> list2 = this.G;
        RecyclerView recyclerView = null;
        if (list2 == null || list2.isEmpty()) {
            n5();
        } else {
            View view = this.C;
            if (view == null) {
                f0.S("vg_invntory_empty");
                view = null;
            }
            view.setVisibility(8);
            RecyclerView recyclerView2 = this.A;
            if (recyclerView2 == null) {
                f0.S("mRecyclerView");
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(0);
            u<TradeSteamInventoryObj> uVar = this.I;
            if (uVar == null) {
                f0.S("mAdapter");
                uVar = null;
            }
            uVar.notifyDataSetChanged();
        }
        Ref.IntRef intRef = new Ref.IntRef();
        List<TradeFilterItemObj> list3 = this.P;
        f0.m(list3);
        for (TradeFilterItemObj tradeFilterItemObj : list3) {
            int i11 = i10 + 1;
            Map<String, List<TradeFilterItemObj>> filterMap = this.M.getFilterMap();
            String str = this.N;
            if (str == null) {
                f0.S("shortcut_key");
                str = null;
            }
            List<TradeFilterItemObj> list4 = filterMap.get(str);
            f0.m(list4);
            if (list4.contains(tradeFilterItemObj)) {
                intRef.f124889b = i10;
                break;
            }
            i10 = i11;
        }
        RecyclerView recyclerView3 = this.B;
        if (recyclerView3 == null) {
            f0.S("rv_shortcut");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.post(new h(intRef));
    }

    private final void k5() {
        int i10 = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45101, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<CustomTabEntity> arrayList = new ArrayList<>();
        int i11 = 0;
        for (KeyDescObj keyDescObj : this.H) {
            int i12 = i10 + 1;
            arrayList.add(new TabEntity(keyDescObj.getDesc()));
            if (f0.g(keyDescObj.getValue(), this.F)) {
                i11 = i10;
            }
            i10 = i12;
        }
        CommonTabLayout commonTabLayout = this.f92823x;
        CommonTabLayout commonTabLayout2 = null;
        if (commonTabLayout == null) {
            f0.S("tab_title");
            commonTabLayout = null;
        }
        commonTabLayout.setTabData(arrayList);
        CommonTabLayout commonTabLayout3 = this.f92823x;
        if (commonTabLayout3 == null) {
            f0.S("tab_title");
            commonTabLayout3 = null;
        }
        commonTabLayout3.setOnTabSelectListener(new i());
        CommonTabLayout commonTabLayout4 = this.f92823x;
        if (commonTabLayout4 == null) {
            f0.S("tab_title");
        } else {
            commonTabLayout2 = commonTabLayout4;
        }
        commonTabLayout2.setCurrentTab(i11);
    }

    private final void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45102, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ArrayList<CustomTabEntity> arrayList = new ArrayList<>();
        arrayList.add(new TabEntity(this.H.get(0).getDesc()));
        this.F = this.H.get(0).getValue();
        CommonTabLayout commonTabLayout = this.f92823x;
        CommonTabLayout commonTabLayout2 = null;
        if (commonTabLayout == null) {
            f0.S("tab_title");
            commonTabLayout = null;
        }
        commonTabLayout.setCurrentTab(0);
        CommonTabLayout commonTabLayout3 = this.f92823x;
        if (commonTabLayout3 == null) {
            f0.S("tab_title");
            commonTabLayout3 = null;
        }
        commonTabLayout3.setTabData(arrayList);
        CommonTabLayout commonTabLayout4 = this.f92823x;
        if (commonTabLayout4 == null) {
            f0.S("tab_title");
        } else {
            commonTabLayout2 = commonTabLayout4;
        }
        commonTabLayout2.setOnTabSelectListener(new j());
    }

    private final void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45104, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.C;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        RecyclerView recyclerView = this.A;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        View view3 = this.C;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.C;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
            view4 = null;
        }
        View viewFindViewById2 = view4.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        View view5 = this.C;
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

    @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
    @dl.d
    public TradePageFilterWrapper H3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45106, new Class[0], TradePageFilterWrapper.class);
        return patchProxyResultProxy.isSupported ? (TradePageFilterWrapper) patchProxyResultProxy.result : this.M.deepCopyByJson();
    }

    @Override // com.max.hbsearch.k
    public void P3(@dl.e String str, int i10, int i11) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45092, new Class[]{String.class, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        s4(str);
        r4(i10);
        if (c4() == 0) {
            this.D = null;
        }
        g5();
    }

    @Override // com.max.hbsearch.k
    @dl.e
    public String Y3() {
        return com.max.hbsearch.l.O;
    }

    @Override // com.max.hbsearch.k
    @dl.e
    public List<SearchHotwordObj> Z3() {
        return null;
    }

    @Override // com.max.hbsearch.k
    public int i4() {
        return 36;
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 45093, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_trade_discovery_secondary);
        this.f92816q = rootView;
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable(com.max.xiaoheihe.module.search.b.f91614a.a()) : null;
        f0.n(serializable, "null cannot be cast to non-null type java.util.ArrayList<com.max.xiaoheihe.bean.trade.TradeFilterTabObj>{ kotlin.collections.TypeAliasesKt.ArrayList<com.max.xiaoheihe.bean.trade.TradeFilterTabObj> }");
        ArrayList arrayList = (ArrayList) serializable;
        ArrayList arrayList2 = new ArrayList(t.Y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((TradeFilterTabObj) it.next()).copy());
        }
        this.K = new ArrayList<>(arrayList2);
        Bundle arguments2 = getArguments();
        f0.m(arguments2);
        com.max.xiaoheihe.module.search.b bVar = com.max.xiaoheihe.module.search.b.f91614a;
        String string = arguments2.getString(bVar.g());
        f0.m(string);
        this.N = string;
        Bundle arguments3 = getArguments();
        f0.m(arguments3);
        String string2 = arguments3.getString(bVar.h());
        f0.m(string2);
        this.O = string2;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        this.R = new TradeItemFilterManager(mContext, this);
        f5();
        h5();
        i5();
        showLoading();
        g5();
    }

    @Override // com.max.hbsearch.k
    @dl.d
    public String j4() {
        return "搜索饰品";
    }

    @Override // com.max.hbsearch.k
    public void l4() {
    }

    @Override // com.max.hbsearch.k
    public void m4() {
    }

    public final void m5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45100, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        String strD4 = d4();
        if (strD4 == null || strD4.length() == 0) {
            k5();
        }
        TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        SegmentFilterSelected segmentFilterSelected = this.L;
        f0.m(segmentFilterSelected);
        aVar.a(mContext, segmentFilterSelected, this.M, this, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeDiscoverySecondaryFragment$showData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45146, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45145, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeDiscoverySecondaryFragment.D4(this.f92846b);
            }
        });
        s<TradeFilterItemObj> sVar = this.Q;
        if (sVar == null) {
            f0.S("mShortcutAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
        j5();
    }

    @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
    public void n2(@dl.d TradePageFilterWrapper filterWrapper) {
        if (PatchProxy.proxy(new Object[]{filterWrapper}, this, changeQuickRedirect, false, 45105, new Class[]{TradePageFilterWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(filterWrapper, "filterWrapper");
        this.M = filterWrapper.deepCopyByJson();
        s<TradeFilterItemObj> sVar = this.Q;
        if (sVar == null) {
            f0.S("mShortcutAdapter");
            sVar = null;
        }
        sVar.notifyDataSetChanged();
        e5();
    }

    @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
    @dl.e
    public ArrayList<TradeFilterTabObj> n3() {
        return this.K;
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45098, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        r4(0);
        this.D = null;
        g5();
    }

    @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
    @dl.d
    public String z1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45107, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str = this.N;
        if (str != null) {
            return str;
        }
        f0.S("shortcut_key");
        return null;
    }
}
