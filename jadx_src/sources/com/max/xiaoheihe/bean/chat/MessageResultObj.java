package com.max.xiaoheihe.bean.chat;

import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.FeedBackObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MessageResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<FeedBackObj> list;
    private String newer;
    private String older;
    private BBSUserInfoObj recipient;
    private BBSUserInfoObj sender;

    public List<FeedBackObj> getList() {
        return this.list;
    }

    public String getNewer() {
        return this.newer;
    }

    public String getOlder() {
        return this.older;
    }

    public BBSUserInfoObj getRecipient() {
        return this.recipient;
    }

    public BBSUserInfoObj getSender() {
        return this.sender;
    }

    public void setList(List<FeedBackObj> list) {
        this.list = list;
    }

    public void setNewer(String str) {
        this.newer = str;
    }

    public void setOlder(String str) {
        this.older = str;
    }

    public void setRecipient(BBSUserInfoObj bBSUserInfoObj) {
        this.recipient = bBSUserInfoObj;
    }

    public void setSender(BBSUserInfoObj bBSUserInfoObj) {
        this.sender = bBSUserInfoObj;
    }
}
