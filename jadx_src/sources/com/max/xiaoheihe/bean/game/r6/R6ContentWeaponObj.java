package com.max.xiaoheihe.bean.game.r6;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class R6ContentWeaponObj extends R6ContentBaseObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String detail_url;
    private String headshot;
    private String hit_ratio;
    private String hs_k;
    private String icon;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f76994k;
    private String name;

    public String getDetail_url() {
        return this.detail_url;
    }

    public String getHeadshot() {
        return this.headshot;
    }

    public String getHit_ratio() {
        return this.hit_ratio;
    }

    public String getHs_k() {
        return this.hs_k;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getK() {
        return this.f76994k;
    }

    public String getName() {
        return this.name;
    }

    public void setDetail_url(String str) {
        this.detail_url = str;
    }

    public void setHeadshot(String str) {
        this.headshot = str;
    }

    public void setHit_ratio(String str) {
        this.hit_ratio = str;
    }

    public void setHs_k(String str) {
        this.hs_k = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setK(String str) {
        this.f76994k = str;
    }

    public void setName(String str) {
        this.name = str;
    }
}
