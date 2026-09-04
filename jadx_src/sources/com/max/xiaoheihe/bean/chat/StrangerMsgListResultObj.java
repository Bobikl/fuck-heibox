package com.max.xiaoheihe.bean.chat;

import com.max.xiaoheihe.bean.bbs.BBSUserMsgObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class StrangerMsgListResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<BBSUserMsgObj> list;

    public List<BBSUserMsgObj> getList() {
        return this.list;
    }

    public void setList(List<BBSUserMsgObj> list) {
        this.list = list;
    }
}
