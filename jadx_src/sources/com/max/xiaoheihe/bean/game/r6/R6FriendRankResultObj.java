package com.max.xiaoheihe.bean.game.r6;

import com.max.hbcommon.bean.FiltersObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class R6FriendRankResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<FiltersObj> filter;
    private List<R6ContentFriendObj> friends;
    private FiltersObj tabs;

    public List<FiltersObj> getFilter() {
        return this.filter;
    }

    public List<R6ContentFriendObj> getFriends() {
        return this.friends;
    }

    public FiltersObj getTabs() {
        return this.tabs;
    }

    public void setFilter(List<FiltersObj> list) {
        this.filter = list;
    }

    public void setFriends(List<R6ContentFriendObj> list) {
        this.friends = list;
    }

    public void setTabs(FiltersObj filtersObj) {
        this.tabs = filtersObj;
    }
}
