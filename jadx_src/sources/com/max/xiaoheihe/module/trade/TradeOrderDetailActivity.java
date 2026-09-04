package com.max.xiaoheihe.module.trade;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.max.hbcommon.activity.GameStoreAgreementActivity;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallDiscountParamsObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.trade.TradeOfferStateObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareAPI;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class TradeOrderDetailActivity extends BaseActivity implements PaymentManager.g {
    private static final int G2 = 1;
    private static final int G3 = 3;

    @dl.d
    private static final String J3 = "final_cost_coin";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f93028p3 = 2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    @dl.d
    private static final String f93030y2 = "order_id";

    @dl.e
    private String L;

    @dl.e
    private MallOrderDetailObj M;

    @dl.e
    private MallPriceObj N;

    @dl.e
    private String O;
    private boolean P;
    private boolean Q;
    private int S;

    @dl.e
    private RefreshBroadcastReceiver U;

    @dl.e
    private PaymentManager V;

    @dl.e
    private ProgressDialog W;

    @dl.e
    private String Y;

    @dl.e
    private String Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @dl.e
    private com.max.hbcommon.view.a f93031a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private boolean f93032b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private boolean f93033c0;

    @BindView(R.id.cv_bundles)
    public View mBundlesView;

    @BindView(R.id.tv_cat_desc)
    public TextView mCatDescTextView;

    @BindView(R.id.tv_cat_title)
    public TextView mCatTitleTextView;

    @BindView(R.id.tv_confirm_price)
    public TextView mConfirmPriceTextView;

    @BindView(R.id.tv_confirm)
    public TextView mConfirmTextView;

    @BindView(R.id.vg_confirm)
    public View mConfirmView;

    @BindView(R.id.tv_create_time_desc)
    public TextView mCreateTimeDescTextView;

    @BindView(R.id.tv_create_time)
    public TextView mCreateTimeTextView;

    @BindView(R.id.ll_discount_info)
    public LinearLayout mDiscountInfoLinearLayout;

    @BindView(R.id.iv_dismiss_message)
    public ImageView mDismissMessageImageView;

    @BindView(R.id.vg_item_preview)
    public View mItemView;

    @BindView(R.id.tv_message)
    public MarqueeTextView mMessageMarqueeTextView;

    @BindView(R.id.vg_message)
    public View mMessageView;

    @BindView(R.id.tv_order_id_copy)
    public TextView mOrderIdCopyTextView;

    @BindView(R.id.tv_order_id_desc)
    public TextView mOrderIdDescTextView;

    @BindView(R.id.tv_order_id)
    public TextView mOrderIdTextView;

    @BindView(R.id.tv_package_name_desc)
    public TextView mPackageNameDescTextView;

    @BindView(R.id.tv_package_name)
    public TextView mPackageNameTextView;

    @BindView(R.id.vg_progress)
    public View mProgressView;

    @BindView(R.id.srl)
    public SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.tv_tips_desc)
    public TextView mTipsDescTextView;

    @BindView(R.id.tv_tips_title)
    public TextView mTipsTitleTextView;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @dl.e
    private MallPayInfoObj f93034p1;

    @BindView(R.id.tv_trade_order_offer_tips)
    public TextView tv_trade_order_offer_tips;

    @BindView(R.id.tv_mall_agreement)
    public View vg_mall_agreement;

    @BindView(R.id.vg_root)
    public ViewGroup vg_root;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    @dl.e
    private CountDownTimer f93035x1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @dl.d
    public static final a f93027p2 = new a(null);

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f93029x2 = 8;

    @dl.d
    private static final long[] K3 = {1000, 1000, 1000, 2000, 2000, 2000};

    @dl.d
    private String R = "mall_agreement";

    @dl.d
    private final b T = new b(this);
    private final int X = 1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    @dl.d
    private final io.reactivex.disposables.a f93036y1 = new io.reactivex.disposables.a();

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public final class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        public RefreshBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@dl.d Context context, @dl.d Intent intent) {
            if (PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 45574, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(intent, "intent");
            if (kotlin.jvm.internal.f0.g(lb.a.A, intent.getAction())) {
                TradeOrderDetailActivity.this.n1();
            }
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public enum TYPE_CODE {
        FINISH,
        WAITING_FOR_PAY,
        TO_RES_OFFER,
        REMIND,
        CHECK_OFFER,
        PURCHASE_SUPPLY;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static TYPE_CODE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 45576, new Class[]{String.class}, TYPE_CODE.class);
            return (TYPE_CODE) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(TYPE_CODE.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TYPE_CODE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 45575, new Class[0], TYPE_CODE[].class);
            return (TYPE_CODE[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Intent a(@dl.e Context context, @dl.e String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 45572, new Class[]{Context.class, String.class}, Intent.class);
            if (patchProxyResultProxy.isSupported) {
                return (Intent) patchProxyResultProxy.result;
            }
            Intent intent = new Intent(context, (Class<?>) TradeOrderDetailActivity.class);
            intent.putExtra("order_id", str);
            return intent;
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class a0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a0 f93038b = new a0();
        public static ChangeQuickRedirect changeQuickRedirect;

        a0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45633, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class b extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final WeakReference<TradeOrderDetailActivity> f93039a;

        public b(@dl.d TradeOrderDetailActivity activity) {
            kotlin.jvm.internal.f0.p(activity, "activity");
            this.f93039a = new WeakReference<>(activity);
        }

        @Override // android.os.Handler
        public void handleMessage(@dl.d Message msg) {
            if (PatchProxy.proxy(new Object[]{msg}, this, changeQuickRedirect, false, 45573, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(msg, "msg");
            super.handleMessage(msg);
            TradeOrderDetailActivity tradeOrderDetailActivity = this.f93039a.get();
            if (tradeOrderDetailActivity != null) {
                tradeOrderDetailActivity.H2();
            }
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class b0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45634, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
            TradeOrderDetailActivity.j2(tradeOrderDetailActivity, tradeOrderDetailActivity.Y, TradeOrderDetailActivity.this.Z, "1", 1, false);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f93041a;

        static {
            int[] iArr = new int[TYPE_CODE.valuesCustom().length];
            try {
                iArr[TYPE_CODE.WAITING_FOR_PAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TYPE_CODE.TO_RES_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TYPE_CODE.REMIND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TYPE_CODE.CHECK_OFFER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TYPE_CODE.PURCHASE_SUPPLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f93041a = iArr;
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class c0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45635, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            TradeOrderDetailActivity.this.Y = null;
            TradeOrderDetailActivity.this.Z = null;
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class d extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45577, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(@dl.d Result<?> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45578, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext((Result) result);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131050u0);
                ((BaseActivity) TradeOrderDetailActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45579, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<?>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ MallPayInfoObj f93045c;

        d0(MallPayInfoObj mallPayInfoObj) {
            this.f93045c = mallPayInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45636, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
            tradeOrderDetailActivity.startActivity(GameStoreAgreementActivity.O1(((BaseActivity) tradeOrderDetailActivity).f66601b, this.f93045c.getAgreement_title(), this.f93045c.getService_agreement(), false));
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class e extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45580, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<MallPayInfoObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45581, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
                MallPayInfoObj result2 = result.getResult();
                if (kotlin.jvm.internal.f0.g(result2 != null ? result2.getHas_bind_steam() : null, "0")) {
                    Activity mContext = ((BaseActivity) TradeOrderDetailActivity.this).f66601b;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    TradeInfoUtilKt.L(mContext);
                    return;
                }
                TradeOrderDetailActivity.this.f93034p1 = result.getResult();
                if (TradeOrderDetailActivity.this.f93034p1 == null) {
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c.f(TradeOrderDetailActivity.this.getString(R.string.fail));
                        return;
                    } else {
                        com.max.hbutils.utils.c.f(result.getMsg());
                        return;
                    }
                }
                TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
                MallPayInfoObj mallPayInfoObj = tradeOrderDetailActivity.f93034p1;
                kotlin.jvm.internal.f0.m(mallPayInfoObj);
                if (TradeOrderDetailActivity.N1(tradeOrderDetailActivity, mallPayInfoObj)) {
                    TradeOrderDetailActivity.Q1(TradeOrderDetailActivity.this);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45582, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class e0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45637, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity.i2(TradeOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class f extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45583, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<MallOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45584, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
                TradeOrderDetailActivity.this.M = result.getResult();
                TradeOrderDetailActivity.D3(TradeOrderDetailActivity.this, false, 1, null);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45585, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class f0 implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f0 f93049b = new f0();
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45638, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class g extends com.max.hbcommon.network.d<Result<MallPriceObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45586, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<MallPriceObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45587, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
                TradeOrderDetailActivity.this.N = result.getResult();
                if (TradeOrderDetailActivity.this.N != null) {
                    MallPriceObj mallPriceObj = TradeOrderDetailActivity.this.N;
                    kotlin.jvm.internal.f0.m(mallPriceObj);
                    if (!com.max.hbcommon.utils.c.u(mallPriceObj.getPay_price())) {
                        TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
                        MallPriceObj mallPriceObj2 = tradeOrderDetailActivity.N;
                        kotlin.jvm.internal.f0.m(mallPriceObj2);
                        tradeOrderDetailActivity.O = mallPriceObj2.getPay_price();
                    }
                }
                TradeOrderDetailActivity.k2(TradeOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45588, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPriceObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class g0 implements com.max.xiaoheihe.module.mall.o.g0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallPayInfoObj f93052b;

        g0(MallPayInfoObj mallPayInfoObj) {
            this.f93052b = mallPayInfoObj;
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        @dl.d
        public String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45641, new Class[0], String.class);
            if (patchProxyResultProxy.isSupported) {
                return (String) patchProxyResultProxy.result;
            }
            String str = TradeOrderDetailActivity.this.L;
            kotlin.jvm.internal.f0.m(str);
            return str;
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public void b(@dl.d String paytype) {
            if (PatchProxy.proxy(new Object[]{paytype}, this, changeQuickRedirect, false, 45640, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(paytype, "paytype");
            if (kotlin.jvm.internal.f0.g(PaymentManager.A, paytype)) {
                TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
                String pay_price = this.f93052b.getPay_price();
                kotlin.jvm.internal.f0.o(pay_price, "payInfoObj.pay_price");
                TradeOrderDetailActivity.R1(tradeOrderDetailActivity, pay_price);
                return;
            }
            if (!kotlin.jvm.internal.f0.g(PaymentManager.f71427z, TradeOrderDetailActivity.this.Z)) {
                TradeOrderDetailActivity tradeOrderDetailActivity2 = TradeOrderDetailActivity.this;
                PaymentManager paymentManager = tradeOrderDetailActivity2.V;
                kotlin.jvm.internal.f0.m(paymentManager);
                tradeOrderDetailActivity2.W = paymentManager.M(1, this.f93052b.getPay_price());
                return;
            }
            if (com.max.hbutils.utils.n.r(this.f93052b.getTotal_hbalance()) < com.max.hbutils.utils.n.r(this.f93052b.getPay_price()) / ((long) 10)) {
                String strValueOf = String.valueOf(((int) Math.ceil(((com.max.hbutils.utils.n.r(this.f93052b.getPay_price()) / 10.0d) - com.max.hbutils.utils.n.r(this.f93052b.getTotal_hbalance())) / 100.0d)) * 100);
                TradeOrderDetailActivity tradeOrderDetailActivity3 = TradeOrderDetailActivity.this;
                PaymentManager paymentManager2 = tradeOrderDetailActivity3.V;
                kotlin.jvm.internal.f0.m(paymentManager2);
                tradeOrderDetailActivity3.W = paymentManager2.M(2, strValueOf);
            }
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public void c(@dl.d String paytype) {
            if (PatchProxy.proxy(new Object[]{paytype}, this, changeQuickRedirect, false, 45639, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(paytype, "paytype");
            TradeOrderDetailActivity.this.Z = paytype;
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class h extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45589, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<PayOrderObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45590, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                TradeOrderDetailActivity.i2(TradeOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45591, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class h0 extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45642, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45643, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                TradeOrderDetailActivity.c2(TradeOrderDetailActivity.this, 0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45644, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class i extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f93062c;

        i(boolean z10) {
            this.f93062c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45604, new Class[0], Void.TYPE).isSupported && TradeOrderDetailActivity.this.isActive()) {
                super.onComplete();
                SmartRefreshLayout smartRefreshLayoutQ3 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ3);
                smartRefreshLayoutQ3.A(0);
                SmartRefreshLayout smartRefreshLayoutQ4 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ4);
                smartRefreshLayoutQ4.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45603, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                TradeOrderDetailActivity.y2(TradeOrderDetailActivity.this);
                SmartRefreshLayout smartRefreshLayoutQ3 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ3);
                smartRefreshLayoutQ3.A(0);
                SmartRefreshLayout smartRefreshLayoutQ4 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ4);
                smartRefreshLayoutQ4.p(0);
            }
        }

        public void onNext(@dl.d Result<MallOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45605, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                TradeOrderDetailActivity.this.M = result.getResult();
                TradeOrderDetailActivity.h2(TradeOrderDetailActivity.this, this.f93062c);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45606, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class i0 extends com.max.hbcommon.network.d<Result<Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f93064b = new a();
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45648, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
            }
        }

        i0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45645, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
            }
        }

        public void onNext(@dl.d Result<Object> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45646, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) TradeOrderDetailActivity.this).f66601b);
                String msg = result.getMsg();
                kotlin.jvm.internal.f0.o(msg, "result.msg");
                fVar.l(msg.length() > 0 ? "卖家已收到您的催促，会尽快发货，请耐心等待" : result.getMsg()).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), a.f93064b).g(false);
                fVar.F();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45647, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<Object>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class j implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // pg.d
        public final void k(@dl.d ng.j it) {
            if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, 45607, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(it, "it");
            TradeOrderDetailActivity.this.S = 0;
            TradeOrderDetailActivity.A2(TradeOrderDetailActivity.this);
            TradeOrderDetailActivity.w3(TradeOrderDetailActivity.this, false, 1, null);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45608, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            View viewG3 = TradeOrderDetailActivity.this.g3();
            kotlin.jvm.internal.f0.m(viewG3);
            viewG3.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45609, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
            Activity activity = ((BaseActivity) tradeOrderDetailActivity).f66601b;
            MallOrderDetailObj mallOrderDetailObj = TradeOrderDetailActivity.this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj);
            tradeOrderDetailActivity.startActivity(GameStoreAgreementActivity.O1(activity, "饰品交易用户协议", mallOrderDetailObj.getService_agreement(), false));
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class m extends CountDownTimer {
        public static ChangeQuickRedirect changeQuickRedirect;

        m(long j10) {
            super(j10, 1000L);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45611, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TextView textViewS3 = TradeOrderDetailActivity.this.s3();
            kotlin.jvm.internal.f0.m(textViewS3);
            MallOrderDetailObj mallOrderDetailObj = TradeOrderDetailActivity.this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj);
            textViewS3.setText(mallOrderDetailObj.getTitle());
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
            if (PatchProxy.proxy(new Object[]{new Long(j10)}, this, changeQuickRedirect, false, 45610, new Class[]{Long.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(org.apache.tools.ant.util.d0.f136746g, Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0"));
            String str = simpleDateFormat.format(new Date(j10));
            TextView textViewS3 = TradeOrderDetailActivity.this.s3();
            if (textViewS3 == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            MallOrderDetailObj mallOrderDetailObj = TradeOrderDetailActivity.this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj);
            sb2.append(mallOrderDetailObj.getTitle());
            sb2.append(": ");
            sb2.append(str);
            textViewS3.setText(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45612, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) TradeOrderDetailActivity.this).f66601b;
            MallOrderDetailObj mallOrderDetailObj = TradeOrderDetailActivity.this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj);
            com.max.xiaoheihe.utils.d.o(activity, mallOrderDetailObj.getOrder_id());
            com.max.hbutils.utils.c.f(TradeOrderDetailActivity.this.getString(R.string.text_copied));
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45613, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity.x2(TradeOrderDetailActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45614, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity mContext = ((BaseActivity) TradeOrderDetailActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            com.max.xiaoheihe.base.router.b.i0(mContext, lb.d.f131195k4);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class q extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45615, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
            }
        }

        public void onNext(@dl.d Result<MallOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45616, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                View viewP3 = TradeOrderDetailActivity.this.p3();
                kotlin.jvm.internal.f0.m(viewP3);
                viewP3.setVisibility(8);
                MallOrderDetailObj result2 = result.getResult();
                if (kotlin.jvm.internal.f0.g("0", result2 != null ? result2.getHas_bind_steam() : null)) {
                    Activity mContext = ((BaseActivity) TradeOrderDetailActivity.this).f66601b;
                    kotlin.jvm.internal.f0.o(mContext, "mContext");
                    TradeInfoUtilKt.L(mContext);
                } else {
                    Intent intent = new Intent(lb.a.A);
                    intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                    ((BaseActivity) TradeOrderDetailActivity.this).f66601b.sendBroadcast(intent);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45617, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class r extends com.max.hbcommon.network.d<Result<WeixinQueryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f93074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f93075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f93076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f93077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f93078g;

        r(boolean z10, int i10, String str, String str2, String str3) {
            this.f93074c = z10;
            this.f93075d = i10;
            this.f93076e = str;
            this.f93077f = str2;
            this.f93078g = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45619, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity.this.isActive();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45618, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                if (TradeOrderDetailActivity.this.W != null) {
                    ProgressDialog progressDialog = TradeOrderDetailActivity.this.W;
                    kotlin.jvm.internal.f0.m(progressDialog);
                    progressDialog.dismiss();
                }
                TradeOrderDetailActivity.this.f93032b0 = false;
            }
        }

        public void onNext(@dl.d Result<WeixinQueryObj> result) {
            int i10;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45620, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                TradeOrderDetailActivity.this.f93032b0 = false;
                if (result.getResult() != null) {
                    WeixinQueryObj result2 = result.getResult();
                    kotlin.jvm.internal.f0.m(result2);
                    String state = result2.getState();
                    com.max.hbcommon.utils.d.b("zzzzmalltest", "queryOutOrder state==" + state);
                    if (kotlin.jvm.internal.f0.g("6", state)) {
                        if (!this.f93074c && this.f93075d < TradeOrderDetailActivity.this.X) {
                            TradeOrderDetailActivity.j2(TradeOrderDetailActivity.this, this.f93076e, this.f93077f, "0", this.f93075d + 1, this.f93074c);
                            return;
                        }
                        boolean z10 = this.f93074c;
                        if (z10 && (i10 = this.f93075d) < 49) {
                            TradeOrderDetailActivity.j2(TradeOrderDetailActivity.this, this.f93076e, this.f93077f, "0", i10 + 1, z10);
                            return;
                        }
                        if (TradeOrderDetailActivity.this.W != null) {
                            ProgressDialog progressDialog = TradeOrderDetailActivity.this.W;
                            kotlin.jvm.internal.f0.m(progressDialog);
                            progressDialog.dismiss();
                        }
                        TradeOrderDetailActivity.z2(TradeOrderDetailActivity.this);
                        return;
                    }
                    if (kotlin.jvm.internal.f0.g("1", state)) {
                        if (TradeOrderDetailActivity.this.W != null) {
                            ProgressDialog progressDialog2 = TradeOrderDetailActivity.this.W;
                            kotlin.jvm.internal.f0.m(progressDialog2);
                            progressDialog2.dismiss();
                        }
                        TradeOrderDetailActivity.i2(TradeOrderDetailActivity.this);
                        return;
                    }
                    if (TradeOrderDetailActivity.this.W != null) {
                        ProgressDialog progressDialog3 = TradeOrderDetailActivity.this.W;
                        kotlin.jvm.internal.f0.m(progressDialog3);
                        progressDialog3.dismiss();
                    }
                    if (kotlin.jvm.internal.f0.g("1", this.f93078g)) {
                        com.max.hbutils.utils.c.d("支付失败");
                    } else {
                        TradeOrderDetailActivity.z2(TradeOrderDetailActivity.this);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45621, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WeixinQueryObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class s extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45623, new Class[0], Void.TYPE).isSupported && TradeOrderDetailActivity.this.isActive()) {
                super.onComplete();
                SmartRefreshLayout smartRefreshLayoutQ3 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ3);
                smartRefreshLayoutQ3.A(0);
                SmartRefreshLayout smartRefreshLayoutQ4 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ4);
                smartRefreshLayoutQ4.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45622, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(e10, "e");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onError(e10);
                TradeOrderDetailActivity.y2(TradeOrderDetailActivity.this);
                SmartRefreshLayout smartRefreshLayoutQ3 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ3);
                smartRefreshLayoutQ3.A(0);
                SmartRefreshLayout smartRefreshLayoutQ4 = TradeOrderDetailActivity.this.q3();
                kotlin.jvm.internal.f0.m(smartRefreshLayoutQ4);
                smartRefreshLayoutQ4.p(0);
            }
        }

        public void onNext(@dl.d Result<MallOrderDetailObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45624, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            kotlin.jvm.internal.f0.p(result, "result");
            if (TradeOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                TradeOrderDetailActivity.this.M = result.getResult();
                TradeOrderDetailActivity.D3(TradeOrderDetailActivity.this, false, 1, null);
                TradeOrderDetailActivity.O1(TradeOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45625, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45626, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity.O1(TradeOrderDetailActivity.this);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45627, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Activity activity = ((BaseActivity) TradeOrderDetailActivity.this).f66601b;
            TradeAssistantActivity.a aVar = TradeAssistantActivity.X;
            Activity mContext = ((BaseActivity) TradeOrderDetailActivity.this).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            activity.startActivity(aVar.a(mContext));
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45628, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
            TradeOrderDetailActivity.C2(tradeOrderDetailActivity, tradeOrderDetailActivity.L);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45629, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity.c2(TradeOrderDetailActivity.this, 0);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45630, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity tradeOrderDetailActivity = TradeOrderDetailActivity.this;
            TradeOrderDetailActivity.B2(tradeOrderDetailActivity, tradeOrderDetailActivity.L);
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallOrderDetailObj f93085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TradeOrderDetailActivity f93086c;

        y(MallOrderDetailObj mallOrderDetailObj, TradeOrderDetailActivity tradeOrderDetailActivity) {
            this.f93085b = mallOrderDetailObj;
            this.f93086c = tradeOrderDetailActivity;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45631, new Class[]{View.class}, Void.TYPE).isSupported || com.max.hbcommon.utils.c.u(this.f93085b.getSku_id())) {
                return;
            }
            Activity activity = ((BaseActivity) this.f93086c).f66601b;
            Activity mContext = ((BaseActivity) this.f93086c).f66601b;
            kotlin.jvm.internal.f0.o(mContext, "mContext");
            activity.startActivity(TradeInfoUtilKt.g(mContext, this.f93085b.getSku_id()));
        }
    }

    /* JADX INFO: compiled from: TradeOrderDetailActivity.kt */
    public static final class z implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 45632, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            TradeOrderDetailActivity.M1(TradeOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public static final /* synthetic */ void A2(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45556, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.j4();
    }

    public static final /* synthetic */ void B2(TradeOrderDetailActivity tradeOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, str}, null, changeQuickRedirect, true, 45561, new Class[]{TradeOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.k4(str);
    }

    public static final /* synthetic */ void C2(TradeOrderDetailActivity tradeOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, str}, null, changeQuickRedirect, true, 45559, new Class[]{TradeOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.l4(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void C3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45520, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        x1();
        if (this.M == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.u(this.O)) {
            MallOrderDetailObj mallOrderDetailObj = this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj);
            this.O = String.valueOf(com.max.hbutils.utils.n.q(mallOrderDetailObj.getCent_price()) * 10);
        }
        this.R = "mall_agreementfalse";
        TYPE_CODE type_codeI2 = I2();
        TYPE_CODE type_code = TYPE_CODE.WAITING_FOR_PAY;
        Object[] objArr = type_codeI2 == type_code;
        MallOrderDetailObj mallOrderDetailObj2 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj2);
        if (com.max.hbcommon.utils.c.u(mallOrderDetailObj2.getOrder_status_desc())) {
            View viewG3 = g3();
            kotlin.jvm.internal.f0.m(viewG3);
            viewG3.setVisibility(8);
        } else {
            View viewG4 = g3();
            kotlin.jvm.internal.f0.m(viewG4);
            viewG4.setVisibility(0);
            MarqueeTextView marqueeTextViewF3 = f3();
            kotlin.jvm.internal.f0.m(marqueeTextViewF3);
            MallOrderDetailObj mallOrderDetailObj3 = this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj3);
            marqueeTextViewF3.setText(mallOrderDetailObj3.getOrder_status_desc());
            ImageView imageViewA3 = a3();
            kotlin.jvm.internal.f0.m(imageViewA3);
            imageViewA3.setOnClickListener(new k());
        }
        MallOrderDetailObj mallOrderDetailObj4 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj4);
        if (com.max.hbcommon.utils.c.u(mallOrderDetailObj4.getService_agreement())) {
            A3().setVisibility(8);
        } else {
            A3().setVisibility(0);
            A3().setOnClickListener(new l());
        }
        MallOrderDetailObj mallOrderDetailObj5 = this.M;
        String time_left = mallOrderDetailObj5 != null ? mallOrderDetailObj5.getTime_left() : null;
        if ((time_left == null || time_left.length() == 0) == true) {
            CountDownTimer countDownTimer = this.f93035x1;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            TextView textViewS3 = s3();
            kotlin.jvm.internal.f0.m(textViewS3);
            MallOrderDetailObj mallOrderDetailObj6 = this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj6);
            textViewS3.setText(mallOrderDetailObj6.getTitle());
        } else {
            CountDownTimer countDownTimer2 = this.f93035x1;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            MallOrderDetailObj mallOrderDetailObj7 = this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj7);
            this.f93035x1 = new m(com.max.hbutils.utils.n.r(mallOrderDetailObj7.getTime_left()) * ((long) 1000)).start();
        }
        TextView textViewS4 = s3();
        kotlin.jvm.internal.f0.m(textViewS4);
        MallOrderDetailObj mallOrderDetailObj8 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj8);
        textViewS4.setTextColor(com.max.xiaoheihe.utils.d.e1(mallOrderDetailObj8.getTitle_color()));
        TextView textViewR3 = r3();
        kotlin.jvm.internal.f0.m(textViewR3);
        MallOrderDetailObj mallOrderDetailObj9 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj9);
        textViewR3.setText(mallOrderDetailObj9.getMsg());
        View viewO2 = O2();
        kotlin.jvm.internal.f0.m(viewO2);
        viewO2.setVisibility(0);
        L3();
        TextView textViewI3 = i3();
        kotlin.jvm.internal.f0.m(textViewI3);
        v0 v0Var = v0.f124986a;
        String str = String.format("%s：", Arrays.copyOf(new Object[]{getString(R.string.order_number)}, 1));
        kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        textViewI3.setText(str);
        TextView textViewK3 = k3();
        kotlin.jvm.internal.f0.m(textViewK3);
        MallOrderDetailObj mallOrderDetailObj10 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj10);
        textViewK3.setText(mallOrderDetailObj10.getOrder_id());
        TextView textViewH3 = h3();
        kotlin.jvm.internal.f0.m(textViewH3);
        textViewH3.setOnClickListener(new n());
        TextView textViewW2 = W2();
        kotlin.jvm.internal.f0.m(textViewW2);
        String str2 = String.format("%s：", Arrays.copyOf(new Object[]{getString(R.string.order_create_time)}, 1));
        kotlin.jvm.internal.f0.o(str2, "format(format, *args)");
        textViewW2.setText(str2);
        TextView textViewX2 = X2();
        kotlin.jvm.internal.f0.m(textViewX2);
        MallOrderDetailObj mallOrderDetailObj11 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj11);
        textViewX2.setText(mallOrderDetailObj11.getCreate_time());
        TextView textViewL3 = l3();
        kotlin.jvm.internal.f0.m(textViewL3);
        String str3 = String.format("%s：", Arrays.copyOf(new Object[]{"订单类型"}, 1));
        kotlin.jvm.internal.f0.o(str3, "format(format, *args)");
        textViewL3.setText(str3);
        TextView textViewN3 = n3();
        kotlin.jvm.internal.f0.m(textViewN3);
        MallOrderDetailObj mallOrderDetailObj12 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj12);
        textViewN3.setText(mallOrderDetailObj12.getOrder_type_desc());
        TextView textViewQ2 = Q2();
        kotlin.jvm.internal.f0.m(textViewQ2);
        String str4 = String.format("%s：", Arrays.copyOf(new Object[]{"发货方式"}, 1));
        kotlin.jvm.internal.f0.o(str4, "format(format, *args)");
        textViewQ2.setText(str4);
        TextView textViewP2 = P2();
        kotlin.jvm.internal.f0.m(textViewP2);
        MallOrderDetailObj mallOrderDetailObj13 = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj13);
        textViewP2.setText(mallOrderDetailObj13.getCat_desc());
        K3();
        if (I2() == type_code) {
            MallOrderDetailObj mallOrderDetailObj14 = this.M;
            kotlin.jvm.internal.f0.m(mallOrderDetailObj14);
            if (mallOrderDetailObj14.getPurchase_params() != null) {
                MallOrderDetailObj mallOrderDetailObj15 = this.M;
                kotlin.jvm.internal.f0.m(mallOrderDetailObj15);
                this.Z = mallOrderDetailObj15.getPurchase_params().getPay_type();
                MallOrderDetailObj mallOrderDetailObj16 = this.M;
                kotlin.jvm.internal.f0.m(mallOrderDetailObj16);
                this.Y = mallOrderDetailObj16.getPurchase_params().getOut_order_id();
                com.max.hbcommon.utils.d.b("zzzzmalltest", "mOrderDetailObj.getPurchase_params()!=null");
                G3(this.Y, this.Z, "0", 0, z10);
            }
        } else if (I2() == TYPE_CODE.CHECK_OFFER) {
            t3(0);
        }
        if (objArr == true) {
            this.f66616q.setActionX(getString(R.string.cancel_order));
            this.f66616q.setActionXOnClickListener(new o());
        } else {
            this.f66616q.setActionX((CharSequence) null);
        }
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new p());
        if (I2() == TYPE_CODE.REMIND) {
            y3().setVisibility(0);
            y3().setText(com.max.xiaoheihe.utils.d.n0(R.string.trade_order_offer_tips));
        } else if (I2() == TYPE_CODE.PURCHASE_SUPPLY) {
            y3().setVisibility(0);
            y3().setText(com.max.xiaoheihe.utils.d.n0(R.string.trade_order_supply_tips));
        } else if (I2() == TYPE_CODE.TO_RES_OFFER) {
            y3().setVisibility(0);
            y3().setText("请留意App通知，请务必在小黑盒/MAX内处理报价完成发货，处理报价信息请注意核对Steam注册时间！如有异常请勿继续回应报价，谨防被骗！");
        } else {
            y3().setVisibility(8);
        }
        I3();
    }

    private final void D2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45529, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewP3 = p3();
        kotlin.jvm.internal.f0.m(viewP3);
        viewP3.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().c3(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d()));
    }

    static /* synthetic */ void D3(TradeOrderDetailActivity tradeOrderDetailActivity, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 45521, new Class[]{TradeOrderDetailActivity.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        tradeOrderDetailActivity.C3(z10);
    }

    private final boolean E2(MallPayInfoObj mallPayInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 45539, new Class[]{MallPayInfoObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (kotlin.jvm.internal.f0.g("1", com.max.hbcache.c.o(this.R, ""))) {
            return true;
        }
        startActivityForResult(GameStoreAgreementActivity.O1(this.f66601b, mallPayInfoObj.getAgreement_title(), mallPayInfoObj.getService_agreement(), true), 1);
        return false;
    }

    private final void F3() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45533, new Class[0], Void.TYPE).isSupported && I2() == TYPE_CODE.WAITING_FOR_PAY) {
            View viewP3 = p3();
            kotlin.jvm.internal.f0.m(viewP3);
            viewP3.setVisibility(0);
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o1(this.L, !com.max.hbcommon.utils.c.u(this.Y) ? this.Y : null, com.max.hbcommon.utils.c.u(this.Z) ? null : this.Z).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q()));
        }
    }

    private final void G2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45531, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        p3().setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().o9(this.L, this.O).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e()));
    }

    private final void G3(String str, String str2, String str3, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45552, new Class[]{String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null || this.f93032b0) {
            return;
        }
        this.f93032b0 = true;
        ProgressDialog progressDialog = this.W;
        kotlin.jvm.internal.f0.m(progressDialog);
        progressDialog.setMessage("正在检测订单状态...");
        ProgressDialog progressDialog2 = this.W;
        kotlin.jvm.internal.f0.m(progressDialog2);
        if (!progressDialog2.isShowing() && !z10) {
            ProgressDialog progressDialog3 = this.W;
            kotlin.jvm.internal.f0.m(progressDialog3);
            progressDialog3.show();
        }
        long j10 = 2;
        if (z10) {
            if (i10 > 30) {
                j10 = 10;
            } else if (i10 > 10) {
                j10 = 4;
            } else if (i10 <= 5) {
                j10 = 1;
            }
        }
        PaymentManager paymentManager = this.V;
        kotlin.jvm.internal.f0.m(paymentManager);
        this.f93036y1.c((io.reactivex.disposables.b) paymentManager.C(str2, str, str3).C1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new r(z10, i10, str, str2, str3)));
    }

    private final void H3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45528, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t7(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s()));
    }

    private final void I3() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45523, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TYPE_CODE type_codeI2 = I2();
        if (type_codeI2 == TYPE_CODE.WAITING_FOR_PAY) {
            S2().setVisibility(0);
        } else {
            S2().setVisibility(8);
        }
        if (type_codeI2 == TYPE_CODE.FINISH) {
            V2().setVisibility(8);
            return;
        }
        V2().setVisibility(0);
        int i10 = type_codeI2 == null ? -1 : c.f93041a[type_codeI2.ordinal()];
        if (i10 == 1) {
            T2().setText("提交订单");
            T2().setOnClickListener(new t());
            return;
        }
        if (i10 == 2) {
            T2().setText("去处理");
            T2().setOnClickListener(new u());
            return;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                T2().setText("去处理");
                T2().setOnClickListener(new w());
                return;
            } else {
                if (i10 != 5) {
                    return;
                }
                T2().setText("去发起");
                T2().setOnClickListener(new x());
                return;
            }
        }
        MallOrderDetailObj mallOrderDetailObj = this.M;
        String btn_desc = mallOrderDetailObj != null ? mallOrderDetailObj.getBtn_desc() : null;
        if (btn_desc == null || btn_desc.length() == 0) {
            T2().setText("提醒发货");
        } else {
            TextView textViewT2 = T2();
            MallOrderDetailObj mallOrderDetailObj2 = this.M;
            textViewT2.setText(mallOrderDetailObj2 != null ? mallOrderDetailObj2.getBtn_desc() : null);
        }
        T2().setOnClickListener(new v());
    }

    private final void J2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45532, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallPayInfoObj mallPayInfoObj = this.f93034p1;
        kotlin.jvm.internal.f0.m(mallPayInfoObj);
        this.O = mallPayInfoObj.getPay_price();
        MallPayInfoObj mallPayInfoObj2 = this.f93034p1;
        kotlin.jvm.internal.f0.m(mallPayInfoObj2);
        if (com.max.hbutils.utils.n.q(mallPayInfoObj2.getPay_price()) == 0) {
            this.Z = PaymentManager.A;
            L2("0");
        } else {
            MallPayInfoObj mallPayInfoObj3 = this.f93034p1;
            if (mallPayInfoObj3 != null) {
                i4(mallPayInfoObj3);
            }
        }
    }

    private final void K2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45530, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewP3 = p3();
        kotlin.jvm.internal.f0.m(viewP3);
        viewP3.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O1(this.L, null, null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new g()));
    }

    private final void K3() {
        List<MallDiscountParamsObj> discount_params;
        MallOrderDetailObj mallOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45522, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallPriceObj mallPriceObj = this.N;
        if (mallPriceObj != null) {
            kotlin.jvm.internal.f0.m(mallPriceObj);
            discount_params = mallPriceObj.getDiscount_params();
        } else {
            discount_params = null;
        }
        if (discount_params == null && (mallOrderDetailObj = this.M) != null) {
            kotlin.jvm.internal.f0.m(mallOrderDetailObj);
            discount_params = mallOrderDetailObj.getDiscount_params();
        }
        com.max.xiaoheihe.module.mall.o.i(this.f66601b, discount_params, Y2(), Y2());
        TextView textViewS2 = S2();
        kotlin.jvm.internal.f0.m(textViewS2);
        v0 v0Var = v0.f124986a;
        String string = getString(R.string.rmb_format);
        kotlin.jvm.internal.f0.o(string, "getString(R.string.rmb_format)");
        String str = String.format(string, Arrays.copyOf(new Object[]{r1.F(this.O)}, 1));
        kotlin.jvm.internal.f0.o(str, "format(format, *args)");
        textViewS2.setText(str);
    }

    private final void L2(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45548, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Kb(this.L, "trade", PaymentManager.A, str, null, null, null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h()));
    }

    private final void L3() {
        MallOrderDetailObj mallOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45525, new Class[0], Void.TYPE).isSupported || (mallOrderDetailObj = this.M) == null) {
            return;
        }
        View viewFindViewById = e3().findViewById(R.id.iv_img);
        kotlin.jvm.internal.f0.n(viewFindViewById, "null cannot be cast to non-null type android.widget.ImageView");
        View viewFindViewById2 = e3().findViewById(R.id.tv_name);
        kotlin.jvm.internal.f0.n(viewFindViewById2, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById3 = e3().findViewById(R.id.tv_desc);
        kotlin.jvm.internal.f0.n(viewFindViewById3, "null cannot be cast to non-null type android.widget.TextView");
        View viewFindViewById4 = e3().findViewById(R.id.tv_price);
        kotlin.jvm.internal.f0.n(viewFindViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) viewFindViewById4;
        ViewGroup.LayoutParams layoutParams = e3().getLayoutParams();
        kotlin.jvm.internal.f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        com.max.hbimage.b.K(mallOrderDetailObj.getHead_image(), (ImageView) viewFindViewById);
        ((TextView) viewFindViewById2).setText(mallOrderDetailObj.getName());
        ((TextView) viewFindViewById3).setText('x' + mallOrderDetailObj.getAmount());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.rmb_symbol));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_13)), 0, spannableStringBuilder.length(), 33);
        String price = mallOrderDetailObj.getPrice();
        if (price == null) {
            price = "";
        } else {
            kotlin.jvm.internal.f0.o(price, "it.price ?: \"\"");
        }
        spannableStringBuilder.append((CharSequence) price);
        textView.setText(spannableStringBuilder);
        e3().setOnClickListener(new y(mallOrderDetailObj, this));
    }

    public static final /* synthetic */ void M1(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45569, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.D2();
    }

    public static final /* synthetic */ boolean N1(TradeOrderDetailActivity tradeOrderDetailActivity, MallPayInfoObj mallPayInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, mallPayInfoObj}, null, changeQuickRedirect, true, 45565, new Class[]{TradeOrderDetailActivity.class, MallPayInfoObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : tradeOrderDetailActivity.E2(mallPayInfoObj);
    }

    public static final /* synthetic */ void O1(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45558, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.G2();
    }

    public static final /* synthetic */ void Q1(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45566, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.J2();
    }

    public static final /* synthetic */ void R1(TradeOrderDetailActivity tradeOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, str}, null, changeQuickRedirect, true, 45567, new Class[]{TradeOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.L2(str);
    }

    public static final /* synthetic */ void c2(TradeOrderDetailActivity tradeOrderDetailActivity, int i10) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 45560, new Class[]{TradeOrderDetailActivity.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.t3(i10);
    }

    private final void f4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45538, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.prompt).k(R.string.cancel_order_tips).u(getString(R.string.cancel_order), new z()).o(getString(R.string.cancel), a0.f93038b).g(false).F();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private final void g4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45553, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.f93031a0;
        if (aVar != null) {
            kotlin.jvm.internal.f0.m(aVar);
            if (!aVar.isShowing()) {
                if (!this.f93033c0) {
                    this.f93031a0 = new com.max.hbcommon.view.a.f(this.f66601b).l("您是否已经完成了支付").u("已支付", new b0()).o("未支付", new c0()).F();
                    return;
                }
            }
        } else if (!this.f93033c0) {
            this.f93031a0 = new com.max.hbcommon.view.a.f(this.f66601b).l("您是否已经完成了支付").u("已支付", new b0()).o("未支付", new c0()).F();
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", " showPayCompleteConfirmDialog isBlocked==" + this.f93033c0);
    }

    public static final /* synthetic */ void h2(TradeOrderDetailActivity tradeOrderDetailActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45563, new Class[]{TradeOrderDetailActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.C3(z10);
    }

    private final void h4(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 45537, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.f0.m(mallPayInfoObj);
        sb2.append(mallPayInfoObj.getPay_price());
        sb2.append(getString(R.string.h_coin));
        String string = sb2.toString();
        SpannableString spannableString = new SpannableString(getString(R.string.should_cost) + ' ' + string);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.interactive_color)), spannableString.length() - string.length(), spannableString.length(), 33);
        String str = getString(R.string.current_h_coin) + ": " + mallPayInfoObj.getTotal_coin();
        TextView textView = new TextView(this.f66601b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 20.0f));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
        String string2 = getString(R.string.purchase_agreement);
        kotlin.jvm.internal.f0.o(string2, "getString(R.string.purchase_agreement)");
        SpannableString spannableString2 = new SpannableString(getString(R.string.purchase_agreement_confirm) + string2);
        spannableString2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.interactive_color)), spannableString2.length() - string2.length(), spannableString2.length(), 33);
        textView.setText(spannableString2);
        textView.setOnClickListener(new d0(mallPayInfoObj));
        new com.max.hbcommon.view.a.f(this.f66601b).y(spannableString).l(str).i(textView).u(getString(R.string.purchase), new e0()).o(getString(R.string.cancel), f0.f93049b).F();
    }

    public static final /* synthetic */ void i2(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45568, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.F3();
    }

    private final void i4(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 45536, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        String pay_price = mallPayInfoObj.getPay_price();
        String total_hbalance = mallPayInfoObj.getTotal_hbalance();
        MallOrderDetailObj mallOrderDetailObj = this.M;
        com.max.xiaoheihe.module.mall.o.q(this, pay_price, total_hbalance, mallOrderDetailObj != null ? mallOrderDetailObj.getPayment_list() : null, true, new g0(mallPayInfoObj));
    }

    public static final /* synthetic */ void j2(TradeOrderDetailActivity tradeOrderDetailActivity, String str, String str2, String str3, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, str, str2, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 45570, new Class[]{TradeOrderDetailActivity.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.G3(str, str2, str3, i10, z10);
    }

    private final void j4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45544, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ProgressDialog progressDialog = this.W;
        if (progressDialog != null) {
            kotlin.jvm.internal.f0.m(progressDialog);
            if (progressDialog.isShowing()) {
                ProgressDialog progressDialog2 = this.W;
                kotlin.jvm.internal.f0.m(progressDialog2);
                progressDialog2.dismiss();
            }
        }
        io.reactivex.disposables.a aVar = this.f93036y1;
        if (aVar != null) {
            aVar.f();
        }
        this.f93032b0 = false;
    }

    public static final /* synthetic */ void k2(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45564, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.K3();
    }

    private final void k4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45524, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z7(str, "0").I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h0()));
    }

    private final void l4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45555, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Q7(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i0()));
    }

    private final void t3(final int i10) {
        long j10;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 45534, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ProgressDialog progressDialog = this.W;
        if (progressDialog != null) {
            progressDialog.setMessage("正在发起报价...");
        }
        ProgressDialog progressDialog2 = this.W;
        kotlin.jvm.internal.f0.m(progressDialog2);
        if (!progressDialog2.isShowing()) {
            ProgressDialog progressDialog3 = this.W;
            kotlin.jvm.internal.f0.m(progressDialog3);
            progressDialog3.show();
        }
        if (i10 < 3) {
            j10 = 2;
        } else {
            j10 = i10 < 8 ? 4L : 8L;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().f3(this.L).w1(j10, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new com.max.hbcommon.network.d<Result<TradeOfferStateObj>>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderDetailActivity$getOfferState$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public void onError(@dl.d Throwable e10) {
                if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 45592, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(e10, "e");
                if (this.f93053b.isActive()) {
                    ProgressDialog progressDialog4 = this.f93053b.W;
                    if (progressDialog4 != null) {
                        progressDialog4.dismiss();
                    }
                    Activity mContext = ((BaseActivity) this.f93053b).f66601b;
                    f0.o(mContext, "mContext");
                    final TradeOrderDetailActivity tradeOrderDetailActivity = this.f93053b;
                    TradeInfoUtilKt.q(mContext, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderDetailActivity$getOfferState$1$onError$1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45596, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45595, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            tradeOrderDetailActivity.finish();
                        }
                    });
                    super.onError(e10);
                }
            }

            public void onNext(@dl.d Result<TradeOfferStateObj> result) {
                if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 45593, new Class[]{Result.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(result, "result");
                if (this.f93053b.isActive()) {
                    TradeOfferStateObj result2 = result.getResult();
                    String state = result2 != null ? result2.getState() : null;
                    if (state != null) {
                        int iHashCode = state.hashCode();
                        if (iHashCode == -1867169789) {
                            if (state.equals("success")) {
                                ProgressDialog progressDialog4 = this.f93053b.W;
                                if (progressDialog4 != null) {
                                    progressDialog4.dismiss();
                                }
                                TradeOfferStateObj result3 = result.getResult();
                                String buyer_create_time = result3 != null ? result3.getBuyer_create_time() : null;
                                if (buyer_create_time == null || buyer_create_time.length() == 0) {
                                    TradeOrderDetailActivity.w3(this.f93053b, false, 1, null);
                                    return;
                                }
                                TradeOrderDetailActivity tradeOrderDetailActivity = this.f93053b;
                                TradeOfferStateObj result4 = result.getResult();
                                String buyer_create_time2 = result4 != null ? result4.getBuyer_create_time() : null;
                                f0.m(buyer_create_time2);
                                final TradeOrderDetailActivity tradeOrderDetailActivity2 = this.f93053b;
                                TradeInfoUtilKt.M(tradeOrderDetailActivity, buyer_create_time2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderDetailActivity$getOfferState$1$onNext$2
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45600, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45599, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        TradeOrderDetailActivity.w3(tradeOrderDetailActivity2, false, 1, null);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        if (iHashCode == -1091295072) {
                            if (state.equals("overdue")) {
                                ProgressDialog progressDialog5 = this.f93053b.W;
                                if (progressDialog5 != null) {
                                    progressDialog5.dismiss();
                                }
                                Activity mContext = ((BaseActivity) this.f93053b).f66601b;
                                f0.o(mContext, "mContext");
                                final TradeOrderDetailActivity tradeOrderDetailActivity3 = this.f93053b;
                                TradeInfoUtilKt.b0(mContext, false, null, null, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderDetailActivity$getOfferState$1$onNext$1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                    @Override // yh.a
                                    public /* bridge */ /* synthetic */ b2 invoke() {
                                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45598, new Class[0], Object.class);
                                        if (patchProxyResultProxy.isSupported) {
                                            return patchProxyResultProxy.result;
                                        }
                                        invoke2();
                                        return b2.f124493a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45597, new Class[0], Void.TYPE).isSupported) {
                                            return;
                                        }
                                        ((BaseActivity) tradeOrderDetailActivity3).f66601b.startActivityForResult(TradeUploadSteamActivity.P.a(((BaseActivity) tradeOrderDetailActivity3).f66601b, tradeOrderDetailActivity3.L), 2);
                                    }
                                }, 14, null);
                                return;
                            }
                            return;
                        }
                        if (iHashCode == 1116313165 && state.equals("waiting")) {
                            int i11 = i10;
                            if (i11 <= 12) {
                                TradeOrderDetailActivity.c2(this.f93053b, i11 + 1);
                                return;
                            }
                            Activity mContext2 = ((BaseActivity) this.f93053b).f66601b;
                            f0.o(mContext2, "mContext");
                            final TradeOrderDetailActivity tradeOrderDetailActivity4 = this.f93053b;
                            TradeInfoUtilKt.s(mContext2, new yh.a<b2>() { // from class: com.max.xiaoheihe.module.trade.TradeOrderDetailActivity$getOfferState$1$onNext$3
                                public static ChangeQuickRedirect changeQuickRedirect;

                                {
                                    super(0);
                                }

                                /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                                @Override // yh.a
                                public /* bridge */ /* synthetic */ b2 invoke() {
                                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45602, new Class[0], Object.class);
                                    if (patchProxyResultProxy.isSupported) {
                                        return patchProxyResultProxy.result;
                                    }
                                    invoke2();
                                    return b2.f124493a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45601, new Class[0], Void.TYPE).isSupported) {
                                        return;
                                    }
                                    tradeOrderDetailActivity4.finish();
                                }
                            });
                        }
                    }
                }
            }

            @Override // com.max.hbcommon.network.d, io.reactivex.g0
            public /* bridge */ /* synthetic */ void onNext(Object obj) {
                if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 45594, new Class[]{Object.class}, Void.TYPE).isSupported) {
                    return;
                }
                onNext((Result<TradeOfferStateObj>) obj);
            }
        }));
    }

    private final void u3(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 45526, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t7(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i(z10)));
    }

    static /* synthetic */ void w3(TradeOrderDetailActivity tradeOrderDetailActivity, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 45527, new Class[]{TradeOrderDetailActivity.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        tradeOrderDetailActivity.u3(z10);
    }

    public static final /* synthetic */ void x2(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45557, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.f4();
    }

    public static final /* synthetic */ void y2(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45562, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.C1();
    }

    public static final /* synthetic */ void z2(TradeOrderDetailActivity tradeOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{tradeOrderDetailActivity}, null, changeQuickRedirect, true, 45571, new Class[]{TradeOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        tradeOrderDetailActivity.g4();
    }

    @dl.d
    public final View A3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45511, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.vg_mall_agreement;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("vg_mall_agreement");
        return null;
    }

    @dl.d
    public final ViewGroup B3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45509, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.vg_root;
        if (viewGroup != null) {
            return viewGroup;
        }
        kotlin.jvm.internal.f0.S("vg_root");
        return null;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void E3(@dl.d String out_trade_no) {
        if (PatchProxy.proxy(new Object[]{out_trade_no}, this, changeQuickRedirect, false, 45543, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(out_trade_no, "out_trade_no");
        this.Y = out_trade_no;
        if (kotlin.jvm.internal.f0.g(this.Z, PaymentManager.f71427z)) {
            return;
        }
        j4();
        u3(true);
    }

    public final void H2() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45535, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewP3 = p3();
        kotlin.jvm.internal.f0.m(viewP3);
        viewP3.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t7(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f()));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @dl.e
    public final TYPE_CODE I2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45554, new Class[0], TYPE_CODE.class);
        if (patchProxyResultProxy.isSupported) {
            return (TYPE_CODE) patchProxyResultProxy.result;
        }
        MallOrderDetailObj mallOrderDetailObj = this.M;
        kotlin.jvm.internal.f0.m(mallOrderDetailObj);
        String order_state = mallOrderDetailObj.getOrder_state();
        if (order_state != null) {
            switch (order_state.hashCode()) {
                case 50:
                    if (order_state.equals("2")) {
                        return TYPE_CODE.WAITING_FOR_PAY;
                    }
                    break;
                case 51:
                    if (order_state.equals("3")) {
                        return TYPE_CODE.TO_RES_OFFER;
                    }
                    break;
                case 52:
                    if (order_state.equals("4")) {
                        return TYPE_CODE.REMIND;
                    }
                    break;
                case 53:
                    if (order_state.equals("5")) {
                        return TYPE_CODE.CHECK_OFFER;
                    }
                    break;
                case 54:
                    if (order_state.equals("6")) {
                        return TYPE_CODE.PURCHASE_SUPPLY;
                    }
                    break;
            }
        }
        return TYPE_CODE.FINISH;
    }

    public final void M3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45494, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mCatDescTextView = textView;
    }

    public final void N3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45492, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mCatTitleTextView = textView;
    }

    @dl.d
    public final View O2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45473, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.mBundlesView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mBundlesView");
        return null;
    }

    public final void O3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45502, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mConfirmPriceTextView = textView;
    }

    @dl.d
    public final TextView P2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45493, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mCatDescTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mCatDescTextView");
        return null;
    }

    public final void P3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45504, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mConfirmTextView = textView;
    }

    @dl.d
    public final TextView Q2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45491, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mCatTitleTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mCatTitleTextView");
        return null;
    }

    public final void Q3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45484, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mCreateTimeDescTextView = textView;
    }

    public final void R3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45486, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mCreateTimeTextView = textView;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void S1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45549, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "onPaySuccess");
    }

    @dl.d
    public final TextView S2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45501, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mConfirmPriceTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mConfirmPriceTextView");
        return null;
    }

    public final void S3(@dl.d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 45496, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(linearLayout, "<set-?>");
        this.mDiscountInfoLinearLayout = linearLayout;
    }

    @dl.d
    public final TextView T2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45503, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mConfirmTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mConfirmTextView");
        return null;
    }

    public final void T3(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 45468, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.mDismissMessageImageView = imageView;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void U2(@dl.d String pay_type) {
        if (PatchProxy.proxy(new Object[]{pay_type}, this, changeQuickRedirect, false, 45518, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(pay_type, "pay_type");
        if (kotlin.jvm.internal.f0.g(pay_type, this.Z)) {
            this.Y = null;
            this.Z = null;
        }
    }

    public final void U3(@dl.d MarqueeTextView marqueeTextView) {
        if (PatchProxy.proxy(new Object[]{marqueeTextView}, this, changeQuickRedirect, false, 45466, new Class[]{MarqueeTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(marqueeTextView, "<set-?>");
        this.mMessageMarqueeTextView = marqueeTextView;
    }

    @dl.d
    public final View V2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45499, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.mConfirmView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mConfirmView");
        return null;
    }

    public final void V3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45482, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mOrderIdCopyTextView = textView;
    }

    @dl.d
    public final TextView W2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45483, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mCreateTimeDescTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mCreateTimeDescTextView");
        return null;
    }

    public final void W3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45478, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mOrderIdDescTextView = textView;
    }

    @dl.d
    public final TextView X2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45485, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mCreateTimeTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mCreateTimeTextView");
        return null;
    }

    public final void X3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45480, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mOrderIdTextView = textView;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void Y0(@dl.d WeixinQueryObj state) {
        if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 45551, new Class[]{WeixinQueryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(state, "state");
        com.max.hbcommon.utils.d.b("zzzzmalltest", "updateUIAfterQuery");
    }

    @dl.d
    public final LinearLayout Y2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45495, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.mDiscountInfoLinearLayout;
        if (linearLayout != null) {
            return linearLayout;
        }
        kotlin.jvm.internal.f0.S("mDiscountInfoLinearLayout");
        return null;
    }

    public final void Y3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45488, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mPackageNameDescTextView = textView;
    }

    public final void Z3(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45490, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mPackageNameTextView = textView;
    }

    @dl.d
    public final ImageView a3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45467, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.mDismissMessageImageView;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("mDismissMessageImageView");
        return null;
    }

    public final void a4(@dl.d SmartRefreshLayout smartRefreshLayout) {
        if (PatchProxy.proxy(new Object[]{smartRefreshLayout}, this, changeQuickRedirect, false, 45508, new Class[]{SmartRefreshLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(smartRefreshLayout, "<set-?>");
        this.mRefreshLayout = smartRefreshLayout;
    }

    public final void b4(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45472, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mTipsDescTextView = textView;
    }

    public final void c4(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45470, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.mTipsTitleTextView = textView;
    }

    public final void d4(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 45498, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.tv_trade_order_offer_tips = textView;
    }

    @dl.d
    public final View e3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45475, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.mItemView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mItemView");
        return null;
    }

    public final void e4(@dl.d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 45510, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(viewGroup, "<set-?>");
        this.vg_root = viewGroup;
    }

    @dl.d
    public final MarqueeTextView f3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45465, new Class[0], MarqueeTextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (MarqueeTextView) patchProxyResultProxy.result;
        }
        MarqueeTextView marqueeTextView = this.mMessageMarqueeTextView;
        if (marqueeTextView != null) {
            return marqueeTextView;
        }
        kotlin.jvm.internal.f0.S("mMessageMarqueeTextView");
        return null;
    }

    @dl.d
    public final View g3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45463, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.mMessageView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mMessageView");
        return null;
    }

    @dl.d
    public final TextView h3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45481, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mOrderIdCopyTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mOrderIdCopyTextView");
        return null;
    }

    @dl.d
    public final TextView i3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45477, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mOrderIdDescTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mOrderIdDescTextView");
        return null;
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> j3(@dl.d String price) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{price}, this, changeQuickRedirect, false, 45546, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(price, "price");
        io.reactivex.z<Result<PayOrderObj>> zVarB = com.max.xiaoheihe.network.i.a().b(PaymentManager.A, price);
        kotlin.jvm.internal.f0.o(zVarB, "createHeyBoxService().ge…yOrder(\"hbalance\", price)");
        return zVarB;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45514, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_trade_order_detail);
        if (com.max.hbcommon.network.b.f68052i) {
            com.max.hbpay.c.a();
        }
        ButterKnife.a(this);
        PaymentManager paymentManager = new PaymentManager(this, this);
        this.V = paymentManager;
        kotlin.jvm.internal.f0.m(paymentManager);
        paymentManager.U(false);
        ProgressDialog progressDialog = new ProgressDialog(this.f66601b);
        this.W = progressDialog;
        kotlin.jvm.internal.f0.m(progressDialog);
        progressDialog.setIndeterminate(true);
        ProgressDialog progressDialog2 = this.W;
        kotlin.jvm.internal.f0.m(progressDialog2);
        progressDialog2.setCancelable(false);
        PaymentManager paymentManager2 = this.V;
        kotlin.jvm.internal.f0.m(paymentManager2);
        paymentManager2.Q(this.W);
        Intent intent = getIntent();
        intent.getData();
        this.L = intent.getStringExtra("order_id");
        this.f66616q.setTitle(getString(R.string.order_detail));
        this.f66617r.setVisibility(0);
        SmartRefreshLayout smartRefreshLayoutQ3 = q3();
        kotlin.jvm.internal.f0.m(smartRefreshLayoutQ3);
        smartRefreshLayoutQ3.S(new j());
        SmartRefreshLayout smartRefreshLayoutQ4 = q3();
        kotlin.jvm.internal.f0.m(smartRefreshLayoutQ4);
        smartRefreshLayoutQ4.b0(false);
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver();
        this.U = refreshBroadcastReceiver;
        t1(refreshBroadcastReceiver, lb.a.A);
        E1();
        w3(this, false, 1, null);
    }

    @dl.d
    public final TextView k3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45479, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mOrderIdTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mOrderIdTextView");
        return null;
    }

    @dl.d
    public final TextView l3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45487, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mPackageNameDescTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mPackageNameDescTextView");
        return null;
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45542, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        w3(this, false, 1, null);
    }

    @dl.d
    public final TextView n3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45489, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mPackageNameTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mPackageNameTextView");
        return null;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void o1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45550, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "onPayFailed");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @dl.e Intent intent) {
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 45540, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            if (i11 == 1) {
                com.max.hbcache.c.C(this.R, "");
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                com.max.hbcache.c.C(this.R, "1");
                this.P = true;
                return;
            }
        }
        if (i10 == 3 && i11 == -1) {
            H3();
            return;
        }
        if (i10 == 111) {
            w3(this, false, 1, null);
        } else if (i10 == 2 && i11 == -1) {
            w3(this, false, 1, null);
        }
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 45513, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bundle != null && bundle.containsKey(J3)) {
            this.O = bundle.getString(J3);
        }
        super.onCreate(bundle);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45541, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMShareAPI.get(this).release();
        this.T.removeCallbacksAndMessages(null);
        RefreshBroadcastReceiver refreshBroadcastReceiver = this.U;
        if (refreshBroadcastReceiver != null) {
            this.f66601b.unregisterReceiver(refreshBroadcastReceiver);
        }
        io.reactivex.disposables.a aVar = this.f93036y1;
        if (aVar != null) {
            aVar.f();
        }
        CountDownTimer countDownTimer = this.f93035x1;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45517, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        this.f93033c0 = true;
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45516, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        this.f93033c0 = false;
        if (com.max.hbcommon.utils.c.u(this.Y) || kotlin.jvm.internal.f0.g(PaymentManager.f71427z, this.Z)) {
            return;
        }
        if (this.f93032b0) {
            j4();
        }
        G3(this.Y, this.Z, "0", 0, false);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45519, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResumeFragments();
        if (this.P) {
            this.P = false;
            J2();
        }
        if (this.Q) {
            this.Q = false;
            w3(this, false, 1, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@dl.d Bundle outState) {
        if (PatchProxy.proxy(new Object[]{outState}, this, changeQuickRedirect, false, 45515, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(outState, "outState");
        super.onSaveInstanceState(outState);
        if (com.max.hbcommon.utils.c.u(this.O)) {
            return;
        }
        outState.putString(J3, this.O);
    }

    @dl.d
    public final View p3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45505, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.mProgressView;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.f0.S("mProgressView");
        return null;
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> q0(@dl.d String price) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{price}, this, changeQuickRedirect, false, 45545, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        kotlin.jvm.internal.f0.p(price, "price");
        io.reactivex.z<Result<PayOrderObj>> zVarKb = com.max.xiaoheihe.network.i.a().Kb(this.L, "trade", PaymentManager.f71426y, price, null, null, null);
        kotlin.jvm.internal.f0.o(zVarKb, "createHeyBoxService().ge…ull, null, null\n        )");
        return zVarKb;
    }

    @dl.d
    public final SmartRefreshLayout q3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45507, new Class[0], SmartRefreshLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (SmartRefreshLayout) patchProxyResultProxy.result;
        }
        SmartRefreshLayout smartRefreshLayout = this.mRefreshLayout;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        kotlin.jvm.internal.f0.S("mRefreshLayout");
        return null;
    }

    @dl.d
    public final TextView r3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45471, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mTipsDescTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mTipsDescTextView");
        return null;
    }

    @dl.d
    public final TextView s3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45469, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.mTipsTitleTextView;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("mTipsTitleTextView");
        return null;
    }

    public final void setMBundlesView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45474, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.mBundlesView = view;
    }

    public final void setMConfirmView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45500, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.mConfirmView = view;
    }

    public final void setMItemView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45476, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.mItemView = view;
    }

    public final void setMMessageView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45464, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.mMessageView = view;
    }

    public final void setMProgressView(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45506, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.mProgressView = view;
    }

    public final void setVg_mall_agreement(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 45512, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(view, "<set-?>");
        this.vg_mall_agreement = view;
    }

    @dl.d
    public final TextView y3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45497, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.tv_trade_order_offer_tips;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_trade_order_offer_tips");
        return null;
    }

    @Override // com.max.hbpay.PaymentManager.g
    @dl.d
    public io.reactivex.z<Result<PayOrderObj>> z3(@dl.e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 45547, new Class[]{String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        io.reactivex.z<Result<PayOrderObj>> zVarKb = com.max.xiaoheihe.network.i.a().Kb(this.L, "trade", "lianlian", str, null, null, null);
        kotlin.jvm.internal.f0.o(zVarKb, "createHeyBoxService().ge…ull, null, null\n        )");
        return zVarKb;
    }
}
