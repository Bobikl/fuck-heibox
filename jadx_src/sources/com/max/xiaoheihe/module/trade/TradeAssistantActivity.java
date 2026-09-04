package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbcustomview.loadingdialog.LoadingDialog;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.hbutils.utils.w;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.trade.TradeAssistantResult;
import com.max.xiaoheihe.bean.trade.TradeOfferObj;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.bean.trade.TradeTipsStateObj;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.message.common.inter.ITagManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: TradeAssistantActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nTradeAssistantActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TradeAssistantActivity.kt\ncom/max/xiaoheihe/module/trade/TradeAssistantActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,507:1\n1#2:508\n*E\n"})
@o(parameters = 0)
public final class TradeAssistantActivity extends BaseActivity {

    @dl.d
    public static final a X = new a(null);
    public static final int Y = 8;
    private static final int Z = 1;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.d
    private static final String f92644a0 = "receive";
    public static ChangeQuickRedirect changeQuickRedirect;
    private SmartRefreshLayout L;
    private MarqueeTextView M;
    private View N;
    private RecyclerView O;

    @dl.e
    private TradeAssistantResult P;
    private View R;
    private s<TradeOfferObj> S;

    @dl.e
    private com.max.hbcommon.view.a T;

    @dl.e
    private LoadingDialog U;

    @dl.e
    private TradeOfferObj V;

    @dl.d
    private final List<TradeOfferObj> Q = new ArrayList();

    @dl.d
    private ArrayList<String> W = new ArrayList<>();

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 44741, new Class[]{Context.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            f0.p(context, "context");
            return new Intent(context, (Class<?>) TradeAssistantActivity.class);
        }

        @dl.d
        public final String b() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44740, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : TradeAssistantActivity.f92644a0;
        }

        public final int c() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44739, new Class[0], Integer.TYPE);
            return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : TradeAssistantActivity.Z;
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class b extends com.max.hbcommon.network.d<Result<TradeAssistantResult>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44743, new Class[0], Void.TYPE).isSupported && TradeAssistantActivity.this.isActive()) {
                SmartRefreshLayout smartRefreshLayout = TradeAssistantActivity.this.L;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeAssistantActivity.this.L;
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
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44742, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            if (TradeAssistantActivity.this.isActive()) {
                super.onError(e10);
                TradeAssistantActivity.e2(TradeAssistantActivity.this);
                SmartRefreshLayout smartRefreshLayout = TradeAssistantActivity.this.L;
                SmartRefreshLayout smartRefreshLayout2 = null;
                if (smartRefreshLayout == null) {
                    f0.S("mRefreshLayout");
                    smartRefreshLayout = null;
                }
                smartRefreshLayout.A(0);
                SmartRefreshLayout smartRefreshLayout3 = TradeAssistantActivity.this.L;
                if (smartRefreshLayout3 == null) {
                    f0.S("mRefreshLayout");
                } else {
                    smartRefreshLayout2 = smartRefreshLayout3;
                }
                smartRefreshLayout2.p(0);
            }
        }

        public void onNext(@dl.d Result<TradeAssistantResult> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44744, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            if (TradeAssistantActivity.this.isActive()) {
                TradeAssistantActivity.this.P = result.getResult();
                TradeAssistantActivity.this.x2();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44745, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeAssistantResult>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class c extends com.max.hbcommon.network.d<Result<TradeTipsStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        public void onNext(@dl.d Result<TradeTipsStateObj> tipsStateObjResult) {
            if (PatchProxy.proxy(new Object[]{tipsStateObjResult}, this, changeQuickRedirect, false, 44746, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(tipsStateObjResult, "tipsStateObjResult");
            TradeAssistantActivity.h2(TradeAssistantActivity.this, tipsStateObjResult.getResult());
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44747, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<TradeTipsStateObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class d implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 44750, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(it, "it");
            TradeAssistantActivity.W1(TradeAssistantActivity.this);
            TradeAssistantActivity.N1(TradeAssistantActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class e extends s<TradeOfferObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeAssistantActivity.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeAssistantActivity f92649b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeOfferObj f92650c;

            a(TradeAssistantActivity tradeAssistantActivity, TradeOfferObj tradeOfferObj) {
                this.f92649b = tradeAssistantActivity;
                this.f92650c = tradeOfferObj;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44753, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                TradeAssistantActivity.Z1(this.f92649b, this.f92650c);
            }
        }

        /* JADX INFO: compiled from: TradeAssistantActivity.kt */
        public static final class b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ TradeOfferObj f92651b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TradeAssistantActivity f92652c;

            b(TradeOfferObj tradeOfferObj, TradeAssistantActivity tradeAssistantActivity) {
                this.f92651b = tradeOfferObj;
                this.f92652c = tradeAssistantActivity;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44754, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                com.max.xiaoheihe.module.trade.f.a aVar = com.max.xiaoheihe.module.trade.f.C;
                String toid = this.f92651b.getToid();
                f0.m(toid);
                String type = this.f92651b.getType();
                f0.m(type);
                String count = this.f92651b.getCount();
                f0.m(count);
                aVar.a(toid, type, count).show(this.f92652c.getSupportFragmentManager(), "tag_detail_fragment");
            }
        }

        e(Activity activity, List<TradeOfferObj> list) {
            super(activity, list, R.layout.item_trade_offer);
        }

        public void m(@dl.d s.e viewHolder, @dl.d TradeOfferObj data) {
            b2 b2Var;
            if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 44751, new Class[]{s.e.class, TradeOfferObj.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_special);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_rarity_tag);
            ImageView imageView3 = (ImageView) viewHolder.i(R.id.iv_item_img);
            TextView textView = (TextView) viewHolder.i(R.id.tv_name);
            ImageView imageView4 = (ImageView) viewHolder.i(R.id.iv_steam);
            View viewI = viewHolder.i(R.id.tv_count);
            View viewI2 = viewHolder.i(R.id.vg_btn);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_btn);
            ImageView imageView5 = (ImageView) viewHolder.i(R.id.iv_btn);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_join_time);
            Integer special = data.getSpecial();
            if (special != null && special.intValue() == 1) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.item_special_st);
            } else if (special != null && special.intValue() == 2) {
                imageView.setVisibility(0);
                imageView.setImageResource(R.drawable.item_special_souvenir);
            } else {
                imageView.setVisibility(8);
            }
            int iW = ViewUtils.W(imageView2);
            imageView2.setBackgroundDrawable(ViewUtils.D(iW, iW, 1, com.max.xiaoheihe.utils.d.e1(data.getRarity_color())));
            com.max.hbimage.b.L(data.getImg_url(), imageView3, R.drawable.item_trade_placeholder);
            textView.setText(data.getName());
            String count = data.getCount();
            if (count != null) {
                ((TextView) viewI).setText('x' + count);
                b2Var = b2.f124493a;
            } else {
                b2Var = null;
            }
            if (b2Var == null) {
                ((TextView) viewI).setText("x1");
            }
            if (TradeAssistantActivity.X.b().equals(data.getType())) {
                imageView4.setVisibility(8);
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
                textView2.setText("收货");
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                imageView5.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                viewI2.setBackgroundResource(R.drawable.text_primary_border_2dp);
            } else {
                imageView4.setVisibility(0);
                textView3.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color));
                textView2.setText("发货");
                textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.white));
                imageView5.setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.white));
                viewI2.setBackgroundResource(R.drawable.text_primary_2dp);
            }
            textView3.setText(data.getDesc());
            viewI2.setOnClickListener(new a(TradeAssistantActivity.this, data));
            viewHolder.itemView.setOnClickListener(new b(data, TradeAssistantActivity.this));
        }

        @Override // com.max.hbcommon.base.adapter.s
        public /* bridge */ /* synthetic */ void onBindViewHolder(s.e eVar, TradeOfferObj tradeOfferObj) {
            if (PatchProxy.proxy(new Object[]{eVar, tradeOfferObj}, this, changeQuickRedirect, false, 44752, new Class[]{s.e.class, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            m(eVar, tradeOfferObj);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44755, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradeAssistantActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131083z3);
            intent.putExtra("title", "帮助");
            ((BaseActivity) TradeAssistantActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TradeOfferObj f92655c;

        g(TradeOfferObj tradeOfferObj) {
            this.f92655c = tradeOfferObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44761, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeAssistantActivity tradeAssistantActivity = TradeAssistantActivity.this;
            String toid = this.f92655c.getToid();
            f0.m(toid);
            TradeAssistantActivity.f2(tradeAssistantActivity, toid);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class h implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final h f92656b = new h();
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44762, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f92659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<List<String>> f92660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ EditText f92661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ EditText f92662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ TradeAssistantActivity f92663f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ TradeOfferObj f92664g;

        i(EditText editText, Ref.ObjectRef<List<String>> objectRef, EditText editText2, EditText editText3, TradeAssistantActivity tradeAssistantActivity, TradeOfferObj tradeOfferObj) {
            this.f92659b = editText;
            this.f92660c = objectRef;
            this.f92661d = editText2;
            this.f92662e = editText3;
            this.f92663f = tradeAssistantActivity;
            this.f92664g = tradeOfferObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44763, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            if (n.q(this.f92659b.getText().toString()) != Integer.parseInt(this.f92660c.f124891b.get(0)) || n.q(this.f92661d.getText().toString()) != Integer.parseInt(this.f92660c.f124891b.get(1)) || n.q(this.f92662e.getText().toString()) != Integer.parseInt(this.f92660c.f124891b.get(2))) {
                com.max.hbutils.utils.c.f("填写错误，请回到报价助手页面内确认注册时间");
                return;
            }
            com.max.hbcache.c.z("trade_offer_confirm_" + com.max.xiaoheihe.utils.d.x0(), "1");
            TradeAssistantActivity.X1(this.f92663f, this.f92664g);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 44764, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) TradeAssistantActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.A3);
            intent.putExtra("title", "防骗指南");
            ((BaseActivity) TradeAssistantActivity.this).f66601b.startActivity(intent);
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 44765, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeAssistantActivity.this.n1();
        }
    }

    /* JADX INFO: compiled from: TradeAssistantActivity.kt */
    public static final class l extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92668c;

        l(String str) {
            this.f92668c = str;
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44766, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            TradeAssistantActivity.r2(TradeAssistantActivity.this, this.f92668c, 0, 2, null);
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44767, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    private final void A2(TradeTipsStateObj tradeTipsStateObj) {
        if (PatchProxy.proxy(new Object[]{tradeTipsStateObj}, this, changeQuickRedirect, false, 44722, new Class[]{TradeTipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (tradeTipsStateObj != null) {
            com.max.hbcache.c.C("trade_msg_tap_time", tradeTipsStateObj.getMessage_time());
            com.max.hbcache.c.C("trade_bot_tap_time", tradeTipsStateObj.getBot_time());
        }
        this.f66601b.sendBroadcast(new Intent(lb.a.N));
    }

    public static final /* synthetic */ void M1(TradeAssistantActivity tradeAssistantActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity, str}, null, changeQuickRedirect, true, 44732, new Class[]{TradeAssistantActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.i2(str);
    }

    public static final /* synthetic */ void N1(TradeAssistantActivity tradeAssistantActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity}, null, changeQuickRedirect, true, 44730, new Class[]{TradeAssistantActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.j2();
    }

    public static final /* synthetic */ void W1(TradeAssistantActivity tradeAssistantActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity}, null, changeQuickRedirect, true, 44729, new Class[]{TradeAssistantActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.k2();
    }

    public static final /* synthetic */ void X1(TradeAssistantActivity tradeAssistantActivity, TradeOfferObj tradeOfferObj) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity, tradeOfferObj}, null, changeQuickRedirect, true, 44733, new Class[]{TradeAssistantActivity.class, TradeOfferObj.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.l2(tradeOfferObj);
    }

    public static final /* synthetic */ void Y1(TradeAssistantActivity tradeAssistantActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity}, null, changeQuickRedirect, true, 44737, new Class[]{TradeAssistantActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.m2();
    }

    public static final /* synthetic */ void Z1(TradeAssistantActivity tradeAssistantActivity, TradeOfferObj tradeOfferObj) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity, tradeOfferObj}, null, changeQuickRedirect, true, 44731, new Class[]{TradeAssistantActivity.class, TradeOfferObj.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.o2(tradeOfferObj);
    }

    public static final /* synthetic */ void a2(TradeAssistantActivity tradeAssistantActivity, String str, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity, str, new Integer(i10)}, null, changeQuickRedirect, true, 44738, new Class[]{TradeAssistantActivity.class, String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.q2(str, i10);
    }

    public static final /* synthetic */ void e2(TradeAssistantActivity tradeAssistantActivity) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity}, null, changeQuickRedirect, true, 44734, new Class[]{TradeAssistantActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.C1();
    }

    public static final /* synthetic */ void f2(TradeAssistantActivity tradeAssistantActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity, str}, null, changeQuickRedirect, true, 44736, new Class[]{TradeAssistantActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.z2(str);
    }

    public static final /* synthetic */ void h2(TradeAssistantActivity tradeAssistantActivity, TradeTipsStateObj tradeTipsStateObj) {
        if (PatchProxy.proxy(new Object[]{tradeAssistantActivity, tradeTipsStateObj}, null, changeQuickRedirect, true, 44735, new Class[]{TradeAssistantActivity.class, TradeTipsStateObj.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeAssistantActivity.A2(tradeTipsStateObj);
    }

    private final void i2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44715, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        CookieManager cookieManager = CookieManager.getInstance();
        cookieManager.setAcceptCookie(true);
        String cookie = cookieManager.getCookie(str);
        TradeAssistantResult tradeAssistantResult = this.P;
        String steam_id = tradeAssistantResult != null ? tradeAssistantResult.getSteam_id() : null;
        if ((steam_id == null || steam_id.length() == 0) || cookie == null || !StringsKt__StringsKt.W2(cookie, "steamMachineAuth", false, 2, null)) {
            return;
        }
        TradeAssistantResult tradeAssistantResult2 = this.P;
        f0.m(tradeAssistantResult2);
        String steam_id2 = tradeAssistantResult2.getSteam_id();
        f0.m(steam_id2);
        if (StringsKt__StringsKt.W2(cookie, steam_id2, false, 2, null)) {
            return;
        }
        com.max.xiaoheihe.utils.d.k(this.f66601b, str);
    }

    private final void j2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44716, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O3().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b()));
    }

    private final void k2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44721, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().l1().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c()));
    }

    private final void l2(final TradeOfferObj tradeOfferObj) {
        if (PatchProxy.proxy(new Object[]{tradeOfferObj}, this, changeQuickRedirect, false, 44713, new Class[]{TradeOfferObj.class}, Void.TYPE).isSupported) {
            return;
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        TradeInfoUtilKt.b0(mContext, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeAssistantActivity$handleOffer$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44749, new Class[0], Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2();
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44748, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                TradeAssistantActivity.M1(this.f92657b, tradeOfferObj.getTrade_url());
                TradeHandleOfferActivity.a aVar = TradeHandleOfferActivity.P;
                Activity activity = ((BaseActivity) this.f92657b).f66601b;
                String trade_url = tradeOfferObj.getTrade_url();
                f0.m(trade_url);
                TradeAssistantActivity.a aVar2 = TradeAssistantActivity.X;
                Intent intentA = aVar.a(activity, trade_url, f0.g(aVar2.b(), tradeOfferObj.getType()) ? null : tradeOfferObj.getCreate_time());
                String toid = tradeOfferObj.getToid();
                if (toid != null) {
                    TradeAssistantActivity tradeAssistantActivity = this.f92657b;
                    TradeOfferObj tradeOfferObj2 = tradeOfferObj;
                    tradeAssistantActivity.V = tradeOfferObj2;
                    if (!f0.g(aVar2.b(), tradeOfferObj2.getType()) && !tradeAssistantActivity.W.contains(toid)) {
                        tradeAssistantActivity.W.add(toid);
                    }
                }
                ((BaseActivity) this.f92657b).f66601b.startActivityForResult(intentA, aVar2.c());
            }
        }, 14, null);
    }

    private final void m2() {
        LoadingDialog loadingDialog;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44726, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing() || (loadingDialog = this.U) == null) {
            return;
        }
        f0.m(loadingDialog);
        loadingDialog.c();
    }

    private final void n2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44710, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        SmartRefreshLayout smartRefreshLayout = this.L;
        s<TradeOfferObj> sVar = null;
        if (smartRefreshLayout == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout = null;
        }
        smartRefreshLayout.S(new d());
        SmartRefreshLayout smartRefreshLayout2 = this.L;
        if (smartRefreshLayout2 == null) {
            f0.S("mRefreshLayout");
            smartRefreshLayout2 = null;
        }
        smartRefreshLayout2.b0(false);
        RecyclerView recyclerView = this.O;
        if (recyclerView == null) {
            f0.S("mRecyclerView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f66601b));
        RecyclerView recyclerView2 = this.O;
        if (recyclerView2 == null) {
            f0.S("mRecyclerView");
            recyclerView2 = null;
        }
        recyclerView2.setBackgroundResource(R.color.background_layer_2_color);
        this.S = new e(this.f66601b, this.Q);
        RecyclerView recyclerView3 = this.O;
        if (recyclerView3 == null) {
            f0.S("mRecyclerView");
            recyclerView3 = null;
        }
        s<TradeOfferObj> sVar2 = this.S;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        recyclerView3.setAdapter(sVar);
    }

    private final void o2(TradeOfferObj tradeOfferObj) {
        boolean z10 = true;
        if (PatchProxy.proxy(new Object[]{tradeOfferObj}, this, changeQuickRedirect, false, 44712, new Class[]{TradeOfferObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String create_time = tradeOfferObj.getCreate_time();
        if (create_time != null && create_time.length() != 0) {
            z10 = false;
        }
        if (z10 || f0.g(f92644a0, tradeOfferObj.getType())) {
            l2(tradeOfferObj);
        } else {
            v2(tradeOfferObj);
        }
    }

    private final void q2(final String str, final int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 44727, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        long j10 = i10 > 0 ? 2L : 0L;
        showLoadingDialog();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().L3(str).C1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<TradeOfferStateObj>>() { // from class: com.max.xiaoheihe.module.trade.TradeAssistantActivity$queryOrderTo$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 44756, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f92669b.isActive()) {
                    TradeAssistantActivity.Y1(this.f92669b);
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<TradeOfferStateObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 44757, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f92669b.isActive()) {
                    if (f0.g(result.getResult().getState(), ITagManager.SUCCESS)) {
                        com.max.hbutils.utils.c.d("报价处理成功");
                        TradeAssistantActivity.Y1(this.f92669b);
                        SmartRefreshLayout smartRefreshLayout = this.f92669b.L;
                        if (smartRefreshLayout == null) {
                            f0.S("mRefreshLayout");
                            smartRefreshLayout = null;
                        }
                        smartRefreshLayout.F();
                        return;
                    }
                    if (!f0.g(result.getResult().getState(), "waiting")) {
                        Activity mContext = ((BaseActivity) this.f92669b).f66601b;
                        f0.o(mContext, "mContext");
                        TradeInfoUtilKt.q(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeAssistantActivity$queryOrderTo$1$onNext$2
                            public static ChangeQuickRedirect changeQuickRedirect;

                            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                            @Override // yh.a
                            public /* bridge */ /* synthetic */ b2 invoke() {
                                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44760, new Class[0], Object.class);
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
                        TradeAssistantActivity.Y1(this.f92669b);
                        return;
                    }
                    int i11 = i10;
                    if (i11 < 5) {
                        TradeAssistantActivity.a2(this.f92669b, str, i11 + 1);
                        return;
                    }
                    Activity mContext2 = ((BaseActivity) this.f92669b).f66601b;
                    f0.o(mContext2, "mContext");
                    TradeInfoUtilKt.q(mContext2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeAssistantActivity$queryOrderTo$1$onNext$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44759, new Class[0], Object.class);
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
                    TradeAssistantActivity.Y1(this.f92669b);
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 44758, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<TradeOfferStateObj>) obj);
            }
        }));
    }

    static /* synthetic */ void r2(TradeAssistantActivity tradeAssistantActivity, String str, int i10, int i11, Object obj) {
        Object[] objArr = {tradeAssistantActivity, str, new Integer(i10), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 44728, new Class[]{TradeAssistantActivity.class, String.class, cls, cls, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        tradeAssistantActivity.q2(str, i10);
    }

    private final void showLoadingDialog() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44725, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        LoadingDialog loadingDialog = this.U;
        if (loadingDialog != null) {
            f0.m(loadingDialog);
            if (loadingDialog.i()) {
                return;
            }
        }
        Activity mContext = this.f66601b;
        f0.o(mContext, "mContext");
        this.U = new LoadingDialog(mContext, "检测发货状态...", false).r();
    }

    private final void u2(TradeOfferObj tradeOfferObj) {
        if (PatchProxy.proxy(new Object[]{tradeOfferObj}, this, changeQuickRedirect, false, 44723, new Class[]{TradeOfferObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.T;
        if (aVar != null) {
            f0.m(aVar);
            if (aVar.isShowing()) {
                return;
            }
        }
        String str = f92644a0;
        this.T = new com.max.hbcommon.view.a.f(this.f66601b).l("检测报价状态").u(f0.g(str, tradeOfferObj.getType()) ? "已回应" : "已发货", new g(tradeOfferObj)).o(f0.g(str, tradeOfferObj.getType()) ? "未回应" : "未发货", h.f92656b).F();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void v2(TradeOfferObj tradeOfferObj) {
        if (PatchProxy.proxy(new Object[]{tradeOfferObj}, this, changeQuickRedirect, false, 44714, new Class[]{TradeOfferObj.class}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        if ("1".equals(com.max.hbcache.c.j("trade_offer_confirm_" + com.max.xiaoheihe.utils.d.x0()))) {
            l2(tradeOfferObj);
            return;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.dialog_trade_offer_confirm, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        EditText editText = (EditText) viewInflate.findViewById(R.id.tv_year_desc);
        EditText editText2 = (EditText) viewInflate.findViewById(R.id.tv_month_desc);
        EditText editText3 = (EditText) viewInflate.findViewById(R.id.tv_day_desc);
        bb.d.d(editText, 5);
        bb.d.d(editText2, 5);
        bb.d.d(editText3, 5);
        editText.setBackgroundDrawable(q.O(q.o(this.f66601b, R.color.white, 0.0f), this.f66601b, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color), 0.5f));
        editText2.setBackgroundDrawable(q.O(q.o(this.f66601b, R.color.white, 0.0f), this.f66601b, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color), 0.5f));
        editText3.setBackgroundDrawable(q.O(q.o(this.f66601b, R.color.white, 0.0f), this.f66601b, com.max.xiaoheihe.utils.d.E(R.color.divider_secondary_1_color), 0.5f));
        textView.setText("填写买家加入Steam时间");
        textView2.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
        textView2.setText("请在Steam报价页面内仔细核对加入时间\n (请勿直接从Steam上处理，谨防被骗)");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        String strI = w.i(tradeOfferObj.getCreate_time(), "yyyy-MM-dd");
        T tU4 = strI != null ? StringsKt__StringsKt.U4(strI, new String[]{Constants.ACCEPT_TIME_SEPARATOR_SERVER}, false, 0, 6, null) : 0;
        f0.m(tU4);
        objectRef.f124891b = tU4;
        com.max.hbcommon.view.a.f fVarI = new com.max.hbcommon.view.a.f(this.f66601b).i(viewInflate);
        fVarI.u("确定", new i(editText, objectRef, editText2, editText3, this, tradeOfferObj));
        fVarI.o("防骗指南", new j());
        fVarI.F();
    }

    private final void y2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44719, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        View view = this.R;
        View view2 = null;
        if (view == null) {
            f0.S("vg_invntory_empty");
            view = null;
        }
        view.setVisibility(0);
        View view3 = this.R;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        View viewFindViewById = view3.findViewById(R.id.iv_empty);
        f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) viewFindViewById;
        View view4 = this.R;
        if (view4 == null) {
            f0.S("vg_invntory_empty");
            view4 = null;
        }
        View viewFindViewById2 = view4.findViewById(R.id.tv_empty);
        f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        imageView.setImageResource(R.drawable.common_tag_common_45x45);
        ((TextView) viewFindViewById2).setText("暂无待处理报价");
        View view5 = this.R;
        if (view5 == null) {
            f0.S("vg_invntory_empty");
        } else {
            view2 = view5;
        }
        view2.setOnClickListener(new k());
    }

    private final void z2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 44724, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l(str)));
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44709, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_assistant);
        this.f66616q.setTitle("报价助手");
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new f());
        View viewFindViewById = findViewById(R.id.srl);
        f0.o(viewFindViewById, "findViewById(R.id.srl)");
        this.L = (SmartRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rv);
        f0.o(viewFindViewById2, "findViewById(R.id.rv)");
        this.O = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.vg_invntory_empty);
        f0.o(viewFindViewById3, "findViewById(R.id.vg_invntory_empty)");
        this.R = viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_message);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_message)");
        this.M = (MarqueeTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.vg_message);
        f0.o(viewFindViewById5, "findViewById(R.id.vg_message)");
        this.N = viewFindViewById5;
        n2();
        E1();
        j2();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44717, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        j2();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 44720, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        if (i10 == Z) {
            k2();
            TradeOfferObj tradeOfferObj = this.V;
            if (tradeOfferObj != null) {
                u2(tradeOfferObj);
            }
        }
    }

    public final void p2(@dl.d String toid) {
        if (PatchProxy.proxy(new Object[]{toid}, this, changeQuickRedirect, false, 44711, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(toid, "toid");
        for (TradeOfferObj tradeOfferObj : this.Q) {
            if (f0.g(toid, tradeOfferObj.getToid())) {
                o2(tradeOfferObj);
                return;
            }
        }
    }

    public final void x2() {
        List<TradeOfferObj> list;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 44718, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        x1();
        TradeAssistantResult tradeAssistantResult = this.P;
        s<TradeOfferObj> sVar = null;
        String message = tradeAssistantResult != null ? tradeAssistantResult.getMessage() : null;
        if (message == null || message.length() == 0) {
            View view = this.N;
            if (view == null) {
                f0.S("vg_message");
                view = null;
            }
            view.setVisibility(8);
        } else {
            View view2 = this.N;
            if (view2 == null) {
                f0.S("vg_message");
                view2 = null;
            }
            view2.setVisibility(0);
            MarqueeTextView marqueeTextView = this.M;
            if (marqueeTextView == null) {
                f0.S("tv_message");
                marqueeTextView = null;
            }
            TradeAssistantResult tradeAssistantResult2 = this.P;
            marqueeTextView.setText(tradeAssistantResult2 != null ? tradeAssistantResult2.getMessage() : null);
        }
        this.Q.clear();
        TradeAssistantResult tradeAssistantResult3 = this.P;
        if (tradeAssistantResult3 != null && (list = tradeAssistantResult3.getList()) != null) {
            this.Q.addAll(list);
        }
        List<TradeOfferObj> list2 = this.Q;
        if (list2 == null || list2.isEmpty()) {
            y2();
            return;
        }
        View view3 = this.R;
        if (view3 == null) {
            f0.S("vg_invntory_empty");
            view3 = null;
        }
        view3.setVisibility(8);
        s<TradeOfferObj> sVar2 = this.S;
        if (sVar2 == null) {
            f0.S("mAdapter");
        } else {
            sVar = sVar2;
        }
        sVar.notifyDataSetChanged();
    }
}
