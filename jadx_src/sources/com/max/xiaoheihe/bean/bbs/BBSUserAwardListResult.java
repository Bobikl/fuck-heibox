package com.max.xiaoheihe.bean.bbs;

import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserAwardListResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String link_award_num;
    private List<BBSUserInfoObj> users;

    public String getLink_award_num() {
        return this.link_award_num;
    }

    public List<BBSUserInfoObj> getUsers() {
        return this.users;
    }

    public void setLink_award_num(String str) {
        this.link_award_num = str;
    }

    public void setUsers(List<BBSUserInfoObj> list) {
        this.users = list;
    }
}
