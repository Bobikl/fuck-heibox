package com.max.xiaoheihe.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DebugInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6311061875043314052L;
    private List<String> branch;

    public List<String> getBranch() {
        return this.branch;
    }

    public void setBranch(List<String> list) {
        this.branch = list;
    }
}
