package com.max.hbsearch.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class SearchHotwordObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5949415426961149846L;
    private String end_color;
    private String key;
    private String start_color;
    private String sub_title;

    public String getEnd_color() {
        return this.end_color;
    }

    public String getKey() {
        return this.key;
    }

    public String getStart_color() {
        return this.start_color;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public void setEnd_color(String str) {
        this.end_color = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setStart_color(String str) {
        this.start_color = str;
    }

    public void setSub_title(String str) {
        this.sub_title = str;
    }
}
