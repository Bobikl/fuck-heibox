package com.max.xiaoheihe.bean.bbs;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class BBSCreateCommentResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String commentid;

    public String getCommentid() {
        return this.commentid;
    }

    public void setCommentid(String str) {
        this.commentid = str;
    }
}
