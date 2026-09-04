package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponListResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 423779365368309899L;
    private String invalid_count;
    private List<MallCouponObj> items;
    private List<MallCouponCategoryObj> list;
    private MallCouponCountObj total;
    private boolean use_passwd;
    private String valid_count;

    public String getInvalid_count() {
        return this.invalid_count;
    }

    public List<MallCouponObj> getItems() {
        return this.items;
    }

    public List<MallCouponCategoryObj> getList() {
        return this.list;
    }

    public MallCouponCountObj getTotal() {
        return this.total;
    }

    public String getValid_count() {
        return this.valid_count;
    }

    public boolean isUse_passwd() {
        return this.use_passwd;
    }

    public void setInvalid_count(String str) {
        this.invalid_count = str;
    }

    public void setItems(List<MallCouponObj> list) {
        this.items = list;
    }

    public void setList(List<MallCouponCategoryObj> list) {
        this.list = list;
    }

    public void setTotal(MallCouponCountObj mallCouponCountObj) {
        this.total = mallCouponCountObj;
    }

    public void setUse_passwd(boolean z10) {
        this.use_passwd = z10;
    }

    public void setValid_count(String str) {
        this.valid_count = str;
    }
}
