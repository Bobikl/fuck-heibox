package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrderInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String coin;
    private String coin_after_purchase;
    private String cost_coin;
    private String order_id;

    public String getCoin() {
        return this.coin;
    }

    public String getCoin_after_purchase() {
        return this.coin_after_purchase;
    }

    public String getCost_coin() {
        return this.cost_coin;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setCoin_after_purchase(String str) {
        this.coin_after_purchase = str;
    }

    public void setCost_coin(String str) {
        this.cost_coin = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }
}
