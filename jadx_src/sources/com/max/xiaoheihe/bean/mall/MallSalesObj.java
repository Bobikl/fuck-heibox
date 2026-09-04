package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallSalesObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<MallSaleObj> sales;

    public List<MallSaleObj> getSales() {
        return this.sales;
    }

    public void setSales(List<MallSaleObj> list) {
        this.sales = list;
    }
}
