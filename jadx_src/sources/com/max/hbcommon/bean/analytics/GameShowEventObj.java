package com.max.hbcommon.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class GameShowEventObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appid;
    private String h_src;
    private String index;
    private String time;
    private String type;

    public String getAppid() {
        return this.appid;
    }

    public String getH_src() {
        return this.h_src;
    }

    public String getIndex() {
        return this.index;
    }

    public String getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public void setAppid(String str) {
        this.appid = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
