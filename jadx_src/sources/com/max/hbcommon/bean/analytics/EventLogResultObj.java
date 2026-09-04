package com.max.hbcommon.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class EventLogResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Map<String, List<AnalyticsEventObj>> data;
    private String sid;

    public Map<String, List<AnalyticsEventObj>> getData() {
        return this.data;
    }

    public String getSid() {
        return this.sid;
    }

    public void setData(Map<String, List<AnalyticsEventObj>> map) {
        this.data = map;
    }

    public void setSid(String str) {
        this.sid = str;
    }
}
