package com.max.xiaoheihe.bean.bbs;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class ForbidReasonResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ForbidInfoObj forbid_info;

    public ForbidInfoObj getForbid_info() {
        return this.forbid_info;
    }

    public void setForbid_info(ForbidInfoObj forbidInfoObj) {
        this.forbid_info = forbidInfoObj;
    }
}
