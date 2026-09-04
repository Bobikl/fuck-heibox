package com.max.xiaoheihe.module.game;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class GameStoreOrderDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private GameStoreOrderDetailActivity f85086b;

    @androidx.annotation.i1
    public GameStoreOrderDetailActivity_ViewBinding(GameStoreOrderDetailActivity gameStoreOrderDetailActivity) {
        this(gameStoreOrderDetailActivity, gameStoreOrderDetailActivity.getWindow().getDecorView());
    }

    @androidx.annotation.i1
    public GameStoreOrderDetailActivity_ViewBinding(GameStoreOrderDetailActivity gameStoreOrderDetailActivity, View view) {
        this.f85086b = gameStoreOrderDetailActivity;
        gameStoreOrderDetailActivity.mMessageView = butterknife.internal.f.e(view, R.id.vg_message, "field 'mMessageView'");
        gameStoreOrderDetailActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        gameStoreOrderDetailActivity.mConfirmView = butterknife.internal.f.e(view, R.id.vg_confirm, "field 'mConfirmView'");
        gameStoreOrderDetailActivity.mConfirmInfoView = butterknife.internal.f.e(view, R.id.vg_confirm_info, "field 'mConfirmInfoView'");
        gameStoreOrderDetailActivity.mDeductionTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_deduction, "field 'mDeductionTextView'", TextView.class);
        gameStoreOrderDetailActivity.mConfirmPriceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm_price, "field 'mConfirmPriceTextView'", TextView.class);
        gameStoreOrderDetailActivity.mOptionTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_option, "field 'mOptionTextView'", TextView.class);
        gameStoreOrderDetailActivity.mConfirmTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm, "field 'mConfirmTextView'", TextView.class);
        gameStoreOrderDetailActivity.mProgressView = butterknife.internal.f.e(view, R.id.vg_progress, "field 'mProgressView'");
        gameStoreOrderDetailActivity.mTipsTitleTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_tips_title, "field 'mTipsTitleTextView'", TextView.class);
        gameStoreOrderDetailActivity.mTipsDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_tips_desc, "field 'mTipsDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mRechargeCardDetailView = butterknife.internal.f.e(view, R.id.vg_recharge_card_detail, "field 'mRechargeCardDetailView'");
        gameStoreOrderDetailActivity.mRechargeCardLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_recharge_cards, "field 'mRechargeCardLinearLayout'", LinearLayout.class);
        gameStoreOrderDetailActivity.mKeysView = butterknife.internal.f.e(view, R.id.vg_keys, "field 'mKeysView'");
        gameStoreOrderDetailActivity.mKeysTitleTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_keys_title, "field 'mKeysTitleTextView'", TextView.class);
        gameStoreOrderDetailActivity.mKeysLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_keys, "field 'mKeysLinearLayout'", LinearLayout.class);
        gameStoreOrderDetailActivity.mKeysDeadlineTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_keys_deadline, "field 'mKeysDeadlineTextView'", TextView.class);
        gameStoreOrderDetailActivity.mOrderDetailView = butterknife.internal.f.e(view, R.id.card_order_detail, "field 'mOrderDetailView'");
        gameStoreOrderDetailActivity.mGameInfoView = butterknife.internal.f.e(view, R.id.vg_game_info, "field 'mGameInfoView'");
        gameStoreOrderDetailActivity.mGameImgImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_game_img, "field 'mGameImgImageView'", ImageView.class);
        gameStoreOrderDetailActivity.mGameNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_name, "field 'mGameNameTextView'", TextView.class);
        gameStoreOrderDetailActivity.mRechargeCardInfoLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_recharge_card_info, "field 'mRechargeCardInfoLinearLayout'", LinearLayout.class);
        gameStoreOrderDetailActivity.mRegionView = butterknife.internal.f.e(view, R.id.vg_region, "field 'mRegionView'");
        gameStoreOrderDetailActivity.mRegionDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_region_desc, "field 'mRegionDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mRegionTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_region, "field 'mRegionTextView'", TextView.class);
        gameStoreOrderDetailActivity.mOrderIdTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id, "field 'mOrderIdTextView'", TextView.class);
        gameStoreOrderDetailActivity.mCreateTimeTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_create_time, "field 'mCreateTimeTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPackageNameView = butterknife.internal.f.e(view, R.id.vg_package_name, "field 'mPackageNameView'");
        gameStoreOrderDetailActivity.mPackageNameDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_package_name_desc, "field 'mPackageNameDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPackageNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_package_name, "field 'mPackageNameTextView'", TextView.class);
        gameStoreOrderDetailActivity.mBuyDescView = butterknife.internal.f.e(view, R.id.vg_buy_desc, "field 'mBuyDescView'");
        gameStoreOrderDetailActivity.mBuyDescDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_buy_desc_desc, "field 'mBuyDescDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mBuyDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_buy_desc, "field 'mBuyDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPriceView = butterknife.internal.f.e(view, R.id.vg_price, "field 'mPriceView'");
        gameStoreOrderDetailActivity.mPriceDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_price_desc, "field 'mPriceDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPriceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_price, "field 'mPriceTextView'", TextView.class);
        gameStoreOrderDetailActivity.mCouponDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_coupon_desc, "field 'mCouponDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mCouponTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_coupon, "field 'mCouponTextView'", TextView.class);
        gameStoreOrderDetailActivity.mCouponView = butterknife.internal.f.e(view, R.id.vg_coupon, "field 'mCouponView'");
        gameStoreOrderDetailActivity.mDeductView = butterknife.internal.f.e(view, R.id.vg_deduct, "field 'mDeductView'");
        gameStoreOrderDetailActivity.mDeductDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_deduct_desc, "field 'mDeductDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mDeductTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_deduct, "field 'mDeductTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPurchaseCodeImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_purchase_code_more, "field 'mPurchaseCodeImageView'", ImageView.class);
        gameStoreOrderDetailActivity.mDeductImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_deduct_more, "field 'mDeductImageView'", ImageView.class);
        gameStoreOrderDetailActivity.mCouponImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_coupon_more, "field 'mCouponImageView'", ImageView.class);
        gameStoreOrderDetailActivity.mPurchaseCodeDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_purchase_code_desc, "field 'mPurchaseCodeDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPurchaseCodeTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_purchase_code, "field 'mPurchaseCodeTextView'", TextView.class);
        gameStoreOrderDetailActivity.mPurchaseCodeView = butterknife.internal.f.e(view, R.id.vg_purchase_code, "field 'mPurchaseCodeView'");
        gameStoreOrderDetailActivity.mOrderPriceView = butterknife.internal.f.e(view, R.id.vg_order_price, "field 'mOrderPriceView'");
        gameStoreOrderDetailActivity.mOrderPriceDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_price_desc, "field 'mOrderPriceDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mOrderPriceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_price, "field 'mOrderPriceTextView'", TextView.class);
        gameStoreOrderDetailActivity.mOrderStatusView = butterknife.internal.f.e(view, R.id.vg_order_status, "field 'mOrderStatusView'");
        gameStoreOrderDetailActivity.mOrderStatusDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_status_desc, "field 'mOrderStatusDescTextView'", TextView.class);
        gameStoreOrderDetailActivity.mOrderStatusLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_order_status, "field 'mOrderStatusLinearLayout'", LinearLayout.class);
        gameStoreOrderDetailActivity.mDiscountInfoLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_discount_info, "field 'mDiscountInfoLinearLayout'", LinearLayout.class);
        gameStoreOrderDetailActivity.vg_discount_info = butterknife.internal.f.e(view, R.id.vg_discount_info, "field 'vg_discount_info'");
        gameStoreOrderDetailActivity.vg_mall_agreement = (TextView) butterknife.internal.f.f(view, R.id.tv_mall_agreement, "field 'vg_mall_agreement'", TextView.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 34199, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        GameStoreOrderDetailActivity gameStoreOrderDetailActivity = this.f85086b;
        if (gameStoreOrderDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f85086b = null;
        gameStoreOrderDetailActivity.mMessageView = null;
        gameStoreOrderDetailActivity.mRefreshLayout = null;
        gameStoreOrderDetailActivity.mConfirmView = null;
        gameStoreOrderDetailActivity.mConfirmInfoView = null;
        gameStoreOrderDetailActivity.mDeductionTextView = null;
        gameStoreOrderDetailActivity.mConfirmPriceTextView = null;
        gameStoreOrderDetailActivity.mOptionTextView = null;
        gameStoreOrderDetailActivity.mConfirmTextView = null;
        gameStoreOrderDetailActivity.mProgressView = null;
        gameStoreOrderDetailActivity.mTipsTitleTextView = null;
        gameStoreOrderDetailActivity.mTipsDescTextView = null;
        gameStoreOrderDetailActivity.mRechargeCardDetailView = null;
        gameStoreOrderDetailActivity.mRechargeCardLinearLayout = null;
        gameStoreOrderDetailActivity.mKeysView = null;
        gameStoreOrderDetailActivity.mKeysTitleTextView = null;
        gameStoreOrderDetailActivity.mKeysLinearLayout = null;
        gameStoreOrderDetailActivity.mKeysDeadlineTextView = null;
        gameStoreOrderDetailActivity.mOrderDetailView = null;
        gameStoreOrderDetailActivity.mGameInfoView = null;
        gameStoreOrderDetailActivity.mGameImgImageView = null;
        gameStoreOrderDetailActivity.mGameNameTextView = null;
        gameStoreOrderDetailActivity.mRechargeCardInfoLinearLayout = null;
        gameStoreOrderDetailActivity.mRegionView = null;
        gameStoreOrderDetailActivity.mRegionDescTextView = null;
        gameStoreOrderDetailActivity.mRegionTextView = null;
        gameStoreOrderDetailActivity.mOrderIdTextView = null;
        gameStoreOrderDetailActivity.mCreateTimeTextView = null;
        gameStoreOrderDetailActivity.mPackageNameView = null;
        gameStoreOrderDetailActivity.mPackageNameDescTextView = null;
        gameStoreOrderDetailActivity.mPackageNameTextView = null;
        gameStoreOrderDetailActivity.mBuyDescView = null;
        gameStoreOrderDetailActivity.mBuyDescDescTextView = null;
        gameStoreOrderDetailActivity.mBuyDescTextView = null;
        gameStoreOrderDetailActivity.mPriceView = null;
        gameStoreOrderDetailActivity.mPriceDescTextView = null;
        gameStoreOrderDetailActivity.mPriceTextView = null;
        gameStoreOrderDetailActivity.mCouponDescTextView = null;
        gameStoreOrderDetailActivity.mCouponTextView = null;
        gameStoreOrderDetailActivity.mCouponView = null;
        gameStoreOrderDetailActivity.mDeductView = null;
        gameStoreOrderDetailActivity.mDeductDescTextView = null;
        gameStoreOrderDetailActivity.mDeductTextView = null;
        gameStoreOrderDetailActivity.mPurchaseCodeImageView = null;
        gameStoreOrderDetailActivity.mDeductImageView = null;
        gameStoreOrderDetailActivity.mCouponImageView = null;
        gameStoreOrderDetailActivity.mPurchaseCodeDescTextView = null;
        gameStoreOrderDetailActivity.mPurchaseCodeTextView = null;
        gameStoreOrderDetailActivity.mPurchaseCodeView = null;
        gameStoreOrderDetailActivity.mOrderPriceView = null;
        gameStoreOrderDetailActivity.mOrderPriceDescTextView = null;
        gameStoreOrderDetailActivity.mOrderPriceTextView = null;
        gameStoreOrderDetailActivity.mOrderStatusView = null;
        gameStoreOrderDetailActivity.mOrderStatusDescTextView = null;
        gameStoreOrderDetailActivity.mOrderStatusLinearLayout = null;
        gameStoreOrderDetailActivity.mDiscountInfoLinearLayout = null;
        gameStoreOrderDetailActivity.vg_discount_info = null;
        gameStoreOrderDetailActivity.vg_mall_agreement = null;
    }
}
