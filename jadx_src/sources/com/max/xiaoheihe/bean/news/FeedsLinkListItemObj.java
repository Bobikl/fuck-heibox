package com.max.xiaoheihe.bean.news;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.BBSLinkObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FeedsLinkListItemObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FeedsLinkListItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BBSLinkObj info;

    @e
    private String report_id;

    public FeedsLinkListItemObj(@e BBSLinkObj bBSLinkObj, @e String str) {
        this.info = bBSLinkObj;
        this.report_id = str;
    }

    public static /* synthetic */ FeedsLinkListItemObj copy$default(FeedsLinkListItemObj feedsLinkListItemObj, BBSLinkObj bBSLinkObj, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{feedsLinkListItemObj, bBSLinkObj, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15751, new Class[]{FeedsLinkListItemObj.class, BBSLinkObj.class, String.class, Integer.TYPE, Object.class}, FeedsLinkListItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FeedsLinkListItemObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bBSLinkObj = feedsLinkListItemObj.info;
        }
        if ((i10 & 2) != 0) {
            str = feedsLinkListItemObj.report_id;
        }
        return feedsLinkListItemObj.copy(bBSLinkObj, str);
    }

    @e
    public final BBSLinkObj component1() {
        return this.info;
    }

    @e
    public final String component2() {
        return this.report_id;
    }

    @d
    public final FeedsLinkListItemObj copy(@e BBSLinkObj bBSLinkObj, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSLinkObj, str}, this, changeQuickRedirect, false, 15750, new Class[]{BBSLinkObj.class, String.class}, FeedsLinkListItemObj.class);
        return patchProxyResultProxy.isSupported ? (FeedsLinkListItemObj) patchProxyResultProxy.result : new FeedsLinkListItemObj(bBSLinkObj, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15754, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedsLinkListItemObj)) {
            return false;
        }
        FeedsLinkListItemObj feedsLinkListItemObj = (FeedsLinkListItemObj) obj;
        return f0.g(this.info, feedsLinkListItemObj.info) && f0.g(this.report_id, feedsLinkListItemObj.report_id);
    }

    @e
    public final BBSLinkObj getInfo() {
        return this.info;
    }

    @e
    public final String getReport_id() {
        return this.report_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15753, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        BBSLinkObj bBSLinkObj = this.info;
        int iHashCode = (bBSLinkObj == null ? 0 : bBSLinkObj.hashCode()) * 31;
        String str = this.report_id;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setInfo(@e BBSLinkObj bBSLinkObj) {
        this.info = bBSLinkObj;
    }

    public final void setReport_id(@e String str) {
        this.report_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15752, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FeedsLinkListItemObj(info=" + this.info + ", report_id=" + this.report_id + ')';
    }
}
