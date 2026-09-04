package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.bean.address.AddressInfoObj;
import com.max.hblogistics.bean.logistics.ExpressDetailObj;
import com.max.hbpay.bean.PayTypeInfoObj;
import com.max.xiaoheihe.bean.ShareInfoObj;
import com.max.xiaoheihe.bean.mall.cart.MallOrderNotifyObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrderDetailObj extends BaseOrderDetailObj {
    public static final String ORDER_TYPE_BUNDLE = "bundle";
    public static final String ORDER_TYPE_CDKEY = "cdkey";
    public static final String ORDER_TYPE_CDKEY_COUPON = "cdkey_coupon";
    public static final String ORDER_TYPE_CHARGE = "charge";
    public static final String ORDER_TYPE_GAME_RECHARGE_CARDS = "game_recharge_cards";
    public static final String ORDER_TYPE_GAME_STEAM_CARDS = "game_steam_cards";
    public static final String ORDER_TYPE_MARKET_BALANCE = "market_balance";
    public static final String ORDER_TYPE_OTHER = "other";
    public static final String ORDER_TYPE_PHYSICAL = "physical";
    public static final String ORDER_TYPE_RECHARGE_CARDS = "recharge_cards";
    public static final String ORDER_TYPE_STEAM_CARDS = "steam_cards";
    public static final String ORDER_TYPE_THIRD_CDKEY = "third_cdkey";
    public static final String PRODUCT_STATE_AWAITING = "2";
    public static final String PRODUCT_STATE_ORDER_CANCELED = "-100";
    public static final String PRODUCT_STATE_ORDER_COMPLETED = "12";
    public static final String PRODUCT_STATE_ORDER_ERROR = "-1";
    public static final String PRODUCT_STATE_ORDER_FAILED = "-3";
    public static final String PRODUCT_STATE_PAID = "1";
    public static final String PRODUCT_STATE_PAID_FOR_SHIPPING = "10";
    public static final String PRODUCT_STATE_PENDING = "100";
    public static final String PRODUCT_STATE_SHIPPING = "11";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String activate_desc;
    private String activite_url;
    private List<OrderDetailActivityObj> activity_list;
    private AddressInfoObj address;
    private String agreement_title;
    private String amount;
    private String bind_phone_num;
    private MallOrderBottomBtnObj bottom_button;
    private String bottom_desc;
    private String btn_desc;
    private boolean can_activate;
    private List<MallSkuItemObj> cards;
    private String cat_desc;
    private List<MallCatObj> cat_value;
    private String cent_price;
    private String coupon_count;
    private String create_time;
    private String current_price;
    private List<MallDiscountParamsObj> discount_params;
    private String enable_deduct;
    private ExpressDetailObj express_detail;
    private String first_order_pay_pass;
    private MallGameInfoObj game_info;
    private String h_src;
    private String has_bind_steam;
    private String head_image;
    private String initial_price;
    private int max_deduct_coin;
    private String msg;
    private String name;
    private String need_choose_address;
    private MallOrderNotifyObj notify_message;
    private String order_alert_desc;
    private List<KeyDescObj> order_award;
    private String order_id;
    private String order_state;
    private String order_status_desc;
    private String order_type;
    private String order_type_desc;
    private String pay_price;
    private String pay_time;
    private List<PayTypeInfoObj> payment_list;
    private MallGamePlatformObj platform;
    private String price;
    private String product_state;
    private String purchase_code_desc;
    private MallPayPurchaseParams purchase_params;
    private String sale_prefix;
    private String sale_state;
    private String service_agreement;
    private ShareInfoObj share_info;
    private String sku_id;
    private List<MallSkuItemObj> skus;
    private String spu_name;
    private String time_left;
    private String title;
    private String title_color;
    private String total_coin;

    public String getActivate_desc() {
        return this.activate_desc;
    }

    public String getActivite_url() {
        return this.activite_url;
    }

    public List<OrderDetailActivityObj> getActivity_list() {
        return this.activity_list;
    }

    public AddressInfoObj getAddress() {
        return this.address;
    }

    public String getAgreement_title() {
        return this.agreement_title;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getBind_phone_num() {
        return this.bind_phone_num;
    }

    public MallOrderBottomBtnObj getBottom_button() {
        return this.bottom_button;
    }

    public String getBottom_desc() {
        return this.bottom_desc;
    }

    public String getBtn_desc() {
        return this.btn_desc;
    }

    public List<MallSkuItemObj> getCards() {
        return this.cards;
    }

    public String getCat_desc() {
        return this.cat_desc;
    }

    public List<MallCatObj> getCat_value() {
        return this.cat_value;
    }

    public String getCent_price() {
        return this.cent_price;
    }

    public String getCoupon_count() {
        return this.coupon_count;
    }

    public String getCreate_time() {
        return this.create_time;
    }

    public String getCurrent_price() {
        return this.current_price;
    }

    public List<MallDiscountParamsObj> getDiscount_params() {
        return this.discount_params;
    }

    public String getEnable_deduct() {
        return this.enable_deduct;
    }

    public ExpressDetailObj getExpress_detail() {
        return this.express_detail;
    }

    public String getFirst_order_pay_pass() {
        return this.first_order_pay_pass;
    }

    public MallGameInfoObj getGame_info() {
        return this.game_info;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getHas_bind_steam() {
        return this.has_bind_steam;
    }

    public String getHead_image() {
        return this.head_image;
    }

    public String getInitial_price() {
        return this.initial_price;
    }

    public int getMax_deduct_coin() {
        return this.max_deduct_coin;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getName() {
        return this.name;
    }

    public String getNeed_choose_address() {
        return this.need_choose_address;
    }

    public MallOrderNotifyObj getNotify_message() {
        return this.notify_message;
    }

    public String getOrder_alert_desc() {
        return this.order_alert_desc;
    }

    public List<KeyDescObj> getOrder_award() {
        return this.order_award;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getOrder_state() {
        return this.order_state;
    }

    public String getOrder_status_desc() {
        return this.order_status_desc;
    }

    public String getOrder_type() {
        return this.order_type;
    }

    public String getOrder_type_desc() {
        return this.order_type_desc;
    }

    public String getPay_price() {
        return this.pay_price;
    }

    public String getPay_time() {
        return this.pay_time;
    }

    public List<PayTypeInfoObj> getPayment_list() {
        return this.payment_list;
    }

    public MallGamePlatformObj getPlatform() {
        return this.platform;
    }

    public String getPrice() {
        return this.price;
    }

    public String getProduct_state() {
        return this.product_state;
    }

    public String getPurchase_code_desc() {
        return this.purchase_code_desc;
    }

    public MallPayPurchaseParams getPurchase_params() {
        return this.purchase_params;
    }

    public String getSale_prefix() {
        return this.sale_prefix;
    }

    public String getSale_state() {
        return this.sale_state;
    }

    public String getService_agreement() {
        return this.service_agreement;
    }

    public ShareInfoObj getShare_info() {
        return this.share_info;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public List<MallSkuItemObj> getSkus() {
        return this.skus;
    }

    public String getSpu_name() {
        return this.spu_name;
    }

    public String getTime_left() {
        return this.time_left;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitle_color() {
        return this.title_color;
    }

    public String getTotal_coin() {
        return this.total_coin;
    }

    public boolean isCan_activate() {
        return this.can_activate;
    }

    public void setActivate_desc(String str) {
        this.activate_desc = str;
    }

    public void setActivite_url(String str) {
        this.activite_url = str;
    }

    public void setActivity_list(List<OrderDetailActivityObj> list) {
        this.activity_list = list;
    }

    public void setAddress(AddressInfoObj addressInfoObj) {
        this.address = addressInfoObj;
    }

    public void setAgreement_title(String str) {
        this.agreement_title = str;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setBind_phone_num(String str) {
        this.bind_phone_num = str;
    }

    public void setBottom_button(MallOrderBottomBtnObj mallOrderBottomBtnObj) {
        this.bottom_button = mallOrderBottomBtnObj;
    }

    public void setBottom_desc(String str) {
        this.bottom_desc = str;
    }

    public void setBtn_desc(String str) {
        this.btn_desc = str;
    }

    public void setCan_activate(boolean z10) {
        this.can_activate = z10;
    }

    public void setCards(List<MallSkuItemObj> list) {
        this.cards = list;
    }

    public void setCat_desc(String str) {
        this.cat_desc = str;
    }

    public void setCat_value(List<MallCatObj> list) {
        this.cat_value = list;
    }

    public void setCent_price(String str) {
        this.cent_price = str;
    }

    public void setCoupon_count(String str) {
        this.coupon_count = str;
    }

    public void setCreate_time(String str) {
        this.create_time = str;
    }

    public void setCurrent_price(String str) {
        this.current_price = str;
    }

    public void setDiscount_params(List<MallDiscountParamsObj> list) {
        this.discount_params = list;
    }

    public void setEnable_deduct(String str) {
        this.enable_deduct = str;
    }

    public void setExpress_detail(ExpressDetailObj expressDetailObj) {
        this.express_detail = expressDetailObj;
    }

    public void setFirst_order_pay_pass(String str) {
        this.first_order_pay_pass = str;
    }

    public void setGame_info(MallGameInfoObj mallGameInfoObj) {
        this.game_info = mallGameInfoObj;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHas_bind_steam(String str) {
        this.has_bind_steam = str;
    }

    public void setHead_image(String str) {
        this.head_image = str;
    }

    public void setInitial_price(String str) {
        this.initial_price = str;
    }

    public void setMax_deduct_coin(int i10) {
        this.max_deduct_coin = i10;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNeed_choose_address(String str) {
        this.need_choose_address = str;
    }

    public void setNotify_message(MallOrderNotifyObj mallOrderNotifyObj) {
        this.notify_message = mallOrderNotifyObj;
    }

    public void setOrder_alert_desc(String str) {
        this.order_alert_desc = str;
    }

    public void setOrder_award(List<KeyDescObj> list) {
        this.order_award = list;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setOrder_state(String str) {
        this.order_state = str;
    }

    public void setOrder_status_desc(String str) {
        this.order_status_desc = str;
    }

    public void setOrder_type(String str) {
        this.order_type = str;
    }

    public void setOrder_type_desc(String str) {
        this.order_type_desc = str;
    }

    public void setPay_price(String str) {
        this.pay_price = str;
    }

    public void setPay_time(String str) {
        this.pay_time = str;
    }

    public void setPayment_list(List<PayTypeInfoObj> list) {
        this.payment_list = list;
    }

    public void setPlatform(MallGamePlatformObj mallGamePlatformObj) {
        this.platform = mallGamePlatformObj;
    }

    public void setPrice(String str) {
        this.price = str;
    }

    public void setProduct_state(String str) {
        this.product_state = str;
    }

    public void setPurchase_code_desc(String str) {
        this.purchase_code_desc = str;
    }

    public void setPurchase_params(MallPayPurchaseParams mallPayPurchaseParams) {
        this.purchase_params = mallPayPurchaseParams;
    }

    public void setSale_prefix(String str) {
        this.sale_prefix = str;
    }

    public void setSale_state(String str) {
        this.sale_state = str;
    }

    public void setService_agreement(String str) {
        this.service_agreement = str;
    }

    public void setShare_info(ShareInfoObj shareInfoObj) {
        this.share_info = shareInfoObj;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setSkus(List<MallSkuItemObj> list) {
        this.skus = list;
    }

    public void setSpu_name(String str) {
        this.spu_name = str;
    }

    public void setTime_left(String str) {
        this.time_left = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitle_color(String str) {
        this.title_color = str;
    }

    public void setTotal_coin(String str) {
        this.total_coin = str;
    }
}
