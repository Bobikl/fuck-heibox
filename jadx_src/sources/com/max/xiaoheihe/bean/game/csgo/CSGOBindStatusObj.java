package com.max.xiaoheihe.bean.game.csgo;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class CSGOBindStatusObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8632649013957578383L;
    private String code;
    private String status;
    private String token;

    public String getCode() {
        return this.code;
    }

    public String getStatus() {
        return this.status;
    }

    public String getToken() {
        return this.token;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
