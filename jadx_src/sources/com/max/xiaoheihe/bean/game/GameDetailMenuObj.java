package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameDetailMenuObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2629848887465732611L;
    private String desc;
    private String img;
    private String key;
    private String protocol;
    private String type;

    public String getDesc() {
        return this.desc;
    }

    public String getImg() {
        return this.img;
    }

    public String getKey() {
        return this.key;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getType() {
        return this.type;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
