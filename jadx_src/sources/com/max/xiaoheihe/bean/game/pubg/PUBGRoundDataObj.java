package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class PUBGRoundDataObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6372544113744556682L;
    private String desc;
    private String percent;
    private String value;

    public String getDesc() {
        return this.desc;
    }

    public String getPercent() {
        return this.percent;
    }

    public String getValue() {
        return this.value;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setPercent(String str) {
        this.percent = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
