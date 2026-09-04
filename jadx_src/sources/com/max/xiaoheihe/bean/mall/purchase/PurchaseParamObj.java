package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseParamObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseParamObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String btn_desc;

    @e
    private String btn_protocol;

    @e
    private String key;

    @e
    private String title;

    @e
    private List<PurchaseValueObj> values;

    public PurchaseParamObj(@e String str, @e String str2, @e List<PurchaseValueObj> list, @e String str3, @e String str4) {
        this.key = str;
        this.title = str2;
        this.values = list;
        this.btn_protocol = str3;
        this.btn_desc = str4;
    }

    public static /* synthetic */ PurchaseParamObj copy$default(PurchaseParamObj purchaseParamObj, String str, String str2, List list, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseParamObj, str, str2, list, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, 15697, new Class[]{PurchaseParamObj.class, String.class, String.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, PurchaseParamObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseParamObj) patchProxyResultProxy.result;
        }
        return purchaseParamObj.copy((i10 & 1) != 0 ? purchaseParamObj.key : str, (i10 & 2) != 0 ? purchaseParamObj.title : str2, (i10 & 4) != 0 ? purchaseParamObj.values : list, (i10 & 8) != 0 ? purchaseParamObj.btn_protocol : str3, (i10 & 16) != 0 ? purchaseParamObj.btn_desc : str4);
    }

    @e
    public final String component1() {
        return this.key;
    }

    @e
    public final String component2() {
        return this.title;
    }

    @e
    public final List<PurchaseValueObj> component3() {
        return this.values;
    }

    @e
    public final String component4() {
        return this.btn_protocol;
    }

    @e
    public final String component5() {
        return this.btn_desc;
    }

    @d
    public final PurchaseParamObj copy(@e String str, @e String str2, @e List<PurchaseValueObj> list, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, list, str3, str4}, this, changeQuickRedirect, false, 15696, new Class[]{String.class, String.class, List.class, String.class, String.class}, PurchaseParamObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseParamObj) patchProxyResultProxy.result : new PurchaseParamObj(str, str2, list, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15700, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseParamObj)) {
            return false;
        }
        PurchaseParamObj purchaseParamObj = (PurchaseParamObj) obj;
        return f0.g(this.key, purchaseParamObj.key) && f0.g(this.title, purchaseParamObj.title) && f0.g(this.values, purchaseParamObj.values) && f0.g(this.btn_protocol, purchaseParamObj.btn_protocol) && f0.g(this.btn_desc, purchaseParamObj.btn_desc);
    }

    @e
    public final String getBtn_desc() {
        return this.btn_desc;
    }

    @e
    public final String getBtn_protocol() {
        return this.btn_protocol;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final PurchaseValueObj getSelected() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15695, new Class[0], PurchaseValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseValueObj) patchProxyResultProxy.result;
        }
        if (c.w(this.values)) {
            return null;
        }
        List<PurchaseValueObj> list = this.values;
        f0.m(list);
        PurchaseValueObj purchaseValueObj = list.get(0);
        List<PurchaseValueObj> list2 = this.values;
        f0.m(list2);
        for (PurchaseValueObj purchaseValueObj2 : list2) {
            if (f0.g(purchaseValueObj2.getSelected(), Boolean.TRUE)) {
                purchaseValueObj = purchaseValueObj2;
                break;
            }
        }
        purchaseValueObj.setSelected(Boolean.TRUE);
        return purchaseValueObj;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final List<PurchaseValueObj> getValues() {
        return this.values;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15699, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PurchaseValueObj> list = this.values;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.btn_protocol;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.btn_desc;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBtn_desc(@e String str) {
        this.btn_desc = str;
    }

    public final void setBtn_protocol(@e String str) {
        this.btn_protocol = str;
    }

    public final void setChecked(@d PurchaseValueObj checked) {
        if (PatchProxy.proxy(new Object[]{checked}, this, changeQuickRedirect, false, 15694, new Class[]{PurchaseValueObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(checked, "checked");
        List<PurchaseValueObj> list = this.values;
        if (list != null) {
            for (PurchaseValueObj purchaseValueObj : list) {
                purchaseValueObj.setSelected(Boolean.valueOf(f0.g(purchaseValueObj, checked)));
            }
        }
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setValues(@e List<PurchaseValueObj> list) {
        this.values = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15698, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseParamObj(key=" + this.key + ", title=" + this.title + ", values=" + this.values + ", btn_protocol=" + this.btn_protocol + ", btn_desc=" + this.btn_desc + ')';
    }
}
