package com.max.xiaoheihe.bean.mall;

import com.max.xiaoheihe.bean.StateObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallBundleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5092270071617188318L;
    private String h_src;
    private String head_image;
    private String name;
    private MallPriceObj price;
    private StateObj sale;
    private String sale_desc;
    private String sku_count;
    private String sku_id;
    private String spu_id;

    public String getH_src() {
        return this.h_src;
    }

    public String getHead_image() {
        return this.head_image;
    }

    public String getName() {
        return this.name;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public StateObj getSale() {
        return this.sale;
    }

    public String getSale_desc() {
        return this.sale_desc;
    }

    public String getSku_count() {
        return this.sku_count;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public String getSpu_id() {
        return this.spu_id;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setHead_image(String str) {
        this.head_image = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }

    public void setSale(StateObj stateObj) {
        this.sale = stateObj;
    }

    public void setSale_desc(String str) {
        this.sale_desc = str;
    }

    public void setSku_count(String str) {
        this.sku_count = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setSpu_id(String str) {
        this.spu_id = str;
    }
}
