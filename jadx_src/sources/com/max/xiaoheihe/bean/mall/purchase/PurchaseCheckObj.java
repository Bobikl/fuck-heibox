package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PurchaseCheckObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseCheckObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bg_end_color;

    @e
    private String bg_start_color;

    @e
    private String desc;

    @e
    private Boolean enable;

    @e
    private String enable_notify;

    @e
    private Integer icon;

    @e
    private String key;

    @e
    private String rec_desc;

    @e
    private Boolean selected;

    public PurchaseCheckObj(@e String str, @e Integer num, @e Boolean bool, @e Boolean bool2, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        this.desc = str;
        this.icon = num;
        this.enable = bool;
        this.selected = bool2;
        this.enable_notify = str2;
        this.key = str3;
        this.rec_desc = str4;
        this.bg_start_color = str5;
        this.bg_end_color = str6;
    }

    public /* synthetic */ PurchaseCheckObj(String str, Integer num, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, int i10, u uVar) {
        this(str, num, bool, bool2, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, (i10 & 128) != 0 ? null : str5, (i10 & 256) != 0 ? null : str6);
    }

    public static /* synthetic */ PurchaseCheckObj copy$default(PurchaseCheckObj purchaseCheckObj, String str, Integer num, Boolean bool, Boolean bool2, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseCheckObj, str, num, bool, bool2, str2, str3, str4, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 15680, new Class[]{PurchaseCheckObj.class, String.class, Integer.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PurchaseCheckObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseCheckObj) patchProxyResultProxy.result;
        }
        return purchaseCheckObj.copy((i10 & 1) != 0 ? purchaseCheckObj.desc : str, (i10 & 2) != 0 ? purchaseCheckObj.icon : num, (i10 & 4) != 0 ? purchaseCheckObj.enable : bool, (i10 & 8) != 0 ? purchaseCheckObj.selected : bool2, (i10 & 16) != 0 ? purchaseCheckObj.enable_notify : str2, (i10 & 32) != 0 ? purchaseCheckObj.key : str3, (i10 & 64) != 0 ? purchaseCheckObj.rec_desc : str4, (i10 & 128) != 0 ? purchaseCheckObj.bg_start_color : str5, (i10 & 256) != 0 ? purchaseCheckObj.bg_end_color : str6);
    }

    @e
    public final String component1() {
        return this.desc;
    }

    @e
    public final Integer component2() {
        return this.icon;
    }

    @e
    public final Boolean component3() {
        return this.enable;
    }

    @e
    public final Boolean component4() {
        return this.selected;
    }

    @e
    public final String component5() {
        return this.enable_notify;
    }

    @e
    public final String component6() {
        return this.key;
    }

    @e
    public final String component7() {
        return this.rec_desc;
    }

    @e
    public final String component8() {
        return this.bg_start_color;
    }

    @e
    public final String component9() {
        return this.bg_end_color;
    }

    @d
    public final PurchaseCheckObj copy(@e String str, @e Integer num, @e Boolean bool, @e Boolean bool2, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, num, bool, bool2, str2, str3, str4, str5, str6}, this, changeQuickRedirect, false, 15679, new Class[]{String.class, Integer.class, Boolean.class, Boolean.class, String.class, String.class, String.class, String.class, String.class}, PurchaseCheckObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseCheckObj) patchProxyResultProxy.result : new PurchaseCheckObj(str, num, bool, bool2, str2, str3, str4, str5, str6);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15683, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseCheckObj)) {
            return false;
        }
        PurchaseCheckObj purchaseCheckObj = (PurchaseCheckObj) obj;
        return f0.g(this.desc, purchaseCheckObj.desc) && f0.g(this.icon, purchaseCheckObj.icon) && f0.g(this.enable, purchaseCheckObj.enable) && f0.g(this.selected, purchaseCheckObj.selected) && f0.g(this.enable_notify, purchaseCheckObj.enable_notify) && f0.g(this.key, purchaseCheckObj.key) && f0.g(this.rec_desc, purchaseCheckObj.rec_desc) && f0.g(this.bg_start_color, purchaseCheckObj.bg_start_color) && f0.g(this.bg_end_color, purchaseCheckObj.bg_end_color);
    }

    @e
    public final String getBg_end_color() {
        return this.bg_end_color;
    }

    @e
    public final String getBg_start_color() {
        return this.bg_start_color;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final Boolean getEnable() {
        return this.enable;
    }

    @e
    public final String getEnable_notify() {
        return this.enable_notify;
    }

    @e
    public final Integer getIcon() {
        return this.icon;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getRec_desc() {
        return this.rec_desc;
    }

    @e
    public final Boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15682, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.icon;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.enable_notify;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.key;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.rec_desc;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bg_start_color;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.bg_end_color;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBg_end_color(@e String str) {
        this.bg_end_color = str;
    }

    public final void setBg_start_color(@e String str) {
        this.bg_start_color = str;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setEnable(@e Boolean bool) {
        this.enable = bool;
    }

    public final void setEnable_notify(@e String str) {
        this.enable_notify = str;
    }

    public final void setIcon(@e Integer num) {
        this.icon = num;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setRec_desc(@e String str) {
        this.rec_desc = str;
    }

    public final void setSelected(@e Boolean bool) {
        this.selected = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15681, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseCheckObj(desc=" + this.desc + ", icon=" + this.icon + ", enable=" + this.enable + ", selected=" + this.selected + ", enable_notify=" + this.enable_notify + ", key=" + this.key + ", rec_desc=" + this.rec_desc + ", bg_start_color=" + this.bg_start_color + ", bg_end_color=" + this.bg_end_color + ')';
    }
}
