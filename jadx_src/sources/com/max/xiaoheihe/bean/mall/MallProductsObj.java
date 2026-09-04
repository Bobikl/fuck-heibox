package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallProductsObj {
    public static final String SRC_BUNDLE = "bundle";
    public static final String SRC_GAME = "game";
    public static final String SRC_MALL = "mall";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String cart_count;
    private List<FiltersObj> filters;
    private List<MallProductObj> items;
    private List<KeyDescObj> sort_types;

    public String getCart_count() {
        return this.cart_count;
    }

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<MallProductObj> getItems() {
        return this.items;
    }

    public List<KeyDescObj> getSort_types() {
        return this.sort_types;
    }

    public void setCart_count(String str) {
        this.cart_count = str;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public void setItems(List<MallProductObj> list) {
        this.items = list;
    }

    public void setSort_types(List<KeyDescObj> list) {
        this.sort_types = list;
    }
}
