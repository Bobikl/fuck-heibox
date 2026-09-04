package com.max.xiaoheihe.module.mall;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbcommon.base.BaseActivity;
import com.max.hbcommon.bean.EncryptionParamsObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.AddAddressActivity;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hbpay.PaymentManager;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbpay.bean.WeixinQueryObj;
import com.max.hbshare.bean.HBShareData;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbwallet.OrderCouponListActivity;
import com.max.hbwallet.bean.MallCouponObj;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.ShareWindowObj;
import com.max.xiaoheihe.bean.mall.MallButtonObj;
import com.max.xiaoheihe.bean.mall.MallCatObj;
import com.max.xiaoheihe.bean.mall.MallDiscountParamsObj;
import com.max.xiaoheihe.bean.mall.MallOrderBottomBtnObj;
import com.max.xiaoheihe.bean.mall.MallOrderCancelTipObj;
import com.max.xiaoheihe.bean.mall.MallOrderDetailObj;
import com.max.xiaoheihe.bean.mall.MallPayInfoObj;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallProxyDataObj;
import com.max.xiaoheihe.bean.mall.MallSkuItemObj;
import com.max.xiaoheihe.bean.mall.MallSkuObj;
import com.max.xiaoheihe.bean.mall.MallSteamInfoObj;
import com.max.xiaoheihe.bean.mall.MallSteamKeyStateObj;
import com.max.xiaoheihe.bean.mall.MallSwitchProxyObj;
import com.max.xiaoheihe.bean.mall.OrderDetailActivityObj;
import com.max.xiaoheihe.bean.mall.SteamWalletJsObj;
import com.max.xiaoheihe.module.account.BindPhoneActivity;
import com.max.xiaoheihe.module.game.GameStoreNintendoTradingActivity;
import com.max.xiaoheihe.module.magic.MagicUtil;
import com.max.xiaoheihe.module.mall.cart.MallCartUtils;
import com.max.xiaoheihe.module.mall.cart.OrderEvent;
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
import df.as;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
@com.max.hbcommon.analytics.m(path = lb.d.X1)
@ig.d(interceptors = {com.max.xiaoheihe.router.interceptors.i.class}, path = {lb.d.X1})
public class MallOrderDetailActivity extends BaseActivity implements PaymentManager.g, com.max.hbcoco.b {
    public static final String R3 = "order_id";
    public static final String S3 = "heybox";
    public static final String T3 = "openorder";
    public static final String U3 = "order_id";
    private static final int V3 = 1;
    private static final int W3 = 2;
    private static final int X3 = 3;
    private static final int Y3 = 4;
    private static final int Z3 = 5;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f89463a4 = 6;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f89464b4 = 7;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f89465c4 = 8;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final String f89466d4 = "current_coupon";

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final String f89467e4 = "current_purchase_code";

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final String f89468f4 = "current_hcoin_deduct";

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final String f89469g4 = "current_address";

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final String f89470h4 = "final_cost_coin";

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final long[] f89471i4 = {1000, 1000, 1000, 2000, 2000, 2000};
    private com.max.hbcommon.view.a G2;
    private boolean G3;
    private MallPayInfoObj J3;
    private String L;
    private MallOrderDetailObj M;
    private MallOrderCancelTipObj N;
    private MallCouponObj O;
    private KeyDescObj P;
    private UMShareListener P3;
    private String Q;
    private com.max.hbshare.c.b Q3;
    private AddressInfoObj R;
    private MallPriceObj S;
    private MallSteamInfoObj T;
    private String U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private List<MallSteamKeyStateObj> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private String f89472a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f89473b0;

    @BindView(R.id.fl_confirm)
    FrameLayout fl_confirm;

    @BindView(R.id.ll_activities)
    LinearLayout ll_activities;

    @BindView(R.id.ll_award)
    LinearLayout ll_award;

    @BindView(R.id.cv_address)
    CardView mAddressCardView;

    @BindView(R.id.vg_address)
    ViewGroup mAddressContainer;

    @BindView(R.id.tv_bind_phone_number)
    TextView mBindPhoneNumberTextView;

    @BindView(R.id.cv_bundle_detail)
    View mBundleDetailView;

    @BindView(R.id.tv_bundle_discount)
    TextView mBundleDiscountTextView;

    @BindView(R.id.iv_bundle_img)
    ImageView mBundleImgImageView;

    @BindView(R.id.tv_bundle_name)
    TextView mBundleNameTextView;

    @BindView(R.id.vg_bundles)
    View mBundlesContainerView;

    @BindView(R.id.bundles_expand_divider)
    View mBundlesExpandDividerView;

    @BindView(R.id.tv_bundles_expand)
    TextView mBundlesExpandTextView;

    @BindView(R.id.ll_bundles)
    LinearLayout mBundlesLinearLayout;

    @BindView(R.id.cv_bundles)
    View mBundlesView;

    @BindView(R.id.tv_cancel_tips)
    TextView mCancelTipsTextView;

    @BindView(R.id.ll_cat_value)
    LinearLayout mCatValueLinearLayout;

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

    @BindView(R.id.tv_create_time_desc)
    TextView mCreateTimeDescTextView;

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

    @BindView(R.id.ll_discount_info)
    LinearLayout mDiscountInfoLinearLayout;

    @BindView(R.id.cv_game_detail)
    View mGameDetailCardView;

    @BindView(R.id.tv_game_discount)
    TextView mGameDiscountTextView;

    @BindView(R.id.iv_game_img)
    ImageView mGameImgImageView;

    @BindView(R.id.tv_game_name)
    TextView mGameNameTextView;

    @BindView(R.id.tv_game_package_name_desc)
    TextView mGamePackageNameDescTextView;

    @BindView(R.id.tv_game_package_name)
    TextView mGamePackageNameTextView;

    @BindView(R.id.tv_game_price_desc)
    TextView mGamePriceDescTextView;

    @BindView(R.id.tv_game_price)
    TextView mGamePriceTextView;

    @BindView(R.id.cv_logistics)
    CardView mLogisticsCardView;

    @BindView(R.id.vg_message)
    View mMessageView;

    @BindView(R.id.tv_nice_shipping_tips)
    TextView mNiceShippingTipsTextView;

    @BindView(R.id.tv_open_push_service)
    TextView mOpenPushServiceTextView;

    @BindView(R.id.tv_order_id_copy)
    TextView mOrderIdCopyTextView;

    @BindView(R.id.tv_order_id_desc)
    TextView mOrderIdDescTextView;

    @BindView(R.id.tv_order_id)
    TextView mOrderIdTextView;

    @BindView(R.id.tv_package_name_desc)
    TextView mPackageNameDescTextView;

    @BindView(R.id.tv_package_name)
    TextView mPackageNameTextView;

    @BindView(R.id.iv_pre_order_avatar)
    ImageView mPreOrderAvatarImageView;

    @BindView(R.id.tv_pre_order_name)
    TextView mPreOrderNameTextView;

    @BindView(R.id.tv_pre_order_tips)
    TextView mPreOrderTipsTextView;

    @BindView(R.id.vg_pre_order_tips)
    View mPreOrderTipsView;

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

    @BindView(R.id.srl)
    SmartRefreshLayout mRefreshLayout;

    @BindView(R.id.tv_return_replacement)
    TextView mReturnReplacementTextView;

    @BindView(R.id.vg_return_replacement)
    View mReturnReplacementView;

    @BindView(R.id.tv_shipping_tips)
    TextView mShippingTipsTextView;

    @BindView(R.id.vg_shipping_tips)
    View mShippingTipsView;

    @BindView(R.id.tv_steam_rate_tips)
    TextView mSteamRateTipsTextView;

    @BindView(R.id.tv_tips_desc)
    TextView mTipsDescTextView;

    @BindView(R.id.tv_tips_title)
    TextView mTipsTitleTextView;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private RefreshBroadcastReceiver f89475p1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private boolean f89477p3;

    @BindView(R.id.tv_confirm_tips)
    TextView tv_confirm_tips;

    @BindView(R.id.tv_mall_agreement)
    TextView vg_mall_agreement;

    @BindView(R.id.vg_root)
    ViewGroup vg_root;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private PaymentManager f89478x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private String f89479x2;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private ProgressDialog f89480y1;

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    private String f89481y2;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private n2 f89474c0 = new n2(this);

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private int f89476p2 = 1;
    private io.reactivex.disposables.a K3 = new io.reactivex.disposables.a();
    private boolean L3 = false;
    private boolean M3 = false;
    private boolean N3 = false;
    private boolean O3 = true;

    public class RefreshBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect changeQuickRedirect;

        private RefreshBroadcastReceiver() {
        }

        /* synthetic */ RefreshBroadcastReceiver(MallOrderDetailActivity mallOrderDetailActivity, k kVar) {
            this();
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (!PatchProxy.proxy(new Object[]{context, intent}, this, changeQuickRedirect, false, 40231, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported && lb.a.A.equals(intent.getAction())) {
                MallOrderDetailActivity.this.n1();
            }
        }
    }

    public enum TYPE_CODE {
        CANCELED,
        FAILED,
        WAITING_FOR_PAY,
        PAID,
        FINISH,
        CANCEL_ALERT_PAID,
        NEED_CHECK_STEAM_INFO,
        CANCELABLE_PAID;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static TYPE_CODE valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 40233, new Class[]{String.class}, TYPE_CODE.class);
            return patchProxyResultProxy.isSupported ? (TYPE_CODE) patchProxyResultProxy.result : (TYPE_CODE) Enum.valueOf(TYPE_CODE.class, str);
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static TYPE_CODE[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40232, new Class[0], TYPE_CODE[].class);
            return patchProxyResultProxy.isSupported ? (TYPE_CODE[]) patchProxyResultProxy.result : (TYPE_CODE[]) values().clone();
        }
    }

    public class a implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40094, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) MallOrderDetailActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131011n3);
            intent.putExtra("title", MallOrderDetailActivity.this.getString(R.string.request_return_replacement));
            ((BaseActivity) MallOrderDetailActivity.this).f66601b.startActivity(intent);
        }
    }

    public class a0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89484b;

        a0(String str) {
            this.f89484b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40121, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f89484b);
            if (MallOrderDetailObj.ORDER_TYPE_GAME_STEAM_CARDS.equals(MallOrderDetailActivity.this.M.getOrder_type()) || MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS.equals(MallOrderDetailActivity.this.M.getOrder_type())) {
                MallOrderDetailActivity.q2(MallOrderDetailActivity.this, arrayList);
                return;
            }
            if (MallOrderDetailObj.ORDER_TYPE_GAME_RECHARGE_CARDS.equals(MallOrderDetailActivity.this.M.getOrder_type()) || MallOrderDetailObj.ORDER_TYPE_RECHARGE_CARDS.equals(MallOrderDetailActivity.this.M.getOrder_type())) {
                MallOrderDetailActivity.r2(MallOrderDetailActivity.this, arrayList);
                return;
            }
            if (com.max.hbcommon.utils.c.u(MallOrderDetailActivity.this.M.getActivite_url())) {
                com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.fail));
            } else {
                com.max.xiaoheihe.utils.d.o(((BaseActivity) MallOrderDetailActivity.this).f66601b, this.f89484b);
                com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.cdkey_copied));
                com.max.xiaoheihe.base.router.b.k0(((BaseActivity) MallOrderDetailActivity.this).f66601b, MallOrderDetailActivity.this.M.getActivite_url());
            }
        }
    }

    public class a1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f89486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f89487c;

        a1(EditText editText, com.max.hbcommon.component.i iVar) {
            this.f89486b = editText;
            this.f89487c = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40183, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbcommon.utils.c.u(this.f89486b.getText().toString())) {
                MallOrderDetailActivity.this.Q = null;
            } else {
                MallOrderDetailActivity.this.Q = this.f89486b.getText().toString();
                if (!MallOrderDetailActivity.this.Q.endsWith("0")) {
                    StringBuilder sb2 = new StringBuilder(MallOrderDetailActivity.this.Q);
                    sb2.replace(MallOrderDetailActivity.this.Q.length() - 1, MallOrderDetailActivity.this.Q.length(), "0");
                    MallOrderDetailActivity.this.Q = sb2.toString();
                }
            }
            this.f89487c.dismiss();
            MallOrderDetailActivity.n3(MallOrderDetailActivity.this);
            MallOrderDetailActivity.s3(MallOrderDetailActivity.this);
        }
    }

    public class a2 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a2() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40211, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.x2(MallOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40095, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.C(((BaseActivity) MallOrderDetailActivity.this).f66601b, true).C(8).A();
        }
    }

    public class b0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList arrayList;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40122, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (MallOrderDetailActivity.this.O != null) {
                arrayList = new ArrayList();
                arrayList.add(MallOrderDetailActivity.this.O);
            } else {
                arrayList = null;
            }
            String key = MallOrderDetailActivity.this.P != null ? MallOrderDetailActivity.this.P.getKey() : null;
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivityForResult(OrderCouponListActivity.Y1(((BaseActivity) mallOrderDetailActivity).f66601b, "mall", MallOrderDetailActivity.this.L, arrayList, key), 2);
        }
    }

    public class b1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40184, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Intent intent = new Intent(((BaseActivity) MallOrderDetailActivity.this).f66601b, (Class<?>) WebActionActivity.class);
            intent.putExtra("pageurl", lb.a.f131029q3);
            intent.putExtra("title", "使用规则");
            ((BaseActivity) MallOrderDetailActivity.this).f66601b.startActivity(intent);
        }
    }

    public class b2 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b2() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40212, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.x2(MallOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40096, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivityForResult(AddAddressActivity.a2(((BaseActivity) mallOrderDetailActivity).f66601b, null), 8);
        }
    }

    public class c0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40123, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(((BaseActivity) MallOrderDetailActivity.this).f66601b, MallOrderDetailActivity.this.M.getCoupon_center_protocol());
        }
    }

    public class c1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40163, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class c2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f89497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f89498c;

        c2(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f89497b = hBShareData;
            this.f89498c = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40213, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.D(((BaseActivity) MallOrderDetailActivity.this).f66601b, this.f89497b);
            this.f89498c.dismiss();
        }
    }

    public class d implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40097, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivity(BindPhoneActivity.l2(((BaseActivity) mallOrderDetailActivity).f66601b));
        }
    }

    public class d0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ArrayList arrayList;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40124, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (MallOrderDetailActivity.this.O != null) {
                arrayList = new ArrayList();
                arrayList.add(MallOrderDetailActivity.this.O);
            } else {
                arrayList = null;
            }
            String key = MallOrderDetailActivity.this.P != null ? MallOrderDetailActivity.this.P.getKey() : null;
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivityForResult(OrderCouponListActivity.Y1(((BaseActivity) mallOrderDetailActivity).f66601b, "mall", MallOrderDetailActivity.this.L, arrayList, key), 2);
        }
    }

    public class d1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.i f89502b;

        d1(com.max.hbcommon.component.i iVar) {
            this.f89502b = iVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.max.hbcommon.component.i iVar;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40186, new Class[]{View.class}, Void.TYPE).isSupported || (iVar = this.f89502b) == null || !iVar.isShowing()) {
                return;
            }
            this.f89502b.dismiss();
        }
    }

    public class d2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f89504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f89505c;

        d2(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f89504b = hBShareData;
            this.f89505c = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40214, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.C(((BaseActivity) MallOrderDetailActivity.this).f66601b, this.f89504b);
            this.f89505c.dismiss();
        }
    }

    public class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40098, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.B0(((BaseActivity) MallOrderDetailActivity.this).f66601b);
        }
    }

    public class e0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40125, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.J2(MallOrderDetailActivity.this);
        }
    }

    public class e1 implements com.max.xiaoheihe.module.mall.o.g0 {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MallPayInfoObj f89509a;

        e1(MallPayInfoObj mallPayInfoObj) {
            this.f89509a = mallPayInfoObj;
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40189, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : MallOrderDetailActivity.this.L;
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public void b(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40188, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            if (PaymentManager.A.equals(str)) {
                MallOrderDetailActivity.T3(MallOrderDetailActivity.this, this.f89509a.getPay_price());
                return;
            }
            if (PaymentManager.f71427z.equals(MallOrderDetailActivity.this.f89481y2)) {
                MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                mallOrderDetailActivity.f89480y1 = mallOrderDetailActivity.f89478x1.M(2, this.f89509a.getPay_price());
            } else if ("lianlian".equals(MallOrderDetailActivity.this.f89481y2)) {
                MallOrderDetailActivity mallOrderDetailActivity2 = MallOrderDetailActivity.this;
                mallOrderDetailActivity2.f89480y1 = mallOrderDetailActivity2.f89478x1.M(4, this.f89509a.getPay_price());
            } else {
                MallOrderDetailActivity mallOrderDetailActivity3 = MallOrderDetailActivity.this;
                mallOrderDetailActivity3.f89480y1 = mallOrderDetailActivity3.f89478x1.M(1, this.f89509a.getPay_price());
            }
        }

        @Override // com.max.xiaoheihe.module.mall.o.g0
        public void c(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40187, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.f89481y2 = str;
        }
    }

    public class e2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ HBShareData f89511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.max.hbcommon.component.bottomsheet.q f89512c;

        e2(HBShareData hBShareData, com.max.hbcommon.component.bottomsheet.q qVar) {
            this.f89511b = hBShareData;
            this.f89512c = qVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40215, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbshare.d.z(((BaseActivity) MallOrderDetailActivity.this).f66601b, this.f89511b);
            this.f89512c.dismiss();
        }
    }

    public class f implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40099, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.e2(MallOrderDetailActivity.this);
        }
    }

    public class f0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        f0() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40126, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.K2(MallOrderDetailActivity.this);
        }
    }

    public class f1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallPayInfoObj f89516b;

        f1(MallPayInfoObj mallPayInfoObj) {
            this.f89516b = mallPayInfoObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40190, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivity(MallAgreementActivity.M.a(((BaseActivity) mallOrderDetailActivity).f66601b, this.f89516b.getAgreement_title(), false));
        }
    }

    public class f2 extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        f2() {
        }

        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40216, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                MallOrderDetailActivity.c2(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40217, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class g implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40100, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class g0 implements pg.d {
        public static ChangeQuickRedirect changeQuickRedirect;

        g0() {
        }

        @Override // pg.d
        public void k(ng.j jVar) {
            if (PatchProxy.proxy(new Object[]{jVar}, this, changeQuickRedirect, false, 40116, new Class[]{ng.j.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.f89473b0 = 0;
            MallOrderDetailActivity.O1(MallOrderDetailActivity.this);
            MallOrderDetailActivity.c2(MallOrderDetailActivity.this);
            MallOrderDetailActivity.p2(MallOrderDetailActivity.this);
        }
    }

    public class g1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40191, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class g2 implements UMShareListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g2() {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onCancel(SHARE_MEDIA share_media) {
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onError(SHARE_MEDIA share_media, Throwable th2) {
            if (PatchProxy.proxy(new Object[]{share_media, th2}, this, changeQuickRedirect, false, 40219, new Class[]{SHARE_MEDIA.class, Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.share_fail));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onResult(SHARE_MEDIA share_media) {
            if (PatchProxy.proxy(new Object[]{share_media}, this, changeQuickRedirect, false, 40218, new Class[]{SHARE_MEDIA.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.share_success));
        }

        @Override // com.umeng.socialize.UMShareListener
        public void onStart(SHARE_MEDIA share_media) {
        }
    }

    public class h implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89523b;

        h(String str) {
            this.f89523b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40101, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.f2(MallOrderDetailActivity.this, this.f89523b);
            dialogInterface.dismiss();
        }
    }

    public class h0 extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f89525b;

        h0(boolean z10) {
            this.f89525b = z10;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40129, new Class[0], Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onComplete();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40128, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.L2(MallOrderDetailActivity.this);
                MallOrderDetailActivity.this.mRefreshLayout.A(0);
                MallOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<MallOrderDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40130, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.M = result.getResult();
                MallOrderDetailActivity.this.M3 = true;
                MallOrderDetailActivity.P2(MallOrderDetailActivity.this, this.f89525b);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40131, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    public class h1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40192, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.Y3(MallOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class h2 extends com.max.hbcommon.network.d<Result<PayOrderObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        h2() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40220, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
            }
        }

        public void onNext(Result<PayOrderObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40221, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                MallOrderDetailActivity.Y3(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40222, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<PayOrderObj>) obj);
        }
    }

    public class i implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40102, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.C(((BaseActivity) MallOrderDetailActivity.this).f66601b, true).C(8).A();
            dialogInterface.dismiss();
        }
    }

    public class i0 extends com.max.hbcommon.network.d<Result<MallOrderCancelTipObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        i0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40132, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                MallOrderDetailActivity.this.N3 = true;
                MallOrderDetailActivity.S2(MallOrderDetailActivity.this);
            }
        }

        public void onNext(Result<MallOrderCancelTipObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40133, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                MallOrderDetailActivity.this.N = result.getResult();
                MallOrderDetailActivity.this.N3 = true;
                MallOrderDetailActivity.S2(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40134, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderCancelTipObj>) obj);
        }
    }

    public class i1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        i1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40193, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class i2 extends com.max.hbcommon.network.d<Result<WeixinQueryObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f89532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f89533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f89534d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f89535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f89536f;

        i2(boolean z10, int i10, String str, String str2, String str3) {
            this.f89532b = z10;
            this.f89533c = i10;
            this.f89534d = str;
            this.f89535e = str2;
            this.f89536f = str3;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40224, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.isActive();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40223, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                if (MallOrderDetailActivity.this.f89480y1 != null) {
                    MallOrderDetailActivity.this.f89480y1.dismiss();
                }
                MallOrderDetailActivity.this.f89477p3 = false;
            }
        }

        public void onNext(Result<WeixinQueryObj> result) {
            int i10;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40225, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                MallOrderDetailActivity.this.f89477p3 = false;
                if (result.getResult() != null) {
                    String state = result.getResult().getState();
                    com.max.hbcommon.utils.d.b("zzzzmalltest", "queryOutOrder state==" + state);
                    if ("6".equals(state)) {
                        if (!this.f89532b && this.f89533c < MallOrderDetailActivity.this.f89476p2) {
                            MallOrderDetailActivity.j4(MallOrderDetailActivity.this, this.f89534d, this.f89535e, "0", this.f89533c + 1, this.f89532b);
                            return;
                        }
                        boolean z10 = this.f89532b;
                        if (z10 && (i10 = this.f89533c) < 49) {
                            MallOrderDetailActivity.j4(MallOrderDetailActivity.this, this.f89534d, this.f89535e, "0", i10 + 1, z10);
                            return;
                        }
                        if (MallOrderDetailActivity.this.f89480y1 != null) {
                            MallOrderDetailActivity.this.f89480y1.dismiss();
                        }
                        MallOrderDetailActivity.k4(MallOrderDetailActivity.this);
                        return;
                    }
                    if ("1".equals(state)) {
                        if (MallOrderDetailActivity.this.f89480y1 != null) {
                            MallOrderDetailActivity.this.f89480y1.dismiss();
                        }
                        MallOrderDetailActivity.Y3(MallOrderDetailActivity.this);
                        return;
                    }
                    if (MallOrderDetailActivity.this.f89480y1 != null) {
                        MallOrderDetailActivity.this.f89480y1.dismiss();
                    }
                    if (!"1".equals(this.f89536f)) {
                        MallOrderDetailActivity.k4(MallOrderDetailActivity.this);
                    } else {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.d("支付失败");
                    }
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40226, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<WeixinQueryObj>) obj);
        }
    }

    public class j implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40103, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.i2(MallOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class j0 extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        j0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40136, new Class[0], Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onComplete();
                MallOrderDetailActivity.this.mRefreshLayout.A(0);
                MallOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40135, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.W2(MallOrderDetailActivity.this);
                MallOrderDetailActivity.this.mRefreshLayout.A(0);
                MallOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<MallOrderDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40137, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.M = result.getResult();
                MallOrderDetailActivity.X2(MallOrderDetailActivity.this);
                MallOrderDetailActivity.i2(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40138, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    public class j1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallPayInfoObj f89540b;

        j1(MallPayInfoObj mallPayInfoObj) {
            this.f89540b = mallPayInfoObj;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40194, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            if (!"native".equals(this.f89540b.getPay_type())) {
                com.max.xiaoheihe.utils.l0.p0(((BaseActivity) MallOrderDetailActivity.this).f66601b, this.f89540b.getPay_url());
            }
            dialogInterface.dismiss();
        }
    }

    public class j2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        j2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40209, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            if (MallOrderDetailActivity.d4(MallOrderDetailActivity.this) && MallOrderDetailActivity.Q1(MallOrderDetailActivity.this)) {
                MallOrderDetailActivity.R1(MallOrderDetailActivity.this);
            } else {
                MallOrderDetailActivity.T1(MallOrderDetailActivity.this);
            }
        }
    }

    public class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f89543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrderDetailActivityObj f89544c;

        k(Activity activity, OrderDetailActivityObj orderDetailActivityObj) {
            this.f89543b = activity;
            this.f89544c = orderDetailActivityObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40093, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.k0(this.f89543b, this.f89544c.getProtocol());
        }
    }

    public class k0 extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        k0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onComplete() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40140, new Class[0], Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onComplete();
                MallOrderDetailActivity.this.mRefreshLayout.A(0);
                MallOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40139, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.Y2(MallOrderDetailActivity.this);
                MallOrderDetailActivity.this.mRefreshLayout.A(0);
                MallOrderDetailActivity.this.mRefreshLayout.p(0);
            }
        }

        public void onNext(Result<MallOrderDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40141, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.M = result.getResult();
                MallOrderDetailActivity.X2(MallOrderDetailActivity.this);
                if (MallOrderDetailActivity.this.M == null || !MallOrderDetailObj.ORDER_TYPE_GAME_STEAM_CARDS.equals(MallOrderDetailActivity.this.M.getOrder_type()) || MallOrderDetailActivity.this.M.getGame_info() == null || MallOrderDetailActivity.this.M.getGame_info().getPrice() == null) {
                    return;
                }
                double dO = com.max.hbutils.utils.n.o(MallOrderDetailActivity.this.M.getGame_info().getPrice().getCost_rmb());
                String package_id = MallOrderDetailActivity.this.M.getGame_info() != null ? MallOrderDetailActivity.this.M.getGame_info().getPackage_id() : null;
                if (package_id == null || MallOrderDetailActivity.this.f89472a0 == null || com.max.hbutils.utils.n.o(MallOrderDetailActivity.this.f89472a0) < dO) {
                    return;
                }
                MallOrderDetailActivity.e3(MallOrderDetailActivity.this, package_id);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40142, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    public class k1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40195, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class k2 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        k2() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40228, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallOrderDetailActivity.this.f89479x2 = null;
            MallOrderDetailActivity.this.f89481y2 = null;
        }
    }

    public class l extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        l() {
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40105, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                ((BaseActivity) MallOrderDetailActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40106, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class l0 extends com.max.hbcommon.network.q {
        public static ChangeQuickRedirect changeQuickRedirect;

        l0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40143, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        @Override // com.max.hbcommon.network.q
        public void onNext(Result result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40144, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131050u0);
                MallCartUtils.f90196a.x(OrderEvent.CANCEL, null, null, null, MallOrderDetailActivity.this.L, null);
                ((BaseActivity) MallOrderDetailActivity.this).f66601b.sendBroadcast(intent);
            }
        }

        @Override // com.max.hbcommon.network.q, com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40145, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    public class l1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40196, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class l2 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        l2() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40229, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            MallOrderDetailActivity.j4(mallOrderDetailActivity, mallOrderDetailActivity.f89479x2, MallOrderDetailActivity.this.f89481y2, "1", 1, false);
        }
    }

    public class m implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40107, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class m0 extends com.max.hbcommon.network.d<Result<MallPriceObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        m0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40146, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<MallPriceObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40147, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallOrderDetailActivity.this.S = result.getResult();
                if (MallOrderDetailActivity.this.S != null && !com.max.hbcommon.utils.c.u(MallOrderDetailActivity.this.S.getPay_price())) {
                    MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                    mallOrderDetailActivity.U = mallOrderDetailActivity.S.getPay_price();
                }
                MallOrderDetailActivity.l3(MallOrderDetailActivity.this);
                MallOrderDetailActivity.n3(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40148, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPriceObj>) obj);
        }
    }

    public class m1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ EditText f89554b;

        m1(EditText editText) {
            this.f89554b = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40197, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            String string = this.f89554b.getText().toString();
            if (com.max.hbcommon.utils.c.u(string)) {
                MallOrderDetailActivity.this.P = null;
                MallOrderDetailActivity.p3(MallOrderDetailActivity.this);
                MallOrderDetailActivity.this.Q = "";
                MallOrderDetailActivity.n3(MallOrderDetailActivity.this);
                MallOrderDetailActivity.s3(MallOrderDetailActivity.this);
            } else {
                MallOrderDetailActivity.a4(MallOrderDetailActivity.this, string);
            }
            dialogInterface.dismiss();
        }
    }

    public class m2 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        m2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40227, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.base.router.b.i0(((BaseActivity) MallOrderDetailActivity.this).f66601b, lb.d.f131195k4);
        }
    }

    public class n implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40108, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.W = false;
            MallOrderDetailActivity.this.X = true;
            MallOrderDetailActivity.this.Y = true;
            com.max.xiaoheihe.base.router.b.k0(((BaseActivity) MallOrderDetailActivity.this).f66601b, MallOrderDetailActivity.this.M.getBottom_button().getUrl());
            dialogInterface.dismiss();
        }
    }

    public class n0 extends com.max.hbcommon.network.d<Result<KeyDescObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89558b;

        n0(String str) {
            this.f89558b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40149, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<KeyDescObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40150, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                KeyDescObj result2 = result.getResult();
                if (result2 == null || com.max.hbcommon.utils.c.u(result2.getDesc())) {
                    MallOrderDetailActivity.this.P = null;
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.invalid_coupon_code));
                    } else {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(result.getMsg());
                    }
                } else {
                    MallOrderDetailActivity.this.P = new KeyDescObj();
                    MallOrderDetailActivity.this.P.setKey(this.f89558b);
                    MallOrderDetailActivity.this.P.setDesc(result2.getDesc());
                }
                MallOrderDetailActivity.p3(MallOrderDetailActivity.this);
                MallOrderDetailActivity.this.Q = "";
                MallOrderDetailActivity.n3(MallOrderDetailActivity.this);
                MallOrderDetailActivity.s3(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40151, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<KeyDescObj>) obj);
        }
    }

    public class n1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        n1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40185, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivity(MallAgreementActivity.M.a(((BaseActivity) mallOrderDetailActivity).f66601b, MallOrderDetailActivity.this.M.getAgreement_title(), false));
        }
    }

    public static class n2 extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<MallOrderDetailActivity> f89561a;

        public n2(MallOrderDetailActivity mallOrderDetailActivity) {
            this.f89561a = new WeakReference<>(mallOrderDetailActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 40230, new Class[]{Message.class}, Void.TYPE).isSupported) {
                return;
            }
            super.handleMessage(message);
            MallOrderDetailActivity mallOrderDetailActivity = this.f89561a.get();
            if (mallOrderDetailActivity != null) {
                mallOrderDetailActivity.x4();
            }
        }
    }

    public class o implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40109, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class o0 extends com.max.hbcommon.network.d<Result<MallPayInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        o0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40152, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<MallPayInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40153, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallOrderDetailActivity.this.J3 = result.getResult();
                if (MallOrderDetailActivity.this.J3 != null) {
                    MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                    if (MallOrderDetailActivity.w3(mallOrderDetailActivity, mallOrderDetailActivity.J3)) {
                        MallOrderDetailActivity.y3(MallOrderDetailActivity.this);
                        return;
                    }
                    return;
                }
                if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                    com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.fail));
                } else {
                    com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                    com.max.hbutils.utils.c.f(result.getMsg());
                }
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40154, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallPayInfoObj>) obj);
        }
    }

    public class o1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        o1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40199, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallOrderDetailActivity.b4(MallOrderDetailActivity.this);
        }
    }

    public class p implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40110, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.W = false;
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            MallOrderDetailActivity.q2(mallOrderDetailActivity, MallOrderDetailActivity.o2(mallOrderDetailActivity));
            dialogInterface.dismiss();
        }
    }

    public class p0 extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements yh.a<kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            a() {
            }

            public kotlin.b2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40158, new Class[0], kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                com.max.xiaoheihe.module.account.paysetting.a.f79140a.c();
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40159, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        p0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40155, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        /* JADX WARN: Code duplicated, block: B:17:0x006d  */
        public void onNext(Result<MallOrderDetailObj> result) {
            boolean z10;
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40156, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallOrderDetailActivity.this.W = true;
                MallOrderDetailObj result2 = result.getResult();
                MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                if (result2 != null && ("cdkey".equals(result2.getOrder_type()) || MallOrderDetailObj.ORDER_TYPE_THIRD_CDKEY.equals(result2.getOrder_type()))) {
                    MallOrderDetailActivity mallOrderDetailActivity2 = MallOrderDetailActivity.this;
                    z10 = mallOrderDetailActivity2.y4(MallOrderDetailActivity.d4(mallOrderDetailActivity2), result2.getOrder_type()) == TYPE_CODE.FINISH;
                }
                mallOrderDetailActivity.Y = z10;
                Intent intent = new Intent(lb.a.A);
                intent.putExtra(lb.a.f130996l0, lb.a.f131056v0);
                ((BaseActivity) MallOrderDetailActivity.this).f66601b.sendBroadcast(intent);
                MallCartUtils.f90196a.x(OrderEvent.SUCCESS, null, null, null, MallOrderDetailActivity.this.L, null);
                if (result2 == null || !com.max.hbcommon.utils.c.x(result2.getFirst_order_pay_pass())) {
                    return;
                }
                com.max.xiaoheihe.module.account.paysetting.a.f79140a.e(((BaseActivity) MallOrderDetailActivity.this).f66601b, new a());
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40157, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    public class p1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        p1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40200, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class q implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40111, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class q0 extends com.max.hbcommon.network.d<Result<MallOrderDetailObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        q0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40160, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<MallOrderDetailObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40161, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallOrderDetailActivity.this.M = result.getResult();
                MallOrderDetailActivity.X2(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40162, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallOrderDetailObj>) obj);
        }
    }

    public class q1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        q1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40201, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallOrderDetailActivity.b4(MallOrderDetailActivity.this);
        }
    }

    public class r implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40112, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.W = false;
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            MallOrderDetailActivity.r2(mallOrderDetailActivity, MallOrderDetailActivity.o2(mallOrderDetailActivity));
            dialogInterface.dismiss();
        }
    }

    public class r0 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r0() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40127, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallOrderDetailActivity.T2(MallOrderDetailActivity.this);
        }
    }

    public class r1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        r1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40202, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class s implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f89576c;

        s(String str, List list) {
            this.f89575b = str;
            this.f89576c = list;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40113, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.u2(MallOrderDetailActivity.this, this.f89575b, this.f89576c, -1);
        }
    }

    public class s0 extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f89578b;

        s0(ArrayList arrayList) {
            this.f89578b = arrayList;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40164, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40165, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                mallOrderDetailActivity.startActivityForResult(SteamStoreRedeemWalletCodeActivity.u2(((BaseActivity) mallOrderDetailActivity).f66601b, MallOrderDetailActivity.this.L, result.getResult(), this.f89578b), 4);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40166, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    public class s1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        s1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40203, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
            MallOrderDetailActivity.b4(MallOrderDetailActivity.this);
        }
    }

    public class t implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MallSkuObj f89581b;

        t(MallSkuObj mallSkuObj) {
            this.f89581b = mallSkuObj;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40114, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
            mallOrderDetailActivity.startActivity(MallProductDetailActivity.n2(((BaseActivity) mallOrderDetailActivity).f66601b, this.f89581b.getSku_id(), this.f89581b.getH_src()));
        }
    }

    public class t0 extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        public class a implements yh.a<kotlin.b2> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Result f89584b;

            a(Result result) {
                this.f89584b = result;
            }

            public kotlin.b2 a() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40170, new Class[0], kotlin.b2.class);
                if (patchProxyResultProxy.isSupported) {
                    return (kotlin.b2) patchProxyResultProxy.result;
                }
                if (!MallOrderDetailActivity.this.isActive()) {
                    return null;
                }
                MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                mallOrderDetailActivity.startActivityForResult(SteamRedeemWalletCodeLoginActivity.h2(((BaseActivity) mallOrderDetailActivity).f66601b, (SteamWalletJsObj) this.f89584b.getResult(), MallOrderDetailActivity.this.L), 7);
                return null;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ kotlin.b2 invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40171, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a();
            }
        }

        t0() {
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40167, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40168, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MagicUtil.f89378a.c(((BaseActivity) MallOrderDetailActivity.this).f66601b, result.getResult(), new a(result));
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40169, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    public class t1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        t1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40204, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class u implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40115, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.x2(MallOrderDetailActivity.this);
        }
    }

    public class u0 extends com.max.hbcommon.network.d<Result<SteamWalletJsObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89588b;

        u0(String str) {
            this.f89588b = str;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40172, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<SteamWalletJsObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40173, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                mallOrderDetailActivity.startActivityForResult(SteamStorePurchaseGameActivity.a2(((BaseActivity) mallOrderDetailActivity).f66601b, result.getResult(), MallOrderDetailActivity.this.L, this.f89588b), 5);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40174, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<SteamWalletJsObj>) obj);
        }
    }

    public class u1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        u1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40205, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class v implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40104, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.this.onBackPressed();
        }
    }

    public class v0 extends com.max.hbcommon.network.d<Result<MallProxyDataObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f89592b;

        v0(ArrayList arrayList) {
            this.f89592b = arrayList;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
            if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 40175, new Class[]{Throwable.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onError(th2);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
            }
        }

        public void onNext(Result<MallProxyDataObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40176, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.mProgressView.setVisibility(8);
                MallSwitchProxyObj mallSwitchProxyObjK3 = MallOrderDetailActivity.K3(MallOrderDetailActivity.this, result.getResult().getData());
                if (mallSwitchProxyObjK3 == null) {
                    if (com.max.hbcommon.utils.c.u(result.getMsg())) {
                        com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.fail));
                        return;
                    } else {
                        com.max.hbutils.utils.c cVar2 = com.max.hbutils.utils.c.f73533a;
                        com.max.hbutils.utils.c.f(result.getMsg());
                        return;
                    }
                }
                ArrayList arrayList = new ArrayList();
                ArrayList<String> arrayList2 = this.f89592b;
                if (arrayList2 != null) {
                    for (String str : arrayList2) {
                        KeyDescObj keyDescObj = new KeyDescObj();
                        keyDescObj.setKey(str);
                        arrayList.add(keyDescObj);
                    }
                }
                MallOrderDetailActivity mallOrderDetailActivity = MallOrderDetailActivity.this;
                mallOrderDetailActivity.startActivityForResult(GameStoreNintendoTradingActivity.n2(((BaseActivity) mallOrderDetailActivity).f66601b, MallOrderDetailActivity.this.M.getActivite_url(), mallSwitchProxyObjK3.getMsg(), arrayList, mallSwitchProxyObjK3.getProxy()), 6);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40177, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallProxyDataObj>) obj);
        }
    }

    public class v1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        v1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40206, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.b4(MallOrderDetailActivity.this);
            dialogInterface.dismiss();
        }
    }

    public class w implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40117, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.e2(MallOrderDetailActivity.this);
        }
    }

    public class w0 extends com.max.hbcommon.network.d<Result<MallSteamInfoObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        w0() {
        }

        public void onNext(Result<MallSteamInfoObj> result) {
            if (!PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 40178, new Class[]{Result.class}, Void.TYPE).isSupported && MallOrderDetailActivity.this.isActive()) {
                super.onNext(result);
                MallOrderDetailActivity.this.T = result.getResult();
                MallOrderDetailActivity.N3(MallOrderDetailActivity.this);
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 40179, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<MallSteamInfoObj>) obj);
        }
    }

    public class w1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        w1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40207, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class x implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40118, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.e2(MallOrderDetailActivity.this);
        }
    }

    public class x0 implements TextView.OnEditorActionListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f89599b;

        x0(TextView textView) {
            this.f89599b = textView;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView, new Integer(i10), keyEvent}, this, changeQuickRedirect, false, 40180, new Class[]{TextView.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            if (i10 == 6) {
                this.f89599b.performClick();
            }
            return false;
        }
    }

    public class x1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        x1() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40208, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            dialogInterface.dismiss();
        }
    }

    public class y implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f89602b;

        y(TextView textView) {
            this.f89602b = textView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40119, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f89602b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            this.f89602b.setFocusable(true);
            this.f89602b.setSelected(true);
        }
    }

    public class y0 implements TextWatcher {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f89605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f89606d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f89607e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f89608f;

        y0(long j10, TextView textView, TextView textView2, TextView textView3, String str) {
            this.f89604b = j10;
            this.f89605c = textView;
            this.f89606d = textView2;
            this.f89607e = textView3;
            this.f89608f = str;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, changeQuickRedirect, false, 40181, new Class[]{Editable.class}, Void.TYPE).isSupported) {
                return;
            }
            if (com.max.hbutils.utils.n.q(editable.toString()) > this.f89604b) {
                this.f89605c.setText("输入金额超出上限");
                this.f89605c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.delete_red));
                this.f89606d.setVisibility(8);
                this.f89607e.setEnabled(false);
                return;
            }
            this.f89605c.setText(this.f89608f);
            this.f89605c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
            this.f89606d.setVisibility(0);
            this.f89607e.setEnabled(true);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public class y1 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        y1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40198, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(((BaseActivity) MallOrderDetailActivity.this).f66601b, MallOrderDetailActivity.this.M.getOrder_id());
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.text_copied));
        }
    }

    public class z implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89611b;

        z(String str) {
            this.f89611b = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40120, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.xiaoheihe.utils.d.o(((BaseActivity) MallOrderDetailActivity.this).f66601b, this.f89611b);
            com.max.hbutils.utils.c cVar = com.max.hbutils.utils.c.f73533a;
            com.max.hbutils.utils.c.f(MallOrderDetailActivity.this.getString(R.string.cdkey_copied));
        }
    }

    public class z0 implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f89613b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ EditText f89614c;

        z0(long j10, EditText editText) {
            this.f89613b = j10;
            this.f89614c = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 40182, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            this.f89614c.setText(String.valueOf(this.f89613b));
            EditText editText = this.f89614c;
            editText.setSelection(editText.getText().length());
        }
    }

    public class z1 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f89616b;

        z1(String str) {
            this.f89616b = str;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, new Integer(i10)}, this, changeQuickRedirect, false, 40210, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            MallOrderDetailActivity.c4(MallOrderDetailActivity.this, this.f89616b);
            dialogInterface.dismiss();
        }
    }

    public MallOrderDetailActivity() {
        g2 g2Var = new g2();
        this.P3 = g2Var;
        this.Q3 = new com.max.hbshare.c.b(com.max.hbshare.c.f72545a, g2Var, (JsonObject) com.max.hbutils.utils.k.a(getPageAdditional(), JsonObject.class));
    }

    private void A4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40008, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        MallCouponObj mallCouponObj = this.O;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().P(str, this.L, mallCouponObj != null ? mallCouponObj.getCoupon_id() : null).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new n0(str)));
    }

    private void A5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40027, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.prompt).k(R.string.cancel_time_limit_tips).u(getString(R.string.confirm), new w1()).F();
    }

    private void B4() {
        MallOrderDetailObj mallOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39985, new Class[0], Void.TYPE).isSupported || (mallOrderDetailObj = this.M) == null || !this.Y) {
            return;
        }
        this.Y = false;
        N5(mallOrderDetailObj.getShare_info());
    }

    private void B5() {
        Activity activity;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39976, new Class[0], Void.TYPE).isSupported || (activity = this.f66601b) == null || activity.isFinishing() || this.R == null) {
            return;
        }
        View viewInflate = this.f66602c.inflate(R.layout.item_address_confirm, (ViewGroup) null, false);
        com.max.hblogistics.b.b(new com.max.hbcommon.base.adapter.s.e(R.layout.item_address_confirm, viewInflate), this.R);
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.confirm_address).i(viewInflate).t(R.string.confirm, new j()).n(R.string.modify_info, new i()).F();
    }

    private void C5(String str) {
        Activity activity;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39975, new Class[]{String.class}, Void.TYPE).isSupported || (activity = this.f66601b) == null || activity.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.confirm_receipt_title).k(R.string.confirm_receipt_desc).t(R.string.confirm_receipt, new h(str)).n(R.string.cancel, new g()).F();
    }

    private MallSwitchProxyObj D4(EncryptionParamsObj encryptionParamsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{encryptionParamsObj}, this, changeQuickRedirect, false, 40018, new Class[]{EncryptionParamsObj.class}, MallSwitchProxyObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (MallSwitchProxyObj) patchProxyResultProxy.result;
        }
        String strC = com.max.hbcommon.utils.e.c(encryptionParamsObj.getP1(), com.max.xiaoheihe.utils.w.c(encryptionParamsObj.getP3()));
        if (com.max.xiaoheihe.utils.d.a1(strC).equals(encryptionParamsObj.getP2())) {
            return (MallSwitchProxyObj) com.max.hbutils.utils.k.a(strC, MallSwitchProxyObj.class);
        }
        return null;
    }

    private void D5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40003, new Class[0], Void.TYPE).isSupported && this.M3 && this.N3) {
            this.mRefreshLayout.A(0);
            this.mRefreshLayout.p(0);
            x1();
        }
    }

    private String E4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39984, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format(getString(R.string.complete_format), G4());
    }

    private com.max.hbcommon.component.i E5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40020, new Class[0], com.max.hbcommon.component.i.class);
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
        textView.setText(lb.b.f131104t + com.max.hbutils.utils.n.t(String.valueOf(com.max.hbutils.utils.n.p(String.valueOf(com.max.hbutils.utils.n.r(this.U) + com.max.hbutils.utils.n.r(this.Q))) / 1000.0f).replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SP, ".")));
        viewGroup.setBackground(com.max.hbutils.utils.q.E(this.f66601b, R.color.divider_color, 8.0f));
        EditText editText = (EditText) viewInflate.findViewById(R.id.et_hcoin);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_info);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.tv_use_all);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.tv_confirm);
        long j10 = S4()[1];
        String str = getString(R.string.current_h_coin) + ": " + this.M.getTotal_coin() + "，可抵现" + j10;
        textView3.setText(str);
        if (!com.max.hbcommon.utils.c.u(this.Q)) {
            editText.setText(this.Q);
            editText.setSelection(this.Q.length());
        }
        editText.setFilters(new InputFilter[]{new com.max.hbcommon.utils.j(j10)});
        editText.setSingleLine();
        editText.setImeOptions(6);
        editText.setOnEditorActionListener(new x0(textView5));
        editText.addTextChangedListener(new y0(j10, textView3, textView4, textView5, str));
        textView4.setOnClickListener(new z0(j10, editText));
        textView5.setOnClickListener(new a1(editText, iVar));
        textView2.setOnClickListener(new b1());
        iVar.setContentView(viewInflate);
        iVar.setCancelable(true);
        d1 d1Var = new d1(iVar);
        imageView.setOnClickListener(d1Var);
        viewGroup2.setOnClickListener(d1Var);
        iVar.show();
        return iVar;
    }

    private String F4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39981, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format(getString(R.string.activate_automatically_confirm_format), G4());
    }

    private void F5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40024, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
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
        new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.plz_input_coupon_code)).i(editText).u(getString(R.string.confirm), new m1(editText)).o(getString(R.string.cancel), new l1()).F();
        ViewUtils.r0(editText);
    }

    private String G4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39966, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        MallOrderDetailObj mallOrderDetailObj = this.M;
        return (mallOrderDetailObj == null || com.max.hbcommon.utils.c.u(mallOrderDetailObj.getActivate_desc())) ? getString(R.string.activate) : this.M.getActivate_desc();
    }

    private void G5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40048, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.view.a aVar = this.G2;
        if ((aVar == null || !aVar.isShowing()) && !this.G3) {
            this.G2 = new com.max.hbcommon.view.a.f(this.f66601b).l("您是否已经完成了支付").u("已支付", new l2()).o("未支付", new k2()).F();
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", " showPayCompleteConfirmDialog isBlocked==" + this.G3);
    }

    private String H4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39983, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format(getString(R.string.failed_format), G4());
    }

    private void H5(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 40022, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        String str = mallPayInfoObj.getPay_price() + getString(R.string.h_coin);
        SpannableString spannableString = new SpannableString(getString(R.string.should_cost) + " " + str);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.interactive_color)), spannableString.length() - str.length(), spannableString.length(), 33);
        String str2 = getString(R.string.current_h_coin) + ": " + mallPayInfoObj.getTotal_coin();
        TextView textView = new TextView(this.f66601b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, ViewUtils.f(this.f66601b, 10.0f), 0, ViewUtils.f(this.f66601b, 20.0f));
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(0, getResources().getDimensionPixelSize(R.dimen.text_size_12));
        textView.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
        String string = getString(R.string.purchase_agreement);
        SpannableString spannableString2 = new SpannableString(getString(R.string.purchase_agreement_confirm) + string);
        spannableString2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.click_blue)), spannableString2.length() - string.length(), spannableString2.length(), 33);
        textView.setText(spannableString2);
        textView.setOnClickListener(new f1(mallPayInfoObj));
        new com.max.hbcommon.view.a.f(this.f66601b).y(spannableString).l(str2).i(textView).u(getString(R.string.purchase), new h1()).o(getString(R.string.cancel), new g1()).F();
    }

    private String I4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39982, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : String.format(getString(R.string.succeed_format), G4());
    }

    private void I5(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 40021, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.L3 = true;
        com.max.xiaoheihe.module.mall.o.p(this, mallPayInfoObj.getPay_price(), mallPayInfoObj.getTotal_hbalance(), this.M.getPayment_list(), new e1(mallPayInfoObj));
    }

    static /* synthetic */ com.max.hbcommon.component.i J2(MallOrderDetailActivity mallOrderDetailActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40069, new Class[]{MallOrderDetailActivity.class}, com.max.hbcommon.component.i.class);
        return patchProxyResultProxy.isSupported ? (com.max.hbcommon.component.i) patchProxyResultProxy.result : mallOrderDetailActivity.E5();
    }

    public static View J4(Activity activity, OrderDetailActivityObj orderDetailActivityObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{activity, orderDetailActivityObj}, null, changeQuickRedirect, true, 39952, new Class[]{Activity.class, OrderDetailActivityObj.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        if (orderDetailActivityObj == null) {
            return null;
        }
        View viewInflate = activity.getLayoutInflater().inflate(R.layout.item_order_detail_act_old, (ViewGroup) null, false);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_content);
        int iE1 = !com.max.hbcommon.utils.c.u(orderDetailActivityObj.getTitle_color()) ? com.max.xiaoheihe.utils.d.e1(orderDetailActivityObj.getTitle_color()) : activity.getResources().getColor(R.color.text_primary_2_color);
        int iE2 = !com.max.hbcommon.utils.c.u(orderDetailActivityObj.getContent_color()) ? com.max.xiaoheihe.utils.d.e1(orderDetailActivityObj.getContent_color()) : activity.getResources().getColor(R.color.text_primary_2_color);
        textView.setText(orderDetailActivityObj.getTitle());
        textView.setTextColor(iE1);
        textView2.setText(orderDetailActivityObj.getContent());
        textView2.setTextColor(iE2);
        viewInflate.setOnClickListener(new k(activity, orderDetailActivityObj));
        return viewInflate;
    }

    private void J5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40028, new Class[]{String.class}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.prompt).l(String.format(getString(R.string.purchase_game_after_activate_format), G4())).u(getString(R.string.purchase), new z1(str)).o(getString(R.string.cancel), new x1()).g(false).F();
    }

    static /* synthetic */ void K2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40070, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.F5();
    }

    static /* synthetic */ MallSwitchProxyObj K3(MallOrderDetailActivity mallOrderDetailActivity, EncryptionParamsObj encryptionParamsObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderDetailActivity, encryptionParamsObj}, null, changeQuickRedirect, true, 40084, new Class[]{MallOrderDetailActivity.class, EncryptionParamsObj.class}, MallSwitchProxyObj.class);
        return patchProxyResultProxy.isSupported ? (MallSwitchProxyObj) patchProxyResultProxy.result : mallOrderDetailActivity.D4(encryptionParamsObj);
    }

    private String K4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39973, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        MallOrderDetailObj mallOrderDetailObj = this.M;
        return (mallOrderDetailObj == null || mallOrderDetailObj.getBottom_button() == null || com.max.hbcommon.utils.c.u(this.M.getBottom_button().getDesc())) ? G4() : this.M.getBottom_button().getDesc();
    }

    private void K5(MallPayInfoObj mallPayInfoObj) {
        if (PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 40023, new Class[]{MallPayInfoObj.class}, Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        long jR = com.max.hbutils.utils.n.r(mallPayInfoObj.getPay_price()) - com.max.hbutils.utils.n.r(mallPayInfoObj.getTotal_coin());
        String.valueOf(jR);
        com.max.hbcommon.view.a.f fVarL = new com.max.hbcommon.view.a.f(this.f66601b).y(getString(R.string.please_recharge)).l(getString(R.string.current_h_coin) + ": " + mallPayInfoObj.getTotal_coin() + ", " + getString(R.string.also_need_recharge) + String.format("￥%s", com.max.xiaoheihe.module.game.r1.F(jR + "")) + "(" + jR + getString(R.string.h_coin) + ")");
        if (com.max.hbcommon.utils.c.u(mallPayInfoObj.getPay_url())) {
            fVarL.u(getString(R.string.confirm), new k1());
        } else {
            fVarL.u(getString(R.string.go_recharge), new j1(mallPayInfoObj)).o(getString(R.string.cancel), new i1());
        }
        fVarL.F();
    }

    static /* synthetic */ void L2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40071, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.C1();
    }

    private void L4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40007, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        MallCouponObj mallCouponObj = this.O;
        String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
        KeyDescObj keyDescObj = this.P;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().O1(this.L, coupon_id, keyDescObj != null ? keyDescObj.getKey() : null, com.max.hbcommon.utils.c.u(this.Q) ? null : this.Q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new m0()));
    }

    private void L5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40029, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.paid_to_login).k(R.string.paid_login_tips).u(getString(R.string.click_to_login), new a2()).F();
    }

    private void M4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40042, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        MallCouponObj mallCouponObj = this.O;
        String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
        KeyDescObj keyDescObj = this.P;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Kb(this.L, "mall", PaymentManager.A, str, coupon_id, keyDescObj != null ? keyDescObj.getKey() : null, com.max.hbcommon.utils.c.u(this.Q) ? null : this.Q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h2()));
    }

    private void M5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40030, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.login_expire).k(R.string.steam_login_shipping_tips).u(getString(R.string.click_to_login), new b2()).F();
    }

    static /* synthetic */ void N3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40085, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.x5();
    }

    private ArrayList<String> N4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39979, new Class[0], ArrayList.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArrayList) patchProxyResultProxy.result;
        }
        MallOrderDetailObj mallOrderDetailObj = this.M;
        List<MallSkuItemObj> cards = mallOrderDetailObj != null ? mallOrderDetailObj.getCards() : null;
        if (cards != null) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (MallSkuItemObj mallSkuItemObj : cards) {
                if (mallSkuItemObj.getCdkey() != null && mallSkuItemObj.getCdkey().getKeys() != null) {
                    arrayList.addAll(mallSkuItemObj.getCdkey().getKeys());
                }
            }
            if (arrayList.size() > 0) {
                return arrayList;
            }
        }
        return null;
    }

    private void N5(ShareInfoObj shareInfoObj) {
        if (PatchProxy.proxy(new Object[]{shareInfoObj}, this, changeQuickRedirect, false, 40031, new Class[]{ShareInfoObj.class}, Void.TYPE).isSupported || this.f66601b.isFinishing() || shareInfoObj.getShare_window() == null) {
            return;
        }
        ShareWindowObj share_window = shareInfoObj.getShare_window();
        com.max.hbcommon.component.bottomsheet.a aVar = new com.max.hbcommon.component.bottomsheet.a();
        SpannableString spannableString = new SpannableString(share_window.getDesc());
        if (!com.max.hbcommon.utils.c.u(share_window.getDesc_highlight()) && !com.max.hbcommon.utils.c.u(share_window.getDesc()) && share_window.getDesc().contains(share_window.getDesc_highlight())) {
            int iIndexOf = share_window.getDesc().indexOf(share_window.getDesc_highlight());
            spannableString.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange)), iIndexOf, share_window.getDesc_highlight().length() + iIndexOf, 17);
        }
        View viewInflate = this.f66602c.inflate(R.layout.layout_mall_order_share, (ViewGroup) null);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        aVar.h(R.drawable.bottom_sheets_key_discount_28x28).n(R.drawable.bottom_sheets_broken_coupon_80x80).k(true).x(true).l(spannableString).r(viewInflate);
        com.max.hbcommon.component.bottomsheet.q qVarA = aVar.a();
        SpannableString spannableString2 = new SpannableString(share_window.getTitle());
        if (!com.max.hbcommon.utils.c.u(share_window.getTitle_highlight()) && !com.max.hbcommon.utils.c.u(share_window.getTitle()) && share_window.getTitle().contains(share_window.getTitle_highlight())) {
            int iIndexOf2 = share_window.getTitle().indexOf(share_window.getTitle_highlight());
            spannableString2.setSpan(new ForegroundColorSpan(com.max.xiaoheihe.utils.d.E(R.color.coupon_orange)), iIndexOf2, share_window.getTitle_highlight().length() + iIndexOf2, 17);
        }
        HBShareData hBShareData = new HBShareData(false, true, shareInfoObj.getShare_title(), shareInfoObj.getShare_desc(), shareInfoObj.getShare_url(), null, !com.max.hbcommon.utils.c.u(shareInfoObj.getShare_img()) ? new UMImage(this.f66601b, shareInfoObj.getShare_img()) : new UMImage(this.f66601b, R.drawable.share_thumbnail), this.Q3);
        this.Q3.f72577a.h((JsonObject) com.max.hbutils.utils.k.a(getPageAdditional(), JsonObject.class));
        com.max.hbshare.c.a(this.Q3.f72577a.e(), "3", null, this.Q3.f72577a.b());
        View viewFindViewById = viewInflate.findViewById(R.id.vg_wechat_friends);
        View viewFindViewById2 = viewInflate.findViewById(R.id.vg_wechat_timeline);
        View viewFindViewById3 = viewInflate.findViewById(R.id.vg_qq);
        viewFindViewById2.setOnClickListener(new c2(hBShareData, qVarA));
        viewFindViewById.setOnClickListener(new d2(hBShareData, qVarA));
        viewFindViewById3.setOnClickListener(new e2(hBShareData, qVarA));
        qVarA.M3(getSupportFragmentManager(), "share_bottom_dialog");
        qVarA.l4().setText(spannableString2);
        qVarA.e4().setColorFilter(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_2_color));
        ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) ((ConstraintLayout) qVarA.d4()).getLayoutParams())).height = -2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVarA.m4().getLayoutParams();
        marginLayoutParams.topMargin = ViewUtils.f(this.f66601b, 56.0f);
        marginLayoutParams.height = -2;
    }

    static /* synthetic */ void O1(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40053, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.P5();
    }

    private boolean O5() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39989, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        MallSteamInfoObj mallSteamInfoObj = this.T;
        return mallSteamInfoObj != null && "1".equals(mallSteamInfoObj.getCookie());
    }

    static /* synthetic */ void P2(MallOrderDetailActivity mallOrderDetailActivity, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40072, new Class[]{MallOrderDetailActivity.class, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.c5(z10);
    }

    private void P4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40002, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.N3 = false;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().z4(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i0()));
    }

    private void P5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40047, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ProgressDialog progressDialog = this.f89480y1;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f89480y1.dismiss();
        }
        io.reactivex.disposables.a aVar = this.K3;
        if (aVar != null) {
            aVar.f();
        }
        this.f89477p3 = false;
    }

    static /* synthetic */ boolean Q1(MallOrderDetailActivity mallOrderDetailActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40058, new Class[]{MallOrderDetailActivity.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallOrderDetailActivity.O5();
    }

    private void Q4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40000, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        R4(false);
    }

    static /* synthetic */ void R1(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40059, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.z5();
    }

    private void R4(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40001, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.M3 = false;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J0(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new h0(z10)));
    }

    static /* synthetic */ void S2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40073, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.D5();
    }

    private long[] S4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40019, new Class[0], long[].class);
        if (patchProxyResultProxy.isSupported) {
            return (long[]) patchProxyResultProxy.result;
        }
        long[] jArr = new long[2];
        String strValueOf = String.valueOf(com.max.hbutils.utils.n.r(this.U) + com.max.hbutils.utils.n.r(this.Q));
        if (this.M.getMax_deduct_coin() < 0) {
            jArr[0] = com.max.hbutils.utils.n.r(strValueOf);
        } else {
            jArr[0] = Math.min(com.max.hbutils.utils.n.r(strValueOf), this.M.getMax_deduct_coin());
        }
        jArr[1] = Math.min(com.max.hbutils.utils.n.r(this.M.getTotal_coin()), jArr[0]);
        return jArr;
    }

    static /* synthetic */ void T1(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40060, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.y5();
    }

    static /* synthetic */ void T2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40056, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onBackPressed();
    }

    static /* synthetic */ void T3(MallOrderDetailActivity mallOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str}, null, changeQuickRedirect, true, 40086, new Class[]{MallOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.M4(str);
    }

    private void T4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40017, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().K4(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new w0()));
    }

    private boolean U4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39987, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return y4(V4(), this.M.getOrder_type()) == TYPE_CODE.NEED_CHECK_STEAM_INFO || y4(V4(), this.M.getOrder_type()) == TYPE_CODE.CANCEL_ALERT_PAID;
    }

    private boolean V4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39986, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        MallOrderDetailObj mallOrderDetailObj = this.M;
        return mallOrderDetailObj != null && "1".equals(mallOrderDetailObj.getSale_state());
    }

    static /* synthetic */ void W2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40074, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.C1();
    }

    private boolean W4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39988, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        TYPE_CODE type_codeY4 = this.M != null ? y4(V4(), this.M.getOrder_type()) : null;
        MallOrderDetailObj mallOrderDetailObj = this.M;
        if (mallOrderDetailObj == null) {
            return false;
        }
        if (MallOrderDetailObj.ORDER_TYPE_PHYSICAL.equals(mallOrderDetailObj.getOrder_type())) {
            return true;
        }
        return type_codeY4 == TYPE_CODE.WAITING_FOR_PAY || type_codeY4 == TYPE_CODE.CANCELED || type_codeY4 == TYPE_CODE.FAILED;
    }

    static /* synthetic */ void X2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40075, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.b5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X4(MallButtonObj mallButtonObj, View view) {
        if (PatchProxy.proxy(new Object[]{mallButtonObj, view}, this, changeQuickRedirect, false, 40052, new Class[]{MallButtonObj.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.base.router.b.k0(this.f66601b, mallButtonObj.getUrl());
    }

    static /* synthetic */ void Y2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40076, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.C1();
    }

    static /* synthetic */ void Y3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40087, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.d5();
    }

    private void Y4(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39977, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ha(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l()));
    }

    private void Z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40034, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().V7(this.L, this.R.getId()).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new f2()));
    }

    static /* synthetic */ void a4(MallOrderDetailActivity mallOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str}, null, changeQuickRedirect, true, 40088, new Class[]{MallOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.A4(str);
    }

    private void a5() {
        MallOrderDetailObj mallOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39974, new Class[0], Void.TYPE).isSupported || (mallOrderDetailObj = this.M) == null || mallOrderDetailObj.getBottom_button() == null) {
            return;
        }
        MallOrderBottomBtnObj bottom_button = this.M.getBottom_button();
        if ("share".equals(bottom_button.getType()) && this.M.getShare_info() != null) {
            N5(this.M.getShare_info());
            return;
        }
        if ("open_web".equals(bottom_button.getType())) {
            com.max.xiaoheihe.base.router.b.k0(this.f66601b, bottom_button.getUrl());
            return;
        }
        if ("activate".equals(bottom_button.getType())) {
            h5(N4());
            return;
        }
        if ("comfirm_receipt".equals(bottom_button.getType())) {
            C5(this.L);
            return;
        }
        if ("market_balance".equals(bottom_button.getType())) {
            startActivity(SteamBalancePurchaseProgressActivity.f89836x2.a(this.f66601b, this.L, this.M.getSpu_name(), this.M.getGame_info() != null));
            return;
        }
        if ("normal".equals(bottom_button.getType())) {
            com.max.hbcommon.analytics.l.f66572a.q(getPagePath(), getPageAdditional());
            if (this.R != null) {
                B5();
            } else {
                w4();
            }
        }
    }

    static /* synthetic */ void b4(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40089, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.u4();
    }

    private void b5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39962, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        c5(false);
    }

    static /* synthetic */ void c2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40054, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.Q4();
    }

    static /* synthetic */ void c4(MallOrderDetailActivity mallOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str}, null, changeQuickRedirect, true, 40090, new Class[]{MallOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.f5(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v27 */
    private void c5(boolean z10) {
        int i10;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 39963, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        D5();
        if (this.M == null) {
            return;
        }
        this.ll_activities.removeAllViews();
        if (!com.max.hbcommon.utils.c.w(this.M.getActivity_list())) {
            Iterator<OrderDetailActivityObj> it = this.M.getActivity_list().iterator();
            while (it.hasNext()) {
                View viewJ4 = J4(this.f66601b, it.next());
                if (viewJ4 != null) {
                    this.ll_activities.addView(viewJ4);
                }
            }
        }
        if (com.max.hbcommon.utils.c.u(this.U)) {
            this.U = this.M.getPay_price();
        }
        String order_type = this.M.getOrder_type();
        this.M.getPay_time();
        TYPE_CODE type_codeY4 = y4(V4(), order_type);
        boolean zT4 = t4();
        MallCartUtils.f90196a.s(this.mMessageView, this.M.getNotify_message());
        if (com.max.hbcommon.utils.c.v(this.M.getAgreement_title(), this.M.getService_agreement())) {
            this.vg_mall_agreement.setVisibility(8);
        } else {
            this.vg_mall_agreement.setVisibility(0);
            this.vg_mall_agreement.setText(this.M.getAgreement_title());
            this.vg_mall_agreement.setOnClickListener(new n1());
        }
        this.mTipsTitleTextView.setText(this.M.getTitle());
        this.mTipsDescTextView.setText(this.M.getMsg());
        if (com.max.hbcommon.utils.c.u(this.M.getOrder_alert_desc())) {
            this.mPreOrderTipsView.setVisibility(8);
        } else {
            this.mPreOrderTipsView.setVisibility(0);
            this.mPreOrderTipsTextView.setText(this.M.getOrder_alert_desc());
        }
        if ((("cdkey_coupon".equals(order_type) || "market_balance".equals(order_type)) ? false : true) == true) {
            this.mBundlesView.setVisibility(0);
            q5();
        } else {
            this.mBundlesView.setVisibility(8);
        }
        this.mOrderIdDescTextView.setText(String.format("%s：", getString(R.string.order_number)));
        this.mOrderIdTextView.setText(this.M.getOrder_id());
        this.mOrderIdCopyTextView.setOnClickListener(new y1());
        this.mCreateTimeDescTextView.setText(String.format("%s：", getString(R.string.order_create_time)));
        this.mCreateTimeTextView.setText(this.M.getCreate_time());
        this.mPackageNameDescTextView.setText(String.format("%s：", getString(R.string.product_type)));
        this.mPackageNameTextView.setText(this.M.getName());
        if (this.M.getCat_value() == null || this.M.getCat_value().size() <= 0) {
            this.mCatValueLinearLayout.setVisibility(8);
        } else {
            this.mCatValueLinearLayout.setVisibility(0);
            this.mCatValueLinearLayout.removeAllViews();
            for (MallCatObj mallCatObj : this.M.getCat_value()) {
                this.mCatValueLinearLayout.addView(this.f66602c.inflate(R.layout.divider, (ViewGroup) this.mCatValueLinearLayout, false));
                View viewInflate = this.f66602c.inflate(R.layout.item_mall_cat_desc, (ViewGroup) this.mCatValueLinearLayout, false);
                TextView textView = (TextView) viewInflate.findViewById(R.id.tv_title);
                TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
                textView.setText(String.format("%s：", mallCatObj.getTitle()));
                textView2.setText(mallCatObj.getCat_value());
                this.mCatValueLinearLayout.addView(viewInflate);
            }
        }
        v5();
        TYPE_CODE type_codeY5 = y4(V4(), this.M.getOrder_type());
        TYPE_CODE type_code = TYPE_CODE.WAITING_FOR_PAY;
        if (type_codeY5 == type_code) {
            this.mCouponView.setVisibility(0);
            this.mPurchaseCodeView.setVisibility(0);
            this.mCouponDescTextView.setText(String.format("%s：", getString(R.string.coupon)));
            s5();
            this.mPurchaseCodeDescTextView.setText(String.format("%s：", getString(R.string.coupon_code)));
            w5();
            t5();
            if (this.M.getPurchase_params() != null) {
                this.f89481y2 = this.M.getPurchase_params().getPay_type();
                this.f89479x2 = this.M.getPurchase_params().getOut_order_id();
                com.max.hbcommon.utils.d.b("zzzzmalltest", "mOrderDetailObj.getPurchase_params()!=null");
                this.Q = this.M.getPurchase_params().getDeduct_coin();
                if (!com.max.hbcommon.utils.c.u(this.M.getPurchase_params().getCoupon_id())) {
                    MallCouponObj mallCouponObj = new MallCouponObj();
                    this.O = mallCouponObj;
                    mallCouponObj.setCoupon_id(this.M.getPurchase_params().getCoupon_id());
                }
                if (!com.max.hbcommon.utils.c.u(this.M.getPurchase_params().getPurchase_code())) {
                    KeyDescObj keyDescObj = new KeyDescObj();
                    this.P = keyDescObj;
                    keyDescObj.setKey(this.M.getPurchase_params().getPurchase_code());
                }
                g5(this.f89479x2, this.f89481y2, "0", 0, z10);
            }
            L4();
        } else {
            this.mCouponView.setVisibility(8);
            this.mPurchaseCodeView.setVisibility(8);
            this.mDeductView.setVisibility(8);
        }
        if (U4()) {
            T4();
        }
        if (zT4) {
            this.f66616q.setActionX(getString(R.string.cancel_order));
            this.f66616q.setActionXOnClickListener(new j2());
        } else {
            this.f66616q.setActionX((CharSequence) null);
        }
        this.f66616q.setActionIcon(R.drawable.common_service);
        this.f66616q.setActionIconOnClickListener(new m2());
        ?? r10 = !com.max.xiaoheihe.module.mall.o.h(this.M.getOrder_type()) && (com.max.hbcommon.utils.c.w(this.M.getSkus()) || this.M.getSkus().get(0).getButton() == null);
        ?? r11 = (MallOrderDetailObj.ORDER_TYPE_GAME_STEAM_CARDS.equals(order_type) || MallOrderDetailObj.ORDER_TYPE_GAME_RECHARGE_CARDS.equals(order_type) || "market_balance".equals(order_type)) && this.M.getGame_info() != null;
        ?? r12 = "cdkey".equals(order_type) || "cdkey_coupon".equals(order_type) || "bundle".equals(order_type) || r10 == true;
        if (this.R == null) {
            this.R = this.M.getAddress();
        }
        if ((com.max.hbcommon.utils.c.x(this.M.getNeed_choose_address()) || this.R != null) == true) {
            this.mAddressCardView.setVisibility(0);
            this.mAddressContainer.removeAllViews();
            AddressInfoObj addressInfoObj = this.R;
            if (addressInfoObj != null) {
                o4(this.mAddressContainer, addressInfoObj);
            } else {
                q4(this.mAddressContainer);
            }
        } else {
            this.mAddressCardView.setVisibility(8);
        }
        if ((this.M.getExpress_detail() != null) == true) {
            this.mLogisticsCardView.setVisibility(0);
            com.max.hblogistics.g.a(this.mLogisticsCardView, this.M.getExpress_detail());
            i10 = 8;
        } else {
            i10 = 8;
            this.mLogisticsCardView.setVisibility(8);
        }
        if (r11 == true) {
            this.mGameDetailCardView.setVisibility(0);
            u5();
        } else {
            this.mGameDetailCardView.setVisibility(i10);
        }
        if (r12 == true) {
            this.mBundleDetailView.setVisibility(0);
            m5();
        } else {
            this.mBundleDetailView.setVisibility(i10);
        }
        this.mSteamRateTipsTextView.setVisibility((MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS.equals(order_type) || MallOrderDetailObj.ORDER_TYPE_GAME_STEAM_CARDS.equals(order_type)) != false ? 0 : 8);
        V4();
        if (MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS.equals(order_type) && V4()) {
            this.mCancelTipsTextView.setVisibility(0);
            this.mCancelTipsTextView.setText(this.M.getBottom_desc());
        } else {
            this.mCancelTipsTextView.setVisibility(8);
        }
        if ((!MallOrderDetailObj.ORDER_TYPE_PHYSICAL.equals(order_type) || type_codeY4 == type_code || type_codeY4 == TYPE_CODE.CANCELED || type_codeY4 == TYPE_CODE.FAILED) ? false : true) {
            this.mReturnReplacementView.setVisibility(0);
            this.mReturnReplacementTextView.setOnClickListener(new a());
        } else {
            this.mReturnReplacementView.setVisibility(8);
        }
        k5();
        l5();
        C4();
        B4();
    }

    static /* synthetic */ boolean d4(MallOrderDetailActivity mallOrderDetailActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40057, new Class[]{MallOrderDetailActivity.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallOrderDetailActivity.V4();
    }

    private void d5() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40011, new Class[0], Void.TYPE).isSupported && y4(V4(), this.M.getOrder_type()) == TYPE_CODE.WAITING_FOR_PAY) {
            this.mProgressView.setVisibility(0);
            MallCouponObj mallCouponObj = this.O;
            String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
            KeyDescObj keyDescObj = this.P;
            String key = keyDescObj != null ? keyDescObj.getKey() : null;
            String str = !com.max.hbcommon.utils.c.u(this.Q) ? this.Q : null;
            String str2 = !com.max.hbcommon.utils.c.u(this.f89479x2) ? this.f89479x2 : null;
            String str3 = com.max.hbcommon.utils.c.u(this.f89481y2) ? null : this.f89481y2;
            MallOrderDetailObj mallOrderDetailObj = this.M;
            V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().S8(this.L, coupon_id, key, (mallOrderDetailObj == null || mallOrderDetailObj.getPurchase_params() == null) ? this.U : this.M.getPurchase_params().getPay_price(), str, str2, str3).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new p0()));
        }
    }

    static /* synthetic */ void e2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40061, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.a5();
    }

    static /* synthetic */ void e3(MallOrderDetailActivity mallOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str}, null, changeQuickRedirect, true, 40077, new Class[]{MallOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.J5(str);
    }

    private void e5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40014, new Class[0], Void.TYPE).isSupported || this.mProgressView.getVisibility() == 0) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7(SteamWalletJsObj.KEY_LOAD_COOKIE).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new t0()));
    }

    static /* synthetic */ void f2(MallOrderDetailActivity mallOrderDetailActivity, String str) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str}, null, changeQuickRedirect, true, 40062, new Class[]{MallOrderDetailActivity.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.Y4(str);
    }

    private void f5(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40015, new Class[]{String.class}, Void.TYPE).isSupported || this.mProgressView.getVisibility() == 0) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7(SteamWalletJsObj.KEY_PAY).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new u0(str)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    private void g5(String str, String str2, String str3, int i10, boolean z10) {
        int i11 = 1;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 40046, new Class[]{String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported || str == null || str2 == null || this.f89477p3) {
            return;
        }
        this.f89477p3 = true;
        this.f89480y1.setMessage("正在检测订单状态...");
        if (!this.f89480y1.isShowing() && !z10) {
            this.f89480y1.show();
        }
        io.reactivex.z<Result<WeixinQueryObj>> zVarC = this.f89478x1.C(str2, str, str3);
        if (!z10) {
            i11 = 2;
        } else if (i10 > 30) {
            i11 = 10;
        } else if (i10 > 10) {
            i11 = 4;
        } else if (i10 > 5) {
            i11 = 2;
        }
        this.K3.c((io.reactivex.disposables.b) zVarC.C1(i11, TimeUnit.SECONDS).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new i2(z10, i10, str, str2, str3)));
    }

    private void h5(ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 40013, new Class[]{ArrayList.class}, Void.TYPE).isSupported || this.mProgressView.getVisibility() == 0) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().h7(SteamWalletJsObj.KEY_REDEEM_WALLET).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new s0(arrayList)));
    }

    static /* synthetic */ void i2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40063, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.w4();
    }

    private void i5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40004, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J0(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new j0()));
    }

    static /* synthetic */ void j4(MallOrderDetailActivity mallOrderDetailActivity, String str, String str2, String str3, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str, str2, str3, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 40091, new Class[]{MallOrderDetailActivity.class, String.class, String.class, String.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.g5(str, str2, str3, i10, z10);
    }

    private void j5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40005, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J0(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new k0()));
    }

    static /* synthetic */ void k4(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40092, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.G5();
    }

    private void k5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39971, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(this.M.getOrder_award())) {
            this.ll_award.setVisibility(8);
            return;
        }
        this.ll_award.setVisibility(0);
        this.ll_award.removeAllViews();
        for (KeyDescObj keyDescObj : this.M.getOrder_award()) {
            as asVarD = as.d(this.f66602c, this.ll_award, false);
            asVarD.f108623c.setText(keyDescObj.getTitle());
            asVarD.f108623c.setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
            asVarD.f108624d.setText("+" + keyDescObj.getValue());
            if ("hcoin".equals(keyDescObj.getType())) {
                asVarD.f108622b.setVisibility(0);
            } else {
                asVarD.f108622b.setVisibility(8);
            }
            this.ll_award.addView(asVarD.b());
        }
    }

    static /* synthetic */ void l3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40078, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.v5();
    }

    private void l5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39972, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallOrderBottomBtnObj bottom_button = this.M.getBottom_button();
        if (bottom_button == null || bottom_button.isHidden()) {
            this.fl_confirm.setVisibility(8);
            return;
        }
        if (!"alert".equals(bottom_button.getType())) {
            this.fl_confirm.setVisibility(0);
            if (y4(V4(), this.M.getOrder_type()) == TYPE_CODE.WAITING_FOR_PAY) {
                this.mConfirmPriceTextView.setVisibility(0);
            } else {
                this.mConfirmPriceTextView.setVisibility(8);
            }
            this.mConfirmTextView.setText(bottom_button.getDesc());
            this.mConfirmTextView.setOnClickListener(new f());
            if (com.max.hbcommon.utils.c.u(bottom_button.getTips())) {
                this.tv_confirm_tips.setVisibility(8);
                return;
            }
            this.tv_confirm_tips.setText(bottom_button.getTips());
            TextView textView = this.tv_confirm_tips;
            textView.setBackgroundDrawable(ViewUtils.x(ViewUtils.o(this.f66601b, textView), getResources().getColor(R.color.orange_start), getResources().getColor(R.color.orange_end)));
            this.tv_confirm_tips.setVisibility(0);
            return;
        }
        this.fl_confirm.setVisibility(8);
        boolean zEquals = "1".equals(this.M.getBind_phone_num());
        boolean zN0 = com.max.xiaoheihe.utils.d.N0(this.f66601b);
        if (zEquals && zN0) {
            this.mShippingTipsView.setVisibility(8);
            this.mNiceShippingTipsTextView.setVisibility(0);
            return;
        }
        this.mShippingTipsView.setVisibility(0);
        this.mNiceShippingTipsTextView.setVisibility(8);
        if (zEquals) {
            this.mBindPhoneNumberTextView.setVisibility(8);
        } else {
            this.mBindPhoneNumberTextView.setVisibility(0);
            this.mBindPhoneNumberTextView.setOnClickListener(new d());
        }
        if (zN0) {
            this.mOpenPushServiceTextView.setVisibility(8);
        } else {
            this.mOpenPushServiceTextView.setVisibility(0);
            this.mOpenPushServiceTextView.setOnClickListener(new e());
        }
    }

    private void m5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39969, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.L(this.M.getHead_image(), this.mBundleImgImageView, R.drawable.common_default_placeholder_375x210);
        this.mBundleNameTextView.setText(this.M.getName());
    }

    static /* synthetic */ void n3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40079, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.t5();
    }

    private void n4(ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 40016, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Qa(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new v0(arrayList)));
    }

    private void n5(View view, MallSkuItemObj mallSkuItemObj, int i10) {
        MallSteamKeyStateObj next;
        if (PatchProxy.proxy(new Object[]{view, mallSkuItemObj, new Integer(i10)}, this, changeQuickRedirect, false, 39995, new Class[]{View.class, MallSkuItemObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.vg_price);
        TextView textView = (TextView) view.findViewById(R.id.tv_name_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_name_waiting);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_name_and_cnt);
        View viewFindViewById2 = view.findViewById(R.id.vg_activate_state);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_key);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_activate_state);
        TextView textView6 = (TextView) view.findViewById(R.id.tv_copy);
        TextView textView7 = (TextView) view.findViewById(R.id.tv_activate);
        View viewFindViewById3 = view.findViewById(R.id.vg_waiting);
        String name = mallSkuItemObj.getSku() != null ? mallSkuItemObj.getSku().getName() : null;
        textView.setVisibility(0);
        textView.setText(name);
        textView3.setVisibility(8);
        textView2.setVisibility(8);
        viewFindViewById.setVisibility(8);
        viewFindViewById2.setVisibility(0);
        viewFindViewById3.setVisibility(8);
        String str = mallSkuItemObj.getCdkey().getKeys().get(i10);
        textView4.setText(str);
        textView4.setOnClickListener(new y(textView4));
        textView6.setOnClickListener(new z(str));
        textView7.setText(G4());
        textView7.setOnClickListener(new a0(str));
        List<MallSteamKeyStateObj> list = this.Z;
        if (list != null && list.size() > 0) {
            Iterator<MallSteamKeyStateObj> it = this.Z.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!str.equals(next.getKey()));
        } else {
            next = null;
            break;
        }
        if (next == null) {
            textView5.setText((CharSequence) null);
        } else if (1 == next.getState()) {
            textView5.setTextColor(getResources().getColor(R.color.click_blue));
            textView5.setText(I4());
        } else {
            textView5.setTextColor(getResources().getColor(R.color.delete_red));
            textView5.setText("9".equals(next.getError_code()) ? getString(R.string.redeemed_tips) : H4());
        }
    }

    static /* synthetic */ ArrayList o2(MallOrderDetailActivity mallOrderDetailActivity) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40064, new Class[]{MallOrderDetailActivity.class}, ArrayList.class);
        return patchProxyResultProxy.isSupported ? (ArrayList) patchProxyResultProxy.result : mallOrderDetailActivity.N4();
    }

    private void o4(ViewGroup viewGroup, AddressInfoObj addressInfoObj) {
        if (PatchProxy.proxy(new Object[]{viewGroup, addressInfoObj}, this, changeQuickRedirect, false, 39964, new Class[]{ViewGroup.class, AddressInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        viewGroup.removeAllViews();
        View viewInflate = this.f66602c.inflate(R.layout.hblogistics_item_mall_address_choose, viewGroup, false);
        viewGroup.addView(viewInflate);
        com.max.hbcommon.base.adapter.s.e eVar = new com.max.hbcommon.base.adapter.s.e(R.layout.hblogistics_item_mall_address_choose, viewInflate);
        com.max.hblogistics.b.b(eVar, addressInfoObj);
        boolean zX = com.max.hbcommon.utils.c.x(this.M.getNeed_choose_address());
        eVar.i(R.id.iv_more).setVisibility(zX ? 0 : 8);
        if (zX) {
            viewInflate.setOnClickListener(new b());
        } else {
            viewInflate.setClickable(false);
        }
    }

    private void o5(View view, MallSkuItemObj mallSkuItemObj, int i10) {
        if (PatchProxy.proxy(new Object[]{view, mallSkuItemObj, new Integer(i10)}, this, changeQuickRedirect, false, 39996, new Class[]{View.class, MallSkuItemObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.vg_price);
        TextView textView = (TextView) view.findViewById(R.id.tv_name_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_name_waiting);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_name_and_cnt);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_current_rmb);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_original_rmb);
        View viewFindViewById2 = view.findViewById(R.id.vg_activate_state);
        View viewFindViewById3 = view.findViewById(R.id.vg_waiting);
        String name = mallSkuItemObj.getSku() != null ? mallSkuItemObj.getSku().getName() : null;
        Object[] objArr = new Object[1];
        objArr[0] = i10 < 0 ? mallSkuItemObj.getCdkey().getCount() : "1";
        String str = String.format("×%s", objArr);
        SpannableString spannableString = new SpannableString(name + " " + str);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.text_secondary_1_color)), spannableString.length() - str.length(), spannableString.length(), 33);
        textView3.setVisibility(0);
        textView3.setText(spannableString);
        textView.setVisibility(8);
        textView2.setVisibility(8);
        viewFindViewById.setVisibility(0);
        viewFindViewById2.setVisibility(8);
        viewFindViewById3.setVisibility(8);
        String final_price = mallSkuItemObj.getSku().getPrice().getFinal_price();
        String initial_price = mallSkuItemObj.getSku().getPrice().getInitial_price();
        bb.d.d(textView4, 2);
        if ("bundle".equals(this.M.getOrder_type())) {
            textView4.setText(String.format(getString(R.string.rmb_format), com.max.xiaoheihe.module.game.r1.F(initial_price)));
            textView5.setVisibility(8);
        } else {
            if (com.max.hbutils.utils.n.o(final_price) == com.max.hbutils.utils.n.o(initial_price)) {
                textView4.setText(String.format(getString(R.string.rmb_format), com.max.xiaoheihe.module.game.r1.F(final_price)));
                textView5.setVisibility(8);
                return;
            }
            textView4.setText(String.format(getString(R.string.rmb_format), com.max.xiaoheihe.module.game.r1.F(final_price)));
            textView5.setVisibility(0);
            SpannableString spannableString2 = new SpannableString(String.format(getString(R.string.rmb_format), com.max.xiaoheihe.module.game.r1.F(initial_price)));
            spannableString2.setSpan(new StrikethroughSpan(), 0, spannableString2.length(), 33);
            textView5.setText(spannableString2);
        }
    }

    static /* synthetic */ void p2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40055, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.P4();
    }

    static /* synthetic */ void p3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40080, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.w5();
    }

    private void p4(String str, LinearLayout linearLayout, MallSkuItemObj mallSkuItemObj, int i10) {
        if (PatchProxy.proxy(new Object[]{str, linearLayout, mallSkuItemObj, new Integer(i10)}, this, changeQuickRedirect, false, 39991, new Class[]{String.class, LinearLayout.class, MallSkuItemObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (MallOrderDetailObj.ORDER_TYPE_PHYSICAL.equals(str)) {
            r4(linearLayout, mallSkuItemObj, i10);
        } else {
            s4(linearLayout, mallSkuItemObj, i10);
        }
    }

    private void p5(View view, MallSkuItemObj mallSkuItemObj, int i10) {
        MallSteamInfoObj mallSteamInfoObj;
        if (PatchProxy.proxy(new Object[]{view, mallSkuItemObj, new Integer(i10)}, this, changeQuickRedirect, false, 39994, new Class[]{View.class, MallSkuItemObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewFindViewById = view.findViewById(R.id.vg_price);
        TextView textView = (TextView) view.findViewById(R.id.tv_name_top);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_name_waiting);
        TextView textView3 = (TextView) view.findViewById(R.id.tv_name_and_cnt);
        View viewFindViewById2 = view.findViewById(R.id.vg_activate_state);
        View viewFindViewById3 = view.findViewById(R.id.vg_waiting);
        TextView textView4 = (TextView) view.findViewById(R.id.tv_waiting);
        TextView textView5 = (TextView) view.findViewById(R.id.tv_claim);
        String name = mallSkuItemObj.getSku() != null ? mallSkuItemObj.getSku().getName() : null;
        if (V4()) {
            TYPE_CODE type_codeY4 = y4(V4(), this.M.getOrder_type());
            if (i10 >= 0 && mallSkuItemObj.getCdkey().getKeys() != null && mallSkuItemObj.getCdkey().getKeys().size() > 0) {
                n5(view, mallSkuItemObj, i10);
            } else if (type_codeY4 == TYPE_CODE.CANCEL_ALERT_PAID || type_codeY4 == TYPE_CODE.CANCELABLE_PAID || type_codeY4 == TYPE_CODE.NEED_CHECK_STEAM_INFO) {
                textView2.setVisibility(0);
                textView2.setText(name);
                textView.setVisibility(8);
                textView3.setVisibility(8);
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.setVisibility(0);
                textView4.setTextColor(getResources().getColor(R.color.interactive_color));
                textView4.setText("10".equals(this.M.getProduct_state()) ? getString(R.string.pending_for_shipment) : getString(R.string.shipping));
                if (!U4() || (mallSteamInfoObj = this.T) == null || ("1".equals(mallSteamInfoObj.getCookie()) && this.T.isValid())) {
                    textView5.setEnabled(false);
                    textView5.setText("10".equals(this.M.getProduct_state()) ? getString(R.string.not_shipped) : getString(R.string.shipping));
                } else {
                    textView5.setEnabled(true);
                    textView5.setText(getString(R.string.pre_sale_login_steam_tips));
                    textView5.setOnClickListener(new u());
                }
            } else if (type_codeY4 == TYPE_CODE.FINISH) {
                textView2.setVisibility(0);
                textView2.setText(name);
                textView.setVisibility(8);
                textView3.setVisibility(8);
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.setVisibility(0);
                textView4.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                textView4.setText(E4());
                textView5.setEnabled(false);
                textView5.setText(E4());
            } else {
                o5(view, mallSkuItemObj, i10);
            }
        } else if (i10 >= 0 && mallSkuItemObj.getCdkey().getKeys() != null && mallSkuItemObj.getCdkey().getKeys().size() > 0) {
            n5(view, mallSkuItemObj, i10);
        } else if (W4()) {
            o5(view, mallSkuItemObj, i10);
        } else if (MallOrderDetailObj.ORDER_TYPE_CHARGE.equals(this.M.getOrder_type())) {
            if (y4(V4(), this.M.getOrder_type()) == TYPE_CODE.FINISH) {
                textView2.setVisibility(0);
                textView2.setText(name);
                textView.setVisibility(8);
                textView3.setVisibility(8);
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.setVisibility(0);
                textView4.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
                textView4.setText(E4());
                textView5.setEnabled(false);
                textView5.setText(E4());
            } else {
                textView2.setVisibility(0);
                textView2.setText(name);
                textView.setVisibility(8);
                textView3.setVisibility(8);
                viewFindViewById.setVisibility(8);
                viewFindViewById2.setVisibility(8);
                viewFindViewById3.setVisibility(0);
                textView4.setTextColor(getResources().getColor(R.color.click_blue));
                textView4.setText(getString(R.string.to_be_received));
                textView5.setEnabled(true);
                textView5.setText(K4());
                textView5.setOnClickListener(new w());
            }
        } else if (this.M.isCan_activate()) {
            textView2.setVisibility(0);
            textView2.setText(name);
            textView.setVisibility(8);
            textView3.setVisibility(8);
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setVisibility(8);
            viewFindViewById3.setVisibility(0);
            textView4.setTextColor(getResources().getColor(R.color.click_blue));
            textView4.setText(getString(R.string.to_be_received));
            textView5.setEnabled(true);
            textView5.setText(K4());
            textView5.setOnClickListener(new x());
        } else {
            textView2.setVisibility(0);
            textView2.setText(name);
            textView.setVisibility(8);
            textView3.setVisibility(8);
            viewFindViewById.setVisibility(8);
            viewFindViewById2.setVisibility(8);
            viewFindViewById3.setVisibility(0);
            textView4.setTextColor(getResources().getColor(R.color.text_secondary_1_color));
            textView4.setText(getString(R.string.game_sold_out));
            textView5.setEnabled(false);
            textView5.setText(G4());
        }
        if (mallSkuItemObj.getButton() != null) {
            textView4.setVisibility(8);
            final MallButtonObj button = mallSkuItemObj.getButton();
            textView5.setEnabled(com.max.hbcommon.utils.c.x(button.getEnable()));
            textView5.setOnClickListener(new View.OnClickListener() { // from class: com.max.xiaoheihe.module.mall.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f90554b.X4(button, view2);
                }
            });
            textView5.setText(button.getTitle());
        }
    }

    static /* synthetic */ void q2(MallOrderDetailActivity mallOrderDetailActivity, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, arrayList}, null, changeQuickRedirect, true, 40065, new Class[]{MallOrderDetailActivity.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.h5(arrayList);
    }

    private void q4(ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 39965, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        viewGroup.removeAllViews();
        View viewInflate = this.f66602c.inflate(R.layout.hblogistics_item_mall_address, viewGroup, false);
        viewGroup.addView(viewInflate);
        viewInflate.setOnClickListener(new c());
    }

    private void q5() {
        MallOrderDetailObj mallOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39967, new Class[0], Void.TYPE).isSupported || (mallOrderDetailObj = this.M) == null) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(mallOrderDetailObj.getSkus())) {
            this.mBundlesView.setVisibility(8);
        } else if (!com.max.xiaoheihe.module.mall.o.h(this.M.getOrder_type()) && this.M.getSkus().get(0).getButton() == null) {
            this.mBundlesView.setVisibility(8);
        } else {
            this.mBundlesView.setVisibility(0);
            r5(this.M.getOrder_type(), this.M.getSkus(), 3);
        }
    }

    static /* synthetic */ void r2(MallOrderDetailActivity mallOrderDetailActivity, ArrayList arrayList) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, arrayList}, null, changeQuickRedirect, true, 40066, new Class[]{MallOrderDetailActivity.class, ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.n4(arrayList);
    }

    private void r4(LinearLayout linearLayout, MallSkuItemObj mallSkuItemObj, int i10) {
        MallSkuObj sku;
        if (PatchProxy.proxy(new Object[]{linearLayout, mallSkuItemObj, new Integer(i10)}, this, changeQuickRedirect, false, 39992, new Class[]{LinearLayout.class, MallSkuItemObj.class, Integer.TYPE}, Void.TYPE).isSupported || (sku = mallSkuItemObj.getSku()) == null) {
            return;
        }
        View viewInflate = this.f66602c.inflate(R.layout.item_mall_physical_preview, (ViewGroup) linearLayout, false);
        Context context = viewInflate.getContext();
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_name);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.tv_desc);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.tv_price);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        int iF = linearLayout.getChildCount() > 0 ? ViewUtils.f(this.f66601b, 10.0f) : 0;
        if (marginLayoutParams.topMargin != iF) {
            marginLayoutParams.topMargin = iF;
            viewInflate.setLayoutParams(marginLayoutParams);
        }
        linearLayout.addView(viewInflate);
        com.max.hbimage.b.K(sku.getHead_image(), imageView);
        textView.setText(sku.getName());
        textView2.setText(sku.getDesc());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.rmb_symbol));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_13)), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) com.max.xiaoheihe.module.game.r1.F(sku.getPrice() != null ? sku.getPrice().getFinal_price() : null));
        textView3.setText(spannableStringBuilder);
        viewInflate.setOnClickListener(new t(sku));
    }

    private void r5(String str, List<MallSkuItemObj> list, int i10) {
        if (PatchProxy.proxy(new Object[]{str, list, new Integer(i10)}, this, changeQuickRedirect, false, 39990, new Class[]{String.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int size = list != null ? list.size() : 0;
        if (W4() && i10 > 0) {
            size = Math.min(size, i10);
        }
        if (MallOrderDetailObj.ORDER_TYPE_PHYSICAL.equals(str)) {
            this.mBundlesContainerView.setBackgroundColor(getResources().getColor(R.color.white));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mBundlesContainerView.getLayoutParams();
            marginLayoutParams.rightMargin = 0;
            marginLayoutParams.leftMargin = 0;
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.topMargin = 0;
            this.mBundlesContainerView.setLayoutParams(marginLayoutParams);
            this.mBundlesLinearLayout.setPadding(0, 0, 0, 0);
        } else {
            this.mBundlesContainerView.setBackgroundResource(R.drawable.btn_topic_index_bg_2dp);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mBundlesContainerView.getLayoutParams();
            int iF = ViewUtils.f(this.f66601b, 10.0f);
            int iF2 = ViewUtils.f(this.f66601b, 12.0f);
            marginLayoutParams2.rightMargin = iF;
            marginLayoutParams2.leftMargin = iF;
            marginLayoutParams2.bottomMargin = iF2;
            marginLayoutParams2.topMargin = iF2;
            this.mBundlesContainerView.setLayoutParams(marginLayoutParams2);
            this.mBundlesLinearLayout.setPadding(iF, iF2, iF, iF2);
        }
        if (size <= 0) {
            this.mBundlesLinearLayout.setVisibility(8);
            return;
        }
        this.mBundlesLinearLayout.setVisibility(0);
        this.mBundlesLinearLayout.removeAllViews();
        for (int i11 = 0; i11 < size; i11++) {
            MallSkuItemObj mallSkuItemObj = list.get(i11);
            int iQ = com.max.hbutils.utils.n.q(mallSkuItemObj.getCdkey().getCount());
            if (W4()) {
                p4(str, this.mBundlesLinearLayout, mallSkuItemObj, -1);
            } else {
                for (int i12 = 0; i12 < iQ; i12++) {
                    p4(str, this.mBundlesLinearLayout, mallSkuItemObj, i12);
                }
            }
        }
        if (!W4() || size <= i10) {
            this.mBundlesExpandDividerView.setVisibility(8);
            this.mBundlesExpandTextView.setVisibility(8);
            return;
        }
        this.mBundlesExpandDividerView.setVisibility(0);
        this.mBundlesExpandTextView.setVisibility(0);
        bb.d.d(this.mBundlesExpandTextView, 0);
        this.mBundlesExpandTextView.setText(String.format("%s %s", getString(R.string.expand_all), "\uf107"));
        this.mBundlesExpandTextView.setOnClickListener(new s(str, list));
    }

    static /* synthetic */ void s3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40081, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.L4();
    }

    private void s4(LinearLayout linearLayout, MallSkuItemObj mallSkuItemObj, int i10) {
        if (PatchProxy.proxy(new Object[]{linearLayout, mallSkuItemObj, new Integer(i10)}, this, changeQuickRedirect, false, 39993, new Class[]{LinearLayout.class, MallSkuItemObj.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = this.f66602c.inflate(R.layout.item_steam_recharge_card, (ViewGroup) linearLayout, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_img);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_discount);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewInflate.getLayoutParams();
        int iF = linearLayout.getChildCount() > 0 ? ViewUtils.f(this.f66601b, 10.0f) : 0;
        if (marginLayoutParams.topMargin != iF) {
            marginLayoutParams.topMargin = iF;
            viewInflate.setLayoutParams(marginLayoutParams);
        }
        linearLayout.addView(viewInflate);
        com.max.hbimage.b.d0(mallSkuItemObj.getSku().getHead_image(), imageView, ViewUtils.f(this.f66601b, 2.0f));
        com.max.xiaoheihe.module.game.r1.j1(textView, mallSkuItemObj.getSku().getPrice(), this.M.getSale_prefix());
        p5(viewInflate, mallSkuItemObj, i10);
    }

    private void s5() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39997, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.M.getPurchase_params() != null) {
            this.mCouponView.setVisibility(8);
            return;
        }
        this.mCouponView.setVisibility(0);
        if (com.max.hbutils.utils.n.q(this.M.getCoupon_count()) <= 0) {
            if (com.max.hbcommon.utils.c.u(this.M.getAvailable_coupon_count()) || com.max.hbcommon.utils.c.u(this.M.getCoupon_center_protocol())) {
                this.mCouponTextView.setTextColor(getResources().getColor(R.color.text_primary_2_color));
                this.mCouponTextView.setText(getString(R.string.not_available_for_use));
                this.mCouponView.setOnClickListener(new d0());
                return;
            } else {
                this.mCouponTextView.setTextColor(getResources().getColor(R.color.click_blue));
                this.mCouponTextView.setText(String.format(getString(R.string.available_coupon_count), this.M.getAvailable_coupon_count()));
                this.mCouponView.setOnClickListener(new c0());
                return;
            }
        }
        this.mCouponTextView.setTextColor(getResources().getColor(R.color.click_blue));
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
        this.mCouponView.setOnClickListener(new b0());
    }

    private boolean t4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40049, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this.M == null) {
            return false;
        }
        TYPE_CODE type_codeY4 = y4(V4(), this.M.getOrder_type());
        return type_codeY4 == TYPE_CODE.CANCEL_ALERT_PAID || type_codeY4 == TYPE_CODE.CANCELABLE_PAID || type_codeY4 == TYPE_CODE.WAITING_FOR_PAY || type_codeY4 == TYPE_CODE.NEED_CHECK_STEAM_INFO;
    }

    private void t5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39998, new Class[0], Void.TYPE).isSupported) {
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
        String str = " (可抵扣¥" + (S4()[1] / 1000.0f) + ")";
        this.mDeductDescTextView.setText("H币抵现" + str);
        this.mDeductView.setOnClickListener(new e0());
    }

    static /* synthetic */ void u2(MallOrderDetailActivity mallOrderDetailActivity, String str, List list, int i10) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity, str, list, new Integer(i10)}, null, changeQuickRedirect, true, 40067, new Class[]{MallOrderDetailActivity.class, String.class, List.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.r5(str, list, i10);
    }

    private void u4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40006, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().w9(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new l0()));
    }

    private void u5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39968, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbimage.b.L(this.M.getHead_image(), this.mGameImgImageView, R.drawable.common_default_placeholder_375x210);
        this.mGameNameTextView.setText(this.M.getSpu_name());
        this.mGamePackageNameDescTextView.setText(String.format("%s：", getString(R.string.game_version)));
        this.mGamePackageNameTextView.setText(this.M.getName());
        this.mGamePriceDescTextView.setText(String.format("%s：", getString(R.string.game_price)));
        MallPriceObj price = this.M.getGame_info().getPrice();
        if (price != null) {
            if ("heybox".equals(price.getType())) {
                this.mGamePriceTextView.setText(String.format(getString(R.string.rmb_format), price.getCurrent_price()));
            } else if (MallPriceObj.TYPE_ORIGINAL.equals(price.getType())) {
                this.mGamePriceTextView.setText(String.format("%s%s", price.getValue(), price.getDesc()));
            }
        }
    }

    private boolean v4(MallPayInfoObj mallPayInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPayInfoObj}, this, changeQuickRedirect, false, 40032, new Class[]{MallPayInfoObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (com.max.hbcache.c.t()) {
            return true;
        }
        startActivityForResult(MallAgreementActivity.M.a(this.f66601b, mallPayInfoObj.getAgreement_title(), true), 1);
        return false;
    }

    private void v5() {
        MallOrderDetailObj mallOrderDetailObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39970, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallPriceObj mallPriceObj = this.S;
        List<MallDiscountParamsObj> discount_params = mallPriceObj != null ? mallPriceObj.getDiscount_params() : null;
        if (discount_params == null && (mallOrderDetailObj = this.M) != null) {
            discount_params = mallOrderDetailObj.getDiscount_params();
        }
        Activity activity = this.f66601b;
        LinearLayout linearLayout = this.mDiscountInfoLinearLayout;
        com.max.xiaoheihe.module.mall.o.i(activity, discount_params, linearLayout, linearLayout);
        this.mConfirmPriceTextView.setText(String.format(getString(R.string.rmb_format), com.max.xiaoheihe.module.game.r1.F(this.U)));
    }

    static /* synthetic */ boolean w3(MallOrderDetailActivity mallOrderDetailActivity, MallPayInfoObj mallPayInfoObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallOrderDetailActivity, mallPayInfoObj}, null, changeQuickRedirect, true, 40082, new Class[]{MallOrderDetailActivity.class, MallPayInfoObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : mallOrderDetailActivity.v4(mallPayInfoObj);
    }

    private void w4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40009, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        MallCouponObj mallCouponObj = this.O;
        String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
        KeyDescObj keyDescObj = this.P;
        String key = keyDescObj != null ? keyDescObj.getKey() : null;
        AddressInfoObj addressInfoObj = this.R;
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().Ta(this.L, coupon_id, key, this.U, addressInfoObj != null ? addressInfoObj.getId() : null, com.max.hbcommon.utils.c.u(this.Q) ? null : this.Q).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new o0()));
    }

    private void w5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39999, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (this.M.getPurchase_params() != null) {
            this.mPurchaseCodeView.setVisibility(8);
            return;
        }
        this.mPurchaseCodeView.setVisibility(0);
        if (this.P != null) {
            this.mPurchaseCodeTextView.setTextColor(getResources().getColor(R.color.click_blue));
            this.mPurchaseCodeTextView.setText(this.P.getDesc());
        } else {
            this.mPurchaseCodeTextView.setTextColor(getResources().getColor(R.color.text_primary_2_color));
            if (com.max.hbcommon.utils.c.u(this.M.getPurchase_code_desc())) {
                this.mPurchaseCodeTextView.setText(getString(R.string.tap_to_input));
            } else {
                this.mPurchaseCodeTextView.setText(this.M.getPurchase_code_desc());
            }
        }
        this.mPurchaseCodeView.setOnClickListener(new f0());
    }

    static /* synthetic */ void x2(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40068, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.e5();
    }

    private void x5() {
        MallSteamInfoObj mallSteamInfoObj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39978, new Class[0], Void.TYPE).isSupported || (mallSteamInfoObj = this.T) == null) {
            return;
        }
        if (!"1".equals(mallSteamInfoObj.getCookie())) {
            L5();
        } else if (this.T.isValid()) {
            this.mPreOrderAvatarImageView.setVisibility(0);
            this.mPreOrderNameTextView.setVisibility(0);
            com.max.hbimage.b.K(this.T.getAvatar(), this.mPreOrderAvatarImageView);
            this.mPreOrderNameTextView.setText(this.T.getNickname());
        } else {
            M5();
        }
        q5();
    }

    static /* synthetic */ void y3(MallOrderDetailActivity mallOrderDetailActivity) {
        if (PatchProxy.proxy(new Object[]{mallOrderDetailActivity}, null, changeQuickRedirect, true, 40083, new Class[]{MallOrderDetailActivity.class}, Void.TYPE).isSupported) {
            return;
        }
        mallOrderDetailActivity.z4();
    }

    private void y5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40025, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        MallOrderCancelTipObj mallOrderCancelTipObj = this.N;
        if (mallOrderCancelTipObj != null && "deduct".equals(mallOrderCancelTipObj.getType()) && this.N.getDiscount() != null) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase).m(com.max.xiaoheihe.utils.e0.d(String.format("取消订单将失去价值%s超值优惠", this.N.getDiscount()), getResources().getColor(R.color.text_primary_1_color), 9, 9 + this.N.getDiscount().length(), false, bb.d.a().b(4), null)).t(R.string.goto_purchase, new p1()).n(R.string.cancel_order, new o1()).g(false).F();
            return;
        }
        MallOrderCancelTipObj mallOrderCancelTipObj2 = this.N;
        if (mallOrderCancelTipObj2 == null || !"same_count".equals(mallOrderCancelTipObj2.getType())) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase).k(R.string.order_cancel_tip).t(R.string.goto_purchase, new t1()).n(R.string.cancel_order, new s1()).g(false).F();
        } else {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.sure_forgive_purchase).m(com.max.xiaoheihe.utils.e0.d(String.format("还有%s人和你一样选购了这款商品，是否要继续购买", this.N.getCount()), getResources().getColor(R.color.text_primary_1_color), 2, 2 + this.N.getCount().length(), false, bb.d.a().b(4), null)).t(R.string.goto_purchase, new r1()).n(R.string.cancel_order, new q1()).g(false).F();
        }
    }

    private void z4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40010, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.U = this.J3.getPay_price();
        if (!"true".equals(this.M.getEnable_deduct())) {
            if (com.max.hbutils.utils.n.r(this.J3.getTotal_coin()) < com.max.hbutils.utils.n.r(this.J3.getPay_price())) {
                K5(this.J3);
                return;
            } else {
                H5(this.J3);
                return;
            }
        }
        if (com.max.hbutils.utils.n.q(this.J3.getPay_price()) != 0) {
            I5(this.J3);
        } else {
            this.f89481y2 = PaymentManager.A;
            M4("0");
        }
    }

    private void z5() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40026, new Class[0], Void.TYPE).isSupported || !isActive() || this.f66601b.isFinishing()) {
            return;
        }
        new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.prompt).k(R.string.order_queue_tips).u(getString(R.string.cancel_order), new v1()).o(getString(R.string.cancel), new u1()).g(false).F();
    }

    public void C4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39980, new Class[0], Void.TYPE).isSupported || this.M == null) {
            return;
        }
        if (MallOrderDetailObj.ORDER_TYPE_THIRD_CDKEY.equals(this.M.getOrder_type()) && y4(V4(), this.M.getOrder_type()) == TYPE_CODE.PAID) {
            int i10 = this.f89473b0;
            long[] jArr = f89471i4;
            if (i10 < jArr.length) {
                this.f89474c0.sendEmptyMessageDelayed(0, jArr[i10]);
                this.f89473b0++;
            }
        } else {
            this.f89474c0.removeCallbacksAndMessages(null);
        }
        boolean z10 = this.W && (MallOrderDetailObj.ORDER_TYPE_GAME_STEAM_CARDS.equals(this.M.getOrder_type()) || MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS.equals(this.M.getOrder_type())) && this.M.getBottom_button() != null && "activate".equals(this.M.getBottom_button().getType());
        boolean z11 = this.W && (MallOrderDetailObj.ORDER_TYPE_GAME_RECHARGE_CARDS.equals(this.M.getOrder_type()) || MallOrderDetailObj.ORDER_TYPE_RECHARGE_CARDS.equals(this.M.getOrder_type())) && this.M.getPlatform() != null && "switch".equals(this.M.getPlatform().getKey());
        boolean z12 = this.W && MallOrderDetailObj.ORDER_TYPE_CHARGE.equals(this.M.getOrder_type()) && this.M.getBottom_button() != null && this.M.getBottom_button().getUrl() != null;
        boolean z13 = this.W && "market_balance".equals(this.M.getOrder_type()) && "market_balance".equals(this.M.getBottom_button().getType());
        if (z12) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.purchase_succeed).l(F4()).u(G4(), new n()).o(getString(R.string.cancel), new m()).g(false).F();
            return;
        }
        if (z10) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.purchase_succeed).l(F4()).u(G4(), new p()).o(getString(R.string.cancel), new o()).g(false).F();
            return;
        }
        if (z11) {
            new com.max.hbcommon.view.a.f(this.f66601b).x(R.string.purchase_succeed).l(F4()).u(G4(), new r()).o(getString(R.string.cancel), new q()).g(false).F();
        } else if (z13) {
            this.W = false;
            startActivity(SteamBalancePurchaseProgressActivity.f89836x2.a(this.f66601b, this.L, this.M.getSpu_name(), this.M.getGame_info() != null));
        }
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void E3(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40037, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f89479x2 = str;
        P5();
        R4(true);
    }

    public io.reactivex.z<Result<PayOrderObj>> O4(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 40041, new Class[]{String.class, String.class}, io.reactivex.z.class);
        if (patchProxyResultProxy.isSupported) {
            return (io.reactivex.z) patchProxyResultProxy.result;
        }
        MallCouponObj mallCouponObj = this.O;
        String coupon_id = mallCouponObj != null ? mallCouponObj.getCoupon_id() : null;
        KeyDescObj keyDescObj = this.P;
        return com.max.xiaoheihe.network.i.a().Kb(this.L, "mall", str, str2, coupon_id, keyDescObj != null ? keyDescObj.getKey() : null, com.max.hbcommon.utils.c.u(this.Q) ? null : this.Q);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void S1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40043, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "onPaySuccess");
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void U2(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 39960, new Class[]{String.class}, Void.TYPE).isSupported && str.equals(this.f89481y2)) {
            this.f89479x2 = null;
            this.f89481y2 = null;
        }
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void Y0(WeixinQueryObj weixinQueryObj) {
        if (PatchProxy.proxy(new Object[]{weixinQueryObj}, this, changeQuickRedirect, false, 40045, new Class[]{WeixinQueryObj.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "updateUIAfterQuery");
    }

    @Override // com.max.hbcommon.base.BaseActivity, android.app.Activity
    public void finish() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39959, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (t4()) {
            this.f66601b.sendBroadcast(new Intent(lb.a.R));
        }
        super.finish();
    }

    @Override // com.max.hbcommon.base.BaseActivity, com.max.hbcommon.analytics.d.f
    @androidx.annotation.p0
    public String getPageAdditional() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40051, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        MallOrderDetailObj mallOrderDetailObj = this.M;
        if (mallOrderDetailObj != null && !com.max.hbcommon.utils.c.w(mallOrderDetailObj.getSkus())) {
            for (MallSkuItemObj mallSkuItemObj : this.M.getSkus()) {
                if (mallSkuItemObj.getSku() != null && mallSkuItemObj.getSku().getSku_id() != null) {
                    jsonArray.add(mallSkuItemObj.getSku().getSku_id());
                }
            }
        }
        if (jsonArray.size() > 0) {
            jsonObject.addProperty("sku_id", jsonArray.toString());
        }
        MallOrderDetailObj mallOrderDetailObj2 = this.M;
        if (mallOrderDetailObj2 != null) {
            jsonObject.addProperty("h_src", mallOrderDetailObj2.getH_src());
            jsonObject.addProperty("order_id", this.M.getOrder_id());
        }
        return jsonObject.toString();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> j3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40039, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : O4(PaymentManager.f71427z, str);
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void k1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39954, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setContentView(R.layout.activity_mall_order_detail);
        if (com.max.hbcommon.network.b.f68052i) {
            com.max.hbpay.c.a();
        }
        ButterKnife.a(this);
        PaymentManager paymentManager = new PaymentManager(this, this);
        this.f89478x1 = paymentManager;
        paymentManager.U(false);
        ProgressDialog progressDialog = new ProgressDialog(this.f66601b);
        this.f89480y1 = progressDialog;
        progressDialog.setIndeterminate(true);
        this.f89480y1.setCancelable(false);
        this.f89478x1.Q(this.f89480y1);
        Intent intent = getIntent();
        Uri data = intent.getData();
        if (data != null && "heybox".equals(data.getScheme()) && T3.equals(data.getHost())) {
            this.L = data.getQueryParameter("order_id");
        } else {
            this.L = intent.getStringExtra("order_id");
        }
        this.f66616q.setTitle(getString(R.string.order_detail));
        this.f66616q.setNavigationOnClickListener(new v());
        this.f66617r.setVisibility(0);
        this.mRefreshLayout.S(new g0());
        this.mRefreshLayout.b0(false);
        RefreshBroadcastReceiver refreshBroadcastReceiver = new RefreshBroadcastReceiver(this, null);
        this.f89475p1 = refreshBroadcastReceiver;
        t1(refreshBroadcastReceiver, lb.a.A);
        E1();
        Q4();
        P4();
    }

    @Override // com.max.hbcommon.base.BaseActivity
    public void n1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40036, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        E1();
        Q4();
        P4();
    }

    @Override // com.max.hbpay.PaymentManager.g
    public void o1() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40044, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzmalltest", "onPayFailed");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i10, int i11, @androidx.annotation.p0 Intent intent) {
        AddressInfoObj addressInfoObj;
        Object[] objArr = {new Integer(i10), new Integer(i11), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 40033, new Class[]{cls, cls, Intent.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
        UMShareAPI.get(this.f66601b).onActivityResult(i10, i11, intent);
        if (i10 == 1) {
            if (i11 == 2) {
                com.max.hbcache.c.L(true);
                this.V = true;
                return;
            } else {
                if (i11 == 1) {
                    com.max.hbcache.c.L(false);
                    return;
                }
                return;
            }
        }
        if (i10 == 3 && i11 == -1) {
            i5();
            return;
        }
        if (i10 == 4 && i11 == -1) {
            this.Z = intent != null ? (ArrayList) intent.getSerializableExtra("key_list") : null;
            this.f89472a0 = intent != null ? intent.getStringExtra(SteamStoreRedeemWalletCodeActivity.P3) : null;
            this.Y = true;
            List<MallSteamKeyStateObj> list = this.Z;
            if (list == null || list.size() <= 0 || this.f89472a0 == null) {
                Q4();
                return;
            } else {
                j5();
                return;
            }
        }
        if (i10 == 2 && i11 == 10) {
            ArrayList arrayList = intent != null ? (ArrayList) intent.getSerializableExtra("coupon_list") : null;
            if (arrayList == null || arrayList.size() <= 0) {
                this.O = null;
            } else {
                this.O = (MallCouponObj) arrayList.get(0);
            }
            if (this.M != null) {
                s5();
                this.Q = "";
                t5();
                L4();
                return;
            }
            return;
        }
        if (i10 == 5 && i11 == -1) {
            Q4();
            return;
        }
        if (i10 == 111) {
            Q4();
            return;
        }
        if (i10 != 6 || i11 != -1) {
            if (i10 == 7 && i11 == -1) {
                Q4();
                return;
            }
            if (i10 != 8 || i11 != -1 || intent == null || (addressInfoObj = (AddressInfoObj) intent.getSerializableExtra(AddAddressActivity.Q)) == null) {
                return;
            }
            this.R = addressInfoObj;
            o4(this.mAddressContainer, addressInfoObj);
            Z4();
            return;
        }
        ArrayList<KeyDescObj> arrayList2 = (ArrayList) intent.getSerializableExtra("key_list");
        if (arrayList2 == null || arrayList2.size() <= 0) {
            return;
        }
        this.Z = new ArrayList();
        for (KeyDescObj keyDescObj : arrayList2) {
            MallSteamKeyStateObj mallSteamKeyStateObj = new MallSteamKeyStateObj();
            mallSteamKeyStateObj.setKey(keyDescObj.getKey());
            mallSteamKeyStateObj.setState(GameStoreNintendoTradingActivity.G3.equals(keyDescObj.getStatus()) ? 1 : 0);
            this.Z.add(mallSteamKeyStateObj);
        }
        Q4();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39958, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (!this.L3 || this.M == null || y4(V4(), this.M.getOrder_type()) != TYPE_CODE.WAITING_FOR_PAY) {
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
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 39953, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        if (bundle != null) {
            if (bundle.containsKey(f89466d4)) {
                this.O = (MallCouponObj) bundle.getSerializable(f89466d4);
            }
            if (bundle.containsKey(f89467e4)) {
                this.P = (KeyDescObj) bundle.getSerializable(f89467e4);
            }
            if (bundle.containsKey(f89468f4)) {
                this.Q = bundle.getString(f89468f4);
            }
            if (bundle.containsKey(f89469g4)) {
                this.R = (AddressInfoObj) bundle.getSerializable(f89469g4);
            }
            if (bundle.containsKey(f89470h4)) {
                this.U = bundle.getString(f89470h4);
            }
        }
        super.onCreate(bundle);
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40035, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        UMShareAPI.get(this).release();
        this.f89474c0.removeCallbacksAndMessages(null);
        RefreshBroadcastReceiver refreshBroadcastReceiver = this.f89475p1;
        if (refreshBroadcastReceiver != null) {
            this.f66601b.unregisterReceiver(refreshBroadcastReceiver);
        }
        io.reactivex.disposables.a aVar = this.K3;
        if (aVar != null) {
            aVar.f();
        }
        super.onDestroy();
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39957, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        this.G3 = true;
    }

    @Override // com.max.hbcommon.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39956, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        if (!this.O3) {
            n1();
        }
        this.O3 = false;
        this.G3 = false;
        if (com.max.hbcommon.utils.c.u(this.f89479x2)) {
            return;
        }
        if (this.f89477p3) {
            P5();
        }
        g5(this.f89479x2, this.f89481y2, "0", 0, false);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 39961, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResumeFragments();
        if (this.V) {
            this.V = false;
            z4();
        }
        if (this.X) {
            this.X = false;
            Q4();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, 39955, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onSaveInstanceState(bundle);
        MallCouponObj mallCouponObj = this.O;
        if (mallCouponObj != null) {
            bundle.putSerializable(f89466d4, mallCouponObj);
        }
        KeyDescObj keyDescObj = this.P;
        if (keyDescObj != null) {
            bundle.putSerializable(f89467e4, keyDescObj);
        }
        String str = this.Q;
        if (str != null) {
            bundle.putString(f89468f4, str);
        }
        AddressInfoObj addressInfoObj = this.R;
        if (addressInfoObj != null) {
            bundle.putSerializable(f89469g4, addressInfoObj);
        }
        if (com.max.hbcommon.utils.c.u(this.U)) {
            return;
        }
        bundle.putString(f89470h4, this.U);
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> q0(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40038, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : O4(PaymentManager.f71426y, str);
    }

    public void x4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40012, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.mProgressView.setVisibility(0);
        V((io.reactivex.disposables.b) com.max.xiaoheihe.network.i.a().J0(this.L).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new q0()));
    }

    public TYPE_CODE y4(boolean z10, String str) {
        byte b10 = 2;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), str}, this, changeQuickRedirect, false, 40050, new Class[]{Boolean.TYPE, String.class}, TYPE_CODE.class);
        if (patchProxyResultProxy.isSupported) {
            return (TYPE_CODE) patchProxyResultProxy.result;
        }
        String product_state = this.M.getProduct_state();
        product_state.hashCode();
        switch (product_state.hashCode()) {
            case bb.c.b.Oo /* 1444 */:
                b10 = !product_state.equals("-1") ? (byte) -1 : (byte) 0;
                break;
            case bb.c.b.Qo /* 1446 */:
                b10 = !product_state.equals("-3") ? (byte) -1 : (byte) 1;
                break;
            case bb.c.b.hr /* 1567 */:
                if (!product_state.equals("10")) {
                    b10 = -1;
                }
                break;
            case bb.c.b.ir /* 1568 */:
                b10 = !product_state.equals("11") ? (byte) -1 : (byte) 3;
                break;
            case bb.c.b.jr /* 1569 */:
                b10 = !product_state.equals("12") ? (byte) -1 : (byte) 4;
                break;
            case 48625:
                b10 = !product_state.equals("100") ? (byte) -1 : (byte) 5;
                break;
            case 1389220:
                b10 = !product_state.equals("-100") ? (byte) -1 : (byte) 6;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return TYPE_CODE.FAILED;
            case 2:
                if (z10 && str == MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS) {
                    return TYPE_CODE.CANCEL_ALERT_PAID;
                }
                if (z10) {
                    return TYPE_CODE.CANCELABLE_PAID;
                }
                break;
            case 3:
                break;
            case 4:
                return TYPE_CODE.FINISH;
            case 5:
                return TYPE_CODE.WAITING_FOR_PAY;
            case 6:
                return TYPE_CODE.CANCELED;
            default:
                if (com.max.hbutils.utils.n.q(product_state) > 0) {
                    return TYPE_CODE.PAID;
                }
                return null;
        }
        if (z10 && str.equals(MallOrderDetailObj.ORDER_TYPE_STEAM_CARDS)) {
            return TYPE_CODE.NEED_CHECK_STEAM_INFO;
        }
        return null;
    }

    @Override // com.max.hbpay.PaymentManager.g
    public io.reactivex.z<Result<PayOrderObj>> z3(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 40040, new Class[]{String.class}, io.reactivex.z.class);
        return patchProxyResultProxy.isSupported ? (io.reactivex.z) patchProxyResultProxy.result : O4("lianlian", str);
    }
}
