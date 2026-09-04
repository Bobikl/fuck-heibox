package com.max.xiaoheihe.bean.news;

import com.max.xiaoheihe.bean.rich.RichStackModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class NewsMenuObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5338466268333930105L;
    private String img;
    private String maxjia;
    private String name;
    private RichStackModelObj rich_text;

    public String getImg() {
        return this.img;
    }

    public String getMaxjia() {
        return this.maxjia;
    }

    public String getName() {
        return this.name;
    }

    public RichStackModelObj getRich_text() {
        return this.rich_text;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setMaxjia(String str) {
        this.maxjia = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRich_text(RichStackModelObj richStackModelObj) {
        this.rich_text = richStackModelObj;
    }
}
