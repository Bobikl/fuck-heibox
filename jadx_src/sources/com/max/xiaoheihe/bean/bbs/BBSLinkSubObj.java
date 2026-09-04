package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSLinkSubObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7098825742600111680L;
    private String comment_id;
    private String desc;
    private List<BBSUserInfoObj> users;

    public String getComment_id() {
        return this.comment_id;
    }

    public String getDesc() {
        return this.desc;
    }

    public List<BBSUserInfoObj> getUsers() {
        return this.users;
    }

    public void setComment_id(String str) {
        this.comment_id = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setUsers(List<BBSUserInfoObj> list) {
        this.users = list;
    }
}
