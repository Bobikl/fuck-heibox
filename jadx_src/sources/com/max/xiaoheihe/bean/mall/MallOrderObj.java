package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.mall.cart.CartItemObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrderObj {
    public static final String CAT_ALL = "all";
    public static final String CAT_GAME = "game";
    public static final String CAT_MALL = "mall";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appid;
    private List<KeyDescObj> buttons;

    /* JADX INFO: renamed from: cat, reason: collision with root package name */
    private String f77004cat;
    private String cost_coin;
    private String count;
    private String coupon_desc;
    private String create_time;
    private String desc;
    private List<CartItemObj> display_items;
    private String faq;
    private String game_icon;
    private String game_img;
    private String game_name;
    private String game_type;
    private String is_large_image;
    private String order_id;
    private String order_src;
    private String presell_state;
    private String product_type;
    private String product_type_desc;
    private String sale_state;
    private String sku_id;
    private String state;
    private String state_desc;
    private String state_desc_color;

    public String getAppid() {
        return this.appid;
    }

    public List<KeyDescObj> getButtons() {
        return this.buttons;
    }

    public String getCat() {
        return this.f77004cat;
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

    public String getDesc() {
        return this.desc;
    }

    public List<CartItemObj> getDisplay_items() {
        return this.display_items;
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

    public String getIs_large_image() {
        return this.is_large_image;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public String getOrder_src() {
        return this.order_src;
    }

    public String getPresell_state() {
        return this.presell_state;
    }

    public String getProduct_type() {
        return this.product_type;
    }

    public String getProduct_type_desc() {
        return this.product_type_desc;
    }

    public String getSale_state() {
        return this.sale_state;
    }

    public String getSku_id() {
        return this.sku_id;
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

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setButtons(List<KeyDescObj> list) {
        this.buttons = list;
    }

    public void setCat(String str) {
        this.f77004cat = str;
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

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDisplay_items(List<CartItemObj> list) {
        this.display_items = list;
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

    public void setIs_large_image(String str) {
        this.is_large_image = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setOrder_src(String str) {
        this.order_src = str;
    }

    public void setPresell_state(String str) {
        this.presell_state = str;
    }

    public void setProduct_type(String str) {
        this.product_type = str;
    }

    public void setProduct_type_desc(String str) {
        this.product_type_desc = str;
    }

    public void setSale_state(String str) {
        this.sale_state = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
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
}
