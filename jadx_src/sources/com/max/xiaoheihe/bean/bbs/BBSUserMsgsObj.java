package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSUserMsgsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int feedback_unread;
    private List<BBSUserMsgObj> header;
    private List<BBSUserMsgObj> messages;

    public int getFeedback_unread() {
        return this.feedback_unread;
    }

    public List<BBSUserMsgObj> getHeader() {
        return this.header;
    }

    public List<BBSUserMsgObj> getMessages() {
        return this.messages;
    }

    public void setFeedback_unread(int i10) {
        this.feedback_unread = i10;
    }

    public void setHeader(List<BBSUserMsgObj> list) {
        this.header = list;
    }

    public void setMessages(List<BBSUserMsgObj> list) {
        this.messages = list;
    }
}
