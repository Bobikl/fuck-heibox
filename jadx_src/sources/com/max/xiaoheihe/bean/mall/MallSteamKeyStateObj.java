package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallSteamKeyStateObj implements Serializable {
    public static final String ERROR_CODE_REDEEMED = "9";
    public static final int STATE_FAILED = 0;
    public static final int STATE_SUCCEED = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5173786939651576370L;
    private String error_code;
    private String key;
    private int state;

    public String getError_code() {
        return this.error_code;
    }

    public String getKey() {
        return this.key;
    }

    public int getState() {
        return this.state;
    }

    public void setError_code(String str) {
        this.error_code = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setState(int i10) {
        this.state = i10;
    }
}
