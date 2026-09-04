package com.max.xiaoheihe.bean.chat;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class InviteInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6976972402480931232L;
    private String invite_id;
    private String msg;
    private String reciver;
    private String sender;
    private String state;

    public String getInvite_id() {
        return this.invite_id;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getReciver() {
        return this.reciver;
    }

    public String getSender() {
        return this.sender;
    }

    public String getState() {
        return this.state;
    }

    public void setInvite_id(String str) {
        this.invite_id = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setReciver(String str) {
        this.reciver = str;
    }

    public void setSender(String str) {
        this.sender = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
