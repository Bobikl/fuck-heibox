package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.NewFilterObj;
import com.max.hbutils.bean.Result;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserMsgResult<T> extends Result<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<NewFilterObj> filter_list;
    private BBSMessageUnreadNumObj message_unread_num;
    private BBSUserInfoObj user;

    public List<NewFilterObj> getFilter_list() {
        return this.filter_list;
    }

    public BBSMessageUnreadNumObj getMessage_unread_num() {
        return this.message_unread_num;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public void setFilter_list(List<NewFilterObj> list) {
        this.filter_list = list;
    }

    public void setMessage_unread_num(BBSMessageUnreadNumObj bBSMessageUnreadNumObj) {
        this.message_unread_num = bBSMessageUnreadNumObj;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }
}
