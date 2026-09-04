package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AuthorObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3571683331040626862L;
    private String avatar;
    private String nickname;

    public String getAvatar() {
        return this.avatar;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setNickname(String str) {
        this.nickname = str;
    }
}
