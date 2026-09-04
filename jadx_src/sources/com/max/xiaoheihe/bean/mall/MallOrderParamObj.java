package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrderParamObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4747457770667821L;
    private String buy_type;
    private String cart_id;
    private long cat_value;
    private int count;
    private String h_src;
    private long sku_id;

    public String getBuy_type() {
        return this.buy_type;
    }

    public String getCart_id() {
        return this.cart_id;
    }

    public long getCat_value() {
        return this.cat_value;
    }

    public int getCount() {
        return this.count;
    }

    public String getH_src() {
        return this.h_src;
    }

    public long getSku_id() {
        return this.sku_id;
    }

    public void setBuy_type(String str) {
        this.buy_type = str;
    }

    public void setCart_id(String str) {
        this.cart_id = str;
    }

    public void setCat_value(long j10) {
        this.cat_value = j10;
    }

    public void setCount(int i10) {
        this.count = i10;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setSku_id(long j10) {
        this.sku_id = j10;
    }
}
