package com.max.xiaoheihe.module.trade;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.google.gson.JsonArray;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallOrderInfoObj;
import com.max.xiaoheihe.bean.trade.TradeInfoObj;
import com.max.xiaoheihe.bean.trade.TradePurchaseInventoryResult;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@o(parameters = 0)
public final class TradePurchaseInventoryDialogFragment extends com.max.hbcommon.base.swipeback.a {

    @dl.d
    public static final a K = new a(null);
    public static final int L = 8;

    @dl.d
    private static final String M = "pcs_id";

    @dl.d
    private static final String N = "count";

    @dl.d
    private static final String O = "spu_id";
    public static ChangeQuickRedirect changeQuickRedirect;
    private GridLayoutManager B;
    private u<TradeSteamInventoryObj> C;

    @dl.e
    private TradePurchaseInventoryResult D;
    private boolean E;
    private Context F;
    private String I;
    private long J;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f93159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f93160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f93161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private TextView f93162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private TextView f93163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f93164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f93165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private View f93166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private RecyclerView f93167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private ImageView f93168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f93169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private TextView f93170u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private TextView f93171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f93172w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CheckBox f93173x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f93174y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f93175z = new ArrayList();

    @dl.d
    private final List<TradeSteamInventoryObj> A = new ArrayList();

    @dl.d
    private String G = "";

    @dl.d
    private String H = "";

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final TradePurchaseInventoryDialogFragment a(@dl.d String pcs_id) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{pcs_id}, this, changeQuickRedirect, false, 45758, new Class[]{String.class}, TradePurchaseInventoryDialogFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (TradePurchaseInventoryDialogFragment) patchProxyResultProxy.result;
            }
            f0.p(pcs_id, "pcs_id");
            TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment = new TradePurchaseInventoryDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putString(TradePurchaseInventoryDialogFragment.M, pcs_id);
            tradePurchaseInventoryDialogFragment.setArguments(bundle);
            return tradePurchaseInventoryDialogFragment;
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<MallOrderInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        public void onNext(@dl.d Result<MallOrderInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45759, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseInventoryDialogFragment.this.isActive()) {
                TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment = TradePurchaseInventoryDialogFragment.this;
                String order_id = result.getResult().getOrder_id();
                f0.o(order_id, "result.result.order_id");
                TradePurchaseInventoryDialogFragment.q4(tradePurchaseInventoryDialogFragment, order_id);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45760, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradePurchaseInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45761, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradePurchaseInventoryDialogFragment.this.isActive()) {
                super.onError(e10);
                View view = TradePurchaseInventoryDialogFragment.this.f93160k;
                if (view == null) {
                    f0.S("vg_progress");
                    view = null;
                }
                view.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<TradePurchaseInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45762, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradePurchaseInventoryDialogFragment.this.isActive()) {
                View view = TradePurchaseInventoryDialogFragment.this.f93160k;
                if (view == null) {
                    f0.S("vg_progress");
                    view = null;
                }
                view.setVisibility(8);
                TradePurchaseInventoryDialogFragment.this.D = result.getResult();
                TradePurchaseInventoryDialogFragment.l4(TradePurchaseInventoryDialogFragment.this);
                TradePurchaseInventoryDialogFragment.m4(TradePurchaseInventoryDialogFragment.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45763, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradePurchaseInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45764, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradePurchaseInventoryDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45765, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradePurchaseInventoryDialogFragment.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45769, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            u uVar = null;
            if (TradePurchaseInventoryDialogFragment.j4(TradePurchaseInventoryDialogFragment.this)) {
                Iterator it = TradePurchaseInventoryDialogFragment.this.A.iterator();
                while (it.hasNext()) {
                    ((TradeSteamInventoryObj) it.next()).setChecked(false);
                }
                TradePurchaseInventoryDialogFragment.this.A.clear();
                TradePurchaseInventoryDialogFragment.k4(TradePurchaseInventoryDialogFragment.this);
            } else {
                TradePurchaseInventoryDialogFragment.this.A.clear();
                int size = TradePurchaseInventoryDialogFragment.this.f93175z.size();
                TradePurchaseInventoryResult tradePurchaseInventoryResult = TradePurchaseInventoryDialogFragment.this.D;
                int iMin = Math.min(size, n.q(tradePurchaseInventoryResult != null ? tradePurchaseInventoryResult.getCount() : null));
                int size2 = TradePurchaseInventoryDialogFragment.this.f93175z.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (i10 < iMin) {
                        ((TradeSteamInventoryObj) TradePurchaseInventoryDialogFragment.this.f93175z.get(i10)).setChecked(true);
                        TradePurchaseInventoryDialogFragment.this.A.add(TradePurchaseInventoryDialogFragment.this.f93175z.get(i10));
                    } else {
                        ((TradeSteamInventoryObj) TradePurchaseInventoryDialogFragment.this.f93175z.get(i10)).setChecked(false);
                    }
                }
                TradePurchaseInventoryDialogFragment.k4(TradePurchaseInventoryDialogFragment.this);
            }
            u uVar2 = TradePurchaseInventoryDialogFragment.this.C;
            if (uVar2 == null) {
                f0.S("mAdapter");
            } else {
                uVar = uVar2;
            }
            uVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45770, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment = TradePurchaseInventoryDialogFragment.this;
            tradePurchaseInventoryDialogFragment.E = true ^ tradePurchaseInventoryDialogFragment.E;
            u uVar = null;
            if (TradePurchaseInventoryDialogFragment.this.E) {
                GridLayoutManager gridLayoutManager = TradePurchaseInventoryDialogFragment.this.B;
                if (gridLayoutManager == null) {
                    f0.S("rvlayoutManager");
                    gridLayoutManager = null;
                }
                gridLayoutManager.setSpanCount(3);
                Context context = TradePurchaseInventoryDialogFragment.this.F;
                if (context == null) {
                    f0.S("mContext");
                    context = null;
                }
                int iF = ViewUtils.f(context, 2.0f);
                RecyclerView recyclerView = TradePurchaseInventoryDialogFragment.this.f93167r;
                if (recyclerView == null) {
                    f0.S("mRecyclerView");
                    recyclerView = null;
                }
                Context context2 = TradePurchaseInventoryDialogFragment.this.F;
                if (context2 == null) {
                    f0.S("mContext");
                    context2 = null;
                }
                recyclerView.setPadding(iF, 0, ViewUtils.f(context2, 2.0f), 0);
                ImageView imageView = TradePurchaseInventoryDialogFragment.this.f93168s;
                if (imageView == null) {
                    f0.S("iv_format");
                    imageView = null;
                }
                imageView.setImageResource(R.drawable.format_card_feed3);
            } else {
                GridLayoutManager gridLayoutManager2 = TradePurchaseInventoryDialogFragment.this.B;
                if (gridLayoutManager2 == null) {
                    f0.S("rvlayoutManager");
                    gridLayoutManager2 = null;
                }
                gridLayoutManager2.setSpanCount(2);
                Context context3 = TradePurchaseInventoryDialogFragment.this.F;
                if (context3 == null) {
                    f0.S("mContext");
                    context3 = null;
                }
                int iF2 = ViewUtils.f(context3, 10.0f);
                RecyclerView recyclerView2 = TradePurchaseInventoryDialogFragment.this.f93167r;
                if (recyclerView2 == null) {
                    f0.S("mRecyclerView");
                    recyclerView2 = null;
                }
                Context context4 = TradePurchaseInventoryDialogFragment.this.F;
                if (context4 == null) {
                    f0.S("mContext");
                    context4 = null;
                }
                recyclerView2.setPadding(iF2, 0, ViewUtils.f(context4, 7.0f), 0);
                ImageView imageView2 = TradePurchaseInventoryDialogFragment.this.f93168s;
                if (imageView2 == null) {
                    f0.S("iv_format");
                    imageView2 = null;
                }
                imageView2.setImageResource(R.drawable.format_card_feed2);
            }
            u uVar2 = TradePurchaseInventoryDialogFragment.this.C;
            if (uVar2 == null) {
                f0.S("mAdapter");
            } else {
                uVar = uVar2;
            }
            uVar.notifyDataSetChanged();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class h extends u<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradePurchaseInventoryDialogFragment f93183b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93184c;

            a(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93183b = tradePurchaseInventoryDialogFragment;
                this.f93184c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45776, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context context = this.f93183b.F;
                Context context2 = null;
                if (context == null) {
                    f0.S("mContext");
                    context = null;
                }
                Context context3 = this.f93183b.F;
                if (context3 == null) {
                    f0.S("mContext");
                } else {
                    context2 = context3;
                }
                context.startActivity(TradeInfoUtilKt.g(context2, this.f93184c.getSku_id()));
            }
        }

        /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
        public static final class b implements View.OnLongClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradePurchaseInventoryDialogFragment f93185b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93186c;

            b(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment, TradeSteamInventoryObj tradeSteamInventoryObj) {
                this.f93185b = tradePurchaseInventoryDialogFragment;
                this.f93186c = tradeSteamInventoryObj;
            }

            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45777, new Class[]{View.class}, Boolean.TYPE);
                if (patchProxyResultProxy.isSupported) {
                    return ((Boolean) patchProxyResultProxy.result).booleanValue();
                }
                Context context = this.f93185b.F;
                Context context2 = null;
                if (context == null) {
                    f0.S("mContext");
                    context = null;
                }
                Context context3 = this.f93185b.F;
                if (context3 == null) {
                    f0.S("mContext");
                } else {
                    context2 = context3;
                }
                context.startActivity(TradeInfoUtilKt.g(context2, this.f93186c.getSku_id()));
                return true;
            }
        }

        /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
        public static final class c implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f93187b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradePurchaseInventoryDialogFragment f93188c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<View> f93189d;

            c(TradeSteamInventoryObj tradeSteamInventoryObj, TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment, Ref.ObjectRef<View> objectRef) {
                this.f93187b = tradeSteamInventoryObj;
                this.f93188c = tradePurchaseInventoryDialogFragment;
                this.f93189d = objectRef;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45778, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f93187b.getTrade_info() != null) {
                    if (System.currentTimeMillis() - this.f93188c.J > 2000) {
                        this.f93188c.J = System.currentTimeMillis();
                        TradeInfoObj trade_info = this.f93187b.getTrade_info();
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
                if (TradePurchaseInventoryDialogFragment.j4(this.f93188c) && !this.f93187b.getChecked()) {
                    int size = this.f93188c.f93175z.size();
                    TradePurchaseInventoryResult tradePurchaseInventoryResult = this.f93188c.D;
                    com.max.hbutils.utils.c.f("最多同时选择" + Math.min(size, n.q(tradePurchaseInventoryResult != null ? tradePurchaseInventoryResult.getCount() : null)) + "件饰品");
                    return;
                }
                TradeSteamInventoryObj tradeSteamInventoryObj = this.f93187b;
                tradeSteamInventoryObj.setChecked(true ^ tradeSteamInventoryObj.getChecked());
                if (this.f93187b.getChecked()) {
                    this.f93189d.f124891b.setVisibility(0);
                } else {
                    this.f93189d.f124891b.setVisibility(8);
                }
                if (this.f93187b.getChecked()) {
                    if (this.f93188c.A.contains(this.f93187b)) {
                        return;
                    }
                    this.f93188c.A.add(this.f93187b);
                    TradePurchaseInventoryDialogFragment.k4(this.f93188c);
                    return;
                }
                if (this.f93188c.A.contains(this.f93187b)) {
                    this.f93188c.A.remove(this.f93187b);
                    TradePurchaseInventoryDialogFragment.k4(this.f93188c);
                }
            }
        }

        h(Context context, List<TradeSteamInventoryObj> list) {
            super(context, list);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45771, new Class[]{Integer.TYPE}, Long.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Long) patchProxyResultProxy.result).longValue();
            }
            String sku_id = ((TradeSteamInventoryObj) TradePurchaseInventoryDialogFragment.this.f93175z.get(i10)).getSku_id();
            return sku_id != null ? Long.parseLong(sku_id) : i10;
        }

        @Override // com.max.hbcommon.base.adapter.u
        public /* bridge */ /* synthetic */ int m(int i10, TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45775, new Class[]{cls, Object.class}, cls);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeSteamInventoryObj);
        }

        public int n(int i10, @dl.e TradeSteamInventoryObj tradeSteamInventoryObj) {
            Object[] objArr = {new Integer(i10), tradeSteamInventoryObj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45773, new Class[]{cls, TradeSteamInventoryObj.class}, cls);
            if (patchProxyResultProxy.isSupported) {
                return ((Integer) patchProxyResultProxy.result).intValue();
            }
            return TradePurchaseInventoryDialogFragment.this.E ? R.layout.item_inventory_item_format_3 : R.layout.item_inventory_item;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4, types: [T, android.view.View] */
        public void o(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            Context context;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 45772, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = viewHolder.i(R.id.vg_checked);
            c cVar = new c(data, TradePurchaseInventoryDialogFragment.this, objectRef);
            if (data.getChecked()) {
                ((View) objectRef.f124891b).setVisibility(0);
            } else {
                ((View) objectRef.f124891b).setVisibility(8);
            }
            if (viewHolder.d() == R.layout.item_inventory_item) {
                View viewI = viewHolder.i(R.id.iv_item_bg);
                Context context2 = TradePurchaseInventoryDialogFragment.this.F;
                if (context2 == null) {
                    f0.S("mContext");
                    context2 = null;
                }
                TradeInfoUtilKt.B(context2, viewHolder, data, false, 8, null);
                Context context3 = TradePurchaseInventoryDialogFragment.this.F;
                if (context3 == null) {
                    f0.S("mContext");
                    context3 = null;
                }
                TradeInfoUtilKt.u(context3, viewHolder, data);
                Context context4 = TradePurchaseInventoryDialogFragment.this.F;
                if (context4 == null) {
                    f0.S("mContext");
                    context4 = null;
                }
                TradeInfoUtilKt.z(context4, viewHolder, data, false);
                Context context5 = TradePurchaseInventoryDialogFragment.this.F;
                if (context5 == null) {
                    f0.S("mContext");
                    context = null;
                } else {
                    context = context5;
                }
                TradeInfoUtilKt.v(context, viewHolder, data);
                viewI.setOnClickListener(cVar);
                viewHolder.itemView.setOnClickListener(new a(TradePurchaseInventoryDialogFragment.this, data));
                return;
            }
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_state);
            TextView textView = (TextView) viewHolder.i(R.id.tv_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            bb.d.d(textView, 5);
            bb.d.d(textView2, 5);
            textView.setText(data.getPrice());
            Context context6 = TradePurchaseInventoryDialogFragment.this.F;
            if (context6 == null) {
                f0.S("mContext");
                context6 = null;
            }
            TradeInfoUtilKt.B(context6, viewHolder, data, false, 8, null);
            Context context7 = TradePurchaseInventoryDialogFragment.this.F;
            if (context7 == null) {
                f0.S("mContext");
                context7 = null;
            }
            TradeInfoUtilKt.u(context7, viewHolder, data);
            viewHolder.itemView.setOnClickListener(cVar);
            viewHolder.itemView.setOnLongClickListener(new b(TradePurchaseInventoryDialogFragment.this, data));
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
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
            if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 45774, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            o(eVar, (TradeSteamInventoryObj) obj);
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f93191c;

        i(String str) {
            this.f93191c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45779, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Context context = TradePurchaseInventoryDialogFragment.this.F;
            Context context2 = null;
            if (context == null) {
                f0.S("mContext");
                context = null;
            }
            TradeOrderDetailActivity.a aVar = TradeOrderDetailActivity.f93027p2;
            Context context3 = TradePurchaseInventoryDialogFragment.this.F;
            if (context3 == null) {
                f0.S("mContext");
            } else {
                context2 = context3;
            }
            context.startActivity(aVar.a(context2, this.f93191c));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradePurchaseInventoryDialogFragment.kt */
    public static final class j implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final j f93194b = new j();
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45780, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public static final /* synthetic */ void V3(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseInventoryDialogFragment}, null, changeQuickRedirect, true, 45752, new Class[]{TradePurchaseInventoryDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseInventoryDialogFragment.r4();
    }

    public static final /* synthetic */ boolean j4(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradePurchaseInventoryDialogFragment}, null, changeQuickRedirect, true, 45753, new Class[]{TradePurchaseInventoryDialogFragment.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : tradePurchaseInventoryDialogFragment.u4();
    }

    public static final /* synthetic */ void k4(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseInventoryDialogFragment}, null, changeQuickRedirect, true, 45754, new Class[]{TradePurchaseInventoryDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseInventoryDialogFragment.v4();
    }

    public static final /* synthetic */ void l4(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseInventoryDialogFragment}, null, changeQuickRedirect, true, 45755, new Class[]{TradePurchaseInventoryDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseInventoryDialogFragment.w4();
    }

    public static final /* synthetic */ void m4(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseInventoryDialogFragment}, null, changeQuickRedirect, true, 45756, new Class[]{TradePurchaseInventoryDialogFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseInventoryDialogFragment.x4();
    }

    public static final /* synthetic */ void q4(TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment, String str) {
        if (PatchProxy.proxy(new Object[]{tradePurchaseInventoryDialogFragment, str}, null, changeQuickRedirect, true, 45757, new Class[]{TradePurchaseInventoryDialogFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradePurchaseInventoryDialogFragment.y4(str);
    }

    private final void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45747, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonArray jsonArray = new JsonArray();
        Iterator<TradeSteamInventoryObj> it = this.A.iterator();
        while (it.hasNext()) {
            jsonArray.add(it.next().getSku_id());
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.I;
        if (str == null) {
            f0.S("mPcsId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.A(str, jsonArray.toString()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45746, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        String str = this.I;
        if (str == null) {
            f0.S("mPcsId");
            str = null;
        }
        addDisposable((io.reactivex.disposables.b) eVarA.Ka(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void t4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45744, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f93162m;
        if (textView == null) {
            f0.S("tv_count");
            textView = null;
        }
        bb.d.d(textView, 5);
        TextView textView2 = this.f93163n;
        if (textView2 == null) {
            f0.S("tv_price");
            textView2 = null;
        }
        bb.d.d(textView2, 5);
        TextView textView3 = this.f93164o;
        if (textView3 == null) {
            f0.S("tv_price_symbol");
            textView3 = null;
        }
        bb.d.d(textView3, 5);
        TextView textView4 = this.f93165p;
        if (textView4 == null) {
            f0.S("tv_profit");
            textView4 = null;
        }
        bb.d.d(textView4, 5);
        View view = this.f93159j;
        if (view == null) {
            f0.S("vg_close");
            view = null;
        }
        view.setOnClickListener(new d());
        View view2 = this.f93161l;
        if (view2 == null) {
            f0.S("iv_close");
            view2 = null;
        }
        view2.setOnClickListener(new e());
        TextView textView5 = this.f93174y;
        if (textView5 == null) {
            f0.S("tv_btn_confirm");
            textView5 = null;
        }
        textView5.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseInventoryDialogFragment$initView$3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                if (PatchProxy.proxy(new Object[]{view3}, this, changeQuickRedirect, false, 45766, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                Context context = this.f93192b.F;
                if (context == null) {
                    f0.S("mContext");
                    context = null;
                }
                Context context2 = context;
                String strValueOf = String.valueOf(this.f93192b.A.size());
                String str = this.f93192b.H;
                String str2 = this.f93192b.G;
                final TradePurchaseInventoryDialogFragment tradePurchaseInventoryDialogFragment = this.f93192b;
                TradeInfoUtilKt.Q(context2, "确认供应", "", "供应数量:", strValueOf, "服务费:", str, "实际收益:", str2, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradePurchaseInventoryDialogFragment$initView$3.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                    @Override // yh.a
                    public /* bridge */ /* synthetic */ b2 invoke() {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45768, new Class[0], Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        invoke2();
                        return b2.f124493a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45767, new Class[0], Void.TYPE).isSupported) {
                            return;
                        }
                        TradePurchaseInventoryDialogFragment.V3(tradePurchaseInventoryDialogFragment);
                    }
                }, 512, null);
            }
        });
        View view3 = this.f93172w;
        if (view3 == null) {
            f0.S("vg_merge");
            view3 = null;
        }
        view3.setOnClickListener(new f());
        View view4 = this.f93169t;
        if (view4 == null) {
            f0.S("vg_format");
            view4 = null;
        }
        view4.setOnClickListener(new g());
        Context context = this.F;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        this.B = new GridLayoutManager(context, 2);
        RecyclerView recyclerView = this.f93167r;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        GridLayoutManager gridLayoutManager = this.B;
        if (gridLayoutManager == null) {
            f0.S("rvlayoutManager");
            gridLayoutManager = null;
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        Context context2 = this.F;
        if (context2 == null) {
            f0.S("mContext");
            context2 = null;
        }
        int iF = ViewUtils.f(context2, 10.0f);
        RecyclerView recyclerView2 = this.f93167r;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        Context context3 = this.F;
        if (context3 == null) {
            f0.S("mContext");
            context3 = null;
        }
        recyclerView2.setPadding(iF, 0, ViewUtils.f(context3, 7.0f), 0);
        RecyclerView recyclerView3 = this.f93167r;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        SimpleItemAnimator simpleItemAnimator = (SimpleItemAnimator) recyclerView3.getItemAnimator();
        f0.m(simpleItemAnimator);
        simpleItemAnimator.setSupportsChangeAnimations(false);
        RecyclerView recyclerView4 = this.f93167r;
        if (recyclerView4 == null) {
            f0.S("mRecyclerView");
            recyclerView4 = null;
        }
        recyclerView4.setClipToPadding(false);
        RecyclerView recyclerView5 = this.f93167r;
        if (recyclerView5 == null) {
            f0.S("mRecyclerView");
            recyclerView5 = null;
        }
        recyclerView5.setClipChildren(false);
        Context context4 = this.F;
        if (context4 == null) {
            f0.S("mContext");
            context4 = null;
        }
        h hVar = new h(context4, this.f93175z);
        this.C = hVar;
        hVar.setHasStableIds(true);
        RecyclerView recyclerView6 = this.f93167r;
        if (recyclerView6 == null) {
            f0.S("mRecyclerView");
            recyclerView6 = null;
        }
        u<TradeSteamInventoryObj> uVar = this.C;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        recyclerView6.setAdapter(uVar);
        RecyclerView recyclerView7 = this.f93167r;
        if (recyclerView7 == null) {
            f0.S("mRecyclerView");
            recyclerView7 = null;
        }
        recyclerView7.setItemAnimator(null);
    }

    private final boolean u4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45750, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        int size = this.f93175z.size();
        TradePurchaseInventoryResult tradePurchaseInventoryResult = this.D;
        return this.A.size() == Math.min(size, n.q(tradePurchaseInventoryResult != null ? tradePurchaseInventoryResult.getCount() : null));
    }

    private final void v4() {
        List<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45745, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        CheckBox checkBox = null;
        if (this.A.size() == 0) {
            TextView textView = this.f93171v;
            if (textView == null) {
                f0.S("tv_fee_rate");
                textView = null;
            }
            textView.setText("已扣除服务费￥0.00");
            TextView textView2 = this.f93165p;
            if (textView2 == null) {
                f0.S("tv_profit");
                textView2 = null;
            }
            textView2.setText("0.00");
        } else {
            BigDecimal bigDecimal = new BigDecimal(this.A.size());
            TradePurchaseInventoryResult tradePurchaseInventoryResult = this.D;
            f0.m(tradePurchaseInventoryResult);
            TradeSteamInventoryObj asset = tradePurchaseInventoryResult.getAsset();
            f0.m(asset);
            BigDecimal mPriceTotal = bigDecimal.multiply(new BigDecimal(asset.getPrice()));
            TradePurchaseInventoryResult tradePurchaseInventoryResult2 = this.D;
            BigDecimal scale = mPriceTotal.multiply(new BigDecimal(tradePurchaseInventoryResult2 != null ? tradePurchaseInventoryResult2.getFee_rate() : null)).setScale(2, 4);
            TradePurchaseInventoryResult tradePurchaseInventoryResult3 = this.D;
            BigDecimal deduct = scale.max(new BigDecimal(tradePurchaseInventoryResult3 != null ? tradePurchaseInventoryResult3.getFee_rate() : null));
            f0.o(mPriceTotal, "mPriceTotal");
            f0.o(deduct, "deduct");
            BigDecimal bigDecimalSubtract = mPriceTotal.subtract(deduct);
            f0.o(bigDecimalSubtract, "this.subtract(other)");
            String string = deduct.toString();
            f0.o(string, "deduct.toString()");
            this.H = string;
            String string2 = bigDecimalSubtract.toString();
            f0.o(string2, "profit.toString()");
            this.G = string2;
            TextView textView3 = this.f93165p;
            if (textView3 == null) {
                f0.S("tv_profit");
                textView3 = null;
            }
            textView3.setText(this.G);
            TextView textView4 = this.f93171v;
            if (textView4 == null) {
                f0.S("tv_fee_rate");
                textView4 = null;
            }
            textView4.setText("已扣除服务费￥" + this.H);
        }
        TextView textView5 = this.f93170u;
        if (textView5 == null) {
            f0.S("rv_title");
            textView5 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("选择Steam库存中的饰品 (");
        sb2.append(this.A.size());
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        TradePurchaseInventoryResult tradePurchaseInventoryResult4 = this.D;
        sb2.append((tradePurchaseInventoryResult4 == null || (list = tradePurchaseInventoryResult4.getList()) == null) ? null : Integer.valueOf(list.size()));
        sb2.append(')');
        textView5.setText(sb2.toString());
        CheckBox checkBox2 = this.f93173x;
        if (checkBox2 == null) {
            f0.S("cb_all_supply");
        } else {
            checkBox = checkBox2;
        }
        checkBox.setChecked(u4());
    }

    private final void w4() {
        List<TradeSteamInventoryObj> list;
        Context context;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45749, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradePurchaseInventoryResult tradePurchaseInventoryResult = this.D;
        Integer numValueOf = null;
        if (tradePurchaseInventoryResult != null) {
            Context context2 = this.F;
            if (context2 == null) {
                f0.S("mContext");
                context = null;
            } else {
                context = context2;
            }
            View view = this.f93166q;
            if (view == null) {
                f0.S("vg_item");
                view = null;
            }
            s.e eVar = new s.e(R.layout.fragment_purchase_detail_dialog, view);
            TradeSteamInventoryObj asset = tradePurchaseInventoryResult.getAsset();
            f0.m(asset);
            TradeInfoUtilKt.B(context, eVar, asset, false, 8, null);
            TextView textView = this.f93163n;
            if (textView == null) {
                f0.S("tv_price");
                textView = null;
            }
            TradeSteamInventoryObj asset2 = tradePurchaseInventoryResult.getAsset();
            textView.setText(asset2 != null ? asset2.getPrice() : null);
            TextView textView2 = this.f93162m;
            if (textView2 == null) {
                f0.S("tv_count");
                textView2 = null;
            }
            textView2.setText(tradePurchaseInventoryResult.getCount());
        }
        TextView textView3 = this.f93170u;
        if (textView3 == null) {
            f0.S("rv_title");
            textView3 = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("选择Steam库存中的饰品 (");
        sb2.append(this.A.size());
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        TradePurchaseInventoryResult tradePurchaseInventoryResult2 = this.D;
        if (tradePurchaseInventoryResult2 != null && (list = tradePurchaseInventoryResult2.getList()) != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sb2.append(numValueOf);
        sb2.append(')');
        textView3.setText(sb2.toString());
    }

    private final void x4() {
        List<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45751, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f93175z.clear();
        this.A.clear();
        TradePurchaseInventoryResult tradePurchaseInventoryResult = this.D;
        if (tradePurchaseInventoryResult != null && (list = tradePurchaseInventoryResult.getList()) != null) {
            this.f93175z.addAll(list);
        }
        u<TradeSteamInventoryObj> uVar = this.C;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
    }

    private final void y4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45748, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        Context context = this.F;
        if (context == null) {
            f0.S("mContext");
            context = null;
        }
        new com.max.hbcommon.view.a.f(context).y("是否立即发起报价").u("立即发起", new i(str)).o("暂不发起", j.f93194b).g(false).F();
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c
    public boolean L3() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @dl.e
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, 45742, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            String string = arguments.getString(M);
            f0.m(string);
            this.I = string;
        }
        Context context = getContext();
        f0.m(context);
        this.F = context;
        return inflater.inflate(R.layout.fragment_purchase_inventory_dialog, viewGroup, false);
    }

    @Override // com.max.hbcommon.base.swipeback.a, com.max.hbcommon.base.c, androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, 45743, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.rv);
        f0.o(viewFindViewById, "view.findViewById(R.id.rv)");
        this.f93167r = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.vg_close);
        f0.o(viewFindViewById2, "view.findViewById(R.id.vg_close)");
        this.f93159j = viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.vg_format);
        f0.o(viewFindViewById3, "view.findViewById(R.id.vg_format)");
        this.f93169t = viewFindViewById3;
        View viewFindViewById4 = view.findViewById(R.id.iv_format);
        f0.o(viewFindViewById4, "view.findViewById(R.id.iv_format)");
        this.f93168s = (ImageView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.iv_close);
        f0.o(viewFindViewById5, "view.findViewById(R.id.iv_close)");
        this.f93161l = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.vg_item);
        f0.o(viewFindViewById6, "view.findViewById(R.id.vg_item)");
        this.f93166q = viewFindViewById6;
        View viewFindViewById7 = view.findViewById(R.id.tv_count);
        f0.o(viewFindViewById7, "view.findViewById(R.id.tv_count)");
        this.f93162m = (TextView) viewFindViewById7;
        View viewFindViewById8 = view.findViewById(R.id.tv_price);
        f0.o(viewFindViewById8, "view.findViewById(R.id.tv_price)");
        this.f93163n = (TextView) viewFindViewById8;
        View viewFindViewById9 = view.findViewById(R.id.tv_btn_confirm);
        f0.o(viewFindViewById9, "view.findViewById(R.id.tv_btn_confirm)");
        this.f93174y = (TextView) viewFindViewById9;
        View viewFindViewById10 = view.findViewById(R.id.tv_price_symbol);
        f0.o(viewFindViewById10, "view.findViewById(R.id.tv_price_symbol)");
        this.f93164o = (TextView) viewFindViewById10;
        View viewFindViewById11 = view.findViewById(R.id.tv_profit);
        f0.o(viewFindViewById11, "view.findViewById(R.id.tv_profit)");
        this.f93165p = (TextView) viewFindViewById11;
        View viewFindViewById12 = view.findViewById(R.id.rv_title);
        f0.o(viewFindViewById12, "view.findViewById(R.id.rv_title)");
        this.f93170u = (TextView) viewFindViewById12;
        View viewFindViewById13 = view.findViewById(R.id.tv_fee_rate);
        f0.o(viewFindViewById13, "view.findViewById(R.id.tv_fee_rate)");
        this.f93171v = (TextView) viewFindViewById13;
        View viewFindViewById14 = view.findViewById(R.id.vg_merge);
        f0.o(viewFindViewById14, "view.findViewById(R.id.vg_merge)");
        this.f93172w = viewFindViewById14;
        View viewFindViewById15 = view.findViewById(R.id.cb_all_supply);
        f0.o(viewFindViewById15, "view.findViewById(R.id.cb_all_supply)");
        this.f93173x = (CheckBox) viewFindViewById15;
        View viewFindViewById16 = view.findViewById(R.id.vg_progress);
        f0.o(viewFindViewById16, "view.findViewById(R.id.vg_progress)");
        this.f93160k = viewFindViewById16;
        t4();
        s4();
    }
}
