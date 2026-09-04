package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostModuleObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostModuleObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String big_img;

    @e
    private String icon;

    @e
    private String img;

    @e
    private TemplateHashtagLaberObj label;

    @e
    private String protocol;

    @e
    private String thumb;

    @e
    private String title;

    public PostModuleObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e TemplateHashtagLaberObj templateHashtagLaberObj) {
        this.img = str;
        this.big_img = str2;
        this.icon = str3;
        this.title = str4;
        this.protocol = str5;
        this.thumb = str6;
        this.label = templateHashtagLaberObj;
    }

    public static /* synthetic */ PostModuleObj copy$default(PostModuleObj postModuleObj, String str, String str2, String str3, String str4, String str5, String str6, TemplateHashtagLaberObj templateHashtagLaberObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postModuleObj, str, str2, str3, str4, str5, str6, templateHashtagLaberObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14424, new Class[]{PostModuleObj.class, String.class, String.class, String.class, String.class, String.class, String.class, TemplateHashtagLaberObj.class, Integer.TYPE, Object.class}, PostModuleObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostModuleObj) patchProxyResultProxy.result;
        }
        return postModuleObj.copy((i10 & 1) != 0 ? postModuleObj.img : str, (i10 & 2) != 0 ? postModuleObj.big_img : str2, (i10 & 4) != 0 ? postModuleObj.icon : str3, (i10 & 8) != 0 ? postModuleObj.title : str4, (i10 & 16) != 0 ? postModuleObj.protocol : str5, (i10 & 32) != 0 ? postModuleObj.thumb : str6, (i10 & 64) != 0 ? postModuleObj.label : templateHashtagLaberObj);
    }

    @e
    public final String component1() {
        return this.img;
    }

    @e
    public final String component2() {
        return this.big_img;
    }

    @e
    public final String component3() {
        return this.icon;
    }

    @e
    public final String component4() {
        return this.title;
    }

    @e
    public final String component5() {
        return this.protocol;
    }

    @e
    public final String component6() {
        return this.thumb;
    }

    @e
    public final TemplateHashtagLaberObj component7() {
        return this.label;
    }

    @d
    public final PostModuleObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e TemplateHashtagLaberObj templateHashtagLaberObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, templateHashtagLaberObj}, this, changeQuickRedirect, false, 14423, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, TemplateHashtagLaberObj.class}, PostModuleObj.class);
        return patchProxyResultProxy.isSupported ? (PostModuleObj) patchProxyResultProxy.result : new PostModuleObj(str, str2, str3, str4, str5, str6, templateHashtagLaberObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14427, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModuleObj)) {
            return false;
        }
        PostModuleObj postModuleObj = (PostModuleObj) obj;
        return f0.g(this.img, postModuleObj.img) && f0.g(this.big_img, postModuleObj.big_img) && f0.g(this.icon, postModuleObj.icon) && f0.g(this.title, postModuleObj.title) && f0.g(this.protocol, postModuleObj.protocol) && f0.g(this.thumb, postModuleObj.thumb) && f0.g(this.label, postModuleObj.label);
    }

    @e
    public final String getBig_img() {
        return this.big_img;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getImg() {
        return this.img;
    }

    @e
    public final TemplateHashtagLaberObj getLabel() {
        return this.label;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getThumb() {
        return this.thumb;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14426, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.big_img;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.thumb;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TemplateHashtagLaberObj templateHashtagLaberObj = this.label;
        return iHashCode6 + (templateHashtagLaberObj != null ? templateHashtagLaberObj.hashCode() : 0);
    }

    public final void setBig_img(@e String str) {
        this.big_img = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setImg(@e String str) {
        this.img = str;
    }

    public final void setLabel(@e TemplateHashtagLaberObj templateHashtagLaberObj) {
        this.label = templateHashtagLaberObj;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setThumb(@e String str) {
        this.thumb = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14425, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostModuleObj(img=" + this.img + ", big_img=" + this.big_img + ", icon=" + this.icon + ", title=" + this.title + ", protocol=" + this.protocol + ", thumb=" + this.thumb + ", label=" + this.label + ')';
    }
}
