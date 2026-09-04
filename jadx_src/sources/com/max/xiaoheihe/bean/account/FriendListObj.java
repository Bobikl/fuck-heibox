package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FriendListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<SteamIdInfoObj> friends;
    private int friends_count;
    private String lastval;
    private String summary_url;
    private HeyboxRankObj user_rank;

    public List<SteamIdInfoObj> getFriends() {
        return this.friends;
    }

    public int getFriends_count() {
        return this.friends_count;
    }

    public String getLastval() {
        return this.lastval;
    }

    public String getSummary_url() {
        return this.summary_url;
    }

    public HeyboxRankObj getUser_rank() {
        return this.user_rank;
    }

    public FriendListObj setFriends(List<SteamIdInfoObj> list) {
        this.friends = list;
        return this;
    }

    public FriendListObj setFriends_count(int i10) {
        this.friends_count = i10;
        return this;
    }

    public FriendListObj setLastval(String str) {
        this.lastval = str;
        return this;
    }

    public FriendListObj setSummary_url(String str) {
        this.summary_url = str;
        return this;
    }

    public void setUser_rank(HeyboxRankObj heyboxRankObj) {
        this.user_rank = heyboxRankObj;
    }
}
