package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSIncreaseExposureOptionsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSIncreaseExposureOptionObj> options;

    public List<BBSIncreaseExposureOptionObj> getOptions() {
        return this.options;
    }

    public void setOptions(List<BBSIncreaseExposureOptionObj> list) {
        this.options = list;
    }
}
