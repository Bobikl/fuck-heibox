package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePreviewRequirementObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3648406776484440273L;
    private String desc;
    private String state;
    private String type;

    public String getDesc() {
        return this.desc;
    }

    public String getState() {
        return this.state;
    }

    public String getType() {
        return this.type;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
