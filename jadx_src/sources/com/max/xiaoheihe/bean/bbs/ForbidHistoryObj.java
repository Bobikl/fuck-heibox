package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ForbidHistoryObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<ForbidInfoObj> forbid_records;

    public List<ForbidInfoObj> getForbid_records() {
        return this.forbid_records;
    }

    public void setForbid_records(List<ForbidInfoObj> list) {
        this.forbid_records = list;
    }
}
