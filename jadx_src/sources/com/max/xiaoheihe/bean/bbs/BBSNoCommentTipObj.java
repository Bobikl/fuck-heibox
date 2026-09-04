package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BBSNoCommentTipObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BBSNoCommentTipObj {

    @d
    public static final String BTN_ACTION_COMMENT = "comment";

    @d
    public static final String BTN_ACTION_SHARE = "share";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String action;

    @e
    private String btn_icon;

    @e
    private String btn_title;

    @e
    private String icon;

    @e
    private String protocol;

    @e
    private String title;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: BBSNoCommentTipObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public BBSNoCommentTipObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.icon = str;
        this.title = str2;
        this.btn_icon = str3;
        this.btn_title = str4;
        this.action = str5;
        this.protocol = str6;
    }

    public static /* synthetic */ BBSNoCommentTipObj copy$default(BBSNoCommentTipObj bBSNoCommentTipObj, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bBSNoCommentTipObj, str, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 14188, new Class[]{BBSNoCommentTipObj.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, BBSNoCommentTipObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BBSNoCommentTipObj) patchProxyResultProxy.result;
        }
        return bBSNoCommentTipObj.copy((i10 & 1) != 0 ? bBSNoCommentTipObj.icon : str, (i10 & 2) != 0 ? bBSNoCommentTipObj.title : str2, (i10 & 4) != 0 ? bBSNoCommentTipObj.btn_icon : str3, (i10 & 8) != 0 ? bBSNoCommentTipObj.btn_title : str4, (i10 & 16) != 0 ? bBSNoCommentTipObj.action : str5, (i10 & 32) != 0 ? bBSNoCommentTipObj.protocol : str6);
    }

    @e
    public final String component1() {
        return this.icon;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final String component3() {
        return this.btn_icon;
    }

    @e
    public final String component4() {
        return this.btn_title;
    }

    @e
    public final String component5() {
        return this.action;
    }

    @e
    public final String component6() {
        return this.protocol;
    }

    @d
    public final BBSNoCommentTipObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 14187, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class}, BBSNoCommentTipObj.class);
        return patchProxyResultProxy.isSupported ? (BBSNoCommentTipObj) patchProxyResultProxy.result : new BBSNoCommentTipObj(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14191, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BBSNoCommentTipObj)) {
            return false;
        }
        BBSNoCommentTipObj bBSNoCommentTipObj = (BBSNoCommentTipObj) obj;
        return f0.g(this.icon, bBSNoCommentTipObj.icon) && f0.g(this.title, bBSNoCommentTipObj.title) && f0.g(this.btn_icon, bBSNoCommentTipObj.btn_icon) && f0.g(this.btn_title, bBSNoCommentTipObj.btn_title) && f0.g(this.action, bBSNoCommentTipObj.action) && f0.g(this.protocol, bBSNoCommentTipObj.protocol);
    }

    @e
    public final String getAction() {
        return this.action;
    }

    @e
    public final String getBtn_icon() {
        return this.btn_icon;
    }

    @e
    public final String getBtn_title() {
        return this.btn_title;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14190, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btn_icon;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btn_title;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.action;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.protocol;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAction(@e String str) {
        this.action = str;
    }

    public final void setBtn_icon(@e String str) {
        this.btn_icon = str;
    }

    public final void setBtn_title(@e String str) {
        this.btn_title = str;
    }

    public final void setIcon(@e String str) {
        this.icon = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14189, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BBSNoCommentTipObj(icon=" + this.icon + ", title=" + this.title + ", btn_icon=" + this.btn_icon + ", btn_title=" + this.btn_title + ", action=" + this.action + ", protocol=" + this.protocol + ')';
    }
}
