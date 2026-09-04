package com.max.xiaoheihe.bean.game.r6;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6PlayerOperatorsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> filter;
    private List<R6PlayerOperatorDataObj> operators;

    public List<KeyDescObj> getFilter() {
        return this.filter;
    }

    public List<R6PlayerOperatorDataObj> getOperators() {
        return this.operators;
    }

    public void setFilter(List<KeyDescObj> list) {
        this.filter = list;
    }

    public void setOperators(List<R6PlayerOperatorDataObj> list) {
        this.operators = list;
    }
}
