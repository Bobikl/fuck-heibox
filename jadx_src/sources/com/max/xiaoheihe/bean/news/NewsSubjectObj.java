package com.max.xiaoheihe.bean.news;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class NewsSubjectObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1449685745530842130L;
    private String click;
    private List<SubjectComponentObj> components;
    private String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f77009id;
    private String inner_img;
    private String inner_title;
    private String news_num;
    private String outer_img;
    private String outer_title;
    private String share_url;
    private String tag;
    private String tag_color;
    private String timestamp;

    public String getClick() {
        return this.click;
    }

    public List<SubjectComponentObj> getComponents() {
        return this.components;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f77009id;
    }

    public String getInner_img() {
        return this.inner_img;
    }

    public String getInner_title() {
        return this.inner_title;
    }

    public String getNews_num() {
        return this.news_num;
    }

    public String getOuter_img() {
        return this.outer_img;
    }

    public String getOuter_title() {
        return this.outer_title;
    }

    public String getShare_url() {
        return this.share_url;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTag_color() {
        return this.tag_color;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setClick(String str) {
        this.click = str;
    }

    public void setComponents(List<SubjectComponentObj> list) {
        this.components = list;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.f77009id = str;
    }

    public void setInner_img(String str) {
        this.inner_img = str;
    }

    public void setInner_title(String str) {
        this.inner_title = str;
    }

    public void setNews_num(String str) {
        this.news_num = str;
    }

    public void setOuter_img(String str) {
        this.outer_img = str;
    }

    public void setOuter_title(String str) {
        this.outer_title = str;
    }

    public void setShare_url(String str) {
        this.share_url = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTag_color(String str) {
        this.tag_color = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }
}
