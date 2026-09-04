package com.max.xiaoheihe.bean.game.ow;

import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class OWHeroInfoObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String displayName;
    private String hero_id;
    private String hero_img;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76979id;
    private String role;

    public String getDisplayName() {
        return this.displayName;
    }

    public String getHero_id() {
        return this.hero_id;
    }

    public String getHero_img() {
        return this.hero_img;
    }

    public String getId() {
        return this.f76979id;
    }

    public String getRole() {
        return this.role;
    }

    public void setDisplayName(String str) {
        this.displayName = str;
    }

    public void setHero_id(String str) {
        this.hero_id = str;
    }

    public void setHero_img(String str) {
        this.hero_img = str;
    }

    public void setId(String str) {
        this.f76979id = str;
    }

    public void setRole(String str) {
        this.role = str;
    }
}
