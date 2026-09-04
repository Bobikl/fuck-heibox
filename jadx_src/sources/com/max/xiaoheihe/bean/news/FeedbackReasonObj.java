package com.max.xiaoheihe.bean.news;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class FeedbackReasonObj implements Serializable {
    public static final String REASON_TOPIC = "3";
    public static final String REASON_USER = "8";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8977730590188656783L;
    private boolean checked;
    private String event_id;
    private String reason;
    private String text;
    private String topic_id;
    private String topic_name;
    private String user_id;
    private String user_name;

    public String getEvent_id() {
        return this.event_id;
    }

    public String getReason() {
        return this.reason;
    }

    public String getText() {
        return this.text;
    }

    public String getTopic_id() {
        return this.topic_id;
    }

    public String getTopic_name() {
        return this.topic_name;
    }

    public String getUser_id() {
        return this.user_id;
    }

    public String getUser_name() {
        return this.user_name;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setEvent_id(String str) {
        this.event_id = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTopic_id(String str) {
        this.topic_id = str;
    }

    public void setTopic_name(String str) {
        this.topic_name = str;
    }

    public void setUser_id(String str) {
        this.user_id = str;
    }

    public void setUser_name(String str) {
        this.user_name = str;
    }
}
