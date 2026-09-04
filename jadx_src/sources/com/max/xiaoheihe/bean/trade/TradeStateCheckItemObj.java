package com.max.xiaoheihe.bean.trade;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class TradeStateCheckItemObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1363784263205846423L;
    private String desc;
    private String skip_id;
    private String skip_type;
    private String state;

    public String getDesc() {
        return this.desc;
    }

    public String getSkip_id() {
        return this.skip_id;
    }

    public String getSkip_type() {
        return this.skip_type;
    }

    public String getState() {
        return this.state;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setSkip_id(String str) {
        this.skip_id = str;
    }

    public void setSkip_type(String str) {
        this.skip_type = str;
    }

    public void setState(String str) {
        this.state = str;
    }
}
