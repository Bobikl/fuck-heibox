package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallSaleObj {
    public static final String KEY_BUNDLE = "bundle";
    public static final String KEY_SALES = "sales";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String key;
    private String next_sale_time;

    /* JADX INFO: renamed from: qa, reason: collision with root package name */
    private String f77007qa;
    private List<MallSkuObj> skus;
    private String title;

    public String getKey() {
        return this.key;
    }

    public String getNext_sale_time() {
        return this.next_sale_time;
    }

    public String getQa() {
        return this.f77007qa;
    }

    public List<MallSkuObj> getSkus() {
        return this.skus;
    }

    public String getTitle() {
        return this.title;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setNext_sale_time(String str) {
        this.next_sale_time = str;
    }

    public void setQa(String str) {
        this.f77007qa = str;
    }

    public void setSkus(List<MallSkuObj> list) {
        this.skus = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
