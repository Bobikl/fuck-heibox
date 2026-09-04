package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GiftBotStateObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2156844192312080553L;
    private String content;
    private String state;
    private String time_delta;
    private String tips;
    private String title;

    public String getContent() {
        return this.content;
    }

    public String getState() {
        return this.state;
    }

    public String getTime_delta() {
        return this.time_delta;
    }

    public String getTips() {
        return this.tips;
    }

    public String getTitle() {
        return this.title;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setTime_delta(String str) {
        this.time_delta = str;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
