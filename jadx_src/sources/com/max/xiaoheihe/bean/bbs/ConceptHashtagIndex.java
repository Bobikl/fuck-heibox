package com.max.xiaoheihe.bean.bbs;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ConceptHashtagIndex implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5398261630013232321L;
    private List<BBSTopicObj> favour_hashtags;

    @SerializedName(alternate = {"categories"}, value = "hashtag_categories")
    @JSONField(alternateNames = {"categories"}, name = "hashtag_categories")
    private List<BBSTopicCategoryObj> hashtag_categories;

    public List<BBSTopicObj> getFavour_hashtags() {
        return this.favour_hashtags;
    }

    public List<BBSTopicCategoryObj> getHashtag_categories() {
        return this.hashtag_categories;
    }

    public void setFavour_hashtags(List<BBSTopicObj> list) {
        this.favour_hashtags = list;
    }

    public void setHashtag_categories(List<BBSTopicCategoryObj> list) {
        this.hashtag_categories = list;
    }
}
