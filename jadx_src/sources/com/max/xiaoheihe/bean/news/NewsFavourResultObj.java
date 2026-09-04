package com.max.xiaoheihe.bean.news;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicCategoryObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NewsFavourResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String auto_rank;
    private String badge_count;
    private List<BBSTopicCategoryObj> options;
    private KeyDescObj recommend_switch;

    public String getAuto_rank() {
        return this.auto_rank;
    }

    public String getBadge_count() {
        return this.badge_count;
    }

    public List<BBSTopicCategoryObj> getOptions() {
        return this.options;
    }

    public KeyDescObj getRecommend_switch() {
        return this.recommend_switch;
    }

    public void setAuto_rank(String str) {
        this.auto_rank = str;
    }

    public void setBadge_count(String str) {
        this.badge_count = str;
    }

    public void setOptions(List<BBSTopicCategoryObj> list) {
        this.options = list;
    }

    public void setRecommend_switch(KeyDescObj keyDescObj) {
        this.recommend_switch = keyDescObj;
    }
}
