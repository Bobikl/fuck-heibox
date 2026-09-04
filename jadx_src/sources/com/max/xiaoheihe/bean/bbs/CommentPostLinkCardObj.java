package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CommentPostLinkCardObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class CommentPostLinkCardObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String image;

    @e
    private String protocol;

    @e
    private String text;

    @e
    private String username;

    public CommentPostLinkCardObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.protocol = str;
        this.image = str2;
        this.text = str3;
        this.username = str4;
    }

    public static /* synthetic */ CommentPostLinkCardObj copy$default(CommentPostLinkCardObj commentPostLinkCardObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{commentPostLinkCardObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 14253, new Class[]{CommentPostLinkCardObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, CommentPostLinkCardObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (CommentPostLinkCardObj) patchProxyResultProxy.result;
        }
        return commentPostLinkCardObj.copy((i10 & 1) != 0 ? commentPostLinkCardObj.protocol : str, (i10 & 2) != 0 ? commentPostLinkCardObj.image : str2, (i10 & 4) != 0 ? commentPostLinkCardObj.text : str3, (i10 & 8) != 0 ? commentPostLinkCardObj.username : str4);
    }

    @e
    public final String component1() {
        return this.protocol;
    }

    @e
    public final String component2() {
        return this.image;
    }

    @e
    public final String component3() {
        return this.text;
    }

    @e
    public final String component4() {
        return this.username;
    }

    @d
    public final CommentPostLinkCardObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, 14252, new Class[]{String.class, String.class, String.class, String.class}, CommentPostLinkCardObj.class);
        return patchProxyResultProxy.isSupported ? (CommentPostLinkCardObj) patchProxyResultProxy.result : new CommentPostLinkCardObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14256, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommentPostLinkCardObj)) {
            return false;
        }
        CommentPostLinkCardObj commentPostLinkCardObj = (CommentPostLinkCardObj) obj;
        return f0.g(this.protocol, commentPostLinkCardObj.protocol) && f0.g(this.image, commentPostLinkCardObj.image) && f0.g(this.text, commentPostLinkCardObj.text) && f0.g(this.username, commentPostLinkCardObj.username);
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14255, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.protocol;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.username;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setUsername(@e String str) {
        this.username = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14254, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "CommentPostLinkCardObj(protocol=" + this.protocol + ", image=" + this.image + ", text=" + this.text + ", username=" + this.username + ')';
    }
}
