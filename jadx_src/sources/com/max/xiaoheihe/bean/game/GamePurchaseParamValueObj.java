package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePurchaseParamValueObj implements Serializable {
    public static final String PRODUCT_API_TYPE_MALL = "mall";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8380538103611078617L;
    private String api_type;
    private boolean balance_enable;
    private String bulk_count;
    private String bulk_count_enable;
    private GamePurchaseParamObj buy_type;
    private String cart_enable;
    private String cat_value;
    private boolean checked;
    private String desc;
    private String enable;
    private String enable_notify;
    private String head_img;
    private int index;
    private String inventory;
    private String key;
    private MallPriceObj price;
    private String sale_state;
    private String selected;
    private String sku_id;
    private String spu_id;
    private String type;
    private String value;

    public boolean equals(Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14848, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GamePurchaseParamValueObj gamePurchaseParamValueObj = (GamePurchaseParamValueObj) obj;
        String str = this.key;
        if (str == null ? gamePurchaseParamValueObj.key != null : !str.equals(gamePurchaseParamValueObj.key)) {
            return false;
        }
        String str2 = this.spu_id;
        if (str2 == null ? gamePurchaseParamValueObj.spu_id != null : !str2.equals(gamePurchaseParamValueObj.spu_id)) {
            return false;
        }
        String str3 = this.sku_id;
        if (str3 == null ? gamePurchaseParamValueObj.sku_id != null : !str3.equals(gamePurchaseParamValueObj.sku_id)) {
            return false;
        }
        String str4 = this.type;
        if (str4 == null ? gamePurchaseParamValueObj.type != null : !str4.equals(gamePurchaseParamValueObj.type)) {
            return false;
        }
        String str5 = this.value;
        String str6 = gamePurchaseParamValueObj.value;
        if (str5 != null) {
            return str5.equals(str6);
        }
        return str6 == null;
    }

    public String getApi_type() {
        return this.api_type;
    }

    public String getBulk_count() {
        return this.bulk_count;
    }

    public String getBulk_count_enable() {
        return this.bulk_count_enable;
    }

    public GamePurchaseParamObj getBuy_type() {
        return this.buy_type;
    }

    public String getCart_enable() {
        return this.cart_enable;
    }

    public String getCat_value() {
        return this.cat_value;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getEnable() {
        return this.enable;
    }

    public String getEnable_notify() {
        return this.enable_notify;
    }

    public String getHead_img() {
        return this.head_img;
    }

    public int getIndex() {
        return this.index;
    }

    public String getInventory() {
        return this.inventory;
    }

    public String getKey() {
        return this.key;
    }

    public MallPriceObj getPrice() {
        return this.price;
    }

    public String getSale_state() {
        return this.sale_state;
    }

    public String getSelected() {
        return this.selected;
    }

    public String getSku_id() {
        return this.sku_id;
    }

    public String getSpu_id() {
        return this.spu_id;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14849, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.spu_id;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sku_id;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.type;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.value;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public boolean isBalance_enable() {
        return this.balance_enable;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setBalance_enable(boolean z10) {
        this.balance_enable = z10;
    }

    public void setBulk_count(String str) {
        this.bulk_count = str;
    }

    public void setBulk_count_enable(String str) {
        this.bulk_count_enable = str;
    }

    public void setBuy_type(GamePurchaseParamObj gamePurchaseParamObj) {
        this.buy_type = gamePurchaseParamObj;
    }

    public void setCart_enable(String str) {
        this.cart_enable = str;
    }

    public void setCat_value(String str) {
        this.cat_value = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public void setEnable_notify(String str) {
        this.enable_notify = str;
    }

    public void setHead_img(String str) {
        this.head_img = str;
    }

    public void setIndex(int i10) {
        this.index = i10;
    }

    public void setInventory(String str) {
        this.inventory = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setPrice(MallPriceObj mallPriceObj) {
        this.price = mallPriceObj;
    }

    public void setSale_state(String str) {
        this.sale_state = str;
    }

    public void setSelected(String str) {
        this.selected = str;
    }

    public void setSku_id(String str) {
        this.sku_id = str;
    }

    public void setSpu_id(String str) {
        this.spu_id = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
