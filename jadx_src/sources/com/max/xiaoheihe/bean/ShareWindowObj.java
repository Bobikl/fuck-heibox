package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ShareWindowObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ShareWindowObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String desc_highlight;

    @e
    private String title;

    @e
    private String title_highlight;

    public ShareWindowObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.title = str;
        this.title_highlight = str2;
        this.desc = str3;
        this.desc_highlight = str4;
    }

    public static /* synthetic */ ShareWindowObj copy$default(ShareWindowObj shareWindowObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{shareWindowObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.bN, new Class[]{ShareWindowObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ShareWindowObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShareWindowObj) patchProxyResultProxy.result;
        }
        return shareWindowObj.copy((i10 & 1) != 0 ? shareWindowObj.title : str, (i10 & 2) != 0 ? shareWindowObj.title_highlight : str2, (i10 & 4) != 0 ? shareWindowObj.desc : str3, (i10 & 8) != 0 ? shareWindowObj.desc_highlight : str4);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.title_highlight;
    }

    @e
    public final String component3() {
        return this.desc;
    }

    @e
    public final String component4() {
        return this.desc_highlight;
    }

    @d
    public final ShareWindowObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, c.m.aN, new Class[]{String.class, String.class, String.class, String.class}, ShareWindowObj.class);
        return patchProxyResultProxy.isSupported ? (ShareWindowObj) patchProxyResultProxy.result : new ShareWindowObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.eN, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShareWindowObj)) {
            return false;
        }
        ShareWindowObj shareWindowObj = (ShareWindowObj) obj;
        return f0.g(this.title, shareWindowObj.title) && f0.g(this.title_highlight, shareWindowObj.title_highlight) && f0.g(this.desc, shareWindowObj.desc) && f0.g(this.desc_highlight, shareWindowObj.desc_highlight);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getDesc_highlight() {
        return this.desc_highlight;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final String getTitle_highlight() {
        return this.title_highlight;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.dN, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title_highlight;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc_highlight;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setDesc_highlight(@e String str) {
        this.desc_highlight = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTitle_highlight(@e String str) {
        this.title_highlight = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.cN, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ShareWindowObj(title=" + this.title + ", title_highlight=" + this.title_highlight + ", desc=" + this.desc + ", desc_highlight=" + this.desc_highlight + ')';
    }
}
