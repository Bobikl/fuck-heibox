package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryObj;
import com.max.xiaoheihe.bean.trade.TradeSteamInventoryResult;
import com.max.xiaoheihe.bean.trade.TradeSupplyCheckResult;
import com.max.xiaoheihe.utils.i0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import ng.j;
import org.apache.tools.ant.util.d0;
import yh.l;

/* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nItemWaitDeliverFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemWaitDeliverFragment.kt\ncom/max/xiaoheihe/module/trade/ItemWaitDeliverFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,460:1\n1#2:461\n*E\n"})
@o(parameters = 0)
public final class ItemWaitDeliverFragment extends com.max.hbcommon.base.d {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    public static final a f92565m = new a(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f92566n = 8;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private static final String f92567o = "is_receive";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f92568p = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SmartRefreshLayout f92569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RecyclerView f92570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f92571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private TradeSteamInventoryResult f92572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f92573f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private s<TradeSteamInventoryObj> f92575h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f92577j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f92578k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private LoadingDialog f92579l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<TradeSteamInventoryObj> f92574g = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final List<CountDownTimer> f92576i = new ArrayList();

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        public static /* synthetic */ ItemWaitDeliverFragment b(a aVar, boolean z10, int i10, Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{aVar, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 44582, new Class[]{a.class, Boolean.TYPE, Integer.TYPE, Object.class}, ItemWaitDeliverFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ItemWaitDeliverFragment) patchProxyResultProxy.result;
            }
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(z10);
        }

        @dl.d
        public final ItemWaitDeliverFragment a(boolean z10) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 44581, new Class[]{Boolean.TYPE}, ItemWaitDeliverFragment.class);
            if (patchProxyResultProxy.isSupported) {
                return (ItemWaitDeliverFragment) patchProxyResultProxy.result;
            }
            ItemWaitDeliverFragment itemWaitDeliverFragment = new ItemWaitDeliverFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean(ItemWaitDeliverFragment.f92567o, z10);
            itemWaitDeliverFragment.setArguments(bundle);
            return itemWaitDeliverFragment;
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeSupplyCheckResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92581c;

        b(String str) {
            this.f92581c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44583, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemWaitDeliverFragment.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<TradeSupplyCheckResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44584, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemWaitDeliverFragment.this.isActive()) {
                if (result.getResult().getMerge_count() > 0) {
                    ItemWaitDeliverFragment.X3(ItemWaitDeliverFragment.this, this.f92581c, String.valueOf(result.getResult().getMerge_count()));
                } else {
                    ((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext.startActivity(TradeOrderDetailActivity.f93027p2.a(((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext, this.f92581c));
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44585, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSupplyCheckResult>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradeSteamInventoryResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44587, new Class[0], Void.TYPE).isSupported && ItemWaitDeliverFragment.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = ItemWaitDeliverFragment.this.f92569b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemWaitDeliverFragment.this.f92569b;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44586, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemWaitDeliverFragment.this.isActive()) {
                super.onError(e10);
                ItemWaitDeliverFragment.W3(ItemWaitDeliverFragment.this);
                SmartRefreshLayout smartRefreshLayout = ItemWaitDeliverFragment.this.f92569b;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = ItemWaitDeliverFragment.this.f92569b;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeSteamInventoryResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44588, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemWaitDeliverFragment.this.isActive()) {
                ItemWaitDeliverFragment.this.f92572e = result.getResult();
                ItemWaitDeliverFragment.this.e4();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44589, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeSteamInventoryResult>) obj);
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44601, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            ItemWaitDeliverFragment.this.f92573f = 0;
            ItemWaitDeliverFragment.M3(ItemWaitDeliverFragment.this);
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class e implements pg.b {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // pg.b
        public final void f(@dl.d j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44602, new Class[]{j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            ItemWaitDeliverFragment.this.f92573f += 30;
            ItemWaitDeliverFragment.M3(ItemWaitDeliverFragment.this);
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class f extends s<TradeSteamInventoryObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeSteamInventoryObj f92586b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ItemWaitDeliverFragment f92587c;

            a(TradeSteamInventoryObj tradeSteamInventoryObj, ItemWaitDeliverFragment itemWaitDeliverFragment) {
                this.f92586b = tradeSteamInventoryObj;
                this.f92587c = itemWaitDeliverFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44605, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                String order_id = this.f92586b.getOrder_id();
                if (order_id != null && order_id.length() != 0) {
                    z10 = false;
                }
                if (!z10) {
                    ItemWaitDeliverFragment itemWaitDeliverFragment = this.f92587c;
                    String order_id2 = this.f92586b.getOrder_id();
                    f0.m(order_id2);
                    ItemWaitDeliverFragment.L3(itemWaitDeliverFragment, order_id2);
                    return;
                }
                Activity activity = ((com.max.hbcommon.base.d) this.f92587c).mContext;
                TradeAssistantActivity.a aVar = TradeAssistantActivity.X;
                Activity mContext = ((com.max.hbcommon.base.d) this.f92587c).mContext;
                f0.o(mContext, "mContext");
                activity.startActivity(aVar.a(mContext));
            }
        }

        /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
        public static final class b extends CountDownTimer {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<TextView> f92588a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ref.ObjectRef<TextView> objectRef, long j10) {
                super(j10, 1000L);
                this.f92588a = objectRef;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                TextView textView;
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44607, new Class[0], Void.TYPE).isSupported || (textView = this.f92588a.f124891b) == null) {
                    return;
                }
                textView.setText("00:00:00");
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 44606, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(d0.f136746g, Locale.getDefault());
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
                String str = simpleDateFormat.format(new Date(j10));
                TextView textView = this.f92588a.f124891b;
                if (textView == null) {
                    return;
                }
                textView.setText(str);
            }
        }

        f(Activity activity, List<TradeSteamInventoryObj> list) {
            super(activity, list, R.layout.item_wait_deliver);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v2, types: [T, android.view.View] */
        public void m(@dl.d s.e viewHolder, @dl.d TradeSteamInventoryObj data) {
            boolean z10 = true;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44603, new Class[]{s.e.class, TradeSteamInventoryObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            Activity mContext = ((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext;
            f0.o(mContext, "mContext");
            TradeInfoUtilKt.B(mContext, viewHolder, data, false, 8, null);
            Activity mContext2 = ((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext;
            f0.o(mContext2, "mContext");
            TradeInfoUtilKt.u(mContext2, viewHolder, data);
            Activity mContext3 = ((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext;
            f0.o(mContext3, "mContext");
            TradeInfoUtilKt.z(mContext3, viewHolder, data, false);
            TextView textView = (TextView) viewHolder.i(R.id.tv_trade_price);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_price_symbol);
            ConstraintLayout constraintLayout = (ConstraintLayout) viewHolder.i(R.id.cl_root);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f124891b = viewHolder.i(R.id.tv_time_left);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_amount);
            String amount = data.getAmount();
            if (amount != null && amount.length() != 0) {
                z10 = false;
            }
            if (z10) {
                textView3.setVisibility(4);
            } else {
                textView3.setVisibility(0);
                textView3.setText('x' + data.getAmount());
            }
            bb.d.d(textView2, 5);
            bb.d.d(textView, 5);
            bb.d.d((TextView) objectRef.f124891b, 5);
            textView.setText(data.getPrice());
            if (data.getFloat_value() == null) {
                androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
                cVar.H(constraintLayout);
                cVar.M0(R.id.tv_time_left);
                cVar.M0(R.id.tv_time_left_desc);
                cVar.o(R.id.tv_time_left_desc, R.id.tv_time_left, 0);
                cVar.o(R.id.tv_time_left, 0, R.id.tv_time_left_desc);
                cVar.B1(R.id.tv_time_left, 2);
                cVar.r(constraintLayout);
            } else {
                androidx.constraintlayout.widget.c cVar2 = new androidx.constraintlayout.widget.c();
                cVar2.H(constraintLayout);
                cVar2.M0(R.id.tv_time_left);
                cVar2.M0(R.id.tv_time_left_desc);
                cVar2.K(R.id.tv_time_left_desc, 3, R.id.vg_tag, 3);
                cVar2.K(R.id.tv_time_left_desc, 4, R.id.vg_tag, 4);
                cVar2.K(R.id.tv_time_left, 4, R.id.tv_time_left_desc, 3);
                cVar2.r(constraintLayout);
            }
            if (((TextView) objectRef.f124891b).getTag() != null && (((TextView) objectRef.f124891b).getTag() instanceof CountDownTimer)) {
                Object tag = ((TextView) objectRef.f124891b).getTag();
                f0.n(tag, "null cannot be cast to non-null type android.os.CountDownTimer");
                ((CountDownTimer) tag).cancel();
            }
            CountDownTimer timer = new b(objectRef, n.r(data.getTime_left()) * ((long) 1000)).start();
            List list = ItemWaitDeliverFragment.this.f92576i;
            f0.o(timer, "timer");
            list.add(timer);
            ((TextView) objectRef.f124891b).setTag(timer);
            viewHolder.itemView.setOnClickListener(new a(data, ItemWaitDeliverFragment.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeSteamInventoryObj tradeSteamInventoryObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeSteamInventoryObj}, this, changeQuickRedirect, false, 44604, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeSteamInventoryObj);
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92590c;

        g(String str) {
            this.f92590c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44612, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ItemWaitDeliverFragment.Y3(ItemWaitDeliverFragment.this, this.f92590c);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92601c;

        h(String str) {
            this.f92601c = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44613, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            ((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext.startActivity(TradeOrderDetailActivity.f93027p2.a(((com.max.hbcommon.base.d) ItemWaitDeliverFragment.this).mContext, this.f92601c));
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: ItemWaitDeliverFragment.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92603c;

        i(String str) {
            this.f92603c = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44614, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (ItemWaitDeliverFragment.this.isActive()) {
                super.onError(e10);
                LoadingDialog loadingDialog = ItemWaitDeliverFragment.this.f92579l;
                if (loadingDialog != null) {
                    loadingDialog.c();
                }
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44615, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (ItemWaitDeliverFragment.this.isActive()) {
                ItemWaitDeliverFragment.R3(ItemWaitDeliverFragment.this, this.f92603c, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44616, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    public static final /* synthetic */ void L3(ItemWaitDeliverFragment itemWaitDeliverFragment, String str) {
        if (PatchProxy.proxy(new Object[]{itemWaitDeliverFragment, str}, null, changeQuickRedirect, true, 44576, new Class[]{ItemWaitDeliverFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        itemWaitDeliverFragment.Z3(str);
    }

    public static final /* synthetic */ void M3(ItemWaitDeliverFragment itemWaitDeliverFragment) {
        if (PatchProxy.proxy(new Object[]{itemWaitDeliverFragment}, null, changeQuickRedirect, true, 44575, new Class[]{ItemWaitDeliverFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemWaitDeliverFragment.b4();
    }

    public static final /* synthetic */ void R3(ItemWaitDeliverFragment itemWaitDeliverFragment, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{itemWaitDeliverFragment, str, new Integer(i10)}, null, changeQuickRedirect, true, 44580, new Class[]{ItemWaitDeliverFragment.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        itemWaitDeliverFragment.c4(str, i10);
    }

    public static final /* synthetic */ void W3(ItemWaitDeliverFragment itemWaitDeliverFragment) {
        if (PatchProxy.proxy(new Object[]{itemWaitDeliverFragment}, null, changeQuickRedirect, true, 44577, new Class[]{ItemWaitDeliverFragment.class}, Void.TYPE).isSupported) {
            return;
        }
        itemWaitDeliverFragment.showError();
    }

    public static final /* synthetic */ void X3(ItemWaitDeliverFragment itemWaitDeliverFragment, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{itemWaitDeliverFragment, str, str2}, null, changeQuickRedirect, true, 44578, new Class[]{ItemWaitDeliverFragment.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        itemWaitDeliverFragment.g4(str, str2);
    }

    public static final /* synthetic */ void Y3(ItemWaitDeliverFragment itemWaitDeliverFragment, String str) {
        if (PatchProxy.proxy(new Object[]{itemWaitDeliverFragment, str}, null, changeQuickRedirect, true, 44579, new Class[]{ItemWaitDeliverFragment.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        itemWaitDeliverFragment.h4(str);
    }

    private final void Z3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44570, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z8(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b(str)));
    }

    private final void a4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44568, new Class[0], Void.TYPE).isSupported || com.max.hbcommon.utils.c.w(this.f92576i)) {
            return;
        }
        for (CountDownTimer countDownTimer : this.f92576i) {
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    private final void b4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44564, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!i0.s()) {
            f4();
            return;
        }
        String str = this.f92577j;
        String str2 = str == null || str.length() == 0 ? null : this.f92577j;
        addDisposable((io.reactivex.disposables.b) (this.f92578k ? com.max.xiaoheihe.network.i.a().f7(str2, this.f92573f, 30) : com.max.xiaoheihe.network.i.a().Db(str2, this.f92573f, 30)).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void c4(final String str, final int i10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 44573, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 < 3) {
            j10 = 2;
        } else {
            j10 = i10 < 8 ? 4L : 8L;
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f3(str).w1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<TradeOfferStateObj>>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment$getOfferState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44590, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f92591b.isActive()) {
                    LoadingDialog loadingDialog = this.f92591b.f92579l;
                    if (loadingDialog != null) {
                        loadingDialog.c();
                    }
                    Activity mContext = ((com.max.hbcommon.base.d) this.f92591b).mContext;
                    f0.o(mContext, "mContext");
                    TradeInfoUtilKt.q(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment$getOfferState$1$onError$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44593, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                        }
                    });
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<TradeOfferStateObj> result) {
                boolean z10 = true;
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44591, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f92591b.isActive()) {
                    TradeOfferStateObj result2 = result.getResult();
                    String state = result2 != null ? result2.getState() : null;
                    if (state != null) {
                        int iHashCode = state.hashCode();
                        if (iHashCode == -1867169789) {
                            if (state.equals("success")) {
                                LoadingDialog loadingDialog = this.f92591b.f92579l;
                                if (loadingDialog != null) {
                                    loadingDialog.c();
                                }
                                TradeOfferStateObj result3 = result.getResult();
                                String buyer_create_time = result3 != null ? result3.getBuyer_create_time() : null;
                                if (buyer_create_time != null && buyer_create_time.length() != 0) {
                                    z10 = false;
                                }
                                if (z10) {
                                    Activity mContext = ((com.max.hbcommon.base.d) this.f92591b).mContext;
                                    f0.o(mContext, "mContext");
                                    final ItemWaitDeliverFragment itemWaitDeliverFragment = this.f92591b;
                                    TradeInfoUtilKt.r(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment$getOfferState$1$onNext$3
                                        public static ChangeQuickRedirect changeQuickRedirect;

                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                        @Override // yh.a
                                        public /* bridge */ /* synthetic */ b2 invoke() {
                                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44599, new Class[0], Object.class);
                                            if (patchProxyResultProxy.isSupported) {
                                                return patchProxyResultProxy.result;
                                            }
                                            invoke2();
                                            return b2.f124493a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44598, new Class[0], Void.TYPE).isSupported) {
                                                return;
                                            }
                                            itemWaitDeliverFragment.onRefresh();
                                        }
                                    });
                                    return;
                                }
                                ItemWaitDeliverFragment itemWaitDeliverFragment2 = this.f92591b;
                                TradeOfferStateObj result4 = result.getResult();
                                String buyer_create_time2 = result4 != null ? result4.getBuyer_create_time() : null;
                                f0.m(buyer_create_time2);
                                final ItemWaitDeliverFragment itemWaitDeliverFragment3 = this.f92591b;
                                TradeInfoUtilKt.M(itemWaitDeliverFragment2, buyer_create_time2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment$getOfferState$1$onNext$2
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44597, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44596, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        itemWaitDeliverFragment3.onRefresh();
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (iHashCode == -1091295072) {
                            if (state.equals("overdue")) {
                                LoadingDialog loadingDialog2 = this.f92591b.f92579l;
                                if (loadingDialog2 != null) {
                                    loadingDialog2.c();
                                }
                                Activity mContext2 = ((com.max.hbcommon.base.d) this.f92591b).mContext;
                                f0.o(mContext2, "mContext");
                                final ItemWaitDeliverFragment itemWaitDeliverFragment4 = this.f92591b;
                                final String str2 = str;
                                TradeInfoUtilKt.b0(mContext2, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment$getOfferState$1$onNext$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44595, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44594, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        ((com.max.hbcommon.base.d) itemWaitDeliverFragment4).mContext.startActivityForResult(TradeUploadSteamActivity.P.a(((com.max.hbcommon.base.d) itemWaitDeliverFragment4).mContext, str2), 2);
                                    }
                                }, 14, null);
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 1116313165 && state.equals("waiting")) {
                            int i11 = i10;
                            if (i11 <= 12) {
                                ItemWaitDeliverFragment.R3(this.f92591b, str, i11 + 1);
                                return;
                            }
                            LoadingDialog loadingDialog3 = this.f92591b.f92579l;
                            if (loadingDialog3 != null) {
                                loadingDialog3.c();
                            }
                            Activity mContext3 = ((com.max.hbcommon.base.d) this.f92591b).mContext;
                            f0.o(mContext3, "mContext");
                            TradeInfoUtilKt.s(mContext3, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment$getOfferState$1$onNext$4
                                public static ChangeQuickRedirect changeQuickRedirect;

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ b2 invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44600, new Class[0], Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    invoke2();
                                    return b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }
                            });
                        }
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44592, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<TradeOfferStateObj>) obj);
            }
        }));
    }

    private final void d4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44563, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.f92569b;
        s<TradeSteamInventoryObj> sVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new d());
        SmartRefreshLayout smartRefreshLayout2 = this.f92569b;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.f0(new e());
        RecyclerView recyclerView = this.f92570c;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.mContext));
        RecyclerView recyclerView2 = this.f92570c;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        this.f92575h = new f(this.mContext, this.f92574g);
        RecyclerView recyclerView3 = this.f92570c;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        s<TradeSteamInventoryObj> sVar2 = this.f92575h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView3.setAdapter(sVar);
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44569, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        View view = this.f92571d;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.f92571d;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.f92571d;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view4;
        }
        View viewFindViewById2 = view2.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById2;
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        textView.setText(this.f92578k ? "暂无待收货饰品" : "暂无待发货饰品");
    }

    private final void g4(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 44571, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.mContext).y("合并发起报价").l("监测到有 " + str2 + " 个订单可以合并报价，\n是否合并发起报价").u("合并发起", new g(str)).o("查看订单", new h(str)).g(false).F();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    private final void h4(String str) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44572, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        LoadingDialog loadingDialog = this.f92579l;
        if (loadingDialog == null) {
            Activity mContext = this.mContext;
            f0.o(mContext, "mContext");
            this.f92579l = new LoadingDialog(mContext, "正在发起报价...", true).r();
        } else {
            if (loadingDialog != null && !loadingDialog.i()) {
                z10 = true;
            }
            if (z10) {
                Activity mContext2 = this.mContext;
                f0.o(mContext2, "mContext");
                this.f92579l = new LoadingDialog(mContext2, "正在发起报价...", true).r();
            }
        }
        addDisposable((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z7(str, "1").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(str)));
    }

    public final void e4() {
        ArrayList<TradeSteamInventoryObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44566, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showContentView();
        if (this.f92573f == 0) {
            this.f92574g.clear();
        }
        TradeSteamInventoryResult tradeSteamInventoryResult = this.f92572e;
        if (tradeSteamInventoryResult != null && (list = tradeSteamInventoryResult.getList()) != null) {
            this.f92574g.addAll(list);
        }
        List<TradeSteamInventoryObj> list2 = this.f92574g;
        if (list2 == null || list2.isEmpty()) {
            f4();
            return;
        }
        View view = this.f92571d;
        s<TradeSteamInventoryObj> sVar = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(8);
        s<TradeSteamInventoryObj> sVar2 = this.f92575h;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }

    @Override // com.max.hbcommon.base.d
    public void installViews(@dl.d View rootView) {
        if (PatchProxy.proxy(new Object[]{rootView}, this, changeQuickRedirect, false, 44562, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(rootView, "rootView");
        setContentView(R.layout.fragment_item_wait_deliver);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            f0.m(arguments);
            this.f92578k = arguments.getBoolean(f92567o);
        }
        View viewFindViewById = rootView.findViewById(R.id.srl);
        f0.o(viewFindViewById, "rootView.findViewById(R.id.srl)");
        this.f92569b = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = rootView.findViewById(R.id.rv);
        f0.o(viewFindViewById2, "rootView.findViewById(R.id.rv)");
        this.f92570c = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = rootView.findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "rootView.findViewById(R.id.vg_invntory_empty)");
        this.f92571d = viewFindViewById3;
        TradeInfoUtilKt.m(rootView, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment.installViews.1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44609, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44608, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                ItemWaitDeliverFragment.this.f92573f = 0;
                ItemWaitDeliverFragment.M3(ItemWaitDeliverFragment.this);
            }
        }, new l<String, b2>() { // from class: com.max.xiaoheihe.module.trade.ItemWaitDeliverFragment.installViews.2
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(String str) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44611, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(str);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d String q10) {
                if (PatchProxy.proxy(new Object[]{q10}, this, changeQuickRedirect, false, 44610, new Class[]{String.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(q10, "q");
                ItemWaitDeliverFragment.this.f92577j = q10;
            }
        });
        EditText editText = (EditText) rootView.findViewById(R.id.et_item_search);
        if (editText != null) {
            editText.setHint(this.f92578k ? "搜索当前待收货饰品" : "搜索当前待发货饰品");
        }
        d4();
        showLoading();
        b4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44574, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == 2 && i11 == -1) {
            onRefresh();
        }
    }

    @Override // com.max.hbcommon.base.d, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44567, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        a4();
        super.onDestroyView();
    }

    @Override // com.max.hbcommon.base.d
    public void onRefresh() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44565, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        showLoading();
        this.f92573f = 0;
        b4();
    }
}
