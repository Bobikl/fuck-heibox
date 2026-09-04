package com.max.xiaoheihe.bean.game;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameTagsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> hot_tags;
    private String limit;
    private List<KeyDescObj> my_tags;
    private List<KeyDescObj> recommend_tags;

    public List<KeyDescObj> getHot_tags() {
        return this.hot_tags;
    }

    public String getLimit() {
        return this.limit;
    }

    public List<KeyDescObj> getMy_tags() {
        return this.my_tags;
    }

    public List<KeyDescObj> getRecommend_tags() {
        return this.recommend_tags;
    }

    public void setHot_tags(List<KeyDescObj> list) {
        this.hot_tags = list;
    }

    public void setLimit(String str) {
        this.limit = str;
    }

    public void setMy_tags(List<KeyDescObj> list) {
        this.my_tags = list;
    }

    public void setRecommend_tags(List<KeyDescObj> list) {
        this.recommend_tags = list;
    }
}
