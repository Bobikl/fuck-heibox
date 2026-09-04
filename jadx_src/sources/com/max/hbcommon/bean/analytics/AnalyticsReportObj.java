package com.max.hbcommon.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class AnalyticsReportObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AnalyticsEventObj> events;
    private List<GameShowEventObj> items;

    public List<AnalyticsEventObj> getEvents() {
        return this.events;
    }

    public List<GameShowEventObj> getItems() {
        return this.items;
    }

    public void setEvents(List<AnalyticsEventObj> list) {
        this.events = list;
    }

    public void setItems(List<GameShowEventObj> list) {
        this.items = list;
    }
}
