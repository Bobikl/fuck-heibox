package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class MallOrderBottomBtnObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1103469213212315751L;
    private String desc;
    private boolean hidden;
    private String style;
    private String tips;
    private String type;
    private String url;

    public String getDesc() {
        return this.desc;
    }

    public String getStyle() {
        return this.style;
    }

    public String getTips() {
        return this.tips;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isHidden() {
        return this.hidden;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setHidden(boolean z10) {
        this.hidden = z10;
    }

    public void setTips(String str) {
        this.tips = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
