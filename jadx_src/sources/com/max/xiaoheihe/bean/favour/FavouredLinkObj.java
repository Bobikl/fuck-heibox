package com.max.xiaoheihe.bean.favour;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FavouredLinkObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FavouredLinkObj {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String is_deleted;

    @e
    private BBSLinkObj link;

    @e
    private Integer unread;

    public FavouredLinkObj(@e String str, @e BBSLinkObj bBSLinkObj, @e Integer num) {
        this.is_deleted = str;
        this.link = bBSLinkObj;
        this.unread = num;
    }

    public static /* synthetic */ FavouredLinkObj copy$default(FavouredLinkObj favouredLinkObj, String str, BBSLinkObj bBSLinkObj, Integer num, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{favouredLinkObj, str, bBSLinkObj, num, new Integer(i10), obj}, null, changeQuickRedirect, true, 14615, new Class[]{FavouredLinkObj.class, String.class, BBSLinkObj.class, Integer.class, Integer.TYPE, Object.class}, FavouredLinkObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FavouredLinkObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = favouredLinkObj.is_deleted;
        }
        if ((i10 & 2) != 0) {
            bBSLinkObj = favouredLinkObj.link;
        }
        if ((i10 & 4) != 0) {
            num = favouredLinkObj.unread;
        }
        return favouredLinkObj.copy(str, bBSLinkObj, num);
    }

    @e
    public final String component1() {
        return this.is_deleted;
    }

    @e
    public final BBSLinkObj component2() {
        return this.link;
    }

    @e
    public final Integer component3() {
        return this.unread;
    }

    @d
    public final FavouredLinkObj copy(@e String str, @e BBSLinkObj bBSLinkObj, @e Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bBSLinkObj, num}, this, changeQuickRedirect, false, 14614, new Class[]{String.class, BBSLinkObj.class, Integer.class}, FavouredLinkObj.class);
        return patchProxyResultProxy.isSupported ? (FavouredLinkObj) patchProxyResultProxy.result : new FavouredLinkObj(str, bBSLinkObj, num);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14618, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavouredLinkObj)) {
            return false;
        }
        FavouredLinkObj favouredLinkObj = (FavouredLinkObj) obj;
        return f0.g(this.is_deleted, favouredLinkObj.is_deleted) && f0.g(this.link, favouredLinkObj.link) && f0.g(this.unread, favouredLinkObj.unread);
    }

    @e
    public final BBSLinkObj getLink() {
        return this.link;
    }

    @e
    public final Integer getUnread() {
        return this.unread;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14617, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.is_deleted;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BBSLinkObj bBSLinkObj = this.link;
        int iHashCode2 = (iHashCode + (bBSLinkObj == null ? 0 : bBSLinkObj.hashCode())) * 31;
        Integer num = this.unread;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @e
    public final String is_deleted() {
        return this.is_deleted;
    }

    public final void setLink(@e BBSLinkObj bBSLinkObj) {
        this.link = bBSLinkObj;
    }

    public final void setUnread(@e Integer num) {
        this.unread = num;
    }

    public final void set_deleted(@e String str) {
        this.is_deleted = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14616, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FavouredLinkObj(is_deleted=" + this.is_deleted + ", link=" + this.link + ", unread=" + this.unread + ')';
    }
}
