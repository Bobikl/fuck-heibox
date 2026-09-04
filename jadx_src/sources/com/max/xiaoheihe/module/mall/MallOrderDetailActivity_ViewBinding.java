package com.max.xiaoheihe.module.mall;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import androidx.cardview.widget.CardView;
import butterknife.Unbinder;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes11.dex */
public class MallOrderDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MallOrderDetailActivity f89618b;

    @i1
    public MallOrderDetailActivity_ViewBinding(MallOrderDetailActivity mallOrderDetailActivity) {
        this(mallOrderDetailActivity, mallOrderDetailActivity.getWindow().getDecorView());
    }

    @i1
    public MallOrderDetailActivity_ViewBinding(MallOrderDetailActivity mallOrderDetailActivity, View view) {
        this.f89618b = mallOrderDetailActivity;
        mallOrderDetailActivity.mMessageView = butterknife.internal.f.e(view, R.id.vg_message, "field 'mMessageView'");
        mallOrderDetailActivity.mTipsTitleTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_tips_title, "field 'mTipsTitleTextView'", TextView.class);
        mallOrderDetailActivity.mTipsDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_tips_desc, "field 'mTipsDescTextView'", TextView.class);
        mallOrderDetailActivity.mPreOrderTipsView = butterknife.internal.f.e(view, R.id.vg_pre_order_tips, "field 'mPreOrderTipsView'");
        mallOrderDetailActivity.mPreOrderAvatarImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_pre_order_avatar, "field 'mPreOrderAvatarImageView'", ImageView.class);
        mallOrderDetailActivity.mPreOrderNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_pre_order_name, "field 'mPreOrderNameTextView'", TextView.class);
        mallOrderDetailActivity.mPreOrderTipsTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_pre_order_tips, "field 'mPreOrderTipsTextView'", TextView.class);
        mallOrderDetailActivity.mShippingTipsView = butterknife.internal.f.e(view, R.id.vg_shipping_tips, "field 'mShippingTipsView'");
        mallOrderDetailActivity.mShippingTipsTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_shipping_tips, "field 'mShippingTipsTextView'", TextView.class);
        mallOrderDetailActivity.mBindPhoneNumberTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_bind_phone_number, "field 'mBindPhoneNumberTextView'", TextView.class);
        mallOrderDetailActivity.mOpenPushServiceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_open_push_service, "field 'mOpenPushServiceTextView'", TextView.class);
        mallOrderDetailActivity.mNiceShippingTipsTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_nice_shipping_tips, "field 'mNiceShippingTipsTextView'", TextView.class);
        mallOrderDetailActivity.mBundlesView = butterknife.internal.f.e(view, R.id.cv_bundles, "field 'mBundlesView'");
        mallOrderDetailActivity.mBundlesContainerView = butterknife.internal.f.e(view, R.id.vg_bundles, "field 'mBundlesContainerView'");
        mallOrderDetailActivity.mBundlesLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_bundles, "field 'mBundlesLinearLayout'", LinearLayout.class);
        mallOrderDetailActivity.mBundlesExpandDividerView = butterknife.internal.f.e(view, R.id.bundles_expand_divider, "field 'mBundlesExpandDividerView'");
        mallOrderDetailActivity.mBundlesExpandTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_bundles_expand, "field 'mBundlesExpandTextView'", TextView.class);
        mallOrderDetailActivity.mOrderIdDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id_desc, "field 'mOrderIdDescTextView'", TextView.class);
        mallOrderDetailActivity.mOrderIdTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id, "field 'mOrderIdTextView'", TextView.class);
        mallOrderDetailActivity.mOrderIdCopyTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id_copy, "field 'mOrderIdCopyTextView'", TextView.class);
        mallOrderDetailActivity.mCreateTimeDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_create_time_desc, "field 'mCreateTimeDescTextView'", TextView.class);
        mallOrderDetailActivity.mCreateTimeTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_create_time, "field 'mCreateTimeTextView'", TextView.class);
        mallOrderDetailActivity.mPackageNameDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_package_name_desc, "field 'mPackageNameDescTextView'", TextView.class);
        mallOrderDetailActivity.mPackageNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_package_name, "field 'mPackageNameTextView'", TextView.class);
        mallOrderDetailActivity.mCatValueLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_cat_value, "field 'mCatValueLinearLayout'", LinearLayout.class);
        mallOrderDetailActivity.mCouponView = butterknife.internal.f.e(view, R.id.vg_coupon, "field 'mCouponView'");
        mallOrderDetailActivity.mDeductView = butterknife.internal.f.e(view, R.id.vg_deduct, "field 'mDeductView'");
        mallOrderDetailActivity.mCouponDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_coupon_desc, "field 'mCouponDescTextView'", TextView.class);
        mallOrderDetailActivity.mCouponTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_coupon, "field 'mCouponTextView'", TextView.class);
        mallOrderDetailActivity.mDeductTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_deduct, "field 'mDeductTextView'", TextView.class);
        mallOrderDetailActivity.mDeductDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_deduct_desc, "field 'mDeductDescTextView'", TextView.class);
        mallOrderDetailActivity.mPurchaseCodeImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_purchase_code_more, "field 'mPurchaseCodeImageView'", ImageView.class);
        mallOrderDetailActivity.mDeductImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_deduct_more, "field 'mDeductImageView'", ImageView.class);
        mallOrderDetailActivity.mCouponImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_coupon_more, "field 'mCouponImageView'", ImageView.class);
        mallOrderDetailActivity.mPurchaseCodeView = butterknife.internal.f.e(view, R.id.vg_purchase_code, "field 'mPurchaseCodeView'");
        mallOrderDetailActivity.mPurchaseCodeDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_purchase_code_desc, "field 'mPurchaseCodeDescTextView'", TextView.class);
        mallOrderDetailActivity.mPurchaseCodeTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_purchase_code, "field 'mPurchaseCodeTextView'", TextView.class);
        mallOrderDetailActivity.mBundleDetailView = butterknife.internal.f.e(view, R.id.cv_bundle_detail, "field 'mBundleDetailView'");
        mallOrderDetailActivity.mBundleImgImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_bundle_img, "field 'mBundleImgImageView'", ImageView.class);
        mallOrderDetailActivity.mBundleDiscountTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_bundle_discount, "field 'mBundleDiscountTextView'", TextView.class);
        mallOrderDetailActivity.mBundleNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_bundle_name, "field 'mBundleNameTextView'", TextView.class);
        mallOrderDetailActivity.mDiscountInfoLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_discount_info, "field 'mDiscountInfoLinearLayout'", LinearLayout.class);
        mallOrderDetailActivity.mGameDetailCardView = butterknife.internal.f.e(view, R.id.cv_game_detail, "field 'mGameDetailCardView'");
        mallOrderDetailActivity.mGameImgImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_game_img, "field 'mGameImgImageView'", ImageView.class);
        mallOrderDetailActivity.mGameDiscountTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_discount, "field 'mGameDiscountTextView'", TextView.class);
        mallOrderDetailActivity.mGameNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_name, "field 'mGameNameTextView'", TextView.class);
        mallOrderDetailActivity.mGamePackageNameDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_package_name_desc, "field 'mGamePackageNameDescTextView'", TextView.class);
        mallOrderDetailActivity.mGamePackageNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_package_name, "field 'mGamePackageNameTextView'", TextView.class);
        mallOrderDetailActivity.mGamePriceDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_price_desc, "field 'mGamePriceDescTextView'", TextView.class);
        mallOrderDetailActivity.mGamePriceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_game_price, "field 'mGamePriceTextView'", TextView.class);
        mallOrderDetailActivity.mSteamRateTipsTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_steam_rate_tips, "field 'mSteamRateTipsTextView'", TextView.class);
        mallOrderDetailActivity.mCancelTipsTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_cancel_tips, "field 'mCancelTipsTextView'", TextView.class);
        mallOrderDetailActivity.mConfirmView = butterknife.internal.f.e(view, R.id.vg_confirm, "field 'mConfirmView'");
        mallOrderDetailActivity.vg_mall_agreement = (TextView) butterknife.internal.f.f(view, R.id.tv_mall_agreement, "field 'vg_mall_agreement'", TextView.class);
        mallOrderDetailActivity.ll_award = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_award, "field 'll_award'", LinearLayout.class);
        mallOrderDetailActivity.mConfirmPriceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm_price, "field 'mConfirmPriceTextView'", TextView.class);
        mallOrderDetailActivity.mConfirmTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm, "field 'mConfirmTextView'", TextView.class);
        mallOrderDetailActivity.tv_confirm_tips = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm_tips, "field 'tv_confirm_tips'", TextView.class);
        mallOrderDetailActivity.fl_confirm = (FrameLayout) butterknife.internal.f.f(view, R.id.fl_confirm, "field 'fl_confirm'", FrameLayout.class);
        mallOrderDetailActivity.mProgressView = butterknife.internal.f.e(view, R.id.vg_progress, "field 'mProgressView'");
        mallOrderDetailActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        mallOrderDetailActivity.mAddressCardView = (CardView) butterknife.internal.f.f(view, R.id.cv_address, "field 'mAddressCardView'", CardView.class);
        mallOrderDetailActivity.mAddressContainer = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_address, "field 'mAddressContainer'", ViewGroup.class);
        mallOrderDetailActivity.mLogisticsCardView = (CardView) butterknife.internal.f.f(view, R.id.cv_logistics, "field 'mLogisticsCardView'", CardView.class);
        mallOrderDetailActivity.mReturnReplacementView = butterknife.internal.f.e(view, R.id.vg_return_replacement, "field 'mReturnReplacementView'");
        mallOrderDetailActivity.mReturnReplacementTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_return_replacement, "field 'mReturnReplacementTextView'", TextView.class);
        mallOrderDetailActivity.vg_root = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_root, "field 'vg_root'", ViewGroup.class);
        mallOrderDetailActivity.ll_activities = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_activities, "field 'll_activities'", LinearLayout.class);
    }

    @Override // butterknife.Unbinder
    @androidx.annotation.i
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 40234, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        MallOrderDetailActivity mallOrderDetailActivity = this.f89618b;
        if (mallOrderDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f89618b = null;
        mallOrderDetailActivity.mMessageView = null;
        mallOrderDetailActivity.mTipsTitleTextView = null;
        mallOrderDetailActivity.mTipsDescTextView = null;
        mallOrderDetailActivity.mPreOrderTipsView = null;
        mallOrderDetailActivity.mPreOrderAvatarImageView = null;
        mallOrderDetailActivity.mPreOrderNameTextView = null;
        mallOrderDetailActivity.mPreOrderTipsTextView = null;
        mallOrderDetailActivity.mShippingTipsView = null;
        mallOrderDetailActivity.mShippingTipsTextView = null;
        mallOrderDetailActivity.mBindPhoneNumberTextView = null;
        mallOrderDetailActivity.mOpenPushServiceTextView = null;
        mallOrderDetailActivity.mNiceShippingTipsTextView = null;
        mallOrderDetailActivity.mBundlesView = null;
        mallOrderDetailActivity.mBundlesContainerView = null;
        mallOrderDetailActivity.mBundlesLinearLayout = null;
        mallOrderDetailActivity.mBundlesExpandDividerView = null;
        mallOrderDetailActivity.mBundlesExpandTextView = null;
        mallOrderDetailActivity.mOrderIdDescTextView = null;
        mallOrderDetailActivity.mOrderIdTextView = null;
        mallOrderDetailActivity.mOrderIdCopyTextView = null;
        mallOrderDetailActivity.mCreateTimeDescTextView = null;
        mallOrderDetailActivity.mCreateTimeTextView = null;
        mallOrderDetailActivity.mPackageNameDescTextView = null;
        mallOrderDetailActivity.mPackageNameTextView = null;
        mallOrderDetailActivity.mCatValueLinearLayout = null;
        mallOrderDetailActivity.mCouponView = null;
        mallOrderDetailActivity.mDeductView = null;
        mallOrderDetailActivity.mCouponDescTextView = null;
        mallOrderDetailActivity.mCouponTextView = null;
        mallOrderDetailActivity.mDeductTextView = null;
        mallOrderDetailActivity.mDeductDescTextView = null;
        mallOrderDetailActivity.mPurchaseCodeImageView = null;
        mallOrderDetailActivity.mDeductImageView = null;
        mallOrderDetailActivity.mCouponImageView = null;
        mallOrderDetailActivity.mPurchaseCodeView = null;
        mallOrderDetailActivity.mPurchaseCodeDescTextView = null;
        mallOrderDetailActivity.mPurchaseCodeTextView = null;
        mallOrderDetailActivity.mBundleDetailView = null;
        mallOrderDetailActivity.mBundleImgImageView = null;
        mallOrderDetailActivity.mBundleDiscountTextView = null;
        mallOrderDetailActivity.mBundleNameTextView = null;
        mallOrderDetailActivity.mDiscountInfoLinearLayout = null;
        mallOrderDetailActivity.mGameDetailCardView = null;
        mallOrderDetailActivity.mGameImgImageView = null;
        mallOrderDetailActivity.mGameDiscountTextView = null;
        mallOrderDetailActivity.mGameNameTextView = null;
        mallOrderDetailActivity.mGamePackageNameDescTextView = null;
        mallOrderDetailActivity.mGamePackageNameTextView = null;
        mallOrderDetailActivity.mGamePriceDescTextView = null;
        mallOrderDetailActivity.mGamePriceTextView = null;
        mallOrderDetailActivity.mSteamRateTipsTextView = null;
        mallOrderDetailActivity.mCancelTipsTextView = null;
        mallOrderDetailActivity.mConfirmView = null;
        mallOrderDetailActivity.vg_mall_agreement = null;
        mallOrderDetailActivity.ll_award = null;
        mallOrderDetailActivity.mConfirmPriceTextView = null;
        mallOrderDetailActivity.mConfirmTextView = null;
        mallOrderDetailActivity.tv_confirm_tips = null;
        mallOrderDetailActivity.fl_confirm = null;
        mallOrderDetailActivity.mProgressView = null;
        mallOrderDetailActivity.mRefreshLayout = null;
        mallOrderDetailActivity.mAddressCardView = null;
        mallOrderDetailActivity.mAddressContainer = null;
        mallOrderDetailActivity.mLogisticsCardView = null;
        mallOrderDetailActivity.mReturnReplacementView = null;
        mallOrderDetailActivity.mReturnReplacementTextView = null;
        mallOrderDetailActivity.vg_root = null;
        mallOrderDetailActivity.ll_activities = null;
    }
}
