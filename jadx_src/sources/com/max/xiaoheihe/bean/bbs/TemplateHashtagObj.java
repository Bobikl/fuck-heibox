package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TemplateHashtagResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TemplateHashtagObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private String hashtag_id;

    @d
    private String img;

    @e
    private TemplateHashtagLaberObj label;

    @d
    private String protocol;

    @d
    private String title;

    public TemplateHashtagObj(@d String hashtag_id, @d String title, @d String protocol, @d String img, @e TemplateHashtagLaberObj templateHashtagLaberObj) {
        f0.p(hashtag_id, "hashtag_id");
        f0.p(title, "title");
        f0.p(protocol, "protocol");
        f0.p(img, "img");
        this.hashtag_id = hashtag_id;
        this.title = title;
        this.protocol = protocol;
        this.img = img;
        this.label = templateHashtagLaberObj;
    }

    public static /* synthetic */ TemplateHashtagObj copy$default(TemplateHashtagObj templateHashtagObj, String str, String str2, String str3, String str4, TemplateHashtagLaberObj templateHashtagLaberObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{templateHashtagObj, str, str2, str3, str4, templateHashtagLaberObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 14483, new Class[]{TemplateHashtagObj.class, String.class, String.class, String.class, String.class, TemplateHashtagLaberObj.class, Integer.TYPE, Object.class}, TemplateHashtagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagObj) patchProxyResultProxy.result;
        }
        return templateHashtagObj.copy((i10 & 1) != 0 ? templateHashtagObj.hashtag_id : str, (i10 & 2) != 0 ? templateHashtagObj.title : str2, (i10 & 4) != 0 ? templateHashtagObj.protocol : str3, (i10 & 8) != 0 ? templateHashtagObj.img : str4, (i10 & 16) != 0 ? templateHashtagObj.label : templateHashtagLaberObj);
    }

    @d
    public final String component1() {
        return this.hashtag_id;
    }

    @d
    public final String component2() {
        return this.title;
    }

    @d
    public final String component3() {
        return this.protocol;
    }

    @d
    public final String component4() {
        return this.img;
    }

    @e
    public final TemplateHashtagLaberObj component5() {
        return this.label;
    }

    @d
    public final TemplateHashtagObj copy(@d String hashtag_id, @d String title, @d String protocol, @d String img, @e TemplateHashtagLaberObj templateHashtagLaberObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hashtag_id, title, protocol, img, templateHashtagLaberObj}, this, changeQuickRedirect, false, 14482, new Class[]{String.class, String.class, String.class, String.class, TemplateHashtagLaberObj.class}, TemplateHashtagObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TemplateHashtagObj) patchProxyResultProxy.result;
        }
        f0.p(hashtag_id, "hashtag_id");
        f0.p(title, "title");
        f0.p(protocol, "protocol");
        f0.p(img, "img");
        return new TemplateHashtagObj(hashtag_id, title, protocol, img, templateHashtagLaberObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14486, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplateHashtagObj)) {
            return false;
        }
        TemplateHashtagObj templateHashtagObj = (TemplateHashtagObj) obj;
        return f0.g(this.hashtag_id, templateHashtagObj.hashtag_id) && f0.g(this.title, templateHashtagObj.title) && f0.g(this.protocol, templateHashtagObj.protocol) && f0.g(this.img, templateHashtagObj.img) && f0.g(this.label, templateHashtagObj.label);
    }

    @d
    public final String getHashtag_id() {
        return this.hashtag_id;
    }

    @d
    public final String getImg() {
        return this.img;
    }

    @e
    public final TemplateHashtagLaberObj getLabel() {
        return this.label;
    }

    @d
    public final String getProtocol() {
        return this.protocol;
    }

    @d
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14485, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((((this.hashtag_id.hashCode() * 31) + this.title.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.img.hashCode()) * 31;
        TemplateHashtagLaberObj templateHashtagLaberObj = this.label;
        return iHashCode + (templateHashtagLaberObj != null ? templateHashtagLaberObj.hashCode() : 0);
    }

    public final void setHashtag_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14478, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.hashtag_id = str;
    }

    public final void setImg(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14481, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.img = str;
    }

    public final void setLabel(@e TemplateHashtagLaberObj templateHashtagLaberObj) {
        this.label = templateHashtagLaberObj;
    }

    public final void setProtocol(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14480, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.protocol = str;
    }

    public final void setTitle(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14479, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14484, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TemplateHashtagObj(hashtag_id=" + this.hashtag_id + ", title=" + this.title + ", protocol=" + this.protocol + ", img=" + this.img + ", label=" + this.label + ')';
    }
}
