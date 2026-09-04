package com.max.xiaoheihe.bean.mall.purchase;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: BuyTypeValueObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class BuyTypeValueObj implements Serializable {

    @d
    public static final String CATEGORYL_MALL_PROTOCOL_TYPE = "mall_protocol";

    @d
    public static final String CATEGORY_GAME_TYPE = "game";

    @d
    public static final String CATEGORY_MALL_TYPE = "mall";

    @d
    public static final String CATEGORY_PHYSICAL_MALL_TYPE = "physical_mall";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean ban_add_cart;

    @e
    private String btn_desc;

    @e
    private BulkPayObj bulk_pay;

    @e
    private Boolean cart_enable;

    @e
    private String cat_value;

    @e
    private String category;

    @e
    private String desc_prot;

    @e
    private String description;

    @e
    private String discount;

    @e
    private Boolean enable;

    @e
    private String enable_notify;

    @e
    private KeyDescObj faq_protocol;

    @e
    private String group_purchase_desc;

    @e
    private String inventory;

    @e
    private String item_id;

    @e
    private String name;

    @e
    private PurchasePriceObj price;

    @e
    private String protocol;

    @e
    private String sale_state;

    @e
    private Boolean selected;

    @e
    private KeyDescObj type;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: BuyTypeValueObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public BuyTypeValueObj(@e String str, @e String str2, @e String str3, @e String str4, @e Boolean bool, @e String str5, @e String str6, @e PurchasePriceObj purchasePriceObj, @e Boolean bool2, @e String str7, @e BulkPayObj bulkPayObj, @e String str8, @e String str9, @e String str10, @e Boolean bool3, @e Boolean bool4, @e KeyDescObj keyDescObj, @e String str11, @e KeyDescObj keyDescObj2, @e String str12, @e String str13) {
        this.category = str;
        this.protocol = str2;
        this.btn_desc = str3;
        this.sale_state = str4;
        this.enable = bool;
        this.description = str5;
        this.desc_prot = str6;
        this.price = purchasePriceObj;
        this.selected = bool2;
        this.enable_notify = str7;
        this.bulk_pay = bulkPayObj;
        this.cat_value = str8;
        this.inventory = str9;
        this.item_id = str10;
        this.cart_enable = bool3;
        this.ban_add_cart = bool4;
        this.type = keyDescObj;
        this.name = str11;
        this.faq_protocol = keyDescObj2;
        this.discount = str12;
        this.group_purchase_desc = str13;
    }

    public static /* synthetic */ BuyTypeValueObj copy$default(BuyTypeValueObj buyTypeValueObj, String str, String str2, String str3, String str4, Boolean bool, String str5, String str6, PurchasePriceObj purchasePriceObj, Boolean bool2, String str7, BulkPayObj bulkPayObj, String str8, String str9, String str10, Boolean bool3, Boolean bool4, KeyDescObj keyDescObj, String str11, KeyDescObj keyDescObj2, String str12, String str13, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{buyTypeValueObj, str, str2, str3, str4, bool, str5, str6, purchasePriceObj, bool2, str7, bulkPayObj, str8, str9, str10, bool3, bool4, keyDescObj, str11, keyDescObj2, str12, str13, new Integer(i10), obj}, null, changeQuickRedirect, true, 15651, new Class[]{BuyTypeValueObj.class, String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, PurchasePriceObj.class, Boolean.class, String.class, BulkPayObj.class, String.class, String.class, String.class, Boolean.class, Boolean.class, KeyDescObj.class, String.class, KeyDescObj.class, String.class, String.class, Integer.TYPE, Object.class}, BuyTypeValueObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (BuyTypeValueObj) patchProxyResultProxy.result;
        }
        return buyTypeValueObj.copy((i10 & 1) != 0 ? buyTypeValueObj.category : str, (i10 & 2) != 0 ? buyTypeValueObj.protocol : str2, (i10 & 4) != 0 ? buyTypeValueObj.btn_desc : str3, (i10 & 8) != 0 ? buyTypeValueObj.sale_state : str4, (i10 & 16) != 0 ? buyTypeValueObj.enable : bool, (i10 & 32) != 0 ? buyTypeValueObj.description : str5, (i10 & 64) != 0 ? buyTypeValueObj.desc_prot : str6, (i10 & 128) != 0 ? buyTypeValueObj.price : purchasePriceObj, (i10 & 256) != 0 ? buyTypeValueObj.selected : bool2, (i10 & 512) != 0 ? buyTypeValueObj.enable_notify : str7, (i10 & 1024) != 0 ? buyTypeValueObj.bulk_pay : bulkPayObj, (i10 & 2048) != 0 ? buyTypeValueObj.cat_value : str8, (i10 & 4096) != 0 ? buyTypeValueObj.inventory : str9, (i10 & 8192) != 0 ? buyTypeValueObj.item_id : str10, (i10 & 16384) != 0 ? buyTypeValueObj.cart_enable : bool3, (i10 & 32768) != 0 ? buyTypeValueObj.ban_add_cart : bool4, (i10 & 65536) != 0 ? buyTypeValueObj.type : keyDescObj, (i10 & 131072) != 0 ? buyTypeValueObj.name : str11, (i10 & 262144) != 0 ? buyTypeValueObj.faq_protocol : keyDescObj2, (i10 & 524288) != 0 ? buyTypeValueObj.discount : str12, (i10 & 1048576) != 0 ? buyTypeValueObj.group_purchase_desc : str13);
    }

    public final boolean canBuy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15649, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return f0.g(this.enable, Boolean.TRUE) || f0.g("2", this.sale_state);
    }

    @e
    public final String component1() {
        return this.category;
    }

    @e
    public final String component10() {
        return this.enable_notify;
    }

    @e
    public final BulkPayObj component11() {
        return this.bulk_pay;
    }

    @e
    public final String component12() {
        return this.cat_value;
    }

    @e
    public final String component13() {
        return this.inventory;
    }

    @e
    public final String component14() {
        return this.item_id;
    }

    @e
    public final Boolean component15() {
        return this.cart_enable;
    }

    @e
    public final Boolean component16() {
        return this.ban_add_cart;
    }

    @e
    public final KeyDescObj component17() {
        return this.type;
    }

    @e
    public final String component18() {
        return this.name;
    }

    @e
    public final KeyDescObj component19() {
        return this.faq_protocol;
    }

    @e
    public final String component2() {
        return this.protocol;
    }

    @e
    public final String component20() {
        return this.discount;
    }

    @e
    public final String component21() {
        return this.group_purchase_desc;
    }

    @e
    public final String component3() {
        return this.btn_desc;
    }

    @e
    public final String component4() {
        return this.sale_state;
    }

    @e
    public final Boolean component5() {
        return this.enable;
    }

    @e
    public final String component6() {
        return this.description;
    }

    @e
    public final String component7() {
        return this.desc_prot;
    }

    @e
    public final PurchasePriceObj component8() {
        return this.price;
    }

    @e
    public final Boolean component9() {
        return this.selected;
    }

    @d
    public final BuyTypeValueObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e Boolean bool, @e String str5, @e String str6, @e PurchasePriceObj purchasePriceObj, @e Boolean bool2, @e String str7, @e BulkPayObj bulkPayObj, @e String str8, @e String str9, @e String str10, @e Boolean bool3, @e Boolean bool4, @e KeyDescObj keyDescObj, @e String str11, @e KeyDescObj keyDescObj2, @e String str12, @e String str13) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, bool, str5, str6, purchasePriceObj, bool2, str7, bulkPayObj, str8, str9, str10, bool3, bool4, keyDescObj, str11, keyDescObj2, str12, str13}, this, changeQuickRedirect, false, 15650, new Class[]{String.class, String.class, String.class, String.class, Boolean.class, String.class, String.class, PurchasePriceObj.class, Boolean.class, String.class, BulkPayObj.class, String.class, String.class, String.class, Boolean.class, Boolean.class, KeyDescObj.class, String.class, KeyDescObj.class, String.class, String.class}, BuyTypeValueObj.class);
        return patchProxyResultProxy.isSupported ? (BuyTypeValueObj) patchProxyResultProxy.result : new BuyTypeValueObj(str, str2, str3, str4, bool, str5, str6, purchasePriceObj, bool2, str7, bulkPayObj, str8, str9, str10, bool3, bool4, keyDescObj, str11, keyDescObj2, str12, str13);
    }

    public boolean equals(@e Object obj) {
        KeyDescObj keyDescObj;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15648, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj == null ? true : obj instanceof BuyTypeValueObj)) {
            return false;
        }
        BuyTypeValueObj buyTypeValueObj = (BuyTypeValueObj) obj;
        String key = null;
        if (f0.g(this.item_id, buyTypeValueObj != null ? buyTypeValueObj.item_id : null)) {
            KeyDescObj keyDescObj2 = this.type;
            String key2 = keyDescObj2 != null ? keyDescObj2.getKey() : null;
            if (buyTypeValueObj != null && (keyDescObj = buyTypeValueObj.type) != null) {
                key = keyDescObj.getKey();
            }
            if (f0.g(key2, key)) {
                return true;
            }
        }
        return false;
    }

    @e
    public final Boolean getBan_add_cart() {
        return this.ban_add_cart;
    }

    @e
    public final String getBtn_desc() {
        return this.btn_desc;
    }

    @e
    public final BulkPayObj getBulk_pay() {
        return this.bulk_pay;
    }

    @e
    public final Boolean getCart_enable() {
        return this.cart_enable;
    }

    @e
    public final String getCat_value() {
        return this.cat_value;
    }

    @e
    public final String getCategory() {
        return this.category;
    }

    @e
    public final String getDesc_prot() {
        return this.desc_prot;
    }

    @e
    public final String getDescription() {
        return this.description;
    }

    @e
    public final String getDiscount() {
        return this.discount;
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
    public final KeyDescObj getFaq_protocol() {
        return this.faq_protocol;
    }

    @e
    public final String getGroup_purchase_desc() {
        return this.group_purchase_desc;
    }

    @e
    public final String getInventory() {
        return this.inventory;
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
    public final PurchasePriceObj getPrice() {
        return this.price;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getSale_state() {
        return this.sale_state;
    }

    @e
    public final Boolean getSelected() {
        return this.selected;
    }

    @e
    public final KeyDescObj getType() {
        return this.type;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15653, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.category;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.protocol;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.btn_desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sale_state;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.enable;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.description;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.desc_prot;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PurchasePriceObj purchasePriceObj = this.price;
        int iHashCode8 = (iHashCode7 + (purchasePriceObj == null ? 0 : purchasePriceObj.hashCode())) * 31;
        Boolean bool2 = this.selected;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str7 = this.enable_notify;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        BulkPayObj bulkPayObj = this.bulk_pay;
        int iHashCode11 = (iHashCode10 + (bulkPayObj == null ? 0 : bulkPayObj.hashCode())) * 31;
        String str8 = this.cat_value;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.inventory;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.item_id;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool3 = this.cart_enable;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.ban_add_cart;
        int iHashCode16 = (iHashCode15 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        KeyDescObj keyDescObj = this.type;
        int iHashCode17 = (iHashCode16 + (keyDescObj == null ? 0 : keyDescObj.hashCode())) * 31;
        String str11 = this.name;
        int iHashCode18 = (iHashCode17 + (str11 == null ? 0 : str11.hashCode())) * 31;
        KeyDescObj keyDescObj2 = this.faq_protocol;
        int iHashCode19 = (iHashCode18 + (keyDescObj2 == null ? 0 : keyDescObj2.hashCode())) * 31;
        String str12 = this.discount;
        int iHashCode20 = (iHashCode19 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.group_purchase_desc;
        return iHashCode20 + (str13 != null ? str13.hashCode() : 0);
    }

    public final void setBan_add_cart(@e Boolean bool) {
        this.ban_add_cart = bool;
    }

    public final void setBtn_desc(@e String str) {
        this.btn_desc = str;
    }

    public final void setBulk_pay(@e BulkPayObj bulkPayObj) {
        this.bulk_pay = bulkPayObj;
    }

    public final void setCart_enable(@e Boolean bool) {
        this.cart_enable = bool;
    }

    public final void setCat_value(@e String str) {
        this.cat_value = str;
    }

    public final void setCategory(@e String str) {
        this.category = str;
    }

    public final void setDesc_prot(@e String str) {
        this.desc_prot = str;
    }

    public final void setDescription(@e String str) {
        this.description = str;
    }

    public final void setDiscount(@e String str) {
        this.discount = str;
    }

    public final void setEnable(@e Boolean bool) {
        this.enable = bool;
    }

    public final void setEnable_notify(@e String str) {
        this.enable_notify = str;
    }

    public final void setFaq_protocol(@e KeyDescObj keyDescObj) {
        this.faq_protocol = keyDescObj;
    }

    public final void setGroup_purchase_desc(@e String str) {
        this.group_purchase_desc = str;
    }

    public final void setInventory(@e String str) {
        this.inventory = str;
    }

    public final void setItem_id(@e String str) {
        this.item_id = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPrice(@e PurchasePriceObj purchasePriceObj) {
        this.price = purchasePriceObj;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setSale_state(@e String str) {
        this.sale_state = str;
    }

    public final void setSelected(@e Boolean bool) {
        this.selected = bool;
    }

    public final void setType(@e KeyDescObj keyDescObj) {
        this.type = keyDescObj;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15652, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "BuyTypeValueObj(category=" + this.category + ", protocol=" + this.protocol + ", btn_desc=" + this.btn_desc + ", sale_state=" + this.sale_state + ", enable=" + this.enable + ", description=" + this.description + ", desc_prot=" + this.desc_prot + ", price=" + this.price + ", selected=" + this.selected + ", enable_notify=" + this.enable_notify + ", bulk_pay=" + this.bulk_pay + ", cat_value=" + this.cat_value + ", inventory=" + this.inventory + ", item_id=" + this.item_id + ", cart_enable=" + this.cart_enable + ", ban_add_cart=" + this.ban_add_cart + ", type=" + this.type + ", name=" + this.name + ", faq_protocol=" + this.faq_protocol + ", discount=" + this.discount + ", group_purchase_desc=" + this.group_purchase_desc + ')';
    }
}
