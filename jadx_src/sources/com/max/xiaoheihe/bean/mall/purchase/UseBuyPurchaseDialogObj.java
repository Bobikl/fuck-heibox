package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: UseBuyPurchaseDialogObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UseBuyPurchaseDialogObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String mall_purcahse_dialog_style_v2;

    @e
    private Boolean new_cashier;

    public UseBuyPurchaseDialogObj(@e Boolean bool, @e String str) {
        this.new_cashier = bool;
        this.mall_purcahse_dialog_style_v2 = str;
    }

    public static /* synthetic */ UseBuyPurchaseDialogObj copy$default(UseBuyPurchaseDialogObj useBuyPurchaseDialogObj, Boolean bool, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{useBuyPurchaseDialogObj, bool, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 15730, new Class[]{UseBuyPurchaseDialogObj.class, Boolean.class, String.class, Integer.TYPE, Object.class}, UseBuyPurchaseDialogObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UseBuyPurchaseDialogObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bool = useBuyPurchaseDialogObj.new_cashier;
        }
        if ((i10 & 2) != 0) {
            str = useBuyPurchaseDialogObj.mall_purcahse_dialog_style_v2;
        }
        return useBuyPurchaseDialogObj.copy(bool, str);
    }

    @e
    public final Boolean component1() {
        return this.new_cashier;
    }

    @e
    public final String component2() {
        return this.mall_purcahse_dialog_style_v2;
    }

    @d
    public final UseBuyPurchaseDialogObj copy(@e Boolean bool, @e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, str}, this, changeQuickRedirect, false, 15729, new Class[]{Boolean.class, String.class}, UseBuyPurchaseDialogObj.class);
        return patchProxyResultProxy.isSupported ? (UseBuyPurchaseDialogObj) patchProxyResultProxy.result : new UseBuyPurchaseDialogObj(bool, str);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15733, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UseBuyPurchaseDialogObj)) {
            return false;
        }
        UseBuyPurchaseDialogObj useBuyPurchaseDialogObj = (UseBuyPurchaseDialogObj) obj;
        return f0.g(this.new_cashier, useBuyPurchaseDialogObj.new_cashier) && f0.g(this.mall_purcahse_dialog_style_v2, useBuyPurchaseDialogObj.mall_purcahse_dialog_style_v2);
    }

    @e
    public final String getMall_purcahse_dialog_style_v2() {
        return this.mall_purcahse_dialog_style_v2;
    }

    @e
    public final Boolean getNew_cashier() {
        return this.new_cashier;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15732, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.new_cashier;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.mall_purcahse_dialog_style_v2;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final void setMall_purcahse_dialog_style_v2(@e String str) {
        this.mall_purcahse_dialog_style_v2 = str;
    }

    public final void setNew_cashier(@e Boolean bool) {
        this.new_cashier = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15731, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UseBuyPurchaseDialogObj(new_cashier=" + this.new_cashier + ", mall_purcahse_dialog_style_v2=" + this.mall_purcahse_dialog_style_v2 + ')';
    }
}
