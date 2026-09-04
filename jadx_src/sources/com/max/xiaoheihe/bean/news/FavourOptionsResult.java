package com.max.xiaoheihe.bean.news;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FavourOptionsResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSTopicObj> options;

    public List<BBSTopicObj> getOptions() {
        return this.options;
    }

    public void setOptions(List<BBSTopicObj> list) {
        this.options = list;
    }
}
