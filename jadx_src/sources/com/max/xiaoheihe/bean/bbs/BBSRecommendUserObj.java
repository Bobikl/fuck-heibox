package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSRecommendUserObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2618891760946751251L;
    private int index;
    private List<BBSUserInfoObj> items;

    public int getIndex() {
        return this.index;
    }

    public List<BBSUserInfoObj> getItems() {
        return this.items;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setItems(List<BBSUserInfoObj> list) {
        this.items = list;
    }
}
