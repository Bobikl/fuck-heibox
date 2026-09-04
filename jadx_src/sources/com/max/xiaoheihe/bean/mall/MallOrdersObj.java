package com.max.xiaoheihe.bean.mall;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hblogistics.bean.logistics.ExpressDetailObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrdersObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<ExpressDetailObj> express_details;
    private List<KeyDescObj> filter;
    private List<FiltersObj> filters;
    private List<MallOrderObj> orders;

    public List<ExpressDetailObj> getExpress_details() {
        return this.express_details;
    }

    public List<KeyDescObj> getFilter() {
        return this.filter;
    }

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<MallOrderObj> getOrders() {
        return this.orders;
    }

    public void setExpress_details(List<ExpressDetailObj> list) {
        this.express_details = list;
    }

    public void setFilter(List<KeyDescObj> list) {
        this.filter = list;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public void setOrders(List<MallOrderObj> list) {
        this.orders = list;
    }
}
