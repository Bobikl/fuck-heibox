package com.max.hbwallet.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MallCouponCategoryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4335837647430959967L;
    private String desc;
    private String key;
    private List<MallCouponObj> list;

    public String getDesc() {
        return this.desc;
    }

    public String getKey() {
        return this.key;
    }

    public List<MallCouponObj> getList() {
        return this.list;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setList(List<MallCouponObj> list) {
        this.list = list;
    }
}
