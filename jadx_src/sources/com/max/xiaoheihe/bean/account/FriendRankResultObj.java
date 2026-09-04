package com.max.xiaoheihe.bean.account;

import com.max.hbcommon.bean.FiltersObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FriendRankResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private FiltersObj filter;
    private FollowCntObj follow_cnt;
    private List<PlayerRankObj> friends;
    private String friends_count;
    private List<String> summary_url;
    private PlayerRankObj user_rank;

    public FiltersObj getFilter() {
        return this.filter;
    }

    public FollowCntObj getFollow_cnt() {
        return this.follow_cnt;
    }

    public List<PlayerRankObj> getFriends() {
        return this.friends;
    }

    public String getFriends_count() {
        return this.friends_count;
    }

    public List<String> getSummary_url() {
        return this.summary_url;
    }

    public PlayerRankObj getUser_rank() {
        return this.user_rank;
    }

    public void setFilter(FiltersObj filtersObj) {
        this.filter = filtersObj;
    }

    public void setFollow_cnt(FollowCntObj followCntObj) {
        this.follow_cnt = followCntObj;
    }

    public void setFriends(List<PlayerRankObj> list) {
        this.friends = list;
    }

    public void setFriends_count(String str) {
        this.friends_count = str;
    }

    public void setSummary_url(List<String> list) {
        this.summary_url = list;
    }

    public void setUser_rank(PlayerRankObj playerRankObj) {
        this.user_rank = playerRankObj;
    }
}
