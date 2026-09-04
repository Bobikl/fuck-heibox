package com.max.hbcommon.bean.analytics;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class BBSLinkViewShowsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 644261016407546847L;

    /* JADX INFO: renamed from: al, reason: collision with root package name */
    private String f66945al;
    private String from_recommend_list;
    private String h_src;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f66946id;
    private int idx;
    private String impressionID;
    private String index;
    private String newsid;
    private int page_tab;
    private String pos;
    private String quick_from;
    private int rec;
    private String recTags;
    private String rec_mark;
    private String sessionID;
    private long time;
    private String type;

    public String getAl() {
        return this.f66945al;
    }

    public String getFrom_recommend_list() {
        return this.from_recommend_list;
    }

    public String getH_src() {
        return this.h_src;
    }

    public int getId() {
        return this.f66946id;
    }

    public int getIdx() {
        return this.idx;
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

    public int getPage_tab() {
        return this.page_tab;
    }

    public String getPos() {
        return this.pos;
    }

    public String getQuick_from() {
        return this.quick_from;
    }

    public int getRec() {
        return this.rec;
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

    public long getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public void setAl(String str) {
        this.f66945al = str;
    }

    public void setFrom_recommend_list(String str) {
        this.from_recommend_list = str;
    }

    public void setH_src(String str) {
        this.h_src = str;
    }

    public void setId(int i10) {
        this.f66946id = i10;
    }

    public void setIdx(int i10) {
        this.idx = i10;
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

    public void setPage_tab(int i10) {
        this.page_tab = i10;
    }

    public void setPos(String str) {
        this.pos = str;
    }

    public void setQuick_from(String str) {
        this.quick_from = str;
    }

    public void setRec(int i10) {
        this.rec = i10;
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

    public void setTime(long j10) {
        this.time = j10;
    }

    public void setType(String str) {
        this.type = str;
    }
}
