package com.max.xiaoheihe.bean.account;

import com.max.hbcommon.bean.FiltersObj;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FollowingListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5164359851382883873L;
    private List<KeyDescObj> filter_head;
    private List<FiltersObj> filters;
    private List<GameObj> following;
    private int following_count;
    private String lastval;
    private String push_state;
    private String push_type;

    public List<KeyDescObj> getFilter_head() {
        return this.filter_head;
    }

    public List<FiltersObj> getFilters() {
        return this.filters;
    }

    public List<GameObj> getFollowing() {
        return this.following;
    }

    public int getFollowing_count() {
        return this.following_count;
    }

    public String getLastval() {
        return this.lastval;
    }

    public String getPush_state() {
        return this.push_state;
    }

    public String getPush_type() {
        return this.push_type;
    }

    public void setFilter_head(List<KeyDescObj> list) {
        this.filter_head = list;
    }

    public void setFilters(List<FiltersObj> list) {
        this.filters = list;
    }

    public FollowingListObj setFollowing(List<GameObj> list) {
        this.following = list;
        return this;
    }

    public FollowingListObj setFollowing_count(int i10) {
        this.following_count = i10;
        return this;
    }

    public FollowingListObj setLastval(String str) {
        this.lastval = str;
        return this;
    }

    public void setPush_state(String str) {
        this.push_state = str;
    }

    public void setPush_type(String str) {
        this.push_type = str;
    }
}
