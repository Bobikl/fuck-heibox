package com.max.xiaoheihe.module.trade;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.i1;
import butterknife.Unbinder;
import com.max.hbcustomview.MarqueeTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public final class TradeOrderDetailActivity_ViewBinding implements Unbinder {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TradeOrderDetailActivity f93088b;

    @i1
    public TradeOrderDetailActivity_ViewBinding(TradeOrderDetailActivity tradeOrderDetailActivity) {
        this(tradeOrderDetailActivity, tradeOrderDetailActivity.getWindow().getDecorView());
    }

    @i1
    public TradeOrderDetailActivity_ViewBinding(TradeOrderDetailActivity tradeOrderDetailActivity, View view) {
        this.f93088b = tradeOrderDetailActivity;
        tradeOrderDetailActivity.mMessageView = butterknife.internal.f.e(view, R.id.vg_message, "field 'mMessageView'");
        tradeOrderDetailActivity.mMessageMarqueeTextView = (MarqueeTextView) butterknife.internal.f.f(view, R.id.tv_message, "field 'mMessageMarqueeTextView'", MarqueeTextView.class);
        tradeOrderDetailActivity.mDismissMessageImageView = (ImageView) butterknife.internal.f.f(view, R.id.iv_dismiss_message, "field 'mDismissMessageImageView'", ImageView.class);
        tradeOrderDetailActivity.mTipsTitleTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_tips_title, "field 'mTipsTitleTextView'", TextView.class);
        tradeOrderDetailActivity.mTipsDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_tips_desc, "field 'mTipsDescTextView'", TextView.class);
        tradeOrderDetailActivity.mBundlesView = butterknife.internal.f.e(view, R.id.cv_bundles, "field 'mBundlesView'");
        tradeOrderDetailActivity.mItemView = butterknife.internal.f.e(view, R.id.vg_item_preview, "field 'mItemView'");
        tradeOrderDetailActivity.mOrderIdDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id_desc, "field 'mOrderIdDescTextView'", TextView.class);
        tradeOrderDetailActivity.mOrderIdTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id, "field 'mOrderIdTextView'", TextView.class);
        tradeOrderDetailActivity.mOrderIdCopyTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_order_id_copy, "field 'mOrderIdCopyTextView'", TextView.class);
        tradeOrderDetailActivity.mCreateTimeDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_create_time_desc, "field 'mCreateTimeDescTextView'", TextView.class);
        tradeOrderDetailActivity.mCreateTimeTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_create_time, "field 'mCreateTimeTextView'", TextView.class);
        tradeOrderDetailActivity.mPackageNameDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_package_name_desc, "field 'mPackageNameDescTextView'", TextView.class);
        tradeOrderDetailActivity.mPackageNameTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_package_name, "field 'mPackageNameTextView'", TextView.class);
        tradeOrderDetailActivity.mCatTitleTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_cat_title, "field 'mCatTitleTextView'", TextView.class);
        tradeOrderDetailActivity.mCatDescTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_cat_desc, "field 'mCatDescTextView'", TextView.class);
        tradeOrderDetailActivity.mDiscountInfoLinearLayout = (LinearLayout) butterknife.internal.f.f(view, R.id.ll_discount_info, "field 'mDiscountInfoLinearLayout'", LinearLayout.class);
        tradeOrderDetailActivity.tv_trade_order_offer_tips = (TextView) butterknife.internal.f.f(view, R.id.tv_trade_order_offer_tips, "field 'tv_trade_order_offer_tips'", TextView.class);
        tradeOrderDetailActivity.mConfirmView = butterknife.internal.f.e(view, R.id.vg_confirm, "field 'mConfirmView'");
        tradeOrderDetailActivity.mConfirmPriceTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm_price, "field 'mConfirmPriceTextView'", TextView.class);
        tradeOrderDetailActivity.mConfirmTextView = (TextView) butterknife.internal.f.f(view, R.id.tv_confirm, "field 'mConfirmTextView'", TextView.class);
        tradeOrderDetailActivity.mProgressView = butterknife.internal.f.e(view, R.id.vg_progress, "field 'mProgressView'");
        tradeOrderDetailActivity.mRefreshLayout = (SmartRefreshLayout) butterknife.internal.f.f(view, R.id.srl, "field 'mRefreshLayout'", SmartRefreshLayout.class);
        tradeOrderDetailActivity.vg_root = (ViewGroup) butterknife.internal.f.f(view, R.id.vg_root, "field 'vg_root'", ViewGroup.class);
        tradeOrderDetailActivity.vg_mall_agreement = butterknife.internal.f.e(view, R.id.tv_mall_agreement, "field 'vg_mall_agreement'");
    }

    @Override // butterknife.Unbinder
    public void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 45649, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        TradeOrderDetailActivity tradeOrderDetailActivity = this.f93088b;
        if (tradeOrderDetailActivity == null) {
            throw new IllegalStateException("Bindings already cleared.");
        }
        this.f93088b = null;
        tradeOrderDetailActivity.mMessageView = null;
        tradeOrderDetailActivity.mMessageMarqueeTextView = null;
        tradeOrderDetailActivity.mDismissMessageImageView = null;
        tradeOrderDetailActivity.mTipsTitleTextView = null;
        tradeOrderDetailActivity.mTipsDescTextView = null;
        tradeOrderDetailActivity.mBundlesView = null;
        tradeOrderDetailActivity.mItemView = null;
        tradeOrderDetailActivity.mOrderIdDescTextView = null;
        tradeOrderDetailActivity.mOrderIdTextView = null;
        tradeOrderDetailActivity.mOrderIdCopyTextView = null;
        tradeOrderDetailActivity.mCreateTimeDescTextView = null;
        tradeOrderDetailActivity.mCreateTimeTextView = null;
        tradeOrderDetailActivity.mPackageNameDescTextView = null;
        tradeOrderDetailActivity.mPackageNameTextView = null;
        tradeOrderDetailActivity.mCatTitleTextView = null;
        tradeOrderDetailActivity.mCatDescTextView = null;
        tradeOrderDetailActivity.mDiscountInfoLinearLayout = null;
        tradeOrderDetailActivity.tv_trade_order_offer_tips = null;
        tradeOrderDetailActivity.mConfirmView = null;
        tradeOrderDetailActivity.mConfirmPriceTextView = null;
        tradeOrderDetailActivity.mConfirmTextView = null;
        tradeOrderDetailActivity.mProgressView = null;
        tradeOrderDetailActivity.mRefreshLayout = null;
        tradeOrderDetailActivity.vg_root = null;
        tradeOrderDetailActivity.vg_mall_agreement = null;
    }
}
