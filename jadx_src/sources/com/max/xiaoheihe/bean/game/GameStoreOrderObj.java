package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameStoreOrderObj implements Serializable {
    public static final String PRODUCT_STATE_CANCELLED = "-100";
    public static final String PRODUCT_STATE_COMPLETED = "1";
    public static final String PRODUCT_STATE_GIFT_ORDER_FAILED = "-3";
    public static final String PRODUCT_STATE_GIFT_PENDING_END = "9";
    public static final String PRODUCT_STATE_GIFT_PENDING_START = "1";
    public static final String PRODUCT_STATE_GIFT_RECEIVED = "12";
    public static final String PRODUCT_STATE_GIFT_RECEIVE_TIMEOUT = "11";
    public static final String PRODUCT_STATE_GIFT_RECEIVING = "10";
    public static final String PRODUCT_STATE_UNPAID = "100";
    public static final String PRODUCT_TYPE_CDKEY = "1";
    public static final String PRODUCT_TYPE_COUPON = "3";
    public static final String PRODUCT_TYPE_GIFT = "2";
    public static final String PRODUCT_TYPE_RECHARGE_CARD = "5";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2405135886075853379L;
    private String appid;
    private String buy_type;
    private String buy_type_desc;
    private List<GameRechargeCardObj> cards;
    private String cart_id;
    private boolean checked;
    private String click;
    private String cost_coin;
    private String count;
    private String coupon_desc;
    private String create_time;
    private String faq;
    private String game_icon;
    private String game_img;
    private String game_name;
    private GamePriceObj heybox_price;
    private String key;
    private String order_id;
    private String package_id;
    private String package_title;
    private String product_type;
    private String product_type_desc;
    private String rmb;
    private String state;
    private String state_desc;
    private String state_desc_color;
    private String vaild_desc;
    private String valid;

    public String getAppid() {
        return this.appid;
    }

    public String getBuy_type() {
        return this.buy_type;
    }

    public String getBuy_type_desc() {
        return this.buy_type_desc;
    }

    public List<GameRechargeCardObj> getCards() {
        return this.cards;
    }

    public String getCart_id() {
        return this.cart_id;
    }

    public String getClick() {
        return this.click;
    }

    public String getCost_coin() {
        return this.cost_coin;
    }

    public String getCount() {
        return this.count;
    }

    public String getCoupon_desc() {
        return this.coupon_desc;
    }

    public String getCreate_time() {
        return this.create_time;
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

    public GamePriceObj getHeybox_price() {
        return this.heybox_price;
    }

    public String getKey() {
        return this.key;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getPackage_id() {
        return this.package_id;
    }

    public String getPackage_title() {
        return this.package_title;
    }

    public String getProduct_type() {
        return this.product_type;
    }

    public String getProduct_type_desc() {
        return this.product_type_desc;
    }

    public String getRmb() {
        return this.rmb;
    }

    public String getState() {
        return this.state;
    }

    public String getState_desc() {
        return this.state_desc;
    }

    public String getState_desc_color() {
        return this.state_desc_color;
    }

    public String getVaild_desc() {
        return this.vaild_desc;
    }

    public String getValid() {
        return this.valid;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setBuy_type(String str) {
        this.buy_type = str;
    }

    public void setBuy_type_desc(String str) {
        this.buy_type_desc = str;
    }

    public void setCards(List<GameRechargeCardObj> list) {
        this.cards = list;
    }

    public void setCart_id(String str) {
        this.cart_id = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setClick(String str) {
        this.click = str;
    }

    public void setCost_coin(String str) {
        this.cost_coin = str;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setCoupon_desc(String str) {
        this.coupon_desc = str;
    }

    public void setCreate_time(String str) {
        this.create_time = str;
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

    public void setHeybox_price(GamePriceObj gamePriceObj) {
        this.heybox_price = gamePriceObj;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setPackage_id(String str) {
        this.package_id = str;
    }

    public void setPackage_title(String str) {
        this.package_title = str;
    }

    public void setProduct_type(String str) {
        this.product_type = str;
    }

    public void setProduct_type_desc(String str) {
        this.product_type_desc = str;
    }

    public void setRmb(String str) {
        this.rmb = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setState_desc(String str) {
        this.state_desc = str;
    }

    public void setState_desc_color(String str) {
        this.state_desc_color = str;
    }

    public void setVaild_desc(String str) {
        this.vaild_desc = str;
    }

    public void setValid(String str) {
        this.valid = str;
    }
}
