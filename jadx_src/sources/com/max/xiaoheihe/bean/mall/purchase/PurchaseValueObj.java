package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseValueObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PurchaseValueObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BuyTypeObj buy_types;

    @e
    private String category;

    @e
    private Boolean enable;

    @e
    private String image;

    @e
    private String item_id;

    @e
    private String name;

    @e
    private String rec_desc;

    @e
    private String rec_desc_end_color;

    @e
    private String rec_desc_start_color;

    @e
    private Boolean selected;

    public PurchaseValueObj(@e String str, @e Boolean bool, @e String str2, @e Boolean bool2, @e BuyTypeObj buyTypeObj, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        this.image = str;
        this.selected = bool;
        this.name = str2;
        this.enable = bool2;
        this.buy_types = buyTypeObj;
        this.category = str3;
        this.item_id = str4;
        this.rec_desc = str5;
        this.rec_desc_start_color = str6;
        this.rec_desc_end_color = str7;
    }

    public static /* synthetic */ PurchaseValueObj copy$default(PurchaseValueObj purchaseValueObj, String str, Boolean bool, String str2, Boolean bool2, BuyTypeObj buyTypeObj, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{purchaseValueObj, str, bool, str2, bool2, buyTypeObj, str3, str4, str5, str6, str7, new Integer(i10), obj}, null, changeQuickRedirect, true, 15721, new Class[]{PurchaseValueObj.class, String.class, Boolean.class, String.class, Boolean.class, BuyTypeObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, PurchaseValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PurchaseValueObj) patchProxyResultProxy.result;
        }
        return purchaseValueObj.copy((i10 & 1) != 0 ? purchaseValueObj.image : str, (i10 & 2) != 0 ? purchaseValueObj.selected : bool, (i10 & 4) != 0 ? purchaseValueObj.name : str2, (i10 & 8) != 0 ? purchaseValueObj.enable : bool2, (i10 & 16) != 0 ? purchaseValueObj.buy_types : buyTypeObj, (i10 & 32) != 0 ? purchaseValueObj.category : str3, (i10 & 64) != 0 ? purchaseValueObj.item_id : str4, (i10 & 128) != 0 ? purchaseValueObj.rec_desc : str5, (i10 & 256) != 0 ? purchaseValueObj.rec_desc_start_color : str6, (i10 & 512) != 0 ? purchaseValueObj.rec_desc_end_color : str7);
    }

    @e
    public final String component1() {
        return this.image;
    }

    @e
    public final String component10() {
        return this.rec_desc_end_color;
    }

    @e
    public final Boolean component2() {
        return this.selected;
    }

    @e
    public final String component3() {
        return this.name;
    }

    @e
    public final Boolean component4() {
        return this.enable;
    }

    @e
    public final BuyTypeObj component5() {
        return this.buy_types;
    }

    @e
    public final String component6() {
        return this.category;
    }

    @e
    public final String component7() {
        return this.item_id;
    }

    @e
    public final String component8() {
        return this.rec_desc;
    }

    @e
    public final String component9() {
        return this.rec_desc_start_color;
    }

    @d
    public final PurchaseValueObj copy(@e String str, @e Boolean bool, @e String str2, @e Boolean bool2, @e BuyTypeObj buyTypeObj, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bool, str2, bool2, buyTypeObj, str3, str4, str5, str6, str7}, this, changeQuickRedirect, false, 15720, new Class[]{String.class, Boolean.class, String.class, Boolean.class, BuyTypeObj.class, String.class, String.class, String.class, String.class, String.class}, PurchaseValueObj.class);
        return patchProxyResultProxy.isSupported ? (PurchaseValueObj) patchProxyResultProxy.result : new PurchaseValueObj(str, bool, str2, bool2, buyTypeObj, str3, str4, str5, str6, str7);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15719, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj == null ? true : obj instanceof PurchaseValueObj)) {
            return false;
        }
        PurchaseValueObj purchaseValueObj = (PurchaseValueObj) obj;
        if (f0.g(this.name, purchaseValueObj != null ? purchaseValueObj.name : null)) {
            if (f0.g(this.category, purchaseValueObj != null ? purchaseValueObj.category : null)) {
                if (f0.g(this.item_id, purchaseValueObj != null ? purchaseValueObj.item_id : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @e
    public final BuyTypeObj getBuy_types() {
        return this.buy_types;
    }

    @e
    public final String getCategory() {
        return this.category;
    }

    @e
    public final Boolean getEnable() {
        return this.enable;
    }

    @e
    public final String getImage() {
        return this.image;
    }

    @e
    public final String getItem_id() {
        return this.item_id;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final String getRec_desc() {
        return this.rec_desc;
    }

    @e
    public final String getRec_desc_end_color() {
        return this.rec_desc_end_color;
    }

    @e
    public final String getRec_desc_start_color() {
        return this.rec_desc_start_color;
    }

    @e
    public final Boolean getSelected() {
        return this.selected;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15723, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.image;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.selected;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.name;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.enable;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        BuyTypeObj buyTypeObj = this.buy_types;
        int iHashCode5 = (iHashCode4 + (buyTypeObj == null ? 0 : buyTypeObj.hashCode())) * 31;
        String str3 = this.category;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.item_id;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rec_desc;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.rec_desc_start_color;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.rec_desc_end_color;
        return iHashCode9 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setBuy_types(@e BuyTypeObj buyTypeObj) {
        this.buy_types = buyTypeObj;
    }

    public final void setCategory(@e String str) {
        this.category = str;
    }

    public final void setEnable(@e Boolean bool) {
        this.enable = bool;
    }

    public final void setImage(@e String str) {
        this.image = str;
    }

    public final void setItem_id(@e String str) {
        this.item_id = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setRec_desc(@e String str) {
        this.rec_desc = str;
    }

    public final void setRec_desc_end_color(@e String str) {
        this.rec_desc_end_color = str;
    }

    public final void setRec_desc_start_color(@e String str) {
        this.rec_desc_start_color = str;
    }

    public final void setSelected(@e Boolean bool) {
        this.selected = bool;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15722, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PurchaseValueObj(image=" + this.image + ", selected=" + this.selected + ", name=" + this.name + ", enable=" + this.enable + ", buy_types=" + this.buy_types + ", category=" + this.category + ", item_id=" + this.item_id + ", rec_desc=" + this.rec_desc + ", rec_desc_start_color=" + this.rec_desc_start_color + ", rec_desc_end_color=" + this.rec_desc_end_color + ')';
    }
}
