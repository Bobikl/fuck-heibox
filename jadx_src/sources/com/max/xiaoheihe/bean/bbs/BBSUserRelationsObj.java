package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserRelationsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String count;
    private List<BBSUserInfoObj> users;

    public String getCount() {
        return this.count;
    }

    public List<BBSUserInfoObj> getUsers() {
        return this.users;
    }

    public void setCount(String str) {
        this.count = str;
    }

    public void setUsers(List<BBSUserInfoObj> list) {
        this.users = list;
    }
}
