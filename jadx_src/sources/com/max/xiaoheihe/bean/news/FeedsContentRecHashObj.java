package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.bbs.HashtagObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FeedsContentRecHashObj extends FeedsContentBaseObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<HashtagObj> hashtags;

    public List<HashtagObj> getHashtags() {
        return this.hashtags;
    }

    public void setHashtags(List<HashtagObj> list) {
        this.hashtags = list;
    }
}
