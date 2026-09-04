package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class MallPayInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String agreement_title;
    private String has_bind_steam;
    private String order_id;
    private MallOrderInfoObj order_info;
    private String pay_price;
    private String pay_type;
    private String pay_url;
    private String profit;
    private String service_agreement;
    private String sku_id;
    private String total_coin;
    private String total_hbalance;
    private String unfinished_order;

    public String getAgreement_title() {
        return this.agreement_title;
    }

    public String getHas_bind_steam() {
        return this.has_bind_steam;
    }

    public String getOrder_id() {
        return this.order_id;
    }

    public MallOrderInfoObj getOrder_info() {
        return this.order_info;
    }

    public String getPay_price() {
        return this.pay_price;
    }

    public String getPay_type() {
        return this.pay_type;
    }

    public String getPay_url() {
        return this.pay_url;
    }

    public String getProfit() {
        return this.profit;
    }

    public String getService_agreement() {
        return this.service_agreement;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public String getTotal_coin() {
        return this.total_coin;
    }

    public String getTotal_hbalance() {
        return this.total_hbalance;
    }

    public String getUnfinished_order() {
        return this.unfinished_order;
    }

    public void setAgreement_title(String str) {
        this.agreement_title = str;
    }

    public void setHas_bind_steam(String str) {
        this.has_bind_steam = str;
    }

    public void setOrder_id(String str) {
        this.order_id = str;
    }

    public void setOrder_info(MallOrderInfoObj mallOrderInfoObj) {
        this.order_info = mallOrderInfoObj;
    }

    public void setPay_price(String str) {
        this.pay_price = str;
    }

    public void setPay_type(String str) {
        this.pay_type = str;
    }

    public void setPay_url(String str) {
        this.pay_url = str;
    }

    public void setProfit(String str) {
        this.profit = str;
    }

    public void setService_agreement(String str) {
        this.service_agreement = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setTotal_coin(String str) {
        this.total_coin = str;
    }

    public void setTotal_hbalance(String str) {
        this.total_hbalance = str;
    }

    public void setUnfinished_order(String str) {
        this.unfinished_order = str;
    }
}
