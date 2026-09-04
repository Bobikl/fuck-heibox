package com.max.hblogistics.bean.logistics;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class ExpressTrailObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7504290541094341417L;
    private String status;
    private String time;

    public String getStatus() {
        return this.status;
    }

    public String getTime() {
        return this.time;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTime(String str) {
        this.time = str;
    }
}
