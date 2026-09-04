package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class HighlightInfo {
    public static final String INFO_AT = "info_at";
    public static final String INFO_HASHTAG = "info_hashtag";
    public static final String INFO_IMG = "info_img";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String data;
    private int length;
    private String name;
    private int start;
    private String type;

    public HighlightInfo(String str, int i10, String str2) {
        this.start = i10;
        this.name = str2;
        this.length = str2.length();
        this.type = str;
    }

    public HighlightInfo(String str, int i10, String str2, String str3) {
        this.start = i10;
        this.name = str2;
        this.data = str3;
        this.length = str2.length();
        this.type = str;
    }

    public String getData() {
        return this.data;
    }

    public int getEnd() {
        return this.start + this.length;
    }

    public int getLength() {
        return this.length;
    }

    public String getName() {
        return this.name;
    }

    public int getStart() {
        return this.start;
    }

    public String getType() {
        return this.type;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setLength(int i10) {
        this.length = i10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStart(int i10) {
        this.start = i10;
    }

    public void setType(String str) {
        this.type = str;
    }
}
