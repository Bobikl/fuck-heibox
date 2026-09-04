package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicSubTagResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> categories;

    public List<KeyDescObj> getCategories() {
        return this.categories;
    }

    public void setCategories(List<KeyDescObj> list) {
        this.categories = list;
    }
}
