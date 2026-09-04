package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallPurchaseParamsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String cart_count;
    private String coin;
    private String head_img;
    private String name;
    private List<MallPurchaseParamObj> params;
    private MallPriceObj price;
    private String session;
    private List<MallSkuObj> skus;
    private List<MallSpecsObj> specs;
    private String toast_msg;
    private List<MallValidObj> valid;

    public String getCart_count() {
        return this.cart_count;
    }

    public String getCoin() {
        return this.coin;
    }

    public String getHead_img() {
        return this.head_img;
    }

    public String getName() {
        return this.name;
    }

    public List<MallPurchaseParamObj> getParams() {
        return this.params;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public String getSession() {
        return this.session;
    }

    public List<MallSkuObj> getSkus() {
        return this.skus;
    }

    public List<MallSpecsObj> getSpecs() {
        return this.specs;
    }

    public String getToast_msg() {
        return this.toast_msg;
    }

    public List<MallValidObj> getValid() {
        return this.valid;
    }

    public void setCart_count(String str) {
        this.cart_count = str;
    }

    public void setCoin(String str) {
        this.coin = str;
    }

    public void setHead_img(String str) {
        this.head_img = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParams(List<MallPurchaseParamObj> list) {
        this.params = list;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSkus(List<MallSkuObj> list) {
        this.skus = list;
    }

    public void setSpecs(List<MallSpecsObj> list) {
        this.specs = list;
    }

    public void setToast_msg(String str) {
        this.toast_msg = str;
    }

    public void setValid(List<MallValidObj> list) {
        this.valid = list;
    }
}
