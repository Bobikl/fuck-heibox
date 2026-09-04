package com.max.hbexpression.bean;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes10.dex */
public class EmojiItemtObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4310755149452730858L;
    private String code;
    private String img;
    private String name;
    private String type;

    public String getCode() {
        return this.code;
    }

    public String getImg() {
        return this.img;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
