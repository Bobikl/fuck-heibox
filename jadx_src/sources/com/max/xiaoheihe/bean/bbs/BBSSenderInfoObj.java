package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSSenderInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4662069374843703956L;
    private String sender_avatar;
    private String sender_id;
    private String sender_name;

    public String getSender_avatar() {
        return this.sender_avatar;
    }

    public String getSender_id() {
        return this.sender_id;
    }

    public String getSender_name() {
        return this.sender_name;
    }

    public void setSender_avatar(String str) {
        this.sender_avatar = str;
    }

    public void setSender_id(String str) {
        this.sender_id = str;
    }

    public void setSender_name(String str) {
        this.sender_name = str;
    }
}
