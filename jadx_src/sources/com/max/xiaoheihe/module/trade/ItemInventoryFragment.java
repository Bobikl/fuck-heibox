package com.max.xiaoheihe.module.trade;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.donkingliang.consecutivescroller.ConsecutiveScrollerLayout;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.igexin.sdk.BuildConfig;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.AdsBannerObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.FilterButtonView;
import com.max.hbcommon.component.HeyBoxPopupMenu;
import com.max.hbcommon.component.TitleBar;
import com.max.hbcommon.component.segmentfilters.SegmentFilterSelected;
import com.max.hbcommon.network.ApiException;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.account.UpdateObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.trade.TradeFilterItemObj;
import com.max.xiaoheihe.bean.trade.TradeFilterObj;
import com.max.xiaoheihe.bean.trade.TradeFilterTabObj;
import com.max.xiaoheihe.bean.trade.TradeInfoObj;
import com.max.xiaoheihe.bean.trade.TradePageFilterWrapper;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.module.game.d0;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.tencent.open.SocialConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: ItemInventoryFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nItemInventoryFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemInventoryFragment.kt\ncom/max/xiaoheihe/module/trade/ItemInventoryFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1023:1\n1#2:1024\n1855#3,2:1025\n1855#3,2:1027\n1855#3,2:1029\n1549#3:1031\n1620#3,3:1032\n*S KotlinDebug\n*F\n+ 1 ItemInventoryFragment.kt\ncom/max/xiaoheihe/module/trade/ItemInventoryFragment\n*L\n940#1:1025,2\n958#1:1027,2\n977#1:1029,2\n1006#1:1031\n1006#1:1032,3\n*E\n"})
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ItemInventoryFragment extends com.max.xiaoheihe.module.littleprogram.fragment.b implements com.max.xiaoheihe.module.trade.d.a {
    public static final int X = 3;

    @dl.e
    private static Void Y;
    public static ChangeQuickRedirect changeQuickRedirect;
    private u<TradeSteamInventoryObj> D;

    @dl.e
    private TradeSteamInventoryResult E;
    private int F;

    @dl.e
    private ArrayList<TradeFilterTabObj> G;

    @dl.e
    private SegmentFilterSelected H;
    private boolean L;

    @dl.e
    private TradeMsgBroadcastReceiver M;
    private GridLayoutManager O;

    @dl.e
    private String P;
    private long Q;
    private boolean R;

    @dl.e
    private ObjectAnimator S;
    private TradeItemFilterManager T;

    @dl.e
    private qf.a U;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f92407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private MarqueeTextView f92408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f92409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f92410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f92411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f92412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f92413i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private TextView f92414j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f92415k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private TextView f92416l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private FilterButtonView f92417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f92418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View f92419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ImageView f92420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private SmartRefreshLayout f92421q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RecyclerView f92422r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ConsecutiveScrollerLayout f92423s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f92424t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private BannerViewPager<AdsBannerObj> f92425u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private View f92426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f92427w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private View f92428x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private com.max.xiaoheihe.module.trade.d f92429y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f92430z;

    @dl.d
    public static final a V = new a(null);
    public static final int W = 8;

    @dl.d
    private static String Z = SocialConstants.PARAM_APP_DESC;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static String f92405a0 = "asc";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static int f92406b0 = 200;

    @dl.e
    private String A = (String) Y;

    @dl.d
    private final List<TradeSteamInventoryObj> B = new ArrayList();

    @dl.d
    private final List<TradeSteamInventoryObj> C = new ArrayList();

    @dl.d
    private TradePageFilterWrapper I = new TradePageFilterWrapper(null, null, null, 7, null);
    private int J = -1;
    private int K = -1;
    private boolean N = true;

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ ItemInventoryFragment f(a aVar, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 44357, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, ItemInventoryFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ItemInventoryFragment) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.e(z10);
        }

        public final int a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44354, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ItemInventoryFragment.f92406b0;
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44352, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : ItemInventoryFragment.f92405a0;
        }

        @dl.e
        public final Void c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44348, new Class[0], Void.class);
            return patchProxyResultProxy.isSupported ? (Void) patchProxyResultProxy.result : ItemInventoryFragment.Y;
        }

        @dl.d
        public final String d() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44350, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : ItemInventoryFragment.Z;
        }

        @dl.d
        public final ItemInventoryFragment e(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44356, new Class[]{Boolean.TYPE}, ItemInventoryFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ItemInventoryFragment) patchProxyResultProxy.result;
            }
            ItemInventoryFragment itemInventoryFragment = new ItemInventoryFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("is_onsale", z10);
            itemInventoryFragment.setArguments(bundle);
            return itemInventoryFragment;
        }

        public final void g(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44355, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ItemInventoryFragment.f92406b0 = i10;
        }

        public final void h(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44353, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            ItemInventoryFragment.f92405a0 = str;
        }

        public final void i(@dl.e Void r10) {
            if (PatchProxy.proxy(new Object[]{r10}, this, changeQuickRedirect, false, 44349, new Class[]{Void.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemInventoryFragment.Y = r10;
        }

        public final void j(@dl.d String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44351, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(str, "<set-?>");
            ItemInventoryFragment.Z = str;
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class b implements l0.g {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.utils.l0.g
        public void a() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44358, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            if (!f0.g("1", com.max.hbcache.c.j("trade_exam_pass"))) {
                Activity activity = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
                TradeInfoUtilKt.T((BaseActivity) activity, null, 2, null);
                return;
            }
            Activity activity2 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
            ItemPutOnActivity.a aVar = ItemPutOnActivity.f92462y2;
            Activity mContext = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
            f0.o(mContext, "mContext");
            List list = ItemInventoryFragment.this.C;
            f0.n(list, "null cannot be cast to non-null type java.util.ArrayList<com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj>");
            activity2.startActivityForResult(aVar.a(mContext, (ArrayList) list, ItemInventoryFragment.this.L), ItemTradeCenterActivity.U.c());
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44360, new Class[0], Void.TYPE).isSupported && ItemInventoryFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = ItemInventoryFragment.this.f92421q;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemInventoryFragment.this.f92421q;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44359, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemInventoryFragment.this.isActive()) {
                super.onError(e10);
                if (e10 instanceof ApiException) {
                    ItemInventoryFragment.D4(ItemInventoryFragment.this);
                } else {
                    ItemInventoryFragment.E4(ItemInventoryFragment.this);
                }
                SmartRefreshLayout smartRefreshLayout = ItemInventoryFragment.this.f92421q;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemInventoryFragment.this.f92421q;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            Integer has_bind_steam;
            ArrayList<TradeFilterTabObj> filter;
            Integer has_trade_info;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44361, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemInventoryFragment.this.isActive()) {
                TradeSteamInventoryResult result2 = result.getResult();
                if ((result2 == null || (has_trade_info = result2.getHas_trade_info()) == null || has_trade_info.intValue() != 0) ? false : true) {
                    Activity mContext = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                    f0.o(mContext, "mContext");
                    TradeSteamInventoryResult result3 = result.getResult();
                    TradeInfoUtilKt.J(mContext, result3 != null ? result3.getHas_trade_info_desc() : null);
                } else {
                    TradeSteamInventoryResult result4 = result.getResult();
                    if ((result4 == null || (has_bind_steam = result4.getHas_bind_steam()) == null || has_bind_steam.intValue() != 0) ? false : true) {
                        Activity mContext2 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                        f0.o(mContext2, "mContext");
                        TradeInfoUtilKt.L(mContext2);
                    }
                }
                ItemInventoryFragment.this.E = result.getResult();
                TradeSteamInventoryResult tradeSteamInventoryResult = ItemInventoryFragment.this.E;
                if (tradeSteamInventoryResult != null && (filter = tradeSteamInventoryResult.getFilter()) != null) {
                    ItemInventoryFragment itemInventoryFragment = ItemInventoryFragment.this;
                    itemInventoryFragment.G = filter;
                    ArrayList<TradeFilterTabObj> arrayList = itemInventoryFragment.G;
                    if (arrayList != null) {
                        for (TradeFilterTabObj tradeFilterTabObj : arrayList) {
                            itemInventoryFragment.I.getFilterMap().put(tradeFilterTabObj.getKey(), new ArrayList());
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
                ItemInventoryFragment.this.a5();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44362, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<UpdateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f92434c;

        d(int i10) {
            this.f92434c = i10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44365, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemInventoryFragment.this.isActive()) {
                super.onError(e10);
                com.max.hbutils.utils.c.f("更新库存失败");
                ItemInventoryFragment.this.R = false;
                ItemInventoryFragment.H4(ItemInventoryFragment.this);
            }
        }

        public void onNext(@dl.d Result<UpdateObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44366, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemInventoryFragment.this.isActive()) {
                String state = result.getResult().getState();
                if (f0.g(state, "waiting")) {
                    int i10 = this.f92434c;
                    if (i10 < 9) {
                        ItemInventoryFragment.i4(ItemInventoryFragment.this, i10 + 1);
                        return;
                    }
                    com.max.hbutils.utils.c.f("更新库存超时");
                    ItemInventoryFragment.this.R = false;
                    ItemInventoryFragment.H4(ItemInventoryFragment.this);
                    return;
                }
                if (f0.g(state, z5.f.f141859j)) {
                    com.max.hbutils.utils.c.f("更新库存失败");
                    ItemInventoryFragment.this.R = false;
                    ItemInventoryFragment.H4(ItemInventoryFragment.this);
                } else {
                    ItemInventoryFragment.this.R = false;
                    ItemInventoryFragment.H4(ItemInventoryFragment.this);
                    ItemInventoryFragment.M3(ItemInventoryFragment.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44367, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<UpdateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class e extends u<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ItemInventoryFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemInventoryFragment f92436b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f92437c;

            a(ItemInventoryFragment itemInventoryFragment, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f92436b = itemInventoryFragment;
                this.f92437c = eVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44375, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                ItemInventoryFragment.G4(this.f92436b, this.f92437c.getAdapterPosition());
            }
        }

        /* JADX INFO: compiled from: ItemInventoryFragment.kt */
        public static final class b implements View.OnLongClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemInventoryFragment f92438b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f92439c;

            b(ItemInventoryFragment itemInventoryFragment, com.max.hbcommon.base.adapter.s.e eVar) {
                this.f92438b = itemInventoryFragment;
                this.f92439c = eVar;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44376, new Class[]{View.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                ItemInventoryFragment.G4(this.f92438b, this.f92439c.getAdapterPosition());
                return true;
            }
        }

        /* JADX INFO: compiled from: ItemInventoryFragment.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92440b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ItemInventoryFragment f92441c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<View> f92442d;

            c(TradeSteamInventoryObj tradeSteamInventoryObj, ItemInventoryFragment itemInventoryFragment, Ref.ObjectRef<View> objectRef) {
                this.f92440b = tradeSteamInventoryObj;
                this.f92441c = itemInventoryFragment;
                this.f92442d = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44377, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f92440b.getTrade_info() != null) {
                    if (System.currentTimeMillis() - this.f92441c.Q > 2000) {
                        this.f92441c.Q = System.currentTimeMillis();
                        TradeInfoObj trade_info = this.f92440b.getTrade_info();
                        Integer state = trade_info != null ? trade_info.getState() : null;
                        if (state != null && state.intValue() == 1) {
                            com.max.hbutils.utils.c.f("该物品正在出售");
                            return;
                        }
                        if (state != null && state.intValue() == 2) {
                            com.max.hbutils.utils.c.f("该物品不可交易");
                            return;
                        }
                        if (state != null && state.intValue() == 3) {
                            com.max.hbutils.utils.c.f("该物品正在交易冻结期");
                            return;
                        } else {
                            if (state != null && state.intValue() == 4) {
                                com.max.hbutils.utils.c.f("该物品处于停止出售状态");
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                int size = this.f92441c.C.size();
                a aVar = ItemInventoryFragment.V;
                if (size >= aVar.a() && !this.f92440b.getChecked()) {
                    com.max.hbutils.utils.c.f("最多同时选择" + aVar.a() + "件饰品");
                    return;
                }
                TradeSteamInventoryObj tradeSteamInventoryObj = this.f92440b;
                tradeSteamInventoryObj.setChecked(true ^ tradeSteamInventoryObj.getChecked());
                if (this.f92440b.getChecked()) {
                    this.f92442d.f124891b.setVisibility(0);
                } else {
                    this.f92442d.f124891b.setVisibility(8);
                }
                if (this.f92440b.getChecked()) {
                    if (this.f92441c.C.contains(this.f92440b)) {
                        return;
                    }
                    this.f92441c.C.add(this.f92440b);
                    ItemInventoryFragment.l4(this.f92441c);
                    return;
                }
                if (this.f92441c.C.contains(this.f92440b)) {
                    this.f92441c.C.remove(this.f92440b);
                    ItemInventoryFragment.l4(this.f92441c);
                }
            }
        }

        e(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44370, new Class[]{Integer.TYPE}, Long.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            String sku_id = ((TradeSteamInventoryObj) ItemInventoryFragment.this.B.get(i10)).getSku_id();
            return sku_id != null ? Long.parseLong(sku_id) : i10;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44374, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeSteamInventoryObj);
        }

        public int n(int i10, @dl.e TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44372, new Class[]{cls, TradeSteamInventoryObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return ItemInventoryFragment.this.N ? R.layout.item_inventory_item_format_3 : R.layout.item_inventory_item;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, android.view.View] */
        public void o(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44371, new Class[]{com.max.hbcommon.base.adapter.s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = viewHolder.i(R.id.vg_checked);
            c cVar = new c(data, ItemInventoryFragment.this, objectRef);
            if (data.getChecked()) {
                ((View) objectRef.f124891b).setVisibility(0);
            } else {
                ((View) objectRef.f124891b).setVisibility(8);
            }
            if (viewHolder.d() == R.layout.item_inventory_item) {
                View viewI = viewHolder.i(R.id.iv_item_bg);
                Activity mContext = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                f0.o(mContext, "mContext");
                TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
                Activity mContext2 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                f0.o(mContext2, "mContext");
                TradeInfoUtilKt.u(mContext2, viewHolder, data);
                Activity mContext3 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                f0.o(mContext3, "mContext");
                TradeInfoUtilKt.z(mContext3, viewHolder, data, false);
                Activity mContext4 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
                f0.o(mContext4, "mContext");
                TradeInfoUtilKt.v(mContext4, viewHolder, data);
                viewI.setOnClickListener(cVar);
                viewHolder.itemView.setOnClickListener(new a(ItemInventoryFragment.this, viewHolder));
                return;
            }
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_state);
            TextView textView = (TextView) viewHolder.i(R.id.tv_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            bb.d.d(textView, 5);
            bb.d.d(textView2, 5);
            textView.setText(data.getPrice());
            Activity mContext5 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
            f0.o(mContext5, "mContext");
            TradeInfoUtilKt.B(mContext5, viewHolder, data, false, 8, null);
            Activity mContext6 = ((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext;
            f0.o(mContext6, "mContext");
            TradeInfoUtilKt.u(mContext6, viewHolder, data);
            viewHolder.itemView.setOnClickListener(cVar);
            viewHolder.itemView.setOnLongClickListener(new b(ItemInventoryFragment.this, viewHolder));
            if (data.getTrade_info() == null) {
                imageView.setVisibility(8);
                return;
            }
            imageView.setVisibility(0);
            TradeInfoObj trade_info = data.getTrade_info();
            Integer state = trade_info != null ? trade_info.getState() : null;
            if (state != null && state.intValue() == 1) {
                imageView.setImageResource(R.drawable.trade_state_on_sale_12x12);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.light_blue));
                return;
            }
            if (state != null && state.intValue() == 2) {
                imageView.setImageResource(R.drawable.trade_state_non_tradable_12x12);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            } else if (state != null && state.intValue() == 3) {
                imageView.setImageResource(R.drawable.trade_state_locked_12x12);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            } else if (state != null && state.intValue() == 4) {
                imageView.setImageResource(R.drawable.trade_state_on_sale_12x12);
                imageView.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            }
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(com.max.hbcommon.base.adapter.s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 44373, new Class[]{com.max.hbcommon.base.adapter.s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TradeSteamInventoryObj) obj);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44380, new Class[]{View.class}, Void.TYPE).isSupported && i0.e(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext)) {
                ItemInventoryFragment itemInventoryFragment = ItemInventoryFragment.this;
                TradeSellSettingsActivity.a aVar = TradeSellSettingsActivity.W;
                Activity mContext = ((com.max.hbcommon.base.d) itemInventoryFragment).mContext;
                f0.o(mContext, "mContext");
                itemInventoryFragment.startActivityForResult(aVar.b(mContext), 3);
            }
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class g implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44381, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            ItemInventoryFragment.this.f92430z = 0;
            ItemInventoryFragment.m4(ItemInventoryFragment.this);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class h implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // pg.b
        public final void f(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44382, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            ItemInventoryFragment.this.f92430z += 30;
            ItemInventoryFragment.M3(ItemInventoryFragment.this);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44383, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeItemFilterManager tradeItemFilterManager = ItemInventoryFragment.this.T;
            if (tradeItemFilterManager == null) {
                f0.S("mTradeItemFilterManager");
                tradeItemFilterManager = null;
            }
            tradeItemFilterManager.k();
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44384, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemInventoryFragment itemInventoryFragment = ItemInventoryFragment.this;
            itemInventoryFragment.N = true ^ itemInventoryFragment.N;
            u uVar = null;
            if (ItemInventoryFragment.this.N) {
                GridLayoutManager gridLayoutManager = ItemInventoryFragment.this.O;
                if (gridLayoutManager == null) {
                    f0.S("rvlayoutManager");
                    gridLayoutManager = null;
                }
                gridLayoutManager.setSpanCount(3);
                int iF = ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 2.0f);
                RecyclerView recyclerView = ItemInventoryFragment.this.f92422r;
                if (recyclerView == null) {
                    f0.S("mRecyclerView");
                    recyclerView = null;
                }
                recyclerView.setPadding(iF, ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 8.0f), ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 2.0f), ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 54.0f));
                ImageView imageView = ItemInventoryFragment.this.f92411g;
                if (imageView == null) {
                    f0.S("iv_format");
                    imageView = null;
                }
                imageView.setImageResource(R.drawable.format_card_feed3);
            } else {
                GridLayoutManager gridLayoutManager2 = ItemInventoryFragment.this.O;
                if (gridLayoutManager2 == null) {
                    f0.S("rvlayoutManager");
                    gridLayoutManager2 = null;
                }
                gridLayoutManager2.setSpanCount(2);
                int iF2 = ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 10.0f);
                RecyclerView recyclerView2 = ItemInventoryFragment.this.f92422r;
                if (recyclerView2 == null) {
                    f0.S("mRecyclerView");
                    recyclerView2 = null;
                }
                recyclerView2.setPadding(iF2, iF2, ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 7.0f), ViewUtils.f(((com.max.hbcommon.base.d) ItemInventoryFragment.this).mContext, 54.0f));
                ImageView imageView2 = ItemInventoryFragment.this.f92411g;
                if (imageView2 == null) {
                    f0.S("iv_format");
                    imageView2 = null;
                }
                imageView2.setImageResource(R.drawable.format_card_feed2);
            }
            u uVar2 = ItemInventoryFragment.this.D;
            if (uVar2 == null) {
                f0.S("mAdapter");
            } else {
                uVar = uVar2;
            }
            uVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class k extends RecyclerView.OnScrollListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(@dl.d RecyclerView recyclerView, int i10, int i11) {
            Object[] objArr = {recyclerView, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44385, new Class[]{RecyclerView.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(recyclerView, "recyclerView");
            ItemInventoryFragment itemInventoryFragment = ItemInventoryFragment.this;
            GridLayoutManager gridLayoutManager = itemInventoryFragment.O;
            GridLayoutManager gridLayoutManager2 = null;
            if (gridLayoutManager == null) {
                f0.S("rvlayoutManager");
                gridLayoutManager = null;
            }
            itemInventoryFragment.J = gridLayoutManager.findFirstVisibleItemPosition();
            ItemInventoryFragment itemInventoryFragment2 = ItemInventoryFragment.this;
            GridLayoutManager gridLayoutManager3 = itemInventoryFragment2.O;
            if (gridLayoutManager3 == null) {
                f0.S("rvlayoutManager");
            } else {
                gridLayoutManager2 = gridLayoutManager3;
            }
            itemInventoryFragment2.K = gridLayoutManager2.findLastVisibleItemPosition();
            com.max.hbcommon.utils.d.b("zzzztest", "Math.visiableStart==" + ItemInventoryFragment.this.J + "    visiableEnd==" + ItemInventoryFragment.this.K);
            ItemInventoryFragment.l4(ItemInventoryFragment.this);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44386, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemInventoryFragment.F4(ItemInventoryFragment.this);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class m implements TradeItemFilterManager.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        @dl.d
        public TradePageFilterWrapper H3() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44389, new Class[0], TradePageFilterWrapper.class);
            return patchProxyResultProxy.isSupported ? (TradePageFilterWrapper) patchProxyResultProxy.result : ItemInventoryFragment.this.I.deepCopyByJson();
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        public void n2(@dl.d TradePageFilterWrapper filterWrapper) {
            if (PatchProxy.proxy(new Object[]{filterWrapper}, this, changeQuickRedirect, false, 44387, new Class[]{TradePageFilterWrapper.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(filterWrapper, "filterWrapper");
            ItemInventoryFragment.this.I = filterWrapper.deepCopyByJson();
            ItemInventoryFragment.this.I4();
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        @dl.e
        public ArrayList<TradeFilterTabObj> n3() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44388, new Class[0], ArrayList.class);
            return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : ItemInventoryFragment.this.G;
        }

        @Override // com.max.xiaoheihe.module.trade.TradeItemFilterManager.b
        @dl.d
        public String z1() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44390, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeItemFilterManager.b.a.a(this);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class n extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44391, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemInventoryFragment.this.isActive()) {
                super.onNext((Result) result);
                ItemInventoryFragment.this.C.clear();
                ItemInventoryFragment.this.I4();
                qf.a aVar = ItemInventoryFragment.this.U;
                if (aVar != null) {
                    aVar.t2();
                }
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44392, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44393, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ItemInventoryFragment.this.T4();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class p implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f92456b = new p();
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44394, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class q extends com.max.hbcommon.network.d<Result<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44395, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemInventoryFragment.this.isActive()) {
                ItemInventoryFragment.this.R = false;
                ItemInventoryFragment.H4(ItemInventoryFragment.this);
                if (e10 instanceof ApiException) {
                    ItemInventoryFragment.D4(ItemInventoryFragment.this);
                } else {
                    com.max.hbutils.utils.c.f("更新库存失败");
                }
            }
        }

        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44396, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemInventoryFragment.this.isActive()) {
                ItemInventoryFragment.i4(ItemInventoryFragment.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44397, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            qf.a aVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44400, new Class[]{View.class}, Void.TYPE).isSupported || (aVar = ItemInventoryFragment.this.U) == null) {
                return;
            }
            aVar.f1(4);
        }
    }

    /* JADX INFO: compiled from: ItemInventoryFragment.kt */
    public static final class s implements HeyBoxPopupMenu.h {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.hbcommon.component.HeyBoxPopupMenu.h
        public final void a(View view, KeyDescObj keyDescObj) {
            if (PatchProxy.proxy(new Object[]{view, keyDescObj}, this, changeQuickRedirect, false, 44401, new Class[]{View.class, KeyDescObj.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemInventoryFragment.this.A = keyDescObj.getKey();
            FilterButtonView filterButtonView = ItemInventoryFragment.this.f92417m;
            if (filterButtonView == null) {
                f0.S("fbv_sort");
                filterButtonView = null;
            }
            filterButtonView.setChecked(true);
            ItemInventoryFragment.n4(ItemInventoryFragment.this);
            ItemInventoryFragment.this.I4();
        }
    }

    public static final /* synthetic */ void D4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44344, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.b5();
    }

    public static final /* synthetic */ void E4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44346, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.showError();
    }

    public static final /* synthetic */ void F4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44340, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.c5();
    }

    public static final /* synthetic */ void G4(ItemInventoryFragment itemInventoryFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment, new Integer(i10)}, null, changeQuickRedirect, true, 44342, new Class[]{ItemInventoryFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.d5(i10);
    }

    public static final /* synthetic */ void H4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44343, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.e5();
    }

    private final void J4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44309, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92407c;
        View view2 = null;
        if (view == null) {
            f0.S("mRootView");
            view = null;
        }
        View viewFindViewById = view.findViewById(R.id.srl);
        f0.o(viewFindViewById, "mRootView.findViewById(R.id.srl)");
        this.f92421q = (SmartRefreshLayout) viewFindViewById;
        View view3 = this.f92407c;
        if (view3 == null) {
            f0.S("mRootView");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "mRootView.findViewById(R.id.rv)");
        this.f92422r = (RecyclerView) viewFindViewById2;
        View view4 = this.f92407c;
        if (view4 == null) {
            f0.S("mRootView");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.csl);
        f0.o(viewFindViewById3, "mRootView.findViewById(R.id.csl)");
        this.f92423s = (ConsecutiveScrollerLayout) viewFindViewById3;
        View view5 = this.f92407c;
        if (view5 == null) {
            f0.S("mRootView");
            view5 = null;
        }
        View viewFindViewById4 = view5.findViewById(R.id.tv_message);
        f0.o(viewFindViewById4, "mRootView.findViewById(R.id.tv_message)");
        this.f92408d = (MarqueeTextView) viewFindViewById4;
        View view6 = this.f92407c;
        if (view6 == null) {
            f0.S("mRootView");
            view6 = null;
        }
        View viewFindViewById5 = view6.findViewById(R.id.vg_message);
        f0.o(viewFindViewById5, "mRootView.findViewById(R.id.vg_message)");
        this.f92409e = viewFindViewById5;
        View view7 = this.f92407c;
        if (view7 == null) {
            f0.S("mRootView");
            view7 = null;
        }
        View viewFindViewById6 = view7.findViewById(R.id.tv_item_count);
        f0.o(viewFindViewById6, "mRootView.findViewById(R.id.tv_item_count)");
        this.f92413i = (TextView) viewFindViewById6;
        View view8 = this.f92407c;
        if (view8 == null) {
            f0.S("mRootView");
            view8 = null;
        }
        View viewFindViewById7 = view8.findViewById(R.id.tv_value);
        f0.o(viewFindViewById7, "mRootView.findViewById(R.id.tv_value)");
        this.f92418n = (TextView) viewFindViewById7;
        View view9 = this.f92407c;
        if (view9 == null) {
            f0.S("mRootView");
            view9 = null;
        }
        View viewFindViewById8 = view9.findViewById(R.id.vg_refreshing);
        f0.o(viewFindViewById8, "mRootView.findViewById(R.id.vg_refreshing)");
        this.f92419o = viewFindViewById8;
        View view10 = this.f92407c;
        if (view10 == null) {
            f0.S("mRootView");
            view10 = null;
        }
        View viewFindViewById9 = view10.findViewById(R.id.iv_refreshing);
        f0.o(viewFindViewById9, "mRootView.findViewById(R.id.iv_refreshing)");
        this.f92420p = (ImageView) viewFindViewById9;
        View view11 = this.f92407c;
        if (view11 == null) {
            f0.S("mRootView");
            view11 = null;
        }
        View viewFindViewById10 = view11.findViewById(R.id.tv_count_desc);
        f0.o(viewFindViewById10, "mRootView.findViewById(R.id.tv_count_desc)");
        this.f92414j = (TextView) viewFindViewById10;
        View view12 = this.f92407c;
        if (view12 == null) {
            f0.S("mRootView");
            view12 = null;
        }
        View viewFindViewById11 = view12.findViewById(R.id.tv_title_tips);
        f0.o(viewFindViewById11, "mRootView.findViewById(R.id.tv_title_tips)");
        this.f92415k = (TextView) viewFindViewById11;
        View view13 = this.f92407c;
        if (view13 == null) {
            f0.S("mRootView");
            view13 = null;
        }
        View viewFindViewById12 = view13.findViewById(R.id.tv_title_symbol);
        f0.o(viewFindViewById12, "mRootView.findViewById(R.id.tv_title_symbol)");
        this.f92416l = (TextView) viewFindViewById12;
        View view14 = this.f92407c;
        if (view14 == null) {
            f0.S("mRootView");
            view14 = null;
        }
        View viewFindViewById13 = view14.findViewById(R.id.fbv_sort);
        f0.o(viewFindViewById13, "mRootView.findViewById(R.id.fbv_sort)");
        this.f92417m = (FilterButtonView) viewFindViewById13;
        View view15 = this.f92407c;
        if (view15 == null) {
            f0.S("mRootView");
            view15 = null;
        }
        View viewFindViewById14 = view15.findViewById(R.id.iv_filter);
        f0.o(viewFindViewById14, "mRootView.findViewById(R.id.iv_filter)");
        this.f92410f = (ImageView) viewFindViewById14;
        View view16 = this.f92407c;
        if (view16 == null) {
            f0.S("mRootView");
            view16 = null;
        }
        View viewFindViewById15 = view16.findViewById(R.id.iv_format);
        f0.o(viewFindViewById15, "mRootView.findViewById(R.id.iv_format)");
        this.f92411g = (ImageView) viewFindViewById15;
        View view17 = this.f92407c;
        if (view17 == null) {
            f0.S("mRootView");
            view17 = null;
        }
        View viewFindViewById16 = view17.findViewById(R.id.v_divider_2);
        f0.o(viewFindViewById16, "mRootView.findViewById(R.id.v_divider_2)");
        this.f92412h = viewFindViewById16;
        View view18 = this.f92407c;
        if (view18 == null) {
            f0.S("mRootView");
            view18 = null;
        }
        this.H = (SegmentFilterSelected) view18.findViewById(R.id.filter_selected);
        View view19 = this.f92407c;
        if (view19 == null) {
            f0.S("mRootView");
            view19 = null;
        }
        View viewFindViewById17 = view19.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById17, "mRootView.findViewById(R.id.vg_invntory_empty)");
        this.f92424t = viewFindViewById17;
        View view20 = this.f92407c;
        if (view20 == null) {
            f0.S("mRootView");
            view20 = null;
        }
        View viewFindViewById18 = view20.findViewById(R.id.banner);
        f0.o(viewFindViewById18, "mRootView.findViewById(R.id.banner)");
        this.f92425u = (BannerViewPager) viewFindViewById18;
        View view21 = this.f92407c;
        if (view21 == null) {
            f0.S("mRootView");
            view21 = null;
        }
        View viewFindViewById19 = view21.findViewById(R.id.vg_banner);
        f0.o(viewFindViewById19, "mRootView.findViewById(R.id.vg_banner)");
        this.f92426v = viewFindViewById19;
        View view22 = this.f92407c;
        if (view22 == null) {
            f0.S("mRootView");
            view22 = null;
        }
        View viewFindViewById20 = view22.findViewById(R.id.vg_bottom_bar);
        f0.o(viewFindViewById20, "mRootView.findViewById(R.id.vg_bottom_bar)");
        this.f92427w = viewFindViewById20;
        View view23 = this.f92407c;
        if (view23 == null) {
            f0.S("mRootView");
        } else {
            view2 = view23;
        }
        View viewFindViewById21 = view2.findViewById(R.id.vg_search_switch);
        f0.o(viewFindViewById21, "mRootView.findViewById(R.id.vg_search_switch)");
        this.f92428x = viewFindViewById21;
    }

    private final void K4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44322, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!i0.s()) {
            b5();
        } else {
            HashMap<String, String> mapL4 = L4();
            addDisposable((io.reactivex.disposables.b) (this.L ? com.max.xiaoheihe.network.i.a().c8(mapL4, this.f92430z, 30) : com.max.xiaoheihe.network.i.a().Eb(mapL4, this.f92430z, 30)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
        }
    }

    private final HashMap<String, String> L4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44321, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>();
        ArrayList<TradeFilterTabObj> arrayList = this.G;
        if (arrayList == null || arrayList.isEmpty()) {
            map.put("include_filter", "1");
        } else {
            map.put("include_filter", "0");
        }
        String str = this.P;
        if (str != null) {
            map.put("q", str);
        }
        String str2 = this.A;
        if (str2 != null) {
            map.put(GameObj.KEY_POINT_PRICE, str2);
        }
        for (String str3 : this.I.getFilterMap().keySet()) {
            List<TradeFilterItemObj> list = this.I.getFilterMap().get(str3);
            if (list != null && (!list.isEmpty())) {
                map.put(str3, CollectionsKt___CollectionsKt.h3(list, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<TradeFilterItemObj, CharSequence>() { // from class: com.max.xiaoheihe.module.trade.ItemInventoryFragment$getQureyMap$3$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @dl.d
                    public final CharSequence a(@dl.d TradeFilterItemObj itemobj) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{itemobj}, this, changeQuickRedirect, false, 44363, new Class[]{TradeFilterItemObj.class}, CharSequence.class);
                        if (patchProxyResultProxy2.isSupported) {
                            return (CharSequence) patchProxyResultProxy2.result;
                        }
                        f0.p(itemobj, "itemobj");
                        return itemobj.getValue();
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ CharSequence invoke(TradeFilterItemObj tradeFilterItemObj) {
                        PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{tradeFilterItemObj}, this, changeQuickRedirect, false, 44364, new Class[]{Object.class}, Object.class);
                        return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a(tradeFilterItemObj);
                    }
                }, 30, null));
            }
        }
        String minPrice = this.I.getMinPrice();
        if (minPrice != null) {
            if (minPrice.length() > 0) {
                map.put("price_min", minPrice);
            }
        }
        String maxPrice = this.I.getMaxPrice();
        if (maxPrice != null) {
            if (maxPrice.length() > 0) {
                map.put("price_max", maxPrice);
            }
        }
        return map;
    }

    public static final /* synthetic */ void M3(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44338, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.K4();
    }

    private final int N4() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44335, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<TradeSteamInventoryObj> listP4 = P4();
        if (listP4 != null) {
            for (TradeSteamInventoryObj tradeSteamInventoryObj : listP4) {
                if (!tradeSteamInventoryObj.getChecked() && tradeSteamInventoryObj.getTrade_info() == null) {
                    i10++;
                }
            }
        }
        return i10;
    }

    private final void O4(int i10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44319, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            j10 = 0;
        } else {
            j10 = i10 > 5 ? 2L : 1L;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().q4().w1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d(i10)));
    }

    private final List<TradeSteamInventoryObj> P4() {
        int i10;
        int i11;
        int i12;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44314, new Class[0], List.class);
        if (patchProxyResultProxy.isSupported) {
            return (List) patchProxyResultProxy.result;
        }
        List<TradeSteamInventoryObj> list = this.B;
        if ((list == null || list.isEmpty()) || (i10 = this.J) < 0 || this.K < 0 || i10 > this.B.size() - 1 || this.K > this.B.size() - 1 || (i11 = this.J) > (i12 = this.K)) {
            return null;
        }
        return this.B.subList(i11, i12 + 1);
    }

    private final void Q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44310, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        f0.n(activity, "null cannot be cast to non-null type com.max.hbcommon.base.BaseActivity");
        BaseActivity baseActivity = (BaseActivity) activity;
        View view = this.f92427w;
        if (view == null) {
            f0.S("vg_bottom_bar");
            view = null;
        }
        com.max.xiaoheihe.module.trade.d dVar = new com.max.xiaoheihe.module.trade.d(baseActivity, view, !this.L, this);
        this.f92429y = dVar;
        dVar.f();
        View view2 = this.f92407c;
        if (view2 == null) {
            f0.S("mRootView");
            view2 = null;
        }
        TradeInfoUtilKt.m(view2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemInventoryFragment$initView$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44369, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44368, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f92448b.f92430z = 0;
                ItemInventoryFragment.M3(this.f92448b);
            }
        }, new yh.l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.ItemInventoryFragment$initView$2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44379, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 44378, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                this.f92449b.P = q10;
            }
        });
        View view3 = this.f92407c;
        if (view3 == null) {
            f0.S("mRootView");
            view3 = null;
        }
        EditText editText = (EditText) view3.findViewById(R.id.et_item_search);
        if (this.L) {
            TextView textView = this.f92414j;
            if (textView == null) {
                f0.S("tv_count_desc");
                textView = null;
            }
            textView.setText("在售:");
            TextView textView2 = this.f92415k;
            if (textView2 == null) {
                f0.S("tv_title_tips");
                textView2 = null;
            }
            textView2.setText("预收益:");
            if (editText != null) {
                editText.setHint("搜索当前在售饰品");
            }
        } else {
            TextView textView3 = this.f92414j;
            if (textView3 == null) {
                f0.S("tv_count_desc");
                textView3 = null;
            }
            textView3.setText("件数:");
            TextView textView4 = this.f92415k;
            if (textView4 == null) {
                f0.S("tv_title_tips");
                textView4 = null;
            }
            textView4.setText("估值:");
            if (editText != null) {
                editText.setHint("搜索当前库存饰品");
            }
        }
        TextView textView5 = this.f92413i;
        if (textView5 == null) {
            f0.S("tv_item_count");
            textView5 = null;
        }
        bb.d.d(textView5, 5);
        TextView textView6 = this.f92418n;
        if (textView6 == null) {
            f0.S("tv_value");
            textView6 = null;
        }
        bb.d.d(textView6, 5);
        TextView textView7 = this.f92416l;
        if (textView7 == null) {
            f0.S("tv_title_symbol");
            textView7 = null;
        }
        bb.d.d(textView7, 5);
        ImageView imageView = this.f92420p;
        if (imageView == null) {
            f0.S("iv_refreshing");
            imageView = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, androidx.constraintlayout.motion.widget.f.f18721i, 0.0f, 360.0f);
        this.S = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatMode(1);
            objectAnimatorOfFloat.setDuration(1000L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setRepeatCount(-1);
            addValueAnimator(objectAnimatorOfFloat);
        }
        if (this.L) {
            View view4 = this.f92428x;
            if (view4 == null) {
                f0.S("vg_search_switch");
                view4 = null;
            }
            view4.setVisibility(0);
            View view5 = this.f92428x;
            if (view5 == null) {
                f0.S("vg_search_switch");
                view5 = null;
            }
            view5.setOnClickListener(new f());
            ViewGroup.LayoutParams layoutParams = editText.getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = 0;
        } else {
            View view6 = this.f92428x;
            if (view6 == null) {
                f0.S("vg_search_switch");
                view6 = null;
            }
            view6.setVisibility(8);
        }
        SmartRefreshLayout smartRefreshLayout = this.f92421q;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.setBackgroundResource(R.drawable.gradient_white_divider);
        SmartRefreshLayout smartRefreshLayout2 = this.f92421q;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.S(new g());
        SmartRefreshLayout smartRefreshLayout3 = this.f92421q;
        if (smartRefreshLayout3 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout3 = null;
        }
        smartRefreshLayout3.f0(new h());
        l lVar = new l();
        ImageView imageView2 = this.f92410f;
        if (imageView2 == null) {
            f0.S("iv_filter");
            imageView2 = null;
        }
        imageView2.setOnClickListener(new i());
        ImageView imageView3 = this.f92411g;
        if (imageView3 == null) {
            f0.S("iv_format");
            imageView3 = null;
        }
        imageView3.setVisibility(0);
        ImageView imageView4 = this.f92411g;
        if (imageView4 == null) {
            f0.S("iv_format");
            imageView4 = null;
        }
        imageView4.setImageResource(R.drawable.format_card_feed3);
        View view7 = this.f92412h;
        if (view7 == null) {
            f0.S("v_divider_2");
            view7 = null;
        }
        view7.setVisibility(0);
        ImageView imageView5 = this.f92411g;
        if (imageView5 == null) {
            f0.S("iv_format");
            imageView5 = null;
        }
        imageView5.setOnClickListener(new j());
        FilterButtonView filterButtonView = this.f92417m;
        if (filterButtonView == null) {
            f0.S("fbv_sort");
            filterButtonView = null;
        }
        filterButtonView.setOnClickListener(lVar);
        this.O = new GridLayoutManager(this.mContext, 3);
        RecyclerView recyclerView = this.f92422r;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        GridLayoutManager gridLayoutManager = this.O;
        if (gridLayoutManager == null) {
            f0.S("rvlayoutManager");
            gridLayoutManager = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        int iF = ViewUtils.f(this.mContext, 2.0f);
        RecyclerView recyclerView2 = this.f92422r;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setPadding(iF, ViewUtils.f(this.mContext, 8.0f), ViewUtils.f(this.mContext, 2.0f), ViewUtils.f(this.mContext, 54.0f));
        RecyclerView recyclerView3 = this.f92422r;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) recyclerView3.getItemAnimator();
        f0.m(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        RecyclerView recyclerView4 = this.f92422r;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipToPadding(false);
        RecyclerView recyclerView5 = this.f92422r;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setClipChildren(false);
        RecyclerView recyclerView6 = this.f92422r;
        if (recyclerView6 == null) {
            f0.S("mRecyclerView");
            recyclerView6 = null;
        }
        recyclerView6.clearOnScrollListeners();
        RecyclerView recyclerView7 = this.f92422r;
        if (recyclerView7 == null) {
            f0.S("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.addOnScrollListener(new k());
        e eVar = new e(this.mContext, this.B);
        this.D = eVar;
        eVar.setHasStableIds(true);
        RecyclerView recyclerView8 = this.f92422r;
        if (recyclerView8 == null) {
            f0.S("mRecyclerView");
            recyclerView8 = null;
        }
        u<TradeSteamInventoryObj> uVar = this.D;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        recyclerView8.setAdapter(uVar);
        RecyclerView recyclerView9 = this.f92422r;
        if (recyclerView9 == null) {
            f0.S("mRecyclerView");
            recyclerView9 = null;
        }
        recyclerView9.setItemAnimator(null);
    }

    private final boolean R4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44313, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        List<TradeSteamInventoryObj> listP4 = P4();
        if (listP4 == null) {
            return false;
        }
        for (TradeSteamInventoryObj tradeSteamInventoryObj : listP4) {
            if (!tradeSteamInventoryObj.getChecked() && tradeSteamInventoryObj.getTrade_info() == null) {
                return false;
            }
        }
        return true;
    }

    private final void S4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44312, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.module.trade.d dVar = this.f92429y;
        if (dVar == null) {
            f0.S("mTradeItemCheckSetter");
            dVar = null;
        }
        dVar.h(this.C.size(), this.F, R4());
    }

    private final void U4() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44307, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.L && com.max.hbcommon.utils.c.u(this.P)) {
            SegmentFilterSelected segmentFilterSelected = this.H;
            if (segmentFilterSelected != null && segmentFilterSelected.getVisibility() == 0) {
                z10 = true;
            }
            if (!z10) {
                K4();
                Z4();
                return;
            }
        }
        K4();
    }

    private final void V4() {
        Integer count;
        Integer count2;
        int iIntValue = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44326, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f92418n;
        String string = null;
        if (textView == null) {
            f0.S("tv_value");
            textView = null;
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.E;
        textView.setText(tradeSteamInventoryResult != null ? tradeSteamInventoryResult.getTotal_price() : null);
        TradeSteamInventoryResult tradeSteamInventoryResult2 = this.E;
        if (tradeSteamInventoryResult2 != null && (count2 = tradeSteamInventoryResult2.getCount()) != null) {
            iIntValue = count2.intValue();
        }
        this.F = iIntValue;
        TextView textView2 = this.f92413i;
        if (textView2 == null) {
            f0.S("tv_item_count");
            textView2 = null;
        }
        TradeSteamInventoryResult tradeSteamInventoryResult3 = this.E;
        if (tradeSteamInventoryResult3 != null && (count = tradeSteamInventoryResult3.getCount()) != null) {
            string = count.toString();
        }
        textView2.setText(string);
    }

    private final void W4() {
        BannerViewPager<AdsBannerObj> bannerViewPager;
        ArrayList<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44328, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.f92430z == 0) {
            this.B.clear();
            this.C.clear();
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.E;
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.B.addAll(list);
        }
        S4();
        List<TradeSteamInventoryObj> list2 = this.B;
        if (list2 == null || list2.isEmpty()) {
            b5();
            return;
        }
        View view = this.f92424t;
        u<TradeSteamInventoryObj> uVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        RecyclerView recyclerView = this.f92422r;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
        List[] listArr = new List[1];
        TradeSteamInventoryResult tradeSteamInventoryResult2 = this.E;
        listArr[0] = tradeSteamInventoryResult2 != null ? tradeSteamInventoryResult2.getBanner() : null;
        if (com.max.hbcommon.utils.c.w(listArr)) {
            View view2 = this.f92426v;
            if (view2 == null) {
                f0.S("vg_banner");
                view2 = null;
            }
            view2.setVisibility(8);
        } else {
            BannerViewPager<AdsBannerObj> bannerViewPager2 = this.f92425u;
            if (bannerViewPager2 == null) {
                f0.S("mBanner");
                bannerViewPager = null;
            } else {
                bannerViewPager = bannerViewPager2;
            }
            TradeSteamInventoryResult tradeSteamInventoryResult3 = this.E;
            com.max.hbcommon.utils.b.h(bannerViewPager, tradeSteamInventoryResult3 != null ? tradeSteamInventoryResult3.getBanner() : null, ViewUtils.L(this.mContext) - ViewUtils.f(this.mContext, 24.0f), 4.0f, 12.0f, false);
            View view3 = this.f92426v;
            if (view3 == null) {
                f0.S("vg_banner");
                view3 = null;
            }
            BannerViewPager<AdsBannerObj> bannerViewPager3 = this.f92425u;
            if (bannerViewPager3 == null) {
                f0.S("mBanner");
                bannerViewPager3 = null;
            }
            view3.setVisibility(bannerViewPager3.getVisibility());
        }
        u<TradeSteamInventoryObj> uVar2 = this.D;
        if (uVar2 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        uVar.notifyDataSetChanged();
    }

    private final void X4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44325, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92428x;
        View view2 = null;
        if (view == null) {
            f0.S("vg_search_switch");
            view = null;
        }
        Switch r10 = (Switch) view.findViewById(R.id.sb_sale);
        View view3 = this.f92428x;
        if (view3 == null) {
            f0.S("vg_search_switch");
        } else {
            view2 = view3;
        }
        TextView textView = (TextView) view2.findViewById(R.id.tv_sale_setting);
        if (z10) {
            r10.setChecked(true);
            textView.setText("在售");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
        } else {
            r10.setChecked(false);
            textView.setText("停售");
            textView.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        }
    }

    private final void Y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44327, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        String str = this.A;
        FilterButtonView filterButtonView = null;
        if (f0.g(str, Z)) {
            FilterButtonView filterButtonView2 = this.f92417m;
            if (filterButtonView2 == null) {
                f0.S("fbv_sort");
            } else {
                filterButtonView = filterButtonView2;
            }
            filterButtonView.setText("价格降序");
            return;
        }
        if (f0.g(str, f92405a0)) {
            FilterButtonView filterButtonView3 = this.f92417m;
            if (filterButtonView3 == null) {
                f0.S("fbv_sort");
            } else {
                filterButtonView = filterButtonView3;
            }
            filterButtonView.setText("价格升序");
            return;
        }
        FilterButtonView filterButtonView4 = this.f92417m;
        if (filterButtonView4 == null) {
            f0.S("fbv_sort");
        } else {
            filterButtonView = filterButtonView4;
        }
        filterButtonView.setText("默认排序");
    }

    private final void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44318, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!i0.s()) {
            b5();
            return;
        }
        this.R = true;
        e5();
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().D9().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q()));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    private final void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44316, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.R) {
            showLoading("正在更新库存…");
            return;
        }
        showContentView();
        View view = this.f92424t;
        TextView textView = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        RecyclerView recyclerView = this.f92422r;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        View view2 = this.f92424t;
        if (view2 == null) {
            f0.S("vg_invntory_empty");
            view2 = null;
        }
        View viewFindViewById = view2.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view3 = this.f92424t;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById2 = view3.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView2 = (TextView) viewFindViewById2;
        View view4 = this.f92424t;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
            view4 = null;
        }
        View viewFindViewById3 = view4.findViewById(R.id.tv_btn);
        f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView3 = (TextView) viewFindViewById3;
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        if (com.max.hbcommon.utils.c.u(this.P)) {
            SegmentFilterSelected segmentFilterSelected = this.H;
            if (segmentFilterSelected != null && segmentFilterSelected.getVisibility() == 0) {
                textView2.setText("暂无搜索结果");
                textView3.setVisibility(8);
            } else if (this.L) {
                textView2.setText("暂无已上架饰品");
                textView3.setVisibility(8);
            } else {
                imageView.setImageResource(R.drawable.market_default_set_steam_315x176);
                textView2.setText("暂无库存，请检测是否绑定Steam和公开状态\n可前往【我的】-【工具箱】-【账号设置】查看");
                textView3.setVisibility(0);
                textView3.setOnClickListener(new r());
            }
        } else {
            textView2.setText("暂无搜索结果");
            textView3.setVisibility(8);
        }
        TextView textView4 = this.f92418n;
        if (textView4 == null) {
            f0.S("tv_value");
            textView4 = null;
        }
        textView4.setText("0");
        TextView textView5 = this.f92413i;
        if (textView5 == null) {
            f0.S("tv_item_count");
        } else {
            textView = textView5;
        }
        textView.setText("0");
    }

    private final void c5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44323, new Class[0], Void.TYPE).isSupported || this.mContext.isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        KeyDescObj keyDescObj = new KeyDescObj();
        keyDescObj.setKey((String) Y);
        keyDescObj.setChecked(f0.g(Y, this.A));
        keyDescObj.setDesc("默认排序");
        arrayList.add(keyDescObj);
        KeyDescObj keyDescObj2 = new KeyDescObj();
        keyDescObj2.setKey(Z);
        keyDescObj2.setChecked(f0.g(Z, this.A));
        keyDescObj2.setDesc("价格降序");
        arrayList.add(keyDescObj2);
        KeyDescObj keyDescObj3 = new KeyDescObj();
        keyDescObj3.setKey(f92405a0);
        keyDescObj3.setChecked(f0.g(f92405a0, this.A));
        keyDescObj3.setDesc("价格升序");
        arrayList.add(keyDescObj3);
        HeyBoxPopupMenu heyBoxPopupMenu = new HeyBoxPopupMenu(this.mContext, arrayList);
        heyBoxPopupMenu.R(new s());
        heyBoxPopupMenu.show();
    }

    private final void d5(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 44336, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        List<TradeSteamInventoryObj> list = this.B;
        ArrayList<String> arrayList = new ArrayList<>(t.Y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((TradeSteamInventoryObj) it.next()).getSku_id());
        }
        Activity mContext = this.mContext;
        TradeItemSkuSlideActivity.a aVar = TradeItemSkuSlideActivity.X;
        f0.o(mContext, "mContext");
        mContext.startActivity(aVar.a(mContext, arrayList, String.valueOf(i10), String.valueOf(this.f92430z), L4(), 0));
    }

    private final void e5() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44320, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = null;
        if (this.R) {
            View view2 = this.f92419o;
            if (view2 == null) {
                f0.S("vg_refreshing");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            ObjectAnimator objectAnimator3 = this.S;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                z10 = true;
            }
            if (z10 || (objectAnimator2 = this.S) == null) {
                return;
            }
            objectAnimator2.start();
            return;
        }
        View view3 = this.f92419o;
        if (view3 == null) {
            f0.S("vg_refreshing");
        } else {
            view = view3;
        }
        view.setVisibility(8);
        ObjectAnimator objectAnimator4 = this.S;
        if (objectAnimator4 != null && objectAnimator4.isRunning()) {
            z10 = true;
        }
        if (!z10 || (objectAnimator = this.S) == null) {
            return;
        }
        objectAnimator.end();
    }

    public static final /* synthetic */ void i4(ItemInventoryFragment itemInventoryFragment, int i10) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment, new Integer(i10)}, null, changeQuickRedirect, true, 44345, new Class[]{ItemInventoryFragment.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.O4(i10);
    }

    public static final /* synthetic */ void l4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44341, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.S4();
    }

    public static final /* synthetic */ void m4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44339, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.U4();
    }

    public static final /* synthetic */ void n4(ItemInventoryFragment itemInventoryFragment) {
        if (PatchProxy.proxy(new Object[]{itemInventoryFragment}, null, changeQuickRedirect, true, 44347, new Class[]{ItemInventoryFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemInventoryFragment.Y4();
    }

    public final void I4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44333, new Class[0], Void.TYPE).isSupported && isActive()) {
            ConsecutiveScrollerLayout consecutiveScrollerLayout = this.f92423s;
            SmartRefreshLayout smartRefreshLayout = null;
            if (consecutiveScrollerLayout == null) {
                f0.S("mConsecutiveScrollerLayout");
                consecutiveScrollerLayout = null;
            }
            consecutiveScrollerLayout.scrollTo(0, 0);
            SmartRefreshLayout smartRefreshLayout2 = this.f92421q;
            if (smartRefreshLayout2 == null) {
                f0.S("mRefreshLayout");
            } else {
                smartRefreshLayout = smartRefreshLayout2;
            }
            smartRefreshLayout.F();
        }
    }

    @Override // com.max.xiaoheihe.module.trade.d.a
    public void J() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44334, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        u<TradeSteamInventoryObj> uVar = null;
        if (R4()) {
            List<TradeSteamInventoryObj> listP4 = P4();
            if (listP4 != null) {
                for (TradeSteamInventoryObj tradeSteamInventoryObj : listP4) {
                    if (tradeSteamInventoryObj.getTrade_info() == null) {
                        tradeSteamInventoryObj.setChecked(false);
                        if (this.C.contains(tradeSteamInventoryObj)) {
                            this.C.remove(tradeSteamInventoryObj);
                        }
                    }
                }
            }
            S4();
            u<TradeSteamInventoryObj> uVar2 = this.D;
            if (uVar2 == null) {
                f0.S("mAdapter");
            } else {
                uVar = uVar2;
            }
            uVar.notifyDataSetChanged();
            return;
        }
        if (this.C.size() + N4() >= f92406b0) {
            com.max.hbutils.utils.c.f("最多同时选择" + f92406b0 + "件饰品");
            return;
        }
        List<TradeSteamInventoryObj> listP5 = P4();
        if (listP5 != null) {
            for (TradeSteamInventoryObj tradeSteamInventoryObj2 : listP5) {
                if (tradeSteamInventoryObj2.getTrade_info() == null) {
                    tradeSteamInventoryObj2.setChecked(true);
                    if (!this.C.contains(tradeSteamInventoryObj2)) {
                        this.C.add(tradeSteamInventoryObj2);
                    }
                }
            }
        }
        S4();
        u<TradeSteamInventoryObj> uVar3 = this.D;
        if (uVar3 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar3;
        }
        uVar.notifyDataSetChanged();
    }

    @Override // com.max.xiaoheihe.module.trade.d.a
    public void L() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44329, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Activity activity = this.mContext;
        f0.n(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        TradeInfoUtilKt.c((AppCompatActivity) activity, new b());
    }

    @dl.e
    public final qf.a M4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44317, new Class[0], qf.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (qf.a) patchProxyResultProxy.result;
        }
        ComponentCallbacks2 componentCallbacks2 = this.mContext;
        if (componentCallbacks2 instanceof qf.a) {
            f0.n(componentCallbacks2, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.view.ITradeCenterContainer");
            return (qf.a) componentCallbacks2;
        }
        if (!(getParentFragment() instanceof qf.a)) {
            return null;
        }
        androidx.activity.result.b parentFragment = getParentFragment();
        f0.n(parentFragment, "null cannot be cast to non-null type com.max.xiaoheihe.module.littleprogram.view.ITradeCenterContainer");
        return (qf.a) parentFragment;
    }

    public final void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44331, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonArray jsonArray = new JsonArray();
        for (TradeSteamInventoryObj tradeSteamInventoryObj : this.C) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sku_id", tradeSteamInventoryObj.getSku_id());
            jsonArray.add(jsonObject);
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O6(jsonArray.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a5() {
        Integer sale_setting;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44324, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        TradeSteamInventoryResult tradeSteamInventoryResult = this.E;
        View view = null;
        String message = tradeSteamInventoryResult != null ? tradeSteamInventoryResult.getMessage() : null;
        if ((message == null || message.length() == 0) == true) {
            View view2 = this.f92409e;
            if (view2 == null) {
                f0.S("vg_mesage");
            } else {
                view = view2;
            }
            view.setVisibility(8);
        } else {
            View view3 = this.f92409e;
            if (view3 == null) {
                f0.S("vg_mesage");
                view3 = null;
            }
            view3.setVisibility(0);
            MarqueeTextView marqueeTextView = this.f92408d;
            if (marqueeTextView == null) {
                f0.S("tv_message");
                marqueeTextView = null;
            }
            TradeSteamInventoryResult tradeSteamInventoryResult2 = this.E;
            marqueeTextView.setText(tradeSteamInventoryResult2 != null ? tradeSteamInventoryResult2.getMessage() : null);
        }
        if (this.f92430z == 0) {
            V4();
        }
        Y4();
        TradeItemFilterManager.a aVar = TradeItemFilterManager.f92950i;
        Activity mContext = this.mContext;
        f0.o(mContext, "mContext");
        SegmentFilterSelected segmentFilterSelected = this.H;
        f0.m(segmentFilterSelected);
        aVar.a(mContext, segmentFilterSelected, this.I, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemInventoryFragment$showData$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44399, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44398, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f92460b.I4();
            }
        });
        if (this.L) {
            TradeSteamInventoryResult tradeSteamInventoryResult3 = this.E;
            if (tradeSteamInventoryResult3 != null && (sale_setting = tradeSteamInventoryResult3.getSale_setting()) != null && 1 == sale_setting.intValue()) {
                z10 = true;
            }
            X4(z10);
        }
        W4();
    }

    @Override // com.max.xiaoheihe.module.trade.d.a
    public void d0() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44330, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(this.mContext);
        fVar.l("确定要下架所选饰品？").u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new o()).o(com.max.xiaoheihe.utils.d.n0(R.string.cancel), p.f92456b);
        fVar.F();
    }

    @Override // com.max.xiaoheihe.module.trade.d.a
    public void h1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44332, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.C.clear();
        Iterator<T> it = this.B.iterator();
        while (it.hasNext()) {
            ((TradeSteamInventoryObj) it.next()).setChecked(false);
        }
        S4();
        u<TradeSteamInventoryObj> uVar = this.D;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 44305, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_inventory);
        Bundle arguments = getArguments();
        this.L = arguments != null ? arguments.getBoolean("is_onsale") : false;
        this.U = M4();
        this.f92407c = rootView;
        if (!this.L) {
            com.max.hbutils.utils.t.c(com.max.hbutils.utils.t.n(this.mContext), (ViewGroup) rootView, null);
            if (getContext() instanceof com.max.hbminiprogram.h) {
                Activity mContext = this.mContext;
                f0.o(mContext, "mContext");
                TitleBar mTitleBar = this.mTitleBar;
                f0.o(mTitleBar, "mTitleBar");
                TradeInfoUtilKt.H(mContext, mTitleBar, "CS:GO库存");
            } else {
                this.mTitleBar.setTitle("CS:GO库存");
                Activity mContext2 = this.mContext;
                f0.o(mContext2, "mContext");
                TitleBar mTitleBar2 = this.mTitleBar;
                f0.o(mTitleBar2, "mTitleBar");
                TradeInfoUtilKt.I(mContext2, mTitleBar2);
            }
        }
        Activity mContext3 = this.mContext;
        f0.o(mContext3, "mContext");
        this.T = new TradeItemFilterManager(mContext3, new m());
        J4();
        Q4();
        showLoading("正在更新库存…");
        U4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44311, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 != 3 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra(TradeSellSettingsActivity.W.a());
        if (stringExtra == null || stringExtra.length() == 0) {
            return;
        }
        X4(f0.g("1", stringExtra));
    }

    @Override // com.max.xiaoheihe.module.littleprogram.fragment.b, com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, BuildConfig.VERSION_CODE, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f92430z = 0;
        U4();
    }

    @Override // com.max.hbcommon.base.d
    public void onRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44306, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onRegisterReceiver();
        if (this.L) {
            return;
        }
        TitleBar mTitleBar = this.mTitleBar;
        f0.o(mTitleBar, "mTitleBar");
        TradeMsgBroadcastReceiver tradeMsgBroadcastReceiver = new TradeMsgBroadcastReceiver(mTitleBar, getContext() instanceof com.max.hbminiprogram.h);
        this.M = tradeMsgBroadcastReceiver;
        registerReceiver(tradeMsgBroadcastReceiver, lb.a.N);
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onStop() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44337, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onStop();
    }

    @Override // com.max.hbcommon.base.d
    public void onUnRegisterReceiver() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44308, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onUnRegisterReceiver();
        if (this.L) {
            return;
        }
        unregisterReceiver(this.M);
    }
}
