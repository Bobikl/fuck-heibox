package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class RecUsersResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSUserInfoObj> rec_users;

    public List<BBSUserInfoObj> getRec_users() {
        return this.rec_users;
    }

    public void setRec_users(List<BBSUserInfoObj> list) {
        this.rec_users = list;
    }
}
