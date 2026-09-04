package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ConceptTopicEntryObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String img;
    private List<HeaderNavObj> items;

    public String getImg() {
        return this.img;
    }

    public List<HeaderNavObj> getItems() {
        return this.items;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setItems(List<HeaderNavObj> list) {
        this.items = list;
    }
}
