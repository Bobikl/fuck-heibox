package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class AvatarDecorationObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String src_type;

    @e
    private String src_url;

    public AvatarDecorationObj(@e String str, @e String str2) {
        this.src_type = str;
        this.src_url = str2;
    }

    public static /* synthetic */ AvatarDecorationObj copy$default(AvatarDecorationObj avatarDecorationObj, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{avatarDecorationObj, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.f30847oj, new Class[]{AvatarDecorationObj.class, String.class, String.class, Integer.TYPE, Object.class}, AvatarDecorationObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AvatarDecorationObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = avatarDecorationObj.src_type;
        }
        if ((i10 & 2) != 0) {
            str2 = avatarDecorationObj.src_url;
        }
        return avatarDecorationObj.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.src_type;
    }

    @e
    public final String component2() {
        return this.src_url;
    }

    @d
    public final AvatarDecorationObj copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, c.b.f30824nj, new Class[]{String.class, String.class}, AvatarDecorationObj.class);
        return patchProxyResultProxy.isSupported ? (AvatarDecorationObj) patchProxyResultProxy.result : new AvatarDecorationObj(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.f30915rj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarDecorationObj)) {
            return false;
        }
        AvatarDecorationObj avatarDecorationObj = (AvatarDecorationObj) obj;
        return f0.g(this.src_type, avatarDecorationObj.src_type) && f0.g(this.src_url, avatarDecorationObj.src_url);
    }

    @e
    public final String getSrc_type() {
        return this.src_type;
    }

    @e
    public final String getSrc_url() {
        return this.src_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30893qj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.src_type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.src_url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setSrc_type(@e String str) {
        this.src_type = str;
    }

    public final void setSrc_url(@e String str) {
        this.src_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.f30870pj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AvatarDecorationObj(src_type=" + this.src_type + ", src_url=" + this.src_url + ')';
    }
}
