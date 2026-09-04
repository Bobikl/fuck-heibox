package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.MenuObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameStoreObj implements Serializable {
    public static final String SORT_PRICE_DOWN = "2";
    public static final String SORT_PRICE_UP = "1";
    public static final String SORT_SALES_DOWN = "4";
    public static final String SORT_SALES_UP = "3";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7715842565315398153L;
    private String background;
    private String carts_count;
    private String coin;
    private String coupon_count;
    private List<FiltersObj> filters;
    private List<GameStoreItemObj> items;
    private List<MenuObj> menu;
    private String pay_type;
    private String pay_url;
    private List<KeyDescObj> sort_types;
    private List<GameStoreItemObj> whishlist;

    public String getBackground() {
        return this.background;
    }

    public String getCarts_count() {
        return this.carts_count;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getCoupon_count() {
        return this.coupon_count;
    }

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<GameStoreItemObj> getItems() {
        return this.items;
    }

    public List<MenuObj> getMenu() {
        return this.menu;
    }

    public String getPay_type() {
        return this.pay_type;
    }

    public String getPay_url() {
        return this.pay_url;
    }

    public List<KeyDescObj> getSort_types() {
        return this.sort_types;
    }

    public List<GameStoreItemObj> getWhishlist() {
        return this.whishlist;
    }

    public void setBackground(String str) {
        this.background = str;
    }

    public void setCarts_count(String str) {
        this.carts_count = str;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setCoupon_count(String str) {
        this.coupon_count = str;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public void setItems(List<GameStoreItemObj> list) {
        this.items = list;
    }

    public void setMenu(List<MenuObj> list) {
        this.menu = list;
    }

    public void setPay_type(String str) {
        this.pay_type = str;
    }

    public void setPay_url(String str) {
        this.pay_url = str;
    }

    public void setSort_types(List<KeyDescObj> list) {
        this.sort_types = list;
    }

    public void setWhishlist(List<GameStoreItemObj> list) {
        this.whishlist = list;
    }
}
