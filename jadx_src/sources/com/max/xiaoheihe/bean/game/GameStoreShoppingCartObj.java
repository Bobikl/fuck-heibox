package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameStoreShoppingCartObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<GameStoreOrderObj> carts;
    private String product_count;
    private String session;
    private String total_cost_coin;

    public List<GameStoreOrderObj> getCarts() {
        return this.carts;
    }

    public String getProduct_count() {
        return this.product_count;
    }

    public String getSession() {
        return this.session;
    }

    public String getTotal_cost_coin() {
        return this.total_cost_coin;
    }

    public void setCarts(List<GameStoreOrderObj> list) {
        this.carts = list;
    }

    public void setProduct_count(String str) {
        this.product_count = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setTotal_cost_coin(String str) {
        this.total_cost_coin = str;
    }
}
