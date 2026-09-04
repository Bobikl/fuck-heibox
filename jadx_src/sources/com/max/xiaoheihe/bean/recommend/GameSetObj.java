package com.max.xiaoheihe.bean.recommend;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class GameSetObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String desc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f77011id;
    private String image;
    private String sub_title;

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.f77011id;
    }

    public String getImage() {
        return this.image;
    }

    public String getSub_title() {
        return this.sub_title;
    }

    public GameSetObj setDesc(String str) {
        this.desc = str;
        return this;
    }

    public GameSetObj setId(String str) {
        this.f77011id = str;
        return this;
    }

    public GameSetObj setImage(String str) {
        this.image = str;
        return this;
    }

    public GameSetObj setSub_title(String str) {
        this.sub_title = str;
        return this;
    }
}
