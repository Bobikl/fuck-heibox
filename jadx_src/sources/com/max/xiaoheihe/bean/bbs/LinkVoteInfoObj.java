package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class LinkVoteInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7181131356205186315L;
    private String expire_at;
    private String expire_at_ts;
    private String expired;
    private int option_mode;
    private String title;
    private String vote_choose_limit;
    private String vote_count;
    private List<VoteOptionObj> vote_options;
    private String vote_type;
    private String voted;

    public String getExpire_at() {
        return this.expire_at;
    }

    public String getExpire_at_ts() {
        return this.expire_at_ts;
    }

    public String getExpired() {
        return this.expired;
    }

    public int getOption_mode() {
        return this.option_mode;
    }

    public String getTitle() {
        return this.title;
    }

    public String getVote_choose_limit() {
        return this.vote_choose_limit;
    }

    public String getVote_count() {
        return this.vote_count;
    }

    public List<VoteOptionObj> getVote_options() {
        return this.vote_options;
    }

    public String getVote_type() {
        return this.vote_type;
    }

    public String getVoted() {
        return this.voted;
    }

    public void setExpire_at(String str) {
        this.expire_at = str;
    }

    public void setExpire_at_ts(String str) {
        this.expire_at_ts = str;
    }

    public void setExpired(String str) {
        this.expired = str;
    }

    public void setOption_mode(int i10) {
        this.option_mode = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setVote_choose_limit(String str) {
        this.vote_choose_limit = str;
    }

    public void setVote_count(String str) {
        this.vote_count = str;
    }

    public void setVote_options(List<VoteOptionObj> list) {
        this.vote_options = list;
    }

    public void setVote_type(String str) {
        this.vote_type = str;
    }

    public void setVoted(String str) {
        this.voted = str;
    }
}
