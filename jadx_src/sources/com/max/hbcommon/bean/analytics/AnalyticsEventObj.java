package com.max.hbcommon.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AnalyticsEventObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3825523183467689801L;
    private String addition;
    private String event_id;
    private Object extra;
    private String page;
    private String time;
    private String type;
    private Object value;
    private String view;

    public String getAddition() {
        return this.addition;
    }

    public String getEvent_id() {
        return this.event_id;
    }

    public Object getExtra() {
        return this.extra;
    }

    public String getPage() {
        return this.page;
    }

    public String getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public Object getValue() {
        return this.value;
    }

    public String getView() {
        return this.view;
    }

    public void setAddition(String str) {
        this.addition = str;
    }

    public void setEvent_id(String str) {
        this.event_id = str;
    }

    public void setExtra(Object obj) {
        this.extra = obj;
    }

    public void setPage(String str) {
        this.page = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(Object obj) {
        this.value = obj;
    }

    public void setView(String str) {
        this.view = str;
    }
}
