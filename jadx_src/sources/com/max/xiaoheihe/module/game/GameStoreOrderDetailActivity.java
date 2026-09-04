package com.max.xiaoheihe.module.game;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.OrderCouponListActivity;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ProxyObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.SwitchProxyObj;
import com.max.xiaoheihe.bean.game.AutoAcceptGameParamsObj;
import com.max.xiaoheihe.bean.game.GamePurchaseConditionObj;
import com.max.xiaoheihe.bean.game.GamePurchaseOrderProgressObj;
import com.max.xiaoheihe.bean.game.GamePurchaseParamsObj;
import com.max.xiaoheihe.bean.game.GamePurchaseResultObj;
import com.max.xiaoheihe.bean.game.GameRechargeCardObj;
import com.max.xiaoheihe.bean.mall.GameStoreOrderKeyObj;
import com.max.xiaoheihe.bean.mall.MallDiscountParamsObj;
import com.max.xiaoheihe.bean.mall.MallOrderCancelTipObj;
import com.max.xiaoheihe.bean.mall.MallOrderStateObj;
import com.max.xiaoheihe.module.mall.MallAgreementActivity;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
import com.max.xiaoheihe.module.trade.TradeInfoUtilKt;
import com.max.xiaoheihe.module.webview.WebActionActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.umeng.socialize.UMShareAPI;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMImage;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.f131144d2)
@ig.d(path = {lb.d.f131144d2})
public class GameStoreOrderDetailActivity extends BaseActivity implements PaymentManager.g, com.max.hbcoco.b {
    private static final String V3 = "order_id";
    private static final int W3 = 2;
    private static final int X3 = 5;
    private static final int Y3 = 6;
    private static final int Z3 = 7;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f84938a4 = 8;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final String f84939b4 = "current_coupon";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final String f84940c4 = "current_coupon_code";
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f84941d4 = "current_hcoin_deduct";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f84942e4 = "final_cost_coin";
    private boolean G2;
    private String L;
    private GamePurchaseResultObj M;
    private MallOrderCancelTipObj N;
    private MallCouponObj O;
    private KeyDescObj P;
    private String Q;
    private String R;
    private String S;
    private UMShareListener T3;
    private GamePurchaseConditionObj U;
    private com.max.hbshare.c.b U3;
    private String V;
    private String W;
    private int X;
    private int Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f84943a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private com.max.hbcommon.view.a f84944b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private RefreshBroadcastReceiver f84945c0;

    @BindView(R.id.tv_buy_desc_desc)
    TextView mBuyDescDescTextView;

    @BindView(R.id.tv_buy_desc)
    TextView mBuyDescTextView;

    @BindView(R.id.vg_buy_desc)
    View mBuyDescView;

    @BindView(R.id.vg_confirm_info)
    View mConfirmInfoView;

    @BindView(R.id.tv_confirm_price)
    TextView mConfirmPriceTextView;

    @BindView(R.id.tv_confirm)
    TextView mConfirmTextView;

    @BindView(R.id.vg_confirm)
    View mConfirmView;

    @BindView(R.id.tv_coupon_desc)
    TextView mCouponDescTextView;

    @BindView(R.id.iv_coupon_more)
    ImageView mCouponImageView;

    @BindView(R.id.tv_coupon)
    TextView mCouponTextView;

    @BindView(R.id.vg_coupon)
    View mCouponView;

    @BindView(R.id.tv_create_time)
    TextView mCreateTimeTextView;

    @BindView(R.id.tv_deduct_desc)
    TextView mDeductDescTextView;

    @BindView(R.id.iv_deduct_more)
    ImageView mDeductImageView;

    @BindView(R.id.tv_deduct)
    TextView mDeductTextView;

    @BindView(R.id.vg_deduct)
    View mDeductView;

    @BindView(R.id.tv_deduction)
    TextView mDeductionTextView;

    @BindView(R.id.ll_discount_info)
    LinearLayout mDiscountInfoLinearLayout;

    @BindView(R.id.iv_game_img)
    ImageView mGameImgImageView;

    @BindView(R.id.vg_game_info)
    View mGameInfoView;

    @BindView(R.id.tv_game_name)
    TextView mGameNameTextView;

    @BindView(R.id.tv_keys_deadline)
    TextView mKeysDeadlineTextView;

    @BindView(R.id.ll_keys)
    LinearLayout mKeysLinearLayout;

    @BindView(R.id.tv_keys_title)
    TextView mKeysTitleTextView;

    @BindView(R.id.vg_keys)
    View mKeysView;

    @BindView(R.id.vg_message)
    View mMessageView;

    @BindView(R.id.tv_option)
    TextView mOptionTextView;

    @BindView(R.id.card_order_detail)
    View mOrderDetailView;

    @BindView(R.id.tv_order_id)
    TextView mOrderIdTextView;

    @BindView(R.id.tv_order_price_desc)
    TextView mOrderPriceDescTextView;

    @BindView(R.id.tv_order_price)
    TextView mOrderPriceTextView;

    @BindView(R.id.vg_order_price)
    View mOrderPriceView;

    @BindView(R.id.tv_order_status_desc)
    TextView mOrderStatusDescTextView;

    @BindView(R.id.ll_order_status)
    LinearLayout mOrderStatusLinearLayout;

    @BindView(R.id.vg_order_status)
    View mOrderStatusView;

    @BindView(R.id.tv_package_name_desc)
    TextView mPackageNameDescTextView;

    @BindView(R.id.tv_package_name)
    TextView mPackageNameTextView;

    @BindView(R.id.vg_package_name)
    View mPackageNameView;

    @BindView(R.id.tv_price_desc)
    TextView mPriceDescTextView;

    @BindView(R.id.tv_price)
    TextView mPriceTextView;

    @BindView(R.id.vg_price)
    View mPriceView;

    @BindView(R.id.vg_progress)
    View mProgressView;

    @BindView(R.id.tv_purchase_code_desc)
    TextView mPurchaseCodeDescTextView;

    @BindView(R.id.iv_purchase_code_more)
    ImageView mPurchaseCodeImageView;

    @BindView(R.id.tv_purchase_code)
    TextView mPurchaseCodeTextView;

    @BindView(R.id.vg_purchase_code)
    View mPurchaseCodeView;

    @BindView(R.id.vg_recharge_card_detail)
    View mRechargeCardDetailView;

    @BindView(R.id.ll_recharge_card_info)
    LinearLayout mRechargeCardInfoLinearLayout;

    @BindView(R.id.ll_recharge_cards)
    LinearLayout mRechargeCardLinearLayout;

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.tv_region_desc)
    TextView mRegionDescTextView;

    @BindView(R.id.tv_region)
    TextView mRegionTextView;

    @BindView(R.id.vg_region)
    View mRegionView;

    @BindView(R.id.tv_tips_desc)
    TextView mTipsDescTextView;

    @BindView(R.id.tv_tips_title)
    TextView mTipsTitleTextView;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private PaymentManager f84946p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private String f84947p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f84948p3;

    @BindView(R.id.vg_discount_info)
    View vg_discount_info;

    @BindView(R.id.tv_mall_agreement)
    TextView vg_mall_agreement;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private ProgressDialog f84949x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f84950x2;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private com.max.hbcommon.view.a f84952y2;
    private HashMap<String, String> T = new HashMap<>(16);

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private int f84951y1 = 1;
    private Handler G3 = new Handler();
    private List<KeyDescObj> J3 = new ArrayList();
    private boolean K3 = false;
    private boolean L3 = false;
    private boolean M3 = false;
    private boolean N3 = false;
    private boolean O3 = false;
    private boolean P3 = true;
    private String Q3 = null;
    private io.reactivex.disposables.a R3 = new io.reactivex.disposables.a();
    private View.OnClickListener S3 = new k();

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 34198, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.A.equals(intent.getAction())) {
                GameStoreOrderDetailActivity.this.n1();
            }
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f84954b;

        a(TextView textView) {
            this.f84954b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34078, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f84954b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f84954b.setFocusable(true);
            this.f84954b.setSelected(true);
        }
    }

    public class a0 extends com.max.hbcommon.network.d<Result<AutoAcceptGameParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84956b;

        public class a implements yh.a<kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoAcceptGameParamsObj f84958b;

            a(AutoAcceptGameParamsObj autoAcceptGameParamsObj) {
                this.f84958b = autoAcceptGameParamsObj;
            }

            public kotlin.b2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34120, new Class[0], kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.startActivity(GameStoreSteamTradingActivityV2.i3(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, a0.this.f84956b, this.f84958b));
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34121, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        a0(String str) {
            this.f84956b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34117, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<AutoAcceptGameParamsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34118, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                AutoAcceptGameParamsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.sendBroadcast(new Intent(lb.a.A));
                if (result2.getAcc_proxy() != null) {
                    TradeInfoUtilKt.Z(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, false, result2.getAcc_proxy().getAppid(), new a(result2));
                } else {
                    ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.startActivity(GameStoreSteamTradingActivityV2.i3(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f84956b, result2));
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34119, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AutoAcceptGameParamsObj>) obj);
        }
    }

    public class a1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34164, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class a2 extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        a2() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34194, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<PayOrderObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34195, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                GameStoreOrderDetailActivity.V3(GameStoreOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34196, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameStoreOrderKeyObj f84962b;

        b(GameStoreOrderKeyObj gameStoreOrderKeyObj) {
            this.f84962b = gameStoreOrderKeyObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34079, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f84962b.getKey());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.cdkey_copied));
        }
    }

    public class b0 extends com.max.hbcommon.network.d<Result<GamePurchaseOrderProgressObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f84965c;

        b0(String str, boolean z10) {
            this.f84964b = str;
            this.f84965c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34122, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<GamePurchaseOrderProgressObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34123, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GamePurchaseOrderProgressObj result2 = result.getResult();
                if (GameStoreOrderDetailActivity.this.X >= 15 || "1".equals(result2.getFriend()) || "2".equals(result2.getFriend())) {
                    GameStoreOrderDetailActivity.k3(GameStoreOrderDetailActivity.this, this.f84964b, 0L, result2 != null && "1".equals(result2.getFriend()), this.f84965c);
                } else {
                    GameStoreOrderDetailActivity.i3(GameStoreOrderDetailActivity.this);
                    GameStoreOrderDetailActivity.l2(GameStoreOrderDetailActivity.this, this.f84964b, this.f84965c, 2000L);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34124, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseOrderProgressObj>) obj);
        }
    }

    public class b1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f84967b;

        b1(EditText editText) {
            this.f84967b = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34165, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f84967b.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                GameStoreOrderDetailActivity.this.P = null;
                GameStoreOrderDetailActivity.J2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.K2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.L2(GameStoreOrderDetailActivity.this);
            } else {
                GameStoreOrderDetailActivity.Y3(GameStoreOrderDetailActivity.this, string);
            }
            dialogInterface.dismiss();
        }
    }

    public class b2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34192, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.d4(GameStoreOrderDetailActivity.this);
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GameStoreOrderKeyObj f84970b;

        c(GameStoreOrderKeyObj gameStoreOrderKeyObj) {
            this.f84970b = gameStoreOrderKeyObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34080, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f84970b.getKey());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.cdkey_copied));
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            gameStoreOrderDetailActivity.startActivity(GameStoreSteamTradingActivity.I2(((BaseActivity) gameStoreOrderDetailActivity).f66601b, GameStoreOrderDetailActivity.this.L, "cdkey", null, false, false));
        }
    }

    public class c0 extends com.max.hbcommon.network.d<Result<AutoAcceptGameParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f84972b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f84973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f84974d;

        public class a implements DialogInterface.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) {
                if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34128, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                dialogInterface.dismiss();
                GameStoreOrderDetailActivity.c2(GameStoreOrderDetailActivity.this);
            }
        }

        c0(String str, boolean z10, boolean z11) {
            this.f84972b = str;
            this.f84973c = z10;
            this.f84974d = z11;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34125, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.p3(GameStoreOrderDetailActivity.this);
            if (GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<AutoAcceptGameParamsObj> result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34126, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.p3(GameStoreOrderDetailActivity.this);
            if (GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                AutoAcceptGameParamsObj result2 = result.getResult();
                if (result2 == null) {
                    return;
                }
                ProxyObj android_proxy = result2.getAndroid_proxy();
                if (android_proxy != null && "1".equals(android_proxy.getBanned())) {
                    com.max.hbcommon.view.a.f fVar = new com.max.hbcommon.view.a.f(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b);
                    fVar.l(android_proxy.getMsg()).u(com.max.xiaoheihe.utils.d.n0(R.string.confirm), new a());
                    fVar.F();
                    GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                    return;
                }
                if (!"1".equals(result2.getNo_bot())) {
                    GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                    ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.sendBroadcast(new Intent(lb.a.A));
                    ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.startActivity(GameStoreSteamTradingActivity.I2(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f84972b, "gift", result2, this.f84973c, this.f84974d && "1".equals(result2.getAuto_accept())));
                    return;
                }
                GameStoreOrderDetailActivity.p3(GameStoreOrderDetailActivity.this);
                if (GameStoreOrderDetailActivity.this.Y <= 15) {
                    GameStoreOrderDetailActivity.k3(GameStoreOrderDetailActivity.this, this.f84972b, 2000L, this.f84973c, this.f84974d);
                    return;
                }
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.purchase_timeout));
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34127, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<AutoAcceptGameParamsObj>) obj);
        }
    }

    public class c1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34155, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class c2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34197, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f84979b;

        d(TextView textView) {
            this.f84979b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34081, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f84979b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f84979b.setFocusable(true);
            this.f84979b.setSelected(true);
        }
    }

    public class d0 extends com.max.hbcommon.network.d<Result<GamePurchaseParamsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34129, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<GamePurchaseParamsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34130, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                GamePurchaseParamsObj result2 = result.getResult();
                if (result2 != null) {
                    if (com.max.hbcommon.utils.c.u(result2.getFinal_cost_coin())) {
                        GameStoreOrderDetailActivity.this.V = result2.getCost_coin();
                    } else {
                        GameStoreOrderDetailActivity.this.V = result2.getFinal_cost_coin();
                    }
                }
                GameStoreOrderDetailActivity.w3(GameStoreOrderDetailActivity.this, result2);
                GameStoreOrderDetailActivity.I2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.y3(GameStoreOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34131, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseParamsObj>) obj);
        }
    }

    public class d1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34167, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreOrderDetailActivity.Z3(GameStoreOrderDetailActivity.this);
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84983b;

        e(KeyDescObj keyDescObj) {
            this.f84983b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34082, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f84983b.getKey());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.cdkey_copied));
        }
    }

    public class e0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34132, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34133, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                GameStoreOrderDetailActivity.this.L3 = true;
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131050u0);
                MallCartUtils.f90196a.C(OrderEvent.CANCEL, GameStoreOrderDetailActivity.this.M.getAppid(), null, null, GameStoreOrderDetailActivity.this.L, GameStoreOrderDetailActivity.this.Q3);
                ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34134, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class e1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34168, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ KeyDescObj f84987b;

        f(KeyDescObj keyDescObj) {
            this.f84987b = keyDescObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34083, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f84987b);
            GameStoreOrderDetailActivity.X1(GameStoreOrderDetailActivity.this, arrayList);
        }
    }

    public class f0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34135, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34136, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.sendBroadcast(new Intent(lb.a.A));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34137, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class f1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34169, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreOrderDetailActivity.Z3(GameStoreOrderDetailActivity.this);
        }
    }

    public class g implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList arrayList;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34084, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (GameStoreOrderDetailActivity.this.O != null) {
                arrayList = new ArrayList();
                arrayList.add(GameStoreOrderDetailActivity.this.O);
            } else {
                arrayList = null;
            }
            String key = GameStoreOrderDetailActivity.this.P != null ? GameStoreOrderDetailActivity.this.P.getKey() : null;
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            gameStoreOrderDetailActivity.startActivityForResult(OrderCouponListActivity.Y1(((BaseActivity) gameStoreOrderDetailActivity).f66601b, "game", GameStoreOrderDetailActivity.this.L, arrayList, key), 5);
        }
    }

    public class g0 implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 34104, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.N1(GameStoreOrderDetailActivity.this);
            GameStoreOrderDetailActivity.c2(GameStoreOrderDetailActivity.this);
            GameStoreOrderDetailActivity.p2(GameStoreOrderDetailActivity.this);
        }
    }

    public class g1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34170, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class h implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34085, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, GameStoreOrderDetailActivity.this.M.getCoupon_center_protocol());
        }
    }

    public class h0 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34139, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34140, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.success));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34141, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class h1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34171, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreOrderDetailActivity.Z3(GameStoreOrderDetailActivity.this);
        }
    }

    public class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList arrayList;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34086, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (GameStoreOrderDetailActivity.this.O != null) {
                arrayList = new ArrayList();
                arrayList.add(GameStoreOrderDetailActivity.this.O);
            } else {
                arrayList = null;
            }
            String key = GameStoreOrderDetailActivity.this.P != null ? GameStoreOrderDetailActivity.this.P.getKey() : null;
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            gameStoreOrderDetailActivity.startActivityForResult(OrderCouponListActivity.Y1(((BaseActivity) gameStoreOrderDetailActivity).f66601b, "game", GameStoreOrderDetailActivity.this.L, arrayList, key), 5);
        }
    }

    public class i0 extends com.max.hbcommon.network.d<Result<SwitchProxyObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f84998b;

        i0(ArrayList arrayList) {
            this.f84998b = arrayList;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34142, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<SwitchProxyObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34143, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                SwitchProxyObj result2 = result.getResult();
                if (result2.isCan_activite()) {
                    GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
                    gameStoreOrderDetailActivity.startActivityForResult(GameStoreNintendoTradingActivity.m2(((BaseActivity) gameStoreOrderDetailActivity).f66601b, GameStoreOrderDetailActivity.this.M.getActivate_url(), GameStoreOrderDetailActivity.this.M.getActivate_message(), this.f84998b, result2), 8);
                } else if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.fail));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34144, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SwitchProxyObj>) obj);
        }
    }

    public class i1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34172, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34087, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.h2(GameStoreOrderDetailActivity.this);
        }
    }

    public class j0 implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f85002b;

        j0(TextView textView) {
            this.f85002b = textView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 34145, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 6) {
                this.f85002b.performClick();
            }
            return false;
        }
    }

    public class j1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34173, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34077, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.M1(GameStoreOrderDetailActivity.this);
        }
    }

    public class k0 implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f85006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f85007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f85008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f85009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85010f;

        k0(long j10, TextView textView, TextView textView2, TextView textView3, String str) {
            this.f85006b = j10;
            this.f85007c = textView;
            this.f85008d = textView2;
            this.f85009e = textView3;
            this.f85010f = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 34146, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbutils.utils.n.q(editable.toString()) > this.f85006b) {
                this.f85007c.setText("输入金额超出上限");
                this.f85007c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                this.f85008d.setVisibility(8);
                this.f85009e.setEnabled(false);
                return;
            }
            this.f85007c.setText(this.f85010f);
            this.f85007c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.f85008d.setVisibility(0);
            this.f85009e.setEnabled(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class k1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34174, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.a4(GameStoreOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class l implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34089, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.i2(GameStoreOrderDetailActivity.this);
        }
    }

    public class l0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f85014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f85015c;

        l0(long j10, EditText editText) {
            this.f85014b = j10;
            this.f85015c = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34147, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f85015c.setText(String.valueOf(this.f85014b));
            EditText editText = this.f85015c;
            editText.setSelection(editText.getText().length());
        }
    }

    public class l1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34175, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class m implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ShareInfoObj f85018b;

        m(ShareInfoObj shareInfoObj) {
            this.f85018b = shareInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34090, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.j2(GameStoreOrderDetailActivity.this, this.f85018b);
        }
    }

    public class m0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f85020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f85021c;

        m0(EditText editText, com.max.hbcommon.component.i iVar) {
            this.f85020b = editText;
            this.f85021c = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34148, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(this.f85020b.getText().toString())) {
                GameStoreOrderDetailActivity.this.Q = null;
            } else {
                GameStoreOrderDetailActivity.this.Q = this.f85020b.getText().toString();
                if (!GameStoreOrderDetailActivity.this.Q.endsWith("0")) {
                    StringBuilder sb2 = new StringBuilder(GameStoreOrderDetailActivity.this.Q);
                    sb2.replace(GameStoreOrderDetailActivity.this.Q.length() - 1, GameStoreOrderDetailActivity.this.Q.length(), "0");
                    GameStoreOrderDetailActivity.this.Q = sb2.toString();
                }
            }
            this.f85021c.dismiss();
            GameStoreOrderDetailActivity.J2(GameStoreOrderDetailActivity.this);
            GameStoreOrderDetailActivity.I2(GameStoreOrderDetailActivity.this);
            GameStoreOrderDetailActivity.L2(GameStoreOrderDetailActivity.this);
        }
    }

    public class m1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34176, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.b4(GameStoreOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class n implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34091, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.k2(GameStoreOrderDetailActivity.this);
        }
    }

    public class n0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34149, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131029q3);
            intent.putExtra("title", "使用规则");
            ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b.startActivity(intent);
        }
    }

    public class n1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34166, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            gameStoreOrderDetailActivity.startActivity(MallAgreementActivity.M.a(((BaseActivity) gameStoreOrderDetailActivity).f66601b, GameStoreOrderDetailActivity.this.M.getAgreement_title(), false));
        }
    }

    public class o implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34092, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.this.mProgressView.setVisibility(0);
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            GameStoreOrderDetailActivity.l2(gameStoreOrderDetailActivity, gameStoreOrderDetailActivity.L, false, 0L);
        }
    }

    public class o0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f85028b;

        o0(com.max.hbcommon.component.i iVar) {
            this.f85028b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34150, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f85028b) == null || !iVar.isShowing()) {
                return;
            }
            this.f85028b.dismiss();
        }
    }

    public class o1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34178, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class p implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34093, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            List<GameRechargeCardObj> cards = GameStoreOrderDetailActivity.this.M.getCards();
            ArrayList arrayList = new ArrayList();
            if (cards != null && cards.size() > 0) {
                for (GameRechargeCardObj gameRechargeCardObj : cards) {
                    List<String> keys = gameRechargeCardObj.getKeys();
                    if (keys != null && keys.size() > 0) {
                        for (String str : keys) {
                            KeyDescObj keyDescObj = new KeyDescObj();
                            keyDescObj.setKey(str);
                            keyDescObj.setDesc(String.format("%s %s", gameRechargeCardObj.getCard_value(), gameRechargeCardObj.getCard_unit()));
                            arrayList.add(keyDescObj);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                GameStoreOrderDetailActivity.X1(GameStoreOrderDetailActivity.this, arrayList);
            }
        }
    }

    public class p0 implements com.max.xiaoheihe.module.mall.o.g0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f85032a;

        p0(String str) {
            this.f85032a = str;
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34153, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : GameStoreOrderDetailActivity.this.L;
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34152, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PaymentManager.A.equals(str)) {
                GameStoreOrderDetailActivity.O3(GameStoreOrderDetailActivity.this, this.f85032a);
            } else if (PaymentManager.f71427z.equals(GameStoreOrderDetailActivity.this.f84950x2)) {
                GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
                gameStoreOrderDetailActivity.f84949x1 = gameStoreOrderDetailActivity.f84946p1.M(2, this.f85032a);
            } else {
                GameStoreOrderDetailActivity gameStoreOrderDetailActivity2 = GameStoreOrderDetailActivity.this;
                gameStoreOrderDetailActivity2.f84949x1 = gameStoreOrderDetailActivity2.f84946p1.M(1, this.f85032a);
            }
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public void c(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34151, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.this.f84950x2 = str;
        }
    }

    public class p1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f85035c;

        p1(String str, boolean z10) {
            this.f85034b = str;
            this.f85035c = z10;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34179, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.l2(GameStoreOrderDetailActivity.this, this.f85034b, this.f85035c, 0L);
            dialogInterface.dismiss();
        }
    }

    public class q implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34094, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    public class q0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34154, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            gameStoreOrderDetailActivity.startActivity(MallAgreementActivity.M.a(((BaseActivity) gameStoreOrderDetailActivity).f66601b, GameStoreOrderDetailActivity.this.U.getAgreement_title(), false));
        }
    }

    public class q1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34180, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class r implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34095, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.n2(GameStoreOrderDetailActivity.this);
        }
    }

    public class r0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34138, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreOrderDetailActivity.V2(GameStoreOrderDetailActivity.this);
        }
    }

    public class r1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34181, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34096, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.o2(GameStoreOrderDetailActivity.this);
        }
    }

    public class s0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34156, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.U3(GameStoreOrderDetailActivity.this);
        }
    }

    public class s1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f85045b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f85046c;

        s1(HBShareData hBShareData, Dialog dialog) {
            this.f85045b = hBShareData;
            this.f85046c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34182, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.D(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f85045b);
            this.f85046c.dismiss();
        }
    }

    public class t extends com.max.hbcommon.network.d<Result<GamePurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f85048b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f85049c;

        t(boolean z10, boolean z11) {
            this.f85048b = z10;
            this.f85049c = z11;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34098, new Class[0], Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onComplete();
                GameStoreOrderDetailActivity.this.mRefreshLayout.A(0);
                GameStoreOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34097, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.q2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.this.mRefreshLayout.A(0);
                GameStoreOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<GamePurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34099, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.M = result.getResult();
                GameStoreOrderDetailActivity.this.N3 = true;
                GameStoreOrderDetailActivity.u2(GameStoreOrderDetailActivity.this, this.f85048b);
                if (this.f85049c) {
                    GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
                    if (gameStoreOrderDetailActivity.mConfirmTextView != null) {
                        gameStoreOrderDetailActivity.S3.onClick(GameStoreOrderDetailActivity.this.mConfirmTextView);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34100, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseResultObj>) obj);
        }
    }

    public class t0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34157, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.U3(GameStoreOrderDetailActivity.this);
            GameStoreOrderDetailActivity.V3(GameStoreOrderDetailActivity.this);
        }
    }

    public class t1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f85052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f85053c;

        t1(HBShareData hBShareData, Dialog dialog) {
            this.f85052b = hBShareData;
            this.f85053c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34183, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.C(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f85052b);
            this.f85053c.dismiss();
        }
    }

    public class u extends com.max.hbcommon.network.d<Result<MallOrderCancelTipObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34101, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                GameStoreOrderDetailActivity.this.O3 = true;
                GameStoreOrderDetailActivity.y2(GameStoreOrderDetailActivity.this);
            }
        }

        public void onNext(Result<MallOrderCancelTipObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34102, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                GameStoreOrderDetailActivity.this.N = result.getResult();
                GameStoreOrderDetailActivity.this.O3 = true;
                GameStoreOrderDetailActivity.y2(GameStoreOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34103, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderCancelTipObj>) obj);
        }
    }

    public class u0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34158, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class u1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f85057b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Dialog f85058c;

        u1(HBShareData hBShareData, Dialog dialog) {
            this.f85057b = hBShareData;
            this.f85058c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34184, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.z(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, this.f85057b);
            this.f85058c.dismiss();
        }
    }

    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34088, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.this.onBackPressed();
        }
    }

    public class v0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34159, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!"native".equals(GameStoreOrderDetailActivity.this.U.getPay_type())) {
                com.max.xiaoheihe.utils.l0.p0(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, GameStoreOrderDetailActivity.this.U.getPay_url());
            }
            dialogInterface.dismiss();
        }
    }

    public class v1 implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v1() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 34186, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 34185, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class w extends com.max.hbcommon.network.d<Result<GamePurchaseConditionObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34105, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<GamePurchaseConditionObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34106, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                GameStoreOrderDetailActivity.this.U = result.getResult();
                if (GameStoreOrderDetailActivity.this.U != null) {
                    if (!"1".equals(GameStoreOrderDetailActivity.this.U.getValid())) {
                        GameStoreOrderDetailActivity.E2(GameStoreOrderDetailActivity.this);
                        return;
                    } else {
                        if (GameStoreOrderDetailActivity.C2(GameStoreOrderDetailActivity.this, 2)) {
                            GameStoreOrderDetailActivity.D2(GameStoreOrderDetailActivity.this);
                            return;
                        }
                        return;
                    }
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.fail));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34107, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseConditionObj>) obj);
        }
    }

    public class w0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34160, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class w1 extends com.max.hbcommon.network.d<Result<WeixinQueryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f85065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f85066c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f85067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f85068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f85069f;

        w1(boolean z10, int i10, String str, String str2, String str3) {
            this.f85065b = z10;
            this.f85066c = i10;
            this.f85067d = str;
            this.f85068e = str2;
            this.f85069f = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34188, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity.this.isActive();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34187, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                if (GameStoreOrderDetailActivity.this.f84949x1 != null) {
                    GameStoreOrderDetailActivity.this.f84949x1.dismiss();
                }
                GameStoreOrderDetailActivity.this.G2 = false;
            }
        }

        public void onNext(Result<WeixinQueryObj> result) {
            int i10;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34189, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                GameStoreOrderDetailActivity.this.G2 = false;
                if (result.getResult() != null) {
                    String state = result.getResult().getState();
                    com.max.hbcommon.utils.d.b("zzzzmalltest", "queryOutOrder state==" + state);
                    if ("6".equals(state)) {
                        if (!this.f85065b && this.f85066c < GameStoreOrderDetailActivity.this.f84951y1) {
                            GameStoreOrderDetailActivity.i4(GameStoreOrderDetailActivity.this, this.f85067d, this.f85068e, "0", this.f85066c + 1, this.f85065b);
                            return;
                        }
                        boolean z10 = this.f85065b;
                        if (z10 && (i10 = this.f85066c) < 49) {
                            GameStoreOrderDetailActivity.i4(GameStoreOrderDetailActivity.this, this.f85067d, this.f85068e, "0", i10 + 1, z10);
                            return;
                        }
                        if (GameStoreOrderDetailActivity.this.f84949x1 != null) {
                            GameStoreOrderDetailActivity.this.f84949x1.dismiss();
                        }
                        GameStoreOrderDetailActivity.j4(GameStoreOrderDetailActivity.this);
                        return;
                    }
                    if ("1".equals(state)) {
                        if (GameStoreOrderDetailActivity.this.f84949x1 != null) {
                            GameStoreOrderDetailActivity.this.f84949x1.dismiss();
                        }
                        GameStoreOrderDetailActivity.V3(GameStoreOrderDetailActivity.this);
                        return;
                    }
                    if (GameStoreOrderDetailActivity.this.f84949x1 != null) {
                        GameStoreOrderDetailActivity.this.f84949x1.dismiss();
                    }
                    if (!"1".equals(this.f85069f)) {
                        GameStoreOrderDetailActivity.j4(GameStoreOrderDetailActivity.this);
                    } else {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.d("支付失败");
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34190, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WeixinQueryObj>) obj);
        }
    }

    public class x extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85071b;

        x(String str) {
            this.f85071b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34108, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<KeyDescObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34109, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                KeyDescObj result2 = result.getResult();
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getDesc())) {
                    GameStoreOrderDetailActivity.this.P = null;
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(GameStoreOrderDetailActivity.this.getString(R.string.invalid_coupon_code));
                    } else {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(result.getMsg());
                    }
                } else {
                    GameStoreOrderDetailActivity.this.P = new KeyDescObj();
                    GameStoreOrderDetailActivity.this.P.setKey(this.f85071b);
                    GameStoreOrderDetailActivity.this.P.setDesc(result2.getDesc());
                }
                GameStoreOrderDetailActivity.this.Q = "";
                GameStoreOrderDetailActivity.I2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.J2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.K2(GameStoreOrderDetailActivity.this);
                GameStoreOrderDetailActivity.L2(GameStoreOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34110, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    public class x0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34161, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class x1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34191, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreOrderDetailActivity.this.f84947p2 = null;
            GameStoreOrderDetailActivity.this.f84950x2 = null;
        }
    }

    public class y extends com.max.hbcommon.network.d<Result<GamePurchaseResultObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f85075b;

        y(boolean z10) {
            this.f85075b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34111, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<GamePurchaseResultObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34112, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                GamePurchaseResultObj result2 = result.getResult();
                if (result2 != null) {
                    String order_id = result2.getOrder_id();
                    if ("1".equals(result2.getNot_finish_order())) {
                        GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                        GameStoreOrderDetailActivity.O2(GameStoreOrderDetailActivity.this, order_id, this.f85075b);
                        return;
                    }
                    if ("cdkey".equalsIgnoreCase(GameStoreOrderDetailActivity.this.S)) {
                        GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                        com.max.xiaoheihe.utils.d.o(((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, result2.getCdkey());
                        GameStoreOrderDetailActivity.S2(GameStoreOrderDetailActivity.this, result2);
                    } else if ("gift".equalsIgnoreCase(GameStoreOrderDetailActivity.this.S)) {
                        GameStoreOrderDetailActivity.S2(GameStoreOrderDetailActivity.this, result2);
                        GameStoreOrderDetailActivity.T2(GameStoreOrderDetailActivity.this, order_id, this.f85075b, 0L);
                    } else {
                        GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
                        GameStoreOrderDetailActivity.S2(GameStoreOrderDetailActivity.this, result2);
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34113, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<GamePurchaseResultObj>) obj);
        }
    }

    public class y0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34162, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.module.account.utils.l.D(GameStoreOrderDetailActivity.this.V0(), ((BaseActivity) GameStoreOrderDetailActivity.this).f66601b, false, true, 0);
            dialogInterface.dismiss();
        }
    }

    public class y1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f85079c;

        y1(String str, String str2) {
            this.f85078b = str;
            this.f85079c = str2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 34177, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            gameStoreOrderDetailActivity.startActivity(com.max.xiaoheihe.module.game.z.b(((BaseActivity) gameStoreOrderDetailActivity).f66601b, null, this.f85078b, this.f85079c, null, com.max.xiaoheihe.utils.i0.m(), com.max.xiaoheihe.utils.i0.j(), null));
        }
    }

    public class z extends com.max.hbcommon.network.d<Result<MallOrderStateObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f85081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f85082c;

        z(String str, boolean z10) {
            this.f85081b = str;
            this.f85082c = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 34114, new Class[]{Throwable.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                GameStoreOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<MallOrderStateObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 34115, new Class[]{Result.class}, Void.TYPE).isSupported && GameStoreOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                if (result == null || result.getResult() == null || !"2".equals(result.getResult().getVersion())) {
                    GameStoreOrderDetailActivity.l2(GameStoreOrderDetailActivity.this, this.f85081b, this.f85082c, 0L);
                } else {
                    GameStoreOrderDetailActivity.W2(GameStoreOrderDetailActivity.this, this.f85081b);
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 34116, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderStateObj>) obj);
        }
    }

    public class z0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34163, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class z1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        z1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 34193, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            GameStoreOrderDetailActivity gameStoreOrderDetailActivity = GameStoreOrderDetailActivity.this;
            GameStoreOrderDetailActivity.i4(gameStoreOrderDetailActivity, gameStoreOrderDetailActivity.f84947p2, GameStoreOrderDetailActivity.this.f84950x2, "1", 1, false);
        }
    }

    public GameStoreOrderDetailActivity() {
        v1 v1Var = new v1();
        this.T3 = v1Var;
        this.U3 = new com.max.hbshare.c.b(com.max.hbshare.c.f72545a, v1Var);
    }

    private void A4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33985, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.O3 = false;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z4(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new u()));
    }

    private void B4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33983, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        C4(false, false);
    }

    static /* synthetic */ boolean C2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, new Integer(i10)}, null, changeQuickRedirect, true, 34054, new Class[]{GameStoreOrderDetailActivity.class, Integer.TYPE}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : gameStoreOrderDetailActivity.n4(i10);
    }

    private void C4(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33984, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.N3 = false;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ea(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t(z11, z10)));
    }

    static /* synthetic */ void D2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34055, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.p4();
    }

    private void D4(String str, boolean z10, long j10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10)}, this, changeQuickRedirect, false, 33992, new Class[]{String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().X5(str).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new b0(str, z10)));
    }

    static /* synthetic */ void E2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34056, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.Z4();
    }

    private long[] E4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34002, new Class[0], long[].class);
        if (patchProxyResultProxy.isSupported) {
            return (long[]) patchProxyResultProxy.result;
        }
        long[] jArr = new long[2];
        String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(this.V) + com.max.hbutils.utils.n.r(this.Q));
        if (this.M.getMax_deduct_coin() < 0) {
            jArr[0] = com.max.hbutils.utils.n.r(strValueOf);
        } else {
            jArr[0] = Math.min(com.max.hbutils.utils.n.r(strValueOf), this.M.getMax_deduct_coin());
        }
        jArr[1] = Math.min(com.max.hbutils.utils.n.r(this.M.getTotal_coin()), jArr[0]);
        return jArr;
    }

    private HashMap<String, String> F4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34001, new Class[0], HashMap.class);
        if (patchProxyResultProxy.isSupported) {
            return (HashMap) patchProxyResultProxy.result;
        }
        HashMap<String, String> map = new HashMap<>(16);
        MallCouponObj mallCouponObj = this.O;
        if (mallCouponObj != null) {
            map.put("coupon_id", mallCouponObj.getCoupon_id());
        }
        KeyDescObj keyDescObj = this.P;
        if (keyDescObj != null) {
            map.put("purchase_code", keyDescObj.getKey());
        }
        if (!com.max.hbcommon.utils.c.u(this.Q)) {
            map.put("deduct_coin", this.Q);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84950x2)) {
            map.put("pay_type", this.f84950x2);
        }
        if (!com.max.hbcommon.utils.c.u(this.f84947p2)) {
            map.put("out_order_id", this.f84947p2);
        }
        return map;
    }

    private void G4(ArrayList<KeyDescObj> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 33998, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().T6().I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i0(arrayList)));
    }

    private void H4() {
        com.max.hbcommon.view.a aVar;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34007, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing() || (aVar = this.f84944b0) == null || !aVar.isShowing()) {
            return;
        }
        this.f84944b0.dismiss();
    }

    static /* synthetic */ void I2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34057, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.T4();
    }

    private TextView I4(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33978, new Class[]{String.class}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(this.f66601b);
        textView.setPadding(ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f), ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f));
        textView.setTextColor(this.f66601b.getResources().getColor(R.color.interactive_color));
        textView.setTextSize(0, this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setIncludeFontPadding(false);
        textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_interactive_border_2dp));
        textView.setText(getString(R.string.view_help));
        textView.setOnClickListener(new q());
        return textView;
    }

    static /* synthetic */ void J2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34058, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.t5();
    }

    private TextView J4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33981, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(this.f66601b);
        textView.setPadding(ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f), ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f));
        textView.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_2_color));
        textView.setTextSize(0, this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setIncludeFontPadding(false);
        textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_tile_bg_border_2dp));
        textView.setText(getString(R.string.receive_success));
        textView.setClickable(false);
        return textView;
    }

    static /* synthetic */ void K2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34059, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.W4();
    }

    private TextView K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33979, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(this.f66601b);
        textView.setPadding(ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f), ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f));
        textView.setTextColor(this.f66601b.getResources().getColor(R.color.interactive_color));
        textView.setTextSize(0, this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setIncludeFontPadding(false);
        textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_interactive_border_2dp));
        textView.setText(getString(R.string.receive_success));
        textView.setOnClickListener(new r());
        return textView;
    }

    static /* synthetic */ void L2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34060, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.v4();
    }

    private TextView L4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33980, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(this.f66601b);
        textView.setPadding(ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f), ViewUtils.f(this.f66601b, 10.0f), ViewUtils.f(this.f66601b, 5.0f));
        textView.setTextColor(this.f66601b.getResources().getColor(R.color.interactive_color));
        textView.setTextSize(0, this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setIncludeFontPadding(false);
        textView.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.btn_interactive_border_2dp));
        textView.setText(getString(R.string.refuse_gift));
        textView.setOnClickListener(new s());
        return textView;
    }

    static /* synthetic */ void M1(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34037, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.r4();
    }

    /* JADX WARN: Code duplicated, block: B:158:0x091b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0937  */
    private void M4(boolean z10) {
        int i10;
        String str;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        boolean z13 = false;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33966, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        c5();
        GamePurchaseResultObj gamePurchaseResultObj = this.M;
        if (gamePurchaseResultObj == null) {
            return;
        }
        MallCartUtils.f90196a.s(this.mMessageView, gamePurchaseResultObj.getNotify_message());
        this.T.clear();
        for (Map.Entry<String, String> entry : this.M.getParams().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if ("appid".equalsIgnoreCase(key)) {
                this.R = entry.getValue();
            } else if (com.max.xiaoheihe.module.mall.i.I.equalsIgnoreCase(key)) {
                this.S = entry.getValue();
            }
            this.T.put(key, value);
        }
        t5();
        this.W = this.M.getProduct_state();
        String product_type = this.M.getProduct_type();
        int iQ = com.max.hbutils.utils.n.q("1");
        int iQ2 = com.max.hbutils.utils.n.q("9");
        int iQ3 = com.max.hbutils.utils.n.q(this.W);
        if (com.max.hbcommon.utils.c.u(this.V)) {
            this.V = this.M.getPrice();
        }
        if (com.max.hbcommon.utils.c.v(this.M.getAgreement_title(), this.M.getService_agreement())) {
            this.vg_mall_agreement.setVisibility(8);
        } else {
            this.vg_mall_agreement.setVisibility(0);
            this.vg_mall_agreement.setText(this.M.getAgreement_title());
            this.vg_mall_agreement.setOnClickListener(new n1());
        }
        this.mTipsTitleTextView.setText(this.M.getTitle());
        this.mTipsDescTextView.setText(this.M.getMsg());
        if ("5".equals(product_type) || this.M.getKeys() == null || this.M.getKeys().size() <= 0) {
            this.mKeysView.setVisibility(8);
        } else {
            this.mKeysView.setVisibility(0);
            this.mKeysTitleTextView.setText(!com.max.hbcommon.utils.c.u(this.M.getKeys().get(0).getTitle()) ? this.M.getKeys().get(0).getTitle() : getString(R.string.cd_key));
            V4();
            if (com.max.hbcommon.utils.c.u(this.M.getKeys().get(0).getDeadline())) {
                this.mKeysDeadlineTextView.setVisibility(8);
            } else {
                this.mKeysDeadlineTextView.setVisibility(0);
                this.mKeysDeadlineTextView.setText(String.format(getString(R.string.deadline_format), this.M.getKeys().get(0).getDeadline()));
            }
        }
        this.mOrderIdTextView.setText(getString(R.string.order_number) + ": " + this.M.getOrder_id());
        this.mCreateTimeTextView.setText(this.M.getTime_desc());
        this.mGameInfoView.setVisibility(0);
        com.max.hbimage.b.L(this.M.getGame_img(), this.mGameImgImageView, R.drawable.common_default_placeholder_375x210);
        this.mGameNameTextView.setText(this.M.getGame_name());
        String appid = this.M.getAppid();
        String game_type = this.M.getGame_type();
        if (com.max.hbcommon.utils.c.u(appid)) {
            this.mGameInfoView.setClickable(false);
        } else {
            this.mGameInfoView.setOnClickListener(new y1(appid, game_type));
        }
        if ("5".equals(product_type)) {
            this.mRechargeCardInfoLinearLayout.setVisibility(0);
            if (this.M.getCards() != null) {
                this.mRechargeCardInfoLinearLayout.removeAllViews();
                Iterator<GameRechargeCardObj> it = this.M.getCards().iterator();
                double dO = 0.0d;
                String str2 = "";
                while (it.hasNext()) {
                    GameRechargeCardObj next = it.next();
                    View viewInflate = this.f66602c.inflate(R.layout.item_card_purchase_desc, this.mRechargeCardInfoLinearLayout, z13);
                    TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
                    TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
                    int i13 = iQ2;
                    textView.setText(String.format("%s %s", next.getCard_value(), next.getCard_unit()));
                    textView2.setText(String.format("×%s", next.getCount()));
                    this.mRechargeCardInfoLinearLayout.addView(viewInflate);
                    String card_unit = next.getCard_unit();
                    dO += com.max.hbutils.utils.n.o(next.getCount()) * com.max.hbutils.utils.n.o(next.getCard_value());
                    str2 = card_unit;
                    it = it;
                    iQ2 = i13;
                    z13 = false;
                }
                i10 = iQ2;
                View viewInflate2 = this.f66602c.inflate(R.layout.divider, (ViewGroup) this.mRechargeCardInfoLinearLayout, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate2.getLayoutParams();
                int iF = ViewUtils.f(this.f66601b, 10.0f);
                marginLayoutParams.rightMargin = iF;
                marginLayoutParams.leftMargin = iF;
                viewInflate2.setLayoutParams(marginLayoutParams);
                this.mRechargeCardInfoLinearLayout.addView(viewInflate2);
                View viewInflate3 = this.f66602c.inflate(R.layout.item_card_purchase_desc, (ViewGroup) this.mRechargeCardInfoLinearLayout, false);
                TextView textView3 = (TextView) viewInflate3.findViewById(R.id.tv_name);
                TextView textView4 = (TextView) viewInflate3.findViewById(R.id.tv_desc);
                textView3.setText(getString(R.string.total_recharge_card_price));
                double dO2 = com.max.hbutils.utils.n.o(this.M.getRate()) * dO;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(com.max.xiaoheihe.module.game.r1.J(dO2 + ""));
                sb2.append(getString(R.string.price_unit));
                String string = sb2.toString();
                i12 = 0;
                textView4.setText(String.format("%s %s%s", com.max.xiaoheihe.module.game.r1.J(dO + ""), str2, String.format("(%s)", string)));
                this.mRechargeCardInfoLinearLayout.addView(viewInflate3);
            } else {
                i10 = iQ2;
                i12 = 0;
            }
            this.mRegionView.setVisibility(i12);
            TextView textView5 = this.mRegionDescTextView;
            Object[] objArr = new Object[1];
            objArr[i12] = getString(R.string.region_server);
            str = "%1$s:";
            textView5.setText(String.format(str, objArr));
            this.mRegionTextView.setText(this.M.getCard_region());
            this.mPackageNameView.setVisibility(8);
            this.mBuyDescView.setVisibility(8);
            this.mPriceView.setVisibility(8);
        } else {
            iQ = iQ;
            i10 = iQ2;
            str = "%1$s:";
            this.mRechargeCardInfoLinearLayout.setVisibility(8);
            this.mRegionView.setVisibility(8);
            this.mPackageNameView.setVisibility(0);
            this.mPackageNameDescTextView.setText(String.format(str, getString(R.string.game_version)));
            this.mPackageNameTextView.setText(this.M.getPackage_name());
            this.mBuyDescView.setVisibility(0);
            this.mBuyDescDescTextView.setText(String.format(str, getString(R.string.shipping_method)));
            this.mBuyDescTextView.setText(this.M.getBuy_desc());
            this.mPriceView.setVisibility(0);
            this.mPriceDescTextView.setText(String.format(str, getString(R.string.price)));
            if (com.max.hbcommon.utils.c.u(this.M.getBuy_extra_desc())) {
                this.mPriceTextView.setText(String.format("%s%s", com.max.xiaoheihe.module.game.r1.F(this.M.getPrice()), getString(R.string.price_unit)));
            } else {
                this.mPriceTextView.setText(this.M.getBuy_extra_desc());
            }
        }
        if (com.max.hbcommon.utils.c.u(this.M.getCost_coin())) {
            this.mOrderPriceView.setVisibility(8);
        } else {
            this.mOrderPriceView.setVisibility(0);
            this.mOrderPriceDescTextView.setText(String.format(str, getString(R.string.order_price)));
            this.mOrderPriceTextView.setText(com.max.xiaoheihe.module.game.r1.F(this.M.getCost_coin()) + getString(R.string.price_unit));
        }
        if ("1".equals(this.W)) {
            this.M3 = true;
        }
        if ("1".equals(this.W) && "5".equals(product_type)) {
            this.mCouponView.setVisibility(8);
            this.mPurchaseCodeView.setVisibility(8);
            this.mDeductView.setVisibility(8);
            this.mOrderStatusView.setVisibility(8);
            this.mRechargeCardDetailView.setVisibility(0);
            List<GameRechargeCardObj> cards = this.M.getCards();
            this.J3.clear();
            if (cards != null && cards.size() > 0) {
                for (GameRechargeCardObj gameRechargeCardObj : cards) {
                    List<String> keys = gameRechargeCardObj.getKeys();
                    if (keys != null && keys.size() > 0) {
                        for (String str3 : keys) {
                            KeyDescObj keyDescObj = new KeyDescObj();
                            keyDescObj.setKey(str3);
                            keyDescObj.setDesc(String.format("%s %s", gameRechargeCardObj.getCard_value(), gameRechargeCardObj.getCard_unit()));
                            this.J3.add(keyDescObj);
                        }
                    }
                }
            }
            X4();
            this.mConfirmInfoView.setVisibility(8);
            k5();
        } else if ("1".equals(this.W) && !"2".equals(product_type)) {
            this.mCouponView.setVisibility(8);
            this.mPurchaseCodeView.setVisibility(8);
            this.mDeductView.setVisibility(8);
            this.mOrderStatusView.setVisibility(8);
            if (this.M.getShare_info() != null) {
                this.mConfirmView.setVisibility(0);
                o5();
            } else {
                this.mConfirmView.setVisibility(8);
            }
        } else if ("-100".equals(this.W)) {
            this.mCouponView.setVisibility(8);
            this.mPurchaseCodeView.setVisibility(8);
            this.mDeductView.setVisibility(8);
            this.mOrderStatusView.setVisibility(8);
            this.mConfirmView.setVisibility(8);
        } else {
            if (!"-3".equals(this.W) || !"2".equals(product_type)) {
                if ("100".equals(this.W)) {
                    this.mCouponView.setVisibility(0);
                    this.mCouponDescTextView.setText(String.format(str, getString(R.string.coupon)));
                    if ("1".equalsIgnoreCase(this.M.getUse_code())) {
                        this.mPurchaseCodeView.setVisibility(0);
                        this.mPurchaseCodeDescTextView.setText(String.format(str, getString(R.string.coupon_code)));
                        W4();
                        i11 = 8;
                    } else {
                        i11 = 8;
                        this.mPurchaseCodeView.setVisibility(8);
                    }
                    this.mOrderStatusView.setVisibility(i11);
                    this.mConfirmView.setVisibility(0);
                    b5();
                    if (this.M.getPurchase_params() != null) {
                        this.f84950x2 = this.M.getPurchase_params().getPay_type();
                        this.f84947p2 = this.M.getPurchase_params().getOut_order_id();
                        com.max.hbcommon.utils.d.b("zzzzmalltest", "mOrderDetailObj.getPurchase_params()!=null");
                        this.Q = this.M.getPurchase_params().getDeduct_coin();
                        if (!com.max.hbcommon.utils.c.u(this.M.getPurchase_params().getCoupon_id())) {
                            MallCouponObj mallCouponObj = new MallCouponObj();
                            this.O = mallCouponObj;
                            mallCouponObj.setCoupon_id(this.M.getPurchase_params().getCoupon_id());
                        }
                        if (!com.max.hbcommon.utils.c.u(this.M.getPurchase_params().getPurchase_code())) {
                            KeyDescObj keyDescObj2 = new KeyDescObj();
                            this.P = keyDescObj2;
                            keyDescObj2.setKey(this.M.getPurchase_params().getPurchase_code());
                        }
                        t5();
                        Q4(this.f84947p2, this.f84950x2, "0", 0, z10);
                    }
                    S4();
                    T4();
                    R4();
                    v4();
                    z12 = true;
                } else if (iQ3 >= iQ && iQ3 <= i10 && "2".equals(product_type)) {
                    this.mCouponView.setVisibility(8);
                    this.mPurchaseCodeView.setVisibility(8);
                    this.mDeductView.setVisibility(8);
                    this.mOrderStatusView.setVisibility(8);
                    this.mConfirmView.setVisibility(0);
                    q5();
                    this.mConfirmInfoView.setVisibility(8);
                    this.mConfirmTextView.setVisibility(8);
                } else if ("10".equals(this.W) && "2".equals(product_type)) {
                    this.mCouponView.setVisibility(8);
                    this.mPurchaseCodeView.setVisibility(8);
                    this.mDeductView.setVisibility(8);
                    this.mOrderStatusView.setVisibility(0);
                    this.mOrderStatusDescTextView.setText(String.format(str, getString(R.string.choose_gift_state)));
                    this.mOrderStatusLinearLayout.removeAllViews();
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = ViewUtils.f(this.f66601b, 4.0f);
                    layoutParams.gravity = 16;
                    if (!com.max.hbcommon.utils.c.u(this.M.getFaq())) {
                        this.mOrderStatusLinearLayout.addView(I4(this.M.getFaq()), layoutParams);
                    }
                    this.mOrderStatusLinearLayout.addView(K4(), layoutParams);
                    this.mConfirmView.setVisibility(0);
                    q5();
                    this.mConfirmInfoView.setVisibility(8);
                    o5();
                } else if ("11".equals(this.W) && "2".equals(product_type)) {
                    this.mCouponView.setVisibility(8);
                    this.mPurchaseCodeView.setVisibility(8);
                    this.mDeductView.setVisibility(8);
                    this.mOrderStatusView.setVisibility(0);
                    this.mOrderStatusDescTextView.setText(String.format(str, getString(R.string.choose_gift_state)));
                    this.mOrderStatusLinearLayout.removeAllViews();
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.leftMargin = ViewUtils.f(this.f66601b, 4.0f);
                    layoutParams2.gravity = 16;
                    if (!com.max.hbcommon.utils.c.u(this.M.getFaq())) {
                        this.mOrderStatusLinearLayout.addView(I4(this.M.getFaq()), layoutParams2);
                    }
                    this.mOrderStatusLinearLayout.addView(L4(), layoutParams2);
                    this.mOrderStatusLinearLayout.addView(K4(), layoutParams2);
                    this.mConfirmView.setVisibility(0);
                    q5();
                    this.mConfirmInfoView.setVisibility(8);
                    o5();
                } else {
                    if ("12".equals(this.W) && "2".equals(product_type)) {
                        this.mCouponView.setVisibility(8);
                        this.mPurchaseCodeView.setVisibility(8);
                        this.mDeductView.setVisibility(8);
                        z11 = false;
                        this.mOrderStatusView.setVisibility(0);
                        this.mConfirmView.setVisibility(0);
                        this.mOrderStatusDescTextView.setText(String.format(str, getString(R.string.gift_state)));
                        this.mOrderStatusLinearLayout.removeAllViews();
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams3.leftMargin = ViewUtils.f(this.f66601b, 4.0f);
                        layoutParams3.gravity = 16;
                        if (!com.max.hbcommon.utils.c.u(this.M.getFaq())) {
                            this.mOrderStatusLinearLayout.addView(I4(this.M.getFaq()), layoutParams3);
                        }
                        this.mOrderStatusLinearLayout.addView(J4(), layoutParams3);
                        q5();
                        this.mConfirmInfoView.setVisibility(8);
                        if (this.M.getShare_info() != null) {
                            o5();
                        } else {
                            this.mConfirmTextView.setVisibility(8);
                        }
                    } else {
                        z11 = false;
                        this.mCouponView.setVisibility(8);
                        this.mPurchaseCodeView.setVisibility(8);
                        this.mDeductView.setVisibility(8);
                        this.mOrderStatusView.setVisibility(8);
                        this.mConfirmView.setVisibility(8);
                    }
                    z12 = z11;
                }
                if (z12) {
                    this.f66616q.setAction(getString(R.string.cancel_order));
                    this.f66616q.setActionOnClickListener(new b2());
                    this.f66616q.setActionIcon((Drawable) null);
                } else {
                    this.f66616q.setAction((CharSequence) null);
                    this.f66616q.setActionIcon(R.drawable.common_service);
                    this.f66616q.setActionIconOnClickListener(new c2());
                }
            }
            this.mCouponView.setVisibility(8);
            this.mPurchaseCodeView.setVisibility(8);
            this.mDeductView.setVisibility(8);
            this.mOrderStatusView.setVisibility(8);
            this.mConfirmView.setVisibility(8);
        }
        z12 = false;
        if (z12) {
            this.f66616q.setAction(getString(R.string.cancel_order));
            this.f66616q.setActionOnClickListener(new b2());
            this.f66616q.setActionIcon((Drawable) null);
        } else {
            this.f66616q.setAction((CharSequence) null);
            this.f66616q.setActionIcon(R.drawable.common_service);
            this.f66616q.setActionIconOnClickListener(new c2());
        }
    }

    static /* synthetic */ void N1(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34038, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.s5();
    }

    private void N4(GamePurchaseResultObj gamePurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{gamePurchaseResultObj}, this, changeQuickRedirect, false, 33982, new Class[]{GamePurchaseResultObj.class}, Void.TYPE).isSupported || gamePurchaseResultObj == null) {
            return;
        }
        this.Q3 = gamePurchaseResultObj.getH_src();
        MallCartUtils.f90196a.C(OrderEvent.SUCCESS, gamePurchaseResultObj.getAppid(), null, null, this.L, this.Q3);
        if ("cdkey".equalsIgnoreCase(this.S)) {
            Intent intent = new Intent(lb.a.A);
            intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
            this.f66601b.sendBroadcast(intent);
            startActivity(GameStorePurchaseShareActivity.f2(this.f66601b, this.L, this.S));
            finish();
            return;
        }
        if ("gift".equalsIgnoreCase(this.S)) {
            return;
        }
        Intent intent2 = new Intent(lb.a.A);
        intent2.putExtra(lb.a.f130996l0, lb.a.f131056v0);
        this.f66601b.sendBroadcast(intent2);
        String title = gamePurchaseResultObj.getTitle();
        String msg = gamePurchaseResultObj.getMsg();
        if (com.max.hbcommon.utils.c.u(title) && com.max.hbcommon.utils.c.u(msg)) {
            title = getString(R.string.purchase_succeed);
        }
        j5(title, msg);
    }

    static /* synthetic */ void O2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34061, new Class[]{GameStoreOrderDetailActivity.class, String.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.f5(str, z10);
    }

    static /* synthetic */ void O3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str}, null, changeQuickRedirect, true, 34068, new Class[]{GameStoreOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.x4(str);
    }

    private void O4() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34006, new Class[0], Void.TYPE).isSupported && "100".equals(this.W)) {
            if ("cdkey".equalsIgnoreCase(this.S)) {
                P4(false);
            } else if ("gift".equalsIgnoreCase(this.S)) {
                P4(true);
            } else {
                P4(false);
            }
        }
    }

    private void P4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 33989, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        GamePurchaseResultObj gamePurchaseResultObj = this.M;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().j4(this.L, F4(), (gamePurchaseResultObj == null || gamePurchaseResultObj.getPurchase_params() == null) ? this.V : this.M.getPurchase_params().getPay_price()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new y(z10)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0079  */
    private void Q4(String str, String str2, String str3, int i10, boolean z10) {
        int i11 = 1;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34032, new Class[]{String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null || this.G2) {
            return;
        }
        this.G2 = true;
        this.f84949x1.setMessage("正在检测订单状态...");
        if (!this.f84949x1.isShowing() && !z10) {
            this.f84949x1.show();
        }
        if (!z10) {
            i11 = 2;
        } else if (i10 > 30) {
            i11 = 10;
        } else if (i10 > 10) {
            i11 = 4;
        } else if (i10 > 5) {
            i11 = 2;
        }
        this.R3.c((io.reactivex.disposables.b) this.f84946p1.C(str2, str, str3).C1(i11, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new w1(z10, i10, str, str2, str3)));
    }

    private void R4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33970, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        long jR = com.max.hbutils.utils.n.r(this.V);
        long jR2 = com.max.hbutils.utils.n.r(this.M.getPrice());
        if (jR >= jR2) {
            this.mDeductionTextView.setText((CharSequence) null);
            this.mConfirmPriceTextView.setText(String.format(getString(R.string.total_rmb_price_format), com.max.xiaoheihe.module.game.r1.F(jR2 + "")));
            return;
        }
        long j10 = jR2 - jR;
        this.mDeductionTextView.setText(String.format(getString(R.string.deduction_price_format), com.max.xiaoheihe.module.game.r1.F(j10 + "")));
        this.mConfirmPriceTextView.setText(String.format(getString(R.string.total_rmb_price_format), com.max.xiaoheihe.module.game.r1.F(this.V)));
    }

    static /* synthetic */ void S2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, GamePurchaseResultObj gamePurchaseResultObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, gamePurchaseResultObj}, null, changeQuickRedirect, true, 34062, new Class[]{GameStoreOrderDetailActivity.class, GamePurchaseResultObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.N4(gamePurchaseResultObj);
    }

    private void S4() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33971, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.M.getPurchase_params() != null) {
            this.mCouponView.setVisibility(8);
            return;
        }
        this.mCouponView.setVisibility(0);
        if (com.max.hbutils.utils.n.q(this.M.getCoupon_count()) <= 0) {
            if (com.max.hbcommon.utils.c.u(this.M.getAvailable_coupon_count()) || com.max.hbcommon.utils.c.u(this.M.getCoupon_center_protocol())) {
                this.mCouponTextView.setText(getString(R.string.not_available_for_use));
                this.mCouponView.setOnClickListener(new i());
                return;
            } else {
                this.mCouponTextView.setTextColor(getResources().getColor(R.color.interactive_color));
                this.mCouponTextView.setText(String.format(getString(R.string.available_coupon_count), this.M.getAvailable_coupon_count()));
                this.mCouponView.setOnClickListener(new h());
                return;
            }
        }
        MallCouponObj mallCouponObj = this.O;
        if (mallCouponObj != null) {
            if (!"8".equals(mallCouponObj.getCoupon_type()) && !"9".equals(this.O.getCoupon_type())) {
                str = this.O.getValue() + getString(R.string.price_unit);
            } else if (com.max.hbutils.utils.n.q(this.O.getValue()) % 10 == 0) {
                str = (com.max.hbutils.utils.n.q(this.O.getValue()) / 10) + "折";
            } else {
                str = this.O.getValue() + "折";
            }
            this.mCouponTextView.setText(str);
        } else {
            this.mCouponTextView.setText(String.format(getString(R.string.available_coupon_format), this.M.getCoupon_count()));
        }
        this.mCouponView.setOnClickListener(new g());
    }

    static /* synthetic */ void T2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str, boolean z10, long j10) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10)}, null, changeQuickRedirect, true, 34063, new Class[]{GameStoreOrderDetailActivity.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.w4(str, z10, j10);
    }

    private void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33972, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.M.getPurchase_params() != null || !"true".equals(this.M.getEnable_deduct()) || this.M.getMax_deduct_coin() == 0) {
            this.mDeductView.setVisibility(8);
            return;
        }
        this.mDeductView.setVisibility(0);
        if (com.max.hbcommon.utils.c.u(this.Q)) {
            this.mDeductTextView.setTextColor(getResources().getColor(R.color.text_primary_2_color));
            this.mDeductTextView.setText("点击输入");
        } else {
            this.mDeductTextView.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            this.mDeductTextView.setText("-¥ " + (com.max.hbutils.utils.n.p(this.Q) / 1000.0f));
        }
        String str = " (可抵扣¥" + (E4()[1] / 1000.0f) + ")";
        this.mDeductDescTextView.setText("H币抵现" + str);
        this.mDeductView.setOnClickListener(new j());
    }

    static /* synthetic */ void U3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34069, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.H4();
    }

    private void U4(GamePurchaseParamsObj gamePurchaseParamsObj) {
        GamePurchaseResultObj gamePurchaseResultObj;
        if (PatchProxy.proxy(new Object[]{gamePurchaseParamsObj}, this, changeQuickRedirect, false, 34035, new Class[]{GamePurchaseParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        List<MallDiscountParamsObj> discount_params = gamePurchaseParamsObj != null ? gamePurchaseParamsObj.getDiscount_params() : null;
        if (discount_params == null && (gamePurchaseResultObj = this.M) != null) {
            discount_params = gamePurchaseResultObj.getDiscount_params();
        }
        com.max.xiaoheihe.module.mall.o.i(this.f66601b, discount_params, this.vg_discount_info, this.mDiscountInfoLinearLayout);
        this.mConfirmPriceTextView.setText(String.format(getString(R.string.rmb_format), com.max.xiaoheihe.module.game.r1.F(this.V)));
    }

    static /* synthetic */ void V2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34041, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    static /* synthetic */ void V3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34070, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.O4();
    }

    private void V4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33968, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        int size = this.M.getKeys() != null ? this.M.getKeys().size() : 0;
        if (size > 0) {
            this.mKeysLinearLayout.removeAllViews();
            int i10 = 0;
            while (i10 < size) {
                GameStoreOrderKeyObj gameStoreOrderKeyObj = this.M.getKeys().get(i10);
                View viewInflate = this.f66602c.inflate(R.layout.item_activate_recharge_cards, (ViewGroup) this.mKeysLinearLayout, false);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
                marginLayoutParams.topMargin = i10 > 0 ? ViewUtils.f(this.f66601b, 10.0f) : 0;
                viewInflate.setLayoutParams(marginLayoutParams);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_card_desc);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_key);
                TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_copy_key);
                TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_activate_key);
                textView.setVisibility(8);
                textView2.setText(gameStoreOrderKeyObj.getKey());
                textView2.setOnClickListener(new a(textView2));
                textView3.setOnClickListener(new b(gameStoreOrderKeyObj));
                textView4.setOnClickListener(new c(gameStoreOrderKeyObj));
                this.mKeysLinearLayout.addView(viewInflate);
                i10++;
            }
        }
    }

    static /* synthetic */ void W2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str}, null, changeQuickRedirect, true, 34064, new Class[]{GameStoreOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.u4(str);
    }

    private void W4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33973, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.M.getPurchase_params() != null) {
            this.mPurchaseCodeView.setVisibility(8);
            return;
        }
        this.mPurchaseCodeView.setVisibility(0);
        KeyDescObj keyDescObj = this.P;
        if (keyDescObj != null) {
            this.mPurchaseCodeTextView.setText(keyDescObj.getDesc());
        } else if (com.max.hbcommon.utils.c.u(this.M.getPurchase_code_desc())) {
            this.mPurchaseCodeTextView.setText(getString(R.string.tap_to_input));
        } else {
            this.mPurchaseCodeTextView.setText(this.M.getPurchase_code_desc());
        }
        this.mPurchaseCodeView.setOnClickListener(new l());
    }

    static /* synthetic */ void X1(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, arrayList}, null, changeQuickRedirect, true, 34043, new Class[]{GameStoreOrderDetailActivity.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.G4(arrayList);
    }

    private void X4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33969, new Class[0], Void.TYPE).isSupported || isFinishing() || this.mRechargeCardLinearLayout == null || this.J3.size() <= 0) {
            return;
        }
        this.mRechargeCardLinearLayout.removeAllViews();
        int i10 = 0;
        while (i10 < this.J3.size()) {
            KeyDescObj keyDescObj = this.J3.get(i10);
            View viewInflate = this.f66602c.inflate(R.layout.item_activate_recharge_cards, (ViewGroup) this.mRechargeCardLinearLayout, false);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
            marginLayoutParams.topMargin = i10 > 0 ? ViewUtils.f(this.f66601b, 10.0f) : 0;
            viewInflate.setLayoutParams(marginLayoutParams);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_card_desc);
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_key);
            TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_copy_key);
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_activate_key);
            textView.setText(keyDescObj.getDesc());
            textView2.setText(keyDescObj.getKey());
            if (GameStoreNintendoTradingActivity.J3.equals(keyDescObj.getStatus())) {
                textView4.setBackgroundDrawable(getResources().getDrawable(R.color.badge_bg_color));
                textView4.setText(getString(R.string.fail));
            } else {
                textView4.setBackgroundDrawable(getResources().getDrawable(R.color.interactive_color));
                textView4.setText(getString(R.string.activate));
            }
            textView2.setOnClickListener(new d(textView2));
            textView3.setOnClickListener(new e(keyDescObj));
            textView4.setOnClickListener(new f(keyDescObj));
            this.mRechargeCardLinearLayout.addView(viewInflate);
            i10++;
        }
    }

    static /* synthetic */ void Y3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str}, null, changeQuickRedirect, true, 34071, new Class[]{GameStoreOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.q4(str);
    }

    private void Y4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33996, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().ja(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f0()));
    }

    static /* synthetic */ void Z3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34072, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.m4();
    }

    private void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34009, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.bind_steam_tips_title)).l(getString(R.string.bind_steam_tips_message)).u(getString(R.string.confirm), new y0()).o(getString(R.string.cancel), new x0()).F();
    }

    static /* synthetic */ void a4(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34073, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.s4();
    }

    private void a5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34012, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        MallOrderCancelTipObj mallOrderCancelTipObj = this.N;
        if (mallOrderCancelTipObj != null && "deduct".equals(mallOrderCancelTipObj.getType()) && this.N.getDiscount() != null) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase).m(com.max.xiaoheihe.utils.e0.d(String.format("取消订单将失去价值%s超值优惠", this.N.getDiscount()), getResources().getColor(R.color.text_primary_1_color), 9, 9 + this.N.getDiscount().length(), false, bb.d.a().b(4), null)).t(R.string.goto_purchase, new e1()).n(R.string.cancel_order, new d1()).g(false).F();
            return;
        }
        MallOrderCancelTipObj mallOrderCancelTipObj2 = this.N;
        if (mallOrderCancelTipObj2 == null || !"same_count".equals(mallOrderCancelTipObj2.getType())) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase).k(R.string.order_cancel_tip).t(R.string.goto_purchase, new i1()).n(R.string.cancel_order, new h1()).g(false).F();
        } else {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase).m(com.max.xiaoheihe.utils.e0.d(String.format("还有%s人和你一样选购了这款商品，是否要继续购买", this.N.getCount()), getResources().getColor(R.color.text_primary_1_color), 2, 2 + this.N.getCount().length(), false, bb.d.a().b(4), null)).t(R.string.goto_purchase, new g1()).n(R.string.cancel_order, new f1()).g(false).F();
        }
    }

    static /* synthetic */ void b4(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34074, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.Y4();
    }

    private void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33976, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mConfirmInfoView.setVisibility(0);
        this.mOptionTextView.setVisibility(8);
        this.mConfirmTextView.setVisibility(0);
        this.mConfirmTextView.setText(getString(R.string.confirm));
        this.mConfirmTextView.getLayoutParams().height = ViewUtils.f(this.f66601b, 40.0f);
        this.mConfirmTextView.setOnClickListener(this.S3);
    }

    static /* synthetic */ void c2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34039, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.B4();
    }

    private void c5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33967, new Class[0], Void.TYPE).isSupported && this.N3 && this.O3) {
            this.mRefreshLayout.A(0);
            this.mRefreshLayout.p(0);
            x1();
        }
    }

    static /* synthetic */ void d4(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34042, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.a5();
    }

    private com.max.hbcommon.component.i d5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34003, new Class[0], com.max.hbcommon.component.i.class);
        if (patchProxyResultProxy.isSupported) {
            return (com.max.hbcommon.component.i) patchProxyResultProxy.result;
        }
        View viewInflate = LayoutInflater.from(this.f66601b).inflate(R.layout.dialog_hcoin_deduction, (ViewGroup) null, false);
        viewInflate.setElevation(ViewUtils.f(this.f66601b, 2.0f));
        com.max.hbcommon.component.i iVar = new com.max.hbcommon.component.i((Context) this.f66601b, true, viewInflate);
        ViewGroup viewGroup = (ViewGroup) viewInflate.findViewById(R.id.vg_bottom_bar);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_order_price);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_faq);
        ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(R.id.vg_bg);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_close);
        bb.d.d(textView, 4);
        textView.setText(lb.b.f131104t + com.max.hbutils.utils.n.t(String.valueOf(com.max.hbutils.utils.n.p(String.valueOf(com.max.hbutils.utils.n.r(this.V) + com.max.hbutils.utils.n.r(this.Q))) / 1000.0f).replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SP, ".")));
        viewGroup.setBackground(com.max.hbutils.utils.q.E(this.f66601b, R.color.divider_color, 8.0f));
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_hcoin);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_info);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_use_all);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        long j10 = E4()[1];
        String str = getString(R.string.current_h_coin) + ": " + this.M.getTotal_coin() + "，可抵现" + j10;
        textView3.setText(str);
        if (!com.max.hbcommon.utils.c.u(this.Q)) {
            editText.setText(this.Q);
            editText.setSelection(this.Q.length());
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(j10)});
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new j0(textView5));
        editText.addTextChangedListener(new k0(j10, textView3, textView4, textView5, str));
        textView4.setOnClickListener(new l0(j10, editText));
        textView5.setOnClickListener(new m0(editText, iVar));
        textView2.setOnClickListener(new n0());
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        o0 o0Var = new o0(iVar);
        imageView.setOnClickListener(o0Var);
        viewGroup2.setOnClickListener(o0Var);
        iVar.show();
        return iVar;
    }

    private void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34011, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        EditText editText = new EditText(this.f66601b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        int iF = ViewUtils.f(this.f66601b, 10.0f);
        layoutParams.setMargins(0, iF, 0, iF * 2);
        editText.setLayoutParams(layoutParams);
        editText.setPadding(iF, iF, iF, iF);
        editText.setGravity(17);
        editText.setBackgroundDrawable(this.f66601b.getResources().getDrawable(R.drawable.bg_dialog_edit));
        editText.setTextSize(0, this.f66601b.getResources().getDimensionPixelSize(R.dimen.text_size_16));
        editText.setTextColor(this.f66601b.getResources().getColor(R.color.text_primary_1_color));
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.plz_input_coupon_code)).i(editText).u(getString(R.string.confirm), new b1(editText)).o(getString(R.string.cancel), new a1()).F();
        ViewUtils.r0(editText);
    }

    private void f5(String str, boolean z10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 34015, new Class[]{String.class, Boolean.TYPE}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.purchase_failed)).l(getString(R.string.purchase_failed_by_has_order)).u(getString(R.string.to_handle), new p1(str, z10)).o(getString(R.string.cancel), new o1()).g(false).F();
    }

    private void g5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34033, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.f84952y2;
        if ((aVar == null || !aVar.isShowing()) && !this.f84948p3) {
            this.f84952y2 = new com.max.hbcommon.view.a.f(this.f66601b).l("您是否已经完成了支付").u("已支付", new z1()).o("未支付", new x1()).F();
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", " showPayCompleteConfirmDialog isBlocked==" + this.f84948p3);
    }

    static /* synthetic */ com.max.hbcommon.component.i h2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34044, new Class[]{GameStoreOrderDetailActivity.class}, com.max.hbcommon.component.i.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.component.i) patchProxyResultProxy.result : gameStoreOrderDetailActivity.d5();
    }

    private void h5(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34004, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.K3 = true;
        com.max.xiaoheihe.module.mall.o.p(this, str, str2, this.M.getPayment_list(), new p0(str));
    }

    static /* synthetic */ void i2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34045, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.e5();
    }

    static /* synthetic */ int i3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        int i10 = gameStoreOrderDetailActivity.X;
        gameStoreOrderDetailActivity.X = i10 + 1;
        return i10;
    }

    static /* synthetic */ void i4(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str, String str2, String str3, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str, str2, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34075, new Class[]{GameStoreOrderDetailActivity.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.Q4(str, str2, str3, i10, z10);
    }

    private void i5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34005, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        String str = this.V + getString(R.string.h_coin);
        SpannableString spannableString = new SpannableString(getString(R.string.should_cost) + " " + str);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.interactive_color)), spannableString.length() - str.length(), spannableString.length(), 33);
        String str2 = getString(R.string.current_h_coin) + ": " + this.U.getCoin();
        com.max.hbcommon.view.a aVar = this.f84944b0;
        if (aVar == null) {
            TextView textView = new TextView(this.f66601b);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 20.0f));
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_12));
            textView.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            String string = getString(R.string.purchase_agreement);
            SpannableString spannableString2 = new SpannableString(getString(R.string.purchase_agreement_confirm) + string);
            spannableString2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.interactive_color)), spannableString2.length() - string.length(), spannableString2.length(), 33);
            textView.setText(spannableString2);
            textView.setOnClickListener(new q0());
            this.f84944b0 = new com.max.hbcommon.view.a.f(this.f66601b).y(spannableString).l(str2).i(textView).u(getString(R.string.purchase), new t0()).o(getString(R.string.cancel), new s0()).d();
        } else {
            aVar.setTitle(spannableString);
            this.f84944b0.n(str2);
        }
        this.f84944b0.show();
    }

    static /* synthetic */ Dialog j2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, shareInfoObj}, null, changeQuickRedirect, true, 34046, new Class[]{GameStoreOrderDetailActivity.class, ShareInfoObj.class}, Dialog.class);
        return patchProxyResultProxy.isSupported ? (Dialog) patchProxyResultProxy.result : gameStoreOrderDetailActivity.r5(shareInfoObj);
    }

    static /* synthetic */ void j4(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34076, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.g5();
    }

    private void j5(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34010, new Class[]{String.class, String.class}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(str).l(str2).u(getString(R.string.confirm), new z0()).g(false).F();
    }

    static /* synthetic */ void k2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34047, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.p5();
    }

    static /* synthetic */ void k3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str, long j10, boolean z10, boolean z11) {
        Object[] objArr = {gameStoreOrderDetailActivity, str, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 34065, new Class[]{GameStoreOrderDetailActivity.class, String.class, Long.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.t4(str, j10, z10, z11);
    }

    private void k5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33977, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mOptionTextView.setVisibility(8);
        this.mConfirmTextView.setVisibility(0);
        this.mConfirmTextView.setText(getString(R.string.quickly_activate));
        this.mConfirmTextView.getLayoutParams().height = ViewUtils.f(this.f66601b, 44.0f);
        this.mConfirmTextView.setOnClickListener(new p());
    }

    static /* synthetic */ void l2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, String str, boolean z10, long j10) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10)}, null, changeQuickRedirect, true, 34048, new Class[]{GameStoreOrderDetailActivity.class, String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.D4(str, z10, j10);
    }

    private void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34013, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.receive_success_tips_title)).l(getString(R.string.receive_success_tips_msg)).u(getString(R.string.received), new k1()).o(getString(R.string.cancel), new j1()).g(false).F();
    }

    private void m4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33995, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().t8(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new e0()));
    }

    private void m5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34008, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        long jR = com.max.hbutils.utils.n.r(this.V) - com.max.hbutils.utils.n.r(this.U.getCoin());
        String.valueOf(jR);
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.please_recharge)).l(getString(R.string.current_h_coin) + ": " + this.U.getCoin() + ", " + getString(R.string.also_need_recharge) + String.format("￥%s", com.max.xiaoheihe.module.game.r1.F(jR + "")) + "(" + jR + getString(R.string.h_coin) + ")");
        if (com.max.hbcommon.utils.c.u(this.U.getPay_url())) {
            fVarL.u(getString(R.string.confirm), new w0());
        } else {
            fVarL.u(getString(R.string.go_recharge), new v0()).o(getString(R.string.cancel), new u0());
        }
        fVarL.F();
    }

    static /* synthetic */ void n2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34049, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.l5();
    }

    private boolean n4(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 34018, new Class[]{Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        boolean zT = com.max.hbcache.c.t();
        if (!zT) {
            startActivityForResult(MallAgreementActivity.M.a(this.f66601b, this.U.getAgreement_title(), true), i10);
        }
        return zT;
    }

    private void n5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34014, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.refuse_gift_tips_title)).l(getString(R.string.refuse_gift_tips_msg)).u(getString(R.string.refused_on_steam), new m1()).o(getString(R.string.cancel), new l1()).g(false).F();
    }

    static /* synthetic */ void o2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34050, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.n5();
    }

    private void o4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33986, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().r8(this.R, this.T).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new w()));
    }

    private void o5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33974, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ShareInfoObj share_info = this.M.getShare_info();
        this.mConfirmInfoView.setVisibility(8);
        this.mConfirmTextView.setVisibility(0);
        this.mConfirmTextView.getLayoutParams().height = ViewUtils.f(this.f66601b, 44.0f);
        if (share_info == null || "10".equals(this.W) || "11".equals(this.W)) {
            this.mConfirmTextView.setText(getString(R.string.share));
            this.mConfirmTextView.setOnClickListener(new n());
        } else {
            this.mConfirmTextView.setText(share_info.getShare_btn_text());
            this.mConfirmTextView.setOnClickListener(new m(share_info));
        }
    }

    static /* synthetic */ void p2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34040, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.A4();
    }

    static /* synthetic */ int p3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        int i10 = gameStoreOrderDetailActivity.Y;
        gameStoreOrderDetailActivity.Y = i10 + 1;
        return i10;
    }

    private void p4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33987, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!"true".equals(this.M.getEnable_deduct())) {
            if (com.max.hbutils.utils.n.r(this.U.getCoin()) >= com.max.hbutils.utils.n.r(this.V)) {
                i5();
                return;
            } else {
                m5();
                return;
            }
        }
        GamePurchaseResultObj gamePurchaseResultObj = this.M;
        String pay_price = (gamePurchaseResultObj == null || gamePurchaseResultObj.getPurchase_params() == null) ? this.V : this.M.getPurchase_params().getPay_price();
        if (com.max.hbutils.utils.n.q(pay_price) != 0) {
            h5(pay_price, this.U.getHbalance());
        } else {
            this.f84950x2 = PaymentManager.A;
            x4("0");
        }
    }

    private void p5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34016, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.can_share_after_received_gift)).u(getString(R.string.confirm), new r1()).o(getString(R.string.cancel), new q1()).F();
    }

    static /* synthetic */ void q2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34051, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.C1();
    }

    private void q4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33988, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().n0(this.R, str, this.T).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new x(str)));
    }

    private void q5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33975, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mConfirmInfoView.setVisibility(8);
        this.mOptionTextView.setVisibility(0);
        this.mOptionTextView.setText(getString(R.string.to_receive_gifts));
        this.mOptionTextView.setOnClickListener(new o());
    }

    private void r4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33999, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.analytics.l.f66572a.q(getPagePath(), getPageAdditional());
        this.Y = 0;
        o4();
    }

    private Dialog r5(ShareInfoObj shareInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareInfoObj}, this, changeQuickRedirect, false, 34017, new Class[]{ShareInfoObj.class}, Dialog.class);
        if (patchProxyResultProxy.isSupported) {
            return (Dialog) patchProxyResultProxy.result;
        }
        if (this.f66601b.isFinishing()) {
            return null;
        }
        View viewInflate = this.f66602c.inflate(R.layout.dialog_game_store_purchase_share, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_share_weixin_circle);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.iv_share_weixin);
        ImageView imageView3 = (ImageView) viewInflate.findViewById(R.id.iv_share_qq);
        com.max.hbcommon.view.a aVarD = new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.game_store_purchase_share_tips)).i(viewInflate).B(true).w(true).d();
        HBShareData hBShareData = new HBShareData(false, true, shareInfoObj.getShare_title(), shareInfoObj.getShare_desc(), shareInfoObj.getShare_url(), null, !com.max.hbcommon.utils.c.u(shareInfoObj.getShare_img()) ? new UMImage(this.f66601b, shareInfoObj.getShare_img()) : new UMImage(this.f66601b, R.drawable.share_thumbnail), this.U3);
        imageView.setOnClickListener(new s1(hBShareData, aVarD));
        imageView2.setOnClickListener(new t1(hBShareData, aVarD));
        imageView3.setOnClickListener(new u1(hBShareData, aVarD));
        aVarD.show();
        N0(aVarD);
        return aVarD;
    }

    private void s4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33997, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Z0(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h0()));
    }

    private void s5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34023, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ProgressDialog progressDialog = this.f84949x1;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f84949x1.dismiss();
        }
        io.reactivex.disposables.a aVar = this.R3;
        if (aVar != null) {
            aVar.f();
        }
        this.G2 = false;
    }

    private void t4(String str, long j10, boolean z10, boolean z11) {
        Object[] objArr = {str, new Long(j10), new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 33993, new Class[]{String.class, Long.TYPE, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P6(str).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new c0(str, z10, z11)));
    }

    private void t5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallCouponObj mallCouponObj = this.O;
        if (mallCouponObj != null) {
            this.T.put("coupon_id", mallCouponObj.getCoupon_id());
        } else {
            this.T.remove("coupon_id");
        }
        KeyDescObj keyDescObj = this.P;
        if (keyDescObj != null) {
            this.T.put("purchase_code", keyDescObj.getKey());
        } else {
            this.T.remove("purchase_code");
        }
        String str = this.Q;
        if (str != null) {
            this.T.put("deduct_coin", str);
        } else {
            this.T.remove("deduct_coin");
        }
        String str2 = this.f84950x2;
        if (str2 != null) {
            this.T.put("pay_type", str2);
        } else {
            this.T.remove("pay_type");
        }
    }

    static /* synthetic */ void u2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 34052, new Class[]{GameStoreOrderDetailActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.M4(z10);
    }

    private void u4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 33991, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P6(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a0(str)));
    }

    private void v4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33994, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().I0("5".equals(this.M.getProduct_type()) ? null : this.R, this.T).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new d0()));
    }

    static /* synthetic */ void w3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, GamePurchaseParamsObj gamePurchaseParamsObj) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity, gamePurchaseParamsObj}, null, changeQuickRedirect, true, 34066, new Class[]{GameStoreOrderDetailActivity.class, GamePurchaseParamsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.U4(gamePurchaseParamsObj);
    }

    private void w4(String str, boolean z10, long j10) {
        if (PatchProxy.proxy(new Object[]{str, new Byte(z10 ? (byte) 1 : (byte) 0), new Long(j10)}, this, changeQuickRedirect, false, 33990, new Class[]{String.class, Boolean.TYPE, Long.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().F5(str).w1(j10, TimeUnit.MILLISECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new z(str, z10)));
    }

    private void x4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34034, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        MallCouponObj mallCouponObj = this.O;
        String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
        KeyDescObj keyDescObj = this.P;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Kb(this.L, "gift", PaymentManager.A, str, coupon_id, keyDescObj != null ? keyDescObj.getKey() : null, com.max.hbcommon.utils.c.u(this.Q) ? null : this.Q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a2()));
    }

    static /* synthetic */ void y2(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34053, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.c5();
    }

    static /* synthetic */ void y3(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{gameStoreOrderDetailActivity}, null, changeQuickRedirect, true, 34067, new Class[]{GameStoreOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        gameStoreOrderDetailActivity.R4();
    }

    public static Intent y4(Context context, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 33957, new Class[]{Context.class, String.class}, Intent.class);
        if (patchProxyResultProxy.isSupported) {
            return (Intent) patchProxyResultProxy.result;
        }
        Intent intent = new Intent(context, (Class<?>) GameStoreOrderDetailActivity.class);
        intent.putExtra("order_id", str);
        return intent;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void E3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34022, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f84947p2 = str;
        s5();
        C4(false, true);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void S1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34029, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "onPaySuccess");
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void U2(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34024, new Class[]{String.class}, Void.TYPE).isSupported && str.equals(this.f84950x2)) {
            this.f84947p2 = null;
            this.f84950x2 = null;
        }
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void Y0(WeixinQueryObj weixinQueryObj) {
        if (PatchProxy.proxy(new Object[]{weixinQueryObj}, this, changeQuickRedirect, false, 34031, new Class[]{WeixinQueryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "updateUIAfterQuery");
    }

    @Override // com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33964, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.L3 && !this.M3) {
            this.f66601b.sendBroadcast(new Intent(lb.a.R));
        }
        super.finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34036, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        GamePurchaseResultObj gamePurchaseResultObj = this.M;
        if (gamePurchaseResultObj != null && gamePurchaseResultObj.getAppid() != null) {
            jsonObject.addProperty("app_id", this.M.getAppid());
        }
        GamePurchaseResultObj gamePurchaseResultObj2 = this.M;
        if (gamePurchaseResultObj2 != null && gamePurchaseResultObj2.getOrder_id() != null) {
            jsonObject.addProperty("order_id", this.M.getOrder_id());
        }
        GamePurchaseResultObj gamePurchaseResultObj3 = this.M;
        if (gamePurchaseResultObj3 != null && gamePurchaseResultObj3.getH_src() != null) {
            jsonObject.addProperty("h_src", this.M.getH_src());
        }
        return jsonObject.toString();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> j3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34026, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : z4(PaymentManager.f71427z, str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33959, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_game_store_order_detail);
        if (com.max.hbcommon.network.b.f68052i) {
            com.max.hbpay.c.a();
        }
        ButterKnife.a(this);
        PaymentManager paymentManager = new PaymentManager(this, this);
        this.f84946p1 = paymentManager;
        paymentManager.U(false);
        ProgressDialog progressDialog = new ProgressDialog(this.f66601b);
        this.f84949x1 = progressDialog;
        progressDialog.setIndeterminate(true);
        this.f84949x1.setCancelable(false);
        this.f84946p1.Q(this.f84949x1);
        this.L = getIntent().getStringExtra("order_id");
        this.f66616q.setTitle(getString(R.string.order_detail));
        this.f66616q.setNavigationOnClickListener(new v());
        this.f66617r.setVisibility(0);
        this.mRefreshLayout.S(new g0());
        this.mRefreshLayout.b0(false);
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f84945c0 = refreshBroadcastReceiver;
        t1(refreshBroadcastReceiver, lb.a.A);
        E1();
        B4();
        A4();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34021, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        B4();
        A4();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void o1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34030, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "onPayFailed");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        ArrayList<KeyDescObj> arrayList;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 34019, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
        this.f84943a0 = i10;
        if (i10 == 2) {
            if (i11 == 2) {
                com.max.hbcache.c.L(true);
                this.Z = true;
                return;
            } else {
                if (i11 == 1) {
                    com.max.hbcache.c.L(false);
                    return;
                }
                return;
            }
        }
        if (i10 == 5 && i11 == 10) {
            ArrayList arrayList2 = (ArrayList) intent.getSerializableExtra("coupon_list");
            if (arrayList2 == null || arrayList2.size() <= 0) {
                this.O = null;
            } else {
                this.O = (MallCouponObj) arrayList2.get(0);
            }
            if (this.M != null) {
                this.Q = "";
                t5();
                T4();
                S4();
                v4();
                return;
            }
            return;
        }
        if (i10 == 6 && i11 == -1) {
            C4(true, false);
            return;
        }
        if (i10 != 8 || i11 != -1 || (arrayList = (ArrayList) intent.getSerializableExtra("key_list")) == null || arrayList.size() <= 0) {
            return;
        }
        for (KeyDescObj keyDescObj : arrayList) {
            for (KeyDescObj keyDescObj2 : this.J3) {
                if (keyDescObj.getKey().equals(keyDescObj2.getKey())) {
                    keyDescObj2.setStatus(keyDescObj.getStatus());
                }
            }
        }
        X4();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33963, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.K3 || this.L3 || this.M3) {
            super.onBackPressed();
            return;
        }
        com.max.hbcommon.view.a.f fVarX = new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase);
        MallOrderCancelTipObj mallOrderCancelTipObj = this.N;
        if (mallOrderCancelTipObj == null || !"deduct".equals(mallOrderCancelTipObj.getType()) || this.N.getDiscount() == null) {
            fVarX.k(R.string.order_cancel_tip);
        } else {
            fVarX.m(com.max.xiaoheihe.utils.e0.d(String.format("放弃订单将失去价值%s超值优惠", this.N.getDiscount()), getResources().getColor(R.color.text_primary_1_color), 9, 9 + this.N.getDiscount().length(), false, bb.d.a().b(4), null));
        }
        fVarX.t(R.string.goto_purchase, new c1()).n(R.string.cruel_to_leave, new r0()).g(false);
        fVarX.F();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 33958, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey(f84939b4)) {
                this.O = (MallCouponObj) bundle.getSerializable(f84939b4);
            }
            if (bundle.containsKey(f84940c4)) {
                this.P = (KeyDescObj) bundle.getSerializable(f84940c4);
            }
            if (bundle.containsKey(f84941d4)) {
                this.Q = bundle.getString(f84941d4);
            }
            if (bundle.containsKey(f84942e4)) {
                this.V = bundle.getString(f84942e4);
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34020, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMShareAPI.get(this).release();
        this.G3.removeCallbacksAndMessages(null);
        RefreshBroadcastReceiver refreshBroadcastReceiver = this.f84945c0;
        if (refreshBroadcastReceiver != null) {
            unregisterReceiver(refreshBroadcastReceiver);
        }
        io.reactivex.disposables.a aVar = this.R3;
        if (aVar != null) {
            aVar.f();
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33962, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        this.f84948p3 = true;
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33961, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (!this.P3) {
            n1();
        }
        this.P3 = false;
        this.f84948p3 = false;
        if (com.max.hbcommon.utils.c.u(this.f84947p2)) {
            return;
        }
        if (this.G2) {
            s5();
        }
        Q4(this.f84947p2, this.f84950x2, "0", 0, false);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 33965, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResumeFragments();
        if (this.Z) {
            this.Z = false;
            p4();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 33960, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        MallCouponObj mallCouponObj = this.O;
        if (mallCouponObj != null) {
            bundle.putSerializable(f84939b4, mallCouponObj);
        }
        KeyDescObj keyDescObj = this.P;
        if (keyDescObj != null) {
            bundle.putSerializable(f84940c4, keyDescObj);
        }
        String str = this.Q;
        if (str != null) {
            bundle.putString(f84941d4, str);
        }
        if (com.max.hbcommon.utils.c.u(this.V)) {
            return;
        }
        bundle.putString(f84942e4, this.V);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> q0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34025, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : z4(PaymentManager.f71426y, str);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> z3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 34027, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : z4("lianlian", str);
    }

    public io.reactivex.z<Result<PayOrderObj>> z4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 34028, new Class[]{String.class, String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        MallCouponObj mallCouponObj = this.O;
        String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
        KeyDescObj keyDescObj = this.P;
        return com.max.xiaoheihe.network.i.a().Kb(this.L, "gift", str, str2, coupon_id, keyDescObj != null ? keyDescObj.getKey() : null, com.max.hbcommon.utils.c.u(this.Q) ? null : this.Q);
    }
}
