package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSOfficialMessagesObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2266138519997049182L;
    private String faq_id;
    private List<BBSUserNotifyObj> messages;
    private BBSSenderInfoObj sender;

    public String getFaq_id() {
        return this.faq_id;
    }

    public List<BBSUserNotifyObj> getMessages() {
        return this.messages;
    }

    public BBSSenderInfoObj getSender() {
        return this.sender;
    }

    public void setFaq_id(String str) {
        this.faq_id = str;
    }

    public void setMessages(List<BBSUserNotifyObj> list) {
        this.messages = list;
    }

    public void setSender(BBSSenderInfoObj bBSSenderInfoObj) {
        this.sender = bBSSenderInfoObj;
    }
}
