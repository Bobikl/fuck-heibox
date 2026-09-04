package com.max.basebbs.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes7.dex */
public class BBSLinkRecObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4662791536513459476L;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private String f65079al;
    private String from;
    private String impressionID;
    private String index;
    private String newsid;
    private String page_tab;
    private String pos;
    private String recTags;
    private String rec_mark;
    private String sessionID;

    public String getAl() {
        return this.f65079al;
    }

    public String getFrom() {
        return this.from;
    }

    public String getImpressionID() {
        return this.impressionID;
    }

    public String getIndex() {
        return this.index;
    }

    public String getNewsid() {
        return this.newsid;
    }

    public String getPage_tab() {
        return this.page_tab;
    }

    public String getPos() {
        return this.pos;
    }

    public String getRecTags() {
        return this.recTags;
    }

    public String getRec_mark() {
        return this.rec_mark;
    }

    public String getSessionID() {
        return this.sessionID;
    }

    public void setAl(String str) {
        this.f65079al = str;
    }

    public void setFrom(String str) {
        this.from = str;
    }

    public void setImpressionID(String str) {
        this.impressionID = str;
    }

    public void setIndex(String str) {
        this.index = str;
    }

    public void setNewsid(String str) {
        this.newsid = str;
    }

    public void setPage_tab(String str) {
        this.page_tab = str;
    }

    public void setPos(String str) {
        this.pos = str;
    }

    public void setRecTags(String str) {
        this.recTags = str;
    }

    public void setRec_mark(String str) {
        this.rec_mark = str;
    }

    public void setSessionID(String str) {
        this.sessionID = str;
    }
}
