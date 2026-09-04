package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FreshmanDiscountGameObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class FreshmanDiscountGameObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String buy_type;

    @e
    private String cat_value;

    @e
    private String current_price;

    @e
    private String discount_desc;

    @e
    private String discount_limit_desc;

    @e
    private String game_img;

    @e
    private String game_name;

    @e
    private String middle_title;

    @e
    private String origin_price;

    @e
    private String sku_id;

    public FreshmanDiscountGameObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10) {
        this.game_img = str;
        this.game_name = str2;
        this.current_price = str3;
        this.origin_price = str4;
        this.discount_desc = str5;
        this.sku_id = str6;
        this.discount_limit_desc = str7;
        this.cat_value = str8;
        this.buy_type = str9;
        this.middle_title = str10;
    }

    public static /* synthetic */ FreshmanDiscountGameObj copy$default(FreshmanDiscountGameObj freshmanDiscountGameObj, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{freshmanDiscountGameObj, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, new Integer(i10), obj}, null, changeQuickRedirect, true, 14678, new Class[]{FreshmanDiscountGameObj.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, FreshmanDiscountGameObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (FreshmanDiscountGameObj) patchProxyResultProxy.result;
        }
        return freshmanDiscountGameObj.copy((i10 & 1) != 0 ? freshmanDiscountGameObj.game_img : str, (i10 & 2) != 0 ? freshmanDiscountGameObj.game_name : str2, (i10 & 4) != 0 ? freshmanDiscountGameObj.current_price : str3, (i10 & 8) != 0 ? freshmanDiscountGameObj.origin_price : str4, (i10 & 16) != 0 ? freshmanDiscountGameObj.discount_desc : str5, (i10 & 32) != 0 ? freshmanDiscountGameObj.sku_id : str6, (i10 & 64) != 0 ? freshmanDiscountGameObj.discount_limit_desc : str7, (i10 & 128) != 0 ? freshmanDiscountGameObj.cat_value : str8, (i10 & 256) != 0 ? freshmanDiscountGameObj.buy_type : str9, (i10 & 512) != 0 ? freshmanDiscountGameObj.middle_title : str10);
    }

    @e
    public final String component1() {
        return this.game_img;
    }

    @e
    public final String component10() {
        return this.middle_title;
    }

    @e
    public final String component2() {
        return this.game_name;
    }

    @e
    public final String component3() {
        return this.current_price;
    }

    @e
    public final String component4() {
        return this.origin_price;
    }

    @e
    public final String component5() {
        return this.discount_desc;
    }

    @e
    public final String component6() {
        return this.sku_id;
    }

    @e
    public final String component7() {
        return this.discount_limit_desc;
    }

    @e
    public final String component8() {
        return this.cat_value;
    }

    @e
    public final String component9() {
        return this.buy_type;
    }

    @d
    public final FreshmanDiscountGameObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e String str7, @e String str8, @e String str9, @e String str10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10}, this, changeQuickRedirect, false, 14677, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, FreshmanDiscountGameObj.class);
        return patchProxyResultProxy.isSupported ? (FreshmanDiscountGameObj) patchProxyResultProxy.result : new FreshmanDiscountGameObj(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14681, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FreshmanDiscountGameObj)) {
            return false;
        }
        FreshmanDiscountGameObj freshmanDiscountGameObj = (FreshmanDiscountGameObj) obj;
        return f0.g(this.game_img, freshmanDiscountGameObj.game_img) && f0.g(this.game_name, freshmanDiscountGameObj.game_name) && f0.g(this.current_price, freshmanDiscountGameObj.current_price) && f0.g(this.origin_price, freshmanDiscountGameObj.origin_price) && f0.g(this.discount_desc, freshmanDiscountGameObj.discount_desc) && f0.g(this.sku_id, freshmanDiscountGameObj.sku_id) && f0.g(this.discount_limit_desc, freshmanDiscountGameObj.discount_limit_desc) && f0.g(this.cat_value, freshmanDiscountGameObj.cat_value) && f0.g(this.buy_type, freshmanDiscountGameObj.buy_type) && f0.g(this.middle_title, freshmanDiscountGameObj.middle_title);
    }

    @e
    public final String getBuy_type() {
        return this.buy_type;
    }

    @e
    public final String getCat_value() {
        return this.cat_value;
    }

    @e
    public final String getCurrent_price() {
        return this.current_price;
    }

    @e
    public final String getDiscount_desc() {
        return this.discount_desc;
    }

    @e
    public final String getDiscount_limit_desc() {
        return this.discount_limit_desc;
    }

    @e
    public final String getGame_img() {
        return this.game_img;
    }

    @e
    public final String getGame_name() {
        return this.game_name;
    }

    @e
    public final String getMiddle_title() {
        return this.middle_title;
    }

    @e
    public final String getOrigin_price() {
        return this.origin_price;
    }

    @e
    public final String getSku_id() {
        return this.sku_id;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14680, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.game_img;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.game_name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.current_price;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.origin_price;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discount_desc;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.sku_id;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.discount_limit_desc;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.cat_value;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.buy_type;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.middle_title;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    public final void setBuy_type(@e String str) {
        this.buy_type = str;
    }

    public final void setCat_value(@e String str) {
        this.cat_value = str;
    }

    public final void setCurrent_price(@e String str) {
        this.current_price = str;
    }

    public final void setDiscount_desc(@e String str) {
        this.discount_desc = str;
    }

    public final void setDiscount_limit_desc(@e String str) {
        this.discount_limit_desc = str;
    }

    public final void setGame_img(@e String str) {
        this.game_img = str;
    }

    public final void setGame_name(@e String str) {
        this.game_name = str;
    }

    public final void setMiddle_title(@e String str) {
        this.middle_title = str;
    }

    public final void setOrigin_price(@e String str) {
        this.origin_price = str;
    }

    public final void setSku_id(@e String str) {
        this.sku_id = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14679, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "FreshmanDiscountGameObj(game_img=" + this.game_img + ", game_name=" + this.game_name + ", current_price=" + this.current_price + ", origin_price=" + this.origin_price + ", discount_desc=" + this.discount_desc + ", sku_id=" + this.sku_id + ", discount_limit_desc=" + this.discount_limit_desc + ", cat_value=" + this.cat_value + ", buy_type=" + this.buy_type + ", middle_title=" + this.middle_title + ')';
    }
}
