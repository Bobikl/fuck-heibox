package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSRecommendTopicObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8144411810202554620L;
    private int index;
    private List<BBSTopicObj> items;

    public int getIndex() {
        return this.index;
    }

    public List<BBSTopicObj> getItems() {
        return this.items;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setItems(List<BBSTopicObj> list) {
        this.items = list;
    }
}
