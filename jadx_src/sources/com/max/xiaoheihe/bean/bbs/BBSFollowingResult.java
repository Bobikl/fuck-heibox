package com.max.xiaoheihe.bean.bbs;

import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.account.FollowCntObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSFollowingResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private FollowCntObj follow_cnt;
    private String follow_count;
    private List<BBSUserInfoObj> follow_list;
    private int has_more = 0;
    private String online;
    private String show;
    private List<String> summary_url;

    public FollowCntObj getFollow_cnt() {
        return this.follow_cnt;
    }

    public String getFollow_count() {
        return this.follow_count;
    }

    public List<BBSUserInfoObj> getFollow_list() {
        return this.follow_list;
    }

    public int getHas_more() {
        return this.has_more;
    }

    public String getOnline() {
        return this.online;
    }

    public String getShow() {
        return this.show;
    }

    public List<String> getSummary_url() {
        return this.summary_url;
    }

    public void setFollow_cnt(FollowCntObj followCntObj) {
        this.follow_cnt = followCntObj;
    }

    public void setFollow_count(String str) {
        this.follow_count = str;
    }

    public void setFollow_list(List<BBSUserInfoObj> list) {
        this.follow_list = list;
    }

    public void setHas_more(int i10) {
        this.has_more = i10;
    }

    public void setOnline(String str) {
        this.online = str;
    }

    public void setShow(String str) {
        this.show = str;
    }

    public void setSummary_url(List<String> list) {
        this.summary_url = list;
    }
}
