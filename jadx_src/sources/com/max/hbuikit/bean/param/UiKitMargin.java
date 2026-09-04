package com.max.hbuikit.bean.param;

import bb.c;
import com.max.hbuikit.utils.UiKitUtil;
import com.max.hbutils.core.BaseApplication;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UiKitMargin.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class UiKitMargin implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bottom;

    @e
    private String bottom_expression;

    @e
    private String left;

    @e
    private String left_expression;

    @e
    private String right;

    @e
    private String right_expression;

    @e
    private String top;

    @e
    private String top_expression;

    public UiKitMargin(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8) {
        this.left = str;
        this.top = str2;
        this.right = str3;
        this.bottom = str4;
        this.left_expression = str5;
        this.top_expression = str6;
        this.right_expression = str7;
        this.bottom_expression = str8;
    }

    public static /* synthetic */ UiKitMargin copy$default(UiKitMargin uiKitMargin, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uiKitMargin, str, str2, str3, str4, str5, str6, str7, str8, new Integer(i10), obj}, null, changeQuickRedirect, true, c.k.Nk, new Class[]{UiKitMargin.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, UiKitMargin.class);
        if (patchProxyResultProxy.isSupported) {
            return (UiKitMargin) patchProxyResultProxy.result;
        }
        return uiKitMargin.copy((i10 & 1) != 0 ? uiKitMargin.left : str, (i10 & 2) != 0 ? uiKitMargin.top : str2, (i10 & 4) != 0 ? uiKitMargin.right : str3, (i10 & 8) != 0 ? uiKitMargin.bottom : str4, (i10 & 16) != 0 ? uiKitMargin.left_expression : str5, (i10 & 32) != 0 ? uiKitMargin.top_expression : str6, (i10 & 64) != 0 ? uiKitMargin.right_expression : str7, (i10 & 128) != 0 ? uiKitMargin.bottom_expression : str8);
    }

    public final int bottomPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Lk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(this.bottom_expression)) {
            return ViewUtils.f(BaseApplication.a(), n.p(this.bottom));
        }
        UiKitUtil uiKitUtil = UiKitUtil.f73232a;
        String str = this.bottom_expression;
        f0.m(str);
        return uiKitUtil.c(str);
    }

    @e
    public final String component1() {
        return this.left;
    }

    @e
    public final String component2() {
        return this.top;
    }

    @e
    public final String component3() {
        return this.right;
    }

    @e
    public final String component4() {
        return this.bottom;
    }

    @e
    public final String component5() {
        return this.left_expression;
    }

    @e
    public final String component6() {
        return this.top_expression;
    }

    @e
    public final String component7() {
        return this.right_expression;
    }

    @e
    public final String component8() {
        return this.bottom_expression;
    }

    @d
    public final UiKitMargin copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8}, this, changeQuickRedirect, false, c.k.Mk, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, UiKitMargin.class);
        return patchProxyResultProxy.isSupported ? (UiKitMargin) patchProxyResultProxy.result : new UiKitMargin(str, str2, str3, str4, str5, str6, str7, str8);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.k.Qk, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiKitMargin)) {
            return false;
        }
        UiKitMargin uiKitMargin = (UiKitMargin) obj;
        return f0.g(this.left, uiKitMargin.left) && f0.g(this.top, uiKitMargin.top) && f0.g(this.right, uiKitMargin.right) && f0.g(this.bottom, uiKitMargin.bottom) && f0.g(this.left_expression, uiKitMargin.left_expression) && f0.g(this.top_expression, uiKitMargin.top_expression) && f0.g(this.right_expression, uiKitMargin.right_expression) && f0.g(this.bottom_expression, uiKitMargin.bottom_expression);
    }

    @e
    public final String getBottom() {
        return this.bottom;
    }

    @e
    public final String getBottom_expression() {
        return this.bottom_expression;
    }

    @e
    public final String getLeft() {
        return this.left;
    }

    @e
    public final String getLeft_expression() {
        return this.left_expression;
    }

    @e
    public final String getRight() {
        return this.right;
    }

    @e
    public final String getRight_expression() {
        return this.right_expression;
    }

    @e
    public final String getTop() {
        return this.top;
    }

    @e
    public final String getTop_expression() {
        return this.top_expression;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Pk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.left;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.top;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.right;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.bottom;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.left_expression;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.top_expression;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.right_expression;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bottom_expression;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final int leftPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ik, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(this.left_expression)) {
            return ViewUtils.f(BaseApplication.a(), n.p(this.left));
        }
        UiKitUtil uiKitUtil = UiKitUtil.f73232a;
        String str = this.left_expression;
        f0.m(str);
        return uiKitUtil.c(str);
    }

    public final int rightPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Kk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(this.right_expression)) {
            return ViewUtils.f(BaseApplication.a(), n.p(this.right));
        }
        UiKitUtil uiKitUtil = UiKitUtil.f73232a;
        String str = this.right_expression;
        f0.m(str);
        return uiKitUtil.c(str);
    }

    public final void setBottom(@e String str) {
        this.bottom = str;
    }

    public final void setBottom_expression(@e String str) {
        this.bottom_expression = str;
    }

    public final void setLeft(@e String str) {
        this.left = str;
    }

    public final void setLeft_expression(@e String str) {
        this.left_expression = str;
    }

    public final void setRight(@e String str) {
        this.right = str;
    }

    public final void setRight_expression(@e String str) {
        this.right_expression = str;
    }

    public final void setTop(@e String str) {
        this.top = str;
    }

    public final void setTop_expression(@e String str) {
        this.top_expression = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Ok, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UiKitMargin(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", left_expression=" + this.left_expression + ", top_expression=" + this.top_expression + ", right_expression=" + this.right_expression + ", bottom_expression=" + this.bottom_expression + ')';
    }

    public final int topPx() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.k.Jk, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (com.max.hbcommon.utils.c.u(this.top_expression)) {
            return ViewUtils.f(BaseApplication.a(), n.p(this.top));
        }
        UiKitUtil uiKitUtil = UiKitUtil.f73232a;
        String str = this.top_expression;
        f0.m(str);
        return uiKitUtil.c(str);
    }
}
