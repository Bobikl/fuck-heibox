package com.max.xiaoheihe.bean.bbs;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class FeedBackResultObj<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String newer;
    private String older;

    public String getNewer() {
        return this.newer;
    }

    public String getOlder() {
        return this.older;
    }

    public void setNewer(String str) {
        this.newer = str;
    }

    public void setOlder(String str) {
        this.older = str;
    }
}
