package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ConceptFeedsResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6489683658517592435L;
    private String cache_count;
    private BBSUserInfoObj current_user;
    private String keep_previous;
    private String lastval;
    private List<FeedsContentBaseObj> links;
    private String notify_msg;
    private String show_view_point;
    private String use_history;

    public String getCache_count() {
        return this.cache_count;
    }

    public BBSUserInfoObj getCurrent_user() {
        return this.current_user;
    }

    public String getKeep_previous() {
        return this.keep_previous;
    }

    public String getLastval() {
        return this.lastval;
    }

    public List<FeedsContentBaseObj> getLinks() {
        return this.links;
    }

    public String getNotify_msg() {
        return this.notify_msg;
    }

    public String getShow_view_point() {
        return this.show_view_point;
    }

    public String getUse_history() {
        return this.use_history;
    }

    public void setCache_count(String str) {
        this.cache_count = str;
    }

    public void setCurrent_user(BBSUserInfoObj bBSUserInfoObj) {
        this.current_user = bBSUserInfoObj;
    }

    public void setKeep_previous(String str) {
        this.keep_previous = str;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }

    public void setLinks(List<FeedsContentBaseObj> list) {
        this.links = list;
    }

    public void setNotify_msg(String str) {
        this.notify_msg = str;
    }

    public void setShow_view_point(String str) {
        this.show_view_point = str;
    }

    public void setUse_history(String str) {
        this.use_history = str;
    }
}
