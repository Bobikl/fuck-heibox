package com.max.xiaoheihe.bean.game;

import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.mall.BaseOrderDetailObj;
import com.max.xiaoheihe.bean.mall.GameStoreOrderKeyObj;
import com.max.xiaoheihe.bean.mall.MallDiscountParamsObj;
import com.max.xiaoheihe.bean.mall.MallPayPurchaseParams;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePurchaseResultObj extends BaseOrderDetailObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activate_message;
    private String activate_url;
    private String agreement_title;
    private String appid;
    private String buy_desc;
    private String buy_extra_desc;
    private String buy_type;
    private String card_region;
    private List<GameRechargeCardObj> cards;
    private String cdkey;
    private String cost_coin;
    private String coupon_count;
    private List<MallDiscountParamsObj> discount_params;
    private String enable_deduct;
    private String faq;
    private String game_icon;
    private String game_img;
    private String game_name;
    private String game_type;
    private String h_src;
    private List<GameStoreOrderKeyObj> keys;
    private int max_deduct_coin;
    private String msg;
    private String not_finish_order;
    private MallOrderNotifyObj notify_message;
    private String order_id;
    private String package_name;
    private HashMap<String, String> params;
    private List<PayTypeInfoObj> payment_list;
    private String price;
    private String product_state;
    private String product_type;
    private String purchase_code_desc;
    private MallPayPurchaseParams purchase_params;
    private String rate;
    private List<GameStoreItemObj> recommend_list;
    private String service_agreement;
    private ShareInfoObj share_info;
    private String time_desc;
    private String title;
    private String total_coin;
    private String use_code;
    private String valid;

    public String getActivate_message() {
        return this.activate_message;
    }

    public String getActivate_url() {
        return this.activate_url;
    }

    public String getAgreement_title() {
        return this.agreement_title;
    }

    public String getAppid() {
        return this.appid;
    }

    public String getBuy_desc() {
        return this.buy_desc;
    }

    public String getBuy_extra_desc() {
        return this.buy_extra_desc;
    }

    public String getBuy_type() {
        return this.buy_type;
    }

    public String getCard_region() {
        return this.card_region;
    }

    public List<GameRechargeCardObj> getCards() {
        return this.cards;
    }

    public String getCdkey() {
        return this.cdkey;
    }

    public String getCost_coin() {
        return this.cost_coin;
    }

    public String getCoupon_count() {
        return this.coupon_count;
    }

    public List<MallDiscountParamsObj> getDiscount_params() {
        return this.discount_params;
    }

    public String getEnable_deduct() {
        return this.enable_deduct;
    }

    public String getFaq() {
        return this.faq;
    }

    public String getGame_icon() {
        return this.game_icon;
    }

    public String getGame_img() {
        return this.game_img;
    }

    public String getGame_name() {
        return this.game_name;
    }

    public String getGame_type() {
        return this.game_type;
    }

    public String getH_src() {
        return this.h_src;
    }

    public List<GameStoreOrderKeyObj> getKeys() {
        return this.keys;
    }

    public int getMax_deduct_coin() {
        return this.max_deduct_coin;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getNot_finish_order() {
        return this.not_finish_order;
    }

    public MallOrderNotifyObj getNotify_message() {
        return this.notify_message;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getPackage_name() {
        return this.package_name;
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public List<PayTypeInfoObj> getPayment_list() {
        return this.payment_list;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProduct_state() {
        return this.product_state;
    }

    public String getProduct_type() {
        return this.product_type;
    }

    public String getPurchase_code_desc() {
        return this.purchase_code_desc;
    }

    public MallPayPurchaseParams getPurchase_params() {
        return this.purchase_params;
    }

    public String getRate() {
        return this.rate;
    }

    public List<GameStoreItemObj> getRecommend_list() {
        return this.recommend_list;
    }

    public String getService_agreement() {
        return this.service_agreement;
    }

    public ShareInfoObj getShare_info() {
        return this.share_info;
    }

    public String getTime_desc() {
        return this.time_desc;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTotal_coin() {
        return this.total_coin;
    }

    public String getUse_code() {
        return this.use_code;
    }

    public String getValid() {
        return this.valid;
    }

    public void setActivate_message(String str) {
        this.activate_message = str;
    }

    public void setActivate_url(String str) {
        this.activate_url = str;
    }

    public void setAgreement_title(String str) {
        this.agreement_title = str;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBuy_desc(String str) {
        this.buy_desc = str;
    }

    public void setBuy_extra_desc(String str) {
        this.buy_extra_desc = str;
    }

    public void setBuy_type(String str) {
        this.buy_type = str;
    }

    public void setCard_region(String str) {
        this.card_region = str;
    }

    public void setCards(List<GameRechargeCardObj> list) {
        this.cards = list;
    }

    public void setCdkey(String str) {
        this.cdkey = str;
    }

    public void setCost_coin(String str) {
        this.cost_coin = str;
    }

    public void setCoupon_count(String str) {
        this.coupon_count = str;
    }

    public void setDiscount_params(List<MallDiscountParamsObj> list) {
        this.discount_params = list;
    }

    public void setEnable_deduct(String str) {
        this.enable_deduct = str;
    }

    public void setFaq(String str) {
        this.faq = str;
    }

    public void setGame_icon(String str) {
        this.game_icon = str;
    }

    public void setGame_img(String str) {
        this.game_img = str;
    }

    public void setGame_name(String str) {
        this.game_name = str;
    }

    public void setGame_type(String str) {
        this.game_type = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setKeys(List<GameStoreOrderKeyObj> list) {
        this.keys = list;
    }

    public void setMax_deduct_coin(int i10) {
        this.max_deduct_coin = i10;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setNot_finish_order(String str) {
        this.not_finish_order = str;
    }

    public void setNotify_message(MallOrderNotifyObj mallOrderNotifyObj) {
        this.notify_message = mallOrderNotifyObj;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setPackage_name(String str) {
        this.package_name = str;
    }

    public void setParams(HashMap<String, String> map) {
        this.params = map;
    }

    public void setPayment_list(List<PayTypeInfoObj> list) {
        this.payment_list = list;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProduct_state(String str) {
        this.product_state = str;
    }

    public void setProduct_type(String str) {
        this.product_type = str;
    }

    public void setPurchase_code_desc(String str) {
        this.purchase_code_desc = str;
    }

    public void setPurchase_params(MallPayPurchaseParams mallPayPurchaseParams) {
        this.purchase_params = mallPayPurchaseParams;
    }

    public void setRate(String str) {
        this.rate = str;
    }

    public void setRecommend_list(List<GameStoreItemObj> list) {
        this.recommend_list = list;
    }

    public void setService_agreement(String str) {
        this.service_agreement = str;
    }

    public void setShare_info(ShareInfoObj shareInfoObj) {
        this.share_info = shareInfoObj;
    }

    public void setTime_desc(String str) {
        this.time_desc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTotal_coin(String str) {
        this.total_coin = str;
    }

    public void setUse_code(String str) {
        this.use_code = str;
    }

    public void setValid(String str) {
        this.valid = str;
    }
}
