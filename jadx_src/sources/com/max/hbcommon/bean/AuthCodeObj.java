package com.max.hbcommon.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AuthCodeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1745695746347222109L;
    private String headers;
    private String user_code;

    public String getHeaders() {
        return this.headers;
    }

    public String getUser_code() {
        return this.user_code;
    }

    public void setHeaders(String str) {
        this.headers = str;
    }

    public void setUser_code(String str) {
        this.user_code = str;
    }
}
