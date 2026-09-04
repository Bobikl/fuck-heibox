package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class R6FamousPlayerObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6273105696199437730L;
    private String avatar;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76995id;
    private String mmr;
    private String name;

    public String getAvatar() {
        return this.avatar;
    }

    public String getId() {
        return this.f76995id;
    }

    public String getMmr() {
        return this.mmr;
    }

    public String getName() {
        return this.name;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setId(String str) {
        this.f76995id = str;
    }

    public void setMmr(String str) {
        this.mmr = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
