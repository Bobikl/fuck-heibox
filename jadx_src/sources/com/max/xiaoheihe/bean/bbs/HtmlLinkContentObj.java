package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HtmlLinkContentObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4328839707207008236L;
    private String content;
    private String desc;
    private String height;
    private List<BBSTextObj> imgs;
    private String subject_ids;
    private String text;
    private String title;
    private String url;
    private String width;

    public String getContent() {
        return this.content;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getHeight() {
        return this.height;
    }

    public List<BBSTextObj> getImgs() {
        return this.imgs;
    }

    public String getSubject_ids() {
        return this.subject_ids;
    }

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String getWidth() {
        return this.width;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setHeight(String str) {
        this.height = str;
    }

    public void setImgs(List<BBSTextObj> list) {
        this.imgs = list;
    }

    public void setSubject_ids(String str) {
        this.subject_ids = str;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setWidth(String str) {
        this.width = str;
    }
}
