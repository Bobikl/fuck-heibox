package com.max.xiaoheihe.bean;

import com.max.hbcommon.bean.EncryptionParamsObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BindAccountGameInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8315967948827523528L;
    private String api_key;
    private EncryptionParamsObj js;
    private String regular;

    public String getApi_key() {
        return this.api_key;
    }

    public EncryptionParamsObj getJs() {
        return this.js;
    }

    public String getRegular() {
        return this.regular;
    }

    public void setApi_key(String str) {
        this.api_key = str;
    }

    public void setJs(EncryptionParamsObj encryptionParamsObj) {
        this.js = encryptionParamsObj;
    }

    public void setRegular(String str) {
        this.regular = str;
    }
}
