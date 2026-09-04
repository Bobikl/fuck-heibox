package ce;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbpay.bean.PayOrderObj;
import com.max.hbutils.bean.Result;
import com.max.hbwallet.bean.CouponHistoryResultObj;
import com.max.hbwallet.bean.HCoinHistoryResultObj;
import com.max.hbwallet.bean.HbalanceChargeInfoObj;
import com.max.hbwallet.bean.MallCouponListResultObj;
import com.max.hbwallet.bean.ProfitWithdrawResult;
import com.max.hbwallet.bean.RefundDetailObj;
import com.max.hbwallet.bean.VerifyStateObj;
import com.max.hbwallet.bean.WalletInfoObj;
import com.max.hbwallet.bean.WithdrawHomeResult;
import com.max.hbwallet.bean.WithdrawResult;
import com.max.xiaoheihe.bean.game.GameObj;
import io.reactivex.z;
import ll.f;
import ll.t;

/* JADX INFO: compiled from: ApiService.java */
/* JADX INFO: loaded from: classes2.dex */
public interface a {
    @f("mall/coupons/")
    z<Result<MallCouponListResultObj>> A(@t("cat") String str, @t("order_id") String str2, @t("purchase_code") String str3, @t("search_type") String str4, @t("coupon_sku_id") String str5);

    @f("pay/profit/all/withdraw/")
    z<Result<WithdrawResult>> B(@t("type") String str, @t("for_trade") String str2, @t("amount") String str3);

    @f("pay/lianlian_unifiedorder/")
    z<Result<PayOrderObj>> C(@t("currency") String str, @t(GameObj.KEY_POINT_PRICE) String str2);

    @f("pay/ali_trade_app_pay/")
    z<Result<PayOrderObj>> D(@t(GameObj.KEY_POINT_PRICE) String str);

    @f("pay/ali_trade_app_pay/")
    z<Result<PayOrderObj>> b(@t("currency") String str, @t(GameObj.KEY_POINT_PRICE) String str2);

    @f("mall/coupons/")
    z<Result<MallCouponListResultObj>> c(@t("type") String str, @t("cat") String str2, @t("order_id") String str3, @t("purchase_code") String str4, @t(w.c.R) int i10, @t("limit") int i11);

    @f("pay/withdraw/ali_certify/query")
    z<Result<VerifyStateObj>> d(@t("certify_id") String str);

    @f("pay/withdraw/ali_pay_account")
    z<Result> e(@t("op") String str, @t("name") String str2, @t("alipay_logon_id") String str3);

    @f("pay/wallet/hbalance/charge/payment")
    z<Result<HbalanceChargeInfoObj>> f(@t("fee") String str, @t("currency") String str2);

    @f("pay/order/user/refund/detail")
    z<Result<RefundDetailObj>> g(@t("order_id") String str);

    @f("pay/wx_unifiedorder/")
    z<Result<PayOrderObj>> h(@t(GameObj.KEY_POINT_PRICE) String str);

    @f("store/hcoin/history/")
    z<Result<HCoinHistoryResultObj>> i(@t(w.c.R) int i10, @t("limit") int i11);

    @f("store/refund_coupon/")
    z<Result> j(@t("coupon_id") String str);

    @f("store/get_roll_items/")
    z<Result<MallCouponListResultObj>> k(@t(w.c.R) int i10, @t("limit") int i11);

    @f("pay/client_get_withdraw_info/")
    z<Result<ProfitWithdrawResult>> l(@t(w.c.R) int i10, @t("limit") int i11);

    @f("mall/order/cashier/coupons")
    z<Result<MallCouponListResultObj>> m(@t("sku_id") String str, @t("item_num") int i10);

    @f("pay/withdraw/preview")
    z<Result<KeyDescObj>> n(@t("type") String str, @t("for_trade") String str2, @t("amount") String str3);

    @f("pay/wallet/")
    z<Result<WalletInfoObj>> o();

    @f("pay/order/user/refund")
    z<Result> p(@t("order_id") String str);

    @f("mall/backpack/use_item")
    z<Result<KeyDescObj>> q(@t("coupon_id") String str);

    @f("pay/wallet/hbalance/charge/info")
    z<Result<HbalanceChargeInfoObj>> r();

    @f("pay/withdraw/home")
    z<Result<WithdrawHomeResult>> s();

    @f("pay/wx_unifiedorder/")
    z<Result<PayOrderObj>> t(@t("currency") String str, @t(GameObj.KEY_POINT_PRICE) String str2);

    @f("pay/profit/history")
    z<Result<HCoinHistoryResultObj>> u(@t("lastval") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @f("pay/wallet/hbalance/logs")
    z<Result<HCoinHistoryResultObj>> v(@t(w.c.R) int i10, @t("limit") int i11);

    @f("mall/backpack/unusable_items")
    z<Result<CouponHistoryResultObj>> w(@t("lastval") String str);

    @f("pay/client_profit_exchange/")
    z<Result> x(@t("amount_v2") int i10, @t("exchange_type") String str);

    @f("mall/backpack/usable_items")
    z<Result<MallCouponListResultObj>> y(@t("type") String str, @t(w.c.R) int i10, @t("limit") int i11);

    @f("pay/wallet/hbalance/exchange")
    z<Result> z(@t("amount") int i10, @t("type") String str, @t("balance_fee") int i11);
}
