package com.max.xiaoheihe.bean.account;

import com.max.xiaoheihe.bean.game.GameDeveloperObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class FollowingGameDevelopersObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<GameDeveloperObj> developer_following;
    private String developer_following_count;
    private String lastval;

    public List<GameDeveloperObj> getDeveloper_following() {
        return this.developer_following;
    }

    public String getDeveloper_following_count() {
        return this.developer_following_count;
    }

    public String getLastval() {
        return this.lastval;
    }

    public void setDeveloper_following(List<GameDeveloperObj> list) {
        this.developer_following = list;
    }

    public void setDeveloper_following_count(String str) {
        this.developer_following_count = str;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }
}
