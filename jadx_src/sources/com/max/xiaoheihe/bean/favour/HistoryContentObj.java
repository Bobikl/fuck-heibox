package com.max.xiaoheihe.bean.favour;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class HistoryContentObj {
    public static final String TYPE_GAME = "game";
    public static final String TYPE_LINK = "link";
    public static final String TYPE_WIKI = "wiki_article";
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object content;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76967id;
    private boolean isChecked;
    private String is_invalid;
    private String tag_end_color;
    private String tag_start_color;
    private String tag_text;
    private String timestamp;
    private String type;
    private String userid;
    private String wrapper_type;

    public Object getContent() {
        return this.content;
    }

    public String getId() {
        return this.f76967id;
    }

    public String getIs_invalid() {
        return this.is_invalid;
    }

    public String getTag_end_color() {
        return this.tag_end_color;
    }

    public String getTag_start_color() {
        return this.tag_start_color;
    }

    public String getTag_text() {
        return this.tag_text;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public String getUserid() {
        return this.userid;
    }

    public String getWrapper_type() {
        return this.wrapper_type;
    }

    public boolean isChecked() {
        return this.isChecked;
    }

    public void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public void setContent(Object obj) {
        this.content = obj;
    }

    public void setId(String str) {
        this.f76967id = str;
    }

    public void setIs_invalid(String str) {
        this.is_invalid = str;
    }

    public void setTag_end_color(String str) {
        this.tag_end_color = str;
    }

    public void setTag_start_color(String str) {
        this.tag_start_color = str;
    }

    public void setTag_text(String str) {
        this.tag_text = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserid(String str) {
        this.userid = str;
    }

    public void setWrapper_type(String str) {
        this.wrapper_type = str;
    }
}
