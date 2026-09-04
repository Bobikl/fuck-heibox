package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HashtagRankingResultObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3866356641035666197L;
    private List<HashtagObj> hashtags;
    private String update_at;

    public List<HashtagObj> getHashtags() {
        return this.hashtags;
    }

    public String getUpdate_at() {
        return this.update_at;
    }

    public void setHashtags(List<HashtagObj> list) {
        this.hashtags = list;
    }

    public void setUpdate_at(String str) {
        this.update_at = str;
    }
}
