package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcommon.base.adapter.u;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.utils.j;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.StateObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.trade.ItemQuickPriceObj;
import com.max.xiaoheihe.bean.trade.TradeInfoObj;
import com.max.xiaoheihe.bean.trade.TradeItemDescTagObj;
import com.max.xiaoheihe.bean.trade.TradeItemTag;
import com.max.xiaoheihe.bean.trade.TradeQuickPriceResult;
import com.max.xiaoheihe.bean.trade.TradeRequstResult;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryGroup;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.text.y;
import yh.l;

/* JADX INFO: compiled from: ItemPutOnActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class ItemPutOnActivity extends BaseActivity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private TextView L;
    private TextView M;
    private TextView N;
    private CheckBox O;
    private View P;
    private TextView Q;
    private SmartRefreshLayout R;
    private RecyclerView S;
    private u<TradeSteamInventoryWrapper> V;

    @dl.e
    private TradeQuickPriceResult W;
    private boolean X;
    private boolean Y;

    @dl.e
    private com.max.hbcommon.component.i Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private View f92463a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @dl.e
    private TextView f92464b0;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private s<TradeItemTag> f92468x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.e
    private s<TradeItemTag> f92470y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.d
    public static final a f92462y2 = new a(null);
    public static final int G2 = 8;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f92461p3 = 3;

    @dl.d
    private List<TradeSteamInventoryWrapper> T = new ArrayList();

    @dl.d
    private List<TradeSteamInventoryObj> U = new ArrayList();

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @dl.d
    private List<TradeItemTag> f92465c0 = new ArrayList();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.d
    private List<TradeItemTag> f92466p1 = new ArrayList();

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    private BigDecimal f92467p2 = new BigDecimal(0);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @dl.d
    private BigDecimal f92469x2 = new BigDecimal(0);

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ Intent b(a aVar, Context context, ArrayList arrayList, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, context, arrayList, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 44437, new Class[]{a.class, Context.class, ArrayList.class, Boolean.TYPE, Integer.TYPE, Object.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            return aVar.a(context, arrayList, z10);
        }

        @dl.d
        public final Intent a(@dl.d Context context, @dl.d ArrayList<TradeSteamInventoryObj> items, boolean z10) {
            String str;
            String str2;
            String str3;
            String str4;
            List list;
            TradeInfoObj tradeInfoObj;
            List list2;
            String str5;
            String str6;
            String str7;
            boolean z11;
            String str8;
            ItemQuickPriceObj itemQuickPriceObj;
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            String str15;
            String str16;
            TradeSteamInventoryGroup tradeSteamInventoryGroup;
            String str17;
            ArrayList arrayList;
            String str18;
            String str19;
            StateObj stateObj;
            String str20;
            int i10;
            int i11;
            Object obj;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, items, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44436, new Class[]{Context.class, ArrayList.class, Boolean.TYPE}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            f0.p(items, "items");
            Intent intent = new Intent(context, (Class<?>) ItemPutOnActivity.class);
            ArrayList arrayList2 = new ArrayList();
            for (TradeSteamInventoryObj item : items) {
                f0.o(item, "item");
                if (z10) {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    list = null;
                    tradeInfoObj = null;
                    list2 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    z11 = false;
                    str8 = null;
                    itemQuickPriceObj = null;
                    str9 = null;
                    str10 = null;
                    str11 = null;
                    str12 = null;
                    str13 = null;
                    str14 = null;
                    str15 = null;
                    str16 = null;
                    tradeSteamInventoryGroup = null;
                    str17 = null;
                    arrayList = null;
                    str18 = null;
                    str19 = null;
                    stateObj = null;
                    str20 = null;
                    i10 = -1;
                    i11 = 1;
                    obj = null;
                } else {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    list = null;
                    tradeInfoObj = null;
                    list2 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    z11 = false;
                    str8 = null;
                    itemQuickPriceObj = null;
                    str9 = null;
                    str10 = null;
                    str11 = null;
                    str12 = null;
                    str13 = null;
                    str14 = null;
                    str15 = null;
                    str16 = null;
                    tradeSteamInventoryGroup = null;
                    str17 = null;
                    arrayList = null;
                    str18 = null;
                    str19 = null;
                    stateObj = null;
                    str20 = null;
                    i10 = -33;
                    i11 = 1;
                    obj = null;
                    str = "";
                }
                arrayList2.add(TradeSteamInventoryObj.copy$default(item, null, null, null, null, null, str, str2, str3, str4, list, tradeInfoObj, list2, str5, str6, str7, z11, str8, itemQuickPriceObj, str9, str10, str11, str12, str13, str14, str15, str16, tradeSteamInventoryGroup, str17, arrayList, str18, str19, stateObj, str20, i10, i11, obj));
            }
            intent.putExtra("list", arrayList2);
            intent.putExtra("is_change", z10);
            return intent;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44435, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ItemPutOnActivity.f92461p3;
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class b implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44438, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ItemPutOnActivity.this.L2();
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class c implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f92472b = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44439, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class d extends com.max.hbcommon.network.d<Result<TradeQuickPriceResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44441, new Class[0], Void.TYPE).isSupported && ItemPutOnActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = ItemPutOnActivity.this.R;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemPutOnActivity.this.R;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44440, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemPutOnActivity.this.isActive()) {
                super.onError(e10);
                ItemPutOnActivity.m2(ItemPutOnActivity.this);
                SmartRefreshLayout smartRefreshLayout = ItemPutOnActivity.this.R;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemPutOnActivity.this.R;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeQuickPriceResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44442, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemPutOnActivity.this.isActive()) {
                ItemPutOnActivity.this.W = result.getResult();
                ItemPutOnActivity.this.J2();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44443, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeQuickPriceResult>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44444, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = ItemPutOnActivity.this.Z) == null) {
                return;
            }
            iVar.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44445, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = ItemPutOnActivity.this.Z) == null) {
                return;
            }
            iVar.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class g extends s<TradeItemTag> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ItemPutOnActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemPutOnActivity f92477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeItemTag f92478c;

            a(ItemPutOnActivity itemPutOnActivity, TradeItemTag tradeItemTag) {
                this.f92477b = itemPutOnActivity;
                this.f92478c = tradeItemTag;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44448, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                this.f92477b.f92465c0.remove(this.f92478c);
                TextView textView = this.f92477b.f92464b0;
                if (textView != null) {
                    textView.setText(this.f92477b.f92465c0.size() + "/5");
                }
                s sVar = this.f92477b.f92468x1;
                if (sVar != null) {
                    sVar.notifyDataSetChanged();
                }
                s sVar2 = this.f92477b.f92470y1;
                if (sVar2 != null) {
                    sVar2.notifyDataSetChanged();
                }
            }
        }

        g(Activity activity, List<TradeItemTag> list) {
            super(activity, list, R.layout.item_trade_tag);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeItemTag data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44446, new Class[]{s.e.class, TradeItemTag.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            viewHolder.p(R.id.tv_name, data.getDesc());
            viewHolder.i(R.id.iv_close).setVisibility(0);
            ItemPutOnActivity itemPutOnActivity = ItemPutOnActivity.this;
            View view = viewHolder.itemView;
            f0.o(view, "viewHolder.itemView");
            ItemPutOnActivity.j2(itemPutOnActivity, view, true);
            viewHolder.itemView.setOnClickListener(new a(ItemPutOnActivity.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeItemTag tradeItemTag) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeItemTag}, this, changeQuickRedirect, false, 44447, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeItemTag);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class h extends s<TradeItemTag> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ItemPutOnActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemPutOnActivity f92480b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeItemTag f92481c;

            a(ItemPutOnActivity itemPutOnActivity, TradeItemTag tradeItemTag) {
                this.f92480b = itemPutOnActivity;
                this.f92481c = tradeItemTag;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44451, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (this.f92480b.f92465c0.contains(this.f92481c)) {
                    this.f92480b.f92465c0.remove(this.f92481c);
                } else if (this.f92480b.f92465c0.size() >= 5) {
                    return;
                } else {
                    this.f92480b.f92465c0.add(this.f92481c);
                }
                TextView textView = this.f92480b.f92464b0;
                if (textView != null) {
                    textView.setText(this.f92480b.f92465c0.size() + "/5");
                }
                s sVar = this.f92480b.f92468x1;
                if (sVar != null) {
                    sVar.notifyDataSetChanged();
                }
                s sVar2 = this.f92480b.f92470y1;
                if (sVar2 != null) {
                    sVar2.notifyDataSetChanged();
                }
            }
        }

        h(Activity activity, List<TradeItemTag> list) {
            super(activity, list, R.layout.item_trade_tag);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeItemTag data) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44449, new Class[]{s.e.class, TradeItemTag.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            viewHolder.p(R.id.tv_name, data.getDesc());
            if (ItemPutOnActivity.this.f92465c0.contains(data)) {
                ItemPutOnActivity itemPutOnActivity = ItemPutOnActivity.this;
                View view = viewHolder.itemView;
                f0.o(view, "viewHolder.itemView");
                ItemPutOnActivity.j2(itemPutOnActivity, view, true);
            } else {
                ItemPutOnActivity itemPutOnActivity2 = ItemPutOnActivity.this;
                View view2 = viewHolder.itemView;
                f0.o(view2, "viewHolder.itemView");
                ItemPutOnActivity.j2(itemPutOnActivity2, view2, false);
            }
            viewHolder.itemView.setOnClickListener(new a(ItemPutOnActivity.this, data));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeItemTag tradeItemTag) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeItemTag}, this, changeQuickRedirect, false, 44450, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeItemTag);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class i implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44452, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            ItemPutOnActivity.N1(ItemPutOnActivity.this);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44453, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (ItemPutOnActivity.a2(ItemPutOnActivity.this)) {
                ItemPutOnActivity.this.n2();
            } else {
                com.max.hbutils.utils.c.d("您有饰品未定价,请设定价格再上架！");
            }
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44467, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemPutOnActivity itemPutOnActivity = ItemPutOnActivity.this;
            itemPutOnActivity.X = true ^ itemPutOnActivity.X;
            CheckBox checkBox = ItemPutOnActivity.this.O;
            if (checkBox == null) {
                f0.S("cb_merge");
                checkBox = null;
            }
            checkBox.setChecked(ItemPutOnActivity.this.X);
            ItemPutOnActivity itemPutOnActivity2 = ItemPutOnActivity.this;
            ItemPutOnActivity.e2(itemPutOnActivity2, itemPutOnActivity2.X);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44468, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ItemPutOnActivity.h2(ItemPutOnActivity.this);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class m extends com.max.hbcommon.network.d<Result<TradeRequstResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ItemPutOnActivity.kt */
        public static final class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemPutOnActivity f92500b;

            a(ItemPutOnActivity itemPutOnActivity) {
                this.f92500b = itemPutOnActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44475, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                Activity activity = ((BaseActivity) this.f92500b).f66601b;
                TradeDealActivity.a aVar = TradeDealActivity.Q;
                Activity mContext = ((BaseActivity) this.f92500b).f66601b;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext, 0));
                this.f92500b.finish();
            }
        }

        /* JADX INFO: compiled from: ItemPutOnActivity.kt */
        public static final class b implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemPutOnActivity f92501b;

            b(ItemPutOnActivity itemPutOnActivity) {
                this.f92501b = itemPutOnActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44476, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                this.f92501b.setResult(-1);
                this.f92501b.finish();
            }
        }

        /* JADX INFO: compiled from: ItemPutOnActivity.kt */
        public static final class c implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ItemPutOnActivity f92502b;

            c(ItemPutOnActivity itemPutOnActivity) {
                this.f92502b = itemPutOnActivity;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44477, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                this.f92502b.setResult(-1);
                this.f92502b.finish();
            }
        }

        m() {
        }

        public void onNext(@dl.d Result<TradeRequstResult> result) {
            Integer has_bind_steam;
            Integer has_trade_info;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44473, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemPutOnActivity.this.isActive()) {
                TradeRequstResult result2 = result.getResult();
                if ((result2 == null || (has_trade_info = result2.getHas_trade_info()) == null || has_trade_info.intValue() != 0) ? false : true) {
                    Activity mContext = ((BaseActivity) ItemPutOnActivity.this).f66601b;
                    f0.o(mContext, "mContext");
                    TradeRequstResult result3 = result.getResult();
                    TradeInfoUtilKt.J(mContext, result3 != null ? result3.getHas_trade_info_desc() : null);
                    return;
                }
                TradeRequstResult result4 = result.getResult();
                if ((result4 == null || (has_bind_steam = result4.getHas_bind_steam()) == null || has_bind_steam.intValue() != 0) ? false : true) {
                    Activity mContext2 = ((BaseActivity) ItemPutOnActivity.this).f66601b;
                    f0.o(mContext2, "mContext");
                    TradeInfoUtilKt.L(mContext2);
                    return;
                }
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) ItemPutOnActivity.this).f66601b);
                fVar.y(ItemPutOnActivity.this.Y ? "改价成功！" : "上架成功！").g(false);
                if (ItemPutOnActivity.this.Y) {
                    fVar.u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new c(ItemPutOnActivity.this));
                } else {
                    fVar.l("您可在【我的】-【正在上架】中查看");
                    fVar.u("前往查看", new a(ItemPutOnActivity.this));
                    fVar.o("回到库存", new b(ItemPutOnActivity.this));
                }
                fVar.F();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44474, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeRequstResult>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44478, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = ItemPutOnActivity.this.Z) == null) {
                return;
            }
            iVar.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemPutOnActivity.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TradeSteamInventoryObj f92504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ItemPutOnActivity f92505c;

        o(TradeSteamInventoryObj tradeSteamInventoryObj, ItemPutOnActivity itemPutOnActivity) {
            this.f92504b = tradeSteamInventoryObj;
            this.f92505c = itemPutOnActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b2 b2Var;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44481, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList<TradeItemTag> desc_tags = this.f92504b.getDesc_tags();
            u uVar = null;
            if (desc_tags != null) {
                desc_tags.clear();
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                this.f92504b.setDesc_tags(new ArrayList<>());
            }
            ArrayList<TradeItemTag> desc_tags2 = this.f92504b.getDesc_tags();
            f0.m(desc_tags2);
            desc_tags2.addAll(this.f92505c.f92465c0);
            com.max.hbcommon.component.i iVar = this.f92505c.Z;
            if (iVar != null) {
                iVar.dismiss();
            }
            u uVar2 = this.f92505c.V;
            if (uVar2 == null) {
                f0.S("mAdapter");
            } else {
                uVar = uVar2;
            }
            uVar.notifyDataSetChanged();
        }
    }

    private final void B2() {
        u<TradeSteamInventoryWrapper> uVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44415, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<TradeSteamInventoryWrapper> it = this.T.iterator();
        while (true) {
            uVar = null;
            if (!it.hasNext()) {
                break;
            }
            TradeSteamInventoryWrapper next = it.next();
            TradeSteamInventoryObj singleItem = next.getSingleItem();
            if (singleItem != null) {
                ItemQuickPriceObj local_quick_price = singleItem.getLocal_quick_price();
                singleItem.setPrice(local_quick_price != null ? local_quick_price.getQuick_price() : null);
            } else {
                TradeSteamInventoryGroup itemGroup = next.getItemGroup();
                if (itemGroup != null) {
                    for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
                        ItemQuickPriceObj local_quick_price2 = tradeSteamInventoryObj.getLocal_quick_price();
                        tradeSteamInventoryObj.setPrice(local_quick_price2 != null ? local_quick_price2.getQuick_price() : null);
                    }
                }
            }
        }
        u<TradeSteamInventoryWrapper> uVar2 = this.V;
        if (uVar2 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        uVar.notifyDataSetChanged();
    }

    private final void C2(TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44425, new Class[]{TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        textView.setText(z10 ? "允许还价" : "禁止还价");
        textView.setTextColor(com.max.xiaoheihe.utils.d.E(z10 ? R.color.text_primary_1_color : R.color.text_secondary_1_color));
    }

    private final void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44413, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper : this.T) {
            TradeSteamInventoryObj singleItem = tradeSteamInventoryWrapper.getSingleItem();
            if (singleItem != null) {
                I2(singleItem);
                H2(singleItem);
            } else {
                TradeSteamInventoryGroup itemGroup = tradeSteamInventoryWrapper.getItemGroup();
                if (itemGroup != null) {
                    for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
                        I2(tradeSteamInventoryObj);
                        H2(tradeSteamInventoryObj);
                    }
                }
            }
        }
        u<TradeSteamInventoryWrapper> uVar = this.V;
        if (uVar == null) {
            f0.S("mAdapter");
            uVar = null;
        }
        uVar.notifyDataSetChanged();
    }

    private final void G2(View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{view, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44421, new Class[]{View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            view.setBackground(q.M(q.o(this.f66601b, R.color.divider_color, 2.0f), this.f66601b, R.color.text_primary_2_color, 0.5f));
        } else {
            view.setBackground(q.o(this.f66601b, R.color.divider_secondary_1_color, 2.0f));
        }
    }

    private final void H2(TradeSteamInventoryObj tradeSteamInventoryObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryObj}, this, changeQuickRedirect, false, 44422, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        ArrayList<TradeItemTag> arrayList = new ArrayList<>();
        TradeQuickPriceResult tradeQuickPriceResult = this.W;
        f0.m(tradeQuickPriceResult);
        TradeItemDescTagObj tradeItemDescTagObj = tradeQuickPriceResult.getSku_tags().get(tradeSteamInventoryObj.getSku_id());
        if (tradeItemDescTagObj != null) {
            ArrayList<TradeItemTag> tags = tradeItemDescTagObj.getTags();
            if (!(tags == null || tags.isEmpty())) {
                ArrayList<String> user_tag_ids = tradeItemDescTagObj.getUser_tag_ids();
                if (user_tag_ids != null && !user_tag_ids.isEmpty()) {
                    z10 = false;
                }
                if (!z10) {
                    ArrayList<String> user_tag_ids2 = tradeItemDescTagObj.getUser_tag_ids();
                    f0.m(user_tag_ids2);
                    for (String str : user_tag_ids2) {
                        ArrayList<TradeItemTag> tags2 = tradeItemDescTagObj.getTags();
                        f0.m(tags2);
                        for (TradeItemTag tradeItemTag : tags2) {
                            if (f0.g(str, tradeItemTag.getId())) {
                                arrayList.add(tradeItemTag);
                                break;
                            }
                        }
                    }
                }
            }
        }
        tradeSteamInventoryObj.setDesc_tags(arrayList);
    }

    private final void I2(TradeSteamInventoryObj tradeSteamInventoryObj) {
        Map<String, ItemQuickPriceObj> spus;
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryObj}, this, changeQuickRedirect, false, 44412, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tradeSteamInventoryObj.getSpu() == null) {
            TradeQuickPriceResult tradeQuickPriceResult = this.W;
            f0.m(tradeQuickPriceResult);
            for (String str : tradeQuickPriceResult.getSpu_items().keySet()) {
                TradeQuickPriceResult tradeQuickPriceResult2 = this.W;
                f0.m(tradeQuickPriceResult2);
                List<String> list = tradeQuickPriceResult2.getSpu_items().get(str);
                if (list != null && CollectionsKt___CollectionsKt.R1(list, tradeSteamInventoryObj.getSku_id())) {
                    tradeSteamInventoryObj.setSpu(str);
                    break;
                }
            }
        }
        String spu = tradeSteamInventoryObj.getSpu();
        if (spu != null) {
            TradeQuickPriceResult tradeQuickPriceResult3 = this.W;
            tradeSteamInventoryObj.setLocal_quick_price((tradeQuickPriceResult3 == null || (spus = tradeQuickPriceResult3.getSpus()) == null) ? null : spus.get(spu));
        }
    }

    public static final /* synthetic */ void N1(ItemPutOnActivity itemPutOnActivity) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity}, null, changeQuickRedirect, true, 44428, new Class[]{ItemPutOnActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.p2();
    }

    private final void O2(TradeSteamInventoryObj tradeSteamInventoryObj) {
        if (PatchProxy.proxy(new Object[]{tradeSteamInventoryObj}, this, changeQuickRedirect, false, 44424, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92463a0;
        BottomButtonLeftItemView bottomButtonLeftItemView = view != null ? (BottomButtonLeftItemView) view.findViewById(R.id.bottom_button) : null;
        this.f92465c0.clear();
        ArrayList<TradeItemTag> desc_tags = tradeSteamInventoryObj.getDesc_tags();
        if (desc_tags != null) {
            this.f92465c0.addAll(desc_tags);
        }
        TextView textView = this.f92464b0;
        if (textView != null) {
            textView.setText(this.f92465c0.size() + "/5");
        }
        String sku_id = tradeSteamInventoryObj.getSku_id();
        f0.m(sku_id);
        ArrayList<TradeItemTag> arrayListR2 = r2(sku_id);
        this.f92466p1.clear();
        if (arrayListR2 != null) {
            this.f92466p1.addAll(arrayListR2);
        }
        s<TradeItemTag> sVar = this.f92468x1;
        if (sVar != null) {
            sVar.notifyDataSetChanged();
        }
        s<TradeItemTag> sVar2 = this.f92470y1;
        if (sVar2 != null) {
            sVar2.notifyDataSetChanged();
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setRightClickListener(new o(tradeSteamInventoryObj, this));
        }
    }

    public static final /* synthetic */ boolean a2(ItemPutOnActivity itemPutOnActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{itemPutOnActivity}, null, changeQuickRedirect, true, 44429, new Class[]{ItemPutOnActivity.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : itemPutOnActivity.x2();
    }

    public static final /* synthetic */ void e2(ItemPutOnActivity itemPutOnActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44430, new Class[]{ItemPutOnActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.y2(z10);
    }

    public static final /* synthetic */ void f2(ItemPutOnActivity itemPutOnActivity) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity}, null, changeQuickRedirect, true, 44431, new Class[]{ItemPutOnActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.z2();
    }

    public static final /* synthetic */ void h2(ItemPutOnActivity itemPutOnActivity) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity}, null, changeQuickRedirect, true, 44427, new Class[]{ItemPutOnActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.B2();
    }

    public static final /* synthetic */ void i2(ItemPutOnActivity itemPutOnActivity, TextView textView, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity, textView, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44432, new Class[]{ItemPutOnActivity.class, TextView.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.C2(textView, z10);
    }

    public static final /* synthetic */ void j2(ItemPutOnActivity itemPutOnActivity, View view, boolean z10) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity, view, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 44434, new Class[]{ItemPutOnActivity.class, View.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.G2(view, z10);
    }

    public static final /* synthetic */ void m2(ItemPutOnActivity itemPutOnActivity) {
        if (PatchProxy.proxy(new Object[]{itemPutOnActivity}, null, changeQuickRedirect, true, 44433, new Class[]{ItemPutOnActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        itemPutOnActivity.C1();
    }

    private final void o2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = findViewById(R.id.srl);
        f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.R = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rv);
        f0.o(viewFindViewById2, "findViewById(R.id.rv)");
        this.S = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_btn_confirm);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_btn_confirm)");
        this.L = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.cb_merge);
        f0.o(viewFindViewById4, "findViewById(R.id.cb_merge)");
        this.O = (CheckBox) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_merge);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_merge)");
        this.Q = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.vg_merge);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_merge)");
        this.P = viewFindViewById6;
        View viewFindViewById7 = findViewById(R.id.tv_profit);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_profit)");
        this.N = (TextView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R.id.tv_fee_rate);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_fee_rate)");
        this.M = (TextView) viewFindViewById8;
    }

    private final void p2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44406, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonArray jsonArray = new JsonArray();
        for (TradeSteamInventoryObj tradeSteamInventoryObj : this.U) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("sku_id", tradeSteamInventoryObj.getSku_id());
            jsonObject.addProperty("market_hash_name", tradeSteamInventoryObj.getMarket_hash_name());
            jsonArray.add(jsonObject);
        }
        V((io.reactivex.disposables.b) (this.Y ? com.max.xiaoheihe.network.i.a().R5(jsonArray.toString()) : com.max.xiaoheihe.network.i.a().f8(jsonArray.toString())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    private final FlexboxLayoutManager q2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44420, new Class[0], FlexboxLayoutManager.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlexboxLayoutManager) patchProxyResultProxy.result;
        }
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.f66601b);
        flexboxLayoutManager.setFlexDirection(0);
        flexboxLayoutManager.setFlexWrap(1);
        flexboxLayoutManager.setJustifyContent(0);
        return flexboxLayoutManager;
    }

    private final ArrayList<TradeItemTag> r2(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44423, new Class[]{String.class}, ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        TradeQuickPriceResult tradeQuickPriceResult = this.W;
        f0.m(tradeQuickPriceResult);
        TradeItemDescTagObj tradeItemDescTagObj = tradeQuickPriceResult.getSku_tags().get(str);
        if (tradeItemDescTagObj != null) {
            return tradeItemDescTagObj.getTags();
        }
        return null;
    }

    private final void u2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44419, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = this.f92463a0;
        RecyclerView recyclerView = view != null ? (RecyclerView) view.findViewById(R.id.rv_1) : null;
        View view2 = this.f92463a0;
        RecyclerView recyclerView2 = view2 != null ? (RecyclerView) view2.findViewById(R.id.rv_2) : null;
        View view3 = this.f92463a0;
        ViewGroup viewGroup = view3 != null ? (ViewGroup) view3.findViewById(R.id.vg_title_1) : null;
        View view4 = this.f92463a0;
        ViewGroup viewGroup2 = view4 != null ? (ViewGroup) view4.findViewById(R.id.vg_title_2) : null;
        View view5 = this.f92463a0;
        BottomButtonLeftItemView bottomButtonLeftItemView = view5 != null ? (BottomButtonLeftItemView) view5.findViewById(R.id.bottom_button) : null;
        View view6 = this.f92463a0;
        ImageView imageView = view6 != null ? (ImageView) view6.findViewById(R.id.iv_close) : null;
        this.f92464b0 = viewGroup != null ? (TextView) viewGroup.findViewById(R.id.tv_desc) : null;
        TextView textView = viewGroup != null ? (TextView) viewGroup.findViewById(R.id.tv_title) : null;
        if (textView != null) {
            textView.setText("我添加的标签");
        }
        TextView textView2 = viewGroup2 != null ? (TextView) viewGroup2.findViewById(R.id.tv_title) : null;
        if (textView2 != null) {
            textView2.setText("推荐标签");
        }
        View viewFindViewById = viewGroup != null ? viewGroup.findViewById(R.id.vg_more) : null;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = viewGroup2 != null ? viewGroup2.findViewById(R.id.vg_more) : null;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        if (bottomButtonLeftItemView != null) {
            bottomButtonLeftItemView.setLeftClickListener(new e());
        }
        if (imageView != null) {
            imageView.setOnClickListener(new f());
        }
        if (recyclerView != null) {
            recyclerView.setLayoutManager(q2());
        }
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(q2());
        }
        this.f92468x1 = new g(this.f66601b, this.f92465c0);
        this.f92470y1 = new h(this.f66601b, this.f92466p1);
        if (recyclerView != null) {
            recyclerView.setAdapter(this.f92468x1);
        }
        if (recyclerView2 == null) {
            return;
        }
        recyclerView2.setAdapter(this.f92470y1);
    }

    private final void v2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44405, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.R;
        u<TradeSteamInventoryWrapper> uVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new i());
        SmartRefreshLayout smartRefreshLayout2 = this.R;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.b0(false);
        String str = this.Y ? "改价" : "上架";
        TextView textView = this.L;
        if (textView == null) {
            f0.S("tv_btn_confirm");
            textView = null;
        }
        textView.setText(str + " (" + this.U.size() + ')');
        TextView textView2 = this.L;
        if (textView2 == null) {
            f0.S("tv_btn_confirm");
            textView2 = null;
        }
        textView2.setOnClickListener(new j());
        TextView textView3 = this.M;
        if (textView3 == null) {
            f0.S("tv_fee_rate");
            textView3 = null;
        }
        textView3.setText("已扣除服务费￥0.00");
        TextView textView4 = this.N;
        if (textView4 == null) {
            f0.S("tv_profit");
            textView4 = null;
        }
        bb.d.d(textView4, 5);
        TextView textView5 = this.N;
        if (textView5 == null) {
            f0.S("tv_profit");
            textView5 = null;
        }
        textView5.setText("0.00");
        CheckBox checkBox = this.O;
        if (checkBox == null) {
            f0.S("cb_merge");
            checkBox = null;
        }
        checkBox.setClickable(false);
        k kVar = new k();
        View view = this.P;
        if (view == null) {
            f0.S("vg_merge");
            view = null;
        }
        view.setOnClickListener(kVar);
        RecyclerView recyclerView = this.S;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        RecyclerView recyclerView2 = this.S;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        final Activity activity = this.f66601b;
        final List<TradeSteamInventoryWrapper> list = this.T;
        this.V = new u<TradeSteamInventoryWrapper>(activity, list) { // from class: com.max.xiaoheihe.module.trade.ItemPutOnActivity$initView$3
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: ItemPutOnActivity.kt */
            public static final class a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemPutOnActivity f92484b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<TradeSteamInventoryObj> f92485c;

                a(ItemPutOnActivity itemPutOnActivity, Ref.ObjectRef<TradeSteamInventoryObj> objectRef) {
                    this.f92484b = itemPutOnActivity;
                    this.f92485c = objectRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44460, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    ItemPutOnActivity itemPutOnActivity = this.f92484b;
                    TradebargainRegisterActivity.a aVar = TradebargainRegisterActivity.f93276c0;
                    Activity mContext = ((BaseActivity) itemPutOnActivity).f66601b;
                    f0.o(mContext, "mContext");
                    itemPutOnActivity.startActivityForResult(aVar.b(mContext, this.f92485c.f124891b.getSku_id()), ItemPutOnActivity.f92462y2.c());
                }
            }

            /* JADX INFO: compiled from: ItemPutOnActivity.kt */
            public static final class b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemPutOnActivity f92486b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<TradeSteamInventoryObj> f92487c;

                b(ItemPutOnActivity itemPutOnActivity, Ref.ObjectRef<TradeSteamInventoryObj> objectRef) {
                    this.f92486b = itemPutOnActivity;
                    this.f92487c = objectRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44461, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    this.f92486b.K2(this.f92487c.f124891b);
                }
            }

            /* JADX INFO: compiled from: ItemPutOnActivity.kt */
            public static final class c implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemPutOnActivity f92488b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<TradeSteamInventoryObj> f92489c;

                c(ItemPutOnActivity itemPutOnActivity, Ref.ObjectRef<TradeSteamInventoryObj> objectRef) {
                    this.f92488b = itemPutOnActivity;
                    this.f92489c = objectRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44462, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Activity activity = ((BaseActivity) this.f92488b).f66601b;
                    Activity mContext = ((BaseActivity) this.f92488b).f66601b;
                    f0.o(mContext, "mContext");
                    activity.startActivity(TradeInfoUtilKt.g(mContext, this.f92489c.f124891b.getSku_id()));
                }
            }

            /* JADX INFO: compiled from: ItemPutOnActivity.kt */
            public static final class d implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ ItemPutOnActivity f92490b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<TradeSteamInventoryObj> f92491c;

                d(ItemPutOnActivity itemPutOnActivity, Ref.ObjectRef<TradeSteamInventoryObj> objectRef) {
                    this.f92490b = itemPutOnActivity;
                    this.f92491c = objectRef;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44463, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    Activity activity = ((BaseActivity) this.f92490b).f66601b;
                    Activity mContext = ((BaseActivity) this.f92490b).f66601b;
                    f0.o(mContext, "mContext");
                    activity.startActivity(TradeInfoUtilKt.h(mContext, this.f92491c.f124891b.getSpu()));
                }
            }

            /* JADX INFO: compiled from: ItemPutOnActivity.kt */
            public static final class e implements TextWatcher {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<EditText> f92492b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Typeface f92493c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ItemPutOnActivity f92494d;

                e(Ref.ObjectRef<EditText> objectRef, Typeface typeface, ItemPutOnActivity itemPutOnActivity) {
                    this.f92492b = objectRef;
                    this.f92493c = typeface;
                    this.f92494d = itemPutOnActivity;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(@dl.e Editable editable) {
                    boolean z10 = true;
                    if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 44466, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    if (editable != null && editable.length() != 0) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f92492b.f124891b.setTypeface(this.f92493c);
                    } else {
                        bb.d.d(this.f92492b.f124891b, 5);
                    }
                    Object tag = this.f92492b.f124891b.getTag();
                    f0.n(tag, "null cannot be cast to non-null type com.max.xiaoheihe.bean.trade.TradeSteamInventoryWrapper");
                    TradeSteamInventoryWrapper tradeSteamInventoryWrapper = (TradeSteamInventoryWrapper) tag;
                    if (tradeSteamInventoryWrapper.getSingleItem() != null) {
                        TradeSteamInventoryObj singleItem = tradeSteamInventoryWrapper.getSingleItem();
                        if (singleItem != null) {
                            singleItem.setPrice(String.valueOf(editable));
                        }
                    } else {
                        TradeSteamInventoryGroup itemGroup = tradeSteamInventoryWrapper.getItemGroup();
                        f0.m(itemGroup);
                        for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
                            if (tradeSteamInventoryObj != null) {
                                tradeSteamInventoryObj.setPrice(String.valueOf(editable));
                            }
                        }
                    }
                    ItemPutOnActivity.f2(this.f92494d);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(@dl.e CharSequence charSequence, int i10, int i11, int i12) {
                }
            }

            @Override // com.max.hbcommon.base.adapter.u
            public /* bridge */ /* synthetic */ int m(int i10, TradeSteamInventoryWrapper tradeSteamInventoryWrapper) {
                Object[] objArr = {new Integer(i10), tradeSteamInventoryWrapper};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44458, new Class[]{cls, Object.class}, cls);
                return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : n(i10, tradeSteamInventoryWrapper);
            }

            public int n(int i10, @dl.d TradeSteamInventoryWrapper data) {
                Object[] objArr = {new Integer(i10), data};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44455, new Class[]{cls, TradeSteamInventoryWrapper.class}, cls);
                if (patchProxyResultProxy.isSupported) {
                    return ((Integer) patchProxyResultProxy.result).intValue();
                }
                f0.p(data, "data");
                return data.getItemGroup() != null ? R.layout.item_inventory_group_put_on : R.layout.item_inventory_item_put_on;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v26, types: [T, com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj, java.lang.Object] */
            public void o(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryWrapper item) {
                String min_price;
                String string;
                String min_price2;
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{viewHolder, item}, this, changeQuickRedirect, false, 44456, new Class[]{s.e.class, TradeSteamInventoryWrapper.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(viewHolder, "viewHolder");
                f0.p(item, "item");
                String str2 = "";
                if (viewHolder.d() != R.layout.item_inventory_item_put_on) {
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    TradeSteamInventoryGroup itemGroup = item.getItemGroup();
                    f0.m(itemGroup);
                    ?? r10 = itemGroup.getItems().get(0);
                    objectRef.f124891b = r10;
                    String price = ((TradeSteamInventoryObj) r10).getPrice();
                    TradeSteamInventoryGroup itemGroup2 = item.getItemGroup();
                    f0.m(itemGroup2);
                    Iterator<TradeSteamInventoryObj> it = itemGroup2.getItems().iterator();
                    String str3 = price;
                    while (it.hasNext()) {
                        if (!f0.g(str3, it.next().getPrice())) {
                            str3 = "";
                        }
                    }
                    Activity mContext = ((BaseActivity) this.f92483b).f66601b;
                    f0.o(mContext, "mContext");
                    TradeInfoUtilKt.B(mContext, viewHolder, (TradeSteamInventoryObj) objectRef.f124891b, false, 8, null);
                    EditText editText = (EditText) viewHolder.i(R.id.et_trade_price);
                    TextView textView6 = (TextView) viewHolder.i(R.id.tv_suggest_price);
                    View viewI = viewHolder.i(R.id.vg_item_img);
                    Activity mContext2 = ((BaseActivity) this.f92483b).f66601b;
                    f0.o(mContext2, "mContext");
                    TradeInfoUtilKt.D(mContext2, viewHolder, item);
                    TextView textView7 = (TextView) viewHolder.i(R.id.tv_count);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("参考价: ¥");
                    ItemQuickPriceObj local_quick_price = ((TradeSteamInventoryObj) objectRef.f124891b).getLocal_quick_price();
                    if (local_quick_price != null && (min_price = local_quick_price.getMin_price()) != null) {
                        str2 = min_price;
                    }
                    sb2.append(str2);
                    textView6.setText(sb2.toString());
                    editText.setTag(item);
                    editText.setText(str3);
                    editText.clearFocus();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(y.f128599h);
                    TradeSteamInventoryGroup itemGroup3 = item.getItemGroup();
                    f0.m(itemGroup3);
                    sb3.append(itemGroup3.getItems().size());
                    textView7.setText(sb3.toString());
                    viewI.setOnClickListener(new d(this.f92483b, objectRef));
                    return;
                }
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                ?? singleItem = item.getSingleItem();
                f0.m(singleItem);
                objectRef2.f124891b = singleItem;
                Activity mContext3 = ((BaseActivity) this.f92483b).f66601b;
                f0.o(mContext3, "mContext");
                TradeInfoUtilKt.B(mContext3, viewHolder, (TradeSteamInventoryObj) objectRef2.f124891b, false, 8, null);
                Activity mContext4 = ((BaseActivity) this.f92483b).f66601b;
                f0.o(mContext4, "mContext");
                TradeInfoUtilKt.u(mContext4, viewHolder, (TradeSteamInventoryObj) objectRef2.f124891b);
                Activity mContext5 = ((BaseActivity) this.f92483b).f66601b;
                f0.o(mContext5, "mContext");
                TradeInfoUtilKt.z(mContext5, viewHolder, (TradeSteamInventoryObj) objectRef2.f124891b, true);
                EditText editText2 = (EditText) viewHolder.i(R.id.et_desc);
                EditText editText3 = (EditText) viewHolder.i(R.id.et_trade_price);
                TextView textView8 = (TextView) viewHolder.i(R.id.tv_suggest_price);
                View viewI2 = viewHolder.i(R.id.vg_item_img);
                View viewI3 = viewHolder.i(R.id.vg_switch);
                Switch r11 = (Switch) viewHolder.i(R.id.sb_bargain);
                TextView tv_switch_desc = (TextView) viewHolder.i(R.id.tv_switch_desc);
                if (!this.f92483b.Y || ((TradeSteamInventoryObj) objectRef2.f124891b).getBargain_state() == null) {
                    viewI3.setVisibility(8);
                } else {
                    viewI3.setVisibility(0);
                    T t10 = objectRef2.f124891b;
                    f0.m(t10);
                    StateObj bargain_state = ((TradeSteamInventoryObj) t10).getBargain_state();
                    f0.m(bargain_state);
                    boolean z11 = !f0.g(bargain_state.getState(), "0");
                    r11.setChecked(z11);
                    ItemPutOnActivity itemPutOnActivity = this.f92483b;
                    f0.o(tv_switch_desc, "tv_switch_desc");
                    ItemPutOnActivity.i2(itemPutOnActivity, tv_switch_desc, z11);
                    viewI3.setOnClickListener(new a(this.f92483b, objectRef2));
                }
                ItemQuickPriceObj local_quick_price2 = ((TradeSteamInventoryObj) objectRef2.f124891b).getLocal_quick_price();
                String min_price3 = local_quick_price2 != null ? local_quick_price2.getMin_price() : null;
                if (min_price3 != null && min_price3.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    string = "参考价: 暂无";
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("参考价: ¥");
                    ItemQuickPriceObj local_quick_price3 = ((TradeSteamInventoryObj) objectRef2.f124891b).getLocal_quick_price();
                    if (local_quick_price3 != null && (min_price2 = local_quick_price3.getMin_price()) != null) {
                        str2 = min_price2;
                    }
                    sb4.append(str2);
                    string = sb4.toString();
                }
                textView8.setText(string);
                ArrayList<TradeItemTag> desc_tags = ((TradeSteamInventoryObj) objectRef2.f124891b).getDesc_tags();
                editText2.setText(desc_tags != null ? CollectionsKt___CollectionsKt.h3(desc_tags, "|", null, null, 0, null, new l<TradeItemTag, CharSequence>() { // from class: com.max.xiaoheihe.module.trade.ItemPutOnActivity$initView$3$onBindViewHolder$tagStr$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @dl.d
                    public final CharSequence a(@dl.d TradeItemTag it2) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{it2}, this, changeQuickRedirect, false, 44464, new Class[]{TradeItemTag.class}, CharSequence.class);
                        if (patchProxyResultProxy.isSupported) {
                            return (CharSequence) patchProxyResultProxy.result;
                        }
                        f0.p(it2, "it");
                        String desc = it2.getDesc();
                        return desc != null ? desc : "";
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ CharSequence invoke(TradeItemTag tradeItemTag) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemTag}, this, changeQuickRedirect, false, 44465, new Class[]{Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(tradeItemTag);
                    }
                }, 30, null) : null);
                editText2.clearFocus();
                editText2.setFocusable(false);
                editText2.setOnClickListener(new b(this.f92483b, objectRef2));
                editText3.setTag(item);
                editText3.setText(((TradeSteamInventoryObj) objectRef2.f124891b).getPrice());
                editText3.clearFocus();
                viewI2.setOnClickListener(new c(this.f92483b, objectRef2));
            }

            @Override // com.max.hbcommon.base.adapter.s
            public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, Object obj) {
                if (PatchProxy.proxy(new Object[]{eVar, obj}, this, changeQuickRedirect, false, 44459, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                o(eVar, (TradeSteamInventoryWrapper) obj);
            }

            @Override // com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
            public /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, 44457, new Class[]{ViewGroup.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
                return patchProxyResultProxy.isSupported ? (RecyclerView.ViewHolder) patchProxyResultProxy.result : onCreateViewHolder(viewGroup, i10);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v6, types: [T, android.view.View] */
            @Override // com.max.hbcommon.base.adapter.u, com.max.hbcommon.base.adapter.s, androidx.recyclerview.widget.RecyclerView.Adapter
            @dl.d
            public s.e onCreateViewHolder(@dl.d ViewGroup parent, int i10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{parent, new Integer(i10)}, this, changeQuickRedirect, false, 44454, new Class[]{ViewGroup.class, Integer.TYPE}, s.e.class);
                if (patchProxyResultProxy.isSupported) {
                    return (s.e) patchProxyResultProxy.result;
                }
                f0.p(parent, "parent");
                s.e eVarOnCreateViewHolder = super.onCreateViewHolder(parent, i10);
                f0.o(eVarOnCreateViewHolder, "super.onCreateViewHolder(parent, viewType)");
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = eVarOnCreateViewHolder.i(R.id.et_trade_price);
                bb.d.d((TextView) eVarOnCreateViewHolder.i(R.id.tv_price_symbol), 5);
                Typeface typeface = ((EditText) objectRef.f124891b).getTypeface();
                ((EditText) objectRef.f124891b).setFilters(new InputFilter[]{new j(100000000L)});
                ((EditText) objectRef.f124891b).addTextChangedListener(new e(objectRef, typeface, this.f92483b));
                return eVarOnCreateViewHolder;
            }
        };
        RecyclerView recyclerView3 = this.S;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        u<TradeSteamInventoryWrapper> uVar2 = this.V;
        if (uVar2 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        recyclerView3.setAdapter(uVar);
    }

    private final boolean x2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44416, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<TradeSteamInventoryWrapper> it = this.T.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                return true;
            }
            TradeSteamInventoryWrapper next = it.next();
            TradeSteamInventoryObj singleItem = next.getSingleItem();
            if (singleItem != null) {
                String price = singleItem.getPrice();
                if (price != null && price.length() != 0) {
                    z10 = false;
                }
                if (z10) {
                    return false;
                }
            } else {
                TradeSteamInventoryGroup itemGroup = next.getItemGroup();
                if (itemGroup != null) {
                    Iterator<TradeSteamInventoryObj> it2 = itemGroup.getItems().iterator();
                    while (it2.hasNext()) {
                        String price2 = it2.next().getPrice();
                        if (price2 == null || price2.length() == 0) {
                            return false;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
    }

    private final void y2(boolean z10) {
        TradeSteamInventoryGroup itemGroup;
        List<TradeSteamInventoryObj> items;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44414, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        List<TradeSteamInventoryWrapper> listT5 = CollectionsKt___CollectionsKt.T5(this.T);
        this.T.clear();
        u<TradeSteamInventoryWrapper> uVar = null;
        if (z10) {
            TradeQuickPriceResult tradeQuickPriceResult = this.W;
            f0.m(tradeQuickPriceResult);
            for (String str : tradeQuickPriceResult.getSpu_items().keySet()) {
                TradeSteamInventoryWrapper tradeSteamInventoryWrapper = new TradeSteamInventoryWrapper(null, null, 2, null);
                TradeQuickPriceResult tradeQuickPriceResult2 = this.W;
                f0.m(tradeQuickPriceResult2);
                List<String> list = tradeQuickPriceResult2.getSpu_items().get(str);
                f0.m(list);
                if (list.size() > 1) {
                    tradeSteamInventoryWrapper.setItemGroup(new TradeSteamInventoryGroup(new ArrayList(), ""));
                    Iterator it = listT5.iterator();
                    while (it.hasNext()) {
                        TradeSteamInventoryObj singleItem = ((TradeSteamInventoryWrapper) it.next()).getSingleItem();
                        if (singleItem != null && f0.g(singleItem.getSpu(), str) && (itemGroup = tradeSteamInventoryWrapper.getItemGroup()) != null && (items = itemGroup.getItems()) != null) {
                            items.add(singleItem);
                        }
                    }
                    this.T.add(tradeSteamInventoryWrapper);
                } else {
                    for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper2 : listT5) {
                        TradeSteamInventoryObj singleItem2 = tradeSteamInventoryWrapper2.getSingleItem();
                        if (singleItem2 != null && f0.g(singleItem2.getSpu(), str)) {
                            this.T.add(tradeSteamInventoryWrapper2);
                        }
                    }
                }
            }
        } else {
            for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper3 : listT5) {
                TradeSteamInventoryGroup itemGroup2 = tradeSteamInventoryWrapper3.getItemGroup();
                if (itemGroup2 != null) {
                    Iterator<TradeSteamInventoryObj> it2 = itemGroup2.getItems().iterator();
                    while (it2.hasNext()) {
                        this.T.add(new TradeSteamInventoryWrapper(it2.next(), null, 2, null));
                    }
                } else {
                    this.T.add(tradeSteamInventoryWrapper3);
                }
            }
        }
        u<TradeSteamInventoryWrapper> uVar2 = this.V;
        if (uVar2 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        uVar.notifyDataSetChanged();
    }

    private final void z2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44417, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BigDecimal bigDecimal = new BigDecimal("0.0");
        for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper : this.T) {
            TradeSteamInventoryObj singleItem = tradeSteamInventoryWrapper.getSingleItem();
            boolean z10 = true;
            if (singleItem != null) {
                String price = singleItem.getPrice();
                if (price != null && price.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    bigDecimal = bigDecimal.add(new BigDecimal(singleItem.getPrice()));
                    f0.o(bigDecimal, "this.add(other)");
                }
            } else {
                TradeSteamInventoryGroup itemGroup = tradeSteamInventoryWrapper.getItemGroup();
                if (itemGroup != null) {
                    for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
                        String price2 = tradeSteamInventoryObj.getPrice();
                        if (!(price2 == null || price2.length() == 0)) {
                            bigDecimal = bigDecimal.add(new BigDecimal(tradeSteamInventoryObj.getPrice()));
                            f0.o(bigDecimal, "this.add(other)");
                        }
                    }
                }
            }
        }
        TextView textView = null;
        if (bigDecimal.compareTo(new BigDecimal("0.0")) <= 0) {
            TextView textView2 = this.N;
            if (textView2 == null) {
                f0.S("tv_profit");
                textView2 = null;
            }
            textView2.setText("0.00");
            TextView textView3 = this.M;
            if (textView3 == null) {
                f0.S("tv_fee_rate");
            } else {
                textView = textView3;
            }
            textView.setText("已扣除服务费￥0.00");
            return;
        }
        TradeQuickPriceResult tradeQuickPriceResult = this.W;
        BigDecimal bigDecimalMax = bigDecimal.multiply(new BigDecimal(tradeQuickPriceResult != null ? tradeQuickPriceResult.getFee_rate() : null)).setScale(2, 4).max(new BigDecimal("0.01"));
        f0.o(bigDecimalMax, "totalprice.multiply(BigD… .max(BigDecimal(\"0.01\"))");
        this.f92467p2 = bigDecimalMax;
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimalMax);
        f0.o(bigDecimalSubtract, "this.subtract(other)");
        this.f92469x2 = bigDecimalSubtract;
        TextView textView4 = this.N;
        if (textView4 == null) {
            f0.S("tv_profit");
            textView4 = null;
        }
        textView4.setText(this.f92469x2.toString());
        TextView textView5 = this.M;
        if (textView5 == null) {
            f0.S("tv_fee_rate");
        } else {
            textView = textView5;
        }
        textView.setText("已扣除服务费￥" + this.f92467p2);
    }

    public final void A2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44411, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        JsonArray jsonArray = new JsonArray();
        for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper : this.T) {
            TradeSteamInventoryObj singleItem = tradeSteamInventoryWrapper.getSingleItem();
            boolean z10 = true;
            if (singleItem != null) {
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("sku_id", singleItem.getSku_id());
                jsonObject.addProperty("market_hash_name", singleItem.getMarket_hash_name());
                ArrayList<TradeItemTag> desc_tags = singleItem.getDesc_tags();
                String strH3 = desc_tags != null ? CollectionsKt___CollectionsKt.h3(desc_tags, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<TradeItemTag, CharSequence>() { // from class: com.max.xiaoheihe.module.trade.ItemPutOnActivity$putOn$1$tagStr$1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @dl.d
                    public final CharSequence a(@dl.d TradeItemTag tag) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tag}, this, changeQuickRedirect, false, 44469, new Class[]{TradeItemTag.class}, CharSequence.class);
                        if (patchProxyResultProxy.isSupported) {
                            return (CharSequence) patchProxyResultProxy.result;
                        }
                        f0.p(tag, "tag");
                        String id2 = tag.getId();
                        return id2 != null ? id2 : "";
                    }

                    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                    @Override // yh.l
                    public /* bridge */ /* synthetic */ CharSequence invoke(TradeItemTag tradeItemTag) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemTag}, this, changeQuickRedirect, false, 44470, new Class[]{Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(tradeItemTag);
                    }
                }, 30, null) : null;
                if (strH3 != null && strH3.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    jsonObject.addProperty("tags", strH3);
                }
                jsonObject.addProperty(GameObj.KEY_POINT_PRICE, singleItem.getPrice());
                jsonArray.add(jsonObject);
            } else {
                TradeSteamInventoryGroup itemGroup = tradeSteamInventoryWrapper.getItemGroup();
                if (itemGroup != null) {
                    for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
                        JsonObject jsonObject2 = new JsonObject();
                        jsonObject2.addProperty("sku_id", tradeSteamInventoryObj.getSku_id());
                        jsonObject2.addProperty("market_hash_name", tradeSteamInventoryObj.getMarket_hash_name());
                        ArrayList<TradeItemTag> desc_tags2 = tradeSteamInventoryObj.getDesc_tags();
                        String strH4 = desc_tags2 != null ? CollectionsKt___CollectionsKt.h3(desc_tags2, Constants.ACCEPT_TIME_SEPARATOR_SP, null, null, 0, null, new yh.l<TradeItemTag, CharSequence>() { // from class: com.max.xiaoheihe.module.trade.ItemPutOnActivity$putOn$2$1$tagStr$1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @dl.d
                            public final CharSequence a(@dl.d TradeItemTag tag) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tag}, this, changeQuickRedirect, false, 44471, new Class[]{TradeItemTag.class}, CharSequence.class);
                                if (patchProxyResultProxy.isSupported) {
                                    return (CharSequence) patchProxyResultProxy.result;
                                }
                                f0.p(tag, "tag");
                                String id2 = tag.getId();
                                return id2 != null ? id2 : "";
                            }

                            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.CharSequence, java.lang.Object] */
                            @Override // yh.l
                            public /* bridge */ /* synthetic */ CharSequence invoke(TradeItemTag tradeItemTag) {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeItemTag}, this, changeQuickRedirect, false, 44472, new Class[]{Object.class}, Object.class);
                                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(tradeItemTag);
                            }
                        }, 30, null) : null;
                        if (!(strH4 == null || strH4.length() == 0)) {
                            jsonObject2.addProperty("tags", strH4);
                        }
                        jsonObject2.addProperty(GameObj.KEY_POINT_PRICE, tradeSteamInventoryObj.getPrice());
                        jsonArray.add(jsonObject2);
                    }
                }
            }
        }
        V((io.reactivex.disposables.b) (this.Y ? com.max.xiaoheihe.network.i.a().yb(jsonArray.toString()) : com.max.xiaoheihe.network.i.a().N8(jsonArray.toString())).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m()));
    }

    public final void E2() {
        Map<String, List<String>> spu_items;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44408, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeQuickPriceResult tradeQuickPriceResult = this.W;
        View view = null;
        if (((tradeQuickPriceResult == null || (spu_items = tradeQuickPriceResult.getSpu_items()) == null) ? this.U.size() : spu_items.size()) < this.U.size()) {
            View view2 = this.P;
            if (view2 == null) {
                f0.S("vg_merge");
            } else {
                view = view2;
            }
            view.setVisibility(0);
            return;
        }
        View view3 = this.P;
        if (view3 == null) {
            f0.S("vg_merge");
        } else {
            view = view3;
        }
        view.setVisibility(8);
    }

    public final void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44407, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        E2();
        D2();
    }

    public final void K2(@dl.d TradeSteamInventoryObj item) {
        if (PatchProxy.proxy(new Object[]{item}, this, changeQuickRedirect, false, 44418, new Class[]{TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(item, "item");
        if (this.Z == null) {
            View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.dialog_item_desc_tag, (ViewGroup) null, false);
            this.f92463a0 = viewInflate;
            View viewFindViewById = viewInflate != null ? viewInflate.findViewById(R.id.vg_bg) : null;
            f0.n(viewFindViewById, "null cannot be cast to non-null type android.view.View");
            u2();
            this.Z = new com.max.hbcommon.component.i((Context) this.f66601b, true, this.f92463a0);
            viewFindViewById.setOnClickListener(new n());
        }
        O2(item);
        com.max.hbcommon.component.i iVar = this.Z;
        if (iVar != null) {
            iVar.setCancelable(true);
        }
        com.max.hbcommon.component.i iVar2 = this.Z;
        if (iVar2 != null) {
            iVar2.show();
        }
    }

    public final void L2() {
        int size = 0;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44410, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper : this.T) {
            if (tradeSteamInventoryWrapper.getSingleItem() != null) {
                size++;
            } else {
                TradeSteamInventoryGroup itemGroup = tradeSteamInventoryWrapper.getItemGroup();
                if (itemGroup != null) {
                    size += itemGroup.getItems().size();
                }
            }
        }
        boolean z10 = this.Y;
        String str = z10 ? "确认改价" : "确认上架";
        String str2 = z10 ? "" : "请留意App通知，请务必在小黑盒/MAX内处理报价完成发货，谨防被骗";
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        String strValueOf = String.valueOf(size);
        String string = this.f92467p2.toString();
        f0.o(string, "mDeduction.toString()");
        String string2 = this.f92469x2.toString();
        f0.o(string2, "mProfit.toString()");
        TradeInfoUtilKt.Q(mContext, str, str2, "上架数量:", strValueOf, "服务费:", string, "实际收益:", string2, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemPutOnActivity$showPutOnConfirmDialog$3
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44480, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44479, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f92508b.A2();
            }
        }, 512, null);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44402, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_item_put_on);
        boolean booleanExtra = getIntent().getBooleanExtra("is_change", false);
        this.Y = booleanExtra;
        this.f66616q.setTitle(booleanExtra ? "饰品改价" : "饰品上架");
        this.f66617r.setVisibility(0);
        this.f66616q.setAction("一键定价");
        this.f66616q.setActionOnClickListener(new l());
        Serializable serializableExtra = getIntent().getSerializableExtra("list");
        f0.n(serializableExtra, "null cannot be cast to non-null type java.util.ArrayList<com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj>{ kotlin.collections.TypeAliasesKt.ArrayList<com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj> }");
        ArrayList arrayList = (ArrayList) serializableExtra;
        this.U = arrayList;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.T.add(new TradeSteamInventoryWrapper((TradeSteamInventoryObj) it.next(), null, 2, null));
        }
        o2();
        v2();
        E1();
        p2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44404, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        p2();
    }

    public final void n2() {
        String string;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44409, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        boolean z10 = false;
        int i10 = 0;
        String name = null;
        for (TradeSteamInventoryWrapper tradeSteamInventoryWrapper : this.T) {
            TradeSteamInventoryObj singleItem = tradeSteamInventoryWrapper.getSingleItem();
            if (singleItem != null) {
                ItemQuickPriceObj local_quick_price = singleItem.getLocal_quick_price();
                String min_price = local_quick_price != null ? local_quick_price.getMin_price() : null;
                if (!(min_price == null || min_price.length() == 0)) {
                    BigDecimal bigDecimal = new BigDecimal(singleItem.getPrice());
                    ItemQuickPriceObj local_quick_price2 = singleItem.getLocal_quick_price();
                    f0.m(local_quick_price2);
                    BigDecimal bigDecimal2 = new BigDecimal(local_quick_price2.getMin_price());
                    TradeQuickPriceResult tradeQuickPriceResult = this.W;
                    if (bigDecimal.compareTo(bigDecimal2.multiply(new BigDecimal(tradeQuickPriceResult != null ? tradeQuickPriceResult.getMin_price_rate() : null))) < 0) {
                        i10++;
                        if (name == null || name.length() == 0) {
                            name = singleItem.getName();
                        }
                        z10 = true;
                    }
                }
            } else {
                TradeSteamInventoryGroup itemGroup = tradeSteamInventoryWrapper.getItemGroup();
                if (itemGroup != null) {
                    for (TradeSteamInventoryObj tradeSteamInventoryObj : itemGroup.getItems()) {
                        ItemQuickPriceObj local_quick_price3 = tradeSteamInventoryObj.getLocal_quick_price();
                        String min_price2 = local_quick_price3 != null ? local_quick_price3.getMin_price() : null;
                        if (!(min_price2 == null || min_price2.length() == 0)) {
                            BigDecimal bigDecimal3 = new BigDecimal(tradeSteamInventoryObj.getPrice());
                            ItemQuickPriceObj local_quick_price4 = tradeSteamInventoryObj.getLocal_quick_price();
                            f0.m(local_quick_price4);
                            BigDecimal bigDecimal4 = new BigDecimal(local_quick_price4.getMin_price());
                            TradeQuickPriceResult tradeQuickPriceResult2 = this.W;
                            if (bigDecimal3.compareTo(bigDecimal4.multiply(new BigDecimal(tradeQuickPriceResult2 != null ? tradeQuickPriceResult2.getMin_price_rate() : null))) < 0) {
                                i10++;
                                if (name == null || name.length() == 0) {
                                    name = tradeSteamInventoryObj.getName();
                                }
                                z10 = true;
                            }
                        }
                    }
                }
            }
        }
        if (!z10) {
            L2();
            return;
        }
        if (i10 > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((char) 31561);
            sb2.append(i10);
            sb2.append((char) 20010);
            string = sb2.toString();
        } else {
            string = "";
        }
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y("定价警告").l("检测到 " + name + ' ' + string + "的定价与市场价相差较大，是否继续上架");
        fVarL.u("继续上架", new b());
        fVarL.o(this.f66601b.getString(R.string.cancel), c.f92472b);
        fVarL.F().f().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Serializable serializableExtra;
        u<TradeSteamInventoryWrapper> uVar;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44426, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 != f92461p3 || intent == null || (serializableExtra = intent.getSerializableExtra(TradebargainRegisterActivity.f93276c0.a())) == null) {
            return;
        }
        KeyDescObj keyDescObj = (KeyDescObj) serializableExtra;
        Iterator<TradeSteamInventoryWrapper> it = this.T.iterator();
        while (true) {
            uVar = null;
            if (!it.hasNext()) {
                break;
            }
            TradeSteamInventoryWrapper next = it.next();
            if (next.getItemGroup() == null) {
                TradeSteamInventoryObj singleItem = next.getSingleItem();
                if (f0.g(singleItem != null ? singleItem.getSku_id() : null, keyDescObj.getKey())) {
                    TradeSteamInventoryObj singleItem2 = next.getSingleItem();
                    if ((singleItem2 != null ? singleItem2.getBargain_state() : null) != null) {
                        TradeSteamInventoryObj singleItem3 = next.getSingleItem();
                        StateObj bargain_state = singleItem3 != null ? singleItem3.getBargain_state() : null;
                        if (bargain_state != null) {
                            bargain_state.setState(keyDescObj.getValue());
                        }
                    }
                }
            }
        }
        u<TradeSteamInventoryWrapper> uVar2 = this.V;
        if (uVar2 == null) {
            f0.S("mAdapter");
        } else {
            uVar = uVar2;
        }
        uVar.notifyDataSetChanged();
    }
}
