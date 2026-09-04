package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseParamResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseParamResultObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private PurchaseBaseInfoObj base_info;

    @e
    private String cart_count;

    @e
    private List<String> group_button_user_image;

    @e
    private List<GroupBuyInfoObj> group_info;

    @e
    private String session;

    @e
    private String toast_msg;

    @e
    private Boolean use_new;

    public PurchaseParamResultObj(@e String str, @e Boolean bool, @e String str2, @e PurchaseBaseInfoObj purchaseBaseInfoObj, @e String str3, @e List<GroupBuyInfoObj> list, @e List<String> list2) {
        this.session = str;
        this.use_new = bool;
        this.cart_count = str2;
        this.base_info = purchaseBaseInfoObj;
        this.toast_msg = str3;
        this.group_info = list;
        this.group_button_user_image = list2;
    }

    public static /* synthetic */ PurchaseParamResultObj copy$default(PurchaseParamResultObj purchaseParamResultObj, String str, Boolean bool, String str2, PurchaseBaseInfoObj purchaseBaseInfoObj, String str3, List list, List list2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseParamResultObj, str, bool, str2, purchaseBaseInfoObj, str3, list, list2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15704, new Class[]{PurchaseParamResultObj.class, String.class, Boolean.class, String.class, PurchaseBaseInfoObj.class, String.class, List.class, List.class, Integer.TYPE, Object.class}, PurchaseParamResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseParamResultObj) patchProxyResultProxy.result;
        }
        return purchaseParamResultObj.copy((i10 & 1) != 0 ? purchaseParamResultObj.session : str, (i10 & 2) != 0 ? purchaseParamResultObj.use_new : bool, (i10 & 4) != 0 ? purchaseParamResultObj.cart_count : str2, (i10 & 8) != 0 ? purchaseParamResultObj.base_info : purchaseBaseInfoObj, (i10 & 16) != 0 ? purchaseParamResultObj.toast_msg : str3, (i10 & 32) != 0 ? purchaseParamResultObj.group_info : list, (i10 & 64) != 0 ? purchaseParamResultObj.group_button_user_image : list2);
    }

    @e
    public final String component1() {
        return this.session;
    }

    @e
    public final Boolean component2() {
        return this.use_new;
    }

    @e
    public final String component3() {
        return this.cart_count;
    }

    @e
    public final PurchaseBaseInfoObj component4() {
        return this.base_info;
    }

    @e
    public final String component5() {
        return this.toast_msg;
    }

    @e
    public final List<GroupBuyInfoObj> component6() {
        return this.group_info;
    }

    @e
    public final List<String> component7() {
        return this.group_button_user_image;
    }

    @d
    public final PurchaseParamResultObj copy(@e String str, @e Boolean bool, @e String str2, @e PurchaseBaseInfoObj purchaseBaseInfoObj, @e String str3, @e List<GroupBuyInfoObj> list, @e List<String> list2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bool, str2, purchaseBaseInfoObj, str3, list, list2}, this, changeQuickRedirect, false, 15703, new Class[]{String.class, Boolean.class, String.class, PurchaseBaseInfoObj.class, String.class, List.class, List.class}, PurchaseParamResultObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseParamResultObj) patchProxyResultProxy.result : new PurchaseParamResultObj(str, bool, str2, purchaseBaseInfoObj, str3, list, list2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15707, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseParamResultObj)) {
            return false;
        }
        PurchaseParamResultObj purchaseParamResultObj = (PurchaseParamResultObj) obj;
        return f0.g(this.session, purchaseParamResultObj.session) && f0.g(this.use_new, purchaseParamResultObj.use_new) && f0.g(this.cart_count, purchaseParamResultObj.cart_count) && f0.g(this.base_info, purchaseParamResultObj.base_info) && f0.g(this.toast_msg, purchaseParamResultObj.toast_msg) && f0.g(this.group_info, purchaseParamResultObj.group_info) && f0.g(this.group_button_user_image, purchaseParamResultObj.group_button_user_image);
    }

    @e
    public final PurchaseBaseInfoObj getBase_info() {
        return this.base_info;
    }

    @e
    public final String getCart_count() {
        return this.cart_count;
    }

    @e
    public final List<String> getGroup_button_user_image() {
        return this.group_button_user_image;
    }

    @e
    public final List<GroupBuyInfoObj> getGroup_info() {
        return this.group_info;
    }

    @e
    public final BuyTypeValueObj getSelectedBuyTypeValue() {
        BuyTypeObj buy_types;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15702, new Class[0], BuyTypeValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BuyTypeValueObj) patchProxyResultProxy.result;
        }
        PurchaseValueObj selectedParam = getSelectedParam();
        if (selectedParam == null || (buy_types = selectedParam.getBuy_types()) == null) {
            return null;
        }
        return buy_types.getSelected();
    }

    @e
    public final PurchaseValueObj getSelectedParam() {
        PurchaseParamObj params;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15701, new Class[0], PurchaseValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseValueObj) patchProxyResultProxy.result;
        }
        PurchaseBaseInfoObj purchaseBaseInfoObj = this.base_info;
        if (purchaseBaseInfoObj == null || (params = purchaseBaseInfoObj.getParams()) == null) {
            return null;
        }
        return params.getSelected();
    }

    @e
    public final String getSession() {
        return this.session;
    }

    @e
    public final String getToast_msg() {
        return this.toast_msg;
    }

    @e
    public final Boolean getUse_new() {
        return this.use_new;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15706, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.session;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.use_new;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.cart_count;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PurchaseBaseInfoObj purchaseBaseInfoObj = this.base_info;
        int iHashCode4 = (iHashCode3 + (purchaseBaseInfoObj == null ? 0 : purchaseBaseInfoObj.hashCode())) * 31;
        String str3 = this.toast_msg;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<GroupBuyInfoObj> list = this.group_info;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.group_button_user_image;
        return iHashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public final void setBase_info(@e PurchaseBaseInfoObj purchaseBaseInfoObj) {
        this.base_info = purchaseBaseInfoObj;
    }

    public final void setCart_count(@e String str) {
        this.cart_count = str;
    }

    public final void setGroup_button_user_image(@e List<String> list) {
        this.group_button_user_image = list;
    }

    public final void setGroup_info(@e List<GroupBuyInfoObj> list) {
        this.group_info = list;
    }

    public final void setSession(@e String str) {
        this.session = str;
    }

    public final void setToast_msg(@e String str) {
        this.toast_msg = str;
    }

    public final void setUse_new(@e Boolean bool) {
        this.use_new = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15705, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseParamResultObj(session=" + this.session + ", use_new=" + this.use_new + ", cart_count=" + this.cart_count + ", base_info=" + this.base_info + ", toast_msg=" + this.toast_msg + ", group_info=" + this.group_info + ", group_button_user_image=" + this.group_button_user_image + ')';
    }
}
