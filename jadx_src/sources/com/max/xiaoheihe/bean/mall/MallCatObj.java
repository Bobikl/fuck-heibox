package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class MallCatObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String bulk_count;
    private String bulk_count_enable;
    private String cart_enable;
    private String cat_id;
    private String cat_value;
    private boolean checked;
    private String title;

    public String getBulk_count() {
        return this.bulk_count;
    }

    public String getBulk_count_enable() {
        return this.bulk_count_enable;
    }

    public String getCart_enable() {
        return this.cart_enable;
    }

    public String getCat_id() {
        return this.cat_id;
    }

    public String getCat_value() {
        return this.cat_value;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setBulk_count(String str) {
        this.bulk_count = str;
    }

    public void setBulk_count_enable(String str) {
        this.bulk_count_enable = str;
    }

    public void setCart_enable(String str) {
        this.cart_enable = str;
    }

    public void setCat_id(String str) {
        this.cat_id = str;
    }

    public void setCat_value(String str) {
        this.cat_value = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
