package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class UserMedalObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3007512490502955882L;
    private String achieved;
    private String color;
    private String description;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76965id;
    private String img_url;
    private String level;
    private String level_image;
    private String name;
    private String name_short;
    private String prot;
    private int status;
    private String wear;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14531, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserMedalObj)) {
            return false;
        }
        UserMedalObj userMedalObj = (UserMedalObj) obj;
        return getStatus() == userMedalObj.getStatus() && Objects.equals(getColor(), userMedalObj.getColor()) && Objects.equals(getDescription(), userMedalObj.getDescription()) && Objects.equals(getId(), userMedalObj.getId()) && Objects.equals(getImg_url(), userMedalObj.getImg_url()) && Objects.equals(getLevel(), userMedalObj.getLevel()) && Objects.equals(getLevel_image(), userMedalObj.getLevel_image()) && Objects.equals(getName(), userMedalObj.getName()) && Objects.equals(getName_short(), userMedalObj.getName_short()) && Objects.equals(getAchieved(), userMedalObj.getAchieved()) && Objects.equals(getWear(), userMedalObj.getWear()) && Objects.equals(getProt(), userMedalObj.getProt());
    }

    public String getAchieved() {
        return this.achieved;
    }

    public String getColor() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14530, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return c.u(this.color) ? "#20C388" : this.color;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.f76965id;
    }

    public String getImg_url() {
        return this.img_url;
    }

    public String getLevel() {
        return this.level;
    }

    public String getLevel_image() {
        return this.level_image;
    }

    public String getName() {
        return this.name;
    }

    public String getName_short() {
        return this.name_short;
    }

    public String getProt() {
        return this.prot;
    }

    public int getStatus() {
        return this.status;
    }

    public String getWear() {
        return this.wear;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14532, new Class[0], Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : Objects.hash(getColor(), getDescription(), getId(), getImg_url(), getLevel(), getLevel_image(), getName(), getName_short(), Integer.valueOf(getStatus()), getAchieved(), getWear(), getProt());
    }

    public void setAchieved(String str) {
        this.achieved = str;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setId(String str) {
        this.f76965id = str;
    }

    public void setImg_url(String str) {
        this.img_url = str;
    }

    public void setLevel(String str) {
        this.level = str;
    }

    public void setLevel_image(String str) {
        this.level_image = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setName_short(String str) {
        this.name_short = str;
    }

    public void setProt(String str) {
        this.prot = str;
    }

    public void setStatus(int i10) {
        this.status = i10;
    }

    public void setWear(String str) {
        this.wear = str;
    }
}
