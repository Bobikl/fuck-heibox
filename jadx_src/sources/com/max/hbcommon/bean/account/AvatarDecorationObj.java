package com.max.hbcommon.bean.account;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
public class AvatarDecorationObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5481128488643330846L;
    private String comment;
    private String desc;
    private String desc_color;
    private String desc_img;
    private boolean enabled;
    private String expired;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f66942id;
    private boolean is_product;
    private String name;
    private boolean owned;
    private boolean renew_enabled;
    private String src_type;
    private String src_url;
    private String tag;
    private String tag_end_color;
    private String tag_start_color;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.d.F4, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        String str = this.f66942id;
        String str2 = ((AvatarDecorationObj) obj).f66942id;
        if (str != null) {
            return str.equals(str2);
        }
        return str2 == null;
    }

    public String getComment() {
        return this.comment;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getDesc_color() {
        return this.desc_color;
    }

    public String getDesc_img() {
        return this.desc_img;
    }

    public String getExpired() {
        return this.expired;
    }

    public String getId() {
        return this.f66942id;
    }

    public String getName() {
        return this.name;
    }

    public String getSrc_type() {
        return this.src_type;
    }

    public String getSrc_url() {
        return this.src_url;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTag_end_color() {
        return this.tag_end_color;
    }

    public String getTag_start_color() {
        return this.tag_start_color;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.G4, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.f66942id;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isIs_product() {
        return this.is_product;
    }

    public boolean isOwned() {
        return this.owned;
    }

    public boolean isRenew_enabled() {
        return this.renew_enabled;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setDesc_color(String str) {
        this.desc_color = str;
    }

    public void setDesc_img(String str) {
        this.desc_img = str;
    }

    public void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public void setExpired(String str) {
        this.expired = str;
    }

    public void setId(String str) {
        this.f66942id = str;
    }

    public void setIs_product(boolean z10) {
        this.is_product = z10;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOwned(boolean z10) {
        this.owned = z10;
    }

    public void setRenew_enabled(boolean z10) {
        this.renew_enabled = z10;
    }

    public void setSrc_type(String str) {
        this.src_type = str;
    }

    public void setSrc_url(String str) {
        this.src_url = str;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setTag_end_color(String str) {
        this.tag_end_color = str;
    }

    public void setTag_start_color(String str) {
        this.tag_start_color = str;
    }
}
