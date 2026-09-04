package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinkLabelsResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6855290794740774687L;
    private List<KeyDescObj> labels;

    public List<KeyDescObj> getLabels() {
        return this.labels;
    }

    public void setLabels(List<KeyDescObj> list) {
        this.labels = list;
    }
}
